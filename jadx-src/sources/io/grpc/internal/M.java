package io.grpc.internal;

import io.grpc.internal.tI;
import io.grpc.internal.xZD;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class M implements xZD.n {
    protected abstract xZD.n rl();

    M() {
    }

    @Override // io.grpc.internal.xZD.n
    public void O(boolean z2) {
        rl().O(z2);
    }

    @Override // io.grpc.internal.xZD.n
    public void n(tI.j jVar) {
        rl().n(jVar);
    }

    @Override // io.grpc.internal.xZD.n
    public void nr(Throwable th) {
        rl().nr(th);
    }

    @Override // io.grpc.internal.xZD.n
    public void t(int i2) {
        rl().t(i2);
    }
}
