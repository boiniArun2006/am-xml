package io.grpc.internal;

import JP.Ml;
import JP.r;
import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class Xo extends JP.Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eO f68404n;
    private final Pmq rl;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f68405n;

        static {
            int[] iArr = new int[Ml.j.values().length];
            f68405n = iArr;
            try {
                iArr[Ml.j.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68405n[Ml.j.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68405n[Ml.j.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static Level J2(Ml.j jVar) {
        int i2 = j.f68405n[jVar.ordinal()];
        return (i2 == 1 || i2 == 2) ? Level.FINE : i2 != 3 ? Level.FINEST : Level.FINER;
    }

    private void KN(Ml.j jVar, String str) {
        if (jVar == Ml.j.DEBUG) {
            return;
        }
        this.f68404n.J2(new r.j().rl(str).t(Uo(jVar)).O(this.rl.n()).n());
    }

    private static r.n Uo(Ml.j jVar) {
        int i2 = j.f68405n[jVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? r.n.CT_INFO : r.n.CT_WARNING : r.n.CT_ERROR;
    }

    private boolean t(Ml.j jVar) {
        return jVar != Ml.j.DEBUG && this.f68404n.t();
    }

    @Override // JP.Ml
    public void n(Ml.j jVar, String str) {
        nr(this.f68404n.rl(), jVar, str);
        if (t(jVar)) {
            KN(jVar, str);
        }
    }

    Xo(eO eOVar, Pmq pmq) {
        this.f68404n = (eO) t1.Xo.ck(eOVar, "tracer");
        this.rl = (Pmq) t1.Xo.ck(pmq, "time");
    }

    static void O(JP.afx afxVar, Ml.j jVar, String str, Object... objArr) {
        Level levelJ2 = J2(jVar);
        if (eO.J2.isLoggable(levelJ2)) {
            eO.nr(afxVar, levelJ2, MessageFormat.format(str, objArr));
        }
    }

    static void nr(JP.afx afxVar, Ml.j jVar, String str) {
        Level levelJ2 = J2(jVar);
        if (eO.J2.isLoggable(levelJ2)) {
            eO.nr(afxVar, levelJ2, str);
        }
    }

    @Override // JP.Ml
    public void rl(Ml.j jVar, String str, Object... objArr) {
        String str2;
        Level levelJ2 = J2(jVar);
        if (!t(jVar) && !eO.J2.isLoggable(levelJ2)) {
            str2 = null;
        } else {
            str2 = MessageFormat.format(str, objArr);
        }
        n(jVar, str2);
    }
}
