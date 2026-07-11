package teV;

import GJW.xuv;
import dzu.g9s;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class UGc {
    public static final void rl(final l3D l3d, CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new Function2() { // from class: teV.s4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(UGc.t(l3d, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue() == l3d.f73651O) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + l3d.f73654t + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final xuv nr(xuv xuvVar, xuv xuvVar2) {
        while (xuvVar != null) {
            if (xuvVar == xuvVar2 || !(xuvVar instanceof g9s)) {
                return xuvVar;
            }
            xuvVar = ((g9s) xuvVar).getParent();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(l3D l3d, int i2, CoroutineContext.Element element) {
        CoroutineContext.Key<?> key = element.getKey();
        CoroutineContext.Element element2 = l3d.f73654t.get(key);
        if (key != xuv.nr) {
            if (element != element2) {
                return Integer.MIN_VALUE;
            }
            return i2 + 1;
        }
        xuv xuvVar = (xuv) element2;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        xuv xuvVarNr = nr((xuv) element, xuvVar);
        if (xuvVarNr == xuvVar) {
            if (xuvVar == null) {
                return i2;
            }
            return i2 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + xuvVarNr + ", expected child of " + xuvVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
