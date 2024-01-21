package oopSeminar7.task3;

// �����, �������������� ������ "���������".
public class Computer {
    private String processor;
    private String memory;
    private String hardDisk;
    private String graphicsCard;

    // ��������� �����������, ����� ������ "���������" ����� ���� ������� ������ � ������� ���������.
    private Computer() {
    }

    // ������� ��� ����������� ����������.
    public String getProcessor() {
        return processor;
    }

    public String getMemory() {
        return memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    // ��������� ����������� ����� "���������" ��� �������� �������� "���������".
    public static class Builder {
        private Computer computer;

        // ����������� ���������, ������� ����� ������ "���������".
        public Builder() {
            computer = new Computer();
        }

        // ������ ��� ��������� ����������� ����������.
        public Builder setProcessor(String processor) {
            computer.processor = processor;
            return this;
        }

        public Builder setMemory(String memory) {
            computer.memory = memory;
            return this;
        }

        public Builder setHardDisk(String hardDisk) {
            computer.hardDisk = hardDisk;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            computer.graphicsCard = graphicsCard;
            return this;
        }

        // ����� ��� ���������� ������� "���������".
        public Computer build() {
            return computer;
        }
    }
}
