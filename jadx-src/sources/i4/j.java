package i4;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0965j f68102n = new C0965j(null);

    /* JADX INFO: renamed from: i4.j$j, reason: collision with other inner class name */
    public static final class C0965j {
        public /* synthetic */ C0965j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0965j() {
        }
    }

    public final void n(int[] frameDurationMs) {
        Intrinsics.checkNotNullParameter(frameDurationMs, "frameDurationMs");
        int length = frameDurationMs.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (frameDurationMs[i2] < 11) {
                frameDurationMs[i2] = 100;
            }
        }
    }

    public final int[] rl(int[] frameDurationsMs) {
        Intrinsics.checkNotNullParameter(frameDurationsMs, "frameDurationsMs");
        int[] iArr = new int[frameDurationsMs.length];
        int length = frameDurationsMs.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = i2;
            i2 += frameDurationsMs[i3];
        }
        return iArr;
    }

    public final int t(int[] frameDurationMs) {
        Intrinsics.checkNotNullParameter(frameDurationMs, "frameDurationMs");
        int i2 = 0;
        for (int i3 : frameDurationMs) {
            i2 += i3;
        }
        return i2;
    }
}
