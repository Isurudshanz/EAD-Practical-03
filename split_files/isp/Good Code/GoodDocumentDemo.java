class GoodDocumentDemo {
    public static void main(String[] args) {
        Printer p = new SimplePrinter();
        p.print();

        Photocopier multi = new Photocopier();
        multi.print();
        multi.scan();
        multi.fax();
    }
}
