package com.google.android.recaptcha.internal;

import GJW.C;
import java.util.TimerTask;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.zza;
        C.nr(zzesVar.zzd, null, null, new zzeq(zzesVar, null), 3, null);
    }
}
