package Pb7;

import com.caoccao.javet.values.reference.V8ValueArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class j implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0273j f7708n = new C0273j(null);

    /* JADX INFO: renamed from: Pb7.j$j, reason: collision with other inner class name */
    public static final class C0273j {
        public /* synthetic */ C0273j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0273j() {
        }

        public final w6 n(V8ValueArray v8Array) {
            Intrinsics.checkNotNullParameter(v8Array, "v8Array");
            return new w6(v8Array);
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Pl n(int i2);

    public abstract int rl();

    private j() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (rl() != jVar.rl()) {
            return false;
        }
        int iRl = rl();
        for (int i2 = 0; i2 < iRl; i2++) {
            if (!Intrinsics.areEqual(n(i2), jVar.n(i2))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CrisperArray(");
        int iRl = rl();
        for (int i2 = 0; i2 < iRl; i2++) {
            sb.append(String.valueOf(n(i2)));
            if (i2 < rl() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return string;
    }

    public int hashCode() {
        int iRl = rl();
        int iHashCode = 7;
        for (int i2 = 0; i2 < iRl; i2++) {
            iHashCode = (iHashCode * 31) + n(i2).hashCode();
        }
        return iHashCode;
    }
}
