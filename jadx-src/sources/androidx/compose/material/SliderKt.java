package androidx.compose.material;

import GJW.vd;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Strings;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0081\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aq\u0010\u0019\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00072\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020\u00162\u0014\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r0\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0081\u0001\u0010\u001b\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aM\u0010!\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b!\u0010\"\u001am\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0003¢\u0006\u0004\b)\u0010*\u001aF\u0010/\u001a\u00020\u0003*\u00020+2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020,H\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001aU\u00103\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001e2\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0003¢\u0006\u0004\b3\u00104\u001a5\u00108\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001e2\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0000H\u0002¢\u0006\u0004\b8\u00109\u001a5\u0010A\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0000\u0018\u00010?*\u00020:2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0082@ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00000\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bC\u0010D\u001a7\u0010J\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0000H\u0002¢\u0006\u0004\bJ\u0010K\u001aC\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0000H\u0002¢\u0006\u0004\bM\u0010N\u001a'\u0010R\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u00002\u0006\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u0000H\u0002¢\u0006\u0004\bR\u0010S\u001aU\u0010X\u001a\u00020\u00032\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000V2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\bX\u0010Y\u001ac\u0010Z\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bZ\u0010[\u001aq\u0010a\u001a\u00020\u0005*\u00020\u00052\u0006\u0010]\u001a\u00020\\2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00072\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u0018\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020\u00162\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00000V2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\ba\u0010b\u001a0\u0010e\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\\2\u0006\u00105\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u0000H\u0082@¢\u0006\u0004\be\u0010f\u001a\u009f\u0001\u0010k\u001a\u00020\u0005*\u00020\u00052\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010_\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00020\u00162\u001e\u0010j\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030i0\u0016H\u0002¢\u0006\u0004\bk\u0010l\"\u001a\u0010p\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010m\u001a\u0004\bn\u0010o\"\u0014\u0010q\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010m\"\u0014\u0010r\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010m\"\u0014\u0010s\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010m\"\u001a\u0010u\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010m\u001a\u0004\bt\u0010o\"\u0014\u0010v\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010m\"\u0014\u0010w\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010m\"\u0014\u0010z\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010y\"\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00000{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u007f"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SliderColors;", "colors", "nr", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "isRtl", "Landroidx/compose/runtime/State;", "onValueChangeState", "onValueChangeFinishedState", "fD", "(Landroidx/compose/ui/Modifier;ZILkotlin/ranges/ClosedFloatingPointRange;FZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "rl", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "positionFraction", "", "tickFractions", "width", "O", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "positionFractionStart", "positionFractionEnd", "startInteractionSource", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "t", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/ui/unit/Dp;", "offset", "thumbSize", "J2", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "thumbPx", "trackStrokeWidth", "Uo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "current", "minPx", "maxPx", "X", "(FLjava/util/List;FF)F", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "aYN", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(I)Ljava/util/List;", "a1", "b1", "x1", "a2", "b2", "te", "(FFFFF)F", "x", "iF", "(FFLkotlin/ranges/ClosedFloatingPointRange;FF)Lkotlin/ranges/ClosedFloatingPointRange;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "pos", "ViF", "(FFF)F", "scaleToOffset", "trackRange", "Landroidx/compose/runtime/MutableState;", "valueState", c.f62177j, "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "E2", "(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "rawOffset", "gestureEndAction", "pressOffset", "e", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;FZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)Landroidx/compose/ui/Modifier;", "target", "velocity", "WPU", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "onDrag", "g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;ZZFLkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "F", "nY", "()F", "ThumbRadius", "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "getTrackHeight", "TrackHeight", "SliderHeight", "SliderMinWidth", "KN", "Landroidx/compose/ui/Modifier;", "DefaultSliderConstraints", "Landroidx/compose/animation/core/TweenSpec;", "xMQ", "Landroidx/compose/animation/core/TweenSpec;", "SliderToTickAnimation", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 12 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 13 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1290:1\n1247#2,6:1291\n1247#2,6:1298\n1247#2,6:1306\n1247#2,6:1312\n1247#2,6:1318\n1247#2,6:1408\n1247#2,6:1414\n1247#2,6:1460\n1247#2,6:1466\n1247#2,6:1477\n1247#2,6:1512\n1#3:1297\n87#4:1304\n87#4:1324\n87#4:1362\n84#4:1363\n87#4:1405\n84#4:1406\n84#4:1407\n75#5:1305\n75#5:1361\n75#5:1404\n71#6:1325\n68#6,6:1326\n74#6:1360\n78#6:1367\n71#6:1368\n68#6,6:1369\n74#6:1403\n78#6:1423\n71#6:1424\n68#6,6:1425\n74#6:1459\n78#6:1476\n79#7,6:1332\n86#7,4:1347\n90#7,2:1357\n94#7:1366\n79#7,6:1375\n86#7,4:1390\n90#7,2:1400\n94#7:1422\n79#7,6:1431\n86#7,4:1446\n90#7,2:1456\n94#7:1475\n368#8,9:1338\n377#8:1359\n378#8,2:1364\n368#8,9:1381\n377#8:1402\n378#8,2:1420\n368#8,9:1437\n377#8:1458\n378#8,2:1473\n4034#9,6:1351\n4034#9,6:1394\n4034#9,6:1450\n149#10:1472\n149#10:1519\n149#10:1520\n149#10:1521\n149#10:1522\n149#10:1523\n149#10:1524\n149#10:1525\n482#11,13:1483\n71#12,16:1496\n135#13:1518\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n168#1:1291,6\n172#1:1298,6\n408#1:1306,6\n409#1:1312,6\n413#1:1318,6\n756#1:1408,6\n768#1:1414,6\n792#1:1460,6\n793#1:1466,6\n841#1:1477,6\n931#1:1512,6\n177#1:1304\n419#1:1324\n697#1:1362\n698#1:1363\n741#1:1405\n742#1:1406\n743#1:1407\n192#1:1305\n691#1:1361\n735#1:1404\n687#1:1325\n687#1:1326,6\n687#1:1360\n687#1:1367\n731#1:1368\n731#1:1369,6\n731#1:1403\n731#1:1423\n791#1:1424\n791#1:1425,6\n791#1:1459\n791#1:1476\n687#1:1332,6\n687#1:1347,4\n687#1:1357,2\n687#1:1366\n731#1:1375,6\n731#1:1390,4\n731#1:1400,2\n731#1:1422\n791#1:1431,6\n791#1:1446,4\n791#1:1456,2\n791#1:1475\n687#1:1338,9\n687#1:1359\n687#1:1364,2\n731#1:1381,9\n731#1:1402\n731#1:1420,2\n791#1:1437,9\n791#1:1458\n791#1:1473,2\n687#1:1351,6\n731#1:1394,6\n791#1:1450,6\n820#1:1472\n1251#1:1519\n1252#1:1520\n1253#1:1521\n1254#1:1522\n1257#1:1523\n1258#1:1524\n1259#1:1525\n890#1:1483,13\n921#1:1496,16\n1032#1:1518\n*E\n"})
public final class SliderKt {
    private static final float J2;
    private static final Modifier KN;
    private static final float Uo;
    private static final TweenSpec xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f22755n = Dp.KN(10);
    private static final float rl = Dp.KN(24);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f22756t = Dp.KN(1);
    private static final float nr = Dp.KN(6);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f22754O = Dp.KN(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ViF(float f3, float f4, float f5) {
        float f6 = f4 - f3;
        float f7 = f6 == 0.0f ? 0.0f : (f5 - f3) / f6;
        float f8 = f7 >= 0.0f ? f7 : 0.0f;
        if (f8 > 1.0f) {
            return 1.0f;
        }
        return f8;
    }

    static {
        float fKN = Dp.KN(48);
        J2 = fKN;
        float fKN2 = Dp.KN(144);
        Uo = fKN2;
        KN = SizeKt.gh(SizeKt.g(Modifier.INSTANCE, fKN2, 0.0f, 2, null), 0.0f, fKN, 1, null);
        xMQ = new TweenSpec(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(final BoxScope boxScope, final Modifier modifier, final float f3, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z2, final float f4, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(428907178);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(modifier) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.rl(f3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.p5(sliderColors) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.n(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.rl(f4) ? 1048576 : 524288;
        }
        if (composerKN.HI((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(428907178, i3, -1, "androidx.compose.material.SliderThumb (Slider.kt:789)");
            }
            Modifier modifierAz = PaddingKt.az(Modifier.INSTANCE, f3, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierN = boxScope.n(modifierAz, companion.KN());
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
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
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Object objIF = composerKN.iF();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objIF == companion3.n()) {
                objIF = SnapshotStateKt.J2();
                composerKN.o(objIF);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objIF;
            boolean z3 = (i3 & 7168) == 2048;
            Object objIF2 = composerKN.iF();
            if (z3 || objIF2 == companion3.n()) {
                objIF2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                composerKN.o(objIF2);
            }
            int i5 = i3 >> 9;
            EffectsKt.O(mutableInteractionSource, (Function2) objIF2, composerKN, i5 & 14);
            float fKN = !snapshotStateList.isEmpty() ? nr : f22756t;
            Modifier modifierRl = HoverableKt.rl(IndicationKt.rl(SizeKt.S(modifier, f4, f4), mutableInteractionSource, RippleKt.J2(false, rl, 0L, 4, null)), mutableInteractionSource, false, 2, null);
            if (!z2) {
                fKN = Dp.KN(0);
            }
            SpacerKt.n(BackgroundKt.t(ShadowKt.rl(modifierRl, fKN, RoundedCornerShapeKt.J2(), false, 0L, 0L, 24, null), ((Color) sliderColors.t(z2, composerKN, ((i3 >> 15) & 14) | (i5 & 112)).getValue()).getValue(), RoundedCornerShapeKt.J2()), composerKN, 0);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
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
                    SliderKt.J2(boxScope, modifier, f3, mutableInteractionSource, sliderColors, z2, f4, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final boolean z2, final float f3, final List list, final SliderColors sliderColors, final float f4, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i2) {
        boolean z3;
        int i3;
        List list2;
        Composer composerKN = composer.KN(1679682785);
        if ((i2 & 6) == 0) {
            z3 = z2;
            i3 = (composerKN.n(z3) ? 4 : 2) | i2;
        } else {
            z3 = z2;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            list2 = list;
            i3 |= composerKN.E2(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(sliderColors) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.rl(f4) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.p5(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.p5(modifier) ? 1048576 : 524288;
        }
        int i5 = i3;
        if (composerKN.HI((599187 & i5) != 599186, i5 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(1679682785, i5, -1, "androidx.compose.material.SliderImpl (Slider.kt:685)");
            }
            Modifier modifierZmq = modifier.Zmq(KN);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
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
            Updater.O(composerN, measurePolicyUo, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            float fL = density.l(f22754O);
            float f5 = f22755n;
            float fL2 = density.l(f5);
            float fBzg = density.bzg(f4);
            float fKN = Dp.KN(f5 * 2);
            float fKN2 = Dp.KN(fBzg * f3);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i7 = i5 >> 6;
            int i8 = i5 << 9;
            Uo(SizeKt.J2(companion2, 0.0f, 1, null), sliderColors, z3, 0.0f, f3, list2, fL2, fL, composerKN, (i8 & 458752) | ((i5 << 6) & 896) | (i7 & 112) | 3078 | (i8 & 57344));
            J2(boxScopeInstance, companion2, fKN2, mutableInteractionSource, sliderColors, z2, fKN, composerKN, (i7 & 7168) | 1572918 | ((i5 << 3) & 57344) | ((i5 << 15) & 458752));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$SliderImpl$2
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
                    SliderKt.O(z2, f3, list, sliderColors, f4, mutableInteractionSource, modifier, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    private static final List T(int i2) {
        if (i2 == 0) {
            return CollectionsKt.emptyList();
        }
        int i3 = i2 + 2;
        ArrayList arrayList = new ArrayList(i3);
        for (int i5 = 0; i5 < i3; i5++) {
            arrayList.add(Float.valueOf(i5 / (i2 + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(final Modifier modifier, final SliderColors sliderColors, final boolean z2, final float f3, final float f4, final List list, final float f5, final float f6, Composer composer, final int i2) {
        int i3;
        float f7;
        float f8;
        int i5;
        Composer composerKN = composer.KN(1833126050);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(sliderColors) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.rl(f3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            f7 = f4;
            i3 |= composerKN.rl(f7) ? 16384 : 8192;
        } else {
            f7 = f4;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(list) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            f8 = f5;
            i3 |= composerKN.rl(f8) ? 1048576 : 524288;
        } else {
            f8 = f5;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.rl(f6) ? 8388608 : 4194304;
        }
        if (composerKN.HI((i3 & 4793491) != 4793490, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(1833126050, i3, -1, "androidx.compose.material.Track (Slider.kt:835)");
            }
            int i7 = ((i3 >> 6) & 14) | 48 | ((i3 << 3) & 896);
            final State stateN = sliderColors.n(z2, false, composerKN, i7);
            final State stateN2 = sliderColors.n(z2, true, composerKN, i7);
            final State stateRl = sliderColors.rl(z2, false, composerKN, i7);
            final State stateRl2 = sliderColors.rl(z2, true, composerKN, i7);
            boolean zP5 = ((29360128 & i3) == 8388608) | ((i3 & 3670016) == 1048576) | composerKN.p5(stateN) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | composerKN.p5(stateN2) | composerKN.E2(list) | composerKN.p5(stateRl) | composerKN.p5(stateRl2);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                i5 = i3;
                final float f9 = f8;
                final float f10 = f7;
                Object obj = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SliderKt$Track$1$1
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
                        boolean z3 = drawScope.getLayoutDirection() == LayoutDirection.f34161t;
                        long jN = OffsetKt.n(f9, Offset.ty(drawScope.Co()));
                        long jN2 = OffsetKt.n(Size.gh(drawScope.t()) - f9, Offset.ty(drawScope.Co()));
                        long j2 = z3 ? jN2 : jN;
                        long j3 = z3 ? jN : jN2;
                        long value = ((Color) stateN.getValue()).getValue();
                        float f11 = f6;
                        StrokeCap.Companion companion = StrokeCap.INSTANCE;
                        DrawScope.mI(drawScope, value, j2, j3, f11, companion.rl(), null, 0.0f, null, 0, 480, null);
                        DrawScope.mI(drawScope, ((Color) stateN2.getValue()).getValue(), OffsetKt.n(Offset.az(j2) + ((Offset.az(j3) - Offset.az(j2)) * f3), Offset.ty(drawScope.Co())), OffsetKt.n(Offset.az(j2) + ((Offset.az(j3) - Offset.az(j2)) * f10), Offset.ty(drawScope.Co())), f6, companion.rl(), null, 0.0f, null, 0, 480, null);
                        List list2 = list;
                        float f12 = f10;
                        float f13 = f3;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list2) {
                            float fFloatValue = ((Number) obj2).floatValue();
                            Boolean boolValueOf = Boolean.valueOf(fFloatValue > f12 || fFloatValue < f13);
                            Object arrayList = linkedHashMap.get(boolValueOf);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(boolValueOf, arrayList);
                            }
                            ((List) arrayList).add(obj2);
                        }
                        State state = stateRl;
                        State state2 = stateRl2;
                        float f14 = f6;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list3 = (List) entry.getValue();
                            ArrayList arrayList2 = new ArrayList(list3.size());
                            int size = list3.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                arrayList2.add(Offset.nr(OffsetKt.n(Offset.az(OffsetKt.rl(j2, j3, ((Number) list3.get(i8)).floatValue())), Offset.ty(drawScope.Co()))));
                            }
                            DrawScope.Fp(drawScope, arrayList2, PointMode.INSTANCE.rl(), ((Color) (zBooleanValue ? state : state2).getValue()).getValue(), f14, StrokeCap.INSTANCE.rl(), null, 0.0f, null, 0, 480, null);
                        }
                    }
                };
                composerKN.o(obj);
                objIF = obj;
            } else {
                i5 = i3;
            }
            CanvasKt.rl(modifier, (Function1) objIF, composerKN, i5 & 14);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$Track$2
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
                    SliderKt.Uo(modifier, sliderColors, z2, f3, f4, list, f5, f6, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object WPU(DraggableState draggableState, float f3, float f4, float f5, Continuation continuation) {
        Object objT = DraggableState.t(draggableState, null, new SliderKt$animateToTarget$2(f3, f4, f5, null), continuation, 1, null);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object aYN(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Continuation continuation) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        Ref.FloatRef floatRef;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            int i3 = sliderKt$awaitSlop$1.f22912O;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.f22912O = i3 - Integer.MIN_VALUE;
            } else {
                sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
            }
        }
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
        Object obj = sliderKt$awaitSlop$12.f22914t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = sliderKt$awaitSlop$12.f22912O;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Float f3) {
                    n(pointerInputChange, f3.floatValue());
                    return Unit.INSTANCE;
                }

                public final void n(PointerInputChange pointerInputChange, float f3) {
                    pointerInputChange.n();
                    floatRef2.element = f3;
                }
            };
            sliderKt$awaitSlop$12.f22913n = floatRef2;
            sliderKt$awaitSlop$12.f22912O = 1;
            Object objN = DragGestureDetectorCopyKt.n(awaitPointerEventScope, j2, i2, function2, sliderKt$awaitSlop$12);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objN;
            floatRef = floatRef2;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) sliderKt$awaitSlop$12.f22913n;
            ResultKt.throwOnFailure(obj);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
        }
        return null;
    }

    private static final Modifier fD(Modifier modifier, final boolean z2, final int i2, final ClosedFloatingPointRange closedFloatingPointRange, final float f3, final boolean z3, final State state, final State state2) {
        if (i2 >= 0) {
            return KeyInputModifierKt.n(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.material.SliderKt$slideOnKeyEvents$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return n(keyEvent.getNativeKeyEvent());
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Boolean n(android.view.KeyEvent keyEvent) {
                    if (!z2) {
                        return Boolean.FALSE;
                    }
                    int iRl = KeyEvent_androidKt.rl(keyEvent);
                    KeyEventType.Companion companion = KeyEventType.INSTANCE;
                    boolean z4 = false;
                    if (KeyEventType.J2(iRl, companion.n())) {
                        float fAbs = Math.abs(((Number) closedFloatingPointRange.getEndInclusive()).floatValue() - ((Number) closedFloatingPointRange.getStart()).floatValue());
                        int i3 = i2;
                        float f4 = fAbs / (i3 > 0 ? i3 + 1 : 100);
                        long jN = KeyEvent_androidKt.n(keyEvent);
                        Key.Companion companion2 = Key.INSTANCE;
                        if (Key.r(jN, companion2.J2())) {
                            ((Function1) state.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(f3 + f4), (ClosedFloatingPointRange<Float>) closedFloatingPointRange));
                        } else if (Key.r(jN, companion2.t())) {
                            ((Function1) state.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(f3 - f4), (ClosedFloatingPointRange<Float>) closedFloatingPointRange));
                        } else {
                            if (Key.r(jN, companion2.O())) {
                                ((Function1) state.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(f3 + ((z3 ? -1 : 1) * f4)), (ClosedFloatingPointRange<Float>) closedFloatingPointRange));
                            } else if (Key.r(jN, companion2.nr())) {
                                ((Function1) state.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(f3 - ((z3 ? -1 : 1) * f4)), (ClosedFloatingPointRange<Float>) closedFloatingPointRange));
                            } else if (Key.r(jN, companion2.mUb())) {
                                ((Function1) state.getValue()).invoke(closedFloatingPointRange.getStart());
                            } else if (Key.r(jN, companion2.xMQ())) {
                                ((Function1) state.getValue()).invoke(closedFloatingPointRange.getEndInclusive());
                            } else if (Key.r(jN, companion2.az())) {
                                ((Function1) state.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(f3 - (RangesKt.coerceIn(r1 / 10, 1, 10) * f4)), (ClosedFloatingPointRange<Float>) closedFloatingPointRange));
                            } else if (Key.r(jN, companion2.qie())) {
                                ((Function1) state.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(f3 + (RangesKt.coerceIn(r1 / 10, 1, 10) * f4)), (ClosedFloatingPointRange<Float>) closedFloatingPointRange));
                            }
                        }
                        z4 = true;
                    } else if (KeyEventType.J2(iRl, companion.rl())) {
                        long jN2 = KeyEvent_androidKt.n(keyEvent);
                        Key.Companion companion3 = Key.INSTANCE;
                        if (Key.r(jN2, companion3.J2()) ? true : Key.r(jN2, companion3.t()) ? true : Key.r(jN2, companion3.O()) ? true : Key.r(jN2, companion3.nr()) ? true : Key.r(jN2, companion3.mUb()) ? true : Key.r(jN2, companion3.xMQ()) ? true : Key.r(jN2, companion3.az()) ? true : Key.r(jN2, companion3.qie())) {
                            Function0 function0 = (Function0) state2.getValue();
                            if (function0 != null) {
                                function0.invoke();
                            }
                            z4 = true;
                        }
                    }
                    return Boolean.valueOf(z4);
                }
            });
        }
        throw new IllegalArgumentException("steps should be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier g(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, boolean z2, boolean z3, float f3, ClosedFloatingPointRange closedFloatingPointRange, State state3, State state4) {
        return z2 ? modifier.Zmq(new SuspendPointerInputElement(null, null, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f3), Boolean.valueOf(z3), closedFloatingPointRange}, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z3, f3, state3, null)), 3, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final Function1 function1, final ClosedFloatingPointRange closedFloatingPointRange, final ClosedFloatingPointRange closedFloatingPointRange2, final MutableState mutableState, final float f3, Composer composer, final int i2) {
        int i3;
        float f4;
        int i5;
        Composer composerKN = composer.KN(-743965752);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(closedFloatingPointRange2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(mutableState) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            f4 = f3;
            i3 |= composerKN.rl(f4) ? 16384 : 8192;
        } else {
            f4 = f3;
        }
        if (composerKN.HI((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-743965752, i3, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:929)");
            }
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                i5 = 0;
                final float f5 = f4;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        float fFloatValue = (((Number) closedFloatingPointRange.getEndInclusive()).floatValue() - ((Number) closedFloatingPointRange.getStart()).floatValue()) / 1000;
                        float fFloatValue2 = ((Number) function1.invoke(Float.valueOf(f5))).floatValue();
                        if (Math.abs(fFloatValue2 - ((Number) mutableState.getValue()).floatValue()) <= fFloatValue || !closedFloatingPointRange2.contains((Comparable) mutableState.getValue())) {
                            return;
                        }
                        mutableState.setValue(Float.valueOf(fFloatValue2));
                    }
                };
                composerKN.o(function0);
                objIF = function0;
            } else {
                i5 = 0;
            }
            EffectsKt.KN((Function0) objIF, composerKN, i5);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$2
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
                    SliderKt.n(function1, closedFloatingPointRange, closedFloatingPointRange2, mutableState, f3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final float nY() {
        return f22755n;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final float f3, final Function1 function1, Modifier modifier, boolean z2, ClosedFloatingPointRange closedFloatingPointRange, int i2, Function0 function0, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        boolean z3;
        ClosedFloatingPointRange closedFloatingPointRange2;
        int i9;
        int i10;
        int i11;
        Function0 function02;
        int i12;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z4;
        final Function0 function03;
        final int i13;
        final SliderColors sliderColors2;
        ScopeUpdateScope scopeUpdateScopeGh;
        ClosedFloatingPointRange closedFloatingPointRangeRangeTo;
        int i14;
        boolean z5;
        Composer composer3;
        int i15;
        SliderColors sliderColorsN;
        boolean z6;
        MutableInteractionSource mutableInteractionSource3;
        Composer composerKN = composer.KN(-1962335196);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.rl(f3) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(function1) ? 32 : 16;
        }
        int i16 = i5 & 4;
        if (i16 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z3 = z2;
                    i7 |= composerKN.n(z3) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        int i17 = composerKN.p5(closedFloatingPointRange2) ? 16384 : 8192;
                        i7 |= i17;
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i7 |= i17;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i9 = i5 & 32;
                if (i9 == 0) {
                    if ((196608 & i3) == 0) {
                        i10 = i2;
                        i7 |= composerKN.t(i10) ? 131072 : 65536;
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        if ((i3 & 1572864) == 0) {
                            i7 |= composerKN.E2(function02) ? 1048576 : 524288;
                        }
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                        i7 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i7 |= composerKN.p5(mutableInteractionSource) ? 8388608 : 4194304;
                    }
                    if ((i3 & 100663296) == 0) {
                        i7 |= ((i5 & 256) == 0 && composerKN.p5(sliderColors)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if (composerKN.HI((i7 & 38347923) == 38347922, i7 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        mutableInteractionSource2 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z4 = z3;
                        function03 = function02;
                        i13 = i10;
                        sliderColors2 = sliderColors;
                    } else {
                        composerKN.e();
                        if ((i3 & 1) == 0 || composerKN.rV9()) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i8 != 0) {
                                z3 = true;
                            }
                            if ((i5 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                                i7 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            i14 = i9 != 0 ? 0 : i10;
                            Function0 function04 = i11 != 0 ? null : function02;
                            mutableInteractionSource2 = i12 == 0 ? mutableInteractionSource : null;
                            if ((i5 & 256) != 0) {
                                z5 = true;
                                i15 = 131072;
                                composer3 = composerKN;
                                i7 &= -234881025;
                                z6 = z3;
                                sliderColorsN = SliderDefaults.f22747n.n(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 6, 1023);
                                function02 = function04;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                            } else {
                                z5 = true;
                                composer3 = composerKN;
                                i15 = 131072;
                                sliderColorsN = sliderColors;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                z6 = z3;
                                function02 = function04;
                            }
                        } else {
                            composerKN.wTp();
                            if ((i5 & 16) != 0) {
                                i7 &= -57345;
                            }
                            if ((i5 & 256) != 0) {
                                i7 &= -234881025;
                            }
                            mutableInteractionSource2 = mutableInteractionSource;
                            sliderColorsN = sliderColors;
                            z6 = z3;
                            z5 = true;
                            i14 = i10;
                            composer3 = composerKN;
                            i15 = 131072;
                        }
                        composer3.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1962335196, i7, -1, "androidx.compose.material.Slider (Slider.kt:165)");
                        }
                        if (mutableInteractionSource2 == null) {
                            composer3.eF(246381876);
                            Object objIF = composer3.iF();
                            if (objIF == Composer.INSTANCE.n()) {
                                objIF = InteractionSourceKt.n();
                                composer3.o(objIF);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objIF;
                            composer3.Xw();
                        } else {
                            composer3.eF(-407694845);
                            composer3.Xw();
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i14 < 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        State stateCk = SnapshotStateKt.ck(function1, composer3, (i7 >> 3) & 14);
                        State stateCk2 = SnapshotStateKt.ck(function02, composer3, (i7 >> 18) & 14);
                        boolean z7 = (i7 & 458752) == i15 ? z5 : false;
                        Object objIF2 = composer3.iF();
                        if (z7 || objIF2 == Composer.INSTANCE.n()) {
                            objIF2 = T(i14);
                            composer3.o(objIF2);
                        }
                        List list = (List) objIF2;
                        Modifier modifierT = InteractiveComponentSizeKt.t(modifier2);
                        float f4 = f22755n;
                        float f5 = 2;
                        Function0 function05 = function02;
                        boolean z9 = z6;
                        Modifier modifierN = FocusableKt.n(E2(SizeKt.r(modifierT, Dp.KN(f4 * f5), Dp.KN(f4 * f5), 0.0f, 0.0f, 12, null), f3, z9, function1, function05, closedFloatingPointRange2, i14), z9, mutableInteractionSource3);
                        int i18 = i14;
                        ClosedFloatingPointRange closedFloatingPointRange3 = closedFloatingPointRange2;
                        i13 = i18;
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                        Composer composer4 = composer3;
                        closedFloatingPointRange2 = closedFloatingPointRange3;
                        BoxWithConstraintsKt.n(fD(modifierN, z9, i18, closedFloatingPointRange3, f3, composer3.ty(CompositionLocalsKt.az()) == LayoutDirection.f34161t ? z5 : false, stateCk, stateCk2), null, false, ComposableLambdaKt.nr(2085116814, z5, new SliderKt$Slider$2(closedFloatingPointRange3, f3, list, function05, mutableInteractionSource4, z9, sliderColorsN, stateCk), composer4, 54), composer4, 3072, 6);
                        composer2 = composer4;
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier2;
                        z4 = z9;
                        function03 = function05;
                        sliderColors2 = sliderColorsN;
                    }
                    final ClosedFloatingPointRange closedFloatingPointRange4 = closedFloatingPointRange2;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                n(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer5, int i19) {
                                SliderKt.nr(f3, function1, modifier3, z4, closedFloatingPointRange4, i13, function03, mutableInteractionSource2, sliderColors2, composer5, RecomposeScopeImplKt.n(i3 | 1), i5);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 196608;
                i10 = i2;
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                if (composerKN.HI((i7 & 38347923) == 38347922, i7 & 1)) {
                }
                final ClosedFloatingPointRange closedFloatingPointRange42 = closedFloatingPointRange2;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i3 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i2;
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            if (composerKN.HI((i7 & 38347923) == 38347922, i7 & 1)) {
            }
            final ClosedFloatingPointRange closedFloatingPointRange422 = closedFloatingPointRange2;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        z3 = z2;
        if ((i3 & 24576) == 0) {
        }
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i2;
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if (composerKN.HI((i7 & 38347923) == 38347922, i7 & 1)) {
        }
        final ClosedFloatingPointRange closedFloatingPointRange4222 = closedFloatingPointRange2;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final ClosedFloatingPointRange closedFloatingPointRange, final Function1 function1, Modifier modifier, boolean z2, ClosedFloatingPointRange closedFloatingPointRange2, int i2, Function0 function0, SliderColors sliderColors, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        ClosedFloatingPointRange closedFloatingPointRange3;
        int i9;
        int i10;
        int i11;
        Function0 function02;
        SliderColors sliderColors2;
        Composer composer2;
        final Function0 function03;
        final Modifier modifier3;
        final int i12;
        final boolean z3;
        final SliderColors sliderColors3;
        final ClosedFloatingPointRange closedFloatingPointRange4;
        ScopeUpdateScope scopeUpdateScopeGh;
        ClosedFloatingPointRange closedFloatingPointRangeRangeTo;
        boolean z4;
        Composer composer3;
        int i13;
        boolean z5;
        Function0 function04;
        SliderColors sliderColorsN;
        int i14;
        Composer composerKN = composer.KN(-1556183027);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.p5(closedFloatingPointRange) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(function1) ? 32 : 16;
        }
        int i15 = i5 & 4;
        if (i15 != 0) {
            i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    i7 |= composerKN.n(z2) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    if ((i5 & 16) == 0) {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        int i16 = composerKN.p5(closedFloatingPointRange3) ? 16384 : 8192;
                        i7 |= i16;
                    } else {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                    }
                    i7 |= i16;
                } else {
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                    i10 = i2;
                } else {
                    i10 = i2;
                    if ((i3 & 196608) == 0) {
                        i7 |= composerKN.t(i10) ? 131072 : 65536;
                    }
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                    i7 |= 1572864;
                    function02 = function0;
                } else {
                    function02 = function0;
                    if ((i3 & 1572864) == 0) {
                        i7 |= composerKN.E2(function02) ? 1048576 : 524288;
                    }
                }
                if ((i3 & 12582912) == 0) {
                    if ((i5 & 128) == 0) {
                        sliderColors2 = sliderColors;
                        int i17 = composerKN.p5(sliderColors2) ? 8388608 : 4194304;
                        i7 |= i17;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i7 |= i17;
                } else {
                    sliderColors2 = sliderColors;
                }
                if (composerKN.HI((i7 & 4793491) != 4793490, i7 & 1)) {
                    composerKN.e();
                    if ((i3 & 1) == 0 || composerKN.rV9()) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        boolean z6 = i8 != 0 ? true : z2;
                        if ((i5 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                            i7 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange3;
                        }
                        int i18 = i9 != 0 ? 0 : i10;
                        if (i11 != 0) {
                            function02 = null;
                        }
                        if ((i5 & 128) != 0) {
                            i13 = 131072;
                            composer3 = composerKN;
                            i7 &= -29360129;
                            z5 = z6;
                            function04 = function02;
                            z4 = true;
                            sliderColorsN = SliderDefaults.f22747n.n(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 6, 1023);
                        } else {
                            z4 = true;
                            composer3 = composerKN;
                            i13 = 131072;
                            z5 = z6;
                            function04 = function02;
                            sliderColorsN = sliderColors2;
                        }
                        i14 = i18;
                    } else {
                        composerKN.wTp();
                        if ((i5 & 16) != 0) {
                            i7 &= -57345;
                        }
                        if ((i5 & 128) != 0) {
                            i7 &= -29360129;
                        }
                        z5 = z2;
                        sliderColorsN = sliderColors2;
                        z4 = true;
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange3;
                        i14 = i10;
                        composer3 = composerKN;
                        function04 = function02;
                        i13 = 131072;
                    }
                    composer3.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1556183027, i7, -1, "androidx.compose.material.RangeSlider (Slider.kt:406)");
                    }
                    Object objIF = composer3.iF();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = InteractionSourceKt.n();
                        composer3.o(objIF);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
                    Object objIF2 = composer3.iF();
                    if (objIF2 == companion.n()) {
                        objIF2 = InteractionSourceKt.n();
                        composer3.o(objIF2);
                    }
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objIF2;
                    if (i14 < 0) {
                        throw new IllegalArgumentException("steps should be >= 0");
                    }
                    State stateCk = SnapshotStateKt.ck(function1, composer3, (i7 >> 3) & 14);
                    boolean z7 = (458752 & i7) == i13 ? z4 : false;
                    Object objIF3 = composer3.iF();
                    if (z7 || objIF3 == companion.n()) {
                        objIF3 = T(i14);
                        composer3.o(objIF3);
                    }
                    List list = (List) objIF3;
                    Modifier modifierT = InteractiveComponentSizeKt.t(modifier2);
                    float f3 = f22755n;
                    Modifier modifierR = SizeKt.r(modifierT, Dp.KN(4 * f3), Dp.KN(f3 * 2), 0.0f, 0.0f, 12, null);
                    Composer composer4 = composer3;
                    ClosedFloatingPointRange closedFloatingPointRange5 = closedFloatingPointRangeRangeTo;
                    BoxWithConstraintsKt.n(modifierR, null, false, ComposableLambdaKt.nr(652589923, z4, new SliderKt$RangeSlider$2(closedFloatingPointRange5, closedFloatingPointRange, list, function04, stateCk, mutableInteractionSource, mutableInteractionSource2, z5, i14, sliderColorsN), composer4, 54), composer4, 3072, 6);
                    composer2 = composer4;
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier2;
                    closedFloatingPointRange4 = closedFloatingPointRange5;
                    function03 = function04;
                    z3 = z5;
                    i12 = i14;
                    sliderColors3 = sliderColorsN;
                } else {
                    composer2 = composerKN;
                    composer2.wTp();
                    function03 = function02;
                    modifier3 = modifier2;
                    i12 = i10;
                    z3 = z2;
                    sliderColors3 = sliderColors2;
                    closedFloatingPointRange4 = closedFloatingPointRange3;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            n(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer5, int i19) {
                            SliderKt.rl(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange4, i12, function03, sliderColors3, composer5, RecomposeScopeImplKt.n(i3 | 1), i5);
                        }
                    });
                    return;
                }
                return;
            }
            i7 |= 3072;
            if ((i3 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if (composerKN.HI((i7 & 4793491) != 4793490, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if (composerKN.HI((i7 & 4793491) != 4793490, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final boolean z2, final float f3, final float f4, final List list, final SliderColors sliderColors, final float f5, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, Modifier modifier3, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i5;
        List list2;
        SliderColors sliderColors2;
        int i7;
        final Modifier modifier4;
        Composer composerKN = composer.KN(-278895713);
        if ((i2 & 6) == 0) {
            z3 = z2;
            i5 = (composerKN.n(z3) ? 4 : 2) | i2;
        } else {
            z3 = z2;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerKN.rl(f3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.rl(f4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            list2 = list;
            i5 |= composerKN.E2(list2) ? 2048 : 1024;
        } else {
            list2 = list;
        }
        if ((i2 & 24576) == 0) {
            sliderColors2 = sliderColors;
            i5 |= composerKN.p5(sliderColors2) ? 16384 : 8192;
        } else {
            sliderColors2 = sliderColors;
        }
        if ((i2 & 196608) == 0) {
            i5 |= composerKN.rl(f5) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= composerKN.p5(mutableInteractionSource) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= composerKN.p5(mutableInteractionSource2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= composerKN.p5(modifier) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i5 |= composerKN.p5(modifier2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.p5(modifier3) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if (composerKN.HI(((i5 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true, i5 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-278895713, i5, i7, "androidx.compose.material.RangeSliderImpl (Slider.kt:726)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            final String strN = Strings_androidKt.n(companion.Uo(), composerKN, 6);
            final String strN2 = Strings_androidKt.n(companion.J2(), composerKN, 6);
            Modifier modifierZmq = modifier.Zmq(KN);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
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
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            float fL = density.l(f22754O);
            float f6 = f22755n;
            float fL2 = density.l(f6);
            float fBzg = density.bzg(f5);
            float fKN = Dp.KN(f6 * 2);
            float fKN2 = Dp.KN(fBzg * f3);
            float fKN3 = Dp.KN(fBzg * f4);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(boxScopeInstance.n(companion4, companion2.KN()), 0.0f, 1, null);
            int i8 = i5 >> 9;
            int i9 = i5 << 6;
            int i10 = i5;
            Uo(modifierJ2, sliderColors2, z3, f3, f4, list2, fL2, fL, composerKN, (i9 & 896) | (i8 & 112) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752));
            composerKN = composerKN;
            boolean zP5 = composerKN.p5(strN);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$2$1
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
                        SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN);
                    }
                };
                composerKN.o(objIF);
            }
            int i11 = i10 & 57344;
            int i12 = (i10 << 15) & 458752;
            J2(boxScopeInstance, FocusableKt.n(SemanticsModifierKt.t(companion4, true, (Function1) objIF), true, mutableInteractionSource).Zmq(modifier2), fKN2, mutableInteractionSource, sliderColors, z2, fKN, composerKN, (i8 & 7168) | 1572870 | i11 | i12);
            boolean zP52 = composerKN.p5(strN2);
            Object objIF2 = composerKN.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$3$1
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
                        SemanticsPropertiesKt.I(semanticsPropertyReceiver, strN2);
                    }
                };
                composerKN.o(objIF2);
            }
            modifier4 = modifier3;
            J2(boxScopeInstance, FocusableKt.n(SemanticsModifierKt.t(companion4, true, (Function1) objIF2), true, mutableInteractionSource2).Zmq(modifier4), fKN3, mutableInteractionSource2, sliderColors, z2, fKN, composerKN, ((i10 >> 12) & 7168) | 1572870 | i11 | i12);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            modifier4 = modifier3;
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i13) {
                    SliderKt.t(z2, f3, f4, list, sliderColors, f5, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier4, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Modifier E2(Modifier modifier, float f3, final boolean z2, final Function1 function1, final Function0 function0, final ClosedFloatingPointRange closedFloatingPointRange, final int i2) {
        final float fCoerceIn = RangesKt.coerceIn(f3, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
        return ProgressSemanticsKt.rl(SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1
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
                if (!z2) {
                    SemanticsPropertiesKt.qie(semanticsPropertyReceiver);
                }
                final ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
                final int i3 = i2;
                final float f4 = fCoerceIn;
                final Function1 function12 = function1;
                final Function0 function02 = function0;
                SemanticsPropertiesKt.pJg(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f5) {
                        return n(f5.floatValue());
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Boolean n(float f5) {
                        int i5;
                        float fCoerceIn2 = RangesKt.coerceIn(f5, ((Number) closedFloatingPointRange2.getStart()).floatValue(), ((Number) closedFloatingPointRange2.getEndInclusive()).floatValue());
                        int i7 = i3;
                        boolean z3 = false;
                        if (i7 > 0 && (i5 = i7 + 1) >= 0) {
                            float fAbs = fCoerceIn2;
                            float f6 = fAbs;
                            int i8 = 0;
                            while (true) {
                                float fRl = MathHelpersKt.rl(((Number) closedFloatingPointRange2.getStart()).floatValue(), ((Number) closedFloatingPointRange2.getEndInclusive()).floatValue(), i8 / (i3 + 1));
                                float f7 = fRl - fCoerceIn2;
                                if (Math.abs(f7) <= fAbs) {
                                    fAbs = Math.abs(f7);
                                    f6 = fRl;
                                }
                                if (i8 == i5) {
                                    break;
                                }
                                i8++;
                            }
                            fCoerceIn2 = f6;
                        }
                        if (fCoerceIn2 != f4) {
                            function12.invoke(Float.valueOf(fCoerceIn2));
                            Function0 function03 = function02;
                            if (function03 != null) {
                                function03.invoke();
                            }
                            z3 = true;
                        }
                        return Boolean.valueOf(z3);
                    }
                }, 1, null);
            }
        }, 1, null), f3, closedFloatingPointRange, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float X(float f3, List list, float f4, float f5) {
        Object obj;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float fAbs = Math.abs(MathHelpersKt.rl(f4, f5, ((Number) obj2).floatValue()) - f3);
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i2 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Object obj3 = list.get(i2);
                    float fAbs2 = Math.abs(MathHelpersKt.rl(f4, f5, ((Number) obj3).floatValue()) - f3);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        obj2 = obj3;
                        fAbs = fAbs2;
                    }
                    if (i2 == lastIndex) {
                        break;
                    }
                    i2++;
                }
            }
            obj = obj2;
        }
        Float f6 = (Float) obj;
        if (f6 != null) {
            return MathHelpersKt.rl(f4, f5, f6.floatValue());
        }
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier e(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final float f3, final boolean z2, final State state, final State state2, final MutableState mutableState, final boolean z3) {
        Function1<InspectorInfo, Unit> function1N;
        if (InspectableValueKt.rl()) {
            function1N = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                    n(inspectorInfo);
                    return Unit.INSTANCE;
                }

                public final void n(InspectorInfo inspectorInfo) {
                    inspectorInfo.rl("sliderTapModifier");
                    inspectorInfo.getProperties().n("draggableState", draggableState);
                    inspectorInfo.getProperties().n("interactionSource", mutableInteractionSource);
                    inspectorInfo.getProperties().n("maxPx", Float.valueOf(f3));
                    inspectorInfo.getProperties().n("isRtl", Boolean.valueOf(z2));
                    inspectorInfo.getProperties().n("rawOffset", state);
                    inspectorInfo.getProperties().n("gestureEndAction", state2);
                    inspectorInfo.getProperties().n("pressOffset", mutableState);
                    inspectorInfo.getProperties().n("enabled", Boolean.valueOf(z3));
                }
            };
        } else {
            function1N = InspectableValueKt.n();
        }
        return ComposedModifierKt.rl(modifier, function1N, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return n(modifier2, composer, num.intValue());
            }

            public final Modifier n(Modifier modifier2, Composer composer, int i2) {
                composer.eF(1945228890);
                if (ComposerKt.v()) {
                    ComposerKt.p5(1945228890, i2, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:1002)");
                }
                if (z3) {
                    composer.eF(-394118969);
                    Object objIF = composer.iF();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objIF == companion.n()) {
                        objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer);
                        composer.o(objIF);
                    }
                    vd vdVar = (vd) objIF;
                    Object[] objArr = {draggableState, mutableInteractionSource, Float.valueOf(f3), Boolean.valueOf(z2)};
                    boolean zN = composer.n(z2) | composer.rl(f3) | composer.p5(mutableState) | composer.p5(state) | composer.E2(vdVar) | composer.E2(draggableState) | composer.p5(state2);
                    boolean z4 = z2;
                    float f4 = f3;
                    MutableState mutableState2 = mutableState;
                    State state3 = state;
                    DraggableState draggableState2 = draggableState;
                    State state4 = state2;
                    Object objIF2 = composer.iF();
                    if (zN || objIF2 == companion.n()) {
                        Object sliderKt$sliderTapModifier$2$1$1 = new SliderKt$sliderTapModifier$2$1$1(z4, f4, mutableState2, state3, vdVar, draggableState2, state4, null);
                        composer.o(sliderKt$sliderTapModifier$2$1$1);
                        objIF2 = sliderKt$sliderTapModifier$2$1$1;
                    }
                    modifier2 = modifier2.Zmq(new SuspendPointerInputElement(null, null, objArr, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objIF2), 3, null));
                    composer.Xw();
                } else {
                    composer.eF(-393026932);
                    composer.Xw();
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                composer.Xw();
                return modifier2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ClosedFloatingPointRange iF(float f3, float f4, ClosedFloatingPointRange closedFloatingPointRange, float f5, float f6) {
        return RangesKt.rangeTo(te(f3, f4, ((Number) closedFloatingPointRange.getStart()).floatValue(), f5, f6), te(f3, f4, ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), f5, f6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float te(float f3, float f4, float f5, float f6, float f7) {
        return MathHelpersKt.rl(f6, f7, ViF(f3, f4, f5));
    }
}
