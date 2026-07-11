package io.grpc.internal;

import io.grpc.internal.l3D;
import io.grpc.internal.tI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class lej implements l3D {
    protected abstract l3D O();

    lej() {
    }

    @Override // io.grpc.internal.tI
    public void n(tI.j jVar) {
        O().n(jVar);
    }

    @Override // io.grpc.internal.l3D
    public void nr(io.grpc.SPz sPz, l3D.j jVar, io.grpc.QJ qj) {
        O().nr(sPz, jVar, qj);
    }

    @Override // io.grpc.internal.l3D
    public void rl(io.grpc.QJ qj) {
        O().rl(qj);
    }

    @Override // io.grpc.internal.tI
    public void t() {
        O().t();
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", O()).toString();
    }
}
