/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flowershopmanagementsystem;

/**
 *
 * @author Shiva
 */
import java.util.Scanner;
public class FlowerShopManagementSystem {
     //create 1D arrays for days of the week and flowers
    static String[] Days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    static String[] Bouquets = { "Roses", "Tulips", "Lilies"};
    
    //create 2D array for sales
    static int [][] Sales = new int[7][3];
    static Scanner input = new Scanner(System.in);
    
     //method for populating array
    public static void enterSales(){
        for (int i = 0; i < Days.length; i++){
            for (int j = 0; j< Bouquets.length; j++){
                System.out.println("Enter sales for: "+ Bouquets[j]+" on "+ Days[i]);
                Sales[i][j] = input.nextInt();
            }
        }
    }
    
    //method to display 2d array
    public static void displaySales(){
        System.out.println();
        System.out.println("=============================================");
        System.out.println("       FLOWER SHOP WEEKLY SALES REPORT");
        System.out.println("=============================================");
        System.out.println();
        System.out.printf("%-12s %8s %8s %8s%n", "DAY", "ROSES", "TULIPS", "LILIES");
        System.out.println("------------------------------------------------");
        
        for (int i = 0; i < Sales.length; i++) {
            System.out.printf("%-12s %8d %8d %8d%n", Days[i], Sales[i][0], Sales[i][1], Sales[i][2]);
        }
        System.out.println("------------------------------------------------");
    }
    
    //method to calculate column totals
    public static void calculateBouquetTotals(){
        System.out.println("Total sales per bouquet type:");
        System.out.println();
        for (int c = 0; c< Bouquets.length; c++){
            int Total = 0;
            for (int r = 0; r < Days.length; r++){
                Total += Sales[r][c];
            }
            System.out.println("Total sales for "+ Bouquets[c] + ": R"+ Total);
        }
        System.out.println();
    }
    
    //method to calculate row totals
    public static void calculateDailyTotals(){
        System.out.println("Total sales per day:");
        System.out.println();
        for (int r = 0; r < Days.length; r++){
            int Total = 0;
            for (int c = 0; c < Bouquets.length; c++){
                Total += Sales[r][c];
            }
            System.out.println("Total sales for "+ Days[r] + ": R"+ Total);
        }
        System.out.println();
    }
    
    //method to calculate total sales for the week
    public static void calculateOverallTotal(){
        int OverallTotal = 0;
        for (int r = 0; r < Days.length; r++){
            for (int c = 0; c < Bouquets.length; c++){
                OverallTotal += Sales[r][c]; 
            }
        }
        System.out.println("Overall total sales for the week: R"+ OverallTotal);
    }
    public static void main(String[] args) {
        enterSales();
        displaySales();
        calculateBouquetTotals();
        calculateDailyTotals();
        calculateOverallTotal();   
        input.close();
    }
}
