package com.product113;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController{
    private List<Product> productList = new ArrayList<>();

    @GetMapping
    public List<Product> getAllProduct(){
        return productList ;

    }
    @PostMapping
    public void addProduct(@RequestBody Product product){
        boolean isUnique = true;
        for (Product product1:productList) {
            if (product1.getId()== product.getId()){

            }
            else {isUnique= false;break;}
        }
        if (isUnique){
            productList.add(product);
        }
        else { throw new RuntimeException("it is not unique");}
    }
    @GetMapping("{id}")
    public Product getProductById (@PathVariable int id ){

        for (Product product1:productList) {
            if (product1.getId()== id ){
                return product1;
            }

            else {return null;}
        }

         return null;
    }


}
