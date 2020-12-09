package com.example.chef101.pojo;

import java.util.ArrayList;

public class Instructions {
    private String instruction;

    public Instructions(String instruction) {
        this.instruction = instruction;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public static ArrayList<Instructions> getPizzaInstructionsList() {
        ArrayList<Instructions> instructionsList = new ArrayList<>();
        instructionsList.add(new Instructions("asdoiwueowjkepojqw oi ioqwhjeoij d wefqwwqrqwesaalkskijh b whgvwsiuhdghsiujhdu au"));
        instructionsList.add(new Instructions("asdasalkskijh oiwueowjkepojqw oi ioqwhjeoij d wefqwwqrqweb whgvwsiuhdghsiujhdu au"));
        instructionsList.add(new Instructions("asfdsfgalkskijh b whgvwsoiwueowjkepojqw oi ioqwhjeoij d wefqwwqrqweiuhdghsiujhdu au"));
        instructionsList.add(new Instructions("fdgfdgalkskijh b whgvwsioiwueowjkepojqw oi ioqwhjeoij d wefqwwqrqweuhdghsiujhdu au"));
        instructionsList.add(new Instructions("sdfdsgsaoiwueowjkepojqw oi ioqwhjeoij d wefqwwqrqwelkskijh b whgvwsiuhdghsiujhdu au"));
        return instructionsList;
    }

    public static ArrayList<ArrayList<Instructions>> getMainInstructionsList() {
        ArrayList<ArrayList<Instructions>> mainList = new ArrayList<>();
        mainList.add(getPizzaInstructionsList());
        return mainList;
    }
}
