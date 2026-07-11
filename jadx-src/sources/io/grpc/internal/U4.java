package io.grpc.internal;

import io.grpc.internal.tI;
import io.grpc.internal.xZD;
import java.io.Closeable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class U4 extends M {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final xZD.n f68380n;
    private boolean rl;

    @Override // io.grpc.internal.M, io.grpc.internal.xZD.n
    public void O(boolean z2) {
        this.rl = true;
        super.O(z2);
    }

    @Override // io.grpc.internal.M, io.grpc.internal.xZD.n
    public void nr(Throwable th) {
        this.rl = true;
        super.nr(th);
    }

    @Override // io.grpc.internal.M, io.grpc.internal.xZD.n
    public void n(tI.j jVar) {
        if (!this.rl) {
            super.n(jVar);
        } else if (jVar instanceof Closeable) {
            psW.O((Closeable) jVar);
        }
    }

    @Override // io.grpc.internal.M
    protected xZD.n rl() {
        return this.f68380n;
    }

    public U4(xZD.n nVar) {
        this.f68380n = nVar;
    }
}
