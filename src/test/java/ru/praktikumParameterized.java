package ru;

public class praktikumParameterized {
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
            //int age=program.age;  // Передай сюда возраст пользователя
            boolean isAdult = program.checkIsAdult(25);
            // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
            assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
        }
    }
}
