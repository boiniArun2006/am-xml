package com.google.android.gms.internal.play_billing;

import ep.oxM.esLNYym;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class zzt extends zzq {
    final /* synthetic */ zzu zzg;

    zzt(zzu zzuVar) {
        this.zzg = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzq
    protected final String zza() {
        zzr zzrVar = (zzr) this.zzg.zza.get();
        if (zzrVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(zzrVar.zza) + esLNYym.RBouHUMPQBTMQP;
    }
}
