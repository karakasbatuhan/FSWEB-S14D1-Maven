package com.workintech.developers;

public class HRManager extends Employee{

    String[] JuniorDeveloper;
    String[] MidDeveloper;
    String[] SeniorDeveloper;

    public int arrayLength;


    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
        setSalary(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }

    public void addEmployee(){
    }
}
