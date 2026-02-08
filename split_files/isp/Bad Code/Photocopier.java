class Photocopier implements Document {
    @Override
    public void print() {
        // Print the document
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        // Scan the document
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        // Fax the document
        System.out.println("Faxing...");
    }
}
