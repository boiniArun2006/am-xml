package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c8G.Fsz.qwlyMfUJj;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \u001a©\u0001\u0010\u000f\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001av\u0010\u0016\u001a\u00020\u00012\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aN\u0010\"\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001aV\u0010,\u001a\u00020\u0019*\u00020\u00182\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001au\u0010=\u001a\u00020<*\u00020.2\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00192\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u0001012\b\u00105\u001a\u0004\u0018\u0001012\b\u00106\u001a\u0004\u0018\u0001012\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u0019H\u0002¢\u0006\u0004\b=\u0010>\u001a5\u0010D\u001a\u00020\u00012\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0011\u0010C\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a\u001b\u0010H\u001a\u000207*\u00020F2\u0006\u0010G\u001a\u00020\u0019H\u0002¢\u0006\u0004\bH\u0010I\u001a\u001a\u0010J\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001b\u0010L\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0019H\u0002¢\u0006\u0004\bL\u0010M\" \u0010S\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010N\u0012\u0004\bQ\u0010R\u001a\u0004\bO\u0010P\" \u0010V\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010N\u0012\u0004\bU\u0010R\u001a\u0004\bT\u0010P\" \u0010Y\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bD\u0010N\u0012\u0004\bX\u0010R\u001a\u0004\bW\u0010P\" \u0010]\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bZ\u0010N\u0012\u0004\b\\\u0010R\u001a\u0004\b[\u0010P\" \u0010a\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b^\u0010N\u0012\u0004\b`\u0010R\u001a\u0004\b_\u0010P\" \u0010e\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bb\u0010N\u0012\u0004\bd\u0010R\u001a\u0004\bc\u0010P\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006f"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "headlineContent", "Landroidx/compose/ui/Modifier;", "modifier", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "Landroidx/compose/material3/ListItemColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", c.f62177j, "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ListItemColors;FFLandroidx/compose/runtime/Composer;II)V", "leading", "trailing", "headline", "overline", "supporting", "rl", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "leadingWidth", "trailingWidth", "headlineWidth", "overlineWidth", "supportingWidth", "horizontalPadding", "Landroidx/compose/ui/unit/Constraints;", "constraints", "az", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIJ)I", "leadingHeight", "trailingHeight", "headlineHeight", "overlineHeight", "supportingHeight", "Landroidx/compose/material3/ListItemType;", "listItemType", "verticalPadding", "qie", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;IIIIIIIJ)I", "Landroidx/compose/ui/layout/MeasureScope;", "width", "height", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "headlinePlaceable", "overlinePlaceable", "supportingPlaceable", "", "isThreeLine", "startPadding", "endPadding", "topPadding", "Landroidx/compose/ui/layout/MeasureResult;", "o", "(Landroidx/compose/ui/layout/MeasureScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIII)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "textToken", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(JLandroidx/compose/material3/tokens/TypographyKeyTokens;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Density;", "estimatedSupportingHeight", "r", "(Landroidx/compose/ui/unit/Density;I)Z", "XQ", "(I)F", "Z", "(II)I", "F", "getListItemVerticalPadding", "()F", "getListItemVerticalPadding$annotations", "()V", "ListItemVerticalPadding", "getListItemThreeLineVerticalPadding", "getListItemThreeLineVerticalPadding$annotations", "ListItemThreeLineVerticalPadding", "ck", "getListItemStartPadding$annotations", "ListItemStartPadding", "nr", "HI", "getListItemEndPadding$annotations", "ListItemEndPadding", "O", "ty", "getLeadingContentEndPadding$annotations", "LeadingContentEndPadding", "J2", "Ik", "getTrailingContentStartPadding$annotations", "TrailingContentStartPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,731:1\n1223#2,6:732\n1223#2,6:746\n170#3:738\n168#3,7:739\n78#3,6:752\n85#3,4:767\n89#3,2:777\n93#3:782\n176#3:783\n368#4,9:758\n377#4,3:779\n4032#5,6:771\n148#6:784\n148#6:785\n148#6:786\n148#6:787\n148#6:788\n148#6:789\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n*L\n182#1:732,6\n183#1:746,6\n183#1:738\n183#1:739,7\n183#1:752,6\n183#1:767,4\n183#1:777,2\n183#1:782\n183#1:783\n183#1:758,9\n183#1:779,3\n183#1:771,6\n698#1:784\n700#1:785\n702#1:786\n704#1:787\n708#1:788\n712#1:789\n*E\n"})
public final class ListItemKt {
    private static final float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f26111O;
    private static final float nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f26113t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f26112n = Dp.KN(8);
    private static final float rl = Dp.KN(12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }

    static {
        float f3 = 16;
        f26113t = Dp.KN(f3);
        nr = Dp.KN(f3);
        f26111O = Dp.KN(f3);
        J2 = Dp.KN(f3);
    }

    public static final float HI() {
        return nr;
    }

    public static final float Ik() {
        return J2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float XQ(int i2) {
        return ListItemType.xMQ(i2, ListItemType.INSTANCE.rl()) ? rl : f26112n;
    }

    public static final float ck() {
        return f26113t;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, ListItemColors listItemColors, float f3, float f4, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        final Function2 function26;
        int i8;
        final Function2 function27;
        int i9;
        int i10;
        Function2 function28;
        int i11;
        int i12;
        int i13;
        int i14;
        float f5;
        Composer composer2;
        final Function2 function29;
        final Function2 function210;
        int i15;
        int i16;
        Composer composer3;
        ListItemColors listItemColorsN;
        float fRl;
        float f6;
        final ListItemColors listItemColors2;
        Function2 function211;
        ComposableLambda composableLambdaNr;
        final ComposableLambda composableLambda;
        final Function2 function212;
        final Function2 function213;
        final Function2 function214;
        final float f7;
        final float f8;
        final ListItemColors listItemColors3;
        final Modifier modifier3;
        final Function2 function215;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1647707763);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
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
                    function26 = function22;
                    i5 |= composerKN.E2(function26) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function27 = function23;
                        i5 |= composerKN.E2(function27) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i5 |= composerKN.E2(function24) ? 16384 : 8192;
                        }
                        i10 = i3 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else {
                            if ((196608 & i2) == 0) {
                                function28 = function25;
                                i5 |= composerKN.E2(function28) ? 131072 : 65536;
                            }
                            if ((i2 & 1572864) == 0) {
                                i5 |= ((i3 & 64) == 0 && composerKN.p5(listItemColors)) ? 1048576 : 524288;
                            }
                            i11 = i3 & 128;
                            if (i11 == 0) {
                                i5 |= 12582912;
                            } else {
                                if ((i2 & 12582912) == 0) {
                                    i12 = i11;
                                    i5 |= composerKN.rl(f3) ? 8388608 : 4194304;
                                }
                                i13 = i3 & 256;
                                if (i13 == 0) {
                                    if ((i2 & 100663296) == 0) {
                                        i14 = i13;
                                        f5 = f4;
                                        i5 |= composerKN.rl(f5) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                    }
                                    composer2 = composerKN;
                                    if ((i5 & 38347923) == 38347922 || !composer2.xMQ()) {
                                        composer2.e();
                                        ComposableLambda composableLambdaNr2 = null;
                                        if ((i2 & 1) != 0 || composer2.rV9()) {
                                            if (i17 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i7 != 0) {
                                                function26 = null;
                                            }
                                            if (i8 != 0) {
                                                function27 = null;
                                            }
                                            function29 = i9 == 0 ? null : function24;
                                            function210 = i10 == 0 ? null : function28;
                                            if ((i3 & 64) == 0) {
                                                i15 = i12;
                                                i16 = i14;
                                                listItemColorsN = ListItemDefaults.f26110n.n(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 511);
                                                composer3 = composer2;
                                                i5 &= -3670017;
                                            } else {
                                                i15 = i12;
                                                i16 = i14;
                                                composer3 = composer2;
                                                listItemColorsN = listItemColors;
                                            }
                                            float fRl2 = i15 == 0 ? ListItemDefaults.f26110n.rl() : f3;
                                            if (i16 == 0) {
                                                f6 = fRl2;
                                                fRl = ListItemDefaults.f26110n.rl();
                                            } else {
                                                fRl = f4;
                                                f6 = fRl2;
                                            }
                                            listItemColors2 = listItemColorsN;
                                        } else {
                                            composer2.wTp();
                                            if ((i3 & 64) != 0) {
                                                i5 &= -3670017;
                                            }
                                            function29 = function24;
                                            listItemColors2 = listItemColors;
                                            f6 = f3;
                                            fRl = f5;
                                            function210 = function28;
                                            composer3 = composer2;
                                        }
                                        composer3.S();
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1647707763, i5, -1, "androidx.compose.material3.ListItem (ListItem.kt:103)");
                                        }
                                        final ComposableLambda composableLambdaNr3 = ComposableLambdaKt.nr(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i18) {
                                                if ((i18 & 3) == 2 && composer4.xMQ()) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-403249643, i18, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                                                }
                                                ListItemKt.t(listItemColors2.rl(true), ListTokens.f29685n.gh(), function2, composer4, 48);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54);
                                        composer3.eF(1640970492);
                                        ComposableLambda composableLambdaNr4 = function27 != null ? null : ComposableLambdaKt.nr(-1020860251, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedSupportingContent$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i18) {
                                                if ((i18 & 3) == 2 && composer4.xMQ()) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1020860251, i18, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:114)");
                                                }
                                                ListItemKt.t(listItemColors2.getSupportingTextColor(), ListTokens.f29685n.r(), function27, composer4, 48);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54);
                                        composer3.Xw();
                                        composer3.eF(1640980724);
                                        ComposableLambda composableLambdaNr5 = function26 != null ? null : ComposableLambdaKt.nr(-764441232, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedOverlineContent$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i18) {
                                                if ((i18 & 3) == 2 && composer4.xMQ()) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-764441232, i18, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:124)");
                                                }
                                                ListItemKt.t(listItemColors2.getOverlineColor(), ListTokens.f29685n.ck(), function26, composer4, 48);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54);
                                        composer3.Xw();
                                        composer3.eF(1640990750);
                                        if (function29 != null) {
                                            function211 = function29;
                                            composableLambdaNr = null;
                                        } else {
                                            function211 = function29;
                                            composableLambdaNr = ComposableLambdaKt.nr(1400509200, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedLeadingContent$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    n(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer4, int i18) {
                                                    if ((i18 & 3) == 2 && composer4.xMQ()) {
                                                        composer4.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(1400509200, i18, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:134)");
                                                    }
                                                    Modifier modifierAz = PaddingKt.az(Modifier.INSTANCE, 0.0f, 0.0f, ListItemKt.ty(), 0.0f, 11, null);
                                                    ListItemColors listItemColors4 = listItemColors2;
                                                    Function2 function216 = function29;
                                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                                    int iN = ComposablesKt.n(composer4, 0);
                                                    CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                                    Modifier modifierO = ComposedModifierKt.O(composer4, modifierAz);
                                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                    Function0 function0N = companion.n();
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
                                                    Updater.O(composerN, measurePolicyUo, companion.t());
                                                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                                                    Function2 function2Rl = companion.rl();
                                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                        composerN.o(Integer.valueOf(iN));
                                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                                    }
                                                    Updater.O(composerN, modifierO, companion.nr());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                    CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(listItemColors4.t(true))), function216, composer4, ProvidedValue.xMQ);
                                                    composer4.XQ();
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer3, 54);
                                        }
                                        composer3.Xw();
                                        composer3.eF(1641004177);
                                        if (function210 != null) {
                                            composableLambda = composableLambdaNr;
                                        } else {
                                            composableLambda = composableLambdaNr;
                                            composableLambdaNr2 = ComposableLambdaKt.nr(1512306332, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedTrailingContent$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    n(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer4, int i18) {
                                                    if ((i18 & 3) == 2 && composer4.xMQ()) {
                                                        composer4.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(1512306332, i18, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:145)");
                                                    }
                                                    Modifier modifierAz = PaddingKt.az(Modifier.INSTANCE, ListItemKt.Ik(), 0.0f, 0.0f, 0.0f, 14, null);
                                                    ListItemColors listItemColors4 = listItemColors2;
                                                    Function2 function216 = function210;
                                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                                    int iN = ComposablesKt.n(composer4, 0);
                                                    CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                                    Modifier modifierO = ComposedModifierKt.O(composer4, modifierAz);
                                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                    Function0 function0N = companion.n();
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
                                                    Updater.O(composerN, measurePolicyUo, companion.t());
                                                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                                                    Function2 function2Rl = companion.rl();
                                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                        composerN.o(Integer.valueOf(iN));
                                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                                    }
                                                    Updater.O(composerN, modifierO, companion.nr());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                                    ListItemKt.t(listItemColors4.J2(true), ListTokens.f29685n.S(), function216, composer4, 48);
                                                    composer4.XQ();
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer3, 54);
                                        }
                                        composer3.Xw();
                                        final ComposableLambda composableLambda2 = composableLambdaNr5;
                                        final ComposableLambda composableLambda3 = composableLambdaNr4;
                                        final ComposableLambda composableLambda4 = composableLambdaNr2;
                                        int i18 = i5 >> 9;
                                        composer2 = composer3;
                                        SurfaceKt.n(SemanticsModifierKt.t(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                n(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }
                                        }).Zmq(modifier2), ListItemDefaults.f26110n.t(composer3, 6), listItemColors2.getContainerColor(), listItemColors2.rl(true), f6, fRl, null, ComposableLambdaKt.nr(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                    ComposerKt.p5(1502590376, i19, -1, qwlyMfUJj.SfycswmwXTWpAs);
                                                }
                                                ListItemKt.rl(composableLambda, composableLambda4, composableLambdaNr3, composableLambda2, composableLambda3, composer4, RendererCapabilities.DECODER_SUPPORT_MASK);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54), composer2, (57344 & i18) | 12582912 | (i18 & 458752), 64);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        function212 = function210;
                                        function213 = function26;
                                        function214 = function27;
                                        f7 = f6;
                                        f8 = fRl;
                                        listItemColors3 = listItemColors2;
                                        modifier3 = modifier2;
                                        function215 = function211;
                                    } else {
                                        composer2.wTp();
                                        f7 = f3;
                                        modifier3 = modifier2;
                                        function213 = function26;
                                        function214 = function27;
                                        f8 = f5;
                                        function212 = function28;
                                        function215 = function24;
                                        listItemColors3 = listItemColors;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i19) {
                                                ListItemKt.n(function2, modifier3, function213, function214, function215, function212, listItemColors3, f7, f8, composer4, RecomposeScopeImplKt.n(i2 | 1), i3);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i5 |= 100663296;
                                i14 = i13;
                                f5 = f4;
                                composer2 = composerKN;
                                if ((i5 & 38347923) == 38347922) {
                                    composer2.e();
                                    ComposableLambda composableLambdaNr22 = null;
                                    if ((i2 & 1) != 0) {
                                        if (i17 != 0) {
                                        }
                                        if (i7 != 0) {
                                        }
                                        if (i8 != 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if ((i3 & 64) == 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        if (i16 == 0) {
                                        }
                                        listItemColors2 = listItemColorsN;
                                        composer3.S();
                                        if (ComposerKt.v()) {
                                        }
                                        final Function2 composableLambdaNr32 = ComposableLambdaKt.nr(-403249643, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i182) {
                                                if ((i182 & 3) == 2 && composer4.xMQ()) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-403249643, i182, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:105)");
                                                }
                                                ListItemKt.t(listItemColors2.rl(true), ListTokens.f29685n.gh(), function2, composer4, 48);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54);
                                        composer3.eF(1640970492);
                                        if (function27 != null) {
                                        }
                                        composer3.Xw();
                                        composer3.eF(1640980724);
                                        if (function26 != null) {
                                        }
                                        composer3.Xw();
                                        composer3.eF(1640990750);
                                        if (function29 != null) {
                                        }
                                        composer3.Xw();
                                        composer3.eF(1641004177);
                                        if (function210 != null) {
                                        }
                                        composer3.Xw();
                                        final Function2 composableLambda22 = composableLambdaNr5;
                                        final Function2 composableLambda32 = composableLambdaNr4;
                                        final Function2 composableLambda42 = composableLambdaNr22;
                                        int i182 = i5 >> 9;
                                        composer2 = composer3;
                                        SurfaceKt.n(SemanticsModifierKt.t(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$1
                                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                n(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }
                                        }).Zmq(modifier2), ListItemDefaults.f26110n.t(composer3, 6), listItemColors2.getContainerColor(), listItemColors2.rl(true), f6, fRl, null, ComposableLambdaKt.nr(1502590376, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                    ComposerKt.p5(1502590376, i19, -1, qwlyMfUJj.SfycswmwXTWpAs);
                                                }
                                                ListItemKt.rl(composableLambda, composableLambda42, composableLambdaNr32, composableLambda22, composableLambda32, composer4, RendererCapabilities.DECODER_SUPPORT_MASK);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54), composer2, (57344 & i182) | 12582912 | (i182 & 458752), 64);
                                        if (ComposerKt.v()) {
                                        }
                                        function212 = function210;
                                        function213 = function26;
                                        function214 = function27;
                                        f7 = f6;
                                        f8 = fRl;
                                        listItemColors3 = listItemColors2;
                                        modifier3 = modifier2;
                                        function215 = function211;
                                    }
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            i12 = i11;
                            i13 = i3 & 256;
                            if (i13 == 0) {
                            }
                            i14 = i13;
                            f5 = f4;
                            composer2 = composerKN;
                            if ((i5 & 38347923) == 38347922) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                            }
                        }
                        function28 = function25;
                        if ((i2 & 1572864) == 0) {
                        }
                        i11 = i3 & 128;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        i13 = i3 & 256;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        f5 = f4;
                        composer2 = composerKN;
                        if ((i5 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                    }
                    function28 = function25;
                    if ((i2 & 1572864) == 0) {
                    }
                    i11 = i3 & 128;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 256;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    f5 = f4;
                    composer2 = composerKN;
                    if ((i5 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function27 = function23;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                }
                function28 = function25;
                if ((i2 & 1572864) == 0) {
                }
                i11 = i3 & 128;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i3 & 256;
                if (i13 == 0) {
                }
                i14 = i13;
                f5 = f4;
                composer2 = composerKN;
                if ((i5 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function26 = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function27 = function23;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            i10 = i3 & 32;
            if (i10 != 0) {
            }
            function28 = function25;
            if ((i2 & 1572864) == 0) {
            }
            i11 = i3 & 128;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i3 & 256;
            if (i13 == 0) {
            }
            i14 = i13;
            f5 = f4;
            composer2 = composerKN;
            if ((i5 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function26 = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function27 = function23;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        i10 = i3 & 32;
        if (i10 != 0) {
        }
        function28 = function25;
        if ((i2 & 1572864) == 0) {
        }
        i11 = i3 & 128;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i3 & 256;
        if (i13 == 0) {
        }
        i14 = i13;
        f5 = f4;
        composer2 = composerKN;
        if ((i5 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult o(MeasureScope measureScope, final int i2, final int i3, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5, final boolean z2, final int i5, final int i7, final int i8) {
        return MeasureScope.ER(measureScope, i2, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ListItemKt$place$1
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
                Placeable.PlacementScope placementScope2;
                int iN;
                Placeable placeable6 = placeable;
                if (placeable6 != null) {
                    int i9 = i5;
                    boolean z3 = z2;
                    int iN2 = i8;
                    int i10 = i3;
                    if (!z3) {
                        iN2 = Alignment.INSTANCE.xMQ().n(placeable6.getHeight(), i10);
                    }
                    Placeable.PlacementScope.az(placementScope, placeable6, i9, iN2, 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                Placeable placeable7 = placeable2;
                if (placeable7 != null) {
                    int i11 = i2;
                    int i12 = i7;
                    boolean z4 = z2;
                    int iN3 = i8;
                    int i13 = i3;
                    int width = (i11 - i12) - placeable7.getWidth();
                    if (!z4) {
                        iN3 = Alignment.INSTANCE.xMQ().n(placeable7.getHeight(), i13);
                    }
                    Placeable.PlacementScope.az(placementScope2, placeable7, width, iN3, 0.0f, 4, null);
                }
                int iS = i5 + TextFieldImplKt.S(placeable);
                if (z2) {
                    iN = i8;
                } else {
                    iN = Alignment.INSTANCE.xMQ().n(TextFieldImplKt.Z(placeable3) + TextFieldImplKt.Z(placeable4) + TextFieldImplKt.Z(placeable5), i3);
                }
                int i14 = iN;
                Placeable placeable8 = placeable4;
                if (placeable8 != null) {
                    Placeable.PlacementScope.az(placementScope2, placeable8, iS, i14, 0.0f, 4, null);
                }
                int iZ = i14 + TextFieldImplKt.Z(placeable4);
                Placeable placeable9 = placeable3;
                if (placeable9 != null) {
                    Placeable.PlacementScope.az(placementScope2, placeable9, iS, iZ, 0.0f, 4, null);
                }
                int iZ2 = iZ + TextFieldImplKt.Z(placeable3);
                Placeable placeable10 = placeable5;
                if (placeable10 != null) {
                    Placeable.PlacementScope.az(placementScope2, placeable10, iS, iZ2, 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int qie(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i5, int i7, int i8, int i9, int i10, long j2) {
        ListItemType.Companion companion = ListItemType.INSTANCE;
        return RangesKt.coerceAtMost(Math.max(Math.max(Constraints.az(j2), intrinsicMeasureScope.How(ListItemType.xMQ(i9, companion.n()) ? ListTokens.f29685n.ty() : ListItemType.xMQ(i9, companion.t()) ? ListTokens.f29685n.WPU() : ListTokens.f29685n.o())), i10 + Math.max(i2, Math.max(i5 + i7 + i8, i3))), Constraints.gh(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(Density density, int i2) {
        return i2 > density.I4p(TextUnitKt.KN(30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(2052297037);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function22) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function23) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function24) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function25) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2052297037, i3, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:180)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new ListItemMeasurePolicy();
                composerKN.o(objIF);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) objIF;
            List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function23, function24 == null ? ComposableSingletons$ListItemKt.f25081n.n() : function24, function25 == null ? ComposableSingletons$ListItemKt.f25081n.rl() : function25, function2 == null ? ComposableSingletons$ListItemKt.f25081n.t() : function2, function22 == null ? ComposableSingletons$ListItemKt.f25081n.nr() : function22});
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Function2 function2Rl = LayoutKt.rl(listListOf);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = MultiContentMeasurePolicyKt.n(listItemMeasurePolicy);
                composerKN.o(objIF2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF2;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicy, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl2);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            function2Rl.invoke(composerKN, 0);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ListItemLayout$1
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
                    ListItemKt.rl(function2, function22, function23, function24, function25, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final float ty() {
        return f26111O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int az(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i5, int i7, int i8, int i9, long j2) {
        if (Constraints.KN(j2)) {
            return Constraints.qie(j2);
        }
        return i9 + i2 + Math.max(i5, Math.max(i7, i8)) + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(long j2, final TypographyKeyTokens typographyKeyTokens, Function2 function2, Composer composer, final int i2) {
        int i3;
        long j3;
        final Function2 function22;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(1133967795);
        if ((i2 & 6) == 0) {
            if (composerKN.nr(j2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.p5(typographyKeyTokens)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            j3 = j2;
            function22 = function2;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1133967795, i3, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:658)");
            }
            j3 = j2;
            ProvideContentColorTextStyleKt.n(j3, TypographyKt.t(typographyKeyTokens, composerKN, (i3 >> 3) & 14), function2, composerKN, i3 & 910);
            function22 = function2;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final long j4 = j3;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ListItemKt$ProvideTextStyleFromToken$1
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
                    ListItemKt.t(j4, typographyKeyTokens, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
