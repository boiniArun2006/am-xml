package Q6;

import MoG.Xo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f7952n;
    private final Set rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f7953t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final n f7951O = new n(SetsKt.emptySet(), SetsKt.emptySet());

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f7952n, nVar.f7952n) && Intrinsics.areEqual(this.rl, nVar.rl);
    }

    public n(Set anticipatedRequests, Set unessentialAudibleItems) {
        boolean z2;
        Intrinsics.checkNotNullParameter(anticipatedRequests, "anticipatedRequests");
        Intrinsics.checkNotNullParameter(unessentialAudibleItems, "unessentialAudibleItems");
        this.f7952n = anticipatedRequests;
        this.rl = unessentialAudibleItems;
        Set set = anticipatedRequests;
        if ((set instanceof Collection) && set.isEmpty()) {
            z2 = false;
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (this.rl.contains(Xo.j.n(((w6) it.next()).n().n()))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (!z2) {
            this.f7953t = this.f7952n.isEmpty() && this.rl.isEmpty();
            return;
        }
        Set set2 = this.f7952n;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Xo.j.n(((w6) it2.next()).n().n()));
        }
        throw new IllegalArgumentException(("IDs of audible items in anticipated requests and unessential audible items must be mutually exclusive. Found overlapping IDs: " + CollectionsKt.intersect(arrayList, this.rl)).toString());
    }

    public int hashCode() {
        return (this.f7952n.hashCode() * 31) + this.rl.hashCode();
    }

    public final Set n() {
        return this.f7952n;
    }

    public final Set rl() {
        return this.rl;
    }

    public String toString() {
        return "AudioDataHint(anticipatedRequests=" + this.f7952n + ", unessentialAudibleItems=" + this.rl + ')';
    }
}
