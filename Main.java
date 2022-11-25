public class Main {
    public static void main(String[] args) {
        Quantity physicalMemorySize = new Quantity(32, "B");
        Quantity frameSize = new Quantity(4, "B");
        PhysicalMemory physicalMemory = new PhysicalMemory(physicalMemorySize, frameSize);
        OperatingSystem operatingSystem = new OperatingSystem(9, physicalMemory);
        CPU cpu = new CPU();
        MMU mmu = new MMU();
        Quantity virtualMemorySize = new Quantity((float) Math.pow(2, operatingSystem.getBits()), "B");
        Quantity pageSize = new Quantity(4, "B");


        VirtualMemory virtualMemory = new VirtualMemory(virtualMemorySize, pageSize, operatingSystem);
        Quantity processSize = new Quantity(13, "B");
        Process process = new Process(11, processSize);


        VirtualMemory virtualMemory1 = new VirtualMemory(virtualMemorySize, pageSize, operatingSystem);
        Quantity processSize1 = new Quantity(8, "B");
        Process process1 = new Process(22, processSize1);


        operatingSystem.giveMemory(process, virtualMemory);
        process.generateData();
        operatingSystem.loadProcess(process);

        operatingSystem.giveMemory(process1, virtualMemory1);
        process1.generateData();
        operatingSystem.loadProcess(process1);

        for (Frame frame : physicalMemory.getFrames()) {
            System.out.println(frame.toString());
        }
    }
}