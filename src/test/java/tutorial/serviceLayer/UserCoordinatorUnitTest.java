package tutorial.serviceLayer;

import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.dto.UserSaveRequestDtoo;
import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.model.Userr;
import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.repository.UserRepository;
import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.service.NonTurkcellInfoService;
import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.service.UserService;
import com.kodluyoruz.springegitim.altincihafta.pazar.testkavrami.service.UserTurkcellService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserCoordinatorUnitTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Mock
    UserTurkcellService userTurkcellService;

    @Mock
    NonTurkcellInfoService nonTurkcellInfoService;

    @Test
    void userTest(){
        UserSaveRequestDtoo userSaveRequestDto = new UserSaveRequestDtoo();
        userSaveRequestDto.setUserName("Doruk");
        userSaveRequestDto.setUserPassword("134");
        userSaveRequestDto.setPhoneNumber("5345676545");

        Userr userMock = mock(Userr.class);
        when(userMock.getTurkcell()).thenReturn(Boolean.TRUE);
        when(userTurkcellService.getUserByMsisdn(ArgumentMatchers.anyString())).thenReturn(userMock);
        when(userRepository.userSave(userSaveRequestDto)).thenReturn(userMock);
        Boolean userSaveSuccess = userService.userSaveByRequestDto(userSaveRequestDto);
        Assertions.assertTrue(userSaveSuccess);
    }


    @Test
    void testIsTurkcellWithTurkcellMsisdn(){
        //String msisdn = "5554443322";

        Userr userMock = getMockUser("5554443322", true);
        when(userTurkcellService.getUserByMsisdn(Mockito.anyString())).thenReturn(userMock);

        boolean result = userService.isTurkcell(userMock.getMsisdn());
        Assertions.assertTrue(result);
    }

    @Test
    void testIsTurkcellWithTurkcellMsisdn2(){
        //String msisdn = "5554443322";

        Userr userMock = getMockUser("5554443322", true);
        when(userTurkcellService.getUserByMsisdn(Mockito.anyString())).thenReturn(userMock);

        boolean result = userService.isTurkcell(userMock.getMsisdn());
        Assertions.assertTrue(result);
    }


    @Test
    void testIsTurkcellWithoutTurkcellMsisdn(){

        Userr userMock = getMockUser("5554443322",false);
        when(userTurkcellService.getUserByMsisdn(Mockito.anyString())).thenReturn(userMock);

        boolean result = userService.isTurkcell(userMock.getMsisdn());
        Assertions.assertFalse(result);
    }

    @Test
    void testPhoneNumberValidate(){
        String msisdn = "5554443322";
        boolean result = userService.checkPhoneNumberFormat(msisdn);
        Assertions.assertTrue(result);
    }

    @Test
    void testPhoneNumberValidate2(){
        String msisdn = "5554443322";
        boolean result = userService.checkPhoneNumberFormat(msisdn);
        Assertions.assertTrue(result);
    }

    @Test
    void testPhoneNumberSizeNonValidate(){
        String msisdn = "0005554443322";
        boolean result = userService.checkPhoneNumberFormat(msisdn);
        Assertions.assertFalse(result);
    }


    @Test
    void testPhoneNumberSizeNonValidate44(){
        String msisdn = "0005554443322";
        boolean result = userService.checkPhoneNumberFormat(msisdn);
        Assertions.assertFalse(result);
    }


    private Userr getMockUser(String msisdn, Boolean isTurkcell) {
        Userr user = mock(Userr.class);
        when(user.getMsisdn()).thenReturn(msisdn);
        when(user.getTurkcell()).thenReturn(isTurkcell);
        return user;
    }

}
