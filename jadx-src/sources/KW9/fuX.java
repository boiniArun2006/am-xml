package KW9;

import DSG.Wre;
import GJW.C;
import GJW.RzR;
import GJW.vd;
import KW9.fuX;
import android.content.Context;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bH.CN3;
import com.bendingspoons.secretmenu.ui.items.exit.ExitActivity;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class fuX {

    static final class CN3 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ KW9.Wre f5429n;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ MutableState J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ KW9.Wre f5430O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f5431n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f5432t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(KW9.Wre wre, MutableState mutableState, Continuation continuation) {
                super(2, continuation);
                this.f5430O = wre;
                this.J2 = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f5430O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableState mutableState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5432t;
                if (i2 != 0) {
                    if (i2 == 1) {
                        mutableState = (MutableState) this.f5431n;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    MutableState mutableState2 = this.J2;
                    KW9.Wre wre = this.f5430O;
                    this.f5431n = mutableState2;
                    this.f5432t = 1;
                    Object objMUb = wre.mUb(this);
                    if (objMUb == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    obj = objMUb;
                }
                CN3.nr(mutableState, (String) obj);
                return Unit.INSTANCE;
            }
        }

        CN3(KW9.Wre wre) {
            this.f5429n = wre;
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
                ComposerKt.p5(1120808148, i2, -1, "com.bendingspoons.injet.utils.registerSecretMenu.<anonymous> (RegisterSecretMenu.kt:131)");
            }
            composer.eF(103249335);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O("", null, 2, null);
                composer.o(objIF);
            }
            MutableState mutableState = (MutableState) objIF;
            composer.Xw();
            Unit unit = Unit.INSTANCE;
            composer.eF(103251888);
            boolean zE2 = composer.E2(this.f5429n);
            KW9.Wre wre = this.f5429n;
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new j(wre, mutableState, null);
                composer.o(objIF2);
            }
            composer.Xw();
            EffectsKt.O(unit, (Function2) objIF2, composer, 6);
            TextKt.t(t(mutableState), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void nr(MutableState mutableState, String str) {
            mutableState.setValue(str);
        }

        private static final String t(MutableState mutableState) {
            return (String) mutableState.getValue();
        }
    }

    static final class I28 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ KW9.Wre f5433n;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ MutableState J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ KW9.Wre f5434O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f5435n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f5436t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(KW9.Wre wre, MutableState mutableState, Continuation continuation) {
                super(2, continuation);
                this.f5434O = wre;
                this.J2 = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f5434O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableState mutableState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5436t;
                if (i2 != 0) {
                    if (i2 == 1) {
                        mutableState = (MutableState) this.f5435n;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    MutableState mutableState2 = this.J2;
                    KW9.Wre wre = this.f5434O;
                    this.f5435n = mutableState2;
                    this.f5436t = 1;
                    Object objGh = wre.gh(this);
                    if (objGh == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    obj = objGh;
                }
                I28.O(mutableState, ((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        static final class n extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f5437O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5438n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ KW9.Wre f5439t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(KW9.Wre wre, boolean z2, Continuation continuation) {
                super(2, continuation);
                this.f5439t = wre;
                this.f5437O = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new n(this.f5439t, this.f5437O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5438n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    KW9.Wre wre = this.f5439t;
                    boolean z2 = this.f5437O;
                    this.f5438n = 1;
                    if (wre.Ik(z2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        I28(KW9.Wre wre) {
            this.f5433n = wre;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1178856426, i2, -1, "com.bendingspoons.injet.utils.registerSecretMenu.<anonymous> (RegisterSecretMenu.kt:101)");
            }
            composer.eF(103205338);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composer.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composer.Xw();
            Unit unit = Unit.INSTANCE;
            composer.eF(103208038);
            boolean zE2 = composer.E2(this.f5433n);
            KW9.Wre wre = this.f5433n;
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new j(wre, mutableState, null);
                composer.o(objIF2);
            }
            composer.Xw();
            EffectsKt.O(unit, (Function2) objIF2, composer, 6);
            boolean zNr = nr(mutableState);
            composer.eF(103218510);
            boolean zE22 = composer.E2(this.f5433n);
            final KW9.Wre wre2 = this.f5433n;
            Object objIF3 = composer.iF();
            if (zE22 || objIF3 == companion.n()) {
                objIF3 = new Function1() { // from class: KW9.aC
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return fuX.I28.J2(mutableState, wre2, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            SwitchKt.n(zNr, (Function1) objIF3, null, null, false, null, null, composer, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(MutableState mutableState, KW9.Wre wre, boolean z2) {
            O(mutableState, z2);
            C.nr(RzR.f3449n, null, null, new n(wre, z2, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void O(MutableState mutableState, boolean z2) {
            mutableState.setValue(Boolean.valueOf(z2));
        }

        private static final boolean nr(MutableState mutableState) {
            return ((Boolean) mutableState.getValue()).booleanValue();
        }
    }

    static final class Ml implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ KW9.Wre f5440n;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ MutableState J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ KW9.Wre f5441O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f5442n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f5443t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(KW9.Wre wre, MutableState mutableState, Continuation continuation) {
                super(2, continuation);
                this.f5441O = wre;
                this.J2 = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f5441O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableState mutableState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5443t;
                if (i2 != 0) {
                    if (i2 == 1) {
                        mutableState = (MutableState) this.f5442n;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    MutableState mutableState2 = this.J2;
                    KW9.Wre wre = this.f5441O;
                    this.f5442n = mutableState2;
                    this.f5443t = 1;
                    Object objXMQ = wre.xMQ(this);
                    if (objXMQ == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    obj = objXMQ;
                }
                Ml.nr(mutableState, (String) obj);
                return Unit.INSTANCE;
            }
        }

        Ml(KW9.Wre wre) {
            this.f5440n = wre;
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
                ComposerKt.p5(1966278583, i2, -1, "com.bendingspoons.injet.utils.registerSecretMenu.<anonymous> (RegisterSecretMenu.kt:89)");
            }
            composer.eF(103187415);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O("", null, 2, null);
                composer.o(objIF);
            }
            MutableState mutableState = (MutableState) objIF;
            composer.Xw();
            Unit unit = Unit.INSTANCE;
            composer.eF(103189956);
            boolean zE2 = composer.E2(this.f5440n);
            KW9.Wre wre = this.f5440n;
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new j(wre, mutableState, null);
                composer.o(objIF2);
            }
            composer.Xw();
            EffectsKt.O(unit, (Function2) objIF2, composer, 6);
            TextKt.t(t(mutableState), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void nr(MutableState mutableState, String str) {
            mutableState.setValue(str);
        }

        private static final String t(MutableState mutableState) {
            return (String) mutableState.getValue();
        }
    }

    static final class Wre extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5444n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f5445t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(Function0 function0, Continuation continuation) {
            super(1, continuation);
            this.f5445t = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Wre(this.f5445t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5444n == 0) {
                ResultKt.throwOnFailure(obj);
                this.f5445t.invoke();
                return Wre.j.EnumC0054j.f1449t;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ KW9.Wre f5446n;

        /* JADX INFO: renamed from: KW9.fuX$j$j, reason: collision with other inner class name */
        static final class C0180j extends SuspendLambda implements Function2 {
            final /* synthetic */ MutableState J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ KW9.Wre f5447O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f5448n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f5449t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0180j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0180j(KW9.Wre wre, MutableState mutableState, Continuation continuation) {
                super(2, continuation);
                this.f5447O = wre;
                this.J2 = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0180j(this.f5447O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableState mutableState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5449t;
                if (i2 != 0) {
                    if (i2 == 1) {
                        mutableState = (MutableState) this.f5448n;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    MutableState mutableState2 = this.J2;
                    KW9.Wre wre = this.f5447O;
                    this.f5448n = mutableState2;
                    this.f5449t = 1;
                    Object objAz = wre.az(this);
                    if (objAz == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    obj = objAz;
                }
                j.O(mutableState, ((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        static final class n extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f5450O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5451n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ KW9.Wre f5452t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(KW9.Wre wre, boolean z2, Continuation continuation) {
                super(2, continuation);
                this.f5452t = wre;
                this.f5450O = z2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new n(this.f5452t, this.f5450O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5451n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    KW9.Wre wre = this.f5452t;
                    boolean z2 = this.f5450O;
                    this.f5451n = 1;
                    if (wre.o(z2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        j(KW9.Wre wre) {
            this.f5446n = wre;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1483218278, i2, -1, "com.bendingspoons.injet.utils.registerSecretMenu.<anonymous> (RegisterSecretMenu.kt:34)");
            }
            composer.eF(103103354);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composer.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composer.Xw();
            Unit unit = Unit.INSTANCE;
            composer.eF(103105997);
            boolean zE2 = composer.E2(this.f5446n);
            KW9.Wre wre = this.f5446n;
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new C0180j(wre, mutableState, null);
                composer.o(objIF2);
            }
            composer.Xw();
            EffectsKt.O(unit, (Function2) objIF2, composer, 6);
            boolean zNr = nr(mutableState);
            composer.eF(103114329);
            boolean zE22 = composer.E2(this.f5446n);
            final KW9.Wre wre2 = this.f5446n;
            Object objIF3 = composer.iF();
            if (zE22 || objIF3 == companion.n()) {
                objIF3 = new Function1() { // from class: KW9.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return fuX.j.J2(mutableState, wre2, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            SwitchKt.n(zNr, (Function1) objIF3, null, null, false, null, null, composer, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(MutableState mutableState, KW9.Wre wre, boolean z2) {
            O(mutableState, z2);
            C.nr(RzR.f3449n, null, null, new n(wre, z2, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void O(MutableState mutableState, boolean z2) {
            mutableState.setValue(Boolean.valueOf(z2));
        }

        private static final boolean nr(MutableState mutableState) {
            return ((Boolean) mutableState.getValue()).booleanValue();
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ KW9.Wre f5453n;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ MutableState J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ KW9.Wre f5454O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f5455n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f5456t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(KW9.Wre wre, MutableState mutableState, Continuation continuation) {
                super(2, continuation);
                this.f5454O = wre;
                this.J2 = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f5454O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableState mutableState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5456t;
                if (i2 != 0) {
                    if (i2 == 1) {
                        mutableState = (MutableState) this.f5455n;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    MutableState mutableState2 = this.J2;
                    KW9.Wre wre = this.f5454O;
                    this.f5455n = mutableState2;
                    this.f5456t = 1;
                    Object objZ = wre.Z(this);
                    if (objZ == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    obj = objZ;
                }
                n.O(mutableState, ((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: KW9.fuX$n$n, reason: collision with other inner class name */
        static final class C0181n extends SuspendLambda implements Function2 {
            final /* synthetic */ Context J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f5457O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5458n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ KW9.Wre f5459t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0181n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0181n(KW9.Wre wre, boolean z2, Context context, Continuation continuation) {
                super(2, continuation);
                this.f5459t = wre;
                this.f5457O = z2;
                this.J2 = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0181n(this.f5459t, this.f5457O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5458n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    KW9.Wre wre = this.f5459t;
                    boolean z2 = this.f5457O;
                    this.f5458n = 1;
                    if (wre.r(z2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                ExitActivity.INSTANCE.n(this.J2);
                return Unit.INSTANCE;
            }
        }

        n(KW9.Wre wre) {
            this.f5453n = wre;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-333385991, i2, -1, "com.bendingspoons.injet.utils.registerSecretMenu.<anonymous> (RegisterSecretMenu.kt:54)");
            }
            composer.eF(103133210);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composer.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composer.Xw();
            Unit unit = Unit.INSTANCE;
            composer.eF(103135897);
            boolean zE2 = composer.E2(this.f5453n);
            KW9.Wre wre = this.f5453n;
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new j(wre, mutableState, null);
                composer.o(objIF2);
            }
            composer.Xw();
            EffectsKt.O(unit, (Function2) objIF2, composer, 6);
            final Context context = (Context) composer.ty(AndroidCompositionLocals_androidKt.Uo());
            boolean zNr = nr(mutableState);
            composer.eF(103147758);
            boolean zE22 = composer.E2(this.f5453n) | composer.E2(context);
            final KW9.Wre wre2 = this.f5453n;
            Object objIF3 = composer.iF();
            if (zE22 || objIF3 == companion.n()) {
                objIF3 = new Function1() { // from class: KW9.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return fuX.n.J2(mutableState, wre2, context, ((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            SwitchKt.n(zNr, (Function1) objIF3, null, null, false, null, null, composer, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(MutableState mutableState, KW9.Wre wre, Context context, boolean z2) {
            O(mutableState, z2);
            C.nr(RzR.f3449n, null, null, new C0181n(wre, z2, context, null), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void O(MutableState mutableState, boolean z2) {
            mutableState.setValue(Boolean.valueOf(z2));
        }

        private static final boolean nr(MutableState mutableState) {
            return ((Boolean) mutableState.getValue()).booleanValue();
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ KW9.Wre f5460n;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ MutableState J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ KW9.Wre f5461O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f5462n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f5463t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(KW9.Wre wre, MutableState mutableState, Continuation continuation) {
                super(2, continuation);
                this.f5461O = wre;
                this.J2 = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f5461O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MutableState mutableState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5463t;
                if (i2 != 0) {
                    if (i2 == 1) {
                        mutableState = (MutableState) this.f5462n;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    MutableState mutableState2 = this.J2;
                    KW9.Wre wre = this.f5461O;
                    this.f5462n = mutableState2;
                    this.f5463t = 1;
                    Object objQie = wre.qie(this);
                    if (objQie == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    obj = objQie;
                }
                w6.nr(mutableState, ((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        w6(KW9.Wre wre) {
            this.f5460n = wre;
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
                ComposerKt.p5(816446296, i2, -1, "com.bendingspoons.injet.utils.registerSecretMenu.<anonymous> (RegisterSecretMenu.kt:77)");
            }
            composer.eF(103169370);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composer.o(objIF);
            }
            MutableState mutableState = (MutableState) objIF;
            composer.Xw();
            Unit unit = Unit.INSTANCE;
            composer.eF(103172021);
            boolean zE2 = composer.E2(this.f5460n);
            KW9.Wre wre = this.f5460n;
            Object objIF2 = composer.iF();
            if (zE2 || objIF2 == companion.n()) {
                objIF2 = new j(wre, mutableState, null);
                composer.o(objIF2);
            }
            composer.Xw();
            EffectsKt.O(unit, (Function2) objIF2, composer, 6);
            TextKt.t(String.valueOf(t(mutableState)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void nr(MutableState mutableState, boolean z2) {
            mutableState.setValue(Boolean.valueOf(z2));
        }

        private static final boolean t(MutableState mutableState) {
            return ((Boolean) mutableState.getValue()).booleanValue();
        }
    }

    public static final void n(bH.CN3 cn3, KW9.Wre secretMenuFlags, Function0 onPresentWebApp) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(secretMenuFlags, "secretMenuFlags");
        Intrinsics.checkNotNullParameter(onPresentWebApp, "onPresentWebApp");
        cn3.n(CN3.I28.f43224n, new Wre.Ml("Injet", "\u1fa7c", null, CollectionsKt.listOf((Object[]) new DSG.Wre[]{new Wre.n("Is the WebApp testing mode visible", "🧪", "The app will restart to apply the changes", ComposableLambdaKt.rl(-1483218278, true, new j(secretMenuFlags))), new Wre.n("Force hardcoded web app", "🗃️", null, ComposableLambdaKt.rl(-333385991, true, new n(secretMenuFlags))), new Wre.n("Is showing hardcoded web app", "🗃️", null, ComposableLambdaKt.rl(816446296, true, new w6(secretMenuFlags))), new Wre.n("Current trigger", "🗃️", null, ComposableLambdaKt.rl(1966278583, true, new Ml(secretMenuFlags))), new Wre.n("Should force free trial eligibility", "🗃️", null, ComposableLambdaKt.rl(-1178856426, true, new I28(secretMenuFlags))), new Wre.j("Present Injet", "🗃️", null, new Wre(onPresentWebApp, null)), new Wre.n("Current web app version", "🗃️", null, ComposableLambdaKt.rl(1120808148, true, new CN3(secretMenuFlags)))})));
    }
}
