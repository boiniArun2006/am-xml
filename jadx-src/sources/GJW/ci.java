package GJW;

import kotlin.Result;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class ci {
    public static final r n(xuv xuvVar) {
        return new SPz(xuvVar);
    }

    public static final r rl(Object obj) {
        SPz sPz = new SPz(null);
        sPz.eF(obj);
        return sPz;
    }

    public static /* synthetic */ r t(xuv xuvVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xuvVar = null;
        }
        return n(xuvVar);
    }

    public static final boolean nr(r rVar, Object obj) {
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(obj);
        if (thM316exceptionOrNullimpl == null) {
            return rVar.eF(obj);
        }
        return rVar.n(thM316exceptionOrNullimpl);
    }
}
