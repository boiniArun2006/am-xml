package TFv;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Lu {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final dzu.nKK f10292n = new dzu.nKK("NONE");
    private static final dzu.nKK rl = new dzu.nKK("PENDING");

    public static final SPz n(Object obj) {
        if (obj == null) {
            obj = teV.z.f73659n;
        }
        return new vd(obj);
    }

    public static final Wre nr(rv6 rv6Var, CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || jVar != ILs.j.f4187t) ? nKK.O(rv6Var, coroutineContext, i2, jVar) : rv6Var;
    }
}
