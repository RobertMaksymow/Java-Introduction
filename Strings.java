public class Strings {
    public static void main(String[] args) {
        String message = "Hello " + "World" + "!!";
        message = message.toUpperCase();
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("W")); // -1 if doesn't include
        System.out.println(message.replace("!", "$")); //does not modify origian string
        System.out.println(message.trim()); // removes white spaces from start/end of the string
        System.out.println("Hello \"Max\""); // Escape sequence for ""
        System.out.println("C:\\Windows\\System32\\..."); // Escape sequence for ""
        System.out.println("C:\nWindows\\System32\\..."); // Escape sequence for "" - breaks line \n
        System.out.println("C:\tWindows\\System32\\..."); // Escape sequence for "" - tab \t
    }
}
