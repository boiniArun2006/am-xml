package Pb7;

import com.caoccao.javet.values.reference.V8ValueObject;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 implements Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f7704n = new j(null);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final CN3 n(V8ValueObject v8Object) {
            Intrinsics.checkNotNullParameter(v8Object, "v8Object");
            return new CN3(v8Object);
        }
    }

    public /* synthetic */ I28(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Pl n(String str);

    public abstract Set rl();

    private I28() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        if (!Intrinsics.areEqual(rl(), i28.rl())) {
            return false;
        }
        Set<String> setRl = rl();
        if ((setRl instanceof Collection) && setRl.isEmpty()) {
            return true;
        }
        for (String str : setRl) {
            if (!Intrinsics.areEqual(n(str), i28.n(str))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CrisperDictionary(");
        int i2 = 0;
        for (Object obj : rl()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            sb.append("\"" + str + "\": " + n(str));
            if (i2 < r1.size() - 1) {
                sb.append(", ");
            }
            i2 = i3;
        }
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return string;
    }

    public int hashCode() {
        return rl().hashCode();
    }
}
