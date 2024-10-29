/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.variableclase1;

/**
 *
 * @author user
 */
public class Variableclase1 {

    public static void main(String[] args) {
        //hola
        /*ya no puedom popi*/
        //Cambie los numeros reales por numeros imaginario
        /*Realizamos el hola mundo xd
        System.out.println("Hello World!");
        System.out.println("Hola Mundo Zamira");*/

        // Manejo de variable
        /* var msm="Zandy Sandy"; 
        System.out.println("Nombre:"+msm);/*concatenamos utilizando el signo +
       // no entiendo lo que stoy haciendo
       /* var msm=10.0; 
        System.out.println("Nombre:"+msm);*/
        //CONCATENAR CADENAS
        /*var nombre="Zamira";
       var apellido="Shiguango";
       var edad=19;
        System.out.println("Nombre:"+nombre+" "+apellido+"Edad:"+edad);*/
 /*  int num1=5;
       int num2=2;
               int result=num1+num2;
               System.out.println("El resultado es: " +result);*/
 /*byte num1=5;
     byte num2=   */
 /* System.out.println("Número de bits: " + Float.SIZE);
        System.out.println("Número de bytes: " + Float.BYTES);
        System.out.println("Número de máximo: " + Float.MAX_VALUE);
        System.out.println("Número de minimo: " + Float.MIN_VALUE);*/
        //Sistema númericos (hexadefcimal(0x), binario(0b), octal(0)
        /*
        var hex = 0xa;
        var octal = 015;
        var bin = 0b00100110;
        System.out.println("hexadecimal:" + hex);
        System.out.println("octal:" + octal);
        System.out.println("binario:" + bin);
         */

 /* int num1=5;
        String num2="5";
        char num3='5';*/
        //Castear los datos
        /* int num1 = 5;        //este dato no tendria proble xq es entero
        String num2 = "3";  //este es otro tipo de datos
        
                          //de esta parte hemos casteado el dato 
        int result = num1 + (Integer.parseInt(num2));
        System.out.println("Resultado:" + result);*/
 /*
        double num1=5.0;
        String num2="3.2";
        
        double result=num1+(Double.parseDouble(num2));
        System.out.println("El resultado de la suma es: "+result);
         */
 /* String nombre="Zamira";
        String apellido="Shiguango";
        
        String nombre_completo= nombre + " "+apellido;
        
        System.out.println("Resultado:"+nombre_completo);*/
 /*
       String nombre="Zamira";
       int codigo=500;
        
        String nombre_completo= nombre + " "+String.valueOf(codigo);
        
        System.out.println("Resultado:"+nombre_completo);
       
         */
        //RSTRUCTURA CONDICIONAL SIMPLE
        /* int edad=16;
       if(edad<=18){
           System.out.println("ERES MAYOR DE EDAD");
       }
       
         */
 /*
        int lados = 0;
        if (lados == 0) {
            System.out.println("Es circulo");
        }

        if (lados == 3) {
            System.out.println("es triangulo");
        }
        
        if(lados==6){
            System.out.println("es un hexagono");
        }
         */
 /*int edad=-20;
        if(edad>=18){
            System.out.println("Eres mayor de edad");
           
        }else if(edad<0){
            System.out.println("irror");
        }
        else{
            System.out.println("eres menor de edad");
        }*/
 /* int edad = 20;
        if (edad > 0) {
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Eres menor de edad");
            }
        } else {
            System.out.println("El valor ingresado es incorrectoF");
        }*/
 /* 
      int edad = 20;
        if (edad > 0&&edad<100) {
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Eres menor de edad");
            }
        } else {
            System.out.println("El valor ingresado es incorrectoF");
        } */
 /*
      int lado = 0;
        if (lado==0){
                System.out.println("Es Circulo");
            }
        else if (lado==3) {
                System.out.println("Es triangulo");
            }
        else if (lado==4) {                             *no es una manera optima de resolver porque es una escalera de deciciones
                                                         para evitar esto vamos a utilizar un switch-case
                System.out.println("Es Cuadrado");
            }
        else if (lado==0) {
                System.out.println("No existe");
            }
       
         */
 /*
        int suma=10;
        switch(suma){
            case 10:
                System.out.println("La suma es exactamente es 10");
                break;
            case 15:
                System.out.println("si es 10");
                break;
            default:
                 System.out.println("no exite nada");
 
              //SWITCH-CASE
            
        }
         */
 /*int lado = 4;
        switch (lado) {
            case 0:
                System.out.println("Es un circulo");
                break;
            case 3:
                System.out.println("Es un triangulo");
                break;
            case 4:
                System.out.println("Es un cuadrado/Rectangulo");
                break;
            case 5:
                System.out.println("Es una estrella");
                break;
            default:
                System.out.println("No existe fingura geometrica");
        }*/
 /*  char lado = 'a';
        switch (lado) {
            case 'a':
                System.out.println("Es un circulo");
                break;
            case 'b':
                System.out.println("Es un triangulo");
                break;
            case 'c':                                                //
                System.out.println("Es un cuadrado/Rectangulo");
                break;
            case 'z':
                System.out.println("Es una estrella");
                break;
            default:
                System.out.println("No existe fingura geometrica");
        } */
 /* int num1 = 34;          //si quieres que te salga decimales  
                                //tenfras que poner la variable de tipo decimal como 
                                //double y lo contrario int o otro variable de ese tipo
        int num2 = 10;

        int menu = 5;
        switch (menu) {
            case 0:
                System.out.println("Estas sumando los dos numeros");
                System.out.println("Resultado:" + (num1 + num2));
                break;
            case 3:
                System.out.println("Estas restando dos numeros");
                System.out.println("Resultado:" + (num1 - num2));
                break;
            case 4:
                System.out.println("Estas multiplicando dos numeros");
                System.out.println("Resultado:" + (num1 * num2));
                break;

            case 5:
                if (num2 != 0) {

                    System.out.println("Estas dividiendo dos numeros");
                    System.out.println("Resultado:" + (num1 / num2));
                } else {
                    System.out.println("no se puede dividir  para 0");
                }
                break;

            default:
                System.out.println("No existe fingura geometrica");
        }*/
        //REPETITIVA: for
        /*
        System.out.println("ejemplo de for:");
        for (int i = 1; i < 8 ;i = i + 12){
        System.out.println("Número:" + i);
        }*/
        
        //Tabla de multiplicar
        
       /* System.out.println("Tabla de Multiplicar de 5");
        int tabla=5;
        int num=10;
        for(int i=1;i<=num;i=i+1){
            System.out.println(tabla+"  x"+i+"="+(tabla*i));
        }*/
       /*System.out.println("Tabla de suma de 5");
        int suma=5;
        int num=10;
        for(int i=1;i<=num;i=i+1){
            System.out.println(suma+"  +"+i+"="+(suma+i));
     
       }*/
        
        //ESTRUCTURA REPETITIVA: WWhile
       /* int contador=1;
        
       while(contador<=3){
           System.out.println("Contador:"+contador);
           contador++;
       }*/
        
       //ESTRUCTURA REPETITIVA: Do-While
       
      /* int n=0;
       do{
           System.out.println("Valor de n:"+n);
           n++;
           
       }
       while(n<2);
        System.out.println("fon del programa");
    }*/
    
      
      
   

      
      
}
}