package com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.httpmethodlari.controller;

import com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.httpmethodlari.model.OrganizationSaveRequestDto;
import com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.httpmethodlari.model.OrganizationUpdateRequestDto;
import com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.httpmethodlari.servis.OrganizationService;
import com.kodluyoruz.springegitim.dorduncuhafta.cmt.genelbakis.httpmethodlari.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;
    @GetMapping(value = "/allOrganization")
    public List<Organization> allOrganizaton(){
        List<Organization> organizations = organizationService.allOrganization();
        return organizations;
    }

    @GetMapping("/organizationDetail")
    public ResponseEntity<Organization> getOrganization(@RequestParam int idOrganization){
        Organization organizationById = organizationService.getOrganizationById(idOrganization);
        if(organizationById == null){
            return new ResponseEntity<>(organizationById, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(organizationById, HttpStatus.OK);
    }

    @PostMapping("/saveOrganization")
    public void saveOrganization(@RequestBody OrganizationSaveRequestDto organizationSaveRequestDto){
        organizationService.saveOrganization(organizationSaveRequestDto);

    }

    @PostMapping("/saveOrganization2")
    public void saveOrganization2(@RequestBody OrganizationSaveRequestDto organizationSaveRequestDto){
        organizationService.saveOrganization(organizationSaveRequestDto);

    }

    @PutMapping("/updateOrganization")
    public boolean updateOrganization(@RequestBody OrganizationUpdateRequestDto organizationUpdateRequestBody){
        return organizationService.updateOrganization(organizationUpdateRequestBody);

    }

    @DeleteMapping("/deleteOrganization")
    public boolean updateOrganization(@RequestParam int organizationId){
        return organizationService.deleteOrganization(organizationId);

    }

}
