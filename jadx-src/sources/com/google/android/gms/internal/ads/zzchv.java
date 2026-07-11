package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzchv extends zzchr {
    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
    }

    public zzchv(zzcge zzcgeVar) {
        super(zzcgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zze(String str) {
        String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null && strZzf != null) {
            zzcgeVar.zzt(strZzf, this);
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
