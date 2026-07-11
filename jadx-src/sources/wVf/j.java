package wVf;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface j {

    /* JADX INFO: renamed from: wVf.j$j, reason: collision with other inner class name */
    public static final class C1259j {
        public static void O(j jVar, n bitmapFramePreparer, zdu.n bitmapFrameCache, y8.j animationBackend, int i2, Function0 function0) {
            Intrinsics.checkNotNullParameter(bitmapFramePreparer, "bitmapFramePreparer");
            Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
            Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        }

        public static void n(j jVar) {
        }

        public static void nr(j jVar, int i2, int i3, Function0 function0) {
        }

        public static Pj0.j rl(j jVar, int i2, int i3, int i5) {
            return null;
        }

        public static void t(j jVar) {
        }

        public static /* synthetic */ void J2(j jVar, n nVar, zdu.n nVar2, y8.j jVar2, int i2, Function0 function0, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareFrames");
            }
            if ((i3 & 16) != 0) {
                function0 = null;
            }
            jVar.nr(nVar, nVar2, jVar2, i2, function0);
        }
    }

    void n(int i2, int i3, Function0 function0);

    void nr(n nVar, zdu.n nVar2, y8.j jVar, int i2, Function0 function0);

    void onStop();

    Pj0.j rl(int i2, int i3, int i5);

    void t();
}
