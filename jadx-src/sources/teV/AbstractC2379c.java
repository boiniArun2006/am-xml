package teV;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: teV.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC2379c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function3 f73624n;

    /* JADX INFO: renamed from: teV.c$j */
    /* synthetic */ class j extends FunctionReferenceImpl implements Function3, SuspendFunction {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f73625n = new j();

        j() {
            super(3, TFv.CN3.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Object obj, Continuation continuation) {
            return cn3.rl(obj, continuation);
        }
    }

    static {
        j jVar = j.f73625n;
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f73624n = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(jVar, 3);
    }
}
