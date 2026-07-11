package Du;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Du.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C1340p extends r {
    private final EJn.Wre rl;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public Set az(LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void nr(LinkedHashSet linkedHashSet, int i2) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1340p(XA.Ml eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.rl = new OU(eSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet qie(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public void HI(LinkedHashSet linkedHashSet, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    @Override // Du.Q, XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.rl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int t(LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet rl() {
        return new LinkedHashSet();
    }
}
