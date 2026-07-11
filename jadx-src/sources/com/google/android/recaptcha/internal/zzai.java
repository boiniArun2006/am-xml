package com.google.android.recaptcha.internal;

import GJW.C;
import java.util.TimerTask;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzan zzanVar = this.zza;
        C.nr(zzanVar.zzb, null, null, new zzaj(zzanVar, null), 3, null);
    }
}
