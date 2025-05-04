package com.example.practicejava.javapractice.problem10;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main10 {
    List<Employee> employee= Arrays.asList(
            new Employee("Arjun", LocalDate.parse("1998-05-12"),45000,"chennai","Male"),
            new Employee("Mani", LocalDate.parse("2000-11-25"),52000,"Bangalore","Male"),
            new Employee("Karthik", LocalDate.parse("1995-03-10"),60000,"Coimbatore","Male"),
            new Employee("Divya", LocalDate.parse("1999-07-18"),48000,"Mumbai","Female")
    );
    public void groupByLocation(){
    Map<String,List<Employee>> groupByLocation=employee.stream()
            .collect(Collectors.groupingBy(Employee::getLocation));
    groupByLocation.forEach((location,Employee)->{
        System.out.println("Location "+location);
    });





    }
    public void sortSalary() {
        Optional<Employee> st = employee.stream().
                sorted(Comparator.comparing(Employee::getSalary))
                .skip(1)
                .findFirst();
        st.ifPresent(e -> System.out.println(e.getFirstName()));
    }
    public void sortByFirstName(){
        employee.stream().
                sorted(Comparator.comparing(Employee::getFirstName))
                .forEach(employee1 -> System.out.println(employee1.getFirstName()+" "+employee1.getSalary()));

    }
    public void sortByDataBirth(){
        //Descending
        employee.stream().
                sorted(Comparator.comparing(Employee::getDateOfBirth).reversed())
                .forEach(employee1 -> System.out.println(employee1.getFirstName()+" "+employee1.getSalary()));
        //Ascending
        employee.stream().
                sorted(Comparator.comparing(Employee::getDateOfBirth))
                .forEach(employee1 -> System.out.println(employee1.getFirstName()+" "+employee1.getSalary()));
    }
    public void salaryFiltering(){
        //greater Than or equal
        employee.stream()
                .filter(e->e.getSalary()>=40000)
                .forEach(e->System.out.println(e.getFirstName()));
        //Less than or equal to
        employee.stream()
                .filter(e->e.getSalary()<=40000)
                .forEach(e->System.out.println(e.getFirstName()));
    }


}
