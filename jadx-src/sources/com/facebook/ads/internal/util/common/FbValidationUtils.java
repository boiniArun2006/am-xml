package com.facebook.ads.internal.util.common;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class FbValidationUtils {
    public static final String DEBUG_FB_PACKAGE = "com.facebook.wakizashi";
    public static final String FB4A_SHA256_HASH = "4/nh4M+Z0OVqBVumXiQbM5n3zqUkMmsM3W7BMn7Q/cE=";
    public static final String FB_PACKAGE = "com.facebook.katana";

    public static boolean isFbSigningCertificateValid(String str) {
        return isFbSigningCertificateValid(str, FB4A_SHA256_HASH);
    }

    public static String getSigningCertificate(@Nullable PackageInfo packageInfo) {
        if (packageInfo == null) {
            return "";
        }
        try {
            Signature[] signatureArr = packageInfo.signatures;
            return signatureArr.length == 0 ? "" : n(signatureArr[0].toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static boolean isFbSigningCertificateValid(String str, String str2) {
        return str2.equals(str);
    }

    private static String n(byte[] bArr) {
        return Base64.encodeToString(MessageDigest.getInstance("SHA256").digest(bArr), 2);
    }
}
