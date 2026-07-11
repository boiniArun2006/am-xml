package Si;

import android.view.SurfaceHolder;
import com.alightcreative.app.motion.scene.SceneHolder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface Xo extends Cp.j {

    public static final class j {
        public static /* synthetic */ void n(Xo xo, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
            }
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            xo.nY(z2);
        }

        public static /* synthetic */ void rl(Xo xo, Function0 function0, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: releaseCodecInstances");
            }
            if ((i2 & 1) != 0) {
                function0 = null;
            }
            xo.v(function0);
        }

        public static /* synthetic */ void t(Xo xo, int i2, boolean z2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: seek");
            }
            if ((i3 & 2) != 0) {
                z2 = false;
            }
            xo.HI(i2, z2);
        }

        public static void nr(Xo xo, int i2, boolean z2) {
            xo.HI(i2, z2);
        }
    }

    void HI(int i2, boolean z2);

    SceneHolder J2();

    void S(Function1 function1);

    float Uo(int i2);

    void WPU(cBL.j jVar);

    void XQ(Function1 function1);

    void aYN();

    void e(Function1 function1);

    void fD(Function1 function1);

    void gh(Function1 function1);

    void iF(SurfaceHolder surfaceHolder);

    void mUb(int i2, boolean z2);

    void nY(boolean z2);

    void pause();

    void r();

    SurfaceHolder rV9();

    void ty(Function1 function1);

    void v(Function0 function0);

    void wTp();
}
