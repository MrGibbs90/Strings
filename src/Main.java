public class Main {
    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + fullName);
    }

    public static void task3() {
        String fullName = "Семён Семёнович Иванов";
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника - " + fullName);
    }
    }