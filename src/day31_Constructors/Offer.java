package day31_Constructors;

public class Offer {
    public String Location;
    public String companyName;
    public String jobTitel;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFullTime;
    public String location;

    public void setInfo(String location, String companyName, String jobTitel, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH) {
        this.Location = location;
        this.companyName = companyName;
        this.jobTitel = jobTitel;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "Location='" + Location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitel='" + jobTitel + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
