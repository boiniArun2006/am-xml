package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzyv implements zzbh {
    private final ECPrivateKey zza;
    private final zzyx zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzzb zze;
    private final zzlq zzf;
    private final byte[] zzg;

    public static zzbh zza(zzkh zzkhVar) throws GeneralSecurityException {
        ECPrivateKey eCPrivateKeyZza = zzyz.zza((zzzc) zzyy.zza.zza(((zzke) ((zzlj) zzkhVar.zza())).zzd()), zznh.zza(zzkhVar.zzf().zza(zzbj.zza())));
        byte[] bArrZzb = new byte[0];
        if (((zzke) ((zzlj) zzkhVar.zza())).zzh() != null) {
            bArrZzb = ((zzke) ((zzlj) zzkhVar.zza())).zzh().zzb();
        }
        return new zzyv(eCPrivateKeyZza, bArrZzb, zzyy.zza(((zzke) ((zzlj) zzkhVar.zza())).zze()), (zzzb) zzyy.zzb.zza(((zzke) ((zzlj) zzkhVar.zza())).zzf()), zzlm.zza((zzke) ((zzlj) zzkhVar.zza())), zzkhVar.zzh().zzb());
    }

    private zzyv(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzzb zzzbVar, zzlq zzlqVar, byte[] bArr2) {
        this.zza = eCPrivateKey;
        this.zzb = new zzyx(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzzbVar;
        this.zzf = zzlqVar;
        this.zzg = bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i2;
        int i3;
        if (zzqq.zza(this.zzg, bArr)) {
            int length = this.zzg.length;
            EllipticCurve curve = this.zza.getParams().getCurve();
            zzzb zzzbVar = this.zze;
            int iZza = zzyz.zza(curve);
            int iOrdinal = zzzbVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new GeneralSecurityException("unknown EC point format");
                    }
                    i2 = iZza * 2;
                }
                i3 = i2 + length;
                if (bArr.length < i3) {
                    return this.zzf.zza(this.zzb.zza(Arrays.copyOfRange(bArr, length, i3), this.zzc, this.zzd, bArr2, this.zzf.zza(), this.zze), bArr, i3);
                }
                throw new GeneralSecurityException("ciphertext too short");
            }
            iZza *= 2;
            i2 = iZza + 1;
            i3 = i2 + length;
            if (bArr.length < i3) {
            }
        } else {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
    }
}
