package com.example.pr8;

import java.util.Random;

public class Vaccine {

    Random random = new Random();
    int day=random.nextInt(1,30);
    int month = random.nextInt(1,12);
    int year = random.nextInt(2015,2021);
    public String date;

    public String getDate(){
        return date;
    }

    public void setDate(String a){
        date=a;
    }

    private String[] Type = new String[]{"Аттенуированные", "Инактивированные","Одновалентные", "Поливалентные"};
    public String type;

    public String getType(){
        return type;
    }

    public void setType(String a){
        type=a;
    }


    private String[] Drugname = new String[]{"Азитронит", "Альвет","Левамизол 75", "Мастенит", "Ферран", "Цифлунит", "Эймицид", "Ивермек"};
    public String drugname;
    public String getDrugname(){
        return drugname;
    }

    public void setDrugname(String a){
        drugname=a;
    }

    public  Vaccine(){
        this.date= day + "." + month + "." + year;
        this.type = Type[random.nextInt(Type.length)];
        this.drugname =Drugname[random.nextInt(Drugname.length)];
    }

    public Vaccine(String date, String type, String drugname){
        this.date=date;
        this.type=type;
        this.drugname=drugname;
    }

}
