package F6;

import MoG.I28;
import MoG.Xo;
import MoG.fuX;
import d2n.CN3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final boolean n(j jVar, j slice) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(slice, "slice");
        return CN3.rl(jVar.O(), slice.O()) && rl(jVar, slice);
    }

    public static final boolean rl(j jVar, j other) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(jVar.nr(), other.nr());
    }

    public static final Set t(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Set setT = jVar.t();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = setT.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Xo.j.n(((I28) ((fuX) it.next()).n()).n()));
        }
        return linkedHashSet;
    }
}
