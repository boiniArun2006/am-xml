package Ij5;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.alightcreative.gl.egl.EGLException;
import dQG.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements dQG.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EGLDisplay f4300n;
    private final j.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final j f4299t = new j(null);
    public static final int nr = 8;

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public n(EGLDisplay display, j.Ml version) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f4300n = display;
        this.rl = version;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer qie(int i2) {
        return Integer.valueOf(i2 * 2);
    }

    @Override // dQG.j
    public EGLSurface J2(EGLConfig config, Map surfaceConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(surfaceConfig, "surfaceConfig");
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f4300n, config, w6.nr(surfaceConfig), 0);
        if (!(eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE)) {
            throw new EGLException(EGL14.eglGetError(), "eglCreatePbufferSurface");
        }
        Intrinsics.checkNotNull(eGLSurfaceEglCreatePbufferSurface);
        return dQG.Ml.n(eGLSurfaceEglCreatePbufferSurface);
    }

    @Override // dQG.j
    public void KN(EGLSurface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (!EGL14.eglDestroySurface(this.f4300n, surface)) {
            throw new EGLException(EGL14.eglGetError(), "eglDestroySurface");
        }
    }

    @Override // dQG.j
    public void O(EGLContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!EGL14.eglDestroyContext(this.f4300n, context)) {
            throw new EGLException(EGL14.eglGetError(), "eglDestroyContext");
        }
    }

    @Override // dQG.j
    public void Uo(EGLSurface surface, long j2) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (!EGLExt.eglPresentationTimeANDROID(this.f4300n, surface, j2)) {
            throw new EGLException(EGL14.eglGetError(), "eglPresentationTimeANDROID");
        }
    }

    @Override // dQG.j
    public EGLContext mUb(EGLConfig config, EGLContext eGLContext, Map contextConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(contextConfig, "contextConfig");
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f4300n, config, w6.t(eGLContext), w6.nr(contextConfig), 0);
        if (!(eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT)) {
            throw new EGLException(EGL14.eglGetError(), "eglCreateContext");
        }
        Intrinsics.checkNotNull(eGLContextEglCreateContext);
        return dQG.w6.n(eGLContextEglCreateContext);
    }

    @Override // dQG.j
    public int n(EGLSurface surface, int i2) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        int[] iArr = new int[1];
        if (EGL14.eglQuerySurface(this.f4300n, surface, i2, iArr, 0)) {
            return iArr[0];
        }
        throw new EGLException(EGL14.eglGetError(), "eglQuerySurface");
    }

    @Override // dQG.j
    public EGLSurface nr(EGLConfig config, Surface surface, Map surfaceConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(surfaceConfig, "surfaceConfig");
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f4300n, config, surface, w6.nr(surfaceConfig), 0);
        if (!(eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE)) {
            throw new EGLException(EGL14.eglGetError(), "eglCreateWindowSurface");
        }
        Intrinsics.checkNotNull(eGLSurfaceEglCreateWindowSurface);
        return dQG.Ml.n(eGLSurfaceEglCreateWindowSurface);
    }

    @Override // dQG.j
    public void rl(EGLSurface surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        if (!EGL14.eglSwapBuffers(this.f4300n, surface)) {
            throw new EGLException(EGL14.eglGetError(), "eglSwapBuffers");
        }
    }

    @Override // dQG.j
    public void t(j.C0839j c0839j) {
        boolean zEglMakeCurrent;
        if (c0839j == null) {
            EGLDisplay eGLDisplay = this.f4300n;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            zEglMakeCurrent = EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        } else {
            zEglMakeCurrent = EGL14.eglMakeCurrent(this.f4300n, c0839j.rl(), c0839j.t(), c0839j.n());
        }
        if (!zEglMakeCurrent) {
            throw new EGLException(EGL14.eglGetError(), "eglMakeCurrent");
        }
    }

    @Override // dQG.j
    public List xMQ(Map attributeList) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(attributeList, "attributeList");
        int[] iArr = new int[1];
        int[] iArrNr = w6.nr(attributeList);
        Iterator it = SequencesKt.generateSequence(128, (Function1<? super int, ? extends int>) new Function1() { // from class: Ij5.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.qie(((Integer) obj).intValue());
            }
        }).iterator();
        do {
            arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            EGLConfig[] eGLConfigArr = new EGLConfig[iIntValue];
            if (!EGL14.eglChooseConfig(this.f4300n, iArrNr, 0, eGLConfigArr, 0, iIntValue, iArr, 0)) {
                throw new EGLException(EGL14.eglGetError(), "eglChooseConfig");
            }
            int i2 = iArr[0];
            if (i2 < iIntValue) {
                List<EGLConfig> listTake = ArraysKt.take(eGLConfigArr, i2);
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
                for (EGLConfig eGLConfig : listTake) {
                    if (eGLConfig == null) {
                        throw new IllegalStateException("Unexpected null EGL configuration");
                    }
                    arrayList.add(eGLConfig);
                }
            }
        } while (arrayList == null);
        if (arrayList != null) {
            return arrayList;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }
}
