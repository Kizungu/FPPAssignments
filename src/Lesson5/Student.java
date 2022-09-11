package Lesson5;

import java.text.DecimalFormat;

public class Student {
    private double Quiz1;
    private double Quiz2;
    private double Quiz3;
    private double Mid;
    private double Final;

    public Student(double quiz1, double quiz2, double quiz3, double mid, double aFinal) {
        Quiz1 = quiz1;
        Quiz2 = quiz2;
        Quiz3 = quiz3;
        Mid = mid;
        Final = aFinal;
    }

    public double getQuiz1() {
        return Quiz1;
    }

    public void setQuiz1(double quiz1) {
        Quiz1 = quiz1;
    }

    public double getQuiz2() {
        return Quiz2;
    }

    public void setQuiz2(double quiz2) {
        Quiz2 = quiz2;
    }

    public double getQuiz3() {
        return Quiz3;
    }

    public void setQuiz3(double quiz3) {
        Quiz3 = quiz3;
    }

    public double getMid() {
        return Mid;
    }

    public void setMid(double mid) {
        Mid = mid;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double aFinal) {
        Final = aFinal;
    }
    public double average(double q1,double q2,double q3,double m,double f){
        double ave= (Quiz1+Quiz2+Quiz3)*25/30 +Mid*35/100 + Final*40/100;
        return ave;

    }
    public char Grading(double average){
        if(average>=90)
            return 'A';
        else if(average>=80)
            return 'B';
        else if(average>=70)
            return 'C';
        else if(average>=60)
            return 'D';
        else return 'F';
    }

    @Override
    public String toString() {
        return "  Quiz1 :" + this.Quiz1 + " Quiz2 : " + this.Quiz2 + " Quiz3: "  + this.Quiz3 + "  Mid: " + this.Mid + " Final : " + this.Final  +
               "  AverageScore : " + this.average(Quiz1,Quiz2,Quiz3,Mid,Final) + " Grade : " + this.Grading(average(this.Quiz1,this.Quiz2,this.Quiz3,this.Mid,this.Final));
    }

    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("#,##");
        Student student1 = new Student(9.1,9.5,10,90,93);
        Student student2= new Student(6,7,6.3,63,50);
        double averages=student1.average(student1.getQuiz1(),student1.getQuiz2(),student1.getQuiz3(),student1.getMid(),student1.getFinal());
        double averages1=student2.average(student2.getQuiz1(),student2.getQuiz2(),student2.getQuiz3(),student2.getMid(),student2.getFinal());

        System.out.println("Student1 : " +student1.toString());
        System.out.println();
        System.out.println("Student2 : " +student2.toString());

    }

}
