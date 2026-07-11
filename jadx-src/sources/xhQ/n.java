package xhQ;

import kgE.K;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n extends CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f75465n;
    private final JK.w6 nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final K f75466t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f75465n, nVar.f75465n) && Intrinsics.areEqual(this.rl, nVar.rl) && this.f75466t == nVar.f75466t && Intrinsics.areEqual(this.nr, nVar.nr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String id, String layerLabel, K requiredLicense, JK.w6 unlockFeature) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(layerLabel, "layerLabel");
        Intrinsics.checkNotNullParameter(requiredLicense, "requiredLicense");
        Intrinsics.checkNotNullParameter(unlockFeature, "unlockFeature");
        this.f75465n = id;
        this.rl = layerLabel;
        this.f75466t = requiredLicense;
        this.nr = unlockFeature;
    }

    public int hashCode() {
        return (((((this.f75465n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f75466t.hashCode()) * 31) + this.nr.hashCode();
    }

    @Override // xhQ.CN3
    public String n() {
        return this.rl;
    }

    public final String nr() {
        return this.f75465n;
    }

    @Override // xhQ.CN3
    public K rl() {
        return this.f75466t;
    }

    @Override // xhQ.CN3
    public JK.w6 t() {
        return this.nr;
    }

    public String toString() {
        return "EffectTrialItem(id=" + this.f75465n + ", layerLabel=" + this.rl + ", requiredLicense=" + this.f75466t + ", unlockFeature=" + this.nr + ")";
    }
}
