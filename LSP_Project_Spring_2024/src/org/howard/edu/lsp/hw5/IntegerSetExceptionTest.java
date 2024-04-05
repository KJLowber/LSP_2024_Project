package org.howard.edu.lsp.hw5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetExceptionTest {

    @Test
    @DisplayName("Test case for IntegerSetException message")
    public void testExceptionMessage() {
        String errorMessage = "Error";
        IntegerSetException exception = new IntegerSetException(errorMessage);
        assertEquals(errorMessage, exception.getMessage());
    }
}