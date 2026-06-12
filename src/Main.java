// Source - https://stackoverflow.com/a/5287561
// Posted by Marco Aviles, modified by community. See post 'Timeline' for change history
// Retrieved 2026-06-12, License - CC BY-SA 4.0

import java.util.Scanner;
// Java Program to demonstrate the
// use of any other access modifier
// other than public
class Main
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Reading from System.in
        System.out.println("Enter a number: ");
        double a = reader.nextDouble(); // Scans the next token of the input as an int
        System.out.println("Enter a number: ");
        double b = reader.nextDouble();
// Once finished
        System.out.println("Enter a aperatir: ");
        char op = reader.next().charAt(0);
        reader.close();
        double result=0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                if (b==0) {
                    System.out.println("Get riyaziyyati oyren");
                    return;
                } else { result = a / b;
                    break;
                 }
            case '*':
                result = a * b;
                break;
        }
        System.out.println(result);

    }}