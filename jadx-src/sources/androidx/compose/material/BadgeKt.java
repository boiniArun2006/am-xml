package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001aU\u0010\t\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001aR\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2 \b\u0002\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0017\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001e\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u001a\u0010 \u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014\"\u001a\u0010!\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "badge", "Landroidx/compose/ui/Modifier;", "modifier", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/foundation/layout/RowScope;", c.f62177j, "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "F", "O", "()F", "BadgeRadius", "getBadgeWithContentRadius", "BadgeWithContentRadius", "Landroidx/compose/ui/unit/TextUnit;", "t", "J", "BadgeContentFontSize", "nr", "getBadgeWithContentHorizontalPadding", "BadgeWithContentHorizontalPadding", "J2", "BadgeWithContentHorizontalOffset", "BadgeHorizontalOffset", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,173:1\n79#2,6:174\n86#2,4:189\n90#2,2:199\n79#2,6:208\n86#2,4:223\n90#2,2:233\n94#2:239\n79#2,6:248\n86#2,4:263\n90#2,2:273\n94#2:279\n94#2:283\n79#2,6:288\n86#2,4:303\n90#2,2:313\n94#2:319\n368#3,9:180\n377#3:201\n368#3,9:214\n377#3:235\n378#3,2:237\n368#3,9:254\n377#3:275\n378#3,2:277\n378#3,2:281\n368#3,9:294\n377#3:315\n378#3,2:317\n4034#4,6:193\n4034#4,6:227\n4034#4,6:267\n4034#4,6:307\n71#5:202\n69#5,5:203\n74#5:236\n78#5:240\n71#5:241\n68#5,6:242\n74#5:276\n78#5:280\n87#6:284\n63#6:325\n63#6:327\n99#7,3:285\n102#7:316\n106#7:320\n149#8:321\n149#8:322\n149#8:323\n149#8:324\n149#8:326\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material/BadgeKt\n*L\n63#1:174,6\n63#1:189,4\n63#1:199,2\n65#1:208,6\n65#1:223,4\n65#1:233,2\n65#1:239\n70#1:248,6\n70#1:263,4\n70#1:273,2\n70#1:279\n63#1:283\n135#1:288,6\n135#1:303,4\n135#1:313,2\n135#1:319\n63#1:180,9\n63#1:201\n65#1:214,9\n65#1:235\n65#1:237,2\n70#1:254,9\n70#1:275\n70#1:277,2\n63#1:281,2\n135#1:294,9\n135#1:315\n135#1:317,2\n63#1:193,6\n65#1:227,6\n70#1:267,6\n135#1:307,6\n65#1:202\n65#1:203,5\n65#1:236\n65#1:240\n70#1:241\n70#1:242,6\n70#1:276\n70#1:280\n138#1:284\n168#1:325\n172#1:327\n135#1:285,3\n135#1:316\n135#1:320\n155#1:321\n158#1:322\n164#1:323\n168#1:324\n172#1:326\n*E\n"})
public final class BadgeKt {
    private static final float J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f21396n;
    private static final float nr;
    private static final float rl = Dp.KN(8);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f21397t = TextUnitKt.KN(10);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f21395O = Dp.KN(-Dp.KN(6));

    static {
        float f3 = 4;
        f21396n = Dp.KN(f3);
        nr = Dp.KN(f3);
        J2 = Dp.KN(-Dp.KN(f3));
    }

    public static final float J2() {
        return f21395O;
    }

    public static final float O() {
        return f21396n;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, long j2, long j3, Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jNr;
        long jRl;
        final Function3 function32;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1133484502);
        int i7 = i3 & 1;
        if (i7 != 0) {
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
            jNr = j2;
            i5 |= ((i3 & 2) == 0 && composerKN.nr(jNr)) ? 32 : 16;
        } else {
            jNr = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            jRl = j3;
            i5 |= ((i3 & 4) == 0 && composerKN.nr(jRl)) ? 256 : 128;
        } else {
            jRl = j3;
        }
        int i8 = i3 & 8;
        if (i8 == 0) {
            if ((i2 & 3072) == 0) {
                function32 = function3;
                i5 |= composerKN.E2(function32) ? 2048 : 1024;
            }
            if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
            } else {
                composerKN.e();
                if ((i2 & 1) == 0 || composerKN.rV9()) {
                    modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        jNr = MaterialTheme.f22169n.n(composerKN, 6).nr();
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        jRl = ColorsKt.rl(jNr, composerKN, (i5 >> 3) & 14);
                        i5 &= -897;
                    }
                    if (i8 != 0) {
                        function32 = null;
                    }
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    modifier3 = modifier2;
                }
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1133484502, i5, -1, "androidx.compose.material.Badge (Badge.kt:129)");
                }
                float f3 = function32 != null ? rl : f21396n;
                RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(f3);
                float f4 = f3 * 2;
                Modifier modifierGh = PaddingKt.gh(ClipKt.n(BackgroundKt.t(SizeKt.n(modifier3, Dp.KN(f4), Dp.KN(f4)), jNr, roundedCornerShapeT), roundedCornerShapeT), nr, 0.0f, 2, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.rl(), Alignment.INSTANCE.xMQ(), composerKN, 54);
                int iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
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
                if (function32 != null) {
                    composerKN.eF(1448027890);
                    CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(jRl)), ComposableLambdaKt.nr(1784526485, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
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
                            if (!composer2.HI((i9 & 3) != 2, i9 & 1)) {
                                composer2.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1784526485, i9, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:146)");
                            }
                            TextStyle textStyleT = TextStyle.t(MaterialTheme.f22169n.t(composer2, 6).getButton(), 0L, BadgeKt.f21397t, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
                            final Function3 function33 = function32;
                            final RowScope rowScope = rowScopeInstance;
                            TextKt.n(textStyleT, ComposableLambdaKt.nr(915155142, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i10) {
                                    if (!composer3.HI((i10 & 3) != 2, i10 & 1)) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(915155142, i10, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:147)");
                                    }
                                    function33.invoke(rowScope, composer3, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer2, 54), composer2, 48);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                    composerKN.Xw();
                } else {
                    composerKN.eF(1448293126);
                    composerKN.Xw();
                }
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
            final long j4 = jRl;
            final Function3 function33 = function32;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                final Modifier modifier4 = modifier3;
                final long j5 = jNr;
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$2
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
                        BadgeKt.n(modifier4, j5, j4, function33, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        function32 = function3;
        if (composerKN.HI((i5 & 1171) == 1170, i5 & 1)) {
        }
        final long j42 = jRl;
        final Function3 function332 = function32;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final float nr() {
        return J2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function3 function3, Modifier modifier, final Function3 function32, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(859805272);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function32) ? 256 : 128;
            }
            if (composerKN.HI((i5 & 147) == 146, i5 & 1)) {
                composerKN.wTp();
                modifier3 = modifier2;
            } else {
                modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(859805272, i5, -1, "androidx.compose.material.BadgedBox (Badge.kt:61)");
                }
                BadgeKt$BadgedBox$2 badgeKt$BadgedBox$2 = new MeasurePolicy() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(final MeasureScope measureScope, List list, long j2) {
                        int size = list.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            Measurable measurable = (Measurable) list.get(i8);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "badge")) {
                                final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, 0, 0, 0, 0, 11, null));
                                int size2 = list.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    Measurable measurable2 = (Measurable) list.get(i9);
                                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "anchor")) {
                                        final Placeable placeableDR02 = measurable2.dR0(j2);
                                        return measureScope.Zn(placeableDR02.getWidth(), placeableDR02.getHeight(), MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.n(), Integer.valueOf(placeableDR02.z(AlignmentLineKt.n()))), TuplesKt.to(AlignmentLineKt.rl(), Integer.valueOf(placeableDR02.z(AlignmentLineKt.rl())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2.1
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
                                                float fJ2 = placeableDR0.getWidth() > measureScope.How(BadgeKt.O()) * 2 ? BadgeKt.J2() : BadgeKt.nr();
                                                Placeable.PlacementScope.az(placementScope, placeableDR02, 0, 0, 0.0f, 4, null);
                                                Placeable.PlacementScope.az(placementScope, placeableDR0, placeableDR02.getWidth() + measureScope.How(fJ2), (-placeableDR0.getHeight()) / 2, 0.0f, 4, null);
                                            }
                                        });
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                int iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
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
                Updater.O(composerN, badgeKt$BadgedBox$2, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                Function2 function2Rl = companion.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierRl = LayoutIdKt.rl(companion2, "anchor");
                Alignment.Companion companion3 = Alignment.INSTANCE;
                int i8 = ((i5 << 3) & 7168) | 54;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.O(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl);
                Function0 function0N2 = companion.n();
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
                Updater.O(composerN2, measurePolicyUo, companion.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion.O());
                Function2 function2Rl2 = companion.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                function32.invoke(boxScopeInstance, composerKN, Integer.valueOf(((i8 >> 6) & 112) | 6));
                composerKN.XQ();
                Modifier modifierRl2 = LayoutIdKt.rl(companion2, "badge");
                int i9 = ((i5 << 9) & 7168) | 6;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierRl2);
                Function0 function0N3 = companion.n();
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
                Updater.O(composerN3, measurePolicyUo2, companion.t());
                Updater.O(composerN3, compositionLocalMapIk3, companion.O());
                Function2 function2Rl3 = companion.rl();
                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                    composerN3.o(Integer.valueOf(iN3));
                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                }
                Updater.O(composerN3, modifierO3, companion.nr());
                function3.invoke(boxScopeInstance, composerKN, Integer.valueOf(((i9 >> 6) & 112) | 6));
                composerKN.XQ();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$BadgedBox$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i10) {
                        BadgeKt.rl(function3, modifier4, function32, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
}
