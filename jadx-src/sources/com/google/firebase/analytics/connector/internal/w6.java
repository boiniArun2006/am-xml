package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjl;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class w6 implements AppMeasurementSdk.OnEventListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Ml f60072n;

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjp
    public final void onEvent(String str, String str2, Bundle bundle, long j2) {
        Ml ml = this.f60072n;
        if (ml.f60064n.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i2 = n.Uo;
            String strZza = zzjl.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString(CrashEvent.f62787f, str2);
            ml.n().n(2, bundle2);
        }
    }

    public w6(Ml ml) {
        Objects.requireNonNull(ml);
        this.f60072n = ml;
    }
}
