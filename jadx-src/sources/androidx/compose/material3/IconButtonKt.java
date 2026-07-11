package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aZ\u0010\r\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001ah\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00122\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001ad\u0010\u0017\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001ad\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001ar\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\u00122\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001ar\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\u00122\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u001c\u0010\u001b\u001ap\u0010\u001f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a~\u0010!\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/material3/IconButtonColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "O", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "Landroidx/compose/material3/IconToggleButtonColors;", "J2", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "shape", c.f62177j, "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "t", "rl", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "nr", "Landroidx/compose/foundation/BorderStroke;", "border", "Uo", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "KN", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/IconToggleButtonColors;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1292:1\n71#2:1293\n71#2:1333\n71#3:1294\n69#3,5:1295\n74#3:1328\n78#3:1332\n71#3:1334\n69#3,5:1335\n74#3:1368\n78#3:1372\n78#4,6:1300\n85#4,4:1315\n89#4,2:1325\n93#4:1331\n78#4,6:1340\n85#4,4:1355\n89#4,2:1365\n93#4:1371\n368#5,9:1306\n377#5:1327\n378#5,2:1329\n368#5,9:1346\n377#5:1367\n378#5,2:1369\n4032#6,6:1319\n4032#6,6:1359\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt\n*L\n105#1:1293\n171#1:1333\n90#1:1294\n90#1:1295,5\n90#1:1328\n90#1:1332\n155#1:1334\n155#1:1335,5\n155#1:1368\n155#1:1372\n90#1:1300,6\n90#1:1315,4\n90#1:1325,2\n90#1:1331\n155#1:1340,6\n155#1:1355,4\n155#1:1365,2\n155#1:1371\n90#1:1306,9\n90#1:1327\n90#1:1329,2\n155#1:1346,9\n155#1:1367\n155#1:1369,2\n90#1:1319,6\n155#1:1359,6\n*E\n"})
public final class IconButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final boolean z2, final Function1 function1, Modifier modifier, boolean z3, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z4;
        IconToggleButtonColors iconToggleButtonColorsCk;
        int i9;
        MutableInteractionSource mutableInteractionSource2;
        int i10;
        Modifier modifier3;
        IconToggleButtonColors iconToggleButtonColors2;
        final boolean z5;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        final MutableInteractionSource mutableInteractionSource3;
        final IconToggleButtonColors iconToggleButtonColors3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(692561811);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function1) ? 32 : 16;
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
                        z4 = z3;
                        i5 |= composerKN.n(z4) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            iconToggleButtonColorsCk = iconToggleButtonColors;
                            int i11 = composerKN.p5(iconToggleButtonColorsCk) ? 16384 : 8192;
                            i5 |= i11;
                        } else {
                            iconToggleButtonColorsCk = iconToggleButtonColors;
                        }
                        i5 |= i11;
                    } else {
                        iconToggleButtonColorsCk = iconToggleButtonColors;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((i2 & 196608) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i5 |= composerKN.p5(mutableInteractionSource2) ? 131072 : 65536;
                        }
                        if ((i3 & 64) != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function2) ? 1048576 : 524288;
                        }
                        if ((i5 & 599187) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            iconToggleButtonColors3 = iconToggleButtonColorsCk;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            modifier4 = modifier2;
                            z5 = z4;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i7 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i8 != 0) {
                                    z4 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    iconToggleButtonColorsCk = IconButtonDefaults.f25965n.ck(composerKN, 6);
                                    i5 &= -57345;
                                }
                                if (i9 == 0) {
                                    mutableInteractionSource2 = null;
                                    i10 = i5;
                                    modifier3 = modifier2;
                                    iconToggleButtonColors2 = iconToggleButtonColorsCk;
                                }
                                boolean z6 = z4;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(692561811, i10, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:153)");
                                }
                                Modifier modifierRl = InteractiveComponentSizeKt.rl(modifier3);
                                IconButtonTokens iconButtonTokens = IconButtonTokens.f29649n;
                                int i12 = ((i10 >> 6) & 896) | ((i10 >> 9) & 14) | ((i10 << 3) & 112);
                                z5 = z6;
                                IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                int i13 = i10;
                                Modifier modifierN = ToggleableKt.n(BackgroundKt.nr(ClipKt.n(SizeKt.Z(modifierRl, iconButtonTokens.nr()), ShapesKt.O(iconButtonTokens.t(), composerKN, 6)), ((Color) iconToggleButtonColors2.n(z6, z2, composerKN, i12).getValue()).getValue(), null, 2, null), z2, mutableInteractionSource4, RippleKt.nr(false, Dp.KN(iconButtonTokens.nr() / 2), 0L, composerKN, 54, 4), z5, Role.mUb(Role.INSTANCE.t()), function1);
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                                iN = ComposablesKt.n(composerKN, 0);
                                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
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
                                composerN = Updater.n(composerKN);
                                Updater.O(composerN, measurePolicyUo, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                function2Rl = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(((Color) iconToggleButtonColors4.rl(z5, z2, composerKN, i12).getValue()).getValue())), function2, composerKN, ProvidedValue.xMQ | ((i13 >> 15) & 112));
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                mutableInteractionSource3 = mutableInteractionSource4;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                modifier4 = modifier3;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                            }
                            iconToggleButtonColors2 = iconToggleButtonColorsCk;
                            i10 = i5;
                            modifier3 = modifier2;
                            boolean z62 = z4;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            Modifier modifierRl2 = InteractiveComponentSizeKt.rl(modifier3);
                            IconButtonTokens iconButtonTokens2 = IconButtonTokens.f29649n;
                            int i122 = ((i10 >> 6) & 896) | ((i10 >> 9) & 14) | ((i10 << 3) & 112);
                            z5 = z62;
                            IconToggleButtonColors iconToggleButtonColors42 = iconToggleButtonColors2;
                            MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                            int i132 = i10;
                            Modifier modifierN2 = ToggleableKt.n(BackgroundKt.nr(ClipKt.n(SizeKt.Z(modifierRl2, iconButtonTokens2.nr()), ShapesKt.O(iconButtonTokens2.t(), composerKN, 6)), ((Color) iconToggleButtonColors2.n(z62, z2, composerKN, i122).getValue()).getValue(), null, 2, null), z2, mutableInteractionSource42, RippleKt.nr(false, Dp.KN(iconButtonTokens2.nr() / 2), 0L, composerKN, 54, 4), z5, Role.mUb(Role.INSTANCE.t()), function1);
                            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN2);
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
                            if (composerN.getInserting()) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                                Updater.O(composerN, modifierO2, companion2.nr());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                                CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(((Color) iconToggleButtonColors42.rl(z5, z2, composerKN, i122).getValue()).getValue())), function2, composerKN, ProvidedValue.xMQ | ((i132 >> 15) & 112));
                                composerKN.XQ();
                                if (ComposerKt.v()) {
                                }
                                mutableInteractionSource3 = mutableInteractionSource42;
                                iconToggleButtonColors3 = iconToggleButtonColors42;
                                modifier4 = modifier3;
                            }
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$IconToggleButton$2
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
                                    IconButtonKt.J2(z2, function1, modifier4, z5, iconToggleButtonColors3, mutableInteractionSource3, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i3 & 64) != 0) {
                    }
                    if ((i5 & 599187) == 599186) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if (i9 == 0) {
                                iconToggleButtonColors2 = iconToggleButtonColorsCk;
                                i10 = i5;
                                modifier3 = modifier2;
                            }
                            boolean z622 = z4;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            Modifier modifierRl22 = InteractiveComponentSizeKt.rl(modifier3);
                            IconButtonTokens iconButtonTokens22 = IconButtonTokens.f29649n;
                            int i1222 = ((i10 >> 6) & 896) | ((i10 >> 9) & 14) | ((i10 << 3) & 112);
                            z5 = z622;
                            IconToggleButtonColors iconToggleButtonColors422 = iconToggleButtonColors2;
                            MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                            int i1322 = i10;
                            Modifier modifierN22 = ToggleableKt.n(BackgroundKt.nr(ClipKt.n(SizeKt.Z(modifierRl22, iconButtonTokens22.nr()), ShapesKt.O(iconButtonTokens22.t(), composerKN, 6)), ((Color) iconToggleButtonColors2.n(z622, z2, composerKN, i1222).getValue()).getValue(), null, 2, null), z2, mutableInteractionSource422, RippleKt.nr(false, Dp.KN(iconButtonTokens22.nr() / 2), 0L, composerKN, 54, 4), z5, Role.mUb(Role.INSTANCE.t()), function1);
                            MeasurePolicy measurePolicyUo22 = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                            Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierN22);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0 function0N22 = companion22.n();
                            if (composerKN.getApplier() == null) {
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                            }
                            composerN = Updater.n(composerKN);
                            Updater.O(composerN, measurePolicyUo22, companion22.t());
                            Updater.O(composerN, compositionLocalMapIk22, companion22.O());
                            function2Rl = companion22.rl();
                            if (composerN.getInserting()) {
                            }
                        }
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z3;
                if ((i2 & 24576) != 0) {
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 64) != 0) {
                }
                if ((i5 & 599187) == 599186) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            z4 = z3;
            if ((i2 & 24576) != 0) {
            }
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 64) != 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        z4 = z3;
        if ((i2 & 24576) != 0) {
        }
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 64) != 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final boolean z2, final Function1 function1, Modifier modifier, boolean z3, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z4;
        Shape shapeTy;
        IconToggleButtonColors iconToggleButtonColorsZ;
        BorderStroke borderStroke2;
        int i9;
        MutableInteractionSource mutableInteractionSource2;
        int i10;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        final Shape shape3;
        final BorderStroke borderStroke4;
        final MutableInteractionSource mutableInteractionSource4;
        final IconToggleButtonColors iconToggleButtonColors3;
        final boolean z5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1470292106);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function1) ? 32 : 16;
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
                if (i8 == 0) {
                    if ((i2 & 3072) == 0) {
                        z4 = z3;
                        i5 |= composerKN.n(z4) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            shapeTy = shape;
                            int i11 = composerKN.p5(shapeTy) ? 16384 : 8192;
                            i5 |= i11;
                        } else {
                            shapeTy = shape;
                        }
                        i5 |= i11;
                    } else {
                        shapeTy = shape;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            iconToggleButtonColorsZ = iconToggleButtonColors;
                            int i12 = composerKN.p5(iconToggleButtonColorsZ) ? 131072 : 65536;
                            i5 |= i12;
                        } else {
                            iconToggleButtonColorsZ = iconToggleButtonColors;
                        }
                        i5 |= i12;
                    } else {
                        iconToggleButtonColorsZ = iconToggleButtonColors;
                    }
                    if ((1572864 & i2) != 0) {
                        if ((i3 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            int i13 = composerKN.p5(borderStroke2) ? 1048576 : 524288;
                            i5 |= i13;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i5 |= i13;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                        mutableInteractionSource2 = mutableInteractionSource;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.p5(mutableInteractionSource2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i3 & 256) == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= composerKN.E2(function2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((38347923 & i5) == 38347922 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i8 != 0) {
                                z4 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                                shapeTy = IconButtonDefaults.f25965n.ty(composerKN, 6);
                            }
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                                iconToggleButtonColorsZ = IconButtonDefaults.f25965n.Z(composerKN, 6);
                            }
                            if ((i3 & 64) != 0) {
                                BorderStroke borderStrokeO = IconButtonDefaults.f25965n.o(z4, z2, composerKN, ((i5 >> 9) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i5 << 3) & 112));
                                i5 &= -3670017;
                                borderStroke2 = borderStrokeO;
                            }
                            if (i9 == 0) {
                                i10 = i5;
                                shape2 = shapeTy;
                                iconToggleButtonColors2 = iconToggleButtonColorsZ;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource3 = null;
                                modifier3 = modifier2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1470292106, i10, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:561)");
                            }
                            int i14 = i10 >> 9;
                            int i15 = (i14 & 896) | (i14 & 14) | ((i10 << 3) & 112);
                            Modifier modifier5 = modifier3;
                            IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                            boolean z6 = z4;
                            SurfaceKt.t(z2, function1, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                                }
                            }, 1, null), z6, shape2, ((Color) iconToggleButtonColors2.n(z4, z2, composerKN, i15).getValue()).getValue(), ((Color) iconToggleButtonColors2.rl(z4, z2, composerKN, i15).getValue()).getValue(), 0.0f, 0.0f, borderStroke3, mutableInteractionSource3, ComposableLambdaKt.nr(1207657396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$2
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
                                        ComposerKt.p5(1207657396, i16, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:572)");
                                    }
                                    Modifier modifierZ = SizeKt.Z(Modifier.INSTANCE, OutlinedIconButtonTokens.f29765n.rl());
                                    Alignment alignmentO = Alignment.INSTANCE.O();
                                    Function2 function22 = function2;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                    int iN = ComposablesKt.n(composer2, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierZ);
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
                                    function22.invoke(composer2, 0);
                                    composer2.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, (64638 & i10) | (1879048192 & (i10 << 9)), ((i10 >> 21) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            shape3 = shape2;
                            borderStroke4 = borderStroke3;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            iconToggleButtonColors3 = iconToggleButtonColors4;
                            z5 = z6;
                            modifier4 = modifier5;
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
                        }
                        i10 = i5;
                        modifier3 = modifier2;
                        iconToggleButtonColors2 = iconToggleButtonColorsZ;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeTy;
                        borderStroke3 = borderStroke2;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        int i142 = i10 >> 9;
                        int i152 = (i142 & 896) | (i142 & 14) | ((i10 << 3) & 112);
                        Modifier modifier52 = modifier3;
                        IconToggleButtonColors iconToggleButtonColors42 = iconToggleButtonColors2;
                        boolean z62 = z4;
                        SurfaceKt.t(z2, function1, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                            }
                        }, 1, null), z62, shape2, ((Color) iconToggleButtonColors2.n(z4, z2, composerKN, i152).getValue()).getValue(), ((Color) iconToggleButtonColors2.rl(z4, z2, composerKN, i152).getValue()).getValue(), 0.0f, 0.0f, borderStroke3, mutableInteractionSource3, ComposableLambdaKt.nr(1207657396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$2
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
                                    ComposerKt.p5(1207657396, i16, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:572)");
                                }
                                Modifier modifierZ = SizeKt.Z(Modifier.INSTANCE, OutlinedIconButtonTokens.f29765n.rl());
                                Alignment alignmentO = Alignment.INSTANCE.O();
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                int iN = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierZ);
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
                                function22.invoke(composer2, 0);
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (64638 & i10) | (1879048192 & (i10 << 9)), ((i10 >> 21) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK);
                        if (ComposerKt.v()) {
                        }
                        shape3 = shape2;
                        borderStroke4 = borderStroke3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        iconToggleButtonColors3 = iconToggleButtonColors42;
                        z5 = z62;
                        modifier4 = modifier52;
                    } else {
                        composerKN.wTp();
                        modifier4 = modifier2;
                        shape3 = shapeTy;
                        iconToggleButtonColors3 = iconToggleButtonColorsZ;
                        borderStroke4 = borderStroke2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        z5 = z4;
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$3
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
                                IconButtonKt.KN(z2, function1, modifier4, z5, shape3, iconToggleButtonColors3, borderStroke4, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                z4 = z3;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                if ((1572864 & i2) != 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((38347923 & i5) == 38347922) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if ((i3 & 32) != 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        if (i9 == 0) {
                            i10 = i5;
                            modifier3 = modifier2;
                            iconToggleButtonColors2 = iconToggleButtonColorsZ;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeTy;
                            borderStroke3 = borderStroke2;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        int i1422 = i10 >> 9;
                        int i1522 = (i1422 & 896) | (i1422 & 14) | ((i10 << 3) & 112);
                        Modifier modifier522 = modifier3;
                        IconToggleButtonColors iconToggleButtonColors422 = iconToggleButtonColors2;
                        boolean z622 = z4;
                        SurfaceKt.t(z2, function1, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                            }
                        }, 1, null), z622, shape2, ((Color) iconToggleButtonColors2.n(z4, z2, composerKN, i1522).getValue()).getValue(), ((Color) iconToggleButtonColors2.rl(z4, z2, composerKN, i1522).getValue()).getValue(), 0.0f, 0.0f, borderStroke3, mutableInteractionSource3, ComposableLambdaKt.nr(1207657396, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconToggleButton$2
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
                                    ComposerKt.p5(1207657396, i16, -1, "androidx.compose.material3.OutlinedIconToggleButton.<anonymous> (IconButton.kt:572)");
                                }
                                Modifier modifierZ = SizeKt.Z(Modifier.INSTANCE, OutlinedIconButtonTokens.f29765n.rl());
                                Alignment alignmentO = Alignment.INSTANCE.O();
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                int iN = ComposablesKt.n(composer2, 0);
                                CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer2, modifierZ);
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
                                function22.invoke(composer2, 0);
                                composer2.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (64638 & i10) | (1879048192 & (i10 << 9)), ((i10 >> 21) & 14) | 48, RendererCapabilities.DECODER_SUPPORT_MASK);
                        if (ComposerKt.v()) {
                        }
                        shape3 = shape2;
                        borderStroke4 = borderStroke3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        iconToggleButtonColors3 = iconToggleButtonColors422;
                        z5 = z622;
                        modifier4 = modifier522;
                    }
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 == 0) {
            }
            z4 = z3;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            if ((1572864 & i2) != 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((38347923 & i5) == 38347922) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 == 0) {
        }
        z4 = z3;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((38347923 & i5) == 38347922) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final Function0 function0, Modifier modifier, boolean z2, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        IconButtonColors iconButtonColorsHI;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        final IconButtonColors iconButtonColors2;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1142896114);
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
        int i9 = i3 & 2;
        if (i9 != 0) {
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
                        iconButtonColorsHI = iconButtonColors;
                        int i10 = composerKN.p5(iconButtonColorsHI) ? 2048 : 1024;
                        i5 |= i10;
                    } else {
                        iconButtonColorsHI = iconButtonColors;
                    }
                    i5 |= i10;
                } else {
                    iconButtonColorsHI = iconButtonColors;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else if ((i2 & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i5 |= composerKN.p5(mutableInteractionSource2) ? 16384 : 8192;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i3 & 32) != 0) {
                    i5 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i5 |= composerKN.E2(function2) ? 131072 : 65536;
                }
                if ((i5 & 74899) == 74898 && composerKN.xMQ()) {
                    composerKN.wTp();
                    mutableInteractionSource4 = mutableInteractionSource2;
                    modifier3 = modifier2;
                    iconButtonColors2 = iconButtonColorsHI;
                } else {
                    composerKN.e();
                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i7 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                            iconButtonColorsHI = IconButtonDefaults.f25965n.HI(composerKN, 6);
                        }
                        if (i8 == 0) {
                            mutableInteractionSource3 = null;
                        }
                        Modifier modifier4 = modifier2;
                        boolean z4 = z3;
                        IconButtonColors iconButtonColors3 = iconButtonColorsHI;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1142896114, i5, -1, "androidx.compose.material3.IconButton (IconButton.kt:88)");
                        }
                        Modifier modifierRl = InteractiveComponentSizeKt.rl(modifier4);
                        IconButtonTokens iconButtonTokens = IconButtonTokens.f29649n;
                        int i11 = i5;
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                        Modifier modifierNr = ClickableKt.nr(BackgroundKt.nr(ClipKt.n(SizeKt.Z(modifierRl, iconButtonTokens.nr()), ShapesKt.O(iconButtonTokens.t(), composerKN, 6)), iconButtonColors3.n(z4), null, 2, null), mutableInteractionSource5, RippleKt.nr(false, Dp.KN(iconButtonTokens.nr() / 2), 0L, composerKN, 54, 4), z4, null, Role.mUb(Role.INSTANCE.n()), function02, 8, null);
                        z3 = z4;
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
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
                        composerN = Updater.n(composerKN);
                        Updater.O(composerN, measurePolicyUo, companion.t());
                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                        function2Rl = companion.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(iconButtonColors3.rl(z3))), function2, composerKN, ProvidedValue.xMQ | ((i11 >> 12) & 112));
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        iconButtonColors2 = iconButtonColors3;
                        mutableInteractionSource4 = mutableInteractionSource5;
                        modifier3 = modifier4;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    Modifier modifier42 = modifier2;
                    boolean z42 = z3;
                    IconButtonColors iconButtonColors32 = iconButtonColorsHI;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Modifier modifierRl2 = InteractiveComponentSizeKt.rl(modifier42);
                    IconButtonTokens iconButtonTokens2 = IconButtonTokens.f29649n;
                    int i112 = i5;
                    MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                    Modifier modifierNr2 = ClickableKt.nr(BackgroundKt.nr(ClipKt.n(SizeKt.Z(modifierRl2, iconButtonTokens2.nr()), ShapesKt.O(iconButtonTokens2.t(), composerKN, 6)), iconButtonColors32.n(z42), null, 2, null), mutableInteractionSource52, RippleKt.nr(false, Dp.KN(iconButtonTokens2.nr() / 2), 0L, composerKN, 54, 4), z42, null, Role.mUb(Role.INSTANCE.n()), function02, 8, null);
                    z3 = z42;
                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierNr2);
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
                    if (composerN.getInserting()) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                        Updater.O(composerN, modifierO2, companion2.nr());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                        CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(iconButtonColors32.rl(z3))), function2, composerKN, ProvidedValue.xMQ | ((i112 >> 12) & 112));
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                        }
                        iconButtonColors2 = iconButtonColors32;
                        mutableInteractionSource4 = mutableInteractionSource52;
                        modifier3 = modifier42;
                    }
                }
                final boolean z5 = z3;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$2
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
                            IconButtonKt.O(function0, modifier3, z5, iconButtonColors2, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
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
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i5 & 74899) == 74898) {
                composerKN.e();
                if ((i2 & 1) != 0) {
                    if (i9 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i8 == 0) {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    Modifier modifier422 = modifier2;
                    boolean z422 = z3;
                    IconButtonColors iconButtonColors322 = iconButtonColorsHI;
                    composerKN.S();
                    if (ComposerKt.v()) {
                    }
                    Modifier modifierRl22 = InteractiveComponentSizeKt.rl(modifier422);
                    IconButtonTokens iconButtonTokens22 = IconButtonTokens.f29649n;
                    int i1122 = i5;
                    MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
                    Modifier modifierNr22 = ClickableKt.nr(BackgroundKt.nr(ClipKt.n(SizeKt.Z(modifierRl22, iconButtonTokens22.nr()), ShapesKt.O(iconButtonTokens22.t(), composerKN, 6)), iconButtonColors322.n(z422), null, 2, null), mutableInteractionSource522, RippleKt.nr(false, Dp.KN(iconButtonTokens22.nr() / 2), 0L, composerKN, 54, 4), z422, null, Role.mUb(Role.INSTANCE.n()), function02, 8, null);
                    z3 = z422;
                    MeasurePolicy measurePolicyUo22 = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                    Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierNr22);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0 function0N22 = companion22.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo22, companion22.t());
                    Updater.O(composerN, compositionLocalMapIk22, companion22.O());
                    function2Rl = companion22.rl();
                    if (composerN.getInserting()) {
                    }
                }
            }
            final boolean z52 = z3;
            scopeUpdateScopeGh = composerKN.gh();
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
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i5 & 74899) == 74898) {
        }
        final boolean z522 = z3;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final Function0 function0, Modifier modifier, boolean z2, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shapeTy;
        IconButtonColors iconButtonColorsR;
        BorderStroke borderStroke2;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        int i9;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        boolean z4;
        Composer composer2;
        final IconButtonColors iconButtonColors3;
        final boolean z5;
        final Shape shape3;
        final BorderStroke borderStroke4;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1746603025);
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
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shapeTy = shape;
                        int i11 = composerKN.p5(shapeTy) ? 2048 : 1024;
                        i5 |= i11;
                    } else {
                        shapeTy = shape;
                    }
                    i5 |= i11;
                } else {
                    shapeTy = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        iconButtonColorsR = iconButtonColors;
                        int i12 = composerKN.p5(iconButtonColorsR) ? 16384 : 8192;
                        i5 |= i12;
                    } else {
                        iconButtonColorsR = iconButtonColors;
                    }
                    i5 |= i12;
                } else {
                    iconButtonColorsR = iconButtonColors;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        borderStroke2 = borderStroke;
                        int i13 = composerKN.p5(borderStroke2) ? 131072 : 65536;
                        i5 |= i13;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i5 |= i13;
                } else {
                    borderStroke2 = borderStroke;
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                    if ((1572864 & i2) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.E2(function2) ? 8388608 : 4194304;
                    }
                    if ((4793491 & i5) == 4793490 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                                shapeTy = IconButtonDefaults.f25965n.ty(composerKN, 6);
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                                iconButtonColorsR = IconButtonDefaults.f25965n.r(composerKN, 6);
                            }
                            if ((i3 & 32) != 0) {
                                BorderStroke borderStrokeIk = IconButtonDefaults.f25965n.Ik(z3, composerKN, ((i5 >> 6) & 14) | 48);
                                i5 &= -458753;
                                borderStroke2 = borderStrokeIk;
                            }
                            i9 = i5;
                            if (i8 == 0) {
                                shape2 = shapeTy;
                                iconButtonColors2 = iconButtonColorsR;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource3 = null;
                            } else {
                                shape2 = shapeTy;
                                iconButtonColors2 = iconButtonColorsR;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            z4 = z3;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i5 &= -458753;
                            }
                            modifier3 = modifier2;
                            shape2 = shapeTy;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i9 = i5;
                            z4 = z3;
                            iconButtonColors2 = iconButtonColorsR;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1746603025, i9, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:497)");
                        }
                        int i14 = i9 & 8078;
                        int i15 = i9 << 9;
                        composer2 = composerKN;
                        SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                            }
                        }, 1, null), z4, shape2, iconButtonColors2.n(z4), iconButtonColors2.rl(z4), 0.0f, 0.0f, borderStroke3, mutableInteractionSource3, ComposableLambdaKt.nr(582332538, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$2
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
                                    ComposerKt.p5(582332538, i16, -1, "androidx.compose.material3.OutlinedIconButton.<anonymous> (IconButton.kt:507)");
                                }
                                Modifier modifierZ = SizeKt.Z(Modifier.INSTANCE, OutlinedIconButtonTokens.f29765n.rl());
                                Alignment alignmentO = Alignment.INSTANCE.O();
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierZ);
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
                                Updater.O(composerN, measurePolicyUo, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                Function2 function2Rl = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function22.invoke(composer3, 0);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, i14 | (234881024 & i15) | (i15 & 1879048192), 6, 192);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        iconButtonColors3 = iconButtonColors2;
                        z5 = z4;
                        shape3 = shape2;
                        borderStroke4 = borderStroke3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier4 = modifier2;
                        z5 = z3;
                        shape3 = shapeTy;
                        iconButtonColors3 = iconButtonColorsR;
                        borderStroke4 = borderStroke2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$3
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
                                IconButtonKt.Uo(function0, modifier4, z5, shape3, iconButtonColors3, borderStroke4, mutableInteractionSource4, function2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 1572864;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 128) == 0) {
                }
                if ((4793491 & i5) == 4793490) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i10 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if ((i3 & 32) != 0) {
                        }
                        i9 = i5;
                        if (i8 == 0) {
                        }
                        z4 = z3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        int i142 = i9 & 8078;
                        int i152 = i9 << 9;
                        composer2 = composerKN;
                        SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                            }
                        }, 1, null), z4, shape2, iconButtonColors2.n(z4), iconButtonColors2.rl(z4), 0.0f, 0.0f, borderStroke3, mutableInteractionSource3, ComposableLambdaKt.nr(582332538, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$OutlinedIconButton$2
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
                                    ComposerKt.p5(582332538, i16, -1, "androidx.compose.material3.OutlinedIconButton.<anonymous> (IconButton.kt:507)");
                                }
                                Modifier modifierZ = SizeKt.Z(Modifier.INSTANCE, OutlinedIconButtonTokens.f29765n.rl());
                                Alignment alignmentO = Alignment.INSTANCE.O();
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierZ);
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
                                Updater.O(composerN, measurePolicyUo, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                Function2 function2Rl = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function22.invoke(composer3, 0);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, i142 | (234881024 & i152) | (i152 & 1879048192), 6, 192);
                        if (ComposerKt.v()) {
                        }
                        iconButtonColors3 = iconButtonColors2;
                        z5 = z4;
                        shape3 = shape2;
                        borderStroke4 = borderStroke3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        modifier4 = modifier3;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 128) == 0) {
            }
            if ((4793491 & i5) == 4793490) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 128) == 0) {
        }
        if ((4793491 & i5) == 4793490) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function0 function0, Modifier modifier, boolean z2, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shapeAz;
        IconButtonColors iconButtonColorsO;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        int i9;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer2;
        final IconButtonColors iconButtonColors3;
        final Modifier modifier4;
        final boolean z4;
        final Shape shape3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1594730011);
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
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shapeAz = shape;
                        int i11 = composerKN.p5(shapeAz) ? 2048 : 1024;
                        i5 |= i11;
                    } else {
                        shapeAz = shape;
                    }
                    i5 |= i11;
                } else {
                    shapeAz = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        iconButtonColorsO = iconButtonColors;
                        int i12 = composerKN.p5(iconButtonColorsO) ? 16384 : 8192;
                        i5 |= i12;
                    } else {
                        iconButtonColorsO = iconButtonColors;
                    }
                    i5 |= i12;
                } else {
                    iconButtonColorsO = iconButtonColors;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.E2(function2) ? 1048576 : 524288;
                    }
                    if ((599187 & i5) == 599186 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                                shapeAz = IconButtonDefaults.f25965n.az(composerKN, 6);
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                                iconButtonColorsO = IconButtonDefaults.f25965n.O(composerKN, 6);
                            }
                            i9 = i5;
                            if (i8 == 0) {
                                shape2 = shapeAz;
                                iconButtonColors2 = iconButtonColorsO;
                                mutableInteractionSource3 = null;
                            } else {
                                shape2 = shapeAz;
                                iconButtonColors2 = iconButtonColorsO;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                            modifier3 = modifier2;
                            shape2 = shapeAz;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i9 = i5;
                            iconButtonColors2 = iconButtonColorsO;
                        }
                        boolean z5 = z3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1594730011, i9, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:222)");
                        }
                        IconButtonColors iconButtonColors4 = iconButtonColors2;
                        Modifier modifier5 = modifier3;
                        composer2 = composerKN;
                        SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                            }
                        }, 1, null), z5, shape2, iconButtonColors2.n(z5), iconButtonColors2.rl(z5), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(-1560623888, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i13) {
                                if ((i13 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1560623888, i13, -1, "androidx.compose.material3.FilledIconButton.<anonymous> (IconButton.kt:231)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.f29576n;
                                Modifier modifierS = SizeKt.S(companion, filledIconButtonTokens.nr(), filledIconButtonTokens.rl());
                                Alignment alignmentO = Alignment.INSTANCE.O();
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierS);
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
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function22.invoke(composer3, 0);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, (i9 & 8078) | ((i9 << 12) & 1879048192), 6, 448);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        iconButtonColors3 = iconButtonColors4;
                        modifier4 = modifier5;
                        z4 = z5;
                        shape3 = shape2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier4 = modifier2;
                        z4 = z3;
                        shape3 = shapeAz;
                        iconButtonColors3 = iconButtonColorsO;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i13) {
                                IconButtonKt.n(function0, modifier4, z4, shape3, iconButtonColors3, mutableInteractionSource4, function2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 64) == 0) {
                }
                if ((599187 & i5) == 599186) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i10 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        i9 = i5;
                        if (i8 == 0) {
                        }
                        boolean z52 = z3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        IconButtonColors iconButtonColors42 = iconButtonColors2;
                        Modifier modifier52 = modifier3;
                        composer2 = composerKN;
                        SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                            }
                        }, 1, null), z52, shape2, iconButtonColors2.n(z52), iconButtonColors2.rl(z52), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(-1560623888, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i13) {
                                if ((i13 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1560623888, i13, -1, "androidx.compose.material3.FilledIconButton.<anonymous> (IconButton.kt:231)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.f29576n;
                                Modifier modifierS = SizeKt.S(companion, filledIconButtonTokens.nr(), filledIconButtonTokens.rl());
                                Alignment alignmentO = Alignment.INSTANCE.O();
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierS);
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
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function22.invoke(composer3, 0);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, (i9 & 8078) | ((i9 << 12) & 1879048192), 6, 448);
                        if (ComposerKt.v()) {
                        }
                        iconButtonColors3 = iconButtonColors42;
                        modifier4 = modifier52;
                        z4 = z52;
                        shape3 = shape2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 64) == 0) {
            }
            if ((599187 & i5) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 64) == 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final boolean z2, final Function1 function1, Modifier modifier, boolean z3, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Function1 function12;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z4;
        Shape shapeAz;
        IconToggleButtonColors iconToggleButtonColorsKN;
        int i9;
        MutableInteractionSource mutableInteractionSource2;
        int i10;
        Modifier modifier3;
        boolean z5;
        IconToggleButtonColors iconToggleButtonColors2;
        MutableInteractionSource mutableInteractionSource3;
        final Shape shape2;
        final MutableInteractionSource mutableInteractionSource4;
        final IconToggleButtonColors iconToggleButtonColors3;
        final boolean z6;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1676089246);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function12 = function1;
                i5 |= composerKN.E2(function12) ? 32 : 16;
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
                        z4 = z3;
                        i5 |= composerKN.n(z4) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            shapeAz = shape;
                            int i11 = composerKN.p5(shapeAz) ? 16384 : 8192;
                            i5 |= i11;
                        } else {
                            shapeAz = shape;
                        }
                        i5 |= i11;
                    } else {
                        shapeAz = shape;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            iconToggleButtonColorsKN = iconToggleButtonColors;
                            int i12 = composerKN.p5(iconToggleButtonColorsKN) ? 131072 : 65536;
                            i5 |= i12;
                        } else {
                            iconToggleButtonColorsKN = iconToggleButtonColors;
                        }
                        i5 |= i12;
                    } else {
                        iconToggleButtonColorsKN = iconToggleButtonColors;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i2) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i5 |= composerKN.p5(mutableInteractionSource2) ? 1048576 : 524288;
                        }
                        if ((i3 & 128) != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.E2(function2) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i5) == 4793490 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier4 = modifier2;
                            z6 = z4;
                            shape2 = shapeAz;
                            iconToggleButtonColors3 = iconToggleButtonColorsKN;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i7 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i8 != 0) {
                                    z4 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                    shapeAz = IconButtonDefaults.f25965n.az(composerKN, 6);
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                    iconToggleButtonColorsKN = IconButtonDefaults.f25965n.KN(composerKN, 6);
                                }
                                if (i9 == 0) {
                                    i10 = i5;
                                    modifier3 = modifier2;
                                    z5 = z4;
                                    iconToggleButtonColors2 = iconToggleButtonColorsKN;
                                    mutableInteractionSource3 = null;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1676089246, i10, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:425)");
                                }
                                int i13 = i10 >> 9;
                                int i14 = (i13 & 896) | (i13 & 14) | ((i10 << 3) & 112);
                                Modifier modifier5 = modifier3;
                                Shape shape3 = shapeAz;
                                IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                                SurfaceKt.t(z2, function12, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                                    }
                                }, 1, null), z5, shape3, ((Color) iconToggleButtonColors2.n(z5, z2, composerKN, i14).getValue()).getValue(), ((Color) iconToggleButtonColors2.rl(z5, z2, composerKN, i14).getValue()).getValue(), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(-58218680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$2
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        n(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer2, int i15) {
                                        if ((i15 & 3) == 2 && composer2.xMQ()) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-58218680, i15, -1, "androidx.compose.material3.FilledTonalIconToggleButton.<anonymous> (IconButton.kt:435)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.f29617n;
                                        Modifier modifierS = SizeKt.S(companion, filledTonalIconButtonTokens.t(), filledTonalIconButtonTokens.rl());
                                        Alignment alignmentO = Alignment.INSTANCE.O();
                                        Function2 function22 = function2;
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                        int iN = ComposablesKt.n(composer2, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer2, modifierS);
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
                                        Updater.O(composerN, measurePolicyUo, companion2.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                        Function2 function2Rl = companion2.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion2.nr());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                        function22.invoke(composer2, 0);
                                        composer2.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, 64638 & i10, ((i10 >> 18) & 14) | 48, 896);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                shape2 = shape3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                z6 = z5;
                                modifier4 = modifier5;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                            }
                            i10 = i5;
                            modifier3 = modifier2;
                            z5 = z4;
                            iconToggleButtonColors2 = iconToggleButtonColorsKN;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i132 = i10 >> 9;
                            int i142 = (i132 & 896) | (i132 & 14) | ((i10 << 3) & 112);
                            Modifier modifier52 = modifier3;
                            Shape shape32 = shapeAz;
                            IconToggleButtonColors iconToggleButtonColors42 = iconToggleButtonColors2;
                            SurfaceKt.t(z2, function12, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                                }
                            }, 1, null), z5, shape32, ((Color) iconToggleButtonColors2.n(z5, z2, composerKN, i142).getValue()).getValue(), ((Color) iconToggleButtonColors2.rl(z5, z2, composerKN, i142).getValue()).getValue(), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(-58218680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$2
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i15) {
                                    if ((i15 & 3) == 2 && composer2.xMQ()) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-58218680, i15, -1, "androidx.compose.material3.FilledTonalIconToggleButton.<anonymous> (IconButton.kt:435)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.f29617n;
                                    Modifier modifierS = SizeKt.S(companion, filledTonalIconButtonTokens.t(), filledTonalIconButtonTokens.rl());
                                    Alignment alignmentO = Alignment.INSTANCE.O();
                                    Function2 function22 = function2;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                    int iN = ComposablesKt.n(composer2, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierS);
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
                                    Updater.O(composerN, measurePolicyUo, companion2.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                    Function2 function2Rl = companion2.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion2.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    function22.invoke(composer2, 0);
                                    composer2.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, 64638 & i10, ((i10 >> 18) & 14) | 48, 896);
                            if (ComposerKt.v()) {
                            }
                            shape2 = shape32;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            iconToggleButtonColors3 = iconToggleButtonColors42;
                            z6 = z5;
                            modifier4 = modifier52;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i15) {
                                    IconButtonKt.nr(z2, function1, modifier4, z6, shape2, iconToggleButtonColors3, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i3 & 128) != 0) {
                    }
                    if ((4793491 & i5) == 4793490) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if (i9 == 0) {
                                i10 = i5;
                                modifier3 = modifier2;
                                z5 = z4;
                                iconToggleButtonColors2 = iconToggleButtonColorsKN;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i1322 = i10 >> 9;
                            int i1422 = (i1322 & 896) | (i1322 & 14) | ((i10 << 3) & 112);
                            Modifier modifier522 = modifier3;
                            Shape shape322 = shapeAz;
                            IconToggleButtonColors iconToggleButtonColors422 = iconToggleButtonColors2;
                            SurfaceKt.t(z2, function12, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                                }
                            }, 1, null), z5, shape322, ((Color) iconToggleButtonColors2.n(z5, z2, composerKN, i1422).getValue()).getValue(), ((Color) iconToggleButtonColors2.rl(z5, z2, composerKN, i1422).getValue()).getValue(), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(-58218680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconToggleButton$2
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i15) {
                                    if ((i15 & 3) == 2 && composer2.xMQ()) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-58218680, i15, -1, "androidx.compose.material3.FilledTonalIconToggleButton.<anonymous> (IconButton.kt:435)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.f29617n;
                                    Modifier modifierS = SizeKt.S(companion, filledTonalIconButtonTokens.t(), filledTonalIconButtonTokens.rl());
                                    Alignment alignmentO = Alignment.INSTANCE.O();
                                    Function2 function22 = function2;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                    int iN = ComposablesKt.n(composer2, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierS);
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
                                    Updater.O(composerN, measurePolicyUo, companion2.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                    Function2 function2Rl = companion2.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion2.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    function22.invoke(composer2, 0);
                                    composer2.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, 64638 & i10, ((i10 >> 18) & 14) | 48, 896);
                            if (ComposerKt.v()) {
                            }
                            shape2 = shape322;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            iconToggleButtonColors3 = iconToggleButtonColors422;
                            z6 = z5;
                            modifier4 = modifier522;
                        }
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z3;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 128) != 0) {
                }
                if ((4793491 & i5) == 4793490) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            z4 = z3;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 128) != 0) {
            }
            if ((4793491 & i5) == 4793490) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function12 = function1;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        z4 = z3;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 128) != 0) {
        }
        if ((4793491 & i5) == 4793490) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final boolean z2, final Function1 function1, Modifier modifier, boolean z3, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        int i5;
        Function1 function12;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z4;
        Shape shapeAz;
        IconToggleButtonColors iconToggleButtonColorsJ2;
        int i9;
        MutableInteractionSource mutableInteractionSource2;
        int i10;
        Modifier modifier3;
        boolean z5;
        IconToggleButtonColors iconToggleButtonColors2;
        MutableInteractionSource mutableInteractionSource3;
        final Shape shape2;
        final MutableInteractionSource mutableInteractionSource4;
        final IconToggleButtonColors iconToggleButtonColors3;
        final boolean z6;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1708189280);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function12 = function1;
                i5 |= composerKN.E2(function12) ? 32 : 16;
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
                        z4 = z3;
                        i5 |= composerKN.n(z4) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            shapeAz = shape;
                            int i11 = composerKN.p5(shapeAz) ? 16384 : 8192;
                            i5 |= i11;
                        } else {
                            shapeAz = shape;
                        }
                        i5 |= i11;
                    } else {
                        shapeAz = shape;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            iconToggleButtonColorsJ2 = iconToggleButtonColors;
                            int i12 = composerKN.p5(iconToggleButtonColorsJ2) ? 131072 : 65536;
                            i5 |= i12;
                        } else {
                            iconToggleButtonColorsJ2 = iconToggleButtonColors;
                        }
                        i5 |= i12;
                    } else {
                        iconToggleButtonColorsJ2 = iconToggleButtonColors;
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                        if ((1572864 & i2) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i5 |= composerKN.p5(mutableInteractionSource2) ? 1048576 : 524288;
                        }
                        if ((i3 & 128) != 0) {
                            i5 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.E2(function2) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i5) == 4793490 && composerKN.xMQ()) {
                            composerKN.wTp();
                            modifier4 = modifier2;
                            z6 = z4;
                            shape2 = shapeAz;
                            iconToggleButtonColors3 = iconToggleButtonColorsJ2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                if (i7 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i8 != 0) {
                                    z4 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                    shapeAz = IconButtonDefaults.f25965n.az(composerKN, 6);
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                    iconToggleButtonColorsJ2 = IconButtonDefaults.f25965n.J2(composerKN, 6);
                                }
                                if (i9 == 0) {
                                    i10 = i5;
                                    modifier3 = modifier2;
                                    z5 = z4;
                                    iconToggleButtonColors2 = iconToggleButtonColorsJ2;
                                    mutableInteractionSource3 = null;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1708189280, i10, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:354)");
                                }
                                int i13 = i10 >> 9;
                                int i14 = (i13 & 896) | (i13 & 14) | ((i10 << 3) & 112);
                                Modifier modifier5 = modifier3;
                                Shape shape3 = shapeAz;
                                IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                                SurfaceKt.t(z2, function12, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                                    }
                                }, 1, null), z5, shape3, ((Color) iconToggleButtonColors2.n(z5, z2, composerKN, i14).getValue()).getValue(), ((Color) iconToggleButtonColors2.rl(z5, z2, composerKN, i14).getValue()).getValue(), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(1235871670, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$2
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        n(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer2, int i15) {
                                        if ((i15 & 3) == 2 && composer2.xMQ()) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1235871670, i15, -1, "androidx.compose.material3.FilledIconToggleButton.<anonymous> (IconButton.kt:364)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.f29576n;
                                        Modifier modifierS = SizeKt.S(companion, filledIconButtonTokens.nr(), filledIconButtonTokens.rl());
                                        Alignment alignmentO = Alignment.INSTANCE.O();
                                        Function2 function22 = function2;
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                        int iN = ComposablesKt.n(composer2, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer2, modifierS);
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
                                        Updater.O(composerN, measurePolicyUo, companion2.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                        Function2 function2Rl = companion2.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion2.nr());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                        function22.invoke(composer2, 0);
                                        composer2.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, 64638 & i10, ((i10 >> 18) & 14) | 48, 896);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                shape2 = shape3;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                z6 = z5;
                                modifier4 = modifier5;
                            } else {
                                composerKN.wTp();
                                if ((i3 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i3 & 32) != 0) {
                                    i5 &= -458753;
                                }
                            }
                            i10 = i5;
                            modifier3 = modifier2;
                            z5 = z4;
                            iconToggleButtonColors2 = iconToggleButtonColorsJ2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i132 = i10 >> 9;
                            int i142 = (i132 & 896) | (i132 & 14) | ((i10 << 3) & 112);
                            Modifier modifier52 = modifier3;
                            Shape shape32 = shapeAz;
                            IconToggleButtonColors iconToggleButtonColors42 = iconToggleButtonColors2;
                            SurfaceKt.t(z2, function12, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                                }
                            }, 1, null), z5, shape32, ((Color) iconToggleButtonColors2.n(z5, z2, composerKN, i142).getValue()).getValue(), ((Color) iconToggleButtonColors2.rl(z5, z2, composerKN, i142).getValue()).getValue(), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(1235871670, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$2
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i15) {
                                    if ((i15 & 3) == 2 && composer2.xMQ()) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1235871670, i15, -1, "androidx.compose.material3.FilledIconToggleButton.<anonymous> (IconButton.kt:364)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.f29576n;
                                    Modifier modifierS = SizeKt.S(companion, filledIconButtonTokens.nr(), filledIconButtonTokens.rl());
                                    Alignment alignmentO = Alignment.INSTANCE.O();
                                    Function2 function22 = function2;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                    int iN = ComposablesKt.n(composer2, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierS);
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
                                    Updater.O(composerN, measurePolicyUo, companion2.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                    Function2 function2Rl = companion2.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion2.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    function22.invoke(composer2, 0);
                                    composer2.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, 64638 & i10, ((i10 >> 18) & 14) | 48, 896);
                            if (ComposerKt.v()) {
                            }
                            shape2 = shape32;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            iconToggleButtonColors3 = iconToggleButtonColors42;
                            z6 = z5;
                            modifier4 = modifier52;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i15) {
                                    IconButtonKt.rl(z2, function1, modifier4, z6, shape2, iconToggleButtonColors3, mutableInteractionSource4, function2, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i3 & 128) != 0) {
                    }
                    if ((4793491 & i5) == 4793490) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if (i9 == 0) {
                                i10 = i5;
                                modifier3 = modifier2;
                                z5 = z4;
                                iconToggleButtonColors2 = iconToggleButtonColorsJ2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i1322 = i10 >> 9;
                            int i1422 = (i1322 & 896) | (i1322 & 14) | ((i10 << 3) & 112);
                            Modifier modifier522 = modifier3;
                            Shape shape322 = shapeAz;
                            IconToggleButtonColors iconToggleButtonColors422 = iconToggleButtonColors2;
                            SurfaceKt.t(z2, function12, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    n(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.t());
                                }
                            }, 1, null), z5, shape322, ((Color) iconToggleButtonColors2.n(z5, z2, composerKN, i1422).getValue()).getValue(), ((Color) iconToggleButtonColors2.rl(z5, z2, composerKN, i1422).getValue()).getValue(), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(1235871670, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconToggleButton$2
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i15) {
                                    if ((i15 & 3) == 2 && composer2.xMQ()) {
                                        composer2.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1235871670, i15, -1, "androidx.compose.material3.FilledIconToggleButton.<anonymous> (IconButton.kt:364)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.f29576n;
                                    Modifier modifierS = SizeKt.S(companion, filledIconButtonTokens.nr(), filledIconButtonTokens.rl());
                                    Alignment alignmentO = Alignment.INSTANCE.O();
                                    Function2 function22 = function2;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                    int iN = ComposablesKt.n(composer2, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer2, modifierS);
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
                                    Updater.O(composerN, measurePolicyUo, companion2.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                    Function2 function2Rl = companion2.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                        composerN.o(Integer.valueOf(iN));
                                        composerN.az(Integer.valueOf(iN), function2Rl);
                                    }
                                    Updater.O(composerN, modifierO, companion2.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    function22.invoke(composer2, 0);
                                    composer2.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composerKN, 64638 & i10, ((i10 >> 18) & 14) | 48, 896);
                            if (ComposerKt.v()) {
                            }
                            shape2 = shape322;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            iconToggleButtonColors3 = iconToggleButtonColors422;
                            z6 = z5;
                            modifier4 = modifier522;
                        }
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z4 = z3;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 128) != 0) {
                }
                if ((4793491 & i5) == 4793490) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            z4 = z3;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 128) != 0) {
            }
            if ((4793491 & i5) == 4793490) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function12 = function1;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        z4 = z3;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 128) != 0) {
        }
        if ((4793491 & i5) == 4793490) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Function0 function0, Modifier modifier, boolean z2, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, final Function2 function2, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape shapeAz;
        IconButtonColors iconButtonColorsUo;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        int i9;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer2;
        final IconButtonColors iconButtonColors3;
        final Modifier modifier4;
        final boolean z4;
        final Shape shape3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-783937767);
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
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shapeAz = shape;
                        int i11 = composerKN.p5(shapeAz) ? 2048 : 1024;
                        i5 |= i11;
                    } else {
                        shapeAz = shape;
                    }
                    i5 |= i11;
                } else {
                    shapeAz = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        iconButtonColorsUo = iconButtonColors;
                        int i12 = composerKN.p5(iconButtonColorsUo) ? 16384 : 8192;
                        i5 |= i12;
                    } else {
                        iconButtonColorsUo = iconButtonColors;
                    }
                    i5 |= i12;
                } else {
                    iconButtonColorsUo = iconButtonColors;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.E2(function2) ? 1048576 : 524288;
                    }
                    if ((599187 & i5) == 599186 || !composerKN.xMQ()) {
                        composerKN.e();
                        if ((i2 & 1) != 0 || composerKN.rV9()) {
                            modifier3 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i7 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                                shapeAz = IconButtonDefaults.f25965n.az(composerKN, 6);
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                                iconButtonColorsUo = IconButtonDefaults.f25965n.Uo(composerKN, 6);
                            }
                            i9 = i5;
                            if (i8 == 0) {
                                shape2 = shapeAz;
                                iconButtonColors2 = iconButtonColorsUo;
                                mutableInteractionSource3 = null;
                            } else {
                                shape2 = shapeAz;
                                iconButtonColors2 = iconButtonColorsUo;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i5 &= -57345;
                            }
                            modifier3 = modifier2;
                            shape2 = shapeAz;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            i9 = i5;
                            iconButtonColors2 = iconButtonColorsUo;
                        }
                        boolean z5 = z3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-783937767, i9, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:289)");
                        }
                        IconButtonColors iconButtonColors4 = iconButtonColors2;
                        Modifier modifier5 = modifier3;
                        composer2 = composerKN;
                        SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                            }
                        }, 1, null), z5, shape2, iconButtonColors2.n(z5), iconButtonColors2.rl(z5), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(-1772884636, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i13) {
                                if ((i13 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1772884636, i13, -1, "androidx.compose.material3.FilledTonalIconButton.<anonymous> (IconButton.kt:298)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.f29617n;
                                Modifier modifierS = SizeKt.S(companion, filledTonalIconButtonTokens.t(), filledTonalIconButtonTokens.rl());
                                Alignment alignmentO = Alignment.INSTANCE.O();
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierS);
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
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function22.invoke(composer3, 0);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, (i9 & 8078) | ((i9 << 12) & 1879048192), 6, 448);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        iconButtonColors3 = iconButtonColors4;
                        modifier4 = modifier5;
                        z4 = z5;
                        shape3 = shape2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        composerKN.wTp();
                        composer2 = composerKN;
                        modifier4 = modifier2;
                        z4 = z3;
                        shape3 = shapeAz;
                        iconButtonColors3 = iconButtonColorsUo;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i13) {
                                IconButtonKt.t(function0, modifier4, z4, shape3, iconButtonColors3, mutableInteractionSource4, function2, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 64) == 0) {
                }
                if ((599187 & i5) == 599186) {
                    composerKN.e();
                    if ((i2 & 1) != 0) {
                        if (i10 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        i9 = i5;
                        if (i8 == 0) {
                        }
                        boolean z52 = z3;
                        composerKN.S();
                        if (ComposerKt.v()) {
                        }
                        IconButtonColors iconButtonColors42 = iconButtonColors2;
                        Modifier modifier52 = modifier3;
                        composer2 = composerKN;
                        SurfaceKt.nr(function02, SemanticsModifierKt.nr(modifier3, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                n(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
                            }
                        }, 1, null), z52, shape2, iconButtonColors2.n(z52), iconButtonColors2.rl(z52), 0.0f, 0.0f, null, mutableInteractionSource3, ComposableLambdaKt.nr(-1772884636, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.IconButtonKt$FilledTonalIconButton$2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i13) {
                                if ((i13 & 3) == 2 && composer3.xMQ()) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1772884636, i13, -1, "androidx.compose.material3.FilledTonalIconButton.<anonymous> (IconButton.kt:298)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.f29617n;
                                Modifier modifierS = SizeKt.S(companion, filledTonalIconButtonTokens.t(), filledTonalIconButtonTokens.rl());
                                Alignment alignmentO = Alignment.INSTANCE.O();
                                Function2 function22 = function2;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentO, false);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer3, modifierS);
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
                                Updater.O(composerN, measurePolicyUo, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                function22.invoke(composer3, 0);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, (i9 & 8078) | ((i9 << 12) & 1879048192), 6, 448);
                        if (ComposerKt.v()) {
                        }
                        iconButtonColors3 = iconButtonColors42;
                        modifier4 = modifier52;
                        z4 = z52;
                        shape3 = shape2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 64) == 0) {
            }
            if ((599187 & i5) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 64) == 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
