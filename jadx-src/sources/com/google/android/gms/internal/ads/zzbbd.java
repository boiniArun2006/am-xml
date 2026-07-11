package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbbd implements Callable {
    private final zzbak zza;
    private final zzawg zzb;

    public zzbbd(zzbak zzbakVar, zzawg zzawgVar) {
        this.zza = zzbakVar;
        this.zzb = zzawgVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbak zzbakVar = this.zza;
        if (zzbakVar.zzm() != null) {
            zzbakVar.zzm().get();
        }
        zzaxg zzaxgVarZzl = zzbakVar.zzl();
        if (zzaxgVarZzl == null) {
            return null;
        }
        try {
            zzawg zzawgVar = this.zzb;
            synchronized (zzawgVar) {
                zzawgVar.zzaY(zzaxgVarZzl.zzaN(), zzibb.zza());
            }
            return null;
        } catch (zzicg | NullPointerException unused) {
            return null;
        }
    }
}
