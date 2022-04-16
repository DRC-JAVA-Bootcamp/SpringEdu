package com.kodluyoruz.springegitim.altincihafta.pazar.project.controller;

import com.kodluyoruz.springegitim.altincihafta.pazar.project.requestdto.ProductSaveRequestDto;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.service.ProductService;
import com.kodluyoruz.springegitim.dorduncuhafta.pazar.requestDto.SaveEngineerRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/saveProduct")
    public void saveProduct(@RequestBody ProductSaveRequestDto productSaveRequestDto){
        productService.saveProduct(productSaveRequestDto);

    }

}
