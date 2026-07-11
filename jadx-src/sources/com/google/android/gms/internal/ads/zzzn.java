package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzzn implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ zzaaa zza;

    zzzn(zzzp zzzpVar, zzaaa zzaaaVar) {
        this.zza = zzaaaVar;
        Objects.requireNonNull(zzzpVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z2) {
        this.zza.zzl();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z2) {
        this.zza.zzl();
    }
}
