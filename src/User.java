import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private static int id;
    private Name name;
    private LocalDate dateOfBirth;
    private Address address;
    private PhoneNumber phoneNumber;
    private String email;
    private List<Order> orders = new ArrayList<>();

    private List<Category> favouriteCategories = new ArrayList<Category>();

    public User(Name name, LocalDate dateOfBirth, Address address, PhoneNumber phoneNumber, String email) {
        id++;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void addCategory (Category category){
        favouriteCategories.add(category);
    }

    public void removeCategory (Category category){
        favouriteCategories.remove(category);
    }

    public void removeAllCategories (){
        favouriteCategories.clear();
    }

    public static int getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Order> addOrder(Order order) {
        orders.add(order);
        return orders;
    }
}