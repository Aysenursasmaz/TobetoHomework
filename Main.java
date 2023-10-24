package org.example;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";
        Product product1 = new Product();
        //set value
        product1.setName("Delonghi Kahve Makinası");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");
        //get
        System.out.println(product1.getName());

        Product product2 = new Product();
        product2.setName("Arcelik Kahve Makinası");
        product2.setUnitPrice(4500);
        product2.setDiscount(5);
        product2.setUnitsInStock(2);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Korkmaz Kahve Makinası");
        product3.setUnitPrice(5500);
        product3.setDiscount(5);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(67);
        individualCustomer.setFirstName(aysenur);
        individualCustomer.setLastName(sasmaz);
        individualCustomer.setCustomerNumber("562");
        individualCustomer.setPhone("0526526552");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(11);
        corporateCustomer.setCompanyName(yunus);
        corporateCustomer.setPhone("0254652565");
        corporateCustomer.setTaxnumber("25205");
        corporateCustomer.setCustomerNumber("56256");
        Customer[] customers = {individualCustomer, corporateCustomer};

    }

}
