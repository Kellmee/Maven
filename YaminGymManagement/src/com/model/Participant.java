package com.model;

public class Participant {
    private String name;
    private String phoneNumber;
    private String email;
    private int age;
    private Batch batch; 

  
    public Participant(String name, String phoneNumber, String email, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    
    public void receiveBatchStartMessage() {
        System.out.println("Message received by " + name + ": The batch has started.");
    }
}
