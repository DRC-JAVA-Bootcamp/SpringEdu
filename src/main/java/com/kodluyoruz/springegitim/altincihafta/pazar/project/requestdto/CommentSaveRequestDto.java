package com.kodluyoruz.springegitim.altincihafta.pazar.project.requestdto;

import lombok.Data;

@Data
public class CommentSaveRequestDto {

    private String text;
    private Integer productId;
    private Integer customerId;

}
