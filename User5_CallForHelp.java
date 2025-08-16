package iub.oop.courseprojects.oopfinalproject;

public class User5_CallForHelp {
    private String selectsIssueComboBox;
    private String issueDetailsTextField;

    public User5_CallForHelp(String selectsIssueComboBox, String issueDetailsTextField) {
        this.selectsIssueComboBox = selectsIssueComboBox;
        this.issueDetailsTextField = issueDetailsTextField;


    }

    public User5_CallForHelp() {

    }


    public String getSelectsIssueComboBox() {
        return selectsIssueComboBox;
    }

    public void setSelectsIssueComboBox(String selectsIssueComboBox) {
        this.selectsIssueComboBox = selectsIssueComboBox;
    }

    public String getIssueDetailsTextField() {
        return issueDetailsTextField;
    }

    public void setIssueDetailsTextField(String issueDetailsTextField) {
        this.issueDetailsTextField = issueDetailsTextField;
    }

    @Override
    public String toString() {
        return "CallForHelp{" +
                "selectsIssueComboBox='" + selectsIssueComboBox + '\'' +
                ", issueDetailsTextField='" + issueDetailsTextField + '\'' +
                '}';
    }
}



