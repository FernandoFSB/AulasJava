/*
 * Faça um programa em Java, que resolva a equação de 2o grau.
 * O usuário ainda não deve digitar os valores, eles devem vir declarados no programa.
 */
package aulaexemplo;

public class EquaSegundoGrau {
    public static void main(String args[]){
        
        int delta, a = 1, b = 3, c = 2, d = -4, b2, v2;
        double r1, r2;
        // encontrando o resuldado delta
        b2 = b*b;
        v2 = ((d)*(a)*(c));
        delta = (b2)+(v2); 
        // calculando as raizes de x' e x''
        r1 = (-b + Math.sqrt(delta))/(2*a);
        r2 = (-b - Math.sqrt(delta))/(2*a);
        // imprimindo na tela para mostrar os valores
        System.out.println("O valor de delta é de: "+ delta);
        System.out.println("O valor de x' é igual a: "+ r1);
        System.out.println("O valor de x'' é igual a: "+ r2);
    }
}
