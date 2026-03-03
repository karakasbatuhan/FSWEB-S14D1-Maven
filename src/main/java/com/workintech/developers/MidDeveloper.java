package com.workintech.developers;

public class MidDeveloper extends HRManager{

    public MidDeveloper(long id, String name, int salary) {
        super(id, name, salary);
        setSalary(salary);
    }

    @Override
    public void work() {
        System.out.println("Mid developer starts to working");
    }

    public void addEmployee(String name){
        arrayLength = MidDeveloper.length;
        arrayLength = arrayLength + 1;
        MidDeveloper[arrayLength] = name;
    }
}
