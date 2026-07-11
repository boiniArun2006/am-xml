package Q4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f7906n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f7907t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return this.f7906n == ml.f7906n && this.rl == ml.rl && Intrinsics.areEqual(this.f7907t, ml.f7907t);
    }

    public Ml(int i2, int i3, j streamProperties) {
        Intrinsics.checkNotNullParameter(streamProperties, "streamProperties");
        this.f7906n = i2;
        this.rl = i3;
        this.f7907t = streamProperties;
        LRC.j.rl(i2, "encoder delay");
        LRC.j.rl(i3, "encoder padding");
    }

    public static /* synthetic */ Ml rl(Ml ml, int i2, int i3, j jVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = ml.f7906n;
        }
        if ((i5 & 2) != 0) {
            i3 = ml.rl;
        }
        if ((i5 & 4) != 0) {
            jVar = ml.f7907t;
        }
        return ml.n(i2, i3, jVar);
    }

    public final j J2() {
        return this.f7907t;
    }

    public final int O() {
        return this.f7907t.t();
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f7906n) * 31) + Integer.hashCode(this.rl)) * 31) + this.f7907t.hashCode();
    }

    public final Ml n(int i2, int i3, j streamProperties) {
        Intrinsics.checkNotNullParameter(streamProperties, "streamProperties");
        return new Ml(i2, i3, streamProperties);
    }

    public final int nr() {
        return this.f7906n;
    }

    public final int t() {
        return this.f7907t.rl();
    }

    public String toString() {
        return "FelliniAudioFormat(encoderDelay=" + this.f7906n + ", encoderPadding=" + this.rl + ", streamProperties=" + this.f7907t + ')';
    }
}
