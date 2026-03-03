package com.workintech.developers;

public class JuniorDeveloper extends HRManager{


    public JuniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
        setSalary(salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer starts to working");
    }

    public void addEmployee(String name){
        arrayLength = JuniorDeveloper.length;
        arrayLength = arrayLength + 1;
        JuniorDeveloper[arrayLength] = name;
    }
}
