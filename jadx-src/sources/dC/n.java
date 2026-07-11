package dC;

import as.eO;
import as.qz;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import v9.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements xkG.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f63463n = new n();

    @Override // xkG.w6
    public as.n n(List fragments) {
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        if (fragments.isEmpty()) {
            throw new IllegalArgumentException("Fragments list must not be empty.");
        }
        as.n nVar = (as.n) CollectionsKt.first(fragments);
        List listDrop = CollectionsKt.drop(fragments, 1);
        if (listDrop == null || !listDrop.isEmpty()) {
            Iterator it = listDrop.iterator();
            while (it.hasNext()) {
                if (!eO.Uo(((as.n) it.next()).J2(), nVar.J2())) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listDrop) {
                        if (!eO.Uo(((as.n) obj).J2(), nVar.J2())) {
                            arrayList.add(obj);
                        }
                    }
                    throw new IllegalArgumentException(("Cannot mix fragments " + arrayList + " with sample rate different from first one " + ((Object) eO.xMQ(nVar.J2()))).toString());
                }
            }
        }
        if (listDrop == null || !listDrop.isEmpty()) {
            Iterator it2 = listDrop.iterator();
            while (it2.hasNext()) {
                if (!qz.nr(((as.n) it2.next()).nr(), nVar.nr())) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listDrop) {
                        if (!qz.nr(((as.n) obj2).nr(), nVar.nr())) {
                            arrayList2.add(obj2);
                        }
                    }
                    throw new IllegalArgumentException(("Cannot mix fragments " + arrayList2 + " with channel count different from first one " + ((Object) qz.J2(nVar.nr()))).toString());
                }
            }
        }
        if (listDrop == null || !listDrop.isEmpty()) {
            Iterator it3 = listDrop.iterator();
            while (it3.hasNext()) {
                if (((as.n) it3.next()).O().remaining() != nVar.O().remaining()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : listDrop) {
                        if (((as.n) obj3).O().remaining() != nVar.O().remaining()) {
                            arrayList3.add(obj3);
                        }
                    }
                    throw new IllegalArgumentException(("Cannot mix fragments " + arrayList3 + " with data size different from first one " + nVar.O().remaining()).toString());
                }
            }
        }
        int iKN = v9.n.KN(nVar.O());
        int i2 = iKN / 2;
        ByteBuffer byteBufferO = v9.n.O(iKN, null, 2, null);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(fragments, 10));
        Iterator it4 = fragments.iterator();
        while (it4.hasNext()) {
            arrayList4.add(v9.n.rl(((as.n) it4.next()).O()));
        }
        for (int i3 = 0; i3 < i2; i3++) {
            Iterator it5 = arrayList4.iterator();
            short sN = 0;
            while (it5.hasNext()) {
                sN = I28.n(sN + ((ShortBuffer) it5.next()).get());
            }
            byteBufferO.putShort(sN);
        }
        byteBufferO.position(0);
        return as.n.rl(nVar, byteBufferO, null, 2, null);
    }

    private n() {
    }
}
