package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;
import com.android.billingclient.api.ci;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzv {
    @NonNull
    public static zzeu zza(@NonNull ci ciVar) {
        zzr zzrVar = new zzr();
        zzu zzuVar = new zzu(zzrVar);
        zzrVar.zzb = zzuVar;
        zzrVar.zza = ciVar.getClass();
        try {
            zzrVar.zza = ciVar.n(zzrVar);
            return zzuVar;
        } catch (Exception e2) {
            zzuVar.zzc(e2);
            return zzuVar;
        }
    }
}
