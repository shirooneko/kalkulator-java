package Modul1;

public class Praktikum1 {
    public static void main(String[] args){
        int jumOp = Integer.parseInt(args[0]); //mnginput banyaknya operasi
        String[] inpOpran = (args); //mengimpun number operan dan operator

        System.out.println("Jumlah Operasi " + jumOp);

        for(int operator = 0; operator < jumOp; operator++) {
            if (Integer.parseInt(inpOpran[1 + (operator * 3)]) == 1) { //Operator Penjumlahan
                System.out.print(Integer.parseInt(inpOpran[2 + (operator * 3)]) + Integer.parseInt(inpOpran[3 + (operator * 3)]));
            }
            if (Integer.parseInt(inpOpran[1 + (operator * 3)]) == 2) { //Operator Pengurangan
                System.out.print(Integer.parseInt(inpOpran[2 + (operator * 3)]) - Integer.parseInt(inpOpran[3 + (operator * 3)]));
            }
            if (Integer.parseInt(inpOpran[1 + (operator * 3)]) == 4) { //Operator Pengurangan
                System.out.print(Integer.parseInt(inpOpran[2 + (operator * 3)]) * Integer.parseInt(inpOpran[3 + (operator * 3)]));
            }
            System.out.print(" ");
        }
    }
}