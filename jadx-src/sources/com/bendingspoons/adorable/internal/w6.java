package com.bendingspoons.adorable.internal;

import GJW.vd;
import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.ui.PlayerView;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleOwner;
import com.bendingspoons.adorable.internal.Ml;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {

    static final class I28 implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f51201O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f51202n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ml.j f51203t;

        static final class j implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ int f51204n;

            j(int i2) {
                this.f51204n = i2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1099658700, i2, -1, "com.bendingspoons.adorable.internal.HardcodedAdContent.<anonymous>.<anonymous>.<anonymous> (HardcodedAdContent.kt:91)");
                }
                IconKt.t(PainterResources_androidKt.t(this.f51204n, composer, 0), null, null, 0L, composer, 48, 12);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        public /* synthetic */ class n {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Ml.j.values().length];
                try {
                    iArr[Ml.j.f51194t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        I28(Function0 function0, Ml.j jVar, int i2) {
            this.f51202n = function0;
            this.f51203t = jVar;
            this.f51201O = i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(368108401, i2, -1, "com.bendingspoons.adorable.internal.HardcodedAdContent.<anonymous>.<anonymous> (HardcodedAdContent.kt:76)");
            }
            IconButtonKt.O(this.f51202n, SizeKt.Z(BackgroundKt.nr(AlphaKt.n(ClipKt.n(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(16)), RoundedCornerShapeKt.J2()), n.$EnumSwitchMapping$0[this.f51203t.ordinal()] == 1 ? 0.4f : 1.0f), Color.INSTANCE.KN(), null, 2, null), Dp.KN(32)), false, null, null, ComposableLambdaKt.nr(-1099658700, true, new j(this.f51201O), composer, 54), composer, 196608, 28);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final class Ml implements DisposableEffectResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f51205n;

        public Ml(ExoPlayer exoPlayer) {
            this.f51205n = exoPlayer;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void n() {
            this.f51205n.release();
        }
    }

    public /* synthetic */ class Wre {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class n implements DisposableEffectResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f51209n;
        final /* synthetic */ com.bendingspoons.adorable.internal.Wre rl;

        public n(ExoPlayer exoPlayer, com.bendingspoons.adorable.internal.Wre wre) {
            this.f51209n = exoPlayer;
            this.rl = wre;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void n() {
            this.f51209n.removeListener(this.rl);
        }
    }

    /* JADX INFO: renamed from: com.bendingspoons.adorable.internal.w6$w6, reason: collision with other inner class name */
    public static final class C0718w6 implements DisposableEffectResult {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LifecycleOwner f51210n;
        final /* synthetic */ LifecycleEventObserver rl;

        public C0718w6(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
            this.f51210n = lifecycleOwner;
            this.rl = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void n() {
            this.f51210n.getLifecycleRegistry().nr(this.rl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerView Ik(PlayerView playerView, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return playerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Uri uri, Modifier modifier, Function1 function1, Function0 function0, int i2, int i3, Composer composer, int i5) {
        ty(uri, modifier, function1, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit te(int i2, int i3, Ml.j jVar, Function0 function0, Function0 function02, Function0 function03, int i5, int i7, int i8, Composer composer, int i9) {
        aYN(i2, i3, jVar, function0, function02, function03, i5, composer, RecomposeScopeImplKt.n(i7 | 1), i8);
        return Unit.INSTANCE;
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Uri f51206O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51207n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ExoPlayer f51208t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ExoPlayer exoPlayer, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f51208t = exoPlayer;
            this.f51206O = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f51208t, this.f51206O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f51207n == 0) {
                ResultKt.throwOnFailure(obj);
                ExoPlayer exoPlayer = this.f51208t;
                Uri uri = this.f51206O;
                exoPlayer.setRepeatMode(0);
                exoPlayer.setPlayWhenReady(true);
                exoPlayer.setMediaItem(MediaItem.fromUri(uri));
                exoPlayer.prepare();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(PlaybackException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult XQ(ExoPlayer exoPlayer, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new Ml(exoPlayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult Z(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        lifecycleOwner.getLifecycleRegistry().n(lifecycleEventObserver);
        return new C0718w6(lifecycleOwner, lifecycleEventObserver);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void aYN(final int i2, final int i3, final Ml.j closeButtonState, final Function0 onCloseClicked, final Function0 onPlaybackCompleted, final Function0 onAdClicked, int i5, Composer composer, final int i7, final int i8) {
        int i9;
        int i10;
        int i11;
        final int i12;
        boolean z2;
        Object objIF;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Modifier.Companion companion;
        float f3;
        boolean z3;
        Object objIF2;
        boolean z4;
        Object objIF3;
        final int i13;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(closeButtonState, "closeButtonState");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(onPlaybackCompleted, "onPlaybackCompleted");
        Intrinsics.checkNotNullParameter(onAdClicked, "onAdClicked");
        Composer composerKN = composer.KN(172525071);
        if ((i8 & 1) != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = (composerKN.t(i2) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i7 & 48) == 0) {
            i9 |= composerKN.t(i3) ? 32 : 16;
        }
        if ((i8 & 4) != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= composerKN.p5(closeButtonState) ? 256 : 128;
        }
        if ((i8 & 8) != 0) {
            i9 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i9 |= composerKN.E2(onCloseClicked) ? 2048 : 1024;
        }
        if ((i8 & 16) != 0) {
            i9 |= 24576;
        } else if ((i7 & 24576) == 0) {
            i9 |= composerKN.E2(onPlaybackCompleted) ? 16384 : 8192;
        }
        if ((i8 & 32) != 0) {
            i9 |= 196608;
        } else if ((i7 & 196608) == 0) {
            i9 |= composerKN.E2(onAdClicked) ? 131072 : 65536;
        }
        int i14 = i8 & 64;
        if (i14 == 0) {
            if ((1572864 & i7) == 0) {
                i10 = i5;
                i9 |= composerKN.t(i10) ? 1048576 : 524288;
            }
            i11 = i9;
            if ((599187 & i11) == 599186 || !composerKN.xMQ()) {
                i12 = i14 == 0 ? 400 : i10;
                if (ComposerKt.v()) {
                    ComposerKt.p5(172525071, i11, -1, "com.bendingspoons.adorable.internal.HardcodedAdContent (HardcodedAdContent.kt:57)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierJ2 = SizeKt.J2(companion2, 0.0f, 1, null);
                composerKN.eF(578732590);
                z2 = (458752 & i11) != 131072;
                objIF = composerKN.iF();
                if (!z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: gp.Wre
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return com.bendingspoons.adorable.internal.w6.ViF(onAdClicked);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                Modifier modifierJ22 = ClickableKt.J2(modifierJ2, false, null, null, (Function0) objIF, 7, null);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.O(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ22);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion4.n();
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
                Updater.O(composerN, measurePolicyUo, companion4.t());
                Updater.O(composerN, compositionLocalMapIk, companion4.O());
                function2Rl = companion4.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion4.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                composerKN.eF(-1453069463);
                if (i2 == -1) {
                    Uri uriBuildRawResourceUri = RawResourceDataSource.buildRawResourceUri(i2);
                    Intrinsics.checkNotNullExpressionValue(uriBuildRawResourceUri, "buildRawResourceUri(...)");
                    companion = companion2;
                    f3 = 0.0f;
                    ty(uriBuildRawResourceUri, null, null, onPlaybackCompleted, composerKN, (i11 >> 3) & 7168, 6);
                } else {
                    companion = companion2;
                    f3 = 0.0f;
                }
                composerKN.Xw();
                boolean z5 = closeButtonState == Ml.j.f51191O;
                composerKN.eF(-1453058322);
                int i15 = 3670016 & i11;
                z3 = i15 != 1048576;
                objIF2 = composerKN.iF();
                if (!z3 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function1() { // from class: gp.aC
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return com.bendingspoons.adorable.internal.w6.nY(i12, (KeyframesSpec.KeyframesSpecConfig) obj);
                        }
                    };
                    composerKN.o(objIF2);
                }
                composerKN.Xw();
                EnterTransition enterTransitionHI = EnterExitTransitionKt.HI(AnimationSpecKt.J2((Function1) objIF2), f3, 2, null);
                composerKN.eF(-1453055442);
                z4 = i15 != 1048576;
                objIF3 = composerKN.iF();
                if (!z4 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Function1() { // from class: gp.C
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return com.bendingspoons.adorable.internal.w6.g(i12, (KeyframesSpec.KeyframesSpecConfig) obj);
                        }
                    };
                    composerKN.o(objIF3);
                }
                composerKN.Xw();
                int i16 = i12;
                AnimatedVisibilityKt.mUb(z5, boxScopeInstance.n(companion, companion3.ty()), enterTransitionHI, EnterExitTransitionKt.Ik(AnimationSpecKt.J2((Function1) objIF3), f3, 2, null), null, ComposableLambdaKt.nr(368108401, true, new I28(onCloseClicked, closeButtonState, i3), composerKN, 54), composerKN, 196608, 16);
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                i13 = i16;
            } else {
                composerKN.wTp();
                i13 = i10;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: gp.o
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return com.bendingspoons.adorable.internal.w6.te(i2, i3, closeButtonState, onCloseClicked, onPlaybackCompleted, onAdClicked, i13, i7, i8, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i9 |= 1572864;
        i10 = i5;
        i11 = i9;
        if ((599187 & i11) == 599186) {
            if (i14 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier.Companion companion22 = Modifier.INSTANCE;
            Modifier modifierJ23 = SizeKt.J2(companion22, 0.0f, 1, null);
            composerKN.eF(578732590);
            if ((458752 & i11) != 131072) {
            }
            objIF = composerKN.iF();
            if (!z2) {
                objIF = new Function0() { // from class: gp.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.bendingspoons.adorable.internal.w6.ViF(onAdClicked);
                    }
                };
                composerKN.o(objIF);
                composerKN.Xw();
                Modifier modifierJ222 = ClickableKt.J2(modifierJ23, false, null, null, (Function0) objIF, 7, null);
                Alignment.Companion companion32 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion32.O(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierJ222);
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0 function0N2 = companion42.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyUo2, companion42.t());
                Updater.O(composerN, compositionLocalMapIk2, companion42.O());
                function2Rl = companion42.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO2, companion42.nr());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    composerKN.eF(-1453069463);
                    if (i2 == -1) {
                    }
                    composerKN.Xw();
                    if (closeButtonState == Ml.j.f51191O) {
                    }
                    composerKN.eF(-1453058322);
                    int i152 = 3670016 & i11;
                    if (i152 != 1048576) {
                    }
                    objIF2 = composerKN.iF();
                    if (!z3) {
                        objIF2 = new Function1() { // from class: gp.aC
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return com.bendingspoons.adorable.internal.w6.nY(i12, (KeyframesSpec.KeyframesSpecConfig) obj);
                            }
                        };
                        composerKN.o(objIF2);
                        composerKN.Xw();
                        EnterTransition enterTransitionHI2 = EnterExitTransitionKt.HI(AnimationSpecKt.J2((Function1) objIF2), f3, 2, null);
                        composerKN.eF(-1453055442);
                        if (i152 != 1048576) {
                        }
                        objIF3 = composerKN.iF();
                        if (!z4) {
                            objIF3 = new Function1() { // from class: gp.C
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return com.bendingspoons.adorable.internal.w6.g(i12, (KeyframesSpec.KeyframesSpecConfig) obj);
                                }
                            };
                            composerKN.o(objIF3);
                            composerKN.Xw();
                            int i162 = i12;
                            AnimatedVisibilityKt.mUb(z5, boxScopeInstance2.n(companion, companion32.ty()), enterTransitionHI2, EnterExitTransitionKt.Ik(AnimationSpecKt.J2((Function1) objIF3), f3, 2, null), null, ComposableLambdaKt.nr(368108401, true, new I28(onCloseClicked, closeButtonState, i3), composerKN, 54), composerKN, 196608, 16);
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                            }
                            i13 = i162;
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
    public static final DisposableEffectResult ck(Function1 function1, Function0 function0, ExoPlayer exoPlayer, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        com.bendingspoons.adorable.internal.Wre wre = new com.bendingspoons.adorable.internal.Wre(function1, function0);
        exoPlayer.addListener(wre);
        return new n(exoPlayer, wre);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(int i2, KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.nr(i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nY(int i2, KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.nr(i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ExoPlayer exoPlayer, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = Wre.$EnumSwitchMapping$0[event.ordinal()];
        if (i2 == 1) {
            exoPlayer.pause();
        } else {
            if (i2 != 2) {
                return;
            }
            exoPlayer.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(PlayerView playerView, ExoPlayer exoPlayer, PlayerView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        playerView.setPlayer(exoPlayer);
        playerView.setUseController(false);
        playerView.setControllerAutoShow(false);
        playerView.setResizeMode(0);
        playerView.setShowBuffering(2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ty(final Uri uri, Modifier modifier, Function1 function1, Function0 function0, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        Function1 function12;
        int i8;
        final Function0 function02;
        final Function1 function13;
        Context context;
        final LifecycleOwner lifecycleOwner;
        boolean zP5;
        Object objIF;
        final ExoPlayer exoPlayer;
        boolean zE2;
        Object objIF2;
        boolean zE22;
        Object objIF3;
        boolean zP52;
        Object objIF4;
        final PlayerView playerView;
        boolean zE23;
        Object objIF5;
        boolean zE24;
        Object objIF6;
        boolean zP53;
        Object objIF7;
        final LifecycleEventObserver lifecycleEventObserver;
        boolean zE25;
        Object objIF8;
        boolean zE26;
        Object objIF9;
        final Modifier modifier3;
        final Function1 function14;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-2008542721);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(uri) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function12 = function1;
                    i5 |= composerKN.E2(function12) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 == 0) {
                    if ((i2 & 3072) == 0) {
                        function02 = function0;
                        i5 |= composerKN.E2(function02) ? 2048 : 1024;
                    }
                    if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 == 0) {
                            composerKN.eF(1488349427);
                            Object objIF10 = composerKN.iF();
                            if (objIF10 == Composer.INSTANCE.n()) {
                                objIF10 = new Function1() { // from class: gp.qz
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return com.bendingspoons.adorable.internal.w6.WPU((PlaybackException) obj);
                                    }
                                };
                                composerKN.o(objIF10);
                            }
                            composerKN.Xw();
                            function13 = (Function1) objIF10;
                        } else {
                            function13 = function12;
                        }
                        if (i8 != 0) {
                            composerKN.eF(1488350771);
                            Object objIF11 = composerKN.iF();
                            if (objIF11 == Composer.INSTANCE.n()) {
                                objIF11 = new Function0() { // from class: gp.Pl
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return com.bendingspoons.adorable.internal.w6.HI();
                                    }
                                };
                                composerKN.o(objIF11);
                            }
                            composerKN.Xw();
                            function02 = (Function0) objIF11;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-2008542721, i5, -1, "com.bendingspoons.adorable.internal.ExoPlayerVideo (HardcodedAdContent.kt:113)");
                        }
                        context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
                        lifecycleOwner = (LifecycleOwner) composerKN.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        composerKN.eF(1488354804);
                        zP5 = composerKN.p5(context);
                        objIF = composerKN.iF();
                        if (!zP5 || objIF == Composer.INSTANCE.n()) {
                            objIF = new ExoPlayer.Builder(context).setVideoScalingMode(2).build();
                            composerKN.o(objIF);
                        }
                        exoPlayer = (ExoPlayer) objIF;
                        composerKN.Xw();
                        Intrinsics.checkNotNull(exoPlayer);
                        composerKN.eF(1488360887);
                        zE2 = composerKN.E2(exoPlayer) | composerKN.E2(uri);
                        objIF2 = composerKN.iF();
                        if (!zE2 || objIF2 == Composer.INSTANCE.n()) {
                            objIF2 = new j(exoPlayer, uri, null);
                            composerKN.o(objIF2);
                        }
                        composerKN.Xw();
                        EffectsKt.O(uri, (Function2) objIF2, composerKN, i5 & 14);
                        composerKN.eF(1488368918);
                        zE22 = ((i5 & 896) != 256) | ((i5 & 7168) == 2048) | composerKN.E2(exoPlayer);
                        objIF3 = composerKN.iF();
                        if (!zE22 || objIF3 == Composer.INSTANCE.n()) {
                            objIF3 = new Function1() { // from class: gp.Xo
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return com.bendingspoons.adorable.internal.w6.ck(function13, function02, exoPlayer, (DisposableEffectScope) obj);
                                }
                            };
                            composerKN.o(objIF3);
                        }
                        composerKN.Xw();
                        EffectsKt.n(function13, function02, (Function1) objIF3, composerKN, (i5 >> 6) & 126);
                        composerKN.eF(1488376006);
                        zP52 = composerKN.p5(context);
                        objIF4 = composerKN.iF();
                        if (!zP52 || objIF4 == Composer.INSTANCE.n()) {
                            objIF4 = new PlayerView(context);
                            composerKN.o(objIF4);
                        }
                        playerView = (PlayerView) objIF4;
                        composerKN.Xw();
                        composerKN.eF(1488379769);
                        zE23 = composerKN.E2(playerView);
                        objIF5 = composerKN.iF();
                        if (!zE23 || objIF5 == Composer.INSTANCE.n()) {
                            objIF5 = new Function1() { // from class: gp.eO
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return com.bendingspoons.adorable.internal.w6.Ik(playerView, (Context) obj);
                                }
                            };
                            composerKN.o(objIF5);
                        }
                        Function1 function15 = (Function1) objIF5;
                        composerKN.Xw();
                        composerKN.eF(1488381930);
                        zE24 = composerKN.E2(playerView) | composerKN.E2(exoPlayer);
                        objIF6 = composerKN.iF();
                        if (!zE24 || objIF6 == Composer.INSTANCE.n()) {
                            objIF6 = new Function1() { // from class: gp.z
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return com.bendingspoons.adorable.internal.w6.r(playerView, exoPlayer, (PlayerView) obj);
                                }
                            };
                            composerKN.o(objIF6);
                        }
                        composerKN.Xw();
                        Modifier modifier5 = modifier4;
                        AndroidView_androidKt.n(function15, modifier5, (Function1) objIF6, composerKN, i5 & 112, 0);
                        composerKN.eF(1488392773);
                        zP53 = composerKN.p5(exoPlayer);
                        objIF7 = composerKN.iF();
                        if (!zP53 || objIF7 == Composer.INSTANCE.n()) {
                            objIF7 = new LifecycleEventObserver() { // from class: gp.QJ
                                @Override // androidx.view.LifecycleEventObserver
                                public final void Z(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                    com.bendingspoons.adorable.internal.w6.o(exoPlayer, lifecycleOwner2, event);
                                }
                            };
                            composerKN.o(objIF7);
                        }
                        lifecycleEventObserver = (LifecycleEventObserver) objIF7;
                        composerKN.Xw();
                        composerKN.eF(1488403019);
                        zE25 = composerKN.E2(lifecycleOwner) | composerKN.E2(lifecycleEventObserver);
                        objIF8 = composerKN.iF();
                        if (!zE25 || objIF8 == Composer.INSTANCE.n()) {
                            objIF8 = new Function1() { // from class: gp.CN3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return com.bendingspoons.adorable.internal.w6.Z(lifecycleOwner, lifecycleEventObserver, (DisposableEffectScope) obj);
                                }
                            };
                            composerKN.o(objIF8);
                        }
                        composerKN.Xw();
                        EffectsKt.n(lifecycleOwner, lifecycleEventObserver, (Function1) objIF8, composerKN, 0);
                        composerKN.eF(1488408918);
                        zE26 = composerKN.E2(exoPlayer);
                        objIF9 = composerKN.iF();
                        if (!zE26 || objIF9 == Composer.INSTANCE.n()) {
                            objIF9 = new Function1() { // from class: gp.fuX
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return com.bendingspoons.adorable.internal.w6.XQ(exoPlayer, (DisposableEffectScope) obj);
                                }
                            };
                            composerKN.o(objIF9);
                        }
                        composerKN.Xw();
                        EffectsKt.rl(exoPlayer, (Function1) objIF9, composerKN, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier5;
                        function14 = function13;
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        function14 = function12;
                    }
                    final Function0 function03 = function02;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2() { // from class: gp.Dsr
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return com.bendingspoons.adorable.internal.w6.S(uri, modifier3, function14, function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                function02 = function0;
                if ((i5 & 1171) == 1170) {
                    if (i9 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (ComposerKt.v()) {
                    }
                    context = (Context) composerKN.ty(AndroidCompositionLocals_androidKt.Uo());
                    lifecycleOwner = (LifecycleOwner) composerKN.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    composerKN.eF(1488354804);
                    zP5 = composerKN.p5(context);
                    objIF = composerKN.iF();
                    if (!zP5) {
                        objIF = new ExoPlayer.Builder(context).setVideoScalingMode(2).build();
                        composerKN.o(objIF);
                        exoPlayer = (ExoPlayer) objIF;
                        composerKN.Xw();
                        Intrinsics.checkNotNull(exoPlayer);
                        composerKN.eF(1488360887);
                        zE2 = composerKN.E2(exoPlayer) | composerKN.E2(uri);
                        objIF2 = composerKN.iF();
                        if (!zE2) {
                            objIF2 = new j(exoPlayer, uri, null);
                            composerKN.o(objIF2);
                            composerKN.Xw();
                            EffectsKt.O(uri, (Function2) objIF2, composerKN, i5 & 14);
                            composerKN.eF(1488368918);
                            zE22 = ((i5 & 896) != 256) | ((i5 & 7168) == 2048) | composerKN.E2(exoPlayer);
                            objIF3 = composerKN.iF();
                            if (!zE22) {
                                objIF3 = new Function1() { // from class: gp.Xo
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return com.bendingspoons.adorable.internal.w6.ck(function13, function02, exoPlayer, (DisposableEffectScope) obj);
                                    }
                                };
                                composerKN.o(objIF3);
                                composerKN.Xw();
                                EffectsKt.n(function13, function02, (Function1) objIF3, composerKN, (i5 >> 6) & 126);
                                composerKN.eF(1488376006);
                                zP52 = composerKN.p5(context);
                                objIF4 = composerKN.iF();
                                if (!zP52) {
                                    objIF4 = new PlayerView(context);
                                    composerKN.o(objIF4);
                                    playerView = (PlayerView) objIF4;
                                    composerKN.Xw();
                                    composerKN.eF(1488379769);
                                    zE23 = composerKN.E2(playerView);
                                    objIF5 = composerKN.iF();
                                    if (!zE23) {
                                        objIF5 = new Function1() { // from class: gp.eO
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return com.bendingspoons.adorable.internal.w6.Ik(playerView, (Context) obj);
                                            }
                                        };
                                        composerKN.o(objIF5);
                                        Function1 function152 = (Function1) objIF5;
                                        composerKN.Xw();
                                        composerKN.eF(1488381930);
                                        zE24 = composerKN.E2(playerView) | composerKN.E2(exoPlayer);
                                        objIF6 = composerKN.iF();
                                        if (!zE24) {
                                            objIF6 = new Function1() { // from class: gp.z
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return com.bendingspoons.adorable.internal.w6.r(playerView, exoPlayer, (PlayerView) obj);
                                                }
                                            };
                                            composerKN.o(objIF6);
                                            composerKN.Xw();
                                            Modifier modifier52 = modifier4;
                                            AndroidView_androidKt.n(function152, modifier52, (Function1) objIF6, composerKN, i5 & 112, 0);
                                            composerKN.eF(1488392773);
                                            zP53 = composerKN.p5(exoPlayer);
                                            objIF7 = composerKN.iF();
                                            if (!zP53) {
                                                objIF7 = new LifecycleEventObserver() { // from class: gp.QJ
                                                    @Override // androidx.view.LifecycleEventObserver
                                                    public final void Z(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                                        com.bendingspoons.adorable.internal.w6.o(exoPlayer, lifecycleOwner2, event);
                                                    }
                                                };
                                                composerKN.o(objIF7);
                                                lifecycleEventObserver = (LifecycleEventObserver) objIF7;
                                                composerKN.Xw();
                                                composerKN.eF(1488403019);
                                                zE25 = composerKN.E2(lifecycleOwner) | composerKN.E2(lifecycleEventObserver);
                                                objIF8 = composerKN.iF();
                                                if (!zE25) {
                                                    objIF8 = new Function1() { // from class: gp.CN3
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return com.bendingspoons.adorable.internal.w6.Z(lifecycleOwner, lifecycleEventObserver, (DisposableEffectScope) obj);
                                                        }
                                                    };
                                                    composerKN.o(objIF8);
                                                    composerKN.Xw();
                                                    EffectsKt.n(lifecycleOwner, lifecycleEventObserver, (Function1) objIF8, composerKN, 0);
                                                    composerKN.eF(1488408918);
                                                    zE26 = composerKN.E2(exoPlayer);
                                                    objIF9 = composerKN.iF();
                                                    if (!zE26) {
                                                        objIF9 = new Function1() { // from class: gp.fuX
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return com.bendingspoons.adorable.internal.w6.XQ(exoPlayer, (DisposableEffectScope) obj);
                                                            }
                                                        };
                                                        composerKN.o(objIF9);
                                                        composerKN.Xw();
                                                        EffectsKt.rl(exoPlayer, (Function1) objIF9, composerKN, 0);
                                                        if (ComposerKt.v()) {
                                                        }
                                                        modifier3 = modifier52;
                                                        function14 = function13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                final Function0 function032 = function02;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function12 = function1;
            i8 = i3 & 8;
            if (i8 == 0) {
            }
            function02 = function0;
            if ((i5 & 1171) == 1170) {
            }
            final Function0 function0322 = function02;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function12 = function1;
        i8 = i3 & 8;
        if (i8 == 0) {
        }
        function02 = function0;
        if ((i5 & 1171) == 1170) {
        }
        final Function0 function03222 = function02;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ViF(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
