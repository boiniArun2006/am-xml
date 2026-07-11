package z;

import android.opengl.GLES20;
import android.opengl.GLU;
import com.alightcreative.gl.OpenGLException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC2478o {
    public static final void t(Function0 msg) throws OpenGLException {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 1285) {
            Xo.n(iGlGetError, (String) msg.invoke());
            return;
        }
        if (iGlGetError != 0) {
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "Unknown";
            }
            throw new OpenGLException("Error " + iGlGetError + " (" + strGluErrorString + ") " + msg.invoke());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(int i2) {
        String strGluErrorString = GLU.gluErrorString(i2);
        if (strGluErrorString == null) {
            strGluErrorString = "Unknown";
        }
        return "OpenGLError: " + i2 + " (" + strGluErrorString + ")";
    }

    public static final boolean nr() {
        final int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            XoT.C.HI(s4.f76335n, new Function0() { // from class: z.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC2478o.O(iGlGetError);
                }
            });
        }
        if (iGlGetError == 1285) {
            Xo.n(iGlGetError, "");
        }
        if (iGlGetError != 0) {
            return true;
        }
        return false;
    }

    public static final void rl() throws OpenGLException {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 1285) {
            Xo.n(iGlGetError, "");
            return;
        }
        if (iGlGetError != 0) {
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "Unknown";
            }
            throw new OpenGLException("Error " + iGlGetError + " (" + strGluErrorString + ")");
        }
    }
}
