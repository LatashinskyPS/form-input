package com.intexsoft.forminput;

public class FormInputModelStore {
    public static FormInputModel formInputModel = new FormInputModel();

    public static FormInputModel getFormInputModel() {
        return formInputModel;
    }

    public static void setFormInputModel(FormInputModel formInputModel) {
        FormInputModelStore.formInputModel = formInputModel;
    }
}
