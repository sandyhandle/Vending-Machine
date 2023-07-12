package com.sandyhandle.webapp.vendingmachine.repository;

import com.sandyhandle.webapp.vendingmachine.models.db.Product;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    {
        productList.add(new Product(1, "Coke",25));
        productList.add(new Product(2, "Pepsi",35));
        productList.add(new Product(1, "Soda",45));
    }

}
