package Kp;

import GJW.V1;
import GJW.vd;
import Kp.Dsr;
import ScC.FuwU.XIvb;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import com.alightcreative.gl.OpenGLException;
import fX.InterfaceC2106j;
import fX.InterfaceC2107n;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mF.w6;
import z.C2470N;
import z.DC;
import z.KH;
import z.Mf;
import z.Pmq;
import z.YzO;
import z.Z;
import z.ci;
import z.g9s;
import z.hQ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Dsr implements w6.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2107n f5826n;
    private final YzO rl;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    final class j implements w6.InterfaceC1054w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SurfaceTexture f5827n;
        final /* synthetic */ Dsr nr;
        private final Surface rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private n f5828t;

        /* JADX INFO: renamed from: Kp.Dsr$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        static final class C0198j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ j f5829O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5830n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Dsr f5831t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0198j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0198j(Dsr dsr, j jVar, Continuation continuation) {
                super(2, continuation);
                this.f5831t = dsr;
                this.f5829O = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0198j(this.f5831t, this.f5829O, continuation);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit O(j jVar, InterfaceC2106j interfaceC2106j) {
                g9s g9sVarRl;
                interfaceC2106j.rl().O(jVar.f5827n);
                n nVar = jVar.f5828t;
                if (nVar != null && (g9sVarRl = nVar.rl()) != null) {
                    g9sVarRl.release();
                }
                jVar.f5828t = null;
                return Unit.INSTANCE;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5830n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC2107n interfaceC2107n = this.f5831t.f5826n;
                    final j jVar = this.f5829O;
                    Function1 function1 = new Function1() { // from class: Kp.fuX
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Dsr.j.C0198j.O(jVar, (InterfaceC2106j) obj2);
                        }
                    };
                    this.f5830n = 1;
                    if (interfaceC2107n.n(function1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public j(Dsr dsr, SurfaceTexture surfaceTexture, Surface surface) {
            Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
            Intrinsics.checkNotNullParameter(surface, "surface");
            this.nr = dsr;
            this.f5827n = surfaceTexture;
            this.rl = surface;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit E2(j jVar, Oe.w6 w6Var, long j2, InterfaceC2106j execute) throws OpenGLException {
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            ci ciVarT = KH.j.t(execute.rl(), jVar.f5827n, w6Var.t(), w6Var.rl(), 0, 8, null);
            ciVarT.eF();
            Pmq pmq = new Pmq(w6Var.t(), w6Var.rl(), DC.f76234g, 0, 0, 24, null);
            jVar.fD(execute.rl(), ciVarT, jVar.te(execute.rl(), pmq, "surfaceTextureBuffer(" + jVar.f5827n + ", " + d2n.Ml.ck(j2) + ", " + w6Var + XIvb.cXmp));
            return Unit.INSTANCE;
        }

        private final g9s te(KH kh, Pmq pmq, String str) {
            g9s g9sVarRl;
            n nVar = this.f5828t;
            if (nVar != null && Intrinsics.areEqual(pmq, nVar.n())) {
                return nVar.rl();
            }
            if (nVar != null && (g9sVarRl = nVar.rl()) != null) {
                g9sVarRl.release();
            }
            this.f5828t = null;
            g9s g9sVarAz = kh.az(pmq.O(), pmq.rl(), DC.f76234g, str);
            this.f5828t = new n(g9sVarAz, pmq);
            return g9sVarAz;
        }

        @Override // mF.w6.InterfaceC1054w6
        public Object O(final long j2, final Oe.w6 w6Var, Continuation continuation) {
            Object objN = this.nr.f5826n.n(new Function1() { // from class: Kp.CN3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Dsr.j.E2(this.f5824n, w6Var, j2, (InterfaceC2106j) obj);
                }
            }, continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }

        @Override // mF.w6
        public long XQ() {
            n nVar = this.f5828t;
            if (nVar != null) {
                return ((long) nVar.rl().getSize()) * 2;
            }
            return 0L;
        }

        @Override // mF.w6
        /* JADX INFO: renamed from: iF, reason: merged with bridge method [inline-methods] */
        public Z getValue() {
            n nVar = this.f5828t;
            if (nVar != null) {
                return nVar.rl();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // w9.aC
        public Object rl(Continuation continuation) {
            Object objUo = GJW.Dsr.Uo(V1.f3456n, new C0198j(this.nr, this, null), continuation);
            return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
        }

        @Override // mF.w6.InterfaceC1054w6
        public Surface ty() {
            return this.rl;
        }

        private final void fD(KH kh, ci ciVar, g9s g9sVar) throws OpenGLException {
            kh.r(g9sVar);
            GLES20.glViewport(0, 0, g9sVar.getWidth(), g9sVar.getHeight());
            GLES20.glDisable(2960);
            GLES20.glDisable(3089);
            GLES20.glDisable(3042);
            GLES20.glBlendFunc(1, 771);
            GLES20.glBlendEquation(32774);
            GLES20.glClear(16384);
            hQ.render$default(Mf.nr(kh), C2470N.KN.n(), ciVar, 0.0f, 4, null);
            GLES20.glEnable(2960);
            GLES20.glEnable(3089);
            GLES20.glEnable(3042);
            kh.o();
            kh.J2();
        }
    }

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final g9s f5832n;
        private final Pmq rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f5832n, nVar.f5832n) && Intrinsics.areEqual(this.rl, nVar.rl);
        }

        public n(g9s texture, Pmq spec) {
            Intrinsics.checkNotNullParameter(texture, "texture");
            Intrinsics.checkNotNullParameter(spec, "spec");
            this.f5832n = texture;
            this.rl = spec;
        }

        public int hashCode() {
            return (this.f5832n.hashCode() * 31) + this.rl.hashCode();
        }

        public final Pmq n() {
            return this.rl;
        }

        public final g9s rl() {
            return this.f5832n;
        }

        public String toString() {
            return "TextureWithSpec(texture=" + this.f5832n + ", spec=" + this.rl + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class w6 implements w6.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Z f5833n;
        final /* synthetic */ Dsr rl;

        public w6(Dsr dsr, Z value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.rl = dsr;
            this.f5833n = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nY(w6 w6Var, InterfaceC2106j execute) {
            Intrinsics.checkNotNullParameter(execute, "$this$execute");
            w6Var.getValue().release();
            return Unit.INSTANCE;
        }

        @Override // mF.w6
        /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
        public Z getValue() {
            return this.f5833n;
        }

        @Override // mF.w6.Ml
        public Object qie(w6.j jVar, Continuation continuation) {
            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
        }

        @Override // w9.aC
        public Object rl(Continuation continuation) {
            Object objN = this.rl.f5826n.n(new Function1() { // from class: Kp.aC
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Dsr.w6.nY(this.f5855n, (InterfaceC2106j) obj);
                }
            }, continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }

        @Override // mF.w6
        public long XQ() {
            return getValue().getSize();
        }
    }

    public Dsr(InterfaceC2107n executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f5826n = executor;
        this.rl = new YzO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w6 J2(w6.j jVar, Dsr dsr, InterfaceC2106j execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        if (jVar instanceof w6.j.n) {
            w6.j.n nVar = (w6.j.n) jVar;
            return new w6(dsr, KH.j.n(execute.rl(), nVar.n().t(), nVar.n().rl(), DC.f76234g, null, 8, null));
        }
        throw new NotImplementedError("An operation is not implemented: Not implemented yet");
    }

    @Override // mF.w6.n
    public Object n(Continuation continuation) throws InterruptedException {
        Pair pairViF = this.rl.ViF();
        return new j(this, (SurfaceTexture) pairViF.component1(), (Surface) pairViF.component2());
    }

    @Override // mF.w6.n
    public Object rl(final w6.j jVar, Continuation continuation) {
        return this.f5826n.n(new Function1() { // from class: Kp.Wre
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Dsr.J2(jVar, this, (InterfaceC2106j) obj);
            }
        }, continuation);
    }

    @Override // mF.w6.n
    public Oe.w6 t() {
        int iRl = this.f5826n.t().rl().rl();
        return new Oe.w6(iRl, iRl);
    }
}
