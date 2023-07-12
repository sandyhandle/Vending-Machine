package com.sandyhandle.webapp.vendingmachine.service;

import com.sandyhandle.webapp.vendingmachine.models.db.Product;
import com.sandyhandle.webapp.vendingmachine.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.getProductList();
    }

    public Optional<Product> gerProduct(int id){
        for(Product product: productRepository.getProductList()){
            if(product.getProductId() == id){
                return Optional.of(product);
            }
        }
        System.out.println("There is no product with this id: " + id);
        return null;
    }
}
