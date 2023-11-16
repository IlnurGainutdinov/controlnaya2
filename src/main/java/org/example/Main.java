package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] listId = {1,2,3};
        String[] listNames = {"Конструктор","Робот","Кукла"};
        int[] listProbability = {2,2,6};
        int sum = 0;
        for (int i = 0; i < listProbability.length; i++) {
            sum += listProbability[i];
        }
        PriorityQueue toys = new PriorityQueue<>();
        for (int i = 0; i < listId.length; i++) {
            for (int j = 0; j < listProbability[i]; j++) {
                Toy toy = new Toy(listId[i],listNames[i],listProbability[i] );
                toys.add(toy.toString());
            }
        }
        System.out.println(toys.size());

        List arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Object toy = toys.poll();
            arrayList.add(toy);
        }
        System.out.println(arrayList);
        Random random = new Random();
        System.out.println(arrayList.get(random.nextInt(0, 10)));

        String file = "file.txt";
        try(FileWriter fileWriter = new FileWriter(file)){
            for(Object toy: arrayList){
                fileWriter.write((arrayList.get(random.nextInt(0, 10)).toString()));


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}