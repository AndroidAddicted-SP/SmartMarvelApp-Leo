package br.com.turbiani.smartmarvelapppersistence.entity;

/**
 * Created by lcunha on 29/07/16.
 */
public class Price {
    private String type;
    private float price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
