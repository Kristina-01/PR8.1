package com.example.pr8;

import java.util.ArrayList;
import java.util.Random;

public class Pet {

    Random r = new Random();
    int number;

    private String[] nicknameDog = new String[]{"Ричард", "Доги", "Джек", "Соли", "Макс", "Соба", "Лилу", "Луна"};
    public String[] nicknameCat = new String[]{"Мася", "Мурка", "Барсик", "Пуля", "Джерси", "Ася", "Бaрки", "Вeнси"};
    public String nickname;

    public String getnickname(){
        return nickname;
    }

    public void setnickname(String a){
        nickname=a;
    }

    public int age;
    public int getage(){
        return age;
    }

    public void setage(int a){
        age=a;
    }

    private String[] Type = new String[]{"Собака", "Кошка"};
    public String type;

    public String getType(){
        return type;
    }

    public void setType(String a){
        type=a;
    }

    public String DateofBirth;
    public String getDateofBirth(){
        return DateofBirth;
    }

    public void setDateofBirth(String a){
        DateofBirth=a;
    }

    ArrayList<Vaccine> vaccines = new ArrayList<>();

    public Pet(){
        this.type=Type[r.nextInt(Type.length)];
        this.age= r.nextInt(1,25);
        int day=r.nextInt(1,30);
        int month = r.nextInt(1,12);
        int year = 2021 - age;
        this.DateofBirth = day + "." + month + "." + year;

        if(type.equals("Собака")){nickname=nicknameDog[r.nextInt(nicknameDog.length)];}
        else {nickname=nicknameCat[r.nextInt(nicknameCat.length)];}

        Vaccine newV = new Vaccine();
        vaccines.add(newV);
    }

    public Pet(String type, String nickname, int age, String DateofBirth, String date, String typev, String drugname){
        this.type=type;
        this.nickname=nickname;
        this.age=age;
        this.DateofBirth=DateofBirth;
        Vaccine newv= new Vaccine(date, typev, drugname);
        vaccines.add(newv);
    }

    public String toString() {
        return number + ". " + nickname;
    }


}
