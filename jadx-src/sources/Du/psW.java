package Du;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class psW extends r {
    private final EJn.Wre rl;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public Set az(HashSet hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void nr(HashSet hashSet, int i2) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psW(XA.Ml eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.rl = new K(eSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public HashSet qie(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        HashSet hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet(set) : hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public void HI(HashSet hashSet, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        hashSet.add(obj);
    }

    @Override // Du.Q, XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.rl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int t(HashSet hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public HashSet rl() {
        return new HashSet();
    }
}
