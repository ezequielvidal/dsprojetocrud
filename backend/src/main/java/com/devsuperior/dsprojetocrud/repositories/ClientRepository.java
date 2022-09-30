package com.devsuperior.dsprojetocrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsprojetocrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
