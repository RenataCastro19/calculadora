package org.example;

public class Calculator<T extends Number> {
    private T[] numbers;            //Arreglos de elementos tipo T

    //constructor
    public Calculator(T[] numbers){
    this.numbers=numbers;
    }

    //metodo para calcular el promedio
    public double average(){
        double suma=0;
        for (T num : numbers){          //num es una variable temp que recorre la lista de los elementos
            suma += num.doubleValue();
        }
        return suma / numbers.length;
    }
}
