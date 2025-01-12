package org.example;

public class Oopsdemo {
    public static void main(String[] args) {
        //creating object for class Customer

//        classname objectname=new classname();
        Customer customer=new Customer(10,"Ganesh Kumar","ganeshkumar@gmail.com",7867867898L);//object of customer class
        customer.setCustomerName("Ganesh");
        //customer name has been changed to Ganesh Kumar
        customer.printCustomerDetails();

        Customer customer2=new Customer(102,"Rakesh","rakesh@gmail.com",9878766555L);

        customer2.printCustomerDetails();

        Customer customer3=new Customer();
        customer3.setCustomerName("Bharath");
        customer3.setCustId(108);
        System.out.println(customer3.getPhoneNumber());
        //phoneNumber not assigned 0L
        //emailid not assigned null
        customer3.printCustomerDetails();


    }
}
