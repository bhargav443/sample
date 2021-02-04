
package com.AutomateEmployee;

import com.AutomateEmployee.employe.Employee;

import java.util.Scanner;

    public class Project  {
        private String projectName;
        private int startDate;
        private int EndDate;
        private String TechnologiesUsed;

        public Project(String projectName,int endDate, String technologiesUsed) {
            this.projectName = projectName;
            this.startDate = 23;
            this.EndDate = endDate;
            this.TechnologiesUsed = technologiesUsed;
        }
        public Project(){

        }

        public String getProjectName() {
            return projectName;
        }

        public int getStartDate() {
            return startDate;
        }

        public int getEndDate() {
            return EndDate;
        }

        public String getTechnologiesUsed() {
            return TechnologiesUsed;
        }
        public Project addProject(){
            Scanner scanner=new Scanner(System.in);

            System.out.println("enter project name");
            String projectName = scanner.nextLine();

            System.out.println("enter start date");
            int startDate=scanner.nextInt();

            System.out.println("enter endDate");
            int endDate=scanner.nextInt();

            System.out.println("enter technologies");
            String technologies=scanner.next();


            Project project1=new Project(projectName,endDate,technologies);

            return project1;
        }

    }



