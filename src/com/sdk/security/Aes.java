package com.sdk.security;

import java.util.Random;

public class Aes
{
	public static String METHOD = "AES-256-CBC";
    public static String HASH_ALG = "sha256";
    public static int KEY_SIZE = 32;
    
    public static CryptLib cryptLib;
    
    public static String createKey(){
    	String key = "";
    	Random random = new Random();
    	for(int i=0,lengthI = Aes.KEY_SIZE;i<lengthI;i++){
    		int randInt = random.nextInt(126-33+1)+33;
    		key += String.valueOf(Character.toString ((char) randInt));
    	}
    	return key;
    }
    
    
    
    public static String encrypt(String plainText, String key) {
    	String result = "";
    	try{
    		if(Aes.cryptLib==null){
        		Aes.cryptLib = new CryptLib();
        	}
    		result = Aes.cryptLib.encryptPlainTextWithRandomIV(plainText, key);
    	}catch(Exception e){
			e.printStackTrace();
		}
    	return result;
    }
}
