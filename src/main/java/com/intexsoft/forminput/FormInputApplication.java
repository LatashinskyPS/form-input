package com.intexsoft.forminput;

import org.apache.wicket.protocol.http.WebApplication;


public class FormInputApplication extends WebApplication {
    @Override
    public Class<FormInputPage> getHomePage() {
        return FormInputPage.class;
    }
}
