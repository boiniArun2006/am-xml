package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zznc implements zznx {
    private static final zznj zzb = new zzna();
    private final zznj zza;

    public zznc() {
        zzlz zzlzVarZza = zzlz.zza();
        int i2 = zznt.zza;
        zznb zznbVar = new zznb(zzlzVarZza, zzb);
        byte[] bArr = zzmo.zzb;
        this.zza = zznbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final zznw zza(Class cls) {
        int i2 = zzny.zza;
        if (!zzme.class.isAssignableFrom(cls)) {
            int i3 = zznt.zza;
        }
        zzni zzniVarZzc = this.zza.zzc(cls);
        if (zzniVarZzc.zza()) {
            int i5 = zznt.zza;
            return zznp.zzg(zzny.zzA(), zzlt.zza(), zzniVarZzc.zzb());
        }
        int i7 = zznt.zza;
        return zzno.zzl(cls, zzniVarZzc, zznr.zza(), zzmy.zza(), zzny.zzA(), zzniVarZzc.zzc() + (-1) != 1 ? zzlt.zza() : null, zznh.zza());
    }
}
