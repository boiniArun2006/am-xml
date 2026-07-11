package Q6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f7916n;
    private final xkG.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f7917t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return Float.compare(this.f7916n, cn3.f7916n) == 0 && Intrinsics.areEqual(this.rl, cn3.rl) && Float.compare(this.f7917t, cn3.f7917t) == 0;
    }

    public CN3(float f3, xkG.j amplificationRamp, float f4) {
        Intrinsics.checkNotNullParameter(amplificationRamp, "amplificationRamp");
        this.f7916n = f3;
        this.rl = amplificationRamp;
        this.f7917t = f4;
        LRC.n.rl(f4, "speed factor");
    }

    public static /* synthetic */ CN3 rl(CN3 cn3, float f3, xkG.j jVar, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = cn3.f7916n;
        }
        if ((i2 & 2) != 0) {
            jVar = cn3.rl;
        }
        if ((i2 & 4) != 0) {
            f4 = cn3.f7917t;
        }
        return cn3.n(f3, jVar, f4);
    }

    public final float O() {
        return this.f7917t;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f7916n) * 31) + this.rl.hashCode()) * 31) + Float.hashCode(this.f7917t);
    }

    public final CN3 n(float f3, xkG.j amplificationRamp, float f4) {
        Intrinsics.checkNotNullParameter(amplificationRamp, "amplificationRamp");
        return new CN3(f3, amplificationRamp, f4);
    }

    public final float nr() {
        return this.f7916n;
    }

    public final xkG.j t() {
        return this.rl;
    }

    public String toString() {
        return "SectionSoundInstruction(indexInPercent=" + this.f7916n + ", amplificationRamp=" + this.rl + ", speedFactor=" + this.f7917t + ')';
    }
}
