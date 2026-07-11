package com.google.firebase.analytics.connector.internal;

import SHQ.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j.n f60066n;
    private final AppMeasurementSdk rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I28 f60067t;

    final /* synthetic */ j.n n() {
        return this.f60066n;
    }

    public Wre(AppMeasurementSdk appMeasurementSdk, j.n nVar) {
        this.f60066n = nVar;
        this.rl = appMeasurementSdk;
        I28 i28 = new I28(this);
        this.f60067t = i28;
        appMeasurementSdk.registerOnMeasurementEventListener(i28);
    }
}
