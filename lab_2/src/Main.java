
import java.util.Scanner;
import java.lang.String;
import java.lang.Object;
import java.io.*;
public class Main {
    public static void main(String[] args) {
/*
      path1-входной файл с текстом
      path2-выходной файл с количеством букв
*/

    String path1,path2;
/*
Создание сканера in для чтения путей
*/
    Scanner in = new Scanner(System.in);
/*
Чтение путя до 1го файла
*/
    System.out.print("Укажите путь к первому файлу: ");
    path1=in.nextLine();
/*
Чтение путя до 2го файла
*/
    System.out.print("Укажите путь ко второму файлу: ");
    path2=in.nextLine();
/*
Создание класса для подсчета букв
*/
    Counter count=new Counter(path1,path2);
/*
функция run() - подсчитывает буквы и выводит в другой файл
*/
    count.run();
    }
}
