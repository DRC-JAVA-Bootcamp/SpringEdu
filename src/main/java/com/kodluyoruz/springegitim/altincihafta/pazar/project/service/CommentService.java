package com.kodluyoruz.springegitim.altincihafta.pazar.project.service;

import com.kodluyoruz.springegitim.altincihafta.pazar.project.entity.Comment;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.entity.Customer;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.entity.Product;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.repository.CommentRepository;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.repository.CustomerRepository;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.repository.ProductRepository;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.requestdto.CommentSaveRequestDto;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.responseDto.CommentResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    ModelMapper modelMapper;

    public Integer saveComment(CommentSaveRequestDto commentSaveRequestDto) {
        String text = commentSaveRequestDto.getText();
        Integer productId = commentSaveRequestDto.getProductId();
        Integer customerId = commentSaveRequestDto.getCustomerId();

        Product product = productRepository.findById(productId).get();
        Customer customer = customerRepository.findById(customerId).get();

        Comment comment = new Comment();
        comment.setText(text);
        comment.setProduct(product);
        comment.setCustomer(customer);

        comment = commentRepository.save(comment);
        return comment.getId();

    }

    public List<CommentResponseDto> findAllCommentByProductId(Integer productId) {

        Product product = productRepository.findById(productId).get();

        List<Comment> commentList = commentRepository.findAllByProduct(product);

        List<CommentResponseDto> commentResponseDtos = new ArrayList<>();
        for (Comment comment : commentList) {
            String customerName = comment.getCustomer().getName();
            String productName = comment.getProduct().getName();
            String text = comment.getText();
//            CommentResponseDto commentResponseDto = modelMapper.map(comment, CommentResponseDto.class);
            CommentResponseDto commentResponseDto = new CommentResponseDto();
            commentResponseDto.setCommentProduct(productName);
            commentResponseDto.setCustomerName(customerName);
            commentResponseDto.setText(text);
            commentResponseDtos.add(commentResponseDto);
        }

        return commentResponseDtos;

    }

    public List<CommentResponseDto> findAllComment() {

        Iterable<Comment> commentRepositoryAll = commentRepository.findAll();

        List<CommentResponseDto> commentResponseDtos = new ArrayList<>();
        for (Comment comment : commentRepositoryAll) {
            String customerName = comment.getCustomer().getName();
            String productName = comment.getProduct().getName();
            String text = comment.getText();
//            CommentResponseDto commentResponseDto = modelMapper.map(comment, CommentResponseDto.class);
            CommentResponseDto commentResponseDto = new CommentResponseDto();
            commentResponseDto.setCommentProduct(productName);
            commentResponseDto.setCustomerName(customerName);
            commentResponseDto.setText(text);
            commentResponseDtos.add(commentResponseDto);
        }

        return commentResponseDtos;

    }

    public boolean deleteCommentById(Integer commentId) {
        Comment comment = commentRepository.findById(commentId).get();
        commentRepository.delete(comment);
        return true;
    }
}
