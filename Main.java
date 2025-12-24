public class Main {
    public static void main(String[] args) {
        short x = 7;
        int y = 5;
        float f1 = 13.5f;
        float f2 = 8f;
        System.out.println("El valor de x es " + x + " y el valor de y " + y);
        System.out.println("El resultado de x+y es " + (x + y));
        System.out.println("El resultado de x+y es " + x + y);
        System.out.println("El resultado de x-y es " + (x - y));
        System.out.println("El resultado de x/y es " + (x / y));
        //printf: 1ºformato, luego resto de elementos a visualizar
        //printf = imprimir con formato
        System.out.printf("%s %d\n", "El resultado de x/y es ", (x / y));
        System.out.println("El resto de la división: x%y es " + (x % y));

        System.out.println("El resultado de f1/f2: es " + (f1 / f2));
        System.out.printf("%s %.2f\n", "El resultado de f1/f2", f1 / f2);
        System.out.printf("El resultado de %s/%s es %.2f\n", f1, f2, f1 / f2);

        System.out.println("El resto de f1%f2 es " + (f1 % f2));
        System.out.printf("%s %.0f\n", "El resultado de f1%f2", f1 % f2);

    }
}
