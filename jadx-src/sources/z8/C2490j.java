package z8;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2490j {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Set f76367O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76368n;
    private final Set nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76369t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2490j)) {
            return false;
        }
        C2490j c2490j = (C2490j) obj;
        return this.f76368n == c2490j.f76368n && this.rl == c2490j.rl && this.f76369t == c2490j.f76369t && Intrinsics.areEqual(this.nr, c2490j.nr) && Intrinsics.areEqual(this.f76367O, c2490j.f76367O) && Intrinsics.areEqual(this.J2, c2490j.J2);
    }

    public C2490j(int i2, int i3, int i5, Set encoderNames, Set decoderNames, String chipset) {
        Intrinsics.checkNotNullParameter(encoderNames, "encoderNames");
        Intrinsics.checkNotNullParameter(decoderNames, "decoderNames");
        Intrinsics.checkNotNullParameter(chipset, "chipset");
        this.f76368n = i2;
        this.rl = i3;
        this.f76369t = i5;
        this.nr = encoderNames;
        this.f76367O = decoderNames;
        this.J2 = chipset;
    }

    public final int J2() {
        return this.f76369t;
    }

    public final int O() {
        return this.f76368n;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f76368n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f76369t)) * 31) + this.nr.hashCode()) * 31) + this.f76367O.hashCode()) * 31) + this.J2.hashCode();
    }

    public final String n() {
        return this.J2;
    }

    public final int nr() {
        return this.rl;
    }

    public final Set rl() {
        return this.f76367O;
    }

    public final Set t() {
        return this.nr;
    }

    public String toString() {
        return "DeviceCaps(maxImportRes=" + this.f76368n + ", maxExportRes=" + this.rl + ", maxRes=" + this.f76369t + ", encoderNames=" + this.nr + ", decoderNames=" + this.f76367O + ", chipset=" + this.J2 + ")";
    }
}
