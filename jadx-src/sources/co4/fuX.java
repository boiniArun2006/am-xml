package co4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class fuX implements Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f43864n;

    public fuX(List formats) {
        Intrinsics.checkNotNullParameter(formats, "formats");
        this.f43864n = formats;
    }

    public boolean equals(Object obj) {
        return (obj instanceof fuX) && Intrinsics.areEqual(this.f43864n, ((fuX) obj).f43864n);
    }

    public int hashCode() {
        return this.f43864n.hashCode();
    }

    @Override // co4.Xo
    public q6b.I28 n() {
        List list = this.f43864n;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((l3D) it.next()).n());
        }
        return arrayList.size() == 1 ? (q6b.I28) CollectionsKt.single((List) arrayList) : new q6b.j(arrayList);
    }

    @Override // co4.Xo
    public stX.eO rl() {
        List list = this.f43864n;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((l3D) it.next()).rl());
        }
        return stX.qz.rl(arrayList);
    }

    public final List t() {
        return this.f43864n;
    }

    public String toString() {
        return "ConcatenatedFormatStructure(" + CollectionsKt.joinToString$default(this.f43864n, ", ", null, null, 0, null, null, 62, null) + ')';
    }
}
