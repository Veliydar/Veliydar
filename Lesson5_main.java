public class Lesson5_main
{
        public static void main(String[] args)
        {
            Employee[] employee = new Employee[5];
            employee[0] =
                    new Employee(
                            "Ivanov Ivan Ivanovich",
                            "Programmer",
                            "Fitstmail@mail.ru",
                            "+7-111-111-11-11",
                            60000,
                            27);

            employee[1] =
                    new Employee(
                            "Pashkova Sofia Pavlovna",
                            "Programmer",
                            "Secondmail@mail.ru",
                            "+7-222-222-22-22",
                            50000,
                            25);

            employee[2] =
                    new Employee(
                            "Petrov Petr Petrovich",
                            "Programmer",
                            "Thirdmail@mail.ru",
                            "+7-333-333-33-33",
                            85000,
                            36);

            employee[3] =
                    new Employee(
                            "Olegov Oleg Olegovich",
                            "system-administrator",
                            "Fourmail@mail.ru",
                            "+7-444-444-44-44",
                            100000,
                            41);

            employee[4] =
                    new Employee(
                            "Semionov Andrey Evgenievich",
                            "project curator",
                            "Fivemail@mail.ru",
                            "+7-555-555-55-55",
                            120000,
                            43);

            for (int i = 0; i < employee.length; i++)
            {
                if (employee[i].getAge() > 40)
                {
                    employee[i].outputInfo();
                }
            }
        }
}
