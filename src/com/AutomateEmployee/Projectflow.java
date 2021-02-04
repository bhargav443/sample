
    package com.AutomateEmployee;

import java.util.Scanner;

    public class Projectflow {
        public static void projectMenu() {
            boolean breakOut1 = false;
            while (breakOut1 == false) {
                extracted();
                Scanner scanner2 = new Scanner(System.in);
                int choice2 = scanner2.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("enter new project details");
                        Project project = new Project();
                        project.addProject();
                        break;
                    case 2:
                        System.out.println("List projects");
                        break;
                    case 3:
                        System.out.println("To add employes to the project");
                        break;
                    case 4:
                        System.out.println("To remove employees from the project");
                        break;
                    case 5:
                        System.out.println("To delete project");
                        break;
                    case 6:
                        System.out.println("To list employees of the project");
                        break;
                    case 7:
                        System.out.println("you choose to exist1");
                        breakOut1 = true;
                        break;
                    default:
                        System.out.println("option not available");

                }
            }
        }

        public static void extracted(){
            System.out.println("choose an option");
            System.out.println("1.enter new project details");
            System.out.println("2. List projects");
            System.out.println("3.To add employes to the project");
            System.out.println("4. To remove employees from the project");
            System.out.println("5.To delete project");
            System.out.println("6.To list employees of the project");
            System.out.println("7.you choose to exist1");
        }
    }


