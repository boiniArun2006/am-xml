package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzw {
    public static int zza(int i2, int i3) {
        String strZza;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            strZza = zzae.zza("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException("negative size: " + i3);
            }
            strZza = zzae.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzb(i2, i3, "index"));
        }
        return i2;
    }

    private static String zzb(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzae.zza("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzae.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }

    public static int zza(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzb(i2, i3, str));
        }
        return i2;
    }

    public static <T> T zza(T t3) {
        t3.getClass();
        return t3;
    }

    public static void zza(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(zzr.zza(obj));
        }
    }

    public static void zza(int i2, int i3, int i5) {
        String strZzb;
        if (i2 < 0 || i3 < i2 || i3 > i5) {
            if (i2 < 0 || i2 > i5) {
                strZzb = zzb(i2, i5, "start index");
            } else if (i3 >= 0 && i3 <= i5) {
                strZzb = zzae.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                strZzb = zzb(i3, i5, "end index");
            }
            throw new IndexOutOfBoundsException(strZzb);
        }
    }
}
