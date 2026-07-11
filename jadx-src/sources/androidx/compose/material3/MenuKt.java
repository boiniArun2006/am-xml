package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0086\u0001\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0084\u0001\u0010'\u001a\u00020\u00152\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00150\u001b¢\u0006\u0002\b\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b2\u0006\u0010\u0001\u001a\u00020\u00002\u0013\u0010\u001e\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001b¢\u0006\u0002\b\u00162\u0013\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001b¢\u0006\u0002\b\u00162\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0001¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-\"\u001a\u00101\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b/\u00100\"\u0014\u00103\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.\"\u0014\u00105\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.\"\u001a\u00107\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b6\u00100\"\u0014\u00109\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.\"\u0014\u0010;\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006\f\u0010=\u001a\u00020<8\nX\u008a\u0084\u0002²\u0006\f\u0010>\u001a\u00020<8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/core/MutableTransitionState;", "", "expandedState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOriginState", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Landroidx/compose/material3/MenuItemColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "nr", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "menuBounds", "KN", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "F", "mUb", "()F", "MenuVerticalMargin", "rl", "MenuListItemContainerHeight", "t", "DropdownMenuItemHorizontalPadding", "xMQ", "DropdownMenuVerticalPadding", "O", "DropdownMenuItemDefaultMinWidth", "J2", "DropdownMenuItemDefaultMaxWidth", "", "scale", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,560:1\n1967#2:561\n1964#2:562\n1882#2,7:563\n1967#2:570\n1964#2:571\n1882#2,7:572\n77#3:579\n1223#4,6:580\n98#5:586\n95#5,6:587\n101#5:621\n105#5:625\n78#6,6:593\n85#6,4:608\n89#6,2:618\n93#6:624\n368#7,9:599\n377#7:620\n378#7,2:622\n4032#8,6:612\n81#9:626\n81#9:627\n148#10:628\n148#10:629\n148#10:630\n148#10:631\n148#10:632\n148#10:633\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuKt\n*L\n380#1:561\n380#1:562\n380#1:563,7\n395#1:570\n395#1:571\n395#1:572,7\n409#1:579\n412#1:580,6\n453#1:586\n453#1:587,6\n453#1:621\n453#1:625\n453#1:593,6\n453#1:608,4\n453#1:618,2\n453#1:624\n453#1:599,9\n453#1:620\n453#1:622,2\n453#1:612,6\n380#1:626\n395#1:627\n546#1:628\n547#1:629\n548#1:630\n549#1:631\n550#1:632\n551#1:633\n*E\n"})
public final class MenuKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f26191n;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f26192t = Dp.KN(12);
    private static final float nr = Dp.KN(8);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f26190O = Dp.KN(112);
    private static final float J2 = Dp.KN(280);

    static {
        float f3 = 48;
        f26191n = Dp.KN(f3);
        rl = Dp.KN(f3);
    }

    public static final float mUb() {
        return f26191n;
    }

    public static final void n(final Modifier modifier, final MutableTransitionState mutableTransitionState, final MutableState mutableState, final ScrollState scrollState, final Shape shape, final long j2, final float f3, final float f4, final BorderStroke borderStroke, final Function3 function3, Composer composer, final int i2) {
        int i3;
        float f5;
        Object obj;
        int i5;
        Composer composer2;
        Composer composerKN = composer.KN(-151448888);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerKN.p5(mutableTransitionState) : composerKN.E2(mutableTransitionState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(mutableState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(scrollState) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.p5(shape) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.nr(j2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            f5 = f3;
            i3 |= composerKN.rl(f5) ? 1048576 : 524288;
        } else {
            f5 = f3;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= composerKN.rl(f4) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= composerKN.p5(borderStroke) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i3 |= composerKN.E2(function3) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-151448888, i3, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:374)");
            }
            Transition transitionXMQ = TransitionKt.xMQ(mutableTransitionState, "DropDownMenu", composerKN, MutableTransitionState.nr | 48 | ((i3 >> 3) & 14), 0);
            MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$scale$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer3, Integer num) {
                    return n(segment, composer3, num.intValue());
                }

                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i7) {
                    TweenSpec tweenSpecTy;
                    composer3.eF(1033023423);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1033023423, i7, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:381)");
                    }
                    if (segment.t(Boolean.FALSE, Boolean.TRUE)) {
                        tweenSpecTy = AnimationSpecKt.ty(b.f61769v, 0, EasingKt.J2(), 2, null);
                    } else {
                        tweenSpecTy = AnimationSpecKt.ty(1, 74, null, 4, null);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer3.Xw();
                    return tweenSpecTy;
                }
            };
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            TwoWayConverter twoWayConverterXMQ = VectorConvertersKt.xMQ(floatCompanionObject);
            boolean zBooleanValue = ((Boolean) transitionXMQ.xMQ()).booleanValue();
            composerKN.eF(2139028452);
            if (ComposerKt.v()) {
                ComposerKt.p5(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f6 = zBooleanValue ? 1.0f : 0.8f;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composerKN.Xw();
            Float fValueOf = Float.valueOf(f6);
            boolean zBooleanValue2 = ((Boolean) transitionXMQ.Ik()).booleanValue();
            composerKN.eF(2139028452);
            if (ComposerKt.v()) {
                ComposerKt.p5(2139028452, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:390)");
            }
            float f7 = zBooleanValue2 ? 1.0f : 0.8f;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composerKN.Xw();
            final State stateJ2 = TransitionKt.J2(transitionXMQ, fValueOf, Float.valueOf(f7), menuKt$DropdownMenuContent$scale$2.invoke(transitionXMQ.HI(), composerKN, 0), twoWayConverterXMQ, "FloatAnimation", composerKN, 0);
            MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$alpha$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer3, Integer num) {
                    return n(segment, composer3, num.intValue());
                }

                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer3, int i7) {
                    TweenSpec tweenSpecTy;
                    composer3.eF(-1355418157);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1355418157, i7, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:396)");
                    }
                    if (segment.t(Boolean.FALSE, Boolean.TRUE)) {
                        tweenSpecTy = AnimationSpecKt.ty(30, 0, null, 6, null);
                    } else {
                        tweenSpecTy = AnimationSpecKt.ty(75, 0, null, 6, null);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer3.Xw();
                    return tweenSpecTy;
                }
            };
            TwoWayConverter twoWayConverterXMQ2 = VectorConvertersKt.xMQ(floatCompanionObject);
            boolean zBooleanValue3 = ((Boolean) transitionXMQ.xMQ()).booleanValue();
            composerKN.eF(-249413128);
            if (ComposerKt.v()) {
                ComposerKt.p5(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f8 = zBooleanValue3 ? 1.0f : 0.0f;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composerKN.Xw();
            Float fValueOf2 = Float.valueOf(f8);
            boolean zBooleanValue4 = ((Boolean) transitionXMQ.Ik()).booleanValue();
            composerKN.eF(-249413128);
            if (ComposerKt.v()) {
                ComposerKt.p5(-249413128, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:405)");
            }
            float f9 = zBooleanValue4 ? 1.0f : 0.0f;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composerKN.Xw();
            final State stateJ22 = TransitionKt.J2(transitionXMQ, fValueOf2, Float.valueOf(f9), menuKt$DropdownMenuContent$alpha$2.invoke(transitionXMQ.HI(), composerKN, 0), twoWayConverterXMQ2, "FloatAnimation", composerKN, 0);
            final boolean zBooleanValue5 = ((Boolean) composerKN.ty(InspectionModeKt.n())).booleanValue();
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean zN = composerKN.n(zBooleanValue5) | composerKN.p5(stateJ2) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerKN.E2(mutableTransitionState))) | composerKN.p5(stateJ22) | ((i3 & 896) == 256);
            Object objIF = composerKN.iF();
            if (zN || objIF == Composer.INSTANCE.n()) {
                i5 = i3;
                obj = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        n(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(GraphicsLayerScope graphicsLayerScope) {
                        float fRl = 0.8f;
                        float fT = 1.0f;
                        graphicsLayerScope.Uo(!zBooleanValue5 ? MenuKt.rl(stateJ2) : ((Boolean) mutableTransitionState.rl()).booleanValue() ? 1.0f : 0.8f);
                        if (!zBooleanValue5) {
                            fRl = MenuKt.rl(stateJ2);
                        } else if (((Boolean) mutableTransitionState.rl()).booleanValue()) {
                            fRl = 1.0f;
                        }
                        graphicsLayerScope.az(fRl);
                        if (!zBooleanValue5) {
                            fT = MenuKt.t(stateJ22);
                        } else if (!((Boolean) mutableTransitionState.rl()).booleanValue()) {
                            fT = 0.0f;
                        }
                        graphicsLayerScope.rl(fT);
                        graphicsLayerScope.tUK(((TransformOrigin) mutableState.getValue()).getPackedValue());
                    }
                };
                composerKN.o(obj);
            } else {
                obj = objIF;
                i5 = i3;
            }
            Modifier modifierN = GraphicsLayerModifierKt.n(companion, (Function1) obj);
            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(1573559053, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1573559053, i7, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:429)");
                    }
                    Modifier modifierUo = ScrollKt.Uo(IntrinsicKt.rl(PaddingKt.gh(modifier, 0.0f, MenuKt.xMQ(), 1, null), IntrinsicSize.f17697t), scrollState, false, null, false, 14, null);
                    Function3 function32 = function3;
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                    int iN = ComposablesKt.n(composer3, 0);
                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierUo);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion2.n();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer3.T();
                    if (composer3.getInserting()) {
                        composer3.s7N(function0N);
                    } else {
                        composer3.r();
                    }
                    Composer composerN = Updater.n(composer3);
                    Updater.O(composerN, measurePolicyN, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    Function2 function2Rl = companion2.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    function32.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                    composer3.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54);
            int i7 = i5 >> 9;
            int i8 = i5 >> 6;
            SurfaceKt.n(modifierN, shape, j2, 0L, f5, f4, borderStroke, composableLambdaNr, composerKN, (i7 & 896) | (i7 & 112) | 12582912 | (57344 & i8) | (458752 & i8) | (i8 & 3670016), 8);
            composer2 = composerKN;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i9) {
                    MenuKt.n(modifier, mutableTransitionState, mutableState, scrollState, shape, j2, f3, f4, borderStroke, function3, composer3, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void nr(final Function2 function2, final Function0 function0, final Modifier modifier, final Function2 function22, final Function2 function23, final boolean z2, final MenuItemColors menuItemColors, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-1564716777);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function22) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.n(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.p5(menuItemColors) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.p5(paddingValues) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1564716777, i3, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:451)");
            }
            Modifier modifierKN = PaddingKt.KN(SizeKt.aYN(SizeKt.KN(ClickableKt.nr(modifier, mutableInteractionSource, RippleKt.nr(true, 0.0f, 0L, composerKN, 6, 6), z2, null, null, function0, 24, null), 0.0f, 1, null), f26190O, rl, J2, 0.0f, 8, null), paddingValues);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.xMQ(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
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
            Updater.O(composerN, measurePolicyRl, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            TextKt.n(MaterialTheme.f26164n.t(composerKN, 6).getLabelLarge(), ComposableLambdaKt.nr(1065051884, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1065051884, i5, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:473)");
                    }
                    composer2.eF(1264683960);
                    if (function22 != null) {
                        ProvidedValue providedValueNr = ContentColorKt.n().nr(Color.xMQ(menuItemColors.n(z2)));
                        final Function2 function24 = function22;
                        CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(2035552199, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i7) {
                                if ((i7 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(2035552199, i7, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:477)");
                                }
                                Modifier modifierRl = SizeKt.rl(Modifier.INSTANCE, ListTokens.f29685n.az(), 0.0f, 2, null);
                                Function2 function25 = function24;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN2 = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierRl);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 function0N2 = companion2.n();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer3.T();
                                if (composer3.getInserting()) {
                                    composer3.s7N(function0N2);
                                } else {
                                    composer3.r();
                                }
                                Composer composerN2 = Updater.n(composer3);
                                Updater.O(composerN2, measurePolicyUo, companion2.t());
                                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                                Function2 function2Rl2 = companion2.rl();
                                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                    composerN2.o(Integer.valueOf(iN2));
                                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                }
                                Updater.O(composerN2, modifierO2, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function25.invoke(composer3, 0);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer2, 54), composer2, ProvidedValue.xMQ | 48);
                    }
                    composer2.Xw();
                    ProvidedValue providedValueNr2 = ContentColorKt.n().nr(Color.xMQ(menuItemColors.rl(z2)));
                    final RowScope rowScope = rowScopeInstance;
                    final Function2 function25 = function22;
                    final Function2 function26 = function23;
                    final Function2 function27 = function2;
                    ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-1728894036, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1728894036, i7, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:483)");
                            }
                            Modifier modifierAz = PaddingKt.az(RowScope.rl(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), function25 != null ? MenuKt.f26192t : Dp.KN(0), 0.0f, function26 != null ? MenuKt.f26192t : Dp.KN(0), 0.0f, 10, null);
                            Function2 function28 = function27;
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                            int iN2 = ComposablesKt.n(composer3, 0);
                            CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                            Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierAz);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 function0N2 = companion2.n();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composer3.T();
                            if (composer3.getInserting()) {
                                composer3.s7N(function0N2);
                            } else {
                                composer3.r();
                            }
                            Composer composerN2 = Updater.n(composer3);
                            Updater.O(composerN2, measurePolicyUo, companion2.t());
                            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                            Function2 function2Rl2 = companion2.rl();
                            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                composerN2.o(Integer.valueOf(iN2));
                                composerN2.az(Integer.valueOf(iN2), function2Rl2);
                            }
                            Updater.O(composerN2, modifierO2, companion2.nr());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                            function28.invoke(composer3, 0);
                            composer3.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composer2, 54);
                    int i7 = ProvidedValue.xMQ;
                    CompositionLocalKt.rl(providedValueNr2, composableLambdaNr, composer2, i7 | 48);
                    if (function23 != null) {
                        ProvidedValue providedValueNr3 = ContentColorKt.n().nr(Color.xMQ(menuItemColors.t(z2)));
                        final Function2 function28 = function23;
                        CompositionLocalKt.rl(providedValueNr3, ComposableLambdaKt.nr(580312062, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$1$1.3
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(580312062, i8, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:507)");
                                }
                                Modifier modifierRl = SizeKt.rl(Modifier.INSTANCE, ListTokens.f29685n.XQ(), 0.0f, 2, null);
                                Function2 function29 = function28;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN2 = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierRl);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 function0N2 = companion2.n();
                                if (composer3.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer3.T();
                                if (composer3.getInserting()) {
                                    composer3.s7N(function0N2);
                                } else {
                                    composer3.r();
                                }
                                Composer composerN2 = Updater.n(composer3);
                                Updater.O(composerN2, measurePolicyUo, companion2.t());
                                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                                Function2 function2Rl2 = companion2.rl();
                                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                    composerN2.o(Integer.valueOf(iN2));
                                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                }
                                Updater.O(composerN2, modifierO2, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function29.invoke(composer3, 0);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer2, 54), composer2, i7 | 48);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, 48);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuItemContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    MenuKt.nr(function2, function0, modifier, function22, function23, z2, menuItemColors, paddingValues, mutableInteractionSource, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final float xMQ() {
        return nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long KN(IntRect intRect, IntRect intRect2) {
        float fMax;
        float fMax2 = 1.0f;
        if (intRect2.getLeft() < intRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String()) {
            if (intRect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() <= intRect.getLeft()) {
                fMax = 1.0f;
            } else if (intRect2.qie() == 0) {
                fMax = 0.0f;
            } else {
                fMax = (((Math.max(intRect.getLeft(), intRect2.getLeft()) + Math.min(intRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), intRect2.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String())) / 2) - intRect2.getLeft()) / intRect2.qie();
            }
        }
        if (intRect2.getTop() < intRect.getBottom()) {
            if (intRect2.getBottom() > intRect.getTop()) {
                if (intRect2.J2() == 0) {
                    fMax2 = 0.0f;
                } else {
                    fMax2 = (((Math.max(intRect.getTop(), intRect2.getTop()) + Math.min(intRect.getBottom(), intRect2.getBottom())) / 2) - intRect2.getTop()) / intRect2.J2();
                }
            }
        }
        return TransformOriginKt.n(fMax, fMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rl(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
