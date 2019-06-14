package com.company;

import java.io.*;

public class FileManipulation {

    public static void copy(String filename, String way) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            FileOutputStream fileOutputStream = new FileOutputStream(way);
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("Файл скопирован");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден. Проверьте путь к файлу.");
        } catch (IOException e) {
            System.out.println("Файл не скопирован.");
        }
    }

    public static void move(String filename, String way) {
        File file = new File(filename);
        File newFile = new File(way);
        file.renameTo(newFile);
        System.out.println("Файл перемещен.");
    }

    public static void delete(String filename) {
        File file = new File(filename);
        file.delete();
        System.out.println("Файл удален");
    }
}
