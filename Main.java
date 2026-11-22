public class Main {
static int addition(int a, int b) {
return a + b;
}
static int soustraction(int a, int b) {
return a - b;
}
static int multiplication(int a, int b){
return a*b;
}

public static void main(String[] args) {
System.out.println("2 + 3 = " + addition(2, 3));
System.out.println("10 - 3 = " + soustraction(10, 3));
System.out.println("4 * 3 = " + multiplication(4, 3));
}
}
