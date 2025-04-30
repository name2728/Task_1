package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Calculator calculator = new Calculator();
System.out.println("5+5 = "+calculator.add(5,5));
System.out.println("5-1 =" +calculator.divide(5,1));
System.out.println("5*6 = "+calculator.multiply(5,6));
System.out.println("6/2 = "+calculator.divide(6,2));
System.out.println(("6/0 = "+calculator.divide(6,0)));

    }
}