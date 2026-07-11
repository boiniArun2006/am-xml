package androidx.compose.material;

import GJW.vd;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.FabPosition;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0080\u0002\u0010,\u001a\u00020\u00122\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u00132\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0002\b\u00132\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020$2\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0002\b\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001ar\u0010/\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\"2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u001c\u0010+\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u009b\u0001\u00105\u001a\u00020\u00122\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u00132\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0002\b\u00132\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0002\b\u00132\u0013\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0019¢\u0006\u0002\b\u00132\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00120\u0019¢\u0006\u0002\b\u00132\u0006\u0010'\u001a\u00020\"2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\bH\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a#\u0010;\u001a\u00020:2\n\u0010.\u001a\u0006\u0012\u0002\b\u0003072\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010<\"\u0014\u0010>\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010=\"\u0014\u0010?\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010=\"\u0014\u0010@\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010=\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/BottomSheetState;", "qie", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "bottomSheetState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BottomSheetScaffoldState;", "gh", "(Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "topBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "sheetPeekHeight", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "state", c.f62177j, "(Landroidx/compose/material/BottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "body", "bottomSheet", "sheetOffset", "sheetState", "t", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;ILandroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material/AnchoredDraggableState;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nr", "(Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "F", "FabSpacing", "BottomSheetScaffoldPositionalThreshold", "BottomSheetScaffoldVelocityThreshold", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,601:1\n75#2:602\n75#2:635\n1247#3,6:603\n1247#3,6:609\n1247#3,6:615\n1247#3,3:628\n1250#3,3:632\n1247#3,6:637\n1247#3,6:643\n1247#3,6:649\n1225#3,6:663\n557#4:621\n554#4,6:622\n555#5:631\n1#6:636\n171#7:655\n169#7,7:656\n79#7,6:669\n86#7,4:684\n90#7,2:694\n94#7:699\n177#7:700\n368#8,9:675\n377#8,3:696\n4034#9,6:688\n149#10:701\n149#10:702\n149#10:703\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n*L\n226#1:602\n390#1:635\n235#1:603,6\n266#1:609,6\n268#1:615,6\n389#1:628,3\n389#1:632,3\n393#1:637,6\n416#1:643,6\n480#1:649,6\n471#1:663,6\n389#1:621\n389#1:622,6\n389#1:631\n471#1:655\n471#1:656,7\n471#1:669,6\n471#1:684,4\n471#1:694,2\n471#1:699\n471#1:700\n471#1:675,9\n471#1:696,3\n471#1:688,6\n598#1:701\n599#1:702\n600#1:703\n*E\n"})
public final class BottomSheetScaffoldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f21486n = Dp.KN(16);
    private static final float rl = Dp.KN(56);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f21487t = Dp.KN(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function3 function3, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, Function2 function2, Function3 function32, Function2 function22, int i2, boolean z2, Shape shape, float f3, long j2, long j3, float f4, long j4, long j5, final Function3 function33, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        BottomSheetScaffoldState bottomSheetScaffoldStateGh;
        int i9;
        int i10;
        Function3 function3N;
        int i11;
        Function2 function23;
        int i12;
        int i13;
        int i14;
        boolean z3;
        int i15;
        int i16;
        long jT2;
        Composer composer2;
        final Function2 function24;
        final Shape shape2;
        final long j6;
        final long j7;
        final Function3 function34;
        final Function2 function25;
        final int i17;
        final Modifier modifier3;
        final BottomSheetScaffoldState bottomSheetScaffoldState2;
        final boolean z4;
        final float f5;
        final long j9;
        final long j10;
        final float f6;
        ScopeUpdateScope scopeUpdateScopeGh;
        int iRl;
        Shape large;
        float fRl;
        boolean z5;
        long jTy;
        long jRl;
        float fT;
        int i18;
        float f7;
        long j11;
        long j12;
        long j13;
        int i19;
        final float f8;
        Composer composerKN = composer.KN(-423121424);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.E2(function3) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        int i20 = i7 & 2;
        if (i20 != 0) {
            i8 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i7 & 4) == 0) {
                    bottomSheetScaffoldStateGh = bottomSheetScaffoldState;
                    int i21 = composerKN.p5(bottomSheetScaffoldStateGh) ? 256 : 128;
                    i8 |= i21;
                } else {
                    bottomSheetScaffoldStateGh = bottomSheetScaffoldState;
                }
                i8 |= i21;
            } else {
                bottomSheetScaffoldStateGh = bottomSheetScaffoldState;
            }
            i9 = i7 & 8;
            int i22 = 1024;
            if (i9 == 0) {
                i8 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    i8 |= composerKN.E2(function2) ? 2048 : 1024;
                }
                i10 = i7 & 16;
                int i23 = 8192;
                if (i10 == 0) {
                    if ((i3 & 24576) == 0) {
                        function3N = function32;
                        i8 |= composerKN.E2(function3N) ? 16384 : 8192;
                    }
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                        function23 = function22;
                    } else {
                        function23 = function22;
                        if ((i3 & 196608) == 0) {
                            i8 |= composerKN.E2(function23) ? 131072 : 65536;
                        }
                    }
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i8 |= 1572864;
                        i13 = i2;
                    } else {
                        i13 = i2;
                        if ((i3 & 1572864) == 0) {
                            i8 |= composerKN.t(i13) ? 1048576 : 524288;
                        }
                    }
                    i14 = i7 & 128;
                    if (i14 == 0) {
                        i8 |= 12582912;
                        z3 = z2;
                    } else {
                        z3 = z2;
                        if ((i3 & 12582912) == 0) {
                            i8 |= composerKN.n(z3) ? 8388608 : 4194304;
                        }
                    }
                    if ((i3 & 100663296) == 0) {
                        i8 |= ((i7 & 256) == 0 && composerKN.p5(shape)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i8 |= ((i7 & 512) == 0 && composerKN.rl(f3)) ? 536870912 : 268435456;
                    }
                    if ((i5 & 6) != 0) {
                        i15 = i5 | (((i7 & 1024) == 0 && composerKN.nr(j2)) ? 4 : 2);
                    } else {
                        i15 = i5;
                    }
                    if ((i5 & 48) != 0) {
                        i15 |= ((i7 & 2048) == 0 && composerKN.nr(j3)) ? 32 : 16;
                    }
                    int i24 = i15;
                    if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                        i16 = i24 | (((i7 & 4096) == 0 && composerKN.rl(f4)) ? 256 : 128);
                    } else {
                        i16 = i24;
                    }
                    if ((i5 & 3072) != 0) {
                        jT2 = j4;
                        if ((i7 & 8192) == 0 && composerKN.nr(jT2)) {
                            i22 = 2048;
                        }
                        i16 |= i22;
                    } else {
                        jT2 = j4;
                    }
                    if ((i5 & 24576) == 0) {
                        if ((i7 & 16384) == 0 && composerKN.nr(j5)) {
                            i23 = 16384;
                        }
                        i16 |= i23;
                    }
                    if ((i7 & 32768) == 0) {
                        i16 |= 196608;
                    } else if ((i5 & 196608) == 0) {
                        i16 |= composerKN.E2(function33) ? 131072 : 65536;
                    }
                    if (composerKN.HI((306783379 & i8) == 306783378 || (i16 & 74899) != 74898, i8 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        function24 = function2;
                        shape2 = shape;
                        j6 = j5;
                        j7 = jT2;
                        function34 = function3N;
                        function25 = function23;
                        i17 = i13;
                        modifier3 = modifier2;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateGh;
                        z4 = z3;
                        f5 = f3;
                        j9 = j2;
                        j10 = j3;
                        f6 = f4;
                    } else {
                        composerKN.e();
                        if ((i3 & 1) == 0 || composerKN.rV9()) {
                            if (i20 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i7 & 4) != 0) {
                                i8 &= -897;
                                bottomSheetScaffoldStateGh = gh(null, null, composerKN, 0, 3);
                            }
                            Function2 function26 = i9 != 0 ? null : function2;
                            if (i10 != 0) {
                                function3N = ComposableSingletons$BottomSheetScaffoldKt.f21723n.n();
                            }
                            if (i11 != 0) {
                                function23 = null;
                            }
                            iRl = i12 != 0 ? FabPosition.INSTANCE.rl() : i13;
                            if (i14 != 0) {
                                z3 = true;
                            }
                            if ((i7 & 256) != 0) {
                                large = MaterialTheme.f22169n.rl(composerKN, 6).getLarge();
                                i8 &= -234881025;
                            } else {
                                large = shape;
                            }
                            if ((i7 & 512) != 0) {
                                fRl = BottomSheetScaffoldDefaults.f21484n.rl();
                                i8 &= -1879048193;
                            } else {
                                fRl = f3;
                            }
                            if ((i7 & 1024) != 0) {
                                i16 &= -15;
                                z5 = z3;
                                jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                            } else {
                                z5 = z3;
                                jTy = j2;
                            }
                            if ((i7 & 2048) != 0) {
                                jRl = ColorsKt.rl(jTy, composerKN, i16 & 14);
                                i16 &= -113;
                            } else {
                                jRl = j3;
                            }
                            int i25 = i16;
                            function2 = function26;
                            if ((i7 & 4096) != 0) {
                                fT = BottomSheetScaffoldDefaults.f21484n.t();
                                i25 &= -897;
                            } else {
                                fT = f4;
                            }
                            float f9 = fT;
                            if ((i7 & 8192) != 0) {
                                jT2 = MaterialTheme.f22169n.n(composerKN, 6).t();
                                i18 = i25 & (-7169);
                            } else {
                                i18 = i25;
                            }
                            if ((i7 & 16384) != 0) {
                                long jRl2 = ColorsKt.rl(jT2, composerKN, (i18 >> 9) & 14);
                                i18 &= -57345;
                                f7 = f9;
                                j11 = jRl2;
                            } else {
                                f7 = f9;
                                j11 = j5;
                            }
                            j12 = jT2;
                            j13 = jTy;
                            z3 = z5;
                            i19 = i8;
                        } else {
                            composerKN.wTp();
                            if ((i7 & 4) != 0) {
                                i8 &= -897;
                            }
                            if ((i7 & 256) != 0) {
                                i8 &= -234881025;
                            }
                            if ((i7 & 512) != 0) {
                                i8 &= -1879048193;
                            }
                            if ((i7 & 1024) != 0) {
                                i16 &= -15;
                            }
                            if ((i7 & 2048) != 0) {
                                i16 &= -113;
                            }
                            i18 = i16;
                            if ((i7 & 4096) != 0) {
                                i18 &= -897;
                            }
                            if ((i7 & 8192) != 0) {
                                i18 &= -7169;
                            }
                            if ((i7 & 16384) != 0) {
                                i18 &= -57345;
                            }
                            fRl = f3;
                            jRl = j3;
                            f7 = f4;
                            j11 = j5;
                            j12 = jT2;
                            i19 = i8;
                            iRl = i13;
                            large = shape;
                            j13 = j2;
                        }
                        int i26 = i18;
                        final Function2 function27 = function2;
                        composerKN.S();
                        if (ComposerKt.v()) {
                            f8 = fRl;
                            ComposerKt.p5(-423121424, i19, i26, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                        } else {
                            f8 = fRl;
                        }
                        final float f10 = f7;
                        final long j14 = j13;
                        final Function3 function35 = function3N;
                        final int i27 = iRl;
                        final Function2 function28 = function23;
                        final Shape shape3 = large;
                        final BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldStateGh;
                        final boolean z6 = z3;
                        final long j15 = jRl;
                        float f11 = f8;
                        int i28 = i26 >> 3;
                        long j16 = j12;
                        long j17 = j11;
                        SurfaceKt.n(SizeKt.J2(modifier2, 0.0f, 1, null), null, j16, j17, null, 0.0f, ComposableLambdaKt.nr(-131096268, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i29) {
                                if (!composer3.HI((i29 & 3) != 2, i29 & 1)) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-131096268, i29, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:338)");
                                }
                                BottomSheetState bottomSheetState = bottomSheetScaffoldState3.getBottomSheetState();
                                Function2 function29 = function27;
                                final Function3 function36 = function33;
                                final float f12 = f10;
                                ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(1143451324, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        n(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer4, int i30) {
                                        if (!composer4.HI((i30 & 3) != 2, i30 & 1)) {
                                            composer4.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1143451324, i30, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:340)");
                                        }
                                        function36.invoke(PaddingKt.O(0.0f, 0.0f, 0.0f, f12, 7, null), composer4, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer3, 54);
                                final boolean z7 = z6;
                                final BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldState3;
                                final float f13 = f10;
                                final Shape shape4 = shape3;
                                final float f14 = f8;
                                final long j18 = j14;
                                final long j19 = j15;
                                final Function3 function37 = function3;
                                ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(1856649243, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public final void n(Composer composer4, int i30) {
                                        Modifier modifierRl;
                                        if (!composer4.HI((i30 & 3) != 2, i30 & 1)) {
                                            composer4.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(1856649243, i30, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:342)");
                                        }
                                        if (z7) {
                                            composer4.eF(981757373);
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            boolean zP5 = composer4.p5(bottomSheetScaffoldState4.getBottomSheetState().getAnchoredDraggableState());
                                            BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState4;
                                            Object objIF = composer4.iF();
                                            if (zP5 || objIF == Composer.INSTANCE.n()) {
                                                objIF = BottomSheetScaffoldKt.nr(bottomSheetScaffoldState5.getBottomSheetState().getAnchoredDraggableState(), Orientation.f16969n);
                                                composer4.o(objIF);
                                            }
                                            modifierRl = NestedScrollModifierKt.rl(companion, (NestedScrollConnection) objIF, null, 2, null);
                                            composer4.Xw();
                                        } else {
                                            composer4.eF(447327754);
                                            composer4.Xw();
                                            modifierRl = Modifier.INSTANCE;
                                        }
                                        BottomSheetScaffoldKt.n(bottomSheetScaffoldState4.getBottomSheetState(), z7, shape4, f14, j18, j19, f13, SizeKt.ty(SizeKt.KN(modifierRl, 0.0f, 1, null), f13, 0.0f, 2, null), function37, composer4, 0, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        n(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }
                                }, composer3, 54);
                                Function2 function210 = function28;
                                final Function3 function38 = function35;
                                final BottomSheetScaffoldState bottomSheetScaffoldState5 = bottomSheetScaffoldState3;
                                ComposableLambda composableLambdaNr3 = ComposableLambdaKt.nr(-1011922215, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        n(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer4, int i30) {
                                        if (!composer4.HI((i30 & 3) != 2, i30 & 1)) {
                                            composer4.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1011922215, i30, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:366)");
                                        }
                                        function38.invoke(bottomSheetScaffoldState5.getSnackbarHostState(), composer4, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer3, 54);
                                float f15 = f10;
                                boolean zP5 = composer3.p5(bottomSheetScaffoldState3);
                                final BottomSheetScaffoldState bottomSheetScaffoldState6 = bottomSheetScaffoldState3;
                                Object objIF = composer3.iF();
                                if (zP5 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function0<Float>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$1$4$1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Float invoke() {
                                            return Float.valueOf(bottomSheetScaffoldState6.getBottomSheetState().J2());
                                        }
                                    };
                                    composer3.o(objIF);
                                }
                                BottomSheetScaffoldKt.t(function29, composableLambdaNr, composableLambdaNr2, function210, composableLambdaNr3, f15, (Function0) objIF, i27, bottomSheetState, composer3, 25008);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composerKN, (i28 & 7168) | (i28 & 896) | 1572864, 50);
                        composer2 = composerKN;
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        function24 = function27;
                        bottomSheetScaffoldState2 = bottomSheetScaffoldStateGh;
                        z4 = z3;
                        j6 = j17;
                        j10 = j15;
                        f6 = f10;
                        function25 = function23;
                        f5 = f11;
                        function34 = function3N;
                        i17 = iRl;
                        shape2 = large;
                        modifier3 = modifier2;
                        j9 = j14;
                        j7 = j16;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i29) {
                                BottomSheetScaffoldKt.rl(function3, modifier3, bottomSheetScaffoldState2, function24, function34, function25, i17, z4, shape2, f5, j9, j10, f6, j7, j6, function33, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 |= 24576;
                function3N = function32;
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                i14 = i7 & 128;
                if (i14 == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                if ((i5 & 6) != 0) {
                }
                if ((i5 & 48) != 0) {
                }
                int i242 = i15;
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                }
                if ((i5 & 3072) != 0) {
                }
                if ((i5 & 24576) == 0) {
                }
                if ((i7 & 32768) == 0) {
                }
                if (composerKN.HI((306783379 & i8) == 306783378 || (i16 & 74899) != 74898, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            i10 = i7 & 16;
            int i232 = 8192;
            if (i10 == 0) {
            }
            function3N = function32;
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            i14 = i7 & 128;
            if (i14 == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i5 & 6) != 0) {
            }
            if ((i5 & 48) != 0) {
            }
            int i2422 = i15;
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
            }
            if ((i5 & 3072) != 0) {
            }
            if ((i5 & 24576) == 0) {
            }
            if ((i7 & 32768) == 0) {
            }
            if (composerKN.HI((306783379 & i8) == 306783378 || (i16 & 74899) != 74898, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i9 = i7 & 8;
        int i222 = 1024;
        if (i9 == 0) {
        }
        i10 = i7 & 16;
        int i2322 = 8192;
        if (i10 == 0) {
        }
        function3N = function32;
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        i14 = i7 & 128;
        if (i14 == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i5 & 6) != 0) {
        }
        if ((i5 & 48) != 0) {
        }
        int i24222 = i15;
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i5 & 3072) != 0) {
        }
        if ((i5 & 24576) == 0) {
        }
        if ((i7 & 32768) == 0) {
        }
        if (composerKN.HI((306783379 & i8) == 306783378 || (i16 & 74899) != 74898, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final BottomSheetScaffoldState gh(BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        Composer composer2;
        if ((i3 & 1) != 0) {
            composer2 = composer;
            bottomSheetState = qie(BottomSheetValue.f21595n, null, null, composer2, 6, 6);
        } else {
            composer2 = composer;
        }
        if ((i3 & 2) != 0) {
            Object objIF = composer2.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new SnackbarHostState();
                composer2.o(objIF);
            }
            snackbarHostState = (SnackbarHostState) objIF;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1022285988, i2, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:266)");
        }
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer2.p5(bottomSheetState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer2.p5(snackbarHostState)) || (i2 & 48) == 32);
        Object objIF2 = composer2.iF();
        if (z2 || objIF2 == Composer.INSTANCE.n()) {
            objIF2 = new BottomSheetScaffoldState(bottomSheetState, snackbarHostState);
            composer2.o(objIF2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objIF2;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return bottomSheetScaffoldState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final BottomSheetState bottomSheetState, final boolean z2, final Shape shape, final float f3, final long j2, final long j3, final float f4, Modifier modifier, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        int i8;
        final Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-412323066);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(bottomSheetState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.n(z2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i5 |= composerKN.p5(shape) ? 256 : 128;
                }
                if ((i3 & 8) == 0) {
                    if ((i2 & 3072) == 0) {
                        i5 |= composerKN.rl(f3) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i5 |= composerKN.nr(j2) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i5 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i5 |= composerKN.nr(j3) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.rl(f4) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i5 |= 12582912;
                        i8 = 1572864;
                        modifier2 = modifier;
                    } else {
                        i8 = 1572864;
                        modifier2 = modifier;
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerKN.p5(modifier2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i3 & 256) == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= composerKN.E2(function3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if (composerKN.HI((38347923 & i5) == 38347922, i5 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                    } else {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-412323066, i5, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
                        }
                        Object objIF = composerKN.iF();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                            objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                            composerKN.o(objIF);
                        }
                        final vd vdVar = (vd) objIF;
                        final float fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(f4);
                        AnchoredDraggableState anchoredDraggableState = bottomSheetState.getAnchoredDraggableState();
                        int i9 = i5;
                        Orientation orientation = Orientation.f16969n;
                        int i10 = i9 & 14;
                        boolean zRl = composerKN.rl(fL) | (i10 == 4);
                        Object objIF2 = composerKN.iF();
                        if (zRl || objIF2 == companion.n()) {
                            objIF2 = new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<BottomSheetValue>, ? extends BottomSheetValue>>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1

                                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[BottomSheetValue.values().length];
                                        try {
                                            iArr[BottomSheetValue.f21595n.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[BottomSheetValue.f21596t.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<BottomSheetValue>, ? extends BottomSheetValue> invoke(IntSize intSize, Constraints constraints) {
                                    return n(intSize.getPackedValue(), constraints.getValue());
                                }

                                public final Pair n(long j4, long j5) {
                                    BottomSheetValue bottomSheetValue;
                                    final int iGh = Constraints.gh(j5);
                                    final float fJ2 = IntSize.J2(j4);
                                    final float f5 = fL;
                                    DraggableAnchors draggableAnchorsN = AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<BottomSheetValue>, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$1$1$newAnchors$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BottomSheetValue> draggableAnchorsConfig) {
                                            n(draggableAnchorsConfig);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                            draggableAnchorsConfig.n(BottomSheetValue.f21595n, iGh - f5);
                                            float f6 = fJ2;
                                            if (f6 <= 0.0f || f6 == f5) {
                                                return;
                                            }
                                            draggableAnchorsConfig.n(BottomSheetValue.f21596t, iGh - f6);
                                        }
                                    });
                                    int i11 = WhenMappings.$EnumSwitchMapping$0[((BottomSheetValue) bottomSheetState.getAnchoredDraggableState().aYN()).ordinal()];
                                    if (i11 != 1) {
                                        if (i11 == 2) {
                                            bottomSheetValue = BottomSheetValue.f21596t;
                                            if (!draggableAnchorsN.nr(bottomSheetValue)) {
                                                bottomSheetValue = BottomSheetValue.f21595n;
                                            }
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        bottomSheetValue = BottomSheetValue.f21595n;
                                    }
                                    return TuplesKt.to(draggableAnchorsN, bottomSheetValue);
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        Modifier modifierO = AnchoredDraggableKt.O(AnchoredDraggableKt.KN(modifier2, anchoredDraggableState, orientation, (Function2) objIF2), bottomSheetState.getAnchoredDraggableState(), orientation, z2, false, null, false, 56, null);
                        boolean zE2 = (i10 == 4) | composerKN.E2(vdVar);
                        Object objIF3 = composerKN.iF();
                        if (zE2 || objIF3 == companion.n()) {
                            objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1
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
                                    if (bottomSheetState.getAnchoredDraggableState().HI().getSize() > 1) {
                                        if (bottomSheetState.O()) {
                                            final BottomSheetState bottomSheetState2 = bottomSheetState;
                                            final vd vdVar2 = vdVar;
                                            SemanticsPropertiesKt.Ik(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1.1

                                                /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                                @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
                                                static final class C05201 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                    int f21497n;

                                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                    final /* synthetic */ BottomSheetState f21498t;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C05201(BottomSheetState bottomSheetState, Continuation continuation) {
                                                        super(2, continuation);
                                                        this.f21498t = bottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                        return new C05201(this.f21498t, continuation);
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final Object invoke2(vd vdVar, Continuation continuation) {
                                                        return ((C05201) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                        return invoke2(vdVar, (Continuation) continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i2 = this.f21497n;
                                                        if (i2 != 0) {
                                                            if (i2 == 1) {
                                                                ResultKt.throwOnFailure(obj);
                                                            } else {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                        } else {
                                                            ResultKt.throwOnFailure(obj);
                                                            BottomSheetState bottomSheetState = this.f21498t;
                                                            this.f21497n = 1;
                                                            if (bottomSheetState.rl(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke() {
                                                    if (((Boolean) bottomSheetState2.getAnchoredDraggableState().getConfirmValueChange().invoke(BottomSheetValue.f21596t)).booleanValue()) {
                                                        GJW.C.nr(vdVar2, null, null, new C05201(bottomSheetState2, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        } else {
                                            final BottomSheetState bottomSheetState3 = bottomSheetState;
                                            final vd vdVar3 = vdVar;
                                            SemanticsPropertiesKt.J2(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1.2

                                                /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$2$1, reason: invalid class name */
                                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                                @DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {430}, m = "invokeSuspend", n = {}, s = {})
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                    int f21501n;

                                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                    final /* synthetic */ BottomSheetState f21502t;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(BottomSheetState bottomSheetState, Continuation continuation) {
                                                        super(2, continuation);
                                                        this.f21502t = bottomSheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                        return new AnonymousClass1(this.f21502t, continuation);
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final Object invoke2(vd vdVar, Continuation continuation) {
                                                        return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                        return invoke2(vdVar, (Continuation) continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i2 = this.f21501n;
                                                        if (i2 != 0) {
                                                            if (i2 == 1) {
                                                                ResultKt.throwOnFailure(obj);
                                                            } else {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                        } else {
                                                            ResultKt.throwOnFailure(obj);
                                                            BottomSheetState bottomSheetState = this.f21502t;
                                                            this.f21501n = 1;
                                                            if (bottomSheetState.n(this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final Boolean invoke() {
                                                    if (((Boolean) bottomSheetState3.getAnchoredDraggableState().getConfirmValueChange().invoke(BottomSheetValue.f21595n)).booleanValue()) {
                                                        GJW.C.nr(vdVar3, null, null, new AnonymousClass1(bottomSheetState3, null), 3, null);
                                                    }
                                                    return Boolean.TRUE;
                                                }
                                            }, 1, null);
                                        }
                                    }
                                }
                            };
                            composerKN.o(objIF3);
                        }
                        int i11 = i9 >> 6;
                        int i12 = ((i9 >> 3) & 112) | i8 | (i11 & 896) | (i11 & 7168) | (458752 & (i9 << 6));
                        composer2 = composerKN;
                        SurfaceKt.n(SemanticsModifierKt.nr(modifierO, false, (Function1) objIF3, 1, null), shape, j2, j3, null, f3, ComposableLambdaKt.nr(2055704138, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$3
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i13) {
                                if (!composer3.HI((i13 & 3) != 2, i13 & 1)) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(2055704138, i13, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:440)");
                                }
                                Function3 function32 = function3;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO2 = ComposedModifierKt.O(composer3, companion2);
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
                                Updater.O(composerN, measurePolicyN, companion3.t());
                                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                Function2 function2Rl = companion3.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO2, companion3.nr());
                                function32.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, i12, 16);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$4
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
                                BottomSheetScaffoldKt.n(bottomSheetState, z2, shape, f3, j2, j3, f4, modifier2, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if (composerKN.HI((38347923 & i5) == 38347922, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            if ((i3 & 8) == 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if (composerKN.HI((38347923 & i5) == 38347922, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if (composerKN.HI((38347923 & i5) == 38347922, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection nr(AnchoredDraggableState anchoredDraggableState, Orientation orientation) {
        return new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    public static final BottomSheetState qie(final BottomSheetValue bottomSheetValue, final AnimationSpec animationSpec, final Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = BottomSheetScaffoldDefaults.f21484n.n();
        }
        if ((i3 & 4) != 0) {
            function1 = new Function1<BottomSheetValue, Boolean>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(BottomSheetValue bottomSheetValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1808153344, i2, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:224)");
        }
        final Density density = (Density) composer.ty(CompositionLocalsKt.J2());
        Object[] objArr = {animationSpec};
        Saver saverN = BottomSheetState.INSTANCE.n(animationSpec, function1, density);
        boolean zP5 = ((((i2 & 14) ^ 6) > 4 && composer.p5(bottomSheetValue)) || (i2 & 6) == 4) | composer.p5(density) | composer.E2(animationSpec) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function1)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        Object objIF = composer.iF();
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = new Function0<BottomSheetState>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$rememberBottomSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final BottomSheetState invoke() {
                    return new BottomSheetState(bottomSheetValue, density, animationSpec, function1);
                }
            };
            composer.o(objIF);
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF, composer, 0, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return bottomSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final float f3, final Function0 function0, final int i2, final BottomSheetState bottomSheetState, Composer composer, final int i3) {
        int i5;
        Composer composerKN = composer.KN(1411837005);
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerKN.E2(function2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.E2(function22) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function23) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.E2(function24) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerKN.E2(function25) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= composerKN.rl(f3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= composerKN.E2(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= composerKN.t(i2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= composerKN.p5(bottomSheetState) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        int i7 = i5;
        if (composerKN.HI((i7 & 38347923) != 38347922, i7 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(1411837005, i7, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:469)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function2 == null ? ComposableSingletons$BottomSheetScaffoldKt.f21723n.rl() : function2, function22, function23, function24 == null ? ComposableSingletons$BottomSheetScaffoldKt.f21723n.t() : function24, function25});
            boolean z2 = ((3670016 & i7) == 1048576) | ((29360128 & i7) == 8388608) | ((458752 & i7) == 131072) | ((i7 & 234881024) == 67108864);
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new MultiContentMeasurePolicy() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    public final MeasureResult rl(final MeasureScope measureScope, List list, long j2) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        Object obj4;
                        int height;
                        Object obj5;
                        List list2 = (List) list.get(0);
                        List list3 = (List) list.get(1);
                        List list4 = (List) list.get(2);
                        List list5 = (List) list.get(3);
                        List list6 = (List) list.get(4);
                        final int iQie = Constraints.qie(j2);
                        final int iGh = Constraints.gh(j2);
                        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
                        final ArrayList arrayList = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            arrayList.add(((Measurable) list4.get(i8)).dR0(jNr));
                        }
                        final ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            arrayList2.add(((Measurable) list2.get(i9)).dR0(jNr));
                        }
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList2.get(0);
                            int height2 = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex) {
                                int i10 = 1;
                                while (true) {
                                    Object obj6 = arrayList2.get(i10);
                                    int height3 = ((Placeable) obj6).getHeight();
                                    if (height2 < height3) {
                                        height2 = height3;
                                        obj = obj6;
                                    }
                                    if (i10 == lastIndex) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        final int height4 = placeable != null ? placeable.getHeight() : 0;
                        long jNr2 = Constraints.nr(jNr, 0, 0, 0, iGh - height4, 7, null);
                        final ArrayList arrayList3 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            arrayList3.add(((Measurable) list3.get(i11)).dR0(jNr2));
                        }
                        final ArrayList arrayList4 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            arrayList4.add(((Measurable) list5.get(i12)).dR0(jNr));
                        }
                        if (arrayList4.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList4.get(0);
                            int width = ((Placeable) obj2).getWidth();
                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex2) {
                                int i13 = 1;
                                while (true) {
                                    Object obj7 = arrayList4.get(i13);
                                    int width2 = ((Placeable) obj7).getWidth();
                                    if (width < width2) {
                                        obj2 = obj7;
                                        width = width2;
                                    }
                                    if (i13 == lastIndex2) {
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int width3 = placeable2 != null ? placeable2.getWidth() : 0;
                        if (arrayList4.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList4.get(0);
                            int height5 = ((Placeable) obj3).getHeight();
                            int lastIndex3 = CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex3) {
                                int i14 = 1;
                                while (true) {
                                    Object obj8 = arrayList4.get(i14);
                                    int height6 = ((Placeable) obj8).getHeight();
                                    if (height5 < height6) {
                                        height5 = height6;
                                        obj3 = obj8;
                                    }
                                    if (i14 == lastIndex3) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        final int height7 = placeable3 != null ? placeable3.getHeight() : 0;
                        final ArrayList arrayList5 = new ArrayList(list6.size());
                        int size5 = list6.size();
                        for (int i15 = 0; i15 < size5; i15++) {
                            arrayList5.add(((Measurable) list6.get(i15)).dR0(jNr));
                        }
                        if (arrayList5.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList5.get(0);
                            int width4 = ((Placeable) obj4).getWidth();
                            int lastIndex4 = CollectionsKt.getLastIndex(arrayList5);
                            if (1 <= lastIndex4) {
                                int i16 = 1;
                                while (true) {
                                    Object obj9 = arrayList5.get(i16);
                                    int width5 = ((Placeable) obj9).getWidth();
                                    if (width4 < width5) {
                                        obj4 = obj9;
                                        width4 = width5;
                                    }
                                    if (i16 == lastIndex4) {
                                        break;
                                    }
                                    i16++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        final int width6 = placeable4 != null ? placeable4.getWidth() : 0;
                        if (arrayList5.isEmpty()) {
                            height = 0;
                            obj5 = null;
                        } else {
                            height = 0;
                            Object obj10 = arrayList5.get(0);
                            int height8 = ((Placeable) obj10).getHeight();
                            int lastIndex5 = CollectionsKt.getLastIndex(arrayList5);
                            int i17 = 1;
                            if (1 <= lastIndex5) {
                                while (true) {
                                    Object obj11 = arrayList5.get(i17);
                                    int height9 = ((Placeable) obj11).getHeight();
                                    if (height8 < height9) {
                                        obj10 = obj11;
                                        height8 = height9;
                                    }
                                    if (i17 == lastIndex5) {
                                        break;
                                    }
                                    i17++;
                                }
                            }
                            obj5 = obj10;
                        }
                        Placeable placeable5 = (Placeable) obj5;
                        if (placeable5 != null) {
                            height = placeable5.getHeight();
                        }
                        final int i18 = height;
                        final Function0 function02 = function0;
                        final int i19 = i2;
                        final float f4 = f3;
                        final BottomSheetState bottomSheetState2 = bottomSheetState;
                        final int i20 = width3;
                        return MeasureScope.ER(measureScope, iQie, iGh, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.1

                            /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1$WhenMappings */
                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[BottomSheetValue.values().length];
                                    try {
                                        iArr[BottomSheetValue.f21595n.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[BottomSheetValue.f21596t.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

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
                                int i21;
                                int iRoundToInt = MathKt.roundToInt(((Number) function02.invoke()).floatValue());
                                int i22 = i19;
                                FabPosition.Companion companion = FabPosition.INSTANCE;
                                int iHow = FabPosition.J2(i22, companion.t()) ? measureScope.How(BottomSheetScaffoldKt.f21486n) : FabPosition.J2(i22, companion.n()) ? (iQie - i20) / 2 : (iQie - i20) - measureScope.How(BottomSheetScaffoldKt.f21486n);
                                float fL = measureScope.l(f4);
                                int i23 = height7;
                                int iHow2 = fL < ((float) (i23 / 2)) ? (iRoundToInt - i23) - measureScope.How(BottomSheetScaffoldKt.f21486n) : iRoundToInt - (i23 / 2);
                                int i24 = (iQie - width6) / 2;
                                int i25 = WhenMappings.$EnumSwitchMapping$0[bottomSheetState2.nr().ordinal()];
                                if (i25 == 1) {
                                    i21 = iHow2 - i18;
                                } else {
                                    if (i25 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i21 = iGh - i18;
                                }
                                int i26 = i21;
                                List list7 = arrayList3;
                                int i27 = height4;
                                int size6 = list7.size();
                                for (int i28 = 0; i28 < size6; i28++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list7.get(i28), 0, i27, 0.0f, 4, null);
                                }
                                List list8 = arrayList2;
                                int size7 = list8.size();
                                for (int i29 = 0; i29 < size7; i29++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list8.get(i29), 0, 0, 0.0f, 4, null);
                                }
                                List list9 = arrayList;
                                int size8 = list9.size();
                                for (int i30 = 0; i30 < size8; i30++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list9.get(i30), 0, 0, 0.0f, 4, null);
                                }
                                List list10 = arrayList4;
                                int size9 = list10.size();
                                for (int i31 = 0; i31 < size9; i31++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list10.get(i31), iHow, iHow2, 0.0f, 4, null);
                                }
                                List list11 = arrayList5;
                                int size10 = list11.size();
                                for (int i32 = 0; i32 < size10; i32++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list11.get(i32), i24, i26, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerKN.o(objIF);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objIF;
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2 function2Rl = LayoutKt.rl(listListOf);
            boolean zP5 = composerKN.p5(multiContentMeasurePolicy);
            Object objIF2 = composerKN.iF();
            if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = MultiContentMeasurePolicyKt.n(multiContentMeasurePolicy);
                composerKN.o(objIF2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF2;
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
            Function2 function2Rl2 = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl2);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            function2Rl.invoke(composerKN, 0);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2
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
                    BottomSheetScaffoldKt.t(function2, function22, function23, function24, function25, f3, function0, i2, bottomSheetState, composer2, RecomposeScopeImplKt.n(i3 | 1));
                }
            });
        }
    }
}
