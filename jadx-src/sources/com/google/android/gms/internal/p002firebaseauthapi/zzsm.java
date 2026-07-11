package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzsm implements zzcb {
    private static final byte[] zza = {0};
    private final zzcb zzb;
    private final zzxu zzc;
    private final byte[] zzd;

    public static zzcb zza(zzoe zzoeVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        zzqe zzqeVarZza = zzoeVar.zza(zzbj.zza());
        zzcb zzcbVar = (zzcb) zznt.zza().zza(zzqeVarZza.zzf(), zzcb.class).zzb(zzqeVarZza.zzd());
        zzxu zzxuVarZzc = zzqeVarZza.zzc();
        int i2 = zzsp.zza[zzxuVarZzc.ordinal()];
        if (i2 == 1) {
            bArrZzb = zzpd.zza.zzb();
        } else if (i2 == 2 || i2 == 3) {
            bArrZzb = zzpd.zza(zzoeVar.zzb().intValue()).zzb();
        } else {
            if (i2 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzb = zzpd.zzb(zzoeVar.zzb().intValue()).zzb();
        }
        return new zzsm(zzcbVar, zzxuVarZzc, bArrZzb);
    }

    private zzsm(zzcb zzcbVar, zzxu zzxuVar, byte[] bArr) {
        this.zzb = zzcbVar;
        this.zzc = zzxuVar;
        this.zzd = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 10) {
            if (this.zzc.equals(zzxu.LEGACY)) {
                bArr2 = zzyt.zza(bArr2, zza);
            }
            byte[] bArr3 = new byte[0];
            if (!this.zzc.equals(zzxu.RAW)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
                bArr3 = bArrCopyOf;
            }
            if (Arrays.equals(this.zzd, bArr3)) {
                this.zzb.zza(bArr, bArr2);
                return;
            }
            throw new GeneralSecurityException("wrong prefix");
        }
        throw new GeneralSecurityException("tag too short");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (this.zzc.equals(zzxu.LEGACY)) {
            bArr = zzyt.zza(bArr, zza);
        }
        return zzyt.zza(this.zzd, this.zzb.zza(bArr));
    }
}
