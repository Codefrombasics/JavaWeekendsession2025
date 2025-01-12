package org.example.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArraysAsListExample {
    public static void main(String[] args) {
//        String[] employees = {"Ravi", "Vishnu", "Ranjan"};
//        List<String> employeeArr = Arrays.asList(employees);
//
//        // Modifying the list (and array)
//        employeeArr.set(0, "Yellow");
//        System.out.println(employeeArr.size());
//
//        // Accessing elements in the original array
//        System.out.println(employeeArr.get(0).equals(employees[0])); // Output: true
//        System.out.println(employeeArr.get(1).equals(employees[1])); // Output: true
//        System.out.println(employeeArr.get(2).equals(employees[2])); // Output: true
        Integer numbers[]={1,2,null,3,4,5};
        List<Integer> myList= Arrays.asList(numbers);
       myList.set(1,30);//UnsupportedOperationException
        System.out.println(myList);

        List<Employees> employees=List.of(
                new Employees(1,"Vishnu"),
                new Employees(2,"Parthiban"),
                new Employees(3,"Velavan")
        );
     employees.get(0).setName("hello");
        System.out.println(employees);
//        Optional<Integer> optional= Optional.of(1,2,3,4,5);?
    }
}
