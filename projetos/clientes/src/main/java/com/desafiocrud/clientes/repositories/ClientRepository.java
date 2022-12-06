package com.desafiocrud.clientes.repositories;

import com.desafiocrud.clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
