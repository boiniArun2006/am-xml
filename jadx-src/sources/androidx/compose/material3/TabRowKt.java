package androidx.compose.material3;

import GJW.vd;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0080\u0001\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0080\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0090\u0001\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0011\u001a\u0094\u0001\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0094\u0001\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u009a\u0001\u0010 \u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001b2.\b\u0002\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001an\u0010\"\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0086\u0001\u0010$\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a~\u0010&\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042,\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\nH\u0003ø\u0001\u0000¢\u0006\u0004\b&\u0010#\u001a \u0001\u0010'\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002,\u0010\f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0013\b\u0002\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)\"\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-\"\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/material3/TabIndicatorScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "rl", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Uo", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "tabPositions", "KN", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/unit/Dp;", "edgePadding", c.f62177j, "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "J2", "t", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "xMQ", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "nr", "(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "mUb", "O", "(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "F", "ScrollableTabRowMinimumTabWidth", "Landroidx/compose/animation/core/AnimationSpec;", "", "Landroidx/compose/animation/core/AnimationSpec;", "ScrollableTabRowScrollSpec", "TabRowIndicatorSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1361:1\n148#2:1362\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n*L\n1352#1:1362\n*E\n"})
public final class TabRowKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f28123n = Dp.KN(90);
    private static final AnimationSpec rl = AnimationSpecKt.ty(250, 0, EasingKt.nr(), 2, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final AnimationSpec f28124t = AnimationSpecKt.ty(250, 0, EasingKt.nr(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final int i2, Modifier modifier, ScrollState scrollState, long j2, long j3, float f3, Function3 function3, Function2 function2, final Function2 function22, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        ScrollState scrollStateT;
        long jUo;
        long jKN;
        int i8;
        float fJ2;
        int i9;
        int i10;
        int i11;
        int i12;
        long j4;
        float f4;
        ScrollState scrollState2;
        long j5;
        Function2 function2O;
        Function3 function32;
        Modifier modifier3;
        long j6;
        final Function2 function23;
        final Function3 function33;
        final float f5;
        final Modifier modifier4;
        final ScrollState scrollState3;
        final long j7;
        final long j9;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1821940917);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i13 = i5 & 2;
        if (i13 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    scrollStateT = scrollState;
                    int i14 = composerKN.p5(scrollStateT) ? 256 : 128;
                    i7 |= i14;
                } else {
                    scrollStateT = scrollState;
                }
                i7 |= i14;
            } else {
                scrollStateT = scrollState;
            }
            if ((i3 & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    jUo = j2;
                    int i15 = composerKN.nr(jUo) ? 2048 : 1024;
                    i7 |= i15;
                } else {
                    jUo = j2;
                }
                i7 |= i15;
            } else {
                jUo = j2;
            }
            if ((i3 & 24576) != 0) {
                if ((i5 & 16) == 0) {
                    jKN = j3;
                    int i16 = composerKN.nr(jKN) ? 16384 : 8192;
                    i7 |= i16;
                } else {
                    jKN = j3;
                }
                i7 |= i16;
            } else {
                jKN = j3;
            }
            i8 = i5 & 32;
            if (i8 == 0) {
                i7 |= 196608;
            } else {
                if ((196608 & i3) == 0) {
                    fJ2 = f3;
                    i7 |= composerKN.rl(fJ2) ? 131072 : 65536;
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i7 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i7 |= composerKN.E2(function3) ? 1048576 : 524288;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i7 |= 12582912;
                } else {
                    if ((i3 & 12582912) == 0) {
                        i11 = i10;
                        i7 |= composerKN.E2(function2) ? 8388608 : 4194304;
                    }
                    if ((i5 & 256) != 0) {
                        if ((i3 & 100663296) == 0) {
                            i7 |= composerKN.E2(function22) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i7 & 38347923) == 38347922 && composerKN.xMQ()) {
                            composerKN.wTp();
                            function23 = function2;
                            modifier4 = modifier2;
                            scrollState3 = scrollStateT;
                            j9 = jUo;
                            j7 = jKN;
                            f5 = fJ2;
                            function33 = function3;
                        } else {
                            composerKN.e();
                            if ((i3 & 1) != 0 || composerKN.rV9()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                    scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                }
                                if ((i5 & 8) != 0) {
                                    jUo = TabRowDefaults.f28102n.Uo(composerKN, 6);
                                    i7 &= -7169;
                                }
                                if ((i5 & 16) != 0) {
                                    jKN = TabRowDefaults.f28102n.KN(composerKN, 6);
                                    i7 &= -57345;
                                }
                                if (i8 != 0) {
                                    fJ2 = TabRowDefaults.f28102n.J2();
                                }
                                Function3 function3Nr = i9 == 0 ? ComposableLambdaKt.nr(1535842470, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, Integer num) {
                                        n(tabIndicatorScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(TabIndicatorScope tabIndicatorScope, Composer composer2, int i17) {
                                        if ((i17 & 6) == 0) {
                                            i17 |= (i17 & 8) == 0 ? composer2.p5(tabIndicatorScope) : composer2.E2(tabIndicatorScope) ? 4 : 2;
                                        }
                                        if ((i17 & 19) == 18 && composer2.xMQ()) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1535842470, i17, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:434)");
                                        }
                                        TabRowDefaults.f28102n.t(tabIndicatorScope.n(Modifier.INSTANCE, i2, false), 0.0f, 0L, composer2, 3072, 6);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54) : function3;
                                if (i11 == 0) {
                                    i12 = i7;
                                    j5 = jKN;
                                    function32 = function3Nr;
                                    function2O = ComposableSingletons$TabRowKt.f25113n.O();
                                    modifier3 = modifier2;
                                    j4 = jUo;
                                    f4 = fJ2;
                                    scrollState2 = scrollStateT;
                                } else {
                                    i12 = i7;
                                    j4 = jUo;
                                    f4 = fJ2;
                                    scrollState2 = scrollStateT;
                                    j5 = jKN;
                                    function2O = function2;
                                    function32 = function3Nr;
                                    modifier3 = modifier2;
                                }
                                j6 = j5;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    i7 &= -7169;
                                }
                                if ((i5 & 16) != 0) {
                                    i7 &= -57345;
                                }
                                i12 = i7;
                                modifier3 = modifier2;
                                j4 = jUo;
                                f4 = fJ2;
                                scrollState2 = scrollStateT;
                                j6 = jKN;
                                function32 = function3;
                                function2O = function2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1821940917, i12, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:440)");
                            }
                            int i17 = i12 >> 3;
                            nr(i2, modifier3, j4, j6, f4, scrollState2, function32, function2O, function22, composerKN, (i12 & 126) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | ((i12 << 9) & 458752) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function23 = function2O;
                            function33 = function32;
                            f5 = f4;
                            long j10 = j4;
                            modifier4 = modifier3;
                            scrollState3 = scrollState2;
                            j7 = j6;
                            j9 = j10;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i18) {
                                    TabRowKt.J2(i2, modifier4, scrollState3, j9, j7, f5, function33, function23, function22, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 100663296;
                    if ((i7 & 38347923) == 38347922) {
                        composerKN.e();
                        if ((i3 & 1) != 0) {
                            if (i13 != 0) {
                            }
                            if ((i5 & 4) != 0) {
                            }
                            if ((i5 & 8) != 0) {
                            }
                            if ((i5 & 16) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            j6 = j5;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i172 = i12 >> 3;
                            nr(i2, modifier3, j4, j6, f4, scrollState2, function32, function2O, function22, composerKN, (i12 & 126) | (i172 & 896) | (i172 & 7168) | (i172 & 57344) | ((i12 << 9) & 458752) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024));
                            if (ComposerKt.v()) {
                            }
                            function23 = function2O;
                            function33 = function32;
                            f5 = f4;
                            long j102 = j4;
                            modifier4 = modifier3;
                            scrollState3 = scrollState2;
                            j7 = j6;
                            j9 = j102;
                        }
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i11 = i10;
                if ((i5 & 256) != 0) {
                }
                if ((i7 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            fJ2 = f3;
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i5 & 256) != 0) {
            }
            if ((i7 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        if ((i3 & 24576) != 0) {
        }
        i8 = i5 & 32;
        if (i8 == 0) {
        }
        fJ2 = f3;
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i5 & 256) != 0) {
        }
        if ((i7 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KN(final int i2, Modifier modifier, long j2, long j3, Function3 function3, Function2 function2, final Function2 function22, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        long jNr;
        long jO;
        int i8;
        Function3 function3Nr;
        int i9;
        Function2 function23;
        Function2 function2T;
        Modifier modifier3;
        long j4;
        Function3 function32;
        int i10;
        long j5;
        Composer composer2;
        final Modifier modifier4;
        final long j6;
        final long j7;
        final Function3 function33;
        final Function2 function24;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1199178586);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i11 = i5 & 2;
        if (i11 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    jNr = j2;
                    int i12 = composerKN.nr(jNr) ? 256 : 128;
                    i7 |= i12;
                } else {
                    jNr = j2;
                }
                i7 |= i12;
            } else {
                jNr = j2;
            }
            if ((i3 & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    jO = j3;
                    int i13 = composerKN.nr(jO) ? 2048 : 1024;
                    i7 |= i13;
                } else {
                    jO = j3;
                }
                i7 |= i13;
            } else {
                jO = j3;
            }
            i8 = i5 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    function3Nr = function3;
                    i7 |= composerKN.E2(function3Nr) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else {
                    if ((196608 & i3) == 0) {
                        function23 = function2;
                        i7 |= composerKN.E2(function23) ? 131072 : 65536;
                    }
                    if ((i5 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            i7 |= composerKN.E2(function22) ? 1048576 : 524288;
                        }
                        if ((i7 & 599187) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            j6 = jNr;
                            j7 = jO;
                            function33 = function3Nr;
                            function24 = function23;
                        } else {
                            composerKN.e();
                            if ((i3 & 1) != 0 || composerKN.rV9()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i5 & 4) != 0) {
                                    jNr = TabRowDefaults.f28102n.nr(composerKN, 6);
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    jO = TabRowDefaults.f28102n.O(composerKN, 6);
                                    i7 &= -7169;
                                }
                                if (i8 != 0) {
                                    function3Nr = ComposableLambdaKt.nr(-2052073983, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                            n(list, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(List list, Composer composer3, int i14) {
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-2052073983, i14, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:307)");
                                            }
                                            if (i2 < list.size()) {
                                                TabRowDefaults tabRowDefaults = TabRowDefaults.f28102n;
                                                tabRowDefaults.t(tabRowDefaults.xMQ(Modifier.INSTANCE, (TabPosition) list.get(i2)), 0.0f, 0L, composer3, 3072, 6);
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                }
                                if (i9 == 0) {
                                    function2T = ComposableSingletons$TabRowKt.f25113n.t();
                                    modifier3 = modifier2;
                                    j4 = jO;
                                    function32 = function3Nr;
                                    i10 = -1199178586;
                                    j5 = jNr;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i10, i7, -1, "androidx.compose.material3.TabRow (TabRow.kt:315)");
                                }
                                composer2 = composerKN;
                                mUb(modifier3, j5, j4, function32, function2T, function22, composer2, (i7 >> 3) & 524286);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier4 = modifier3;
                                j6 = j5;
                                j7 = j4;
                                function33 = function32;
                                function24 = function2T;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    i7 &= -7169;
                                }
                            }
                            modifier3 = modifier2;
                            function32 = function3Nr;
                            function2T = function23;
                            i10 = -1199178586;
                            j5 = jNr;
                            j4 = jO;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            mUb(modifier3, j5, j4, function32, function2T, function22, composer2, (i7 >> 3) & 524286);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            j6 = j5;
                            j7 = j4;
                            function33 = function32;
                            function24 = function2T;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
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
                                    TabRowKt.KN(i2, modifier4, j6, j7, function33, function24, function22, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 1572864;
                    if ((i7 & 599187) == 599186) {
                        composerKN.e();
                        if ((i3 & 1) != 0) {
                            if (i11 != 0) {
                            }
                            if ((i5 & 4) != 0) {
                            }
                            if ((i5 & 8) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                                modifier3 = modifier2;
                                function32 = function3Nr;
                                function2T = function23;
                                i10 = -1199178586;
                                j5 = jNr;
                                j4 = jO;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            mUb(modifier3, j5, j4, function32, function2T, function22, composer2, (i7 >> 3) & 524286);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            j6 = j5;
                            j7 = j4;
                            function33 = function32;
                            function24 = function2T;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function23 = function2;
                if ((i5 & 64) != 0) {
                }
                if ((i7 & 599187) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function3Nr = function3;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            function23 = function2;
            if ((i5 & 64) != 0) {
            }
            if ((i7 & 599187) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        i8 = i5 & 16;
        if (i8 == 0) {
        }
        function3Nr = function3;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        function23 = function2;
        if ((i5 & 64) != 0) {
        }
        if ((i7 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final int i2, final Function3 function3, Modifier modifier, long j2, long j3, float f3, Function2 function2, final Function2 function22, final ScrollState scrollState, Composer composer, final int i3, final int i5) {
        int i7;
        Function3 function32;
        int i8;
        Modifier modifier2;
        long jNr;
        long jO;
        int i9;
        float fJ2;
        int i10;
        Function2 function2Uo;
        Composer composer2;
        final float f4;
        final Function2 function23;
        final Modifier modifier3;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-955409947);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                function32 = function3;
                i7 |= composerKN.E2(function32) ? 32 : 16;
            }
            i8 = i5 & 4;
            if (i8 == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i7 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                if ((i3 & 3072) == 0) {
                    if ((i5 & 8) == 0) {
                        jNr = j2;
                        int i11 = composerKN.nr(jNr) ? 2048 : 1024;
                        i7 |= i11;
                    } else {
                        jNr = j2;
                    }
                    i7 |= i11;
                } else {
                    jNr = j2;
                }
                if ((i3 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        jO = j3;
                        int i12 = composerKN.nr(jO) ? 16384 : 8192;
                        i7 |= i12;
                    } else {
                        jO = j3;
                    }
                    i7 |= i12;
                } else {
                    jO = j3;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else {
                    if ((196608 & i3) == 0) {
                        fJ2 = f3;
                        i7 |= composerKN.rl(fJ2) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i7 |= composerKN.E2(function2) ? 1048576 : 524288;
                    }
                    if ((i5 & 128) == 0) {
                        i7 |= 12582912;
                    } else {
                        if ((i3 & 12582912) == 0) {
                            i7 |= composerKN.E2(function22) ? 8388608 : 4194304;
                        }
                        if ((i5 & 256) == 0) {
                            if ((i3 & 100663296) == 0) {
                                i7 |= composerKN.p5(scrollState) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if ((i7 & 38347923) == 38347922 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i3 & 1) != 0 || composerKN.rV9()) {
                                    if (i8 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if ((i5 & 8) != 0) {
                                        jNr = TabRowDefaults.f28102n.nr(composerKN, 6);
                                        i7 &= -7169;
                                    }
                                    if ((i5 & 16) != 0) {
                                        jO = TabRowDefaults.f28102n.O(composerKN, 6);
                                        i7 &= -57345;
                                    }
                                    if (i9 != 0) {
                                        fJ2 = TabRowDefaults.f28102n.J2();
                                    }
                                    if (i10 == 0) {
                                        function2Uo = ComposableSingletons$TabRowKt.f25113n.Uo();
                                    }
                                    long j6 = jO;
                                    final float f5 = fJ2;
                                    Modifier modifier4 = modifier2;
                                    long j7 = jNr;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-955409947, i7, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:1020)");
                                    }
                                    final Function2 function24 = function2Uo;
                                    final Function3 function33 = function32;
                                    int i13 = ((i7 >> 6) & 14) | 12582912;
                                    int i14 = i7 >> 3;
                                    composer2 = composerKN;
                                    SurfaceKt.n(modifier4, null, j7, j6, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                                            if ((i15 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1572959552, i15, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1022)");
                                            }
                                            Object objIF = composer3.iF();
                                            Composer.Companion companion = Composer.INSTANCE;
                                            if (objIF == companion.n()) {
                                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer3));
                                                composer3.o(compositionScopedCoroutineScopeCanceller);
                                                objIF = compositionScopedCoroutineScopeCanceller;
                                            }
                                            vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                                            boolean zP5 = composer3.p5(scrollState) | composer3.p5(coroutineScope);
                                            ScrollState scrollState2 = scrollState;
                                            Object objIF2 = composer3.iF();
                                            if (zP5 || objIF2 == companion.n()) {
                                                objIF2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                composer3.o(objIF2);
                                            }
                                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objIF2;
                                            Modifier modifierRl = ClipKt.rl(SelectableGroupKt.n(ScrollKt.rl(SizeKt.E2(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.KN(), false, 2, null), scrollState, false, null, false, 14, null)));
                                            boolean zRl = composer3.rl(f5) | composer3.p5(function22) | composer3.p5(function24) | composer3.p5(function33) | composer3.E2(scrollableTabData) | composer3.t(i2);
                                            final float f6 = f5;
                                            final Function2 function25 = function22;
                                            final Function2 function26 = function24;
                                            final int i16 = i2;
                                            final Function3 function34 = function33;
                                            Object objIF3 = composer3.iF();
                                            if (zRl || objIF3 == companion.n()) {
                                                Object obj = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                        return n(subcomposeMeasureScope, constraints.getValue());
                                                    }

                                                    public final MeasureResult n(final SubcomposeMeasureScope subcomposeMeasureScope, final long j9) {
                                                        int iHow = subcomposeMeasureScope.How(TabRowKt.f28123n);
                                                        final int iHow2 = subcomposeMeasureScope.How(f6);
                                                        List listY = subcomposeMeasureScope.Y(TabSlots.Tabs, function25);
                                                        Integer numValueOf = 0;
                                                        int size = listY.size();
                                                        for (int i17 = 0; i17 < size; i17++) {
                                                            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Measurable) listY.get(i17)).g(Integer.MAX_VALUE)));
                                                        }
                                                        final int iIntValue = numValueOf.intValue();
                                                        long jNr2 = Constraints.nr(j9, iHow, 0, iIntValue, iIntValue, 2, null);
                                                        final ArrayList arrayList = new ArrayList();
                                                        final ArrayList arrayList2 = new ArrayList();
                                                        int size2 = listY.size();
                                                        for (int i18 = 0; i18 < size2; i18++) {
                                                            Measurable measurable = (Measurable) listY.get(i18);
                                                            Placeable placeableDR0 = measurable.dR0(jNr2);
                                                            float fKN = Dp.KN(subcomposeMeasureScope.rV9(Math.min(measurable.Nxk(placeableDR0.getHeight()), placeableDR0.getWidth())) - Dp.KN(TabKt.HI() * 2));
                                                            arrayList.add(placeableDR0);
                                                            arrayList2.add(Dp.nr(fKN));
                                                        }
                                                        Integer numValueOf2 = Integer.valueOf(iHow2 * 2);
                                                        int size3 = arrayList.size();
                                                        for (int i19 = 0; i19 < size3; i19++) {
                                                            numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((Placeable) arrayList.get(i19)).getWidth());
                                                        }
                                                        final int iIntValue2 = numValueOf2.intValue();
                                                        final Function2 function27 = function26;
                                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i20 = i16;
                                                        final Function3 function35 = function34;
                                                        return MeasureScope.ER(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
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
                                                                final ArrayList arrayList3 = new ArrayList();
                                                                int i21 = iHow2;
                                                                List list = arrayList;
                                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                List list2 = arrayList2;
                                                                int size4 = list.size();
                                                                int width = i21;
                                                                for (int i22 = 0; i22 < size4; i22++) {
                                                                    Placeable placeable = (Placeable) list.get(i22);
                                                                    Placeable.PlacementScope.az(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope2.rV9(width), subcomposeMeasureScope2.rV9(placeable.getWidth()), ((Dp) list2.get(i22)).getValue(), null));
                                                                    width += placeable.getWidth();
                                                                }
                                                                List listY2 = subcomposeMeasureScope.Y(TabSlots.Divider, function27);
                                                                long j10 = j9;
                                                                int i23 = iIntValue2;
                                                                int i24 = iIntValue;
                                                                int size5 = listY2.size();
                                                                for (int i25 = 0; i25 < size5; i25++) {
                                                                    Placeable placeableDR02 = ((Measurable) listY2.get(i25)).dR0(Constraints.nr(j10, i23, i23, 0, 0, 8, null));
                                                                    Placeable.PlacementScope.az(placementScope, placeableDR02, 0, i24 - placeableDR02.getHeight(), 0.0f, 4, null);
                                                                }
                                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                TabSlots tabSlots = TabSlots.Indicator;
                                                                final Function3 function36 = function35;
                                                                List listY3 = subcomposeMeasureScope3.Y(tabSlots, ComposableLambdaKt.rl(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                        n(composer4, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void n(Composer composer4, int i26) {
                                                                        if ((i26 & 3) == 2 && composer4.xMQ()) {
                                                                            composer4.wTp();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.v()) {
                                                                            ComposerKt.p5(1734082948, i26, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1100)");
                                                                        }
                                                                        function36.invoke(arrayList3, composer4, 0);
                                                                        if (ComposerKt.v()) {
                                                                            ComposerKt.M7();
                                                                        }
                                                                    }
                                                                }));
                                                                int i26 = iIntValue2;
                                                                int i27 = iIntValue;
                                                                int size6 = listY3.size();
                                                                for (int i28 = 0; i28 < size6; i28++) {
                                                                    Placeable.PlacementScope.az(placementScope, ((Measurable) listY3.get(i28)).dR0(Constraints.INSTANCE.t(i26, i27)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.t(subcomposeMeasureScope, iHow2, arrayList3, i20);
                                                            }
                                                        }, 4, null);
                                                    }
                                                };
                                                composer3.o(obj);
                                                objIF3 = obj;
                                            }
                                            SubcomposeLayoutKt.n(modifierRl, (Function2) objIF3, composer3, 0, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composer2, i13 | (i14 & 896) | (i14 & 7168), 114);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    f4 = f5;
                                    function23 = function2Uo;
                                    modifier3 = modifier4;
                                    j4 = j7;
                                    j5 = j6;
                                } else {
                                    composerKN.wTp();
                                    if ((i5 & 8) != 0) {
                                        i7 &= -7169;
                                    }
                                    if ((i5 & 16) != 0) {
                                        i7 &= -57345;
                                    }
                                }
                                function2Uo = function2;
                                long j62 = jO;
                                final float f53 = fJ2;
                                Modifier modifier42 = modifier2;
                                long j72 = jNr;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                final Function2 function242 = function2Uo;
                                final Function3 function332 = function32;
                                int i132 = ((i7 >> 6) & 14) | 12582912;
                                int i142 = i7 >> 3;
                                composer2 = composerKN;
                                SurfaceKt.n(modifier42, null, j72, j62, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                                        if ((i15 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1572959552, i15, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1022)");
                                        }
                                        Object objIF = composer3.iF();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (objIF == companion.n()) {
                                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer3));
                                            composer3.o(compositionScopedCoroutineScopeCanceller);
                                            objIF = compositionScopedCoroutineScopeCanceller;
                                        }
                                        vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                                        boolean zP5 = composer3.p5(scrollState) | composer3.p5(coroutineScope);
                                        ScrollState scrollState2 = scrollState;
                                        Object objIF2 = composer3.iF();
                                        if (zP5 || objIF2 == companion.n()) {
                                            objIF2 = new ScrollableTabData(scrollState2, coroutineScope);
                                            composer3.o(objIF2);
                                        }
                                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objIF2;
                                        Modifier modifierRl = ClipKt.rl(SelectableGroupKt.n(ScrollKt.rl(SizeKt.E2(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.KN(), false, 2, null), scrollState, false, null, false, 14, null)));
                                        boolean zRl = composer3.rl(f53) | composer3.p5(function22) | composer3.p5(function242) | composer3.p5(function332) | composer3.E2(scrollableTabData) | composer3.t(i2);
                                        final float f6 = f53;
                                        final Function2 function25 = function22;
                                        final Function2 function26 = function242;
                                        final int i16 = i2;
                                        final Function3 function34 = function332;
                                        Object objIF3 = composer3.iF();
                                        if (zRl || objIF3 == companion.n()) {
                                            Object obj = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                    return n(subcomposeMeasureScope, constraints.getValue());
                                                }

                                                public final MeasureResult n(final SubcomposeMeasureScope subcomposeMeasureScope, final long j9) {
                                                    int iHow = subcomposeMeasureScope.How(TabRowKt.f28123n);
                                                    final int iHow2 = subcomposeMeasureScope.How(f6);
                                                    List listY = subcomposeMeasureScope.Y(TabSlots.Tabs, function25);
                                                    Integer numValueOf = 0;
                                                    int size = listY.size();
                                                    for (int i17 = 0; i17 < size; i17++) {
                                                        numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Measurable) listY.get(i17)).g(Integer.MAX_VALUE)));
                                                    }
                                                    final int iIntValue = numValueOf.intValue();
                                                    long jNr2 = Constraints.nr(j9, iHow, 0, iIntValue, iIntValue, 2, null);
                                                    final List arrayList = new ArrayList();
                                                    final List arrayList2 = new ArrayList();
                                                    int size2 = listY.size();
                                                    for (int i18 = 0; i18 < size2; i18++) {
                                                        Measurable measurable = (Measurable) listY.get(i18);
                                                        Placeable placeableDR0 = measurable.dR0(jNr2);
                                                        float fKN = Dp.KN(subcomposeMeasureScope.rV9(Math.min(measurable.Nxk(placeableDR0.getHeight()), placeableDR0.getWidth())) - Dp.KN(TabKt.HI() * 2));
                                                        arrayList.add(placeableDR0);
                                                        arrayList2.add(Dp.nr(fKN));
                                                    }
                                                    Integer numValueOf2 = Integer.valueOf(iHow2 * 2);
                                                    int size3 = arrayList.size();
                                                    for (int i19 = 0; i19 < size3; i19++) {
                                                        numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((Placeable) arrayList.get(i19)).getWidth());
                                                    }
                                                    final int iIntValue2 = numValueOf2.intValue();
                                                    final Function2 function27 = function26;
                                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                    final int i20 = i16;
                                                    final Function3 function35 = function34;
                                                    return MeasureScope.ER(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
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
                                                            final List arrayList3 = new ArrayList();
                                                            int i21 = iHow2;
                                                            List list = arrayList;
                                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                            List list2 = arrayList2;
                                                            int size4 = list.size();
                                                            int width = i21;
                                                            for (int i22 = 0; i22 < size4; i22++) {
                                                                Placeable placeable = (Placeable) list.get(i22);
                                                                Placeable.PlacementScope.az(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                arrayList3.add(new TabPosition(subcomposeMeasureScope2.rV9(width), subcomposeMeasureScope2.rV9(placeable.getWidth()), ((Dp) list2.get(i22)).getValue(), null));
                                                                width += placeable.getWidth();
                                                            }
                                                            List listY2 = subcomposeMeasureScope.Y(TabSlots.Divider, function27);
                                                            long j10 = j9;
                                                            int i23 = iIntValue2;
                                                            int i24 = iIntValue;
                                                            int size5 = listY2.size();
                                                            for (int i25 = 0; i25 < size5; i25++) {
                                                                Placeable placeableDR02 = ((Measurable) listY2.get(i25)).dR0(Constraints.nr(j10, i23, i23, 0, 0, 8, null));
                                                                Placeable.PlacementScope.az(placementScope, placeableDR02, 0, i24 - placeableDR02.getHeight(), 0.0f, 4, null);
                                                            }
                                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                            TabSlots tabSlots = TabSlots.Indicator;
                                                            final Function3 function36 = function35;
                                                            List listY3 = subcomposeMeasureScope3.Y(tabSlots, ComposableLambdaKt.rl(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                    n(composer4, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void n(Composer composer4, int i26) {
                                                                    if ((i26 & 3) == 2 && composer4.xMQ()) {
                                                                        composer4.wTp();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.v()) {
                                                                        ComposerKt.p5(1734082948, i26, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1100)");
                                                                    }
                                                                    function36.invoke(arrayList3, composer4, 0);
                                                                    if (ComposerKt.v()) {
                                                                        ComposerKt.M7();
                                                                    }
                                                                }
                                                            }));
                                                            int i26 = iIntValue2;
                                                            int i27 = iIntValue;
                                                            int size6 = listY3.size();
                                                            for (int i28 = 0; i28 < size6; i28++) {
                                                                Placeable.PlacementScope.az(placementScope, ((Measurable) listY3.get(i28)).dR0(Constraints.INSTANCE.t(i26, i27)), 0, 0, 0.0f, 4, null);
                                                            }
                                                            scrollableTabData2.t(subcomposeMeasureScope, iHow2, arrayList3, i20);
                                                        }
                                                    }, 4, null);
                                                }
                                            };
                                            composer3.o(obj);
                                            objIF3 = obj;
                                        }
                                        SubcomposeLayoutKt.n(modifierRl, (Function2) objIF3, composer3, 0, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composer2, i132 | (i142 & 896) | (i142 & 7168), 114);
                                if (ComposerKt.v()) {
                                }
                                f4 = f53;
                                function23 = function2Uo;
                                modifier3 = modifier42;
                                j4 = j72;
                                j5 = j62;
                            } else {
                                composerKN.wTp();
                                composer2 = composerKN;
                                modifier3 = modifier2;
                                j4 = jNr;
                                j5 = jO;
                                f4 = fJ2;
                                function23 = function2;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$2
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
                                        TabRowKt.O(i2, function3, modifier3, j4, j5, f4, function23, function22, scrollState, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 |= 100663296;
                        if ((i7 & 38347923) == 38347922) {
                            composerKN.e();
                            if ((i3 & 1) != 0) {
                                if (i8 != 0) {
                                }
                                if ((i5 & 8) != 0) {
                                }
                                if ((i5 & 16) != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 == 0) {
                                    function2Uo = function2;
                                }
                                long j622 = jO;
                                final float f532 = fJ2;
                                Modifier modifier422 = modifier2;
                                long j722 = jNr;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                final Function2 function2422 = function2Uo;
                                final Function3 function3322 = function32;
                                int i1322 = ((i7 >> 6) & 14) | 12582912;
                                int i1422 = i7 >> 3;
                                composer2 = composerKN;
                                SurfaceKt.n(modifier422, null, j722, j622, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                                        if ((i15 & 3) == 2 && composer3.xMQ()) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1572959552, i15, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1022)");
                                        }
                                        Object objIF = composer3.iF();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (objIF == companion.n()) {
                                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer3));
                                            composer3.o(compositionScopedCoroutineScopeCanceller);
                                            objIF = compositionScopedCoroutineScopeCanceller;
                                        }
                                        vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                                        boolean zP5 = composer3.p5(scrollState) | composer3.p5(coroutineScope);
                                        ScrollState scrollState2 = scrollState;
                                        Object objIF2 = composer3.iF();
                                        if (zP5 || objIF2 == companion.n()) {
                                            objIF2 = new ScrollableTabData(scrollState2, coroutineScope);
                                            composer3.o(objIF2);
                                        }
                                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objIF2;
                                        Modifier modifierRl = ClipKt.rl(SelectableGroupKt.n(ScrollKt.rl(SizeKt.E2(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.KN(), false, 2, null), scrollState, false, null, false, 14, null)));
                                        boolean zRl = composer3.rl(f532) | composer3.p5(function22) | composer3.p5(function2422) | composer3.p5(function3322) | composer3.E2(scrollableTabData) | composer3.t(i2);
                                        final float f6 = f532;
                                        final Function2 function25 = function22;
                                        final Function2 function26 = function2422;
                                        final int i16 = i2;
                                        final Function3 function34 = function3322;
                                        Object objIF3 = composer3.iF();
                                        if (zRl || objIF3 == companion.n()) {
                                            Object obj = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                    return n(subcomposeMeasureScope, constraints.getValue());
                                                }

                                                public final MeasureResult n(final SubcomposeMeasureScope subcomposeMeasureScope, final long j9) {
                                                    int iHow = subcomposeMeasureScope.How(TabRowKt.f28123n);
                                                    final int iHow2 = subcomposeMeasureScope.How(f6);
                                                    List listY = subcomposeMeasureScope.Y(TabSlots.Tabs, function25);
                                                    Integer numValueOf = 0;
                                                    int size = listY.size();
                                                    for (int i17 = 0; i17 < size; i17++) {
                                                        numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Measurable) listY.get(i17)).g(Integer.MAX_VALUE)));
                                                    }
                                                    final int iIntValue = numValueOf.intValue();
                                                    long jNr2 = Constraints.nr(j9, iHow, 0, iIntValue, iIntValue, 2, null);
                                                    final List arrayList = new ArrayList();
                                                    final List arrayList2 = new ArrayList();
                                                    int size2 = listY.size();
                                                    for (int i18 = 0; i18 < size2; i18++) {
                                                        Measurable measurable = (Measurable) listY.get(i18);
                                                        Placeable placeableDR0 = measurable.dR0(jNr2);
                                                        float fKN = Dp.KN(subcomposeMeasureScope.rV9(Math.min(measurable.Nxk(placeableDR0.getHeight()), placeableDR0.getWidth())) - Dp.KN(TabKt.HI() * 2));
                                                        arrayList.add(placeableDR0);
                                                        arrayList2.add(Dp.nr(fKN));
                                                    }
                                                    Integer numValueOf2 = Integer.valueOf(iHow2 * 2);
                                                    int size3 = arrayList.size();
                                                    for (int i19 = 0; i19 < size3; i19++) {
                                                        numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((Placeable) arrayList.get(i19)).getWidth());
                                                    }
                                                    final int iIntValue2 = numValueOf2.intValue();
                                                    final Function2 function27 = function26;
                                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                    final int i20 = i16;
                                                    final Function3 function35 = function34;
                                                    return MeasureScope.ER(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
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
                                                            final List arrayList3 = new ArrayList();
                                                            int i21 = iHow2;
                                                            List list = arrayList;
                                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                            List list2 = arrayList2;
                                                            int size4 = list.size();
                                                            int width = i21;
                                                            for (int i22 = 0; i22 < size4; i22++) {
                                                                Placeable placeable = (Placeable) list.get(i22);
                                                                Placeable.PlacementScope.az(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                arrayList3.add(new TabPosition(subcomposeMeasureScope2.rV9(width), subcomposeMeasureScope2.rV9(placeable.getWidth()), ((Dp) list2.get(i22)).getValue(), null));
                                                                width += placeable.getWidth();
                                                            }
                                                            List listY2 = subcomposeMeasureScope.Y(TabSlots.Divider, function27);
                                                            long j10 = j9;
                                                            int i23 = iIntValue2;
                                                            int i24 = iIntValue;
                                                            int size5 = listY2.size();
                                                            for (int i25 = 0; i25 < size5; i25++) {
                                                                Placeable placeableDR02 = ((Measurable) listY2.get(i25)).dR0(Constraints.nr(j10, i23, i23, 0, 0, 8, null));
                                                                Placeable.PlacementScope.az(placementScope, placeableDR02, 0, i24 - placeableDR02.getHeight(), 0.0f, 4, null);
                                                            }
                                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                            TabSlots tabSlots = TabSlots.Indicator;
                                                            final Function3 function36 = function35;
                                                            List listY3 = subcomposeMeasureScope3.Y(tabSlots, ComposableLambdaKt.rl(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                    n(composer4, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void n(Composer composer4, int i26) {
                                                                    if ((i26 & 3) == 2 && composer4.xMQ()) {
                                                                        composer4.wTp();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.v()) {
                                                                        ComposerKt.p5(1734082948, i26, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1100)");
                                                                    }
                                                                    function36.invoke(arrayList3, composer4, 0);
                                                                    if (ComposerKt.v()) {
                                                                        ComposerKt.M7();
                                                                    }
                                                                }
                                                            }));
                                                            int i26 = iIntValue2;
                                                            int i27 = iIntValue;
                                                            int size6 = listY3.size();
                                                            for (int i28 = 0; i28 < size6; i28++) {
                                                                Placeable.PlacementScope.az(placementScope, ((Measurable) listY3.get(i28)).dR0(Constraints.INSTANCE.t(i26, i27)), 0, 0, 0.0f, 4, null);
                                                            }
                                                            scrollableTabData2.t(subcomposeMeasureScope, iHow2, arrayList3, i20);
                                                        }
                                                    }, 4, null);
                                                }
                                            };
                                            composer3.o(obj);
                                            objIF3 = obj;
                                        }
                                        SubcomposeLayoutKt.n(modifierRl, (Function2) objIF3, composer3, 0, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composer2, i1322 | (i1422 & 896) | (i1422 & 7168), 114);
                                if (ComposerKt.v()) {
                                }
                                f4 = f532;
                                function23 = function2Uo;
                                modifier3 = modifier422;
                                j4 = j722;
                                j5 = j622;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    if ((i5 & 256) == 0) {
                    }
                    if ((i7 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                fJ2 = f3;
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                if ((i5 & 128) == 0) {
                }
                if ((i5 & 256) == 0) {
                }
                if ((i7 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            fJ2 = f3;
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            if ((i5 & 128) == 0) {
            }
            if ((i5 & 256) == 0) {
            }
            if ((i7 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        function32 = function3;
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        fJ2 = f3;
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        if ((i5 & 128) == 0) {
        }
        if ((i5 & 256) == 0) {
        }
        if ((i7 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final int i2, Modifier modifier, long j2, long j3, Function3 function3, Function2 function2, final Function2 function22, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        long jUo;
        long jKN;
        int i8;
        Function3 function3Nr;
        int i9;
        Function2 function23;
        Function2 function2Rl;
        Modifier modifier3;
        long j4;
        Function3 function32;
        int i10;
        long j5;
        Composer composer2;
        final Modifier modifier4;
        final long j6;
        final long j7;
        final Function3 function33;
        final Function2 function24;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1909540706);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i11 = i5 & 2;
        if (i11 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    jUo = j2;
                    int i12 = composerKN.nr(jUo) ? 256 : 128;
                    i7 |= i12;
                } else {
                    jUo = j2;
                }
                i7 |= i12;
            } else {
                jUo = j2;
            }
            if ((i3 & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    jKN = j3;
                    int i13 = composerKN.nr(jKN) ? 2048 : 1024;
                    i7 |= i13;
                } else {
                    jKN = j3;
                }
                i7 |= i13;
            } else {
                jKN = j3;
            }
            i8 = i5 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    function3Nr = function3;
                    i7 |= composerKN.E2(function3Nr) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else {
                    if ((196608 & i3) == 0) {
                        function23 = function2;
                        i7 |= composerKN.E2(function23) ? 131072 : 65536;
                    }
                    if ((i5 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            i7 |= composerKN.E2(function22) ? 1048576 : 524288;
                        }
                        if ((i7 & 599187) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            j6 = jUo;
                            j7 = jKN;
                            function33 = function3Nr;
                            function24 = function23;
                        } else {
                            composerKN.e();
                            if ((i3 & 1) != 0 || composerKN.rV9()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i5 & 4) != 0) {
                                    jUo = TabRowDefaults.f28102n.Uo(composerKN, 6);
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    jKN = TabRowDefaults.f28102n.KN(composerKN, 6);
                                    i7 &= -7169;
                                }
                                if (i8 != 0) {
                                    function3Nr = ComposableLambdaKt.nr(286693261, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, Integer num) {
                                            n(tabIndicatorScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(TabIndicatorScope tabIndicatorScope, Composer composer3, int i14) {
                                            if ((i14 & 6) == 0) {
                                                i14 |= (i14 & 8) == 0 ? composer3.p5(tabIndicatorScope) : composer3.E2(tabIndicatorScope) ? 4 : 2;
                                            }
                                            if ((i14 & 19) == 18 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(286693261, i14, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:213)");
                                            }
                                            TabRowDefaults.f28102n.t(tabIndicatorScope.n(Modifier.INSTANCE, i2, false), 0.0f, 0L, composer3, 3072, 6);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                }
                                if (i9 == 0) {
                                    function2Rl = ComposableSingletons$TabRowKt.f25113n.rl();
                                    modifier3 = modifier2;
                                    j4 = jKN;
                                    function32 = function3Nr;
                                    i10 = -1909540706;
                                    j5 = jUo;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i10, i7, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:219)");
                                }
                                composer2 = composerKN;
                                xMQ(modifier3, j5, j4, function32, function2Rl, function22, composer2, (i7 >> 3) & 524286);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier4 = modifier3;
                                j6 = j5;
                                j7 = j4;
                                function33 = function32;
                                function24 = function2Rl;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    i7 &= -7169;
                                }
                            }
                            modifier3 = modifier2;
                            function32 = function3Nr;
                            function2Rl = function23;
                            i10 = -1909540706;
                            j5 = jUo;
                            j4 = jKN;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            xMQ(modifier3, j5, j4, function32, function2Rl, function22, composer2, (i7 >> 3) & 524286);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            j6 = j5;
                            j7 = j4;
                            function33 = function32;
                            function24 = function2Rl;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$2
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
                                    TabRowKt.Uo(i2, modifier4, j6, j7, function33, function24, function22, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 1572864;
                    if ((i7 & 599187) == 599186) {
                        composerKN.e();
                        if ((i3 & 1) != 0) {
                            if (i11 != 0) {
                            }
                            if ((i5 & 4) != 0) {
                            }
                            if ((i5 & 8) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                                modifier3 = modifier2;
                                function32 = function3Nr;
                                function2Rl = function23;
                                i10 = -1909540706;
                                j5 = jUo;
                                j4 = jKN;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            xMQ(modifier3, j5, j4, function32, function2Rl, function22, composer2, (i7 >> 3) & 524286);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            j6 = j5;
                            j7 = j4;
                            function33 = function32;
                            function24 = function2Rl;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function23 = function2;
                if ((i5 & 64) != 0) {
                }
                if ((i7 & 599187) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function3Nr = function3;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            function23 = function2;
            if ((i5 & 64) != 0) {
            }
            if ((i7 & 599187) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        i8 = i5 & 16;
        if (i8 == 0) {
        }
        function3Nr = function3;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        function23 = function2;
        if ((i5 & 64) != 0) {
        }
        if ((i7 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(Modifier modifier, final long j2, final long j3, final Function3 function3, final Function2 function2, final Function2 function22, Composer composer, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerKN = composer.KN(-160898917);
        if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.nr(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function22) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-160898917, i3, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:948)");
            }
            int i5 = i3 << 3;
            composer2 = composerKN;
            SurfaceKt.n(SelectableGroupKt.n(modifier2), null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-1617702432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1
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
                        ComposerKt.p5(-1617702432, i7, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:954)");
                    }
                    Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
                    boolean zP5 = composer3.p5(function22) | composer3.p5(function2) | composer3.p5(function3);
                    final Function2 function23 = function22;
                    final Function2 function24 = function2;
                    final Function3 function32 = function3;
                    Object objIF = composer3.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return n(subcomposeMeasureScope, constraints.getValue());
                            }

                            public final MeasureResult n(final SubcomposeMeasureScope subcomposeMeasureScope, final long j4) {
                                final int iQie = Constraints.qie(j4);
                                List listY = subcomposeMeasureScope.Y(TabSlots.Tabs, function23);
                                int size = listY.size();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                if (size > 0) {
                                    intRef.element = iQie / size;
                                }
                                Integer numValueOf = 0;
                                int size2 = listY.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    numValueOf = Integer.valueOf(Math.max(((Measurable) listY.get(i8)).g(intRef.element), numValueOf.intValue()));
                                }
                                final int iIntValue = numValueOf.intValue();
                                final ArrayList arrayList = new ArrayList(listY.size());
                                int size3 = listY.size();
                                for (int i9 = 0; i9 < size3; i9++) {
                                    Measurable measurable = (Measurable) listY.get(i9);
                                    int i10 = intRef.element;
                                    arrayList.add(measurable.dR0(Constraints.t(j4, i10, i10, iIntValue, iIntValue)));
                                }
                                final ArrayList arrayList2 = new ArrayList(size);
                                for (int i11 = 0; i11 < size; i11++) {
                                    arrayList2.add(new TabPosition(Dp.KN(subcomposeMeasureScope.rV9(intRef.element) * i11), subcomposeMeasureScope.rV9(intRef.element), ((Dp) ComparisonsKt.maxOf(Dp.nr(Dp.KN(subcomposeMeasureScope.rV9(Math.min(((Measurable) listY.get(i11)).Nxk(iIntValue), intRef.element)) - Dp.KN(TabKt.HI() * 2))), Dp.nr(Dp.KN(24)))).getValue(), null));
                                }
                                final Function2 function25 = function24;
                                final Function3 function33 = function32;
                                return MeasureScope.ER(subcomposeMeasureScope, iQie, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1.1
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
                                        List list = arrayList;
                                        Ref.IntRef intRef2 = intRef;
                                        int size4 = list.size();
                                        for (int i12 = 0; i12 < size4; i12++) {
                                            Placeable.PlacementScope.az(placementScope, (Placeable) list.get(i12), i12 * intRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List listY2 = subcomposeMeasureScope.Y(TabSlots.Divider, function25);
                                        long j5 = j4;
                                        int i13 = iIntValue;
                                        int size5 = listY2.size();
                                        for (int i14 = 0; i14 < size5; i14++) {
                                            Placeable placeableDR0 = ((Measurable) listY2.get(i14)).dR0(Constraints.nr(j5, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.az(placementScope, placeableDR0, 0, i13 - placeableDR0.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3 function34 = function33;
                                        final List list2 = arrayList2;
                                        List listY3 = subcomposeMeasureScope2.Y(tabSlots, ComposableLambdaKt.rl(1621992604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.TabRowWithSubcomposeImpl.1.1.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i15) {
                                                if ((i15 & 3) == 2 && composer4.xMQ()) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1621992604, i15, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1000)");
                                                }
                                                function34.invoke(list2, composer4, 0);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }));
                                        int i15 = iQie;
                                        int i16 = iIntValue;
                                        int size6 = listY3.size();
                                        for (int i17 = 0; i17 < size6; i17++) {
                                            Placeable.PlacementScope.az(placementScope, ((Measurable) listY3.get(i17)).dR0(Constraints.INSTANCE.t(i15, i16)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.o(objIF);
                    }
                    SubcomposeLayoutKt.n(modifierKN, (Function2) objIF, composer3, 6, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composer2, (i5 & 896) | 12582912 | (i5 & 7168), 114);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$2
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
                    TabRowKt.mUb(modifier3, j2, j3, function3, function2, function22, composer3, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final int i2, Modifier modifier, ScrollState scrollState, long j2, long j3, float f3, Function3 function3, Function2 function2, final Function2 function22, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        ScrollState scrollStateT;
        long jNr;
        long jO;
        int i8;
        float fJ2;
        int i9;
        int i10;
        int i11;
        int i12;
        long j4;
        float f4;
        ScrollState scrollState2;
        long j5;
        Function2 function2Nr;
        Function3 function32;
        Modifier modifier3;
        long j6;
        final Function2 function23;
        final Function3 function33;
        final float f5;
        final Modifier modifier4;
        final ScrollState scrollState3;
        final long j7;
        final long j9;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1763241113);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i13 = i5 & 2;
        if (i13 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    scrollStateT = scrollState;
                    int i14 = composerKN.p5(scrollStateT) ? 256 : 128;
                    i7 |= i14;
                } else {
                    scrollStateT = scrollState;
                }
                i7 |= i14;
            } else {
                scrollStateT = scrollState;
            }
            if ((i3 & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    jNr = j2;
                    int i15 = composerKN.nr(jNr) ? 2048 : 1024;
                    i7 |= i15;
                } else {
                    jNr = j2;
                }
                i7 |= i15;
            } else {
                jNr = j2;
            }
            if ((i3 & 24576) != 0) {
                if ((i5 & 16) == 0) {
                    jO = j3;
                    int i16 = composerKN.nr(jO) ? 16384 : 8192;
                    i7 |= i16;
                } else {
                    jO = j3;
                }
                i7 |= i16;
            } else {
                jO = j3;
            }
            i8 = i5 & 32;
            if (i8 == 0) {
                i7 |= 196608;
            } else {
                if ((196608 & i3) == 0) {
                    fJ2 = f3;
                    i7 |= composerKN.rl(fJ2) ? 131072 : 65536;
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i7 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i7 |= composerKN.E2(function3) ? 1048576 : 524288;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i7 |= 12582912;
                } else {
                    if ((i3 & 12582912) == 0) {
                        i11 = i10;
                        i7 |= composerKN.E2(function2) ? 8388608 : 4194304;
                    }
                    if ((i5 & 256) != 0) {
                        if ((i3 & 100663296) == 0) {
                            i7 |= composerKN.E2(function22) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        if ((i7 & 38347923) == 38347922 && composerKN.xMQ()) {
                            composerKN.wTp();
                            function23 = function2;
                            modifier4 = modifier2;
                            scrollState3 = scrollStateT;
                            j9 = jNr;
                            j7 = jO;
                            f5 = fJ2;
                            function33 = function3;
                        } else {
                            composerKN.e();
                            if ((i3 & 1) != 0 || composerKN.rV9()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                    scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                }
                                if ((i5 & 8) != 0) {
                                    jNr = TabRowDefaults.f28102n.nr(composerKN, 6);
                                    i7 &= -7169;
                                }
                                if ((i5 & 16) != 0) {
                                    jO = TabRowDefaults.f28102n.O(composerKN, 6);
                                    i7 &= -57345;
                                }
                                if (i8 != 0) {
                                    fJ2 = TabRowDefaults.f28102n.J2();
                                }
                                Function3 function3Nr = i9 == 0 ? ComposableLambdaKt.nr(1601820568, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, Integer num) {
                                        n(tabIndicatorScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(TabIndicatorScope tabIndicatorScope, Composer composer2, int i17) {
                                        int i18;
                                        if ((i17 & 6) == 0) {
                                            i18 = ((i17 & 8) == 0 ? composer2.p5(tabIndicatorScope) : composer2.E2(tabIndicatorScope) ? 4 : 2) | i17;
                                        } else {
                                            i18 = i17;
                                        }
                                        if ((i18 & 19) == 18 && composer2.xMQ()) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1601820568, i18, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:364)");
                                        }
                                        TabRowDefaults.f28102n.rl(tabIndicatorScope.n(Modifier.INSTANCE, i2, true), Dp.INSTANCE.t(), 0.0f, 0L, null, composer2, 196656, 28);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54) : function3;
                                if (i11 == 0) {
                                    i12 = i7;
                                    j5 = jO;
                                    function32 = function3Nr;
                                    function2Nr = ComposableSingletons$TabRowKt.f25113n.nr();
                                    modifier3 = modifier2;
                                    j4 = jNr;
                                    f4 = fJ2;
                                    scrollState2 = scrollStateT;
                                } else {
                                    i12 = i7;
                                    j4 = jNr;
                                    f4 = fJ2;
                                    scrollState2 = scrollStateT;
                                    j5 = jO;
                                    function2Nr = function2;
                                    function32 = function3Nr;
                                    modifier3 = modifier2;
                                }
                                j6 = j5;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    i7 &= -7169;
                                }
                                if ((i5 & 16) != 0) {
                                    i7 &= -57345;
                                }
                                i12 = i7;
                                modifier3 = modifier2;
                                j4 = jNr;
                                f4 = fJ2;
                                scrollState2 = scrollStateT;
                                j6 = jO;
                                function32 = function3;
                                function2Nr = function2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1763241113, i12, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:371)");
                            }
                            int i17 = i12 >> 3;
                            nr(i2, modifier3, j4, j6, f4, scrollState2, function32, function2Nr, function22, composerKN, (i12 & 126) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | ((i12 << 9) & 458752) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024));
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function23 = function2Nr;
                            function33 = function32;
                            f5 = f4;
                            long j10 = j4;
                            modifier4 = modifier3;
                            scrollState3 = scrollState2;
                            j7 = j6;
                            j9 = j10;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    n(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer2, int i18) {
                                    TabRowKt.n(i2, modifier4, scrollState3, j9, j7, f5, function33, function23, function22, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 100663296;
                    if ((i7 & 38347923) == 38347922) {
                        composerKN.e();
                        if ((i3 & 1) != 0) {
                            if (i13 != 0) {
                            }
                            if ((i5 & 4) != 0) {
                            }
                            if ((i5 & 8) != 0) {
                            }
                            if ((i5 & 16) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            j6 = j5;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i172 = i12 >> 3;
                            nr(i2, modifier3, j4, j6, f4, scrollState2, function32, function2Nr, function22, composerKN, (i12 & 126) | (i172 & 896) | (i172 & 7168) | (i172 & 57344) | ((i12 << 9) & 458752) | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024));
                            if (ComposerKt.v()) {
                            }
                            function23 = function2Nr;
                            function33 = function32;
                            f5 = f4;
                            long j102 = j4;
                            modifier4 = modifier3;
                            scrollState3 = scrollState2;
                            j7 = j6;
                            j9 = j102;
                        }
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i11 = i10;
                if ((i5 & 256) != 0) {
                }
                if ((i7 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            fJ2 = f3;
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i5 & 256) != 0) {
            }
            if ((i7 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        if ((i3 & 24576) != 0) {
        }
        i8 = i5 & 32;
        if (i8 == 0) {
        }
        fJ2 = f3;
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i5 & 256) != 0) {
        }
        if ((i7 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final int i2, final Modifier modifier, final long j2, final long j3, final float f3, final ScrollState scrollState, final Function3 function3, final Function2 function2, final Function2 function22, Composer composer, final int i3) {
        int i5;
        float f4;
        ScrollState scrollState2;
        Function3 function32;
        Function2 function23;
        Composer composer2;
        Composer composerKN = composer.KN(-1594140035);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.p5(modifier) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.nr(j2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.nr(j3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            f4 = f3;
            i5 |= composerKN.rl(f4) ? 16384 : 8192;
        } else {
            f4 = f3;
        }
        if ((196608 & i3) == 0) {
            scrollState2 = scrollState;
            i5 |= composerKN.p5(scrollState2) ? 131072 : 65536;
        } else {
            scrollState2 = scrollState;
        }
        if ((1572864 & i3) == 0) {
            function32 = function3;
            i5 |= composerKN.E2(function32) ? 1048576 : 524288;
        } else {
            function32 = function3;
        }
        if ((i3 & 12582912) == 0) {
            function23 = function2;
            i5 |= composerKN.E2(function23) ? 8388608 : 4194304;
        } else {
            function23 = function2;
        }
        if ((100663296 & i3) == 0) {
            i5 |= composerKN.E2(function22) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i5 & 38347923) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1594140035, i5, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:699)");
            }
            Modifier modifierRl = ClipKt.rl(SelectableGroupKt.n(ScrollKt.rl(SizeKt.E2(SizeKt.KN(modifier, 0.0f, 1, null), Alignment.INSTANCE.KN(), false, 2, null), scrollState2, false, null, false, 14, null)));
            final Function2 function24 = function23;
            final Function3 function33 = function32;
            final float f5 = f4;
            composer2 = composerKN;
            SurfaceKt.n(modifierRl, null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.nr(1556158104, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void n(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1556158104, i7, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:711)");
                    }
                    Object objIF = composer3.iF();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer3));
                        composer3.o(compositionScopedCoroutineScopeCanceller);
                        objIF = compositionScopedCoroutineScopeCanceller;
                    }
                    vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
                    boolean zP5 = composer3.p5(scrollState) | composer3.p5(coroutineScope);
                    ScrollState scrollState3 = scrollState;
                    Object objIF2 = composer3.iF();
                    if (zP5 || objIF2 == companion.n()) {
                        objIF2 = new ScrollableTabData(scrollState3, coroutineScope);
                        composer3.o(objIF2);
                    }
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objIF2;
                    Object objIF3 = composer3.iF();
                    if (objIF3 == companion.n()) {
                        objIF3 = new TabRowKt$ScrollableTabRowImpl$1$scope$1$1();
                        composer3.o(objIF3);
                    }
                    final TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1 = (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) objIF3;
                    Function2 function25 = function22;
                    Function2 function26 = function24;
                    final Function3 function34 = function33;
                    List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function25, function26, ComposableLambdaKt.nr(-1530560661, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            n(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer4, int i8) {
                            if ((i8 & 3) == 2 && composer4.xMQ()) {
                                composer4.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1530560661, i8, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous>.<anonymous> (TabRow.kt:757)");
                            }
                            function34.invoke(tabRowKt$ScrollableTabRowImpl$1$scope$1$1, composer4, 6);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composer3, 54)});
                    boolean zRl = composer3.rl(f5) | composer3.t(i2) | composer3.E2(scrollableTabData);
                    final float f6 = f5;
                    final int i8 = i2;
                    Object objIF4 = composer3.iF();
                    if (zRl || objIF4 == companion.n()) {
                        objIF4 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1
                            @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                            public final MeasureResult rl(final MeasureScope measureScope, List list, long j4) {
                                MeasureScope measureScope2 = measureScope;
                                List list2 = (List) list.get(0);
                                List list3 = (List) list.get(1);
                                List list4 = (List) list.get(2);
                                final int iHow = measureScope2.How(f6);
                                int size = list2.size();
                                int iHow2 = measureScope2.How(TabRowKt.f28123n);
                                Integer numValueOf = 0;
                                int size2 = list2.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Measurable) list2.get(i9)).g(Integer.MAX_VALUE)));
                                }
                                int iIntValue = numValueOf.intValue();
                                int iHow3 = iHow * 2;
                                long jNr = Constraints.nr(j4, iHow2, 0, iIntValue, iIntValue, 2, null);
                                final Ref.FloatRef floatRef = new Ref.FloatRef();
                                floatRef.element = f6;
                                final ArrayList arrayList = new ArrayList(list2.size());
                                int size3 = list2.size();
                                for (int i10 = 0; i10 < size3; i10++) {
                                    arrayList.add(((Measurable) list2.get(i10)).dR0(jNr));
                                }
                                final ArrayList arrayList2 = new ArrayList(size);
                                for (int i11 = 0; i11 < size; i11++) {
                                    float value = ((Dp) ComparisonsKt.maxOf(Dp.nr(TabRowKt.f28123n), Dp.nr(measureScope2.rV9(((Placeable) arrayList.get(i11)).getWidth())))).getValue();
                                    iHow3 += measureScope2.How(value);
                                    TabPosition tabPosition = new TabPosition(floatRef.element, value, ((Dp) ComparisonsKt.maxOf(Dp.nr(Dp.KN(value - Dp.KN(TabKt.HI() * 2))), Dp.nr(Dp.KN(24)))).getValue(), null);
                                    floatRef.element = Dp.KN(floatRef.element + value);
                                    arrayList2.add(tabPosition);
                                }
                                tabRowKt$ScrollableTabRowImpl$1$scope$1$1.t(arrayList2);
                                final ArrayList arrayList3 = new ArrayList(list3.size());
                                int size4 = list3.size();
                                int i12 = 0;
                                while (i12 < size4) {
                                    int i13 = iHow3;
                                    arrayList3.add(((Measurable) list3.get(i12)).dR0(Constraints.nr(j4, i13, iHow3, 0, 0, 8, null)));
                                    i12++;
                                    size4 = size4;
                                    list3 = list3;
                                    iHow3 = i13;
                                }
                                int i14 = iHow3;
                                int i15 = i8;
                                final ArrayList arrayList4 = new ArrayList(list4.size());
                                int size5 = list4.size();
                                int i16 = 0;
                                while (i16 < size5) {
                                    int i17 = iIntValue;
                                    iIntValue = i17;
                                    arrayList4.add(((Measurable) list4.get(i16)).dR0(Constraints.t(j4, 0, measureScope2.How(((TabPosition) arrayList2.get(i15)).getWidth()), 0, i17)));
                                    i16++;
                                    measureScope2 = measureScope;
                                    list4 = list4;
                                }
                                final float f7 = f6;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i18 = i8;
                                final int i19 = iIntValue;
                                return MeasureScope.ER(measureScope, i14, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1.1
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
                                        Ref.FloatRef floatRef2 = floatRef;
                                        floatRef2.element = f7;
                                        List list5 = arrayList;
                                        MeasureScope measureScope3 = measureScope;
                                        List list6 = arrayList2;
                                        int size6 = list5.size();
                                        for (int i20 = 0; i20 < size6; i20++) {
                                            Placeable.PlacementScope.az(placementScope, (Placeable) list5.get(i20), measureScope3.How(floatRef2.element), 0, 0.0f, 4, null);
                                            floatRef2.element = Dp.KN(floatRef2.element + ((TabPosition) list6.get(i20)).getWidth());
                                        }
                                        List list7 = arrayList3;
                                        int i21 = i19;
                                        int size7 = list7.size();
                                        for (int i22 = 0; i22 < size7; i22++) {
                                            Placeable placeable = (Placeable) list7.get(i22);
                                            Placeable.PlacementScope.az(placementScope, placeable, 0, i21 - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        List list8 = arrayList4;
                                        MeasureScope measureScope4 = measureScope;
                                        List list9 = arrayList2;
                                        int i23 = i18;
                                        int i24 = i19;
                                        int size8 = list8.size();
                                        for (int i25 = 0; i25 < size8; i25++) {
                                            Placeable placeable2 = (Placeable) list8.get(i25);
                                            Placeable.PlacementScope.az(placementScope, placeable2, Math.max(0, (measureScope4.How(((TabPosition) list9.get(i23)).getWidth()) - placeable2.getWidth()) / 2), i24 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                        scrollableTabData2.t(measureScope, iHow, arrayList2, i18);
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.o(objIF4);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objIF4;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Function2 function2Rl = LayoutKt.rl(listListOf);
                    boolean zP52 = composer3.p5(multiContentMeasurePolicy);
                    Object objIF5 = composer3.iF();
                    if (zP52 || objIF5 == companion.n()) {
                        objIF5 = MultiContentMeasurePolicyKt.n(multiContentMeasurePolicy);
                        composer3.o(objIF5);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objIF5;
                    int iN = ComposablesKt.n(composer3, 0);
                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer3, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion3.n();
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
                    Updater.O(composerN, measurePolicy, companion3.t());
                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                    Function2 function2Rl2 = companion3.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl2);
                    }
                    Updater.O(composerN, modifierO, companion3.nr());
                    function2Rl.invoke(composer3, 0);
                    composer3.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerKN, 54), composer2, (i5 & 896) | 12582912 | (i5 & 7168), 114);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$2
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
                    TabRowKt.nr(i2, modifier, j2, j3, f3, scrollState, function3, function2, function22, composer3, RecomposeScopeImplKt.n(i3 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final int i2, Modifier modifier, long j2, long j3, Function3 function3, Function2 function2, final Function2 function22, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        long jNr;
        long jO;
        int i8;
        Function3 function3Nr;
        int i9;
        Function2 function23;
        Function2 function2N;
        Modifier modifier3;
        long j4;
        Function3 function32;
        int i10;
        long j5;
        Composer composer2;
        final Modifier modifier4;
        final long j6;
        final long j7;
        final Function3 function33;
        final Function2 function24;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1884787284);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i11 = i5 & 2;
        if (i11 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    jNr = j2;
                    int i12 = composerKN.nr(jNr) ? 256 : 128;
                    i7 |= i12;
                } else {
                    jNr = j2;
                }
                i7 |= i12;
            } else {
                jNr = j2;
            }
            if ((i3 & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    jO = j3;
                    int i13 = composerKN.nr(jO) ? 2048 : 1024;
                    i7 |= i13;
                } else {
                    jO = j3;
                }
                i7 |= i13;
            } else {
                jO = j3;
            }
            i8 = i5 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    function3Nr = function3;
                    i7 |= composerKN.E2(function3Nr) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else {
                    if ((196608 & i3) == 0) {
                        function23 = function2;
                        i7 |= composerKN.E2(function23) ? 131072 : 65536;
                    }
                    if ((i5 & 64) != 0) {
                        if ((i3 & 1572864) == 0) {
                            i7 |= composerKN.E2(function22) ? 1048576 : 524288;
                        }
                        if ((i7 & 599187) == 599186 && composerKN.xMQ()) {
                            composerKN.wTp();
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            j6 = jNr;
                            j7 = jO;
                            function33 = function3Nr;
                            function24 = function23;
                        } else {
                            composerKN.e();
                            if ((i3 & 1) != 0 || composerKN.rV9()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i5 & 4) != 0) {
                                    jNr = TabRowDefaults.f28102n.nr(composerKN, 6);
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    jO = TabRowDefaults.f28102n.O(composerKN, 6);
                                    i7 &= -7169;
                                }
                                if (i8 != 0) {
                                    function3Nr = ComposableLambdaKt.nr(-2021049253, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, Integer num) {
                                            n(tabIndicatorScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(TabIndicatorScope tabIndicatorScope, Composer composer3, int i14) {
                                            int i15;
                                            if ((i14 & 6) == 0) {
                                                i15 = ((i14 & 8) == 0 ? composer3.p5(tabIndicatorScope) : composer3.E2(tabIndicatorScope) ? 4 : 2) | i14;
                                            } else {
                                                i15 = i14;
                                            }
                                            if ((i15 & 19) == 18 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-2021049253, i15, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:158)");
                                            }
                                            TabRowDefaults.f28102n.rl(tabIndicatorScope.n(Modifier.INSTANCE, i2, true), Dp.INSTANCE.t(), 0.0f, 0L, null, composer3, 196656, 28);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                }
                                if (i9 == 0) {
                                    function2N = ComposableSingletons$TabRowKt.f25113n.n();
                                    modifier3 = modifier2;
                                    j4 = jO;
                                    function32 = function3Nr;
                                    i10 = -1884787284;
                                    j5 = jNr;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i10, i7, -1, "androidx.compose.material3.PrimaryTabRow (TabRow.kt:165)");
                                }
                                composer2 = composerKN;
                                xMQ(modifier3, j5, j4, function32, function2N, function22, composer2, (i7 >> 3) & 524286);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier4 = modifier3;
                                j6 = j5;
                                j7 = j4;
                                function33 = function32;
                                function24 = function2N;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    i7 &= -7169;
                                }
                            }
                            modifier3 = modifier2;
                            function32 = function3Nr;
                            function2N = function23;
                            i10 = -1884787284;
                            j5 = jNr;
                            j4 = jO;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            xMQ(modifier3, j5, j4, function32, function2N, function22, composer2, (i7 >> 3) & 524286);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            j6 = j5;
                            j7 = j4;
                            function33 = function32;
                            function24 = function2N;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$2
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
                                    TabRowKt.rl(i2, modifier4, j6, j7, function33, function24, function22, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 1572864;
                    if ((i7 & 599187) == 599186) {
                        composerKN.e();
                        if ((i3 & 1) != 0) {
                            if (i11 != 0) {
                            }
                            if ((i5 & 4) != 0) {
                            }
                            if ((i5 & 8) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                                modifier3 = modifier2;
                                function32 = function3Nr;
                                function2N = function23;
                                i10 = -1884787284;
                                j5 = jNr;
                                j4 = jO;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composer2 = composerKN;
                            xMQ(modifier3, j5, j4, function32, function2N, function22, composer2, (i7 >> 3) & 524286);
                            if (ComposerKt.v()) {
                            }
                            modifier4 = modifier3;
                            j6 = j5;
                            j7 = j4;
                            function33 = function32;
                            function24 = function2N;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function23 = function2;
                if ((i5 & 64) != 0) {
                }
                if ((i7 & 599187) == 599186) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function3Nr = function3;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            function23 = function2;
            if ((i5 & 64) != 0) {
            }
            if ((i7 & 599187) == 599186) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        i8 = i5 & 16;
        if (i8 == 0) {
        }
        function3Nr = function3;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        function23 = function2;
        if ((i5 & 64) != 0) {
        }
        if ((i7 & 599187) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final int i2, Modifier modifier, long j2, long j3, float f3, Function3 function3, Function2 function2, final Function2 function22, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        long jNr;
        long jO;
        int i8;
        float fJ2;
        int i9;
        Function3 function3Nr;
        int i10;
        int i11;
        final Modifier modifier3;
        final long j4;
        final long j5;
        final float f4;
        Function2 function2J2;
        Function3 function32;
        final Function2 function23;
        final Function3 function33;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-497821003);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i12 = i5 & 2;
        if (i12 != 0) {
            i7 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    jNr = j2;
                    int i13 = composerKN.nr(jNr) ? 256 : 128;
                    i7 |= i13;
                } else {
                    jNr = j2;
                }
                i7 |= i13;
            } else {
                jNr = j2;
            }
            if ((i3 & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    jO = j3;
                    int i14 = composerKN.nr(jO) ? 2048 : 1024;
                    i7 |= i14;
                } else {
                    jO = j3;
                }
                i7 |= i14;
            } else {
                jO = j3;
            }
            i8 = i5 & 16;
            if (i8 == 0) {
                i7 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    fJ2 = f3;
                    i7 |= composerKN.rl(fJ2) ? 16384 : 8192;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else {
                    if ((196608 & i3) == 0) {
                        function3Nr = function3;
                        i7 |= composerKN.E2(function3Nr) ? 131072 : 65536;
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i7 |= composerKN.E2(function2) ? 1048576 : 524288;
                    }
                    if ((i5 & 128) != 0) {
                        if ((i3 & 12582912) == 0) {
                            i7 |= composerKN.E2(function22) ? 8388608 : 4194304;
                        }
                        if ((i7 & 4793491) == 4793490 && composerKN.xMQ()) {
                            composerKN.wTp();
                            function23 = function2;
                            modifier3 = modifier2;
                            j4 = jNr;
                            j5 = jO;
                            f4 = fJ2;
                            function33 = function3Nr;
                        } else {
                            composerKN.e();
                            if ((i3 & 1) != 0 || composerKN.rV9()) {
                                if (i12 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i5 & 4) != 0) {
                                    jNr = TabRowDefaults.f28102n.nr(composerKN, 6);
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    jO = TabRowDefaults.f28102n.O(composerKN, 6);
                                    i7 &= -7169;
                                }
                                if (i8 != 0) {
                                    fJ2 = TabRowDefaults.f28102n.J2();
                                }
                                if (i9 != 0) {
                                    function3Nr = ComposableLambdaKt.nr(-913748678, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                            n(list, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(List list, Composer composer2, int i15) {
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-913748678, i15, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:501)");
                                            }
                                            TabRowDefaults tabRowDefaults = TabRowDefaults.f28102n;
                                            tabRowDefaults.t(tabRowDefaults.xMQ(Modifier.INSTANCE, (TabPosition) list.get(i2)), 0.0f, 0L, composer2, 3072, 6);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                }
                                if (i10 == 0) {
                                    i11 = i7;
                                    modifier3 = modifier2;
                                    j4 = jNr;
                                    j5 = jO;
                                    f4 = fJ2;
                                    function2J2 = ComposableSingletons$TabRowKt.f25113n.J2();
                                    function32 = function3Nr;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-497821003, i11, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:507)");
                                }
                                int i15 = i11 << 3;
                                O(i2, function32, modifier3, j4, j5, f4, function2J2, function22, ScrollKt.t(0, composerKN, 0, 1), composerKN, (i15 & 896) | (i11 & 14) | ((i11 >> 12) & 112) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i11) | (i11 & 29360128), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                function23 = function2J2;
                                function33 = function32;
                            } else {
                                composerKN.wTp();
                                if ((i5 & 4) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 8) != 0) {
                                    i7 &= -7169;
                                }
                            }
                            i11 = i7;
                            modifier3 = modifier2;
                            j4 = jNr;
                            j5 = jO;
                            f4 = fJ2;
                            function32 = function3Nr;
                            function2J2 = function2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i152 = i11 << 3;
                            O(i2, function32, modifier3, j4, j5, f4, function2J2, function22, ScrollKt.t(0, composerKN, 0, 1), composerKN, (i152 & 896) | (i11 & 14) | ((i11 >> 12) & 112) | (i152 & 7168) | (57344 & i152) | (458752 & i152) | (3670016 & i11) | (i11 & 29360128), 0);
                            if (ComposerKt.v()) {
                            }
                            function23 = function2J2;
                            function33 = function32;
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
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
                                    TabRowKt.t(i2, modifier3, j4, j5, f4, function33, function23, function22, composer2, RecomposeScopeImplKt.n(i3 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 12582912;
                    if ((i7 & 4793491) == 4793490) {
                        composerKN.e();
                        if ((i3 & 1) != 0) {
                            if (i12 != 0) {
                            }
                            if ((i5 & 4) != 0) {
                            }
                            if ((i5 & 8) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 == 0) {
                                i11 = i7;
                                modifier3 = modifier2;
                                j4 = jNr;
                                j5 = jO;
                                f4 = fJ2;
                                function32 = function3Nr;
                                function2J2 = function2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i1522 = i11 << 3;
                            O(i2, function32, modifier3, j4, j5, f4, function2J2, function22, ScrollKt.t(0, composerKN, 0, 1), composerKN, (i1522 & 896) | (i11 & 14) | ((i11 >> 12) & 112) | (i1522 & 7168) | (57344 & i1522) | (458752 & i1522) | (3670016 & i11) | (i11 & 29360128), 0);
                            if (ComposerKt.v()) {
                            }
                            function23 = function2J2;
                            function33 = function32;
                        }
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function3Nr = function3;
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                if ((i5 & 128) != 0) {
                }
                if ((i7 & 4793491) == 4793490) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            fJ2 = f3;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            function3Nr = function3;
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if ((i7 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        i8 = i5 & 16;
        if (i8 == 0) {
        }
        fJ2 = f3;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        function3Nr = function3;
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if ((i7 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(Modifier modifier, final long j2, final long j3, final Function3 function3, final Function2 function2, final Function2 function22, Composer composer, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerKN = composer.KN(1757425411);
        if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.nr(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function22) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1757425411, i3, -1, inFlMLxL.fRTxDBuJG);
            }
            int i5 = i3 << 3;
            composer2 = composerKN;
            SurfaceKt.n(SelectableGroupKt.n(modifier2), null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-65106680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void n(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-65106680, i7, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:577)");
                    }
                    Object objIF = composer3.iF();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = new TabRowKt$TabRowImpl$1$scope$1$1();
                        composer3.o(objIF);
                    }
                    final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) objIF;
                    Modifier modifierKN = SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null);
                    Function2 function23 = function22;
                    Function2 function24 = function2;
                    final Function3 function32 = function3;
                    List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function23, function24, ComposableLambdaKt.nr(1236693605, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            n(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer4, int i8) {
                            if ((i8 & 3) == 2 && composer4.xMQ()) {
                                composer4.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1236693605, i8, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:618)");
                            }
                            function32.invoke(tabRowKt$TabRowImpl$1$scope$1$1, composer4, 6);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composer3, 54)});
                    Object objIF2 = composer3.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1
                            @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                            public final MeasureResult rl(MeasureScope measureScope, List list, long j4) {
                                MeasureScope measureScope2 = measureScope;
                                List list2 = (List) list.get(0);
                                List list3 = (List) list.get(1);
                                int i8 = 2;
                                List list4 = (List) list.get(2);
                                int iQie = Constraints.qie(j4);
                                int size = list2.size();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                if (size > 0) {
                                    intRef.element = iQie / size;
                                }
                                Integer numValueOf = 0;
                                int size2 = list2.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    numValueOf = Integer.valueOf(Math.max(((Measurable) list2.get(i9)).g(intRef.element), numValueOf.intValue()));
                                }
                                final int iIntValue = numValueOf.intValue();
                                TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$12 = tabRowKt$TabRowImpl$1$scope$1$1;
                                ArrayList arrayList = new ArrayList(size);
                                int i10 = 0;
                                while (i10 < size) {
                                    arrayList.add(new TabPosition(Dp.KN(measureScope2.rV9(intRef.element) * i10), measureScope2.rV9(intRef.element), ((Dp) ComparisonsKt.maxOf(Dp.nr(Dp.KN(measureScope2.rV9(Math.min(((Measurable) list2.get(i10)).Nxk(iIntValue), intRef.element)) - Dp.KN(TabKt.HI() * i8))), Dp.nr(Dp.KN(24)))).getValue(), null));
                                    i10++;
                                    measureScope2 = measureScope;
                                    i8 = 2;
                                }
                                tabRowKt$TabRowImpl$1$scope$1$12.t(arrayList);
                                final ArrayList arrayList2 = new ArrayList(list2.size());
                                int size3 = list2.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    Measurable measurable = (Measurable) list2.get(i11);
                                    int i12 = intRef.element;
                                    int i13 = iIntValue;
                                    long jT2 = Constraints.t(j4, i12, i12, i13, iIntValue);
                                    iIntValue = i13;
                                    arrayList2.add(measurable.dR0(jT2));
                                }
                                final ArrayList arrayList3 = new ArrayList(list3.size());
                                int size4 = list3.size();
                                for (int i14 = 0; i14 < size4; i14++) {
                                    arrayList3.add(((Measurable) list3.get(i14)).dR0(Constraints.nr(j4, 0, 0, 0, 0, 11, null)));
                                }
                                final ArrayList arrayList4 = new ArrayList(list4.size());
                                int size5 = list4.size();
                                for (int i15 = 0; i15 < size5; i15++) {
                                    Measurable measurable2 = (Measurable) list4.get(i15);
                                    int i16 = intRef.element;
                                    int i17 = iIntValue;
                                    iIntValue = i17;
                                    arrayList4.add(measurable2.dR0(Constraints.t(j4, i16, i16, 0, i17)));
                                }
                                return MeasureScope.ER(measureScope, iQie, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1.2
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
                                        List list5 = arrayList2;
                                        Ref.IntRef intRef2 = intRef;
                                        int size6 = list5.size();
                                        for (int i18 = 0; i18 < size6; i18++) {
                                            Placeable.PlacementScope.az(placementScope, (Placeable) list5.get(i18), i18 * intRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List list6 = arrayList3;
                                        int i19 = iIntValue;
                                        int size7 = list6.size();
                                        for (int i20 = 0; i20 < size7; i20++) {
                                            Placeable placeable = (Placeable) list6.get(i20);
                                            Placeable.PlacementScope.az(placementScope, placeable, 0, i19 - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        List list7 = arrayList4;
                                        int i21 = iIntValue;
                                        int size8 = list7.size();
                                        for (int i22 = 0; i22 < size8; i22++) {
                                            Placeable placeable2 = (Placeable) list7.get(i22);
                                            Placeable.PlacementScope.az(placementScope, placeable2, 0, i21 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.o(objIF2);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objIF2;
                    Function2 function2Rl = LayoutKt.rl(listListOf);
                    Object objIF3 = composer3.iF();
                    if (objIF3 == companion.n()) {
                        objIF3 = MultiContentMeasurePolicyKt.n(multiContentMeasurePolicy);
                        composer3.o(objIF3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objIF3;
                    int iN = ComposablesKt.n(composer3, 0);
                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
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
                    Updater.O(composerN, measurePolicy, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    Function2 function2Rl2 = companion2.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl2);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    function2Rl.invoke(composer3, 0);
                    composer3.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerKN, 54), composer2, (i5 & 896) | 12582912 | (i5 & 7168), 114);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$2
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
                    TabRowKt.xMQ(modifier3, j2, j3, function3, function2, function22, composer3, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
