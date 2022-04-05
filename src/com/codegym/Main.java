package com.codegym;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Student student1 = new Student(1,"Minh",new Language("java"));
    Student student2 = new Student(2, "Hùng",new Language("php"));
    Student student3 = new Student(3, "Hải",new Language("java"));
    Student student4 = new Student(4, "long",new Language("C#"));
    Student student5 = new Student(5, "Biên",new Language("java"));
        Map<Integer,Language> listStudent = new HashMap<>();
        listStudent.put(student1.getId(),student1.getLanguage());
        listStudent.put(student2.getId(),student2.getLanguage());
        listStudent.put(student3.getId(),student3.getLanguage());
        listStudent.put(student4.getId(),student4.getLanguage());
        listStudent.put(student5.getId(),student5.getLanguage());


    Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id: ");
        int id = scanner.nextInt();
        System.out.println(listStudent.get(id));


    }
}
