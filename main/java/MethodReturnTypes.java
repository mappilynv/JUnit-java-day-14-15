public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(stringMethod());
        System.out.println(intMethod());
        System.out.println(booleanMethod());
    }

    public static String stringMethod() {
        return "String of text";
    }

    public static int intMethod() {
        return 5;
    }

    public static boolean booleanMethod() {
        return false;
    }
}
