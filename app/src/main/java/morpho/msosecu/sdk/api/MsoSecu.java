package morpho.msosecu.sdk.api;

import com.morpho.morphosmart.sdk.IMsoSecu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MsoSecu implements MsoSecuConstants, IMsoSecu {
    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int getHostCertif(ArrayList<Byte> hostCertificate) {
        return MsoSecuJNI.getHostCertif(hostCertificate);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int genRandom(byte[] randomData) {
        return MsoSecuJNI.genRandom(randomData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int tunnelingInit1(byte[] tokenMso, byte[] msoCertificate, byte[] msoHash, byte[] hostHash, ArrayList<Byte> tokenHostMso) {
        return MsoSecuJNI.tunnelingInit1(tokenMso, msoCertificate, msoHash, hostHash, tokenHostMso);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int tunnelingInit2(byte[] tokenMso) {
        return MsoSecuJNI.tunnelingInit2(tokenMso);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int tripleDesSign(byte[] tripleDesDataToSign, ArrayList<Byte> tripleDesSignature) {
        return MsoSecuJNI.tripleDesSign(tripleDesDataToSign, tripleDesSignature);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int tripleDesCrypt(byte[] tripleDesClearData, ArrayList<Byte> tripleDesCryptData) {
        return MsoSecuJNI.tripleDesCrypt(tripleDesClearData, tripleDesCryptData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int aes256GcmCrypt(byte[] aes256gcmClearData, ArrayList<Byte> aes256gcmCryptData) {
        return MsoSecuJNI.aes256GcmCrypt(aes256gcmClearData, aes256gcmCryptData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int aes256GcmCryptByKey(byte[] cipherKey, byte[] clearData, ArrayList<Byte> cryptData) {
        return MsoSecuJNI.aes256GcmCryptByKey(cipherKey, clearData, cryptData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int aes256GcmDecrypt(byte[] aes256gcmCryptData, ArrayList<Byte> aes256gcmClearData) {
        return MsoSecuJNI.aes256GcmDecrypt(aes256gcmCryptData, aes256gcmClearData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int aes256GcmDecryptByKey(byte[] cipherKey, byte[] cryptData, ArrayList<Byte> clearData) {
        return MsoSecuJNI.aes256GcmDecryptByKey(cipherKey, cryptData, clearData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int tripleDesVerifSign(byte[] tripleDesDataToVerifSign, byte[] tripleDesDataSignature, boolean[] tripleDesSignVerifResult) {
        return MsoSecuJNI.tripleDesVerifSign(tripleDesDataToVerifSign, tripleDesDataSignature, tripleDesSignVerifResult);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int tripleDesDecrypt(byte[] tripleDesCryptData, ArrayList<Byte> tripleDesClearData) {
        return MsoSecuJNI.tripleDesDecrypt(tripleDesCryptData, tripleDesClearData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int verifOfferedSecuritySignature(byte[] msoCertificate, byte[] signature, byte[] dataToVerifSign, int[] signVerifResult) {
        return MsoSecuJNI.verifOfferedSecuritySignature(msoCertificate, signature, dataToVerifSign, signVerifResult);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int verifSignRSA_Advanced(int shaAlgo, byte[] msoCertificate, byte[] signature, byte[] dataToVerifSign, int[] signVerifResult) {
        return MsoSecuJNI.verifSignRSA_Advanced(shaAlgo, msoCertificate, signature, dataToVerifSign, signVerifResult);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int verifSignRSA(byte[] msoCertificate, byte[] signature, byte[] dataToVerifSign, int[] signVerifResult) {
        return MsoSecuJNI.verifSignRSA(msoCertificate, signature, dataToVerifSign, signVerifResult);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int verifSignDSA(byte[] msoCertificate, byte[] signature, byte[] dataToVerifSign, int[] signVerifResult) {
        return MsoSecuJNI.verifSignDSA(msoCertificate, signature, dataToVerifSign, signVerifResult);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int verifCertif(byte[] certificate, int[] certVerifResult) {
        return MsoSecuJNI.verifCertif(certificate, certVerifResult);
    }

    public int MSOSECU_TripleDesCryptByKey_cbc(byte[] i_str_3desKey, byte[] tripleDesClearData, byte[] o_puc_3desCryptDataByKey) {
        return MsoSecuJNI.MSOSECU_TripleDesCryptByKey_cbc(i_str_3desKey, tripleDesClearData, o_puc_3desCryptDataByKey);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int rsaEncrypt(byte[] certificate, byte[] rsaClearData, ArrayList<Byte> rsaCryptData) {
        return MsoSecuJNI.rsaEncrypt(certificate, rsaClearData, rsaCryptData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int rsaEncryptPublicKey(byte[] publickey, byte[] data, ArrayList<Byte> rsaCryptData) {
        return MsoSecuJNI.rsaEncryptPublicKey(publickey, data, rsaCryptData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int caDecryptRSA(String caKeyPassphrase, byte[] rsaCryptoData, ArrayList<Byte> rsaClearData) {
        return MsoSecuJNI.caDecryptRSA(caKeyPassphrase, rsaCryptoData, rsaClearData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int signRSA(byte[] key, byte[] rsaDataToSign, ArrayList<Byte> rsaSignature) {
        return MsoSecuJNI.signRSA(key, rsaDataToSign, rsaSignature);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int signRSAadvanced(int shaAlgo, byte[] key, byte[] rsaDataToSign, ArrayList<Byte> rsaSignature) {
        return MsoSecuJNI.signRSAadvanced(shaAlgo, key, rsaDataToSign, rsaSignature);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int setOpenSSLPath(String openSSLPath) {
        return MsoSecuJNI.setOpenSSLPath(openSSLPath);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int encryptAes128Cbc(byte[] key, byte[] aes128CbcClearData, byte[] iv, boolean usePadding, ArrayList<Byte> aes128CbcCryptedData) {
        return MsoSecuJNI.encryptAes128Cbc(key, aes128CbcClearData, iv, usePadding, aes128CbcCryptedData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int encryptAes256Cbc(byte[] key, byte[] aes256CbcClearData, byte[] iv, boolean usePadding, ArrayList<Byte> aes256CbcCryptedData) {
        return MsoSecuJNI.encryptAes256Cbc(key, aes256CbcClearData, iv, usePadding, aes256CbcCryptedData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int encryptAesCbc(byte[] key, byte[] aesCbcClearData, byte[] iv, boolean usePadding, ArrayList<Byte> aesCbcCryptedData) {
        return MsoSecuJNI.encryptAesCbc(key, aesCbcClearData, iv, usePadding, aesCbcCryptedData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int verifCertByIssuer(byte[] certificate, byte[] issuerCertif, int[] certVerifResult) {
        return MsoSecuJNI.verifCertByIssuer(certificate, issuerCertif, certVerifResult);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int genCaCert(int caAction, int validityPeriodDays, int rsaKey, byte[] passPhrase, String commonName) {
        return MsoSecuJNI.genCaCert(caAction, validityPeriodDays, rsaKey, passPhrase, commonName);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int genHostCert(String commonName, int validityPeriodDays, long rsaKey, String caKeyPassphrase, byte[] passPhrase) {
        return MsoSecuJNI.genHostCert(commonName, validityPeriodDays, rsaKey, caKeyPassphrase, passPhrase);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int genCSR(String commonName, long rsaKey, byte[] passPhrase, ArrayList<Byte> certficate, ArrayList<Byte> key) {
        return MsoSecuJNI.genCSR(commonName, rsaKey, passPhrase, certficate, key);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int storeHostCert(byte[] hostCertificate, byte[] hostRsaKey) {
        return MsoSecuJNI.storeHostCert(hostCertificate, hostRsaKey);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int signCSR(int validityPeriodDays, byte[] csr, String caKeyPassphrase, ArrayList<Byte> certficate) {
        return MsoSecuJNI.signCSR(validityPeriodDays, csr, caKeyPassphrase, certficate);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int getCaCSR(int caAction, ArrayList<Byte> certficate) {
        return MsoSecuJNI.getCaCSR(caAction, certficate);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int genPKCS12(byte[] certificate, byte[] rsaKey, String keyPassphrase, String p12Passphrase, ArrayList<Byte> p12Buffer) {
        return MsoSecuJNI.genPKCS12(certificate, rsaKey, keyPassphrase, p12Passphrase, p12Buffer);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int getRootPKCS12(int caAction, String p12Passphrase, ArrayList<Byte> p12Buffer) {
        return MsoSecuJNI.getRootPKCS12(caAction, p12Passphrase, p12Buffer);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int caSignRSA(int shaAlgo, String caPassword, byte[] data, ArrayList<Byte> signature) {
        return MsoSecuJNI.caSignRSA(shaAlgo, caPassword, data, signature);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int signRsaByKey(int shaAlgo, byte[] pvtKey, String pvtKeyPassword, byte[] data, ArrayList<Byte> signature) {
        return MsoSecuJNI.signRsaByKey(shaAlgo, pvtKey, pvtKeyPassword, data, signature);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int validateCSR(byte[] csrData, byte[] certificate, int[] certVerifResult) {
        return MsoSecuJNI.validateCSR(csrData, certificate, certVerifResult);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int genCaCertBasicMode(String i_puc_passphrase, byte[] serialNo, ArrayList<Byte> caCertif, ArrayList<Byte> signedSerialNo) {
        return MsoSecuJNI.genCaCertBasicMode(i_puc_passphrase, serialNo, caCertif, signedSerialNo);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int importPKCS7(int caAction, byte[] pkcs7) {
        return MsoSecuJNI.importPKCS7(caAction, pkcs7);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int updateRegenCaCert() {
        return MsoSecuJNI.updateRegenCaCert();
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int getRootCert(int caAction, ArrayList<Byte> certficate) {
        return MsoSecuJNI.getRootCert(caAction, certficate);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int getCaCert(int caAction, ArrayList<Byte> certficate) {
        return MsoSecuJNI.getCaCert(caAction, certficate);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int genDevicePKCS12(String commonName, int validityPeriodDays, long rsaKey, String caKeyPassphrase, String p12Passphrase, ArrayList<Byte> p12Buffer) {
        return MsoSecuJNI.genDevicePKCS12(commonName, validityPeriodDays, rsaKey, caKeyPassphrase, p12Passphrase, p12Buffer);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int signCSR_BasicMode(String i_puc_passphrase, byte[] csr, byte[] productCertif, byte[] prodIssuerCertif, ArrayList<Byte> signedCsr) {
        return MsoSecuJNI.signCSR_BasicMode(i_puc_passphrase, csr, productCertif, prodIssuerCertif, signedCsr);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int setHostPassword(String password) {
        return MsoSecuJNI.setHostPassword(password);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int decryptAes128Cbc(byte[] key, byte[] aes128CbcCryptedData, byte[] iv, boolean usePadding, ArrayList<Byte> aes128CbcClearData) {
        return MsoSecuJNI.decryptAes128Cbc(key, aes128CbcCryptedData, iv, usePadding, aes128CbcClearData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int decryptAes256Cbc(byte[] key, byte[] aes256CbcCryptedData, byte[] iv, boolean usePadding, ArrayList<Byte> aes256CbcClearData) {
        return MsoSecuJNI.decryptAes256Cbc(key, aes256CbcCryptedData, iv, usePadding, aes256CbcClearData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int decryptAesCbc(byte[] key, byte[] aesCbcCryptedData, byte[] iv, boolean usePadding, ArrayList<Byte> aesCbcClearData) {
        return MsoSecuJNI.decryptAesCbc(key, aesCbcCryptedData, iv, usePadding, aesCbcClearData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int calculateSha256(byte[] inputData, ArrayList<Byte> hashedData) {
        return MsoSecuJNI.calculateSha256(inputData, hashedData);
    }

    @Override // com.morpho.morphosmart.sdk.IMsoSecu
    public int computeCRC32(byte[] data, long polynomial, long initialCRCValue, boolean inputReflected, boolean outputReflected, long outputXOR, long[] crcValue) {
        return MsoSecuJNI.computeCRC32(data, polynomial, initialCRCValue, inputReflected, outputReflected, outputXOR, crcValue);
    }
}
