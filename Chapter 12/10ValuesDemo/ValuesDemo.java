enum Tools {
    CREWDRIVER, WRENCH, HAMMER, PLIERS
}

class ValuesDemo {
    public static void main(String args[]) {
        for(Tools t: Tools.values())
            System.out.println(t + " has ordinal value of " + t.ordinal() + '\n');
    }
}