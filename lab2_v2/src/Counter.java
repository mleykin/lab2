//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Counter {
    int[] counter = new int[256];
    FileReader input;
    FileWriter output;

    Counter(String in, String out) {
        try {
            this.input = new FileReader(in);
            this.output = new FileWriter(out, false);
        } catch (IOException var4) {
            System.out.println("Error!");
            System.exit(1);
        }

        for(int i = 0; i < 256; ++i) {
            this.counter[i] = 0;      //не нужно в Java, там и так нули
        }

    }

    boolean run() {
        while(true) {
            try {
                int c;
                if ((c = this.input.read()) != -1) {
                    int var10002 = this.counter[c]++;    //зачем нужна эта переменная если она нгде не используется?
                    continue;
                }
            } catch (IOException var3) {
                System.exit(1);       //плохой способ выхода из цикла, достаточно было бы return;
            }

            try {
                for(int j = 0; j < 256; ++j) {
                    if (this.counter[j] != 0) {
                        if ((char)j != '\n') {
                            this.output.append((char)j+" = "+Integer.toString(this.counter[j])+'\n');
                        } else {
                            this.output.append("\\n"+" = "+Integer.toString(this.counter[j])+'\n');
                        }
                    }
                }
                this.output.flush();
                this.output.close();
            } catch (IOException var4) {
                System.exit(1);
            }

            return true;
        }
    }
}
