package src.java.com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Выберите действие: \n 1 - копировать; \n 2 - переместить; \n 3 - удалить. ");
        int menu = scanner.nextInt();
        System.out.println("Укажите файл");
        System.out.println(", пожалуйста");
        String fileName = scanner.next();
        switch (menu) {
            case 1:
                System.out.println("Укажите путь");
                String way = scanner.next();
                FileManipulation.copy(fileName, way);
                break;
            case 2:
                System.out.println("Укажите путь");
                String wayForMoving = scanner.next();
                FileManipulation.move(fileName, wayForMoving);
                break;
            case 3:
                FileManipulation.delete(fileName);
        }
    }
}
