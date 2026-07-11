package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class I28 implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Wre f60063n;

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjp
    public final void onEvent(String str, String str2, Bundle bundle, long j2) {
        if (str == null || !n.t(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        bundle2.putLong("timestampInMillis", j2);
        bundle2.putBundle("params", bundle);
        this.f60063n.n().n(3, bundle2);
    }

    public I28(Wre wre) {
        Objects.requireNonNull(wre);
        this.f60063n = wre;
    }
}
