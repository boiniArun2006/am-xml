package Du;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre extends r {
    private final EJn.Wre rl;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public List az(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wre(XA.Ml element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        this.rl = new I28(element.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public ArrayList qie(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Q
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public void HI(ArrayList arrayList, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i2, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void nr(ArrayList arrayList, int i2) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i2);
    }

    @Override // Du.Q, XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.rl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int t(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public ArrayList rl() {
        return new ArrayList();
    }
}
