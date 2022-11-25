import java.util.ArrayList;

public class Page {
    Quantity size;
    ArrayList<Address> addresses;

    public Page(Quantity size) {
        this.size = size;
        this.addresses = new ArrayList<>();
    }

    public Quantity getSize() {
        return size;
    }

    public void setSize(Quantity size) {
        this.size = size;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }
}