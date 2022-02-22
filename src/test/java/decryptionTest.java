import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class decryptionTest {
    @Test
    public void testEncryptWithShift1(){
        int key = 1;
        String message = "H";
        String expectedResultMessage = "g";
        decryption decrypt = new decryption();
        String actualResultMessage = decrypt.runDecryption(message, key);

        assertEquals(expectedResultMessage, actualResultMessage);

    }

}