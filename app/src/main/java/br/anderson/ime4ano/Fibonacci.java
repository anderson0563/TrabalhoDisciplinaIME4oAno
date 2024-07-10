package br.anderson.ime4ano;

public class Fibonacci {
    public int calculo(int n){
        if(n<2) return n;
        return calculo(n-1) + calculo(n-2);
    }
}
