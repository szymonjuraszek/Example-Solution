import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DescendingOrderTest {

    @Test
    void numberBelowZeroShouldThrowIllegalArgumentException() {

        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            DescendingOrder.sortDesc(-10);
        });

        assertEquals(exception.getMessage(), "Number must be greater than 0");
    }

    @Test
    void numberEqualZeroShouldReturnZero() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    void sortDescExample1() {
        assertEquals(54421, DescendingOrder.sortDesc(42145));
    }

    @Test
    void sortDescExample2() {
        assertEquals(654321, DescendingOrder.sortDesc(145263 ));
    }

    @Test
    void sortDescExample3() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    @Test
    void numberWithTheSameValuesShouldReturnThisNumber() {
        assertEquals(9999, DescendingOrder.sortDesc(9999));
    }

    @Test
    void theBiggestNumberFromValuesShouldReturnThisNumber() {
        assertEquals(987654, DescendingOrder.sortDesc(987654));
    }
}
