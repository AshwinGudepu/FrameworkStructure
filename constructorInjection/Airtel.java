package constructorInjection;

public class Airtel {

    public String data;
    public String networkName;

    public Airtel(String networkName) {
        this.networkName = networkName;
    }

    public Airtel(String data, String networkName) {
        this.data = data;
        this.networkName = networkName;
    }

    public void displayStudentInformation(){
        if(networkName==null || data==null) {
            throw new NullPointerException("One Dependecy is Not Set");
        }
        System.out.println("Using AIRTEL Data Internet Browsing-->" + data);
        System.out.println("Using AIRTEL Network-->" + networkName);
    }

}
