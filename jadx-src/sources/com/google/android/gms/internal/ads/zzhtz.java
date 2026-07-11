package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhtz {
    private zzhuc zza = null;
    private zzhyf zzb = null;
    private zzhyf zzc = null;
    private zzhyf zzd = null;
    private zzhyf zze = null;
    private zzhyf zzf = null;
    private zzhyf zzg = null;

    private zzhtz() {
    }

    public final zzhtz zza(zzhuc zzhucVar) {
        this.zza = zzhucVar;
        return this;
    }

    public final zzhtz zzb(zzhyf zzhyfVar, zzhyf zzhyfVar2) {
        this.zzc = zzhyfVar;
        this.zzd = zzhyfVar2;
        return this;
    }

    public final zzhtz zzc(zzhyf zzhyfVar) {
        this.zzb = zzhyfVar;
        return this;
    }

    public final zzhtz zzd(zzhyf zzhyfVar, zzhyf zzhyfVar2) {
        this.zze = zzhyfVar;
        this.zzf = zzhyfVar2;
        return this;
    }

    public final zzhtz zze(zzhyf zzhyfVar) {
        this.zzg = zzhyfVar;
        return this;
    }

    /* synthetic */ zzhtz(byte[] bArr) {
    }

    public final zzhua zzf() throws GeneralSecurityException {
        zzhuc zzhucVar = this.zza;
        if (zzhucVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigIntegerZzd = zzhucVar.zzf().zzd();
        BigInteger bigIntegerZzd2 = this.zza.zzd();
        BigInteger bigIntegerZzb = this.zzc.zzb(zzhax.zza());
        BigInteger bigIntegerZzb2 = this.zzd.zzb(zzhax.zza());
        BigInteger bigIntegerZzb3 = this.zzb.zzb(zzhax.zza());
        BigInteger bigIntegerZzb4 = this.zze.zzb(zzhax.zza());
        BigInteger bigIntegerZzb5 = this.zzf.zzb(zzhax.zza());
        BigInteger bigIntegerZzb6 = this.zzg.zzb(zzhax.zza());
        if (!bigIntegerZzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigIntegerZzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigIntegerZzb.multiply(bigIntegerZzb2).equals(bigIntegerZzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerZzb.subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigIntegerZzb2.subtract(bigInteger);
        if (!bigIntegerZzd.multiply(bigIntegerZzb3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb4).mod(bigIntegerSubtract).equals(bigInteger)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb5).mod(bigIntegerSubtract2).equals(bigInteger)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigIntegerZzb2.multiply(bigIntegerZzb6).mod(bigIntegerZzb).equals(bigInteger)) {
            return new zzhua(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
