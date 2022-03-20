package com.stf.boot.dao;


import com.stf.boot.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookRepository extends JpaRepository<Book,Integer>, JpaSpecificationExecutor<Book> {

}
