import java.util.ArrayList;

public class VirtualMemory extends Memory {
    ArrayList<Page> pages;
    PageTable pageTable;
    OperatingSystem operatingSystem;


    public VirtualMemory(Quantity storageSize, Quantity pageSize, OperatingSystem operatingSystem) {
        super(storageSize, pageSize, "Page");
        this.pageTable = new PageTable(operatingSystem.getPhysicalMemory());
        this.pages = new ArrayList<>();
        this.operatingSystem = operatingSystem;
    }

    public void build() {
        int binaryIndex = 0;
        for (int i = 0; i < this.getNumberOfBlocks().getValue(); i++) {
            this.pages.add(new Page(this.getBlockSize()));
            for (int j = 0; j < this.blockSize.getValue(); j++) {
                this.pages.get(i).addAddress(new Address(Binary.getBinaryOf(binaryIndex, this.operatingSystem.getBits())));
                binaryIndex++;
            }
        }
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public PageTable getPageTable() {
        return pageTable;
    }

    public void setPageTable(PageTable pageTable) {
        this.pageTable = pageTable;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}