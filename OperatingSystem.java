import java.util.ArrayList;

public class OperatingSystem {
    private final int bits;
    private PhysicalMemory physicalMemory;

    public OperatingSystem(int bits, PhysicalMemory physicalMemory) {
        this.bits = bits;
        this.physicalMemory = physicalMemory;
        this.physicalMemory.build();
    }

    public void giveMemory(Process process, VirtualMemory virtualMemory) {
        process.setVirtualMemory(virtualMemory);
        process.getVirtualMemory().build();
    }

    public void loadProcess(Process process) {
        int numberPage = 0;
        float blockSize = process.getVirtualMemory().getBlockSize().getValue();
        ArrayList<String> subArray = new ArrayList<>();
        float remaining = process.getData().length % blockSize;
        int i;
        for (i = 1; i <= process.getData().length; i++) {
            subArray.add(process.getData()[i - 1]);
            if (i % blockSize == 0) {
                process.getVirtualMemory().getPageTable().map(process.getVirtualMemory().getPages().get(numberPage), subArray);
                numberPage++;
                subArray.clear();
            }
        }
        subArray.clear();
        i = (int) (numberPage * blockSize);
        for (int j = 0; j < remaining; j++) {
            subArray.add(process.getData()[i]);
            process.getVirtualMemory().getPageTable().map(process.getVirtualMemory().getPages().get(numberPage), subArray);
            i++;
        }
        subArray.clear();
    }

    public PhysicalMemory getPhysicalMemory() {
        return physicalMemory;
    }

    public void setPhysicalMemory(PhysicalMemory physicalMemory) {
        this.physicalMemory = physicalMemory;
    }

    public int getBits() {
        return this.bits;
    }
}