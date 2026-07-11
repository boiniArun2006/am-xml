package ao;

import QmE.iF;
import QmE.yg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ao.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C1647j implements iF {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f43083n;

    public C1647j(Set loggerDelegates) {
        Intrinsics.checkNotNullParameter(loggerDelegates, "loggerDelegates");
        this.f43083n = loggerDelegates;
    }

    @Override // QmE.iF
    public void n(QmE.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Set set = this.f43083n;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((yg) it.next()).n(event);
            arrayList.add(Unit.INSTANCE);
        }
    }
}
