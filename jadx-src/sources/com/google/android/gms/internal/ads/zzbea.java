package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbea implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbee zzb;

    zzbea(zzbee zzbeeVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbeeVar);
        this.zzb = zzbeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
