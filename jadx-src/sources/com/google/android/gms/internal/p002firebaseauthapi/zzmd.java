package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import com.vungle.ads.internal.protos.Sdk;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzmd implements zzbh {
    private static final byte[] zza = new byte[0];
    private final zzmh zzb;
    private final zzme zzc;
    private final zzmf zzd;
    private final zzmb zze;
    private final int zzf;
    private final byte[] zzg;

    public static zzbh zza(zzkl zzklVar) throws GeneralSecurityException {
        int i2;
        zzki zzkiVar = (zzki) ((zzlj) zzklVar.zza());
        zzme zzmeVarZza = zzmg.zza(zzkiVar.zze());
        zzmf zzmfVarZza = zzmg.zza(zzkiVar.zzd());
        zzmb zzmbVarZza = zzmg.zza(zzkiVar.zzb());
        zzki.zzd zzdVarZze = zzkiVar.zze();
        zzki.zzd zzdVar = zzki.zzd.zzd;
        if (zzdVarZze.equals(zzdVar)) {
            i2 = 32;
        } else if (zzdVarZze.equals(zzki.zzd.zza)) {
            i2 = 65;
        } else if (zzdVarZze.equals(zzki.zzd.zzb)) {
            i2 = 97;
        } else {
            if (!zzdVarZze.equals(zzki.zzd.zzc)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i2 = Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE;
        }
        int i3 = i2;
        zzki.zzd zzdVarZze2 = ((zzki) ((zzlj) zzklVar.zza())).zze();
        if (zzdVarZze2.equals(zzdVar) || zzdVarZze2.equals(zzki.zzd.zza) || zzdVarZze2.equals(zzki.zzd.zzb) || zzdVarZze2.equals(zzki.zzd.zzc)) {
            return new zzmd(new zzmh(zzaae.zza(zzklVar.zzf().zza(zzbj.zza())), ((zzkt) ((zzll) zzklVar.zzc())).zze()), zzmeVarZza, zzmfVarZza, zzmbVarZza, i3, zzklVar.zzh());
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    private zzmd(zzmh zzmhVar, zzme zzmeVar, zzmf zzmfVar, zzmb zzmbVar, int i2, zzaae zzaaeVar) {
        this.zzb = zzmhVar;
        this.zzc = zzmeVar;
        this.zzd = zzmfVar;
        this.zze = zzmbVar;
        this.zzf = i2;
        this.zzg = zzaaeVar.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzg;
        int length = bArr3.length + this.zzf;
        if (bArr.length >= length) {
            if (zzqq.zza(bArr3, bArr)) {
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                return zzma.zza(Arrays.copyOfRange(bArr, this.zzg.length, length), this.zzb, this.zzc, this.zzd, this.zze, bArr2).zza(bArr, length, zza);
            }
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
