public class Main{
    public static void main(String[] args) {
        int initialBalance =100;
        int addend = 1200;
        int bonus = 0;
        if (addend > 1000)
            bonus = addend / 100;
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("итоговый баланс: " + finalBalance);
        System.out.println("бонус: " + bonus);
    }
}
