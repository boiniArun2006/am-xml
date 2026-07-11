package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzoa implements zzox {
    private static final zzog zza = new zzny();
    private final zzog zzb;

    public zzoa() {
        zzmw zzmwVarZza = zzmw.zza();
        int i2 = zzos.zza;
        zznz zznzVar = new zznz(zzmwVarZza, zza);
        byte[] bArr = zznl.zzb;
        this.zzb = zznzVar;
    }

    @Override // com.google.android.recaptcha.internal.zzox
    public final zzow zza(Class cls) {
        int i2 = zzoy.zza;
        if (!zznd.class.isAssignableFrom(cls)) {
            int i3 = zzos.zza;
        }
        zzof zzofVarZzb = this.zzb.zzb(cls);
        if (zzofVarZzb.zzb()) {
            int i5 = zzos.zza;
            return zzom.zzc(zzoy.zzm(), zzmr.zza(), zzofVarZzb.zza());
        }
        int i7 = zzos.zza;
        return zzol.zzm(cls, zzofVarZzb, zzop.zza(), zznw.zza(), zzoy.zzm(), zzofVarZzb.zzc() + (-1) != 1 ? zzmr.zza() : null, zzoe.zza());
    }
}
