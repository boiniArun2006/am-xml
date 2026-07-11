package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
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
import androidx.compose.ui.graphics.Shape;
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
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
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
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0099\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aj\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001ae\u0010\u001b\u001a\u00020\u00032\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001ag\u0010\u001f\u001a\u00020\u00032\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001c\"\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!\"\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!\"\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!\"\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010!\"\u0014\u0010)\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!\"\u0014\u0010+\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010!\"\u0014\u0010-\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", FileUploadManager.f61572j, "dismissAction", "", "actionOnNewLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "actionContentColor", "dismissActionContentColor", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SnackbarData;", "snackbarData", "actionColor", "nr", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V", "text", "Landroidx/compose/ui/text/TextStyle;", "actionTextStyle", c.f62177j, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V", "actionTextColor", "dismissActionColor", "rl", "Landroidx/compose/ui/unit/Dp;", "F", "ContainerMaxWidth", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "O", "SeparateButtonExtraY", "J2", "SnackbarVerticalPadding", "Uo", "TextEndExtraSpacing", "KN", "LongButtonVerticalOffset", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,450:1\n148#2:451\n148#2:528\n148#2:614\n148#2:772\n148#2:773\n148#2:774\n148#2:775\n148#2:776\n148#2:777\n148#2:778\n148#2:779\n85#3:452\n82#3,6:453\n88#3:487\n92#3:613\n78#4,6:459\n85#4,4:474\n89#4,2:484\n78#4,6:495\n85#4,4:510\n89#4,2:520\n93#4:526\n78#4,6:536\n85#4,4:551\n89#4,2:561\n78#4,6:573\n85#4,4:588\n89#4,2:598\n93#4:604\n93#4:608\n93#4:612\n78#4,6:621\n85#4,4:636\n89#4,2:646\n78#4,6:656\n85#4,4:671\n89#4,2:681\n93#4:687\n78#4,6:696\n85#4,4:711\n89#4,2:721\n93#4:727\n78#4,6:736\n85#4,4:751\n89#4,2:761\n93#4:767\n93#4:771\n368#5,9:465\n377#5:486\n368#5,9:501\n377#5:522\n378#5,2:524\n368#5,9:542\n377#5:563\n368#5,9:579\n377#5:600\n378#5,2:602\n378#5,2:606\n378#5,2:610\n368#5,9:627\n377#5:648\n368#5,9:662\n377#5:683\n378#5,2:685\n368#5,9:702\n377#5:723\n378#5,2:725\n368#5,9:742\n377#5:763\n378#5,2:765\n378#5,2:769\n4032#6,6:478\n4032#6,6:514\n4032#6,6:555\n4032#6,6:592\n4032#6,6:640\n4032#6,6:675\n4032#6,6:715\n4032#6,6:755\n71#7:488\n68#7,6:489\n74#7:523\n78#7:527\n71#7:529\n68#7,6:530\n74#7:564\n78#7:609\n71#7:649\n68#7,6:650\n74#7:684\n78#7:688\n71#7:689\n68#7,6:690\n74#7:724\n78#7:728\n71#7:729\n68#7,6:730\n74#7:764\n78#7:768\n98#8:565\n94#8,7:566\n101#8:601\n105#8:605\n1223#9,6:615\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n*L\n243#1:451\n282#1:528\n337#1:614\n442#1:772\n443#1:773\n444#1:774\n445#1:775\n446#1:776\n447#1:777\n448#1:778\n449#1:779\n265#1:452\n265#1:453,6\n265#1:487\n265#1:613\n265#1:459,6\n265#1:474,4\n265#1:484,2\n273#1:495,6\n273#1:510,4\n273#1:520,2\n273#1:526\n280#1:536,6\n280#1:551,4\n280#1:561,2\n284#1:573,6\n284#1:588,4\n284#1:598,2\n284#1:604\n280#1:608\n265#1:612\n313#1:621,6\n313#1:636,4\n313#1:646,2\n315#1:656,6\n315#1:671,4\n315#1:681,2\n315#1:687\n317#1:696,6\n317#1:711,4\n317#1:721,2\n317#1:727\n326#1:736,6\n326#1:751,4\n326#1:761,2\n326#1:767\n313#1:771\n265#1:465,9\n265#1:486\n273#1:501,9\n273#1:522\n273#1:524,2\n280#1:542,9\n280#1:563\n284#1:579,9\n284#1:600\n284#1:602,2\n280#1:606,2\n265#1:610,2\n313#1:627,9\n313#1:648\n315#1:662,9\n315#1:683\n315#1:685,2\n317#1:702,9\n317#1:723\n317#1:725,2\n326#1:742,9\n326#1:763\n326#1:765,2\n313#1:769,2\n265#1:478,6\n273#1:514,6\n280#1:555,6\n284#1:592,6\n313#1:640,6\n315#1:675,6\n317#1:715,6\n326#1:755,6\n273#1:488\n273#1:489,6\n273#1:523\n273#1:527\n280#1:529\n280#1:530,6\n280#1:564\n280#1:609\n315#1:649\n315#1:650,6\n315#1:684\n315#1:688\n317#1:689\n317#1:690,6\n317#1:724\n317#1:728\n326#1:729\n326#1:730,6\n326#1:764\n326#1:768\n284#1:565\n284#1:566,7\n284#1:601\n284#1:605\n339#1:615,6\n*E\n"})
public final class SnackbarKt {
    private static final float Uo;
    private static final float nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f27866n = Dp.KN(Sdk.SDKError.Reason.NATIVE_ASSET_ERROR_VALUE);
    private static final float rl = Dp.KN(30);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f27867t = Dp.KN(16);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f27865O = Dp.KN(2);
    private static final float J2 = Dp.KN(6);
    private static final float KN = Dp.KN(12);

    static {
        float f3 = 8;
        nr = Dp.KN(f3);
        Uo = Dp.KN(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public static final void n(final Function2 function2, final Function2 function22, final Function2 function23, final TextStyle textStyle, final long j2, final long j3, Composer composer, final int i2) {
        int i3;
        ?? r12;
        Composer composerKN = composer.KN(-1332496681);
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
            i3 |= composerKN.p5(textStyle) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.nr(j2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.nr(j3) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1332496681, i3, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:263)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAz = PaddingKt.az(SizeKt.KN(SizeKt.g(companion, 0.0f, f27866n, 1, null), 0.0f, 1, null), f27867t, 0.0f, 0.0f, f27865O, 6, null);
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalUo = arrangement.Uo();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            int i5 = i3;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAz);
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
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Modifier modifierUo = AlignmentLineKt.Uo(companion, rl, KN);
            float fKN = nr;
            Modifier modifierAz2 = PaddingKt.az(modifierUo, 0.0f, 0.0f, fKN, 0.0f, 11, null);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz2);
            Function0 function0N2 = companion3.n();
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
            Updater.O(composerN2, measurePolicyUo, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            function2.invoke(composerKN, Integer.valueOf(i5 & 14));
            composerKN.XQ();
            Modifier modifierT = columnScopeInstance.t(companion, companion2.mUb());
            if (function23 == null) {
                r12 = 0;
            } else {
                r12 = 0;
                fKN = Dp.KN(0);
            }
            Modifier modifierAz3 = PaddingKt.az(modifierT, 0.0f, 0.0f, fKN, 0.0f, 11, null);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), r12);
            int iN3 = ComposablesKt.n(composerKN, r12);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierAz3);
            Function0 function0N3 = companion3.n();
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
            Updater.O(composerN3, measurePolicyUo2, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion2.qie(), composerKN, 0);
            int iN4 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
            Modifier modifierO4 = ComposedModifierKt.O(composerKN, companion);
            Function0 function0N4 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N4);
            } else {
                composerKN.r();
            }
            Composer composerN4 = Updater.n(composerKN);
            Updater.O(composerN4, measurePolicyRl, companion3.t());
            Updater.O(composerN4, compositionLocalMapIk4, companion3.O());
            Function2 function2Rl4 = companion3.rl();
            if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                composerN4.o(Integer.valueOf(iN4));
                composerN4.az(Integer.valueOf(iN4), function2Rl4);
            }
            Updater.O(composerN4, modifierO4, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            ProvidedValue[] providedValueArr = {ContentColorKt.n().nr(Color.xMQ(j2)), TextKt.J2().nr(textStyle)};
            int i7 = ProvidedValue.xMQ;
            CompositionLocalKt.t(providedValueArr, function22, composerKN, (i5 & 112) | i7);
            composerKN.eF(618603253);
            if (function23 != null) {
                CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(j3)), function23, composerKN, i7 | ((i5 >> 3) & 112));
            }
            composerKN.Xw();
            composerKN.XQ();
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$NewLineButtonSnackbar$2
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
                    SnackbarKt.n(function2, function22, function23, textStyle, j2, j3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final SnackbarData snackbarData, Modifier modifier, boolean z2, Shape shape, long j2, long j3, long j4, long j5, long j6, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shape2;
        long j7;
        long j9;
        int i8;
        int i9;
        final Modifier modifier3;
        Shape shapeJ2;
        long jT2;
        long jNr;
        long jN;
        long jRl;
        long jO;
        long j10;
        final long j11;
        long j12;
        boolean z4;
        Shape shape3;
        long j13;
        Composer composer2;
        final long j14;
        final boolean z5;
        final Shape shape4;
        final long j15;
        final long j16;
        final long j17;
        final long j18;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i10;
        Composer composerKN = composer.KN(274621471);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(snackbarData) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shape2 = shape;
                        int i12 = composerKN.p5(shape2) ? 2048 : 1024;
                        i5 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    i5 |= i12;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j7 = j2;
                        int i13 = composerKN.nr(j7) ? 16384 : 8192;
                        i5 |= i13;
                    } else {
                        j7 = j2;
                    }
                    i5 |= i13;
                } else {
                    j7 = j2;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        j9 = j3;
                        int i14 = composerKN.nr(j9) ? 131072 : 65536;
                        i5 |= i14;
                    } else {
                        j9 = j3;
                    }
                    i5 |= i14;
                } else {
                    j9 = j3;
                }
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        i10 = i5;
                        i9 = i11;
                        int i15 = composerKN.nr(j4) ? 1048576 : 524288;
                        i8 = i10 | i15;
                    } else {
                        i10 = i5;
                        i9 = i11;
                    }
                    i8 = i10 | i15;
                } else {
                    i8 = i5;
                    i9 = i11;
                }
                if ((i2 & 12582912) == 0) {
                    i8 |= ((i3 & 128) == 0 && composerKN.nr(j5)) ? 8388608 : 4194304;
                }
                if ((100663296 & i2) == 0) {
                    i8 |= ((i3 & 256) == 0 && composerKN.nr(j6)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                }
                if ((38347923 & i8) == 38347922 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    modifier3 = modifier2;
                    z5 = z3;
                    shape4 = shape2;
                    j15 = j7;
                    j16 = j9;
                    j14 = j4;
                    j17 = j5;
                    j18 = j6;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z6 = i7 == 0 ? false : z3;
                        if ((i3 & 8) == 0) {
                            shapeJ2 = SnackbarDefaults.f27822n.J2(composerKN, 6);
                            i8 &= -7169;
                        } else {
                            shapeJ2 = shape2;
                        }
                        if ((i3 & 16) == 0) {
                            jT2 = SnackbarDefaults.f27822n.t(composerKN, 6);
                            i8 &= -57345;
                        } else {
                            jT2 = j7;
                        }
                        if ((i3 & 32) == 0) {
                            jNr = SnackbarDefaults.f27822n.nr(composerKN, 6);
                            i8 &= -458753;
                        } else {
                            jNr = j9;
                        }
                        if ((i3 & 64) == 0) {
                            jN = SnackbarDefaults.f27822n.n(composerKN, 6);
                            i8 &= -3670017;
                        } else {
                            jN = j4;
                        }
                        if ((i3 & 128) == 0) {
                            jRl = SnackbarDefaults.f27822n.rl(composerKN, 6);
                            i8 = (-29360129) & i8;
                        } else {
                            jRl = j5;
                        }
                        if ((i3 & 256) == 0) {
                            i8 &= -234881025;
                            j11 = jN;
                            j12 = jRl;
                            jO = SnackbarDefaults.f27822n.O(composerKN, 6);
                            z4 = z6;
                            shape3 = shapeJ2;
                            j13 = jT2;
                            j10 = jNr;
                        } else {
                            jO = j6;
                            j10 = jNr;
                            j11 = jN;
                            j12 = jRl;
                            z4 = z6;
                            shape3 = shapeJ2;
                            j13 = jT2;
                        }
                    } else {
                        composerKN.wTp();
                        if ((i3 & 8) != 0) {
                            i8 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i8 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i8 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i8 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            i8 &= -29360129;
                        }
                        if ((i3 & 256) != 0) {
                            i8 &= -234881025;
                        }
                        j11 = j4;
                        j12 = j5;
                        jO = j6;
                        modifier3 = modifier2;
                        z4 = z3;
                        shape3 = shape2;
                        j13 = j7;
                        j10 = j9;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(274621471, i8, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:211)");
                    }
                    final String actionLabel = snackbarData.getVisuals().getActionLabel();
                    composerKN.eF(1561344786);
                    ComposableLambda composableLambdaNr = actionLabel == null ? ComposableLambdaKt.nr(-1378313599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void n(Composer composer3, int i16) {
                            if ((i16 & 3) == 2 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1378313599, i16, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:216)");
                            }
                            ButtonColors buttonColorsNY = ButtonDefaults.f24588n.nY(0L, j11, 0L, 0L, composer3, 24576, 13);
                            boolean zP5 = composer3.p5(snackbarData);
                            final SnackbarData snackbarData2 = snackbarData;
                            Object objIF = composer3.iF();
                            if (zP5 || objIF == Composer.INSTANCE.n()) {
                                objIF = new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
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
                                        snackbarData2.rl();
                                    }
                                };
                                composer3.o(objIF);
                            }
                            Function0 function0 = (Function0) objIF;
                            final String str = actionLabel;
                            ButtonKt.O(function0, null, false, null, buttonColorsNY, null, null, null, null, ComposableLambdaKt.nr(521110564, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                    n(rowScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(RowScope rowScope, Composer composer4, int i17) {
                                    if ((i17 & 17) == 16 && composer4.xMQ()) {
                                        composer4.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(521110564, i17, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:219)");
                                    }
                                    TextKt.t(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131070);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer3, 54), composer3, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 494);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerKN, 54) : null;
                    composerKN.Xw();
                    composerKN.eF(1561358724);
                    ComposableLambda composableLambdaNr2 = snackbarData.getVisuals().getWithDismissAction() ? ComposableLambdaKt.nr(-1812633777, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
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
                                ComposerKt.p5(-1812633777, i16, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:228)");
                            }
                            boolean zP5 = composer3.p5(snackbarData);
                            final SnackbarData snackbarData2 = snackbarData;
                            Object objIF = composer3.iF();
                            if (zP5 || objIF == Composer.INSTANCE.n()) {
                                objIF = new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
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
                                        snackbarData2.dismiss();
                                    }
                                };
                                composer3.o(objIF);
                            }
                            IconButtonKt.O((Function0) objIF, null, false, null, null, ComposableSingletons$SnackbarKt.f25110n.n(), composer3, 196608, 30);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54) : null;
                    composerKN.Xw();
                    int i16 = i8 << 3;
                    composer2 = composerKN;
                    t(PaddingKt.xMQ(modifier3, Dp.KN(12)), composableLambdaNr, composableLambdaNr2, z4, shape3, j13, j10, j12, jO, ComposableLambdaKt.nr(-1266389126, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i17) {
                            if ((i17 & 3) == 2 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1266389126, i17, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:251)");
                            }
                            TextKt.t(snackbarData.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composer2, (i16 & 3670016) | (i16 & 7168) | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT | (57344 & i16) | (458752 & i16) | (29360128 & i8) | (234881024 & i8), 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    j14 = j11;
                    z5 = z4;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j10;
                    j17 = j12;
                    j18 = jO;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i17) {
                            SnackbarKt.nr(snackbarData, modifier3, z5, shape4, j15, j16, j14, j17, j18, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            if ((38347923 & i8) == 38347922) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i9 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i3 & 8) == 0) {
                    }
                    if ((i3 & 16) == 0) {
                    }
                    if ((i3 & 32) == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    final String actionLabel2 = snackbarData.getVisuals().getActionLabel();
                    composerKN.eF(1561344786);
                    if (actionLabel2 == null) {
                    }
                    composerKN.Xw();
                    composerKN.eF(1561358724);
                    if (snackbarData.getVisuals().getWithDismissAction()) {
                    }
                    composerKN.Xw();
                    int i162 = i8 << 3;
                    composer2 = composerKN;
                    t(PaddingKt.xMQ(modifier3, Dp.KN(12)), composableLambdaNr, composableLambdaNr2, z4, shape3, j13, j10, j12, jO, ComposableLambdaKt.nr(-1266389126, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i17) {
                            if ((i17 & 3) == 2 && composer3.xMQ()) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1266389126, i17, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:251)");
                            }
                            TextKt.t(snackbarData.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composer2, (i162 & 3670016) | (i162 & 7168) | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT | (57344 & i162) | (458752 & i162) | (29360128 & i8) | (234881024 & i8), 0);
                    if (ComposerKt.v()) {
                    }
                    j14 = j11;
                    z5 = z4;
                    shape4 = shape3;
                    j15 = j13;
                    j16 = j10;
                    j17 = j12;
                    j18 = jO;
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        if ((38347923 & i8) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final Function2 function2, final Function2 function22, final Function2 function23, final TextStyle textStyle, final long j2, final long j3, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-903235475);
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
            i3 |= composerKN.p5(textStyle) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.nr(j2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.nr(j3) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-903235475, i3, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:308)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAz = PaddingKt.az(companion, f27867t, 0.0f, function23 == null ? nr : Dp.KN(0), 0.0f, 10, null);
            Object objIF = composerKN.iF();
            Object objN = Composer.INSTANCE.n();
            final String str = "text";
            int i5 = i3;
            final String str2 = FileUploadManager.f61572j;
            final String str3 = "dismissAction";
            if (objIF == objN) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0125 A[PHI: r0 r4
                      0x0125: PHI (r0v11 int) = (r0v10 int), (r0v17 int), (r0v17 int) binds: [B:63:0x0148, B:56:0x0116, B:58:0x0120] A[DONT_GENERATE, DONT_INLINE]
                      0x0125: PHI (r4v4 int) = (r4v3 int), (r4v12 int), (r4v12 int) binds: [B:63:0x0148, B:56:0x0116, B:58:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j4) {
                        Object obj;
                        Object obj2;
                        int iHow;
                        int iMax;
                        int height;
                        int iZ;
                        MeasureScope measureScope2 = measureScope;
                        int iMin = Math.min(Constraints.qie(j4), measureScope2.How(SnackbarKt.f27866n));
                        String str4 = str2;
                        int size = list.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                obj = null;
                                break;
                            }
                            obj = list.get(i7);
                            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj), str4)) {
                                break;
                            }
                            i7++;
                        }
                        Measurable measurable = (Measurable) obj;
                        Placeable placeableDR0 = measurable != null ? measurable.dR0(j4) : null;
                        String str5 = str3;
                        int size2 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i8);
                            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj2), str5)) {
                                break;
                            }
                            i8++;
                        }
                        Measurable measurable2 = (Measurable) obj2;
                        final Placeable placeableDR02 = measurable2 != null ? measurable2.dR0(j4) : null;
                        int width = placeableDR0 != null ? placeableDR0.getWidth() : 0;
                        int height2 = placeableDR0 != null ? placeableDR0.getHeight() : 0;
                        int width2 = placeableDR02 != null ? placeableDR02.getWidth() : 0;
                        int height3 = placeableDR02 != null ? placeableDR02.getHeight() : 0;
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(((iMin - width) - width2) - (width2 == 0 ? measureScope2.How(SnackbarKt.Uo) : 0), Constraints.ty(j4));
                        String str6 = str;
                        int size3 = list.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            Measurable measurable3 = (Measurable) list.get(i9);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable3), str6)) {
                                int i10 = height3;
                                final Placeable placeableDR03 = measurable3.dR0(Constraints.nr(j4, 0, iCoerceAtLeast, 0, 0, 9, null));
                                int iZ2 = placeableDR03.z(androidx.compose.ui.layout.AlignmentLineKt.n());
                                int iZ3 = placeableDR03.z(androidx.compose.ui.layout.AlignmentLineKt.rl());
                                boolean z2 = true;
                                boolean z3 = (iZ2 == Integer.MIN_VALUE || iZ3 == Integer.MIN_VALUE) ? false : true;
                                if (iZ2 != iZ3 && z3) {
                                    z2 = false;
                                }
                                final int i11 = iMin - width2;
                                final int i12 = i11 - width;
                                if (z2) {
                                    iMax = Math.max(measureScope2.How(SnackbarTokens.f29898n.Uo()), Math.max(height2, i10));
                                    iHow = (iMax - placeableDR03.getHeight()) / 2;
                                    height = (placeableDR0 == null || (iZ = placeableDR0.z(androidx.compose.ui.layout.AlignmentLineKt.n())) == Integer.MIN_VALUE) ? 0 : (iZ2 + iHow) - iZ;
                                } else {
                                    iHow = measureScope2.How(SnackbarKt.rl) - iZ2;
                                    iMax = Math.max(measureScope2.How(SnackbarTokens.f29898n.mUb()), placeableDR03.getHeight() + iHow);
                                    if (placeableDR0 != null) {
                                        height = (iMax - placeableDR0.getHeight()) / 2;
                                    }
                                }
                                final int i13 = height;
                                final int i14 = iHow;
                                int i15 = iMax;
                                final int height4 = placeableDR02 != null ? (i15 - placeableDR02.getHeight()) / 2 : 0;
                                final Placeable placeable = placeableDR0;
                                return MeasureScope.ER(measureScope2, iMin, i15, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1.2
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
                                        Placeable.PlacementScope.az(placementScope, placeableDR03, 0, i14, 0.0f, 4, null);
                                        Placeable placeable2 = placeableDR02;
                                        if (placeable2 != null) {
                                            Placeable.PlacementScope.az(placementScope, placeable2, i11, height4, 0.0f, 4, null);
                                        }
                                        Placeable placeable3 = placeable;
                                        if (placeable3 != null) {
                                            Placeable.PlacementScope.az(placementScope, placeable3, i12, i13, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                            i9++;
                            measureScope2 = measureScope;
                            height3 = height3;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAz);
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
            Modifier modifierGh = PaddingKt.gh(LayoutIdKt.rl(companion, "text"), 0.0f, J2, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
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
            function2.invoke(composerKN, Integer.valueOf(i5 & 14));
            composerKN.XQ();
            composerKN.eF(-904778058);
            if (function22 != null) {
                Modifier modifierRl = LayoutIdKt.rl(companion, FileUploadManager.f61572j);
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
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
                CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(j2)), TextKt.J2().nr(textStyle)}, function22, composerKN, ProvidedValue.xMQ | (i5 & 112));
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.eF(-904766579);
            if (function23 != null) {
                Modifier modifierRl2 = LayoutIdKt.rl(companion, "dismissAction");
                MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion3.HI(), false);
                int iN4 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierRl2);
                Function0 function0N4 = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N4);
                } else {
                    composerKN.r();
                }
                Composer composerN4 = Updater.n(composerKN);
                Updater.O(composerN4, measurePolicyUo3, companion2.t());
                Updater.O(composerN4, compositionLocalMapIk4, companion2.O());
                Function2 function2Rl4 = companion2.rl();
                if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                    composerN4.o(Integer.valueOf(iN4));
                    composerN4.az(Integer.valueOf(iN4), function2Rl4);
                }
                Updater.O(composerN4, modifierO4, companion2.nr());
                CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(j3)), function23, composerKN, ProvidedValue.xMQ | ((i5 >> 3) & 112));
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
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$3
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
                    SnackbarKt.rl(function2, function22, function23, textStyle, j2, j3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Modifier modifier, Function2 function2, Function2 function22, boolean z2, Shape shape, long j2, long j3, long j4, long j5, final Function2 function23, Composer composer, final int i2, final int i3) {
        int i5;
        Function2 function24;
        int i7;
        Function2 function25;
        int i8;
        boolean z3;
        Shape shape2;
        long j6;
        int i9;
        final Modifier modifier2;
        Function2 function26;
        boolean z4;
        Shape shapeJ2;
        long jT2;
        long jNr;
        long jRl;
        long jO;
        Composer composer2;
        final boolean z5;
        final Function2 function27;
        final Shape shape3;
        final long j7;
        final long j9;
        final long j10;
        final Function2 function28;
        final long j11;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1235788955);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function24 = function2;
                i5 |= composerKN.E2(function24) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function25 = function22;
                    i5 |= composerKN.E2(function25) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z3 = z2;
                        i5 |= composerKN.n(z3) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            shape2 = shape;
                            int i12 = composerKN.p5(shape2) ? 16384 : 8192;
                            i5 |= i12;
                        } else {
                            shape2 = shape;
                        }
                        i5 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            j6 = j2;
                            int i13 = composerKN.nr(j6) ? 131072 : 65536;
                            i5 |= i13;
                        } else {
                            j6 = j2;
                        }
                        i5 |= i13;
                    } else {
                        j6 = j2;
                    }
                    if ((i2 & 1572864) != 0) {
                        i9 = i10;
                        i5 |= ((i3 & 64) == 0 && composerKN.nr(j3)) ? 1048576 : 524288;
                    } else {
                        i9 = i10;
                    }
                    if ((i2 & 12582912) == 0) {
                        i5 |= ((i3 & 128) == 0 && composerKN.nr(j4)) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i2) == 0) {
                        i5 |= ((i3 & 256) == 0 && composerKN.nr(j5)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i3 & 512) != 0) {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i5 |= composerKN.E2(function23) ? 536870912 : 268435456;
                        }
                        if ((i5 & 306783379) == 306783378 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier2 = modifier;
                            composer2 = composerKN;
                            function27 = function24;
                            function28 = function25;
                            z5 = z3;
                            shape3 = shape2;
                            j7 = j6;
                            j9 = j3;
                            j10 = j4;
                            j11 = j5;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                modifier2 = i9 == 0 ? Modifier.INSTANCE : modifier;
                                if (i11 != 0) {
                                    function24 = null;
                                }
                                function26 = i7 == 0 ? function25 : null;
                                z4 = i8 == 0 ? false : z3;
                                if ((i3 & 16) == 0) {
                                    shapeJ2 = SnackbarDefaults.f27822n.J2(composerKN, 6);
                                    i5 &= -57345;
                                } else {
                                    shapeJ2 = shape2;
                                }
                                if ((i3 & 32) == 0) {
                                    jT2 = SnackbarDefaults.f27822n.t(composerKN, 6);
                                    i5 &= -458753;
                                } else {
                                    jT2 = j6;
                                }
                                if ((i3 & 64) == 0) {
                                    jNr = SnackbarDefaults.f27822n.nr(composerKN, 6);
                                    i5 &= -3670017;
                                } else {
                                    jNr = j3;
                                }
                                if ((i3 & 128) == 0) {
                                    jRl = SnackbarDefaults.f27822n.rl(composerKN, 6);
                                    i5 = (-29360129) & i5;
                                } else {
                                    jRl = j4;
                                }
                                if ((i3 & 256) == 0) {
                                    jO = SnackbarDefaults.f27822n.O(composerKN, 6);
                                    i5 &= -234881025;
                                } else {
                                    jO = j5;
                                }
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
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
                                modifier2 = modifier;
                                jRl = j4;
                                jO = j5;
                                function26 = function25;
                                z4 = z3;
                                shapeJ2 = shape2;
                                jT2 = j6;
                                jNr = j3;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1235788955, i5, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:113)");
                            }
                            final boolean z6 = z4;
                            final Function2 function29 = function24;
                            final long j12 = jRl;
                            final Function2 function210 = function26;
                            final long j13 = jO;
                            int i14 = (i5 & 14) | 12779520;
                            int i15 = i5 >> 9;
                            SurfaceKt.n(modifier2, shapeJ2, jT2, jNr, 0.0f, SnackbarTokens.f29898n.nr(), null, ComposableLambdaKt.nr(-1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
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
                                        ComposerKt.p5(-1829663446, i16, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:121)");
                                    }
                                    SnackbarTokens snackbarTokens = SnackbarTokens.f29898n;
                                    TextStyle textStyleT = TypographyKt.t(snackbarTokens.xMQ(), composer3, 6);
                                    final TextStyle textStyleT2 = TypographyKt.t(snackbarTokens.rl(), composer3, 6);
                                    ProvidedValue providedValueNr = TextKt.J2().nr(textStyleT);
                                    final boolean z7 = z6;
                                    final Function2 function211 = function29;
                                    final Function2 function212 = function23;
                                    final Function2 function213 = function210;
                                    final long j14 = j12;
                                    final long j15 = j13;
                                    CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            n(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer4, int i17) {
                                            if ((i17 & 3) == 2 && composer4.xMQ()) {
                                                composer4.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(835891690, i17, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:124)");
                                            }
                                            if (!z7 || function211 == null) {
                                                composer4.eF(-810701708);
                                                SnackbarKt.rl(function212, function211, function213, textStyleT2, j14, j15, composer4, 0);
                                                composer4.Xw();
                                            } else {
                                                composer4.eF(-810715387);
                                                SnackbarKt.n(function212, function211, function213, textStyleT2, j14, j15, composer4, 0);
                                                composer4.Xw();
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer3, 54), composer3, ProvidedValue.xMQ | 48);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, i14 | (i15 & 112) | (i15 & 896) | (i15 & 7168), 80);
                            composer2 = composerKN;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            z5 = z4;
                            function27 = function24;
                            shape3 = shapeJ2;
                            j7 = jT2;
                            j9 = jNr;
                            j10 = jRl;
                            function28 = function26;
                            j11 = jO;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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
                                    SnackbarKt.t(modifier2, function27, function28, z5, shape3, j7, j9, j10, j11, function23, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
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
                            if (i9 == 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i3 & 16) == 0) {
                            }
                            if ((i3 & 32) == 0) {
                            }
                            if ((i3 & 64) == 0) {
                            }
                            if ((i3 & 128) == 0) {
                            }
                            if ((i3 & 256) == 0) {
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            final boolean z62 = z4;
                            final Function2 function292 = function24;
                            final long j122 = jRl;
                            final Function2 function2102 = function26;
                            final long j132 = jO;
                            int i142 = (i5 & 14) | 12779520;
                            int i152 = i5 >> 9;
                            SurfaceKt.n(modifier2, shapeJ2, jT2, jNr, 0.0f, SnackbarTokens.f29898n.nr(), null, ComposableLambdaKt.nr(-1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
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
                                        ComposerKt.p5(-1829663446, i16, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:121)");
                                    }
                                    SnackbarTokens snackbarTokens = SnackbarTokens.f29898n;
                                    TextStyle textStyleT = TypographyKt.t(snackbarTokens.xMQ(), composer3, 6);
                                    final TextStyle textStyleT2 = TypographyKt.t(snackbarTokens.rl(), composer3, 6);
                                    ProvidedValue providedValueNr = TextKt.J2().nr(textStyleT);
                                    final boolean z7 = z62;
                                    final Function2 function211 = function292;
                                    final Function2 function212 = function23;
                                    final Function2 function213 = function2102;
                                    final long j14 = j122;
                                    final long j15 = j132;
                                    CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            n(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer4, int i17) {
                                            if ((i17 & 3) == 2 && composer4.xMQ()) {
                                                composer4.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(835891690, i17, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:124)");
                                            }
                                            if (!z7 || function211 == null) {
                                                composer4.eF(-810701708);
                                                SnackbarKt.rl(function212, function211, function213, textStyleT2, j14, j15, composer4, 0);
                                                composer4.Xw();
                                            } else {
                                                composer4.eF(-810715387);
                                                SnackbarKt.n(function212, function211, function213, textStyleT2, j14, j15, composer4, 0);
                                                composer4.Xw();
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer3, 54), composer3, ProvidedValue.xMQ | 48);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, i142 | (i152 & 112) | (i152 & 896) | (i152 & 7168), 80);
                            composer2 = composerKN;
                            if (ComposerKt.v()) {
                            }
                            z5 = z4;
                            function27 = function24;
                            shape3 = shapeJ2;
                            j7 = jT2;
                            j9 = jNr;
                            j10 = jRl;
                            function28 = function26;
                            j11 = jO;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z3 = z2;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                if ((i2 & 1572864) != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((100663296 & i2) == 0) {
                }
                if ((i3 & 512) != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function25 = function22;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            z3 = z2;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            if ((i2 & 1572864) != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function24 = function2;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function25 = function22;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        z3 = z2;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        if ((i2 & 1572864) != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
