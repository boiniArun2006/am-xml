package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f56015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f56016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f56017c;

    public final boolean a() {
        return this.f56016b != null;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.k kVar) {
        y yVar = this.f56016b;
        if (yVar != null) {
            yVar.a(true);
        }
        if (kVar != null) {
            this.f56015a.execute(kVar);
        }
        this.f56015a.shutdown();
    }

    public final void b() throws IOException {
        IOException iOException = this.f56017c;
        if (iOException != null) {
            throw iOException;
        }
        y yVar = this.f56016b;
        if (yVar != null) {
            int i2 = yVar.f56165c;
            IOException iOException2 = yVar.f56167e;
            if (iOException2 != null && yVar.f56168f > i2) {
                throw iOException2;
            }
        }
    }

    public b0(String str) {
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f56234a;
        this.f56015a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.player.exoplayer2.util.y(str));
    }
}
