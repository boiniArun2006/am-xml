package xhQ;

import kgE.K;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 extends CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f75472n;
    private final JK.w6 nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final K f75473t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return this.f75472n == w6Var.f75472n && Intrinsics.areEqual(this.rl, w6Var.rl) && this.f75473t == w6Var.f75473t && Intrinsics.areEqual(this.nr, w6Var.nr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(int i2, String layerLabel, K requiredLicense, JK.w6 unlockFeature) {
        super(null);
        Intrinsics.checkNotNullParameter(layerLabel, "layerLabel");
        Intrinsics.checkNotNullParameter(requiredLicense, "requiredLicense");
        Intrinsics.checkNotNullParameter(unlockFeature, "unlockFeature");
        this.f75472n = i2;
        this.rl = layerLabel;
        this.f75473t = requiredLicense;
        this.nr = unlockFeature;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f75472n) * 31) + this.rl.hashCode()) * 31) + this.f75473t.hashCode()) * 31) + this.nr.hashCode();
    }

    @Override // xhQ.CN3
    public String n() {
        return this.rl;
    }

    public final int nr() {
        return this.f75472n;
    }

    @Override // xhQ.CN3
    public K rl() {
        return this.f75473t;
    }

    @Override // xhQ.CN3
    public JK.w6 t() {
        return this.nr;
    }

    public String toString() {
        return "FeatureTrialItem(resourceId=" + this.f75472n + ", layerLabel=" + this.rl + ", requiredLicense=" + this.f75473t + ", unlockFeature=" + this.nr + ")";
    }
}
