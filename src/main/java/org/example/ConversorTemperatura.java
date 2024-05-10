package org.example;

import java.util.Scanner;

public class ConversorTemperatura {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            while (true) {
                exibirMenu();
                int opcao = teclado.nextInt();
                teclado.nextLine();

                if (opcao >= 1 && opcao <= 3) {
                    System.out.print("Digite o valor da temperatura: ");
                    double valor = teclado.nextDouble();
                    teclado.nextLine();

                    converterTemperatura(opcao, valor);
                } else if (opcao == 0) {
                    System.out.println("Saindo do programa...");
                    break;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

            teclado.close();
        }
        private static void exibirMenu() {
            System.out.println("\n\n--- Conversor de Temperatura do Britão ---");
            System.out.println("[1] Converter Celsius -> Kelvin & Fahrenheit");
            System.out.println("[2] Converter Kelvin -> Celcius & Fahrenheit");
            System.out.println("[3] Converter Fahrenheit -> Celcius & Kelvin");
            System.out.println("[0] Sair");
            System.out.print("Escolha a opção desejada: ");
        }

        private static void converterTemperatura(int opcao, double valor) {
            double celsius = 0, kelvin = 0, fahrenheit = 0;

            switch (opcao) {
                case 1: // Celsius -> Kelvin & Fahrenheit
                    kelvin = valor + 273.15;
                    fahrenheit = (valor * 9/5) + 32;
                    celsius = valor;
                    break;
                case 2: // Kelvin -> Celcius & Fahrenheit
                    celsius = valor - 273.15;
                    fahrenheit = (valor * 9/5) - 459.67;
                    kelvin = valor;
                    break;
                case 3: // Fahrenheit -> Celcius & Kelvin
                    celsius = (valor - 32) * 5/9;
                    kelvin = (valor - 32) * 5/9 + 273.15;
                    fahrenheit = valor;
                    break;
                default:
                    celsius = 0;
                    kelvin = 0;
                    fahrenheit = 0;
            }
            System.out.println("\nResultados:");
            System.out.printf("Celsius: %.2f°C\n", celsius);
            System.out.printf("Kelvin: %.2fK\n", kelvin);
            System.out.printf("Fahrenheit: %.2f°F\n", fahrenheit);
        }
    }

