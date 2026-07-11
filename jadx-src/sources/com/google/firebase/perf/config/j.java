package com.google.firebase.perf.config;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static volatile j f60605O;
    private static final yMa.j nr = yMa.j.O();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RemoteConfigManager f60606n;
    private O2.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private r f60607t;

    private boolean T(long j2) {
        return j2 >= 0;
    }

    private boolean nHg(long j2) {
        return j2 >= 0;
    }

    private boolean rV9(long j2) {
        return j2 > 0;
    }

    private boolean v(long j2) {
        return j2 > 0;
    }

    private boolean wTp(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    private O2.CN3 HI(UGc uGc) {
        return this.rl.t(uGc.rl());
    }

    private O2.CN3 O(UGc uGc) {
        return this.f60607t.Uo(uGc.n());
    }

    private O2.CN3 S(UGc uGc) {
        return this.f60606n.getDouble(uGc.t());
    }

    public static synchronized j Uo() {
        try {
            if (f60605O == null) {
                f60605O = new j(null, null, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60605O;
    }

    private O2.CN3 WPU(UGc uGc) {
        return this.f60606n.getLong(uGc.t());
    }

    private O2.CN3 XQ(UGc uGc) {
        return this.f60606n.getBoolean(uGc.t());
    }

    private O2.CN3 aYN(UGc uGc) {
        return this.f60606n.getString(uGc.t());
    }

    private O2.CN3 ck(UGc uGc) {
        return this.rl.O(uGc.rl());
    }

    private O2.CN3 nr(UGc uGc) {
        return this.f60607t.J2(uGc.n());
    }

    private O2.CN3 rl(UGc uGc) {
        return this.f60607t.rl(uGc.n());
    }

    private O2.CN3 t(UGc uGc) {
        return this.f60607t.t(uGc.n());
    }

    private O2.CN3 ty(UGc uGc) {
        return this.rl.rl(uGc.rl());
    }

    public void Xw(O2.Wre wre) {
        this.rl = wre;
    }

    public void bzg(Context context) {
        nr.xMQ(O2.Pl.rl(context));
        this.f60607t.KN(context);
    }

    public j(RemoteConfigManager remoteConfigManager, O2.Wre wre, r rVar) {
        this.f60606n = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.rl = wre == null ? new O2.Wre() : wre;
        this.f60607t = rVar == null ? r.O() : rVar;
    }

    private boolean N(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(Li.j.rl)) {
                return true;
            }
        }
        return false;
    }

    private boolean gh() {
        o oVarO = o.O();
        O2.CN3 cn3Rl = rl(oVarO);
        O2.CN3 cn3XQ = XQ(oVarO);
        if (cn3XQ.nr()) {
            if (this.f60606n.isLastFetchFailed()) {
                return false;
            }
            Boolean bool = (Boolean) cn3XQ.t();
            if (cn3Rl == null || !cn3Rl.nr() || cn3Rl.t() != bool) {
                this.f60607t.qie(oVarO.n(), bool.booleanValue());
            }
            return bool.booleanValue();
        }
        if (cn3Rl.nr()) {
            return ((Boolean) cn3Rl.t()).booleanValue();
        }
        return oVarO.nr().booleanValue();
    }

    private boolean qie() {
        C cO2 = C.O();
        O2.CN3 cn3O = O(cO2);
        O2.CN3 cn3AYN = aYN(cO2);
        if (cn3AYN.nr()) {
            String str = (String) cn3AYN.t();
            if (cn3O == null || !cn3O.nr() || !((String) cn3O.t()).equals(str)) {
                this.f60607t.gh(cO2.n(), str);
            }
            return N(str);
        }
        if (cn3O.nr()) {
            return N((String) cn3O.t());
        }
        return N(cO2.nr());
    }

    public long E2() {
        l3D l3dO = l3D.O();
        O2.CN3 cn3WPU = WPU(l3dO);
        if (cn3WPU.nr() && T(((Long) cn3WPU.t()).longValue())) {
            this.f60607t.mUb(l3dO.n(), ((Long) cn3WPU.t()).longValue());
            return ((Long) cn3WPU.t()).longValue();
        }
        O2.CN3 cn3Nr = nr(l3dO);
        if (cn3Nr.nr() && T(((Long) cn3Nr.t()).longValue())) {
            return ((Long) cn3Nr.t()).longValue();
        }
        return l3dO.nr().longValue();
    }

    public long Ik() {
        CN3 cn3O = CN3.O();
        O2.CN3 cn3WPU = WPU(cn3O);
        if (cn3WPU.nr() && T(((Long) cn3WPU.t()).longValue())) {
            this.f60607t.mUb(cn3O.n(), ((Long) cn3WPU.t()).longValue());
            return ((Long) cn3WPU.t()).longValue();
        }
        O2.CN3 cn3Nr = nr(cn3O);
        if (cn3Nr.nr() && T(((Long) cn3Nr.t()).longValue())) {
            return ((Long) cn3Nr.t()).longValue();
        }
        return cn3O.nr().longValue();
    }

    public double J2() {
        I28 i28O = I28.O();
        O2.CN3 cn3HI = HI(i28O);
        if (cn3HI.nr()) {
            double dDoubleValue = ((Double) cn3HI.t()).doubleValue() / 100.0d;
            if (wTp(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        O2.CN3 cn3S = S(i28O);
        if (cn3S.nr() && wTp(((Double) cn3S.t()).doubleValue())) {
            this.f60607t.xMQ(i28O.n(), ((Double) cn3S.t()).doubleValue());
            return ((Double) cn3S.t()).doubleValue();
        }
        O2.CN3 cn3T = t(i28O);
        if (cn3T.nr() && wTp(((Double) cn3T.t()).doubleValue())) {
            return ((Double) cn3T.t()).doubleValue();
        }
        return i28O.nr().doubleValue();
    }

    public boolean KN() {
        Ml mlO = Ml.O();
        O2.CN3 cn3Ty = ty(mlO);
        if (cn3Ty.nr()) {
            return ((Boolean) cn3Ty.t()).booleanValue();
        }
        O2.CN3 cn3XQ = XQ(mlO);
        if (cn3XQ.nr()) {
            this.f60607t.qie(mlO.n(), ((Boolean) cn3XQ.t()).booleanValue());
            return ((Boolean) cn3XQ.t()).booleanValue();
        }
        O2.CN3 cn3Rl = rl(mlO);
        if (cn3Rl.nr()) {
            return ((Boolean) cn3Rl.t()).booleanValue();
        }
        return mlO.nr().booleanValue();
    }

    public long ViF() {
        qz qzVarO = qz.O();
        O2.CN3 cn3Ck = ck(qzVarO);
        if (cn3Ck.nr() && nHg(((Long) cn3Ck.t()).longValue())) {
            return ((Long) cn3Ck.t()).longValue();
        }
        O2.CN3 cn3WPU = WPU(qzVarO);
        if (cn3WPU.nr() && nHg(((Long) cn3WPU.t()).longValue())) {
            this.f60607t.mUb(qzVarO.n(), ((Long) cn3WPU.t()).longValue());
            return ((Long) cn3WPU.t()).longValue();
        }
        O2.CN3 cn3Nr = nr(qzVarO);
        if (cn3Nr.nr() && nHg(((Long) cn3Nr.t()).longValue())) {
            return ((Long) cn3Nr.t()).longValue();
        }
        return qzVarO.nr().longValue();
    }

    public double X() {
        s4 s4VarJ2 = s4.J2();
        O2.CN3 cn3S = S(s4VarJ2);
        if (cn3S.nr() && wTp(((Double) cn3S.t()).doubleValue())) {
            this.f60607t.xMQ(s4VarJ2.n(), ((Double) cn3S.t()).doubleValue());
            return ((Double) cn3S.t()).doubleValue();
        }
        O2.CN3 cn3T = t(s4VarJ2);
        if (cn3T.nr() && wTp(((Double) cn3T.t()).doubleValue())) {
            return ((Double) cn3T.t()).doubleValue();
        }
        if (this.f60606n.isLastFetchFailed()) {
            return s4VarJ2.O().doubleValue();
        }
        return s4VarJ2.nr().doubleValue();
    }

    public long Z() {
        aC aCVarO = aC.O();
        O2.CN3 cn3WPU = WPU(aCVarO);
        if (cn3WPU.nr() && rV9(((Long) cn3WPU.t()).longValue())) {
            this.f60607t.mUb(aCVarO.n(), ((Long) cn3WPU.t()).longValue());
            return ((Long) cn3WPU.t()).longValue();
        }
        O2.CN3 cn3Nr = nr(aCVarO);
        if (cn3Nr.nr() && rV9(((Long) cn3Nr.t()).longValue())) {
            return ((Long) cn3Nr.t()).longValue();
        }
        return aCVarO.nr().longValue();
    }

    public boolean az() {
        if (gh() && !qie()) {
            return true;
        }
        return false;
    }

    public long e() {
        C1915c c1915cO = C1915c.O();
        O2.CN3 cn3WPU = WPU(c1915cO);
        if (cn3WPU.nr() && T(((Long) cn3WPU.t()).longValue())) {
            this.f60607t.mUb(c1915cO.n(), ((Long) cn3WPU.t()).longValue());
            return ((Long) cn3WPU.t()).longValue();
        }
        O2.CN3 cn3Nr = nr(c1915cO);
        if (cn3Nr.nr() && T(((Long) cn3Nr.t()).longValue())) {
            return ((Long) cn3Nr.t()).longValue();
        }
        return c1915cO.nr().longValue();
    }

    public double fD() {
        QJ qjJ2 = QJ.J2();
        O2.CN3 cn3HI = HI(qjJ2);
        if (cn3HI.nr()) {
            double dDoubleValue = ((Double) cn3HI.t()).doubleValue() / 100.0d;
            if (wTp(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        O2.CN3 cn3S = S(qjJ2);
        if (cn3S.nr() && wTp(((Double) cn3S.t()).doubleValue())) {
            this.f60607t.xMQ(qjJ2.n(), ((Double) cn3S.t()).doubleValue());
            return ((Double) cn3S.t()).doubleValue();
        }
        O2.CN3 cn3T = t(qjJ2);
        if (cn3T.nr() && wTp(((Double) cn3T.t()).doubleValue())) {
            return ((Double) cn3T.t()).doubleValue();
        }
        if (this.f60606n.isLastFetchFailed()) {
            return qjJ2.O().doubleValue();
        }
        return qjJ2.nr().doubleValue();
    }

    public long g() {
        Xo xoO = Xo.O();
        O2.CN3 cn3Ck = ck(xoO);
        if (cn3Ck.nr() && v(((Long) cn3Ck.t()).longValue())) {
            return ((Long) cn3Ck.t()).longValue();
        }
        O2.CN3 cn3WPU = WPU(xoO);
        if (cn3WPU.nr() && v(((Long) cn3WPU.t()).longValue())) {
            this.f60607t.mUb(xoO.n(), ((Long) cn3WPU.t()).longValue());
            return ((Long) cn3WPU.t()).longValue();
        }
        O2.CN3 cn3Nr = nr(xoO);
        if (cn3Nr.nr() && v(((Long) cn3Nr.t()).longValue())) {
            return ((Long) cn3Nr.t()).longValue();
        }
        return xoO.nr().longValue();
    }

    public long iF() {
        z zVarJ2 = z.J2();
        O2.CN3 cn3Ck = ck(zVarJ2);
        if (cn3Ck.nr() && nHg(((Long) cn3Ck.t()).longValue())) {
            return ((Long) cn3Ck.t()).longValue();
        }
        O2.CN3 cn3WPU = WPU(zVarJ2);
        if (cn3WPU.nr() && nHg(((Long) cn3WPU.t()).longValue())) {
            this.f60607t.mUb(zVarJ2.n(), ((Long) cn3WPU.t()).longValue());
            return ((Long) cn3WPU.t()).longValue();
        }
        O2.CN3 cn3Nr = nr(zVarJ2);
        if (cn3Nr.nr() && nHg(((Long) cn3Nr.t()).longValue())) {
            return ((Long) cn3Nr.t()).longValue();
        }
        if (this.f60606n.isLastFetchFailed()) {
            return zVarJ2.O().longValue();
        }
        return zVarJ2.nr().longValue();
    }

    public Boolean mUb() {
        if (xMQ().booleanValue()) {
            return Boolean.FALSE;
        }
        w6 w6VarNr = w6.nr();
        O2.CN3 cn3Rl = rl(w6VarNr);
        if (cn3Rl.nr()) {
            return (Boolean) cn3Rl.t();
        }
        O2.CN3 cn3Ty = ty(w6VarNr);
        if (cn3Ty.nr()) {
            return (Boolean) cn3Ty.t();
        }
        return null;
    }

    public String n() {
        String strJ2;
        Wre wreO = Wre.O();
        if (Li.j.f6185n.booleanValue()) {
            return wreO.nr();
        }
        String strT = wreO.t();
        long jLongValue = -1;
        if (strT != null) {
            jLongValue = ((Long) this.f60606n.getRemoteConfigValueOrDefault(strT, -1L)).longValue();
        }
        String strN = wreO.n();
        if (Wre.Uo(jLongValue) && (strJ2 = Wre.J2(jLongValue)) != null) {
            this.f60607t.gh(strN, strJ2);
            return strJ2;
        }
        O2.CN3 cn3O = O(wreO);
        if (cn3O.nr()) {
            return (String) cn3O.t();
        }
        return wreO.nr();
    }

    public long nY() {
        Pl plJ2 = Pl.J2();
        O2.CN3 cn3Ck = ck(plJ2);
        if (cn3Ck.nr() && nHg(((Long) cn3Ck.t()).longValue())) {
            return ((Long) cn3Ck.t()).longValue();
        }
        O2.CN3 cn3WPU = WPU(plJ2);
        if (cn3WPU.nr() && nHg(((Long) cn3WPU.t()).longValue())) {
            this.f60607t.mUb(plJ2.n(), ((Long) cn3WPU.t()).longValue());
            return ((Long) cn3WPU.t()).longValue();
        }
        O2.CN3 cn3Nr = nr(plJ2);
        if (cn3Nr.nr() && nHg(((Long) cn3Nr.t()).longValue())) {
            return ((Long) cn3Nr.t()).longValue();
        }
        if (this.f60606n.isLastFetchFailed()) {
            return plJ2.O().longValue();
        }
        return plJ2.nr().longValue();
    }

    public double o() {
        Dsr dsrJ2 = Dsr.J2();
        O2.CN3 cn3S = S(dsrJ2);
        if (cn3S.nr() && wTp(((Double) cn3S.t()).doubleValue())) {
            this.f60607t.xMQ(dsrJ2.n(), ((Double) cn3S.t()).doubleValue());
            return ((Double) cn3S.t()).doubleValue();
        }
        O2.CN3 cn3T = t(dsrJ2);
        if (cn3T.nr() && wTp(((Double) cn3T.t()).doubleValue())) {
            return ((Double) cn3T.t()).doubleValue();
        }
        if (this.f60606n.isLastFetchFailed()) {
            return dsrJ2.O().doubleValue();
        }
        return dsrJ2.nr().doubleValue();
    }

    public long r() {
        fuX fuxO = fuX.O();
        O2.CN3 cn3WPU = WPU(fuxO);
        if (cn3WPU.nr() && T(((Long) cn3WPU.t()).longValue())) {
            this.f60607t.mUb(fuxO.n(), ((Long) cn3WPU.t()).longValue());
            return ((Long) cn3WPU.t()).longValue();
        }
        O2.CN3 cn3Nr = nr(fuxO);
        if (cn3Nr.nr() && T(((Long) cn3Nr.t()).longValue())) {
            return ((Long) cn3Nr.t()).longValue();
        }
        return fuxO.nr().longValue();
    }

    public boolean s7N() {
        Boolean boolMUb = mUb();
        if ((boolMUb == null || boolMUb.booleanValue()) && az()) {
            return true;
        }
        return false;
    }

    public long te() {
        eO eOVarO = eO.O();
        O2.CN3 cn3Ck = ck(eOVarO);
        if (cn3Ck.nr() && nHg(((Long) cn3Ck.t()).longValue())) {
            return ((Long) cn3Ck.t()).longValue();
        }
        O2.CN3 cn3WPU = WPU(eOVarO);
        if (cn3WPU.nr() && nHg(((Long) cn3WPU.t()).longValue())) {
            this.f60607t.mUb(eOVarO.n(), ((Long) cn3WPU.t()).longValue());
            return ((Long) cn3WPU.t()).longValue();
        }
        O2.CN3 cn3Nr = nr(eOVarO);
        if (cn3Nr.nr() && nHg(((Long) cn3Nr.t()).longValue())) {
            return ((Long) cn3Nr.t()).longValue();
        }
        return eOVarO.nr().longValue();
    }

    public Boolean xMQ() {
        n nVarO = n.O();
        O2.CN3 cn3Ty = ty(nVarO);
        if (cn3Ty.nr()) {
            return (Boolean) cn3Ty.t();
        }
        return nVarO.nr();
    }
}
