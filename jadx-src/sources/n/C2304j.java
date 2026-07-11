package n;

import QVk.aC;

/* JADX INFO: renamed from: n.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C2304j extends jl.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Jv.n f70999n;
    private final aC rl;

    @Override // jl.I28
    public void gh(String str) {
        this.rl.nHg(this.f70999n.now());
        this.rl.Xw(str);
    }

    @Override // jl.I28
    public void n(com.facebook.imagepipeline.request.j jVar, Object obj, String str, boolean z2) {
        this.rl.s7N(this.f70999n.now());
        this.rl.N(jVar);
        this.rl.ViF(obj);
        this.rl.Xw(str);
        this.rl.bzg(z2);
    }

    @Override // jl.I28
    public void t(com.facebook.imagepipeline.request.j jVar, String str, boolean z2) {
        this.rl.nHg(this.f70999n.now());
        this.rl.N(jVar);
        this.rl.Xw(str);
        this.rl.bzg(z2);
    }

    @Override // jl.I28
    public void xMQ(com.facebook.imagepipeline.request.j jVar, String str, Throwable th, boolean z2) {
        this.rl.nHg(this.f70999n.now());
        this.rl.N(jVar);
        this.rl.Xw(str);
        this.rl.bzg(z2);
    }

    public C2304j(Jv.n nVar, aC aCVar) {
        this.f70999n = nVar;
        this.rl = aCVar;
    }
}
