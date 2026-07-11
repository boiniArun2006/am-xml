package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhlm extends RuntimeException {
    public zzhlm(String str) {
        super(str);
    }

    public zzhlm(String str, Throwable th) {
        super(str, th);
    }

    public zzhlm(Throwable th) {
        super(th);
    }

    public static Object zza(zzhll zzhllVar) {
        try {
            return zzhllVar.zza();
        } catch (Exception e2) {
            throw new zzhlm(e2);
        }
    }
}
