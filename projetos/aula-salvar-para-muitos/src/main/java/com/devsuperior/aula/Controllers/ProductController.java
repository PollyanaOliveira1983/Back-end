package com.devsuperior.aula.Controllers;

import com.devsuperior.aula.dto.ProductDTO;
import com.devsuperior.aula.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
        @Autowired
        private ProductService service;
        @PostMapping
        public ResponseEntity<ProductDTO> insert(@RequestBody ProductDTO dto) {
            dto = service.insert(dto);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("{id}")
                    .buildAndExpand(dto.getId()).toUri();
            return ResponseEntity.created(uri).body(dto);

        }
}
