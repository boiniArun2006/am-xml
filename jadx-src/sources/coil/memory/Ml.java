package coil.memory;

import coil.memory.MemoryCache;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml implements MemoryCache {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f43885n;
    private final fuX rl;

    @Override // coil.memory.MemoryCache
    public void n(int i2) {
        this.f43885n.n(i2);
        this.rl.n(i2);
    }

    @Override // coil.memory.MemoryCache
    public MemoryCache.n rl(MemoryCache.Key key) {
        MemoryCache.n nVarRl = this.f43885n.rl(key);
        return nVarRl == null ? this.rl.rl(key) : nVarRl;
    }

    @Override // coil.memory.MemoryCache
    public void t(MemoryCache.Key key, MemoryCache.n nVar) {
        this.f43885n.t(MemoryCache.Key.rl(key, null, kYF.w6.rl(key.getExtras()), 1, null), nVar.n(), kYF.w6.rl(nVar.rl()));
    }

    public Ml(CN3 cn3, fuX fux) {
        this.f43885n = cn3;
        this.rl = fux;
    }
}
