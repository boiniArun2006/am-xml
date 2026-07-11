package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0015\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\fH\u0003¢\u0006\u0004\b \u0010!*b\b\u0002\u0010$\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006%"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material3/SnackbarData;", "", "Landroidx/compose/runtime/Composable;", "snackbar", "rl", "(Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "", "KN", "(Landroidx/compose/material3/SnackbarDuration;ZLandroidx/compose/ui/platform/AccessibilityManager;)J", "current", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/State;", "J2", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Uo", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "FadeInFadeOutTransition", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,440:1\n77#2:441\n1223#3,6:442\n1223#3,6:448\n1223#3,6:521\n1223#3,6:527\n1223#3,6:533\n1223#3,6:539\n151#4,3:454\n33#4,4:457\n154#4,2:461\n38#4:463\n156#4:464\n200#4,2:465\n33#4,4:467\n202#4,2:471\n38#4:473\n204#4:474\n33#4,6:511\n71#5:475\n68#5,6:476\n74#5:510\n78#5:520\n78#6,6:482\n85#6,4:497\n89#6,2:507\n93#6:519\n368#7,9:488\n377#7:509\n378#7,2:517\n4032#8,6:501\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n*L\n224#1:441\n225#1:442,6\n329#1:448,6\n420#1:521,6\n421#1:527,6\n430#1:533,6\n431#1:539,6\n332#1:454,3\n332#1:457,4\n332#1:461,2\n332#1:463\n332#1:464\n337#1:465,2\n337#1:467,4\n337#1:471,2\n337#1:473\n337#1:474\n396#1:511,6\n394#1:475\n394#1:476,6\n394#1:510\n394#1:520\n394#1:482,6\n394#1:497,4\n394#1:507,2\n394#1:519\n394#1:488,9\n394#1:509\n394#1:517,2\n394#1:501,6\n*E\n"})
public final class SnackbarHostKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State J2(AnimationSpec animationSpec, boolean z2, Function0 function0, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$animatedOpacity$1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function02 = function0;
        if (ComposerKt.v()) {
            ComposerKt.p5(1431889134, i2, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:418)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = AnimatableKt.rl(!z2 ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.o(objIF);
        }
        Animatable animatable = (Animatable) objIF;
        Boolean boolValueOf = Boolean.valueOf(z2);
        boolean zE2 = composer.E2(animatable) | ((((i2 & 112) ^ 48) > 32 && composer.n(z2)) || (i2 & 48) == 32) | composer.E2(animationSpec) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function02)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == companion.n()) {
            Object snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, z2, animationSpec, function02, null);
            composer.o(snackbarHostKt$animatedOpacity$2$1);
            objIF2 = snackbarHostKt$animatedOpacity$2$1;
        }
        EffectsKt.O(boolValueOf, (Function2) objIF2, composer, (i2 >> 3) & 14);
        State stateUo = animatable.Uo();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateUo;
    }

    public static final long KN(SnackbarDuration snackbarDuration, boolean z2, AccessibilityManager accessibilityManager) {
        long j2;
        int i2 = WhenMappings.$EnumSwitchMapping$0[snackbarDuration.ordinal()];
        if (i2 == 1) {
            j2 = Long.MAX_VALUE;
        } else if (i2 == 2) {
            j2 = 10000;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j2 = 4000;
        }
        long j3 = j2;
        return accessibilityManager == null ? j3 : accessibilityManager.n(j3, true, true, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01aa A[LOOP:2: B:73:0x01a8->B:74:0x01aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final SnackbarData snackbarData, Modifier modifier, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Object objIF;
        final FadeInFadeOutState fadeInFadeOutState;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int size;
        int i7;
        ScopeUpdateScope scopeUpdateScopeGh;
        final SnackbarData snackbarData2 = snackbarData;
        int i8 = 6;
        Composer composerKN = composer.KN(-1316639904);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(snackbarData2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function3) ? 256 : 128;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                if (i9 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1316639904, i5, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:327)");
                }
                objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new FadeInFadeOutState();
                    composerKN.o(objIF);
                }
                fadeInFadeOutState = (FadeInFadeOutState) objIF;
                composerKN.eF(-1256811491);
                if (!Intrinsics.areEqual(snackbarData2, fadeInFadeOutState.getCurrent())) {
                    fadeInFadeOutState.nr(snackbarData2);
                    List items = fadeInFadeOutState.getItems();
                    ArrayList arrayList = new ArrayList(items.size());
                    int size2 = items.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) items.get(i10)).t());
                    }
                    final List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                    if (!mutableList.contains(snackbarData2)) {
                        mutableList.add(snackbarData2);
                    }
                    fadeInFadeOutState.getItems().clear();
                    List listRl = ListUtilsKt.rl(mutableList);
                    List items2 = fadeInFadeOutState.getItems();
                    int size3 = listRl.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        final SnackbarData snackbarData3 = (SnackbarData) listRl.get(i11);
                        items2.add(new FadeInFadeOutAnimationItem(snackbarData3, ComposableLambdaKt.nr(-1654683077, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                                n(function2, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Function2 function2, Composer composer2, int i12) {
                                int i13;
                                if ((i12 & 6) == 0) {
                                    i13 = i12 | (composer2.E2(function2) ? 4 : 2);
                                } else {
                                    i13 = i12;
                                }
                                if ((i13 & 19) == 18 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1654683077, i13, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
                                }
                                boolean zAreEqual = Intrinsics.areEqual(snackbarData3, snackbarData2);
                                int i14 = zAreEqual ? 150 : 75;
                                int i15 = (!zAreEqual || ListUtilsKt.rl(mutableList).size() == 1) ? 0 : 75;
                                TweenSpec tweenSpecAz = AnimationSpecKt.az(i14, i15, EasingKt.O());
                                boolean zP5 = composer2.p5(snackbarData3) | composer2.E2(fadeInFadeOutState);
                                final SnackbarData snackbarData4 = snackbarData3;
                                final FadeInFadeOutState fadeInFadeOutState2 = fadeInFadeOutState;
                                Object objIF2 = composer2.iF();
                                if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                                    objIF2 = new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (Intrinsics.areEqual(snackbarData4, fadeInFadeOutState2.getCurrent())) {
                                                return;
                                            }
                                            List items3 = fadeInFadeOutState2.getItems();
                                            final SnackbarData snackbarData5 = snackbarData4;
                                            CollectionsKt.removeAll(items3, (Function1) new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1.1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
                                                    return Boolean.valueOf(Intrinsics.areEqual(fadeInFadeOutAnimationItem.t(), snackbarData5));
                                                }
                                            });
                                            RecomposeScope scope = fadeInFadeOutState2.getScope();
                                            if (scope != null) {
                                                scope.invalidate();
                                            }
                                        }
                                    };
                                    composer2.o(objIF2);
                                }
                                State stateJ2 = SnackbarHostKt.J2(tweenSpecAz, zAreEqual, (Function0) objIF2, composer2, 0, 0);
                                State stateUo = SnackbarHostKt.Uo(AnimationSpecKt.az(i14, i15, EasingKt.nr()), zAreEqual, composer2, 0);
                                Modifier modifierT = GraphicsLayerModifierKt.t(Modifier.INSTANCE, ((Number) stateUo.getValue()).floatValue(), ((Number) stateUo.getValue()).floatValue(), ((Number) stateJ2.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                                boolean zP52 = composer2.p5(snackbarData3);
                                final SnackbarData snackbarData5 = snackbarData3;
                                Object objIF3 = composer2.iF();
                                if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                                    objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            n(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.ijL(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.rl());
                                            final SnackbarData snackbarData6 = snackbarData5;
                                            SemanticsPropertiesKt.ty(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke() {
                                                    snackbarData6.dismiss();
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    };
                                    composer2.o(objIF3);
                                }
                                Modifier modifierNr = SemanticsModifierKt.nr(modifierT, false, (Function1) objIF3, 1, null);
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN2 = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierNr);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion.n();
                                if (composer2.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer2.T();
                                if (composer2.getInserting()) {
                                    composer2.s7N(function0N);
                                } else {
                                    composer2.r();
                                }
                                Composer composerN2 = Updater.n(composer2);
                                Updater.O(composerN2, measurePolicyUo, companion.t());
                                Updater.O(composerN2, compositionLocalMapIk, companion.O());
                                Function2 function2Rl2 = companion.rl();
                                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                    composerN2.o(Integer.valueOf(iN2));
                                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                }
                                Updater.O(composerN2, modifierO, companion.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function2.invoke(composer2, Integer.valueOf(i13 & 14));
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54)));
                        i11++;
                        snackbarData2 = snackbarData;
                        i8 = i8;
                    }
                }
                int i12 = i8;
                composerKN.Xw();
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifier2);
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
                Updater.O(composerN, measurePolicyUo, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                fadeInFadeOutState.O(ComposablesKt.rl(composerKN, 0));
                composerKN.eF(1748085441);
                List items3 = fadeInFadeOutState.getItems();
                size = items3.size();
                for (i7 = 0; i7 < size; i7++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) items3.get(i7);
                    final SnackbarData snackbarData4 = (SnackbarData) fadeInFadeOutAnimationItem.getKey();
                    Function3 transition = fadeInFadeOutAnimationItem.getTransition();
                    composerKN.X(1201076541, snackbarData4);
                    transition.invoke(ComposableLambdaKt.nr(-1135367807, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i13) {
                            if ((i13 & 3) == 2 && composer2.xMQ()) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1135367807, i13, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:395)");
                            }
                            Function3 function32 = function3;
                            SnackbarData snackbarData5 = snackbarData4;
                            Intrinsics.checkNotNull(snackbarData5);
                            function32.invoke(snackbarData5, composer2, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composerKN, Integer.valueOf(i12));
                    composerKN.P5();
                }
                composerKN.Xw();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i13) {
                        SnackbarHostKt.n(snackbarData, modifier3, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i3 & 4) == 0) {
        }
        if ((i5 & 147) == 146) {
            if (i9 != 0) {
            }
            if (ComposerKt.v()) {
            }
            objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
            }
            fadeInFadeOutState = (FadeInFadeOutState) objIF;
            composerKN.eF(-1256811491);
            if (!Intrinsics.areEqual(snackbarData2, fadeInFadeOutState.getCurrent())) {
            }
            int i122 = i8;
            composerKN.Xw();
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifier2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo2, companion2.t());
            Updater.O(composerN, compositionLocalMapIk2, companion2.O());
            function2Rl = companion2.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion2.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                fadeInFadeOutState.O(ComposablesKt.rl(composerKN, 0));
                composerKN.eF(1748085441);
                List items32 = fadeInFadeOutState.getItems();
                size = items32.size();
                while (i7 < size) {
                }
                composerKN.Xw();
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State Uo(AnimationSpec animationSpec, boolean z2, Composer composer, int i2) {
        boolean z3;
        float f3;
        if (ComposerKt.v()) {
            ComposerKt.p5(1966809761, i2, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:428)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            if (!z2) {
                f3 = 1.0f;
            } else {
                f3 = 0.8f;
            }
            objIF = AnimatableKt.rl(f3, 0.0f, 2, null);
            composer.o(objIF);
        }
        Animatable animatable = (Animatable) objIF;
        Boolean boolValueOf = Boolean.valueOf(z2);
        boolean zE2 = composer.E2(animatable);
        if ((((i2 & 112) ^ 48) > 32 && composer.n(z2)) || (i2 & 48) == 32) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean zE22 = zE2 | z3 | composer.E2(animationSpec);
        Object objIF2 = composer.iF();
        if (zE22 || objIF2 == companion.n()) {
            objIF2 = new SnackbarHostKt$animatedScale$1$1(animatable, z2, animationSpec, null);
            composer.o(objIF2);
        }
        EffectsKt.O(boolValueOf, (Function2) objIF2, composer, (i2 >> 3) & 14);
        State stateUo = animatable.Uo();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateUo;
    }

    public static final void rl(final SnackbarHostState snackbarHostState, Modifier modifier, Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        final Modifier modifier2;
        final Function3 function32;
        Composer composerKN = composer.KN(464178177);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerKN.p5(snackbarHostState)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i5 = i7 | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerKN.p5(modifier)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i5 |= i8;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function3)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier2 = modifier;
            function32 = function3;
        } else {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i11 != 0) {
                function3 = ComposableSingletons$SnackbarHostKt.f25108n.n();
            }
            Function3 function33 = function3;
            if (ComposerKt.v()) {
                ComposerKt.p5(464178177, i5, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:221)");
            }
            SnackbarData snackbarDataRl = snackbarHostState.rl();
            AccessibilityManager accessibilityManager = (AccessibilityManager) composerKN.ty(CompositionLocalsKt.t());
            boolean zP5 = composerKN.p5(snackbarDataRl) | composerKN.E2(accessibilityManager);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new SnackbarHostKt$SnackbarHost$1$1(snackbarDataRl, accessibilityManager, null);
                composerKN.o(objIF);
            }
            EffectsKt.O(snackbarDataRl, (Function2) objIF, composerKN, 0);
            Modifier modifier3 = modifier;
            n(snackbarHostState.rl(), modifier3, function33, composerKN, i5 & 1008, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier3;
            function32 = function33;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$SnackbarHost$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i12) {
                    SnackbarHostKt.rl(snackbarHostState, modifier2, function32, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }
}
