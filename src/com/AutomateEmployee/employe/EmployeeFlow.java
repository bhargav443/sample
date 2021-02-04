
package com.AutomateEmployee.employe;

import com.AutomateEmployee.Projectflow;

import java.util.Scanner;

    public class EmployeeFlow {
        public static void employeMenu(){
            boolean breakOut=false;
            while (breakOut==false){
                System.out.println("choose an option");
                System.out.println("1.enter new employee details");
                System.out.println("2.delete employee");
                System.out.println("3.employee salary");
                System.out.println("4.you choose to exist1");
                Scanner scanner=new Scanner(System.in);
                int choice=scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("enter new employee details");
                        Employee employee=new Employee();
                        employee.addEmployee();
                        break;
                    case 2:
                        System.out.println("Delete employee");
                        break;
                    case 3:
                        System.out.println("employee salary");
                        break;
                    case 4:
                        System.out.println("you choose to exit");
                        breakOut=true;
                        break;
                    default:
                        System.out.println("option not available");


                }
            }
        }
    }


