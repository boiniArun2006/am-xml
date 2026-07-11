package as;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ml implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43088n = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f43089t = t(0);

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final int n() {
            return Ml.f43089t;
        }
    }

    public static final int KN(int i2, int i3) {
        return t(i2 - i3);
    }

    public static final int xMQ(int i2, int i3) {
        return t(i2 + i3);
    }

    public static final boolean Uo(int i2) {
        return i2 == 0;
    }

    public static String mUb(int i2) {
        return "AudioFrameCount(value=" + i2 + ')';
    }

    public static final boolean nr(int i2, int i3) {
        return i2 == i3;
    }

    public static int t(int i2) {
        LRC.j.rl(i2, "audio frame count");
        return i2;
    }

    public static int J2(int i2) {
        return Integer.hashCode(i2);
    }

    public static int rl(int i2, int i3) {
        return Intrinsics.compare(i2, i3);
    }
}
