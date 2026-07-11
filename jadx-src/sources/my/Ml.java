package my;

import K6D.Wre;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pq.I28;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Ml {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(fE.j it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.n().name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pq.Ml nr(x0X.n result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof n.C1266n) {
            return I28.n(pq.n.O("error_message", ((fE.j) ((n.C1266n) result).n()).rl()));
        }
        if (!(result instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        ((n.w6) result).n();
        return new pq.Ml();
    }

    public static final Object t(rB.Ml ml, ajd.j jVar, Function1 function1, Continuation continuation) {
        return Wre.rl(ml, jVar, new Function1() { // from class: my.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.nr((x0X.n) obj);
            }
        }, new Function1() { // from class: my.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ml.O((fE.j) obj);
            }
        }, function1, continuation);
    }
}
