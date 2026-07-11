package pL6;

import io.grpc.Pl;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml extends Pl.Dsr {
    protected abstract Pl.Dsr mUb();

    @Override // io.grpc.Pl.Dsr
    public void J2() {
        mUb().J2();
    }

    @Override // io.grpc.Pl.Dsr
    public void KN(Pl.C c2) {
        mUb().KN(c2);
    }

    @Override // io.grpc.Pl.Dsr
    public Object O() {
        return mUb().O();
    }

    @Override // io.grpc.Pl.Dsr
    public void Uo() {
        mUb().Uo();
    }

    @Override // io.grpc.Pl.Dsr
    public JP.Ml nr() {
        return mUb().nr();
    }

    @Override // io.grpc.Pl.Dsr
    public List rl() {
        return mUb().rl();
    }

    @Override // io.grpc.Pl.Dsr
    public io.grpc.j t() {
        return mUb().t();
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", mUb()).toString();
    }

    @Override // io.grpc.Pl.Dsr
    public void xMQ(List list) {
        mUb().xMQ(list);
    }
}
