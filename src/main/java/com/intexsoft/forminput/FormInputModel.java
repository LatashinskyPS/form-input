package com.intexsoft.forminput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormInputModel implements Serializable {

    private String line = "";
    private List<Integer> numbers = Arrays.asList(1, 2, 3);
    private Integer numberRadioChoice = 0;
    private Integer numberDropDown = 0;
    private Boolean booleanCheckBox = false;
    private static List<String> lines = new ArrayList<>();

    @Override
    public String toString() {
        return "{" +
                "line=" + line +
                ", numberRadioChoice=" + numberRadioChoice +
                ", numberDropDown=" + numberDropDown +
                ", booleanCheckBox=" + booleanCheckBox +
                '}';
    }


    public Integer getNumberRadioChoice() {
        return numberRadioChoice;
    }

    public void setNumberRadioChoice(Integer numberRadioChoice) {
        this.numberRadioChoice = numberRadioChoice;
    }

    public Integer getNumberDropDown() {
        return numberDropDown;
    }

    public void setNumberDropDown(Integer numberDropDown) {
        this.numberDropDown = numberDropDown;
    }

    public Boolean getBooleanCheckBox() {
        return booleanCheckBox;
    }

    public void setBooleanCheckbox(Boolean booleanCheckbox) {
        this.booleanCheckBox = booleanCheckbox;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void setBooleanCheckBox(Boolean booleanCheckBox) {
        this.booleanCheckBox = booleanCheckBox;
    }

    public static List<String> getLines() {
        return lines;
    }

    public static void setLines(List<String> lines) {
        FormInputModel.lines = lines;
    }

}
