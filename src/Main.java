import java.util.Scanner;

/**
 * Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас DocumentWorker.
 * У тілі класу створіть три методи openDocument(), editDocument(), saveDocument().
 * У тілі кожного з методів додайте виведення на екран відповідних рядків: "Документ відкритий", "Правка документа доступна у версії Про", "Збереження документа доступне у версії Про".
 * Створіть похідний клас ProDocumentWorker.
 * Перевизначте відповідні методи, при перевизначенні методів виводьте наступні рядки: "Документ відредаговано", "Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт".
 * Створіть похідний клас ExpertDocumentWorker від базового класу ProDocumentWorker. Перевизначте відповідний метод. При викликі даного методу необхідно виводити на екран документ збережений в новому форматі.
 * У тілі методу main() реалізуйте можливість прийому від користувача номер ключа доступу pro і exp. Якщо користувач не вводить ключ, він може користуватися тільки безкоштовною версією (створюється екземпляр базового класу),
 * якщо користувач ввів номери ключа доступу pro і exp, то повинен створити екземпляр відповідної версії класу, наведений до базового – DocumentWorker.
 */


public class Main {
    static Scanner inputAccessKey = new Scanner(System.in);
    private static final String ACCESS_KEY_VERSION_PRO = "2222";
    private static final String ACCESS_KEY_VERSION_EXPERT = "1111";


    public static void main(String[] args) {
        System.out.println("Access key for pro version of the document worker: " + ACCESS_KEY_VERSION_PRO);
        System.out.println("Access key for expert version of the document worker: " + ACCESS_KEY_VERSION_EXPERT);
        System.out.println("Access key for base version of the document worker: " + "missing");
        System.out.print("Please enter one of the access keys for the required version. if you want to use the base version press enter ");

        switch (inputAccessKey.nextLine()) {
            case ACCESS_KEY_VERSION_PRO:
                ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                break;
            case ACCESS_KEY_VERSION_EXPERT:
                ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                break;
            case "":
                DocumentWorker documentWorker = new DocumentWorker();
                break;
            default:
                System.out.println("You enter wrong access key");
        }
        inputAccessKey.close();





    }

}
