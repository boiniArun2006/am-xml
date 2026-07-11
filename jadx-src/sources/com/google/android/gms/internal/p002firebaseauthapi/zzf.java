package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzf {
    protected zzf() {
    }

    public int zza(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        zzw.zza(i2, length, "index");
        while (i2 < length) {
            if (zza(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public abstract boolean zza(char c2);
}
