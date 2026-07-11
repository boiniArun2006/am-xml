package androidx.compose.material;

import YgZ.uQga.IYJfqUyym;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.d;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a`\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aX\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0094\u0001\u0010\u001f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00132\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015¢\u0006\u0002\b\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aR\u0010'\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132&\u0010\u000e\u001a\"\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aA\u0010*\u001a\u00020\u000b2\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0002\b\f2\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015¢\u0006\u0002\b\f2\b\b\u0001\u0010)\u001a\u00020#H\u0003¢\u0006\u0004\b*\u0010+\u001a&\u00102\u001a\u000201*\u00020,2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a8\u00105\u001a\u000201*\u00020,2\u0006\u00104\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\b\u0001\u0010)\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106\"\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020#078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00108\"\u0014\u0010;\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:\"\u0014\u0010<\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010:\"\u0014\u0010=\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010:\"\u0014\u0010?\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@²\u0006\f\u0010&\u001a\u00020#8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", c.f62177j, "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "t", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V", "activeColor", "inactiveColor", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "animationProgress", "O", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "iconPositionAnimationProgress", "nr", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "az", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "labelPlaceable", "ty", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/animation/core/TweenSpec;", "BottomNavigationAnimationSpec", "F", "BottomNavigationHeight", "BottomNavigationItemHorizontalPadding", "CombinedItemTextBaseline", "Landroidx/compose/foundation/layout/WindowInsets;", "ZeroInsets", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,448:1\n75#2:449\n71#3:450\n69#3,5:451\n74#3:484\n78#3:488\n71#3:526\n68#3,6:527\n74#3:561\n78#3:565\n71#3:566\n68#3,6:567\n74#3:601\n78#3:605\n79#4,6:456\n86#4,4:471\n90#4,2:481\n94#4:487\n79#4:495\n77#4,8:496\n86#4,4:513\n90#4,2:523\n79#4,6:533\n86#4,4:548\n90#4,2:558\n94#4:564\n79#4,6:573\n86#4,4:588\n90#4,2:598\n94#4:604\n94#4:608\n368#5,9:462\n377#5:483\n378#5,2:485\n368#5,9:504\n377#5:525\n368#5,9:539\n377#5:560\n378#5,2:562\n368#5,9:579\n377#5:600\n378#5,2:602\n378#5,2:606\n4034#6,6:475\n4034#6,6:517\n4034#6,6:552\n4034#6,6:592\n1247#7,6:489\n85#8:609\n149#9:610\n149#9:611\n149#9:612\n149#9:613\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n*L\n210#1:449\n225#1:450\n225#1:451,5\n225#1:484\n225#1:488\n317#1:526\n317#1:527,6\n317#1:561\n317#1:565\n319#1:566\n319#1:567,6\n319#1:601\n319#1:605\n225#1:456,6\n225#1:471,4\n225#1:481,2\n225#1:487\n316#1:495\n316#1:496,8\n316#1:513,4\n316#1:523,2\n317#1:533,6\n317#1:548,4\n317#1:558,2\n317#1:564\n319#1:573,6\n319#1:588,4\n319#1:598,2\n319#1:604\n316#1:608\n225#1:462,9\n225#1:483\n225#1:485,2\n316#1:504,9\n316#1:525\n317#1:539,9\n317#1:560\n317#1:562,2\n319#1:579,9\n319#1:600\n319#1:602,2\n316#1:606,2\n225#1:475,6\n316#1:517,6\n317#1:552,6\n319#1:592,6\n327#1:489,6\n285#1:609\n436#1:610\n439#1:611\n445#1:612\n447#1:613\n*E\n"})
public final class BottomNavigationKt {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final WindowInsets f21430O;
    private static final float nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f21432t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TweenSpec f21431n = new TweenSpec(d.f62986a, 0, EasingKt.nr(), 2, null);
    private static final float rl = Dp.KN(56);

    static {
        float f3 = 12;
        f21432t = Dp.KN(f3);
        nr = Dp.KN(f3);
        float f4 = 0;
        f21430O = WindowInsetsKt.rl(Dp.KN(f4), Dp.KN(f4), Dp.KN(f4), Dp.KN(f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final long j2, final long j3, final boolean z2, final Function3 function3, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-985175058);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function3) ? 2048 : 1024;
        }
        if (composerKN.HI((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-985175058, i3, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:282)");
            }
            final State stateNr = AnimateAsStateKt.nr(z2 ? 1.0f : 0.0f, f21431n, 0.0f, null, null, composerKN, 48, 28);
            long jKN = ColorKt.KN(j3, j2, J2(stateNr));
            CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(Color.az(jKN, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.n().nr(Float.valueOf(Color.ck(jKN)))}, ComposableLambdaKt.nr(-138092754, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$1
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
                    if (!composer2.HI((i5 & 3) != 2, i5 & 1)) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-138092754, i5, -1, "androidx.compose.material.BottomNavigationTransition.<anonymous> (BottomNavigation.kt:295)");
                    }
                    function3.invoke(Float.valueOf(BottomNavigationKt.J2(stateNr)), composer2, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationTransition$2
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
                    BottomNavigationKt.O(j2, j3, z2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult az(MeasureScope measureScope, final Placeable placeable, long j2) {
        int iJ2 = ConstraintsKt.J2(j2, measureScope.How(rl));
        final int height = (iJ2 - placeable.getHeight()) / 2;
        return MeasureScope.ER(measureScope, placeable.getWidth(), iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.az(placementScope, placeable, 0, height, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, long j2, long j3, float f3, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jJ2;
        long jRl;
        float f4;
        Composer composer2;
        final Modifier modifier3;
        final long j4;
        final long j5;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        int i7;
        long j6;
        float fN;
        long j7;
        Composer composerKN = composer.KN(456489494);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                jJ2 = j2;
                int i9 = composerKN.nr(jJ2) ? 32 : 16;
                i5 |= i9;
            } else {
                jJ2 = j2;
            }
            i5 |= i9;
        } else {
            jJ2 = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            jRl = j3;
            i5 |= ((i3 & 4) == 0 && composerKN.nr(jRl)) ? 256 : 128;
        } else {
            jRl = j3;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                f4 = f3;
                i5 |= composerKN.rl(f4) ? 2048 : 1024;
            }
            if ((i3 & 16) != 0) {
                if ((i2 & 24576) == 0) {
                    i5 |= composerKN.E2(function3) ? 16384 : 8192;
                }
                if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        Modifier modifier5 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i3 & 2) != 0) {
                            jJ2 = ColorsKt.J2(MaterialTheme.f22169n.n(composerKN, 6));
                            i5 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            jRl = ColorsKt.rl(jJ2, composerKN, (i5 >> 3) & 14);
                            i5 &= -897;
                        }
                        if (i10 != 0) {
                            modifier4 = modifier5;
                            i7 = 6;
                            j6 = jRl;
                            fN = BottomNavigationDefaults.f21429n.n();
                        } else {
                            modifier4 = modifier5;
                            i7 = 6;
                            j6 = jRl;
                            fN = f4;
                        }
                        j7 = jJ2;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        fN = f4;
                        i7 = 6;
                        j7 = jJ2;
                        j6 = jRl;
                        modifier4 = modifier2;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(456489494, i5, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:163)");
                    }
                    int i11 = i5 << 3;
                    composer2 = composerKN;
                    rl(f21430O, modifier4, j7, j6, fN, function3, composer2, i7 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (i11 & 458752), 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier4;
                    j4 = j7;
                    j5 = j6;
                    f5 = fN;
                } else {
                    composer2 = composerKN;
                    composer2.wTp();
                    modifier3 = modifier2;
                    j4 = jJ2;
                    j5 = jRl;
                    f5 = f4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$3
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
                            BottomNavigationKt.n(modifier3, j4, j5, f5, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        f4 = f3;
        if ((i3 & 16) != 0) {
        }
        if (composerKN.HI((i5 & 9363) != 9362, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final Function2 function2, final Function2 function22, final float f3, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-1162995092);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function22) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.rl(f3) ? 256 : 128;
        }
        if (composerKN.HI((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1162995092, i3, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:314)");
            }
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                        Placeable placeableDR0;
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            Measurable measurable = (Measurable) list.get(i5);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "icon")) {
                                Placeable placeableDR02 = measurable.dR0(j2);
                                if (function22 != null) {
                                    int size2 = list.size();
                                    for (int i7 = 0; i7 < size2; i7++) {
                                        Measurable measurable2 = (Measurable) list.get(i7);
                                        if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "label")) {
                                            placeableDR0 = measurable2.dR0(Constraints.nr(j2, 0, 0, 0, 0, 11, null));
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                placeableDR0 = null;
                                Placeable placeable = placeableDR0;
                                if (function22 == null) {
                                    return BottomNavigationKt.az(measureScope, placeableDR02, j2);
                                }
                                Intrinsics.checkNotNull(placeable);
                                return BottomNavigationKt.ty(measureScope, placeable, placeableDR02, j2, f3);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, measurePolicy, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            Modifier modifierRl = LayoutIdKt.rl(companion, "icon");
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl);
            Function0 function0N2 = companion2.n();
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
            Updater.O(composerN2, measurePolicyUo, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            function2.invoke(composerKN, Integer.valueOf(i3 & 14));
            composerKN.XQ();
            if (function22 != null) {
                composerKN.eF(-1180018220);
                Modifier modifierGh = PaddingKt.gh(AlphaKt.n(LayoutIdKt.rl(companion, "label"), f3), f21432t, 0.0f, 2, null);
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierGh);
                Function0 function0N3 = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N3);
                } else {
                    composerKN.r();
                }
                Composer composerN3 = Updater.n(composerKN);
                Updater.O(composerN3, measurePolicyUo2, companion2.t());
                Updater.O(composerN3, compositionLocalMapIk3, companion2.O());
                Function2 function2Rl3 = companion2.rl();
                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                    composerN3.o(Integer.valueOf(iN3));
                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                }
                Updater.O(composerN3, modifierO3, companion2.nr());
                function22.invoke(composerKN, Integer.valueOf((i3 >> 3) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(-1179764516);
                composerKN.Xw();
            }
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItemBaselineLayout$3
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
                    BottomNavigationKt.nr(function2, function22, f3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final WindowInsets windowInsets, Modifier modifier, long j2, long j3, float f3, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        long jJ2;
        long jRl;
        int i7;
        float f4;
        Composer composer2;
        final Modifier modifier3;
        final long j4;
        final long j5;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        float fN;
        long j6;
        long j7;
        Modifier modifier4;
        Composer composerKN = composer.KN(-1278406810);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(windowInsets) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    jJ2 = j2;
                    int i9 = composerKN.nr(jJ2) ? 256 : 128;
                    i5 |= i9;
                } else {
                    jJ2 = j2;
                }
                i5 |= i9;
            } else {
                jJ2 = j2;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    jRl = j3;
                    int i10 = composerKN.nr(jRl) ? 2048 : 1024;
                    i5 |= i10;
                } else {
                    jRl = j3;
                }
                i5 |= i10;
            } else {
                jRl = j3;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    f4 = f3;
                    i5 |= composerKN.rl(f4) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i5 |= composerKN.E2(function3) ? 131072 : 65536;
                }
                if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            jJ2 = ColorsKt.J2(MaterialTheme.f22169n.n(composerKN, 6));
                            i5 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            jRl = ColorsKt.rl(jJ2, composerKN, (i5 >> 6) & 14);
                            i5 &= -7169;
                        }
                        if (i7 != 0) {
                            fN = BottomNavigationDefaults.f21429n.n();
                            j6 = jJ2;
                            j7 = jRl;
                            modifier4 = modifier2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1278406810, i5, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:107)");
                        }
                        composer2 = composerKN;
                        SurfaceKt.n(modifier4, null, j6, j7, null, fN, ComposableLambdaKt.nr(-352628062, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i11) {
                                if (!composer3.HI((i11 & 3) != 2, i11 & 1)) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-352628062, i11, -1, LHbnkhI.EkZgChKgGLGE);
                                }
                                Modifier modifierN = SelectableGroupKt.n(SizeKt.rl(WindowInsetsPaddingKt.nr(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), windowInsets), 0.0f, BottomNavigationKt.rl, 1, null));
                                Arrangement.HorizontalOrVertical horizontalOrVerticalNr = Arrangement.f17400n.nr();
                                Function3 function32 = function3;
                                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalNr, Alignment.INSTANCE.qie(), composer3, 6);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
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
                        }, composerKN, 54), composer2, ((i5 >> 3) & 14) | 1572864 | (i5 & 896) | (i5 & 7168) | ((i5 << 3) & 458752), 18);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                        j4 = j6;
                        j5 = j7;
                        f5 = fN;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                    }
                    j7 = jRl;
                    fN = f4;
                    modifier4 = modifier2;
                    j6 = jJ2;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    composer2 = composerKN;
                    SurfaceKt.n(modifier4, null, j6, j7, null, fN, ComposableLambdaKt.nr(-352628062, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i11) {
                            if (!composer3.HI((i11 & 3) != 2, i11 & 1)) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-352628062, i11, -1, LHbnkhI.EkZgChKgGLGE);
                            }
                            Modifier modifierN = SelectableGroupKt.n(SizeKt.rl(WindowInsetsPaddingKt.nr(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), windowInsets), 0.0f, BottomNavigationKt.rl, 1, null));
                            Arrangement.HorizontalOrVertical horizontalOrVerticalNr = Arrangement.f17400n.nr();
                            Function3 function32 = function3;
                            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalNr, Alignment.INSTANCE.qie(), composer3, 6);
                            int iN = ComposablesKt.n(composer3, 0);
                            CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
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
                    }, composerKN, 54), composer2, ((i5 >> 3) & 14) | 1572864 | (i5 & 896) | (i5 & 7168) | ((i5 << 3) & 458752), 18);
                    if (ComposerKt.v()) {
                    }
                    modifier3 = modifier4;
                    j4 = j6;
                    j5 = j7;
                    f5 = fN;
                } else {
                    composer2 = composerKN;
                    composer2.wTp();
                    modifier3 = modifier2;
                    j4 = jJ2;
                    j5 = jRl;
                    f5 = f4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigation$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i11) {
                            BottomNavigationKt.rl(windowInsets, modifier3, j4, j5, f5, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 24576;
            f4 = f3;
            if ((i3 & 32) != 0) {
            }
            if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        f4 = f3;
        if ((i3 & 32) != 0) {
        }
        if (composerKN.HI((74899 & i5) != 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final RowScope rowScope, final boolean z2, final Function0 function0, final Function2 function2, Modifier modifier, boolean z3, Function2 function22, boolean z4, MutableInteractionSource mutableInteractionSource, long j2, long j3, Composer composer, final int i2, final int i3, final int i5) {
        RowScope rowScope2;
        int i7;
        Function0 function02;
        int i8;
        int i9;
        boolean z5;
        int i10;
        final Function2 function23;
        int i11;
        int i12;
        final boolean z6;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        long value;
        int i14;
        int i15;
        Composer composer2;
        final Modifier modifier2;
        final long j4;
        final Function2 function24;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z7;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier3;
        boolean z9;
        long jAz;
        long j6;
        int i16;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composerKN = composer.KN(-1473735525);
        if ((Integer.MIN_VALUE & i5) != 0) {
            i7 = i2 | 6;
            rowScope2 = rowScope;
        } else if ((i2 & 6) == 0) {
            rowScope2 = rowScope;
            i7 = (composerKN.p5(rowScope2) ? 4 : 2) | i2;
        } else {
            rowScope2 = rowScope;
            i7 = i2;
        }
        if ((i5 & 1) != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i7 |= composerKN.n(z2) ? 32 : 16;
            }
            if ((i5 & 2) == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                function02 = function0;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function02 = function0;
                i7 |= composerKN.E2(function02) ? 256 : 128;
            } else {
                function02 = function0;
            }
            if ((i5 & 4) == 0) {
                i7 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i7 |= composerKN.E2(function2) ? 2048 : 1024;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    i7 |= composerKN.p5(modifier) ? 16384 : 8192;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    i7 |= 196608;
                } else {
                    if ((i2 & 196608) == 0) {
                        z5 = true;
                        i7 |= composerKN.n(z3) ? 131072 : 65536;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 1572864;
                        function23 = function22;
                    } else {
                        function23 = function22;
                        if ((i2 & 1572864) == 0) {
                            i7 |= composerKN.E2(function23) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                        if ((i2 & 12582912) == 0) {
                            i12 = 6;
                            z6 = z4;
                            i7 |= composerKN.n(z6) ? 8388608 : 4194304;
                        }
                        i13 = 128 & i5;
                        if (i13 != 0) {
                            i7 |= 100663296;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i2 & 100663296) == 0) {
                                i7 |= composerKN.p5(mutableInteractionSource2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                        }
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            value = j2;
                            i7 |= ((i5 & 256) == 0 && composerKN.nr(value)) ? 536870912 : 268435456;
                        } else {
                            value = j2;
                        }
                        if ((i3 & 6) == 0) {
                            i14 = i13;
                            i15 = i3 | (((i5 & 512) == 0 && composerKN.nr(j3)) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i3;
                        }
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i15 & 3) == 2) ? false : z5, i7 & 1)) {
                            composerKN.e();
                            ComposableLambda composableLambdaNr = null;
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                modifier3 = i8 != 0 ? Modifier.INSTANCE : modifier;
                                z9 = i9 != 0 ? z5 : z3;
                                if (i10 != 0) {
                                    function23 = null;
                                }
                                if (i11 != 0) {
                                    z6 = z5;
                                }
                                if (i14 != 0) {
                                    mutableInteractionSource2 = null;
                                }
                                if ((256 & i5) != 0) {
                                    value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                                    i7 &= -1879048193;
                                }
                                if ((i5 & 512) != 0) {
                                    jAz = Color.az(value, ContentAlpha.f21745n.nr(composerKN, i12), 0.0f, 0.0f, 0.0f, 14, null);
                                    i15 &= -15;
                                }
                                int i17 = i15;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    j6 = jAz;
                                } else {
                                    j6 = jAz;
                                    ComposerKt.p5(-1473735525, i7, i17, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:211)");
                                }
                                if (function23 != null) {
                                    composerKN.eF(399132217);
                                    composerKN.Xw();
                                    i16 = i17;
                                } else {
                                    composerKN.eF(399132218);
                                    i16 = i17;
                                    composableLambdaNr = ComposableLambdaKt.nr(1343298261, z5, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$styledLabel$1$1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i18) {
                                            if (!composer3.HI((i18 & 3) != 2, i18 & 1)) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1343298261, i18, -1, IYJfqUyym.vuSCyGnZMqikbBS);
                                            }
                                            TextKt.n(TextStyle.t(MaterialTheme.f22169n.t(composer3, 6).getCaption(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function23, composer3, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                    composerKN.Xw();
                                }
                                final ComposableLambda composableLambda = composableLambdaNr;
                                Modifier modifierRl = RowScope.rl(rowScope2, SelectableKt.n(modifier3, z2, mutableInteractionSource2, RippleKt.J2(false, 0.0f, value, 2, null), z9, Role.mUb(Role.INSTANCE.KN()), function02), 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                                iN = ComposablesKt.n(composerKN, 0);
                                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierRl);
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
                                long j7 = value;
                                Updater.O(composerN, measurePolicyUo, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                function2Rl = companion.rl();
                                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                long j9 = j6;
                                O(j7, j9, z2, ComposableLambdaKt.nr(-1411872801, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f3, Composer composer3, Integer num) {
                                        n(f3.floatValue(), composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(float f3, Composer composer3, int i18) {
                                        if ((i18 & 6) == 0) {
                                            i18 |= composer3.rl(f3) ? 4 : 2;
                                        }
                                        if (!composer3.HI((i18 & 19) != 18, i18 & 1)) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1411872801, i18, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:239)");
                                        }
                                        if (z6) {
                                            f3 = 1.0f;
                                        }
                                        BottomNavigationKt.nr(function2, composableLambda, f3, composer3, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, ((i7 >> 27) & 14) | 3072 | ((i16 << 3) & 112) | ((i7 << 3) & 896));
                                composer2 = composerKN;
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                j4 = j7;
                                function24 = function23;
                                modifier2 = modifier3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z7 = z9;
                                j5 = j9;
                            } else {
                                composerKN.wTp();
                                if ((256 & i5) != 0) {
                                    i7 &= -1879048193;
                                }
                                if ((i5 & 512) != 0) {
                                    i15 &= -15;
                                }
                                modifier3 = modifier;
                                z9 = z3;
                            }
                            jAz = j3;
                            int i172 = i15;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            if (function23 != null) {
                            }
                            final Function2 composableLambda2 = composableLambdaNr;
                            Modifier modifierRl2 = RowScope.rl(rowScope2, SelectableKt.n(modifier3, z2, mutableInteractionSource2, RippleKt.J2(false, 0.0f, value, 2, null), z9, Role.mUb(Role.INSTANCE.KN()), function02), 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl2);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 function0N2 = companion2.n();
                            if (composerKN.getApplier() == null) {
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                            }
                            composerN = Updater.n(composerKN);
                            long j72 = value;
                            Updater.O(composerN, measurePolicyUo2, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk2, companion2.O());
                            function2Rl = companion2.rl();
                            if (!composerN.getInserting()) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                                Updater.O(composerN, modifierO2, companion2.nr());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                                long j92 = j6;
                                O(j72, j92, z2, ComposableLambdaKt.nr(-1411872801, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f3, Composer composer3, Integer num) {
                                        n(f3.floatValue(), composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(float f3, Composer composer3, int i18) {
                                        if ((i18 & 6) == 0) {
                                            i18 |= composer3.rl(f3) ? 4 : 2;
                                        }
                                        if (!composer3.HI((i18 & 19) != 18, i18 & 1)) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1411872801, i18, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:239)");
                                        }
                                        if (z6) {
                                            f3 = 1.0f;
                                        }
                                        BottomNavigationKt.nr(function2, composableLambda2, f3, composer3, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, ((i7 >> 27) & 14) | 3072 | ((i16 << 3) & 112) | ((i7 << 3) & 896));
                                composer2 = composerKN;
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                }
                                j4 = j72;
                                function24 = function23;
                                modifier2 = modifier3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z7 = z9;
                                j5 = j92;
                            }
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            modifier2 = modifier;
                            j4 = value;
                            function24 = function23;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z7 = z3;
                            j5 = j3;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$BottomNavigationItem$2
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
                                    BottomNavigationKt.t(rowScope, z2, function0, function2, modifier2, z7, function24, z6, mutableInteractionSource3, j4, j5, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 12582912;
                    i12 = 6;
                    z6 = z4;
                    i13 = 128 & i5;
                    if (i13 != 0) {
                    }
                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    }
                    if ((i3 & 6) == 0) {
                    }
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i15 & 3) == 2) ? false : z5, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z5 = true;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i12 = 6;
                z6 = z4;
                i13 = 128 & i5;
                if (i13 != 0) {
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                if ((i3 & 6) == 0) {
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i15 & 3) == 2) ? false : z5, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i9 = i5 & 16;
            if (i9 != 0) {
            }
            z5 = true;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = 6;
            z6 = z4;
            i13 = 128 & i5;
            if (i13 != 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i3 & 6) == 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i15 & 3) == 2) ? false : z5, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i5 & 2) == 0) {
        }
        if ((i5 & 4) == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 != 0) {
        }
        z5 = true;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = 6;
        z6 = z4;
        i13 = 128 & i5;
        if (i13 != 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i3 & 6) == 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i15 & 3) == 2) ? false : z5, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float J2(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ty(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j2, final float f3) {
        int iHow = measureScope.How(nr) - placeable.z(AlignmentLineKt.n());
        int height = placeable2.getHeight() + placeable.getHeight() + iHow;
        int iJ2 = ConstraintsKt.J2(j2, Math.max(height, measureScope.How(rl)));
        final int iCoerceAtLeast = RangesKt.coerceAtLeast((iJ2 - height) / 2, 0);
        int height2 = (iJ2 - placeable2.getHeight()) / 2;
        final int height3 = placeable2.getHeight() + iCoerceAtLeast + iHow;
        int iMax = Math.max(placeable.getWidth(), placeable2.getWidth());
        final int width = (iMax - placeable.getWidth()) / 2;
        final int width2 = (iMax - placeable2.getWidth()) / 2;
        final int iRoundToInt = MathKt.roundToInt((height2 - iCoerceAtLeast) * (1 - f3));
        return MeasureScope.ER(measureScope, iMax, iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomNavigationKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                if (f3 != 0.0f) {
                    Placeable.PlacementScope.az(placementScope, placeable, width, height3 + iRoundToInt, 0.0f, 4, null);
                }
                Placeable.PlacementScope.az(placementScope, placeable2, width2, iCoerceAtLeast + iRoundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
