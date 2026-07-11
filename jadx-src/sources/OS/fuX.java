package OS;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class fuX {
    public static final Object J2(com.android.billingclient.api.j jVar, j jVar2, Continuation continuation) {
        final GJW.r rVarT = GJW.ci.t(null, 1, null);
        jVar.n(jVar2, new n() { // from class: OS.Wre
            @Override // OS.n
            public final void n(com.android.billingclient.api.Ml ml) {
                fuX.O(rVarT, ml);
            }
        });
        return rVarT.await(continuation);
    }

    public static final Object KN(com.android.billingclient.api.j jVar, com.android.billingclient.api.CN3 cn3, Continuation continuation) {
        final GJW.r rVarT = GJW.ci.t(null, 1, null);
        jVar.O(cn3, new Pl() { // from class: OS.I28
            @Override // OS.Pl
            public final void n(com.android.billingclient.api.Ml ml, List list) {
                fuX.nr(rVarT, ml, list);
            }
        });
        return rVarT.await(continuation);
    }

    public static final Object Uo(com.android.billingclient.api.j jVar, aC aCVar, Continuation continuation) {
        final GJW.r rVarT = GJW.ci.t(null, 1, null);
        jVar.rl(aCVar, new C() { // from class: OS.Ml
            @Override // OS.C
            public final void n(com.android.billingclient.api.Ml ml, String str) {
                fuX.n(rVarT, ml, str);
            }
        });
        return rVarT.await(continuation);
    }

    public static final Object mUb(com.android.billingclient.api.j jVar, UGc uGc, Continuation continuation) {
        final GJW.r rVarT = GJW.ci.t(null, 1, null);
        jVar.Uo(uGc, new QJ() { // from class: OS.w6
            @Override // OS.QJ
            public final void n(com.android.billingclient.api.Ml ml, List list) {
                fuX.rl(rVarT, ml, list);
            }
        });
        return rVarT.await(continuation);
    }

    public static final Object xMQ(com.android.billingclient.api.j jVar, s4 s4Var, Continuation continuation) {
        final GJW.r rVarT = GJW.ci.t(null, 1, null);
        jVar.J2(s4Var, new eO() { // from class: OS.CN3
            @Override // OS.eO
            public final void n(com.android.billingclient.api.Ml ml, List list) {
                fuX.t(rVarT, ml, list);
            }
        });
        return rVarT.await(continuation);
    }

    public static /* synthetic */ void O(GJW.r deferred, com.android.billingclient.api.Ml ml) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.checkNotNull(ml);
        deferred.eF(ml);
    }

    public static /* synthetic */ void n(GJW.r deferred, com.android.billingclient.api.Ml ml, String str) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.checkNotNull(ml);
        deferred.eF(new o(ml, str));
    }

    public static /* synthetic */ void nr(GJW.r deferred, com.android.billingclient.api.Ml ml, List list) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.checkNotNull(ml);
        deferred.eF(new Xo(ml, list));
    }

    public static /* synthetic */ void rl(GJW.r deferred, com.android.billingclient.api.Ml ml, List list) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.checkNotNull(ml);
        Intrinsics.checkNotNull(list);
        deferred.eF(new l3D(ml, list));
    }

    public static /* synthetic */ void t(GJW.r deferred, com.android.billingclient.api.Ml ml, List list) {
        Intrinsics.checkNotNullParameter(deferred, "$deferred");
        Intrinsics.checkNotNull(ml);
        deferred.eF(new C1423z(ml, list));
    }
}
