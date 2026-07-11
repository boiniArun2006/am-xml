package xhQ;

import com.alightcreative.app.motion.easing.Easing;
import kgE.K;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j extends CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Easing f75463n;
    private final JK.w6 nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final K f75464t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f75463n, jVar.f75463n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f75464t == jVar.f75464t && Intrinsics.areEqual(this.nr, jVar.nr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Easing easing, String layerLabel, K requiredLicense, JK.w6 unlockFeature) {
        super(null);
        Intrinsics.checkNotNullParameter(easing, "easing");
        Intrinsics.checkNotNullParameter(layerLabel, "layerLabel");
        Intrinsics.checkNotNullParameter(requiredLicense, "requiredLicense");
        Intrinsics.checkNotNullParameter(unlockFeature, "unlockFeature");
        this.f75463n = easing;
        this.rl = layerLabel;
        this.f75464t = requiredLicense;
        this.nr = unlockFeature;
    }

    public int hashCode() {
        return (((((this.f75463n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f75464t.hashCode()) * 31) + this.nr.hashCode();
    }

    @Override // xhQ.CN3
    public String n() {
        return this.rl;
    }

    public final Easing nr() {
        return this.f75463n;
    }

    @Override // xhQ.CN3
    public K rl() {
        return this.f75464t;
    }

    @Override // xhQ.CN3
    public JK.w6 t() {
        return this.nr;
    }

    public String toString() {
        return "EasingTrialItem(easing=" + this.f75463n + ", layerLabel=" + this.rl + ", requiredLicense=" + this.f75464t + ", unlockFeature=" + this.nr + ")";
    }
}
