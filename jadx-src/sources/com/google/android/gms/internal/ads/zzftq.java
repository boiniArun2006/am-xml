package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzftq extends BroadcastReceiver {
    final /* synthetic */ zzftr zza;

    zzftq(zzftr zzftrVar) {
        Objects.requireNonNull(zzftrVar);
        this.zza = zzftrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzftr zzftrVar = this.zza;
            zzftrVar.zzd(true, zzftrVar.zzf());
            zzftrVar.zze(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzftr zzftrVar2 = this.zza;
            zzftrVar2.zzd(false, zzftrVar2.zzf());
            zzftrVar2.zze(false);
        }
    }
}
