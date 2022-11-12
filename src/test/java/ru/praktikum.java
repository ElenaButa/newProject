package ru;

public class praktikum {

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);

        assertEquals("Возраст < 18", true, isAdult);

    }

    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program1 = new Program();
        boolean isAdult = program1.checkIsAdult(17);
        assertEquals("Должно вернуться false, так как пользователь несовершеннолетний", false, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program2 = new Program();
        boolean isAdult = program2.checkIsAdult(18);
        assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
    }

    @RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
    public class CheckIsAdultTest {

        private final int age;
        private final boolean result;

        public CheckIsAdultTest(int age, boolean result) {
            this.age = age; // Инициализируй поля класса в конструкторе
            this.result=result;
        }

        @Parameterized.Parameters  // Пометь метод аннотацией для параметров
        public static Object[][] getTextData() {
            return new Object[][] {
                    {18,true},
                    {17,false},
                    {21,true},
                    {20,false},
            };
        }

        @Test
        public void checkIsAdultWhenAgeThenResult() {
            Program program = new Program();
             // Передай сюда возраст пользователя
            boolean isAdult = program.checkIsAdult(25);
            // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
            assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
        }
    }

}
