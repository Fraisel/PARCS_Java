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
        System.out.println(a);
        System.out.println(b);

        point p = info.createPoint();
        channel c = p.createChannel();
        p.execute("Square");
        c.write(a);
        c.write(b);

        System.out.println("Waiting for result...");
        System.out.println("Result: " + c.readInt());
        curtask.end();
    }
}
