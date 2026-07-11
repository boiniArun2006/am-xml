package HI0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class psW {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f3875n;
    private int rl;

    public psW(List tokens) {
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        this.f3875n = tokens;
    }

    public final boolean O() {
        return this.rl == this.f3875n.size();
    }

    public final List Uo(int i2, char c2) {
        IntRange intRange = new IntRange(1, i2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            if (((IntIterator) it).nextInt() > 1) {
                n(c2);
            }
            arrayList.add(J2());
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Float) it2.next()) == null) {
                    return null;
                }
            }
        }
        return CollectionsKt.requireNoNulls((List) arrayList);
    }

    public final boolean nr() {
        return this.rl == 1;
    }

    public final void qie(int i2) {
        this.rl = i2;
    }

    public final int rl() {
        return this.rl;
    }

    public final List t() {
        return this.f3875n;
    }

    public final String xMQ() {
        if (this.rl < this.f3875n.size()) {
            return (String) this.f3875n.get(this.rl);
        }
        return null;
    }

    public final Float J2() {
        Float fGh = gh();
        if (fGh == null) {
            return null;
        }
        this.rl++;
        return fGh;
    }

    public final void KN(char c2) {
        Character chMUb = mUb();
        if (chMUb != null && chMUb.charValue() == c2) {
            this.rl++;
        }
    }

    public final Float gh() {
        String strXMQ = xMQ();
        if (strXMQ != null) {
            return StringsKt.toFloatOrNull(strXMQ);
        }
        return null;
    }

    public final Character mUb() {
        String strXMQ = xMQ();
        if (strXMQ == null || strXMQ.length() != 1) {
            return null;
        }
        return Character.valueOf(strXMQ.charAt(0));
    }

    public final Character n(char c2) {
        Character chMUb = mUb();
        if (chMUb != null && chMUb.charValue() == c2) {
            this.rl++;
            return Character.valueOf(c2);
        }
        return null;
    }
}
