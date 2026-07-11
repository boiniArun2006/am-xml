package androidx.compose.material;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0015\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\fH\u0003¢\u0006\u0004\b \u0010!*b\b\u0002\u0010$\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¨\u0006%"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarData;", "", "Landroidx/compose/runtime/Composable;", "snackbar", "rl", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/SnackbarDuration;", "", "hasAction", "Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "", "KN", "(Landroidx/compose/material/SnackbarDuration;ZLandroidx/compose/ui/platform/AccessibilityManager;)J", "current", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/State;", "J2", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Uo", "(Landroidx/compose/animation/core/AnimationSpec;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,362:1\n75#2:363\n1247#3,6:364\n1247#3,6:370\n1247#3,6:443\n1247#3,6:449\n1247#3,6:455\n1247#3,6:461\n151#4,3:376\n33#4,4:379\n154#4,2:383\n38#4:385\n156#4:386\n200#4,2:387\n33#4,4:389\n202#4,2:393\n38#4:395\n204#4:396\n33#4,6:433\n71#5:397\n68#5,6:398\n74#5:432\n78#5:442\n79#6,6:404\n86#6,4:419\n90#6,2:429\n94#6:441\n368#7,9:410\n377#7:431\n378#7,2:439\n4034#8,6:423\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n*L\n158#1:363\n159#1:364,6\n247#1:370,6\n342#1:443,6\n343#1:449,6\n352#1:455,6\n353#1:461,6\n251#1:376,3\n251#1:379,4\n251#1:383,2\n251#1:385\n251#1:386\n256#1:387,2\n256#1:389,4\n256#1:393,2\n256#1:395\n256#1:396\n318#1:433,6\n316#1:397\n316#1:398,6\n316#1:432\n316#1:442\n316#1:404,6\n316#1:419,4\n316#1:429,2\n316#1:441\n316#1:410,9\n316#1:431\n316#1:439,2\n316#1:423,6\n*E\n"})
public final class SnackbarHostKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.f23002O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.f23005t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.f23003n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State J2(AnimationSpec animationSpec, boolean z2, Function0 function0, Composer composer, int i2, int i3) {
        if ((i3 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt$animatedOpacity$1
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
            ComposerKt.p5(1016418159, i2, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
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
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final SnackbarData snackbarData, Modifier modifier, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i7;
        SnackbarData snackbarData2 = snackbarData;
        int i8 = 6;
        Composer composerKN = composer.KN(2036134589);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(snackbarData2) : composerKN.E2(snackbarData2) ? 4 : 2) | i2;
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
            if (composerKN.HI((i5 & 147) == 146, i5 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(2036134589, i5, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)");
                }
                Object objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new FadeInFadeOutState();
                    composerKN.o(objIF);
                }
                final FadeInFadeOutState fadeInFadeOutState = (FadeInFadeOutState) objIF;
                final String strN = Strings_androidKt.n(Strings.INSTANCE.KN(), composerKN, 6);
                if (Intrinsics.areEqual(snackbarData2, fadeInFadeOutState.getCurrent())) {
                    i7 = 6;
                    composerKN.eF(1524617353);
                    composerKN.Xw();
                } else {
                    composerKN.eF(1522020731);
                    fadeInFadeOutState.nr(snackbarData2);
                    List items = fadeInFadeOutState.getItems();
                    ArrayList arrayList = new ArrayList(items.size());
                    int size = items.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        arrayList.add((SnackbarData) ((FadeInFadeOutAnimationItem) items.get(i10)).t());
                    }
                    final List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                    if (!mutableList.contains(snackbarData2)) {
                        mutableList.add(snackbarData2);
                    }
                    fadeInFadeOutState.getItems().clear();
                    List listRl = ListUtilsKt.rl(mutableList);
                    List items2 = fadeInFadeOutState.getItems();
                    int i11 = 0;
                    for (int size2 = listRl.size(); i11 < size2; size2 = size2) {
                        final SnackbarData snackbarData3 = (SnackbarData) listRl.get(i11);
                        int i12 = i11;
                        final SnackbarData snackbarData4 = snackbarData2;
                        items2.add(new FadeInFadeOutAnimationItem(snackbarData3, ComposableLambdaKt.nr(1471040642, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                                n(function2, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Function2 function2, Composer composer2, int i13) {
                                int i14;
                                if ((i13 & 6) == 0) {
                                    i14 = i13 | (composer2.E2(function2) ? 4 : 2);
                                } else {
                                    i14 = i13;
                                }
                                if (!composer2.HI((i14 & 19) != 18, i14 & 1)) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1471040642, i14, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:257)");
                                }
                                final boolean zAreEqual = Intrinsics.areEqual(snackbarData3, snackbarData4);
                                int i15 = zAreEqual ? 150 : 75;
                                int i16 = (!zAreEqual || ListUtilsKt.rl(mutableList).size() == 1) ? 0 : 75;
                                TweenSpec tweenSpecAz = AnimationSpecKt.az(i15, i16, EasingKt.O());
                                boolean zE2 = composer2.E2(snackbarData3) | composer2.E2(fadeInFadeOutState);
                                final SnackbarData snackbarData5 = snackbarData3;
                                final FadeInFadeOutState fadeInFadeOutState2 = fadeInFadeOutState;
                                Object objIF2 = composer2.iF();
                                if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                                    objIF2 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1
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
                                            if (Intrinsics.areEqual(snackbarData5, fadeInFadeOutState2.getCurrent())) {
                                                return;
                                            }
                                            List items3 = fadeInFadeOutState2.getItems();
                                            final SnackbarData snackbarData6 = snackbarData5;
                                            CollectionsKt.removeAll(items3, (Function1) new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1.1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
                                                    return Boolean.valueOf(Intrinsics.areEqual(fadeInFadeOutAnimationItem.t(), snackbarData6));
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
                                State stateUo = SnackbarHostKt.Uo(AnimationSpecKt.az(i15, i16, EasingKt.nr()), zAreEqual, composer2, 0);
                                Modifier modifierT = GraphicsLayerModifierKt.t(Modifier.INSTANCE, ((Number) stateUo.getValue()).floatValue(), ((Number) stateUo.getValue()).floatValue(), ((Number) stateJ2.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                                boolean zN = composer2.n(zAreEqual) | composer2.p5(strN) | composer2.E2(snackbarData3);
                                final String str = strN;
                                final SnackbarData snackbarData6 = snackbarData3;
                                Object objIF3 = composer2.iF();
                                if (zN || objIF3 == Composer.INSTANCE.n()) {
                                    objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            n(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            if (zAreEqual) {
                                                SemanticsPropertiesKt.ijL(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.rl());
                                            }
                                            SemanticsPropertiesKt.eTf(semanticsPropertyReceiver, str);
                                            final SnackbarData snackbarData7 = snackbarData6;
                                            SemanticsPropertiesKt.ty(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke() {
                                                    snackbarData7.dismiss();
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    };
                                    composer2.o(objIF3);
                                }
                                Modifier modifierNr = SemanticsModifierKt.nr(modifierT, false, (Function1) objIF3, 1, null);
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN = ComposablesKt.n(composer2, 0);
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
                                Composer composerN = Updater.n(composer2);
                                Updater.O(composerN, measurePolicyUo, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                Function2 function2Rl = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function2.invoke(composer2, Integer.valueOf(i14 & 14));
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54)));
                        i11 = i12 + 1;
                        snackbarData2 = snackbarData;
                        i8 = i8;
                    }
                    i7 = i8;
                    composerKN.Xw();
                }
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 function0N = companion.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N);
                } else {
                    composerKN.r();
                }
                Composer composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyUo, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                Function2 function2Rl = companion.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                fadeInFadeOutState.O(ComposablesKt.rl(composerKN, 0));
                composerKN.eF(1801449988);
                List items3 = fadeInFadeOutState.getItems();
                int size3 = items3.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) items3.get(i13);
                    final SnackbarData snackbarData5 = (SnackbarData) fadeInFadeOutAnimationItem.getKey();
                    Function3 transition = fadeInFadeOutAnimationItem.getTransition();
                    composerKN.X(2123994112, snackbarData5);
                    transition.invoke(ComposableLambdaKt.nr(2041982076, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i14) {
                            if (!composer2.HI((i14 & 3) != 2, i14 & 1)) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(2041982076, i14, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:317)");
                            }
                            Function3 function32 = function3;
                            SnackbarData snackbarData6 = snackbarData5;
                            Intrinsics.checkNotNull(snackbarData6);
                            function32.invoke(snackbarData6, composer2, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composerKN, Integer.valueOf(i7));
                    composerKN.P5();
                }
                composerKN.Xw();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i14) {
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
        if (composerKN.HI((i5 & 147) == 146, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State Uo(AnimationSpec animationSpec, boolean z2, Composer composer, int i2) {
        boolean z3;
        float f3;
        if (ComposerKt.v()) {
            ComposerKt.p5(2003504988, i2, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
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
        boolean z2;
        final Modifier modifier2;
        final Function3 function32;
        Composer composerKN = composer.KN(431012348);
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
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i5 & 1)) {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i11 != 0) {
                function3 = ComposableSingletons$SnackbarHostKt.f21739n.n();
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(431012348, i5, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            SnackbarData snackbarDataRl = snackbarHostState.rl();
            AccessibilityManager accessibilityManager = (AccessibilityManager) composerKN.ty(CompositionLocalsKt.t());
            boolean zE2 = composerKN.E2(snackbarDataRl) | composerKN.E2(accessibilityManager);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new SnackbarHostKt$SnackbarHost$1$1(snackbarDataRl, accessibilityManager, null);
                composerKN.o(objIF);
            }
            EffectsKt.O(snackbarDataRl, (Function2) objIF, composerKN, 0);
            Function3 function33 = function3;
            n(snackbarHostState.rl(), modifier3, function33, composerKN, i5 & 1008, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier3;
            function32 = function33;
        } else {
            composerKN.wTp();
            modifier2 = modifier;
            function32 = function3;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
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
