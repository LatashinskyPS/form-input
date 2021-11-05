package com.intexsoft.forminput;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.*;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;


public class FormInputPage extends WebPage {

    private static FormInputModel component = new FormInputModel();

    public FormInputPage() {
        CompoundPropertyModel<FormInputModel> compoundPropertyModel = new CompoundPropertyModel<>(component);
        Form<FormInputModel> form = new Form<>("form", compoundPropertyModel);

        form.add(new TextField<>("line"));

        RadioChoice<Integer> radioChoice = new RadioChoice<>("numberRadioChoice");
        radioChoice.setChoices(compoundPropertyModel.bind("numbers"));
        form.add(radioChoice);

        DropDownChoice<Integer> dropDownChoice = new DropDownChoice<>("numberDropDown");
        dropDownChoice.setChoices(compoundPropertyModel.bind("numbers"));
        form.add(dropDownChoice);

        form.add(new CheckBox("booleanCheckBox"));

        add(form);
        add(new Label("lines", new Model<>(component)));
    }
}
