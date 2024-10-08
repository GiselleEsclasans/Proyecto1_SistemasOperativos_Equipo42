/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Classes.Company;

import Interfaces.DashboardApple;
import Interfaces.DashboardHP;
import Interfaces.Inicio;
import java.io.File;

/**
 *
 * @author gigie
 */
public class App {
    // FIle params
  
    
    private static App instance;
    public static Company hp;
    public static Company apple;

    private App() {}

    public static App getInstance() {
        if (instance == null) {
            instance = new App();
            hp = new Company("HP", 20, 30);
            apple = new Company("APPLE", 15, 30);
        }
        return instance;
    }

    public void start() {
        Inicio inicio = new Inicio(hp, apple);
        hp.distributeEmployees();
        apple.distributeEmployees();
//        hp.startWork();
//        apple.startWork();
        inicio.setVisible(true);
    }
}

