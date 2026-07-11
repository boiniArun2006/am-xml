package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aq\u0010\u0010\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aq\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001aq\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001a|\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u008e\u0001\u0010\u001d\u001a\u00020\u00012\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 \"\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 \"\u0014\u0010#\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 \"\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 \"\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "O", "nr", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "rl", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "text", "icon", "", "expanded", c.f62177j, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material3/FloatingActionButtonElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "F", "ExtendedFabStartIconPadding", "ExtendedFabEndIconPadding", "ExtendedFabTextPadding", "ExtendedFabMinimumWidth", "Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/ExitTransition;", "ExtendedFabCollapseAnimation", "Landroidx/compose/animation/EnterTransition;", "J2", "Landroidx/compose/animation/EnterTransition;", "ExtendedFabExpandAnimation", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,702:1\n1223#2,6:703\n148#3:709\n148#3:710\n148#3:711\n148#3:712\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonKt\n*L\n109#1:703,6\n660#1:709\n662#1:710\n664#1:711\n666#1:712\n*E\n"})
public final class FloatingActionButtonKt {
    private static final EnterTransition J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ExitTransition f25908O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f25909n = Dp.KN(16);
    private static final float rl = Dp.KN(12);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f25910t = Dp.KN(20);
    private static final float nr = Dp.KN(80);

    static {
        MotionTokens motionTokens = MotionTokens.f29694n;
        ExitTransition exitTransitionIk = EnterExitTransitionKt.Ik(AnimationSpecKt.ty(100, 0, motionTokens.t(), 2, null), 0.0f, 2, null);
        TweenSpec tweenSpecTy = AnimationSpecKt.ty(500, 0, motionTokens.n(), 2, null);
        Alignment.Companion companion = Alignment.INSTANCE;
        f25908O = exitTransitionIk.t(EnterExitTransitionKt.XQ(tweenSpecTy, companion.gh(), false, null, 12, null));
        J2 = EnterExitTransitionKt.HI(AnimationSpecKt.az(200, 100, motionTokens.t()), 0.0f, 2, null).t(EnterExitTransitionKt.xMQ(AnimationSpecKt.ty(500, 0, motionTokens.n(), 2, null), companion.gh(), false, null, 12, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Function0 function0, Modifier modifier, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        Shape shape2;
        long j4;
        long j5;
        FloatingActionButtonElevation floatingActionButtonElevationN;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        Shape shapeJ2;
        int i8;
        long jRl;
        long j6;
        long j7;
        int i9;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        long j9;
        final Modifier modifier3;
        Composer composer2;
        final Shape shape4;
        final long j10;
        final long j11;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1444748300);
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
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    shape2 = shape;
                    int i11 = composerKN.p5(shape2) ? 256 : 128;
                    i5 |= i11;
                } else {
                    shape2 = shape;
                }
                i5 |= i11;
            } else {
                shape2 = shape;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i5 |= ((i3 & 8) == 0 && composerKN.nr(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if ((i2 & 24576) != 0) {
                j5 = j3;
                i5 |= ((i3 & 16) == 0 && composerKN.nr(j5)) ? 16384 : 8192;
            } else {
                j5 = j3;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    floatingActionButtonElevationN = floatingActionButtonElevation;
                    int i12 = composerKN.p5(floatingActionButtonElevationN) ? 131072 : 65536;
                    i5 |= i12;
                } else {
                    floatingActionButtonElevationN = floatingActionButtonElevation;
                }
                i5 |= i12;
            } else {
                floatingActionButtonElevationN = floatingActionButtonElevation;
            }
            i7 = i3 & 64;
            if (i7 == 0) {
                i5 |= 1572864;
            } else {
                if ((1572864 & i2) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i5 |= composerKN.p5(mutableInteractionSource2) ? 1048576 : 524288;
                }
                if ((i3 & 128) == 0) {
                    if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.E2(function2) ? 8388608 : 4194304;
                    }
                    if ((i5 & 4793491) == 4793490 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 4) == 0) {
                                i5 &= -897;
                                shapeJ2 = FloatingActionButtonDefaults.f25883n.J2(composerKN, 6);
                            } else {
                                shapeJ2 = shape2;
                            }
                            if ((i3 & 8) == 0) {
                                i8 = i5 & (-7169);
                                jRl = FloatingActionButtonDefaults.f25883n.rl(composerKN, 6);
                            } else {
                                i8 = i5;
                                jRl = j4;
                            }
                            if ((i3 & 16) != 0) {
                                long jT2 = ColorSchemeKt.t(jRl, composerKN, (i8 >> 9) & 14);
                                i8 &= -57345;
                                j5 = jT2;
                            }
                            int i13 = i8;
                            if ((i3 & 32) == 0) {
                                j6 = jRl;
                                floatingActionButtonElevationN = FloatingActionButtonDefaults.f25883n.n(0.0f, 0.0f, 0.0f, 0.0f, composerKN, 24576, 15);
                                i5 = i13 & (-458753);
                            } else {
                                j6 = jRl;
                                i5 = i13;
                            }
                            if (i7 == 0) {
                                modifier2 = modifier4;
                                shape3 = shapeJ2;
                                j7 = j6;
                                i9 = 1444748300;
                                mutableInteractionSource3 = null;
                                floatingActionButtonElevation2 = floatingActionButtonElevationN;
                            } else {
                                modifier2 = modifier4;
                                j7 = j6;
                                i9 = 1444748300;
                                floatingActionButtonElevation2 = floatingActionButtonElevationN;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shapeJ2;
                            }
                            j9 = j5;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            floatingActionButtonElevation2 = floatingActionButtonElevationN;
                            j7 = j4;
                            j9 = j5;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i9 = 1444748300;
                            shape3 = shape2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(i9, i5, -1, "androidx.compose.material3.SmallFloatingActionButton (FloatingActionButton.kt:176)");
                        }
                        FabPrimarySmallTokens fabPrimarySmallTokens = FabPrimarySmallTokens.f29525n;
                        t(function02, SizeKt.aYN(modifier2, fabPrimarySmallTokens.t(), fabPrimarySmallTokens.n(), 0.0f, 0.0f, 12, null), shape3, j7, j9, floatingActionButtonElevation2, mutableInteractionSource3, function2, composerKN, i5 & 33554318, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier2;
                        composer2 = composerKN;
                        shape4 = shape3;
                        j10 = j7;
                        j11 = j9;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        shape4 = shape2;
                        composer2 = composerKN;
                        floatingActionButtonElevation3 = floatingActionButtonElevationN;
                        j10 = j4;
                        j11 = j5;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$SmallFloatingActionButton$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i14) {
                                FloatingActionButtonKt.O(function0, modifier3, shape4, j10, j11, floatingActionButtonElevation3, mutableInteractionSource4, function2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 12582912;
                if ((i5 & 4793491) == 4793490) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i10 == 0) {
                        }
                        if ((i3 & 4) == 0) {
                        }
                        if ((i3 & 8) == 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        int i132 = i8;
                        if ((i3 & 32) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        j9 = j5;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        FabPrimarySmallTokens fabPrimarySmallTokens2 = FabPrimarySmallTokens.f29525n;
                        t(function02, SizeKt.aYN(modifier2, fabPrimarySmallTokens2.t(), fabPrimarySmallTokens2.n(), 0.0f, 0.0f, 12, null), shape3, j7, j9, floatingActionButtonElevation2, mutableInteractionSource3, function2, composerKN, i5 & 33554318, 0);
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier2;
                        composer2 = composerKN;
                        shape4 = shape3;
                        j10 = j7;
                        j11 = j9;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 128) == 0) {
            }
            if ((i5 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 128) == 0) {
        }
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function2 function2, final Function2 function22, final Function0 function0, Modifier modifier, boolean z2, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i5;
        Function0 function02;
        Modifier modifier2;
        int i7;
        final boolean z3;
        Shape shapeT;
        long jRl;
        int i8;
        FloatingActionButtonElevation floatingActionButtonElevationN;
        int i9;
        long jT2;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        long j4;
        long j5;
        final boolean z4;
        final Modifier modifier3;
        final Shape shape3;
        final long j6;
        final long j7;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1387401842);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function22) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function02) ? 256 : 128;
            }
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        shapeT = shape;
                        int i11 = composerKN.p5(shapeT) ? 131072 : 65536;
                        i5 |= i11;
                    } else {
                        shapeT = shape;
                    }
                    i5 |= i11;
                } else {
                    shapeT = shape;
                }
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        jRl = j2;
                        int i12 = composerKN.nr(jRl) ? 1048576 : 524288;
                        i5 |= i12;
                    } else {
                        jRl = j2;
                    }
                    i5 |= i12;
                } else {
                    jRl = j2;
                }
                if ((i2 & 12582912) == 0) {
                    i8 = 12582912;
                    i5 |= ((i3 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304;
                } else {
                    i8 = 12582912;
                }
                if ((i2 & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        floatingActionButtonElevationN = floatingActionButtonElevation;
                        int i13 = composerKN.p5(floatingActionButtonElevationN) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        i5 |= i13;
                    } else {
                        floatingActionButtonElevationN = floatingActionButtonElevation;
                    }
                    i5 |= i13;
                } else {
                    floatingActionButtonElevationN = floatingActionButtonElevation;
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                    if ((805306368 & i2) == 0) {
                        i5 |= composerKN.p5(mutableInteractionSource) ? 536870912 : 268435456;
                    }
                    if ((i5 & 306783379) == 306783378 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                                shapeT = FloatingActionButtonDefaults.f25883n.t(composerKN, 6);
                            }
                            if ((i3 & 64) != 0) {
                                jRl = FloatingActionButtonDefaults.f25883n.rl(composerKN, 6);
                                i5 &= -3670017;
                            }
                            if ((i3 & 128) == 0) {
                                jT2 = ColorSchemeKt.t(jRl, composerKN, (i5 >> 18) & 14);
                                i5 &= -29360129;
                            } else {
                                jT2 = j3;
                            }
                            if ((i3 & 256) != 0) {
                                i5 &= -234881025;
                                floatingActionButtonElevationN = FloatingActionButtonDefaults.f25883n.n(0.0f, 0.0f, 0.0f, 0.0f, composerKN, 24576, 15);
                            }
                            mutableInteractionSource2 = i9 == 0 ? null : mutableInteractionSource;
                            shape2 = shapeT;
                            floatingActionButtonElevation2 = floatingActionButtonElevationN;
                            j4 = jT2;
                            j5 = jRl;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i5 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i5 &= -234881025;
                            }
                            j4 = j3;
                            mutableInteractionSource2 = mutableInteractionSource;
                            shape2 = shapeT;
                            j5 = jRl;
                            floatingActionButtonElevation2 = floatingActionButtonElevationN;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1387401842, i5, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:364)");
                        }
                        int i14 = i5 >> 6;
                        int i15 = i5 >> 9;
                        Modifier modifier4 = modifier2;
                        t(function02, modifier4, shape2, j5, j4, floatingActionButtonElevation2, mutableInteractionSource2, ComposableLambdaKt.nr(1172118032, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i16) {
                                if ((i16 & 3) == 2 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1172118032, i16, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:374)");
                                }
                                Modifier modifierAz = PaddingKt.az(SizeKt.aYN(Modifier.INSTANCE, z3 ? FloatingActionButtonKt.nr : FabPrimaryTokens.f29529n.O(), 0.0f, 0.0f, 0.0f, 14, null), z3 ? FloatingActionButtonKt.f25909n : Dp.KN(0), 0.0f, z3 ? FloatingActionButtonKt.f25910t : Dp.KN(0), 0.0f, 10, null);
                                Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                Arrangement.Horizontal horizontalJ2 = z3 ? Arrangement.f17400n.J2() : Arrangement.f17400n.rl();
                                Function2 function23 = function22;
                                boolean z5 = z3;
                                final Function2 function24 = function2;
                                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, verticalXMQ, composer2, 48);
                                int iN = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierAz);
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
                                Updater.O(composerN, measurePolicyRl, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                Function2 function2Rl = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                function23.invoke(composer2, 0);
                                AnimatedVisibilityKt.xMQ(rowScopeInstance, z5, null, FloatingActionButtonKt.J2, FloatingActionButtonKt.f25908O, null, ComposableLambdaKt.nr(176242764, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                        n(animatedVisibilityScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i17) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(176242764, i17, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:394)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Modifier modifierN = SemanticsModifierKt.n(companion2, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1.1
                                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                n(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }
                                        });
                                        Function2 function25 = function24;
                                        MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composer3, 0);
                                        int iN2 = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierN);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0 function0N2 = companion3.n();
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
                                        Updater.O(composerN2, measurePolicyRl2, companion3.t());
                                        Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                                        Function2 function2Rl2 = companion3.rl();
                                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                            composerN2.o(Integer.valueOf(iN2));
                                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                        }
                                        Updater.O(composerN2, modifierO2, companion3.nr());
                                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                                        SpacerKt.n(SizeKt.ViF(companion2, FloatingActionButtonKt.rl), composer3, 6);
                                        function25.invoke(composer3, 0);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), composer2, 1600518, 18);
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (i14 & 112) | (i14 & 14) | i8 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016), 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        z4 = z3;
                        modifier3 = modifier4;
                        shape3 = shape2;
                        j6 = j5;
                        j7 = j4;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        z4 = z3;
                        shape3 = shapeT;
                        j6 = jRl;
                        floatingActionButtonElevation3 = floatingActionButtonElevationN;
                        j7 = j3;
                        mutableInteractionSource3 = mutableInteractionSource;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i16) {
                                FloatingActionButtonKt.n(function2, function22, function0, modifier3, z4, shape3, j6, j7, floatingActionButtonElevation3, mutableInteractionSource3, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                if ((i5 & 306783379) == 306783378) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i10 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 32) != 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                        if ((i3 & 256) != 0) {
                        }
                        if (i9 == 0) {
                        }
                        shape2 = shapeT;
                        floatingActionButtonElevation2 = floatingActionButtonElevationN;
                        j4 = jT2;
                        j5 = jRl;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        int i142 = i5 >> 6;
                        int i152 = i5 >> 9;
                        Modifier modifier42 = modifier2;
                        t(function02, modifier42, shape2, j5, j4, floatingActionButtonElevation2, mutableInteractionSource2, ComposableLambdaKt.nr(1172118032, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                n(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer2, int i16) {
                                if ((i16 & 3) == 2 && composer2.xMQ()) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1172118032, i16, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:374)");
                                }
                                Modifier modifierAz = PaddingKt.az(SizeKt.aYN(Modifier.INSTANCE, z3 ? FloatingActionButtonKt.nr : FabPrimaryTokens.f29529n.O(), 0.0f, 0.0f, 0.0f, 14, null), z3 ? FloatingActionButtonKt.f25909n : Dp.KN(0), 0.0f, z3 ? FloatingActionButtonKt.f25910t : Dp.KN(0), 0.0f, 10, null);
                                Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                Arrangement.Horizontal horizontalJ2 = z3 ? Arrangement.f17400n.J2() : Arrangement.f17400n.rl();
                                Function2 function23 = function22;
                                boolean z5 = z3;
                                final Function2 function24 = function2;
                                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, verticalXMQ, composer2, 48);
                                int iN = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierAz);
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
                                Updater.O(composerN, measurePolicyRl, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                Function2 function2Rl = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                function23.invoke(composer2, 0);
                                AnimatedVisibilityKt.xMQ(rowScopeInstance, z5, null, FloatingActionButtonKt.J2, FloatingActionButtonKt.f25908O, null, ComposableLambdaKt.nr(176242764, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                        n(animatedVisibilityScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i17) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(176242764, i17, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:394)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Modifier modifierN = SemanticsModifierKt.n(companion2, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$3$1$1.1
                                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                n(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }
                                        });
                                        Function2 function25 = function24;
                                        MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composer3, 0);
                                        int iN2 = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierN);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0 function0N2 = companion3.n();
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
                                        Updater.O(composerN2, measurePolicyRl2, companion3.t());
                                        Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                                        Function2 function2Rl2 = companion3.rl();
                                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                            composerN2.o(Integer.valueOf(iN2));
                                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                        }
                                        Updater.O(composerN2, modifierO2, companion3.nr());
                                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                                        SpacerKt.n(SizeKt.ViF(companion2, FloatingActionButtonKt.rl), composer3, 6);
                                        function25.invoke(composer3, 0);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), composer2, 1600518, 18);
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (i142 & 112) | (i142 & 14) | i8 | (i152 & 896) | (i152 & 7168) | (57344 & i152) | (458752 & i152) | (i152 & 3670016), 0);
                        if (ComposerKt.v()) {
                        }
                        z4 = z3;
                        modifier3 = modifier42;
                        shape3 = shape2;
                        j6 = j5;
                        j7 = j4;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final Function0 function0, Modifier modifier, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        Shape shape2;
        long j4;
        long j5;
        FloatingActionButtonElevation floatingActionButtonElevationN;
        int i7;
        MutableInteractionSource mutableInteractionSource2;
        Shape shapeNr;
        int i8;
        long jRl;
        long j6;
        long j7;
        int i9;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        long j9;
        final Modifier modifier3;
        Composer composer2;
        final Shape shape4;
        final long j10;
        final long j11;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1650866856);
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
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    shape2 = shape;
                    int i11 = composerKN.p5(shape2) ? 256 : 128;
                    i5 |= i11;
                } else {
                    shape2 = shape;
                }
                i5 |= i11;
            } else {
                shape2 = shape;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i5 |= ((i3 & 8) == 0 && composerKN.nr(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if ((i2 & 24576) != 0) {
                j5 = j3;
                i5 |= ((i3 & 16) == 0 && composerKN.nr(j5)) ? 16384 : 8192;
            } else {
                j5 = j3;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    floatingActionButtonElevationN = floatingActionButtonElevation;
                    int i12 = composerKN.p5(floatingActionButtonElevationN) ? 131072 : 65536;
                    i5 |= i12;
                } else {
                    floatingActionButtonElevationN = floatingActionButtonElevation;
                }
                i5 |= i12;
            } else {
                floatingActionButtonElevationN = floatingActionButtonElevation;
            }
            i7 = i3 & 64;
            if (i7 == 0) {
                i5 |= 1572864;
            } else {
                if ((1572864 & i2) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i5 |= composerKN.p5(mutableInteractionSource2) ? 1048576 : 524288;
                }
                if ((i3 & 128) == 0) {
                    if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.E2(function2) ? 8388608 : 4194304;
                    }
                    if ((i5 & 4793491) == 4793490 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 4) == 0) {
                                i5 &= -897;
                                shapeNr = FloatingActionButtonDefaults.f25883n.nr(composerKN, 6);
                            } else {
                                shapeNr = shape2;
                            }
                            if ((i3 & 8) == 0) {
                                i8 = i5 & (-7169);
                                jRl = FloatingActionButtonDefaults.f25883n.rl(composerKN, 6);
                            } else {
                                i8 = i5;
                                jRl = j4;
                            }
                            if ((i3 & 16) != 0) {
                                long jT2 = ColorSchemeKt.t(jRl, composerKN, (i8 >> 9) & 14);
                                i8 &= -57345;
                                j5 = jT2;
                            }
                            int i13 = i8;
                            if ((i3 & 32) == 0) {
                                j6 = jRl;
                                floatingActionButtonElevationN = FloatingActionButtonDefaults.f25883n.n(0.0f, 0.0f, 0.0f, 0.0f, composerKN, 24576, 15);
                                i5 = i13 & (-458753);
                            } else {
                                j6 = jRl;
                                i5 = i13;
                            }
                            if (i7 == 0) {
                                modifier2 = modifier4;
                                shape3 = shapeNr;
                                j7 = j6;
                                i9 = -1650866856;
                                mutableInteractionSource3 = null;
                                floatingActionButtonElevation2 = floatingActionButtonElevationN;
                            } else {
                                modifier2 = modifier4;
                                j7 = j6;
                                i9 = -1650866856;
                                floatingActionButtonElevation2 = floatingActionButtonElevationN;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shapeNr;
                            }
                            j9 = j5;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            floatingActionButtonElevation2 = floatingActionButtonElevationN;
                            j7 = j4;
                            j9 = j5;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i9 = -1650866856;
                            shape3 = shape2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(i9, i5, -1, "androidx.compose.material3.LargeFloatingActionButton (FloatingActionButton.kt:232)");
                        }
                        FabPrimaryLargeTokens fabPrimaryLargeTokens = FabPrimaryLargeTokens.f29521n;
                        t(function02, SizeKt.aYN(modifier2, fabPrimaryLargeTokens.t(), fabPrimaryLargeTokens.n(), 0.0f, 0.0f, 12, null), shape3, j7, j9, floatingActionButtonElevation2, mutableInteractionSource3, function2, composerKN, i5 & 33554318, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier2;
                        composer2 = composerKN;
                        shape4 = shape3;
                        j10 = j7;
                        j11 = j9;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        composerKN.wTp();
                        modifier3 = modifier2;
                        shape4 = shape2;
                        composer2 = composerKN;
                        floatingActionButtonElevation3 = floatingActionButtonElevationN;
                        j10 = j4;
                        j11 = j5;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$LargeFloatingActionButton$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i14) {
                                FloatingActionButtonKt.nr(function0, modifier3, shape4, j10, j11, floatingActionButtonElevation3, mutableInteractionSource4, function2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 12582912;
                if ((i5 & 4793491) == 4793490) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i10 == 0) {
                        }
                        if ((i3 & 4) == 0) {
                        }
                        if ((i3 & 8) == 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        int i132 = i8;
                        if ((i3 & 32) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        j9 = j5;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        FabPrimaryLargeTokens fabPrimaryLargeTokens2 = FabPrimaryLargeTokens.f29521n;
                        t(function02, SizeKt.aYN(modifier2, fabPrimaryLargeTokens2.t(), fabPrimaryLargeTokens2.n(), 0.0f, 0.0f, 12, null), shape3, j7, j9, floatingActionButtonElevation2, mutableInteractionSource3, function2, composerKN, i5 & 33554318, 0);
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier2;
                        composer2 = composerKN;
                        shape4 = shape3;
                        j10 = j7;
                        j11 = j9;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 128) == 0) {
            }
            if ((i5 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 128) == 0) {
        }
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function0 function0, Modifier modifier, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        Shape shape2;
        long j4;
        long j5;
        FloatingActionButtonElevation floatingActionButtonElevationN;
        int i7;
        Shape shapeT;
        int i8;
        long jRl;
        long j6;
        Shape shape3;
        long j7;
        Modifier modifier3;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i9;
        long j9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier4;
        final Shape shape4;
        final long j10;
        final long j11;
        final FloatingActionButtonElevation floatingActionButtonElevation3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-326283107);
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
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    shape2 = shape;
                    int i12 = composerKN.p5(shape2) ? 256 : 128;
                    i5 |= i12;
                } else {
                    shape2 = shape;
                }
                i5 |= i12;
            } else {
                shape2 = shape;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i5 |= ((i3 & 8) == 0 && composerKN.nr(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if ((i2 & 24576) != 0) {
                j5 = j3;
                i5 |= ((i3 & 16) == 0 && composerKN.nr(j5)) ? 16384 : 8192;
            } else {
                j5 = j3;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    floatingActionButtonElevationN = floatingActionButtonElevation;
                    int i13 = composerKN.p5(floatingActionButtonElevationN) ? 131072 : 65536;
                    i5 |= i13;
                } else {
                    floatingActionButtonElevationN = floatingActionButtonElevation;
                }
                i5 |= i13;
            } else {
                floatingActionButtonElevationN = floatingActionButtonElevation;
            }
            i7 = i3 & 64;
            if (i7 == 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i5 |= composerKN.p5(mutableInteractionSource) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i5 |= composerKN.E2(function3) ? 8388608 : 4194304;
            }
            if ((4793491 & i5) == 4793490 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) == 0) {
                        i5 &= -897;
                        shapeT = FloatingActionButtonDefaults.f25883n.t(composerKN, 6);
                    } else {
                        shapeT = shape2;
                    }
                    if ((i3 & 8) == 0) {
                        i8 = i5 & (-7169);
                        jRl = FloatingActionButtonDefaults.f25883n.rl(composerKN, 6);
                    } else {
                        i8 = i5;
                        jRl = j4;
                    }
                    if ((i3 & 16) != 0) {
                        long jT2 = ColorSchemeKt.t(jRl, composerKN, (i8 >> 9) & 14);
                        i8 &= -57345;
                        j5 = jT2;
                    }
                    int i14 = i8;
                    if ((i3 & 32) == 0) {
                        j6 = jRl;
                        floatingActionButtonElevationN = FloatingActionButtonDefaults.f25883n.n(0.0f, 0.0f, 0.0f, 0.0f, composerKN, 24576, 15);
                        i5 = i14 & (-458753);
                    } else {
                        j6 = jRl;
                        i5 = i14;
                    }
                    if (i7 == 0) {
                        shape3 = shapeT;
                        j7 = j5;
                        long j12 = j6;
                        mutableInteractionSource2 = null;
                        i9 = 12582912;
                        j9 = j12;
                        modifier3 = modifier5;
                        floatingActionButtonElevation2 = floatingActionButtonElevationN;
                        i10 = -326283107;
                    } else {
                        shape3 = shapeT;
                        j7 = j5;
                        modifier3 = modifier5;
                        floatingActionButtonElevation2 = floatingActionButtonElevationN;
                        i9 = 12582912;
                        j9 = j6;
                        i10 = -326283107;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    floatingActionButtonElevation2 = floatingActionButtonElevationN;
                    j7 = j5;
                    i9 = 12582912;
                    i10 = -326283107;
                    modifier3 = modifier2;
                    shape3 = shape2;
                    j9 = j4;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(i10, i5, -1, "androidx.compose.material3.ExtendedFloatingActionButton (FloatingActionButton.kt:291)");
                }
                t(function02, modifier3, shape3, j9, j7, floatingActionButtonElevation2, mutableInteractionSource2, ComposableLambdaKt.nr(398457247, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i15) {
                        if ((i15 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(398457247, i15, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:301)");
                        }
                        Modifier modifierGh = PaddingKt.gh(SizeKt.aYN(Modifier.INSTANCE, FloatingActionButtonKt.nr, 0.0f, 0.0f, 0.0f, 14, null), FloatingActionButtonKt.f25910t, 0.0f, 2, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                        Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                        Function3 function32 = function3;
                        MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, verticalXMQ, composer3, 54);
                        int iN = ComposablesKt.n(composer3, 0);
                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierGh);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion.n();
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
                        Updater.O(composerN, measurePolicyRl, companion.t());
                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                        Function2 function2Rl = companion.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion.nr());
                        function32.invoke(RowScopeInstance.f17780n, composer3, 6);
                        composer3.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, (i5 & 14) | i9 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer2 = composerKN;
                modifier4 = modifier3;
                shape4 = shape3;
                j10 = j9;
                j11 = j7;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerKN.wTp();
                mutableInteractionSource3 = mutableInteractionSource;
                modifier4 = modifier2;
                shape4 = shape2;
                composer2 = composerKN;
                floatingActionButtonElevation3 = floatingActionButtonElevationN;
                j10 = j4;
                j11 = j5;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i15) {
                        FloatingActionButtonKt.rl(function0, modifier4, shape4, j10, j11, floatingActionButtonElevation3, mutableInteractionSource3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((4793491 & i5) == 4793490) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i11 == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                if ((i3 & 16) != 0) {
                }
                int i142 = i8;
                if ((i3 & 32) == 0) {
                }
                if (i7 == 0) {
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                t(function02, modifier3, shape3, j9, j7, floatingActionButtonElevation2, mutableInteractionSource2, ComposableLambdaKt.nr(398457247, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$ExtendedFloatingActionButton$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i15) {
                        if ((i15 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(398457247, i15, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:301)");
                        }
                        Modifier modifierGh = PaddingKt.gh(SizeKt.aYN(Modifier.INSTANCE, FloatingActionButtonKt.nr, 0.0f, 0.0f, 0.0f, 14, null), FloatingActionButtonKt.f25910t, 0.0f, 2, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                        Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                        Function3 function32 = function3;
                        MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, verticalXMQ, composer3, 54);
                        int iN = ComposablesKt.n(composer3, 0);
                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierGh);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0 function0N = companion.n();
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
                        Updater.O(composerN, measurePolicyRl, companion.t());
                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                        Function2 function2Rl = companion.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion.nr());
                        function32.invoke(RowScopeInstance.f17780n, composer3, 6);
                        composer3.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, (i5 & 14) | i9 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 0);
                if (ComposerKt.v()) {
                }
                composer2 = composerKN;
                modifier4 = modifier3;
                shape4 = shape3;
                j10 = j9;
                j11 = j7;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Function0 function0, Modifier modifier, Shape shape, long j2, long j3, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        Shape shape2;
        long j4;
        final long j5;
        FloatingActionButtonElevation floatingActionButtonElevationN;
        int i7;
        Shape shapeO;
        int i8;
        long jRl;
        Modifier modifier3;
        long j6;
        MutableInteractionSource mutableInteractionSource2;
        int i9;
        int i10;
        Shape shape3;
        long j7;
        int i11;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        final MutableInteractionSource mutableInteractionSource5;
        final Modifier modifier4;
        final FloatingActionButtonElevation floatingActionButtonElevation2;
        Composer composer2;
        final Shape shape4;
        final long j9;
        final long j10;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-731723913);
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
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    shape2 = shape;
                    int i13 = composerKN.p5(shape2) ? 256 : 128;
                    i5 |= i13;
                } else {
                    shape2 = shape;
                }
                i5 |= i13;
            } else {
                shape2 = shape;
            }
            if ((i2 & 3072) != 0) {
                j4 = j2;
                i5 |= ((i3 & 8) == 0 && composerKN.nr(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if ((i2 & 24576) != 0) {
                j5 = j3;
                i5 |= ((i3 & 16) == 0 && composerKN.nr(j5)) ? 16384 : 8192;
            } else {
                j5 = j3;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    floatingActionButtonElevationN = floatingActionButtonElevation;
                    int i14 = composerKN.p5(floatingActionButtonElevationN) ? 131072 : 65536;
                    i5 |= i14;
                } else {
                    floatingActionButtonElevationN = floatingActionButtonElevation;
                }
                i5 |= i14;
            } else {
                floatingActionButtonElevationN = floatingActionButtonElevation;
            }
            i7 = i3 & 64;
            if (i7 == 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i5 |= composerKN.p5(mutableInteractionSource) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i5 |= composerKN.E2(function2) ? 8388608 : 4194304;
            }
            if ((4793491 & i5) == 4793490 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 4) == 0) {
                        i5 &= -897;
                        shapeO = FloatingActionButtonDefaults.f25883n.O(composerKN, 6);
                    } else {
                        shapeO = shape2;
                    }
                    if ((i3 & 8) == 0) {
                        i8 = i5 & (-7169);
                        jRl = FloatingActionButtonDefaults.f25883n.rl(composerKN, 6);
                    } else {
                        i8 = i5;
                        jRl = j4;
                    }
                    if ((i3 & 16) != 0) {
                        long jT2 = ColorSchemeKt.t(jRl, composerKN, (i8 >> 9) & 14);
                        i8 &= -57345;
                        j5 = jT2;
                    }
                    int i15 = i8;
                    if ((i3 & 32) == 0) {
                        j6 = jRl;
                        modifier3 = modifier5;
                        mutableInteractionSource2 = null;
                        floatingActionButtonElevationN = FloatingActionButtonDefaults.f25883n.n(0.0f, 0.0f, 0.0f, 0.0f, composerKN, 24576, 15);
                        i9 = i15 & (-458753);
                    } else {
                        modifier3 = modifier5;
                        j6 = jRl;
                        mutableInteractionSource2 = null;
                        i9 = i15;
                    }
                    modifier2 = modifier3;
                    i10 = i9;
                    shape3 = shapeO;
                    j7 = j6;
                    i11 = -731723913;
                    if (i7 == 0) {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(i11, i10, -1, "androidx.compose.material3.FloatingActionButton (FloatingActionButton.kt:106)");
                    }
                    composerKN.eF(519755085);
                    if (mutableInteractionSource3 == null) {
                        Object objIF = composerKN.iF();
                        if (objIF == Composer.INSTANCE.n()) {
                            objIF = InteractionSourceKt.n();
                            composerKN.o(objIF);
                        }
                        mutableInteractionSource4 = (MutableInteractionSource) objIF;
                    } else {
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    composerKN.Xw();
                    int i16 = i10 & 14;
                    int i17 = i10 << 3;
                    long j11 = j5;
                    SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                        }
                    }, 1, mutableInteractionSource2), false, shape3, j7, j11, floatingActionButtonElevationN.getDefaultElevation(), ((Dp) floatingActionButtonElevationN.J2(mutableInteractionSource4, composerKN, (i10 >> 12) & 112).getValue()).getValue(), null, mutableInteractionSource4, ComposableLambdaKt.nr(1249316354, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i18) {
                            if ((i18 & 3) == 2 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1249316354, i18, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:119)");
                            }
                            long j12 = j5;
                            TextStyle textStyleT = TypographyKt.t(ExtendedFabPrimaryTokens.f29516n.rl(), composer3, 6);
                            final Function2 function22 = function2;
                            ProvideContentColorTextStyleKt.n(j12, textStyleT, ComposableLambdaKt.nr(-1771489750, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    n(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer4, int i19) {
                                    if ((i19 & 3) == 2 && composer4.xMQ()) {
                                        composer4.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1771489750, i19, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:123)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    FabPrimaryTokens fabPrimaryTokens = FabPrimaryTokens.f29529n;
                                    Modifier modifierN = SizeKt.n(companion, fabPrimaryTokens.O(), fabPrimaryTokens.t());
                                    Alignment alignmentO = Alignment.INSTANCE.O();
                                    Function2 function23 = function22;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                    int iN = ComposablesKt.n(composer4, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer4, modifierN);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion2.n();
                                    if (composer4.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer4.T();
                                    if (composer4.getInserting()) {
                                        composer4.s7N(function0N);
                                    } else {
                                        composer4.r();
                                    }
                                    Composer composerN = Updater.n(composer4);
                                    Updater.O(composerN, measurePolicyUo, companion2.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                    Function2 function2Rl = companion2.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion2.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    function23.invoke(composer4, 0);
                                    composer4.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer3, 54), composer3, RendererCapabilities.DECODER_SUPPORT_MASK);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composerKN, i16 | (i17 & 7168) | (57344 & i17) | (i17 & 458752), 6, 260);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    mutableInteractionSource5 = mutableInteractionSource3;
                    modifier4 = modifier2;
                    floatingActionButtonElevation2 = floatingActionButtonElevationN;
                    composer2 = composerKN;
                    shape4 = shape3;
                    j9 = j7;
                    j10 = j11;
                } else {
                    composerKN.wTp();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i5 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                    }
                    i10 = i5;
                    shape3 = shape2;
                    j7 = j4;
                    mutableInteractionSource2 = null;
                    i11 = -731723913;
                }
                mutableInteractionSource3 = mutableInteractionSource;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                composerKN.eF(519755085);
                if (mutableInteractionSource3 == null) {
                }
                composerKN.Xw();
                int i162 = i10 & 14;
                int i172 = i10 << 3;
                long j112 = j5;
                SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                    }
                }, 1, mutableInteractionSource2), false, shape3, j7, j112, floatingActionButtonElevationN.getDefaultElevation(), ((Dp) floatingActionButtonElevationN.J2(mutableInteractionSource4, composerKN, (i10 >> 12) & 112).getValue()).getValue(), null, mutableInteractionSource4, ComposableLambdaKt.nr(1249316354, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i18) {
                        if ((i18 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1249316354, i18, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:119)");
                        }
                        long j12 = j5;
                        TextStyle textStyleT = TypographyKt.t(ExtendedFabPrimaryTokens.f29516n.rl(), composer3, 6);
                        final Function2 function22 = function2;
                        ProvideContentColorTextStyleKt.n(j12, textStyleT, ComposableLambdaKt.nr(-1771489750, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer4, int i19) {
                                if ((i19 & 3) == 2 && composer4.xMQ()) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1771489750, i19, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:123)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                FabPrimaryTokens fabPrimaryTokens = FabPrimaryTokens.f29529n;
                                Modifier modifierN = SizeKt.n(companion, fabPrimaryTokens.O(), fabPrimaryTokens.t());
                                Alignment alignmentO = Alignment.INSTANCE.O();
                                Function2 function23 = function22;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                int iN = ComposablesKt.n(composer4, 0);
                                CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer4, modifierN);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion2.n();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer4.T();
                                if (composer4.getInserting()) {
                                    composer4.s7N(function0N);
                                } else {
                                    composer4.r();
                                }
                                Composer composerN = Updater.n(composer4);
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function23.invoke(composer4, 0);
                                composer4.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer3, 54), composer3, RendererCapabilities.DECODER_SUPPORT_MASK);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, i162 | (i172 & 7168) | (57344 & i172) | (i172 & 458752), 6, 260);
                if (ComposerKt.v()) {
                }
                mutableInteractionSource5 = mutableInteractionSource3;
                modifier4 = modifier2;
                floatingActionButtonElevation2 = floatingActionButtonElevationN;
                composer2 = composerKN;
                shape4 = shape3;
                j9 = j7;
                j10 = j112;
            } else {
                composerKN.wTp();
                mutableInteractionSource5 = mutableInteractionSource;
                modifier4 = modifier2;
                shape4 = shape2;
                composer2 = composerKN;
                floatingActionButtonElevation2 = floatingActionButtonElevationN;
                j9 = j4;
                j10 = j5;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i18) {
                        FloatingActionButtonKt.t(function0, modifier4, shape4, j9, j10, floatingActionButtonElevation2, mutableInteractionSource5, function2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((4793491 & i5) == 4793490) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i12 == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                if ((i3 & 16) != 0) {
                }
                int i152 = i8;
                if ((i3 & 32) == 0) {
                }
                modifier2 = modifier3;
                i10 = i9;
                shape3 = shapeO;
                j7 = j6;
                i11 = -731723913;
                if (i7 == 0) {
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                }
                composerKN.eF(519755085);
                if (mutableInteractionSource3 == null) {
                }
                composerKN.Xw();
                int i1622 = i10 & 14;
                int i1722 = i10 << 3;
                long j1122 = j5;
                SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                    }
                }, 1, mutableInteractionSource2), false, shape3, j7, j1122, floatingActionButtonElevationN.getDefaultElevation(), ((Dp) floatingActionButtonElevationN.J2(mutableInteractionSource4, composerKN, (i10 >> 12) & 112).getValue()).getValue(), null, mutableInteractionSource4, ComposableLambdaKt.nr(1249316354, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i18) {
                        if ((i18 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1249316354, i18, -1, "androidx.compose.material3.FloatingActionButton.<anonymous> (FloatingActionButton.kt:119)");
                        }
                        long j12 = j5;
                        TextStyle textStyleT = TypographyKt.t(ExtendedFabPrimaryTokens.f29516n.rl(), composer3, 6);
                        final Function2 function22 = function2;
                        ProvideContentColorTextStyleKt.n(j12, textStyleT, ComposableLambdaKt.nr(-1771489750, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                n(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer4, int i19) {
                                if ((i19 & 3) == 2 && composer4.xMQ()) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1771489750, i19, -1, "androidx.compose.material3.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:123)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                FabPrimaryTokens fabPrimaryTokens = FabPrimaryTokens.f29529n;
                                Modifier modifierN = SizeKt.n(companion, fabPrimaryTokens.O(), fabPrimaryTokens.t());
                                Alignment alignmentO = Alignment.INSTANCE.O();
                                Function2 function23 = function22;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                int iN = ComposablesKt.n(composer4, 0);
                                CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer4, modifierN);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 function0N = companion2.n();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.t();
                                }
                                composer4.T();
                                if (composer4.getInserting()) {
                                    composer4.s7N(function0N);
                                } else {
                                    composer4.r();
                                }
                                Composer composerN = Updater.n(composer4);
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function23.invoke(composer4, 0);
                                composer4.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer3, 54), composer3, RendererCapabilities.DECODER_SUPPORT_MASK);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, i1622 | (i1722 & 7168) | (57344 & i1722) | (i1722 & 458752), 6, 260);
                if (ComposerKt.v()) {
                }
                mutableInteractionSource5 = mutableInteractionSource3;
                modifier4 = modifier2;
                floatingActionButtonElevation2 = floatingActionButtonElevationN;
                composer2 = composerKN;
                shape4 = shape3;
                j9 = j7;
                j10 = j1122;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
