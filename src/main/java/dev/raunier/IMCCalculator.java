package dev.raunier;

import java.util.Scanner;

public class IMCCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter your weight in kilograms: ");
            double peso = scanner.nextDouble();

            
            System.out.print("Enter your height in meters: ");
            double altura = scanner.nextDouble();

            
            double imc = calcularIMC(peso, altura);

            
            System.out.printf("Your IMC is: %.2f%n", imc);

            
            System.out.println("Categoría: " + obtenerCategoriaIMC(imc));
        }
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String obtenerCategoriaIMC(double imc) {
        if (imc < 16) {
            return "Severe Thinness";
        } else if (imc >= 16 && imc < 17) {
            return "Moderate Thinness";
        } else if (imc >= 17 && imc < 18.5) {
            return "Mild Thinness";
        } else if (imc >= 18.5 && imc < 25) {
            return "Normal weight"; 
        } else if (imc >= 25 && imc < 30) {
            return "Overweight";  
        } else if (imc >= 30 && imc < 35) {
            return "Mild Obesity";
        } else if (imc >= 35 && imc < 40) {
            return "Moderate Obesity"; 
        } else if (imc >= 40) {
            return "Morbid obesity";
  
        }
        return null;
    }
}
