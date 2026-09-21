package dmit2015.view;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class RegistrationView {

    public String submit () {
        //Redirects to ../registration-success.xhtml
//        return "registration-success?faces-redirect=true";

        //Redirects to ../registration-success
            return "registration-success";
    }

}
