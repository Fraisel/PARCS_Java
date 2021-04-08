import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;

import parcs.*;

public class Main {
    public static void main(String[] args) throws Exception {
        task curtask = new task();
        curtask.addJarFile("Square.jar");

        AMInfo info = new AMInfo(curtask, null);

        Scanner sc = new Scanner(new File(curtask.findFile("input")));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int step = (b - a + 1) / 10;

        long startTime = System.nanoTime();

//        List<channel> channels = new ArrayList<>();
//
//        for (int i = a; i <= b; i += step) {
//            point p = info.createPoint();
//            channel c = p.createChannel();
//            p.execute("Square");
//            c.write(i);
//            c.write(i + step - 1);
//            channels.add(c);
//        }
//
//        int sum = 0;
//        for (channel c: channels) {
//            sum += c.readInt();
//        }

        point p = info.createPoint();
        channel c = p.createChannel();
        p.execute("Square");
        c.write(a);
        c.write(b);
        int sum = c.readInt();
        
        System.out.println("Waiting for result...");
        System.out.println("Result: " + sum);

        double totalTime = (double) (System.nanoTime() - startTime) / 1000000000;
        System.out.println("Execution time: " + totalTime);

        curtask.end();
    }
}
