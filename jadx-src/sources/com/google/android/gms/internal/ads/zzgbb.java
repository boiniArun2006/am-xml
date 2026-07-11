package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzgbb {
    private static final Object zza = new Object();
    private static zzgbb zzb;
    private final zzgaz zzc;

    private zzgbb(Context context, ExecutorService executorService, zzgbf zzgbfVar) {
        zzgbm zzgbmVar = new zzgbm(null);
        zzgbmVar.zzc(context);
        zzgbmVar.zzb(executorService);
        zzgbmVar.zzd(zzgbfVar);
        this.zzc = (zzgaz) ((zzgbl) zzgbmVar.zza()).zzI.zzb();
    }

    public static zzgbb zza(Context context, ExecutorService executorService, zzgbf zzgbfVar) {
        zzgbb zzgbbVar;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = new zzgbb(context, executorService, zzgbfVar);
                }
                zzgbbVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgbbVar;
    }

    public final com.google.common.util.concurrent.Xo zzb() {
        return this.zzc.zza();
    }

    public final String zzc(Context context) {
        return this.zzc.zzb(context);
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        return this.zzc.zzc(context, null, view, activity);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        return this.zzc.zzd(context, str, view, null);
    }

    public final void zzf(List list) {
        this.zzc.zze(list);
    }

    public final void zzg(InputEvent inputEvent) {
        this.zzc.zzf(inputEvent);
    }

    public final int zzh() {
        return this.zzc.zzj();
    }
}
