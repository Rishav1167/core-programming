package java_strings.level2;

import java.util.*;

class StudentsGrade{
    public static int generateMark(){
        return (int) (Math.random() * 100);
    }

    public static int[][] generateMarksArray(){
        int[][] marks = new int[10][3];
        for (int i = 0; i < marks.length; i++){
            for (int j = 0; j < marks[i].length; j++){
                marks[i][j] = generateMark();
            }
        }
        return marks;
    }

    public static double[][] calc(int[][] marks){
        double[][] calculated = new double[10][3];
        for (int i = 0; i < marks.length; i++){
            double sum = 0.0;
            for (int j = 0; j < marks[i].length; j++){
                sum += marks[i][j];
            }
            double avg = sum/3;
            double percent = (sum/300.0)*100;
            calculated[i][0] = sum;
            calculated[i][1] = Math.round(avg * 100.0) / 100.0;
            calculated[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return calculated;
    }

    public static String[][] calcGrade(double[][] calcMarks){
        String[][] remarks = new String[10][2];
        for (int i = 0; i < calcMarks.length; i++){
            if (calcMarks[i][2] >= 80){
                remarks[i][0] = "A";
                remarks[i][1] = "Level 4";
            } else if (calcMarks[i][2] >= 70){
                remarks[i][0] = "B";
                remarks[i][1] = "Level 3";
            } else if (calcMarks[i][2] >= 60){
                remarks[i][0] = "C";
                remarks[i][1] = "Level 2";
            } else if (calcMarks[i][2] >= 50){
                remarks[i][0] = "D";
                remarks[i][1] = "Level 1";
            } else if (calcMarks[i][2] >= 40){
                remarks[i][0] = "E";
                remarks[i][1] = "Level 1";
            } else{
                remarks[i][0] = "R";
                remarks[i][1] = "remedial";
            }
        }
        return remarks;
    }

    public static void print(double[][] calculated, String[][] remarks){
        System.out.println("| marks  | average | percent | grade |   remarks   |");
        for (int i = 0; i < calculated.length; i++){
            System.out.printf("| %6.2f | %6.2f | %6.2f | %-4s | %-10s |\n", calculated[i][0], calculated[i][1], calculated[i][2], remarks[i][0], remarks[i][1]);
        }
    }

    public static void main(String[] args){
        int[][] marks = generateMarksArray();
        double[][] calculated = calc(marks);
        String[][] remarks = calcGrade(calculated);

        print(calculated, remarks);
    }
}