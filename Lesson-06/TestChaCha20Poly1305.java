package Demo;

import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class TestChaCha20Poly1305 {
	private static final int NONCE_LEN = 12;
	private static final int MAC_LEN = 16;
	
	public static void main(String[] args) throws Exception {
		String input = "ChaCha20Poly1305 Program Demonstration";
		
		ChaCha20Poly1305 cipher = new ChaCha20Poly1305();
		
		SecretKey key = getKey();
		
		System.out.println("Input: "+ input);
		System.out.println("Input(hex): " + convertBytesToHex(input.getBytes()));
		
		System.out.println("\nEncryption");
		byte[] cText = cipher.encrypt(input.getBytes(), key);
		System.out.println("Key(hex): "+ convertBytesToHex(key.getEncoded()));
		System.out.println("Encrypted(hex): " + convertBytesToHex(cText));
		
		System.out.println("\nPrint Mac and Nonce");
		ByteBuffer bb = ByteBuffer.wrap(cText);
		
		byte[] originalCText = new byte[input.getBytes().length];
		byte[] nonce = new byte[NONCE_LEN];
		byte[] mac = new byte[MAC_LEN];
		
		bb.get(originalCText);
		bb.get(mac);
		bb.get(nonce);
		
		System.out.println("Cipher (original)(hex): "+ convertBytesToHex(originalCText));
		System.out.println("MAC(hex): "+convertBytesToHex(mac));
		System.out.println("Nonce(hex): "+convertBytesToHex(nonce));
		
		System.out.println("\nDecryption");
		System.out.println("Input(hex): "+convertBytesToHex(cText));
		
		byte[] pText = cipher.decrypt(cText, key);
		System.out.println("Key(Hex): "+ convertBytesToHex(key.getEncoded()));
		System.out.println("Decrypted(hex): "+convertBytesToHex(pText));
		System.out.println("Decrypted: "+ new String(pText));
		
	}

	private static SecretKey getKey() throws NoSuchAlgorithmException{
		// TODO Auto-generated method stub
		KeyGenerator keyGen = KeyGenerator.getInstance("ChaCha20");
		keyGen.init(256, SecureRandom.getInstanceStrong());
		
		return keyGen.generateKey();
	}

	private static String convertBytesToHex(byte[] bytes) {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		
		for(byte temp: bytes) {
			result.append(String.format("%02x", temp));
		}
		return result.toString();
	}

}
