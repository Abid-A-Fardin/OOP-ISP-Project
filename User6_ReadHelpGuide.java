package iub.oop.courseprojects.oopfinalproject;

public class User6_ReadHelpGuide {
    private String category;
    private String guideText;

    public User6_ReadHelpGuide() {
    }

    public User6_ReadHelpGuide(String category, String guideText) {
        this.category = category;
        this.guideText = guideText;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGuideText() {
        return guideText;
    }

    public void setGuideText(String guideText) {
        this.guideText = guideText;
    }

    @Override
    public String toString() {
        return "User6_ReadHelpGuide{" +
                "category='" + category + '\'' +
                ", guideText='" + guideText + '\'' +
                '}';
    }
}
