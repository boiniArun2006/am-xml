package gq;

import gq.C2144o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import pUk.eO;
import wqP.I28;

/* JADX INFO: renamed from: gq.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class C2144o {
    private static final long J2 = TimeUnit.SECONDS.toMillis(15);
    private static final long Uo = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f67814O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f67815n;
    private final t1.UGc nr;
    private final yg rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final t1.UGc f67816t;

    /* JADX INFO: renamed from: gq.o$j */
    public class j implements tmw {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private I28.n f67817n;
        private final wqP.I28 rl;

        public j(wqP.I28 i28) {
            this.rl = i28;
        }

        public static /* synthetic */ void n(j jVar) {
            wqP.QJ.n("IndexBackfiller", "Documents written: %s", Integer.valueOf(C2144o.this.nr()));
            jVar.rl(C2144o.Uo);
        }

        private void rl(long j2) {
            this.f67817n = this.rl.KN(I28.Ml.INDEX_BACKFILL, j2, new Runnable() { // from class: gq.C
                @Override // java.lang.Runnable
                public final void run() {
                    C2144o.j.n(this.f67674n);
                }
            });
        }

        @Override // gq.tmw
        public void start() {
            rl(C2144o.J2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2144o(yg ygVar, wqP.I28 i28, final g9s g9sVar) {
        this(ygVar, i28, new t1.UGc() { // from class: gq.fuX
            @Override // t1.UGc
            public final Object get() {
                return g9sVar.Ik();
            }
        }, new t1.UGc() { // from class: gq.Dsr
            @Override // t1.UGc
            public final Object get() {
                return g9sVar.XQ();
            }
        });
        Objects.requireNonNull(g9sVar);
    }

    private int KN() {
        qz qzVar = (qz) this.f67816t.get();
        HashSet hashSet = new HashSet();
        int iUo = this.f67814O;
        while (iUo > 0) {
            String strRl = qzVar.rl();
            if (strRl == null || hashSet.contains(strRl)) {
                break;
            }
            wqP.QJ.n("IndexBackfiller", "Processing collection: %s", strRl);
            iUo -= Uo(strRl, iUo);
            hashSet.add(strRl);
        }
        return this.f67814O - iUo;
    }

    private int Uo(String str, int i2) {
        qz qzVar = (qz) this.f67816t.get();
        Xo xo = (Xo) this.nr.get();
        eO.j jVarNr = qzVar.nr(str);
        Pl plGh = xo.gh(str, jVarNr, i2);
        qzVar.n(plGh.t());
        eO.j jVarO = O(jVarNr, plGh);
        wqP.QJ.n("IndexBackfiller", "Updating offset: %s", jVarO);
        qzVar.t(str, jVarO);
        return plGh.t().size();
    }

    public j J2() {
        return this.f67815n;
    }

    public int nr() {
        return ((Integer) this.rl.gh("Backfill Indexes", new wqP.s4() { // from class: gq.aC
            @Override // wqP.s4
            public final Object get() {
                return Integer.valueOf(this.f67757n.KN());
            }
        })).intValue();
    }

    private eO.j O(eO.j jVar, Pl pl) {
        Iterator it = pl.t().iterator();
        eO.j jVar2 = jVar;
        while (it.hasNext()) {
            eO.j jVarJ2 = eO.j.J2((pUk.fuX) ((Map.Entry) it.next()).getValue());
            if (jVarJ2.compareTo(jVar2) > 0) {
                jVar2 = jVarJ2;
            }
        }
        return eO.j.t(jVar2.xMQ(), jVar2.Uo(), Math.max(pl.rl(), jVar.KN()));
    }

    public C2144o(yg ygVar, wqP.I28 i28, t1.UGc uGc, t1.UGc uGc2) {
        this.f67814O = 50;
        this.rl = ygVar;
        this.f67815n = new j(i28);
        this.f67816t = uGc;
        this.nr = uGc2;
    }
}
