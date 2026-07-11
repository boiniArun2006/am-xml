package Q6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MoG.I28 f7954n;
    private final d2n.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f7955t;

    public /* synthetic */ w6(MoG.I28 i28, d2n.Wre wre, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i28, wre, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f7954n, w6Var.f7954n) && Intrinsics.areEqual(this.rl, w6Var.rl) && d2n.j.gh(this.f7955t, w6Var.f7955t);
    }

    private w6(MoG.I28 i28, d2n.Wre wre, long j2) {
        this.f7954n = i28;
        this.rl = wre;
        this.f7955t = j2;
        d2n.Wre wreJ2 = d2n.CN3.J2(wre, i28.nr());
        if (Intrinsics.areEqual(wreJ2, wre)) {
            return;
        }
        throw new IllegalArgumentException(("Time range " + wre + " must equal intersection " + wreJ2 + " with portion time range " + i28.nr() + " of audible item").toString());
    }

    public int hashCode() {
        return (((this.f7954n.hashCode() * 31) + this.rl.hashCode()) * 31) + d2n.j.ck(this.f7955t);
    }

    public final MoG.I28 n() {
        return this.f7954n;
    }

    public final long rl() {
        return this.f7955t;
    }

    public final d2n.Wre t() {
        return this.rl;
    }

    public String toString() {
        return "AudioDataRequest(audibleItem=" + this.f7954n + ", timeRange=" + this.rl + ", rightPaddingDuration=" + ((Object) d2n.j.S(this.f7955t)) + ')';
    }
}
