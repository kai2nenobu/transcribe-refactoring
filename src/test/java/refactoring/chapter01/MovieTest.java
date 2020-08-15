package refactoring.chapter01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    public void illegal_price_code() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
                () -> new Movie("Dummy", -1));
        assertEquals(thrown.getMessage(), "不正な料金コード");
    }

}