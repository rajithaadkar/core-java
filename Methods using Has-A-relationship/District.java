class District {
    static void run() {
        System.out.println("District administration running");
        taxing();
    }

    static void taxing() {
        System.out.println(" Calculating tax");
        measure();
    }

    static void measure() {
        System.out.println("Measuring taxable amount");
        collect();
    }

    static void collect() {
        System.out.println("Collecting tax");
        revenue();
    }

    static void revenue() {
        System.out.println("Recording revenue");
        budget();
    }

    static void budget() {
        System.out.println("Preparing budget");
    }
}

