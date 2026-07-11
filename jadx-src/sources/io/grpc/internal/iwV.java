package io.grpc.internal;

import io.grpc.internal.InterfaceC2171c;
import io.grpc.internal.o7q;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class iwV implements Q {
    protected abstract Q n();

    iwV() {
    }

    @Override // io.grpc.internal.o7q
    public void J2(io.grpc.SPz sPz) {
        n().J2(sPz);
    }

    @Override // io.grpc.internal.InterfaceC2171c
    public void O(InterfaceC2171c.j jVar, Executor executor) {
        n().O(jVar, executor);
    }

    @Override // io.grpc.internal.o7q
    public Runnable Uo(o7q.j jVar) {
        return n().Uo(jVar);
    }

    @Override // JP.Z
    public JP.afx nr() {
        return n().nr();
    }

    @Override // io.grpc.internal.o7q
    public void rl(io.grpc.SPz sPz) {
        n().rl(sPz);
    }

    @Override // io.grpc.internal.InterfaceC2171c
    public QJ t(JP.DAz dAz, io.grpc.QJ qj, io.grpc.n nVar, io.grpc.w6[] w6VarArr) {
        return n().t(dAz, qj, nVar, w6VarArr);
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", n()).toString();
    }

    @Override // io.grpc.internal.Q
    public io.grpc.j xMQ() {
        return n().xMQ();
    }
}
