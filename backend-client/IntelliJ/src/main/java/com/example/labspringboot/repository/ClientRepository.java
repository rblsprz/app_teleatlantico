package com.example.labspringboot.repository;

import com.example.labspringboot.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {


    @Query(value = "{ call SelectClientByEmail(:email,:password)}", nativeQuery = true)
    Client SelectClientByEmail(@Param("email") String email,@Param("password") String password);




}
