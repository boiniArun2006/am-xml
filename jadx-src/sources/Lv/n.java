package Lv;

import HI0.Q;
import Kp.Dsr;
import Lv.n;
import Oe.j;
import Qk.Ew;
import Qk.SPz;
import QmE.iF;
import QmE.j;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.C;
import as.Pl;
import as.z;
import com.alightcreative.app.motion.scene.ExportFormat;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.ExportProgress;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneSelection;
import com.alightcreative.app.motion.scene.SpoidEnv;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.rendering.RenderMode;
import com.alightcreative.app.motion.scene.rendering.SceneRenderingKt;
import fX.InterfaceC2106j;
import fX.InterfaceC2107n;
import java.io.File;
import java.util.Map;
import k9w.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import qcD.nehv.Apsps;
import yc.nKE;
import z.C2470N;
import z.C2472aC;
import z.DC;
import z.KH;
import z.Mf;
import z.Pmq;
import z.Zs;
import z.cA;
import z.g9s;
import z.qz;
import z.xZD;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final C2470N f6199n;
    private static final C2470N rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final C2470N f6200t;

    static final class CN3 implements mF.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC2107n f6201n;

        static final class j implements mF.I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ mF.j f6202n;
            final /* synthetic */ InterfaceC2107n rl;

            j(mF.j jVar, InterfaceC2107n interfaceC2107n) {
                this.f6202n = jVar;
                this.rl = interfaceC2107n;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(mF.Ml ml, mF.j jVar, Lv.CN3 cn3, int i2, Map map, InterfaceC2106j execute) {
                Intrinsics.checkNotNullParameter(execute, "$this$execute");
                execute.Uo(new xZD(ml.t()));
                if (jVar.t().n() == j.n.DEGREE_0) {
                    n.WPU(execute, cn3, i2, map, 0, 0, 24, null);
                    execute.J2(ml.n());
                    return Unit.INSTANCE;
                }
                Oe.w6 w6VarRl = jVar.t().rl();
                g9s g9sVarQie = execute.rl().qie(new Pmq(w6VarRl.t(), w6VarRl.rl(), DC.f76234g, 0, 0, 24, null), "unrotatedSceneContents");
                execute.rl().r(g9sVarQie);
                n.S(execute, cn3, i2, map, w6VarRl.t(), w6VarRl.rl());
                execute.rl().o();
                execute.rl().J2();
                Mf.t(execute.rl()).render(n.aYN(jVar.t().n()), g9sVarQie, 1.0f);
                g9sVarQie.release();
                execute.J2(ml.n());
                return Unit.INSTANCE;
            }

            @Override // mF.I28
            public final Object n(final mF.Ml ml, Continuation continuation) {
                final Lv.CN3 cn3 = (Lv.CN3) this.f6202n.n();
                final int iFrameNumberFromPTSNanos = TimeKt.frameNumberFromPTSNanos(RangesKt.coerceAtMost(d2n.I28.rl(this.f6202n.rl()), ((long) cn3.O().getTotalTime()) * 1000000), cn3.O().getFramesPerHundredSeconds());
                final Map mapXMQ = Kp.I28.xMQ(ml.rl(), cn3.O());
                InterfaceC2107n interfaceC2107n = this.rl;
                final mF.j jVar = this.f6202n;
                Object objN = interfaceC2107n.n(new Function1() { // from class: Lv.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n.CN3.j.t(ml, jVar, cn3, iFrameNumberFromPTSNanos, mapXMQ, (InterfaceC2106j) obj);
                    }
                }, continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        CN3(InterfaceC2107n interfaceC2107n) {
            this.f6201n = interfaceC2107n;
        }

        @Override // mF.n
        public final Object n(mF.j jVar, Continuation continuation) {
            return new j(jVar, this.f6201n);
        }
    }

    static final class I28 implements Sr2.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC2107n f6203n;
        final /* synthetic */ SPz rl;

        static final class j implements Sr2.I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Sr2.j f6204n;
            final /* synthetic */ InterfaceC2107n rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ SPz f6205t;

            j(Sr2.j jVar, InterfaceC2107n interfaceC2107n, SPz sPz) {
                this.f6204n = jVar;
                this.rl = interfaceC2107n;
                this.f6205t = sPz;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(SPz sPz, Sr2.j jVar, Lv.CN3 cn3, int i2, Map map, InterfaceC2106j execute) {
                Intrinsics.checkNotNullParameter(execute, "$this$execute");
                sPz.Z(execute, jVar.rl());
                n.WPU(execute, cn3, i2, map, 0, 0, 24, null);
                sPz.T(execute);
                return Unit.INSTANCE;
            }

            @Override // Sr2.I28
            public final Object n(Sr2.Ml ml, Continuation continuation) {
                final Lv.CN3 cn3 = (Lv.CN3) this.f6204n.n();
                final int iFrameNumberFromPTSNanos = TimeKt.frameNumberFromPTSNanos(RangesKt.coerceAtMost(d2n.I28.rl(this.f6204n.rl()), ((long) cn3.O().getTotalTime()) * 1000000), cn3.O().getFramesPerHundredSeconds());
                final Map mapXMQ = Kp.I28.xMQ(ml.n(), cn3.O());
                InterfaceC2107n interfaceC2107n = this.rl;
                final SPz sPz = this.f6205t;
                final Sr2.j jVar = this.f6204n;
                Object objN = interfaceC2107n.n(new Function1() { // from class: Lv.w6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return n.I28.j.t(sPz, jVar, cn3, iFrameNumberFromPTSNanos, mapXMQ, (InterfaceC2106j) obj);
                    }
                }, continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        I28(InterfaceC2107n interfaceC2107n, SPz sPz) {
            this.f6203n = interfaceC2107n;
            this.rl = sPz;
        }

        @Override // Sr2.n
        public final Object n(Sr2.j jVar, Continuation continuation) {
            return new j(jVar, this.f6203n, this.rl);
        }
    }

    static final class Ml extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6206n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SPz f6207t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(SPz sPz, Continuation continuation) {
            super(3, continuation);
            this.f6207t = sPz;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Throwable th, Continuation continuation) {
            return new Ml(this.f6207t, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6206n == 0) {
                ResultKt.throwOnFailure(obj);
                this.f6207t.release();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {
        final /* synthetic */ InterfaceC2107n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Lv.CN3 f6208O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ iF f6209Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6210n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Context f6211o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ File f6212r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f6213t;

        static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Lv.CN3 f6214n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f6215t;

            j(Lv.CN3 cn3, TFv.CN3 cn32) {
                this.f6214n = cn3;
                this.f6215t = cn32;
            }

            public final Object n(float f3, Continuation continuation) {
                Object objRl = this.f6215t.rl(new ExportProgress(MathKt.roundToInt(f3 * SceneKt.getDuration(this.f6214n.O())), SceneKt.getDuration(this.f6214n.O())), continuation);
                return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
            }

            @Override // TFv.CN3
            public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
                return n(((k9w.I28) obj).gh(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Lv.CN3 cn3, InterfaceC2107n interfaceC2107n, File file, Context context, iF iFVar, Continuation continuation) {
            super(2, continuation);
            this.f6208O = cn3;
            this.J2 = interfaceC2107n;
            this.f6212r = file;
            this.f6211o = context;
            this.f6209Z = iFVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = new Wre(this.f6208O, this.J2, this.f6212r, this.f6211o, this.f6209Z, continuation);
            wre.f6213t = obj;
            return wre;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
        
            if (r12 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        
            if (r12 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        
            if (r12.n(r3, r11) == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TFv.CN3 cn3;
            Wre wre;
            TFv.Wre wre2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6210n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cn3 = (TFv.CN3) this.f6213t;
                    ResultKt.throwOnFailure(obj);
                    wre = this;
                    wre2 = (TFv.Wre) obj;
                } else {
                    cn3 = (TFv.CN3) this.f6213t;
                    ResultKt.throwOnFailure(obj);
                    wre = this;
                    wre2 = (TFv.Wre) obj;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (TFv.CN3) this.f6213t;
                if (!Ew.rl(this.f6208O.nr())) {
                    Lv.CN3 cn32 = this.f6208O;
                    InterfaceC2107n interfaceC2107n = this.J2;
                    File file = this.f6212r;
                    Context context = this.f6211o;
                    iF iFVar = this.f6209Z;
                    this.f6213t = cn3;
                    this.f6210n = 1;
                    wre = this;
                    obj = n.te(cn32, interfaceC2107n, file, context, iFVar, wre);
                } else {
                    wre = this;
                    Lv.CN3 cn33 = wre.f6208O;
                    File file2 = wre.f6212r;
                    InterfaceC2107n interfaceC2107n2 = wre.J2;
                    Context context2 = wre.f6211o;
                    wre.f6213t = cn3;
                    wre.f6210n = 2;
                    obj = n.gh(cn33, file2, interfaceC2107n2, context2, this);
                }
                return coroutine_suspended;
            }
            j jVar = new j(wre.f6208O, cn3);
            wre.f6213t = null;
            wre.f6210n = 3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((Wre) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class fuX extends SuspendLambda implements Function2 {
        private /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f6216O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ File f6217S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ InterfaceC2107n f6218Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f6219g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6220n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ iF f6221o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Lv.CN3 f6222r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f6223t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(Lv.CN3 cn3, iF iFVar, InterfaceC2107n interfaceC2107n, File file, Context context, Continuation continuation) {
            super(2, continuation);
            this.f6222r = cn3;
            this.f6221o = iFVar;
            this.f6218Z = interfaceC2107n;
            this.f6217S = file;
            this.f6219g = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            fuX fux = new fuX(this.f6222r, this.f6221o, this.f6218Z, this.f6217S, this.f6219g, continuation);
            fux.J2 = obj;
            return fux;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ExportParams xMQ(ExportParams exportParams) {
            return n.Ik(exportParams);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((fuX) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0162, code lost:
        
            if (TFv.fuX.S(r1, r14, r13) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            TFv.CN3 cn3;
            ExportParams exportParamsNr;
            Lv.CN3 cn3Rl;
            ExportParams exportParams;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6216O;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cn3Rl = (Lv.CN3) this.f6223t;
                exportParams = (ExportParams) this.f6220n;
                cn3 = (TFv.CN3) this.J2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (TFv.CN3) this.J2;
                if (n.Z(this.f6222r.O())) {
                    iF iFVar = this.f6221o;
                    Bundle bundle = new Bundle();
                    Lv.CN3 cn32 = this.f6222r;
                    bundle.putInt("width", cn32.O().getWidth());
                    bundle.putInt("height", cn32.O().getHeight());
                    bundle.putInt("exportWidth", cn32.O().getExportWidth());
                    bundle.putInt("exportHeight", cn32.O().getExportHeight());
                    Unit unit = Unit.INSTANCE;
                    iFVar.n(new j.fuX(Apsps.SPYbwvogi, bundle));
                    exportParamsNr = n.Ik(this.f6222r.nr());
                } else {
                    exportParamsNr = this.f6222r.nr();
                }
                k9w.n nVarNY = n.nY(exportParamsNr);
                k9w.n nVarN = k9w.w6.f69749n.n().n(nVarNY);
                if (nVarN == null) {
                    iF iFVar2 = this.f6221o;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("desired_settings", nVarNY.toString());
                    Unit unit2 = Unit.INSTANCE;
                    iFVar2.n(new j.fuX("no_compatible_export_settings", bundle2));
                } else if (!Intrinsics.areEqual(nVarN, nVarNY)) {
                    iF iFVar3 = this.f6221o;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("desired_settings", nVarNY.toString());
                    bundle3.putString("supported_settings", nVarN.toString());
                    Unit unit3 = Unit.INSTANCE;
                    iFVar3.n(new j.fuX("applied_workaround_adjust_settings", bundle3));
                    exportParamsNr = n.r(exportParamsNr, nVarN);
                }
                ExportParams exportParams2 = (ExportParams) w9.Wre.n(exportParamsNr, n.Z(this.f6222r.O()), new Function1() { // from class: Lv.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return n.fuX.xMQ((ExportParams) obj2);
                    }
                });
                cn3Rl = Lv.CN3.rl(this.f6222r, null, null, null, exportParams2, null, 23, null);
                Scene sceneO = this.f6222r.O();
                this.J2 = cn3;
                this.f6220n = exportParams2;
                this.f6223t = cn3Rl;
                this.f6216O = 1;
                obj = Kp.I28.KN(sceneO, this);
                if (obj != coroutine_suspended) {
                    exportParams = exportParams2;
                }
                return coroutine_suspended;
            }
            Lv.CN3 cn33 = cn3Rl;
            TFv.CN3 cn34 = cn3;
            TFv.Wre wreUo = k9w.j.Uo((MoG.CN3) obj, Uri.fromFile(this.f6217S), n.nY(exportParams), this.f6219g, n.HI(this.f6218Z), cn33, true, new Dsr(this.f6218Z), Kp.w6.f5865n);
            this.J2 = null;
            this.f6220n = null;
            this.f6223t = null;
            this.f6216O = 2;
        }
    }

    /* JADX INFO: renamed from: Lv.n$n, reason: collision with other inner class name */
    static final class C0223n extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f6224O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6225n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f6226o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6227r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f6228t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6227r = obj;
            this.f6226o |= Integer.MIN_VALUE;
            return n.gh(null, null, null, null, this);
        }

        C0223n(Continuation continuation) {
            super(continuation);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6229n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SPz f6230t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(SPz sPz, Continuation continuation) {
            super(2, continuation);
            this.f6230t = sPz;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.f6230t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6229n == 0) {
                ResultKt.throwOnFailure(obj);
                this.f6230t.n();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((w6) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[j.n.values().length];
            try {
                iArr[j.n.DEGREE_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.n.DEGREE_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.n.DEGREE_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.n.DEGREE_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ExportFormat.values().length];
            try {
                iArr2[ExportFormat.VIDEO_MPEG4.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ExportFormat.VIDEO_3GPP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ExportFormat.VIDEO_WEBM.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ExportFormat.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ExportFormat.PNG_ZIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ExportFormat.JPEG_ZIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ExportFormat.WEBP_ZIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ExportFormat.PNG_PLAIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ExportFormat.JPEG_PLAIN.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ExportFormat.WEBP_PLAIN.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ExportFormat.M4A.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        qz.j jVar = qz.xMQ;
        f6199n = XQ(jVar.n(0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f));
        rl = XQ(jVar.n(1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f));
        f6200t = XQ(jVar.n(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mF.n HI(InterfaceC2107n interfaceC2107n) {
        return new CN3(interfaceC2107n);
    }

    private static final Sln.j ViF(String str) {
        return Intrinsics.areEqual(str, "audio/mp4a-latm") ? Sln.j.AAC : Sln.j.f9924n.n();
    }

    static /* synthetic */ void WPU(InterfaceC2106j interfaceC2106j, Lv.CN3 cn3, int i2, Map map, int i3, int i5, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            i3 = interfaceC2106j.nr();
        }
        int i8 = i3;
        if ((i7 & 16) != 0) {
            i5 = interfaceC2106j.O();
        }
        S(interfaceC2106j, cn3, i2, map, i8, i5);
    }

    private static final C2470N XQ(qz qzVar) {
        C2470N c2470n = new C2470N(Zs.f76294t, qz.xMQ.rl(-1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f), qzVar, C2472aC.f76296t.n(0, 1, 2, 0, 2, 3));
        c2470n.O().Uo();
        c2470n.HI().Uo();
        return c2470n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2470N aYN(j.n nVar) {
        int i2 = j.$EnumSwitchMapping$0[nVar.ordinal()];
        if (i2 == 1) {
            return C2470N.KN.n();
        }
        if (i2 == 2) {
            return f6199n;
        }
        if (i2 == 3) {
            return rl;
        }
        if (i2 == 4) {
            return f6200t;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Sr2.n az(SPz sPz, InterfaceC2107n interfaceC2107n) {
        return new I28(interfaceC2107n, sPz);
    }

    private static final Sln.n g(String str) {
        return Intrinsics.areEqual(str, "video/avc") ? Sln.n.AVC : Intrinsics.areEqual(str, "video/hevc") ? Sln.n.H265 : Sln.n.f9927n.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object gh(Lv.CN3 cn3, File file, InterfaceC2107n interfaceC2107n, Context context, Continuation continuation) {
        C0223n c0223n;
        final Lv.CN3 cn32;
        SPz sPz;
        if (continuation instanceof C0223n) {
            c0223n = (C0223n) continuation;
            int i2 = c0223n.f6226o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0223n.f6226o = i2 - Integer.MIN_VALUE;
            } else {
                c0223n = new C0223n(continuation);
            }
        }
        Object objKN = c0223n.f6227r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0223n.f6226o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objKN);
            SPz sPzN = Ew.n(cn3.nr(), file);
            Scene sceneO = cn3.O();
            c0223n.f6225n = cn3;
            c0223n.f6228t = interfaceC2107n;
            c0223n.f6224O = context;
            c0223n.J2 = sPzN;
            c0223n.f6226o = 1;
            objKN = Kp.I28.KN(sceneO, c0223n);
            if (objKN == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn32 = cn3;
            sPz = sPzN;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sPz = (SPz) c0223n.J2;
            context = (Context) c0223n.f6224O;
            interfaceC2107n = (InterfaceC2107n) c0223n.f6228t;
            Lv.CN3 cn33 = (Lv.CN3) c0223n.f6225n;
            ResultKt.throwOnFailure(objKN);
            cn32 = cn33;
        }
        Context context2 = context;
        MoG.CN3 cn34 = (MoG.CN3) w9.Wre.n(objKN, Ew.t(sPz), new Function1() { // from class: Lv.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.qie(cn32, (MoG.CN3) obj);
            }
        });
        return TFv.fuX.nHg(TFv.fuX.v(Sr2.w6.t(cn34.J2(), context2, az(sPz, interfaceC2107n), cn32, new Dsr(interfaceC2107n), ck(cn32.nr()), Kp.w6.f5865n), new w6(sPz, null)), new Ml(sPz, null));
    }

    private static final d2n.Wre mUb(Scene scene, ExportParams exportParams) {
        return d2n.Wre.nr.n(TimeKt.timeFromFrameNumber(exportParams.getStartFrame(), scene.getFramesPerHundredSeconds()), TimeKt.timeFromFrameNumber(exportParams.getEndFrame(), scene.getFramesPerHundredSeconds()));
    }

    public static final k9w.n nY(ExportParams exportParams) {
        Intrinsics.checkNotNullParameter(exportParams, "<this>");
        return new k9w.n(new n.C1016n(exportParams.getFphs() / 100, new Oe.w6(exportParams.getWidth(), exportParams.getHeight()), exportParams.getVideoBitrate(), g(exportParams.getVideoMime())), new n.j(new as.CN3(Pl.n(exportParams.getAudioChannelCount()), z.n(exportParams.getAudioSampleRate()), null), exportParams.getAudioBitrate(), ViF(exportParams.getAudioMime())));
    }

    private static final boolean o(ExportFormat exportFormat) {
        switch (j.$EnumSwitchMapping$1[exportFormat.ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 11:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MoG.CN3 qie(Lv.CN3 cn3, MoG.CN3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MoG.CN3.t(it, null, mUb(cn3.O(), cn3.nr()), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object te(Lv.CN3 cn3, InterfaceC2107n interfaceC2107n, File file, Context context, iF iFVar, Continuation continuation) {
        return TFv.fuX.iF(new fuX(cn3, iFVar, interfaceC2107n, file, context, null));
    }

    public static final TFv.Wre ty(Context context, iF eventLogger, File outputFile, Lv.CN3 compositionInstruction, InterfaceC2107n renderingThreadExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(compositionInstruction, "compositionInstruction");
        Intrinsics.checkNotNullParameter(renderingThreadExecutor, "renderingThreadExecutor");
        if (o(compositionInstruction.nr().getFormat())) {
            return TFv.fuX.iF(new Wre(compositionInstruction, renderingThreadExecutor, outputFile, context, eventLogger, null));
        }
        throw new IllegalArgumentException(("The requested format is not supported: " + compositionInstruction.nr().getFormat()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExportParams Ik(ExportParams exportParams) {
        return ExportParams.copy$default(exportParams, exportParams.getHeight(), exportParams.getWidth(), 0, 0, 0, 0, null, false, false, 0, 0, null, null, 0, 0, 0, 0, 0, false, 524284, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(InterfaceC2106j interfaceC2106j, Lv.CN3 cn3, int i2, Map map, int i3, int i5) {
        Scene sceneO = cn3.O();
        Q qT = cn3.t();
        KH khRl = interfaceC2106j.rl();
        cA cAVarJ2 = cn3.J2();
        RenderMode renderMode = RenderMode.EXPORT;
        SceneSelection empty_scene_selection = SceneKt.getEMPTY_SCENE_SELECTION();
        nKE nke = new nKE(0.0f, null, 0.0f, null, false, false, false, 0.0f, 0.0f, null, 0.0f, null, true, false, null, 28671, null);
        SceneRenderingKt.renderWithGpu(sceneO, qT, i2, i3, i5, i3, i5, khRl, cAVarJ2, (103217152 & 256) != 0 ? MapsKt.emptyMap() : map, (103217152 & 512) != 0 ? RenderMode.PAUSE : renderMode, (103217152 & 1024) != 0 ? SceneKt.getEMPTY_SCENE_SELECTION() : empty_scene_selection, (103217152 & 2048) != 0 ? 0 : 0, (103217152 & 4096) != 0 ? 0 : 0, (103217152 & 8192) != 0 ? new SpoidEnv(null, null, null, null, 15, null) : null, (103217152 & 16384) != 0 ? false : cn3.nr().getOpaque(), (32768 & 103217152) != 0 ? null : null, (65536 & 103217152) != 0 ? false : false, (131072 & 103217152) != 0 ? false : true, (262144 & 103217152) != 0 ? null : null, (524288 & 103217152) != 0 ? null : null, new Rectangle(0.0f, 0.0f, cn3.O().getWidth(), cn3.O().getHeight()), (2097152 & 103217152) != 0 ? 1 : 0, (4194304 & 103217152) != 0 ? MapsKt.emptyMap() : null, cn3.nr(), cn3.Uo(), (33554432 & 103217152) != 0 ? false : false, (103217152 & C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? nKE.ck.n() : nke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(Scene scene) {
        if (scene.getHeight() > scene.getWidth()) {
            return true;
        }
        return false;
    }

    private static final float ck(ExportParams exportParams) {
        return exportParams.getFphs() / 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExportParams r(ExportParams exportParams, k9w.n nVar) {
        return ExportParams.copy$default(exportParams, nVar.rl().nr().t(), nVar.rl().nr().rl(), nVar.n().n(), nVar.rl().n(), 0, (int) Math.floor(nVar.rl().rl() * 100), null, false, false, 0, 0, null, null, nVar.n().t().t(), 0, 0, 0, 0, false, 516048, null);
    }
}
