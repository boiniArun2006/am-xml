package z;

import android.opengl.GLU;
import com.alightcreative.gl.OpenGLOutOfMemoryException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Xo {
    public static final void n(int i2, String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        rv6 rv6Var = rv6.f76332n;
        rv6Var.xMQ(true);
        if (Ogx.Uo()) {
            return;
        }
        Thread.sleep(10L);
        if (i2 == 1285) {
            throw new OpenGLOutOfMemoryException("Error " + i2 + " (Insufficient GPU RAM) GLStats=[[" + rv6Var.az() + "]] " + msg);
        }
        String strGluErrorString = GLU.gluErrorString(i2);
        if (strGluErrorString == null) {
            strGluErrorString = "Unknown";
        }
        throw new OpenGLOutOfMemoryException("Error " + i2 + " (" + strGluErrorString + " GLStats=[[" + rv6Var.az() + "]]) " + msg);
    }
}
