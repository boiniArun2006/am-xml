package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f55918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f55919b;

    public k(p pVar, n nVar) {
        this.f55919b = pVar;
        this.f55918a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f55918a;
        if (nVar.f55934c != null) {
            nVar.f55934c = null;
        }
        int size = this.f55919b.f55958o.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55919b.f55958o.valueAt(i2)).b();
        }
    }
}
