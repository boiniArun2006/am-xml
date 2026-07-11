package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgca {
    private static zzgxa zzc(boolean z2) {
        return z2 ? zzgxa.zzm().zzh() : zzgxa.zzl();
    }

    public static String zza(byte[] bArr, boolean z2) {
        return zzc(z2).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z2) throws IllegalArgumentException {
        byte[] bArrZzk = zzc(z2).zzk(str);
        if (bArrZzk.length == 0 && str.length() > 0) {
            throw new IllegalArgumentException("Unable to decode ".concat(str));
        }
        return bArrZzk;
    }
}
