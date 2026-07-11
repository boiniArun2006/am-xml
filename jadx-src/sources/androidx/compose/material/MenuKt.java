package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a[\u0010\u0010\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ae\u0010\u001a\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"\"\u001a\u0010'\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010&\"\u0014\u0010)\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"\"\u001a\u0010+\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b*\u0010&\"\u0014\u0010-\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\"\"\u0014\u0010/\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\"\"\u0014\u00101\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\"¨\u00065²\u0006\f\u00103\u001a\u0002028\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u0002028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "", "expandedStates", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOriginState", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "enabled", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/RowScope;", "nr", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/IntRect;", "parentBounds", "menuBounds", "KN", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "Landroidx/compose/ui/unit/Dp;", "F", "MenuElevation", "rl", "mUb", "()F", "MenuVerticalMargin", "t", "DropdownMenuItemHorizontalPadding", "xMQ", "DropdownMenuVerticalPadding", "O", "DropdownMenuItemDefaultMinWidth", "J2", "DropdownMenuItemDefaultMaxWidth", "Uo", "DropdownMenuItemDefaultMinHeight", "", "scale", "alpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,388:1\n1969#2:389\n1966#2:390\n1884#2,7:391\n1969#2:398\n1966#2:399\n1884#2,7:400\n1247#3,6:407\n99#4:413\n96#4,6:414\n102#4:448\n106#4:452\n79#5,6:420\n86#5,4:435\n90#5,2:445\n94#5:451\n368#6,9:426\n377#6:447\n378#6,2:449\n4034#7,6:439\n85#8:453\n85#8:454\n149#9:455\n149#9:456\n149#9:457\n149#9:458\n149#9:459\n149#9:460\n149#9:461\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt\n*L\n162#1:389\n162#1:390\n162#1:391,7\n183#1:398\n183#1:399\n183#1:400,7\n204#1:407,6\n233#1:413\n233#1:414,6\n233#1:448\n233#1:452\n233#1:420,6\n233#1:435,4\n233#1:445,2\n233#1:451\n233#1:426,9\n233#1:447\n233#1:449,2\n233#1:439,6\n162#1:453\n183#1:454\n271#1:455\n272#1:456\n273#1:457\n274#1:458\n275#1:459\n276#1:460\n277#1:461\n*E\n"})
public final class MenuKt {
    private static final float Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f22182n;
    private static final float nr;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f22183t = Dp.KN(16);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f22181O = Dp.KN(112);
    private static final float J2 = Dp.KN(280);

    static {
        float f3 = 8;
        f22182n = Dp.KN(f3);
        float f4 = 48;
        rl = Dp.KN(f4);
        nr = Dp.KN(f3);
        Uo = Dp.KN(f4);
    }

    public static final float mUb() {
        return rl;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final MutableTransitionState mutableTransitionState, final MutableState mutableState, final ScrollState scrollState, Modifier modifier, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(435109845);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(mutableTransitionState) : composerKN.E2(mutableTransitionState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(mutableState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(scrollState) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerKN.E2(function3) ? 16384 : 8192;
            }
            if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
            } else {
                if (i7 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(435109845, i5, -1, "androidx.compose.material.DropdownMenuContent (Menu.kt:156)");
                }
                Transition transitionKN = TransitionKt.KN(mutableTransitionState, "DropDownMenu", composerKN, MutableTransitionState.nr | 48 | (i5 & 14), 0);
                MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$scale$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                        return n(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i8) {
                        TweenSpec tweenSpecTy;
                        composer2.eF(-800950068);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-800950068, i8, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:163)");
                        }
                        if (segment.t(Boolean.FALSE, Boolean.TRUE)) {
                            tweenSpecTy = AnimationSpecKt.ty(b.f61769v, 0, EasingKt.J2(), 2, null);
                        } else {
                            tweenSpecTy = AnimationSpecKt.ty(1, 74, null, 4, null);
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer2.Xw();
                        return tweenSpecTy;
                    }
                };
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                TwoWayConverter twoWayConverterXMQ = VectorConvertersKt.xMQ(floatCompanionObject);
                boolean zBooleanValue = ((Boolean) transitionKN.xMQ()).booleanValue();
                composerKN.eF(1652594929);
                if (ComposerKt.v()) {
                    ComposerKt.p5(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:172)");
                }
                float f3 = zBooleanValue ? 1.0f : 0.8f;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composerKN.Xw();
                Float fValueOf = Float.valueOf(f3);
                boolean zBooleanValue2 = ((Boolean) transitionKN.Ik()).booleanValue();
                composerKN.eF(1652594929);
                if (ComposerKt.v()) {
                    ComposerKt.p5(1652594929, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:172)");
                }
                float f4 = zBooleanValue2 ? 1.0f : 0.8f;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composerKN.Xw();
                final Modifier modifier4 = modifier2;
                final State stateJ2 = TransitionKt.J2(transitionKN, fValueOf, Float.valueOf(f4), menuKt$DropdownMenuContent$scale$2.invoke(transitionKN.HI(), composerKN, 0), twoWayConverterXMQ, "FloatAnimation", composerKN, 0);
                MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                        return n(segment, composer2, num.intValue());
                    }

                    public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i8) {
                        TweenSpec tweenSpecTy;
                        composer2.eF(-2065494304);
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-2065494304, i8, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:184)");
                        }
                        if (segment.t(Boolean.FALSE, Boolean.TRUE)) {
                            tweenSpecTy = AnimationSpecKt.ty(30, 0, null, 6, null);
                        } else {
                            tweenSpecTy = AnimationSpecKt.ty(75, 0, null, 6, null);
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        composer2.Xw();
                        return tweenSpecTy;
                    }
                };
                TwoWayConverter twoWayConverterXMQ2 = VectorConvertersKt.xMQ(floatCompanionObject);
                boolean zBooleanValue3 = ((Boolean) transitionKN.xMQ()).booleanValue();
                composerKN.eF(388050693);
                if (ComposerKt.v()) {
                    ComposerKt.p5(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:193)");
                }
                float f5 = zBooleanValue3 ? 1.0f : 0.0f;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composerKN.Xw();
                Float fValueOf2 = Float.valueOf(f5);
                boolean zBooleanValue4 = ((Boolean) transitionKN.Ik()).booleanValue();
                composerKN.eF(388050693);
                if (ComposerKt.v()) {
                    ComposerKt.p5(388050693, 0, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:193)");
                }
                float f6 = zBooleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composerKN.Xw();
                final State stateJ22 = TransitionKt.J2(transitionKN, fValueOf2, Float.valueOf(f6), menuKt$DropdownMenuContent$alpha$2.invoke(transitionKN.HI(), composerKN, 0), twoWayConverterXMQ2, "FloatAnimation", composerKN, 0);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zP5 = composerKN.p5(stateJ2) | composerKN.p5(stateJ22) | ((i5 & 112) == 32);
                Object objIF = composerKN.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$1$1
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
                            graphicsLayerScope.Uo(MenuKt.rl(stateJ2));
                            graphicsLayerScope.az(MenuKt.rl(stateJ2));
                            graphicsLayerScope.rl(MenuKt.t(stateJ22));
                            graphicsLayerScope.tUK(((TransformOrigin) mutableState.getValue()).getPackedValue());
                        }
                    };
                    composerKN.o(objIF);
                }
                CardKt.n(GraphicsLayerModifierKt.n(companion, (Function1) objIF), null, 0L, 0L, null, f22182n, ComposableLambdaKt.nr(895555282, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i8) {
                        if (!composer2.HI((i8 & 3) != 2, i8 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(895555282, i8, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:211)");
                        }
                        Modifier modifierUo = ScrollKt.Uo(IntrinsicKt.rl(PaddingKt.gh(modifier4, 0.0f, MenuKt.xMQ(), 1, null), IntrinsicSize.f17697t), scrollState, false, null, false, 14, null);
                        Function3 function32 = function3;
                        MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer2, 0);
                        int iN = ComposablesKt.n(composer2, 0);
                        CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer2, modifierUo);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion2.n();
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
                        Updater.O(composerN, measurePolicyN, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        function32.invoke(ColumnScopeInstance.f17468n, composer2, 6);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, 1769472, 30);
                composerKN = composerKN;
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuContent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i8) {
                        MenuKt.n(mutableTransitionState, mutableState, scrollState, modifier3, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        if ((i3 & 16) == 0) {
        }
        if (composerKN.HI((i5 & 9363) == 9362, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final Function0 function0, Modifier modifier, boolean z2, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        int i8;
        PaddingValues paddingValues2;
        int i9;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final PaddingValues paddingValuesN;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(87134531);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
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
                    i5 |= composerKN.n(z2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        paddingValues2 = paddingValues;
                        i5 |= composerKN.p5(paddingValues2) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            i5 |= composerKN.p5(mutableInteractionSource) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i5 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i5 |= composerKN.E2(function3) ? 131072 : 65536;
                        }
                        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                            Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            final boolean z4 = i7 != 0 ? true : z2;
                            paddingValuesN = i8 != 0 ? MenuDefaults.f22180n.n() : paddingValues2;
                            MutableInteractionSource mutableInteractionSource3 = i9 != 0 ? null : mutableInteractionSource;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(87134531, i5, -1, "androidx.compose.material.DropdownMenuItemContent (Menu.kt:230)");
                            }
                            Modifier modifierKN = PaddingKt.KN(SizeKt.aYN(SizeKt.KN(ClickableKt.nr(modifier4, mutableInteractionSource3, RippleKt.J2(true, 0.0f, 0L, 6, null), z4, null, null, function02, 24, null), 0.0f, 1, null), f22181O, Uo, J2, 0.0f, 8, null), paddingValuesN);
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
                            TextKt.n(MaterialTheme.f22169n.t(composerKN, 6).getSubtitle1(), ComposableLambdaKt.nr(1190489496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i11) {
                                    float fRl;
                                    if (!composer2.HI((i11 & 3) != 2, i11 & 1)) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1190489496, i11, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:253)");
                                    }
                                    if (z4) {
                                        composer2.eF(-186854702);
                                        fRl = ContentAlpha.f21745n.t(composer2, 6);
                                    } else {
                                        composer2.eF(-186853962);
                                        fRl = ContentAlpha.f21745n.rl(composer2, 6);
                                    }
                                    composer2.Xw();
                                    ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(fRl));
                                    final Function3 function32 = function3;
                                    final RowScope rowScope = rowScopeInstance;
                                    CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(-1705995688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i12) {
                                            if (!composer3.HI((i12 & 3) != 2, i12 & 1)) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1705995688, i12, -1, "androidx.compose.material.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:254)");
                                            }
                                            function32.invoke(rowScope, composer3, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer2, 54), composer2, ProvidedValue.xMQ | 48);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, 48);
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier3 = modifier4;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            z3 = z4;
                        } else {
                            composerKN.wTp();
                            z3 = z2;
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            paddingValuesN = paddingValues2;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MenuKt$DropdownMenuItemContent$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i11) {
                                    MenuKt.nr(function0, modifier3, z3, paddingValuesN, mutableInteractionSource2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 24576;
                    if ((i3 & 32) != 0) {
                    }
                    if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                paddingValues2 = paddingValues;
                i9 = i3 & 16;
                if (i9 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            paddingValues2 = paddingValues;
            i9 = i3 & 16;
            if (i9 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        paddingValues2 = paddingValues;
        i9 = i3 & 16;
        if (i9 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
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
