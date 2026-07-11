package nz;

import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class o {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ aC f71300O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71301n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Animatable f71302t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Animatable animatable, aC aCVar, Continuation continuation) {
            super(2, continuation);
            this.f71302t = animatable;
            this.f71300O = aCVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f71302t, this.f71300O, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
        
            if (androidx.compose.animation.core.Animatable.J2(r1, r2, r10, null, null, r9, 12, null) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71301n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = this.f71302t;
                Float fBoxFloat = Boxing.boxFloat(0.0f);
                this.f71301n = 1;
                if (animatable.XQ(fBoxFloat, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (this.f71300O.rl() == null) {
                return Unit.INSTANCE;
            }
            Animatable animatable2 = this.f71302t;
            Float fBoxFloat2 = Boxing.boxFloat(1.0f);
            TweenSpec tweenSpecTy = AnimationSpecKt.ty((int) Duration.m1663getInWholeMillisecondsimpl(this.f71300O.rl().getRawValue()), 0, EasingKt.O(), 2, null);
            this.f71301n = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final aC config, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier2;
        boolean zT2;
        Object objIF;
        Animatable animatable;
        boolean zE2;
        Object objIF2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iT;
        int i7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(config, "config");
        Composer composerKN = composer.KN(-437098499);
        int i8 = 4;
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(config) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i5 & 19) == 18 || !composerKN.xMQ()) {
                if (i9 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-437098499, i5, -1, "com.alightcreative.app.motion.activities.main.templatepreview.composables.ProgressSteps (ProgressSteps.kt:26)");
                }
                int iN2 = config.n();
                composerKN.eF(1499813471);
                zT2 = composerKN.t(iN2);
                objIF = composerKN.iF();
                if (!zT2 || objIF == Composer.INSTANCE.n()) {
                    objIF = AnimatableKt.rl(0.0f, 0.0f, 2, null);
                    composerKN.o(objIF);
                }
                animatable = (Animatable) objIF;
                composerKN.Xw();
                Integer numValueOf = Integer.valueOf(config.n());
                Duration durationRl = config.rl();
                composerKN.eF(1499817248);
                int i10 = 0;
                zE2 = ((i5 & 14) != 4) | composerKN.E2(animatable);
                objIF2 = composerKN.iF();
                if (!zE2 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new j(animatable, config, null);
                    composerKN.o(objIF2);
                }
                composerKN.Xw();
                EffectsKt.nr(numValueOf, durationRl, (Function2) objIF2, composerKN, 0);
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(7));
                Modifier modifierKN = SizeKt.KN(modifier2, 0.0f, 1, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalTy, Alignment.INSTANCE.qie(), composerKN, 6);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 function0N = companion.n();
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
                Updater.O(composerN, measurePolicyRl, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                composerKN.eF(1348042693);
                iT = config.t();
                i7 = 0;
                while (i7 < iT) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierXMQ = SizeKt.xMQ(RowScope.rl(rowScopeInstance, companion2, 1.0f, false, 2, null), Dp.KN(i8));
                    Color.Companion companion3 = Color.INSTANCE;
                    Modifier modifierN = ClipKt.n(BackgroundKt.nr(modifierXMQ, Color.az(companion3.KN(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), RoundedCornerShapeKt.n(100));
                    MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composerKN, i10);
                    int iN3 = ComposablesKt.n(composerKN, i10);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion4.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.s7N(function0N2);
                    } else {
                        composerKN.r();
                    }
                    Composer composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyRl2, companion4.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                    Function2 function2Rl2 = companion4.rl();
                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN3))) {
                        composerN2.o(Integer.valueOf(iN3));
                        composerN2.az(Integer.valueOf(iN3), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion4.nr());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                    BoxKt.n(SizeKt.Uo(SizeKt.nr(BackgroundKt.t(companion2, companion3.KN(), RoundedCornerShapeKt.n(100)), 0.0f, 1, null), i7 < config.n() ? 1.0f : i7 == config.n() ? ((Number) animatable.ty()).floatValue() : 0.0f), composerKN, 0);
                    composerKN.XQ();
                    i7++;
                    i10 = 0;
                    i8 = 4;
                }
                composerKN.Xw();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: nz.C
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return o.t(config, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i5 & 19) == 18) {
            if (i9 != 0) {
            }
            if (ComposerKt.v()) {
            }
            int iN22 = config.n();
            composerKN.eF(1499813471);
            zT2 = composerKN.t(iN22);
            objIF = composerKN.iF();
            if (!zT2) {
                objIF = AnimatableKt.rl(0.0f, 0.0f, 2, null);
                composerKN.o(objIF);
                animatable = (Animatable) objIF;
                composerKN.Xw();
                Integer numValueOf2 = Integer.valueOf(config.n());
                Duration durationRl2 = config.rl();
                composerKN.eF(1499817248);
                int i102 = 0;
                zE2 = ((i5 & 14) != 4) | composerKN.E2(animatable);
                objIF2 = composerKN.iF();
                if (!zE2) {
                    objIF2 = new j(animatable, config, null);
                    composerKN.o(objIF2);
                    composerKN.Xw();
                    EffectsKt.nr(numValueOf2, durationRl2, (Function2) objIF2, composerKN, 0);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalTy2 = Arrangement.f17400n.ty(Dp.KN(7));
                    Modifier modifierKN2 = SizeKt.KN(modifier2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRl3 = RowKt.rl(horizontalOrVerticalTy2, Alignment.INSTANCE.qie(), composerKN, 6);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                    Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierKN2);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0 function0N3 = companion5.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyRl3, companion5.t());
                    Updater.O(composerN, compositionLocalMapIk3, companion5.O());
                    function2Rl = companion5.rl();
                    if (!composerN.getInserting()) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                        Updater.O(composerN, modifierO3, companion5.nr());
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.f17780n;
                        composerKN.eF(1348042693);
                        iT = config.t();
                        i7 = 0;
                        while (i7 < iT) {
                        }
                        composerKN.Xw();
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(aC aCVar, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        rl(aCVar, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
