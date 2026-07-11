package dQG;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {
    public static EGLSurface n(EGLSurface eglSurface) {
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        if (eglSurface != EGL14.EGL_NO_SURFACE) {
            return eglSurface;
        }
        throw new IllegalArgumentException(("Invalid surface: " + eglSurface).toString());
    }

    public static String nr(EGLSurface eGLSurface) {
        return "FEGLSurface(eglSurface=" + eGLSurface + ")";
    }

    public static final boolean rl(EGLSurface eGLSurface, EGLSurface eGLSurface2) {
        return Intrinsics.areEqual(eGLSurface, eGLSurface2);
    }

    public static int t(EGLSurface eGLSurface) {
        return eGLSurface.hashCode();
    }
}
