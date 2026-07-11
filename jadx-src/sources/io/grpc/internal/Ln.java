package io.grpc.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract class Ln implements QJ {
    protected abstract QJ J2();

    Ln() {
    }

    @Override // io.grpc.internal.QJ
    public void HI() {
        J2().HI();
    }

    @Override // io.grpc.internal.QJ
    public void KN(int i2) {
        J2().KN(i2);
    }

    @Override // io.grpc.internal.lS
    public void O() {
        J2().O();
    }

    @Override // io.grpc.internal.QJ
    public void Uo(int i2) {
        J2().Uo(i2);
    }

    @Override // io.grpc.internal.QJ
    public void az(String str) {
        J2().az(str);
    }

    @Override // io.grpc.internal.QJ
    public void ck(l3D l3d) {
        J2().ck(l3d);
    }

    @Override // io.grpc.internal.lS
    public void flush() {
        J2().flush();
    }

    @Override // io.grpc.internal.QJ
    public void gh(JP.QJ qj) {
        J2().gh(qj);
    }

    @Override // io.grpc.internal.lS
    public boolean isReady() {
        return J2().isReady();
    }

    @Override // io.grpc.internal.QJ
    public void mUb(JP.eO eOVar) {
        J2().mUb(eOVar);
    }

    @Override // io.grpc.internal.lS
    public void n(JP.C c2) {
        J2().n(c2);
    }

    @Override // io.grpc.internal.lS
    public void nr(InputStream inputStream) {
        J2().nr(inputStream);
    }

    @Override // io.grpc.internal.QJ
    public void qie(boolean z2) {
        J2().qie(z2);
    }

    @Override // io.grpc.internal.lS
    public void rl(int i2) {
        J2().rl(i2);
    }

    @Override // io.grpc.internal.QJ
    public void t(io.grpc.SPz sPz) {
        J2().t(sPz);
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", J2()).toString();
    }

    @Override // io.grpc.internal.QJ
    public void ty(yg ygVar) {
        J2().ty(ygVar);
    }
}
