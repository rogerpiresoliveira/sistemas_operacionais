public class CPU {
    Process runningProcess;
    MMU MMU;

    public CPU() {
    }

    public void getNextAddress() {
        this.runningProcess.getVirtualMemory();
    }
}
