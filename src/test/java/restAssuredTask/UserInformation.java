package restAssuredTask;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class UserInformation {

    @JsonIgnoreProperties(ignoreUnknown = true)
    private int id;
    private String username;
    private String name;
    private String email;
    public AddressInformation address;
    private String phone;
    private String website;
    public CompanyInformation company;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressInformation getAddress() {
        return address;
    }

    public void setAddress(AddressInformation address) {
        this.address = address;
    }

    public CompanyInformation getCompany() {
        return company;
    }

    public void setCompany(CompanyInformation company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
