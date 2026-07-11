package dzu;

import GJW.IG;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class M {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final nKK f63552n = new nKK("NO_THREAD_ELEMENTS");
    private static final Function2 rl = new Function2() { // from class: dzu.Ln
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return M.nr(obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Function2 f63553t = new Function2() { // from class: dzu.lej
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return M.O((IG) obj, (CoroutineContext.Element) obj2);
        }
    };
    private static final Function2 nr = new Function2() { // from class: dzu.iwV
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return M.KN((psW) obj, (CoroutineContext.Element) obj2);
        }
    };

    public static final Object Uo(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, rl);
        Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    public static final void J2(CoroutineContext coroutineContext, Object obj) {
        if (obj == f63552n) {
            return;
        }
        if (obj instanceof psW) {
            ((psW) obj).rl(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f63553t);
        Intrinsics.checkNotNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((IG) objFold).p5(coroutineContext, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final psW KN(psW psw, CoroutineContext.Element element) {
        if (element instanceof IG) {
            IG ig = (IG) element;
            psw.n(ig, ig.fcU(psw.f63573n));
        }
        return psw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IG O(IG ig, CoroutineContext.Element element) {
        if (ig != null) {
            return ig;
        }
        if (element instanceof IG) {
            return (IG) element;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object nr(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof IG)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    public static final Object xMQ(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = Uo(coroutineContext);
        }
        if (obj == 0) {
            return f63552n;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new psW(coroutineContext, ((Number) obj).intValue()), nr);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((IG) obj).fcU(coroutineContext);
    }
}
