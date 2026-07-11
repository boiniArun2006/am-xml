package tDS;

import com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent;
import ifA.j;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tDS.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {
    /* JADX INFO: Access modifiers changed from: private */
    public static final j rl(ifA.j jVar, CompleteDebugEvent completeDebugEvent, boolean z2, boolean z3, List list) {
        if (jVar instanceof j.CN3) {
            return z2 ? new j.C1179j(((j.CN3) jVar).n()) : j.n.f73443n;
        }
        if (jVar instanceof j.I28) {
            return z3 ? new j.C1179j(((j.I28) jVar).n()) : j.n.f73443n;
        }
        Object obj = null;
        if (jVar instanceof j.n) {
            String strJoinToString$default = CollectionsKt.joinToString$default(completeDebugEvent.getCategories(), "/", null, null, 0, null, null, 62, null);
            Iterator it = ((j.n) jVar).n().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String lowerCase = ((j.Ml) next).n().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt.contains$default((CharSequence) strJoinToString$default, (CharSequence) lowerCase, false, 2, (Object) null)) {
                    obj = next;
                    break;
                }
            }
            j.Ml ml = (j.Ml) obj;
            return ml != null ? new j.C1179j(ml.rl()) : j.n.f73443n;
        }
        if (jVar instanceof j.w6) {
            Iterator it2 = ((j.w6) jVar).n().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                String lowerCase2 = ((j.Ml) next2).n().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (list.contains(lowerCase2)) {
                    obj = next2;
                    break;
                }
            }
            j.Ml ml2 = (j.Ml) obj;
            return ml2 != null ? new j.C1179j(ml2.rl()) : j.n.f73443n;
        }
        if (jVar instanceof j.Wre) {
            Iterator it3 = ((j.Wre) jVar).n().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (Intrinsics.areEqual(completeDebugEvent.getSeverity(), ((j.Ml) next3).n())) {
                    obj = next3;
                    break;
                }
            }
            j.Ml ml3 = (j.Ml) obj;
            return ml3 != null ? new j.C1179j(ml3.rl()) : j.n.f73443n;
        }
        if (jVar instanceof j.fuX) {
            return new j.C1179j(((j.fuX) jVar).n());
        }
        if (!(jVar instanceof j.C0969j)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it4 = ((j.C0969j) jVar).n().iterator();
        while (it4.hasNext()) {
            j jVarRl = rl((ifA.j) it4.next(), completeDebugEvent, z2, z3, list);
            if (jVarRl instanceof j.n) {
                return j.n.f73443n;
            }
            if ((jVarRl instanceof j.C1179j) && !((j.C1179j) jVarRl).n()) {
                return new j.C1179j(false);
            }
        }
        Unit unit = Unit.INSTANCE;
        return new j.C1179j(true);
    }
}
