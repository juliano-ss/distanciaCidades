/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.distanciacidades;

/**
 *
 * @author jotal
 */
public class DistanciaCidades {
    public static void main(String[] args) {
        int distanciaTotal = 100;
        double tempoCaminhaoPedagio = 0.083333333; 
        double distanciaCarro = distanciaTotal / 2;
        double distanciaCaminhao = distanciaTotal / 2;
        
        double tempoEncontro = distanciaTotal / (110 + 80);
        double tempoCaminhaoPedagioTotal = tempoCaminhaoPedagio * 2;
        double tempoCaminhao = tempoEncontro + tempoCaminhaoPedagioTotal;
        
       
        double distanciaCarroPercorrida = 110 * tempoEncontro;
        double distanciaCaminhaoPercorrida = 80 * tempoCaminhao;
        
       
        distanciaCarro -= distanciaCarroPercorrida;
        distanciaCaminhao -= distanciaCaminhaoPercorrida;
        
        
        if (distanciaCarro < distanciaCaminhao) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else if (distanciaCaminhao < distanciaCarro) {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O carro e o caminhão estão na mesma distância de Ribeirão Preto.");
        }
    }
}

//A distância total entre Ribeirão Preto e Franca é de 100 km,
//então a distância percorrida por cada veículo até o ponto de encontro é de 50 km. 
//Considerando que o caminhão leva 5 minutos a mais para passar em cada pedágio,
//foi adicionado um tempo extra ao cálculo do tempo de encontro, totalizando 10 minutos (0.083333333 horas).

//O tempo de encontro foi calculado dividindo a distância total pela soma das velocidades do carro e do caminhão. 
//Com o tempo de encontro e o tempo extra dos pedágios, foi possível calcular a distância percorrida por cada veículo até o ponto de encontro.

//Com as distâncias percorridas, foi subtraída a distância percorrida por cada veículo até o ponto de encontro 
//da distância total de cada um, chegando assim às distâncias restantes.
//O veículo que estiver com a menor distância restante é o que estará mais próximo de Ribeirão Preto.
//No caso desse algoritmo, o resultado é que o carro está mais próximo de Ribeirão Preto.