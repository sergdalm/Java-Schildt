// Use the built-in enumeration methods.

// An enumeration of Transport varieties.
enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo2 {
    public static void main(String args[]) {
        Transport tp;

        System.out.println("Here are all Transport constants");

        // use values()
        Transport allTransports[] = Transport.values();
        for(Transport t : allTransports)
            System.out.print(t + " ");

        System.out.println();

        // use values() whtiout array
        for(Transport t : Transport.values())
            System.out.print(t + " ");

        System.out.println();

        // use valuesOf()
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);

        tp = Transport.TRUCK;
        System.out.println("tp contains " + tp);

    }
}
