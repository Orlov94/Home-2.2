public class Main {
    public static void main(String[] args) {

        // входные данные
        int originalBalance = 100;
        int amount = 1100;
        int bonus = amount / 100;
        boolean payment = true;

        //логика

        int percent = payment ? 1 : 0;

       if (amount >= 1000){
           int balanceWithBonuses = originalBalance + amount +bonus;
           System.out.println("Ваш баланс " + balanceWithBonuses);
       } else {
           int blanceNoBonuses  = originalBalance + amount;
           System.out.println("Ваш баланс " + blanceNoBonuses );

       }
    }
}

