package sqD;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Throwable f73316n;
    private final CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JSONObject f73317t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return Intrinsics.areEqual(this.f73316n, ml.f73316n) && Intrinsics.areEqual(this.rl, ml.rl) && Intrinsics.areEqual(this.f73317t, ml.f73317t);
    }

    public Ml(Throwable error, CN3 hook, JSONObject params) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(hook, "hook");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f73316n = error;
        this.rl = hook;
        this.f73317t = params;
    }

    public int hashCode() {
        return (((this.f73316n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f73317t.hashCode();
    }

    public String toString() {
        return "CrisperError(error=" + this.f73316n + ", hook=" + this.rl + ", params=" + this.f73317t + ")";
    }
}
