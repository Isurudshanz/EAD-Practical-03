class GoodShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Rectangle(), new Square() };

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
