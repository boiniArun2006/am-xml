package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhxu implements zzhbo {
    private static final byte[] zza = {0};
    private final zzhnp zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzhxu(zzhlp zzhlpVar) throws GeneralSecurityException {
        this.zzb = zzhxr.zzb(zzhnn.zzc(zzhno.zzb(zzhlpVar.zzf().zzc()), zzhlpVar.zzd()));
        this.zzc = zzhlpVar.zzf().zzd();
        this.zzd = zzhlpVar.zze().zzc();
        if (zzhlpVar.zzf().zzf().equals(zzhlv.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzhbo zza(zzhlp zzhlpVar) throws GeneralSecurityException {
        return new zzhxu(zzhlpVar);
    }

    public static zzhbo zzb(zzhmb zzhmbVar) throws GeneralSecurityException {
        return new zzhxu(zzhmbVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzhwr.zza(this.zzd, this.zzb.zza(zzhwr.zza(bArr, bArr2), this.zzc)) : zzhwr.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzhxu(zzhmb zzhmbVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zzhmbVar.zzf().zzg());
        this.zzb = new zzhxt("HMAC".concat(strValueOf), new SecretKeySpec(zzhmbVar.zzd().zzc(zzhax.zza()), "HMAC"));
        this.zzc = zzhmbVar.zzf().zzd();
        this.zzd = zzhmbVar.zze().zzc();
        if (zzhmbVar.zzf().zzf().equals(zzhmj.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzhxu(zzhnp zzhnpVar, int i2) throws GeneralSecurityException {
        this.zzb = zzhnpVar;
        this.zzc = i2;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzhnpVar.zza(new byte[0], i2);
    }
}
