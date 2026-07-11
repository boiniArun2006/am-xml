package dQG;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {
    public static EGLContext n(EGLContext eglContext) {
        Intrinsics.checkNotNullParameter(eglContext, "eglContext");
        if (eglContext != EGL14.EGL_NO_CONTEXT) {
            return eglContext;
        }
        throw new IllegalArgumentException(("Invalid context: " + eglContext).toString());
    }

    public static String nr(EGLContext eGLContext) {
        return "FEGLContext(eglContext=" + eGLContext + ")";
    }

    public static final boolean rl(EGLContext eGLContext, EGLContext eGLContext2) {
        return Intrinsics.areEqual(eGLContext, eGLContext2);
    }

    public static int t(EGLContext eGLContext) {
        return eGLContext.hashCode();
    }
}
