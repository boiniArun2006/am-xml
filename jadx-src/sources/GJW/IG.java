package GJW;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface IG extends CoroutineContext.Element {
    Object fcU(CoroutineContext coroutineContext);

    void p5(CoroutineContext coroutineContext, Object obj);

    public static final class j {
        public static Object n(IG ig, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.fold(ig, obj, function2);
        }

        public static CoroutineContext rl(IG ig, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(ig, coroutineContext);
        }
    }
}
