package com.worksheet02;

import java.util.Scanner;

class Exercise01 {
  public static void main() {
    Scanner scanner = new Scanner (System.in);

    String name = scanner.nextLine();
    String schoolClass = scanner.nextLine();
    double grade1 = scanner.nextDouble();
    double grade2 = scanner.nextDouble();
    double grade3 = scanner.nextDouble();

    System.out.printf("Média do aluno %s da turma %s: %.1f.", name, schoolClass, (grade1 + grade2 + grade3)/3);
  }
}