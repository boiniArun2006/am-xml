package DGv;

import XA.eO;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml {
    public /* synthetic */ Ml(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract eO J2(KClass kClass, Object obj);

    public abstract XA.w6 O(KClass kClass, String str);

    public abstract void n(fuX fux);

    public abstract boolean nr();

    public abstract XA.Ml rl(KClass kClass, List list);

    private Ml() {
    }

    public static /* synthetic */ XA.Ml t(Ml ml, KClass kClass, List list, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i2 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return ml.rl(kClass, list);
    }
}
