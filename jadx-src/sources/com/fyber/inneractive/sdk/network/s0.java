package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f54311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f54312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f54313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f54314d;

    public s0(t0 t0Var, Object obj, Exception exc, boolean z2) {
        this.f54314d = t0Var;
        this.f54311a = obj;
        this.f54312b = exc;
        this.f54313c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f54314d.f54316b.a(this.f54311a, this.f54312b, this.f54313c);
    }
}
