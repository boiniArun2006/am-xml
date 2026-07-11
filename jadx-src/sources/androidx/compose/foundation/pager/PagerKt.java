package androidx.compose.foundation.pager;

import GJW.vd;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aî\u0001\u0010&\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d21\u0010%\u001a-\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aâ\u0001\u0010(\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b21\u0010%\u001a-\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aî\u0001\u0010,\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d21\u0010%\u001a-\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001aâ\u0001\u0010.\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b21\u0010%\u001a-\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001aS\u00108\u001a\u00020\b*\u00020\u001b2\u0006\u00100\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\bH\u0000¢\u0006\u0004\b8\u00109\u001a3\u0010=\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00102\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "", "beyondViewportPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "index", "", "key", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "pageContent", c.f62177j, "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "rl", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "t", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "nr", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "", "currentPageOffsetFraction", "pageCount", "Uo", "(Landroidx/compose/foundation/gestures/snapping/SnapPosition;IIIIIIFI)I", "isVertical", "LGJW/vd;", "scope", "KN", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLGJW/vd;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,592:1\n113#2:593\n113#2:594\n113#2:595\n113#2:596\n113#2:597\n113#2:598\n113#2:599\n113#2:600\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n116#1:593\n119#1:594\n157#1:595\n160#1:596\n246#1:597\n249#1:598\n287#1:599\n290#1:600\n*E\n"})
public final class PagerKt {
    public static final int Uo(SnapPosition snapPosition, int i2, int i3, int i5, int i7, int i8, int i9, float f3, int i10) {
        return MathKt.roundToInt(snapPosition.n(i2, i3, i7, i8, i9, i10) - (f3 * (i3 + i5)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i2, float f3, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z2, boolean z3, Function1 function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, final Function4 function4, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        int i10;
        int i11;
        final int i12;
        int i13;
        float f4;
        int i14;
        Alignment.Vertical verticalXMQ;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Composer composer2;
        final PaddingValues paddingValues2;
        final PageSize pageSize2;
        final boolean z4;
        final ?? r10;
        final Function1 function12;
        final NestedScrollConnection nestedScrollConnection2;
        final SnapPosition snapPosition2;
        final float f5;
        final Modifier modifier3;
        final Alignment.Vertical vertical2;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final OverscrollEffect overscrollEffect2;
        ScopeUpdateScope scopeUpdateScopeGh;
        PagerState pagerState2;
        int i25;
        int i26;
        int i27;
        NestedScrollConnection nestedScrollConnectionRl;
        int i28;
        Function1 function13;
        NestedScrollConnection nestedScrollConnection3;
        int i29;
        PaddingValues paddingValues3;
        TargetedFlingBehavior targetedFlingBehavior4;
        PageSize pageSize3;
        boolean z5;
        int i30;
        float f6;
        int i31;
        ?? r3;
        SnapPosition snapPosition3;
        Modifier modifier4;
        OverscrollEffect overscrollEffectRl;
        Composer composerKN = composer.KN(-1372972868);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(pagerState) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        int i32 = i7 & 2;
        if (i32 != 0) {
            i8 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 |= composerKN.p5(paddingValues) ? 256 : 128;
                }
                i10 = i7 & 8;
                int i33 = 1024;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i8 |= composerKN.p5(pageSize) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            i12 = i2;
                            i8 |= composerKN.t(i12) ? 16384 : 8192;
                        }
                        i13 = i7 & 32;
                        if (i13 != 0) {
                            i8 |= 196608;
                            f4 = f3;
                        } else {
                            f4 = f3;
                            if ((i3 & 196608) == 0) {
                                i8 |= composerKN.rl(f4) ? 131072 : 65536;
                            }
                        }
                        i14 = i7 & 64;
                        if (i14 != 0) {
                            i8 |= 1572864;
                            verticalXMQ = vertical;
                        } else {
                            verticalXMQ = vertical;
                            if ((i3 & 1572864) == 0) {
                                i8 |= composerKN.p5(verticalXMQ) ? 1048576 : 524288;
                            }
                        }
                        if ((i3 & 12582912) == 0) {
                            if ((i7 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                int i34 = composerKN.p5(targetedFlingBehavior2) ? 8388608 : 4194304;
                                i8 |= i34;
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i8 |= i34;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i15 = i7 & 256;
                        if (i15 != 0) {
                            i8 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i8 |= composerKN.n(z2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 != 0) {
                            i18 = i8 | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            i17 = i16;
                        } else {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.n(z3) ? 536870912 : 268435456;
                            } else {
                                i17 = i16;
                            }
                            i18 = i8;
                        }
                        i19 = i7 & 1024;
                        if (i19 != 0) {
                            i20 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i20 = i5 | (composerKN.E2(function1) ? 4 : 2);
                        } else {
                            i20 = i5;
                        }
                        if ((i5 & 48) == 0) {
                            i21 = i19;
                            i20 |= ((i7 & 2048) == 0 && composerKN.E2(nestedScrollConnection)) ? 32 : 16;
                        } else {
                            i21 = i19;
                        }
                        int i35 = i20;
                        i22 = i7 & 4096;
                        if (i22 != 0) {
                            i23 = i35 | RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            i23 = i35;
                            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i23 |= composerKN.p5(snapPosition) ? 256 : 128;
                            }
                            if ((i5 & 3072) == 0) {
                                if ((i7 & 8192) == 0 && composerKN.p5(overscrollEffect)) {
                                    i33 = 2048;
                                }
                                i23 |= i33;
                            }
                            i24 = i23;
                            if ((i7 & 16384) != 0) {
                                if ((i5 & 24576) == 0) {
                                    i24 |= composerKN.E2(function4) ? 16384 : 8192;
                                }
                                if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
                                    composerKN.e();
                                    if ((i3 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier5 = i32 != 0 ? Modifier.INSTANCE : modifier2;
                                        PaddingValues paddingValuesN = i9 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues;
                                        PageSize pageSize4 = i10 != 0 ? PageSize.Fill.f18849n : pageSize;
                                        int i36 = i11 != 0 ? 0 : i12;
                                        float fKN = i13 != 0 ? Dp.KN(0) : f4;
                                        if (i14 != 0) {
                                            verticalXMQ = Alignment.INSTANCE.xMQ();
                                        }
                                        if ((i7 & 128) != 0) {
                                            i26 = i22;
                                            i27 = i24;
                                            pagerState2 = pagerState;
                                            TargetedFlingBehavior targetedFlingBehaviorN = PagerDefaults.f18854n.n(pagerState2, null, null, null, 0.0f, composerKN, (i18 & 14) | 196608, 30);
                                            i18 &= -29360129;
                                            i25 = 0;
                                            targetedFlingBehavior2 = targetedFlingBehaviorN;
                                        } else {
                                            pagerState2 = pagerState;
                                            i25 = 0;
                                            i26 = i22;
                                            i27 = i24;
                                        }
                                        boolean z6 = i15 == 0 ? z2 : true;
                                        ?? r02 = i17 != 0 ? i25 : z3;
                                        Function1 function14 = i21 != 0 ? null : function1;
                                        if ((i7 & 2048) != 0) {
                                            nestedScrollConnectionRl = PagerDefaults.f18854n.rl(pagerState2, Orientation.f16970t, composerKN, (i18 & 14) | 432);
                                            i28 = i27 & (-113);
                                        } else {
                                            nestedScrollConnectionRl = nestedScrollConnection;
                                            i28 = i27;
                                        }
                                        SnapPosition snapPosition4 = i26 != 0 ? SnapPosition.Start.f17335n : snapPosition;
                                        if ((i7 & 8192) != 0) {
                                            SnapPosition snapPosition5 = snapPosition4;
                                            overscrollEffectRl = OverscrollKt.rl(composerKN, i25);
                                            i29 = i28 & (-7169);
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            snapPosition3 = snapPosition5;
                                            function13 = function14;
                                            nestedScrollConnection3 = nestedScrollConnectionRl;
                                            composer2 = composerKN;
                                            paddingValues3 = paddingValuesN;
                                            pageSize3 = pageSize4;
                                            z5 = z6;
                                            i30 = i36;
                                            f6 = fKN;
                                            i31 = i18;
                                            r3 = r02;
                                            modifier4 = modifier5;
                                        } else {
                                            function13 = function14;
                                            nestedScrollConnection3 = nestedScrollConnectionRl;
                                            i29 = i28;
                                            composer2 = composerKN;
                                            paddingValues3 = paddingValuesN;
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            pageSize3 = pageSize4;
                                            z5 = z6;
                                            i30 = i36;
                                            f6 = fKN;
                                            i31 = i18;
                                            r3 = r02;
                                            snapPosition3 = snapPosition4;
                                            modifier4 = modifier5;
                                            overscrollEffectRl = overscrollEffect;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        if ((i7 & 128) != 0) {
                                            i18 &= -29360129;
                                        }
                                        if ((i7 & 2048) != 0) {
                                            i24 &= -113;
                                        }
                                        if ((i7 & 8192) != 0) {
                                            i24 &= -7169;
                                        }
                                        paddingValues3 = paddingValues;
                                        pageSize3 = pageSize;
                                        r3 = z3;
                                        function13 = function1;
                                        nestedScrollConnection3 = nestedScrollConnection;
                                        i29 = i24;
                                        composer2 = composerKN;
                                        f6 = f4;
                                        modifier4 = modifier2;
                                        i31 = i18;
                                        z5 = z2;
                                        overscrollEffectRl = overscrollEffect;
                                        i30 = i12;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        snapPosition3 = snapPosition;
                                    }
                                    composer2.S();
                                    Modifier modifier6 = modifier4;
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1372972868, i31, i29, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:129)");
                                    }
                                    int i37 = i29;
                                    int i38 = i31 >> 6;
                                    int i39 = i31 << 12;
                                    int i40 = ((i31 >> 3) & 14) | 24576 | ((i31 << 3) & 112) | (i31 & 896) | ((i31 >> 18) & 7168) | (i38 & 458752) | (i38 & 3670016) | ((i37 << 12) & 29360128) | (i39 & 234881024) | (i39 & 1879048192);
                                    int i41 = ((i31 >> 9) & 14) | 3072 | (i37 & 112);
                                    int i42 = i37 << 6;
                                    LazyLayoutPagerKt.n(modifier6, pagerState, paddingValues3, r3, Orientation.f16970t, targetedFlingBehavior4, z5, overscrollEffectRl, i30, f6, pageSize3, nestedScrollConnection3, function13, Alignment.INSTANCE.Uo(), verticalXMQ, snapPosition3, function4, composer2, i40, i41 | (i42 & 896) | (i38 & 57344) | ((i37 << 9) & 458752) | (i42 & 3670016), 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    int i43 = i30;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    i12 = i43;
                                    float f7 = f6;
                                    z4 = z5;
                                    f5 = f7;
                                    Alignment.Vertical vertical3 = verticalXMQ;
                                    overscrollEffect2 = overscrollEffectRl;
                                    vertical2 = vertical3;
                                    Function1 function15 = function13;
                                    nestedScrollConnection2 = nestedScrollConnection3;
                                    function12 = function15;
                                    pageSize2 = pageSize3;
                                    snapPosition2 = snapPosition3;
                                    r10 = r3;
                                    paddingValues2 = paddingValues3;
                                    modifier3 = modifier6;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    paddingValues2 = paddingValues;
                                    pageSize2 = pageSize;
                                    z4 = z2;
                                    r10 = z3;
                                    function12 = function1;
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    snapPosition2 = snapPosition;
                                    f5 = f4;
                                    modifier3 = modifier2;
                                    vertical2 = verticalXMQ;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    overscrollEffect2 = overscrollEffect;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i44) {
                                            PagerKt.n(pagerState, modifier3, paddingValues2, pageSize2, i12, f5, vertical2, targetedFlingBehavior3, z4, r10, function12, nestedScrollConnection2, snapPosition2, overscrollEffect2, function4, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i24 |= 24576;
                            if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        if ((i5 & 3072) == 0) {
                        }
                        i24 = i23;
                        if ((i7 & 16384) != 0) {
                        }
                        if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i12 = i2;
                    i13 = i7 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 64;
                    if (i14 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    i15 = i7 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i7 & 512;
                    if (i16 != 0) {
                    }
                    i19 = i7 & 1024;
                    if (i19 != 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    int i352 = i20;
                    i22 = i7 & 4096;
                    if (i22 != 0) {
                    }
                    if ((i5 & 3072) == 0) {
                    }
                    i24 = i23;
                    if ((i7 & 16384) != 0) {
                    }
                    if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                i12 = i2;
                i13 = i7 & 32;
                if (i13 != 0) {
                }
                i14 = i7 & 64;
                if (i14 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                i15 = i7 & 256;
                if (i15 != 0) {
                }
                i16 = i7 & 512;
                if (i16 != 0) {
                }
                i19 = i7 & 1024;
                if (i19 != 0) {
                }
                if ((i5 & 48) == 0) {
                }
                int i3522 = i20;
                i22 = i7 & 4096;
                if (i22 != 0) {
                }
                if ((i5 & 3072) == 0) {
                }
                i24 = i23;
                if ((i7 & 16384) != 0) {
                }
                if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i10 = i7 & 8;
            int i332 = 1024;
            if (i10 != 0) {
            }
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            i12 = i2;
            i13 = i7 & 32;
            if (i13 != 0) {
            }
            i14 = i7 & 64;
            if (i14 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            i15 = i7 & 256;
            if (i15 != 0) {
            }
            i16 = i7 & 512;
            if (i16 != 0) {
            }
            i19 = i7 & 1024;
            if (i19 != 0) {
            }
            if ((i5 & 48) == 0) {
            }
            int i35222 = i20;
            i22 = i7 & 4096;
            if (i22 != 0) {
            }
            if ((i5 & 3072) == 0) {
            }
            i24 = i23;
            if ((i7 & 16384) != 0) {
            }
            if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        i10 = i7 & 8;
        int i3322 = 1024;
        if (i10 != 0) {
        }
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        i12 = i2;
        i13 = i7 & 32;
        if (i13 != 0) {
        }
        i14 = i7 & 64;
        if (i14 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        i15 = i7 & 256;
        if (i15 != 0) {
        }
        i16 = i7 & 512;
        if (i16 != 0) {
        }
        i19 = i7 & 1024;
        if (i19 != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        int i352222 = i20;
        i22 = i7 & 4096;
        if (i22 != 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        i24 = i23;
        if ((i7 & 16384) != 0) {
        }
        if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void nr(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i2, float f3, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z2, boolean z3, Function1 function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, final Function4 function4, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        int i10;
        int i11;
        final int i12;
        int i13;
        final float f4;
        int i14;
        Alignment.Horizontal horizontalUo;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        final PaddingValues paddingValues2;
        final PageSize pageSize2;
        final boolean z4;
        final ?? r10;
        final Function1 function12;
        final NestedScrollConnection nestedScrollConnection2;
        final Modifier modifier3;
        final Alignment.Horizontal horizontal2;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final SnapPosition snapPosition2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        int i24;
        PagerState pagerState2;
        int i25;
        Composer composer2;
        int i26;
        NestedScrollConnection nestedScrollConnectionRl;
        SnapPosition snapPosition3;
        ?? r9;
        Function1 function13;
        NestedScrollConnection nestedScrollConnection3;
        TargetedFlingBehavior targetedFlingBehavior4;
        PageSize pageSize3;
        boolean z5;
        float f5;
        PaddingValues paddingValues3;
        int i27;
        ?? r92;
        Composer composerKN = composer.KN(909160706);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(pagerState) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        int i28 = i7 & 2;
        if (i28 != 0) {
            i8 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 |= composerKN.p5(paddingValues) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i8 |= composerKN.p5(pageSize) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            i12 = i2;
                            i8 |= composerKN.t(i12) ? 16384 : 8192;
                        }
                        i13 = i7 & 32;
                        if (i13 != 0) {
                            i8 |= 196608;
                            f4 = f3;
                        } else {
                            f4 = f3;
                            if ((i3 & 196608) == 0) {
                                i8 |= composerKN.rl(f4) ? 131072 : 65536;
                            }
                        }
                        i14 = i7 & 64;
                        if (i14 != 0) {
                            i8 |= 1572864;
                            horizontalUo = horizontal;
                        } else {
                            horizontalUo = horizontal;
                            if ((i3 & 1572864) == 0) {
                                i8 |= composerKN.p5(horizontalUo) ? 1048576 : 524288;
                            }
                        }
                        if ((i3 & 12582912) == 0) {
                            if ((i7 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                int i29 = composerKN.p5(targetedFlingBehavior2) ? 8388608 : 4194304;
                                i8 |= i29;
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i8 |= i29;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i15 = i7 & 256;
                        if (i15 != 0) {
                            i8 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i8 |= composerKN.n(z2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 != 0) {
                            i18 = i8 | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            i17 = i16;
                        } else {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.n(z3) ? 536870912 : 268435456;
                            } else {
                                i17 = i16;
                            }
                            i18 = i8;
                        }
                        i19 = i7 & 1024;
                        if (i19 != 0) {
                            i20 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i20 = i5 | (composerKN.E2(function1) ? 4 : 2);
                        } else {
                            i20 = i5;
                        }
                        if ((i5 & 48) == 0) {
                            i21 = i19;
                            i20 |= ((i7 & 2048) == 0 && composerKN.E2(nestedScrollConnection)) ? 32 : 16;
                        } else {
                            i21 = i19;
                        }
                        int i30 = i20;
                        i22 = i7 & 4096;
                        if (i22 != 0) {
                            i23 = i30 | RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            int i31 = i30;
                            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i31 |= composerKN.p5(snapPosition) ? 256 : 128;
                            }
                            i23 = i31;
                        }
                        if ((i7 & 8192) == 0) {
                            if ((i5 & 3072) == 0) {
                                i23 |= composerKN.E2(function4) ? 2048 : 1024;
                            }
                            if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
                                composerKN.wTp();
                                paddingValues2 = paddingValues;
                                pageSize2 = pageSize;
                                z4 = z2;
                                r10 = z3;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                modifier3 = modifier2;
                                horizontal2 = horizontalUo;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                snapPosition2 = snapPosition;
                            } else {
                                composerKN.e();
                                if ((i3 & 1) == 0 || composerKN.rV9()) {
                                    modifier4 = i28 != 0 ? Modifier.INSTANCE : modifier2;
                                    PaddingValues paddingValuesN = i9 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues;
                                    PageSize pageSize4 = i10 != 0 ? PageSize.Fill.f18849n : pageSize;
                                    i24 = i11 != 0 ? 0 : i12;
                                    float fKN = i13 != 0 ? Dp.KN(0) : f4;
                                    if (i14 != 0) {
                                        horizontalUo = Alignment.INSTANCE.Uo();
                                    }
                                    if ((i7 & 128) != 0) {
                                        composer2 = composerKN;
                                        i26 = i23;
                                        pagerState2 = pagerState;
                                        TargetedFlingBehavior targetedFlingBehaviorN = PagerDefaults.f18854n.n(pagerState2, null, null, null, 0.0f, composer2, (i18 & 14) | 196608, 30);
                                        i18 &= -29360129;
                                        i25 = 0;
                                        targetedFlingBehavior2 = targetedFlingBehaviorN;
                                    } else {
                                        pagerState2 = pagerState;
                                        i25 = 0;
                                        composer2 = composerKN;
                                        i26 = i23;
                                    }
                                    boolean z6 = i15 == 0 ? z2 : true;
                                    ?? r02 = i17 != 0 ? i25 : z3;
                                    Function1 function14 = i21 != 0 ? null : function1;
                                    if ((i7 & 2048) != 0) {
                                        nestedScrollConnectionRl = PagerDefaults.f18854n.rl(pagerState2, Orientation.f16969n, composer2, (i18 & 14) | 432);
                                        i26 &= -113;
                                    } else {
                                        nestedScrollConnectionRl = nestedScrollConnection;
                                    }
                                    if (i22 != 0) {
                                        r9 = r02;
                                        function13 = function14;
                                        nestedScrollConnection3 = nestedScrollConnectionRl;
                                        snapPosition3 = SnapPosition.Start.f17335n;
                                    } else {
                                        snapPosition3 = snapPosition;
                                        r9 = r02;
                                        function13 = function14;
                                        nestedScrollConnection3 = nestedScrollConnectionRl;
                                    }
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    i23 = i26;
                                    pageSize3 = pageSize4;
                                    z5 = z6;
                                    f5 = fKN;
                                    paddingValues3 = paddingValuesN;
                                    i27 = i18;
                                    r92 = r9;
                                } else {
                                    composerKN.wTp();
                                    if ((i7 & 128) != 0) {
                                        i18 &= -29360129;
                                    }
                                    if ((i7 & 2048) != 0) {
                                        i23 &= -113;
                                    }
                                    pagerState2 = pagerState;
                                    paddingValues3 = paddingValues;
                                    z5 = z2;
                                    r92 = z3;
                                    function13 = function1;
                                    nestedScrollConnection3 = nestedScrollConnection;
                                    snapPosition3 = snapPosition;
                                    i25 = 0;
                                    i24 = i12;
                                    f5 = f4;
                                    modifier4 = modifier2;
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    composer2 = composerKN;
                                    i27 = i18;
                                    pageSize3 = pageSize;
                                }
                                composer2.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(909160706, i27, i23, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:299)");
                                    i25 = 0;
                                }
                                int i32 = (i23 & 1022) | ((i23 << 3) & 57344);
                                PagerState pagerState3 = pagerState2;
                                composerKN = composer2;
                                Alignment.Horizontal horizontal3 = horizontalUo;
                                Modifier modifier5 = modifier4;
                                int i33 = i24;
                                t(pagerState3, modifier5, paddingValues3, pageSize3, i33, f5, horizontal3, targetedFlingBehavior4, z5, r92, function13, nestedScrollConnection3, snapPosition3, OverscrollKt.rl(composer2, i25), function4, composerKN, i27 & 2147483646, i32, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                snapPosition2 = snapPosition3;
                                nestedScrollConnection2 = nestedScrollConnection3;
                                function12 = function13;
                                r10 = r92;
                                z4 = z5;
                                targetedFlingBehavior3 = targetedFlingBehavior4;
                                horizontal2 = horizontal3;
                                f4 = f5;
                                i12 = i33;
                                pageSize2 = pageSize3;
                                paddingValues2 = paddingValues3;
                                modifier3 = modifier5;
                            }
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$VerticalPager$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i34) {
                                        PagerKt.nr(pagerState, modifier3, paddingValues2, pageSize2, i12, f4, horizontal2, targetedFlingBehavior3, z4, r10, function12, nestedScrollConnection2, snapPosition2, function4, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i23 |= 3072;
                        if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i12 = i2;
                    i13 = i7 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 64;
                    if (i14 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    i15 = i7 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i7 & 512;
                    if (i16 != 0) {
                    }
                    i19 = i7 & 1024;
                    if (i19 != 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    int i302 = i20;
                    i22 = i7 & 4096;
                    if (i22 != 0) {
                    }
                    if ((i7 & 8192) == 0) {
                    }
                    if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                i12 = i2;
                i13 = i7 & 32;
                if (i13 != 0) {
                }
                i14 = i7 & 64;
                if (i14 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                i15 = i7 & 256;
                if (i15 != 0) {
                }
                i16 = i7 & 512;
                if (i16 != 0) {
                }
                i19 = i7 & 1024;
                if (i19 != 0) {
                }
                if ((i5 & 48) == 0) {
                }
                int i3022 = i20;
                i22 = i7 & 4096;
                if (i22 != 0) {
                }
                if ((i7 & 8192) == 0) {
                }
                if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            i12 = i2;
            i13 = i7 & 32;
            if (i13 != 0) {
            }
            i14 = i7 & 64;
            if (i14 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            i15 = i7 & 256;
            if (i15 != 0) {
            }
            i16 = i7 & 512;
            if (i16 != 0) {
            }
            i19 = i7 & 1024;
            if (i19 != 0) {
            }
            if ((i5 & 48) == 0) {
            }
            int i30222 = i20;
            i22 = i7 & 4096;
            if (i22 != 0) {
            }
            if ((i7 & 8192) == 0) {
            }
            if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        i12 = i2;
        i13 = i7 & 32;
        if (i13 != 0) {
        }
        i14 = i7 & 64;
        if (i14 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        i15 = i7 & 256;
        if (i15 != 0) {
        }
        i16 = i7 & 512;
        if (i16 != 0) {
        }
        i19 = i7 & 1024;
        if (i19 != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        int i302222 = i20;
        i22 = i7 & 4096;
        if (i22 != 0) {
        }
        if ((i7 & 8192) == 0) {
        }
        if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i2, float f3, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z2, boolean z3, Function1 function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, final Function4 function4, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        int i10;
        int i11;
        final int i12;
        int i13;
        final float f4;
        int i14;
        Alignment.Vertical verticalXMQ;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        final PaddingValues paddingValues2;
        final PageSize pageSize2;
        final boolean z4;
        final ?? r10;
        final Function1 function12;
        final NestedScrollConnection nestedScrollConnection2;
        final Modifier modifier3;
        final Alignment.Vertical vertical2;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final SnapPosition snapPosition2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier4;
        int i24;
        PagerState pagerState2;
        int i25;
        Composer composer2;
        int i26;
        NestedScrollConnection nestedScrollConnectionRl;
        SnapPosition snapPosition3;
        ?? r9;
        Function1 function13;
        NestedScrollConnection nestedScrollConnection3;
        TargetedFlingBehavior targetedFlingBehavior4;
        PageSize pageSize3;
        boolean z5;
        float f5;
        PaddingValues paddingValues3;
        int i27;
        ?? r92;
        Composer composerKN = composer.KN(1870896258);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(pagerState) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        int i28 = i7 & 2;
        if (i28 != 0) {
            i8 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 |= composerKN.p5(paddingValues) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i8 |= composerKN.p5(pageSize) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            i12 = i2;
                            i8 |= composerKN.t(i12) ? 16384 : 8192;
                        }
                        i13 = i7 & 32;
                        if (i13 != 0) {
                            i8 |= 196608;
                            f4 = f3;
                        } else {
                            f4 = f3;
                            if ((i3 & 196608) == 0) {
                                i8 |= composerKN.rl(f4) ? 131072 : 65536;
                            }
                        }
                        i14 = i7 & 64;
                        if (i14 != 0) {
                            i8 |= 1572864;
                            verticalXMQ = vertical;
                        } else {
                            verticalXMQ = vertical;
                            if ((i3 & 1572864) == 0) {
                                i8 |= composerKN.p5(verticalXMQ) ? 1048576 : 524288;
                            }
                        }
                        if ((i3 & 12582912) == 0) {
                            if ((i7 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                int i29 = composerKN.p5(targetedFlingBehavior2) ? 8388608 : 4194304;
                                i8 |= i29;
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i8 |= i29;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i15 = i7 & 256;
                        if (i15 != 0) {
                            i8 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i8 |= composerKN.n(z2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 != 0) {
                            i18 = i8 | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            i17 = i16;
                        } else {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.n(z3) ? 536870912 : 268435456;
                            } else {
                                i17 = i16;
                            }
                            i18 = i8;
                        }
                        i19 = i7 & 1024;
                        if (i19 != 0) {
                            i20 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i20 = i5 | (composerKN.E2(function1) ? 4 : 2);
                        } else {
                            i20 = i5;
                        }
                        if ((i5 & 48) == 0) {
                            i21 = i19;
                            i20 |= ((i7 & 2048) == 0 && composerKN.E2(nestedScrollConnection)) ? 32 : 16;
                        } else {
                            i21 = i19;
                        }
                        int i30 = i20;
                        i22 = i7 & 4096;
                        if (i22 != 0) {
                            i23 = i30 | RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            int i31 = i30;
                            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i31 |= composerKN.p5(snapPosition) ? 256 : 128;
                            }
                            i23 = i31;
                        }
                        if ((i7 & 8192) == 0) {
                            if ((i5 & 3072) == 0) {
                                i23 |= composerKN.E2(function4) ? 2048 : 1024;
                            }
                            if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
                                composerKN.wTp();
                                paddingValues2 = paddingValues;
                                pageSize2 = pageSize;
                                z4 = z2;
                                r10 = z3;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                modifier3 = modifier2;
                                vertical2 = verticalXMQ;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                snapPosition2 = snapPosition;
                            } else {
                                composerKN.e();
                                if ((i3 & 1) == 0 || composerKN.rV9()) {
                                    modifier4 = i28 != 0 ? Modifier.INSTANCE : modifier2;
                                    PaddingValues paddingValuesN = i9 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues;
                                    PageSize pageSize4 = i10 != 0 ? PageSize.Fill.f18849n : pageSize;
                                    i24 = i11 != 0 ? 0 : i12;
                                    float fKN = i13 != 0 ? Dp.KN(0) : f4;
                                    if (i14 != 0) {
                                        verticalXMQ = Alignment.INSTANCE.xMQ();
                                    }
                                    if ((i7 & 128) != 0) {
                                        composer2 = composerKN;
                                        i26 = i23;
                                        pagerState2 = pagerState;
                                        TargetedFlingBehavior targetedFlingBehaviorN = PagerDefaults.f18854n.n(pagerState2, null, null, null, 0.0f, composer2, (i18 & 14) | 196608, 30);
                                        i18 &= -29360129;
                                        i25 = 0;
                                        targetedFlingBehavior2 = targetedFlingBehaviorN;
                                    } else {
                                        pagerState2 = pagerState;
                                        i25 = 0;
                                        composer2 = composerKN;
                                        i26 = i23;
                                    }
                                    boolean z6 = i15 == 0 ? z2 : true;
                                    ?? r02 = i17 != 0 ? i25 : z3;
                                    Function1 function14 = i21 != 0 ? null : function1;
                                    if ((i7 & 2048) != 0) {
                                        nestedScrollConnectionRl = PagerDefaults.f18854n.rl(pagerState2, Orientation.f16970t, composer2, (i18 & 14) | 432);
                                        i26 &= -113;
                                    } else {
                                        nestedScrollConnectionRl = nestedScrollConnection;
                                    }
                                    if (i22 != 0) {
                                        r9 = r02;
                                        function13 = function14;
                                        nestedScrollConnection3 = nestedScrollConnectionRl;
                                        snapPosition3 = SnapPosition.Start.f17335n;
                                    } else {
                                        snapPosition3 = snapPosition;
                                        r9 = r02;
                                        function13 = function14;
                                        nestedScrollConnection3 = nestedScrollConnectionRl;
                                    }
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    i23 = i26;
                                    pageSize3 = pageSize4;
                                    z5 = z6;
                                    f5 = fKN;
                                    paddingValues3 = paddingValuesN;
                                    i27 = i18;
                                    r92 = r9;
                                } else {
                                    composerKN.wTp();
                                    if ((i7 & 128) != 0) {
                                        i18 &= -29360129;
                                    }
                                    if ((i7 & 2048) != 0) {
                                        i23 &= -113;
                                    }
                                    pagerState2 = pagerState;
                                    paddingValues3 = paddingValues;
                                    z5 = z2;
                                    r92 = z3;
                                    function13 = function1;
                                    nestedScrollConnection3 = nestedScrollConnection;
                                    snapPosition3 = snapPosition;
                                    i25 = 0;
                                    i24 = i12;
                                    f5 = f4;
                                    modifier4 = modifier2;
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    composer2 = composerKN;
                                    i27 = i18;
                                    pageSize3 = pageSize;
                                }
                                composer2.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1870896258, i27, i23, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:169)");
                                    i25 = 0;
                                }
                                int i32 = (i23 & 1022) | ((i23 << 3) & 57344);
                                PagerState pagerState3 = pagerState2;
                                composerKN = composer2;
                                Alignment.Vertical vertical3 = verticalXMQ;
                                Modifier modifier5 = modifier4;
                                int i33 = i24;
                                n(pagerState3, modifier5, paddingValues3, pageSize3, i33, f5, vertical3, targetedFlingBehavior4, z5, r92, function13, nestedScrollConnection3, snapPosition3, OverscrollKt.rl(composer2, i25), function4, composerKN, i27 & 2147483646, i32, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                snapPosition2 = snapPosition3;
                                nestedScrollConnection2 = nestedScrollConnection3;
                                function12 = function13;
                                r10 = r92;
                                z4 = z5;
                                targetedFlingBehavior3 = targetedFlingBehavior4;
                                vertical2 = vertical3;
                                f4 = f5;
                                i12 = i33;
                                pageSize2 = pageSize3;
                                paddingValues2 = paddingValues3;
                                modifier3 = modifier5;
                            }
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i34) {
                                        PagerKt.rl(pagerState, modifier3, paddingValues2, pageSize2, i12, f4, vertical2, targetedFlingBehavior3, z4, r10, function12, nestedScrollConnection2, snapPosition2, function4, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i23 |= 3072;
                        if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i12 = i2;
                    i13 = i7 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 64;
                    if (i14 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    i15 = i7 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i7 & 512;
                    if (i16 != 0) {
                    }
                    i19 = i7 & 1024;
                    if (i19 != 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    int i302 = i20;
                    i22 = i7 & 4096;
                    if (i22 != 0) {
                    }
                    if ((i7 & 8192) == 0) {
                    }
                    if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                i12 = i2;
                i13 = i7 & 32;
                if (i13 != 0) {
                }
                i14 = i7 & 64;
                if (i14 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                i15 = i7 & 256;
                if (i15 != 0) {
                }
                i16 = i7 & 512;
                if (i16 != 0) {
                }
                i19 = i7 & 1024;
                if (i19 != 0) {
                }
                if ((i5 & 48) == 0) {
                }
                int i3022 = i20;
                i22 = i7 & 4096;
                if (i22 != 0) {
                }
                if ((i7 & 8192) == 0) {
                }
                if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            i12 = i2;
            i13 = i7 & 32;
            if (i13 != 0) {
            }
            i14 = i7 & 64;
            if (i14 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            i15 = i7 & 256;
            if (i15 != 0) {
            }
            i16 = i7 & 512;
            if (i16 != 0) {
            }
            i19 = i7 & 1024;
            if (i19 != 0) {
            }
            if ((i5 & 48) == 0) {
            }
            int i30222 = i20;
            i22 = i7 & 4096;
            if (i22 != 0) {
            }
            if ((i7 & 8192) == 0) {
            }
            if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        i12 = i2;
        i13 = i7 & 32;
        if (i13 != 0) {
        }
        i14 = i7 & 64;
        if (i14 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        i15 = i7 & 256;
        if (i15 != 0) {
        }
        i16 = i7 & 512;
        if (i16 != 0) {
        }
        i19 = i7 & 1024;
        if (i19 != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        int i302222 = i20;
        i22 = i7 & 4096;
        if (i22 != 0) {
        }
        if ((i7 & 8192) == 0) {
        }
        if (composerKN.HI((i18 & 306783379) == 306783378 || (i23 & 1171) != 1170, i18 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i2, float f3, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z2, boolean z3, Function1 function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, OverscrollEffect overscrollEffect, final Function4 function4, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        int i10;
        int i11;
        final int i12;
        int i13;
        float f4;
        int i14;
        Alignment.Horizontal horizontalUo;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Composer composer2;
        final PaddingValues paddingValues2;
        final PageSize pageSize2;
        final boolean z4;
        final ?? r10;
        final Function1 function12;
        final NestedScrollConnection nestedScrollConnection2;
        final SnapPosition snapPosition2;
        final float f5;
        final Modifier modifier3;
        final Alignment.Horizontal horizontal2;
        final TargetedFlingBehavior targetedFlingBehavior3;
        final OverscrollEffect overscrollEffect2;
        ScopeUpdateScope scopeUpdateScopeGh;
        PagerState pagerState2;
        int i25;
        int i26;
        int i27;
        NestedScrollConnection nestedScrollConnectionRl;
        int i28;
        Function1 function13;
        NestedScrollConnection nestedScrollConnection3;
        int i29;
        PaddingValues paddingValues3;
        Alignment.Horizontal horizontal3;
        TargetedFlingBehavior targetedFlingBehavior4;
        PageSize pageSize3;
        boolean z5;
        int i30;
        float f6;
        int i31;
        ?? r3;
        SnapPosition snapPosition3;
        Modifier modifier4;
        OverscrollEffect overscrollEffectRl;
        Composer composerKN = composer.KN(632853564);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(pagerState) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        int i32 = i7 & 2;
        if (i32 != 0) {
            i8 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i8 |= composerKN.p5(paddingValues) ? 256 : 128;
                }
                i10 = i7 & 8;
                int i33 = 1024;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i8 |= composerKN.p5(pageSize) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            i12 = i2;
                            i8 |= composerKN.t(i12) ? 16384 : 8192;
                        }
                        i13 = i7 & 32;
                        if (i13 != 0) {
                            i8 |= 196608;
                            f4 = f3;
                        } else {
                            f4 = f3;
                            if ((i3 & 196608) == 0) {
                                i8 |= composerKN.rl(f4) ? 131072 : 65536;
                            }
                        }
                        i14 = i7 & 64;
                        if (i14 != 0) {
                            i8 |= 1572864;
                            horizontalUo = horizontal;
                        } else {
                            horizontalUo = horizontal;
                            if ((i3 & 1572864) == 0) {
                                i8 |= composerKN.p5(horizontalUo) ? 1048576 : 524288;
                            }
                        }
                        if ((i3 & 12582912) == 0) {
                            if ((i7 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                int i34 = composerKN.p5(targetedFlingBehavior2) ? 8388608 : 4194304;
                                i8 |= i34;
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i8 |= i34;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i15 = i7 & 256;
                        if (i15 != 0) {
                            i8 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i8 |= composerKN.n(z2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 != 0) {
                            i18 = i8 | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            i17 = i16;
                        } else {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.n(z3) ? 536870912 : 268435456;
                            } else {
                                i17 = i16;
                            }
                            i18 = i8;
                        }
                        i19 = i7 & 1024;
                        if (i19 != 0) {
                            i20 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i20 = i5 | (composerKN.E2(function1) ? 4 : 2);
                        } else {
                            i20 = i5;
                        }
                        if ((i5 & 48) == 0) {
                            i21 = i19;
                            i20 |= ((i7 & 2048) == 0 && composerKN.E2(nestedScrollConnection)) ? 32 : 16;
                        } else {
                            i21 = i19;
                        }
                        int i35 = i20;
                        i22 = i7 & 4096;
                        if (i22 != 0) {
                            i23 = i35 | RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            i23 = i35;
                            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i23 |= composerKN.p5(snapPosition) ? 256 : 128;
                            }
                            if ((i5 & 3072) == 0) {
                                if ((i7 & 8192) == 0 && composerKN.p5(overscrollEffect)) {
                                    i33 = 2048;
                                }
                                i23 |= i33;
                            }
                            i24 = i23;
                            if ((i7 & 16384) != 0) {
                                if ((i5 & 24576) == 0) {
                                    i24 |= composerKN.E2(function4) ? 16384 : 8192;
                                }
                                if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
                                    composerKN.e();
                                    if ((i3 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier5 = i32 != 0 ? Modifier.INSTANCE : modifier2;
                                        PaddingValues paddingValuesN = i9 != 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues;
                                        PageSize pageSize4 = i10 != 0 ? PageSize.Fill.f18849n : pageSize;
                                        int i36 = i11 != 0 ? 0 : i12;
                                        float fKN = i13 != 0 ? Dp.KN(0) : f4;
                                        if (i14 != 0) {
                                            horizontalUo = Alignment.INSTANCE.Uo();
                                        }
                                        if ((i7 & 128) != 0) {
                                            i26 = i22;
                                            i27 = i24;
                                            pagerState2 = pagerState;
                                            TargetedFlingBehavior targetedFlingBehaviorN = PagerDefaults.f18854n.n(pagerState2, null, null, null, 0.0f, composerKN, (i18 & 14) | 196608, 30);
                                            i18 &= -29360129;
                                            i25 = 0;
                                            targetedFlingBehavior2 = targetedFlingBehaviorN;
                                        } else {
                                            pagerState2 = pagerState;
                                            i25 = 0;
                                            i26 = i22;
                                            i27 = i24;
                                        }
                                        boolean z6 = i15 == 0 ? z2 : true;
                                        ?? r02 = i17 != 0 ? i25 : z3;
                                        Function1 function14 = i21 != 0 ? null : function1;
                                        if ((i7 & 2048) != 0) {
                                            nestedScrollConnectionRl = PagerDefaults.f18854n.rl(pagerState2, Orientation.f16969n, composerKN, (i18 & 14) | 432);
                                            i28 = i27 & (-113);
                                        } else {
                                            nestedScrollConnectionRl = nestedScrollConnection;
                                            i28 = i27;
                                        }
                                        SnapPosition snapPosition4 = i26 != 0 ? SnapPosition.Start.f17335n : snapPosition;
                                        if ((i7 & 8192) != 0) {
                                            SnapPosition snapPosition5 = snapPosition4;
                                            overscrollEffectRl = OverscrollKt.rl(composerKN, i25);
                                            i29 = i28 & (-7169);
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            snapPosition3 = snapPosition5;
                                            function13 = function14;
                                            nestedScrollConnection3 = nestedScrollConnectionRl;
                                            composer2 = composerKN;
                                            paddingValues3 = paddingValuesN;
                                            horizontal3 = horizontalUo;
                                            pageSize3 = pageSize4;
                                            z5 = z6;
                                            i30 = i36;
                                            f6 = fKN;
                                            i31 = i18;
                                            r3 = r02;
                                            modifier4 = modifier5;
                                        } else {
                                            function13 = function14;
                                            nestedScrollConnection3 = nestedScrollConnectionRl;
                                            i29 = i28;
                                            composer2 = composerKN;
                                            paddingValues3 = paddingValuesN;
                                            horizontal3 = horizontalUo;
                                            targetedFlingBehavior4 = targetedFlingBehavior2;
                                            pageSize3 = pageSize4;
                                            z5 = z6;
                                            i30 = i36;
                                            f6 = fKN;
                                            i31 = i18;
                                            r3 = r02;
                                            snapPosition3 = snapPosition4;
                                            modifier4 = modifier5;
                                            overscrollEffectRl = overscrollEffect;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        if ((i7 & 128) != 0) {
                                            i18 &= -29360129;
                                        }
                                        if ((i7 & 2048) != 0) {
                                            i24 &= -113;
                                        }
                                        if ((i7 & 8192) != 0) {
                                            i24 &= -7169;
                                        }
                                        paddingValues3 = paddingValues;
                                        pageSize3 = pageSize;
                                        r3 = z3;
                                        function13 = function1;
                                        nestedScrollConnection3 = nestedScrollConnection;
                                        i29 = i24;
                                        composer2 = composerKN;
                                        f6 = f4;
                                        modifier4 = modifier2;
                                        horizontal3 = horizontalUo;
                                        i31 = i18;
                                        z5 = z2;
                                        overscrollEffectRl = overscrollEffect;
                                        i30 = i12;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        snapPosition3 = snapPosition;
                                    }
                                    composer2.S();
                                    Modifier modifier6 = modifier4;
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(632853564, i31, i29, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:259)");
                                    }
                                    int i37 = i29;
                                    int i38 = i31 >> 6;
                                    int i39 = ((i31 >> 3) & 14) | 24576 | ((i31 << 3) & 112) | (i31 & 896) | ((i31 >> 18) & 7168) | (i38 & 458752) | (i38 & 3670016) | ((i37 << 12) & 29360128);
                                    int i40 = i31 << 12;
                                    int i41 = i39 | (i40 & 234881024) | (i40 & 1879048192);
                                    int i42 = i31 >> 9;
                                    int i43 = i37 << 6;
                                    PaddingValues paddingValues4 = paddingValues3;
                                    LazyLayoutPagerKt.n(modifier6, pagerState, paddingValues4, r3, Orientation.f16969n, targetedFlingBehavior4, z5, overscrollEffectRl, i30, f6, pageSize3, nestedScrollConnection3, function13, horizontal3, Alignment.INSTANCE.xMQ(), snapPosition3, function4, composer2, i41, (i42 & 7168) | (i43 & 896) | (i42 & 14) | 24576 | (i37 & 112) | ((i37 << 9) & 458752) | (i43 & 3670016), 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    int i44 = i30;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    i12 = i44;
                                    float f7 = f6;
                                    z4 = z5;
                                    f5 = f7;
                                    Function1 function15 = function13;
                                    nestedScrollConnection2 = nestedScrollConnection3;
                                    function12 = function15;
                                    overscrollEffect2 = overscrollEffectRl;
                                    pageSize2 = pageSize3;
                                    horizontal2 = horizontal3;
                                    snapPosition2 = snapPosition3;
                                    r10 = r3;
                                    paddingValues2 = paddingValues4;
                                    modifier3 = modifier6;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    paddingValues2 = paddingValues;
                                    pageSize2 = pageSize;
                                    z4 = z2;
                                    r10 = z3;
                                    function12 = function1;
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    snapPosition2 = snapPosition;
                                    f5 = f4;
                                    modifier3 = modifier2;
                                    horizontal2 = horizontalUo;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    overscrollEffect2 = overscrollEffect;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$VerticalPager$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i45) {
                                            PagerKt.t(pagerState, modifier3, paddingValues2, pageSize2, i12, f5, horizontal2, targetedFlingBehavior3, z4, r10, function12, nestedScrollConnection2, snapPosition2, overscrollEffect2, function4, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i24 |= 24576;
                            if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        if ((i5 & 3072) == 0) {
                        }
                        i24 = i23;
                        if ((i7 & 16384) != 0) {
                        }
                        if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i12 = i2;
                    i13 = i7 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 64;
                    if (i14 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    i15 = i7 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i7 & 512;
                    if (i16 != 0) {
                    }
                    i19 = i7 & 1024;
                    if (i19 != 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    int i352 = i20;
                    i22 = i7 & 4096;
                    if (i22 != 0) {
                    }
                    if ((i5 & 3072) == 0) {
                    }
                    i24 = i23;
                    if ((i7 & 16384) != 0) {
                    }
                    if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                i12 = i2;
                i13 = i7 & 32;
                if (i13 != 0) {
                }
                i14 = i7 & 64;
                if (i14 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                i15 = i7 & 256;
                if (i15 != 0) {
                }
                i16 = i7 & 512;
                if (i16 != 0) {
                }
                i19 = i7 & 1024;
                if (i19 != 0) {
                }
                if ((i5 & 48) == 0) {
                }
                int i3522 = i20;
                i22 = i7 & 4096;
                if (i22 != 0) {
                }
                if ((i5 & 3072) == 0) {
                }
                i24 = i23;
                if ((i7 & 16384) != 0) {
                }
                if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i10 = i7 & 8;
            int i332 = 1024;
            if (i10 != 0) {
            }
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            i12 = i2;
            i13 = i7 & 32;
            if (i13 != 0) {
            }
            i14 = i7 & 64;
            if (i14 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            i15 = i7 & 256;
            if (i15 != 0) {
            }
            i16 = i7 & 512;
            if (i16 != 0) {
            }
            i19 = i7 & 1024;
            if (i19 != 0) {
            }
            if ((i5 & 48) == 0) {
            }
            int i35222 = i20;
            i22 = i7 & 4096;
            if (i22 != 0) {
            }
            if ((i5 & 3072) == 0) {
            }
            i24 = i23;
            if ((i7 & 16384) != 0) {
            }
            if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        i10 = i7 & 8;
        int i3322 = 1024;
        if (i10 != 0) {
        }
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        i12 = i2;
        i13 = i7 & 32;
        if (i13 != 0) {
        }
        i14 = i7 & 64;
        if (i14 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        i15 = i7 & 256;
        if (i15 != 0) {
        }
        i16 = i7 & 512;
        if (i16 != 0) {
        }
        i19 = i7 & 1024;
        if (i19 != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        int i352222 = i20;
        i22 = i7 & 4096;
        if (i22 != 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        i24 = i23;
        if ((i7 & 16384) != 0) {
        }
        if (composerKN.HI(((i18 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true, i18 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final Modifier KN(Modifier modifier, final PagerState pagerState, final boolean z2, final vd vdVar, boolean z3) {
        return z3 ? modifier.Zmq(SemanticsModifierKt.nr(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                n(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (z2) {
                    final PagerState pagerState2 = pagerState;
                    final vd vdVar2 = vdVar;
                    SemanticsPropertiesKt.rV9(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.xMQ(pagerState2, vdVar2));
                        }
                    }, 1, null);
                    final PagerState pagerState3 = pagerState;
                    final vd vdVar3 = vdVar;
                    SemanticsPropertiesKt.T(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.mUb(pagerState3, vdVar3));
                        }
                    }, 1, null);
                    return;
                }
                final PagerState pagerState4 = pagerState;
                final vd vdVar4 = vdVar;
                SemanticsPropertiesKt.nHg(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.xMQ(pagerState4, vdVar4));
                    }
                }, 1, null);
                final PagerState pagerState5 = pagerState;
                final vd vdVar5 = vdVar;
                SemanticsPropertiesKt.wTp(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.mUb(pagerState5, vdVar5));
                    }
                }, 1, null);
            }
        }, 1, null)) : modifier.Zmq(Modifier.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mUb(PagerState pagerState, vd vdVar) {
        if (pagerState.J2()) {
            GJW.C.nr(vdVar, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean xMQ(PagerState pagerState, vd vdVar) {
        if (pagerState.nr()) {
            GJW.C.nr(vdVar, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
            return true;
        }
        return false;
    }
}
