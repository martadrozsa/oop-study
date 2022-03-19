import entity.Employee;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário.
*/

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Gross salary: ");
        double grossSalary =  sc.nextDouble();

        System.out.print("Tax: ");
        double tax =  sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.printf("Employee: %s, $ %.2f\n" , employee.getName(), employee.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);
        System.out.printf("Updated data: %s, $ %.2f", employee.getName(), employee.netSalary());
        sc.close();

    }
}
