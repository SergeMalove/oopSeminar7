package oopSeminar7.task1;

public class Main {
    public static void main(String[] args) {
        // ��������� ������������� ���������� Singleton.
        Singleton singleton = Singleton.getInstance();
        // Singleton singleton1 = new Singleton();
        Singleton singleton2 = Singleton.getInstance();

        // ����� ������ ������� Singleton.
        singleton.someMethod();

        System.out.println(singleton);
        System.out.println(singleton2);

        // ������� ������� ��� ���� ��������� Singleton.
        // ���� ��� ������� ������ ����������, ��� ��� ����������� Singleton ���������.
        // Singleton anotherInstance = new Singleton();
    }
}
