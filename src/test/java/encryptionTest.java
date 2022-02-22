import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class encryptionTest {
    @Test
    public void testEncryptWithShift1(){
        int key = 1;
        String message = "H";
        String expectedResultMessage = "i";
        encryption encrypt = new encryption();
        String actualResultMessage = encrypt.runEncryption(message, key);

        assertEquals(expectedResultMessage, actualResultMessage);

    }

}