package com.pairip;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class SignatureCheck {
    private static final String ALLOWLISTED_SIG = "Vn3kj4pUblROi2S+QfRRL9nhsaO2uoHQg6+dpEtxdTE=";
    private static final String TAG = "SignatureCheck";
    private static String expectedLegacyUpgradedSignature = "/VTjf+ualt4SlRHefeE8xOZWIIanFwSU0mPlHhLuA90=";
    private static String expectedSignature = "/VTjf+ualt4SlRHefeE8xOZWIIanFwSU0mPlHhLuA90=";
    private static String expectedTestSignature = "/VTjf+ualt4SlRHefeE8xOZWIIanFwSU0mPlHhLuA90=";

    private static class SignatureTamperedException extends RuntimeException {
        public SignatureTamperedException(String message) {
            super(message);
        }
    }

    public static void verifyIntegrity(Context context) {
        String strEncodeToString;
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()), 2);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            strEncodeToString = null;
        }
        if (!verifySignatureMatches(strEncodeToString) && !expectedTestSignature.equals(strEncodeToString) && !ALLOWLISTED_SIG.equals(strEncodeToString)) {
            throw new SignatureTamperedException("Apk signature is invalid.");
        }
        Log.i(TAG, "Signature check ok");
    }

    public static boolean verifySignatureMatches(String signature) {
        return expectedSignature.equals(signature) || expectedLegacyUpgradedSignature.equals(signature);
    }

    private SignatureCheck() {
    }
}
