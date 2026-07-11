package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhsh {
    private zzhsk zza = null;
    private zzhyf zzb = null;

    private zzhsh() {
    }

    public final zzhsh zza(zzhsk zzhskVar) {
        this.zza = zzhskVar;
        return this;
    }

    public final zzhsh zzb(zzhyf zzhyfVar) {
        this.zzb = zzhyfVar;
        return this;
    }

    /* synthetic */ zzhsh(byte[] bArr) {
    }

    public final zzhsi zzc() throws GeneralSecurityException {
        zzhsk zzhskVar = this.zza;
        if (zzhskVar == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        zzhyf zzhyfVar = this.zzb;
        if (zzhyfVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigIntegerZzb = zzhyfVar.zzb(zzhax.zza());
        ECPoint eCPointZzd = zzhskVar.zzd();
        zzhsc zzhscVarZzd = zzhskVar.zzf().zzd();
        BigInteger order = zzhscVarZzd.zza().getOrder();
        if (bigIntegerZzb.signum() <= 0 || bigIntegerZzb.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzhis.zzd(bigIntegerZzb, zzhscVarZzd.zza()).equals(eCPointZzd)) {
            return new zzhsi(this.zza, this.zzb, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }
}
