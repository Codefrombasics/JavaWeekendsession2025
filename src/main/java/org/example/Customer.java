package org.example;

public class Customer {
    //variables or fields
    private int custId;
    private String customerName;
    private String customerEmailId;
    private  long phoneNumber;

    public Customer() {
    }

    public Customer(int custId, String customerName, String customerEmailId, long phoneNumber) {
        this.custId = custId;
        this.customerName = customerName;
        this.customerEmailId = customerEmailId;
        this.phoneNumber = phoneNumber;
    }

    //setter
   public void setCustId( int custId){
       this.custId=custId;
   }

    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //getter method
    public int getCustId() {
        return custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailId() {
        return customerEmailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void printCustomerDetails(){
        System.out.println(custId+" "+customerName+" "+customerEmailId+" "+phoneNumber);
    }




}
