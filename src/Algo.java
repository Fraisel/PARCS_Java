import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import parcs.*;

public class Algo implements AM {
    public void run(AMInfo info) {
//        int a = info.parent.readInt();
//        int b = info.parent.readInt();
//        System.out.println(a + " - " + b + ". Build started.");
//
//        List<Integer> squares = new ArrayList<>();
//
//        IntStream.range(a, b).forEachOrdered(n -> {
//            IntStream.range(1, n / 2 + 1).forEachOrdered(k -> {
//                if (k * k == n) {
//                    squares.add(k);
//                }
//            });
//        });
//
//        System.out.println(a + " - " + b + ". Build finished.");
        info.parent.write(1);
    }
}
