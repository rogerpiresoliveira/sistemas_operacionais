import java.util.ArrayList;
import java.util.HashMap;

public class PageTable {
    HashMap<Page, Frame> pageTable;
    PhysicalMemory physicalMemory;

    public PageTable(PhysicalMemory physicalMemory) {
        this.pageTable = new HashMap<>();
        this.physicalMemory = physicalMemory;
    }

    public void map(Page page, ArrayList<String> data) {
        for (Frame frame : physicalMemory.getFrames()) {
            if (frame.isEmpty()) {
                this.pageTable.put(page, frame);
                for (int i = 0; i < data.size(); i++) {
                    frame.getAddresses().get(i).setData(data.get(i));
                }
                break;
            }
        }
    }
}