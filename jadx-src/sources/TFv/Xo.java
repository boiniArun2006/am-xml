package TFv;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract /* synthetic */ class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function1 f10372n = new Function1() { // from class: TFv.qz
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Xo.nr(obj);
        }
    };
    private static final Function2 rl = new Function2() { // from class: TFv.Pl
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Xo.t(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object nr(Object obj) {
        return obj;
    }

    public static final Wre J2(Wre wre, Function2 function2) {
        Function1 function1 = f10372n;
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return Uo(wre, function1, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2));
    }

    public static final Wre O(Wre wre) {
        return wre instanceof rv6 ? wre : Uo(wre, f10372n, rl);
    }

    private static final Wre Uo(Wre wre, Function1 function1, Function2 function2) {
        if (wre instanceof I28) {
            I28 i28 = (I28) wre;
            if (i28.f10276t == function1 && i28.f10274O == function2) {
                return wre;
            }
        }
        return new I28(wre, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }
}
