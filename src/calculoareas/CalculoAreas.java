
package calculoareas;

import java.util.*;
public class CalculoAreas {
    
   private  final static  String numeros = "1234567890";
    private void  Circulo(float radio) throws Exception
    { 
       float resultado =0;
       float pi = 3.141519f;
       
       resultado = pi * (radio*radio);
       
       System.out.println("El area del circulo es de " +resultado);

    }
            
    private void Cuadraro(float lado) throws Exception
    {
        float resultado=0;
        resultado = (lado*lado);
        System.out.println("El area del cuadrado es de "+resultado);
        
    }
    
    private void Rectangulo(float largo, float ancho) throws Exception
    {
        float resultado =0;
        resultado = largo* ancho;
        System.out.println("El area del rectangulo es de "+resultado);
    }
    
    private void Triangulo (float altura, float base) throws Exception
    {
        float resultado =0;
        resultado = (base*altura)/2;
        System.out.println("El area del triangulo es de "+resultado);
    }
            
    
    public static void main(String[] args) {
        
        CalculoAreas area = new CalculoAreas();
        
        Scanner teclado = new Scanner (System.in);
        
        char operacion;
        try{
        System.out.println("******************************************");
        System.out.println("*********Calculadora de Areas*************");
        System.out.println("1.- Para obtener el area de un CIRCULO   .");
        System.out.println("2.- Para obtener el area de un CUADRADO  .");
        System.out.println("3.- Para obtener el area de un RECTANGULO.");
        System.out.println("4.- Para obtener el area de un TRIANGULO .");
        System.out.println("******************************************");
        System.out.println("Seleccione el calculo a realizar: >");
        operacion= teclado.next().charAt(0);
        
        
         switch (operacion)
         {
             case '1': 
                 
                 System.out.println("Obtener el area de un circulo ");
                 System.out.println("--------------------------------");
                 System.out.println("Introduzca el valor del radio: >");
                 float radio = teclado.nextFloat();
                 area.Circulo(radio);

                 break;
             
             case '2':
                 System.out.println("Obtener el area de un cuadrado");
                 System.out.println("-------------------------------");
                 System.out.println("Introduzca el valor del lado: >");
                 float lado = teclado.nextFloat();
                 area.Cuadraro(lado);
                 
                 
                 break;
                 
             case '3':
                 System.out.println("Obtener el area de un rectangulo");
                 System.out.println("--------------------------------");
                 System.out.println("Introduzca el valor del largo: >");
                 float largo = teclado.nextFloat();
                 System.out.println("Introduzca el valor del ancho: >");
                 float ancho = teclado.nextFloat();
                 area.Rectangulo(largo, ancho);
                 
                break;
                
             case '4':
                 System.out.println("Obtener el area de un triangulo");
                 System.out.println("----------------------------------");
                 System.out.println("Introduzca el valor de la altura >");
                 float altura = teclado.nextFloat();
                 System.out.println("Introduzca el valor de la base:  >");
                 float base = teclado.nextFloat();
                 area.Triangulo(altura, base);
                 
                 
                 break;
                 
             default: 
                 System.out.println("Ingreso un caracter no valido");
                       area.main(args);
                 break;
         }
        } catch (Exception e)
                {
                    System.out.println(e.getMessage());
                    area.main(args);
                }
    }
    
}
