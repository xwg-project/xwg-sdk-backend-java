package com.sdk.security;

import java.util.UUID;

public class TransportSecurity {
	/**
	 * 加密
	 * keyId公钥ID publicKey临时公钥
     */
    public static String encrypt(String data, String publicKey, String keyId)
    {
    	String result = "";
    	try{
    		// 生成 UUID4
        	String nonce = UUID.randomUUID().toString();
        	// 随机生成 32 个字符的 AES 密钥
        	String aesKey = Aes.createKey();
        	// 用 RSA 公钥加密 AES 密钥
        	String encryptedAesKey = Rsa.encrypt(aesKey, publicKey);
        	// 用 AES 密钥加密 「nonce + "." + data」
        	String encryptedData = Aes.encrypt(nonce + '.' + data, aesKey);
        	// 拼接得到最终的密文
        	result = encryptedData + '.' + encryptedAesKey + '.' + keyId;
    	}catch(Exception e){
			e.printStackTrace();
		}
    	return result;
    }

    /**
     * 解密
     */
    public static String decrypt(String data)
    {
//        $array = explode('.', $data);
//        if (count($array) < 3) {
//            throw new \RuntimeException('Unrecognized ciphertext.');
//        }
//        $encryptedData = array_shift($array);
//        $encryptedAesKey = array_shift($array);
//        $keyId = implode('.', $array);
//        $privateKey = $getPrivateKey($keyId);
//        if (empty($privateKey)) {
//            throw new \RuntimeException('Missing private key.');
//        }
//        $aesKey = Rsa::decrypt($encryptedAesKey, $privateKey);
//        $array = explode('.', Aes::decrypt($encryptedData, $aesKey));
//        if (count($array) < 2) {
//            throw new \RuntimeException('Unrecognized data.');
//        }
//        if (!$validateNonce(array_shift($array))) {
//            throw new \RuntimeException('Duplicate request.');
//        }
//        return implode('.', $array);
    	return "";
    }
	
}
