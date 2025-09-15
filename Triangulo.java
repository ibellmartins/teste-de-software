/**
 * 
 * @author: Isabella Sofia Martins - RA: 10420398 
 * 
 */

public class Triangulo {
    public int lado1;
    public int lado2;
    public int lado3;

    public boolean verificaTriangulo(int l1, int l2, int l3) {
        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) { 
            System.out.println("é um triangulo!");
            return true;
        } else {
            System.out.println("não é um triangulo!");
            return false;
        }
    }

    public boolean equilatero(int l1, int l2, int l3) {
        if (l1 == l2 && l2 == l3) {
            System.out.println("esse triangulo é equilátero!");
            return true;
        } else {
            System.out.println("este triangulo nao é equilátero!");
            return false;
        }
    }

    public boolean isosceles(int l1, int l2, int l3) {
        if (l1 == l2 || l2 == l3 || l3 == l1) {
            System.out.println("esse triangulo é isósceles!");
            return true; 
        } else {
            System.out.println("esse triangulo nao é isósceles!");
            return false;
        }
    }

    public boolean escaleno(int l1, int l2, int l3){
        if (l1 != l2 && l2 != l3 && l3 != l1){
            System.out.println("esse triangulo é escaleno!");
            return true;  
        } else {
            System.out.println("esse triangulo não é escaleno!");
            return false; 
        } 
    }

    public static void main(String[] args) {
        Triangulo tri = new Triangulo(); 
        tri.equilatero(2, 5, 6); 
        tri.isosceles(1, 2, 3);
        tri.escaleno(3, 4, 5);
    }
}
