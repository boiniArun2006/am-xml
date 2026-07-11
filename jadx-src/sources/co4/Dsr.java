package co4;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Dsr implements UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f43839n;

    public Dsr(List predicates) {
        Intrinsics.checkNotNullParameter(predicates, "predicates");
        this.f43839n = predicates;
    }

    @Override // co4.UGc
    public boolean test(Object obj) {
        List list = this.f43839n;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((UGc) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
