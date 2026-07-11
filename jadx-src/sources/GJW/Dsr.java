package GJW;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Dsr {
    public static final Object O(CoroutineContext coroutineContext, Function2 function2) {
        return aC.n(coroutineContext, function2);
    }

    public static final Object Uo(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        return C.O(coroutineContext, function2, continuation);
    }

    public static final P n(vd vdVar, CoroutineContext coroutineContext, h hVar, Function2 function2) {
        return C.n(vdVar, coroutineContext, hVar, function2);
    }

    public static final xuv t(vd vdVar, CoroutineContext coroutineContext, h hVar, Function2 function2) {
        return C.t(vdVar, coroutineContext, hVar, function2);
    }
}
