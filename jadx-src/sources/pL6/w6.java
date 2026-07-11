package pL6;

import JP.M;
import JP.qz;
import io.grpc.Pl;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class w6 extends Pl.I28 {
    protected abstract Pl.I28 Uo();

    @Override // io.grpc.Pl.I28
    public void J2(qz qzVar, Pl.aC aCVar) {
        Uo().J2(qzVar, aCVar);
    }

    @Override // io.grpc.Pl.I28
    public void O() {
        Uo().O();
    }

    @Override // io.grpc.Pl.I28
    public Pl.Dsr n(Pl.n nVar) {
        return Uo().n(nVar);
    }

    @Override // io.grpc.Pl.I28
    public M nr() {
        return Uo().nr();
    }

    @Override // io.grpc.Pl.I28
    public JP.Ml rl() {
        return Uo().rl();
    }

    @Override // io.grpc.Pl.I28
    public ScheduledExecutorService t() {
        return Uo().t();
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", Uo()).toString();
    }
}
