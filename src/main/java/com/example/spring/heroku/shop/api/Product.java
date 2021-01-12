package com.example.spring.heroku.shop.api;

public class Product {

    private String pId;
    private String pName;
    private String pDescript;
    private String pCategory;
    private long netPrice;

    public Product() {}

    public Product(String pId, String pName, String pDescript, String pCategory, long netPrice) {
        this.pId = pId;
        this.pName = pName;
        this.pDescript = pDescript;
        this.pCategory = pCategory;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDescript() {
        return pDescript;
    }

    public void setpDescript(String pDescript) {
        this.pDescript = pDescript;
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public Long getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(Long netPrice) {
        this.netPrice = netPrice;
    }

}
