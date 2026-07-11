package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzict implements zzidv {
    private static final zzida zzb = new zzicr();
    private final zzida zza;

    public zzict() {
        zzibk zzibkVarZza = zzibk.zza();
        int i2 = zziaa.zza;
        zzics zzicsVar = new zzics(zzibkVarZza, zzb);
        byte[] bArr = zzice.zzb;
        this.zza = zzicsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidv
    public final zzidu zza(Class cls) {
        int i2 = zzidw.zza;
        if (!zzibr.class.isAssignableFrom(cls)) {
            int i3 = zziaa.zza;
        }
        zzicz zziczVarZzc = this.zza.zzc(cls);
        if (zziczVarZzc.zza()) {
            int i5 = zziaa.zza;
            return zzidg.zzh(zzidw.zzF(), zzibe.zza(), zziczVarZzc.zzb());
        }
        int i7 = zziaa.zza;
        return zzidf.zzm(cls, zziczVarZzc, zzidj.zza(), zzicp.zza(), zzidw.zzF(), zziczVarZzc.zzc() + (-1) != 1 ? zzibe.zza() : null, zzicy.zza());
    }
}
