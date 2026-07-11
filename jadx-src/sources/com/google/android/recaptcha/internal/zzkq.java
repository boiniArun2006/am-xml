package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class zzkq implements zzoq {
    private static final zzmo zza;

    public zzoi zza(byte[] bArr, int i2, int i3, zzmo zzmoVar) throws zznn {
        throw null;
    }

    static {
        int i2 = zzmo.zzb;
        int i3 = zzos.zza;
        zza = zzmo.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final /* synthetic */ Object zzb(byte[] bArr) throws zznn {
        zzoi zzoiVarZza = zza(bArr, 0, bArr.length, zza);
        if (zzoiVarZza == null || zzoiVarZza.zzp()) {
            return zzoiVarZza;
        }
        throw new zzpk((zzko) zzoiVarZza).zza();
    }
}
