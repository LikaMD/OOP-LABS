package Univerlab1;

public class Student {
    private String name;
    private int age;
    private int mark;

    public Student (String Name , int Age, int Mark){
        this.name=Name;
        this.age=Age;
        this.mark=Mark;

    }

    void printSt(){
        System.out.println("Name: "+name+"\nAge : "+age+"\nMark : "+mark);
    }

}
