class SimplePrinter implements Document {
    @Override
    public void print() {
        // Print the document
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        // Not applicable for SimplePrinter
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax() {
        // Not applicable for SimplePrinter
        throw new UnsupportedOperationException("Fax not supported");
    }
}
