package io.grpc.internal;

import io.grpc.AbstractC2170c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class vd extends AbstractC2170c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AbstractC2170c f68790n;

    @Override // io.grpc.AbstractC2170c
    public String n() {
        return this.f68790n.n();
    }

    @Override // io.grpc.AbstractC2170c
    public void nr(AbstractC2170c.Ml ml) {
        this.f68790n.nr(ml);
    }

    @Override // io.grpc.AbstractC2170c
    public void rl() {
        this.f68790n.rl();
    }

    @Override // io.grpc.AbstractC2170c
    public void t() {
        this.f68790n.t();
    }

    vd(AbstractC2170c abstractC2170c) {
        t1.Xo.ck(abstractC2170c, "delegate can not be null");
        this.f68790n = abstractC2170c;
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", this.f68790n).toString();
    }
}
