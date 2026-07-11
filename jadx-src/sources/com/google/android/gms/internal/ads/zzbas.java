package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbas implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzbat zza;

    public final void onOpActiveChanged(String str, int i2, String str2, boolean z2) {
        if (z2) {
            zzbat zzbatVar = this.zza;
            zzbatVar.zze(System.currentTimeMillis());
            zzbatVar.zzh(true);
            return;
        }
        zzbat zzbatVar2 = this.zza;
        long jZzf = zzbatVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzbatVar2.zzf()) {
            zzbatVar2.zzg(jCurrentTimeMillis - zzbatVar2.zzf());
        }
        zzbatVar2.zzh(false);
    }

    zzbas(zzbat zzbatVar) {
        Objects.requireNonNull(zzbatVar);
        this.zza = zzbatVar;
    }
}
