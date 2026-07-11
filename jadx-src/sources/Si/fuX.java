package Si;

import GJW.AbstractC1363t;
import GJW.OU;
import GJW.RzR;
import GJW.vd;
import GJW.xuv;
import GJW.yg;
import HI0.Q;
import HI0.afx;
import QmE.iF;
import QmE.j;
import Sbr.j;
import Si.Xo;
import Si.fuX;
import TFv.Lu;
import TFv.SPz;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Debug;
import android.view.SurfaceHolder;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.FrameStats;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.ImageCacheKt;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneHolderState;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneSelection;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.SpoidEnv;
import com.alightcreative.app.motion.scene.TextElementKt;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import com.alightcreative.app.motion.scene.rendering.SceneRenderingKt;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.gl.OpenGLOutOfMemoryException;
import com.caoccao.javet.exceptions.JavetError;
import com.google.firebase.perf.metrics.Trace;
import com.vungle.ads.internal.protos.Sdk;
import d.AbstractC1951j;
import fX.AbstractC2108w6;
import fX.InterfaceC2106j;
import fX.InterfaceC2107n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import yc.RP;
import yc.nKE;
import z.AbstractC2478o;
import z.C2470N;
import z.DC;
import z.Mf;
import z.Pmq;
import z.Sis;
import z.cA;
import z.g9s;
import z.l4Z;
import z.mz;
import z.tI;
import z.xZD;
import z8.AbstractC2487Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class fuX implements Xo {
    private final List HI;
    private final InterfaceC2107n Ik;
    private final Q J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Context f9847O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private SurfaceHolder f9848S;
    private boolean Uo;
    private final xuv WPU;
    private final Sbr.j XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final mF.n f9849Z;
    private final List az;
    private int ck;
    private final SPz gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f9850n;
    private cBL.j nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Kp.Dsr f9851o;
    private final vd qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final cA f9852r;
    private final SceneHolder rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f9853t;
    private final List ty;
    private int xMQ;
    private static final w6 aYN = new w6(null);
    public static final int ViF = 8;

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9854n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        CN3(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(InterfaceC2106j interfaceC2106j) {
            interfaceC2106j.Uo(l4Z.f76316n);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new CN3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9854n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC2107n interfaceC2107n = fuX.this.Ik;
                Function1 function1 = new Function1() { // from class: Si.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return fuX.CN3.O((InterfaceC2106j) obj2);
                    }
                };
                this.f9854n = 1;
                if (interfaceC2107n.n(function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9856n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ fuX f9858O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f9859n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f9860t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(fuX fux, Continuation continuation) {
                super(2, continuation);
                this.f9858O = fux;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f9858O, continuation);
                jVar.f9860t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Pl pl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f9859n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        pl = (Pl) this.f9860t;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Pl pl3 = (Pl) this.f9860t;
                    Scene scene = pl3.rl().getScene();
                    this.f9860t = pl3;
                    this.f9859n = 1;
                    Object objKN = Kp.I28.KN(scene, this);
                    if (objKN == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pl = pl3;
                    obj = objKN;
                }
                this.f9858O.XQ.HI((MoG.CN3) obj, pl);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Pl pl, Continuation continuation) {
                return ((j) create(pl, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Dsr) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Dsr(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new Dsr(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9856n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SPz sPz = fuX.this.gh;
                j jVar = new j(fuX.this, null);
                this.f9856n = 1;
                if (TFv.fuX.gh(sPz, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9861n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        I28(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new I28(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        
            if (r6.rl(r5) != r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9861n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InterfaceC2107n interfaceC2107n = fuX.this.Ik;
                    this.f9861n = 3;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                xuv xuvVarAz = AbstractC1363t.az(fuX.this.qie.getCoroutineContext());
                this.f9861n = 1;
                if (AbstractC1363t.Uo(xuvVarAz, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Sbr.j jVar = fuX.this.XQ;
            this.f9861n = 2;
            if (jVar.rl(this) != coroutine_suspended) {
                InterfaceC2107n interfaceC2107n2 = fuX.this.Ik;
                this.f9861n = 3;
            }
            return coroutine_suspended;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9863n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9863n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                fuX fux = fuX.this;
                this.f9863n = 1;
                if (fux.Nxk(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9865n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f9866t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f9866t = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Wre(this.f9866t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9865n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f9865n = 1;
                if (yg.rl(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Function0 function0 = this.f9866t;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Si.fuX$fuX, reason: collision with other inner class name */
    static final class C0323fuX implements mF.n {

        /* JADX INFO: renamed from: Si.fuX$fuX$j */
        static final class j implements mF.I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ fuX f9868n;
            final /* synthetic */ int rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ mF.j f9869t;

            j(fuX fux, int i2, mF.j jVar) {
                this.f9868n = fux;
                this.rl = i2;
                this.f9869t = jVar;
            }

            @Override // mF.I28
            public final Object n(mF.Ml ml, Continuation continuation) {
                Object objETf = this.f9868n.eTf(this.rl, (Pl) this.f9869t.n(), ml, continuation);
                return objETf == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objETf : Unit.INSTANCE;
            }
        }

        C0323fuX() {
        }

        @Override // mF.n
        public final Object n(mF.j jVar, Continuation continuation) {
            Scene scene = ((Pl) jVar.n()).rl().getScene();
            return new j(fuX.this, TimeKt.frameNumberFromPTSNanos(Math.min(d2n.I28.rl(jVar.rl()), ((long) scene.getTotalTime()) * 1000000), scene.getFramesPerHundredSeconds()), jVar);
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9871n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f9872t;

        /* JADX INFO: renamed from: Si.fuX$j$j, reason: collision with other inner class name */
        static final class C0324j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f9873n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ fuX f9874t;

            /* JADX INFO: renamed from: Si.fuX$j$j$j, reason: collision with other inner class name */
            static final class C0325j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ fuX f9875n;

                C0325j(fuX fux) {
                    this.f9875n = fux;
                }

                public final Object n(boolean z2, Continuation continuation) {
                    Iterator it = this.f9875n.ty.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(Boxing.boxBoolean(z2));
                    }
                    return Unit.INSTANCE;
                }

                @Override // TFv.CN3
                public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
                    return n(((Boolean) obj).booleanValue(), continuation);
                }
            }

            /* JADX INFO: renamed from: Si.fuX$j$j$n */
            public static final class n implements TFv.Wre {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.Wre f9876n;

                /* JADX INFO: renamed from: Si.fuX$j$j$n$j, reason: collision with other inner class name */
                public static final class C0326j implements TFv.CN3 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ TFv.CN3 f9877n;

                    /* JADX INFO: renamed from: Si.fuX$j$j$n$j$j, reason: collision with other inner class name */
                    public static final class C0327j extends ContinuationImpl {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        /* synthetic */ Object f9879n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        int f9880t;

                        public C0327j(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f9879n = obj;
                            this.f9880t |= Integer.MIN_VALUE;
                            return C0326j.this.rl(null, this);
                        }
                    }

                    public C0326j(TFv.CN3 cn3) {
                        this.f9877n = cn3;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // TFv.CN3
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object rl(Object obj, Continuation continuation) {
                        C0327j c0327j;
                        if (continuation instanceof C0327j) {
                            c0327j = (C0327j) continuation;
                            int i2 = c0327j.f9880t;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c0327j.f9880t = i2 - Integer.MIN_VALUE;
                            } else {
                                c0327j = new C0327j(continuation);
                            }
                        }
                        Object obj2 = c0327j.f9879n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i3 = c0327j.f9880t;
                        if (i3 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            TFv.CN3 cn3 = this.f9877n;
                            if (obj instanceof j.w6.C0318j) {
                                c0327j.f9880t = 1;
                                if (cn3.rl(obj, c0327j) == coroutine_suspended) {
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

                public n(TFv.Wre wre) {
                    this.f9876n = wre;
                }

                @Override // TFv.Wre
                public Object n(TFv.CN3 cn3, Continuation continuation) {
                    Object objN = this.f9876n.n(new C0326j(cn3), continuation);
                    return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: Si.fuX$j$j$w6 */
            public static final class w6 implements TFv.Wre {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.Wre f9881n;

                /* JADX INFO: renamed from: Si.fuX$j$j$w6$j, reason: collision with other inner class name */
                public static final class C0328j implements TFv.CN3 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ TFv.CN3 f9882n;

                    /* JADX INFO: renamed from: Si.fuX$j$j$w6$j$j, reason: collision with other inner class name */
                    public static final class C0329j extends ContinuationImpl {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        /* synthetic */ Object f9884n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        int f9885t;

                        public C0329j(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f9884n = obj;
                            this.f9885t |= Integer.MIN_VALUE;
                            return C0328j.this.rl(null, this);
                        }
                    }

                    public C0328j(TFv.CN3 cn3) {
                        this.f9882n = cn3;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // TFv.CN3
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object rl(Object obj, Continuation continuation) {
                        C0329j c0329j;
                        if (continuation instanceof C0329j) {
                            c0329j = (C0329j) continuation;
                            int i2 = c0329j.f9885t;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c0329j.f9885t = i2 - Integer.MIN_VALUE;
                            } else {
                                c0329j = new C0329j(continuation);
                            }
                        }
                        Object obj2 = c0329j.f9884n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i3 = c0329j.f9885t;
                        if (i3 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            TFv.CN3 cn3 = this.f9882n;
                            Boolean boolBoxBoolean = Boxing.boxBoolean(aC.KN(((j.w6.C0318j) obj).t()));
                            c0329j.f9885t = 1;
                            if (cn3.rl(boolBoxBoolean, c0329j) == coroutine_suspended) {
                                return coroutine_suspended;
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

                public w6(TFv.Wre wre) {
                    this.f9881n = wre;
                }

                @Override // TFv.Wre
                public Object n(TFv.CN3 cn3, Continuation continuation) {
                    Object objN = this.f9881n.n(new C0328j(cn3), continuation);
                    return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0324j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0324j(fuX fux, Continuation continuation) {
                super(2, continuation);
                this.f9874t = fux;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0324j(this.f9874t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f9873n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    TFv.Wre wreIk = TFv.fuX.Ik(new w6(new n(this.f9874t.XQ.getState())));
                    C0325j c0325j = new C0325j(this.f9874t);
                    this.f9873n = 1;
                    if (wreIk.n(c0325j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        static final class n extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f9886n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ fuX f9887t;

            /* JADX INFO: renamed from: Si.fuX$j$n$j, reason: collision with other inner class name */
            static final class C0330j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ fuX f9888n;

                C0330j(fuX fux) {
                    this.f9888n = fux;
                }

                public final Object n(int i2, Continuation continuation) {
                    Iterator it = this.f9888n.az.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(Boxing.boxInt(i2));
                    }
                    return Unit.INSTANCE;
                }

                @Override // TFv.CN3
                public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
                    return n(((Number) obj).intValue(), continuation);
                }
            }

            /* JADX INFO: renamed from: Si.fuX$j$n$n, reason: collision with other inner class name */
            public static final class C0331n implements TFv.Wre {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.Wre f9889n;

                /* JADX INFO: renamed from: Si.fuX$j$n$n$j, reason: collision with other inner class name */
                public static final class C0332j implements TFv.CN3 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ TFv.CN3 f9890n;

                    /* JADX INFO: renamed from: Si.fuX$j$n$n$j$j, reason: collision with other inner class name */
                    public static final class C0333j extends ContinuationImpl {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        /* synthetic */ Object f9892n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        int f9893t;

                        public C0333j(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f9892n = obj;
                            this.f9893t |= Integer.MIN_VALUE;
                            return C0332j.this.rl(null, this);
                        }
                    }

                    public C0332j(TFv.CN3 cn3) {
                        this.f9890n = cn3;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // TFv.CN3
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object rl(Object obj, Continuation continuation) {
                        C0333j c0333j;
                        if (continuation instanceof C0333j) {
                            c0333j = (C0333j) continuation;
                            int i2 = c0333j.f9893t;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c0333j.f9893t = i2 - Integer.MIN_VALUE;
                            } else {
                                c0333j = new C0333j(continuation);
                            }
                        }
                        Object obj2 = c0333j.f9892n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i3 = c0333j.f9893t;
                        if (i3 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            TFv.CN3 cn3 = this.f9890n;
                            if (obj instanceof j.w6.C0318j) {
                                c0333j.f9893t = 1;
                                if (cn3.rl(obj, c0333j) == coroutine_suspended) {
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

                public C0331n(TFv.Wre wre) {
                    this.f9889n = wre;
                }

                @Override // TFv.Wre
                public Object n(TFv.CN3 cn3, Continuation continuation) {
                    Object objN = this.f9889n.n(new C0332j(cn3), continuation);
                    return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
                }
            }

            public static final class w6 implements TFv.Wre {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.Wre f9894n;

                /* JADX INFO: renamed from: Si.fuX$j$n$w6$j, reason: collision with other inner class name */
                public static final class C0334j implements TFv.CN3 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ TFv.CN3 f9895n;

                    /* JADX INFO: renamed from: Si.fuX$j$n$w6$j$j, reason: collision with other inner class name */
                    public static final class C0335j extends ContinuationImpl {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        /* synthetic */ Object f9897n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        int f9898t;

                        public C0335j(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f9897n = obj;
                            this.f9898t |= Integer.MIN_VALUE;
                            return C0334j.this.rl(null, this);
                        }
                    }

                    public C0334j(TFv.CN3 cn3) {
                        this.f9895n = cn3;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // TFv.CN3
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object rl(Object obj, Continuation continuation) {
                        C0335j c0335j;
                        if (continuation instanceof C0335j) {
                            c0335j = (C0335j) continuation;
                            int i2 = c0335j.f9898t;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c0335j.f9898t = i2 - Integer.MIN_VALUE;
                            } else {
                                c0335j = new C0335j(continuation);
                            }
                        }
                        Object obj2 = c0335j.f9897n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i3 = c0335j.f9898t;
                        if (i3 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            TFv.CN3 cn3 = this.f9895n;
                            j.w6.C0318j c0318j = (j.w6.C0318j) obj;
                            Pl pl = (Pl) c0318j.rl();
                            Integer numBoxInt = null;
                            if (pl != null && aC.KN(c0318j.t())) {
                                Scene scene = pl.rl().getScene();
                                numBoxInt = Boxing.boxInt(TimeKt.frameNumberFromPTSNanos(Math.min(c0318j.nr(), ((long) scene.getTotalTime()) * 1000000), scene.getFramesPerHundredSeconds()));
                            }
                            if (numBoxInt != null) {
                                c0335j.f9898t = 1;
                                if (cn3.rl(numBoxInt, c0335j) == coroutine_suspended) {
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

                public w6(TFv.Wre wre) {
                    this.f9894n = wre;
                }

                @Override // TFv.Wre
                public Object n(TFv.CN3 cn3, Continuation continuation) {
                    Object objN = this.f9894n.n(new C0334j(cn3), continuation);
                    return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(fuX fux, Continuation continuation) {
                super(2, continuation);
                this.f9887t = fux;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new n(this.f9887t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f9886n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    TFv.Wre wreIk = TFv.fuX.Ik(new w6(new C0331n(this.f9887t.XQ.getState())));
                    C0330j c0330j = new C0330j(this.f9887t);
                    this.f9886n = 1;
                    if (wreIk.n(c0330j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        static final class w6 extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f9899n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ fuX f9900t;

            /* JADX INFO: renamed from: Si.fuX$j$w6$j, reason: collision with other inner class name */
            static final class C0336j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ fuX f9901n;

                C0336j(fuX fux) {
                    this.f9901n = fux;
                }

                @Override // TFv.CN3
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object rl(Pair pair, Continuation continuation) {
                    j.w6.C0318j c0318j = (j.w6.C0318j) pair.component1();
                    j.w6.C0318j c0318j2 = (j.w6.C0318j) pair.component2();
                    if (!this.f9901n.Uo) {
                        return Unit.INSTANCE;
                    }
                    if (!aC.KN(c0318j.t())) {
                        return Unit.INSTANCE;
                    }
                    if (((Pl) c0318j2.rl()) == null) {
                        return Unit.INSTANCE;
                    }
                    if (d2n.Ml.mUb(c0318j2.nr()) >= SceneKt.getDuration(r4.rl().getScene())) {
                        Xo.j.t(this.f9901n, 0, false, 2, null);
                        fuX fux = this.f9901n;
                        fux.nY(fux.Uo);
                    }
                    return Unit.INSTANCE;
                }
            }

            public static final class n implements TFv.Wre {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.Wre f9902n;

                /* JADX INFO: renamed from: Si.fuX$j$w6$n$j, reason: collision with other inner class name */
                public static final class C0337j implements TFv.CN3 {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ TFv.CN3 f9903n;

                    /* JADX INFO: renamed from: Si.fuX$j$w6$n$j$j, reason: collision with other inner class name */
                    public static final class C0338j extends ContinuationImpl {

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        /* synthetic */ Object f9905n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        int f9906t;

                        public C0338j(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f9905n = obj;
                            this.f9906t |= Integer.MIN_VALUE;
                            return C0337j.this.rl(null, this);
                        }
                    }

                    public C0337j(TFv.CN3 cn3) {
                        this.f9903n = cn3;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // TFv.CN3
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object rl(Object obj, Continuation continuation) {
                        C0338j c0338j;
                        if (continuation instanceof C0338j) {
                            c0338j = (C0338j) continuation;
                            int i2 = c0338j.f9906t;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c0338j.f9906t = i2 - Integer.MIN_VALUE;
                            } else {
                                c0338j = new C0338j(continuation);
                            }
                        }
                        Object obj2 = c0338j.f9905n;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i3 = c0338j.f9906t;
                        if (i3 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            TFv.CN3 cn3 = this.f9903n;
                            if (obj instanceof j.w6.C0318j) {
                                c0338j.f9906t = 1;
                                if (cn3.rl(obj, c0338j) == coroutine_suspended) {
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

                public n(TFv.Wre wre) {
                    this.f9902n = wre;
                }

                @Override // TFv.Wre
                public Object n(TFv.CN3 cn3, Continuation continuation) {
                    Object objN = this.f9902n.n(new C0337j(cn3), continuation);
                    return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w6(fuX fux, Continuation continuation) {
                super(2, continuation);
                this.f9900t = fux;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new w6(this.f9900t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f9899n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    TFv.Wre wreGh = aC.gh(new n(this.f9900t.XQ.getState()));
                    C0336j c0336j = new C0336j(this.f9900t);
                    this.f9899n = 1;
                    if (wreGh.n(c0336j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = fuX.this.new j(continuation);
            jVar.f9872t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9871n == 0) {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f9872t;
                GJW.C.nr(vdVar, null, null, new C0324j(fuX.this, null), 3, null);
                GJW.C.nr(vdVar, null, null, new n(fuX.this, null), 3, null);
                GJW.C.nr(vdVar, null, null, new w6(fuX.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f9907n;

        static final class j extends SuspendLambda implements Function3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ Object f9909O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f9910n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f9911t;

            j(Continuation continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, j.w6.C0318j c0318j, Continuation continuation) {
                j jVar = new j(continuation);
                jVar.f9911t = cn3;
                jVar.f9909O = c0318j;
                return jVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
            
                if (r1.rl(r9, r8) == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
            
                if (r1.rl(r9, r8) != r0) goto L23;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                TFv.CN3 cn3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f9910n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            cn3 = (TFv.CN3) this.f9911t;
                            ResultKt.throwOnFailure(obj);
                            Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                            this.f9911t = null;
                            this.f9910n = 3;
                        }
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                cn3 = (TFv.CN3) this.f9911t;
                if (aC.KN(((j.w6.C0318j) this.f9909O).t())) {
                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                    this.f9911t = null;
                    this.f9910n = 1;
                } else {
                    this.f9911t = cn3;
                    this.f9910n = 2;
                    if (yg.rl(1000L, this) != coroutine_suspended) {
                        Boolean boolBoxBoolean3 = Boxing.boxBoolean(true);
                        this.f9911t = null;
                        this.f9910n = 3;
                    }
                }
                return coroutine_suspended;
            }
        }

        /* JADX INFO: renamed from: Si.fuX$n$n, reason: collision with other inner class name */
        static final class C0339n implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0339n f9912n = new C0339n();

            public final Object n(boolean z2, Continuation continuation) {
                if (z2) {
                    aO.z.WPU();
                } else {
                    aO.z.o();
                }
                return Unit.INSTANCE;
            }

            @Override // TFv.CN3
            public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
                return n(((Boolean) obj).booleanValue(), continuation);
            }

            C0339n() {
            }
        }

        public static final class w6 implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f9913n;

            public static final class j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.CN3 f9914n;

                /* JADX INFO: renamed from: Si.fuX$n$w6$j$j, reason: collision with other inner class name */
                public static final class C0340j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f9916n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f9917t;

                    public C0340j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f9916n = obj;
                        this.f9917t |= Integer.MIN_VALUE;
                        return j.this.rl(null, this);
                    }
                }

                public j(TFv.CN3 cn3) {
                    this.f9914n = cn3;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0340j c0340j;
                    if (continuation instanceof C0340j) {
                        c0340j = (C0340j) continuation;
                        int i2 = c0340j.f9917t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0340j.f9917t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0340j = new C0340j(continuation);
                        }
                    }
                    Object obj2 = c0340j.f9916n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0340j.f9917t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        TFv.CN3 cn3 = this.f9914n;
                        if (obj instanceof j.w6.C0318j) {
                            c0340j.f9917t = 1;
                            if (cn3.rl(obj, c0340j) == coroutine_suspended) {
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

            public w6(TFv.Wre wre) {
                this.f9913n = wre;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                Object objN = this.f9913n.n(new j(cn3), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9907n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreP5 = TFv.fuX.P5(new w6(fuX.this.XQ.getState()), new j(null));
                C0339n c0339n = C0339n.f9912n;
                this.f9907n = 1;
                if (wreP5.n(c0339n, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static final class w6 {
        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final cA rl(mz mzVar) {
            tI tIVar = new tI(mzVar, 1920, 1080, AbstractC2487Wre.gh() > 4294967296L ? 37324800 : AbstractC2487Wre.gh() > 3221225472L ? 33177600 : AbstractC2487Wre.gh() > 2147483648L ? 24883200 : AbstractC2487Wre.gh() > 1610612736 ? 20736000 : AbstractC2487Wre.gh() > 1073741824 ? 16588800 : AbstractC2487Wre.gh() > 536870912 ? 12441600 : 10368000, DC.f76234g, true);
            if (AbstractC2487Wre.gh() > 4294967296L) {
                DC dc = DC.E2;
                return new Sis(tIVar, new tI(mzVar, 640, 360, 41943040, dc, false), new tI(mzVar, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 180, 26214400, dc, false), new tI(mzVar, 160, 90, 26214400, dc, false), new tI(mzVar, 80, 45, 52428800, dc, false));
            }
            if (AbstractC2487Wre.gh() > 3221225472L) {
                DC dc2 = DC.E2;
                return new Sis(tIVar, new tI(mzVar, 640, 360, 31457280, dc2, false), new tI(mzVar, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 180, 15728640, dc2, false), new tI(mzVar, 160, 90, 15728640, dc2, false), new tI(mzVar, 80, 45, 41943040, dc2, false));
            }
            if (AbstractC2487Wre.gh() > 2147483648L) {
                DC dc3 = DC.E2;
                return new Sis(tIVar, new tI(mzVar, 640, 360, 20971520, dc3, false), new tI(mzVar, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 180, 10485760, dc3, false), new tI(mzVar, 160, 90, 10485760, dc3, false), new tI(mzVar, 80, 45, 29360128, dc3, false));
            }
            if (AbstractC2487Wre.gh() > 1610612736) {
                DC dc4 = DC.E2;
                return new Sis(tIVar, new tI(mzVar, 640, 360, 15728640, dc4, false), new tI(mzVar, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 180, 8388608, dc4, false), new tI(mzVar, 160, 90, 8388608, dc4, false), new tI(mzVar, 80, 45, 16777216, dc4, false));
            }
            if (AbstractC2487Wre.gh() > 1073741824) {
                DC dc5 = DC.E2;
                return new Sis(tIVar, new tI(mzVar, 640, 360, 8388608, dc5, false), new tI(mzVar, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 180, 4194304, dc5, false), new tI(mzVar, 160, 90, 4194304, dc5, false), new tI(mzVar, 80, 45, 8388608, dc5, false));
            }
            DC dc6 = DC.E2;
            return new Sis(tIVar, new tI(mzVar, 640, 360, 5242880, dc6, false), new tI(mzVar, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 180, 3145728, dc6, false), new tI(mzVar, 160, 90, 3145728, dc6, false), new tI(mzVar, 80, 45, 5242880, dc6, false));
        }

        private w6() {
        }
    }

    public fuX(String contextTag, Context context, iF eventLogger, SceneHolder sceneHolder, boolean z2) {
        Intrinsics.checkNotNullParameter(contextTag, "contextTag");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(sceneHolder, "sceneHolder");
        this.f9850n = eventLogger;
        this.rl = sceneHolder;
        this.f9853t = z2;
        this.nr = cBL.j.f43572t.n();
        this.f9847O = context.getApplicationContext();
        this.J2 = new Q(context);
        this.xMQ = 1;
        this.gh = Lu.n(aC.J2(J2(), 0, 1, null));
        vd vdVarN = GJW.Lu.n(EmptyCoroutineContext.INSTANCE);
        this.qie = vdVarN;
        this.az = new ArrayList();
        this.ty = new ArrayList();
        this.HI = new ArrayList();
        InterfaceC2107n interfaceC2107nN = AbstractC2108w6.n(context, contextTag, false);
        this.Ik = interfaceC2107nN;
        this.f9852r = aYN.rl(interfaceC2107nN.t());
        Kp.Dsr dsr = new Kp.Dsr(interfaceC2107nN);
        this.f9851o = dsr;
        C0323fuX c0323fuX = new C0323fuX();
        this.f9849Z = c0323fuX;
        this.XQ = Sbr.n.n(vdVarN, context, as.z.n(30), c0323fuX, dsr, Kp.w6.f5865n);
        GJW.C.nr(vdVarN, OU.t(), null, new j(null), 2, null);
        GJW.C.nr(vdVarN, null, null, new n(null), 3, null);
        J2().subscribe(new Function1() { // from class: Si.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.eF(this.f9918n, (SceneHolderState) obj);
            }
        });
        piY();
        TextElementKt.initGlobalFontHandler();
        this.WPU = GJW.C.nr(vdVarN, OU.t().p0N(), null, new Dsr(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(mF.Ml ml, fuX fux, int i2, Pl pl, Map map, InterfaceC2106j execute) throws Throwable {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        try {
            execute.Uo(new xZD(ml.t()));
            fux.xg(execute, i2, pl, map);
            return Unit.INSTANCE;
        } catch (IllegalArgumentException unused) {
            execute.Uo(l4Z.f76316n);
            return Unit.INSTANCE;
        }
    }

    private final void Mx(Exception exc, String str) {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.setOomCount(jVar.getOomCount() + 1);
        XoT.C.nr("OpenGLOutOfMemoryException: Trimming Memory. " + str + " " + exc.getMessage());
        QJ.mUb(QJ.J2() + 1);
        if (System.nanoTime() - QJ.Uo() > 30000000) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Context appContext = this.f9847O;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            afx.nr(appContext).getMemoryInfo(memoryInfo);
            QJ.gh(System.nanoTime());
            iF iFVar = this.f9850n;
            Bundle bundle = new Bundle();
            bundle.putInt(JavetError.PARAMETER_COUNT, QJ.J2());
            bundle.putLong("jvm_free_memory", Runtime.getRuntime().freeMemory());
            bundle.putLong("jvm_total_memory", Runtime.getRuntime().totalMemory());
            bundle.putLong("device_total_memory", memoryInfo.totalMem);
            bundle.putLong("device_avail_memory", memoryInfo.availMem);
            bundle.putBoolean("system_lowmem", memoryInfo.lowMemory);
            bundle.putLong("native_heap_total", Debug.getNativeHeapSize());
            bundle.putLong("native_heap_alloc", Debug.getNativeHeapAllocatedSize());
            bundle.putLong("native_heap_free", Debug.getNativeHeapFreeSize());
            Unit unit = Unit.INSTANCE;
            iFVar.n(new j.fuX("gl_out_of_memory", bundle));
            QJ.mUb(0);
        }
        while (AbstractC2478o.nr()) {
        }
        this.f9852r.rl();
        ImageCacheKt.trimImageCacheMemory(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Nxk(Continuation continuation) {
        this.XQ.nr();
        Object objN = this.Ik.n(new Function1() { // from class: Si.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.Y(this.f9804n, (InterfaceC2106j) obj);
            }
        }, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(fuX fux, InterfaceC2106j execute) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        fux.f9852r.rl();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eF(fuX fux, SceneHolderState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fux.piY();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ijL() {
        return "release IN";
    }

    private final float k() {
        Float fN;
        j.n.C0316j c0316jUo = aC.Uo((j.w6) this.XQ.getState().getValue());
        if (c0316jUo == null || (fN = c0316jUo.n()) == null) {
            return 0.0f;
        }
        return fN.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m() {
        return "release OUT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ofS(fuX fux, InterfaceC2106j interfaceC2106j, Scene scene, int i2, Map map, RenderMode renderMode, SceneSelection sceneSelection, Rectangle rectangle, nKE nke) {
        SceneRenderingKt.renderWithGpu(scene, fux.J2, i2, interfaceC2106j.nr(), interfaceC2106j.O(), interfaceC2106j.nr(), interfaceC2106j.O(), interfaceC2106j.rl(), fux.f9852r, (103217152 & 256) != 0 ? MapsKt.emptyMap() : map, (103217152 & 512) != 0 ? RenderMode.PAUSE : renderMode, (103217152 & 1024) != 0 ? SceneKt.getEMPTY_SCENE_SELECTION() : sceneSelection, (103217152 & 2048) != 0 ? 0 : fux.J2().getEditingSerial(), (103217152 & 4096) != 0 ? 0 : fux.J2().getEditMode(), (103217152 & 8192) != 0 ? new SpoidEnv(null, null, null, null, 15, null) : fux.J2().getSpoidEnv(), (103217152 & 16384) != 0 ? false : true, (32768 & 103217152) != 0 ? null : null, (65536 & 103217152) != 0 ? false : false, (131072 & 103217152) != 0 ? false : fux.f9853t, (262144 & 103217152) != 0 ? null : null, (524288 & 103217152) != 0 ? null : null, rectangle, (2097152 & 103217152) != 0 ? 1 : 0, (4194304 & 103217152) != 0 ? MapsKt.emptyMap() : null, null, fux.dR0(), (33554432 & 103217152) != 0 ? false : true, (103217152 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? nKE.ck.n() : nke);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pJg(fuX fux, InterfaceC2106j interfaceC2106j, Scene scene, int i2, int i3, int i5, Map map, RenderMode renderMode, SceneSelection sceneSelection, Rectangle rectangle, int i7, nKE nke) {
        SceneRenderingKt.renderWithGpu(scene, fux.J2, i2, i3, i5, i3, i5, interfaceC2106j.rl(), fux.f9852r, (103217152 & 256) != 0 ? MapsKt.emptyMap() : map, (103217152 & 512) != 0 ? RenderMode.PAUSE : renderMode, (103217152 & 1024) != 0 ? SceneKt.getEMPTY_SCENE_SELECTION() : sceneSelection, (103217152 & 2048) != 0 ? 0 : fux.J2().getEditingSerial(), (103217152 & 4096) != 0 ? 0 : fux.J2().getEditMode(), (103217152 & 8192) != 0 ? new SpoidEnv(null, null, null, null, 15, null) : fux.J2().getSpoidEnv(), (103217152 & 16384) != 0 ? false : true, (32768 & 103217152) != 0 ? null : null, (65536 & 103217152) != 0 ? false : false, (131072 & 103217152) != 0 ? false : fux.f9853t, (262144 & 103217152) != 0 ? null : null, (524288 & 103217152) != 0 ? null : null, rectangle, (2097152 & 103217152) != 0 ? 1 : i7, (4194304 & 103217152) != 0 ? MapsKt.emptyMap() : null, null, fux.dR0(), (33554432 & 103217152) != 0 ? false : false, (103217152 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? nKE.ck.n() : nke);
        return Unit.INSTANCE;
    }

    private final void piY() {
        Object value;
        this.XQ.WPU(as.z.n(J2().getScene().getFramesPerHundredSeconds() / 100));
        SPz sPz = this.gh;
        do {
            value = sPz.getValue();
        } while (!sPz.Uo(value, aC.J2(J2(), 0, 1, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0227 A[Catch: OpenGLOutOfMemoryException -> 0x00bb, TryCatch #1 {OpenGLOutOfMemoryException -> 0x00bb, blocks: (B:3:0x0025, B:7:0x00ae, B:9:0x00b7, B:12:0x00be, B:15:0x00e2, B:18:0x00ec, B:20:0x00f1, B:24:0x0125, B:26:0x012b, B:28:0x0147, B:30:0x014d, B:32:0x0169, B:34:0x0171, B:39:0x017c, B:41:0x01a9, B:43:0x01db, B:45:0x01e9, B:50:0x01fa, B:55:0x0210, B:57:0x0227, B:58:0x022e, B:60:0x0240, B:63:0x0247, B:89:0x0355, B:90:0x035b, B:92:0x036e, B:62:0x0244, B:42:0x01b4, B:38:0x017a, B:31:0x0153, B:27:0x0131, B:6:0x0031), top: B:101:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0240 A[Catch: OpenGLOutOfMemoryException -> 0x00bb, TryCatch #1 {OpenGLOutOfMemoryException -> 0x00bb, blocks: (B:3:0x0025, B:7:0x00ae, B:9:0x00b7, B:12:0x00be, B:15:0x00e2, B:18:0x00ec, B:20:0x00f1, B:24:0x0125, B:26:0x012b, B:28:0x0147, B:30:0x014d, B:32:0x0169, B:34:0x0171, B:39:0x017c, B:41:0x01a9, B:43:0x01db, B:45:0x01e9, B:50:0x01fa, B:55:0x0210, B:57:0x0227, B:58:0x022e, B:60:0x0240, B:63:0x0247, B:89:0x0355, B:90:0x035b, B:92:0x036e, B:62:0x0244, B:42:0x01b4, B:38:0x017a, B:31:0x0153, B:27:0x0131, B:6:0x0031), top: B:101:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0244 A[Catch: OpenGLOutOfMemoryException -> 0x00bb, TryCatch #1 {OpenGLOutOfMemoryException -> 0x00bb, blocks: (B:3:0x0025, B:7:0x00ae, B:9:0x00b7, B:12:0x00be, B:15:0x00e2, B:18:0x00ec, B:20:0x00f1, B:24:0x0125, B:26:0x012b, B:28:0x0147, B:30:0x014d, B:32:0x0169, B:34:0x0171, B:39:0x017c, B:41:0x01a9, B:43:0x01db, B:45:0x01e9, B:50:0x01fa, B:55:0x0210, B:57:0x0227, B:58:0x022e, B:60:0x0240, B:63:0x0247, B:89:0x0355, B:90:0x035b, B:92:0x036e, B:62:0x0244, B:42:0x01b4, B:38:0x017a, B:31:0x0153, B:27:0x0131, B:6:0x0031), top: B:101:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026b A[Catch: OpenGLOutOfMemoryException -> 0x0290, TryCatch #0 {OpenGLOutOfMemoryException -> 0x0290, blocks: (B:65:0x0266, B:67:0x026b, B:70:0x0295, B:72:0x029d, B:74:0x02d8, B:76:0x02f6, B:78:0x02ff, B:77:0x02fb, B:81:0x033a, B:83:0x0340, B:87:0x034a), top: B:99:0x0266 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029d A[Catch: OpenGLOutOfMemoryException -> 0x0290, TryCatch #0 {OpenGLOutOfMemoryException -> 0x0290, blocks: (B:65:0x0266, B:67:0x026b, B:70:0x0295, B:72:0x029d, B:74:0x02d8, B:76:0x02f6, B:78:0x02ff, B:77:0x02fb, B:81:0x033a, B:83:0x0340, B:87:0x034a), top: B:99:0x0266 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x036e A[Catch: OpenGLOutOfMemoryException -> 0x00bb, TRY_LEAVE, TryCatch #1 {OpenGLOutOfMemoryException -> 0x00bb, blocks: (B:3:0x0025, B:7:0x00ae, B:9:0x00b7, B:12:0x00be, B:15:0x00e2, B:18:0x00ec, B:20:0x00f1, B:24:0x0125, B:26:0x012b, B:28:0x0147, B:30:0x014d, B:32:0x0169, B:34:0x0171, B:39:0x017c, B:41:0x01a9, B:43:0x01db, B:45:0x01e9, B:50:0x01fa, B:55:0x0210, B:57:0x0227, B:58:0x022e, B:60:0x0240, B:63:0x0247, B:89:0x0355, B:90:0x035b, B:92:0x036e, B:62:0x0244, B:42:0x01b4, B:38:0x017a, B:31:0x0153, B:27:0x0131, B:6:0x0031), top: B:101:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x038b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void xg(final InterfaceC2106j interfaceC2106j, final int i2, Pl pl, final Map map) throws Throwable {
        Trace trace;
        int i3;
        Vector2D vector2DUnaryMinus;
        int i5;
        int i7;
        int i8;
        g9s g9sVarQie;
        g9s g9sVar;
        final fuX fux = this;
        final Scene scene = pl.rl().getScene();
        final SceneSelection selection = pl.rl().getSelection();
        int editMode = pl.rl().getEditMode();
        FrameStats frameStatsStatsForFrame = SceneKt.statsForFrame(scene, i2);
        long jNanoTime = System.nanoTime();
        try {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            if (jVar.getDisableRenderPerformanceTrace()) {
                trace = null;
            } else {
                Trace traceO = Li.I28.t().O("preview_render_frame_2");
                traceO.putAttribute("active_video", String.valueOf(frameStatsStatsForFrame.getActiveVideoLayers()));
                traceO.putAttribute("active_audio", String.valueOf(frameStatsStatsForFrame.getActiveAudioTracks()));
                traceO.putAttribute("active_effects", CollectionsKt.joinToString$default(frameStatsStatsForFrame.getActiveEffects(), ", ", null, null, 0, null, null, 62, null));
                traceO.putAttribute("project", scene.getWidth() + "x" + scene.getHeight() + "@" + SceneSerializerKt.getFpsString(scene));
                traceO.putAttribute("low_quality_preview", String.valueOf(jVar.getLowQualityPreview()));
                trace = traceO;
            }
            fux.z();
            int i9 = fux.mUb;
            if (i9 < 1000) {
                fux.mUb = i9 + 1;
            }
            final nKE userPreviewMode = pl.rl().getUserPreviewMode();
            int i10 = 2;
            final int i11 = (SceneKt.checkDrawingAtTime(scene, i2) || !(editMode == 2131362616 || nCS.j.f71005n.rl() == 2 || B7.QJ.J2((j.w6) fux.XQ.getState().getValue()))) ? 1 : fux.xMQ;
            float fNr = interfaceC2106j.nr();
            float fO = interfaceC2106j.O();
            float width = scene.getWidth();
            float height = scene.getHeight();
            Pair pairN = AbstractC1951j.n(fNr, fO, width, height);
            float fFloatValue = ((Number) pairN.component1()).floatValue();
            float fFloatValue2 = ((Number) pairN.component2()).floatValue();
            if (!jVar.getLowQualityPreview()) {
                i10 = 1;
            }
            int iNr = !userPreviewMode.Ik() ? interfaceC2106j.nr() / i11 : RangesKt.coerceAtMost(interfaceC2106j.nr() / i11, MathKt.roundToInt((fFloatValue / i10) / RP.KN(userPreviewMode)));
            int iO = !userPreviewMode.Ik() ? interfaceC2106j.O() / i11 : RangesKt.coerceAtMost(interfaceC2106j.O() / i11, MathKt.roundToInt((fFloatValue2 / i10) / RP.KN(userPreviewMode)));
            float f3 = fNr / fO;
            float f4 = width / height;
            float f5 = ((f3 > f4 ? height * f3 : width) - width) * 0.5f;
            float f6 = ((f3 > f4 ? height : width / f3) - height) * 0.5f;
            Rectangle rectangleScaleAroundCenter = GeometryKt.scaleAroundCenter(new Rectangle(-f5, -f6, width + f5, height + f6), 1.0f / RP.KN(userPreviewMode));
            if (userPreviewMode.Ik()) {
                i3 = iO;
                vector2DUnaryMinus = GeometryKt.unaryMinus(new Vector2D((float) Math.rint(RP.rl(userPreviewMode).getX()), (float) Math.rint(RP.rl(userPreviewMode).getY())));
            } else {
                vector2DUnaryMinus = GeometryKt.unaryMinus(RP.rl(userPreviewMode));
                i3 = iO;
            }
            final Rectangle rectangleOffset = GeometryKt.offset(rectangleScaleAroundCenter, vector2DUnaryMinus);
            long jNanoTime2 = System.nanoTime();
            try {
                if (iNr >= interfaceC2106j.nr()) {
                    i5 = i3;
                    if (i5 >= interfaceC2106j.O()) {
                        i8 = iNr;
                        i7 = i5;
                        g9sVarQie = null;
                        if (g9sVarQie != null) {
                            interfaceC2106j.rl().r(g9sVarQie);
                        }
                        g9sVar = g9sVarQie;
                        final int i12 = i8;
                        final RenderMode renderMode = !B7.QJ.J2((j.w6) fux.XQ.getState().getValue()) ? RenderMode.PLAY : RenderMode.PAUSE;
                        final int i13 = i7;
                        XoT.C.r(new Function0() { // from class: Si.I28
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return fuX.pJg(this.f9811n, interfaceC2106j, scene, i2, i12, i13, map, renderMode, selection, rectangleOffset, i11, userPreviewMode);
                            }
                        });
                        if (g9sVar != null) {
                            interfaceC2106j.rl().o();
                            interfaceC2106j.rl().J2();
                            Mf.t(interfaceC2106j.rl()).render(C2470N.KN.n(), g9sVar, 1.0f);
                            g9sVar.release();
                        }
                        if (userPreviewMode.ck()) {
                            interfaceC2106j.rl().J2();
                            float width2 = scene.getWidth() / AbstractC1951j.nr(SceneKt.getSize(scene), new Vector2D(fNr, fO)).getX();
                            float fUo = userPreviewMode.Uo();
                            float fKN = (0.5f * width2) / RP.KN(userPreviewMode);
                            float fT = HI0.vd.t(0.11f, 0.092f, fKN / fUo);
                            if (fT > 0.0f) {
                                float y2 = ColorKt.getY(scene.getBackground());
                                SolidColor.Companion companion = SolidColor.INSTANCE;
                                Mf.rl(interfaceC2106j.rl()).render(C2470N.KN.t(Rectangle.INSTANCE.getGL_FULLSCREEN(), rectangleOffset), ColorKt.times(ColorKt.times(Math.abs(y2 - ColorKt.getY(companion.getLIGHT_GRAY())) < 0.1f ? companion.getWHITE() : companion.getLIGHT_GRAY(), 0.3f), fT), fUo, GeometryKt.div(GeometryKt.unaryMinus(SceneKt.getSize(scene)), 2.0f), fKN, width2 / RP.KN(userPreviewMode));
                            }
                        }
                        if (editMode != 2131362616 || (selection.isEmpty() && selection.getSelectableHint() == null)) {
                            fux = this;
                        } else {
                            fux = this;
                            XoT.C.r(new Function0() { // from class: Si.Wre
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return fuX.ofS(this.f9829n, interfaceC2106j, scene, i2, map, renderMode, selection, rectangleOffset, userPreviewMode);
                                }
                            });
                        }
                        fux.KN = (fux.KN + ((System.nanoTime() - jNanoTime2) / 1000000.0f)) / 2.0f;
                        if (trace != null) {
                            trace.stop();
                        }
                        fux.ck = 0;
                        QJ.ty(QJ.xMQ() + 1);
                        InterfaceC2106j.C0926j.n(interfaceC2106j, 0L, 1, null);
                        if (jNanoTime < 0) {
                            long jNanoTime3 = System.nanoTime() - jNanoTime;
                            QJ.az(jNanoTime3);
                            QJ.qie(((QJ.KN() * ((long) 75)) + (jNanoTime3 * ((long) 25))) / ((long) 100));
                            return;
                        }
                        return;
                    }
                } else {
                    i5 = i3;
                }
                XoT.C.r(new Function0() { // from class: Si.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.pJg(this.f9811n, interfaceC2106j, scene, i2, i12, i13, map, renderMode, selection, rectangleOffset, i11, userPreviewMode);
                    }
                });
                if (g9sVar != null) {
                }
                if (userPreviewMode.ck()) {
                }
                if (editMode != 2131362616) {
                    fux = this;
                }
                fux.KN = (fux.KN + ((System.nanoTime() - jNanoTime2) / 1000000.0f)) / 2.0f;
                if (trace != null) {
                }
                fux.ck = 0;
                QJ.ty(QJ.xMQ() + 1);
                InterfaceC2106j.C0926j.n(interfaceC2106j, 0L, 1, null);
                if (jNanoTime < 0) {
                }
            } catch (OpenGLOutOfMemoryException e2) {
                e = e2;
                fux = this;
                int i14 = fux.ck + 1;
                fux.ck = i14;
                fux.Mx(e, "type=render skipped_oom=" + i14);
                return;
            }
            i8 = iNr;
            i7 = i5;
            g9sVarQie = interfaceC2106j.rl().qie(new Pmq(i8, i7, DC.f76234g, userPreviewMode.Ik() ? 9728 : androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR, 0, 16, null), "mainScene");
            if (g9sVarQie != null) {
            }
            g9sVar = g9sVarQie;
            final int i122 = i8;
            final RenderMode renderMode2 = !B7.QJ.J2((j.w6) fux.XQ.getState().getValue()) ? RenderMode.PLAY : RenderMode.PAUSE;
            final int i132 = i7;
        } catch (OpenGLOutOfMemoryException e3) {
            e = e3;
        }
    }

    private final void z() {
        int i2;
        int i3;
        float f3 = this.KN;
        if (f3 > 45.0f && this.mUb > 3 && (i3 = this.xMQ) < 3) {
            this.mUb = 0;
            this.xMQ = i3 + 1;
            this.KN = f3 / 2.0f;
        } else {
            if (f3 >= 25.0f || this.mUb <= 3 || (i2 = this.xMQ) <= 1) {
                return;
            }
            this.mUb = 0;
            this.xMQ = i2 - 1;
            this.KN = f3 * 2.0f;
        }
    }

    @Override // Si.Xo
    public void HI(int i2, boolean z2) {
        this.XQ.Z(d2n.Ml.f63370t.rl(TimeKt.timeFromFrameNumber(i2, ((Pl) this.gh.getValue()).rl().getScene().getFramesPerHundredSeconds())));
    }

    @Override // Si.Xo
    public SceneHolder J2() {
        return this.rl;
    }

    @Override // Si.Xo
    public void S(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.HI.remove(listener);
    }

    @Override // Si.Xo
    public void WPU(cBL.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.nr = jVar;
    }

    @Override // Si.Xo
    public void XQ(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.az.add(listener);
    }

    @Override // Si.Xo
    public void aYN() throws InterruptedException {
        aC.mUb(this.qie, 1500L, null, null, new Ml(null), 6, null);
    }

    public cBL.j dR0() {
        return this.nr;
    }

    @Override // Si.Xo
    public void e(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.ty.remove(listener);
    }

    @Override // Si.Xo
    public void fD(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.HI.add(listener);
    }

    @Override // Si.Xo
    public void gh(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.az.remove(listener);
    }

    @Override // Si.Xo
    public void iF(SurfaceHolder surfaceHolder) {
        this.f9848S = surfaceHolder;
        this.XQ.ck().n(surfaceHolder);
    }

    @Override // Si.Xo
    public void nY(boolean z2) {
        this.Uo = z2;
        Object value = this.XQ.getState().getValue();
        j.w6.C0318j c0318j = value instanceof j.w6.C0318j ? (j.w6.C0318j) value : null;
        if (c0318j == null) {
            return;
        }
        if (d2n.Ml.mUb(c0318j.nr()) >= d2n.Ml.mUb(c0318j.n().Uo().nr())) {
            if (!z2) {
                Iterator it = this.ty.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(Boolean.TRUE);
                }
                Iterator it2 = this.ty.iterator();
                while (it2.hasNext()) {
                    ((Function1) it2.next()).invoke(Boolean.FALSE);
                }
                return;
            }
            Xo.j.t(this, 0, false, 2, null);
        }
        j.C0315j.n(this.XQ, 0L, 1, null);
    }

    @Override // Si.Xo
    public void pause() {
        this.XQ.pause();
    }

    @Override // Si.Xo
    public void r() throws InterruptedException {
        aC.mUb(this.qie, 200L, null, null, new CN3(null), 6, null);
    }

    @Override // Si.Xo
    public SurfaceHolder rV9() {
        return this.f9848S;
    }

    @Override // Cp.j
    public void release() throws InterruptedException {
        XoT.C.Uo(this, new Function0() { // from class: Si.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.ijL();
            }
        });
        aC.mUb(RzR.f3449n, 200L, null, null, new I28(null), 6, null);
        XoT.C.Uo(this, new Function0() { // from class: Si.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.m();
            }
        });
    }

    @Override // Si.Xo
    public void ty(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.ty.add(listener);
    }

    @Override // Si.Xo
    public void wTp() {
        Object value;
        SPz sPz = this.gh;
        do {
            value = sPz.getValue();
        } while (!sPz.Uo(value, aC.O(J2(), ((Pl) value).n() + 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object eTf(final int i2, final Pl pl, final mF.Ml ml, Continuation continuation) {
        final Map mapXMQ = Kp.I28.xMQ(ml.rl(), pl.rl().getScene());
        Object objN = this.Ik.n(new Function1() { // from class: Si.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fuX.C(ml, this, i2, pl, mapXMQ, (InterfaceC2106j) obj);
            }
        }, continuation);
        if (objN == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objN;
        }
        return Unit.INSTANCE;
    }

    @Override // Si.Xo
    public float Uo(int i2) {
        return k();
    }

    @Override // Si.Xo
    public void mUb(int i2, boolean z2) {
        Xo.j.nr(this, i2, z2);
    }

    @Override // Si.Xo
    public void v(Function0 function0) {
        pause();
        this.XQ.nr();
        GJW.C.nr(this.qie, OU.t().p0N(), null, new Wre(function0, null), 2, null);
    }
}
