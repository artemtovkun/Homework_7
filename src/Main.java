public class Main {
    public static void main(String[] args){
        //Задача 1
        int iCounter = 0;
        float total3 = 0;
        while (total3 <= 2_459_000) {
            total3 = total3 + 15_000;
            total3 = total3 + total3 / 100;
            iCounter++;
            System.out.println("Месяц - " + iCounter + ". Накопления c % = " + total3 + " руб.");
        }
        //Задача 2
        int c = 1;
        while (c <= 10) {
            System.out.print(c + " ");
            c++;
        }
        System.out.println();
        for (int d = 10; d > 0; d = d - 1) {
            System.out.print(d + " ");
        }
        //Задача 3
        int birthRate = 17;
        int mortalityRate = 8;
        int initialPopulation = 12_000_000;
        for (int year = 1; year <= 10; year = year + 1) {
            int births = birthRate * initialPopulation / 1000;
            int deaths = mortalityRate * initialPopulation / 1000;
            int growth = births - deaths;
            initialPopulation += growth;
            System.out.println("Год " + year + " , численность населения составляет " + initialPopulation);
        }
        //Задача 4
        double deposit = 15_000;
        double targetAmount = 12_000_000;
        double currentAmount = deposit;
        int month = 0;
        while (currentAmount < targetAmount) {
            month++;
            currentAmount *= 1.07;
            System.out.printf("Месяц %d: сумма накоплений составляет %.2f рублей%n ", month, currentAmount);
        }
        System.out.printf("Через %d месяцев Василий накопит %.2f рублей", month, currentAmount);

        //Задача 5
        double deposit1 = 15_000;
        double targetAmount1 = 12_000_000;
        double currentAmount1 = deposit1;
        int month1 = 0;
        while (currentAmount1 < targetAmount1) {
            month1++;
            currentAmount1 *= 1.07;
            if (month1 % 6 == 0) {
                System.out.printf("Месяц № %d: %.2f\n", month1, currentAmount1);
            }
        }
        System.out.printf("Через %d месяцев Василий накопит %.2f рублей", month1, currentAmount1);
        //Задача 6
        double deposit2 = 15_000;
        int month2 = 108;
        for (int aa = 1; aa <= month2; aa++) {
            deposit2 *= 1.07;
            if (aa % 6 == 0) {
                System.out.printf("Месяц № %d: текущая сумма накоплений %.2f\n", aa, deposit2);
            }
        }
        //Задача 7
        int friday1 = 5;
        int daysInMonth = 31;
        for (int i = friday1; i <= daysInMonth; i += 7) {
            System.out.println("Сегодня пятница, " +i+ "-е число. Нужно приготовить отчет");
        }
        //Задача 8
        int ourYear = 2026;
        int twoHundredYearBefore = ourYear - 200;
        int oneHundredYearAfter = ourYear + 100;
        int cometAppearance = 0;
        int cometAppearanceRate = 79;
        while (cometAppearance < oneHundredYearAfter) {
            if (cometAppearance > twoHundredYearBefore) {
                System.out.println(cometAppearance);
            }
            cometAppearance += cometAppearanceRate;
        }

    }

}
