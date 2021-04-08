import java.util.ArrayList;
import java.util.List;

import parcs.*;

public class Square implements AM {
    public void run(AMInfo info) {
        int a = info.parent.readInt();
        int b = info.parent.readInt();
        System.out.println(a + " - " + b + ". Build started.");

        List<Integer> squares = new ArrayList<>();

        for (int n = a; n <= b; n++) {
            for (int k = 1; k <= n / 2 + 1; k++) {
                if (k * k == n) {
                    squares.add(k);
                }
            }
        }

        System.out.println(a + " - " + b + ". Build finished. Returning " + squares.size());
        info.parent.write(squares.size());
    }
}
