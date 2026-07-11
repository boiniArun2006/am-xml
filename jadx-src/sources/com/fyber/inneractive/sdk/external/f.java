package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveAdViewUnitController f53548a;

    public f(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        this.f53548a = inneractiveAdViewUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f53548a.a();
    }
}
