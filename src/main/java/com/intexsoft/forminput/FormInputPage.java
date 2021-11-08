package com.intexsoft.forminput;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.*;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;


public class FormInputPage extends WebPage {


    public FormInputPage() {
        CompoundPropertyModel<FormInputModelDAO> compoundPropertyModel = new CompoundPropertyModel<>(new FormInputModelDAO());
        Form<FormInputModelDAO> form = new Form<>("form", compoundPropertyModel);

        form.add(new TextField<>("formInputModel.line"));

        RadioChoice<Integer> radioChoice = new RadioChoice<>("formInputModel.numberRadioChoice");
        radioChoice.setChoices(compoundPropertyModel.bind("formInputModel.numbers"));
        form.add(radioChoice);

        DropDownChoice<Integer> dropDownChoice = new DropDownChoice<>("formInputModel.numberDropDown");
        dropDownChoice.setChoices(compoundPropertyModel.bind("formInputModel.numbers"));
        form.add(dropDownChoice);

        form.add(new CheckBox("formInputModel.booleanCheckBox"));

        add(form);
        add(new Label("model", compoundPropertyModel.bind("formInputModel")));
    }
}
