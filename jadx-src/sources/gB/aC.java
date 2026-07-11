package gB;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class aC implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MoG.CN3 f67170n;
    private final d2n.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f67171t;

    public aC(MoG.CN3 composition, d2n.Wre range) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f67170n = composition;
        this.rl = range;
        Set setO = composition.O();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : setO) {
            if (d2n.CN3.Uo(((MoG.fuX) obj).rl(), this.rl)) {
                linkedHashSet.add(obj);
            }
        }
        this.f67171t = linkedHashSet;
    }

    @Override // gB.Dsr
    public Set n() {
        return this.f67171t;
    }
}
