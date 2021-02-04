package com.AutomateEmployee;

import com.AutomateEmployee.employe.Employee;
import com.AutomateEmployee.employe.EmployeeFlow;

import java.util.ArrayList;

public class Main {

            public static void main(String[] args) {
                ArrayList<Employee> arrayList=new ArrayList<>();
                EmployeeFlow employeeFlow=new EmployeeFlow();
                employeeFlow.employeMenu();
                Employee employee=new Employee();
                arrayList.add(employee.addEmployee());

                ArrayList<Project> arrayList1=new ArrayList<>();
                Projectflow projectflow=new Projectflow();
                projectflow.projectMenu();
                projectflow.extracted();
                Project project=new Project();
                arrayList1.add(project.addProject());
            }
        }



