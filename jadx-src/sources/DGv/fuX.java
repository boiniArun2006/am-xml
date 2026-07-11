package DGv;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface fuX {
    /* JADX INFO: Access modifiers changed from: private */
    static XA.Ml n(XA.Ml ml, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ml;
    }

    void J2(KClass kClass, Function1 function1);

    void O(KClass kClass, KClass kClass2, XA.Ml ml);

    void Uo(KClass kClass, Function1 function1);

    void t(KClass kClass, Function1 function1);

    default void nr(KClass kClass, final XA.Ml serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Uo(kClass, new Function1() { // from class: DGv.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.n(serializer, (List) obj);
            }
        });
    }
}
