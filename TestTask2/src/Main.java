public class Main {
    public static void main(String[] args) {
        String str = "I must find the job";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nСтрока до реверса: " + str);
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
    }
}