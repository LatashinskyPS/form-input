package com.intexsoft.forminput;

import java.io.Serializable;

public class FormInputModelStore implements Serializable {
    public static FormInputModel formInputModel = new FormInputModel();

    public static FormInputModel getFormInputModel() {
        return formInputModel;
    }

    public static void setFormInputModel(FormInputModel formInputModel) {
        FormInputModelStore.formInputModel = formInputModel;
    }
}
