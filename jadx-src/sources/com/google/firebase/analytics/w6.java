package com.google.firebase.analytics;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class w6 implements Callable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ FirebaseAnalytics f60075n;

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.f60075n.J2().zzG();
    }

    w6(FirebaseAnalytics firebaseAnalytics) {
        Objects.requireNonNull(firebaseAnalytics);
        this.f60075n = firebaseAnalytics;
    }
}
