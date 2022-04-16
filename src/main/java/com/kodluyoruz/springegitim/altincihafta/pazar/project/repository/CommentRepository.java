package com.kodluyoruz.springegitim.altincihafta.pazar.project.repository;

import com.kodluyoruz.springegitim.altincihafta.pazar.project.entity.Comment;
import com.kodluyoruz.springegitim.altincihafta.pazar.project.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {

    List<Comment> findAllByProduct(Product product);


}
