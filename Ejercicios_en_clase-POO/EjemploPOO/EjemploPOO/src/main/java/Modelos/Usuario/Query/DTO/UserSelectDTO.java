package Model.User.Query.DTO;

public class UserSelectDTO {

    private int id;
    private String cedula;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;

    public UserSelectDTO(String cedula, String firstName, String lastName, String email, String phone, String address, int id) {
        this.cedula = cedula;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCedula() {
        return cedula;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
