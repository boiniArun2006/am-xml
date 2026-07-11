package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzxt implements zzwj {
    private final zzha zza;
    private final zzxc zzb;
    private int zzc;
    private final zzaaw zzd;

    public zzxt(zzha zzhaVar, final zzafa zzafaVar) {
        zzxc zzxcVar = new zzxc() { // from class: com.google.android.gms.internal.ads.zzxs
            @Override // com.google.android.gms.internal.ads.zzxc
            public final /* synthetic */ zzxd zza(zzpq zzpqVar) {
                return new zzvm(zzafaVar);
            }
        };
        zzaaw zzaawVar = new zzaaw(-1);
        this.zza = zzhaVar;
        this.zzb = zzxcVar;
        this.zzd = zzaawVar;
        this.zzc = 1048576;
    }

    public final zzxt zza(int i2) {
        this.zzc = i2;
        return this;
    }

    public final zzxu zzb(zzak zzakVar) {
        zzakVar.zzb.getClass();
        return new zzxu(zzakVar, this.zza, this.zzb, zzto.zza, this.zzd, this.zzc, false, 0, null, null, null);
    }
}
