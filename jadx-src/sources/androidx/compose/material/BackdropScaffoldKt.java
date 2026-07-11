package androidx.compose.material;

import GJW.vd;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aO\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aò\u0001\u0010+\u001a\u00020\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00142\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00142\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u0007¢\u0006\u0002\b\u00142\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020\"2\b\b\u0002\u0010)\u001a\u00020\"2\b\b\u0002\u0010*\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a0\u00100\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\"2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010/\u001a\u00020\bH\u0003ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a=\u00104\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00002\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00142\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014H\u0003¢\u0006\u0004\b4\u00105\u001a]\u0010;\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00142\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u0002070\u00072\u001d\u0010:\u001a\u0019\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001309¢\u0006\u0002\b\u0014H\u0003¢\u0006\u0004\b;\u0010<\u001a#\u0010B\u001a\u00020A2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030=2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bB\u0010C\"\u0014\u0010E\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010D\"\u0014\u0010G\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010D\"\u0014\u0010H\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010D\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K²\u0006\f\u0010I\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010J\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/BackdropValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BackdropScaffoldState;", "nr", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;)Landroidx/compose/material/BackdropScaffoldState;", "confirmStateChange", "ck", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "appBar", "backLayerContent", "frontLayerContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "snackbarHost", "gesturesEnabled", "Landroidx/compose/ui/unit/Dp;", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "Landroidx/compose/ui/graphics/Color;", "backLayerBackgroundColor", "backLayerContentColor", "Landroidx/compose/ui/graphics/Shape;", "frontLayerShape", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "t", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;Lkotlin/jvm/functions/Function3;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLandroidx/compose/runtime/Composer;III)V", TtmlNode.ATTR_TTS_COLOR, "onDismiss", "visible", "Uo", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "target", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "backLayer", "Landroidx/compose/ui/unit/Constraints;", "calculateBackLayerConstraints", "Lkotlin/Function2;", "frontLayer", "O", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "J2", "(Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "F", "AnimationSlideOffset", "rl", "VelocityThreshold", "PositionalThreshold", "alpha", "animationProgress", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,696:1\n1247#2,6:697\n1247#2,6:704\n1247#2,6:711\n1247#2,6:720\n1247#2,6:727\n1247#2,6:733\n1247#2,6:777\n1247#2,6:783\n1247#2,6:829\n1247#2,6:835\n1247#2,6:885\n75#3:703\n75#3:710\n75#3:717\n75#3:719\n75#3:739\n1#4:718\n696#5:726\n71#6:740\n67#6,7:741\n74#6:776\n71#6:789\n68#6,6:790\n74#6:824\n78#6:828\n71#6:841\n68#6,6:842\n74#6:876\n78#6:880\n78#6:884\n79#7,6:748\n86#7,4:763\n90#7,2:773\n79#7,6:796\n86#7,4:811\n90#7,2:821\n94#7:827\n79#7,6:848\n86#7,4:863\n90#7,2:873\n94#7:879\n94#7:883\n368#8,9:754\n377#8:775\n368#8,9:802\n377#8:823\n378#8,2:825\n368#8,9:854\n377#8:875\n378#8,2:877\n378#8,2:881\n4034#9,6:767\n4034#9,6:815\n4034#9,6:867\n85#10:891\n85#10:892\n149#11:893\n149#11:894\n149#11:895\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n*L\n257#1:697,6\n271#1:704,6\n368#1:711,6\n388#1:720,6\n501#1:727,6\n505#1:733,6\n533#1:777,6\n540#1:783,6\n550#1:829,6\n557#1:835,6\n575#1:885,6\n259#1:703\n367#1:710\n370#1:717\n371#1:719\n529#1:739\n496#1:726\n531#1:740\n531#1:741,7\n531#1:776\n532#1:789\n532#1:790,6\n532#1:824\n532#1:828\n548#1:841\n548#1:842,6\n548#1:876\n548#1:880\n531#1:884\n531#1:748,6\n531#1:763,4\n531#1:773,2\n532#1:796,6\n532#1:811,4\n532#1:821,2\n532#1:827\n548#1:848,6\n548#1:863,4\n548#1:873,2\n548#1:879\n531#1:883\n531#1:754,9\n531#1:775\n532#1:802,9\n532#1:823\n532#1:825,2\n548#1:854,9\n548#1:875\n548#1:877,2\n531#1:881,2\n531#1:767,6\n532#1:815,6\n548#1:867,6\n498#1:891\n525#1:892\n636#1:893\n637#1:894\n638#1:895\n*E\n"})
public final class BackdropScaffoldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f21259n = Dp.KN(20);
    private static final float rl = Dp.KN(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f21260t = Dp.KN(56);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Function2 function2, final Function2 function22, final Function2 function23, Modifier modifier, BackdropScaffoldState backdropScaffoldState, Function3 function3, boolean z2, float f3, float f4, boolean z3, boolean z4, long j2, long j3, Shape shape, float f5, long j4, long j5, long j6, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        Function3 function32;
        int i9;
        boolean z5;
        float f6;
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final BackdropScaffoldState backdropScaffoldState2;
        final float f8;
        final float f9;
        final boolean z6;
        final Shape shape2;
        final float f10;
        final long j7;
        final long j9;
        final long j10;
        final Modifier modifier3;
        Composer composer2;
        final boolean z7;
        final Function3 function33;
        final boolean z9;
        final long j11;
        final long j12;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i16;
        BackdropScaffoldState backdropScaffoldStateCk;
        float fJ2;
        float fO;
        final boolean z10;
        int i17;
        BackdropScaffoldState backdropScaffoldState3;
        long jMUb;
        long jRl;
        Modifier modifier4;
        Shape shapeNr;
        float fRl;
        Shape shape3;
        long jTy;
        long jRl2;
        int i18;
        final BackdropScaffoldState backdropScaffoldState4;
        final float f11;
        final long jT2;
        final Function3 function34;
        final Modifier modifier5;
        final long j13;
        int i19;
        final Shape shape4;
        final long j14;
        long j15;
        final boolean z11;
        final boolean z12;
        int i20;
        long j16;
        Composer composerKN = composer.KN(113877443);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.E2(function22) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(function23) ? 256 : 128;
        }
        int i21 = i5 & 8;
        if (i21 != 0) {
            i7 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            int i22 = 8192;
            if ((i2 & 24576) == 0) {
                i7 |= ((i5 & 16) == 0 && composerKN.p5(backdropScaffoldState)) ? 16384 : 8192;
            }
            i8 = i5 & 32;
            if (i8 == 0) {
                i7 |= 196608;
                function32 = function3;
            } else {
                function32 = function3;
                if ((i2 & 196608) == 0) {
                    i7 |= composerKN.E2(function32) ? 131072 : 65536;
                }
            }
            i9 = i5 & 64;
            if (i9 == 0) {
                i7 |= 1572864;
                z5 = z2;
            } else {
                z5 = z2;
                if ((i2 & 1572864) == 0) {
                    i7 |= composerKN.n(z5) ? 1048576 : 524288;
                }
            }
            if ((i2 & 12582912) != 0) {
                if ((i5 & 128) == 0) {
                    f6 = f3;
                    int i23 = composerKN.rl(f6) ? 8388608 : 4194304;
                    i7 |= i23;
                } else {
                    f6 = f3;
                }
                i7 |= i23;
            } else {
                f6 = f3;
            }
            if ((i2 & 100663296) != 0) {
                if ((i5 & 256) == 0) {
                    f7 = f4;
                    int i24 = composerKN.rl(f7) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    i7 |= i24;
                } else {
                    f7 = f4;
                }
                i7 |= i24;
            } else {
                f7 = f4;
            }
            i10 = i5 & 512;
            if (i10 != 0) {
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i11 = i10;
                    i7 |= composerKN.n(z3) ? 536870912 : 268435456;
                }
                i12 = i5 & 1024;
                if (i12 != 0) {
                    i14 = i3 | 6;
                    i13 = i12;
                } else if ((i3 & 6) == 0) {
                    i13 = i12;
                    i14 = i3 | (composerKN.n(z4) ? 4 : 2);
                } else {
                    i13 = i12;
                    i14 = i3;
                }
                if ((i3 & 48) == 0) {
                    if ((i5 & 2048) == 0) {
                        i15 = i21;
                        int i25 = composerKN.nr(j2) ? 32 : 16;
                        i14 |= i25;
                    } else {
                        i15 = i21;
                    }
                    i14 |= i25;
                } else {
                    i15 = i21;
                }
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    i14 |= ((i5 & 4096) == 0 && composerKN.nr(j3)) ? 256 : 128;
                }
                if ((i3 & 3072) == 0) {
                    i14 |= ((i5 & 8192) == 0 && composerKN.p5(shape)) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    if ((i5 & 16384) == 0 && composerKN.rl(f5)) {
                        i22 = 16384;
                    }
                    i14 |= i22;
                }
                if ((i3 & 196608) == 0) {
                    i14 |= ((i5 & 32768) == 0 && composerKN.nr(j4)) ? 131072 : 65536;
                }
                if ((i3 & 1572864) == 0) {
                    i14 |= ((i5 & 65536) == 0 && composerKN.nr(j5)) ? 1048576 : 524288;
                }
                if ((i3 & 12582912) == 0) {
                    i14 |= ((i5 & 131072) == 0 && composerKN.nr(j6)) ? 8388608 : 4194304;
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 4793491) == 4793490) ? false : true, i7 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        Modifier modifier6 = i15 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i5 & 16) != 0) {
                            i16 = -29360129;
                            backdropScaffoldStateCk = ck(BackdropValue.f21393n, null, null, null, composerKN, 6, 14);
                            i7 &= -57345;
                        } else {
                            i16 = -29360129;
                            backdropScaffoldStateCk = backdropScaffoldState;
                        }
                        Function3 function3N = i8 != 0 ? ComposableSingletons$BackdropScaffoldKt.f21721n.n() : function32;
                        if (i9 != 0) {
                            z5 = true;
                        }
                        if ((i5 & 128) != 0) {
                            fJ2 = BackdropScaffoldDefaults.f21257n.J2();
                            i7 &= i16;
                        } else {
                            fJ2 = f3;
                        }
                        if ((i5 & 256) != 0) {
                            fO = BackdropScaffoldDefaults.f21257n.O();
                            i7 &= -234881025;
                        } else {
                            fO = f4;
                        }
                        z10 = i11 != 0 ? true : z3;
                        boolean z13 = i13 != 0 ? true : z4;
                        if ((i5 & 2048) != 0) {
                            i14 &= -113;
                            i17 = i7;
                            backdropScaffoldState3 = backdropScaffoldStateCk;
                            jMUb = MaterialTheme.f22169n.n(composerKN, 6).mUb();
                        } else {
                            i17 = i7;
                            backdropScaffoldState3 = backdropScaffoldStateCk;
                            jMUb = j2;
                        }
                        int i26 = i14;
                        if ((i5 & 4096) != 0) {
                            jRl = ColorsKt.rl(jMUb, composerKN, (i26 >> 3) & 14);
                            i26 &= -897;
                        } else {
                            jRl = j3;
                        }
                        if ((i5 & 8192) != 0) {
                            modifier4 = modifier6;
                            shapeNr = BackdropScaffoldDefaults.f21257n.nr(composerKN, 0);
                            i26 &= -7169;
                        } else {
                            modifier4 = modifier6;
                            shapeNr = shape;
                        }
                        if ((i5 & 16384) != 0) {
                            fRl = BackdropScaffoldDefaults.f21257n.rl();
                            i26 &= -57345;
                        } else {
                            fRl = f5;
                        }
                        float f12 = fRl;
                        if ((i5 & 32768) != 0) {
                            shape3 = shapeNr;
                            i26 &= -458753;
                            jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                        } else {
                            shape3 = shapeNr;
                            jTy = j4;
                        }
                        if ((i5 & 65536) != 0) {
                            jRl2 = ColorsKt.rl(jTy, composerKN, (i26 >> 15) & 14);
                            i18 = (-3670017) & i26;
                        } else {
                            jRl2 = j5;
                            i18 = i26;
                        }
                        if ((i5 & 131072) != 0) {
                            f11 = f12;
                            function34 = function3N;
                            jT2 = BackdropScaffoldDefaults.f21257n.t(composerKN, 0);
                            modifier5 = modifier4;
                            j13 = jRl2;
                            shape4 = shape3;
                            i19 = i18 & i16;
                            j14 = jTy;
                            j15 = jRl;
                            backdropScaffoldState4 = backdropScaffoldState3;
                        } else {
                            int i27 = i18;
                            backdropScaffoldState4 = backdropScaffoldState3;
                            f11 = f12;
                            jT2 = j6;
                            function34 = function3N;
                            modifier5 = modifier4;
                            j13 = jRl2;
                            i19 = i27;
                            shape4 = shape3;
                            j14 = jTy;
                            j15 = jRl;
                        }
                        z11 = z13;
                        z12 = z5;
                        i20 = i17;
                    } else {
                        composerKN.wTp();
                        if ((i5 & 16) != 0) {
                            i7 &= -57345;
                        }
                        if ((i5 & 128) != 0) {
                            i7 &= -29360129;
                        }
                        if ((i5 & 256) != 0) {
                            i7 &= -234881025;
                        }
                        if ((i5 & 2048) != 0) {
                            i14 &= -113;
                        }
                        int i28 = i14;
                        if ((i5 & 4096) != 0) {
                            i28 &= -897;
                        }
                        if ((i5 & 8192) != 0) {
                            i28 &= -7169;
                        }
                        if ((i5 & 16384) != 0) {
                            i28 &= -57345;
                        }
                        if ((32768 & i5) != 0) {
                            i28 &= -458753;
                        }
                        if ((i5 & 65536) != 0) {
                            i28 &= -3670017;
                        }
                        if ((i5 & 131072) != 0) {
                            i28 &= -29360129;
                        }
                        z11 = z4;
                        j15 = j3;
                        shape4 = shape;
                        f11 = f5;
                        j14 = j4;
                        j13 = j5;
                        jT2 = j6;
                        i19 = i28;
                        i20 = i7;
                        fJ2 = f6;
                        fO = f7;
                        z12 = z5;
                        function34 = function32;
                        backdropScaffoldState4 = backdropScaffoldState;
                        z10 = z3;
                        modifier5 = modifier2;
                        jMUb = j2;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        j16 = j15;
                        ComposerKt.p5(113877443, i20, i19, "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:364)");
                    } else {
                        j16 = j15;
                    }
                    final Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                    boolean zP5 = ((((57344 & i20) ^ 24576) > 16384 && composerKN.p5(backdropScaffoldState4)) || (i20 & 24576) == 16384) | composerKN.p5(density);
                    Object objIF = composerKN.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                backdropScaffoldState4.qie(density);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    EffectsKt.KN((Function0) objIF, composerKN, 0);
                    final float fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(fJ2);
                    final float fL2 = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(fO);
                    final BackdropScaffoldState backdropScaffoldState5 = backdropScaffoldState4;
                    final ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(461235665, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void n(Composer composer3, int i29) {
                            if (!composer3.HI((i29 & 3) != 2, 1 & i29)) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(461235665, i29, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:374)");
                            }
                            if (z10) {
                                composer3.eF(1665275251);
                                Function2 function24 = function2;
                                Function2 function25 = function22;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                                int iN = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer3, companion);
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
                                Updater.O(composerN, measurePolicyN, companion2.t());
                                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                                Function2 function2Rl = companion2.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion2.nr());
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                                function24.invoke(composer3, 0);
                                function25.invoke(composer3, 0);
                                composer3.XQ();
                                composer3.Xw();
                            } else {
                                composer3.eF(1665408644);
                                BackdropScaffoldKt.n((BackdropValue) backdropScaffoldState4.getAnchoredDraggableState().aYN(), function2, function22, composer3, 0);
                                composer3.Xw();
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerKN, 54);
                    boolean zRl = composerKN.rl(fL2);
                    Object objIF2 = composerKN.iF();
                    if (zRl || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1<Constraints, Constraints>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
                                return Constraints.n(n(constraints.getValue()));
                            }

                            public final long n(long j17) {
                                return ConstraintsKt.mUb(Constraints.nr(j17, 0, 0, 0, 0, 10, null), 0, -MathKt.roundToInt(fL2), 1, null);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    final Function1 function1 = (Function1) objIF2;
                    final AnchoredDraggableState anchoredDraggableState = backdropScaffoldState5.getAnchoredDraggableState();
                    final float f13 = fJ2;
                    final float f14 = fO;
                    ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(1961515015, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
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
                                ComposerKt.p5(1961515015, i29, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:395)");
                            }
                            Object objIF3 = composer3.iF();
                            if (objIF3 == Composer.INSTANCE.n()) {
                                objIF3 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer3);
                                composer3.o(objIF3);
                            }
                            final vd vdVar = (vd) objIF3;
                            Modifier modifierJ2 = SizeKt.J2(modifier5, 0.0f, 1, null);
                            Function2 function24 = composableLambdaNr;
                            Function1 function12 = function1;
                            final float f15 = fL2;
                            final boolean z14 = z11;
                            final boolean z15 = z12;
                            final BackdropScaffoldState backdropScaffoldState6 = backdropScaffoldState5;
                            final AnchoredDraggableState anchoredDraggableState2 = anchoredDraggableState;
                            final Shape shape5 = shape4;
                            final long j17 = j14;
                            final long j18 = j13;
                            final float f16 = f11;
                            final float f17 = f14;
                            final float f18 = fL;
                            final float f19 = f13;
                            final Function2 function25 = function23;
                            final long j19 = jT2;
                            final Function3 function35 = function34;
                            BackdropScaffoldKt.O(modifierJ2, function24, function12, ComposableLambdaKt.nr(516504859, true, new Function4<Constraints, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(4);
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(Constraints constraints, Float f20, Composer composer4, Integer num) {
                                    n(constraints.getValue(), f20.floatValue(), composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(long j20, float f20, Composer composer4, int i30) {
                                    int i31;
                                    if ((i30 & 6) == 0) {
                                        i31 = i30 | (composer4.nr(j20) ? 4 : 2);
                                    } else {
                                        i31 = i30;
                                    }
                                    if ((i30 & 48) == 0) {
                                        i31 |= composer4.rl(f20) ? 32 : 16;
                                    }
                                    if (!composer4.HI((i31 & 147) != 146, i31 & 1)) {
                                        composer4.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(516504859, i31, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:399)");
                                    }
                                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                                    float fGh = Constraints.gh(j20) - f15;
                                    floatRef.element = fGh;
                                    if (z14) {
                                        floatRef.element = Math.min(fGh, f20);
                                    }
                                    Modifier modifierRl = z15 ? NestedScrollModifierKt.rl(Modifier.INSTANCE, backdropScaffoldState6.getNestedScrollConnection(), null, 2, null) : Modifier.INSTANCE;
                                    AnchoredDraggableState anchoredDraggableState3 = anchoredDraggableState2;
                                    Orientation orientation = Orientation.f16969n;
                                    final float f21 = f18;
                                    final BackdropScaffoldState backdropScaffoldState7 = backdropScaffoldState6;
                                    Modifier modifierO = AnchoredDraggableKt.O(AnchoredDraggableKt.KN(modifierRl, anchoredDraggableState3, orientation, new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<BackdropValue>, ? extends BackdropValue>>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.2.1.1

                                        /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$1$WhenMappings */
                                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                                        public /* synthetic */ class WhenMappings {
                                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                            static {
                                                int[] iArr = new int[BackdropValue.values().length];
                                                try {
                                                    iArr[BackdropValue.f21393n.ordinal()] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    iArr[BackdropValue.f21394t.ordinal()] = 2;
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
                                        public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<BackdropValue>, ? extends BackdropValue> invoke(IntSize intSize, Constraints constraints) {
                                            return n(intSize.getPackedValue(), constraints.getValue());
                                        }

                                        public final Pair n(long j21, long j22) {
                                            BackdropValue backdropValue;
                                            final float fJ22 = IntSize.J2(j21);
                                            float fJ23 = IntSize.J2(j21);
                                            final float f22 = f21;
                                            final float f23 = fJ23 - f22;
                                            final Ref.FloatRef floatRef2 = floatRef;
                                            DraggableAnchors draggableAnchorsN = AnchoredDraggableKt.n(new Function1<DraggableAnchorsConfig<BackdropValue>, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$1$newAnchors$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<BackdropValue> draggableAnchorsConfig) {
                                                    n(draggableAnchorsConfig);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(DraggableAnchorsConfig draggableAnchorsConfig) {
                                                    float f24 = fJ22;
                                                    if (f24 != 0.0f) {
                                                        float f25 = f22;
                                                        if (f24 != f25) {
                                                            draggableAnchorsConfig.n(BackdropValue.f21393n, f25);
                                                            draggableAnchorsConfig.n(BackdropValue.f21394t, floatRef2.element);
                                                            return;
                                                        }
                                                    }
                                                    draggableAnchorsConfig.n(BackdropValue.f21393n, f23);
                                                }
                                            });
                                            int i32 = WhenMappings.$EnumSwitchMapping$0[backdropScaffoldState7.Uo().ordinal()];
                                            if (i32 != 1) {
                                                if (i32 == 2) {
                                                    backdropValue = BackdropValue.f21394t;
                                                    if (!draggableAnchorsN.nr(backdropValue)) {
                                                        backdropValue = BackdropValue.f21393n;
                                                    }
                                                } else {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            } else {
                                                backdropValue = BackdropValue.f21393n;
                                            }
                                            return TuplesKt.to(draggableAnchorsN, backdropValue);
                                        }
                                    }), anchoredDraggableState2, orientation, z15, false, null, false, 56, null);
                                    boolean zP52 = composer4.p5(backdropScaffoldState6) | composer4.E2(vdVar);
                                    final BackdropScaffoldState backdropScaffoldState8 = backdropScaffoldState6;
                                    final vd vdVar2 = vdVar;
                                    Object objIF4 = composer4.iF();
                                    if (zP52 || objIF4 == Composer.INSTANCE.n()) {
                                        objIF4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1
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
                                                if (backdropScaffoldState8.KN()) {
                                                    final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState8;
                                                    final vd vdVar3 = vdVar2;
                                                    SemanticsPropertiesKt.J2(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1.1

                                                        /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {443}, m = "invokeSuspend", n = {}, s = {})
                                                        static final class C05191 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                            int f21313n;

                                                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                            final /* synthetic */ BackdropScaffoldState f21314t;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            C05191(BackdropScaffoldState backdropScaffoldState, Continuation continuation) {
                                                                super(2, continuation);
                                                                this.f21314t = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation create(Object obj, Continuation continuation) {
                                                                return new C05191(this.f21314t, continuation);
                                                            }

                                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final Object invoke2(vd vdVar, Continuation continuation) {
                                                                return ((C05191) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                                                                return invoke2(vdVar, (Continuation) continuation);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Object invokeSuspend(Object obj) {
                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i2 = this.f21313n;
                                                                if (i2 != 0) {
                                                                    if (i2 == 1) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                    } else {
                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    }
                                                                } else {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    BackdropScaffoldState backdropScaffoldState = this.f21314t;
                                                                    this.f21313n = 1;
                                                                    if (backdropScaffoldState.gh(this) == coroutine_suspended) {
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
                                                            if (((Boolean) backdropScaffoldState9.getConfirmValueChange().invoke(BackdropValue.f21394t)).booleanValue()) {
                                                                GJW.C.nr(vdVar3, null, null, new C05191(backdropScaffoldState9, null), 3, null);
                                                            }
                                                            return Boolean.TRUE;
                                                        }
                                                    }, 1, null);
                                                } else {
                                                    final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState8;
                                                    final vd vdVar4 = vdVar2;
                                                    SemanticsPropertiesKt.Ik(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1.2

                                                        /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1, reason: invalid class name */
                                                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                                        @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1", f = "BackdropScaffold.kt", i = {}, l = {450}, m = "invokeSuspend", n = {}, s = {})
                                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                            /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                            int f21317n;

                                                            /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                            final /* synthetic */ BackdropScaffoldState f21318t;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation continuation) {
                                                                super(2, continuation);
                                                                this.f21318t = backdropScaffoldState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation create(Object obj, Continuation continuation) {
                                                                return new AnonymousClass1(this.f21318t, continuation);
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
                                                                int i2 = this.f21317n;
                                                                if (i2 != 0) {
                                                                    if (i2 == 1) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                    } else {
                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    }
                                                                } else {
                                                                    ResultKt.throwOnFailure(obj);
                                                                    BackdropScaffoldState backdropScaffoldState = this.f21318t;
                                                                    this.f21317n = 1;
                                                                    if (backdropScaffoldState.rl(this) == coroutine_suspended) {
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
                                                            if (((Boolean) backdropScaffoldState10.getConfirmValueChange().invoke(BackdropValue.f21393n)).booleanValue()) {
                                                                GJW.C.nr(vdVar4, null, null, new AnonymousClass1(backdropScaffoldState10, null), 3, null);
                                                            }
                                                            return Boolean.TRUE;
                                                        }
                                                    }, 1, null);
                                                }
                                            }
                                        };
                                        composer4.o(objIF4);
                                    }
                                    Modifier modifierNr = SemanticsModifierKt.nr(modifierO, false, (Function1) objIF4, 1, null);
                                    Shape shape6 = shape5;
                                    long j21 = j17;
                                    long j22 = j18;
                                    float f22 = f16;
                                    final float f23 = f19;
                                    final Function2 function26 = function25;
                                    final long j23 = j19;
                                    final boolean z16 = z15;
                                    final BackdropScaffoldState backdropScaffoldState9 = backdropScaffoldState6;
                                    final vd vdVar3 = vdVar;
                                    SurfaceKt.n(modifierNr, shape6, j21, j22, null, f22, ComposableLambdaKt.nr(1946125143, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt.BackdropScaffold.2.1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            n(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer5, int i32) {
                                            if (!composer5.HI((i32 & 3) != 2, i32 & 1)) {
                                                composer5.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1946125143, i32, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:460)");
                                            }
                                            Modifier modifierAz = PaddingKt.az(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, f23, 7, null);
                                            Function2 function27 = function26;
                                            long j24 = j23;
                                            final boolean z17 = z16;
                                            final BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState9;
                                            final vd vdVar4 = vdVar3;
                                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                            int iN = ComposablesKt.n(composer5, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer5.Ik();
                                            Modifier modifierO2 = ComposedModifierKt.O(composer5, modifierAz);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0 function0N = companion.n();
                                            if (composer5.getApplier() == null) {
                                                ComposablesKt.t();
                                            }
                                            composer5.T();
                                            if (composer5.getInserting()) {
                                                composer5.s7N(function0N);
                                            } else {
                                                composer5.r();
                                            }
                                            Composer composerN = Updater.n(composer5);
                                            Updater.O(composerN, measurePolicyUo, companion.t());
                                            Updater.O(composerN, compositionLocalMapIk, companion.O());
                                            Function2 function2Rl = companion.rl();
                                            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                                composerN.o(Integer.valueOf(iN));
                                                composerN.az(Integer.valueOf(iN), function2Rl);
                                            }
                                            Updater.O(composerN, modifierO2, companion.nr());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                            function27.invoke(composer5, 0);
                                            boolean zN = composer5.n(z17) | composer5.p5(backdropScaffoldState10) | composer5.E2(vdVar4);
                                            Object objIF5 = composer5.iF();
                                            if (zN || objIF5 == Composer.INSTANCE.n()) {
                                                objIF5 = new Function0<Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1

                                                    /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1, reason: invalid class name */
                                                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                                                    @DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
                                                    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

                                                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                                                        int f21327n;

                                                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                                                        final /* synthetic */ BackdropScaffoldState f21328t;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(BackdropScaffoldState backdropScaffoldState, Continuation continuation) {
                                                            super(2, continuation);
                                                            this.f21328t = backdropScaffoldState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation create(Object obj, Continuation continuation) {
                                                            return new AnonymousClass1(this.f21328t, continuation);
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
                                                            int i2 = this.f21327n;
                                                            if (i2 != 0) {
                                                                if (i2 == 1) {
                                                                    ResultKt.throwOnFailure(obj);
                                                                } else {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                            } else {
                                                                ResultKt.throwOnFailure(obj);
                                                                BackdropScaffoldState backdropScaffoldState = this.f21328t;
                                                                this.f21327n = 1;
                                                                if (backdropScaffoldState.rl(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        if (z17 && ((Boolean) backdropScaffoldState10.getConfirmValueChange().invoke(BackdropValue.f21393n)).booleanValue()) {
                                                            GJW.C.nr(vdVar4, null, null, new AnonymousClass1(backdropScaffoldState10, null), 3, null);
                                                        }
                                                    }
                                                };
                                                composer5.o(objIF5);
                                            }
                                            BackdropScaffoldKt.Uo(j24, (Function0) objIF5, backdropScaffoldState10.Uo() == BackdropValue.f21394t, composer5, 0);
                                            composer5.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer4, 54), composer4, 1572864, 16);
                                    Modifier modifierAz = PaddingKt.az(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, (backdropScaffoldState6.xMQ() && floatRef.element == ((float) Constraints.gh(j20)) - f15) ? f17 : Dp.KN(0), 7, null);
                                    Alignment alignmentRl = Alignment.INSTANCE.rl();
                                    Function3 function36 = function35;
                                    BackdropScaffoldState backdropScaffoldState10 = backdropScaffoldState6;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(alignmentRl, false);
                                    int iN = ComposablesKt.n(composer4, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                    Modifier modifierO2 = ComposedModifierKt.O(composer4, modifierAz);
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
                                    Updater.O(composerN, modifierO2, companion.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    function36.invoke(backdropScaffoldState10.getSnackbarHostState(), composer4, 0);
                                    composer4.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer3, 54), composer3, 3120);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54);
                    int i29 = i19 << 3;
                    SurfaceKt.n(null, null, jMUb, j16, null, 0.0f, composableLambdaNr2, composerKN, (i29 & 7168) | (i29 & 896) | 1572864, 51);
                    long j17 = j16;
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier5;
                    j12 = j17;
                    j11 = jMUb;
                    composer2 = composerKN;
                    z9 = z10;
                    z6 = z11;
                    z7 = z12;
                    backdropScaffoldState2 = backdropScaffoldState5;
                    shape2 = shape4;
                    j7 = j14;
                    j9 = j13;
                    f10 = f11;
                    f9 = f14;
                    f8 = f13;
                    j10 = jT2;
                    function33 = function34;
                } else {
                    composerKN.wTp();
                    backdropScaffoldState2 = backdropScaffoldState;
                    f8 = f3;
                    f9 = f4;
                    z6 = z4;
                    shape2 = shape;
                    f10 = f5;
                    j7 = j4;
                    j9 = j5;
                    j10 = j6;
                    modifier3 = modifier2;
                    composer2 = composerKN;
                    z7 = z5;
                    function33 = function32;
                    z9 = z3;
                    j11 = j2;
                    j12 = j3;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i30) {
                            BackdropScaffoldKt.t(function2, function22, function23, modifier3, backdropScaffoldState2, function33, z7, f8, f9, z9, z6, j11, j12, shape2, f10, j7, j9, j10, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
            i11 = i10;
            i12 = i5 & 1024;
            if (i12 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & 196608) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 4793491) == 4793490) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        int i222 = 8192;
        if ((i2 & 24576) == 0) {
        }
        i8 = i5 & 32;
        if (i8 == 0) {
        }
        i9 = i5 & 64;
        if (i9 == 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        if ((i2 & 100663296) != 0) {
        }
        i10 = i5 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i5 & 1024;
        if (i12 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i14 & 4793491) == 4793490) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final NestedScrollConnection J2(AnchoredDraggableState anchoredDraggableState, Orientation orientation) {
        return new BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(final long j2, final Function0 function0, final boolean z2, Composer composer, final int i2) {
        int i3;
        Modifier modifierZmq;
        Composer composerKN = composer.KN(-92141505);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if (composerKN.HI((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-92141505, i3, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:494)");
            }
            if (j2 != 16) {
                composerKN.eF(478794687);
                int i5 = i3;
                final State stateNr = AnimateAsStateKt.nr(z2 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerKN, 48, 28);
                if (z2) {
                    composerKN.eF(478960289);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Unit unit = Unit.INSTANCE;
                    boolean z3 = (i5 & 112) == 32;
                    Object objIF = composerKN.iF();
                    if (z3 || objIF == Composer.INSTANCE.n()) {
                        objIF = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function0, null);
                        composerKN.o(objIF);
                    }
                    modifierZmq = companion.Zmq(new SuspendPointerInputElement(unit, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objIF), 6, null));
                    composerKN.Xw();
                } else {
                    composerKN.eF(479060698);
                    composerKN.Xw();
                    modifierZmq = Modifier.INSTANCE;
                }
                Modifier modifierZmq2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null).Zmq(modifierZmq);
                boolean zP5 = composerKN.p5(stateNr) | ((i5 & 14) == 4);
                Object objIF2 = composerKN.iF();
                if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            n(drawScope);
                            return Unit.INSTANCE;
                        }

                        public final void n(DrawScope drawScope) {
                            DrawScope.h(drawScope, j2, 0L, 0L, BackdropScaffoldKt.KN(stateNr), null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                        }
                    };
                    composerKN.o(objIF2);
                }
                CanvasKt.rl(modifierZmq2, (Function1) objIF2, composerKN, 0);
                composerKN.Xw();
            } else {
                composerKN.eF(479228098);
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$2
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
                    BackdropScaffoldKt.Uo(j2, function0, z2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final BackdropScaffoldState ck(final BackdropValue backdropValue, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = BackdropScaffoldDefaults.f21257n.n();
        }
        final AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = new Function1<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(BackdropValue backdropValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        final Function1 function12 = function1;
        if ((i3 & 8) != 0) {
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new SnackbarHostState();
                composer.o(objIF);
            }
            snackbarHostState = (SnackbarHostState) objIF;
        }
        final SnackbarHostState snackbarHostState2 = snackbarHostState;
        if (ComposerKt.v()) {
            ComposerKt.p5(-862178912, i2, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:257)");
        }
        final Density density = (Density) composer.ty(CompositionLocalsKt.J2());
        Object[] objArr = {animationSpec2, function12, snackbarHostState2};
        Saver saverN = BackdropScaffoldState.INSTANCE.n(animationSpec2, function12, snackbarHostState2, density);
        boolean zP5 = ((((i2 & 14) ^ 6) > 4 && composer.p5(backdropValue)) || (i2 & 6) == 4) | composer.p5(density) | composer.E2(animationSpec2) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.p5(function12)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.p5(snackbarHostState2)) || (i2 & 3072) == 2048);
        Object objIF2 = composer.iF();
        if (zP5 || objIF2 == Composer.INSTANCE.n()) {
            Object obj = new Function0<BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final BackdropScaffoldState invoke() {
                    return BackdropScaffoldKt.nr(backdropValue, density, animationSpec2, function12, snackbarHostState2);
                }
            };
            composer.o(obj);
            objIF2 = obj;
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.O(objArr, saverN, null, (Function0) objIF2, composer, 0, 4);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return backdropScaffoldState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final BackdropValue backdropValue, final Function2 function2, final Function2 function22, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-950970976);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(backdropValue) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function22) ? 256 : 128;
        }
        int i5 = i3;
        if (composerKN.HI((i5 & 147) != 146, 1 & i5)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-950970976, i5, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:520)");
            }
            final State stateNr = AnimateAsStateKt.nr(backdropValue == BackdropValue.f21394t ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerKN, 48, 28);
            final float fL = ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(f21259n);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            boolean zP5 = composerKN.p5(stateNr);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$1$1
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return n(measureScope, measurable, constraints.getValue());
                    }

                    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                        final float fRl = BackdropScaffoldKt.rl(stateNr) - 1;
                        if (fRl < 0.0f) {
                            fRl = 0.0f;
                        }
                        if (fRl > 1.0f) {
                            fRl = 1.0f;
                        }
                        final Placeable placeableDR0 = measurable.dR0(j2);
                        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$1$1.1
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
                                placementScope.KN(placeableDR0, 0, 0, fRl);
                            }
                        }, 4, null);
                    }
                };
                composerKN.o(objIF);
            }
            Modifier modifierN = LayoutModifierKt.n(companion, (Function3) objIF);
            boolean zP52 = composerKN.p5(stateNr) | composerKN.rl(fL);
            Object objIF2 = composerKN.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        n(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(GraphicsLayerScope graphicsLayerScope) {
                        float f3 = 1;
                        float fRl = BackdropScaffoldKt.rl(stateNr) - f3;
                        if (fRl < 0.0f) {
                            fRl = 0.0f;
                        }
                        if (fRl > 1.0f) {
                            fRl = 1.0f;
                        }
                        graphicsLayerScope.rl(fRl);
                        graphicsLayerScope.O((f3 - fRl) * fL);
                    }
                };
                composerKN.o(objIF2);
            }
            Modifier modifierN2 = GraphicsLayerModifierKt.n(modifierN, (Function1) objIF2);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN2);
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
            Updater.O(composerN2, measurePolicyUo2, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            function2.invoke(composerKN, Integer.valueOf((i5 >> 3) & 14));
            composerKN.XQ();
            boolean zP53 = composerKN.p5(stateNr);
            Object objIF3 = composerKN.iF();
            if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$4$1
                    {
                        super(3);
                    }

                    public final MeasureResult n(MeasureScope measureScope, Measurable measurable, long j2) {
                        final float fRl = 1 - BackdropScaffoldKt.rl(stateNr);
                        if (fRl < 0.0f) {
                            fRl = 0.0f;
                        }
                        if (fRl > 1.0f) {
                            fRl = 1.0f;
                        }
                        final Placeable placeableDR0 = measurable.dR0(j2);
                        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$4$1.1
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
                                placementScope.KN(placeableDR0, 0, 0, fRl);
                            }
                        }, 4, null);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return n(measureScope, measurable, constraints.getValue());
                    }
                };
                composerKN.o(objIF3);
            }
            Modifier modifierN3 = LayoutModifierKt.n(companion, (Function3) objIF3);
            boolean zP54 = composerKN.p5(stateNr) | composerKN.rl(fL);
            Object objIF4 = composerKN.iF();
            if (zP54 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void n(GraphicsLayerScope graphicsLayerScope) {
                        float f3 = 1;
                        float fRl = f3 - BackdropScaffoldKt.rl(stateNr);
                        if (fRl < 0.0f) {
                            fRl = 0.0f;
                        }
                        if (fRl > 1.0f) {
                            fRl = 1.0f;
                        }
                        graphicsLayerScope.rl(fRl);
                        graphicsLayerScope.O((f3 - fRl) * fL);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        n(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }
                };
                composerKN.o(objIF4);
            }
            Modifier modifierN4 = GraphicsLayerModifierKt.n(modifierN3, (Function1) objIF4);
            MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion2.HI(), false);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierN4);
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
            Updater.O(composerN3, measurePolicyUo3, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            function22.invoke(composerKN, Integer.valueOf((i5 >> 6) & 14));
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$2
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
                    BackdropScaffoldKt.n(backdropValue, function2, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final BackdropScaffoldState nr(BackdropValue backdropValue, Density density, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState) {
        BackdropScaffoldState backdropScaffoldState = new BackdropScaffoldState(backdropValue, animationSpec, function1, snackbarHostState);
        backdropScaffoldState.qie(density);
        return backdropScaffoldState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float KN(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final Modifier modifier, final Function2 function2, final Function1 function1, final Function4 function4, Composer composer, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        int i7;
        int i8;
        int i9;
        Composer composerKN = composer.KN(-1248995194);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(modifier)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function1)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (composerKN.E2(function4)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        boolean z5 = true;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1248995194, i3, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:573)");
            }
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z3 | z4;
            if ((i3 & 7168) != 2048) {
                z5 = false;
            }
            boolean z7 = z6 | z5;
            Object objIF = composerKN.iF();
            if (z7 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return n(subcomposeMeasureScope, constraints.getValue());
                    }

                    public final MeasureResult n(SubcomposeMeasureScope subcomposeMeasureScope, final long j2) {
                        final Placeable placeableDR0 = ((Measurable) CollectionsKt.first(subcomposeMeasureScope.Y(BackdropLayers.f21254n, function2))).dR0(((Constraints) function1.invoke(Constraints.n(j2))).getValue());
                        final float height = placeableDR0.getHeight();
                        BackdropLayers backdropLayers = BackdropLayers.f21255t;
                        final Function4 function42 = function4;
                        List listY = subcomposeMeasureScope.Y(backdropLayers, ComposableLambdaKt.rl(-1222642649, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
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
                                if (!composer2.HI((i10 & 3) != 2, i10 & 1)) {
                                    composer2.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1222642649, i10, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:583)");
                                }
                                function42.invoke(Constraints.n(j2), Float.valueOf(height), composer2, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }));
                        final ArrayList arrayList = new ArrayList(listY.size());
                        int size = listY.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            arrayList.add(((Measurable) listY.get(i10)).dR0(j2));
                        }
                        int iMax = Math.max(Constraints.ty(j2), placeableDR0.getWidth());
                        int iMax2 = Math.max(Constraints.az(j2), placeableDR0.getHeight());
                        int size2 = arrayList.size();
                        int iMax3 = iMax2;
                        int iMax4 = iMax;
                        for (int i11 = 0; i11 < size2; i11++) {
                            Placeable placeable = (Placeable) arrayList.get(i11);
                            iMax4 = Math.max(iMax4, placeable.getWidth());
                            iMax3 = Math.max(iMax3, placeable.getHeight());
                        }
                        return MeasureScope.ER(subcomposeMeasureScope, iMax4, iMax3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
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
                                Placeable.PlacementScope.az(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                                List list = arrayList;
                                int size3 = list.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    Placeable.PlacementScope.az(placementScope, (Placeable) list.get(i12), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerKN.o(objIF);
            }
            SubcomposeLayoutKt.n(modifier, (Function2) objIF, composerKN, i3 & 14, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$2
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
                    BackdropScaffoldKt.O(modifier, function2, function1, function4, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rl(State state) {
        return ((Number) state.getValue()).floatValue();
    }
}
