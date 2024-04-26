package org.example.HW9;

public class Main {
    public static void main(String[] args) {
        Size sizeS = Size.S;
        //print S size
        System.out.println("Short Name: " + sizeS.getShortName());
        System.out.println("Width: " + sizeS.getWidth());
        System.out.println("Length: " + sizeS.getLength());
        System.out.println("Info: " + sizeS.toString());

        Size sizeM = Size.M;
        //print M size
        System.out.println("Short Name: " + sizeM.getShortName());
        System.out.println("Width: " + sizeM.getWidth());
        System.out.println("Length: " + sizeM.getLength());
        System.out.println("Info: " + sizeM.toString());

        Size sizeXL = Size.XL;
        //print XL size
        System.out.println("Short Name: " + sizeXL.getShortName());
        System.out.println("Width: " + sizeXL.getWidth());
        System.out.println("Length: " + sizeXL.getLength());
        System.out.println("Info: " + sizeXL.toString());

        Size sizeXXL = Size.XXL;
        //print XXL size
        System.out.println("Short Name: " + sizeXXL.getShortName());
        System.out.println("Width: " + sizeXXL.getWidth());
        System.out.println("Length: " + sizeXXL.getLength());
        System.out.println("Info: " + sizeXXL.toString());
    }
}
