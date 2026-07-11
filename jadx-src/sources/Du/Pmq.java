package Du;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Pmq extends Q {
    private final KClass rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final EJn.Wre f1980t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pmq(KClass kClass, XA.Ml eSerializer) {
        super(eSerializer, null);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.rl = kClass;
        this.f1980t = new Ml(eSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public int t(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public ArrayList qie(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(ArraysKt.asList(objArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public Object[] az(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return AbstractC1341t.Ik(arrayList, this.rl);
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
    public int J2(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public ArrayList rl() {
        return new ArrayList();
    }

    @Override // Du.Q, XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.f1980t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator O(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return ArrayIteratorKt.iterator(objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void nr(ArrayList arrayList, int i2) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i2);
    }
}
