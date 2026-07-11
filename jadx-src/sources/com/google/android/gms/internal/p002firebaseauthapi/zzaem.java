package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final /* synthetic */ class zzaem {
    public static String zza(zzaej zzaejVar, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                if (zzg.zza(str2.charAt(i2))) {
                    char[] charArray = str2.toCharArray();
                    while (i2 < length) {
                        char c2 = charArray[i2];
                        if (zzg.zza(c2)) {
                            charArray[i2] = (char) (c2 ^ ' ');
                        }
                        i2++;
                    }
                    return String.valueOf(charArray);
                }
                i2++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            zzaej.zza.e("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }

    public static void zzb(zzaej zzaejVar, String str) {
        zzaejVar.zza(str, null);
    }
}
