package com.clientes;

import clases.BeneficiosCovid19;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class Main {

    public static void main(String[] args) {
        try {

            int cuantos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos beneficios va a capturar"));

            BeneficiosCovid19 covid1 = new BeneficiosCovid19();

            ArrayList<BeneficiosCovid19> beneficios1 = new ArrayList<>();
            for(int i = 0; i < cuantos; i++) {
                covid1.setId(String.valueOf(Math.random() *6));
                covid1.setNombre(JOptionPane.showInputDialog("Descripcion del Beneficio :"));
                covid1.setValorSubsidio(Float.parseFloat(JOptionPane.showInputDialog("Valor del Beneficio : ")));
                beneficios1.add(covid1);
            }

            BeneficiosCovid19 covid2 = new BeneficiosCovid19();
            ArrayList<BeneficiosCovid19> beneficios2 = new ArrayList<>();
            for(int i = 0; i < cuantos; i++) {
                covid2.setId(String.valueOf(Math.random() *6));
                covid2.setNombre(JOptionPane.showInputDialog("Descripcion del Beneficio " + i +":"));
                covid2.setValorSubsidio(Float.parseFloat(JOptionPane.showInputDialog("Valor del Beneficio : ")));
                beneficios2.add(covid2);
            }
            Main.comparListas(beneficios1,beneficios2);
        } catch (InputMismatchException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public static void comparListas(ArrayList<BeneficiosCovid19> beneficios1 , ArrayList<BeneficiosCovid19> beneficios2) {
        String resultado = null;
        String resulSubsidio = null;
        int valores;
        float mejorBeneficio = 0;
            for(int i =0; i < beneficios1.size(); i++) {
                if (beneficios1.get(i).getId().equals(beneficios2.get(i).getId())) {
                    resultado = "Iguales";
                } else {
                    resultado = "Diferentes";
                }

                if(beneficios1.get(i).getValorSubsidio() == beneficios2.get(i).getValorSubsidio()) {
                    valores = 0;
                }
                    else if (beneficios1.get(i).getValorSubsidio() < beneficios2.get(i).getValorSubsidio()){
                        valores = 1;
                    } else {
                        valores = 2;
                    }

                 switch (valores) {
                    case 0 : resulSubsidio = "Iguales";
                    case 1 : resulSubsidio = "Subsidio 2 mayor que subsido1";
                    case 2 : resulSubsidio = "Subsidio 1 mayor que Subsidio2 ";
                    default : resulSubsidio = "No se puede comparar";
                }

                float valorComparar = beneficios1.get(i).getValorSubsidio();
                mejorBeneficio = beneficios1.get(i).getMejorbeneficio(valorComparar);
            }
        System.out.println("Las listan son :" + resultado);
        System.out.println("El mejor beneficio es :" + mejorBeneficio);
        System.out.println(resulSubsidio);





    }
}
