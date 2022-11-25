import java.util.ArrayList;

public class PhysicalMemory extends Memory {
    ArrayList<Frame> frames;
    OperatingSystem operatingSystem;
    int bits;

    public PhysicalMemory(Quantity storageSize, Quantity frameSize) {
        super(storageSize, frameSize, "Frame");
        this.bits = (int) (Math.log(this.getStorageSize().getValue()) / Math.log(2));
        this.frames = new ArrayList<>();
    }

    public void build() {
        int binaryIndex = 0;
        for (int i = 0; i < this.getNumberOfBlocks().getValue(); i++) {
            this.frames.add(new Frame(this.getBlockSize(), new Address(Binary.getBinaryOf(i, 3))));
            for (int j = 0; j < this.blockSize.getValue(); j++) {
                this.frames.get(i).addAddress(new Address(Binary.getBinaryOf(binaryIndex, this.bits)));
                binaryIndex++;
            }
        }
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

    public ArrayList<Frame> getFrames() {
        return frames;
    }

    public void setFrames(ArrayList<Frame> frames) {
        this.frames = frames;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}