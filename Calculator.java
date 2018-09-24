package com.company;

public class Calculator {
    
    private double minnet; 
    private double tal1;
    private double tal2;
  
    public void addDigit(double[] tal )
    {
        this.tal1 = tal[0];
        this.tal2 = tal[1];
    }
    
    public void makeAddition()
    {
        minnet = tal1 + tal2;
    };
    
    public void makeSubstraction()
    {
         minnet = tal1 - tal2;
    };
    
    public void makeMultiplication()
    {
         minnet = tal1 * tal2;
    };
    
    public void makeDivision()
    {
         minnet = tal1 / tal2;
    };

    public double getMemory()
    {
        return minnet;
    }
}