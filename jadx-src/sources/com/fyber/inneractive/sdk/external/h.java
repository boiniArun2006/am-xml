package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdUnitController f53550a;

    public h(NativeAdUnitController nativeAdUnitController) {
        this.f53550a = nativeAdUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f53550a.a();
    }
}
