package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class GlUtil {
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    private static final String TAG = "GlUtil";
    public static boolean glAssertionsEnabled;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};
    private static final int EGL_GL_COLORSPACE_KHR = 12445;
    private static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344};
    private static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    private static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    private static final class j {
        @DoNotInline
        private static EGLConfig J2(EGLDisplay eGLDisplay, int[] iArr) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                GlUtil.throwGlException("eglChooseConfig failed.");
            }
            return eGLConfigArr[0];
        }

        @DoNotInline
        public static void O(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3, int i5) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != i2) {
                GLES20.glBindFramebuffer(36160, i2);
            }
            GlUtil.checkGlError();
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GlUtil.checkEglException("Error making context current");
            GLES20.glViewport(0, 0, i3, i5);
            GlUtil.checkGlError();
        }

        @DoNotInline
        public static EGLDisplay rl() {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.checkEglException(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0)) {
                GlUtil.throwGlException("Error in eglInitialize.");
            }
            GlUtil.checkGlError();
            return eGLDisplayEglGetDisplay;
        }

        @DoNotInline
        public static EGLContext n(EGLDisplay eGLDisplay, int i2, int[] iArr) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, J2(eGLDisplay, iArr), EGL14.EGL_NO_CONTEXT, new int[]{12440, i2, 12344}, 0);
            if (eGLContextEglCreateContext == null) {
                EGL14.eglTerminate(eGLDisplay);
                GlUtil.throwGlException("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i2);
            }
            GlUtil.checkGlError();
            return eGLContextEglCreateContext;
        }

        @DoNotInline
        public static void nr(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            GlUtil.checkEglException("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                GlUtil.checkEglException("Error destroying context");
            }
            EGL14.eglReleaseThread();
            GlUtil.checkEglException("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            GlUtil.checkEglException("Error terminating display");
        }

        @DoNotInline
        public static EGLSurface Uo(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) {
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, J2(eGLDisplay, iArr), obj, iArr2, 0);
            GlUtil.checkEglException("Error creating surface");
            return eGLSurfaceEglCreateWindowSurface;
        }

        @DoNotInline
        public static EGLSurface t(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, J2(eGLDisplay, iArr), iArr2, 0);
            GlUtil.checkEglException("Error creating surface");
            return eGLSurfaceEglCreatePbufferSurface;
        }
    }

    public static void assertValidTextureSize(int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i5 = iArr[0];
        if (i2 < 0 || i3 < 0) {
            throwGlException("width or height is less than 0");
        }
        if (i2 > i5 || i3 > i5) {
            throwGlException("width or height is greater than GL_MAX_TEXTURE_SIZE " + i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkEglException(boolean z2, String str) {
        if (z2) {
            return;
        }
        throwGlException(str);
    }

    public static void checkGlError() {
        int i2 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            Log.e(TAG, "glError: " + GLU.gluErrorString(iGlGetError));
            i2 = iGlGetError;
        }
        if (i2 != 0) {
            throwGlException("glError: " + GLU.gluErrorString(i2));
        }
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    @RequiresApi
    public static EGLContext createEglContext(EGLDisplay eGLDisplay) {
        return j.n(eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    @RequiresApi
    public static EGLContext createEglContextEs3Rgba1010102(EGLDisplay eGLDisplay) {
        return j.n(eGLDisplay, 3, EGL_CONFIG_ATTRIBUTES_RGBA_1010102);
    }

    @RequiresApi
    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3) {
        j.O(eGLDisplay, eGLContext, eGLSurface, 0, i2, i3);
    }

    @RequiresApi
    public static void focusPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        focusEglSurface(eGLDisplay, eGLContext, createPbufferSurface(eGLDisplay, 1, 1), 1, 1);
    }

    @RequiresApi
    public static void focusPlaceholderEglSurfaceBt2020Pq(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        focusEglSurface(eGLDisplay, eGLContext, j.t(eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_1010102, new int[]{12375, 1, 12374, 1, EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344}), 1, 1);
    }

    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return Util.fromUtf8Bytes(Util.toByteArray(inputStreamOpen));
        } finally {
            Util.closeQuietly(inputStreamOpen);
        }
    }

    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkEglException(String str) {
        int iEglGetError = EGL14.eglGetError();
        checkEglException(iEglGetError == 12288, str + ", error code: " + iEglGetError);
    }

    public static FloatBuffer createBuffer(int i2) {
        return ByteBuffer.allocateDirect(i2 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    @RequiresApi
    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i2, int i3) {
        return j.t(eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888, new int[]{12375, i2, 12374, i3, 12344});
    }

    @RequiresApi
    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj) {
        return j.Uo(eGLDisplay, obj, EGL_CONFIG_ATTRIBUTES_RGBA_8888, EGL_WINDOW_SURFACE_ATTRIBUTES_NONE);
    }

    @RequiresApi
    public static EGLSurface getEglSurfaceBt2020Pq(EGLDisplay eGLDisplay, Object obj) {
        return j.Uo(eGLDisplay, obj, EGL_CONFIG_ATTRIBUTES_RGBA_1010102, EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ);
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        String strEglQueryString;
        int i2 = Util.SDK_INT;
        if (i2 < 24) {
            return false;
        }
        if (i2 >= 26 || !("samsung".equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            return (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_PROTECTED_CONTENT);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String strEglQueryString;
        return Util.SDK_INT >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_SURFACELESS_CONTEXT);
    }

    static void throwGlException(String str) {
        if (glAssertionsEnabled) {
            throw new GlException(str);
        }
        Log.e(TAG, str);
    }

    private GlUtil() {
    }

    public static void bindTexture(int i2, int i3) {
        GLES20.glBindTexture(i2, i3);
        checkGlError();
        GLES20.glTexParameteri(i2, 10240, C.TEXTURE_MIN_FILTER_LINEAR);
        checkGlError();
        GLES20.glTexParameteri(i2, 10241, C.TEXTURE_MIN_FILTER_LINEAR);
        checkGlError();
        GLES20.glTexParameteri(i2, 10242, 33071);
        checkGlError();
        GLES20.glTexParameteri(i2, 10243, 33071);
        checkGlError();
    }

    @RequiresApi
    public static EGLDisplay createEglDisplay() {
        return j.rl();
    }

    public static int createExternalTexture() {
        int iGenerateTexture = generateTexture();
        bindTexture(36197, iGenerateTexture);
        return iGenerateTexture;
    }

    public static int createFboForTexture(int i2) {
        checkEglException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        checkGlError();
        return iArr[0];
    }

    @RequiresApi
    public static EGLSurface createPlaceholderEglSurface(EGLDisplay eGLDisplay) {
        if (isSurfacelessContextExtensionSupported()) {
            return EGL14.EGL_NO_SURFACE;
        }
        return createPbufferSurface(eGLDisplay, 1, 1);
    }

    public static int createTexture(int i2, int i3) {
        assertValidTextureSize(i2, i3);
        int iGenerateTexture = generateTexture();
        bindTexture(3553, iGenerateTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, ByteBuffer.allocateDirect(i2 * i3 * 4));
        checkGlError();
        return iGenerateTexture;
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i2 = 0; i2 < list.size(); i2++) {
            System.arraycopy(list.get(i2), 0, fArr, i2 * 4, 4);
        }
        return fArr;
    }

    public static void deleteTexture(int i2) {
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        checkGlError();
    }

    @RequiresApi
    public static void destroyEglContext(@Nullable EGLDisplay eGLDisplay, @Nullable EGLContext eGLContext) {
        j.nr(eGLDisplay, eGLContext);
    }

    @RequiresApi
    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3, int i5) {
        j.O(eGLDisplay, eGLContext, eGLSurface, i2, i3, i5);
    }

    private static int generateTexture() {
        checkEglException(!Util.areEqual(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }
}
