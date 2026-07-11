package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class zzghb implements zzgha {
    private final String zza;
    private final String zzb;
    private final zzgfx zzc;
    private final zzawg zzd;
    private final zzgoc zze;

    public zzghb(String str, String str2, zzawg zzawgVar, zzgfx zzgfxVar, zzgoc zzgocVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzawgVar;
        this.zzc = zzgfxVar;
        this.zze = zzgocVar;
    }

    protected abstract void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        try {
            this.zze.zza();
            Method methodZzc = this.zzc.zzc(this.zza, this.zzb);
            if (methodZzc != null) {
                zza(methodZzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th) {
            try {
                this.zze.zzb(th);
                throw th;
            } catch (Throwable th2) {
                this.zze.zzc();
                throw th2;
            }
        }
    }
}
