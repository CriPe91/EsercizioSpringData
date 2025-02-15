package com.example.SpringData.runner;



import com.example.SpringData.model.*;
import com.example.SpringData.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrdersRunner implements CommandLineRunner {

    @Autowired private OrdersService ordersService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("OrdersRunner...");

        // Soluzione Esercizio
//        Menu menu = ordersService.createMenu();
//        menu.printMenu();
//
//        Table t1 = ordersService.createTable1();
//        System.out.println(t1);
//
//        Table t2 = ordersService.createTable2();
//        System.out.println(t2);
//
//        Order o1 = ordersService.createOrder(2, t1);
//        o1.aggiungiProdotti(ordersService.createPizzaMargherita());
//        o1.aggiungiProdotti(ordersService.createPizzaSalami());
//        o1.aggiungiProdotti(ordersService.createWater());
//        o1.aggiungiProdotti(ordersService.createLemonade());
//        o1.stampaOrdine();
//
//        Order o2 = ordersService.createOrder(3, t2);
//        o2.aggiungiProdotti(ordersService.createPizzaMargherita());
//        o2.aggiungiProdotti(ordersService.createPizzaSalami());
//        o2.aggiungiProdotti(ordersService.createPizzaMargherita());
//        o2.aggiungiProdotti(ordersService.createWater());
//        o2.aggiungiProdotti(ordersService.createWater());
//        o2.aggiungiProdotti(ordersService.createLemonade());
//        o2.stampaOrdine();


    }
}