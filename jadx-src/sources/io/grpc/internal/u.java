package io.grpc.internal;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import io.grpc.internal.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class u extends QaP {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final io.grpc.w6[] f68788O;
    private final l3D.j nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final io.grpc.SPz f68789t;

    public u(io.grpc.SPz sPz, io.grpc.w6[] w6VarArr) {
        this(sPz, l3D.j.PROCESSED, w6VarArr);
    }

    public u(io.grpc.SPz sPz, l3D.j jVar, io.grpc.w6[] w6VarArr) {
        t1.Xo.O(!sPz.HI(), "error must not be OK");
        this.f68789t = sPz;
        this.nr = jVar;
        this.f68788O = w6VarArr;
    }

    @Override // io.grpc.internal.QaP, io.grpc.internal.QJ
    public void ck(l3D l3d) {
        t1.Xo.S(!this.rl, "already started");
        this.rl = true;
        for (io.grpc.w6 w6Var : this.f68788O) {
            w6Var.xMQ(this.f68789t);
        }
        l3d.nr(this.f68789t, this.nr, new io.grpc.QJ());
    }

    @Override // io.grpc.internal.QaP, io.grpc.internal.QJ
    public void ty(yg ygVar) {
        ygVar.rl(MRAIDPresenter.ERROR, this.f68789t).rl("progress", this.nr);
    }
}
