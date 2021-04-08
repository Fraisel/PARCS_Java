import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import parcs.*;

public class Square implements AM {
    public void run(AMInfo info) {
        int a = info.parent.readInt();
        int b = info.parent.readInt();
        System.out.println(a + " - " + b + ". Build started.");

        List<Integer> squares = new ArrayList<>();

        for (int n = a; n <= b; n++) {
            squares.add(n);
        }

        System.out.println(a + " - " + b + ". Build finished.");
        info.parent.write(squares.size());
    }
}
