package jc;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {
    public static final uBO.lej gh;
    public static final uBO.lej mUb;
    public static final uBO.lej xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f69500n = new I28().nr();
    public static final String rl = new eO().nr();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f69501t = new s4().nr();
    public static final String nr = new fuX().nr();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f69499O = new Ew().nr();
    public static final String J2 = new DAz().nr();
    public static final String Uo = new ci().nr();
    public static final String KN = new qf().nr();

    static {
        uBO.lej lejVarXw = uBO.lej.Xw();
        xMQ = lejVarXw;
        mUb = lejVarXw;
        gh = lejVarXw;
        try {
            n();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void n() {
        rl();
    }

    public static void rl() {
        Ml.O();
        hw.Xo.rl();
        I28.ck(true);
        eO.HI(true);
        if (mi.j.n()) {
            return;
        }
        fuX.HI(true);
        s4.ck(true);
        ci.az(true);
        Ew.az(true);
        DAz.az(true);
        qf.az(true);
    }
}
