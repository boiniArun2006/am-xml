package com.google.firebase.firestore.remote;

import gq.oJ;
import java.util.Map;
import uB.Pl;
import wqP.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class nKK extends w6 {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final com.google.protobuf.C f60448Z = com.google.protobuf.C.EMPTY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r f60449o;

    interface j extends Pe.eO {
        void nr(pUk.UGc uGc, Z z2);
    }

    @Override // com.google.firebase.firestore.remote.w6
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public void Ik(uB.Xo xo) {
        this.qie.O();
        Z zAYN = this.f60449o.aYN(xo);
        ((j) this.az).nr(this.f60449o.WPU(xo), zAYN);
    }

    nKK(QJ qj, wqP.I28 i28, r rVar, j jVar) {
        super(qj, uB.qz.n(), i28, I28.Ml.LISTEN_STREAM_CONNECTION_BACKOFF, I28.Ml.LISTEN_STREAM_IDLE, I28.Ml.HEALTH_CHECK_TIMEOUT, jVar);
        this.f60449o = rVar;
    }

    @Override // com.google.firebase.firestore.remote.w6
    public /* bridge */ /* synthetic */ void XQ() {
        super.XQ();
    }

    @Override // com.google.firebase.firestore.remote.w6
    public /* bridge */ /* synthetic */ void Z() {
        super.Z();
    }

    @Override // com.google.firebase.firestore.remote.w6
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public void ck(uB.Xo xo) {
        Ik(xo);
    }

    @Override // com.google.firebase.firestore.remote.w6
    public /* bridge */ /* synthetic */ boolean az() {
        return super.az();
    }

    public void g(oJ oJVar) {
        wqP.n.t(az(), "Watching queries requires an open stream", new Object[0]);
        Pl.n nVarMUb = uB.Pl.ck().gh(this.f60449o.n()).mUb(this.f60449o.U(oJVar));
        Map mapS7N = this.f60449o.s7N(oJVar);
        if (mapS7N != null) {
            nVarMUb.xMQ(mapS7N);
        }
        WPU((uB.Pl) nVarMUb.build());
    }

    public void nY(int i2) {
        wqP.n.t(az(), "Unwatching targets requires an open stream", new Object[0]);
        WPU((uB.Pl) uB.Pl.ck().gh(this.f60449o.n()).qie(i2).build());
    }

    @Override // com.google.firebase.firestore.remote.w6
    public /* bridge */ /* synthetic */ void qie() {
        super.qie();
    }

    @Override // com.google.firebase.firestore.remote.w6
    public /* bridge */ /* synthetic */ boolean ty() {
        return super.ty();
    }
}
