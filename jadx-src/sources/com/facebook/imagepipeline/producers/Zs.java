package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import bA.C1653C;
import com.facebook.imagepipeline.producers.P;
import com.safedk.android.analytics.events.a;
import dX.C1954n;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Zs implements l4Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final A72.fuX f52532n;
    private final A72.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final P f52533t;

    class j implements P.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ afx f52534n;

        j(afx afxVar) {
            this.f52534n = afxVar;
        }

        @Override // com.facebook.imagepipeline.producers.P.j
        public void n() {
            Zs.this.gh(this.f52534n);
        }

        @Override // com.facebook.imagepipeline.producers.P.j
        public void onFailure(Throwable th) {
            Zs.this.qie(this.f52534n, th);
        }

        @Override // com.facebook.imagepipeline.producers.P.j
        public void rl(InputStream inputStream, int i2) throws Throwable {
            if (T5.n.nr()) {
                T5.n.n("NetworkFetcher->onResponse");
            }
            Zs.this.az(this.f52534n, inputStream, i2);
            if (T5.n.nr()) {
                T5.n.rl();
            }
        }
    }

    protected static float O(int i2, int i3) {
        return i3 > 0 ? i2 / i3 : 1.0f - ((float) Math.exp(((double) (-i2)) / 50000.0d));
    }

    protected void az(afx afxVar, InputStream inputStream, int i2) throws Throwable {
        A72.aC aCVarO = i2 > 0 ? this.f52532n.O(i2) : this.f52532n.t();
        byte[] bArr = (byte[]) this.rl.get(16384);
        while (true) {
            try {
                int i3 = inputStream.read(bArr);
                if (i3 < 0) {
                    this.f52533t.rl(afxVar, aCVarO.size());
                    KN(aCVarO, afxVar);
                    this.rl.n(bArr);
                    aCVarO.close();
                    return;
                }
                if (i3 > 0) {
                    aCVarO.write(bArr, 0, i3);
                    xMQ(aCVarO, afxVar);
                    afxVar.n().t(O(aCVarO.size(), i2));
                }
            } catch (Throwable th) {
                this.rl.n(bArr);
                aCVarO.close();
                throw th;
            }
        }
    }

    public Zs(A72.fuX fux, A72.j jVar, P p2) {
        this.f52532n = fux;
        this.rl = jVar;
        this.f52533t = p2;
    }

    private Map J2(afx afxVar, int i2) {
        if (!afxVar.nr().J2(afxVar.rl(), "NetworkFetchProducer")) {
            return null;
        }
        return this.f52533t.nr(afxVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gh(afx afxVar) {
        afxVar.nr().t(afxVar.rl(), "NetworkFetchProducer", null);
        afxVar.n().n();
    }

    protected static void mUb(A72.aC aCVar, int i2, C1954n c1954n, Pl pl, mz mzVar) throws Throwable {
        C1653C c1653c;
        Pj0.j jVarA = Pj0.j.a(aCVar.n());
        C1653C c1653c2 = null;
        try {
            c1653c = new C1653C(jVarA);
        } catch (Throwable th) {
            th = th;
        }
        try {
            c1653c.T3L(c1954n);
            c1653c.Org();
            pl.rl(c1653c, i2);
            C1653C.Uo(c1653c);
            Pj0.j.M7(jVarA);
        } catch (Throwable th2) {
            th = th2;
            c1653c2 = c1653c;
            C1653C.Uo(c1653c2);
            Pj0.j.M7(jVarA);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qie(afx afxVar, Throwable th) {
        afxVar.nr().gh(afxVar.rl(), "NetworkFetchProducer", th, null);
        afxVar.nr().rl(afxVar.rl(), "NetworkFetchProducer", false);
        afxVar.rl().U(a.f62814d);
        afxVar.n().onFailure(th);
    }

    private boolean ty(afx afxVar, mz mzVar) {
        bAP.Ml mlKN = mzVar.Uo().KN();
        if (mlKN == null || !mlKN.t() || !afxVar.rl().p5()) {
            return false;
        }
        return this.f52533t.t(afxVar);
    }

    protected void KN(A72.aC aCVar, afx afxVar) throws Throwable {
        Map mapJ2 = J2(afxVar, aCVar.size());
        InterfaceC1866p interfaceC1866pNr = afxVar.nr();
        interfaceC1866pNr.mUb(afxVar.rl(), "NetworkFetchProducer", mapJ2);
        interfaceC1866pNr.rl(afxVar.rl(), "NetworkFetchProducer", true);
        afxVar.rl().U(a.f62814d);
        mUb(aCVar, afxVar.O() | 1, afxVar.J2(), afxVar.n(), afxVar.rl());
    }

    protected long Uo() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl pl, mz mzVar) {
        mzVar.M7().nr(mzVar, "NetworkFetchProducer");
        afx afxVarO = this.f52533t.O(pl, mzVar);
        this.f52533t.n(afxVarO, new j(afxVarO));
    }

    protected void xMQ(A72.aC aCVar, afx afxVar) throws Throwable {
        if (ty(afxVar, afxVar.rl())) {
            long jUo = Uo();
            if (jUo - afxVar.t() >= 100) {
                afxVar.KN(jUo);
                afxVar.nr().KN(afxVar.rl(), "NetworkFetchProducer", "intermediate_result");
                mUb(aCVar, afxVar.O(), afxVar.J2(), afxVar.n(), afxVar.rl());
            }
        }
    }
}
