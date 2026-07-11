package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzoz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Bundle zzc;
    final /* synthetic */ zzpa zzd;

    zzoz(zzpa zzpaVar, String str, String str2, Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
        Objects.requireNonNull(zzpaVar);
        this.zzd = zzpaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpf zzpfVar = this.zzd.zza;
        zzpo zzpoVarZzt = zzpfVar.zzt();
        long jCurrentTimeMillis = zzpfVar.zzaZ().currentTimeMillis();
        String str = this.zza;
        zzpfVar.zzD((zzbg) Preconditions.checkNotNull(zzpoVarZzt.zzac(str, this.zzb, this.zzc, TtmlNode.TEXT_EMPHASIS_AUTO, jCurrentTimeMillis, false, true)), str);
    }
}
