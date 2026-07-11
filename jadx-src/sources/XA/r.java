package XA;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class r {
    public static final Ml J2(KType kType) {
        return ci.qie(kType);
    }

    public static final Ml O(KClass kClass) {
        return ci.gh(kClass);
    }

    public static final List Uo(DGv.Ml ml, List list, boolean z2) {
        return ci.az(ml, list, z2);
    }

    public static final Ml n(KClass kClass, List list, Function0 function0) {
        return ci.O(kClass, list, function0);
    }

    public static final Ml nr(DGv.Ml ml, KType kType) {
        return ci.mUb(ml, kType);
    }

    public static final Ml rl(DGv.Ml ml, KType kType) {
        return ci.J2(ml, kType);
    }

    public static final Ml t(KClass kClass) {
        return ci.Uo(kClass);
    }
}
