package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class zzmz extends zzmx implements zzoj {
    @Override // com.google.android.recaptcha.internal.zzmx, com.google.android.recaptcha.internal.zzoh
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzna zzl() {
        if (!((zzna) this.zza).zzL()) {
            return (zzna) this.zza;
        }
        ((zzna) this.zza).zzb.zzg();
        return (zzna) super.zzl();
    }

    protected zzmz(zzna zznaVar) {
        super(zznaVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmx
    protected final void zzo() {
        super.zzo();
        if (((zzna) this.zza).zzb != zzmt.zzd()) {
            zzna zznaVar = (zzna) this.zza;
            zznaVar.zzb = zznaVar.zzb.clone();
        }
    }
}
