/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CManag;

import Enyity.Product;

/**
 *
 * @author NikitaSkr
 */
public class ProductManager {
    public void printListProducts(Product[] products){
        for (int i = 0; i < products.length; i++) {
                        System.out.print(i+1+". "+products[i].getProdName()+". "+products[i].getQuantity()+"$ ");
                    }

            System.out.println();
            }
        }

