public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int depositAmount = 1100;
        int bonus;

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый бонус:" + bonus);

        System.out.println("Итоговая сумма:" + (initialAmount + bonus + depositAmount));

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}

