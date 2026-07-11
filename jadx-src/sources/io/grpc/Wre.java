package io.grpc;

import JP.nKK;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre extends z {
    protected abstract z O();

    protected Wre() {
    }

    @Override // io.grpc.z
    public nKK n() {
        return O().n();
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", O()).toString();
    }
}
