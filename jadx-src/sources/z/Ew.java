package z;

import android.opengl.GLES20;
import com.alightcreative.gl.OpenGLException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ew {
    public static final int nr() throws OpenGLException {
        int[] iArr = new int[1];
        GLES20.glGenRenderbuffers(1, iArr, 0);
        AbstractC2478o.rl();
        return iArr[0];
    }

    public static final int J2(Pmq pmq) {
        Intrinsics.checkNotNullParameter(pmq, "<this>");
        return pmq.O() * pmq.rl() * pmq.n().rl();
    }

    public static final int O(String tag) throws OpenGLException {
        Intrinsics.checkNotNullParameter(tag, "tag");
        AbstractC2478o.rl();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        AbstractC2478o.rl();
        rv6.f76332n.ViF(iArr[0], tag);
        return iArr[0];
    }

    public static final int Uo(Pmq pmq) {
        Intrinsics.checkNotNullParameter(pmq, "<this>");
        return pmq.O() * pmq.rl() * (pmq.n().t() ? 4 : 3);
    }

    public static final Pmq t(Pmq pmq, int i2) {
        Intrinsics.checkNotNullParameter(pmq, "<this>");
        return (i2 <= 1 || pmq.O() <= 16 || pmq.rl() <= 16) ? pmq : (pmq.O() / i2 < 16 || pmq.rl() / i2 < 16) ? pmq.O() > pmq.rl() ? new Pmq(16, (pmq.O() * 16) / pmq.rl(), pmq.n(), 0, 0, 24, null) : new Pmq((pmq.rl() * 16) / pmq.O(), 16, pmq.n(), 0, 0, 24, null) : new Pmq(Math.max(16, pmq.O() / i2), Math.max(16, pmq.rl() / i2), pmq.n(), 0, 0, 24, null);
    }

    public static final void n(int i2) throws OpenGLException {
        GLES20.glDeleteRenderbuffers(1, new int[]{i2}, 0);
        AbstractC2478o.rl();
    }

    public static final void rl(int i2) throws OpenGLException {
        AbstractC2478o.rl();
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        AbstractC2478o.rl();
        rv6.f76332n.aYN(i2);
    }
}
