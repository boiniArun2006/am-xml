package stX;

import YgZ.uQga.IYJfqUyym;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f73362n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f73363t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class j extends Lambda implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Unexpected end of input: yet to parse " + fuX.this.nr();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class n extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f73365n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ fuX f73366t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Ref.IntRef intRef, fuX fux) {
            super(0);
            this.f73365n = intRef;
            this.f73366t = fux;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Only found " + this.f73365n.element + " digits in a row, but need to parse " + this.f73366t.nr();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class w6 extends Lambda implements Function0 {
        final /* synthetic */ CN3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f73367O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f73368n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ fuX f73369t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(String str, fuX fux, int i2, CN3 cn3) {
            super(0);
            this.f73368n = str;
            this.f73369t = fux;
            this.f73367O = i2;
            this.J2 = cn3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Can not interpret the string '" + this.f73368n + "' as " + ((I28) this.f73369t.t().get(this.f73367O)).t() + ": " + this.J2.n();
        }
    }

    public fuX(List consumers) {
        boolean z2;
        boolean z3;
        int i2;
        Intrinsics.checkNotNullParameter(consumers, "consumers");
        this.f73362n = consumers;
        Iterator it = consumers.iterator();
        int i3 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer numRl = ((I28) it.next()).rl();
            if (numRl != null) {
                iIntValue = numRl.intValue();
            }
            i3 += iIntValue;
        }
        this.rl = i3;
        List list = this.f73362n;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((I28) it2.next()).rl() == null) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        this.f73363t = z2;
        List list2 = this.f73362n;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                Integer numRl2 = ((I28) it3.next()).rl();
                if (!((numRl2 != null ? numRl2.intValue() : Integer.MAX_VALUE) > 0)) {
                    z3 = false;
                    break;
                }
            }
            z3 = true;
        } else {
            z3 = true;
        }
        if (!z3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List list3 = this.f73362n;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it4 = list3.iterator();
            i2 = 0;
            while (it4.hasNext()) {
                if ((((I28) it4.next()).rl() == null) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        } else {
            i2 = 0;
        }
        if (i2 <= 1) {
            return;
        }
        List list4 = this.f73362n;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list4) {
            if (((I28) obj).rl() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((I28) it5.next()).t());
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String nr() {
        List<I28> list = this.f73362n;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (I28 i28 : list) {
            StringBuilder sb = new StringBuilder();
            Integer numRl = i28.rl();
            sb.append(numRl == null ? "at least one digit" : numRl + IYJfqUyym.ORchncalImNjJ);
            sb.append(" for ");
            sb.append(i28.t());
            arrayList.add(sb.toString());
        }
        if (this.f73363t) {
            return "a number with at least " + this.rl + " digits: " + arrayList;
        }
        return "a number with exactly " + this.rl + " digits: " + arrayList;
    }

    @Override // stX.Pl
    public Object n(Object obj, CharSequence input, int i2) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.rl + i2 > input.length()) {
            return aC.f73359n.n(i2, new j());
        }
        Ref.IntRef intRef = new Ref.IntRef();
        while (intRef.element + i2 < input.length() && fm.Ml.rl(input.charAt(intRef.element + i2))) {
            intRef.element++;
        }
        if (intRef.element < this.rl) {
            return aC.f73359n.n(i2, new n(intRef, this));
        }
        int size = this.f73362n.size();
        int i3 = 0;
        while (i3 < size) {
            Integer numRl = ((I28) this.f73362n.get(i3)).rl();
            int iIntValue = (numRl != null ? numRl.intValue() : (intRef.element - this.rl) + 1) + i2;
            CN3 cn3N = ((I28) this.f73362n.get(i3)).n(obj, input, i2, iIntValue);
            if (cn3N != null) {
                return aC.f73359n.n(i2, new w6(input.subSequence(i2, iIntValue).toString(), this, i3, cn3N));
            }
            i3++;
            i2 = iIntValue;
        }
        return aC.f73359n.rl(i2);
    }

    public final List t() {
        return this.f73362n;
    }

    public String toString() {
        return nr();
    }
}
