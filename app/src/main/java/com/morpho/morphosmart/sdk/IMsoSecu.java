package com.morpho.morphosmart.sdk;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface IMsoSecu {
    int aes256GcmCrypt(byte[] bArr, ArrayList<Byte> arrayList);

    int aes256GcmCryptByKey(byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    int aes256GcmDecrypt(byte[] bArr, ArrayList<Byte> arrayList);

    int aes256GcmDecryptByKey(byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    int caDecryptRSA(String str, byte[] bArr, ArrayList<Byte> arrayList);

    int caSignRSA(int i, String str, byte[] bArr, ArrayList<Byte> arrayList);

    int calculateSha256(byte[] bArr, ArrayList<Byte> arrayList);

    int computeCRC32(byte[] bArr, long j, long j2, boolean z, boolean z2, long j3, long[] jArr);

    int decryptAes128Cbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    int decryptAes256Cbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    int decryptAesCbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    int encryptAes128Cbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    int encryptAes256Cbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    int encryptAesCbc(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z, ArrayList<Byte> arrayList);

    int genCSR(String str, long j, byte[] bArr, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2);

    int genCaCert(int i, int i2, int i3, byte[] bArr, String str);

    int genCaCertBasicMode(String str, byte[] bArr, ArrayList<Byte> arrayList, ArrayList<Byte> arrayList2);

    int genDevicePKCS12(String str, int i, long j, String str2, String str3, ArrayList<Byte> arrayList);

    int genHostCert(String str, int i, long j, String str2, byte[] bArr);

    int genPKCS12(byte[] bArr, byte[] bArr2, String str, String str2, ArrayList<Byte> arrayList);

    int genRandom(byte[] bArr);

    int getCaCSR(int i, ArrayList<Byte> arrayList);

    int getCaCert(int i, ArrayList<Byte> arrayList);

    int getHostCertif(ArrayList<Byte> arrayList);

    int getRootCert(int i, ArrayList<Byte> arrayList);

    int getRootPKCS12(int i, String str, ArrayList<Byte> arrayList);

    int importPKCS7(int i, byte[] bArr);

    int rsaEncrypt(byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    int rsaEncryptPublicKey(byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    int setHostPassword(String str);

    int setOpenSSLPath(String str);

    int signCSR(int i, byte[] bArr, String str, ArrayList<Byte> arrayList);

    int signCSR_BasicMode(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, ArrayList<Byte> arrayList);

    int signRSA(byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    int signRSAadvanced(int i, byte[] bArr, byte[] bArr2, ArrayList<Byte> arrayList);

    int signRsaByKey(int i, byte[] bArr, String str, byte[] bArr2, ArrayList<Byte> arrayList);

    int storeHostCert(byte[] bArr, byte[] bArr2);

    int tripleDesCrypt(byte[] bArr, ArrayList<Byte> arrayList);

    int tripleDesDecrypt(byte[] bArr, ArrayList<Byte> arrayList);

    int tripleDesSign(byte[] bArr, ArrayList<Byte> arrayList);

    int tripleDesVerifSign(byte[] bArr, byte[] bArr2, boolean[] zArr);

    int tunnelingInit1(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, ArrayList<Byte> arrayList);

    int tunnelingInit2(byte[] bArr);

    int updateRegenCaCert();

    int validateCSR(byte[] bArr, byte[] bArr2, int[] iArr);

    int verifCertByIssuer(byte[] bArr, byte[] bArr2, int[] iArr);

    int verifCertif(byte[] bArr, int[] iArr);

    int verifOfferedSecuritySignature(byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr);

    int verifSignDSA(byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr);

    int verifSignRSA(byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr);

    int verifSignRSA_Advanced(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr);
}
