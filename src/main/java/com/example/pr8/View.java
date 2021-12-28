package com.example.pr8;

import com.example.pr8.Pet;

import java.util.ArrayList;

public class View {
    ArrayList<Pet> pets = new ArrayList<Pet>();

    public void creation(){  //создание списка
        for(int i=0;i<4;i++){
            Pet pet = new Pet();
            pets.add(pet);
        }
    }


}
