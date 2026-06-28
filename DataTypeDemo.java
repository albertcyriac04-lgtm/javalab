public class DataTypeDemo {
    public static void main(String[] args) {
        // Variables of different data types
        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 100;
        long longVal = 100000L;
        float floatVal = 25.5f;
        double doubleVal = 123.456;
        char charVal = 'A';
        boolean booleanVal = true;

        // Displaying values matching expected output
        System.out.println("Integer value : " + intVal);
        System.out.println("Long value    : " + longVal);
        System.out.println("Float value   : " + floatVal);
        System.out.println("Double value  : " + doubleVal);
        System.out.println("Character    : " + charVal);
        System.out.println("Boolean      : " + booleanVal);

        // Displaying memory ranges and sizes
        System.out.println("\nMemory Ranges and Sizes of Data Types:");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-10s | %-12s | %-40s\n", "Data Type", "Size (Bits)", "Range");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-10s | %-12d | %d to %d\n", "Byte", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %d to %d\n", "Short", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %d to %d\n", "Integer", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %d to %d\n", "Long", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %e to %e\n", "Float", Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %e to %e\n", "Double", Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("%-10s | %-12d | %d to %d (Unicode values)\n", "Character", Character.SIZE, (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);
        System.out.printf("%-10s | %-12s | true or false\n", "Boolean", "1 (JVM dep)");
        System.out.println("-----------------------------------------------------------------------");
    }
}
