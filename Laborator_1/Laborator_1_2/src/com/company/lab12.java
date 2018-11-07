package Univerlab1;

public class lab12 {
    public static void main(String[] args)
    {
        University UTM = new University( "UTM", 1965);
        University ULIM = new University("ULIM", 1977);
        Student Vasilica = new Student( "Vasilica" , 20, 9 );
        UTM.addSt(Vasilica);
        UTM.printST();
    }
}
