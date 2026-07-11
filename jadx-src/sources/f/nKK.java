package f;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class nKK implements sqD.I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JSONArray f64030n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nKK) && Intrinsics.areEqual(this.f64030n, ((nKK) obj).f64030n);
    }

    public nKK(JSONArray unlockedFeatures) {
        Intrinsics.checkNotNullParameter(unlockedFeatures, "unlockedFeatures");
        this.f64030n = unlockedFeatures;
    }

    public int hashCode() {
        return this.f64030n.hashCode();
    }

    public final JSONArray rl() {
        return this.f64030n;
    }

    public String toString() {
        return "UnlockProFeaturesExperience(unlockedFeatures=" + this.f64030n + ")";
    }
}
