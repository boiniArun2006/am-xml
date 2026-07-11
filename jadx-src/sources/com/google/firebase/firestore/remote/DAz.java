package com.google.firebase.firestore.remote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import uB.Q;
import wqP.AbstractC2418c;
import wqP.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class DAz extends w6 {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final com.google.protobuf.C f60374S = com.google.protobuf.C.EMPTY;
    private com.google.protobuf.C XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected boolean f60375Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r f60376o;

    public interface j extends Pe.eO {
        void O(pUk.UGc uGc, List list);

        void t();
    }

    @Override // com.google.firebase.firestore.remote.w6
    public void Z() {
        this.f60375Z = false;
        super.Z();
    }

    @Override // com.google.firebase.firestore.remote.w6
    protected void S() {
        if (this.f60375Z) {
            fD(Collections.EMPTY_LIST);
        }
    }

    boolean ViF() {
        return this.f60375Z;
    }

    com.google.protobuf.C aYN() {
        return this.XQ;
    }

    DAz(QJ qj, wqP.I28 i28, r rVar, j jVar) {
        super(qj, uB.qz.rl(), i28, I28.Ml.WRITE_STREAM_CONNECTION_BACKOFF, I28.Ml.WRITE_STREAM_IDLE, I28.Ml.HEALTH_CHECK_TIMEOUT, jVar);
        this.f60375Z = false;
        this.XQ = f60374S;
        this.f60376o = rVar;
    }

    @Override // com.google.firebase.firestore.remote.w6
    public /* bridge */ /* synthetic */ void XQ() {
        super.XQ();
    }

    @Override // com.google.firebase.firestore.remote.w6
    public /* bridge */ /* synthetic */ boolean az() {
        return super.az();
    }

    void fD(List list) {
        wqP.n.t(az(), "Writing mutations requires an opened stream", new Object[0]);
        wqP.n.t(this.f60375Z, "Handshake must be complete before writing mutations", new Object[0]);
        Q.n nVarHI = uB.Q.HI();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nVarHI.xMQ(this.f60376o.wTp((BC.Wre) it.next()));
        }
        nVarHI.gh(this.XQ);
        WPU((uB.Q) nVarHI.build());
    }

    @Override // com.google.firebase.firestore.remote.w6
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void Ik(uB.r rVar) {
        this.XQ = rVar.gh();
        this.qie.O();
        pUk.UGc uGcS = this.f60376o.S(rVar.xMQ());
        int iAz = rVar.az();
        ArrayList arrayList = new ArrayList(iAz);
        for (int i2 = 0; i2 < iAz; i2++) {
            arrayList.add(this.f60376o.az(rVar.qie(i2), uGcS));
        }
        ((j) this.az).O(uGcS, arrayList);
    }

    void iF() {
        wqP.n.t(az(), "Writing handshake requires an opened stream", new Object[0]);
        wqP.n.t(!this.f60375Z, "Handshake already completed", new Object[0]);
        WPU((uB.Q) uB.Q.HI().mUb(this.f60376o.n()).build());
    }

    @Override // com.google.firebase.firestore.remote.w6
    /* JADX INFO: renamed from: nY, reason: merged with bridge method [inline-methods] */
    public void ck(uB.r rVar) {
        this.XQ = rVar.gh();
        this.f60375Z = true;
        ((j) this.az).t();
    }

    @Override // com.google.firebase.firestore.remote.w6
    public /* bridge */ /* synthetic */ void qie() {
        super.qie();
    }

    void te(com.google.protobuf.C c2) {
        this.XQ = (com.google.protobuf.C) AbstractC2418c.rl(c2);
    }

    @Override // com.google.firebase.firestore.remote.w6
    public /* bridge */ /* synthetic */ boolean ty() {
        return super.ty();
    }
}
