/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enyity;
import java.util.Arrays;
/**
 *
 * @author NikitaSkr
 */
public class Product {
     private String prodName;
    private Obuv[] obuvs;
    private int quantity;

    public Product() {
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Obuv[] getObuvs() {
        return obuvs;
    }

    public void setObuvs(Obuv[] obuvs) {
        this.obuvs = obuvs;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void addObuv(Obuv obuv){
        Obuv[] newAuthors = Arrays.copyOf(obuvs, obuvs.length+1);
        newAuthors[newAuthors.length - 1] = obuv;
        obuvs = newAuthors;
    }
    @Override
    public String toString() {
        return "Product{" + "prodName=" + prodName + ", obuvs=" + obuvs + ", quantity=" + quantity + '}';
    }
    
}
