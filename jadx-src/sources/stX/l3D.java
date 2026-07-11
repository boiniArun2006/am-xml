package stX;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class l3D implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final stX.j f73370n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f73371t;

    public static final class Ml extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Comparable f73372n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Comparable comparable) {
            super(1);
            this.f73372n = comparable;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            return Integer.valueOf(ComparisonsKt.compareValues((String) ((Pair) obj).getFirst(), this.f73372n));
        }
    }

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f73373n;
        private boolean rl;

        public j(List children, boolean z2) {
            Intrinsics.checkNotNullParameter(children, "children");
            this.f73373n = children;
            this.rl = z2;
        }

        public final List n() {
            return this.f73373n;
        }

        public final boolean rl() {
            return this.rl;
        }

        public final void t(boolean z2) {
            this.rl = z2;
        }

        public /* synthetic */ j(List list, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? false : z2);
        }
    }

    public static final class n implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues((String) ((Pair) obj).getFirst(), (String) ((Pair) obj2).getFirst());
        }
    }

    static final class w6 extends Lambda implements Function0 {
        final /* synthetic */ Ref.IntRef J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f73374O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ CharSequence f73376t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(CharSequence charSequence, int i2, Ref.IntRef intRef) {
            super(0);
            this.f73376t = charSequence;
            this.f73374O = i2;
            this.J2 = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Expected " + l3D.this.rl + " but got " + this.f73376t.subSequence(this.f73374O, this.J2.element).toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l3D(Collection strings, stX.j setter, String whatThisExpects) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(whatThisExpects, "whatThisExpects");
        this.f73370n = setter;
        this.rl = whatThisExpects;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z2 = false;
        int i2 = 3;
        this.f73371t = new j(null, z2, i2, 0 == true ? 1 : 0);
        Iterator it = strings.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() <= 0) {
                throw new IllegalArgumentException(("Found an empty string in " + this.rl).toString());
            }
            j jVar = this.f73371t;
            int length = str.length();
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                List listN = jVar.n();
                int iBinarySearch = CollectionsKt.binarySearch(listN, 0, listN.size(), new Ml(String.valueOf(cCharAt)));
                if (iBinarySearch < 0) {
                    j jVar2 = new j(objArr2 == true ? 1 : 0, z2, i2, objArr == true ? 1 : 0);
                    jVar.n().add((-iBinarySearch) - 1, TuplesKt.to(String.valueOf(cCharAt), jVar2));
                    jVar = jVar2;
                } else {
                    jVar = (j) ((Pair) jVar.n().get(iBinarySearch)).getSecond();
                }
            }
            if (jVar.rl()) {
                throw new IllegalArgumentException(("The string '" + str + "' was passed several times").toString());
            }
            jVar.t(true);
        }
        rl(this.f73371t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r1.element += r6.length();
        r0 = r3;
        r13 = r5;
     */
    @Override // stX.Pl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Object obj, CharSequence input, int i2) {
        Intrinsics.checkNotNullParameter(input, "input");
        j jVar = this.f73371t;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i2;
        Integer numValueOf = null;
        loop0: while (intRef.element <= input.length()) {
            if (jVar.rl()) {
                numValueOf = Integer.valueOf(intRef.element);
            }
            for (Pair pair : jVar.n()) {
                String str = (String) pair.component1();
                j jVar2 = (j) pair.component2();
                CharSequence charSequence = input;
                if (StringsKt.startsWith$default(charSequence, (CharSequence) str, intRef.element, false, 4, (Object) null)) {
                    break;
                }
                input = charSequence;
            }
        }
        CharSequence charSequence2 = input;
        return numValueOf != null ? Xo.t(this.f73370n, obj, charSequence2.subSequence(i2, numValueOf.intValue()).toString(), i2, numValueOf.intValue()) : aC.f73359n.n(i2, new w6(charSequence2, i2, intRef));
    }

    private static final void rl(j jVar) {
        Iterator it = jVar.n().iterator();
        while (it.hasNext()) {
            rl((j) ((Pair) it.next()).component2());
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : jVar.n()) {
            String str = (String) pair.component1();
            j jVar2 = (j) pair.component2();
            if (!jVar2.rl() && jVar2.n().size() == 1) {
                Pair pair2 = (Pair) CollectionsKt.single(jVar2.n());
                String str2 = (String) pair2.component1();
                arrayList.add(TuplesKt.to(str + str2, (j) pair2.component2()));
            } else {
                arrayList.add(TuplesKt.to(str, jVar2));
            }
        }
        jVar.n().clear();
        jVar.n().addAll(CollectionsKt.sortedWith(arrayList, new n()));
    }
}
