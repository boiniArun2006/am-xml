package com.google.firebase.analytics.connector.internal;

import SHQ.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Set f60064n;
    private final w6 nr;
    private final j.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AppMeasurementSdk f60065t;

    final /* synthetic */ j.n n() {
        return this.rl;
    }

    public Ml(AppMeasurementSdk appMeasurementSdk, j.n nVar) {
        this.rl = nVar;
        this.f60065t = appMeasurementSdk;
        w6 w6Var = new w6(this);
        this.nr = w6Var;
        appMeasurementSdk.registerOnMeasurementEventListener(w6Var);
        this.f60064n = new HashSet();
    }
}
