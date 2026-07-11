package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzqo extends RuntimeException {
    public zzqo(String str) {
        super(str);
    }

    private zzqo(Throwable th) {
        super(th);
    }

    public zzqo(String str, Throwable th) {
        super(str, th);
    }

    public static <T> T zza(zzqn<T> zzqnVar) {
        try {
            return zzqnVar.zza();
        } catch (Exception e2) {
            throw new zzqo(e2);
        }
    }
}
