public class Main {
    public static void main(String[] args) {
        /*Первое задание*/
        int i = 1;

        while (i <= 10){
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();
        for(int j = 10; j >= 1; j--)
        {
            System.out.print(j + " ");
        }
        System.out.println();

        /*Второе задание*/
        int firstFriday = 4;

        for(; firstFriday <= 31; firstFriday += 7)
        {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число, за работу, бездельник, нужен отчет!");
        }

        /*Третье задание*/
        int yearNow = 2022;
        int year = yearNow - 200;
        while (year <= (yearNow + 100)) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
            year++;
        }
    }
}