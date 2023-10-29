package org.example.business;
import org.example.dataAccess.JdbcProductDao;
import org.example.dataAccess.ProductDao;
import org.example.entities.Product;

public class ProductManager {
    private ProductDao carDao;
    public ProductManager(ProductDao carDao){
        this.carDao = carDao;
    }

    public void add(Product product) throws Exception {
        if(product.getUnitPrice()<100000){
            throw new Exception("Arabanın fiyatı 100000 den küçük olamaz");
        }
        if (product.getKm()>1000000){
            System.out.println("Uyarı: Arabanızın km çok fazla");
        }
        if (product.getYear()<1990){
            throw new Exception("1990 dan önce araba satışı yoktur.");
        }

        carDao.add(product);

    }







}
