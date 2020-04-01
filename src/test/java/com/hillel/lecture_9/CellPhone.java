package com.hillel.lecture_9;

import java.util.Objects;

public class CellPhone extends Phone {


    private int weigthInGram;

    public int getWeigthInGram() {
        return weigthInGram;

    }

    public void setWeigthInGram(int weigthInGram){
        this.weigthInGram = weigthInGram;
    }


    public void vibrateWhileRinging(){
        System.out.println("Phone is vibrating while ringing");
    }


    @Override
    public void down(){
        System.out.println("AAAAAAAAAAAAA! Battery is over! AAAAAAAAAAAAAA!");
    }

    public int hashCode(){
        return Objects.hash(getProvider(), getType());
    }

    public boolean equals (Object o){
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;

        return getOS() == phone.getOS() &&
                getColor() == phone.getColor();

    }
}
