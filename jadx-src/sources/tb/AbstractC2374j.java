package tb;

import DSG.Wre;
import GJW.C;
import GJW.RzR;
import GJW.vd;
import K0.fuX;
import TFv.CN3;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.compose.FlowExtKt;
import bH.CN3;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tb.AbstractC2374j;
import x0X.n;

/* JADX INFO: renamed from: tb.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC2374j {

    /* JADX INFO: renamed from: tb.j$I28 */
    static final class I28 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ K0.Wre f73474n;

        /* JADX INFO: renamed from: tb.j$I28$j, reason: collision with other inner class name */
        static final class C1181j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ K0.Wre f73475O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73476n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ boolean f73477t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1181j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1181j(boolean z2, K0.Wre wre, Continuation continuation) {
                super(2, continuation);
                this.f73477t = z2;
                this.f73475O = wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1181j(this.f73477t, this.f73475O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73476n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (this.f73477t) {
                        str = "{tos}Terms Of Service{/tos} is a clickable link!\nEffective Date: %1$s";
                    } else {
                        str = null;
                    }
                    K0.Wre wre = this.f73475O;
                    this.f73476n = 1;
                    if (wre.O(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: tb.j$I28$n */
        public static final class n implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f73478n;

            /* JADX INFO: renamed from: tb.j$I28$n$j, reason: collision with other inner class name */
            public static final class C1182j implements CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ CN3 f73479n;

                /* JADX INFO: renamed from: tb.j$I28$n$j$j, reason: collision with other inner class name */
                public static final class C1183j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f73481n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f73482t;

                    public C1183j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f73481n = obj;
                        this.f73482t |= Integer.MIN_VALUE;
                        return C1182j.this.rl(null, this);
                    }
                }

                public C1182j(CN3 cn3) {
                    this.f73479n = cn3;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C1183j c1183j;
                    if (continuation instanceof C1183j) {
                        c1183j = (C1183j) continuation;
                        int i2 = c1183j.f73482t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c1183j.f73482t = i2 - Integer.MIN_VALUE;
                        } else {
                            c1183j = new C1183j(continuation);
                        }
                    }
                    Object obj2 = c1183j.f73481n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c1183j.f73482t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        CN3 cn3 = this.f73479n;
                        Boolean boolBoxBoolean = Boxing.boxBoolean(((String) obj) != null);
                        c1183j.f73482t = 1;
                        if (cn3.rl(boolBoxBoolean, c1183j) == coroutine_suspended) {
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

            public n(TFv.Wre wre) {
                this.f73478n = wre;
            }

            @Override // TFv.Wre
            public Object n(CN3 cn3, Continuation continuation) {
                Object objN = this.f73478n.n(new C1182j(cn3), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        I28(K0.Wre wre) {
            this.f73474n = wre;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(K0.Wre wre, boolean z2) {
            C.nr(RzR.f3449n, null, null, new C1181j(z2, wre, null), 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1641746332, i2, -1, "com.bendingspoons.legal.secretmenu.registerLegalItems.<anonymous> (LegalSecretMenuItemsProvider.kt:100)");
            }
            State stateRl = FlowExtKt.rl(new n(this.f73474n.Uo()), Boolean.FALSE, null, null, null, composer, 48, 14);
            Modifier modifierXMQ = PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(2));
            boolean zT2 = t(stateRl);
            composer.eF(-109138149);
            boolean zE2 = composer.E2(this.f73474n);
            final K0.Wre wre = this.f73474n;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: tb.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC2374j.I28.nr(wre, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            SwitchKt.n(zT2, (Function1) objIF, modifierXMQ, null, false, null, null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, b.f61769v);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        private static final boolean t(State state) {
            return ((Boolean) state.getValue()).booleanValue();
        }
    }

    /* JADX INFO: renamed from: tb.j$Ml */
    static final class Ml implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ K0.Wre f73483n;

        /* JADX INFO: renamed from: tb.j$Ml$j, reason: collision with other inner class name */
        static final class C1184j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f73484O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73485n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ K0.Wre f73486t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1184j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1184j(K0.Wre wre, boolean z2, Continuation continuation) {
                super(2, continuation);
                this.f73486t = wre;
                this.f73484O = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1184j(this.f73486t, this.f73484O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73485n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    K0.Wre wre = this.f73486t;
                    boolean z2 = this.f73484O;
                    this.f73485n = 1;
                    if (wre.J2(z2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        Ml(K0.Wre wre) {
            this.f73483n = wre;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(K0.Wre wre, boolean z2) {
            C.nr(RzR.f3449n, null, null, new C1184j(wre, z2, null), 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1505719035, i2, -1, "com.bendingspoons.legal.secretmenu.registerLegalItems.<anonymous> (LegalSecretMenuItemsProvider.kt:84)");
            }
            State stateRl = FlowExtKt.rl(this.f73483n.t(), Boolean.FALSE, null, null, null, composer, 48, 14);
            Modifier modifierXMQ = PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(2));
            boolean zT2 = t(stateRl);
            composer.eF(-109166152);
            boolean zE2 = composer.E2(this.f73483n);
            final K0.Wre wre = this.f73483n;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: tb.w6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC2374j.Ml.nr(wre, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            SwitchKt.n(zT2, (Function1) objIF, modifierXMQ, null, false, null, null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, b.f61769v);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        private static final boolean t(State state) {
            return ((Boolean) state.getValue()).booleanValue();
        }
    }

    /* JADX INFO: renamed from: tb.j$Wre */
    static final class Wre extends SuspendLambda implements Function1 {
        final /* synthetic */ nKt.n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f73487O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73488n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function2 f73489t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Function2 function2, fuX fux, Context context, nKt.n nVar, Continuation continuation) {
            super(1, continuation);
            this.f73489t = function2;
            this.f73487O = context;
            this.J2 = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Wre(this.f73489t, null, this.f73487O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Kz.n nVarRl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f73488n == 0) {
                ResultKt.throwOnFailure(obj);
                new kHp.w6(this.f73489t, false, 2, null).t();
                Toast.makeText(this.f73487O, "First party analytics tracking disabled.", 0).show();
                nKt.n nVar = this.J2;
                if (nVar != null && (nVarRl = nVar.rl()) != null) {
                    nVarRl.rl();
                }
                return Wre.j.EnumC0054j.f1446O;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: tb.j$j, reason: collision with other inner class name */
    static final class C1185j extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f73490O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73491n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ K0.n f73492t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1185j(K0.n nVar, Context context, Continuation continuation) {
            super(1, continuation);
            this.f73492t = nVar;
            this.f73490O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C1185j(this.f73492t, this.f73490O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73491n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                K0.n nVar = this.f73492t;
                this.f73491n = 1;
                obj = nVar.nr(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar2 = (x0X.n) obj;
            Context context = this.f73490O;
            boolean z2 = nVar2 instanceof n.C1266n;
            if (z2) {
                Toast.makeText(context, "Error: " + ((Ds.j) ((n.C1266n) nVar2).n()) + ".", 0).show();
            } else if (!(nVar2 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context2 = this.f73490O;
            if (!z2) {
                if (nVar2 instanceof n.w6) {
                    Toast.makeText(context2, "Success.", 0).show();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Wre.j.EnumC0054j.f1447n;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C1185j) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: tb.j$n */
    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f73493O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73494n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ K0.n f73495t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(K0.n nVar, Context context, Continuation continuation) {
            super(1, continuation);
            this.f73495t = nVar;
            this.f73493O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f73495t, this.f73493O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73494n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                K0.n nVar = this.f73495t;
                this.f73494n = 1;
                obj = nVar.rl(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar2 = (x0X.n) obj;
            Context context = this.f73493O;
            boolean z2 = nVar2 instanceof n.C1266n;
            if (z2) {
                Toast.makeText(context, "Error: " + ((Ds.j) ((n.C1266n) nVar2).n()) + ".", 0).show();
            } else if (!(nVar2 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context2 = this.f73493O;
            if (!z2) {
                if (nVar2 instanceof n.w6) {
                    Toast.makeText(context2, "Success.", 0).show();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Wre.j.EnumC0054j.f1447n;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: tb.j$w6 */
    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ K0.Wre f73496n;

        /* JADX INFO: renamed from: tb.j$w6$j, reason: collision with other inner class name */
        static final class C1186j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f73497O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73498n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ K0.Wre f73499t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1186j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1186j(K0.Wre wre, boolean z2, Continuation continuation) {
                super(2, continuation);
                this.f73499t = wre;
                this.f73497O = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1186j(this.f73499t, this.f73497O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73498n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    K0.Wre wre = this.f73499t;
                    boolean z2 = this.f73497O;
                    this.f73498n = 1;
                    if (wre.nr(z2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        w6(K0.Wre wre) {
            this.f73496n = wre;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(K0.Wre wre, boolean z2) {
            C.nr(RzR.f3449n, null, null, new C1186j(wre, z2, null), 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1369691738, i2, -1, "com.bendingspoons.legal.secretmenu.registerLegalItems.<anonymous> (LegalSecretMenuItemsProvider.kt:68)");
            }
            State stateRl = FlowExtKt.rl(this.f73496n.rl(), Boolean.FALSE, null, null, null, composer, 48, 14);
            Modifier modifierXMQ = PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(2));
            boolean zT2 = t(stateRl);
            composer.eF(-109190279);
            boolean zE2 = composer.E2(this.f73496n);
            final K0.Wre wre = this.f73496n;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: tb.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC2374j.w6.nr(wre, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            SwitchKt.n(zT2, (Function1) objIF, modifierXMQ, null, false, null, null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, b.f61769v);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        private static final boolean t(State state) {
            return ((Boolean) state.getValue()).booleanValue();
        }
    }

    public static final void n(bH.CN3 cn3, Context context, K0.n legal, Function2 trackEvent, fuX fux, nKt.n nVar, K0.Wre legalRepository) {
        Kz.n nVarRl;
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        Intrinsics.checkNotNullParameter(legalRepository, "legalRepository");
        cn3.n(CN3.I28.f43224n, new Wre.Ml("Legal", "🧽", null, CollectionsKt.listOf((Object[]) new DSG.Wre[]{new Wre.j("Clear ToS history", "🧽", null, new C1185j(legal, context, null), 4, null), new Wre.j("Clear PP history", "🧽", null, new n(legal, context, null), 4, null), new Wre.n("Force ToS update", "❗", "When enabled, a Terms of Service update will be shown the next time the app launches.", ComposableLambdaKt.rl(-1369691738, true, new w6(legalRepository))), new Wre.n("Force PN update", "❗", "When enabled, a Privacy Notice update will be shown the next time the app launches.", ComposableLambdaKt.rl(-1505719035, true, new Ml(legalRepository))), new Wre.n("Override remote ToS update message", "✍️", "When enabled, the next time a ToS update is shown, a dummy message will be provided in place of the one sent from Remote.", ComposableLambdaKt.rl(-1641746332, true, new I28(legalRepository)))}), 4, null));
        if (nVar == null || (nVarRl = nVar.rl()) == null || nVarRl.n()) {
            cn3.n(CN3.I28.f43225t, new Wre.j("Opt-out of first party analytics tracking", "🙅", null, new Wre(trackEvent, fux, context, nVar, null), 4, null));
        }
    }
}
