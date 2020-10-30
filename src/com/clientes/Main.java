package com.clientes;

import clases.BeneficiosCovid19;
import clases.Clientes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {

            BeneficiosCovid19 covid1 = new BeneficiosCovid19();
            Clientes miCliente = new Clientes();

            int cuantos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos beneficios va a capturar"));
            List<BeneficiosCovid19> beneficios1 = new ArrayList<>();
            for (int i = 0; i < cuantos; i++) {
                covid1.setId(String.valueOf(Math.random() * 6));
                covid1.setNombre(JOptionPane.showInputDialog("Descripcion del Beneficio :"));
                covid1.setValorSubsidio(Float.parseFloat(JOptionPane.showInputDialog("Valor del Beneficio : ")));
                beneficios1.add(covid1);
            }

            BeneficiosCovid19 covid2 = new BeneficiosCovid19();
            ArrayList<BeneficiosCovid19> beneficios2 = new ArrayList<>();
            for (int i = 0; i < cuantos; i++) {
                covid2.setId(String.valueOf(Math.random() * 6));
                covid2.setNombre(JOptionPane.showInputDialog("Descripcion del Beneficio " + i + ":"));
                covid2.setValorSubsidio(Float.parseFloat(JOptionPane.showInputDialog("Valor del Beneficio : ")));
                beneficios2.add(covid2);
            }

            int cuantos1 = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Clientes va a capturar"));
            for (int i = 0; i < cuantos1; i++) {
                miCliente.setNombre(JOptionPane.showInputDialog("Nombre del Cliente"));
                miCliente.setCedula(JOptionPane.showInputDialog("Deigite Cedula del Cliente:  "));
                int j = 1;
                if (j == 1) {
                    miCliente.setListaBeneficios(beneficios1);
                    j = 2;
                } else {
                    miCliente.setListaBeneficios(beneficios2);
                    j = 1;
                }
                JOptionPane.showMessageDialog(null,"Informacion Cleinte " + i +"\n" +
                         "Nombre Cliente " + miCliente.getNombre() + "\n" +
                         "Cedula Cliente " + miCliente.getCedula() + "\n" +
                         "Lista de Beneficios" + miCliente.getListaBeneficios());
            }

            Main.comparListas(beneficios1, beneficios2);

        } catch (InputMismatchException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public static void comparListas(List<BeneficiosCovid19> beneficios1, List<BeneficiosCovid19> beneficios2) {

        float mejorBeneficio = 0;

        BeneficiosCovid19  compara = new BeneficiosCovid19();

        String resultado = (beneficios1 == beneficios2) ? "Iguales" : "Diferentes";

        for(int i = 0 ; i < beneficios1.size(); i++)
            if (beneficios1.get(i).getNombre().equals(beneficios2.get(i).getNombre()) {
                JOptionPane.showMessageDialog("Los beneficios son iguales");

        }else{
               JOptionPane.showMessageDialog(null,"Los nombres del beneficio  \n" +
                       beneficios1.get(i).getNombre() + "\n" +
                       beneficios2.get(i).getNombre());
        }



        for(int i = 0; i < beneficios1.size(); i++) {
             mejorBeneficio = compara.getMejorbeneficio(beneficios1.get(i).getValorSubsidio());
        }

        JOptionPane.showMessageDialog(null, "Las listas son:" + resultado + "\n" +
                           "El mejor beneficioes es:" + mejorBeneficio);


    }
}