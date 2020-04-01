package com.hillel.lecture_9;

import java.util.Objects;

public class LandlinePhone extends Phone {

    private int sizeInInches;
    private String shape;
    private String callerName;



    public int getSizeInInches(){
        return sizeInInches;
    }

    public void setSizeInInches(int sizeInInches){
        this.sizeInInches = sizeInInches;
    }

    public String getShape(){
        return shape;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public String getCallerName(){
        return callerName;
    }

    public void setCallerName(String john){
        this.callerName = callerName;
    }


    public void getLouderWhileRinging(){
        System.out.println("Phone ringing is getting louder after some time");
    }

    public void call(String callerName){
        System.out.println("Ring-Ring " + callerName);
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
