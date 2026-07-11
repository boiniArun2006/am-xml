package sL;

import java.util.concurrent.Executor;
import t1.Xo;

/* JADX INFO: renamed from: sL.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class AbstractC2362n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.n f73209n;
    private final io.grpc.n rl;

    /* JADX INFO: renamed from: sL.n$j */
    public interface j {
        AbstractC2362n n(JP.n nVar, io.grpc.n nVar2);
    }

    protected abstract AbstractC2362n n(JP.n nVar, io.grpc.n nVar2);

    public final AbstractC2362n nr(Executor executor) {
        return n(this.f73209n, this.rl.ty(executor));
    }

    public final io.grpc.n rl() {
        return this.rl;
    }

    public final AbstractC2362n t(JP.j jVar) {
        return n(this.f73209n, this.rl.qie(jVar));
    }

    protected AbstractC2362n(JP.n nVar, io.grpc.n nVar2) {
        this.f73209n = (JP.n) Xo.ck(nVar, "channel");
        this.rl = (io.grpc.n) Xo.ck(nVar2, "callOptions");
    }
}
