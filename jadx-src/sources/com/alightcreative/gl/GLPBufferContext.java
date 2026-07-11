package com.alightcreative.gl;

import XoT.C;
import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.gl.GLPBufferContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z.rv6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class GLPBufferContext {
    private int J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private EGLConfig f46618O;
    private int Uo;
    private final Matrix gh;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f46619n;
    private EGLContext nr;
    private EGLDisplay rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private EGLSurface f46620t;
    private int xMQ;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/alightcreative/gl/GLPBufferContext$EGLException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EGLException extends Exception {
        /* JADX WARN: Multi-variable type inference failed */
        public EGLException() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public EGLException(String str) {
            super(str);
        }

        public /* synthetic */ EGLException(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str);
        }
    }

    private final void mUb() {
    }

    public GLPBufferContext(String contextTag) {
        Intrinsics.checkNotNullParameter(contextTag, "contextTag");
        this.f46619n = contextTag;
        this.rl = EGL14.EGL_NO_DISPLAY;
        this.f46620t = EGL14.EGL_NO_SURFACE;
        this.nr = EGL14.EGL_NO_CONTEXT;
        this.gh = new Matrix();
    }

    private final int[] HI(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(((Number) entry.getKey()).intValue()), Integer.valueOf(((Number) entry.getValue()).intValue())}));
        }
        return CollectionsKt.toIntArray(CollectionsKt.plus((Collection<? extends int>) arrayList, 12344));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void J2(int i2, int i3) throws EGLException {
        final GLPBufferContext gLPBufferContext;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.rl = eGLDisplayEglGetDisplay;
        int[] iArr = new int[2];
        EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        Iterator it = CollectionsKt.listOf((Object[]) new Map[]{MapsKt.mapOf(TuplesKt.to(12352, 4), TuplesKt.to(12339, 4), TuplesKt.to(12322, 8), TuplesKt.to(12323, 8), TuplesKt.to(12324, 8), TuplesKt.to(12325, 24), TuplesKt.to(12326, 8)), MapsKt.mapOf(TuplesKt.to(12352, 4), TuplesKt.to(12339, 4), TuplesKt.to(12322, 8), TuplesKt.to(12323, 8), TuplesKt.to(12324, 8), TuplesKt.to(12325, 16), TuplesKt.to(12326, 8))}).iterator();
        while (true) {
            if (!it.hasNext()) {
                gLPBufferContext = this;
                break;
            }
            Map map = (Map) it.next();
            gLPBufferContext = this;
            EGL14.eglChooseConfig(gLPBufferContext.rl, gLPBufferContext.HI(map), 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (iArr2[0] >= 0) {
                Object obj = map.get(12322);
                Intrinsics.checkNotNull(obj);
                gLPBufferContext.Uo = ((Number) obj).intValue();
                Object obj2 = map.get(12325);
                Intrinsics.checkNotNull(obj2);
                gLPBufferContext.J2 = ((Number) obj2).intValue();
                break;
            }
        }
        if (iArr2[0] < 1) {
            throw new EGLException(null, 1, null == true ? 1 : 0);
        }
        gLPBufferContext.f46618O = eGLConfigArr[0];
        C.Uo(gLPBufferContext, new Function0() { // from class: z.eO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GLPBufferContext.KN(this.f76307n);
            }
        });
        gLPBufferContext.f46620t = EGL14.eglCreatePbufferSurface(gLPBufferContext.rl, gLPBufferContext.f46618O, gLPBufferContext.HI(MapsKt.mapOf(TuplesKt.to(12375, Integer.valueOf(i2)), TuplesKt.to(12374, Integer.valueOf(i3)))), 0);
        C.Uo(gLPBufferContext, new Function0() { // from class: z.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GLPBufferContext.xMQ(this.f76344n);
            }
        });
        int[] iArr3 = new int[2];
        EGL14.eglQuerySurface(gLPBufferContext.rl, gLPBufferContext.f46620t, 12375, iArr3, 0);
        EGL14.eglQuerySurface(gLPBufferContext.rl, gLPBufferContext.f46620t, 12374, iArr3, 1);
        gLPBufferContext.KN = iArr3[0];
        gLPBufferContext.xMQ = iArr3[1];
        Matrix matrix = gLPBufferContext.gh;
        matrix.reset();
        matrix.postScale(2.0f / gLPBufferContext.KN, (-2.0f) / gLPBufferContext.xMQ);
        matrix.postTranslate(-1.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(GLPBufferContext gLPBufferContext) {
        return "chose config:" + gLPBufferContext.f46618O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(GLPBufferContext gLPBufferContext) {
        return "initEGLContext: display=" + gLPBufferContext.rl + " config=" + gLPBufferContext.f46618O;
    }

    static /* synthetic */ void Uo(GLPBufferContext gLPBufferContext, int i2, int i3, int i5, Object obj) throws EGLException {
        if ((i5 & 1) != 0) {
            i2 = 1;
        }
        if ((i5 & 2) != 0) {
            i3 = 1;
        }
        gLPBufferContext.J2(i2, i3);
    }

    private final void nr() {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(12440, 2));
        C.Uo(this, new Function0() { // from class: z.QJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GLPBufferContext.O(this.f76277n);
            }
        });
        EGLContext context = EGL14.eglCreateContext(this.rl, this.f46618O, EGL14.EGL_NO_CONTEXT, HI(mapMapOf), 0);
        this.nr = context;
        rv6 rv6Var = rv6.f76332n;
        String str = this.f46619n;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        rv6Var.S(str, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ(GLPBufferContext gLPBufferContext) {
        return "made surface:" + gLPBufferContext.f46620t;
    }

    public final void az() {
        if (this.mUb) {
            ty();
            this.mUb = false;
        }
    }

    public final void gh() throws EGLException {
        if (this.mUb) {
            throw new IllegalStateException("Check failed.");
        }
        Uo(this, 0, 0, 3, null);
        nr();
        mUb();
        qie();
        this.mUb = true;
    }

    public final int qie() {
        if (Intrinsics.areEqual(this.rl, EGL14.EGL_NO_DISPLAY)) {
            return 12289;
        }
        EGLDisplay eGLDisplay = this.rl;
        EGLSurface eGLSurface = this.f46620t;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.nr)) {
            return 12288;
        }
        return EGL14.eglGetError();
    }

    public final void ty() {
        if (!Intrinsics.areEqual(this.rl, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.rl;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLContext eGLContext = this.nr;
            if (eGLContext != null) {
                rv6.f76332n.XQ(eGLContext);
                EGL14.eglDestroyContext(this.rl, eGLContext);
            }
            if (!Intrinsics.areEqual(this.f46620t, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.rl, this.f46620t);
            }
            EGL14.eglTerminate(this.rl);
        }
        this.rl = EGL14.EGL_NO_DISPLAY;
        this.nr = EGL14.EGL_NO_CONTEXT;
        this.f46620t = EGL14.EGL_NO_SURFACE;
        this.mUb = false;
    }
}
