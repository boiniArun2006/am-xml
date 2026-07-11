package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzayc implements PackageManager$OnChecksumsReadyListener {
    final zzhah zza = zzhah.zze();

    public final void onChecksumsReady(List list) {
        int size;
        int i2;
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            size = list.size();
        } catch (Throwable unused) {
        }
        for (i2 = 0; i2 < size; i2++) {
            ApkChecksum apkChecksumN = aC.n(list.get(i2));
            if (apkChecksumN.getType() == 8) {
                zzhah zzhahVar = this.zza;
                zzgxa zzgxaVarZzi = zzgxa.zzn().zzi();
                byte[] value = apkChecksumN.getValue();
                zzhahVar.zza(zzgxaVarZzi.zzj(value, 0, value.length));
                return;
            }
            this.zza.zza("");
        }
        this.zza.zza("");
    }
}
