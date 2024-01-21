package oopSeminar7.task3;

public class Main {
    public static void main(String[] args) {
        // ���������� ��������� ��� ���������� �������� ������� "���������".
        Computer computer = new Computer.Builder()
                .setProcessor("Intel Core i7")
                .setMemory("16GB DDR4")
                .setHardDisk("512GB SSD")
                .setGraphicsCard("NVIDIA GeForce RTX 3070")
                .build();

        // ������� ���������� � ����������.
        System.out.println("���������: " + computer.getProcessor());
        System.out.println("����������� ������: " + computer.getMemory());
        System.out.println("������� ����: " + computer.getHardDisk());
        System.out.println("����������� �����: " + computer.getGraphicsCard());
    }
}
