import java.util.Collections;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        if(num < 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }

        return Integer.parseInt(
                String.valueOf(num)
                        .chars()
                        .mapToObj(e -> (char) e)
                        .sorted(Collections.reverseOrder())
                        .map(String::valueOf)
                        .collect(Collectors.joining())
        );
    }
}
