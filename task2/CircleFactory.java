package oopSeminar7.task2;

// Шаг 4: Создание конкретных фабрик для каждой фигуры.
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        System.out.println("Здесь может быть какая-то логика");
        return new Circle();
    }
}
