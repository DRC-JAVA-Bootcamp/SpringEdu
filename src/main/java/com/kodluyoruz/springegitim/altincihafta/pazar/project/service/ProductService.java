package com.kodluyoruz.springegitim.altincihafta.pazar.project.service;

import com.kodluyoruz.springegitim.altincihafta.pazar.project.entity.Product;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.repository.ProductRepository;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.requestdto.ProductSaveRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void saveProduct(ProductSaveRequestDto productSaveRequestDto) {

        String codeRequestDto = productSaveRequestDto.getCode();
        String nameRequestDto = productSaveRequestDto.getName();

        Product product = new Product();
        product.setName(nameRequestDto);
        product.setCode(codeRequestDto);

        productRepository.save(product);

    }
}
