package C6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class r {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f788O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Z f789n;
    private final int nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final s4 f790t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f789n == rVar.f789n && Intrinsics.areEqual(this.rl, rVar.rl) && Intrinsics.areEqual(this.f790t, rVar.f790t) && this.nr == rVar.nr && this.f788O == rVar.f788O;
    }

    public r(Z type, List testFrames, s4 params, int i2, int i3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(testFrames, "testFrames");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f789n = type;
        this.rl = testFrames;
        this.f790t = params;
        this.nr = i2;
        this.f788O = i3;
    }

    public static /* synthetic */ r rl(r rVar, Z z2, List list, s4 s4Var, int i2, int i3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z2 = rVar.f789n;
        }
        if ((i5 & 2) != 0) {
            list = rVar.rl;
        }
        if ((i5 & 4) != 0) {
            s4Var = rVar.f790t;
        }
        if ((i5 & 8) != 0) {
            i2 = rVar.nr;
        }
        if ((i5 & 16) != 0) {
            i3 = rVar.f788O;
        }
        int i7 = i3;
        s4 s4Var2 = s4Var;
        return rVar.n(z2, list, s4Var2, i2, i7);
    }

    public final List J2() {
        return this.rl;
    }

    public final s4 O() {
        return this.f790t;
    }

    public int hashCode() {
        return (((((((this.f789n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f790t.hashCode()) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f788O);
    }

    public final r n(Z type, List testFrames, s4 params, int i2, int i3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(testFrames, "testFrames");
        Intrinsics.checkNotNullParameter(params, "params");
        return new r(type, testFrames, params, i2, i3);
    }

    public final int nr() {
        return this.f788O;
    }

    public final int t() {
        return this.nr;
    }

    public String toString() {
        return "CodecTestResult(type=" + this.f789n + ", testFrames=" + this.rl + ", params=" + this.f790t + ", decoderCount=" + this.nr + ", encoderCount=" + this.f788O + ")";
    }
}
