package com.example.productlist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService extends ArrayList<Product> {

    ProductService() {
        super();
    }

    Product getById(long id) {
        for (Product product: this) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    Integer getIndexById(long id) {
        for (int i=0; i < this.size(); i++) {
            if (this.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}
