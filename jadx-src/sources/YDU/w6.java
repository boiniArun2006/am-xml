package YDU;

import H7v.Wre;
import d2n.CN3;
import d2n.Ml;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {
    public static final long n(Wre start, Wre end, long j2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        if (Intrinsics.areEqual(start, end)) {
            return ((Ml) start.nr()).Ik();
        }
        return CN3.O(new d2n.Wre(((Ml) start.nr()).Ik(), ((Ml) end.nr()).Ik(), null), CN3.xMQ(new d2n.Wre(start.t(), end.t(), null), j2));
    }
}
