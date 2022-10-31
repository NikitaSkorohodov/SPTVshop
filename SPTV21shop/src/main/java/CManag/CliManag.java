/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CManag;


import Enyity.Client;
import java.util.Scanner;

/**
 *
 * @author NikitaSkr
 */
public class CliManag {

    public static Client climanag() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private final Scanner scanner;
    public CliManag() {
                scanner = new Scanner(System.in);
    }
   public Client createClient(){
       System.out.println("2. Добавить читателя");
                    Client client = new Client();
                    System.out.print("Введите имя клинта: ");
                    client.setFirstname(scanner.nextLine());
                    System.out.print("Введите фамилию клинта: ");
                    client.setLastname(scanner.nextLine());
                    System.out.print("Введите телефон клинта: ");
                    client.setPhone(scanner.nextLine());
                    System.out.print("Введите деньги клинта: ");
                    client.setMony(scanner.nextInt());
        return client;
    }
   public void printListClients(Client[] clients){
        for (int i = 0; i < clients.length; i++) {
            System.out.printf("%d. %s %s. Телефон: %s%n"
                    ,i+1
                    ,clients[i].getFirstname()
                    ,clients[i].getLastname()
                    ,clients[i].getPhone()
                    ,clients[i].getMony()
            );
        }
    }
   public Client[] changeClient(Client[] clients) {
        System.out.println("Список читателей: ");
        this.printListClients(clients);
        System.out.print("Выберите номер читателя: ");
        int numberClient = scanner.nextInt();scanner.nextLine();
        System.out.println("Имя: "+clients[numberClient-1].getFirstname());
        System.out.println("Введите деньги клиента: ");
        
        clients[numberClient - 1].setMony(scanner.nextInt());
        return clients;
}
}
