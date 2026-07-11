package GW;

import GJW.vd;
import GJW.yg;
import GW.l3D;
import GW.r;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.ui.compose.PlayerSurfaceKt;
import com.alightcreative.app.motion.templates.Template;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class l3D {

    static final class CN3 extends SuspendLambda implements Function2 {
        final /* synthetic */ Template J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f3622O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3623n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Dsr f3624r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f3625t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(MutableState mutableState, Function1 function1, Template template, Dsr dsr, Continuation continuation) {
            super(2, continuation);
            this.f3625t = mutableState;
            this.f3622O = function1;
            this.J2 = template;
            this.f3624r = dsr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new CN3(this.f3625t, this.f3622O, this.J2, this.f3624r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3623n == 0) {
                ResultKt.throwOnFailure(obj);
                MutableState mutableState = this.f3625t;
                Player player = (Player) this.f3622O.invoke(this.J2);
                if (player != null) {
                    player.addListener(this.f3624r);
                } else {
                    player = null;
                }
                mutableState.setValue(player);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class Dsr implements Player.Listener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f3626n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f3627t;

        Dsr(Function0 function0, MutableState mutableState) {
            this.f3626n = function0;
            this.f3627t = mutableState;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsPlayingChanged(boolean z2) {
            l3D.XQ(this.f3627t, z2);
            if (l3D.Z(this.f3627t)) {
                this.f3626n.invoke();
            }
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {
        final /* synthetic */ float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PagerState f3628O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3629n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f3630t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(MutableState mutableState, PagerState pagerState, float f3, Continuation continuation) {
            super(2, continuation);
            this.f3630t = mutableState;
            this.f3628O = pagerState;
            this.J2 = f3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new I28(this.f3630t, this.f3628O, this.J2, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        
            if (androidx.compose.foundation.gestures.ScrollExtensionsKt.n(r12, r1, r2, r11) != r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long duration;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3629n;
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
                    PagerState pagerState = this.f3628O;
                    float f3 = -this.J2;
                    TweenSpec tweenSpecTy = AnimationSpecKt.ty(500, 0, null, 6, null);
                    this.f3629n = 3;
                } else {
                    ResultKt.throwOnFailure(obj);
                    Duration.Companion companion = Duration.INSTANCE;
                    duration = DurationKt.toDuration(100, DurationUnit.MILLISECONDS);
                    this.f3629n = 2;
                    if (yg.t(duration, this) != coroutine_suspended) {
                        PagerState pagerState2 = this.f3628O;
                        float f32 = -this.J2;
                        TweenSpec tweenSpecTy2 = AnimationSpecKt.ty(500, 0, null, 6, null);
                        this.f3629n = 3;
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (((Boolean) this.f3630t.getValue()).booleanValue()) {
                    PagerState pagerState3 = this.f3628O;
                    float f4 = this.J2;
                    TweenSpec tweenSpecTy3 = AnimationSpecKt.ty(500, 0, null, 6, null);
                    this.f3629n = 1;
                    if (ScrollExtensionsKt.n(pagerState3, f4, tweenSpecTy3, this) != coroutine_suspended) {
                        Duration.Companion companion2 = Duration.INSTANCE;
                        duration = DurationKt.toDuration(100, DurationUnit.MILLISECONDS);
                        this.f3629n = 2;
                        if (yg.t(duration, this) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ MutableState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f3631O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3632n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f3633t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(MutableState mutableState, boolean z2, MutableState mutableState2, Continuation continuation) {
            super(2, continuation);
            this.f3633t = mutableState;
            this.f3631O = z2;
            this.J2 = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f3633t, this.f3631O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3632n == 0) {
                ResultKt.throwOnFailure(obj);
                MutableState mutableState = this.f3633t;
                if (l3D.qie(this.J2) && this.f3631O) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mutableState.setValue(Boxing.boxBoolean(z2));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class Wre implements Function4 {
        final /* synthetic */ MutableState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f3634O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f3635n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f3636t;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(MutableState mutableState) {
            l3D.az(mutableState, true);
            return Unit.INSTANCE;
        }

        Wre(List list, Function1 function1, Function1 function12, MutableState mutableState) {
            this.f3635n = list;
            this.f3636t = function1;
            this.f3634O = function12;
            this.J2 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            rl((PagerScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(PagerScope VerticalPager, int i2, Composer composer, int i3) {
            Intrinsics.checkNotNullParameter(VerticalPager, "$this$VerticalPager");
            if (ComposerKt.v()) {
                ComposerKt.p5(1816019701, i3, -1, "com.alightcreative.app.motion.activities.main.templatepreview.reels.ReelsPager.<anonymous> (ReelsScreen.kt:167)");
            }
            Template template = (Template) CollectionsKt.getOrNull(this.f3635n, i2);
            if (template != null) {
                Function1 function1 = this.f3636t;
                Function1 function12 = this.f3634O;
                final MutableState mutableState = this.J2;
                composer.eF(-1719061602);
                Object objIF = composer.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: GW.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l3D.Wre.t(mutableState);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                l3D.o(template, function1, function12, (Function0) objIF, SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), composer, 27648, 0);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final class fuX implements DisposableEffectResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f3637n;
        final /* synthetic */ Function1 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Dsr f3638t;

        public fuX(MutableState mutableState, Function1 function1, Dsr dsr) {
            this.f3637n = mutableState;
            this.rl = function1;
            this.f3638t = dsr;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void n() {
            Player player = (Player) this.f3637n.getValue();
            if (player != null) {
                this.rl.invoke(player);
                player.removeListener(this.f3638t);
            }
            this.f3637n.setValue(null);
        }
    }

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ PagerState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f3639O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3640n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f3641t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(MutableState mutableState, List list, PagerState pagerState, Continuation continuation) {
            super(2, continuation);
            this.f3641t = mutableState;
            this.f3639O = list;
            this.J2 = pagerState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f3641t, this.f3639O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3640n == 0) {
                ResultKt.throwOnFailure(obj);
                this.f3641t.setValue(CollectionsKt.getOrNull(this.f3639O, this.J2.S()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ MutableState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PagerState f3642O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3643n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function2 f3644r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f3645t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(List list, PagerState pagerState, MutableState mutableState, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f3645t = list;
            this.f3642O = pagerState;
            this.J2 = mutableState;
            this.f3644r = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f3645t, this.f3642O, this.J2, this.f3644r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            r.Wre wre;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3643n == 0) {
                ResultKt.throwOnFailure(obj);
                Integer numMUb = l3D.mUb(this.J2);
                if (numMUb != null) {
                    if (numMUb.intValue() < this.f3642O.S()) {
                        wre = r.Wre.f3667t;
                    } else {
                        wre = r.Wre.f3666n;
                    }
                } else {
                    wre = null;
                }
                Template template = (Template) CollectionsKt.getOrNull(this.f3645t, this.f3642O.S());
                if (template != null) {
                    this.f3644r.invoke(template.getTemplateId(), wre);
                }
                l3D.gh(this.J2, Boxing.boxInt(this.f3642O.S()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f3646O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3647n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ PagerState f3648t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(PagerState pagerState, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f3648t = pagerState;
            this.f3646O = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.f3648t, this.f3646O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3647n == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f3648t.P5() == this.f3648t.T() - 1) {
                    this.f3646O.invoke();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HI(final List list, final Integer num, final boolean z2, final boolean z3, final boolean z4, final Function0 onBackClicked, final Function1 onSaveClicked, final Function1 onUseTemplateClicked, final Function0 onSeeAllSavedClicked, final Function2 onCurrentTemplateChanged, final Function1 acquirePlayer, final Function1 releasePlayer, Modifier modifier, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object objIF;
        Composer.Companion companion;
        MutableState mutableState;
        Object objIF2;
        MutableState mutableState2;
        int iN;
        Modifier modifier2;
        Composer composerN;
        Function2 function2Rl;
        MutableState mutableState3;
        Composer composer2;
        int i15;
        Modifier modifier3;
        final MutableState mutableState4;
        Object obj;
        boolean z5;
        int i16;
        boolean z6;
        Template template;
        List<Template.Tag> listEmptyList;
        boolean z7;
        Object objIF3;
        boolean z9;
        Object objIF4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onSaveClicked, "onSaveClicked");
        Intrinsics.checkNotNullParameter(onUseTemplateClicked, "onUseTemplateClicked");
        Intrinsics.checkNotNullParameter(onSeeAllSavedClicked, "onSeeAllSavedClicked");
        Intrinsics.checkNotNullParameter(onCurrentTemplateChanged, "onCurrentTemplateChanged");
        Intrinsics.checkNotNullParameter(acquirePlayer, "acquirePlayer");
        Intrinsics.checkNotNullParameter(releasePlayer, "releasePlayer");
        Composer composerKN = composer.KN(2063373829);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.E2(list) ? 4 : 2);
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.p5(num) ? 32 : 16;
        }
        int i17 = i7;
        if ((i5 & 4) != 0) {
            i17 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i17 |= composerKN.n(z2) ? 256 : 128;
            }
            if ((i5 & 8) == 0) {
                i17 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i17 |= composerKN.n(z3) ? 2048 : 1024;
                }
                if ((i5 & 16) != 0) {
                    i17 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        i17 |= composerKN.n(z4) ? 16384 : 8192;
                    }
                    if ((i5 & 32) == 0) {
                        i17 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i17 |= composerKN.E2(onBackClicked) ? 131072 : 65536;
                    }
                    int i18 = i17;
                    if ((i5 & 64) == 0) {
                        i8 = i18 | 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i8 = i18 | (composerKN.E2(onSaveClicked) ? 1048576 : 524288);
                    } else {
                        i8 = i18;
                    }
                    if ((i5 & 128) == 0) {
                        i8 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i8 |= composerKN.E2(onUseTemplateClicked) ? 8388608 : 4194304;
                    }
                    if ((i5 & 256) == 0) {
                        i8 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i8 |= composerKN.E2(onSeeAllSavedClicked) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i5 & 512) == 0) {
                        i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i8 |= composerKN.E2(onCurrentTemplateChanged) ? 536870912 : 268435456;
                    }
                    i9 = i8;
                    if ((1024 & i5) == 0) {
                        i11 = i3 | 6;
                    } else {
                        if ((i3 & 6) != 0) {
                            i10 = i3;
                            if ((2048 & i5) != 0) {
                                i12 = i10 | 48;
                            } else if ((i3 & 48) == 0) {
                                i12 = i10 | (composerKN.E2(releasePlayer) ? 32 : 16);
                            } else {
                                i12 = i10;
                            }
                            i13 = i5 & 4096;
                            if (i13 != 0) {
                                i14 = i12 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i19 = i12;
                                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i14 = i19 | (composerKN.p5(modifier) ? 256 : 128);
                                } else {
                                    i14 = i19;
                                }
                            }
                            if ((i9 & 306783379) == 306783378 && (i14 & 147) == 146 && composerKN.xMQ()) {
                                composerKN.wTp();
                                modifier4 = modifier;
                                composer2 = composerKN;
                            } else {
                                Modifier modifier5 = i13 == 0 ? Modifier.INSTANCE : modifier;
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(2063373829, i9, i14, "com.alightcreative.app.motion.activities.main.templatepreview.reels.ReelsScreen (ReelsScreen.kt:57)");
                                }
                                composerKN.eF(943154800);
                                objIF = composerKN.iF();
                                companion = Composer.INSTANCE;
                                if (objIF != companion.n()) {
                                    objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                                    composerKN.o(objIF);
                                }
                                mutableState = (MutableState) objIF;
                                composerKN.Xw();
                                composerKN.eF(943156762);
                                objIF2 = composerKN.iF();
                                int i20 = i14;
                                if (objIF2 != companion.n()) {
                                    objIF2 = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                                    composerKN.o(objIF2);
                                }
                                mutableState2 = (MutableState) objIF2;
                                composerKN.Xw();
                                Modifier modifierNr = BackgroundKt.nr(SizeKt.J2(modifier5, 0.0f, 1, null), Color.INSTANCE.n(), null, 2, null);
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                iN = ComposablesKt.n(composerKN, 0);
                                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                modifier2 = modifier5;
                                Function0 function0N = companion2.n();
                                if (composerKN.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composerKN.T();
                                if (composerKN.getInserting()) {
                                    composerKN.r();
                                } else {
                                    composerKN.s7N(function0N);
                                }
                                composerN = Updater.n(composerKN);
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                function2Rl = companion2.rl();
                                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                composerKN.eF(871682689);
                                if (list != null || num == null) {
                                    mutableState3 = mutableState;
                                    composer2 = composerKN;
                                    i15 = 6;
                                    modifier3 = modifier2;
                                    mutableState4 = mutableState2;
                                    obj = null;
                                    z5 = false;
                                    i16 = i9;
                                    z6 = true;
                                } else {
                                    int i21 = i20 << 18;
                                    composer2 = composerKN;
                                    mutableState3 = mutableState;
                                    i15 = 6;
                                    modifier3 = modifier2;
                                    mutableState4 = mutableState2;
                                    obj = null;
                                    z5 = false;
                                    i16 = i9;
                                    z6 = true;
                                    KN(list, num.intValue(), z4, mutableState4, mutableState3, onCurrentTemplateChanged, acquirePlayer, releasePlayer, onBackClicked, null, composer2, (i9 & 14) | 27648 | (i9 & 112) | ((i9 >> 6) & 896) | ((i9 >> 12) & 458752) | (i21 & 3670016) | (i21 & 29360128) | ((i9 << 9) & 234881024), 512);
                                }
                                composer2.Xw();
                                String strT = StringResources_androidKt.t(2132020317, composer2, i15);
                                template = (Template) mutableState4.getValue();
                                if (template != null || (listEmptyList = template.getTags()) == null) {
                                    listEmptyList = CollectionsKt.emptyList();
                                }
                                boolean zBooleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
                                Modifier modifierO2 = WindowInsetsPadding_androidKt.O(PaddingKt.gh(Modifier.INSTANCE, Dp.KN(20), 0.0f, 2, obj));
                                composer2.eF(871710945);
                                z7 = (i16 & 3670016) != 1048576 ? z6 : z5;
                                objIF3 = composer2.iF();
                                if (!z7 || objIF3 == companion.n()) {
                                    objIF3 = new Function0() { // from class: GW.o
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return l3D.ck(mutableState4, onSaveClicked);
                                        }
                                    };
                                    composer2.o(objIF3);
                                }
                                Function0 function0 = (Function0) objIF3;
                                composer2.Xw();
                                composer2.eF(871713828);
                                z9 = (i16 & 29360128) != 8388608 ? z6 : z5;
                                objIF4 = composer2.iF();
                                if (!z9 || objIF4 == companion.n()) {
                                    objIF4 = new Function0() { // from class: GW.qz
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return l3D.Ik(mutableState4, onUseTemplateClicked);
                                        }
                                    };
                                    composer2.o(objIF4);
                                }
                                composer2.Xw();
                                nz.Ml.rl(strT, z2, z3, listEmptyList, onBackClicked, function0, (Function0) objIF4, onSeeAllSavedClicked, modifierO2, null, null, null, zBooleanValue, composer2, (i16 >> 3) & 29418480, 0, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK);
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier4 = modifier3;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                                scopeUpdateScopeGh.n(new Function2() { // from class: GW.Pl
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return l3D.r(list, num, z2, z3, z4, onBackClicked, onSaveClicked, onUseTemplateClicked, onSeeAllSavedClicked, onCurrentTemplateChanged, acquirePlayer, releasePlayer, modifier4, i2, i3, i5, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i11 = i3 | (composerKN.E2(acquirePlayer) ? 4 : 2);
                    }
                    i10 = i11;
                    if ((2048 & i5) != 0) {
                    }
                    i13 = i5 & 4096;
                    if (i13 != 0) {
                    }
                    if ((i9 & 306783379) == 306783378) {
                        if (i13 == 0) {
                        }
                        if (ComposerKt.v()) {
                        }
                        composerKN.eF(943154800);
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF != companion.n()) {
                        }
                        mutableState = (MutableState) objIF;
                        composerKN.Xw();
                        composerKN.eF(943156762);
                        objIF2 = composerKN.iF();
                        int i202 = i14;
                        if (objIF2 != companion.n()) {
                        }
                        mutableState2 = (MutableState) objIF2;
                        composerKN.Xw();
                        Modifier modifierNr2 = BackgroundKt.nr(SizeKt.J2(modifier5, 0.0f, 1, null), Color.INSTANCE.n(), null, 2, null);
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierNr2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        modifier2 = modifier5;
                        Function0 function0N2 = companion22.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyUo2, companion22.t());
                        Updater.O(composerN, compositionLocalMapIk2, companion22.O());
                        function2Rl = companion22.rl();
                        if (!composerN.getInserting()) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                            Updater.O(composerN, modifierO3, companion22.nr());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                            composerKN.eF(871682689);
                            if (list != null) {
                                mutableState3 = mutableState;
                                composer2 = composerKN;
                                i15 = 6;
                                modifier3 = modifier2;
                                mutableState4 = mutableState2;
                                obj = null;
                                z5 = false;
                                i16 = i9;
                                z6 = true;
                                composer2.Xw();
                                String strT2 = StringResources_androidKt.t(2132020317, composer2, i15);
                                template = (Template) mutableState4.getValue();
                                if (template != null) {
                                    listEmptyList = CollectionsKt.emptyList();
                                    boolean zBooleanValue2 = ((Boolean) mutableState3.getValue()).booleanValue();
                                    Modifier modifierO22 = WindowInsetsPadding_androidKt.O(PaddingKt.gh(Modifier.INSTANCE, Dp.KN(20), 0.0f, 2, obj));
                                    composer2.eF(871710945);
                                    if ((i16 & 3670016) != 1048576) {
                                    }
                                    objIF3 = composer2.iF();
                                    if (!z7) {
                                        objIF3 = new Function0() { // from class: GW.o
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return l3D.ck(mutableState4, onSaveClicked);
                                            }
                                        };
                                        composer2.o(objIF3);
                                        Function0 function02 = (Function0) objIF3;
                                        composer2.Xw();
                                        composer2.eF(871713828);
                                        if ((i16 & 29360128) != 8388608) {
                                        }
                                        objIF4 = composer2.iF();
                                        if (!z9) {
                                            objIF4 = new Function0() { // from class: GW.qz
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return l3D.Ik(mutableState4, onUseTemplateClicked);
                                                }
                                            };
                                            composer2.o(objIF4);
                                            composer2.Xw();
                                            nz.Ml.rl(strT2, z2, z3, listEmptyList, onBackClicked, function02, (Function0) objIF4, onSeeAllSavedClicked, modifierO22, null, null, null, zBooleanValue2, composer2, (i16 >> 3) & 29418480, 0, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK);
                                            composer2.XQ();
                                            if (ComposerKt.v()) {
                                            }
                                            modifier4 = modifier3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                if ((i5 & 32) == 0) {
                }
                int i182 = i17;
                if ((i5 & 64) == 0) {
                }
                if ((i5 & 128) == 0) {
                }
                if ((i5 & 256) == 0) {
                }
                if ((i5 & 512) == 0) {
                }
                i9 = i8;
                if ((1024 & i5) == 0) {
                }
                i10 = i11;
                if ((2048 & i5) != 0) {
                }
                i13 = i5 & 4096;
                if (i13 != 0) {
                }
                if ((i9 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            if ((i5 & 16) != 0) {
            }
            if ((i5 & 32) == 0) {
            }
            int i1822 = i17;
            if ((i5 & 64) == 0) {
            }
            if ((i5 & 128) == 0) {
            }
            if ((i5 & 256) == 0) {
            }
            if ((i5 & 512) == 0) {
            }
            i9 = i8;
            if ((1024 & i5) == 0) {
            }
            i10 = i11;
            if ((2048 & i5) != 0) {
            }
            i13 = i5 & 4096;
            if (i13 != 0) {
            }
            if ((i9 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i5 & 8) == 0) {
        }
        if ((i5 & 16) != 0) {
        }
        if ((i5 & 32) == 0) {
        }
        int i18222 = i17;
        if ((i5 & 64) == 0) {
        }
        if ((i5 & 128) == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if ((i5 & 512) == 0) {
        }
        i9 = i8;
        if ((1024 & i5) == 0) {
        }
        i10 = i11;
        if ((2048 & i5) != 0) {
        }
        i13 = i5 & 4096;
        if (i13 != 0) {
        }
        if ((i9 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void KN(final List list, final int i2, final boolean z2, final MutableState mutableState, final MutableState mutableState2, final Function2 function2, final Function1 function1, final Function1 function12, final Function0 function0, Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        int i8;
        int i9;
        Modifier modifier2;
        boolean zE2;
        Object objIF;
        PagerState pagerStateQie;
        Object objIF2;
        Composer.Companion companion;
        MutableState mutableState3;
        Object objIF3;
        MutableState mutableState4;
        float fT;
        boolean zE22;
        Object objIF4;
        boolean zP5;
        Object objIF5;
        Modifier modifier3;
        float f3;
        MutableState mutableState5;
        PagerState pagerState;
        Continuation continuation;
        int i10;
        boolean zP52;
        Object objIF6;
        boolean z3;
        Object objIF7;
        MutableState mutableState6;
        float f4;
        boolean zP53;
        Object objIF8;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1253011334);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.E2(list) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            i8 = i2;
        } else {
            i8 = i2;
            if ((i3 & 48) == 0) {
                i7 |= composerKN.t(i8) ? 32 : 16;
            }
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i7 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i7 |= composerKN.p5(mutableState) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i7 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i7 |= composerKN.p5(mutableState2) ? 16384 : 8192;
        }
        if ((i5 & 32) == 0) {
            if ((i3 & 196608) == 0) {
                i7 |= composerKN.E2(function2) ? 131072 : 65536;
            }
            if ((i5 & 64) == 0) {
                i7 |= 1572864;
            } else if ((i3 & 1572864) == 0) {
                i7 |= composerKN.E2(function1) ? 1048576 : 524288;
            }
            if ((i5 & 128) == 0) {
                i7 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                i7 |= composerKN.E2(function12) ? 8388608 : 4194304;
            }
            if ((i5 & 256) == 0) {
                i7 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                i7 |= composerKN.E2(function0) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
            }
            i9 = i5 & 512;
            if (i9 == 0) {
                i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
            } else if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                i7 |= composerKN.p5(modifier) ? 536870912 : 268435456;
            }
            if ((i7 & 306783379) == 306783378 || !composerKN.xMQ()) {
                Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier;
                if (ComposerKt.v()) {
                    modifier2 = modifier4;
                } else {
                    modifier2 = modifier4;
                    ComposerKt.p5(1253011334, i7, -1, "com.alightcreative.app.motion.activities.main.templatepreview.reels.ReelsPager (ReelsScreen.kt:110)");
                }
                composerKN.eF(1179976855);
                zE2 = composerKN.E2(list);
                objIF = composerKN.iF();
                if (!zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: GW.Xo
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(l3D.xMQ(list));
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                int i11 = i7 >> 3;
                pagerStateQie = PagerStateKt.qie(i8, 0.0f, (Function0) objIF, composerKN, i11 & 14, 2);
                composerKN.eF(1179978754);
                objIF2 = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF2 == companion.n()) {
                    objIF2 = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                    composerKN.o(objIF2);
                }
                mutableState3 = (MutableState) objIF2;
                composerKN.Xw();
                composerKN.eF(1179980867);
                objIF3 = composerKN.iF();
                if (objIF3 == companion.n()) {
                    objIF3 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                    composerKN.o(objIF3);
                }
                mutableState4 = (MutableState) objIF3;
                composerKN.Xw();
                composerKN.eF(1179983185);
                fT = WindowInsets_androidKt.t(WindowInsets.INSTANCE, composerKN, 6).t(r0) + ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(Dp.KN(150));
                composerKN.Xw();
                Integer numValueOf = Integer.valueOf(pagerStateQie.S());
                composerKN.eF(1179990484);
                zE22 = ((i7 & 7168) != 2048) | composerKN.E2(list) | composerKN.p5(pagerStateQie);
                objIF4 = composerKN.iF();
                if (!zE22 || objIF4 == companion.n()) {
                    objIF4 = new j(mutableState, list, pagerStateQie, null);
                    composerKN.o(objIF4);
                }
                composerKN.Xw();
                EffectsKt.nr(list, numValueOf, (Function2) objIF4, composerKN, i7 & 14);
                Integer numValueOf2 = Integer.valueOf(pagerStateQie.S());
                composerKN.eF(1179994915);
                zP5 = composerKN.p5(pagerStateQie) | composerKN.E2(list) | ((458752 & i7) != 131072);
                objIF5 = composerKN.iF();
                if (!zP5 || objIF5 == companion.n()) {
                    modifier3 = modifier2;
                    f3 = fT;
                    mutableState5 = mutableState4;
                    pagerState = pagerStateQie;
                    continuation = null;
                    i10 = i7;
                    n nVar = new n(list, pagerState, mutableState3, function2, null);
                    composerKN.o(nVar);
                    objIF5 = nVar;
                } else {
                    modifier3 = modifier2;
                    f3 = fT;
                    mutableState5 = mutableState4;
                    pagerState = pagerStateQie;
                    continuation = null;
                    i10 = i7;
                }
                composerKN.Xw();
                EffectsKt.O(numValueOf2, (Function2) objIF5, composerKN, 0);
                Integer numValueOf3 = Integer.valueOf(pagerState.P5());
                Integer numValueOf4 = Integer.valueOf(pagerState.T());
                composerKN.eF(1180011101);
                zP52 = composerKN.p5(pagerState) | ((234881024 & i10) != 67108864);
                objIF6 = composerKN.iF();
                if (!zP52 || objIF6 == companion.n()) {
                    objIF6 = new w6(pagerState, function0, continuation);
                    composerKN.o(objIF6);
                }
                composerKN.Xw();
                EffectsKt.nr(numValueOf3, numValueOf4, (Function2) objIF6, composerKN, 0);
                Boolean boolValueOf = Boolean.valueOf(qie(mutableState5));
                Boolean boolValueOf2 = Boolean.valueOf(z2);
                composerKN.eF(1180017047);
                int i12 = 57344 & i10;
                z3 = (i12 != 16384) | ((i10 & 896) != 256);
                objIF7 = composerKN.iF();
                if (!z3 || objIF7 == companion.n()) {
                    mutableState6 = mutableState5;
                    objIF7 = new Ml(mutableState2, z2, mutableState6, continuation);
                    composerKN.o(objIF7);
                } else {
                    mutableState6 = mutableState5;
                }
                composerKN.Xw();
                EffectsKt.nr(boolValueOf, boolValueOf2, (Function2) objIF7, composerKN, i11 & 112);
                Object value = mutableState2.getValue();
                composerKN.eF(1180021603);
                f4 = f3;
                zP53 = (i12 != 16384) | composerKN.p5(pagerState) | composerKN.rl(f4);
                objIF8 = composerKN.iF();
                if (!zP53 || objIF8 == companion.n()) {
                    objIF8 = new I28(mutableState2, pagerState, f4, continuation);
                    composerKN.o(objIF8);
                }
                composerKN.Xw();
                EffectsKt.O(value, (Function2) objIF8, composerKN, 0);
                PagerKt.t(pagerState, SizeKt.J2(modifier3, 0.0f, 1, continuation), null, null, 2, 0.0f, null, PagerDefaults.f18854n.n(pagerState, null, null, null, 0.3f, composerKN, (PagerDefaults.rl << 15) | 24576, 14), false, false, null, null, null, null, ComposableLambdaKt.nr(1816019701, true, new Wre(list, function1, function12, mutableState6), composerKN, 54), composerKN, 24576, 24576, 16236);
                composer2 = composerKN;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                modifier3 = modifier;
                composer2 = composerKN;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeGh.n(new Function2() { // from class: GW.eO
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return l3D.ty(list, i2, z2, mutableState, mutableState2, function2, function1, function12, function0, modifier5, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i7 |= 196608;
        if ((i5 & 64) == 0) {
        }
        if ((i5 & 128) == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        i9 = i5 & 512;
        if (i9 == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
            if (i9 == 0) {
            }
            if (ComposerKt.v()) {
            }
            composerKN.eF(1179976855);
            zE2 = composerKN.E2(list);
            objIF = composerKN.iF();
            if (!zE2) {
                objIF = new Function0() { // from class: GW.Xo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(l3D.xMQ(list));
                    }
                };
                composerKN.o(objIF);
                composerKN.Xw();
                int i112 = i7 >> 3;
                pagerStateQie = PagerStateKt.qie(i8, 0.0f, (Function0) objIF, composerKN, i112 & 14, 2);
                composerKN.eF(1179978754);
                objIF2 = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF2 == companion.n()) {
                }
                mutableState3 = (MutableState) objIF2;
                composerKN.Xw();
                composerKN.eF(1179980867);
                objIF3 = composerKN.iF();
                if (objIF3 == companion.n()) {
                }
                mutableState4 = (MutableState) objIF3;
                composerKN.Xw();
                composerKN.eF(1179983185);
                fT = WindowInsets_androidKt.t(WindowInsets.INSTANCE, composerKN, 6).t(r0) + ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(Dp.KN(150));
                composerKN.Xw();
                Integer numValueOf5 = Integer.valueOf(pagerStateQie.S());
                composerKN.eF(1179990484);
                zE22 = ((i7 & 7168) != 2048) | composerKN.E2(list) | composerKN.p5(pagerStateQie);
                objIF4 = composerKN.iF();
                if (!zE22) {
                    objIF4 = new j(mutableState, list, pagerStateQie, null);
                    composerKN.o(objIF4);
                    composerKN.Xw();
                    EffectsKt.nr(list, numValueOf5, (Function2) objIF4, composerKN, i7 & 14);
                    Integer numValueOf22 = Integer.valueOf(pagerStateQie.S());
                    composerKN.eF(1179994915);
                    zP5 = composerKN.p5(pagerStateQie) | composerKN.E2(list) | ((458752 & i7) != 131072);
                    objIF5 = composerKN.iF();
                    if (zP5) {
                        modifier3 = modifier2;
                        f3 = fT;
                        mutableState5 = mutableState4;
                        pagerState = pagerStateQie;
                        continuation = null;
                        i10 = i7;
                        n nVar2 = new n(list, pagerState, mutableState3, function2, null);
                        composerKN.o(nVar2);
                        objIF5 = nVar2;
                        composerKN.Xw();
                        EffectsKt.O(numValueOf22, (Function2) objIF5, composerKN, 0);
                        Integer numValueOf32 = Integer.valueOf(pagerState.P5());
                        Integer numValueOf42 = Integer.valueOf(pagerState.T());
                        composerKN.eF(1180011101);
                        zP52 = composerKN.p5(pagerState) | ((234881024 & i10) != 67108864);
                        objIF6 = composerKN.iF();
                        if (!zP52) {
                            objIF6 = new w6(pagerState, function0, continuation);
                            composerKN.o(objIF6);
                            composerKN.Xw();
                            EffectsKt.nr(numValueOf32, numValueOf42, (Function2) objIF6, composerKN, 0);
                            Boolean boolValueOf3 = Boolean.valueOf(qie(mutableState5));
                            Boolean boolValueOf22 = Boolean.valueOf(z2);
                            composerKN.eF(1180017047);
                            int i122 = 57344 & i10;
                            z3 = (i122 != 16384) | ((i10 & 896) != 256);
                            objIF7 = composerKN.iF();
                            if (z3) {
                                mutableState6 = mutableState5;
                                objIF7 = new Ml(mutableState2, z2, mutableState6, continuation);
                                composerKN.o(objIF7);
                                composerKN.Xw();
                                EffectsKt.nr(boolValueOf3, boolValueOf22, (Function2) objIF7, composerKN, i112 & 112);
                                Object value2 = mutableState2.getValue();
                                composerKN.eF(1180021603);
                                f4 = f3;
                                zP53 = (i122 != 16384) | composerKN.p5(pagerState) | composerKN.rl(f4);
                                objIF8 = composerKN.iF();
                                if (!zP53) {
                                    objIF8 = new I28(mutableState2, pagerState, f4, continuation);
                                    composerKN.o(objIF8);
                                    composerKN.Xw();
                                    EffectsKt.O(value2, (Function2) objIF8, composerKN, 0);
                                    PagerKt.t(pagerState, SizeKt.J2(modifier3, 0.0f, 1, continuation), null, null, 2, 0.0f, null, PagerDefaults.f18854n.n(pagerState, null, null, null, 0.3f, composerKN, (PagerDefaults.rl << 15) | 24576, 14), false, false, null, null, null, null, ComposableLambdaKt.nr(1816019701, true, new Wre(list, function1, function12, mutableState6), composerKN, 54), composerKN, 24576, 24576, 16236);
                                    composer2 = composerKN;
                                    if (ComposerKt.v()) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult S(MutableState mutableState, Function1 function1, Dsr dsr, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new fuX(mutableState, function1, dsr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(Template template, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        o(template, function1, function12, function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final Template template, final Function1 function1, final Function1 function12, final Function0 function0, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Function1 function13;
        int i7;
        Modifier modifier2;
        int i8;
        Object objIF;
        Composer.Companion companion;
        MutableState mutableState;
        Object objIF2;
        MutableState mutableState2;
        Object objIF3;
        Dsr dsr;
        String templateId;
        boolean zE2;
        final MutableState mutableState3;
        Object cn3;
        String str;
        MutableState mutableState4;
        final Dsr dsr2;
        boolean z2;
        Object objIF4;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Player player;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1099240238);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(template) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function13 = function1;
                i5 |= composerKN.E2(function13) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function12) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.E2(function0) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
                }
                i8 = i5;
                if ((i8 & 9363) == 9362 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier4 = modifier2;
                } else {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1099240238, i8, -1, "com.alightcreative.app.motion.activities.main.templatepreview.reels.TemplatePreviewVideo (ReelsScreen.kt:185)");
                    }
                    composerKN.eF(-1715504850);
                    objIF = composerKN.iF();
                    companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
                        composerKN.o(objIF);
                    }
                    mutableState = (MutableState) objIF;
                    composerKN.Xw();
                    composerKN.eF(-1715502810);
                    objIF2 = composerKN.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                        composerKN.o(objIF2);
                    }
                    mutableState2 = (MutableState) objIF2;
                    composerKN.Xw();
                    composerKN.eF(-1715500701);
                    objIF3 = composerKN.iF();
                    if (objIF3 == companion.n()) {
                        objIF3 = new Dsr(function0, mutableState2);
                        composerKN.o(objIF3);
                    }
                    dsr = (Dsr) objIF3;
                    composerKN.Xw();
                    templateId = template.getTemplateId();
                    composerKN.eF(-1715492338);
                    zE2 = ((i8 & 112) != 32) | composerKN.E2(template);
                    Object objIF5 = composerKN.iF();
                    if (!zE2 || objIF5 == companion.n()) {
                        mutableState3 = mutableState;
                        str = templateId;
                        mutableState4 = mutableState2;
                        Function1 function14 = function13;
                        dsr2 = dsr;
                        cn3 = new CN3(mutableState3, function14, template, dsr2, null);
                        composerKN.o(cn3);
                    } else {
                        mutableState3 = mutableState;
                        dsr2 = dsr;
                        str = templateId;
                        cn3 = objIF5;
                        mutableState4 = mutableState2;
                    }
                    composerKN.Xw();
                    EffectsKt.O(str, (Function2) cn3, composerKN, 0);
                    String templateId2 = template.getTemplateId();
                    composerKN.eF(-1715487445);
                    z2 = (i8 & 896) != 256;
                    objIF4 = composerKN.iF();
                    if (!z2 || objIF4 == companion.n()) {
                        objIF4 = new Function1() { // from class: GW.z
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return l3D.S(mutableState3, function12, dsr2, (DisposableEffectScope) obj);
                            }
                        };
                        composerKN.o(objIF4);
                    }
                    composerKN.Xw();
                    EffectsKt.rl(templateId2, (Function1) objIF4, composerKN, 0);
                    Modifier modifierJ2 = SizeKt.J2(modifier2, 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion3.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N);
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo, companion3.t());
                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                    function2Rl = companion3.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion3.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    player = (Player) mutableState3.getValue();
                    composerKN.eF(-927311649);
                    if (player != null) {
                        modifier3 = modifier2;
                    } else {
                        modifier3 = modifier2;
                        PlayerSurfaceKt.PlayerSurface(player, SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), 0, composerKN, 48, 4);
                    }
                    composerKN.Xw();
                    composerKN.eF(-927308265);
                    if (!Z(mutableState4)) {
                        ProgressIndicatorKt.nr(boxScopeInstance.n(SizeKt.Z(Modifier.INSTANCE, Dp.KN(32)), companion2.O()), ((aF1.j) composerKN.ty(aF1.w6.t())).J2(), 0.0f, 0L, 0, composerKN, 0, 28);
                        composerKN = composerKN;
                    }
                    composerKN.Xw();
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: GW.QJ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return l3D.WPU(template, function1, function12, function0, modifier4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            modifier2 = modifier;
            i8 = i5;
            if ((i8 & 9363) == 9362) {
                if (i7 != 0) {
                }
                if (ComposerKt.v()) {
                }
                composerKN.eF(-1715504850);
                objIF = composerKN.iF();
                companion = Composer.INSTANCE;
                if (objIF == companion.n()) {
                }
                mutableState = (MutableState) objIF;
                composerKN.Xw();
                composerKN.eF(-1715502810);
                objIF2 = composerKN.iF();
                if (objIF2 == companion.n()) {
                }
                mutableState2 = (MutableState) objIF2;
                composerKN.Xw();
                composerKN.eF(-1715500701);
                objIF3 = composerKN.iF();
                if (objIF3 == companion.n()) {
                }
                dsr = (Dsr) objIF3;
                composerKN.Xw();
                templateId = template.getTemplateId();
                composerKN.eF(-1715492338);
                zE2 = ((i8 & 112) != 32) | composerKN.E2(template);
                Object objIF52 = composerKN.iF();
                if (zE2) {
                    mutableState3 = mutableState;
                    str = templateId;
                    mutableState4 = mutableState2;
                    Function1 function142 = function13;
                    dsr2 = dsr;
                    cn3 = new CN3(mutableState3, function142, template, dsr2, null);
                    composerKN.o(cn3);
                    composerKN.Xw();
                    EffectsKt.O(str, (Function2) cn3, composerKN, 0);
                    String templateId22 = template.getTemplateId();
                    composerKN.eF(-1715487445);
                    if ((i8 & 896) != 256) {
                    }
                    objIF4 = composerKN.iF();
                    if (!z2) {
                        objIF4 = new Function1() { // from class: GW.z
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return l3D.S(mutableState3, function12, dsr2, (DisposableEffectScope) obj);
                            }
                        };
                        composerKN.o(objIF4);
                        composerKN.Xw();
                        EffectsKt.rl(templateId22, (Function1) objIF4, composerKN, 0);
                        Modifier modifierJ22 = SizeKt.J2(modifier2, 0.0f, 1, null);
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion22.HI(), false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierJ22);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0 function0N2 = companion32.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyUo2, companion32.t());
                        Updater.O(composerN, compositionLocalMapIk2, companion32.O());
                        function2Rl = companion32.rl();
                        if (!composerN.getInserting()) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                            Updater.O(composerN, modifierO2, companion32.nr());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                            player = (Player) mutableState3.getValue();
                            composerKN.eF(-927311649);
                            if (player != null) {
                            }
                            composerKN.Xw();
                            composerKN.eF(-927308265);
                            if (!Z(mutableState4)) {
                            }
                            composerKN.Xw();
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                        }
                    }
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function13 = function1;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        i8 = i5;
        if ((i8 & 9363) == 9362) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(List list, Integer num, boolean z2, boolean z3, boolean z4, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function2 function2, Function1 function13, Function1 function14, Modifier modifier, int i2, int i3, int i5, Composer composer, int i7) {
        HI(list, num, z2, z3, z4, function0, function1, function12, function02, function2, function13, function14, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(List list, int i2, boolean z2, MutableState mutableState, MutableState mutableState2, Function2 function2, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i3, int i5, Composer composer, int i7) {
        KN(list, i2, z2, mutableState, mutableState2, function2, function1, function12, function0, modifier, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(MutableState mutableState, Function1 function1) {
        Template template = (Template) mutableState.getValue();
        if (template != null) {
            function1.invoke(template);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XQ(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(MutableState mutableState, Function1 function1) {
        Template template = (Template) mutableState.getValue();
        if (template != null) {
            function1.invoke(template);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(MutableState mutableState, Integer num) {
        mutableState.setValue(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer mUb(MutableState mutableState) {
        return (Integer) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean qie(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int xMQ(List list) {
        return list.size() + 1;
    }
}
