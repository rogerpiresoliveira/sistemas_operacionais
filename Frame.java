import java.util.ArrayList;

public class Frame {
    Quantity size;
    ArrayList<Address> addresses;
    Address indexOfFrame;

    public Frame(Quantity size, Address indexOfFrame) {
        this.size = size;
        this.indexOfFrame = indexOfFrame;
        this.addresses = new ArrayList<>();
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (Address address: this.addresses) {
            if (address.getData() != null) {
                empty = false;
                break;
            }
        }
        return empty;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "addresses=" + addresses +
                '}';
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

    public Address getIndexOfFrame() {
        return indexOfFrame;
    }

    public void setIndexOfFrame(Address indexOfFrame) {
        this.indexOfFrame = indexOfFrame;
    }
}