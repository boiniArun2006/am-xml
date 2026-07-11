package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzf implements zzbb {
    protected final zzbe zza = new zzbe();

    protected abstract void zzc(int i2, long j2, int i3, boolean z2);

    protected zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zza() {
        if (zzh() == 3 && zzk() && zzi() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzb(long j2) {
        zzc(zzs(), j2, 5, false);
    }
}
