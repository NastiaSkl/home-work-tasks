package com.hillel.lecture_9;

public class Phone {
    private String provider;
    private String type;
    private String OS;
    private String color;


    public String getProvider(){
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getOS (){
        return OS;
    }

    public void setOS (String OS){
        this.OS = OS;
    }

    public String getColor(){
        return color;
    }

    public void setColor (String color){
        this.color = color;
    }


    public void call(){
        System.out.println("Ring-Ring");
    }

    public void down(){
        System.out.println("The battery is over. Phone is down. Bye.");
    }
}
