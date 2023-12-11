
package cgpacalculator;

import java.util.*; 



public class CgpaCalculator {
    public static String getGrade(double score){
        String grade = "";
        if(score >= 70 && score <= 100){
            grade = "A";
        }else if(score >= 60 && score <= 69){
            grade = "B";
        }else if(score >= 50 && score <= 59){
            grade = "C";
        }else if(score >= 40 && score <= 49){
            grade = "D";
        }else if(score >= 30 && score <= 39){
            grade = "E";
            
        }else if(score >= 30 && score <= 39){
            grade = "F";
        }
            return grade;
    }
    
    public static int getPoint(String grade){
        int point = 0;
        switch(grade){
            case "A":
                point = 5;
                break;
            case "B":
                point =4;
                break;    
            case "C":
                point = 3;
                break;  
            case "D":
                point = 2;
                break;    
            case "E":
                point = 1;
                break;
            case "F":
                point = 0;
                break;
        }
        return point;
        
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner i = new Scanner(System.in);
         
       
         System.out.print("How many courses would like to input: ");
         int numberOfCourses = Integer.parseInt(i.nextLine());
         
         String[] courseTitle = new String[numberOfCourses];
         int[] courseUnit = new int[numberOfCourses];
         String[] courseGrade = new String[numberOfCourses];
         int [] gradeUnit = new int [numberOfCourses];
         
         for (int j = 0; j<numberOfCourses;j++){
             
             System.out.print("Enter course title(eg. MATH101, JAVA101): ");
             courseTitle[j] = i.nextLine(); 
             
             System.out.print("Enter the course unit: ");
             courseUnit[j] = Integer.parseInt(i.nextLine());
             
             
             System.out.print("Enter your score: ");
             double score = Double.parseDouble(i.nextLine());
             String grade = getGrade(score);
             
             courseGrade[j] = grade;
             
             gradeUnit[j]= getPoint(grade);
             System.out.println("");
             System.out.println("");
              }
        
        double totalQualityPoints = 0;
        double totalCourseUnits = 0;
        
        for (int k = 0; k < numberOfCourses; k++){
//            totalGradeUnits += gradeUnit[k];
              totalCourseUnits += courseUnit[k];

            totalQualityPoints += gradeUnit[k] * courseUnit[k];
              
        }
        System.out.println(totalQualityPoints);
        System.out.println(totalCourseUnits);
        double cgpa = totalQualityPoints / totalCourseUnits;
        
        System.out.println("|--------------------|------------------|------------|---------------------|");
        System.out.println(" " + "COURSE & CODE " + "       "+ "   COURSE UNIT    " + "   " + "  GRADE  " + "       " + "  GRADE UNIT  ");
        System.out.println("|--------------------|------------------|------------|---------------------|");
        
        for (int m = 0; m < numberOfCourses; m++){
            System.out.println(String.format("|     %s        |          %s       |      %s     |            %s        |",courseTitle[m],courseUnit[m],courseGrade[m],gradeUnit[m]));
            
         
        }
       
        System.out.println("Your CGPA is : " + String.format("%.2f",cgpa) + " to 2 decimal places");
//        
        
    }
    
}
