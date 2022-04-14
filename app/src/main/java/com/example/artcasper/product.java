package com.example.artcasper;

public class product {public String prodname;
    public String company;
    public String price;
    public String vhimg;

    public String getVhno() {
        return prodname;
    }

    public void setVhno(String prodname) {
        this.prodname = prodname;
    }

    public String getcompany() {
        return company;
    }

    public void setcompany(String company) {
        this.company = company;
    }

    public String getprice() {
        return price;
    }

    public void setprice(String price) {
        this.price = price;
    }

    public String getVhimg() {
        return vhimg;
    }

    public void setVhimg(String vhimg) {
        this.vhimg = vhimg;
    }

    public product(String price, String company, String prodname) {
        this.price = price;
        this.company = company;
        this.prodname = prodname;
    }
}

