package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzayv {
    public static final String zza(@NonNull Context context, @NonNull String str, long j2, boolean z2) {
        try {
            zzaxp zzaxpVarZza = zzaxq.zza();
            zzaxpVarZza.zzb(str);
            zzaxpVarZza.zza("0.825731049");
            zzaxpVarZza.zzd(context.getPackageName());
            zzaxpVarZza.zzf((System.currentTimeMillis() - j2) / 1000);
            zzaxpVarZza.zzc(System.currentTimeMillis() / 1000);
            try {
                zzaxpVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzaxpVarZza.zze(-1L);
            }
            zzaxw zzaxwVarZzc = zzayg.zzc(((zzaxq) zzaxpVarZza.zzbu()).zzaN(), null);
            zzaxwVarZzc.zzc(5);
            zzaxwVarZzc.zzd(2);
            return Base64.encodeToString(((zzaxx) zzaxwVarZzc.zzbu()).zzaN(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
