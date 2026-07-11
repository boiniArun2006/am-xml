package Si;

import QmE.iF;
import Si.Xo;
import Si.o;
import TFv.Lu;
import TFv.SPz;
import TFv.rv6;
import android.content.Context;
import android.view.SurfaceHolder;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.TimeKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import yc.nKE;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class qz implements o, Xo {
    private final SPz J2;
    private final AtomicBoolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rv6 f9920O;
    private final rv6 Uo;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Xo f9921n;
    private final SPz nr;
    private final SPz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final rv6 f9922t;
    private int xMQ;

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function1 {
        I28(Object obj) {
            super(1, obj, qz.class, "mediaCoordErrorCallback", "mediaCoordErrorCallback(Lcom/alightcreative/mediacore/mediacomp/MediaCoordError;)V", 0);
        }

        public final void n(ICC.Dsr p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((qz) this.receiver).P5(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.j.n(obj);
            n(null);
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
        Ml(Object obj) {
            super(1, obj, qz.class, "currentFrameChangedCallback", "currentFrameChangedCallback(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void n(int i2) {
            ((qz) this.receiver).U(i2);
        }
    }

    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
        Wre(Object obj) {
            super(1, obj, qz.class, "playStateChangeCallback", "playStateChangeCallback(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void n(boolean z2) {
            ((qz) this.receiver).M7(z2);
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        j(Object obj) {
            super(1, obj, qz.class, "currentFrameChangedCallback", "currentFrameChangedCallback(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void n(int i2) {
            ((qz) this.receiver).U(i2);
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
        n(Object obj) {
            super(1, obj, qz.class, "mediaCoordErrorCallback", "mediaCoordErrorCallback(Lcom/alightcreative/mediacore/mediacomp/MediaCoordError;)V", 0);
        }

        public final void n(ICC.Dsr p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((qz) this.receiver).P5(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.j.n(obj);
            n(null);
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
        w6(Object obj) {
            super(1, obj, qz.class, "playStateChangeCallback", "playStateChangeCallback(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void n(boolean z2) {
            ((qz) this.receiver).M7(z2);
        }
    }

    private qz(Xo xo) {
        this.f9921n = xo;
        SPz sPzN = Lu.n(new o.j(0L, 0));
        this.rl = sPzN;
        this.f9922t = TFv.fuX.t(sPzN);
        SPz sPzN2 = Lu.n(null);
        this.nr = sPzN2;
        this.f9920O = TFv.fuX.t(sPzN2);
        SPz sPzN3 = Lu.n(Boolean.FALSE);
        this.J2 = sPzN3;
        this.Uo = TFv.fuX.t(sPzN3);
        this.KN = new AtomicBoolean(true);
        this.xMQ = Integer.MAX_VALUE;
        xo.XQ(new j(this));
        xo.fD(new n(this));
        xo.ty(new w6(this));
        boolean zHasCameraObject = SceneKt.hasCameraObject(xo.J2().getScene());
        SceneHolder sceneHolderJ2 = xo.J2();
        nKE userPreviewMode = xo.J2().getUserPreviewMode();
        sceneHolderJ2.setUserPreviewMode(userPreviewMode.rl((32703 & 1) != 0 ? userPreviewMode.f76062n : 0.0f, (32703 & 2) != 0 ? userPreviewMode.rl : null, (32703 & 4) != 0 ? userPreviewMode.f76063t : 0.0f, (32703 & 8) != 0 ? userPreviewMode.nr : null, (32703 & 16) != 0 ? userPreviewMode.f76061O : false, (32703 & 32) != 0 ? userPreviewMode.J2 : false, (32703 & 64) != 0 ? userPreviewMode.Uo : false, (32703 & 128) != 0 ? userPreviewMode.KN : 0.0f, (32703 & 256) != 0 ? userPreviewMode.xMQ : 0.0f, (32703 & 512) != 0 ? userPreviewMode.mUb : null, (32703 & 1024) != 0 ? userPreviewMode.gh : 0.0f, (32703 & 2048) != 0 ? userPreviewMode.qie : null, (32703 & 4096) != 0 ? userPreviewMode.az : zHasCameraObject, (32703 & 8192) != 0 ? userPreviewMode.ty : false, (32703 & 16384) != 0 ? userPreviewMode.HI : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M7(boolean z2) {
        this.J2.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P5(ICC.Dsr dsr) {
        this.nr.setValue(dsr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(int i2) {
        if (this.KN.get()) {
            this.rl.setValue(new o.j(TimeKt.microsFromFrameNumber(i2, getFramesPerHundredSeconds()), i2));
        }
        if (i2 >= this.xMQ) {
            int i3 = this.mUb + 1;
            this.mUb = i3;
            if (i3 > 10) {
                pause();
            }
        }
    }

    @Override // Si.Xo
    public SceneHolder J2() {
        return this.f9921n.J2();
    }

    @Override // Si.Xo
    public void S(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f9921n.S(listener);
    }

    @Override // Si.Xo
    public float Uo(int i2) {
        return this.f9921n.Uo(i2);
    }

    @Override // Si.Xo
    public void WPU(cBL.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f9921n.WPU(jVar);
    }

    @Override // Si.o
    public rv6 X() {
        return this.Uo;
    }

    @Override // Si.Xo
    public void XQ(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f9921n.XQ(listener);
    }

    @Override // Si.Xo
    public void aYN() {
        this.f9921n.aYN();
    }

    @Override // Si.Xo
    public void e(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f9921n.e(listener);
    }

    @Override // Si.Xo
    public void fD(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f9921n.fD(listener);
    }

    @Override // Si.o
    public rv6 getCurrentPosition() {
        return this.f9922t;
    }

    @Override // Si.o
    public int getFramesPerHundredSeconds() {
        return this.f9921n.J2().getScene().getFramesPerHundredSeconds();
    }

    @Override // Si.Xo
    public void gh(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f9921n.gh(listener);
    }

    @Override // Si.Xo
    public void iF(SurfaceHolder surfaceHolder) {
        this.f9921n.iF(surfaceHolder);
    }

    @Override // Si.Xo
    public void mUb(int i2, boolean z2) {
        this.f9921n.mUb(i2, z2);
    }

    @Override // Si.Xo
    public void pause() {
        this.KN.set(false);
        this.f9921n.pause();
    }

    @Override // Si.Xo
    public void r() {
        this.f9921n.r();
    }

    @Override // Si.Xo
    public SurfaceHolder rV9() {
        return this.f9921n.rV9();
    }

    @Override // Cp.j
    public void release() {
        this.f9921n.gh(new Ml(this));
        this.f9921n.S(new I28(this));
        this.f9921n.e(new Wre(this));
        this.f9921n.release();
    }

    @Override // Si.o
    public void s7N(int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("Invalid start and end time requested!\nStart time: " + i2 + "\nEnd time: " + i3).toString());
        }
        int iFrameNumberFromTime = TimeKt.frameNumberFromTime(i2, getFramesPerHundredSeconds());
        this.xMQ = TimeKt.frameNumberFromTime(i3, getFramesPerHundredSeconds());
        HI(iFrameNumberFromTime, true);
        this.mUb = 0;
        this.KN.set(true);
        Xo.j.n(this.f9921n, false, 1, null);
    }

    @Override // Si.o
    public int t() {
        return SceneKt.getDuration(this.f9921n.J2().getScene());
    }

    @Override // Si.Xo
    public void ty(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f9921n.ty(listener);
    }

    @Override // Si.Xo
    public void v(Function0 function0) {
        this.f9921n.v(function0);
    }

    @Override // Si.Xo
    public void wTp() {
        this.f9921n.wTp();
    }

    @Override // Si.Xo
    public void HI(int i2, boolean z2) {
        pause();
        this.f9921n.mUb(i2, z2);
        this.f9921n.wTp();
        this.rl.setValue(new o.j(TimeKt.microsFromFrameNumber(i2, getFramesPerHundredSeconds()), i2));
    }

    @Override // Si.Xo
    public void nY(boolean z2) {
        if (((o.j) getCurrentPosition().getValue()).n() >= TimeKt.frameNumberFromTime(t(), getFramesPerHundredSeconds())) {
            HI(0, true);
        }
        this.KN.set(true);
        this.f9921n.nY(z2);
        this.xMQ = Integer.MAX_VALUE;
    }

    @Override // Si.o
    public void seekTo(int i2) {
        Xo.j.t(this, TimeKt.frameNumberFromTime(i2, getFramesPerHundredSeconds()), false, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qz(Context context, SceneHolder sceneHolder, iF eventLogger, String playerTag) {
        this(l3D.rl(playerTag, context, eventLogger, sceneHolder, false, 16, null));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(playerTag, "playerTag");
    }
}
