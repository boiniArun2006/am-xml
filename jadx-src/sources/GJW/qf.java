package GJW;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class qf {
    public static final String Uo(CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean KN(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2() { // from class: GJW.nKK
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(qf.xMQ(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    public static final OA az(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(Mo.f3437n) == null) {
            return null;
        }
        OA oaQie = qie((CoroutineStackFrame) continuation);
        if (oaQie != null) {
            oaQie.tFV(coroutineContext, obj);
        }
        return oaQie;
    }

    public static final OA qie(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof pO) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof OA) {
                return (OA) coroutineStackFrame;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xMQ(boolean z2, CoroutineContext.Element element) {
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext J2(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return coroutineContext.plus(element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext O(Ref.ObjectRef objectRef, boolean z2, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return coroutineContext.plus(element);
    }

    public static final CoroutineContext gh(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        if (!KN(coroutineContext2)) {
            return coroutineContext.plus(coroutineContext2);
        }
        return nr(coroutineContext, coroutineContext2, false);
    }

    public static final CoroutineContext mUb(vd vdVar, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextNr = nr(vdVar.getCoroutineContext(), coroutineContext, true);
        if (coroutineContextNr != OU.n() && coroutineContextNr.get(ContinuationInterceptor.INSTANCE) == null) {
            return coroutineContextNr.plus(OU.n());
        }
        return coroutineContextNr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext nr(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z2) {
        boolean zKN = KN(coroutineContext);
        boolean zKN2 = KN(coroutineContext2);
        if (!zKN && !zKN2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Function2() { // from class: GJW.DAz
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return qf.O(objectRef, z2, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zKN2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, new Function2() { // from class: GJW.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qf.J2((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }
}
