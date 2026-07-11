package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzccn implements zzbde {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        zza(zzbddVar.zzj);
    }

    public zzccn(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final void zza(boolean z2) {
        zzccq zzccqVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.zza;
        if (!zzccqVarZzD.zza(context)) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzd == z2) {
                    return;
                }
                this.zzd = z2;
                String str = this.zzc;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.zzd) {
                    com.google.android.gms.ads.internal.zzt.zzD().zzd(context, str);
                } else {
                    com.google.android.gms.ads.internal.zzt.zzD().zze(context, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
