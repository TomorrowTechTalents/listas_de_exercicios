package com.worksheet02;

import java.util.Scanner;

class Exercise05 {
  public static void main() {
    Scanner scanner = new Scanner (System.in);

    double time = scanner.nextDouble();
    double speed = scanner.nextDouble();

    System.out.println("quantidade de combustível necessário: " + time * speed / 12);
  }
}
