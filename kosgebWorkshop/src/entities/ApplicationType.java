package entities;

import java.util.List;

public class ApplicationType {

    private int id;
    private String name;
    private List<ApplicationStatus> applicationStatus;

    public ApplicationType() {
    }

    public ApplicationType(int id, String name, List<ApplicationStatus> applicationStatus) {
        this.id = id;
        this.name = name;
        this.applicationStatus = applicationStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ApplicationStatus> getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(List<ApplicationStatus> applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
}
