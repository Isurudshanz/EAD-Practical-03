class BadDocumentDemo {
    public static void main(String[] args) {
        Document d = new SimplePrinter();
        d.print();

        // d.scan(); // would throw UnsupportedOperationException
    }
}
