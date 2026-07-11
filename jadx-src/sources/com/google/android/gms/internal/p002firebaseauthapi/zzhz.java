package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhz implements zzbe {
    private final zzbe zza;
    private final byte[] zzb;

    public static zzbe zza(zzoe zzoeVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        zzqe zzqeVarZza = zzoeVar.zza(zzbj.zza());
        zzbe zzbeVar = (zzbe) zznt.zza().zza(zzqeVarZza.zzf(), zzbe.class).zzb(zzqeVarZza.zzd());
        zzxu zzxuVarZzc = zzqeVarZza.zzc();
        int i2 = zzic.zza[zzxuVarZzc.ordinal()];
        if (i2 == 1) {
            bArrZzb = zzpd.zza.zzb();
        } else if (i2 == 2 || i2 == 3) {
            bArrZzb = zzpd.zza(zzoeVar.zzb().intValue()).zzb();
        } else {
            if (i2 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + String.valueOf(zzxuVarZzc));
            }
            bArrZzb = zzpd.zzb(zzoeVar.zzb().intValue()).zzb();
        }
        return new zzhz(zzbeVar, bArrZzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        return bArr3.length == 0 ? this.zza.zzb(bArr, bArr2) : zzyt.zza(bArr3, this.zza.zzb(bArr, bArr2));
    }

    private zzhz(zzbe zzbeVar, byte[] bArr) {
        this.zza = zzbeVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzbe zza(zzbe zzbeVar, zzaae zzaaeVar) {
        return new zzhz(zzbeVar, zzaaeVar.zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzqq.zza(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
