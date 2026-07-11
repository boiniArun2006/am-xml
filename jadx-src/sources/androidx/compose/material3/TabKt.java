package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008a\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0082\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001az\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\b\b¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a=\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00032\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010%\u001a\u00020\u0003*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&\u001aK\u0010.\u001a\u00020\u0003*\u00020 2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0002¢\u0006\u0004\b.\u0010/\"\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101\"\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101\"\u001a\u00106\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b4\u00105\"\u0014\u00107\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101\"\u0014\u00108\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00101\"\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;\"\u0014\u0010>\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@²\u0006\f\u0010?\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/runtime/Composable;", "text", "icon", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "t", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", c.f62177j, "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZJJLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "activeColor", "inactiveColor", "O", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "nr", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "textOrIconPlaceable", "", "tabHeight", "Ik", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;I)V", "Landroidx/compose/ui/unit/Density;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "ck", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IIII)V", "Landroidx/compose/ui/unit/Dp;", "F", "SmallTabHeight", "LargeTabHeight", "HI", "()F", "HorizontalTextPadding", "SingleLineTextBaselineWithIcon", "DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/TextUnit;", "J2", "J", "IconDistanceFromBaseline", "Uo", "TextDistanceFromLeadingIcon", TtmlNode.ATTR_TTS_COLOR, "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,450:1\n77#2:451\n77#2:452\n77#2:453\n68#3:454\n66#3,5:455\n71#3:463\n74#3:467\n1223#4,3:460\n1226#4,3:464\n1223#4,6:475\n1882#5,7:468\n78#6:481\n76#6,8:482\n85#6,4:499\n89#6,2:509\n78#6,6:519\n85#6,4:534\n89#6,2:544\n93#6:550\n78#6,6:559\n85#6,4:574\n89#6,2:584\n93#6:590\n93#6:594\n368#7,9:490\n377#7:511\n368#7,9:525\n377#7:546\n378#7,2:548\n368#7,9:565\n377#7:586\n378#7,2:588\n378#7,2:592\n4032#8,6:503\n4032#8,6:538\n4032#8,6:578\n71#9:512\n68#9,6:513\n74#9:547\n78#9:551\n71#9:552\n68#9,6:553\n74#9:587\n78#9:591\n81#10:595\n148#11:596\n148#11:597\n148#11:598\n148#11:599\n148#11:600\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt\n*L\n100#1:451\n165#1:452\n239#1:453\n283#1:454\n283#1:455,5\n283#1:463\n283#1:467\n283#1:460,3\n283#1:464,3\n315#1:475,6\n283#1:468,7\n308#1:481\n308#1:482,8\n308#1:499,4\n308#1:509,2\n310#1:519,6\n310#1:534,4\n310#1:544,2\n310#1:550\n313#1:559,6\n313#1:574,4\n313#1:584,2\n313#1:590\n308#1:594\n308#1:490,9\n308#1:511\n310#1:525,9\n310#1:546\n310#1:548,2\n313#1:565,9\n313#1:586\n313#1:588,2\n308#1:592,2\n308#1:503,6\n310#1:538,6\n313#1:578,6\n310#1:512\n310#1:513,6\n310#1:547\n310#1:551\n313#1:552\n313#1:553,6\n313#1:587\n313#1:591\n283#1:595\n427#1:596\n435#1:597\n439#1:598\n443#1:599\n449#1:600\n*E\n"})
public final class TabKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f28041n = PrimaryNavigationTabTokens.f29838n.J2();
    private static final float rl = Dp.KN(72);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f28042t = Dp.KN(16);
    private static final float nr = Dp.KN(14);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f28040O = Dp.KN(6);
    private static final long J2 = TextUnitKt.KN(20);
    private static final float Uo = Dp.KN(8);

    public static final float HI() {
        return f28042t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final long j2, final long j3, boolean z2, final Function2 function2, Composer composer, final int i2) {
        int i3;
        final boolean z3;
        TwoWayConverter twoWayConverter;
        Composer composerKN = composer.KN(735731848);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            z3 = z2;
            i3 |= composerKN.n(z3) ? 256 : 128;
        } else {
            z3 = z2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function2) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(735731848, i3, -1, "androidx.compose.material3.TabTransition (Tab.kt:279)");
            }
            int i5 = i3 >> 6;
            Transition transitionMUb = TransitionKt.mUb(Boolean.valueOf(z3), null, composerKN, i5 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material3.TabKt$TabTransition$color$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return n(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i7) {
                    TweenSpec tweenSpecTy;
                    composer2.eF(-899623535);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-899623535, i7, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:284)");
                    }
                    if (segment.t(Boolean.FALSE, Boolean.TRUE)) {
                        tweenSpecTy = AnimationSpecKt.az(150, 100, EasingKt.O());
                    } else {
                        tweenSpecTy = AnimationSpecKt.ty(100, 0, EasingKt.O(), 2, null);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer2.Xw();
                    return tweenSpecTy;
                }
            };
            boolean zBooleanValue = ((Boolean) transitionMUb.Ik()).booleanValue();
            composerKN.eF(-1997025499);
            if (ComposerKt.v()) {
                ComposerKt.p5(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j4 = zBooleanValue ? j2 : j3;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composerKN.Xw();
            ColorSpace colorSpaceR = Color.r(j4);
            boolean zP5 = composerKN.p5(colorSpaceR);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = (TwoWayConverter) ColorVectorConverterKt.n(Color.INSTANCE).invoke(colorSpaceR);
                composerKN.o(objIF);
            }
            TwoWayConverter twoWayConverter2 = (TwoWayConverter) objIF;
            boolean zBooleanValue2 = ((Boolean) transitionMUb.xMQ()).booleanValue();
            composerKN.eF(-1997025499);
            if (ComposerKt.v()) {
                ComposerKt.p5(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            }
            long j5 = zBooleanValue2 ? j2 : j3;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composerKN.Xw();
            Color colorXMQ = Color.xMQ(j5);
            boolean zBooleanValue3 = ((Boolean) transitionMUb.Ik()).booleanValue();
            composerKN.eF(-1997025499);
            if (ComposerKt.v()) {
                twoWayConverter = twoWayConverter2;
                ComposerKt.p5(-1997025499, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)");
            } else {
                twoWayConverter = twoWayConverter2;
            }
            long j6 = zBooleanValue3 ? j2 : j3;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composerKN.Xw();
            CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(J2(TransitionKt.J2(transitionMUb, colorXMQ, Color.xMQ(j6), tabKt$TabTransition$color$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverter, "ColorAnimation", composerKN, 0)))), function2, composerKN, (i5 & 112) | ProvidedValue.xMQ);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$TabTransition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i7) {
                    TabKt.O(j2, j3, z3, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i2, int i3, int i5, int i7) {
        int iHow = density.How(i5 == i7 ? nr : f28040O) + density.How(PrimaryNavigationTabTokens.f29838n.rl());
        int height = (placeable2.getHeight() + density.I4p(J2)) - i5;
        int i8 = (i3 - i7) - iHow;
        Placeable.PlacementScope.az(placementScope, placeable, (i2 - placeable.getWidth()) / 2, i8, 0.0f, 4, null);
        Placeable.PlacementScope.az(placementScope, placeable2, (i2 - placeable2.getWidth()) / 2, i8 - height, 0.0f, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final boolean z2, final Function0 function0, final Function2 function2, final Function2 function22, Modifier modifier, boolean z3, long j2, long j3, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        final boolean z4;
        int i5;
        final Function0 function02;
        Function2 function23;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        long value;
        int i9;
        int i10;
        int i11;
        long j4;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z6;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-777316544);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function23 = function22;
                    i5 |= composerKN.E2(function23) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        modifier2 = modifier;
                        i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            z5 = z3;
                            i5 |= composerKN.n(z5) ? 131072 : 65536;
                        }
                        if ((1572864 & i2) == 0) {
                            value = j2;
                            i5 |= ((i3 & 64) == 0 && composerKN.nr(value)) ? 1048576 : 524288;
                        } else {
                            value = j2;
                        }
                        if ((12582912 & i2) == 0) {
                            i9 = i5 | (((i3 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304);
                        } else {
                            i9 = i5;
                        }
                        i10 = i3 & 256;
                        if (i10 == 0) {
                            if ((i2 & 100663296) == 0) {
                                i11 = i10;
                                i9 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i9 & 38347923) == 38347922 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    if (i7 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        z5 = true;
                                    }
                                    if ((i3 & 64) != 0) {
                                        value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                                        i9 &= -3670017;
                                    }
                                    if ((i3 & 128) == 0) {
                                        i9 &= -29360129;
                                        j4 = value;
                                    } else {
                                        j4 = j3;
                                    }
                                    if (i11 == 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    final boolean z7 = z5;
                                    int i12 = i9;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-777316544, i12, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:167)");
                                    }
                                    long j7 = value;
                                    final Indication indicationNr = RippleKt.nr(true, 0.0f, j7, composerKN, ((i12 >> 12) & 896) | 6, 2);
                                    composer2 = composerKN;
                                    final Function2 function24 = function23;
                                    final Modifier modifier4 = modifier2;
                                    int i13 = i12 >> 18;
                                    O(j7, j4, z2, ComposableLambdaKt.nr(-429037564, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$1
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
                                            if ((i14 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-429037564, i14, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:174)");
                                            }
                                            Modifier modifierKN = SizeKt.KN(PaddingKt.gh(SelectableKt.n(SizeKt.xMQ(modifier4, TabKt.f28041n), z4, mutableInteractionSource2, indicationNr, z7, Role.mUb(Role.INSTANCE.KN()), function02), TabKt.HI(), 0.0f, 2, null), 0.0f, 1, null);
                                            Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                            Function2 function25 = function24;
                                            Function2 function26 = function2;
                                            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, verticalXMQ, composer3, 54);
                                            int iN = ComposablesKt.n(composer3, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
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
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                            function25.invoke(composer3, 0);
                                            SpacerKt.n(SizeKt.o(Modifier.INSTANCE, TabKt.Uo), composer3, 6);
                                            TextKt.n(TextStyle.t(TypographyKt.t(PrimaryNavigationTabTokens.f29838n.Uo(), composer3, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function26, composer3, 0);
                                            composer3.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer2, 54), composer2, ((i12 << 6) & 896) | (i13 & 112) | (i13 & 14) | 3072);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier3 = modifier4;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    z6 = z7;
                                    j5 = j7;
                                    j6 = j4;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 64) != 0) {
                                        i9 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i9 &= -29360129;
                                    }
                                    j4 = j3;
                                }
                                mutableInteractionSource2 = mutableInteractionSource;
                                final boolean z72 = z5;
                                int i122 = i9;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                long j72 = value;
                                final Indication indicationNr2 = RippleKt.nr(true, 0.0f, j72, composerKN, ((i122 >> 12) & 896) | 6, 2);
                                composer2 = composerKN;
                                final Function2 function242 = function23;
                                final Modifier modifier42 = modifier2;
                                int i132 = i122 >> 18;
                                O(j72, j4, z2, ComposableLambdaKt.nr(-429037564, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$1
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
                                        if ((i14 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-429037564, i14, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:174)");
                                        }
                                        Modifier modifierKN = SizeKt.KN(PaddingKt.gh(SelectableKt.n(SizeKt.xMQ(modifier42, TabKt.f28041n), z4, mutableInteractionSource2, indicationNr2, z72, Role.mUb(Role.INSTANCE.KN()), function02), TabKt.HI(), 0.0f, 2, null), 0.0f, 1, null);
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                        Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                        Function2 function25 = function242;
                                        Function2 function26 = function2;
                                        MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, verticalXMQ, composer3, 54);
                                        int iN = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
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
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                        function25.invoke(composer3, 0);
                                        SpacerKt.n(SizeKt.o(Modifier.INSTANCE, TabKt.Uo), composer3, 6);
                                        TextKt.n(TextStyle.t(TypographyKt.t(PrimaryNavigationTabTokens.f29838n.Uo(), composer3, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function26, composer3, 0);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), composer2, ((i122 << 6) & 896) | (i132 & 112) | (i132 & 14) | 3072);
                                if (ComposerKt.v()) {
                                }
                                modifier3 = modifier42;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z6 = z72;
                                j5 = j72;
                                j6 = j4;
                            } else {
                                composerKN.wTp();
                                mutableInteractionSource3 = mutableInteractionSource;
                                modifier3 = modifier2;
                                z6 = z5;
                                j5 = value;
                                j6 = j3;
                                composer2 = composerKN;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$2
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
                                        TabKt.n(z2, function0, function2, function22, modifier3, z6, j5, j6, mutableInteractionSource3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i9 |= 100663296;
                        i11 = i10;
                        if ((i9 & 38347923) == 38347922) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if ((i3 & 64) != 0) {
                                }
                                if ((i3 & 128) == 0) {
                                }
                                if (i11 == 0) {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                final boolean z722 = z5;
                                int i1222 = i9;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                long j722 = value;
                                final Indication indicationNr22 = RippleKt.nr(true, 0.0f, j722, composerKN, ((i1222 >> 12) & 896) | 6, 2);
                                composer2 = composerKN;
                                final Function2 function2422 = function23;
                                final Modifier modifier422 = modifier2;
                                int i1322 = i1222 >> 18;
                                O(j722, j4, z2, ComposableLambdaKt.nr(-429037564, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$1
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
                                        if ((i14 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-429037564, i14, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:174)");
                                        }
                                        Modifier modifierKN = SizeKt.KN(PaddingKt.gh(SelectableKt.n(SizeKt.xMQ(modifier422, TabKt.f28041n), z4, mutableInteractionSource2, indicationNr22, z722, Role.mUb(Role.INSTANCE.KN()), function02), TabKt.HI(), 0.0f, 2, null), 0.0f, 1, null);
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                        Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                        Function2 function25 = function2422;
                                        Function2 function26 = function2;
                                        MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, verticalXMQ, composer3, 54);
                                        int iN = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
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
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                        function25.invoke(composer3, 0);
                                        SpacerKt.n(SizeKt.o(Modifier.INSTANCE, TabKt.Uo), composer3, 6);
                                        TextKt.n(TextStyle.t(TypographyKt.t(PrimaryNavigationTabTokens.f29838n.Uo(), composer3, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function26, composer3, 0);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer2, 54), composer2, ((i1222 << 6) & 896) | (i1322 & 112) | (i1322 & 14) | 3072);
                                if (ComposerKt.v()) {
                                }
                                modifier3 = modifier422;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z6 = z722;
                                j5 = j722;
                                j6 = j4;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    z5 = z3;
                    if ((1572864 & i2) == 0) {
                    }
                    if ((12582912 & i2) == 0) {
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    if ((i9 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                modifier2 = modifier;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                z5 = z3;
                if ((1572864 & i2) == 0) {
                }
                if ((12582912 & i2) == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i9 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function23 = function22;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            modifier2 = modifier;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            z5 = z3;
            if ((1572864 & i2) == 0) {
            }
            if ((12582912 & i2) == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i9 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        function23 = function22;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        z5 = z3;
        if ((1572864 & i2) == 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i9 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final boolean z2, final Function0 function0, Modifier modifier, boolean z3, long j2, long j3, MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i5;
        Function0 function02;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        long value;
        long j4;
        int i9;
        int i10;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z6;
        int i11;
        final Modifier modifier3;
        long j5;
        Composer composer2;
        final long j6;
        final MutableInteractionSource mutableInteractionSource3;
        final long j7;
        final Modifier modifier4;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-202735880);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function02 = function0;
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z5 = z3;
                        i5 |= composerKN.n(z5) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            value = j2;
                            int i12 = composerKN.nr(value) ? 16384 : 8192;
                            i5 |= i12;
                        } else {
                            value = j2;
                        }
                        i5 |= i12;
                    } else {
                        value = j2;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            j4 = j3;
                            int i13 = composerKN.nr(j4) ? 131072 : 65536;
                            i5 |= i13;
                        } else {
                            j4 = j3;
                        }
                        i5 |= i13;
                    } else {
                        j4 = j3;
                    }
                    i9 = i3 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.p5(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.E2(function3) ? 8388608 : 4194304;
                        }
                        int i14 = i5;
                        if ((i5 & 4793491) == 4793490 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier4 = modifier2;
                            composer2 = composerKN;
                            z7 = z5;
                            j6 = value;
                            j7 = j4;
                            mutableInteractionSource3 = mutableInteractionSource;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i7 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i8 != 0) {
                                    z5 = true;
                                }
                                if ((i3 & 16) == 0) {
                                    value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                                    i10 = i14 & (-57345);
                                } else {
                                    i10 = i14;
                                }
                                if ((i3 & 32) != 0) {
                                    i10 &= -458753;
                                    j4 = value;
                                }
                                if (i9 == 0) {
                                    mutableInteractionSource2 = null;
                                    z6 = z5;
                                    i11 = -202735880;
                                    modifier3 = modifier2;
                                    j5 = j4;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i11, i10, -1, "androidx.compose.material3.Tab (Tab.kt:242)");
                                }
                                final Indication indicationNr = RippleKt.nr(true, 0.0f, value, composerKN, ((i10 >> 6) & 896) | 6, 2);
                                final Function0 function03 = function02;
                                final boolean z9 = z4;
                                int i15 = i10 >> 12;
                                O(value, j5, z2, ComposableLambdaKt.nr(-551896140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i16) {
                                        if ((i16 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-551896140, i16, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
                                        }
                                        Modifier modifierKN = SizeKt.KN(SelectableKt.n(modifier3, z9, mutableInteractionSource2, indicationNr, z6, Role.mUb(Role.INSTANCE.KN()), function03), 0.0f, 1, null);
                                        Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                        Function3 function32 = function3;
                                        MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalRl, horizontalUo, composer3, 54);
                                        int iN = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
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
                                        Updater.O(composerN, measurePolicyN, companion.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                                        Function2 function2Rl = companion.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion.nr());
                                        function32.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, (i15 & 112) | (i15 & 14) | 3072 | ((i10 << 6) & 896));
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                composer2 = composerKN;
                                j6 = value;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                j7 = j5;
                                modifier4 = modifier3;
                                z7 = z6;
                            } else {
                                composerKN.wTp();
                                i10 = (i3 & 16) != 0 ? i14 & (-57345) : i14;
                                if ((i3 & 32) != 0) {
                                    i10 &= -458753;
                                }
                            }
                            modifier3 = modifier2;
                            j5 = j4;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z6 = z5;
                            i11 = -202735880;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            final Indication indicationNr2 = RippleKt.nr(true, 0.0f, value, composerKN, ((i10 >> 6) & 896) | 6, 2);
                            final Function0 function032 = function02;
                            final boolean z92 = z4;
                            int i152 = i10 >> 12;
                            O(value, j5, z2, ComposableLambdaKt.nr(-551896140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i16) {
                                    if ((i16 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-551896140, i16, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
                                    }
                                    Modifier modifierKN = SizeKt.KN(SelectableKt.n(modifier3, z92, mutableInteractionSource2, indicationNr2, z6, Role.mUb(Role.INSTANCE.KN()), function032), 0.0f, 1, null);
                                    Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                    Function3 function32 = function3;
                                    MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalRl, horizontalUo, composer3, 54);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
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
                                    Updater.O(composerN, measurePolicyN, companion.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                                    Function2 function2Rl = companion.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion.nr());
                                    function32.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i152 & 112) | (i152 & 14) | 3072 | ((i10 << 6) & 896));
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            j6 = value;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            j7 = j5;
                            modifier4 = modifier3;
                            z7 = z6;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i16) {
                                    TabKt.rl(z2, function0, modifier4, z7, j6, j7, mutableInteractionSource3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 12582912;
                    int i142 = i5;
                    if ((i5 & 4793491) == 4793490) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 16) == 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if (i9 == 0) {
                                modifier3 = modifier2;
                                j5 = j4;
                                mutableInteractionSource2 = mutableInteractionSource;
                                z6 = z5;
                                i11 = -202735880;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            final Indication indicationNr22 = RippleKt.nr(true, 0.0f, value, composerKN, ((i10 >> 6) & 896) | 6, 2);
                            final Function0 function0322 = function02;
                            final boolean z922 = z4;
                            int i1522 = i10 >> 12;
                            O(value, j5, z2, ComposableLambdaKt.nr(-551896140, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i16) {
                                    if ((i16 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-551896140, i16, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:249)");
                                    }
                                    Modifier modifierKN = SizeKt.KN(SelectableKt.n(modifier3, z922, mutableInteractionSource2, indicationNr22, z6, Role.mUb(Role.INSTANCE.KN()), function0322), 0.0f, 1, null);
                                    Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                    Function3 function32 = function3;
                                    MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalRl, horizontalUo, composer3, 54);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
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
                                    Updater.O(composerN, measurePolicyN, companion.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                                    Function2 function2Rl = companion.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion.nr());
                                    function32.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (i1522 & 112) | (i1522 & 14) | 3072 | ((i10 << 6) & 896));
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            j6 = value;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            j7 = j5;
                            modifier4 = modifier3;
                            z7 = z6;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z5 = z3;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                int i1422 = i5;
                if ((i5 & 4793491) == 4793490) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            z5 = z3;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            int i14222 = i5;
            if ((i5 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function02 = function0;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        z5 = z3;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        int i142222 = i5;
        if ((i5 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final boolean z2, final Function0 function0, Modifier modifier, boolean z3, Function2 function2, Function2 function22, long j2, long j3, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i5;
        Function0 function02;
        Modifier modifier2;
        int i7;
        boolean z5;
        int i8;
        final Function2 function23;
        int i9;
        final Function2 function24;
        int i10;
        int i11;
        int i12;
        int i13;
        long value;
        long j4;
        boolean z6;
        final ComposableLambda composableLambdaNr;
        long j5;
        long j6;
        int i14;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Function2 function25;
        final Function2 function26;
        final Modifier modifier3;
        final boolean z7;
        final long j7;
        final long j9;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i15;
        Composer composerKN = composer.KN(-350627181);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z5 = z3;
                    i5 |= composerKN.n(z5) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function23 = function2;
                        i5 |= composerKN.E2(function23) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            function24 = function22;
                            i5 |= composerKN.E2(function24) ? 131072 : 65536;
                        }
                        if ((1572864 & i2) == 0) {
                            if ((i3 & 64) == 0) {
                                i15 = i5;
                                i11 = i16;
                                int i17 = composerKN.nr(j2) ? 1048576 : 524288;
                                i10 = i15 | i17;
                            } else {
                                i15 = i5;
                                i11 = i16;
                            }
                            i10 = i15 | i17;
                        } else {
                            i10 = i5;
                            i11 = i16;
                        }
                        if ((i2 & 12582912) == 0) {
                            i10 |= ((i3 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304;
                        }
                        i12 = i3 & 256;
                        if (i12 == 0) {
                            if ((i2 & 100663296) == 0) {
                                i13 = i12;
                                i10 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i10 & 38347923) == 38347922 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    if (i11 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i7 != 0) {
                                        z5 = true;
                                    }
                                    if (i8 != 0) {
                                        function23 = null;
                                    }
                                    if (i9 != 0) {
                                        function24 = null;
                                    }
                                    if ((i3 & 64) == 0) {
                                        value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                                        i10 &= -3670017;
                                    } else {
                                        value = j2;
                                    }
                                    if ((i3 & 128) == 0) {
                                        i10 &= -29360129;
                                        j4 = value;
                                    } else {
                                        j4 = j3;
                                    }
                                    z6 = z5;
                                    composableLambdaNr = null;
                                    if (i13 == 0) {
                                        i14 = -350627181;
                                        j5 = value;
                                        j6 = j4;
                                        mutableInteractionSource2 = null;
                                    } else {
                                        j5 = value;
                                        j6 = j4;
                                        i14 = -350627181;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 64) != 0) {
                                        i10 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i10 &= -29360129;
                                    }
                                    j6 = j3;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z6 = z5;
                                    composableLambdaNr = null;
                                    i14 = -350627181;
                                    j5 = j2;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i14, i10, -1, "androidx.compose.material3.Tab (Tab.kt:102)");
                                }
                                composerKN.eF(79583089);
                                if (function23 != null) {
                                    composableLambdaNr = ComposableLambdaKt.nr(708874428, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
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
                                                ComposerKt.p5(708874428, i18, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:106)");
                                            }
                                            TextKt.n(TextStyle.t(TypographyKt.t(PrimaryNavigationTabTokens.f29838n.Uo(), composer3, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function23, composer3, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                }
                                composerKN.Xw();
                                int i18 = i10 >> 6;
                                composer2 = composerKN;
                                Modifier modifier4 = modifier2;
                                rl(z4, function02, modifier4, z6, j5, j6, mutableInteractionSource2, ComposableLambdaKt.nr(1540996038, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                        n(columnScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(ColumnScope columnScope, Composer composer3, int i19) {
                                        if ((i19 & 17) == 16 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1540996038, i19, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
                                        }
                                        TabKt.nr(composableLambdaNr, function24, composer3, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composer2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                function25 = function23;
                                function26 = function24;
                                modifier3 = modifier4;
                                z7 = z6;
                                j7 = j5;
                                j9 = j6;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            } else {
                                composerKN.wTp();
                                mutableInteractionSource3 = mutableInteractionSource;
                                composer2 = composerKN;
                                modifier3 = modifier2;
                                z7 = z5;
                                function25 = function23;
                                function26 = function24;
                                j7 = j2;
                                j9 = j3;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i19) {
                                        TabKt.t(z2, function0, modifier3, z7, function25, function26, j7, j9, mutableInteractionSource3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i10 |= 100663296;
                        i13 = i12;
                        if ((i10 & 38347923) == 38347922) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i11 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if ((i3 & 64) == 0) {
                                }
                                if ((i3 & 128) == 0) {
                                }
                                z6 = z5;
                                composableLambdaNr = null;
                                if (i13 == 0) {
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                composerKN.eF(79583089);
                                if (function23 != null) {
                                }
                                composerKN.Xw();
                                int i182 = i10 >> 6;
                                composer2 = composerKN;
                                Modifier modifier42 = modifier2;
                                rl(z4, function02, modifier42, z6, j5, j6, mutableInteractionSource2, ComposableLambdaKt.nr(1540996038, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$Tab$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                        n(columnScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(ColumnScope columnScope, Composer composer3, int i19) {
                                        if ((i19 & 17) == 16 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1540996038, i19, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:122)");
                                        }
                                        TabKt.nr(composableLambdaNr, function24, composer3, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composer2, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i182) | (458752 & i182) | (i182 & 3670016), 0);
                                if (ComposerKt.v()) {
                                }
                                function25 = function23;
                                function26 = function24;
                                modifier3 = modifier42;
                                z7 = z6;
                                j7 = j5;
                                j9 = j6;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    function24 = function22;
                    if ((1572864 & i2) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i3 & 256;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if ((i10 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function23 = function2;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                function24 = function22;
                if ((1572864 & i2) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i10 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z5 = z3;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function23 = function2;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            function24 = function22;
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i10 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z5 = z3;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function23 = function2;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        function24 = function22;
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i10 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ik(Placeable.PlacementScope placementScope, Placeable placeable, int i2) {
        Placeable.PlacementScope.az(placementScope, placeable, 0, (i2 - placeable.getHeight()) / 2, 0.0f, 4, null);
    }

    private static final long J2(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final Function2 function2, final Function2 function22, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        int i7;
        Composer composerKN = composer.KN(514131524);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(function2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function22)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(514131524, i3, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:306)");
            }
            int i8 = i3 & 14;
            boolean z3 = true;
            if (i8 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 112) != 32) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object objIF = composerKN.iF();
            if (z4 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(final MeasureScope measureScope, List list, long j2) {
                        Placeable placeableDR0;
                        Placeable placeableDR02;
                        if (function2 != null) {
                            int size = list.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                Measurable measurable = (Measurable) list.get(i9);
                                if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "text")) {
                                    placeableDR0 = measurable.dR0(Constraints.nr(j2, 0, 0, 0, 0, 11, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableDR0 = null;
                        if (function22 != null) {
                            int size2 = list.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                Measurable measurable2 = (Measurable) list.get(i10);
                                if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "icon")) {
                                    placeableDR02 = measurable2.dR0(j2);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableDR02 = null;
                        final int iMax = Math.max(placeableDR0 != null ? placeableDR0.getWidth() : 0, placeableDR02 != null ? placeableDR02.getWidth() : 0);
                        final int iMax2 = Math.max(measureScope.How((placeableDR0 == null || placeableDR02 == null) ? TabKt.f28041n : TabKt.rl), (placeableDR02 != null ? placeableDR02.getHeight() : 0) + (placeableDR0 != null ? placeableDR0.getHeight() : 0) + measureScope.I4p(TabKt.J2));
                        final Integer numValueOf = placeableDR0 != null ? Integer.valueOf(placeableDR0.z(AlignmentLineKt.n())) : null;
                        final Integer numValueOf2 = placeableDR0 != null ? Integer.valueOf(placeableDR0.z(AlignmentLineKt.rl())) : null;
                        final Placeable placeable = placeableDR0;
                        final Placeable placeable2 = placeableDR02;
                        return MeasureScope.ER(measureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$2$1.1
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
                                Placeable placeable3;
                                Placeable placeable4 = placeable;
                                if (placeable4 == null || (placeable3 = placeable2) == null) {
                                    if (placeable4 != null) {
                                        TabKt.Ik(placementScope, placeable4, iMax2);
                                        return;
                                    }
                                    Placeable placeable5 = placeable2;
                                    if (placeable5 != null) {
                                        TabKt.Ik(placementScope, placeable5, iMax2);
                                        return;
                                    }
                                    return;
                                }
                                MeasureScope measureScope2 = measureScope;
                                int i11 = iMax;
                                int i12 = iMax2;
                                Integer num = numValueOf;
                                Intrinsics.checkNotNull(num);
                                int iIntValue = num.intValue();
                                Integer num2 = numValueOf2;
                                Intrinsics.checkNotNull(num2);
                                TabKt.ck(placementScope, measureScope2, placeable4, placeable3, i11, i12, iIntValue, num2.intValue());
                            }
                        }, 4, null);
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
            composerKN.eF(871566271);
            if (function2 != null) {
                Modifier modifierGh = PaddingKt.gh(LayoutIdKt.rl(companion, "text"), f28042t, 0.0f, 2, null);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierGh);
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
                function2.invoke(composerKN, Integer.valueOf(i8));
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.eF(871570579);
            if (function22 != null) {
                Modifier modifierRl = LayoutIdKt.rl(companion, "icon");
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierRl);
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                function22.invoke(composerKN, Integer.valueOf((i3 >> 3) & 14));
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabKt$TabBaselineLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i9) {
                    TabKt.nr(function2, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
