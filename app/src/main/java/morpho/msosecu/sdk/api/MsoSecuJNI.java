package morpho.msosecu.sdk.api;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MsoSecuJNI {
    public static final native int AES128_BLOCK_LENGTH_get();

    public static final native int AES256_BLOCK_LENGTH_get();

    public static final native int AES_256_GCM_IV_LENGTH_get();

    public static final native int AES_256_GCM_KEY_LENGTH_get();

    public static final native int AES_256_GCM_TAG_LENGTH_get();

    public static final native int ALGO_MAX_KEY_LENGTH_get();

    public static final native int DES_BLOCK_LENGTH_get();

    public static final native int FIRST_GENERATION_get();

    public static final native int IV_TAG_BLOCK_LENGTH_get();

    public static final native int MSOSECU_AES128_FINAL_ERR_get();

    public static final native int MSOSECU_AES128_INIT_ERR_get();

    public static final native int MSOSECU_AES128_UPDATE_ERR_get();

    public static final native int MSOSECU_AES_FINAL_ERR_get();

    public static final native int MSOSECU_AES_INIT_ERR_get();

    public static final native int MSOSECU_AES_UPDATE_ERR_get();

    public static final native int MSOSECU_ALLOC_ERR_get();

    public static final native int MSOSECU_ASSIGN_RSA_ERR_get();

    public static final native int MSOSECU_BAD_PARAMETER_get();

    public static final native int MSOSECU_BIO_NEW_MEM_ERR_get();

    public static final native int MSOSECU_CA_ALREADY_EXISTS_get();

    public static final native int MSOSECU_CERT_NOT_SUPPORTED_get();

    public static final native int MSOSECU_CRYPTO_PROTOCOLE_ERR_get();

    public static final native int MSOSECU_DELETE_FILE_ERR_get();

    public static final native int MSOSECU_DSA_KEY_ERR_get();

    public static final native int MSOSECU_DSS1_FINAL_ERR_get();

    public static final native int MSOSECU_DSS1_INIT_ERR_get();

    public static final native int MSOSECU_DSS1_UPDATE_ERR_get();

    public static final native int MSOSECU_FILE_EMPTY_get();

    public static final native int MSOSECU_FILE_ERR_get();

    public static final native int MSOSECU_INVALID_CERTIF_get();

    public static final native int MSOSECU_MODE_DSA_ERR_get();

    public static final native int MSOSECU_OK_get();

    public static final native int MSOSECU_OPEN_FILE_ERR_get();

    public static final native int MSOSECU_OPEN_SSL_get();

    public static final native int MSOSECU_PARSE_CSR_ERR_get();

    public static final native int MSOSECU_PARSE_DATA_TO_X509STRUCT_ERR_get();

    public static final native int MSOSECU_PARSE_DER_TO_X509STRUCT_ERR_get();

    public static final native int MSOSECU_PEM_READ_BIO_ERR_get();

    public static final native int MSOSECU_PUBLIC_KEY_ERR_get();

    public static final native int MSOSECU_READ_FILE_ERR_get();

    public static final native int MSOSECU_RSA_KEY_ERR_get();

    public static final native int MSOSECU_SET_PUBKEY_ERR_get();

    public static final native int MSOSECU_SHA1_FINAL_ERR_get();

    public static final native int MSOSECU_SHA1_INIT_ERR_get();

    public static final native int MSOSECU_SHA1_UPDATE_ERR_get();

    public static final native int MSOSECU_SHA256_FINAL_ERR_get();

    public static final native int MSOSECU_SHA256_INIT_ERR_get();

    public static final native int MSOSECU_SHA256_UPDATE_ERR_get();

    public static final native int MSOSECU_SIGN_REQ_ERR_get();

    public static final native int MSOSECU_SSL_PATH_ERROR_get();

    public static final native int MSOSECU_STORE_LOAD_LOCATIONS_ERR_get();

    public static final native int MSOSECU_STORE_NEW_ERR_get();

    public static final native int MSOSECU_TripleDesCryptByKey_cbc(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static final native int MSOSECU_WRITE_FILE_ERR_get();

    public static final native int REGENERATION_get();

    public static final native int SHA1_SIGN_ALGO_get();

    public static final native int SHA256_BLOCK_LENGTH_get();

    public static final native int SHA256_SIGN_ALGO_get();

    public static final native int TRIPLE_DES_KEY_LENGTH_get();

    public static final native int aes256GcmCrypt(byte[] bArr, ArrayList<Byte> arrayList);

    public static final native int aes256GcmCryptByKey(byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    public static final native int aes256GcmDecrypt(byte[] bArr, ArrayList<Byte> arrayList);

    public static final native int aes256GcmDecryptByKey(byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    public static final native int caDecryptRSA(String str, byte[] bArr, ArrayList<Byte> arrayList);

    public static final native int caSignRSA(int i, String str, byte[] bArr, ArrayList<Byte> arrayList);

    public static final native int calculateSha256(byte[] bArr, ArrayList<Byte> arrayList);

    public static final native int computeCRC32(byte[] bArr, long j, long j2, boolean z, boolean z2, long j3, long[] jArr);

    public static final native int decryptAes128Cbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    public static final native int decryptAes256Cbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    public static final native int decryptAesCbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    public static final native int encryptAes128Cbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    public static final native int encryptAes256Cbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    public static final native int encryptAesCbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    public static final native int genCSR(String str, long j, byte[] bArr, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2);

    public static final native int genCaCert(int i, int i2, int i3, byte[] bArr, String str);

    public static final native int genCaCertBasicMode(String str, byte[] bArr, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2);

    public static final native int genDevicePKCS12(String str, int i, long j, String str2, String str3, ArrayList<Byte> arrayList);

    public static final native int genHostCert(String str, int i, long j, String str2, byte[] bArr);

    public static final native int genPKCS12(byte[] bArr, byte[] bArr2, String str, String str2, ArrayList<Byte> arrayList);

    public static final native int genRandom(byte[] bArr);

    public static final native int getCaCSR(int i, ArrayList<Byte> arrayList);

    public static final native int getCaCert(int i, ArrayList<Byte> arrayList);

    public static final native int getHostCertif(ArrayList<Byte> arrayList);

    public static final native int getRootCert(int i, ArrayList<Byte> arrayList);

    public static final native int getRootPKCS12(int i, String str, ArrayList<Byte> arrayList);

    public static final native int importPKCS7(int i, byte[] bArr);

    public static final native int rsaEncrypt(byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    public static final native int rsaEncryptPublicKey(byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    public static final native int setHostPassword(String str);

    public static final native int setOpenSSLPath(String str);

    public static final native int signCSR(int i, byte[] bArr, String str, ArrayList<Byte> arrayList);

    public static final native int signCSR_BasicMode(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, ArrayList<Byte> arrayList);

    public static final native int signRSA(byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    public static final native int signRSAadvanced(int i, byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    public static final native int signRsaByKey(int i, byte[] bArr, String str, byte[] bArr2, ArrayList<Byte> arrayList);

    public static final native int storeHostCert(byte[] bArr, byte[] bArr2);

    public static final native int tripleDesCrypt(byte[] bArr, ArrayList<Byte> arrayList);

    public static final native int tripleDesDecrypt(byte[] bArr, ArrayList<Byte> arrayList);

    public static final native int tripleDesSign(byte[] bArr, ArrayList<Byte> arrayList);

    public static final native int tripleDesVerifSign(byte[] bArr, byte[] bArr2, boolean[] zArr);

    public static final native int tunnelingInit1(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, ArrayList<Byte> arrayList);

    public static final native int tunnelingInit2(byte[] bArr);

    public static final native int updateRegenCaCert();

    public static final native int validateCSR(byte[] bArr, byte[] bArr2, int[] iArr);

    public static final native int verifCertByIssuer(byte[] bArr, byte[] bArr2, int[] iArr);

    public static final native int verifCertif(byte[] bArr, int[] iArr);

    public static final native int verifOfferedSecuritySignature(byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr);

    public static final native int verifSignDSA(byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr);

    public static final native int verifSignRSA(byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr);

    public static final native int verifSignRSA_Advanced(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr);
}
