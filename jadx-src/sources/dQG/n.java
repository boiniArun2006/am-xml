package dQG;

import android.opengl.GLUtils;
import com.alightcreative.gl.egl.EGLException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {
    public static final String n(EGLException eGLException) {
        Intrinsics.checkNotNullParameter(eGLException, "<this>");
        String hexString = Integer.toHexString(eGLException.getError());
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        return hexString;
    }

    public static final String rl(EGLException eGLException) {
        Intrinsics.checkNotNullParameter(eGLException, "<this>");
        String eGLErrorString = GLUtils.getEGLErrorString(eGLException.getError());
        Intrinsics.checkNotNullExpressionValue(eGLErrorString, "getEGLErrorString(...)");
        return eGLErrorString;
    }
}
