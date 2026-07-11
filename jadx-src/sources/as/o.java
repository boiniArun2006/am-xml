package as;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class o implements Comparable {
    public static String J2(int i2) {
        return "ByteCountPerSample(value=" + i2 + ')';
    }

    public static int rl(int i2) {
        LRC.n.t(i2, "byte count per sample");
        return i2;
    }

    public static final boolean t(int i2, int i3) {
        return i2 == i3;
    }

    public static int n(int i2, int i3) {
        return Intrinsics.compare(i2, i3);
    }

    public static int nr(int i2) {
        return Integer.hashCode(i2);
    }
}
