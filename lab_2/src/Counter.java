import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
Counter - класс подсчета букв
counter - массив частоты встречаемости символа
input - файл чтения
output - файл вывода
 */
public class Counter {
    int counter[]=new int[150];
    FileReader input;
    FileWriter output;
    /*
    Конструктор класса с двумя параметрами
     */
    Counter(String in,String out){
        try {
            input = new FileReader(in);
            output = new FileWriter(out,false);
        }catch (IOException e){
            System.out.println("Error!");
            System.exit(1);
        }
        for(int i=0;i<150;++i){counter[i]=0;}
    }
    /*
    run() - функция подсчета встречаемости
    */
    boolean run(){
        int c;
        try {
            while ((c = input.read()) != -1) {
                ++counter[c];
            }
        } catch(IOException ex){
            System.exit(1);
        }
        try {
            for(int j=0;j<150;++j){
                if(counter[j]!=0){
                   if((char) j!='\n'){output.append((char) j);}
                   else{output.append("\\n");}
                    output.append(" = ");
                    output.append(Integer.toString(counter[j]));
                    output.append('\n');
                }
            }
            output.flush();
            output.close();
        } catch(IOException ex){
            System.exit(1);
        }
        return true;
    };
}
