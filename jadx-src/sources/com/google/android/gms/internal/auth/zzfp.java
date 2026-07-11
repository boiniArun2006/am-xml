package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzfp implements zzgj {
    private static final zzfv zza = new zzfn();
    private final zzfv zzb;

    public zzfp() {
        zzfv zzfvVar;
        zzes zzesVarZza = zzes.zza();
        try {
            zzfvVar = (zzfv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzfvVar = zza;
        }
        zzfo zzfoVar = new zzfo(zzesVarZza, zzfvVar);
        byte[] bArr = zzfa.zzd;
        this.zzb = zzfoVar;
    }

    private static boolean zzb(zzfu zzfuVar) {
        if (zzfuVar.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.auth.zzgj
    public final zzgi zza(Class cls) {
        zzgk.zze(cls);
        zzfu zzfuVarZzb = this.zzb.zzb(cls);
        if (zzfuVarZzb.zzb()) {
            if (zzev.class.isAssignableFrom(cls)) {
                return zzgb.zzb(zzgk.zzb(), zzeo.zzb(), zzfuVarZzb.zza());
            }
            return zzgb.zzb(zzgk.zza(), zzeo.zza(), zzfuVarZzb.zza());
        }
        if (zzev.class.isAssignableFrom(cls)) {
            if (zzb(zzfuVarZzb)) {
                return zzga.zzj(cls, zzfuVarZzb, zzgd.zzb(), zzfl.zzd(), zzgk.zzb(), zzeo.zzb(), zzft.zzb());
            }
            return zzga.zzj(cls, zzfuVarZzb, zzgd.zzb(), zzfl.zzd(), zzgk.zzb(), null, zzft.zzb());
        }
        if (zzb(zzfuVarZzb)) {
            return zzga.zzj(cls, zzfuVarZzb, zzgd.zza(), zzfl.zzc(), zzgk.zza(), zzeo.zza(), zzft.zza());
        }
        return zzga.zzj(cls, zzfuVarZzb, zzgd.zza(), zzfl.zzc(), zzgk.zza(), null, zzft.zza());
    }
}
