package Qk;

import GJW.P;
import GJW.cA;
import GJW.vd;
import HI0.gnv;
import Qk.j;
import QmE.iF;
import QmE.j;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PowerManager;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.scene.ExportFormat;
import com.alightcreative.app.motion.scene.ExportOutcome;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.ExportProblem;
import com.alightcreative.app.motion.scene.ExportProgress;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneExporterKt;
import com.alightcreative.app.motion.scene.SceneExporterSuspendKt;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.gl.egl.il.inFlMLxL;
import java.io.File;
import java.util.Set;
import java.util.UUID;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class j {

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ C J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f8256O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Ref.LongRef f8257S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Context f8258Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f8259g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8260n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f8261o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Ref.LongRef f8262r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f8263t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Ref.ObjectRef objectRef, C c2, Ref.LongRef longRef, Ref.IntRef intRef, Context context, Ref.LongRef longRef2, String str, Continuation continuation) {
            super(2, continuation);
            this.f8256O = objectRef;
            this.J2 = c2;
            this.f8262r = longRef;
            this.f8261o = intRef;
            this.f8258Z = context;
            this.f8257S = longRef2;
            this.f8259g = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String xMQ(ExportProgress exportProgress, Ref.IntRef intRef, long j2, long j3, Ref.LongRef longRef) {
            return "EXPORT PROGRESS UPDATE:  " + exportProgress + ", prev=" + intRef.element + " elapsed=" + j2 + " remain=" + j3 + " prevRemain=" + longRef.element;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Ml ml = new Ml(this.f8256O, this.J2, this.f8262r, this.f8261o, this.f8258Z, this.f8257S, this.f8259g, continuation);
            ml.f8263t = obj;
            return ml;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ExportProgress exportProgress, Continuation continuation) {
            return ((Ml) create(exportProgress, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, com.alightcreative.app.motion.scene.ExportProgress] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8260n == 0) {
                ResultKt.throwOnFailure(obj);
                final ?? r12 = (ExportProgress) this.f8263t;
                this.f8256O.element = r12;
                this.J2.J2(r12);
                long jNanoTime = System.nanoTime();
                final long j2 = (jNanoTime - this.f8262r.element) / 1000000;
                if (j2 > 5000 && r12.getCurrent() < r12.getMax() && this.f8261o.element < r12.getCurrent()) {
                    long remaining = ((long) SceneExporterSuspendKt.getRemaining(r12)) * j2;
                    int current = r12.getCurrent();
                    final Ref.IntRef intRef = this.f8261o;
                    final long j3 = remaining / ((long) (current - intRef.element));
                    Context context = this.f8258Z;
                    final Ref.LongRef longRef = this.f8257S;
                    XoT.C.Uo(context, new Function0() { // from class: Qk.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.Ml.xMQ(r12, intRef, j2, j3, longRef);
                        }
                    });
                    if (Math.abs(j3 - this.f8257S.element) < 40000) {
                        long j4 = j3 / ((long) 60000);
                        if (j4 < 1) {
                            str = "<1 minute left";
                        } else if (j4 == 1) {
                            str = j4 + " minute left";
                        } else {
                            str = j4 + " minutes left";
                        }
                        this.J2.nr(this.f8259g, str);
                    }
                    this.f8257S.element = j3;
                    this.f8261o.element = r12.getCurrent();
                    this.f8262r.element = jNanoTime;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: Qk.j$j, reason: collision with other inner class name */
    static final class C0287j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f8264O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f8265n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f8266t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8266t = obj;
            this.f8264O |= Integer.MIN_VALUE;
            return j.KN(null, this);
        }

        C0287j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f8267E;
        int E2;
        Object J2;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ String f8268M;
        final /* synthetic */ iF M7;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ cBL.j f8269N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f8270O;
        final /* synthetic */ UUID P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f8271S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ Scene f8272T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final /* synthetic */ String f8273U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        final /* synthetic */ ExportParams f8274X;
        final /* synthetic */ rWZ.n Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f8275Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f8276e;
        final /* synthetic */ String eF;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f8277g;
        final /* synthetic */ String jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f8278n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f8279o;
        final /* synthetic */ Si.Xo p5;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f8280r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f8281t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Activity f8282v;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class CN3 implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ GJW.Pl f8283n;

            CN3(GJW.Pl pl) {
                this.f8283n = pl;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                XoT.C.nr("Force export");
                GJW.Pl pl = this.f8283n;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(Boolean.TRUE));
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class Dsr implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ GJW.Pl f8284n;

            Dsr(GJW.Pl pl) {
                this.f8284n = pl;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                XoT.C.nr("Force GIF export");
                GJW.Pl pl = this.f8284n;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(Boolean.TRUE));
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class I28 extends SuspendLambda implements Function2 {
            final /* synthetic */ Activity J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Scene f8285O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f8286n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f8287t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            I28(Scene scene, Activity activity, Continuation continuation) {
                super(2, continuation);
                this.f8285O = scene;
                this.J2 = activity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String mUb() {
                return "PrepExport: checkCanExport OUT";
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String xMQ() {
                return "PrepExport: checkCanExport IN";
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                I28 i28 = new I28(this.f8285O, this.J2, continuation);
                i28.f8287t = obj;
                return i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8286n == 0) {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f8287t;
                    XoT.C.Uo(vdVar, new Function0() { // from class: Qk.Ml
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.n.I28.xMQ();
                        }
                    });
                    Set<ExportProblem> setCheckCanExport = SceneKt.checkCanExport(this.f8285O, new HI0.Q(this.J2));
                    XoT.C.Uo(vdVar, new Function0() { // from class: Qk.I28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.n.I28.mUb();
                        }
                    });
                    return setCheckCanExport;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class Wre extends SuspendLambda implements Function2 {
            final /* synthetic */ iF E2;
            final /* synthetic */ Activity J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ C f8288O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ cBL.j f8289S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ ExportParams f8290Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ rWZ.n f8291e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f8292g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f8293n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ File f8294o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Scene f8295r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f8296t;

            /* JADX INFO: renamed from: Qk.j$n$Wre$j, reason: collision with other inner class name */
            static final class C0288j extends SuspendLambda implements Function2 {
                final /* synthetic */ File J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Scene f8297O;

                /* JADX INFO: renamed from: S, reason: collision with root package name */
                final /* synthetic */ String f8298S;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                final /* synthetic */ C f8299Z;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ iF f8300g;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f8301n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ cBL.j f8302o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ ExportParams f8303r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Activity f8304t;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((C0288j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0288j(Activity activity, Scene scene, File file, ExportParams exportParams, cBL.j jVar, C c2, String str, iF iFVar, Continuation continuation) {
                    super(2, continuation);
                    this.f8304t = activity;
                    this.f8297O = scene;
                    this.J2 = file;
                    this.f8303r = exportParams;
                    this.f8302o = jVar;
                    this.f8299Z = c2;
                    this.f8298S = str;
                    this.f8300g = iFVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0288j(this.f8304t, this.f8297O, this.J2, this.f8303r, this.f8302o, this.f8299Z, this.f8298S, this.f8300g, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f8301n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Activity activity = this.f8304t;
                    Scene scene = this.f8297O;
                    File file = this.J2;
                    ExportParams exportParams = this.f8303r;
                    cBL.j jVar = this.f8302o;
                    C c2 = this.f8299Z;
                    String str = this.f8298S;
                    iF iFVar = this.f8300g;
                    this.f8301n = 1;
                    Object objGh = j.gh(activity, scene, file, exportParams, jVar, c2, str, iFVar, this);
                    if (objGh == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objGh;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit O(C c2, P p2, iF iFVar, rWZ.n nVar, ExportParams exportParams) {
                c2.t(null);
                cA.O(p2, "The user canceled the export", null, 2, null);
                iFVar.n(new QmE.fuX(nVar != null ? Integer.valueOf(nVar.KN()) : null, CollectionsKt.listOfNotNull(nVar != null ? nVar.T() : null)));
                iFVar.n(new j.fuX("export_user_cancel", j.Uo(exportParams)));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            Wre(C c2, Activity activity, Scene scene, File file, ExportParams exportParams, cBL.j jVar, String str, iF iFVar, rWZ.n nVar, Continuation continuation) {
                super(2, continuation);
                this.f8288O = c2;
                this.J2 = activity;
                this.f8295r = scene;
                this.f8294o = file;
                this.f8290Z = exportParams;
                this.f8289S = jVar;
                this.f8292g = str;
                this.E2 = iFVar;
                this.f8291e = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                Wre wre = new Wre(this.f8288O, this.J2, this.f8295r, this.f8294o, this.f8290Z, this.f8289S, this.f8292g, this.E2, this.f8291e, continuation);
                wre.f8296t = obj;
                return wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                P p2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f8293n;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final P pRl = GJW.C.rl((vd) this.f8296t, null, null, new C0288j(this.J2, this.f8295r, this.f8294o, this.f8290Z, this.f8289S, this.f8288O, this.f8292g, this.E2, null), 3, null);
                    final C c2 = this.f8288O;
                    final iF iFVar = this.E2;
                    final rWZ.n nVar = this.f8291e;
                    final ExportParams exportParams = this.f8290Z;
                    c2.t(new Function0() { // from class: Qk.Wre
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return j.n.Wre.O(c2, pRl, iFVar, nVar, exportParams);
                        }
                    });
                    this.f8296t = pRl;
                    this.f8293n = 1;
                    if (pRl.join(this) != coroutine_suspended) {
                        p2 = pRl;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                p2 = (P) this.f8296t;
                ResultKt.throwOnFailure(obj);
                this.f8288O.t(null);
                this.f8296t = null;
                this.f8293n = 2;
                Object objKN = j.KN(p2, this);
                return objKN == coroutine_suspended ? coroutine_suspended : objKN;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class aC implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ GJW.Pl f8305n;

            aC(GJW.Pl pl) {
                this.f8305n = pl;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                GJW.Pl pl = this.f8305n;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(Boolean.FALSE));
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class fuX implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ GJW.Pl f8306n;

            fuX(GJW.Pl pl) {
                this.f8306n = pl;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                GJW.Pl pl = this.f8306n;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(Boolean.FALSE));
            }
        }

        /* JADX INFO: renamed from: Qk.j$n$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class DialogInterfaceOnClickListenerC0289j implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ GJW.Pl f8307n;

            DialogInterfaceOnClickListenerC0289j(GJW.Pl pl) {
                this.f8307n = pl;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                GJW.Pl pl = this.f8307n;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
            }
        }

        /* JADX INFO: renamed from: Qk.j$n$n, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class C0290n extends SuspendLambda implements Function2 {
            final /* synthetic */ File J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ File f8308O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f8309n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ File f8310t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0290n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0290n(File file, File file2, File file3, Continuation continuation) {
                super(2, continuation);
                this.f8310t = file;
                this.f8308O = file2;
                this.J2 = file3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0290n(this.f8310t, this.f8308O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8309n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f8310t.mkdirs();
                    this.f8308O.delete();
                    return Boxing.boxBoolean(this.J2.delete());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        static final class w6 implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ GJW.Pl f8311n;

            w6(GJW.Pl pl) {
                this.f8311n = pl;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                GJW.Pl pl = this.f8311n;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:116:0x060a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x060b  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x063c  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0686  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x068f  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0694  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0699  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x06e4  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x06f1  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x06f8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x06fb  */
        /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0283  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0289  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x028b  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x028e  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0291  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0295  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x02d2  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x02f9  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x047d  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0499  */
        /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v32, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.coroutines.Continuation] */
        /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
            java.lang.UnsupportedOperationException
            	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r76) {
            /*
                Method dump skipped, instruction units count: 2822
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Qk.j.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        public /* synthetic */ class Ml {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ExportFormat.values().length];
                try {
                    iArr[ExportFormat.GIF.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ExportFormat.PNG_PLAIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ExportFormat.JPEG_PLAIN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ExportFormat.WEBP_PLAIN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ExportFormat.VIDEO_WEBM.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ExportFormat.VIDEO_MPEG4.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ExportFormat.VIDEO_3GPP.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ExportFormat.M4A.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ExportFormat.PNG_ZIP.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ExportFormat.JPEG_ZIP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ExportFormat.WEBP_ZIP.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ExportProblem.values().length];
                try {
                    iArr2[ExportProblem.SceneResTooHigh.ordinal()] = 1;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr2[ExportProblem.SceneResTooHighWithVideo.ordinal()] = 2;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr2[ExportProblem.ContentResTooHigh.ordinal()] = 3;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr2[ExportProblem.ContentTooHeavy.ordinal()] = 4;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr2[ExportProblem.MissingOrErrorContent.ordinal()] = 5;
                } catch (NoSuchFieldError unused16) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, ExportParams exportParams, Scene scene, cBL.j jVar, Activity activity, rWZ.n nVar, String str2, String str3, UUID uuid, iF iFVar, Si.Xo xo, String str4, boolean z2, String str5, Continuation continuation) {
            super(1, continuation);
            this.f8276e = str;
            this.f8274X = exportParams;
            this.f8272T = scene;
            this.f8269N = jVar;
            this.f8282v = activity;
            this.Xw = nVar;
            this.jB = str2;
            this.f8273U = str3;
            this.P5 = uuid;
            this.M7 = iFVar;
            this.p5 = xo;
            this.eF = str4;
            this.f8267E = z2;
            this.f8268M = str5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String gh(Set set) {
            return "PrepExport: exportProblems=" + set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String mUb(String str) {
            return inFlMLxL.zjGeHhhn + str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f8276e, this.f8274X, this.f8272T, this.f8269N, this.f8282v, this.Xw, this.jB, this.f8273U, this.P5, this.M7, this.p5, this.eF, this.f8267E, this.f8268M, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        long f8312O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f8313n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f8314r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f8315t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f8314r |= Integer.MIN_VALUE;
            return j.gh(null, null, null, null, null, null, null, null, this);
        }

        w6(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object KN(P p2, Continuation continuation) {
        C0287j c0287j;
        if (continuation instanceof C0287j) {
            c0287j = (C0287j) continuation;
            int i2 = c0287j.f8264O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0287j.f8264O = i2 - Integer.MIN_VALUE;
            } else {
                c0287j = new C0287j(continuation);
            }
        }
        Object obj = c0287j.f8266t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0287j.f8264O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            c0287j.f8265n = p2;
            c0287j.f8264O = 1;
            if (p2.join(c0287j) != coroutine_suspended) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        p2 = (P) c0287j.f8265n;
        ResultKt.throwOnFailure(obj);
        if (p2.isCancelled()) {
            return null;
        }
        c0287j.f8265n = null;
        c0287j.f8264O = 2;
        Object objAwait = p2.await(c0287j);
        return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle Uo(ExportParams exportParams) {
        Bundle bundle = new Bundle();
        bundle.putString("content_type", exportParams.getFormat().name());
        bundle.putInt("fphs", exportParams.getFphs());
        bundle.putInt("width", exportParams.getWidth());
        bundle.putInt("height", exportParams.getHeight());
        bundle.putInt("video_bitrate", exportParams.getVideoBitrate());
        bundle.putInt("audio_bitrate", exportParams.getAudioBitrate());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u az(boolean z2, Scene scene) {
        return z2 ? u.J2 : scene.getWidth() < scene.getHeight() ? u.f8338t : com.alightcreative.app.motion.persist.j.INSTANCE.getWmPosition() == j.Xo.f45843n ? u.f8335n : u.f8334O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.alightcreative.app.motion.scene.ExportProgress] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object gh(Context context, Scene scene, File file, ExportParams exportParams, cBL.j jVar, C c2, String str, iF iFVar, Continuation continuation) {
        w6 w6Var;
        PowerManager.WakeLock wakeLock;
        long j2;
        Ref.ObjectRef objectRef;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f8314r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f8314r = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        w6 w6Var2 = w6Var;
        Object objExportScene = w6Var2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var2.f8314r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objExportScene);
            SceneExporterKt.lockForExport();
            try {
                PowerManager.WakeLock wakeLockNewWakeLock = HI0.afx.qie(context).newWakeLock(1, "AlightMotion::Export");
                wakeLockNewWakeLock.acquire();
                try {
                    long jNanoTime = System.nanoTime();
                    Ref.LongRef longRef = new Ref.LongRef();
                    longRef.element = System.nanoTime();
                    Ref.IntRef intRef = new Ref.IntRef();
                    Ref.LongRef longRef2 = new Ref.LongRef();
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = ExportProgress.INSTANCE.getZERO();
                    Ml ml = new Ml(objectRef2, c2, longRef, intRef, context, longRef2, str, null);
                    w6Var2.f8313n = wakeLockNewWakeLock;
                    w6Var2.f8315t = objectRef2;
                    w6Var2.f8312O = jNanoTime;
                    w6Var2.f8314r = 1;
                    objExportScene = SceneExporterSuspendKt.exportScene(context, iFVar, scene, file, exportParams, jVar, ml, w6Var2);
                    if (objExportScene == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    wakeLock = wakeLockNewWakeLock;
                    j2 = jNanoTime;
                    objectRef = objectRef2;
                } catch (Throwable th) {
                    th = th;
                    wakeLock = wakeLockNewWakeLock;
                    wakeLock.release();
                    throw th;
                }
            } finally {
                SceneExporterKt.unlockForExport();
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = w6Var2.f8312O;
            objectRef = (Ref.ObjectRef) w6Var2.f8315t;
            wakeLock = (PowerManager.WakeLock) w6Var2.f8313n;
            try {
                ResultKt.throwOnFailure(objExportScene);
            } catch (Throwable th2) {
                th = th2;
                wakeLock.release();
                throw th;
            }
        }
        o oVar = new o((ExportOutcome) objExportScene, (ExportProgress) objectRef.element, (System.nanoTime() - j2) / ((long) 1000000));
        wakeLock.release();
        return oVar;
    }

    public static final Object xMQ(Activity activity, Scene scene, Si.Xo xo, UUID uuid, ExportParams exportParams, String str, String str2, String str3, String str4, String str5, iF iFVar, cBL.j jVar, rWZ.n nVar, boolean z2, Continuation continuation) {
        return HI0.Ml.ck(activity, new n(str, exportParams, scene, jVar, activity, nVar, str2, str4, uuid, iFVar, xo, str5, z2, str3, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qie(Scene scene, ExportParams exportParams, u uVar) {
        byte[] bArrAz = gnv.az(SceneKt.getSha1(scene) + exportParams + uVar);
        Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
        return gnv.o(bArrAz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ty(ExportParams exportParams, int i2) {
        if (exportParams.getFormat() != ExportFormat.GIF) {
            return false;
        }
        if (Math.min(exportParams.getHeight(), exportParams.getWidth()) <= 640 && exportParams.getFphs() <= 3100 && i2 <= 20000) {
            return false;
        }
        return true;
    }
}
