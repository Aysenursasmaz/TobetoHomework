package org.example;

import org.example.business.ProductManager;
import org.example.dataAccess.HibernateProductDao;
import org.example.entities.Product;
import org.example.satinAlma.Audi;
import org.example.satinAlma.Mercedes;
import org.example.satinAlma.Surucu;

public class Main {

    public static void main(String[] args) throws Exception {
        Product araba = new Product(2009,"Mercedes",225000,"A class",750000);
        ProductManager productManager = new ProductManager(new HibernateProductDao());
        productManager.add(araba);

        Surucu aysenur = new Surucu(new Audi());
        Surucu yusuf =  new Surucu(new Mercedes()) ;
        aysenur.satinal();
        yusuf.satinal();
    }
}