package kuA;

import com.caoccao.javet.values.reference.V8ValueObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3 implements aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final V8ValueObject f70296n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CN3) && Intrinsics.areEqual(this.f70296n, ((CN3) obj).f70296n);
    }

    public CN3(V8ValueObject value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f70296n = value;
    }

    public int hashCode() {
        return this.f70296n.hashCode();
    }

    public final V8ValueObject n() {
        return this.f70296n;
    }

    public String toString() {
        return "ObjectResult(value=" + this.f70296n + ")";
    }
}
