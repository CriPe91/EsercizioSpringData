package com.example.SpringData.runner;



import com.example.SpringData.model.Drink;
import com.example.SpringData.model.Pizza;
import com.example.SpringData.model.Topping;
import com.example.SpringData.service.ProdottiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProdottiRunner implements CommandLineRunner {

    @Autowired
    private ProdottiService prodottiService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("ProdottiRunner...");

//        Drink d =  prodottiService.createLemonade();
        Drink d =  prodottiService.createWater();
        prodottiService.salvaProdotto(d);

//        Topping t =  prodottiService.createToppingTomato();
        Topping t =  prodottiService.createToppingCheese();
        //Topping t =  prodottiService.createToppingSalami();
        prodottiService.salvaProdotto(t);

//        Pizza m = prodottiService.createPizzaMargherita();
        Pizza m = prodottiService.createPizzaSalami();
        prodottiService.salvaProdotto(m);

    }




}
