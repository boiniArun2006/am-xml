package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzie implements zziy {
    private static final zzik zza = new zzic();
    private final zzik zzb;

    public zzie() {
        zzhf zzhfVarZza = zzhf.zza();
        int i2 = zziu.zza;
        zzid zzidVar = new zzid(zzhfVarZza, zza);
        byte[] bArr = zzhp.zzb;
        this.zzb = zzidVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zziy
    public final zzix zza(Class cls) {
        int i2 = zziz.zza;
        if (!zzhk.class.isAssignableFrom(cls)) {
            int i3 = zziu.zza;
        }
        zzij zzijVarZzb = this.zzb.zzb(cls);
        if (zzijVarZzb.zzb()) {
            int i5 = zziu.zza;
            return zziq.zzc(zziz.zzm(), zzgz.zza(), zzijVarZzb.zza());
        }
        int i7 = zziu.zza;
        return zzip.zzl(cls, zzijVarZzb, zzis.zza(), zzia.zza(), zziz.zzm(), zzijVarZzb.zzc() + (-1) != 1 ? zzgz.zza() : null, zzii.zza());
    }
}
