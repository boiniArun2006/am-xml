package IB;

import android.content.Context;
import android.content.res.AssetManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.alightcreative.gl.egl.EGLException;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dQG.j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import z.C2477n;
import z.mz;
import z.rv6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f4069n = 12610;
    private static final Map rl = MapsKt.mapOf(TuplesKt.to(12440, 2));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f4070t = CollectionsKt.listOf((Object[]) new Map[]{MapsKt.mapOf(TuplesKt.to(12352, 4), TuplesKt.to(12339, 4), TuplesKt.to(12322, 8), TuplesKt.to(12323, 8), TuplesKt.to(12324, 8), TuplesKt.to(12321, 8), TuplesKt.to(12325, 24), TuplesKt.to(12326, 8)), MapsKt.mapOf(TuplesKt.to(12352, 4), TuplesKt.to(12339, 4), TuplesKt.to(12322, 8), TuplesKt.to(12323, 8), TuplesKt.to(12324, 8), TuplesKt.to(12321, 8), TuplesKt.to(12325, 16), TuplesKt.to(12326, 8))});
    private static final Map nr = MapsKt.mapOf(TuplesKt.to(12375, 1), TuplesKt.to(12374, 1));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair O(dQG.j jVar, EGLSurface eGLSurface) {
        return TuplesKt.to(Integer.valueOf(jVar.n(eGLSurface, 12375)), Integer.valueOf(jVar.n(eGLSurface, 12374)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final mz n(Context context, String tag, boolean z2, String shadersAssetPath) {
        EGLConfig eGLConfig;
        Set setEmptySet;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(shadersAssetPath, "shadersAssetPath");
        dQG.j jVarN = j.w6.C0840j.n(new Ij5.I28(null, 1, null == true ? 1 : 0), 0, 1, null);
        Map mapMapOf = z2 ? MapsKt.mapOf(TuplesKt.to(Integer.valueOf(f4069n), 1)) : MapsKt.emptyMap();
        Iterator it = f4070t.iterator();
        while (true) {
            if (!it.hasNext()) {
                eGLConfig = null;
                break;
            }
            eGLConfig = (EGLConfig) CollectionsKt.firstOrNull(jVarN.xMQ(MapsKt.plus((Map) it.next(), mapMapOf)));
            if (eGLConfig != null) {
                break;
            }
        }
        if (eGLConfig == null) {
            throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
        EGLContext eGLContextMUb = jVarN.mUb(eGLConfig, null, rl);
        rv6.f76332n.S(tag, eGLContextMUb);
        EGLSurface eGLSurfaceJ2 = jVarN.J2(eGLConfig, nr);
        AssetManager assets = context.getApplicationContext().getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        C2477n c2477n = new C2477n(assets, shadersAssetPath);
        j.C0839j c0839j = new j.C0839j(eGLSurfaceJ2, eGLSurfaceJ2, eGLContextMUb, null == true ? 1 : 0);
        EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        EGLSurface eGLSurfaceEglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        jVarN.t(c0839j);
        try {
            WzY.QJ qj = new WzY.QJ();
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(3379, iArr, 0);
            int iMax = Math.max(1024, iArr[0]);
            String strGlGetString = GLES20.glGetString(7939);
            if (strGlGetString == null || (listSplit$default = StringsKt.split$default((CharSequence) strGlGetString, new String[]{" "}, false, 0, 6, (Object) null)) == null || (setEmptySet = CollectionsKt.toSet(listSplit$default)) == null) {
                setEmptySet = SetsKt.emptySet();
            }
            z zVar = new z(iMax, qj, c2477n, setEmptySet.contains("GL_OES_packed_depth_stencil"));
            if (Intrinsics.areEqual(eGLDisplayEglGetCurrentDisplay, EGL14.EGL_NO_DISPLAY)) {
                jVarN.t(null);
            } else if (!EGL14.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface2, eGLSurfaceEglGetCurrentSurface, eGLContextEglGetCurrentContext)) {
                throw new EGLException(EGL14.eglGetError(), "eglMakeCurrent");
            }
            return new n(jVarN, eGLConfig, eGLContextMUb, eGLSurfaceJ2, zVar, null);
        } catch (Throwable th) {
            if (Intrinsics.areEqual(eGLDisplayEglGetCurrentDisplay, EGL14.EGL_NO_DISPLAY)) {
                jVarN.t(null);
            } else if (!EGL14.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface2, eGLSurfaceEglGetCurrentSurface, eGLContextEglGetCurrentContext)) {
                throw new EGLException(EGL14.eglGetError(), "eglMakeCurrent");
            }
            throw th;
        }
    }

    public static /* synthetic */ mz rl(Context context, String str, boolean z2, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        if ((i2 & 8) != 0) {
            str2 = "shaders";
        }
        return n(context, str, z2, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(FirebaseCrashlytics firebaseCrashlytics) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            while (iGlGetError != 0) {
                String eGLErrorString = GLUtils.getEGLErrorString(iGlGetError);
                firebaseCrashlytics.log("pending_gl_error_code: " + iGlGetError);
                firebaseCrashlytics.log("pending_gl_error_code_message: " + eGLErrorString);
                iGlGetError = GLES20.glGetError();
            }
        }
    }
}
