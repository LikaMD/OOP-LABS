package Univerlab1;

public class University {
    private String name;
    private int FoundationYear;
    public Student[] StudentsArray;
    public int NrStudents = 0;

    public University (String name, int FoundationYear) {
        this.name = name;
        this.FoundationYear = FoundationYear;
        StudentsArray = new Student[10];
    }
    public void addSt (Student NewStudent){
        StudentsArray[NrStudents]=NewStudent;
        NrStudents++;
    }
    public void printST(){
        System.out.println(name+"Students : ");
        for(int i=0; i<NrStudents; i++){
            StudentsArray[i].printSt();
        }
    }

}
