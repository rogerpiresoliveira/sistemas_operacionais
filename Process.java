public class Process {
    int PID;
    Quantity size;
    VirtualMemory virtualMemory;
    String[] data;

    public Process(int PID, Quantity size) {
        this.PID = PID;
        this.size = size;
        this.data = new String[(int) Math.ceil(this.size.getValue())];
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public float getSizeValue() {
        return this.size.getValue();
    }

    public String getSizeUnit() {
        return this.size.getUnitName();
    }

    public void setSize(Quantity size) {
        this.size = size;
    }

    public VirtualMemory getVirtualMemory() {
        return virtualMemory;
    }

    public void setVirtualMemory(VirtualMemory virtualMemory) {
        this.virtualMemory = virtualMemory;
    }

    public void generateData() {
        String unit = size.getUnitName();
        float remaining = (float) (this.size.getValue() - Math.floor(this.size.getValue()));
        String PID = String.valueOf(this.PID);
        for (int i = 0; i < this.data.length; i++) {
            data[i] = String.valueOf(i + 1).concat("# ").concat("PID ".concat(String.valueOf(PID).concat(" - 1").concat(unit)));
        }
        if (remaining > 0) {
            int last = data.length - 1;
            data[last] = String.valueOf(last + 1).concat("# ").concat("PID ".concat(String.valueOf(PID).concat(" - ").concat(String.format("%.2f", remaining)).concat(unit)));
        }
    }

    public String[] getData() {
        return this.data;
    }
}