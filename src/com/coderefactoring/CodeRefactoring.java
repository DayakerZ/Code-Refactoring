package com.coderefactoring;

import java.util.ArrayList;
import java.util.List;

class Employee{
    private final String name;
    private int age;
    private String jobRole;
    Employee(String name,int age,String jobRole){
        this.name = name;
        this.age = age;
        this.jobRole = jobRole;
    }

    public String getJobRole() {
        return jobRole;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class CodeRefactoring {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Dayaker Reddy",21,"Dev intern");
        Employee employee2 = new Employee("Amith sai",20,"Dev intern");
        Employee employee3 = new Employee("Shiva",29,"ASE");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        //Refactored code
        /*for(Employee employee: employeeList){
            if(employee.getAge() >25){
                System.out.println(employee.getName()+" is Eligible for Long term Bonus");
            }
            else {
                System.out.println(employee.getName()+" Not Eligible for Short term Bonus");
            }
        }*/
        showBonusTypeOfEmployee(employeeList);
    }

    private static void showBonusTypeOfEmployee(List<Employee> employeeList) {
        for(Employee employee: employeeList){
            if(employee.getAge() >25){
                System.out.println(employee.getName()+" is Eligible for Long term Bonus");
            }
            else {
                System.out.println(employee.getName()+" is Eligible for Short term Bonus");
            }
        }
    }
}
