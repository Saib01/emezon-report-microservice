package com.emazon.report.domain.model;

import java.io.Serializable;
import java.util.List;

public class Report implements Serializable {
    private String id;
    private String email;
    private List<Product> purchaseInformation;
    private Double total;

    public Report(String id, String email, List<Product> purchaseInformation, Double total) {
        this.id = id;
        this.email = email;
        this.purchaseInformation = purchaseInformation;
        this.total = total;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Product> getPurchaseInformation() {
        return purchaseInformation;
    }

    public void setPurchaseInformation(List<Product> purchaseInformation) {
        this.purchaseInformation = purchaseInformation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}