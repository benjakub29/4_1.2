/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      var reader = new BufferedReader(new InputStreamReader(System.in));

      while (true) {
        System.out.println("1 - Dodaj studenta");
        System.out.println("2 - wypisz wszystkich studentów");
        System.out.println("0 - wyjście");

        String choice = reader.readLine();

        if (choice.equals("1")) {
          System.out.print("Podaj imie studenta ");
          String name = reader.readLine();

          System.out.print("Podaj wiek studenta ");
          int age = Integer.parseInt(reader.readLine());

          s.addStudent(new Student(name, age));
  
        } else if (choice.equals("2")) {
          var students = s.getStudents();
          for (Student current : students) {
            System.out.println(current.ToString());
          }
        } else if (choice.equals("0")) {
          break;
        } else {
          System.out.println("nieprawidlowa opcja ");
        }
      }
    } catch (IOException e) {
      System.out.println("Błąd operacji " + e.getMessage());
    }
  }
}
/*
  Commit4_1.1. Zmodyfikuj plik Main tak, aby można było z konsoli dodawać nowego studenta

Commit4_1.2. Zmodyfikuj plik Main tak, aby można było na żądanie wypisać wszystkich studentów z bazy

Commit4_1.3. Zmodyfikuj plik Main i Student tak, aby można było z konsoli dodawać nowego studenta z innymi danymi
  */