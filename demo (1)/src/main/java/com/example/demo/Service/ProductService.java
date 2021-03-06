package com.example.demo.Service;


import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public List<Product> findByTitle(String title){
        return productRepository.findByTitleContaining(title);
    }

    public String deleteById(Integer id){ productRepository.deleteById(id); return "product id= " + id + " has been delete!";}
}
