package tutorial.coordinator;

import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.dto.UserSaveRequestDto;
import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.model.User;
import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.repository.UserRepository;
import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.service.NonTurkcellInfoService;
import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.service.UserService;
import com.kodluyoruz.springegitim.besincihafta.cmt.testkavrami.service.UserTurkcellService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

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
        UserSaveRequestDto userSaveRequestDto = new UserSaveRequestDto();
        userSaveRequestDto.setUserName("Doruk");
        userSaveRequestDto.setUserPassword("134");
        userSaveRequestDto.setMsisdn("5345676545");

        User userMock = mock(User.class);
        when(userMock.getTurkcell()).thenReturn(Boolean.TRUE);
        when(userTurkcellService.getUserByMsisdn(ArgumentMatchers.anyString())).thenReturn(userMock);
        when(userRepository.userSave(userSaveRequestDto)).thenReturn(userMock);
        Boolean userSaveSuccess = userService.userSaveByRequestDto(userSaveRequestDto);
        Assertions.assertTrue(userSaveSuccess);
    }


    @Test
    void testIsTurkcellWithTurkcellMsisdn(){
        //String msisdn = "5554443322";

        User userMock = getMockUser("5554443322", true);
        when(userTurkcellService.getUserByMsisdn(Mockito.anyString())).thenReturn(userMock);

        boolean result = userService.isTurkcell(userMock.getMsisdn());
        Assertions.assertTrue(result);
    }

    @Test
    void testIsTurkcellWithoutTurkcellMsisdn(){

        User userMock = getMockUser("5554443322",false);
        when(userTurkcellService.getUserByMsisdn(Mockito.anyString())).thenReturn(userMock);

        boolean result = userService.isTurkcell(userMock.getMsisdn());
        Assertions.assertFalse(result);
    }

    @Test
    void testCheckTurkcell(){
        String msisdn = "5554443322";
        boolean result = userService.checkMsisdnFormat(msisdn);
        Assertions.assertTrue(result);
    }


    private User getMockUser(String msisdn, Boolean isTurkcell) {
        User user = mock(User.class);
        when(user.getMsisdn()).thenReturn(msisdn);
        when(user.getTurkcell()).thenReturn(isTurkcell);
        return user;
    }

}
