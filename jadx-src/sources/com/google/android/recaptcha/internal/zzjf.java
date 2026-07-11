package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzjf {
    public static void zza(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z2, String str, char c2) {
        if (!z2) {
            throw new IllegalArgumentException(zzji.zza(str, Character.valueOf(c2)));
        }
    }

    public static void zzd(int i2, int i3, int i5) {
        if (i2 < 0 || i3 < i2 || i3 > i5) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i5) ? zzf(i2, i5, "start index") : (i3 < 0 || i3 > i5) ? zzf(i3, i5, "end index") : zzji.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void zze(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i2, int i3, String str) {
        return i2 < 0 ? zzji.zza("%s (%s) must not be negative", str, Integer.valueOf(i2)) : zzji.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
