package org.example.satinAlma;

public class Surucu implements Araba {
   Araba araba;

    public Surucu(Araba araba) {
        this.araba = araba;
    }

    public void satinal(){
        araba.satinal();

    }
}
