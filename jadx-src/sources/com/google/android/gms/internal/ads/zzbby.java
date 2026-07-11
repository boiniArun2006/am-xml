package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzbby implements Callable {
    protected final zzbak zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzawg zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public zzbby(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i2, int i3) {
        this.zza = zzbakVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzawgVar;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i2;
        try {
            long jNanoTime = System.nanoTime();
            zzbak zzbakVar = this.zza;
            Method methodZzo = zzbakVar.zzo(this.zzb, this.zzc);
            this.zze = methodZzo;
            if (methodZzo != null) {
                zza();
                zzazb zzazbVarZzh = zzbakVar.zzh();
                if (zzazbVarZzh != null && (i2 = this.zzf) != Integer.MIN_VALUE) {
                    zzazbVarZzh.zza(this.zzg, i2, (System.nanoTime() - jNanoTime) / 1000, null, null);
                    return null;
                }
                return null;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
