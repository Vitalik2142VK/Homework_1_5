public class Main
{
    public static void Task1()
    {
        System.out.println("Task1: ");
        for (int i = 1; i < 11; i++)
        {
            System.out.println(i + " ");
        }
        System.out.println("##########");
    }

    public static void Task2()
    {
        System.out.println("Task2: ");
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i + " ");
        }
        System.out.println("##########");
    }

    public static void Task3()
    {
        System.out.println("Task3: ");
        for (int i = 0; i < 18; i++)
        {
            if (i % 2 == 0 && i != 0)
                System.out.println(i);
        }
        System.out.println("##########");
    }

    public static void Task4()
    {
        System.out.println("Task4: ");
        for (int i = -10; i < 11; i++)
        {
            System.out.println(i);
        }
        System.out.println("##########");
    }

    public static void Task5()
    {
        System.out.println("Task5: ");
        for(int i = 1904; i < 2097; i += 4)
        {
            System.out.println(i + " год является високосным.");
        }
        System.out.println("##########");
    }

    public static void Task6()
    {
        System.out.println("Task6: ");
        for (int i = 1; i < 15; i++)
        {
            System.out.println(7 * i);
        }
        System.out.println("##########");
    }

    public static void Task7()
    {
        System.out.println("Task7: ");
        int num = 1;
        for (int i = 0; num < 512; i++)
        {
            num *= 2;
            System.out.println(num);
        }
        System.out.println("##########");
    }

    public static void Task8()
    {
        System.out.println("Task8: ");
        int savings = 0;
        for (int i = 1; i < 13; i++)
        {
            savings += 29000;
            System.out.println("Месяц "+ i + ", сумма накоплений равна " + savings + " рублей.");
        }
        System.out.println("##########");
    }

    public static void Task9()
    {
        System.out.println("Task9: ");
        int savings = 0;
        for (int i = 1; i < 13; i++)
        {
            savings += 29000;
            savings += savings/100;
            System.out.println("Месяц "+ i + ", сумма накоплений равна " + savings + " рублей.");
        }
        System.out.println("##########");
    }

    public static void Task10()
    {
        System.out.println("Task10: ");
        for(int i = 1; i < 11; i++)
        {
            System.out.println("2*" + i + "=" + 2*i);
        }
        System.out.println("##########");
    }

    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
    }
}