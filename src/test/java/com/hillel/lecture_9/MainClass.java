package com.hillel.lecture_9;


public class MainClass {

    public static void main(String[] args) {

        LandlinePhone phone1 = new LandlinePhone();
        phone1.call("John Viktorovich");
        phone1.getLouderWhileRinging();
        phone1.setShape("round");
        phone1.setProvider("Kyivstar");
        phone1.setOS("Android");
        phone1.setColor("white");
        phone1.setType("Landline");
        System.out.println(phone1);
        System.out.println(String.format("Landline Phone OS, color, shape, provider and type = %s, %s, %s, %s, %s", phone1.getOS(), phone1.getColor(),
                phone1.getShape(), phone1.getProvider(), phone1.getType()));
        System.out.println(phone1.hashCode());

        CellPhone phone2 = new CellPhone();
        phone2.setColor("white");
        phone2.setOS("Android");
        phone2.setProvider("Life");
        phone2.setType("CellPhone");
        phone2.setWeigthInGram(120);
        phone2.vibrateWhileRinging();
        phone2.down();
        System.out.println(phone2);

        System.out.println(String.format("Cell Phone OS, color, weight, provider and type = %s, %s, %s, %s, %s" , phone2.getOS(), phone2.getColor(),
                phone2.getWeigthInGram(), phone2.getProvider(), phone2.getType() ));

        System.out.println(phone2.hashCode());

        if (phone1.equals(phone2)){
            System.out.println("Phones are equal");
        } else {
            System.out.println("Phones are not equal");
        }


    }

}