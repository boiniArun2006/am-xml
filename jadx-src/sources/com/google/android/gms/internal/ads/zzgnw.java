package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzgnw extends BroadcastReceiver implements zzgnb, zzgdd {
    private final Context zza;
    private final ExecutorService zzb;
    private boolean zzc = true;

    private final synchronized void zzg(boolean z2) {
        this.zzc = z2;
    }

    final synchronized boolean zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final com.google.common.util.concurrent.Xo zza() {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgnv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzf();
                return null;
            }
        }, this.zzb);
    }

    final /* synthetic */ Void zzf() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction(YmsTEL.gQOUYARJLigcY);
        this.zza.registerReceiver(this, intentFilter);
        return null;
    }

    zzgnw(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzg(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzg(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        map.put("up", Boolean.valueOf(zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
        map.put("up", Boolean.valueOf(zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
        map.put("up", Boolean.valueOf(zze()));
    }
}
