package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class zzaaj {

    @Nullable
    private zzaai zza;

    @Nullable
    private zzaas zzb;

    @CallSuper
    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzd zzdVar) {
        throw null;
    }

    @Nullable
    public zzmm zzg() {
        throw null;
    }

    public abstract void zzp(@Nullable Object obj);

    public abstract zzaak zzq(zzmn[] zzmnVarArr, zzyn zzynVar, zzwk zzwkVar, zzbf zzbfVar) throws zziw;

    @CallSuper
    public final void zzr(zzaai zzaaiVar, zzaas zzaasVar) {
        zzgrc.zzi(this.zza == null);
        this.zza = zzaaiVar;
        this.zzb = zzaasVar;
    }

    protected final void zzs() {
        zzaai zzaaiVar = this.zza;
        if (zzaaiVar != null) {
            zzaaiVar.zzq();
        }
    }

    protected final zzaas zzt() {
        zzaas zzaasVar = this.zzb;
        zzaasVar.getClass();
        return zzaasVar;
    }
}
