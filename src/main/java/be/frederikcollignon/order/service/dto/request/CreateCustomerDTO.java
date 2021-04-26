package be.frederikcollignon.order.service.dto.request;

public class CreateCustomerDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
