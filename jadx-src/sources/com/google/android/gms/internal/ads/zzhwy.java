package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhwy {
    public static byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i2;
        int length = bArr.length;
        if ((length & 1) != 0 || length == 0 || length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        int i3 = length >> 1;
        byte[] bArrZzc = zzc(Arrays.copyOf(bArr, i3));
        byte[] bArrZzc2 = zzc(Arrays.copyOfRange(bArr, i3, length));
        int length2 = bArrZzc.length;
        int length3 = bArrZzc2.length;
        int i5 = length2 + 4 + length3;
        if (i5 >= 128) {
            bArr2 = new byte[i5 + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) i5;
            i2 = 3;
        } else {
            bArr2 = new byte[i5 + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) i5;
            i2 = 2;
        }
        int i7 = i2 + 1;
        bArr2[i2] = 2;
        int i8 = i2 + 2;
        bArr2[i7] = (byte) length2;
        System.arraycopy(bArrZzc, 0, bArr2, i8, length2);
        int i9 = i8 + length2;
        bArr2[i9] = 2;
        bArr2[i9 + 1] = (byte) length3;
        System.arraycopy(bArrZzc2, 0, bArr2, i9 + 2, length3);
        return bArr2;
    }

    private static byte[] zzc(byte[] bArr) {
        int length;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i2 >= length || bArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == length) {
            i2 = length - 1;
        }
        int i3 = (bArr[i2] & ByteCompanionObject.MIN_VALUE) == 128 ? 1 : 0;
        int i5 = length - i2;
        byte[] bArr2 = new byte[i5 + i3];
        System.arraycopy(bArr, i2, bArr2, i3, i5);
        return bArr2;
    }

    public static ECParameterSpec zzb(zzhww zzhwwVar) throws NoSuchAlgorithmException {
        int iOrdinal = zzhwwVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return zzhis.zzc;
                }
                throw new NoSuchAlgorithmException("curve not implemented:".concat(zzhwwVar.toString()));
            }
            return zzhis.zzb;
        }
        return zzhis.zza;
    }
}
