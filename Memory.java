public class Memory {
    Quantity storageSize;
    Quantity blockSize;
    Quantity numberOfBlocks;

    public Memory(Quantity storageSize, Quantity blockSize, String typeOfBlock) {
        this.storageSize = storageSize;
        this.blockSize = blockSize;
        this.numberOfBlocks = new Quantity(storageSize.getValue() / blockSize.getValue(), typeOfBlock);
    }

    public Quantity getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(Quantity storageSize) {
        this.storageSize = storageSize;
    }

    public Quantity getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(Quantity blockSize) {
        this.blockSize = blockSize;
    }

    public Quantity getNumberOfBlocks() {
        return numberOfBlocks;
    }

    public void setNumberOfBlocks(Quantity numberOfBlocks) {
        this.numberOfBlocks = numberOfBlocks;
    }
}