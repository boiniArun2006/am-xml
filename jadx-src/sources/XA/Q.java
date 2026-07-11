package XA;

import Du.AbstractC1341t;
import Du.Pp;
import Du.c7r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pp f11780n = Du.Xo.n(new Function1() { // from class: XA.z
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Q.gh((KClass) obj);
        }
    });
    private static final Pp rl = Du.Xo.n(new Function1() { // from class: XA.QJ
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Q.qie((KClass) obj);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final c7r f11781t = Du.Xo.rl(new Function2() { // from class: XA.l3D
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Q.Uo((KClass) obj, (List) obj2);
        }
    });
    private static final c7r nr = Du.Xo.rl(new Function2() { // from class: XA.c
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Q.xMQ((KClass) obj, (List) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier KN(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KClassifier mUb(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ml Uo(KClass clazz, final List types) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List listUo = r.Uo(DGv.Wre.n(), types, true);
        Intrinsics.checkNotNull(listUo);
        return r.n(clazz, listUo, new Function0() { // from class: XA.s4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Q.KN(types);
            }
        });
    }

    public static final Ml az(KClass clazz, boolean z2) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (z2) {
            return rl.n(clazz);
        }
        Ml mlN = f11780n.n(clazz);
        if (mlN != null) {
            return mlN;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ml gh(KClass it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Ml mlO = r.O(it);
        if (mlO != null) {
            return mlO;
        }
        if (AbstractC1341t.qie(it)) {
            return new fuX(it);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ml qie(KClass it) {
        Ml mlZ;
        Intrinsics.checkNotNullParameter(it, "it");
        Ml mlO = r.O(it);
        if (mlO == null) {
            mlO = AbstractC1341t.qie(it) ? new fuX(it) : null;
        }
        if (mlO == null || (mlZ = WY.j.Z(mlO)) == null) {
            return null;
        }
        return mlZ;
    }

    public static final Object ty(KClass clazz, List types, boolean z2) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        return !z2 ? f11781t.n(clazz, types) : nr.n(clazz, types);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ml xMQ(KClass clazz, final List types) {
        Ml mlZ;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List listUo = r.Uo(DGv.Wre.n(), types, true);
        Intrinsics.checkNotNull(listUo);
        Ml mlN = r.n(clazz, listUo, new Function0() { // from class: XA.UGc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Q.mUb(types);
            }
        });
        if (mlN == null || (mlZ = WY.j.Z(mlN)) == null) {
            return null;
        }
        return mlZ;
    }
}
