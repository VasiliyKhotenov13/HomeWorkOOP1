public class Main {
    public static void main(String[] args) {

        People people1 = new People("Максим", 1988, "Минск", "бренд-менеджер");
        People people2 = new People("Аня", 1993, "Москва", "методист образовательных программ");
        People people3 = new People("Катя", 1992, "Калининград", "продакт-менеджер");
        People people4 = new People("Артём", 1995, "Москва", "директор по развитию бизнеса");

        System.out.println(people4.toString());
    }
}