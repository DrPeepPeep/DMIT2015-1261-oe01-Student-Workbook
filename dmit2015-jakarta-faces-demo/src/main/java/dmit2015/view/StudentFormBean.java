package dmit2015.view;

import dmit2015.model.StudentInfo;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class StudentFormBean implements Serializable {

    private int submissionCount;    // getter

    private  StudentInfo studentInfo = new StudentInfo(); // getter

    @Inject
    private StudentinfoSession studentinfoSession;

    public void removeStudent(StudentInfo existingStudent) {
        studentinfoSession.remove(existingStudent);
    }

//    private String fullName;    // getter/setter
//    private String program;     // getter/setter
//    private boolean fullTime;   // getter/setter

    public void submit() {
        submissionCount++;

        studentinfoSession.add(studentInfo);

        String messageDetail = String.format(
                "Full name:%s, Program: %s, FullTime: %s",
                studentInfo.getFullName(),
                studentInfo.getProgram(),
                studentInfo.isFullTime() ? "Yes" : "No");
        FacesMessage message = new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                "Form Submitted",
                messageDetail
        );
        FacesContext.getCurrentInstance()
                .addMessage(null, message);
//        fullName = null;
//        program = null;
        studentInfo = new StudentInfo();

    }


    public int getSubmissionCount() {
        return submissionCount;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }
}
