package Pe;

import io.grpc.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class n implements C {
    private static final QJ.CN3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final QJ.CN3 f7733O;
    private static final QJ.CN3 nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oSp.n f7734n;
    private final oSp.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.google.firebase.qz f7735t;

    static {
        QJ.Ml ml = QJ.f68177O;
        nr = QJ.CN3.O("x-firebase-client-log-type", ml);
        f7733O = QJ.CN3.O("x-firebase-client", ml);
        J2 = QJ.CN3.O("x-firebase-gmpid", ml);
    }

    private void rl(QJ qj) {
        com.google.firebase.qz qzVar = this.f7735t;
        if (qzVar == null) {
            return;
        }
        String strT = qzVar.t();
        if (strT.length() != 0) {
            qj.ck(J2, strT);
        }
    }

    @Override // Pe.C
    public void n(QJ qj) {
        if (this.f7734n.get() == null || this.rl.get() == null) {
            return;
        }
        int iRl = ((Ip.aC) this.f7734n.get()).rl("fire-fst").rl();
        if (iRl != 0) {
            qj.ck(nr, Integer.toString(iRl));
        }
        qj.ck(f7733O, ((N03.Dsr) this.rl.get()).getUserAgent());
        rl(qj);
    }

    public n(oSp.n nVar, oSp.n nVar2, com.google.firebase.qz qzVar) {
        this.rl = nVar;
        this.f7734n = nVar2;
        this.f7735t = qzVar;
    }
}
