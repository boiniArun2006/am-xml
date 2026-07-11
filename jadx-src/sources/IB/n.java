package IB;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import com.alightcreative.gl.OpenGLException;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dQG.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z.KH;
import z.OU;
import z.fg;
import z.l4Z;
import z.mz;
import z.rv6;
import z.xZD;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements mz {
    private EGLSurface J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final z f4063O;
    private Thread Uo;
    private fg mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final dQG.j f4064n;
    private final EGLSurface nr;
    private final EGLConfig rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final EGLContext f4065t;
    private int xMQ;

    public /* synthetic */ n(dQG.j jVar, EGLConfig eGLConfig, EGLContext eGLContext, EGLSurface eGLSurface, z zVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, eGLConfig, eGLContext, eGLSurface, zVar);
    }

    private n(dQG.j egl, EGLConfig eglConfig, EGLContext eglContext, EGLSurface dummySurface, z renderingContextImpl) {
        Intrinsics.checkNotNullParameter(egl, "egl");
        Intrinsics.checkNotNullParameter(eglConfig, "eglConfig");
        Intrinsics.checkNotNullParameter(eglContext, "eglContext");
        Intrinsics.checkNotNullParameter(dummySurface, "dummySurface");
        Intrinsics.checkNotNullParameter(renderingContextImpl, "renderingContextImpl");
        this.f4064n = egl;
        this.rl = eglConfig;
        this.f4065t = eglContext;
        this.nr = dummySurface;
        this.f4063O = renderingContextImpl;
        this.J2 = dummySurface;
        this.KN = 1;
        this.xMQ = 1;
        this.mUb = l4Z.f76316n;
    }

    @Override // z.mz
    public int O() {
        return this.KN;
    }

    @Override // z.mz
    public void ViF(fg value) throws OpenGLException {
        Intrinsics.checkNotNullParameter(value, "value");
        bzg();
        if (Intrinsics.areEqual(this.mUb, value)) {
            return;
        }
        this.mUb = value;
        Xw(value);
    }

    @Override // z.mz
    public fg ck() {
        return this.mUb;
    }

    @Override // z.mz
    public int nr() {
        return this.xMQ;
    }

    @Override // z.mz
    public KH rl() {
        return this.f4063O;
    }

    private final void Xw(fg fgVar) throws OpenGLException {
        EGLSurface eGLSurfaceN;
        Pair pairO;
        bzg();
        EGLSurface eGLSurface = this.J2;
        if (!dQG.Ml.rl(eGLSurface, this.nr)) {
            this.f4064n.KN(eGLSurface);
        }
        l4Z l4z = l4Z.f76316n;
        if (Intrinsics.areEqual(fgVar, l4z)) {
            eGLSurfaceN = this.nr;
        } else if (fgVar instanceof OU) {
            OU ou2 = (OU) fgVar;
            eGLSurfaceN = this.f4064n.J2(this.rl, MapsKt.mapOf(TuplesKt.to(12375, Integer.valueOf(ou2.rl())), TuplesKt.to(12374, Integer.valueOf(ou2.n()))));
        } else if (fgVar instanceof xZD) {
            eGLSurfaceN = j.n.n(this.f4064n, this.rl, ((xZD) fgVar).n(), null, 4, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.J2 = eGLSurfaceN;
        this.f4064n.t(new j.C0839j(eGLSurfaceN, eGLSurfaceN, this.f4065t, null));
        if (Intrinsics.areEqual(fgVar, l4z)) {
            pairO = TuplesKt.to(1, 1);
        } else if (fgVar instanceof OU) {
            OU ou3 = (OU) fgVar;
            pairO = TuplesKt.to(Integer.valueOf(ou3.rl()), Integer.valueOf(ou3.n()));
        } else if (fgVar instanceof xZD) {
            pairO = w6.O(this.f4064n, eGLSurfaceN);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int iIntValue = ((Number) pairO.component1()).intValue();
        int iIntValue2 = ((Number) pairO.component2()).intValue();
        this.xMQ = iIntValue;
        this.KN = iIntValue2;
        this.f4063O.B(iIntValue, iIntValue2);
        if (Intrinsics.areEqual(fgVar, l4z)) {
            this.f4063O.rV9();
        }
    }

    private final void bzg() {
        Thread threadCurrentThread = Thread.currentThread();
        if (Intrinsics.areEqual(threadCurrentThread, this.Uo)) {
            return;
        }
        throw new IllegalStateException(("The OpenGL context is not current on the caller thread.Caller thread: " + threadCurrentThread + ", current thread: " + this.Uo).toString());
    }

    @Override // z.mz
    public void E2(long j2) {
        bzg();
        this.f4064n.Uo(this.J2, j2);
    }

    @Override // z.mz
    public void N() {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.Uo;
        if (thread != null && !Intrinsics.areEqual(thread, threadCurrentThread)) {
            throw new IllegalStateException(("The OpenGL context is already current on another thread. Caller thread: " + threadCurrentThread + ", current thread: " + thread).toString());
        }
        EGLSurface eGLSurface = this.J2;
        this.f4064n.t(new j.C0839j(eGLSurface, eGLSurface, this.f4065t, null));
        this.Uo = threadCurrentThread;
    }

    @Override // z.mz
    public void qie() throws OpenGLException {
        Object objM313constructorimpl;
        bzg();
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f4064n.rl(this.J2);
            objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl != null) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
            w6.J2(firebaseCrashlytics);
            firebaseCrashlytics.recordException(thM316exceptionOrNullimpl);
            ViF(l4Z.f76316n);
        }
    }

    @Override // Cp.j
    public void release() {
        bzg();
        this.f4063O.FX();
        this.f4064n.t(null);
        EGLSurface eGLSurface = this.J2;
        if (!dQG.Ml.rl(eGLSurface, this.nr)) {
            this.f4064n.KN(eGLSurface);
        }
        this.f4064n.KN(this.nr);
        this.f4064n.O(this.f4065t);
        rv6.f76332n.XQ(this.f4065t);
    }

    @Override // z.mz
    public boolean xMQ() {
        return Intrinsics.areEqual(Thread.currentThread(), this.Uo);
    }
}
