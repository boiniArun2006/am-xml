package qwH;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class DAz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f72511n;
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final DAz f72510t = new DAz(CollectionsKt.listOf((Object[]) new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
    private static final DAz nr = new DAz(CollectionsKt.listOf((Object[]) new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final DAz n() {
            return DAz.nr;
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f72512n = new n();

        n() {
            super(1, String.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.toString();
        }
    }

    public DAz(List names) {
        Intrinsics.checkNotNullParameter(names, "names");
        this.f72511n = names;
        if (names.size() != 12) {
            throw new IllegalArgumentException("Month names must contain exactly 12 elements");
        }
        Iterator<Integer> it = CollectionsKt.getIndices(names).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (((CharSequence) this.f72511n.get(iNextInt)).length() <= 0) {
                throw new IllegalArgumentException("A month name can not be empty");
            }
            for (int i2 = 0; i2 < iNextInt; i2++) {
                if (Intrinsics.areEqual(this.f72511n.get(iNextInt), this.f72511n.get(i2))) {
                    throw new IllegalArgumentException(("Month names must be unique, but '" + ((String) this.f72511n.get(iNextInt)) + "' was repeated").toString());
                }
            }
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof DAz) && Intrinsics.areEqual(this.f72511n, ((DAz) obj).f72511n);
    }

    public int hashCode() {
        return this.f72511n.hashCode();
    }

    public final List rl() {
        return this.f72511n;
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.f72511n, ", ", "MonthNames(", ")", 0, null, n.f72512n, 24, null);
    }
}
