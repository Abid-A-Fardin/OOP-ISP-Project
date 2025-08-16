package iub.oop.courseprojects.oopfinalproject;

public class User5_RestartRouter {
    private String statusMessage;

    public User5_RestartRouter() {
    }

    public User5_RestartRouter(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public String toString() {
        return "User5_RestartRouter{" +
                "statusMessage='" + statusMessage + '\'' +
                '}';
    }
}
