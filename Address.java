public class Address {
    Quantity size;
    String number;
    String offset;
    String bitAddress;
    String data;

    public Address(String bitAddress) {
        this.bitAddress = bitAddress;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Address{" +
                "data='" + data + '\'' +
                '}';
    }

    public Quantity getSize() {
        return size;
    }

    public void setSize(Quantity size) {
        this.size = size;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getBitAddress() {
        return bitAddress;
    }

    public void setBitAddress(String bitAddress) {
        this.bitAddress = bitAddress;
    }
}
