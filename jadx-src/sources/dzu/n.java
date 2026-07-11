package dzu;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final nKK f63571n = new nKK("CLOSED");

    public static final Object t(afx afxVar, long j2, Function2 function2) {
        while (true) {
            if (afxVar.f63562t >= j2 && !afxVar.gh()) {
                return Z.n(afxVar);
            }
            Object objUo = afxVar.Uo();
            if (objUo == f63571n) {
                return Z.n(f63571n);
            }
            afx afxVar2 = (afx) ((w6) objUo);
            if (afxVar2 == null) {
                afxVar2 = (afx) function2.invoke(Long.valueOf(afxVar.f63562t + 1), afxVar);
                if (afxVar.HI(afxVar2)) {
                    if (afxVar.gh()) {
                        afxVar.ty();
                    }
                }
            }
            afxVar = afxVar2;
        }
    }

    public static final w6 rl(w6 w6Var) {
        while (true) {
            Object objUo = w6Var.Uo();
            if (objUo == f63571n) {
                return w6Var;
            }
            w6 w6Var2 = (w6) objUo;
            if (w6Var2 == null) {
                if (w6Var.az()) {
                    return w6Var;
                }
            } else {
                w6Var = w6Var2;
            }
        }
    }
}
