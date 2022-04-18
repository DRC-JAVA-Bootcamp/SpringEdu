package com.kodluyoruz.springegitim.altincihafta.cmt.resttemplate.post;

import lombok.Data;

@Data
public class CoinResponseDto {

    private String accessToken;
    private String scope;
    private String tokenType;
    private Integer expiresIn;

}
