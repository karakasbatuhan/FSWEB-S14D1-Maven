package com.workintech.developers;

public class SeniorDeveloper extends HRManager{
    public SeniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
        setSalary(salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer starts to working");
    }

    public void addEmployee(String name){
        arrayLength = SeniorDeveloper.length;
        arrayLength = arrayLength + 1;
        SeniorDeveloper[arrayLength] = name;
    }
}
