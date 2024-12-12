package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Data_Class;

public interface Repositary_CLASS extends JpaRepository<Data_Class, Integer> {

}
