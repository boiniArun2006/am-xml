package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzaw implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzaw(zzax zzaxVar, Context context, String str, boolean z2, boolean z3) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z2;
        this.zzd = z3;
        Objects.requireNonNull(zzaxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        AlertDialog.Builder builderZzP = zzs.zzP(context);
        builderZzP.setMessage(this.zzb);
        if (this.zzc) {
            builderZzP.setTitle("Error");
        } else {
            builderZzP.setTitle("Info");
        }
        if (this.zzd) {
            builderZzP.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzP.setPositiveButton("Learn More", new zzav(this, context));
            builderZzP.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzP.create().show();
    }
}
