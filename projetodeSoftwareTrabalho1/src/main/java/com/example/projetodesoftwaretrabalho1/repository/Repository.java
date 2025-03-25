package com.example.projetodesoftwaretrabalho1.repository;

import com.example.projetodesoftwaretrabalho1.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Produto, Integer> {

}
