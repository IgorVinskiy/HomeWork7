public class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int l = 0;
        while (total < 2459000) {
            total = total + salary;
            l = l + 1;
            System.out.println("месяц " + l + " итого " + total);
        }
        {
            System.out.println("Задача 2");
        }
        int k = 1;
        while (k <= 10) {
            System.out.print(k + " ");
            k++;
        }
        {
            System.out.println();
        }
        int j = 10;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }
        {
            System.out.println();
        }
        {
            System.out.println("Задача 3");
        }
        int populationCity = 12_000_000;
        int positivePopulation1000 = 17;
        int negativePopulation1000 = 8;
        int plusPopulationYear = ((populationCity / 1000) * (positivePopulation1000 - negativePopulation1000)) * 12;
        int year = 2022;
        for (int i = 0; i <= 10; i++) {
            year = year + 1;
            populationCity = populationCity + plusPopulationYear;
            System.out.println("Год " + year + " численность населения составляет-" + populationCity + " человек");
        }
        {
            System.out.println("Задача 4");
        }
        int salary1 = 15000;
        int total1 = 0;
        int g = 0;
        while (total1 < 12_000_000) {
            total1 = total1 + ((total1 / 100) * 7);
            total1 = total1 + salary1;
            g++;
            System.out.println("месяц" + g + "  итого " + total1);
        }
        {
            System.out.println("Задача 5");
        }
        int salary12 = 15000;
        int total12 = 0;
        int p = 1;
        for (; total12 < 12_000_000; p++) {
            total12 = total12 + ((total12 / 100) * 7);
            total12 = total12 + salary12;
            if (p % 6 == 0 || p == 1) {
                System.out.println("месяц" + p + "  итого " + total12);
            }
        }
        {
            System.out.println("Задача 6");
        }
        int salary2 = 15000;
        int total2 = 0;
        for (int o = 1; o <= 108; o++) {
            total2 = total2 + ((total2 / 100) * 7);
            total2 = total2 + salary2;
            if (o % 6 == 0 || o == 1) {
                System.out.println("месяц " + o + " итого " + total2);
            }
        }
        {
            System.out.println("Задача 7");
        }
        int fridayControl = 7;
        for (; fridayControl <= 31; fridayControl = fridayControl + 7) {
            System.out.println("Сегодня " + fridayControl + "-е число.Нужно сдать отчет");
        }
        {
            System.out.println("Задача 8");
        }
        for (int dateComet = 1896; dateComet > 1825 && dateComet < 2125; dateComet = dateComet + 79) {
            System.out.println("КОМЕТА "  + dateComet);
        }
    }
}

