package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhvf implements zzhbs {
    static final zzhiu zza;
    static final zzhiu zzb;
    static final zzhiu zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zzhwx zzi;
    private final byte[] zzj;
    private final byte[] zzk;
    private final Provider zzl;

    static {
        zzhit zzhitVarZza = zzhiu.zza();
        zzhitVarZza.zza(zzhxn.SHA256, zzhsd.zza);
        zzhitVarZza.zza(zzhxn.SHA384, zzhsd.zzb);
        zzhitVarZza.zza(zzhxn.SHA512, zzhsd.zzc);
        zza = zzhitVarZza.zzb();
        zzhit zzhitVarZza2 = zzhiu.zza();
        zzhitVarZza2.zza(zzhwx.IEEE_P1363, zzhse.zza);
        zzhitVarZza2.zza(zzhwx.DER, zzhse.zzb);
        zzb = zzhitVarZza2.zzb();
        zzhit zzhitVarZza3 = zzhiu.zza();
        zzhitVarZza3.zza(zzhww.NIST_P256, zzhsc.zza);
        zzhitVarZza3.zza(zzhww.NIST_P384, zzhsc.zzb);
        zzhitVarZza3.zza(zzhww.NIST_P521, zzhsc.zzc);
        zzc = zzhitVarZza3.zzb();
    }

    public static zzhbs zzb(zzhsk zzhskVar, Provider provider) throws GeneralSecurityException {
        return new zzhvf((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zzhxe.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhskVar.zzd(), zzhwy.zzb((zzhww) zzc.zzb(zzhskVar.zzf().zzd())))), (zzhxn) zza.zzb(zzhskVar.zzf().zze()), (zzhwx) zzb.zzb(zzhskVar.zzf().zzc()), zzhskVar.zze().zzc(), zzhskVar.zzf().zzf().equals(zzhsf.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i2;
        int i3;
        int i5;
        int i7;
        int i8;
        byte b2;
        int i9;
        byte b4;
        Signature signature;
        byte[] bArr3;
        if (this.zzi == zzhwx.IEEE_P1363) {
            EllipticCurve curve = this.zzg.getParams().getCurve();
            int length = bArr.length;
            int iBitLength = (zzhis.zzc(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != iBitLength + iBitLength) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = zzhwy.zza(bArr);
        }
        int length2 = bArr.length;
        if (length2 >= 8 && bArr[0] == 48) {
            int i10 = bArr[1] & UByte.MAX_VALUE;
            if (i10 == 129) {
                i10 = bArr[2] & UByte.MAX_VALUE;
                if (i10 >= 128) {
                    i2 = 2;
                    if (i10 == (length2 - 1) - i2 && bArr[i2 + 1] == 2 && (i8 = (i7 = (i5 = i2 + 3) + (i3 = bArr[i2 + 2] & UByte.MAX_VALUE)) + 1) < length2 && i3 != 0) {
                        b2 = bArr[i5];
                        if ((b2 & UByte.MAX_VALUE) < 128 && ((i3 <= 1 || b2 != 0 || (bArr[i2 + 4] & UByte.MAX_VALUE) >= 128) && bArr[i7] == 2)) {
                            i9 = bArr[i8] & UByte.MAX_VALUE;
                            if (i7 + 2 + i9 == length2 && i9 != 0) {
                                b4 = bArr[i2 + 5 + i3];
                                if ((b4 & UByte.MAX_VALUE) < 128 && (i9 <= 1 || b4 != 0 || (bArr[i2 + 6 + i3] & UByte.MAX_VALUE) >= 128)) {
                                    String str = this.zzh;
                                    Provider provider = this.zzl;
                                    signature = provider == null ? Signature.getInstance(str, provider) : (Signature) zzhxe.zzc.zzb(str);
                                    signature.initVerify(this.zzg);
                                    signature.update(bArr2);
                                    bArr3 = this.zzk;
                                    if (bArr3.length > 0) {
                                        signature.update(bArr3);
                                    }
                                    try {
                                        if (signature.verify(bArr)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i10 != 128 && i10 <= 129) {
                i2 = 1;
                if (i10 == (length2 - 1) - i2) {
                    b2 = bArr[i5];
                    if ((b2 & UByte.MAX_VALUE) < 128) {
                        i9 = bArr[i8] & UByte.MAX_VALUE;
                        if (i7 + 2 + i9 == length2) {
                            b4 = bArr[i2 + 5 + i3];
                            if ((b4 & UByte.MAX_VALUE) < 128) {
                                String str2 = this.zzh;
                                Provider provider2 = this.zzl;
                                if (provider2 == null) {
                                }
                                signature.initVerify(this.zzg);
                                signature.update(bArr2);
                                bArr3 = this.zzk;
                                if (bArr3.length > 0) {
                                }
                                if (signature.verify(bArr)) {
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    private zzhvf(ECPublicKey eCPublicKey, zzhxn zzhxnVar, zzhwx zzhwxVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(2)) {
            this.zzh = zzhyb.zza(zzhxnVar);
            this.zzg = eCPublicKey;
            this.zzi = zzhwxVar;
            this.zzj = bArr;
            this.zzk = bArr2;
            this.zzl = provider;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }
}
