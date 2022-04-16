package com.kodluyoruz.springegitim.altincihafta.pazar.project.controller;


import com.kodluyoruz.springegitim.altincihafta.pazar.project.requestdto.CommentSaveRequestDto;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.requestdto.ProductSaveRequestDto;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.responseDto.CommentResponseDto;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/saveComment")
    public ResponseEntity<Integer> saveComment(@RequestBody CommentSaveRequestDto commentSaveRequestDto){
        Integer commentID = commentService.saveComment(commentSaveRequestDto);
        return new ResponseEntity<>(commentID, HttpStatus.OK);
    }

    @GetMapping("/findAllCommentByProductId")
    public ResponseEntity<List<CommentResponseDto>> findAllCommentByProductId(@RequestParam Integer productId){

        List<CommentResponseDto> commentResponseDtoList = commentService.findAllCommentByProductId(productId);
        return new ResponseEntity<>(commentResponseDtoList, HttpStatus.OK);
    }

    @GetMapping("/findAllComment")
    public ResponseEntity<List<CommentResponseDto>> findAllComment(){

        List<CommentResponseDto> commentResponseDtoList = commentService.findAllComment();
        return new ResponseEntity<>(commentResponseDtoList, HttpStatus.OK);
    }

    @DeleteMapping("/deleteCommentById")
    public ResponseEntity<Boolean> deleteCommentById(@RequestParam Integer commentId){
        boolean delete = commentService.deleteCommentById(commentId);
        return new ResponseEntity<>(delete, HttpStatus.OK);

    }

}
