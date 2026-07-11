package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzcjm implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcce zza;
    final /* synthetic */ zzcjw zzb;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    zzcjm(zzcjw zzcjwVar, zzcce zzcceVar) {
        this.zza = zzcceVar;
        Objects.requireNonNull(zzcjwVar);
        this.zzb = zzcjwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }
}
