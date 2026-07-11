package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfsi {
    private boolean zza;

    final boolean zza() {
        return this.zza;
    }

    final void zzb(Context context) {
        zzfuh.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzftp.zza().zzb(context);
        zzftg.zza().zzd(context);
        zzfuc.zza(context);
        zzfud.zza(context);
        zzfug.zza(context);
        zzftm.zza().zzc(context);
        zzftf.zza().zzc(context);
        zzftr.zza().zzb(context);
    }
}
