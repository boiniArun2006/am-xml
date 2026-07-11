package h1M;

import IRN.eO;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 implements q6T.Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eO f67940n;

    public I28(eO userMetadata) {
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.f67940n = userMetadata;
    }

    @Override // q6T.Wre
    public void n(q6T.I28 rolloutsState) {
        Intrinsics.checkNotNullParameter(rolloutsState, "rolloutsState");
        eO eOVar = this.f67940n;
        Set setRl = rolloutsState.rl();
        Intrinsics.checkNotNullExpressionValue(setRl, "rolloutsState.rolloutAssignments");
        Set<q6T.Ml> set = setRl;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        for (q6T.Ml ml : set) {
            arrayList.add(IRN.aC.rl(ml.nr(), ml.rl(), ml.t(), ml.J2(), ml.O()));
        }
        eOVar.r(arrayList);
        CN3.J2().rl("Updated Crashlytics Rollout State");
    }
}
