package io.grpc.internal;

import io.grpc.internal.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class qf implements InterfaceC2171c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final io.grpc.SPz f68711n;
    private final l3D.j rl;

    @Override // JP.Z
    public JP.afx nr() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // io.grpc.internal.InterfaceC2171c
    public QJ t(JP.DAz dAz, io.grpc.QJ qj, io.grpc.n nVar, io.grpc.w6[] w6VarArr) {
        return new u(this.f68711n, this.rl, w6VarArr);
    }

    qf(io.grpc.SPz sPz, l3D.j jVar) {
        t1.Xo.O(!sPz.HI(), "error must not be OK");
        this.f68711n = sPz;
        this.rl = jVar;
    }
}
