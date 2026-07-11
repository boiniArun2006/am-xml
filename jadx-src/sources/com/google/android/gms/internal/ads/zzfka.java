package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfka {
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdxt zzdxtVar) {
        zzhbk zzhbkVarZzc;
        if (str != null && (zzhbkVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzhas) zzhbkVarZzc.zzg(zzhif.zza(), zzhas.class)).zza(bArr, bArr2);
                zzdxtVar.zzc().put("ds", "1");
                return new String(bArrZza, com.google.android.exoplayer2.C.UTF8_NAME);
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e2) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e2.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CryptoUtils.decrypt");
                zzdxtVar.zzc().put("dsf", e2.toString());
            }
        }
        return null;
    }

    public static final String zza() {
        byte[] byteArray;
        try {
            zzhbk zzhbkVarZzf = zzhbk.zzf(zzhbc.zzb(zzhkc.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzhav.zzb(zzhbkVarZzf, zzhau.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    private static final zzhbk zzc(String str) {
        try {
            try {
                return zzhav.zza(zzhat.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CryptoUtils.getHandle");
            return null;
        }
    }

    @VisibleForTesting
    public zzfka() {
        try {
            zzhbx.zza();
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CryptoUtils.registerAead");
        }
    }
}
