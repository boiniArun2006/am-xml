package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzekc {

    @Nullable
    private MeasurementManagerFutures zza;
    private final Context zzb;

    zzekc(Context context) {
        this.zzb = context;
    }

    public final com.google.common.util.concurrent.Xo zza() {
        try {
            MeasurementManagerFutures measurementManagerFuturesN = MeasurementManagerFutures.n(this.zzb);
            this.zza = measurementManagerFuturesN;
            return measurementManagerFuturesN == null ? zzgzo.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesN.rl();
        } catch (Exception e2) {
            return zzgzo.zzc(e2);
        }
    }

    public final com.google.common.util.concurrent.Xo zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.t(uri, inputEvent);
        } catch (Exception e2) {
            return zzgzo.zzc(e2);
        }
    }
}
