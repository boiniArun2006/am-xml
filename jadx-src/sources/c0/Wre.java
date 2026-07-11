package c0;

import FjR.fuX;
import GJW.N;
import GJW.OU;
import GJW.vd;
import TFv.Lu;
import TFv.SPz;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import c0.Wre;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import q.InterfaceC2336j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Wre extends Painter implements RememberObserver {
    private final MutableState M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Function1 f43469N;
    private final MutableState P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Painter f43471T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f43472U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private n f43473X;
    private ContentScale Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private vd f43474Z;
    private int jB;
    private final MutableState p5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Function1 f43477v;
    public static final j eF = new j(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Function1 f43468E = new Function1() { // from class: c0.I28
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Wre.ck((Wre.n) obj);
        }
    };

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final SPz f43470S = Lu.n(Size.t(Size.INSTANCE.rl()));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MutableState f43476g = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
    private final MutableFloatState E2 = PrimitiveSnapshotStateKt.n(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MutableState f43475e = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    static final class I28 implements Z.Dsr {

        public static final class j implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f43479n;

            /* JADX INFO: renamed from: c0.Wre$I28$j$j, reason: collision with other inner class name */
            public static final class C0582j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.CN3 f43480n;

                /* JADX INFO: renamed from: c0.Wre$I28$j$j$j, reason: collision with other inner class name */
                public static final class C0583j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f43482n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f43483t;

                    public C0583j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f43482n = obj;
                        this.f43483t |= Integer.MIN_VALUE;
                        return C0582j.this.rl(null, this);
                    }
                }

                public C0582j(TFv.CN3 cn3) {
                    this.f43480n = cn3;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0583j c0583j;
                    if (continuation instanceof C0583j) {
                        c0583j = (C0583j) continuation;
                        int i2 = c0583j.f43483t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0583j.f43483t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0583j = new C0583j(continuation);
                        }
                    }
                    Object obj2 = c0583j.f43482n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0583j.f43483t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        TFv.CN3 cn3 = this.f43480n;
                        Z.fuX fuxJ2 = fuX.J2(((Size) obj).getPackedValue());
                        if (fuxJ2 != null) {
                            c0583j.f43483t = 1;
                            if (cn3.rl(fuxJ2, c0583j) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public j(TFv.Wre wre) {
                this.f43479n = wre;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                Object objN = this.f43479n.n(new C0582j(cn3), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        I28() {
        }

        @Override // Z.Dsr
        public final Object n(Continuation continuation) {
            return TFv.fuX.ViF(new j(Wre.this.f43470S), continuation);
        }
    }

    public static final class Ml implements InterfaceC2336j {
        @Override // q.InterfaceC2336j
        public void nr(Drawable drawable) {
        }

        @Override // q.InterfaceC2336j
        public void rl(Drawable drawable) {
        }

        public Ml() {
        }

        @Override // q.InterfaceC2336j
        public void t(Drawable drawable) {
            Wre.this.M7(new n.w6(drawable != null ? Wre.this.jB(drawable) : null));
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Function1 n() {
            return Wre.f43468E;
        }
    }

    public static abstract class n {

        public static final class Ml extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Painter f43485n;
            private final FjR.Xo rl;

            public Ml(Painter painter, FjR.Xo xo) {
                super(null);
                this.f43485n = painter;
                this.rl = xo;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Ml)) {
                    return false;
                }
                Ml ml = (Ml) obj;
                return Intrinsics.areEqual(this.f43485n, ml.f43485n) && Intrinsics.areEqual(this.rl, ml.rl);
            }

            public int hashCode() {
                return (this.f43485n.hashCode() * 31) + this.rl.hashCode();
            }

            @Override // c0.Wre.n
            public Painter n() {
                return this.f43485n;
            }

            public final FjR.Xo rl() {
                return this.rl;
            }

            public String toString() {
                return "Success(painter=" + this.f43485n + ", result=" + this.rl + ')';
            }
        }

        public static final class j extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f43486n = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            @Override // c0.Wre.n
            public Painter n() {
                return null;
            }

            public String toString() {
                return "Empty";
            }

            public int hashCode() {
                return -1515560141;
            }
        }

        /* JADX INFO: renamed from: c0.Wre$n$n, reason: collision with other inner class name */
        public static final class C0584n extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Painter f43487n;
            private final FjR.I28 rl;

            public C0584n(Painter painter, FjR.I28 i28) {
                super(null);
                this.f43487n = painter;
                this.rl = i28;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0584n)) {
                    return false;
                }
                C0584n c0584n = (C0584n) obj;
                return Intrinsics.areEqual(this.f43487n, c0584n.f43487n) && Intrinsics.areEqual(this.rl, c0584n.rl);
            }

            public static /* synthetic */ C0584n t(C0584n c0584n, Painter painter, FjR.I28 i28, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    painter = c0584n.f43487n;
                }
                if ((i2 & 2) != 0) {
                    i28 = c0584n.rl;
                }
                return c0584n.rl(painter, i28);
            }

            public int hashCode() {
                Painter painter = this.f43487n;
                return ((painter == null ? 0 : painter.hashCode()) * 31) + this.rl.hashCode();
            }

            @Override // c0.Wre.n
            public Painter n() {
                return this.f43487n;
            }

            public final FjR.I28 nr() {
                return this.rl;
            }

            public final C0584n rl(Painter painter, FjR.I28 i28) {
                return new C0584n(painter, i28);
            }

            public String toString() {
                return "Error(painter=" + this.f43487n + ", result=" + this.rl + ')';
            }
        }

        public static final class w6 extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Painter f43488n;

            public w6(Painter painter) {
                super(null);
                this.f43488n = painter;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof w6) && Intrinsics.areEqual(this.f43488n, ((w6) obj).f43488n);
            }

            public int hashCode() {
                Painter painter = this.f43488n;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            @Override // c0.Wre.n
            public Painter n() {
                return this.f43488n;
            }

            public final w6 rl(Painter painter) {
                return new w6(painter);
            }

            public String toString() {
                return "Loading(painter=" + this.f43488n + ')';
            }
        }

        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Painter n();

        private n() {
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43489n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Wre f43491O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f43492n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f43493t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Wre wre, Continuation continuation) {
                super(2, continuation);
                this.f43491O = wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f43491O, continuation);
                jVar.f43493t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Wre wre;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f43492n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        wre = (Wre) this.f43493t;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    FjR.fuX fux = (FjR.fuX) this.f43493t;
                    Wre wre2 = this.f43491O;
                    eQ.fuX fuxNY = wre2.nY();
                    FjR.fuX fuxP5 = this.f43491O.P5(fux);
                    this.f43493t = wre2;
                    this.f43492n = 1;
                    obj = fuxNY.rl(fuxP5, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wre = wre2;
                }
                return wre.U((FjR.Dsr) obj);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(FjR.fuX fux, Continuation continuation) {
                return ((j) create(fux, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* synthetic */ class n implements TFv.CN3, FunctionAdapter {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Wre f43494n;

            n(Wre wre) {
                this.f43494n = wre;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof TFv.CN3) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f43494n, Wre.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(n nVar, Continuation continuation) {
                Object objMUb = w6.mUb(this.f43494n, nVar, continuation);
                return objMUb == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMUb : Unit.INSTANCE;
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Wre.this.new w6(continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object mUb(Wre wre, n nVar, Continuation continuation) {
            wre.M7(nVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FjR.fuX xMQ(Wre wre) {
            return wre.te();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43489n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final Wre wre = Wre.this;
                TFv.Wre wreN = TFv.fuX.N(SnapshotStateKt.Ik(new Function0() { // from class: c0.CN3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.w6.xMQ(wre);
                    }
                }), new j(Wre.this, null));
                n nVar = new n(Wre.this);
                this.f43489n = 1;
                if (wreN.n(nVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FjR.fuX P5(FjR.fuX fux) {
        fuX.j jVarQie = FjR.fuX.U(fux, null, 1, null).qie(new Ml());
        if (fux.Ik().az() == null) {
            jVarQie.gh(new I28());
        }
        if (fux.Ik().qie() == null) {
            jVarQie.mUb(AbstractC1676c.HI(this.Xw));
        }
        if (fux.Ik().gh() != Z.I28.f12266n) {
            jVarQie.nr(Z.I28.f12268t);
        }
        return jVarQie.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n ck(n nVar) {
        return nVar;
    }

    private final void E2(ColorFilter colorFilter) {
        this.f43475e.setValue(colorFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M7(n nVar) {
        n nVar2 = this.f43473X;
        n nVar3 = (n) this.f43469N.invoke(nVar);
        Xw(nVar3);
        Painter painterIF = iF(nVar2, nVar3);
        if (painterIF == null) {
            painterIF = nVar3.n();
        }
        bzg(painterIF);
        if (this.f43474Z != null && nVar2.n() != nVar3.n()) {
            Object objN = nVar2.n();
            RememberObserver rememberObserver = objN instanceof RememberObserver ? (RememberObserver) objN : null;
            if (rememberObserver != null) {
                rememberObserver.O();
            }
            Object objN2 = nVar3.n();
            RememberObserver rememberObserver2 = objN2 instanceof RememberObserver ? (RememberObserver) objN2 : null;
            if (rememberObserver2 != null) {
                rememberObserver2.t();
            }
        }
        Function1 function1 = this.f43477v;
        if (function1 != null) {
            function1.invoke(nVar3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n U(FjR.Dsr dsr) {
        if (dsr instanceof FjR.Xo) {
            FjR.Xo xo = (FjR.Xo) dsr;
            return new n.Ml(jB(xo.n()), xo);
        }
        if (!(dsr instanceof FjR.I28)) {
            throw new NoWhenBranchMatchedException();
        }
        FjR.I28 i28 = (FjR.I28) dsr;
        Drawable drawableN = i28.n();
        return new n.C0584n(drawableN != null ? jB(drawableN) : null, i28);
    }

    private final ColorFilter ViF() {
        return (ColorFilter) this.f43475e.getValue();
    }

    private final void WPU() {
        vd vdVar = this.f43474Z;
        if (vdVar != null) {
            GJW.Lu.O(vdVar, null, 1, null);
        }
        this.f43474Z = null;
    }

    private final void Xw(n nVar) {
        this.f43473X = nVar;
        v(nVar);
    }

    private final float aYN() {
        return this.E2.n();
    }

    private final void bzg(Painter painter) {
        this.f43471T = painter;
        nHg(painter);
    }

    private final void fD(float f3) {
        this.E2.Z(f3);
    }

    private final Painter g() {
        return (Painter) this.f43476g.getValue();
    }

    private final Pl iF(n nVar, n nVar2) {
        FjR.Dsr dsrNr;
        if (!(nVar2 instanceof n.Ml)) {
            if (nVar2 instanceof n.C0584n) {
                dsrNr = ((n.C0584n) nVar2).nr();
            }
            return null;
        }
        dsrNr = ((n.Ml) nVar2).rl();
        VyM.w6 w6VarN = dsrNr.rl().Xw().n(fuX.f43498n, dsrNr);
        if (w6VarN instanceof VyM.j) {
            VyM.j jVar = (VyM.j) w6VarN;
            return new Pl(nVar instanceof n.w6 ? nVar.n() : null, nVar2.n(), this.Xw, jVar.rl(), ((dsrNr instanceof FjR.Xo) && ((FjR.Xo) dsrNr).nr()) ? false : true, jVar.t());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Painter jB(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? BitmapPainterKt.rl(AndroidImageBitmap_androidKt.t(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.jB, 6, null) : new N0F.j(drawable.mutate());
    }

    private final void nHg(Painter painter) {
        this.f43476g.setValue(painter);
    }

    private final void v(n nVar) {
        this.P5.setValue(nVar);
    }

    public final void N(Function1 function1) {
        this.f43477v = function1;
    }

    public final void T(eQ.fuX fux) {
        this.p5.setValue(fux);
    }

    public final void X(int i2) {
        this.jB = i2;
    }

    public final void e(ContentScale contentScale) {
        this.Xw = contentScale;
    }

    public final eQ.fuX nY() {
        return (eQ.fuX) this.p5.getValue();
    }

    public final void rV9(Function1 function1) {
        this.f43469N = function1;
    }

    public final void s7N(boolean z2) {
        this.f43472U = z2;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void t() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f43474Z == null) {
                vd vdVarN = GJW.Lu.n(N.rl(null, 1, null).plus(OU.t().p0N()));
                this.f43474Z = vdVarN;
                Object obj = this.f43471T;
                RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
                if (rememberObserver != null) {
                    rememberObserver.t();
                }
                if (this.f43472U) {
                    Drawable drawableE = FjR.fuX.U(te(), null, 1, null).t(nY().n()).n().e();
                    M7(new n.w6(drawableE != null ? jB(drawableE) : null));
                } else {
                    GJW.C.nr(vdVarN, null, null, new w6(null), 3, null);
                }
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final FjR.fuX te() {
        return (FjR.fuX) this.M7.getValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void ty(DrawScope drawScope) {
        this.f43470S.setValue(Size.t(drawScope.t()));
        Painter painterG = g();
        if (painterG != null) {
            painterG.mUb(drawScope, drawScope.t(), aYN(), ViF());
        }
    }

    public final void wTp(FjR.fuX fux) {
        this.M7.setValue(fux);
    }

    public Wre(FjR.fuX fux, eQ.fuX fux2) {
        n.j jVar = n.j.f43486n;
        this.f43473X = jVar;
        this.f43469N = f43468E;
        this.Xw = ContentScale.INSTANCE.O();
        this.jB = DrawScope.INSTANCE.rl();
        this.P5 = SnapshotStateKt__SnapshotStateKt.O(jVar, null, 2, null);
        this.M7 = SnapshotStateKt__SnapshotStateKt.O(fux, null, 2, null);
        this.p5 = SnapshotStateKt__SnapshotStateKt.O(fux2, null, 2, null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void O() {
        RememberObserver rememberObserver;
        WPU();
        Object obj = this.f43471T;
        if (obj instanceof RememberObserver) {
            rememberObserver = (RememberObserver) obj;
        } else {
            rememberObserver = null;
        }
        if (rememberObserver != null) {
            rememberObserver.O();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean n(float f3) {
        fD(f3);
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void nr() {
        RememberObserver rememberObserver;
        WPU();
        Object obj = this.f43471T;
        if (obj instanceof RememberObserver) {
            rememberObserver = (RememberObserver) obj;
        } else {
            rememberObserver = null;
        }
        if (rememberObserver != null) {
            rememberObserver.nr();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: qie */
    public long getIntrinsicSize() {
        Painter painterG = g();
        if (painterG != null) {
            return painterG.getIntrinsicSize();
        }
        return Size.INSTANCE.n();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean rl(ColorFilter colorFilter) {
        E2(colorFilter);
        return true;
    }
}
