package airtelAssignment;

public class AirtelRunner {

    private Service service;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void activatingService(){
        service.service();
    }
}
