public class Main {
    public static void main(String[] args) {

        int priseTicket = 500; // Стоимость билета
        int condition = 20; // сколько рублей за 1 милю
        if (priseTicket >= condition) {
            int mile;
            System.out.println(mile = priseTicket / condition);
        } else {
            System.out.println("Мили не зачислены, по условиям бонусной программы.");
        }
    }
}