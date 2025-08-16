package iub.oop.courseprojects.oopfinalproject;

public class User5_CheckInternetSpeed {
    private double downloadSpeed;
    private double uploadSpeed;
    private int latency;

    public User5_CheckInternetSpeed() {
    }

    public User5_CheckInternetSpeed(double downloadSpeed, double uploadSpeed, int latency) {
        this.downloadSpeed = downloadSpeed;
        this.uploadSpeed = uploadSpeed;
        this.latency = latency;
    }

    public double getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setDownloadSpeed(double downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    public double getUploadSpeed() {
        return uploadSpeed;
    }

    public void setUploadSpeed(double uploadSpeed) {
        this.uploadSpeed = uploadSpeed;
    }

    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }

    @Override
    public String toString() {
        return "User5_CheckInternetSpeed{" +
                "downloadSpeed=" + downloadSpeed +
                ", uploadSpeed=" + uploadSpeed +
                ", latency=" + latency +
                '}';
    }
}
