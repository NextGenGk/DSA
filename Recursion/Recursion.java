package Recursion;

public class Recursion {
    static void RussianDoll(int Doll){
        if (Doll == 1){
            System.out.println("All Dolls Are Opened");
        }
        else {
            RussianDoll(Doll - 1);
        }
    }
    public static void main(String[] args) {
        RussianDoll(10);
    }
}
