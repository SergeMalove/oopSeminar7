package oopSeminar7.task2;

// ��� 4: �������� ���������� ������ ��� ������ ������.
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        System.out.println("����� ����� ���� �����-�� ������");
        return new Circle();
    }
}
