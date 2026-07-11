package NtE;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f7110n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f7111t;

    public /* synthetic */ I28(int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return as.Ml.nr(this.f7110n, i28.f7110n) && as.Ml.nr(this.rl, i28.rl) && as.Ml.nr(this.f7111t, i28.f7111t);
    }

    private I28(int i2, int i3, int i5) {
        this.f7110n = i2;
        this.rl = i3;
        this.f7111t = i5;
    }

    public int hashCode() {
        return (((as.Ml.J2(this.f7110n) * 31) + as.Ml.J2(this.rl)) * 31) + as.Ml.J2(this.f7111t);
    }

    public final int n() {
        return this.f7110n;
    }

    public final int rl() {
        return this.rl;
    }

    public final int t() {
        return this.f7111t;
    }

    public String toString() {
        return "InstructionFrameCount(leftPaddingFrames=" + ((Object) as.Ml.mUb(this.f7110n)) + ", instructionFrames=" + ((Object) as.Ml.mUb(this.rl)) + ", rightPaddingFrames=" + ((Object) as.Ml.mUb(this.f7111t)) + ')';
    }
}
