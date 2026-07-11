package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgrc {
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
            throw new IllegalArgumentException(zzgrt.zzd(str, Character.valueOf(c2)));
        }
    }

    public static void zzd(boolean z2, String str, int i2) {
        if (!z2) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Integer.valueOf(i2)));
        }
    }

    public static void zze(boolean z2, String str, long j2) {
        if (!z2) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Long.valueOf(j2)));
        }
    }

    public static void zzf(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(zzgrt.zzd(str, obj));
        }
    }

    public static void zzg(boolean z2, String str, int i2, int i3) {
        if (!z2) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void zzh(boolean z2, String str, Object obj, Object obj2) {
        if (!z2) {
            throw new IllegalArgumentException(zzgrt.zzd(str, obj, obj2));
        }
    }

    public static void zzi(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void zzj(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object zzk(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzl(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzgrt.zzd(str, obj2));
    }

    public static int zzm(int i2, int i3, String str) {
        String strZzd;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            strZzd = zzgrt.zzd("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 15);
                sb.append("negative size: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
            strZzd = zzgrt.zzd("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(strZzd);
    }

    public static int zzn(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzp(i2, i3, "index"));
        }
        return i2;
    }

    public static void zzo(int i2, int i3, int i5) {
        if (i2 < 0 || i3 < i2 || i3 > i5) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i5) ? zzp(i2, i5, "start index") : (i3 < 0 || i3 > i5) ? zzp(i3, i5, "end index") : zzgrt.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    private static String zzp(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzgrt.zzd("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzgrt.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 15);
        sb.append("negative size: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }
}
