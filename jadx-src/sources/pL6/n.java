package pL6;

import io.grpc.Pl;
import io.grpc.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n extends Pl {
    protected abstract Pl Uo();

    @Override // io.grpc.Pl
    public void O() {
        Uo().O();
    }

    @Override // io.grpc.Pl
    public void nr(Pl.fuX fux) {
        Uo().nr(fux);
    }

    @Override // io.grpc.Pl
    public boolean rl() {
        return Uo().rl();
    }

    @Override // io.grpc.Pl
    public void t(SPz sPz) {
        Uo().t(sPz);
    }

    public String toString() {
        return t1.Dsr.t(this).nr("delegate", Uo()).toString();
    }
}
