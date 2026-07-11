package androidx.compose.material3;

import GJW.vd;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u008a\u0002\u0010\u001f\u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u000f2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010$\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0019H\u0007¢\u0006\u0004\b$\u0010%\u001a9\u0010*\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00160\u00002\b\b\u0002\u0010)\u001a\u00020\u0016H\u0007¢\u0006\u0004\b*\u0010+\u001a\u008d\u0001\u00102\u001a\u00020\u00022\u0006\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u008e\u0001\u00109\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014¢\u0006\u0002\b\u00032\u0011\u00104\u001a\r\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0002\b\u00032\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0002\b\u00032\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0002\b\u00032\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00142\u0006\u00108\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0003ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/BottomSheetScaffoldState;", "scaffoldState", "Landroidx/compose/ui/unit/Dp;", "sheetPeekHeight", "sheetMaxWidth", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/graphics/Color;", "sheetContainerColor", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "Lkotlin/Function0;", "sheetDragHandle", "", "sheetSwipeEnabled", "topBar", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHost", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "snackbarHostState", "J2", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "Landroidx/compose/material3/SheetValue;", "initialValue", "confirmValueChange", "skipHiddenState", "Uo", "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "state", "peekHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "t", "(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "body", "bottomSheet", "", "sheetOffset", "sheetState", "rl", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,410:1\n148#2:411\n1223#3,6:412\n1223#3,6:418\n1223#3,6:424\n1223#3,3:435\n1226#3,3:441\n1223#3,6:447\n1223#3,6:453\n1223#3,6:459\n1223#3,6:473\n488#4:430\n487#4,4:431\n491#4,2:438\n495#4:444\n487#5:440\n77#6:445\n1#7:446\n170#8:465\n168#8,7:466\n78#8,6:479\n85#8,4:494\n89#8,2:504\n93#8:509\n176#8:510\n368#9,9:485\n377#9,3:506\n4032#10,6:498\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n119#1:411\n134#1:412,6\n180#1:418,6\n182#1:424,6\n226#1:435,3\n226#1:441,3\n232#1:447,6\n249#1:453,6\n371#1:459,6\n356#1:473,6\n226#1:430\n226#1:431,4\n226#1:438,2\n226#1:444\n226#1:440\n228#1:445\n356#1:465\n356#1:466,7\n356#1:479,6\n356#1:494,4\n356#1:504,2\n356#1:509\n356#1:510\n356#1:485,9\n356#1:506,3\n356#1:498,6\n*E\n"})
public final class BottomSheetScaffoldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final Function3 function3, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, float f3, float f4, Shape shape, long j2, long j3, float f5, float f6, Function2 function2, boolean z2, Function2 function22, Function3 function32, long j4, long j5, final Function3 function33, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        int i8;
        int i9;
        float fJ2;
        Shape shapeNr;
        long jRl;
        int i10;
        float fKN;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Function2 function23;
        int i19;
        int i20;
        final BottomSheetScaffoldState bottomSheetScaffoldStateJ2;
        final float fUo;
        long jT2;
        Function2 function2N;
        boolean z3;
        final Function3 function3Rl;
        float f7;
        long surface;
        long j6;
        int i21;
        Modifier modifier2;
        float f8;
        long jT3;
        final float f9;
        boolean z4;
        Object objIF;
        Composer composer2;
        final long j7;
        final BottomSheetScaffoldState bottomSheetScaffoldState3;
        final float f10;
        final Function2 function24;
        final boolean z5;
        final Modifier modifier3;
        final Function3 function34;
        final float f11;
        final long j9;
        final float f12;
        final float f13;
        final Function2 function25;
        final Shape shape2;
        final long j10;
        final long j11;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1523924135);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(function3) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        int i22 = i5 & 2;
        if (i22 != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i7 |= composerKN.p5(modifier) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i5 & 4) == 0) {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    int i23 = composerKN.p5(bottomSheetScaffoldState2) ? 256 : 128;
                    i7 |= i23;
                } else {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                }
                i7 |= i23;
            } else {
                bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i7 |= composerKN.rl(f3) ? 2048 : 1024;
                }
                i9 = i5 & 16;
                int i24 = 8192;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        fJ2 = f4;
                        i7 |= composerKN.rl(fJ2) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) != 0) {
                        shapeNr = shape;
                        i7 |= ((i5 & 32) == 0 && composerKN.p5(shapeNr)) ? 131072 : 65536;
                    } else {
                        shapeNr = shape;
                    }
                    if ((i2 & 1572864) != 0) {
                        jRl = j2;
                        i7 |= ((i5 & 64) == 0 && composerKN.nr(jRl)) ? 1048576 : 524288;
                    } else {
                        jRl = j2;
                    }
                    if ((i2 & 12582912) == 0) {
                        i7 |= ((i5 & 128) == 0 && composerKN.nr(j3)) ? 8388608 : 4194304;
                    }
                    i10 = i5 & 256;
                    if (i10 == 0) {
                        i7 |= 100663296;
                        fKN = f5;
                    } else {
                        fKN = f5;
                        if ((i2 & 100663296) == 0) {
                            i7 |= composerKN.rl(fKN) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                    }
                    i11 = i5 & 512;
                    if (i11 == 0) {
                        i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    } else {
                        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i12 = i11;
                            i7 |= composerKN.rl(f6) ? 536870912 : 268435456;
                        }
                        i13 = i5 & 1024;
                        if (i13 != 0) {
                            i15 = i3 | 6;
                            i14 = i13;
                        } else if ((i3 & 6) == 0) {
                            i14 = i13;
                            i15 = i3 | (composerKN.E2(function2) ? 4 : 2);
                        } else {
                            i14 = i13;
                            i15 = i3;
                        }
                        i16 = i5 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i3 & 48) == 0) {
                            i17 = i16;
                            i15 |= composerKN.n(z2) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i25 = i15;
                        i18 = i5 & 4096;
                        if (i18 != 0) {
                            i25 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                function23 = function22;
                                i25 |= composerKN.E2(function23) ? 256 : 128;
                            }
                            i19 = i5 & 8192;
                            if (i19 != 0) {
                                i20 = i25;
                                if ((i3 & 3072) == 0) {
                                    i20 |= composerKN.E2(function32) ? 2048 : 1024;
                                }
                                if ((i3 & 24576) == 0) {
                                    if ((i5 & 16384) == 0 && composerKN.nr(j4)) {
                                        i24 = 16384;
                                    }
                                    i20 |= i24;
                                }
                                if ((i3 & 196608) == 0) {
                                    i20 |= ((i5 & 32768) == 0 && composerKN.nr(j5)) ? 131072 : 65536;
                                }
                                if ((i5 & 65536) != 0) {
                                    i20 |= 1572864;
                                } else if ((i3 & 1572864) == 0) {
                                    i20 |= composerKN.E2(function33) ? 1048576 : 524288;
                                }
                                if ((i7 & 306783379) == 306783378 && (i20 & 599187) == 599186 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    modifier3 = modifier;
                                    z5 = z2;
                                    function34 = function32;
                                    j7 = j4;
                                    j11 = j5;
                                    composer2 = composerKN;
                                    f11 = fJ2;
                                    j9 = jRl;
                                    bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                    f12 = fKN;
                                    f10 = f3;
                                    f13 = f6;
                                    function24 = function2;
                                    function25 = function23;
                                    shape2 = shapeNr;
                                    j10 = j3;
                                } else {
                                    composerKN.e();
                                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                                        Modifier modifier4 = i22 == 0 ? Modifier.INSTANCE : modifier;
                                        if ((i5 & 4) == 0) {
                                            bottomSheetScaffoldStateJ2 = J2(null, null, composerKN, 0, 3);
                                            i7 &= -897;
                                        } else {
                                            bottomSheetScaffoldStateJ2 = bottomSheetScaffoldState2;
                                        }
                                        fUo = i8 == 0 ? BottomSheetDefaults.f24481n.Uo() : f3;
                                        if (i9 != 0) {
                                            fJ2 = BottomSheetDefaults.f24481n.J2();
                                        }
                                        if ((i5 & 32) != 0) {
                                            shapeNr = BottomSheetDefaults.f24481n.nr(composerKN, 6);
                                            i7 &= -458753;
                                        }
                                        if ((i5 & 64) != 0) {
                                            jRl = BottomSheetDefaults.f24481n.rl(composerKN, 6);
                                            i7 &= -3670017;
                                        }
                                        if ((i5 & 128) == 0) {
                                            jT2 = ColorSchemeKt.t(jRl, composerKN, (i7 >> 18) & 14);
                                            i7 = (-29360129) & i7;
                                        } else {
                                            jT2 = j3;
                                        }
                                        if (i10 != 0) {
                                            fKN = Dp.KN(0);
                                        }
                                        float fT = i12 == 0 ? BottomSheetDefaults.f24481n.t() : f6;
                                        function2N = i14 == 0 ? ComposableSingletons$BottomSheetScaffoldKt.f25066n.n() : function2;
                                        z3 = i17 == 0 ? true : z2;
                                        if (i18 != 0) {
                                            function23 = null;
                                        }
                                        function3Rl = i19 == 0 ? ComposableSingletons$BottomSheetScaffoldKt.f25066n.rl() : function32;
                                        Modifier modifier5 = modifier4;
                                        if ((i5 & 16384) == 0) {
                                            f7 = fT;
                                            surface = MaterialTheme.f26164n.n(composerKN, 6).getSurface();
                                            i20 &= -57345;
                                        } else {
                                            f7 = fT;
                                            surface = j4;
                                        }
                                        if ((i5 & 32768) == 0) {
                                            i21 = i20 & (-458753);
                                            jT3 = ColorSchemeKt.t(surface, composerKN, (i20 >> 12) & 14);
                                            j6 = surface;
                                            modifier2 = modifier5;
                                            f8 = f7;
                                            composerKN.S();
                                            Modifier modifier6 = modifier2;
                                            if (ComposerKt.v()) {
                                                f9 = f8;
                                            } else {
                                                f9 = f8;
                                                ComposerKt.p5(-1523924135, i7, i21, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:127)");
                                            }
                                            SheetState bottomSheetState = bottomSheetScaffoldStateJ2.getBottomSheetState();
                                            int i26 = i21;
                                            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-459880832, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i27) {
                                                    if ((i27 & 3) == 2 && composer3.xMQ()) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-459880832, i27, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:131)");
                                                    }
                                                    function33.invoke(PaddingKt.O(0.0f, 0.0f, 0.0f, fUo, 7, null), composer3, 0);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composerKN, 54);
                                            final float f14 = fJ2;
                                            final BottomSheetScaffoldState bottomSheetScaffoldState4 = bottomSheetScaffoldStateJ2;
                                            final Shape shape3 = shapeNr;
                                            final long j12 = jRl;
                                            final float f15 = fUo;
                                            final Function2 function26 = function2N;
                                            final float f16 = fKN;
                                            final boolean z6 = z3;
                                            final long j13 = jT2;
                                            float f17 = f9;
                                            ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(1961872927, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i27) {
                                                    if ((i27 & 3) == 2 && composer3.xMQ()) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(1961872927, i27, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:138)");
                                                    }
                                                    BottomSheetScaffoldKt.t(bottomSheetScaffoldState4.getBottomSheetState(), f15, f14, z6, shape3, j12, j13, f16, f9, function26, function3, composer3, 0, 0);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composerKN, 54);
                                            ComposableLambda composableLambdaNr3 = ComposableLambdaKt.nr(88659390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i27) {
                                                    if ((i27 & 3) == 2 && composer3.xMQ()) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(88659390, i27, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:132)");
                                                    }
                                                    function3Rl.invoke(bottomSheetScaffoldStateJ2.getSnackbarHostState(), composer3, 0);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composerKN, 54);
                                            z4 = (((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256 && composerKN.p5(bottomSheetScaffoldStateJ2)) || (i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256;
                                            objIF = composerKN.iF();
                                            if (z4 || objIF == Composer.INSTANCE.n()) {
                                                objIF = new Function0<Float>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$4$1
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                    public final Float invoke() {
                                                        return Float.valueOf(bottomSheetScaffoldStateJ2.getBottomSheetState().ty());
                                                    }
                                                };
                                                composerKN.o(objIF);
                                            }
                                            int i27 = i26 << 9;
                                            long j14 = j6;
                                            long j15 = jT3;
                                            rl(modifier6, function23, composableLambdaNr, composableLambdaNr2, composableLambdaNr3, (Function0) objIF, bottomSheetState, j14, j15, composerKN, ((i7 >> 3) & 14) | 28032 | ((i26 >> 3) & 112) | (29360128 & i27) | (i27 & 234881024));
                                            composer2 = composerKN;
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            j7 = j14;
                                            bottomSheetScaffoldState3 = bottomSheetScaffoldStateJ2;
                                            f10 = fUo;
                                            function24 = function2N;
                                            z5 = z3;
                                            modifier3 = modifier6;
                                            function34 = function3Rl;
                                            f11 = fJ2;
                                            j9 = jRl;
                                            f12 = fKN;
                                            f13 = f17;
                                            function25 = function23;
                                            shape2 = shapeNr;
                                            j10 = jT2;
                                            j11 = j15;
                                        } else {
                                            j6 = surface;
                                            i21 = i20;
                                            modifier2 = modifier5;
                                            f8 = f7;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        if ((i5 & 4) != 0) {
                                            i7 &= -897;
                                        }
                                        if ((i5 & 32) != 0) {
                                            i7 &= -458753;
                                        }
                                        if ((i5 & 64) != 0) {
                                            i7 &= -3670017;
                                        }
                                        if ((i5 & 128) != 0) {
                                            i7 &= -29360129;
                                        }
                                        if ((i5 & 16384) != 0) {
                                            i20 &= -57345;
                                        }
                                        if ((i5 & 32768) != 0) {
                                            i20 &= -458753;
                                        }
                                        modifier2 = modifier;
                                        jT2 = j3;
                                        f8 = f6;
                                        function2N = function2;
                                        z3 = z2;
                                        function3Rl = function32;
                                        j6 = j4;
                                        bottomSheetScaffoldStateJ2 = bottomSheetScaffoldState2;
                                        i21 = i20;
                                        fUo = f3;
                                    }
                                    jT3 = j5;
                                    composerKN.S();
                                    Modifier modifier62 = modifier2;
                                    if (ComposerKt.v()) {
                                    }
                                    SheetState bottomSheetState2 = bottomSheetScaffoldStateJ2.getBottomSheetState();
                                    int i262 = i21;
                                    ComposableLambda composableLambdaNr4 = ComposableLambdaKt.nr(-459880832, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i272) {
                                            if ((i272 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-459880832, i272, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:131)");
                                            }
                                            function33.invoke(PaddingKt.O(0.0f, 0.0f, 0.0f, fUo, 7, null), composer3, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                    final float f142 = fJ2;
                                    final BottomSheetScaffoldState bottomSheetScaffoldState42 = bottomSheetScaffoldStateJ2;
                                    final Shape shape32 = shapeNr;
                                    final long j122 = jRl;
                                    final float f152 = fUo;
                                    final Function2 function262 = function2N;
                                    final float f162 = fKN;
                                    final boolean z62 = z3;
                                    final long j132 = jT2;
                                    float f172 = f9;
                                    ComposableLambda composableLambdaNr22 = ComposableLambdaKt.nr(1961872927, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i272) {
                                            if ((i272 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1961872927, i272, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:138)");
                                            }
                                            BottomSheetScaffoldKt.t(bottomSheetScaffoldState42.getBottomSheetState(), f152, f142, z62, shape32, j122, j132, f162, f9, function262, function3, composer3, 0, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                    ComposableLambda composableLambdaNr32 = ComposableLambdaKt.nr(88659390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i272) {
                                            if ((i272 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(88659390, i272, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:132)");
                                            }
                                            function3Rl.invoke(bottomSheetScaffoldStateJ2.getSnackbarHostState(), composer3, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                    if (((i7 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
                                        objIF = composerKN.iF();
                                        if (z4) {
                                            objIF = new Function0<Float>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$4$1
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final Float invoke() {
                                                    return Float.valueOf(bottomSheetScaffoldStateJ2.getBottomSheetState().ty());
                                                }
                                            };
                                            composerKN.o(objIF);
                                            int i272 = i262 << 9;
                                            long j142 = j6;
                                            long j152 = jT3;
                                            rl(modifier62, function23, composableLambdaNr4, composableLambdaNr22, composableLambdaNr32, (Function0) objIF, bottomSheetState2, j142, j152, composerKN, ((i7 >> 3) & 14) | 28032 | ((i262 >> 3) & 112) | (29360128 & i272) | (i272 & 234881024));
                                            composer2 = composerKN;
                                            if (ComposerKt.v()) {
                                            }
                                            j7 = j142;
                                            bottomSheetScaffoldState3 = bottomSheetScaffoldStateJ2;
                                            f10 = fUo;
                                            function24 = function2N;
                                            z5 = z3;
                                            modifier3 = modifier62;
                                            function34 = function3Rl;
                                            f11 = fJ2;
                                            j9 = jRl;
                                            f12 = fKN;
                                            f13 = f172;
                                            function25 = function23;
                                            shape2 = shapeNr;
                                            j10 = jT2;
                                            j11 = j152;
                                        }
                                    } else {
                                        objIF = composerKN.iF();
                                        if (z4) {
                                        }
                                    }
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i28) {
                                            BottomSheetScaffoldKt.n(function3, modifier3, bottomSheetScaffoldState3, f10, f11, shape2, j9, j10, f12, f13, function24, z5, function25, function34, j7, j11, function33, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i20 = i25 | 3072;
                            if ((i3 & 24576) == 0) {
                            }
                            if ((i3 & 196608) == 0) {
                            }
                            if ((i5 & 65536) != 0) {
                            }
                            if ((i7 & 306783379) == 306783378) {
                                composerKN.e();
                                if ((i2 & 1) != 0) {
                                    if (i22 == 0) {
                                    }
                                    if ((i5 & 4) == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if ((i5 & 32) != 0) {
                                    }
                                    if ((i5 & 64) != 0) {
                                    }
                                    if ((i5 & 128) == 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i18 != 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    Modifier modifier52 = modifier4;
                                    if ((i5 & 16384) == 0) {
                                    }
                                    if ((i5 & 32768) == 0) {
                                    }
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        function23 = function22;
                        i19 = i5 & 8192;
                        if (i19 != 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & 196608) == 0) {
                        }
                        if ((i5 & 65536) != 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i12 = i11;
                    i13 = i5 & 1024;
                    if (i13 != 0) {
                    }
                    i16 = i5 & 2048;
                    if (i16 != 0) {
                    }
                    int i252 = i15;
                    i18 = i5 & 4096;
                    if (i18 != 0) {
                    }
                    function23 = function22;
                    i19 = i5 & 8192;
                    if (i19 != 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & 196608) == 0) {
                    }
                    if ((i5 & 65536) != 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                fJ2 = f4;
                if ((i2 & 196608) != 0) {
                }
                if ((i2 & 1572864) != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i10 = i5 & 256;
                if (i10 == 0) {
                }
                i11 = i5 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i5 & 1024;
                if (i13 != 0) {
                }
                i16 = i5 & 2048;
                if (i16 != 0) {
                }
                int i2522 = i15;
                i18 = i5 & 4096;
                if (i18 != 0) {
                }
                function23 = function22;
                i19 = i5 & 8192;
                if (i19 != 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & 196608) == 0) {
                }
                if ((i5 & 65536) != 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i9 = i5 & 16;
            int i242 = 8192;
            if (i9 != 0) {
            }
            fJ2 = f4;
            if ((i2 & 196608) != 0) {
            }
            if ((i2 & 1572864) != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i10 = i5 & 256;
            if (i10 == 0) {
            }
            i11 = i5 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i5 & 1024;
            if (i13 != 0) {
            }
            i16 = i5 & 2048;
            if (i16 != 0) {
            }
            int i25222 = i15;
            i18 = i5 & 4096;
            if (i18 != 0) {
            }
            function23 = function22;
            i19 = i5 & 8192;
            if (i19 != 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & 196608) == 0) {
            }
            if ((i5 & 65536) != 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        int i2422 = 8192;
        if (i9 != 0) {
        }
        fJ2 = f4;
        if ((i2 & 196608) != 0) {
        }
        if ((i2 & 1572864) != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i10 = i5 & 256;
        if (i10 == 0) {
        }
        i11 = i5 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i5 & 1024;
        if (i13 != 0) {
        }
        i16 = i5 & 2048;
        if (i16 != 0) {
        }
        int i252222 = i15;
        i18 = i5 & 4096;
        if (i18 != 0) {
        }
        function23 = function22;
        i19 = i5 & 8192;
        if (i19 != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        if ((i5 & 65536) != 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final BottomSheetScaffoldState J2(SheetState sheetState, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        Composer composer2;
        if ((i3 & 1) != 0) {
            composer2 = composer;
            sheetState = Uo(null, null, false, composer2, 0, 7);
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
            ComposerKt.p5(-1474606134, i2, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:180)");
        }
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer2.p5(sheetState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer2.p5(snackbarHostState)) || (i2 & 48) == 32);
        Object objIF2 = composer2.iF();
        if (z2 || objIF2 == Composer.INSTANCE.n()) {
            objIF2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer2.o(objIF2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objIF2;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return bottomSheetScaffoldState;
    }

    public static final SheetState Uo(SheetValue sheetValue, Function1 function1, boolean z2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i3 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$rememberStandardBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(SheetValue sheetValue3) {
                    return Boolean.TRUE;
                }
            };
        }
        Function1 function12 = function1;
        if ((i3 & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(678511581, i2, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:204)");
        }
        SheetState sheetStateNr = SheetDefaultsKt.nr(false, function12, sheetValue2, z3, composer, (i2 & 112) | ((i2 << 6) & 896) | ((i2 << 3) & 7168), 1);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return sheetStateNr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final Modifier modifier, final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final Function0 function0, final SheetState sheetState, final long j2, final long j3, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-1651214892);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function22) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function23) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function24) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.p5(sheetState) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.nr(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.nr(j3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1651214892, i3, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:354)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function2 == null ? ComposableSingletons$BottomSheetScaffoldKt.f25066n.t() : function2, ComposableLambdaKt.nr(398963586, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1
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
                    if ((i5 & 3) == 2 && composer2.xMQ()) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(398963586, i5, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous> (BottomSheetScaffold.kt:360)");
                    }
                    SurfaceKt.n(modifier, null, j2, j3, 0.0f, 0.0f, null, function22, composer2, 0, 114);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), function23, function24});
            boolean z2 = ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072);
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j4) {
                        Integer numValueOf;
                        List list2 = (List) list.get(0);
                        int i5 = 1;
                        List list3 = (List) list.get(1);
                        List list4 = (List) list.get(2);
                        List list5 = (List) list.get(3);
                        final int iQie = Constraints.qie(j4);
                        final int iGh = Constraints.gh(j4);
                        long jNr = Constraints.nr(j4, 0, 0, 0, 0, 10, null);
                        final ArrayList arrayList = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            arrayList.add(((Measurable) list4.get(i7)).dR0(jNr));
                        }
                        final ArrayList arrayList2 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            arrayList2.add(((Measurable) list2.get(i8)).dR0(jNr));
                        }
                        if (arrayList2.isEmpty()) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
                            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex) {
                                while (true) {
                                    Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList2.get(i5)).getHeight());
                                    if (numValueOf2.compareTo(numValueOf) > 0) {
                                        numValueOf = numValueOf2;
                                    }
                                    if (i5 == lastIndex) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        long jNr2 = Constraints.nr(jNr, 0, 0, 0, iGh - iIntValue, 7, null);
                        final ArrayList arrayList3 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i9 = 0; i9 < size3; i9++) {
                            arrayList3.add(((Measurable) list3.get(i9)).dR0(jNr2));
                        }
                        final ArrayList arrayList4 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int i10 = 0; i10 < size4; i10++) {
                            arrayList4.add(((Measurable) list5.get(i10)).dR0(jNr));
                        }
                        final SheetState sheetState2 = sheetState;
                        final Function0 function02 = function0;
                        return MeasureScope.ER(measureScope, iQie, iGh, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1.1

                            /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$WhenMappings */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[SheetValue.values().length];
                                    try {
                                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[SheetValue.Expanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[SheetValue.Hidden.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
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
                                Integer numValueOf3;
                                Integer numValueOf4;
                                int iRoundToInt;
                                List list6 = arrayList;
                                Integer numValueOf5 = null;
                                if (list6.isEmpty()) {
                                    numValueOf3 = null;
                                } else {
                                    numValueOf3 = Integer.valueOf(((Placeable) list6.get(0)).getWidth());
                                    int lastIndex2 = CollectionsKt.getLastIndex(list6);
                                    if (1 <= lastIndex2) {
                                        int i11 = 1;
                                        while (true) {
                                            Integer numValueOf6 = Integer.valueOf(((Placeable) list6.get(i11)).getWidth());
                                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                                numValueOf3 = numValueOf6;
                                            }
                                            if (i11 == lastIndex2) {
                                                break;
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                int iMax = Integer.max(0, (iQie - (numValueOf3 != null ? numValueOf3.intValue() : 0)) / 2);
                                List list7 = arrayList4;
                                if (list7.isEmpty()) {
                                    numValueOf4 = null;
                                } else {
                                    numValueOf4 = Integer.valueOf(((Placeable) list7.get(0)).getWidth());
                                    int lastIndex3 = CollectionsKt.getLastIndex(list7);
                                    if (1 <= lastIndex3) {
                                        int i12 = 1;
                                        while (true) {
                                            Integer numValueOf7 = Integer.valueOf(((Placeable) list7.get(i12)).getWidth());
                                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                                numValueOf4 = numValueOf7;
                                            }
                                            if (i12 == lastIndex3) {
                                                break;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                }
                                int iIntValue2 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                                List list8 = arrayList4;
                                if (!list8.isEmpty()) {
                                    numValueOf5 = Integer.valueOf(((Placeable) list8.get(0)).getHeight());
                                    int lastIndex4 = CollectionsKt.getLastIndex(list8);
                                    if (1 <= lastIndex4) {
                                        int i13 = 1;
                                        while (true) {
                                            Integer numValueOf8 = Integer.valueOf(((Placeable) list8.get(i13)).getHeight());
                                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                                numValueOf5 = numValueOf8;
                                            }
                                            if (i13 == lastIndex4) {
                                                break;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                }
                                int iIntValue3 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                                int i14 = (iQie - iIntValue2) / 2;
                                int i15 = WhenMappings.$EnumSwitchMapping$0[sheetState2.O().ordinal()];
                                if (i15 == 1) {
                                    iRoundToInt = MathKt.roundToInt(((Number) function02.invoke()).floatValue());
                                } else {
                                    if (i15 != 2 && i15 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    iRoundToInt = iGh;
                                }
                                int i16 = iRoundToInt - iIntValue3;
                                List list9 = arrayList3;
                                int i17 = iIntValue;
                                int size5 = list9.size();
                                for (int i18 = 0; i18 < size5; i18++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list9.get(i18), 0, i17, 0.0f, 4, null);
                                }
                                List list10 = arrayList2;
                                int size6 = list10.size();
                                for (int i19 = 0; i19 < size6; i19++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list10.get(i19), 0, 0, 0.0f, 4, null);
                                }
                                List list11 = arrayList;
                                int size7 = list11.size();
                                for (int i20 = 0; i20 < size7; i20++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list11.get(i20), iMax, 0, 0.0f, 4, null);
                                }
                                List list12 = arrayList4;
                                int size8 = list12.size();
                                for (int i21 = 0; i21 < size8; i21++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list12.get(i21), i14, i16, 0.0f, 4, null);
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
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3
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
                    BottomSheetScaffoldKt.rl(modifier, function2, function22, function23, function24, function0, sheetState, j2, j3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final SheetState sheetState, final float f3, final float f4, final boolean z2, final Shape shape, final long j2, final long j3, final float f5, final float f6, final Function2 function2, final Function3 function3, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        vd vdVar;
        int i8;
        Object obj;
        Modifier modifierRl;
        Composer composer2;
        Composer composerKN = composer.KN(721467526);
        if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(sheetState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.rl(f4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerKN.n(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerKN.p5(shape) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= composerKN.nr(j2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= composerKN.nr(j3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= composerKN.rl(f5) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= composerKN.rl(f6) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= composerKN.E2(function2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.E2(function3) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i5 & 306783379) == 306783378 && (i7 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(721467526, i5, i7, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:224)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN));
                composerKN.o(compositionScopedCoroutineScopeCanceller);
                objIF = compositionScopedCoroutineScopeCanceller;
            }
            final vd coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objIF).getCoroutineScope();
            Orientation orientation = Orientation.f16969n;
            final float fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(f3);
            composerKN.eF(-1831611516);
            if (z2) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zP5 = composerKN.p5(sheetState.getAnchoredDraggableState());
                Object objIF2 = composerKN.iF();
                if (zP5) {
                    i8 = i5;
                } else {
                    i8 = i5;
                    if (objIF2 == companion.n()) {
                    }
                    vdVar = coroutineScope;
                    obj = null;
                    modifierRl = NestedScrollModifierKt.rl(companion2, (NestedScrollConnection) objIF2, null, 2, null);
                }
                objIF2 = SheetDefaultsKt.n(sheetState, orientation, new Function1<Float, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1

                    /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ float f24580O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        int f24581n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SheetState f24582t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(SheetState sheetState, float f3, Continuation continuation) {
                            super(2, continuation);
                            this.f24582t = sheetState;
                            this.f24580O = f3;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.f24582t, this.f24580O, continuation);
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
                            int i2 = this.f24581n;
                            if (i2 != 0) {
                                if (i2 == 1) {
                                    ResultKt.throwOnFailure(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj);
                                SheetState sheetState = this.f24582t;
                                float f3 = this.f24580O;
                                this.f24581n = 1;
                                if (sheetState.HI(f3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
                        n(f7.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(float f7) {
                        GJW.C.nr(coroutineScope, null, null, new AnonymousClass1(sheetState, f7, null), 3, null);
                    }
                });
                composerKN.o(objIF2);
                vdVar = coroutineScope;
                obj = null;
                modifierRl = NestedScrollModifierKt.rl(companion2, (NestedScrollConnection) objIF2, null, 2, null);
            } else {
                vdVar = coroutineScope;
                i8 = i5;
                obj = null;
                modifierRl = Modifier.INSTANCE;
            }
            composerKN.Xw();
            Modifier modifierZmq = SizeKt.ty(SizeKt.KN(SizeKt.g(Modifier.INSTANCE, 0.0f, f4, 1, obj), 0.0f, 1, obj), f3, 0.0f, 2, obj).Zmq(modifierRl);
            AnchoredDraggableState anchoredDraggableState = sheetState.getAnchoredDraggableState();
            boolean zRl = ((i8 & 14) == 4) | composerKN.rl(fL);
            Object objIF3 = composerKN.iF();
            if (zRl || objIF3 == companion.n()) {
                objIF3 = new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1

                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[SheetValue.Hidden.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[SheetValue.Expanded.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                        return n(intSize.getPackedValue(), constraints.getValue());
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[PHI: r4
                      0x003c: PHI (r4v6 androidx.compose.material3.SheetValue) = 
                      (r4v5 androidx.compose.material3.SheetValue)
                      (r4v7 androidx.compose.material3.SheetValue)
                      (r4v8 androidx.compose.material3.SheetValue)
                      (r4v9 androidx.compose.material3.SheetValue)
                      (r4v10 androidx.compose.material3.SheetValue)
                      (r4v11 androidx.compose.material3.SheetValue)
                      (r4v12 androidx.compose.material3.SheetValue)
                     binds: [B:29:0x0077, B:20:0x005c, B:23:0x0065, B:26:0x006e, B:9:0x003a, B:12:0x0044, B:15:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Pair n(long j4, long j5) {
                        SheetValue sheetValue;
                        final float fGh = Constraints.gh(j5);
                        final float fJ2 = IntSize.J2(j4);
                        final SheetState sheetState2 = sheetState;
                        final float f7 = fL;
                        DraggableAnchors draggableAnchorsN = AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                n(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                if (!sheetState2.getSkipPartiallyExpanded()) {
                                    draggableAnchorsConfig.n(SheetValue.PartiallyExpanded, fGh - f7);
                                }
                                float f8 = fJ2;
                                if (f8 != f7) {
                                    draggableAnchorsConfig.n(SheetValue.Expanded, Math.max(fGh - f8, 0.0f));
                                }
                                if (sheetState2.getSkipHiddenState()) {
                                    return;
                                }
                                draggableAnchorsConfig.n(SheetValue.Hidden, fGh);
                            }
                        });
                        SheetValue sheetValue2 = (SheetValue) sheetState.getAnchoredDraggableState().aYN();
                        int i9 = WhenMappings.$EnumSwitchMapping$0[sheetValue2.ordinal()];
                        if (i9 != 1) {
                            if (i9 != 2) {
                                if (i9 == 3) {
                                    sheetValue = SheetValue.Expanded;
                                    if (draggableAnchorsN.nr(sheetValue)) {
                                        sheetValue2 = sheetValue;
                                    } else {
                                        sheetValue = SheetValue.PartiallyExpanded;
                                        if (!draggableAnchorsN.nr(sheetValue)) {
                                            sheetValue = SheetValue.Hidden;
                                            if (draggableAnchorsN.nr(sheetValue)) {
                                            }
                                        }
                                    }
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                sheetValue = SheetValue.PartiallyExpanded;
                                if (!draggableAnchorsN.nr(sheetValue)) {
                                    sheetValue = SheetValue.Expanded;
                                    if (!draggableAnchorsN.nr(sheetValue)) {
                                        sheetValue = SheetValue.Hidden;
                                        if (draggableAnchorsN.nr(sheetValue)) {
                                        }
                                    }
                                }
                            }
                        } else {
                            sheetValue = SheetValue.Hidden;
                            if (draggableAnchorsN.nr(sheetValue)) {
                            }
                        }
                        return TuplesKt.to(draggableAnchorsN, sheetValue2);
                    }
                };
                composerKN.o(objIF3);
            }
            final vd vdVar2 = vdVar;
            int i9 = i8 >> 9;
            composer2 = composerKN;
            SurfaceKt.n(AnchoredDraggableKt.O(AnchoredDraggableKt.KN(modifierZmq, anchoredDraggableState, orientation, (Function2) objIF3), sheetState.getAnchoredDraggableState(), orientation, z2, false, null, 24, null), shape, j2, j3, f5, f6, null, ComposableLambdaKt.nr(390720907, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2
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
                    if ((i10 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(390720907, i10, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:295)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierKN = SizeKt.KN(companion3, 0.0f, 1, null);
                    Function2 function22 = function2;
                    final SheetState sheetState2 = sheetState;
                    final boolean z3 = z2;
                    final vd vdVar3 = vdVar2;
                    Function3 function32 = function3;
                    Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion4.gh(), composer3, 0);
                    int iN = ComposablesKt.n(composer3, 0);
                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion5.n();
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
                    Updater.O(composerN, measurePolicyN, companion5.t());
                    Updater.O(composerN, compositionLocalMapIk, companion5.O());
                    Function2 function2Rl = companion5.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion5.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    composer3.eF(-1168080147);
                    if (function22 != null) {
                        Strings.Companion companion6 = Strings.INSTANCE;
                        final String strN = Strings_androidKt.n(Strings.n(R.string.f27135n), composer3, 0);
                        final String strN2 = Strings_androidKt.n(Strings.n(R.string.rl), composer3, 0);
                        final String strN3 = Strings_androidKt.n(Strings.n(R.string.nr), composer3, 0);
                        Modifier modifierT = columnScopeInstance.t(companion3, companion4.Uo());
                        boolean zP52 = composer3.p5(sheetState2) | composer3.n(z3) | composer3.p5(strN3) | composer3.E2(vdVar3) | composer3.p5(strN) | composer3.p5(strN2);
                        Object objIF4 = composer3.iF();
                        if (zP52 || objIF4 == Composer.INSTANCE.n()) {
                            objIF4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1
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
                                    final SheetState sheetState3 = sheetState2;
                                    boolean z4 = z3;
                                    String str = strN3;
                                    String str2 = strN;
                                    String str3 = strN2;
                                    final vd vdVar4 = vdVar3;
                                    if (sheetState3.getAnchoredDraggableState().HI().getSize() <= 1 || !z4) {
                                        return;
                                    }
                                    SheetValue sheetValueO = sheetState3.O();
                                    SheetValue sheetValue = SheetValue.PartiallyExpanded;
                                    if (sheetValueO == sheetValue) {
                                        if (((Boolean) sheetState3.getAnchoredDraggableState().getConfirmValueChange().invoke(SheetValue.Expanded)).booleanValue()) {
                                            SemanticsPropertiesKt.ck(semanticsPropertyReceiver, str, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1

                                                /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1, reason: invalid class name */
                                                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                                @DebugMetadata(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE}, m = "invokeSuspend", n = {}, s = {})
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                    int f24557n;

                                                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                    final /* synthetic */ SheetState f24558t;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                                        super(2, continuation);
                                                        this.f24558t = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation create(Object obj, Continuation continuation) {
                                                        return new AnonymousClass1(this.f24558t, continuation);
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
                                                        int i2 = this.f24557n;
                                                        if (i2 != 0) {
                                                            if (i2 == 1) {
                                                                ResultKt.throwOnFailure(obj);
                                                            } else {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                        } else {
                                                            ResultKt.throwOnFailure(obj);
                                                            SheetState sheetState = this.f24558t;
                                                            this.f24557n = 1;
                                                            if (sheetState.t(this) == coroutine_suspended) {
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
                                                    GJW.C.nr(vdVar4, null, null, new AnonymousClass1(sheetState3, null), 3, null);
                                                    return Boolean.TRUE;
                                                }
                                            });
                                        }
                                    } else if (((Boolean) sheetState3.getAnchoredDraggableState().getConfirmValueChange().invoke(sheetValue)).booleanValue()) {
                                        SemanticsPropertiesKt.O(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2

                                            /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1, reason: invalid class name */
                                            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                            @DebugMetadata(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1", f = "BottomSheetScaffold.kt", i = {}, l = {Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                int f24561n;

                                                /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                final /* synthetic */ SheetState f24562t;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                                    super(2, continuation);
                                                    this.f24562t = sheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation create(Object obj, Continuation continuation) {
                                                    return new AnonymousClass1(this.f24562t, continuation);
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
                                                    int i2 = this.f24561n;
                                                    if (i2 != 0) {
                                                        if (i2 == 1) {
                                                            ResultKt.throwOnFailure(obj);
                                                        } else {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                    } else {
                                                        ResultKt.throwOnFailure(obj);
                                                        SheetState sheetState = this.f24562t;
                                                        this.f24561n = 1;
                                                        if (sheetState.az(this) == coroutine_suspended) {
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
                                                GJW.C.nr(vdVar4, null, null, new AnonymousClass1(sheetState3, null), 3, null);
                                                return Boolean.TRUE;
                                            }
                                        });
                                    }
                                    if (sheetState3.getSkipHiddenState()) {
                                        return;
                                    }
                                    SemanticsPropertiesKt.az(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3

                                        /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1, reason: invalid class name */
                                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
                                        @DebugMetadata(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1", f = "BottomSheetScaffold.kt", i = {}, l = {327}, m = "invokeSuspend", n = {}, s = {})
                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                                            int f24565n;

                                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                                            final /* synthetic */ SheetState f24566t;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(SheetState sheetState, Continuation continuation) {
                                                super(2, continuation);
                                                this.f24566t = sheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation create(Object obj, Continuation continuation) {
                                                return new AnonymousClass1(this.f24566t, continuation);
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
                                                int i2 = this.f24565n;
                                                if (i2 != 0) {
                                                    if (i2 == 1) {
                                                        ResultKt.throwOnFailure(obj);
                                                    } else {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                } else {
                                                    ResultKt.throwOnFailure(obj);
                                                    SheetState sheetState = this.f24566t;
                                                    this.f24565n = 1;
                                                    if (sheetState.gh(this) == coroutine_suspended) {
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
                                            GJW.C.nr(vdVar4, null, null, new AnonymousClass1(sheetState3, null), 3, null);
                                            return Boolean.TRUE;
                                        }
                                    });
                                }
                            };
                            composer3.o(objIF4);
                        }
                        Modifier modifierT2 = SemanticsModifierKt.t(modifierT, true, (Function1) objIF4);
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
                        int iN2 = ComposablesKt.n(composer3, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierT2);
                        Function0 function0N2 = companion5.n();
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
                        Updater.O(composerN2, measurePolicyUo, companion5.t());
                        Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                        Function2 function2Rl2 = companion5.rl();
                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        }
                        Updater.O(composerN2, modifierO2, companion5.nr());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                        function22.invoke(composer3, 0);
                        composer3.XQ();
                    }
                    composer3.Xw();
                    function32.invoke(columnScopeInstance, composer3, 6);
                    composer3.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composer2, (i9 & 112) | 12582912 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 64);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
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
                    BottomSheetScaffoldKt.t(sheetState, f3, f4, z2, shape, j2, j3, f5, f6, function2, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
                }
            });
        }
    }
}
