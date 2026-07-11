package Mgn;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f6621n;
    private final float[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f6620t = new j(null);
    private static final Lazy nr = LazyKt.lazy(new Function0() { // from class: Mgn.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I28.mUb();
        }
    });

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Lazy f6619O = LazyKt.lazy(new Function0() { // from class: Mgn.w6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I28.gh();
        }
    });
    private static final Lazy J2 = LazyKt.lazy(new Function0() { // from class: Mgn.Ml
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return I28.xMQ();
        }
    });

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final I28 O(String str) {
            ClassLoader classLoader = j.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            URL resource = classLoader.getResource(str);
            Intrinsics.checkNotNull(resource);
            List<String> listLines = StringsKt.lines(new String(TextStreamsKt.readBytes(resource), Charsets.UTF_8));
            int i2 = Integer.parseInt(listLines.get(0));
            List<String> listSubList = listLines.subList(1, listLines.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(Float.parseFloat((String) it.next())));
            }
            return new I28(i2, CollectionsKt.toFloatArray(arrayList));
        }

        public final I28 nr() {
            return (I28) I28.f6619O.getValue();
        }

        public final I28 rl() {
            return (I28) I28.J2.getValue();
        }

        public final I28 t() {
            return (I28) I28.nr.getValue();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return this.f6621n == i28.f6621n && Intrinsics.areEqual(this.rl, i28.rl);
    }

    public I28(int i2, float[] coeffs) {
        Intrinsics.checkNotNullParameter(coeffs, "coeffs");
        this.f6621n = i2;
        this.rl = coeffs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I28 gh() {
        return f6620t.O("mid_qual_coeffs.txt");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I28 mUb() {
        return f6620t.O("low_qual_coeffs.txt");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I28 xMQ() {
        return f6620t.O("high_qual_coeffs.txt");
    }

    public final int KN() {
        return this.f6621n;
    }

    public final float[] Uo() {
        return this.rl;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f6621n) * 31) + Arrays.hashCode(this.rl);
    }

    public String toString() {
        return "Coefficients(increment=" + this.f6621n + ", coeffs=" + Arrays.toString(this.rl) + ")";
    }
}
