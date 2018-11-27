/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmontalvo.controlador;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PC6-LAB2
 */
public class Coordinador {
    public static void showMenu() {
        int exit =0;
        do {            
            System.out.println("BIENVENIDOS A NETFLIX VIEWER");
            System.out.println("Selecciona una opción \n"
                    + "1.-Books\n "
                    + "2.-Magazine\n"
                    + "3.-Movies\n"
                    + "4.-Series\n"
                    +"\n-----------------\n"
                    + "5.-Report \n"
                    + "6.-Report today\n"
                    + "7.-Salir"  );   //leer la respuesta del usuario 
            Scanner input =new Scanner(System.in);
            
            int response =input.nextInt();
            
            switch(response){
                case 0:
                    //salir
                    break;
                    case 1:
                    showBooks();
                    break;
                    case 2:
                    showMagazine();
                    break;
                    case 3:
                      showMovies();
                    break;
                    case 4:
                    showSeries();
                    break;
                    case 5:
                    makeReport();
                    break;
                    case 6:
                    makeReport(new Date() );
                    break;
                   default:
                       System.out.println("");
                       System.out.println("...seleciiona una opcion !!!");
                       System.out.println("");
            }
           
        } while (exit!=0);
        
    }
    public static void showMovies(){
        int exit =0;
        do {            
            System.out.println("");
            System.out.println(": MOVIES :");
            System.out.println("");
        } while (exit !=0);
        }
         public static void showSeries(){
        int exit =0;
        do {            
            System.out.println("");
            System.out.println(": SERIES:");
            System.out.println("");
        } while (exit !=0);
         }
         public static void showBooks(){
        int exit =0;
        do {            
            System.out.println("");
            System.out.println(": BOOKS :");
            System.out.println("");
        } while (exit !=0);
         }
         public static void showMagazine(){
        int exit =0;
        do {            
            System.out.println("");
            System.out.println(": MAGAZINE :");
            System.out.println("");
        } while (exit !=0);
    }
         private static void makeReport(){
             
         }
         private static void makeReport (Date date){
             
         }
}
