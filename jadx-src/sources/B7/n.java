package B7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final long n(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return jVar.t().Uo().nr();
    }

    public static final long rl(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return d2n.Ml.az(n(jVar), jVar.nr());
    }

    public static final F6.j t(j slice, long j2) {
        Intrinsics.checkNotNullParameter(slice, "$this$slice");
        d2n.Wre wreJ2 = d2n.CN3.J2(d2n.Wre.nr.t(slice.nr(), j2), slice.t().Uo());
        if (wreJ2 == null) {
            return null;
        }
        return new F6.j(slice.t(), wreJ2);
    }
}
