class SampleString {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "456";

        // Using equals() method
        boolean isEqual = str1.equals(str2);

        if(isEqual) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}
