package qwH;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f72597n;
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final l3D f72596t = new l3D(CollectionsKt.listOf((Object[]) new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));
    private static final l3D nr = new l3D(CollectionsKt.listOf((Object[]) new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}));

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final l3D n() {
            return l3D.nr;
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f72598n = new n();

        n() {
            super(1, String.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.toString();
        }
    }

    public l3D(List names) {
        Intrinsics.checkNotNullParameter(names, "names");
        this.f72597n = names;
        if (names.size() != 7) {
            throw new IllegalArgumentException("Day of week names must contain exactly 7 elements");
        }
        Iterator<Integer> it = CollectionsKt.getIndices(names).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (((CharSequence) this.f72597n.get(iNextInt)).length() <= 0) {
                throw new IllegalArgumentException("A day-of-week name can not be empty");
            }
            for (int i2 = 0; i2 < iNextInt; i2++) {
                if (Intrinsics.areEqual(this.f72597n.get(iNextInt), this.f72597n.get(i2))) {
                    throw new IllegalArgumentException(("Day-of-week names must be unique, but '" + ((String) this.f72597n.get(iNextInt)) + "' was repeated").toString());
                }
            }
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof l3D) && Intrinsics.areEqual(this.f72597n, ((l3D) obj).f72597n);
    }

    public int hashCode() {
        return this.f72597n.hashCode();
    }

    public final List rl() {
        return this.f72597n;
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.f72597n, ", ", "DayOfWeekNames(", ")", 0, null, n.f72598n, 24, null);
    }
}
