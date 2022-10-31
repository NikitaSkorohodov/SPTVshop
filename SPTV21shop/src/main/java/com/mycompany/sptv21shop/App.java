/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sptv21shop;
import Enyity.Client;
import Enyity.Obuv;
import Enyity.Product;
import java.util.Arrays;
import java.util.Scanner;
import CManag.CliManag;
import CManag.HistoryManager;
import CManag.ProductManager;
import Enyity.History;
/**
 *
 * @author NikitaSkr
 */
public class App {
    private final ProductManager productManager;
    private final CliManag climanag;
    private Product[] products;
    private Client[] clients;
    private final HistoryManager historyManager;
    private History[] histories;
    int n = 5;
    int[] arr1 = new int[n];
    
    public App() {
        products=new Product[0];
        clients=new Client[0];
        climanag=new CliManag();
        histories = new History[0];
        historyManager = new HistoryManager();
        productManager = new ProductManager();
    }
    
    @SuppressWarnings("empty-statement")
   public Client run(){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        
        do{
            System.out.println("Задачи: ");
            System.out.println("1. Закончить программу");
            System.out.println("2. Добавить обувь");
            System.out.println("3. список обуви");
            System.out.println("4. Добавить покупателя");
            System.out.println("5. Список зарегистрированных покупателей");
            System.out.println("6. Покупка покупателем продукта");
            System.out.println("7. Оборот магазина за все время работы");
            System.out.println("8. Добавить денег покупателю ");
            System.out.print("Выберите задачу: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 1:
                    repeat = false;
                    break;
                case 2:
                    System.out.println("1. Добавить обувь");
                    System.out.print("Введите название обуви: ");
                    String prodName = scanner.nextLine();
                    System.out.print("Введите цену обуви: ");
                    String quantity= scanner.nextLine();
                    
                    Product product = createBook(prodName, new Integer(quantity));
                    Product[] newProducts= new Product[this.products.length+1];
                    newProducts[newProducts.length-1] =product;
                    this.products= newProducts;
                    break;

                case 3:
                    
                    productManager.printListProducts(products);
                    break;
                            
                    
                case 4:
                    
                    addClient(climanag.createClient());
                    
                    break;
                case 5:
                    System.out.println("7. Список читателей");
                    for (int i = 0; i < clients.length; i++) {
                        System.out.printf("%d. %s %s. Телефон: %s%n"
                                ,i+1
                                ,clients[i].getFirstname()
                                ,clients[i].getLastname()
                                ,clients[i].getPhone()
                        );
                    }
                    break;
                case 6:
                    System.out.println("Покупка покупателем продукта");
                    addHistory(historyManager.takeOnProduct(products, clients));
                    this.clients= climanag.changeClient(clients); 
                    System.out.print("Введите деньги клинта: ");
                    int salary=scanner.nextInt();
                    
                    
                        
                    
                    break;
                case 7:
                    
                    
                    break;  
                case 8:
                    this.clients= climanag.changeClient(clients); 
                    
                    break;    
                   
                   
            }}while(repeat);return null;
}
   public Product createBook(String prodName,int quantity){
        Product product = new Product();
        product.setProdName(prodName);
        product.setQuantity(quantity);
        return product;}
private void addClient(Client client) {
        this.clients = Arrays.copyOf(this.clients, this.clients.length+1);
        
        this.clients[this.clients.length - 1] = client;   
    }
    private void addHistory(History histories) {
        this.histories = Arrays.copyOf(this.histories, this.histories.length+1);
        this.histories[this.histories.length - 1] = histories;   
    }
   
            }
