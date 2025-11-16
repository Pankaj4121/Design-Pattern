package com.DesignPattern.Design.Pattern.ProtoTypeDesign;

public class Company implements Prototype{
    private String type;
    private String name;
    private String salary;

    public void setType(String type) {
        this.type = type;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(String type, String name, String salary){
        this.type=type;
        this.name=name;
        this.salary=salary;
    }
    @Override
    public Prototype clone(){
        return new Company(type, name, salary);
    }

    public void show(){
        System.out.println("Type : " + type + ", Name : " + name + ", Salary : " + salary);
    }
}
