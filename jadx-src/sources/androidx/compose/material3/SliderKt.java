package androidx.compose.material3;

import ScC.FuwU.XIvb;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.DragGestureDetectorCopyKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aµ\u0001\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001au\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0081\u0001\u0010\u001e\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aæ\u0001\u0010%\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\u0019\b\u0002\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\b\b\u0003\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010&\u001a\u009a\u0001\u0010'\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\"2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\u0019\b\u0002\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b'\u0010(\u001aa\u0010)\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b)\u0010*\u001a\u0082\u0001\u0010+\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b+\u0010,\u001a/\u00102\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0000H\u0002¢\u0006\u0004\b2\u00103\u001a5\u0010;\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0000\u0018\u000109*\u0002042\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0082@ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0017\u0010=\u001a\u00020.2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b=\u0010>\u001a7\u0010D\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0002¢\u0006\u0004\bD\u0010E\u001a:\u0010H\u001a\u00020F2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a'\u0010M\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u0000H\u0002¢\u0006\u0004\bM\u0010N\u001a#\u0010O\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bO\u0010P\u001a#\u0010Q\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bQ\u0010R\u001a#\u0010S\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bS\u0010R\u001a+\u0010T\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\bT\u0010U\u001a3\u0010V\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\bV\u0010W\u001a\u001f\u0010Z\u001a\u00020F2\u0006\u0010X\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u0000H\u0001¢\u0006\u0004\bZ\u0010[\"\u001a\u0010`\u001a\u00020\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010]\u001a\u0004\b^\u0010_\"\u001a\u0010b\u001a\u00020\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010]\u001a\u0004\ba\u0010_\"\u0014\u0010c\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010]\"\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010e\"\u0014\u0010g\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010]\"\u0014\u0010h\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010]\"\u001e\u0010m\u001a\u00020\u0007*\u00020F8@X\u0081\u0004¢\u0006\f\u0012\u0004\bk\u0010l\u001a\u0004\bi\u0010j\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006n"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/material3/SliderColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "J2", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SliderState;", "Landroidx/compose/runtime/Composable;", "thumb", "track", "O", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/Composer;III)V", "state", "Uo", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rl", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "startInteractionSource", "endInteractionSource", "Landroidx/compose/material3/RangeSliderState;", "startThumb", "endThumb", "t", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", c.f62177j, "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "KN", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "nr", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "current", "", "tickFractions", "minPx", "maxPx", "e", "(F[FFF)F", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "XQ", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "X", "(I)[F", "a1", "b1", "x1", "a2", "b2", "te", "(FFFFF)F", "Landroidx/compose/material3/SliderRange;", "x", "iF", "(FFJFF)J", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "pos", "S", "(FFF)F", "fD", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;Z)Landroidx/compose/ui/Modifier;", "g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;Z)Landroidx/compose/ui/Modifier;", "ViF", "E2", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;", "nY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;", TtmlNode.START, "endInclusive", "xMQ", "(FF)J", "Landroidx/compose/ui/unit/Dp;", "F", "WPU", "()F", "TrackHeight", "getThumbWidth", "ThumbWidth", "ThumbHeight", "Landroidx/compose/ui/unit/DpSize;", "J", "ThumbSize", "ThumbTrackGapSize", "TrackInsideCornerSize", "aYN", "(J)Z", "isSpecified-If1S1O4$annotations", "(J)V", "isSpecified", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2263:1\n1223#2,6:2264\n1223#2,6:2270\n1223#2,6:2276\n1223#2,6:2282\n1223#2,6:2289\n1223#2,6:2295\n1223#2,6:2301\n1223#2,6:2307\n1223#2,6:2313\n1223#2,6:2319\n1223#2,6:2325\n1223#2,6:2331\n1223#2,6:2338\n1223#2,6:2344\n1223#2,6:2378\n1223#2,6:2470\n1223#2,6:2504\n1223#2,6:2510\n1223#2,6:2556\n1223#2,6:2562\n1#3:2288\n77#4:2337\n77#4:2467\n78#5,6:2350\n85#5,4:2365\n89#5,2:2375\n78#5,6:2391\n85#5,4:2406\n89#5,2:2416\n93#5:2422\n78#5,6:2431\n85#5,4:2446\n89#5,2:2456\n93#5:2462\n93#5:2466\n78#5,6:2476\n85#5,4:2491\n89#5,2:2501\n78#5,6:2523\n85#5,4:2538\n89#5,2:2548\n93#5:2554\n78#5,6:2575\n85#5,4:2590\n89#5,2:2600\n93#5:2606\n78#5,6:2615\n85#5,4:2630\n89#5,2:2640\n93#5:2646\n93#5:2650\n368#6,9:2356\n377#6:2377\n368#6,9:2397\n377#6:2418\n378#6,2:2420\n368#6,9:2437\n377#6:2458\n378#6,2:2460\n378#6,2:2464\n368#6,9:2482\n377#6:2503\n368#6,9:2529\n377#6:2550\n378#6,2:2552\n368#6,9:2581\n377#6:2602\n378#6,2:2604\n368#6,9:2621\n377#6:2642\n378#6,2:2644\n378#6,2:2648\n4032#7,6:2369\n4032#7,6:2410\n4032#7,6:2450\n4032#7,6:2495\n4032#7,6:2542\n4032#7,6:2594\n4032#7,6:2634\n71#8:2384\n68#8,6:2385\n74#8:2419\n78#8:2423\n71#8:2424\n68#8,6:2425\n74#8:2459\n78#8:2463\n71#8:2516\n68#8,6:2517\n74#8:2551\n78#8:2555\n71#8:2568\n68#8,6:2569\n74#8:2603\n78#8:2607\n71#8:2608\n68#8,6:2609\n74#8:2643\n78#8:2647\n57#9:2468\n60#9:2469\n16867#10,14:2651\n63#11,3:2665\n63#11,3:2668\n148#12:2671\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n*L\n169#1:2264,6\n258#1:2270,6\n273#1:2276,6\n341#1:2282,6\n411#1:2289,6\n412#1:2295,6\n513#1:2301,6\n514#1:2307,6\n539#1:2313,6\n550#1:2319,6\n618#1:2325,6\n619#1:2331,6\n674#1:2338,6\n699#1:2344,6\n683#1:2378,6\n785#1:2470,6\n756#1:2504,6\n758#1:2510,6\n769#1:2556,6\n771#1:2562,6\n666#1:2337\n737#1:2467\n679#1:2350,6\n679#1:2365,4\n679#1:2375,2\n681#1:2391,6\n681#1:2406,4\n681#1:2416,2\n681#1:2422\n689#1:2431,6\n689#1:2446,4\n689#1:2456,2\n689#1:2462\n679#1:2466\n750#1:2476,6\n750#1:2491,4\n750#1:2501,2\n752#1:2523,6\n752#1:2538,4\n752#1:2548,2\n752#1:2554\n765#1:2575,6\n765#1:2590,4\n765#1:2600,2\n765#1:2606\n778#1:2615,6\n778#1:2630,4\n778#1:2640,2\n778#1:2646\n750#1:2650\n679#1:2356,9\n679#1:2377\n681#1:2397,9\n681#1:2418\n681#1:2420,2\n689#1:2437,9\n689#1:2458\n689#1:2460,2\n679#1:2464,2\n750#1:2482,9\n750#1:2503\n752#1:2529,9\n752#1:2550\n752#1:2552,2\n765#1:2581,9\n765#1:2602\n765#1:2604,2\n778#1:2621,9\n778#1:2642\n778#1:2644,2\n750#1:2648,2\n679#1:2369,6\n681#1:2410,6\n689#1:2450,6\n750#1:2495,6\n752#1:2542,6\n765#1:2594,6\n778#1:2634,6\n681#1:2384\n681#1:2385,6\n681#1:2419\n681#1:2423\n689#1:2424\n689#1:2425,6\n689#1:2459\n689#1:2463\n752#1:2516\n752#1:2517,6\n752#1:2551\n752#1:2555\n765#1:2568\n765#1:2569,6\n765#1:2603\n765#1:2607\n778#1:2608\n778#1:2609,6\n778#1:2643\n778#1:2647\n747#1:2468\n748#1:2469\n1413#1:2651,14\n2238#1:2665,3\n2256#1:2668,3\n1869#1:2671\n*E\n"})
public final class SliderKt {
    private static final float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f27628O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f27629n;
    private static final long nr;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f27630t;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float S(float f3, float f4, float f5) {
        float f6 = f4 - f3;
        return RangesKt.coerceIn(f6 == 0.0f ? 0.0f : (f5 - f3) / f6, 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] X(int i2) {
        if (i2 == 0) {
            return new float[0];
        }
        int i3 = i2 + 2;
        float[] fArr = new float[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            fArr[i5] = i5 / (i2 + 1);
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static final float e(float f3, float[] fArr, float f4, float f5) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f6 = fArr[0];
            int lastIndex = ArraysKt.getLastIndex(fArr);
            if (lastIndex == 0) {
                fValueOf = Float.valueOf(f6);
            } else {
                float fAbs = Math.abs(MathHelpersKt.rl(f4, f5, f6) - f3);
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    float f7 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(MathHelpersKt.rl(f4, f5, f7) - f3);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f6 = f7;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f6);
            }
        }
        return fValueOf != null ? MathHelpersKt.rl(f4, f5, fValueOf.floatValue()) : f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final ClosedFloatingPointRange closedFloatingPointRange, final Function1 function1, Modifier modifier, boolean z2, ClosedFloatingPointRange closedFloatingPointRange2, Function0 function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3 function3, Function3 function32, Function3 function33, int i2, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        final boolean z3;
        ClosedFloatingPointRange closedFloatingPointRangeRangeTo;
        int i10;
        Function0 function02;
        final SliderColors sliderColorsXMQ;
        int i11;
        MutableInteractionSource mutableInteractionSource3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Function0 function03;
        final MutableInteractionSource mutableInteractionSource4;
        final MutableInteractionSource mutableInteractionSource5;
        Modifier modifier3;
        Function3 function3Nr;
        Function3 function34;
        Function3 function3Nr2;
        Function3 function35;
        Function3 function3Nr3;
        int i22;
        Function3 function36;
        int i23;
        Function3 function37;
        Function3 function38;
        boolean z4;
        boolean z5;
        Object objIF;
        int i24;
        boolean z6;
        Object objIF2;
        Composer composer2;
        final Function3 function39;
        final boolean z7;
        final ClosedFloatingPointRange closedFloatingPointRange3;
        final Function0 function04;
        final SliderColors sliderColors2;
        final MutableInteractionSource mutableInteractionSource6;
        final MutableInteractionSource mutableInteractionSource7;
        final Function3 function310;
        final Function3 function311;
        final Modifier modifier4;
        final int i25;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1048796133);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(closedFloatingPointRange) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i3 & 48) == 0) {
            i8 |= composerKN.E2(function1) ? 32 : 16;
        }
        int i26 = i7 & 4;
        if (i26 != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z3 = z2;
                    i8 |= composerKN.n(z3) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    if ((i7 & 16) == 0) {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        int i27 = composerKN.p5(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                        i8 |= i27;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    i8 |= i27;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                i10 = i7 & 32;
                if (i10 != 0) {
                    i8 |= 196608;
                    function02 = function0;
                } else {
                    function02 = function0;
                    if ((i3 & 196608) == 0) {
                        i8 |= composerKN.E2(function02) ? 131072 : 65536;
                    }
                }
                if ((i3 & 1572864) == 0) {
                    sliderColorsXMQ = sliderColors;
                    i8 |= ((i7 & 64) == 0 && composerKN.p5(sliderColorsXMQ)) ? 1048576 : 524288;
                } else {
                    sliderColorsXMQ = sliderColors;
                }
                i11 = i7 & 128;
                if (i11 != 0) {
                    i8 |= 12582912;
                    mutableInteractionSource3 = mutableInteractionSource;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource;
                    if ((i3 & 12582912) == 0) {
                        i8 |= composerKN.p5(mutableInteractionSource3) ? 8388608 : 4194304;
                    }
                }
                i12 = i7 & 256;
                if (i12 != 0) {
                    i8 |= 100663296;
                } else {
                    if ((i3 & 100663296) == 0) {
                        i13 = i12;
                        i8 |= composerKN.p5(mutableInteractionSource2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    i14 = i7 & 512;
                    if (i14 == 0) {
                        i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    } else {
                        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i15 = i14;
                            i8 |= composerKN.E2(function3) ? 536870912 : 268435456;
                        }
                        i16 = i7 & 1024;
                        if (i16 != 0) {
                            i18 = i5 | 6;
                            i17 = i16;
                        } else if ((i5 & 6) == 0) {
                            i17 = i16;
                            i18 = i5 | (composerKN.E2(function32) ? 4 : 2);
                        } else {
                            i17 = i16;
                            i18 = i5;
                        }
                        i19 = i7 & 2048;
                        if (i19 != 0) {
                            i18 |= 48;
                            i20 = i19;
                        } else if ((i5 & 48) == 0) {
                            i20 = i19;
                            i18 |= composerKN.E2(function33) ? 32 : 16;
                        } else {
                            i20 = i19;
                        }
                        int i28 = i18;
                        i21 = i7 & 4096;
                        if (i21 == 0) {
                            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i28 |= composerKN.t(i2) ? 256 : 128;
                            }
                            if ((i8 & 306783379) != 306783378 && (i28 & 147) == 146 && composerKN.xMQ()) {
                                composerKN.wTp();
                                function310 = function3;
                                composer2 = composerKN;
                                z7 = z3;
                                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                                sliderColors2 = sliderColorsXMQ;
                                function04 = function02;
                                mutableInteractionSource6 = mutableInteractionSource3;
                                modifier4 = modifier2;
                                mutableInteractionSource7 = mutableInteractionSource2;
                                function311 = function32;
                                function39 = function33;
                                i25 = i2;
                            } else {
                                composerKN.e();
                                if ((i3 & 1) != 0 || composerKN.rV9()) {
                                    Modifier modifier5 = i26 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i9 != 0) {
                                        z3 = true;
                                    }
                                    if ((i7 & 16) != 0) {
                                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                                        i8 &= -57345;
                                    }
                                    function03 = i10 == 0 ? null : function02;
                                    if ((i7 & 64) != 0) {
                                        sliderColorsXMQ = SliderDefaults.f27553n.xMQ(composerKN, 6);
                                        i8 &= -3670017;
                                    }
                                    if (i11 == 0) {
                                        Object objIF3 = composerKN.iF();
                                        if (objIF3 == Composer.INSTANCE.n()) {
                                            objIF3 = InteractionSourceKt.n();
                                            composerKN.o(objIF3);
                                        }
                                        mutableInteractionSource4 = (MutableInteractionSource) objIF3;
                                    } else {
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    if (i13 == 0) {
                                        Object objIF4 = composerKN.iF();
                                        if (objIF4 == Composer.INSTANCE.n()) {
                                            objIF4 = InteractionSourceKt.n();
                                            composerKN.o(objIF4);
                                        }
                                        mutableInteractionSource5 = (MutableInteractionSource) objIF4;
                                    } else {
                                        mutableInteractionSource5 = mutableInteractionSource2;
                                    }
                                    if (i15 == 0) {
                                        modifier3 = modifier5;
                                        function3Nr = ComposableLambdaKt.nr(-1963073082, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$7
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer3, Integer num) {
                                                n(rangeSliderState, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(RangeSliderState rangeSliderState, Composer composer3, int i29) {
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1963073082, i29, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:515)");
                                                }
                                                SliderDefaults.f27553n.n(mutableInteractionSource4, null, sliderColorsXMQ, z3, 0L, composer3, 196608, 18);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    } else {
                                        modifier3 = modifier5;
                                        function3Nr = function3;
                                    }
                                    if (i17 == 0) {
                                        function34 = function3Nr;
                                        function3Nr2 = ComposableLambdaKt.nr(1908709951, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer3, Integer num) {
                                                n(rangeSliderState, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(RangeSliderState rangeSliderState, Composer composer3, int i29) {
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1908709951, i29, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:522)");
                                                }
                                                SliderDefaults.f27553n.n(mutableInteractionSource5, null, sliderColorsXMQ, z3, 0L, composer3, 196608, 18);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    } else {
                                        function34 = function3Nr;
                                        function3Nr2 = function32;
                                    }
                                    if (i20 == 0) {
                                        function35 = function3Nr2;
                                        function3Nr3 = ComposableLambdaKt.nr(-429193201, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$9
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer3, Integer num) {
                                                n(rangeSliderState, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(RangeSliderState rangeSliderState, Composer composer3, int i29) {
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-429193201, i29, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:529)");
                                                }
                                                SliderDefaults.f27553n.O(rangeSliderState, null, z3, sliderColorsXMQ, null, null, 0.0f, 0.0f, composer3, (i29 & 14) | 100663296, 242);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    } else {
                                        function35 = function3Nr2;
                                        function3Nr3 = function33;
                                    }
                                    modifier2 = modifier3;
                                    if (i21 == 0) {
                                        function36 = function3Nr3;
                                        i23 = i8;
                                        i22 = 0;
                                    } else {
                                        i22 = i2;
                                        function36 = function3Nr3;
                                        i23 = i8;
                                    }
                                    function37 = function34;
                                    function38 = function35;
                                } else {
                                    composerKN.wTp();
                                    if ((i7 & 16) != 0) {
                                        i8 &= -57345;
                                    }
                                    if ((i7 & 64) != 0) {
                                        i8 &= -3670017;
                                    }
                                    function37 = function3;
                                    i22 = i2;
                                    i23 = i8;
                                    function03 = function02;
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                    mutableInteractionSource5 = mutableInteractionSource2;
                                    function38 = function32;
                                    function36 = function33;
                                }
                                composerKN.S();
                                Function3 function312 = function37;
                                if (ComposerKt.v()) {
                                    z4 = z3;
                                } else {
                                    z4 = z3;
                                    ComposerKt.p5(-1048796133, i23, i28, "androidx.compose.material3.RangeSlider (Slider.kt:536)");
                                }
                                z5 = ((i28 & 896) != 256) | ((((57344 & i23) ^ 24576) <= 16384 && composerKN.p5(closedFloatingPointRangeRangeTo)) || (i23 & 24576) == 16384);
                                objIF = composerKN.iF();
                                if (z5 || objIF == Composer.INSTANCE.n()) {
                                    int i29 = i22;
                                    objIF = new RangeSliderState(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), i29, function03, closedFloatingPointRangeRangeTo);
                                    i24 = i29;
                                    composerKN.o(objIF);
                                } else {
                                    i24 = i22;
                                }
                                RangeSliderState rangeSliderState = (RangeSliderState) objIF;
                                rangeSliderState.N(function03);
                                int i30 = i24;
                                int i31 = i28;
                                z6 = (i23 & 112) != 32;
                                objIF2 = composerKN.iF();
                                if (!z6 || objIF2 == Composer.INSTANCE.n()) {
                                    objIF2 = new Function1<SliderRange, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$10$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SliderRange sliderRange) {
                                            n(sliderRange.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(long j2) {
                                            function1.invoke(RangesKt.rangeTo(SliderRange.Uo(j2), SliderRange.J2(j2)));
                                        }
                                    };
                                    composerKN.o(objIF2);
                                }
                                rangeSliderState.T((Function1) objIF2);
                                rangeSliderState.iF(((Number) closedFloatingPointRange.getStart()).floatValue());
                                rangeSliderState.g(((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
                                int i32 = i23 >> 9;
                                int i33 = ((i23 >> 3) & 1008) | (57344 & i32) | (458752 & i32) | (i32 & 3670016);
                                int i34 = i31 << 21;
                                boolean z9 = z4;
                                Function3 function313 = function38;
                                Function3 function314 = function36;
                                n(rangeSliderState, modifier2, z9, null, mutableInteractionSource4, mutableInteractionSource5, function312, function313, function314, composerKN, i33 | (29360128 & i34) | (i34 & 234881024), 8);
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                function39 = function314;
                                z7 = z9;
                                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                                function04 = function03;
                                sliderColors2 = sliderColorsXMQ;
                                mutableInteractionSource6 = mutableInteractionSource4;
                                mutableInteractionSource7 = mutableInteractionSource5;
                                function310 = function312;
                                function311 = function313;
                                modifier4 = modifier2;
                                i25 = i30;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$11
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i35) {
                                        SliderKt.t(closedFloatingPointRange, function1, modifier4, z7, closedFloatingPointRange3, function04, sliderColors2, mutableInteractionSource6, mutableInteractionSource7, function310, function311, function39, i25, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i28 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        if ((i8 & 306783379) != 306783378) {
                            composerKN.e();
                            if ((i3 & 1) != 0) {
                                if (i26 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if ((i7 & 16) != 0) {
                                }
                                if (i10 == 0) {
                                }
                                if ((i7 & 64) != 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                modifier2 = modifier3;
                                if (i21 == 0) {
                                }
                                function37 = function34;
                                function38 = function35;
                                composerKN.S();
                                Function3 function3122 = function37;
                                if (ComposerKt.v()) {
                                }
                                if (((57344 & i23) ^ 24576) <= 16384) {
                                    z5 = ((i28 & 896) != 256) | ((((57344 & i23) ^ 24576) <= 16384 && composerKN.p5(closedFloatingPointRangeRangeTo)) || (i23 & 24576) == 16384);
                                    objIF = composerKN.iF();
                                    if (z5) {
                                        int i292 = i22;
                                        objIF = new RangeSliderState(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), i292, function03, closedFloatingPointRangeRangeTo);
                                        i24 = i292;
                                        composerKN.o(objIF);
                                        RangeSliderState rangeSliderState2 = (RangeSliderState) objIF;
                                        rangeSliderState2.N(function03);
                                        int i302 = i24;
                                        int i312 = i28;
                                        if ((i23 & 112) != 32) {
                                        }
                                        objIF2 = composerKN.iF();
                                        if (!z6) {
                                            objIF2 = new Function1<SliderRange, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$10$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SliderRange sliderRange) {
                                                    n(sliderRange.getPackedValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(long j2) {
                                                    function1.invoke(RangesKt.rangeTo(SliderRange.Uo(j2), SliderRange.J2(j2)));
                                                }
                                            };
                                            composerKN.o(objIF2);
                                            rangeSliderState2.T((Function1) objIF2);
                                            rangeSliderState2.iF(((Number) closedFloatingPointRange.getStart()).floatValue());
                                            rangeSliderState2.g(((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
                                            int i322 = i23 >> 9;
                                            int i332 = ((i23 >> 3) & 1008) | (57344 & i322) | (458752 & i322) | (i322 & 3670016);
                                            int i342 = i312 << 21;
                                            boolean z92 = z4;
                                            Function3 function3132 = function38;
                                            Function3 function3142 = function36;
                                            n(rangeSliderState2, modifier2, z92, null, mutableInteractionSource4, mutableInteractionSource5, function3122, function3132, function3142, composerKN, i332 | (29360128 & i342) | (i342 & 234881024), 8);
                                            composer2 = composerKN;
                                            if (ComposerKt.v()) {
                                            }
                                            function39 = function3142;
                                            z7 = z92;
                                            closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                                            function04 = function03;
                                            sliderColors2 = sliderColorsXMQ;
                                            mutableInteractionSource6 = mutableInteractionSource4;
                                            mutableInteractionSource7 = mutableInteractionSource5;
                                            function310 = function3122;
                                            function311 = function3132;
                                            modifier4 = modifier2;
                                            i25 = i302;
                                        }
                                    }
                                } else {
                                    z5 = ((i28 & 896) != 256) | ((((57344 & i23) ^ 24576) <= 16384 && composerKN.p5(closedFloatingPointRangeRangeTo)) || (i23 & 24576) == 16384);
                                    objIF = composerKN.iF();
                                    if (z5) {
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i7 & 1024;
                    if (i16 != 0) {
                    }
                    i19 = i7 & 2048;
                    if (i19 != 0) {
                    }
                    int i282 = i18;
                    i21 = i7 & 4096;
                    if (i21 == 0) {
                    }
                    if ((i8 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i13 = i12;
                i14 = i7 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i7 & 1024;
                if (i16 != 0) {
                }
                i19 = i7 & 2048;
                if (i19 != 0) {
                }
                int i2822 = i18;
                i21 = i7 & 4096;
                if (i21 == 0) {
                }
                if ((i8 & 306783379) != 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i3 & 24576) == 0) {
            }
            i10 = i7 & 32;
            if (i10 != 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            i11 = i7 & 128;
            if (i11 != 0) {
            }
            i12 = i7 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i7 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i7 & 1024;
            if (i16 != 0) {
            }
            i19 = i7 & 2048;
            if (i19 != 0) {
            }
            int i28222 = i18;
            i21 = i7 & 4096;
            if (i21 == 0) {
            }
            if ((i8 & 306783379) != 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        z3 = z2;
        if ((i3 & 24576) == 0) {
        }
        i10 = i7 & 32;
        if (i10 != 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        i11 = i7 & 128;
        if (i11 != 0) {
        }
        i12 = i7 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i7 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i7 & 1024;
        if (i16 != 0) {
        }
        i19 = i7 & 2048;
        if (i19 != 0) {
        }
        int i282222 = i18;
        i21 = i7 & 4096;
        if (i21 == 0) {
        }
        if ((i8 & 306783379) != 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    static {
        SliderTokens sliderTokens = SliderTokens.f29892n;
        f27629n = sliderTokens.ty();
        float fQie = sliderTokens.qie();
        rl = fQie;
        float fMUb = sliderTokens.mUb();
        f27630t = fMUb;
        nr = DpKt.rl(fQie, fMUb);
        f27628O = sliderTokens.n();
        J2 = Dp.KN(2);
    }

    private static final Modifier E2(Modifier modifier, SliderState sliderState, MutableInteractionSource mutableInteractionSource, boolean z2) {
        return z2 ? modifier.Zmq(new SuspendPointerInputElement(sliderState, mutableInteractionSource, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new SliderKt$sliderTapModifier$1(sliderState, null)), 4, null)) : modifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(final float f3, final Function1 function1, Modifier modifier, boolean z2, ClosedFloatingPointRange closedFloatingPointRange, int i2, Function0 function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i3, final int i5) {
        float f4;
        int i7;
        Function1 function12;
        Modifier modifier2;
        int i8;
        boolean z3;
        ClosedFloatingPointRange closedFloatingPointRangeRangeTo;
        int i9;
        int i10;
        int i11;
        Function0 function02;
        int i12;
        int i13;
        int i14;
        final SliderColors sliderColorsXMQ;
        final MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        ClosedFloatingPointRange closedFloatingPointRange2;
        int i15;
        Function0 function03;
        int i16;
        Composer composer2;
        final Modifier modifier4;
        final boolean z4;
        final Function0 function04;
        final SliderColors sliderColors2;
        final MutableInteractionSource mutableInteractionSource3;
        final int i17;
        final ClosedFloatingPointRange closedFloatingPointRange3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-202044027);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
            f4 = f3;
        } else {
            f4 = f3;
            if ((i3 & 6) == 0) {
                i7 = (composerKN.rl(f4) ? 4 : 2) | i3;
            } else {
                i7 = i3;
            }
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i3 & 48) == 0) {
                i7 |= composerKN.E2(function12) ? 32 : 16;
            }
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
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
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                        int i19 = composerKN.p5(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                        i7 |= i19;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    }
                    i7 |= i19;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else {
                    if ((196608 & i3) == 0) {
                        i10 = i2;
                        i7 |= composerKN.t(i10) ? 131072 : 65536;
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                    } else {
                        if ((1572864 & i3) == 0) {
                            function02 = function0;
                            i7 |= composerKN.E2(function02) ? 1048576 : 524288;
                        }
                        if ((i3 & 12582912) == 0) {
                            i7 |= ((i5 & 128) == 0 && composerKN.p5(sliderColors)) ? 8388608 : 4194304;
                        }
                        i12 = i5 & 256;
                        if (i12 == 0) {
                            if ((i3 & 100663296) == 0) {
                                i13 = i12;
                                i7 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            int i20 = i7;
                            if ((i7 & 38347923) == 38347922 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i3 & 1) != 0 || composerKN.rV9()) {
                                    if (i18 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        z3 = true;
                                    }
                                    if ((i5 & 16) == 0) {
                                        i14 = i20 & (-57345);
                                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                                    } else {
                                        i14 = i20;
                                    }
                                    if (i9 != 0) {
                                        i10 = 0;
                                    }
                                    if (i11 != 0) {
                                        function02 = null;
                                    }
                                    if ((i5 & 128) == 0) {
                                        sliderColorsXMQ = SliderDefaults.f27553n.xMQ(composerKN, 6);
                                        i14 &= -29360129;
                                    } else {
                                        sliderColorsXMQ = sliderColors;
                                    }
                                    if (i13 == 0) {
                                        Object objIF = composerKN.iF();
                                        if (objIF == Composer.INSTANCE.n()) {
                                            objIF = InteractionSourceKt.n();
                                            composerKN.o(objIF);
                                        }
                                        mutableInteractionSource2 = (MutableInteractionSource) objIF;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    modifier3 = modifier2;
                                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                    i15 = i10;
                                    function03 = function02;
                                    i16 = -202044027;
                                } else {
                                    composerKN.wTp();
                                    int i21 = (i5 & 16) != 0 ? i20 & (-57345) : i20;
                                    if ((i5 & 128) != 0) {
                                        i21 &= -29360129;
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i14 = i21;
                                    modifier3 = modifier2;
                                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                    i15 = i10;
                                    function03 = function02;
                                    i16 = -202044027;
                                    sliderColorsXMQ = sliderColors;
                                }
                                final boolean z5 = z3;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(i16, i14, -1, "androidx.compose.material3.Slider (Slider.kt:169)");
                                }
                                int i22 = i14 >> 6;
                                SliderColors sliderColors3 = sliderColorsXMQ;
                                composer2 = composerKN;
                                MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                O(f4, function12, modifier3, z5, function03, sliderColors3, mutableInteractionSource4, i15, ComposableLambdaKt.nr(308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer3, Integer num) {
                                        n(sliderState, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SliderState sliderState, Composer composer3, int i23) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(308249025, i23, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:180)");
                                        }
                                        SliderDefaults.f27553n.n(mutableInteractionSource2, null, sliderColorsXMQ, z5, 0L, composer3, 196608, 18);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), ComposableLambdaKt.nr(-1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer3, Integer num) {
                                        n(sliderState, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SliderState sliderState, Composer composer3, int i23) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1843234110, i23, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
                                        }
                                        SliderDefaults.f27553n.J2(sliderState, null, z5, sliderColorsXMQ, null, null, 0.0f, 0.0f, composer3, (i23 & 14) | 100663296, 242);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), closedFloatingPointRange2, composer2, (i14 & 14) | 905969664 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i22) | (458752 & i22) | (i22 & 3670016) | ((i14 << 6) & 29360128), (i14 >> 12) & 14, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier4 = modifier3;
                                z4 = z5;
                                function04 = function03;
                                sliderColors2 = sliderColors3;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                i17 = i15;
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                            } else {
                                composerKN.wTp();
                                sliderColors2 = sliderColors;
                                composer2 = composerKN;
                                modifier4 = modifier2;
                                z4 = z3;
                                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                                i17 = i10;
                                function04 = function02;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i23) {
                                        SliderKt.J2(f3, function1, modifier4, z4, closedFloatingPointRange3, i17, function04, sliderColors2, mutableInteractionSource3, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 |= 100663296;
                        i13 = i12;
                        int i202 = i7;
                        if ((i7 & 38347923) == 38347922) {
                            composerKN.e();
                            if ((i3 & 1) != 0) {
                                if (i18 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if ((i5 & 16) == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i11 != 0) {
                                }
                                if ((i5 & 128) == 0) {
                                }
                                if (i13 == 0) {
                                }
                                modifier3 = modifier2;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                i15 = i10;
                                function03 = function02;
                                i16 = -202044027;
                                final boolean z52 = z3;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                int i222 = i14 >> 6;
                                SliderColors sliderColors32 = sliderColorsXMQ;
                                composer2 = composerKN;
                                MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                                O(f4, function12, modifier3, z52, function03, sliderColors32, mutableInteractionSource42, i15, ComposableLambdaKt.nr(308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer3, Integer num) {
                                        n(sliderState, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SliderState sliderState, Composer composer3, int i23) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(308249025, i23, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:180)");
                                        }
                                        SliderDefaults.f27553n.n(mutableInteractionSource2, null, sliderColorsXMQ, z52, 0L, composer3, 196608, 18);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), ComposableLambdaKt.nr(-1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer3, Integer num) {
                                        n(sliderState, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(SliderState sliderState, Composer composer3, int i23) {
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1843234110, i23, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
                                        }
                                        SliderDefaults.f27553n.J2(sliderState, null, z52, sliderColorsXMQ, null, null, 0.0f, 0.0f, composer3, (i23 & 14) | 100663296, 242);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), closedFloatingPointRange2, composer2, (i14 & 14) | 905969664 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i222) | (458752 & i222) | (i222 & 3670016) | ((i14 << 6) & 29360128), (i14 >> 12) & 14, 0);
                                if (ComposerKt.v()) {
                                }
                                modifier4 = modifier3;
                                z4 = z52;
                                function04 = function03;
                                sliderColors2 = sliderColors32;
                                mutableInteractionSource3 = mutableInteractionSource42;
                                i17 = i15;
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                            }
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    function02 = function0;
                    if ((i3 & 12582912) == 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    int i2022 = i7;
                    if ((i7 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i10 = i2;
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                function02 = function0;
                if ((i3 & 12582912) == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                int i20222 = i7;
                if ((i7 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i3 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i2;
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            function02 = function0;
            if ((i3 & 12582912) == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            int i202222 = i7;
            if ((i7 & 38347923) == 38347922) {
            }
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
        if (i9 != 0) {
        }
        i10 = i2;
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        function02 = function0;
        if ((i3 & 12582912) == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        int i2022222 = i7;
        if ((i7 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(final Modifier modifier, final SliderState sliderState, final boolean z2, final MutableInteractionSource mutableInteractionSource, final Function3 function3, final Function3 function32, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(1390990089);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(sliderState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function32) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1390990089, i3, -1, "androidx.compose.material3.SliderImpl (Slider.kt:664)");
            }
            sliderState.E2(composerKN.ty(CompositionLocalsKt.az()) == LayoutDirection.f34161t);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierE2 = E2(companion, sliderState, mutableInteractionSource, z2);
            Orientation orientation = Orientation.f16970t;
            boolean zS = sliderState.getIsRtl();
            int i5 = i3;
            boolean zXQ = sliderState.XQ();
            boolean zE2 = composerKN.E2(sliderState);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new SliderKt$SliderImpl$drag$1$1(sliderState, null);
                composerKN.o(objIF);
            }
            Modifier modifierZmq = FocusableKt.n(fD(SizeKt.r(InteractiveComponentSizeKt.rl(modifier), rl, f27629n, 0.0f, 0.0f, 12, null), sliderState, z2), z2, mutableInteractionSource).Zmq(modifierE2).Zmq(DraggableKt.KN(companion, sliderState, orientation, z2, mutableInteractionSource, zXQ, null, (Function3) objIF, zS, 32, null));
            boolean zE22 = composerKN.E2(sliderState);
            Object objIF2 = composerKN.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                        int size = list.size();
                        int i7 = 0;
                        for (int i8 = 0; i8 < size; i8++) {
                            Measurable measurable = (Measurable) list.get(i8);
                            if (LayoutIdKt.n(measurable) == SliderComponents.THUMB) {
                                long j3 = j2;
                                final Placeable placeableDR0 = measurable.dR0(j3);
                                int size2 = list.size();
                                while (i7 < size2) {
                                    Measurable measurable2 = (Measurable) list.get(i7);
                                    if (LayoutIdKt.n(measurable2) == SliderComponents.TRACK) {
                                        final Placeable placeableDR02 = measurable2.dR0(Constraints.nr(ConstraintsKt.mUb(j3, -placeableDR0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                        int width = placeableDR0.getWidth() + placeableDR02.getWidth();
                                        int iMax = Math.max(placeableDR02.getHeight(), placeableDR0.getHeight());
                                        sliderState.s7N(placeableDR02.getHeight(), width);
                                        final int width2 = placeableDR0.getWidth() / 2;
                                        final int iRoundToInt = MathKt.roundToInt(placeableDR02.getWidth() * sliderState.Uo());
                                        final int height = (iMax - placeableDR02.getHeight()) / 2;
                                        final int height2 = (iMax - placeableDR0.getHeight()) / 2;
                                        return MeasureScope.ER(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1.1
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
                                                Placeable.PlacementScope.az(placementScope, placeableDR02, width2, height, 0.0f, 4, null);
                                                Placeable.PlacementScope.az(placementScope, placeableDR0, iRoundToInt, height2, 0.0f, 4, null);
                                            }
                                        }, 4, null);
                                    }
                                    i7++;
                                    j3 = j2;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerKN.o(objIF2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF2;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZmq);
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
            Modifier modifierX = SizeKt.X(LayoutIdKt.rl(companion, SliderComponents.THUMB), null, false, 3, null);
            boolean zE23 = composerKN.E2(sliderState);
            Object objIF3 = composerKN.iF();
            if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        n(intSize.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(long j2) {
                        sliderState.e(IntSize.Uo(j2));
                    }
                };
                composerKN.o(objIF3);
            }
            Modifier modifierN = OnRemeasuredModifierKt.n(modifierX, (Function1) objIF3);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN);
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
            int i7 = (i5 >> 3) & 14;
            function3.invoke(sliderState, composerKN, Integer.valueOf(((i5 >> 9) & 112) | i7));
            composerKN.XQ();
            Modifier modifierRl = LayoutIdKt.rl(companion, SliderComponents.TRACK);
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
            function32.invoke(sliderState, composerKN, Integer.valueOf(((i5 >> 12) & 112) | i7));
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$3
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
                    SliderKt.KN(modifier, sliderState, z2, mutableInteractionSource, function3, function32, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final float f3, final Function1 function1, Modifier modifier, boolean z2, Function0 function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i2, Function3 function3, Function3 function32, ClosedFloatingPointRange closedFloatingPointRange, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        Modifier modifier2;
        int i9;
        final boolean z3;
        int i10;
        Function0 function02;
        final SliderColors sliderColorsXMQ;
        int i11;
        final MutableInteractionSource mutableInteractionSource2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Function3 function33;
        Function3 function3Nr;
        ClosedFloatingPointRange closedFloatingPointRangeRangeTo;
        int i20;
        int i21;
        Function3 function34;
        Function3 function35;
        MutableInteractionSource mutableInteractionSource3;
        boolean z4;
        Object objIF;
        Composer composer2;
        final Function3 function36;
        final boolean z5;
        final ClosedFloatingPointRange closedFloatingPointRange2;
        final Function3 function37;
        final MutableInteractionSource mutableInteractionSource4;
        final SliderColors sliderColors2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1191170377);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.rl(f3) ? 4 : 2) | i3;
        } else {
            i8 = i3;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i3 & 48) == 0) {
            i8 |= composerKN.E2(function1) ? 32 : 16;
        }
        int i22 = i7 & 4;
        if (i22 != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z3 = z2;
                    i8 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        function02 = function0;
                        i8 |= composerKN.E2(function02) ? 16384 : 8192;
                    }
                    if ((196608 & i3) != 0) {
                        if ((i7 & 32) == 0) {
                            sliderColorsXMQ = sliderColors;
                            int i23 = composerKN.p5(sliderColorsXMQ) ? 131072 : 65536;
                            i8 |= i23;
                        } else {
                            sliderColorsXMQ = sliderColors;
                        }
                        i8 |= i23;
                    } else {
                        sliderColorsXMQ = sliderColors;
                    }
                    i11 = i7 & 64;
                    if (i11 == 0) {
                        i8 |= 1572864;
                        mutableInteractionSource2 = mutableInteractionSource;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((i3 & 1572864) == 0) {
                            i8 |= composerKN.p5(mutableInteractionSource2) ? 1048576 : 524288;
                        }
                    }
                    i12 = i7 & 128;
                    if (i12 == 0) {
                        i8 |= 12582912;
                        i13 = i2;
                    } else {
                        i13 = i2;
                        if ((i3 & 12582912) == 0) {
                            i8 |= composerKN.t(i13) ? 8388608 : 4194304;
                        }
                    }
                    i14 = i7 & 256;
                    if (i14 == 0) {
                        i8 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i15 = i14;
                            i8 |= composerKN.E2(function3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 == 0) {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.E2(function32) ? 536870912 : 268435456;
                            }
                            if ((i5 & 6) != 0) {
                                i18 = i5 | (((i7 & 1024) == 0 && composerKN.p5(closedFloatingPointRange)) ? 4 : 2);
                            } else {
                                i18 = i5;
                            }
                            int i24 = i8;
                            if ((i8 & 306783379) != 306783378 && (i18 & 3) == 2 && composerKN.xMQ()) {
                                composerKN.wTp();
                                function37 = function3;
                                closedFloatingPointRange2 = closedFloatingPointRange;
                                composer2 = composerKN;
                                z5 = z3;
                                function36 = function32;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                modifier3 = modifier2;
                                sliderColors2 = sliderColorsXMQ;
                            } else {
                                composerKN.e();
                                if ((i3 & 1) != 0 || composerKN.rV9()) {
                                    if (i22 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i9 != 0) {
                                        z3 = true;
                                    }
                                    if (i10 != 0) {
                                        function02 = null;
                                    }
                                    if ((i7 & 32) == 0) {
                                        i19 = i24 & (-458753);
                                        sliderColorsXMQ = SliderDefaults.f27553n.xMQ(composerKN, 6);
                                    } else {
                                        i19 = i24;
                                    }
                                    if (i11 != 0) {
                                        Object objIF2 = composerKN.iF();
                                        if (objIF2 == Composer.INSTANCE.n()) {
                                            objIF2 = InteractionSourceKt.n();
                                            composerKN.o(objIF2);
                                        }
                                        mutableInteractionSource2 = (MutableInteractionSource) objIF2;
                                    }
                                    if (i12 != 0) {
                                        i13 = 0;
                                    }
                                    Function3 function3Nr2 = i15 == 0 ? ComposableLambdaKt.nr(-1756326375, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer3, Integer num) {
                                            n(sliderState, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(SliderState sliderState, Composer composer3, int i25) {
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1756326375, i25, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:260)");
                                            }
                                            SliderDefaults.f27553n.n(mutableInteractionSource2, null, sliderColorsXMQ, z3, 0L, composer3, 196608, 18);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54) : function3;
                                    if (i17 == 0) {
                                        function33 = function3Nr2;
                                        function3Nr = ComposableLambdaKt.nr(2083675534, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$7
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer3, Integer num) {
                                                n(sliderState, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(SliderState sliderState, Composer composer3, int i25) {
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(2083675534, i25, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:267)");
                                                }
                                                SliderDefaults.f27553n.J2(sliderState, null, z3, sliderColorsXMQ, null, null, 0.0f, 0.0f, composer3, (i25 & 14) | 100663296, 242);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    } else {
                                        function33 = function3Nr2;
                                        function3Nr = function32;
                                    }
                                    if ((i7 & 1024) == 0) {
                                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                                        i18 &= -15;
                                    } else {
                                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                                    }
                                    i20 = i19;
                                    i21 = i18;
                                    function34 = function3Nr;
                                    function35 = function33;
                                } else {
                                    composerKN.wTp();
                                    if ((i7 & 32) != 0) {
                                        i24 &= -458753;
                                    }
                                    if ((i7 & 1024) != 0) {
                                        i18 &= -15;
                                    }
                                    function35 = function3;
                                    function34 = function32;
                                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                                    i21 = i18;
                                    i20 = i24;
                                }
                                composerKN.S();
                                Function3 function38 = function35;
                                if (ComposerKt.v()) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    ComposerKt.p5(1191170377, i20, i21, XIvb.ugeAoGg);
                                }
                                z4 = ((29360128 & i20) != 8388608) | ((((i21 & 14) ^ 6) <= 4 && composerKN.p5(closedFloatingPointRangeRangeTo)) || (i21 & 6) == 4);
                                objIF = composerKN.iF();
                                if (z4 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new SliderState(f3, i13, function02, closedFloatingPointRangeRangeTo);
                                    composerKN.o(objIF);
                                }
                                SliderState sliderState = (SliderState) objIF;
                                sliderState.te(function02);
                                sliderState.g(function1);
                                sliderState.N(f3);
                                int i25 = ((i20 >> 3) & 1008) | ((i20 >> 6) & 57344);
                                int i26 = i20 >> 9;
                                Function3 function39 = function34;
                                Uo(sliderState, modifier2, z3, null, mutableInteractionSource3, function38, function39, composerKN, i25 | (458752 & i26) | (i26 & 3670016), 8);
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                boolean z6 = z3;
                                function36 = function39;
                                z5 = z6;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                function37 = function38;
                                mutableInteractionSource4 = mutableInteractionSource5;
                                sliderColors2 = sliderColorsXMQ;
                                modifier3 = modifier2;
                            }
                            final int i27 = i13;
                            final Function0 function03 = function02;
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$8
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
                                        SliderKt.O(f3, function1, modifier3, z5, function03, sliderColors2, mutableInteractionSource4, i27, function37, function36, closedFloatingPointRange2, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i17 = i16;
                        if ((i5 & 6) != 0) {
                        }
                        int i242 = i8;
                        if ((i8 & 306783379) != 306783378) {
                            composerKN.e();
                            if ((i3 & 1) != 0) {
                                if (i22 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 != 0) {
                                }
                                if ((i7 & 32) == 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i12 != 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if ((i7 & 1024) == 0) {
                                }
                                i20 = i19;
                                i21 = i18;
                                function34 = function3Nr;
                                function35 = function33;
                                composerKN.S();
                                Function3 function382 = function35;
                                if (ComposerKt.v()) {
                                }
                                if (((i21 & 14) ^ 6) <= 4) {
                                    z4 = ((29360128 & i20) != 8388608) | ((((i21 & 14) ^ 6) <= 4 && composerKN.p5(closedFloatingPointRangeRangeTo)) || (i21 & 6) == 4);
                                    objIF = composerKN.iF();
                                    if (z4) {
                                        objIF = new SliderState(f3, i13, function02, closedFloatingPointRangeRangeTo);
                                        composerKN.o(objIF);
                                        SliderState sliderState2 = (SliderState) objIF;
                                        sliderState2.te(function02);
                                        sliderState2.g(function1);
                                        sliderState2.N(f3);
                                        int i252 = ((i20 >> 3) & 1008) | ((i20 >> 6) & 57344);
                                        int i262 = i20 >> 9;
                                        Function3 function392 = function34;
                                        Uo(sliderState2, modifier2, z3, null, mutableInteractionSource3, function382, function392, composerKN, i252 | (458752 & i262) | (i262 & 3670016), 8);
                                        MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                                        composer2 = composerKN;
                                        if (ComposerKt.v()) {
                                        }
                                        boolean z62 = z3;
                                        function36 = function392;
                                        z5 = z62;
                                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                        function37 = function382;
                                        mutableInteractionSource4 = mutableInteractionSource52;
                                        sliderColors2 = sliderColorsXMQ;
                                        modifier3 = modifier2;
                                    }
                                } else {
                                    z4 = ((29360128 & i20) != 8388608) | ((((i21 & 14) ^ 6) <= 4 && composerKN.p5(closedFloatingPointRangeRangeTo)) || (i21 & 6) == 4);
                                    objIF = composerKN.iF();
                                    if (z4) {
                                    }
                                }
                            }
                        }
                        final int i272 = i13;
                        final Function0 function032 = function02;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i7 & 512;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    if ((i5 & 6) != 0) {
                    }
                    int i2422 = i8;
                    if ((i8 & 306783379) != 306783378) {
                    }
                    final int i2722 = i13;
                    final Function0 function0322 = function02;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function02 = function0;
                if ((196608 & i3) != 0) {
                }
                i11 = i7 & 64;
                if (i11 == 0) {
                }
                i12 = i7 & 128;
                if (i12 == 0) {
                }
                i14 = i7 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i7 & 512;
                if (i16 == 0) {
                }
                i17 = i16;
                if ((i5 & 6) != 0) {
                }
                int i24222 = i8;
                if ((i8 & 306783379) != 306783378) {
                }
                final int i27222 = i13;
                final Function0 function03222 = function02;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            function02 = function0;
            if ((196608 & i3) != 0) {
            }
            i11 = i7 & 64;
            if (i11 == 0) {
            }
            i12 = i7 & 128;
            if (i12 == 0) {
            }
            i14 = i7 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i7 & 512;
            if (i16 == 0) {
            }
            i17 = i16;
            if ((i5 & 6) != 0) {
            }
            int i242222 = i8;
            if ((i8 & 306783379) != 306783378) {
            }
            final int i272222 = i13;
            final Function0 function032222 = function02;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        z3 = z2;
        i10 = i7 & 16;
        if (i10 != 0) {
        }
        function02 = function0;
        if ((196608 & i3) != 0) {
        }
        i11 = i7 & 64;
        if (i11 == 0) {
        }
        i12 = i7 & 128;
        if (i12 == 0) {
        }
        i14 = i7 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i7 & 512;
        if (i16 == 0) {
        }
        i17 = i16;
        if ((i5 & 6) != 0) {
        }
        int i2422222 = i8;
        if ((i8 & 306783379) != 306783378) {
        }
        final int i2722222 = i13;
        final Function0 function0322222 = function02;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final SliderState sliderState, Modifier modifier, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3 function3, Function3 function32, Composer composer, final int i2, final int i3) {
        SliderState sliderState2;
        int i5;
        Modifier modifier2;
        int i7;
        final boolean z3;
        final SliderColors sliderColorsXMQ;
        int i8;
        final MutableInteractionSource mutableInteractionSource2;
        int i9;
        Function3 function3Nr;
        int i10;
        Function3 function3Nr2;
        boolean z4;
        Function3 function33;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        final SliderColors sliderColors2;
        final Modifier modifier4;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource4;
        final Function3 function34;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1303883986);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            sliderState2 = sliderState;
        } else {
            sliderState2 = sliderState;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(sliderState2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
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
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        sliderColorsXMQ = sliderColors;
                        int i12 = composerKN.p5(sliderColorsXMQ) ? 2048 : 1024;
                        i5 |= i12;
                    } else {
                        sliderColorsXMQ = sliderColors;
                    }
                    i5 |= i12;
                } else {
                    sliderColorsXMQ = sliderColors;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            function3Nr = function3;
                            i5 |= composerKN.E2(function3Nr) ? 131072 : 65536;
                        }
                        i10 = i3 & 64;
                        if (i10 == 0) {
                            if ((1572864 & i2) == 0) {
                                function3Nr2 = function32;
                                i5 |= composerKN.E2(function3Nr2) ? 1048576 : 524288;
                            }
                            if ((i5 & 599187) == 599186 || !composerKN.xMQ()) {
                                composerKN.e();
                                if ((i2 & 1) != 0 || composerKN.rV9()) {
                                    Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i7 != 0) {
                                        z3 = true;
                                    }
                                    if ((i3 & 8) != 0) {
                                        i5 &= -7169;
                                        sliderColorsXMQ = SliderDefaults.f27553n.xMQ(composerKN, 6);
                                    }
                                    if (i8 != 0) {
                                        Object objIF = composerKN.iF();
                                        if (objIF == Composer.INSTANCE.n()) {
                                            objIF = InteractionSourceKt.n();
                                            composerKN.o(objIF);
                                        }
                                        mutableInteractionSource2 = (MutableInteractionSource) objIF;
                                    }
                                    if (i9 != 0) {
                                        function3Nr = ComposableLambdaKt.nr(1426271326, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$10
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState3, Composer composer2, Integer num) {
                                                n(sliderState3, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(SliderState sliderState3, Composer composer2, int i13) {
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1426271326, i13, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:342)");
                                                }
                                                SliderDefaults.f27553n.n(mutableInteractionSource2, null, sliderColorsXMQ, z3, 0L, composer2, 196608, 18);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    }
                                    if (i10 != 0) {
                                        function3Nr2 = ComposableLambdaKt.nr(577038345, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$11
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState3, Composer composer2, Integer num) {
                                                n(sliderState3, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(SliderState sliderState3, Composer composer2, int i13) {
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(577038345, i13, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:349)");
                                                }
                                                SliderDefaults.f27553n.J2(sliderState3, null, z3, sliderColorsXMQ, null, null, 0.0f, 0.0f, composer2, (i13 & 14) | 100663296, 242);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54);
                                    }
                                    z4 = z3;
                                    function33 = function3Nr;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    modifier3 = modifier5;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 8) != 0) {
                                        i5 &= -7169;
                                    }
                                    z4 = z3;
                                    function33 = function3Nr;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    modifier3 = modifier2;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1303883986, i5, -1, "androidx.compose.material3.Slider (Slider.kt:351)");
                                }
                                if (sliderState2.getSteps() >= 0) {
                                    throw new IllegalArgumentException("steps should be >= 0");
                                }
                                int i13 = i5 >> 3;
                                KN(modifier3, sliderState2, z4, mutableInteractionSource3, function33, function3Nr2, composerKN, (i5 & 896) | (i13 & 14) | ((i5 << 3) & 112) | (i13 & 7168) | (57344 & i13) | (i13 & 458752));
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                sliderColors2 = sliderColorsXMQ;
                                modifier4 = modifier3;
                                z5 = z4;
                                mutableInteractionSource4 = mutableInteractionSource3;
                                function34 = function33;
                            } else {
                                composerKN.wTp();
                                modifier4 = modifier2;
                                z5 = z3;
                                sliderColors2 = sliderColorsXMQ;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                function34 = function3Nr;
                            }
                            final Function3 function35 = function3Nr2;
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$13
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
                                        SliderKt.Uo(sliderState, modifier4, z5, sliderColors2, mutableInteractionSource4, function34, function35, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 1572864;
                        function3Nr2 = function32;
                        if ((i5 & 599187) == 599186) {
                            composerKN.e();
                            if ((i2 & 1) != 0) {
                                if (i11 == 0) {
                                }
                                if (i7 != 0) {
                                }
                                if ((i3 & 8) != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 != 0) {
                                }
                                z4 = z3;
                                function33 = function3Nr;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                modifier3 = modifier5;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                if (sliderState2.getSteps() >= 0) {
                                }
                            }
                        }
                        final Function3 function352 = function3Nr2;
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    function3Nr = function3;
                    i10 = i3 & 64;
                    if (i10 == 0) {
                    }
                    function3Nr2 = function32;
                    if ((i5 & 599187) == 599186) {
                    }
                    final Function3 function3522 = function3Nr2;
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                function3Nr = function3;
                i10 = i3 & 64;
                if (i10 == 0) {
                }
                function3Nr2 = function32;
                if ((i5 & 599187) == 599186) {
                }
                final Function3 function35222 = function3Nr2;
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            function3Nr = function3;
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            function3Nr2 = function32;
            if ((i5 & 599187) == 599186) {
            }
            final Function3 function352222 = function3Nr2;
            scopeUpdateScopeGh = composerKN.gh();
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
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        function3Nr = function3;
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        function3Nr2 = function32;
        if ((i5 & 599187) == 599186) {
        }
        final Function3 function3522222 = function3Nr2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final float WPU() {
        return f27629n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object XQ(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Continuation continuation) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        Ref.FloatRef floatRef;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            int i3 = sliderKt$awaitSlop$1.f27766O;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.f27766O = i3 - Integer.MIN_VALUE;
            } else {
                sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
            }
        }
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
        Object obj = sliderKt$awaitSlop$12.f27768t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = sliderKt$awaitSlop$12.f27766O;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
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
            sliderKt$awaitSlop$12.f27767n = floatRef2;
            sliderKt$awaitSlop$12.f27766O = 1;
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
            floatRef = (Ref.FloatRef) sliderKt$awaitSlop$12.f27767n;
            ResultKt.throwOnFailure(obj);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
        }
        return null;
    }

    public static final boolean aYN(long j2) {
        return j2 != SliderRange.INSTANCE.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Modifier fD(Modifier modifier, final SliderState sliderState, final boolean z2) {
        return ProgressSemanticsKt.rl(SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$sliderSemantics$1
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
                final SliderState sliderState2 = sliderState;
                SemanticsPropertiesKt.pJg(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt$sliderSemantics$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f3) {
                        return n(f3.floatValue());
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Boolean n(float f3) {
                        int steps;
                        float fCoerceIn = RangesKt.coerceIn(f3, ((Number) sliderState2.getValueRange().getStart()).floatValue(), ((Number) sliderState2.getValueRange().getEndInclusive()).floatValue());
                        boolean z3 = false;
                        if (sliderState2.getSteps() > 0 && (steps = sliderState2.getSteps() + 1) >= 0) {
                            float fAbs = fCoerceIn;
                            float f4 = fAbs;
                            int i2 = 0;
                            while (true) {
                                float fRl = MathHelpersKt.rl(((Number) sliderState2.getValueRange().getStart()).floatValue(), ((Number) sliderState2.getValueRange().getEndInclusive()).floatValue(), i2 / (sliderState2.getSteps() + 1));
                                float f5 = fRl - fCoerceIn;
                                if (Math.abs(f5) <= fAbs) {
                                    fAbs = Math.abs(f5);
                                    f4 = fRl;
                                }
                                if (i2 == steps) {
                                    break;
                                }
                                i2++;
                            }
                            fCoerceIn = f4;
                        }
                        if (fCoerceIn != sliderState2.r()) {
                            if (fCoerceIn != sliderState2.r()) {
                                if (sliderState2.getOnValueChange() != null) {
                                    Function1 onValueChange = sliderState2.getOnValueChange();
                                    if (onValueChange != null) {
                                        onValueChange.invoke(Float.valueOf(fCoerceIn));
                                    }
                                } else {
                                    sliderState2.N(fCoerceIn);
                                }
                            }
                            Function0 onValueChangeFinished = sliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z3 = true;
                        }
                        return Boolean.valueOf(z3);
                    }
                }, 1, null);
            }
        }, 1, null).Zmq(AccessibilityUtilKt.rl()), sliderState.r(), RangesKt.rangeTo(((Number) sliderState.getValueRange().getStart()).floatValue(), ((Number) sliderState.getValueRange().getEndInclusive()).floatValue()), sliderState.getSteps());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final RangeSliderState rangeSliderState, Modifier modifier, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3 function3, Function3 function32, Function3 function33, Composer composer, final int i2, final int i3) {
        RangeSliderState rangeSliderState2;
        int i5;
        Modifier modifier2;
        int i7;
        final boolean z3;
        final SliderColors sliderColorsXMQ;
        int i8;
        final MutableInteractionSource mutableInteractionSource3;
        int i9;
        final MutableInteractionSource mutableInteractionSource4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Function3 function3Nr;
        Modifier modifier3;
        Function3 function34;
        Function3 function35;
        Composer composer2;
        final SliderColors sliderColors2;
        final Modifier modifier4;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource5;
        final MutableInteractionSource mutableInteractionSource6;
        final Function3 function36;
        final Function3 function37;
        final Function3 function38;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(511405654);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            rangeSliderState2 = rangeSliderState;
        } else {
            rangeSliderState2 = rangeSliderState;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.E2(rangeSliderState2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
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
                        sliderColorsXMQ = sliderColors;
                        int i16 = composerKN.p5(sliderColorsXMQ) ? 2048 : 1024;
                        i5 |= i16;
                    } else {
                        sliderColorsXMQ = sliderColors;
                    }
                    i5 |= i16;
                } else {
                    sliderColorsXMQ = sliderColors;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        mutableInteractionSource3 = mutableInteractionSource;
                        i5 |= composerKN.p5(mutableInteractionSource3) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            mutableInteractionSource4 = mutableInteractionSource2;
                            i5 |= composerKN.p5(mutableInteractionSource4) ? 131072 : 65536;
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function3) ? 1048576 : 524288;
                        }
                        i11 = i3 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                        } else {
                            if ((i2 & 12582912) == 0) {
                                i12 = i11;
                                i5 |= composerKN.E2(function32) ? 8388608 : 4194304;
                            }
                            i13 = i3 & 256;
                            if (i13 != 0) {
                                if ((i2 & 100663296) == 0) {
                                    i14 = i13;
                                    i5 |= composerKN.E2(function33) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                if ((i5 & 38347923) == 38347922 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    function37 = function32;
                                    composer2 = composerKN;
                                    modifier4 = modifier2;
                                    z4 = z3;
                                    sliderColors2 = sliderColorsXMQ;
                                    mutableInteractionSource5 = mutableInteractionSource3;
                                    mutableInteractionSource6 = mutableInteractionSource4;
                                    function36 = function3;
                                    function38 = function33;
                                } else {
                                    composerKN.e();
                                    if ((i2 & 1) != 0 || composerKN.rV9()) {
                                        if (i15 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            z3 = true;
                                        }
                                        if ((i3 & 8) != 0) {
                                            i5 &= -7169;
                                            sliderColorsXMQ = SliderDefaults.f27553n.xMQ(composerKN, 6);
                                        }
                                        if (i8 != 0) {
                                            Object objIF = composerKN.iF();
                                            if (objIF == Composer.INSTANCE.n()) {
                                                objIF = InteractionSourceKt.n();
                                                composerKN.o(objIF);
                                            }
                                            mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                        }
                                        if (i9 != 0) {
                                            Object objIF2 = composerKN.iF();
                                            if (objIF2 == Composer.INSTANCE.n()) {
                                                objIF2 = InteractionSourceKt.n();
                                                composerKN.o(objIF2);
                                            }
                                            mutableInteractionSource4 = (MutableInteractionSource) objIF2;
                                        }
                                        Function3 function3Nr2 = i10 == 0 ? ComposableLambdaKt.nr(1884205643, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$14
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState3, Composer composer3, Integer num) {
                                                n(rangeSliderState3, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(RangeSliderState rangeSliderState3, Composer composer3, int i17) {
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1884205643, i17, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:620)");
                                                }
                                                SliderDefaults.f27553n.n(mutableInteractionSource3, null, sliderColorsXMQ, z3, 0L, composer3, 196608, 18);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54) : function3;
                                        Function3 function3Nr3 = i12 == 0 ? ComposableLambdaKt.nr(1016457138, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$15
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState3, Composer composer3, Integer num) {
                                                n(rangeSliderState3, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(RangeSliderState rangeSliderState3, Composer composer3, int i17) {
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1016457138, i17, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:627)");
                                                }
                                                SliderDefaults.f27553n.n(mutableInteractionSource4, null, sliderColorsXMQ, z3, 0L, composer3, 196608, 18);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54) : function32;
                                        function3Nr = i14 == 0 ? ComposableLambdaKt.nr(-1617375262, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$16
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState3, Composer composer3, Integer num) {
                                                n(rangeSliderState3, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(RangeSliderState rangeSliderState3, Composer composer3, int i17) {
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1617375262, i17, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:634)");
                                                }
                                                SliderDefaults.f27553n.O(rangeSliderState3, null, z3, sliderColorsXMQ, null, null, 0.0f, 0.0f, composer3, (i17 & 14) | 100663296, 242);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54) : function33;
                                        modifier3 = modifier2;
                                        function34 = function3Nr2;
                                        function35 = function3Nr3;
                                    } else {
                                        composerKN.wTp();
                                        if ((i3 & 8) != 0) {
                                            i5 &= -7169;
                                        }
                                        function34 = function3;
                                        function35 = function32;
                                        function3Nr = function33;
                                        modifier3 = modifier2;
                                    }
                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource4;
                                    boolean z5 = z3;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(511405654, i5, -1, "androidx.compose.material3.RangeSlider (Slider.kt:640)");
                                    }
                                    if (rangeSliderState2.getSteps() >= 0) {
                                        throw new IllegalArgumentException("steps should be >= 0");
                                    }
                                    int i17 = i5 >> 3;
                                    composer2 = composerKN;
                                    nr(modifier3, rangeSliderState2, z5, mutableInteractionSource7, mutableInteractionSource8, function34, function35, function3Nr, composer2, (i5 & 896) | (i17 & 14) | ((i5 << 3) & 112) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128));
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    sliderColors2 = sliderColorsXMQ;
                                    modifier4 = modifier3;
                                    z4 = z5;
                                    mutableInteractionSource5 = mutableInteractionSource7;
                                    mutableInteractionSource6 = mutableInteractionSource8;
                                    function36 = function34;
                                    function37 = function35;
                                    function38 = function3Nr;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$18
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i18) {
                                            SliderKt.n(rangeSliderState, modifier4, z4, sliderColors2, mutableInteractionSource5, mutableInteractionSource6, function36, function37, function38, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 100663296;
                            i14 = i13;
                            if ((i5 & 38347923) == 38347922) {
                                composerKN.e();
                                if ((i2 & 1) != 0) {
                                    if (i15 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i3 & 8) != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    modifier3 = modifier2;
                                    function34 = function3Nr2;
                                    function35 = function3Nr3;
                                    MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource3;
                                    MutableInteractionSource mutableInteractionSource82 = mutableInteractionSource4;
                                    boolean z52 = z3;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    if (rangeSliderState2.getSteps() >= 0) {
                                    }
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & 256;
                        if (i13 != 0) {
                        }
                        i14 = i13;
                        if ((i5 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    mutableInteractionSource4 = mutableInteractionSource2;
                    i10 = i3 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    if ((i5 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                mutableInteractionSource3 = mutableInteractionSource;
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                mutableInteractionSource4 = mutableInteractionSource2;
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 256;
                if (i13 != 0) {
                }
                i14 = i13;
                if ((i5 & 38347923) == 38347922) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource;
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            mutableInteractionSource4 = mutableInteractionSource2;
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            i11 = i3 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 256;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i5 & 38347923) == 38347922) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource;
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        mutableInteractionSource4 = mutableInteractionSource2;
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        i11 = i3 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 256;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i5 & 38347923) == 38347922) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    private static final Modifier nY(Modifier modifier, RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z2) {
        return z2 ? modifier.Zmq(new SuspendPointerInputElement(null, null, new Object[]{mutableInteractionSource, mutableInteractionSource2, rangeSliderState}, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new SliderKt$rangeSliderPressDragModifier$1(rangeSliderState, mutableInteractionSource, mutableInteractionSource2, null)), 3, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final Modifier modifier, final RangeSliderState rangeSliderState, final boolean z2, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Function3 function3, final Function3 function32, final Function3 function33, Composer composer, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composerKN = composer.KN(-1411725677);
        if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(rangeSliderState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.p5(mutableInteractionSource2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(function32) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.E2(function33) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1411725677, i3, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:735)");
            }
            rangeSliderState.wTp(composerKN.ty(CompositionLocalsKt.az()) == LayoutDirection.f34161t);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNY = nY(companion, rangeSliderState, mutableInteractionSource, mutableInteractionSource2, z2);
            Strings.Companion companion2 = Strings.INSTANCE;
            final String strN = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.qie), composerKN, 0);
            final String strN2 = Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.gh), composerKN, 0);
            Modifier modifierZmq = SizeKt.r(InteractiveComponentSizeKt.rl(modifier2), rl, f27629n, 0.0f, 0.0f, 12, null).Zmq(modifierNY);
            boolean zE2 = composerKN.E2(rangeSliderState);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                        long j3 = j2;
                        int size = list.size();
                        int i5 = 0;
                        int i7 = 0;
                        while (i7 < size) {
                            Measurable measurable = (Measurable) list.get(i7);
                            if (LayoutIdKt.n(measurable) == RangeSliderComponents.STARTTHUMB) {
                                final Placeable placeableDR0 = measurable.dR0(j3);
                                int size2 = list.size();
                                int i8 = 0;
                                while (i8 < size2) {
                                    Measurable measurable2 = (Measurable) list.get(i8);
                                    if (LayoutIdKt.n(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                        final Placeable placeableDR02 = measurable2.dR0(j3);
                                        int size3 = list.size();
                                        while (i5 < size3) {
                                            Measurable measurable3 = (Measurable) list.get(i5);
                                            if (LayoutIdKt.n(measurable3) == RangeSliderComponents.TRACK) {
                                                final Placeable placeableDR03 = measurable3.dR0(Constraints.nr(ConstraintsKt.mUb(j3, (-(placeableDR0.getWidth() + placeableDR02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                int width = placeableDR03.getWidth() + ((placeableDR0.getWidth() + placeableDR02.getWidth()) / 2);
                                                int iMax = Math.max(placeableDR03.getHeight(), Math.max(placeableDR0.getHeight(), placeableDR02.getHeight()));
                                                rangeSliderState.bzg(placeableDR03.getHeight());
                                                rangeSliderState.rV9(width);
                                                rangeSliderState.Xw();
                                                final int width2 = placeableDR0.getWidth() / 2;
                                                final int iRoundToInt = MathKt.roundToInt(placeableDR03.getWidth() * rangeSliderState.J2());
                                                final int iRoundToInt2 = MathKt.roundToInt((placeableDR03.getWidth() * rangeSliderState.O()) + ((placeableDR0.getWidth() - placeableDR02.getWidth()) / 2));
                                                final int height = (iMax - placeableDR03.getHeight()) / 2;
                                                final int height2 = (iMax - placeableDR0.getHeight()) / 2;
                                                final int height3 = (iMax - placeableDR02.getHeight()) / 2;
                                                return MeasureScope.ER(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1.1
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
                                                        Placeable.PlacementScope.az(placementScope, placeableDR03, width2, height, 0.0f, 4, null);
                                                        Placeable.PlacementScope.az(placementScope, placeableDR0, iRoundToInt, height2, 0.0f, 4, null);
                                                        Placeable.PlacementScope.az(placementScope, placeableDR02, iRoundToInt2, height3, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                            i5++;
                                            j3 = j2;
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    i8++;
                                    j3 = j2;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i7++;
                            j3 = j2;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
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
            int i5 = i3;
            Updater.O(composerN, measurePolicy, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            Modifier modifierX = SizeKt.X(LayoutIdKt.rl(companion, RangeSliderComponents.STARTTHUMB), null, false, 3, null);
            boolean zE22 = composerKN.E2(rangeSliderState);
            Object objIF2 = composerKN.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        n(intSize.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(long j2) {
                        rangeSliderState.v(IntSize.Uo(j2));
                    }
                };
                composerKN.o(objIF2);
            }
            Modifier modifierG = g(OnRemeasuredModifierKt.n(modifierX, (Function1) objIF2), rangeSliderState, z2);
            boolean zP5 = composerKN.p5(strN);
            Object objIF3 = composerKN.iF();
            if (zP5 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2$1
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
                composerKN.o(objIF3);
            }
            Modifier modifierN = FocusableKt.n(SemanticsModifierKt.t(modifierG, true, (Function1) objIF3), z2, mutableInteractionSource);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN);
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
            int i7 = (i5 >> 3) & 14;
            function3.invoke(rangeSliderState, composerKN, Integer.valueOf(((i5 >> 12) & 112) | i7));
            composerKN.XQ();
            Modifier modifierX2 = SizeKt.X(LayoutIdKt.rl(companion, RangeSliderComponents.ENDTHUMB), null, false, 3, null);
            boolean zE23 = composerKN.E2(rangeSliderState);
            Object objIF4 = composerKN.iF();
            if (zE23 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$4$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        n(intSize.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(long j2) {
                        rangeSliderState.E2(IntSize.Uo(j2));
                    }
                };
                composerKN.o(objIF4);
            }
            Modifier modifierViF = ViF(OnRemeasuredModifierKt.n(modifierX2, (Function1) objIF4), rangeSliderState, z2);
            boolean zP52 = composerKN.p5(strN2);
            Object objIF5 = composerKN.iF();
            if (zP52 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$5$1
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
                composerKN.o(objIF5);
            }
            Modifier modifierN2 = FocusableKt.n(SemanticsModifierKt.t(modifierViF, true, (Function1) objIF5), z2, mutableInteractionSource2);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), false);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierN2);
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
            function32.invoke(rangeSliderState, composerKN, Integer.valueOf(((i5 >> 15) & 112) | i7));
            composerKN.XQ();
            Modifier modifierRl = LayoutIdKt.rl(companion, RangeSliderComponents.TRACK);
            MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion4.HI(), false);
            int iN4 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
            Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierRl);
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
            Updater.O(composerN4, measurePolicyUo3, companion3.t());
            Updater.O(composerN4, compositionLocalMapIk4, companion3.O());
            Function2 function2Rl4 = companion3.rl();
            if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                composerN4.o(Integer.valueOf(iN4));
                composerN4.az(Integer.valueOf(iN4), function2Rl4);
            }
            Updater.O(composerN4, modifierO4, companion3.nr());
            function33.invoke(rangeSliderState, composerKN, Integer.valueOf(((i5 >> 18) & 112) | i7));
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$3
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
                    SliderKt.nr(modifier, rangeSliderState, z2, mutableInteractionSource, mutableInteractionSource2, function3, function32, function33, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final ClosedFloatingPointRange closedFloatingPointRange, final Function1 function1, Modifier modifier, boolean z2, ClosedFloatingPointRange closedFloatingPointRange2, int i2, Function0 function0, SliderColors sliderColors, Composer composer, final int i3, final int i5) {
        ClosedFloatingPointRange closedFloatingPointRange3;
        int i7;
        Function1 function12;
        Modifier modifier2;
        int i8;
        boolean z3;
        ClosedFloatingPointRange closedFloatingPointRangeRangeTo;
        int i9;
        int i10;
        int i11;
        Function0 function02;
        int i12;
        final SliderColors sliderColorsXMQ;
        final boolean z4;
        int i13;
        Function0 function03;
        Modifier modifier3;
        int i14;
        Object objIF;
        Composer.Companion companion;
        Object objIF2;
        Composer composer2;
        final SliderColors sliderColors2;
        final Modifier modifier4;
        final boolean z5;
        final ClosedFloatingPointRange closedFloatingPointRange4;
        final Function0 function04;
        final int i15;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-743091416);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
            closedFloatingPointRange3 = closedFloatingPointRange;
        } else {
            closedFloatingPointRange3 = closedFloatingPointRange;
            if ((i3 & 6) == 0) {
                i7 = (composerKN.p5(closedFloatingPointRange3) ? 4 : 2) | i3;
            } else {
                i7 = i3;
            }
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i3 & 48) == 0) {
                i7 |= composerKN.E2(function12) ? 32 : 16;
            }
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
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        int i17 = composerKN.p5(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                        i7 |= i17;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    i7 |= i17;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    i7 |= 196608;
                } else {
                    if ((196608 & i3) == 0) {
                        i10 = i2;
                        i7 |= composerKN.t(i10) ? 131072 : 65536;
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i3) == 0) {
                            function02 = function0;
                            i7 |= composerKN.E2(function02) ? 1048576 : 524288;
                        }
                        if ((i3 & 12582912) == 0) {
                            i7 |= ((i5 & 128) == 0 && composerKN.p5(sliderColors)) ? 8388608 : 4194304;
                        }
                        int i18 = i7;
                        if ((i7 & 4793491) == 4793490 && composerKN.xMQ()) {
                            composerKN.wTp();
                            sliderColors2 = sliderColors;
                            composer2 = composerKN;
                            modifier4 = modifier2;
                            z5 = z3;
                            closedFloatingPointRange4 = closedFloatingPointRangeRangeTo;
                            i15 = i10;
                            function04 = function02;
                        } else {
                            composerKN.e();
                            if ((i3 & 1) != 0 || composerKN.rV9()) {
                                Modifier modifier5 = i16 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i8 != 0) {
                                    z3 = true;
                                }
                                if ((i5 & 16) == 0) {
                                    i12 = i18 & (-57345);
                                    closedFloatingPointRangeRangeTo = RangesKt.rangeTo(0.0f, 1.0f);
                                } else {
                                    i12 = i18;
                                }
                                if (i9 != 0) {
                                    i10 = 0;
                                }
                                if (i11 != 0) {
                                    function02 = null;
                                }
                                if ((i5 & 128) == 0) {
                                    sliderColorsXMQ = SliderDefaults.f27553n.xMQ(composerKN, 6);
                                    i12 &= -29360129;
                                } else {
                                    sliderColorsXMQ = sliderColors;
                                }
                                z4 = z3;
                                i13 = i10;
                                function03 = function02;
                                modifier3 = modifier5;
                                i14 = i12;
                            } else {
                                composerKN.wTp();
                                i14 = (i5 & 16) != 0 ? i18 & (-57345) : i18;
                                if ((i5 & 128) != 0) {
                                    i14 &= -29360129;
                                }
                                sliderColorsXMQ = sliderColors;
                                z4 = z3;
                                i13 = i10;
                                function03 = function02;
                                modifier3 = modifier2;
                            }
                            ClosedFloatingPointRange closedFloatingPointRange5 = closedFloatingPointRangeRangeTo;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-743091416, i14, -1, "androidx.compose.material3.RangeSlider (Slider.kt:409)");
                            }
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                                objIF = InteractionSourceKt.n();
                                composerKN.o(objIF);
                            }
                            final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                                objIF2 = InteractionSourceKt.n();
                                composerKN.o(objIF2);
                            }
                            final MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objIF2;
                            composer2 = composerKN;
                            t(closedFloatingPointRange3, function12, modifier3, z4, closedFloatingPointRange5, function03, null, mutableInteractionSource, mutableInteractionSource2, ComposableLambdaKt.nr(-811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer3, Integer num) {
                                    n(rangeSliderState, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(RangeSliderState rangeSliderState, Composer composer3, int i19) {
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-811582901, i19, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
                                    }
                                    SliderDefaults.f27553n.n(mutableInteractionSource, null, sliderColorsXMQ, z4, 0L, composer3, 196614, 18);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), ComposableLambdaKt.nr(-1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer3, Integer num) {
                                    n(rangeSliderState, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(RangeSliderState rangeSliderState, Composer composer3, int i19) {
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1832060001, i19, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                                    }
                                    SliderDefaults.f27553n.n(mutableInteractionSource2, null, sliderColorsXMQ, z4, 0L, composer3, 196614, 18);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), ComposableLambdaKt.nr(377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer3, Integer num) {
                                    n(rangeSliderState, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(RangeSliderState rangeSliderState, Composer composer3, int i19) {
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(377064480, i19, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                                    }
                                    SliderDefaults.f27553n.O(rangeSliderState, null, z4, sliderColorsXMQ, null, null, 0.0f, 0.0f, composer3, (i19 & 14) | 100663296, 242);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), i13, composer2, (i14 & 14) | 918552576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | ((i14 >> 3) & 458752), ((i14 >> 9) & 896) | 54, 64);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            sliderColors2 = sliderColorsXMQ;
                            modifier4 = modifier3;
                            z5 = z4;
                            closedFloatingPointRange4 = closedFloatingPointRange5;
                            function04 = function03;
                            i15 = i13;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i19) {
                                    SliderKt.rl(closedFloatingPointRange, function1, modifier4, z5, closedFloatingPointRange4, i15, function04, sliderColors2, composer3, RecomposeScopeImplKt.n(i3 | 1), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= 1572864;
                    function02 = function0;
                    if ((i3 & 12582912) == 0) {
                    }
                    int i182 = i7;
                    if ((i7 & 4793491) == 4793490) {
                        composerKN.e();
                        if ((i3 & 1) != 0) {
                            if (i16 == 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i5 & 16) == 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if ((i5 & 128) == 0) {
                            }
                            z4 = z3;
                            i13 = i10;
                            function03 = function02;
                            modifier3 = modifier5;
                            i14 = i12;
                            ClosedFloatingPointRange closedFloatingPointRange52 = closedFloatingPointRangeRangeTo;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                            }
                            final MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) objIF;
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                            }
                            final MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) objIF2;
                            composer2 = composerKN;
                            t(closedFloatingPointRange3, function12, modifier3, z4, closedFloatingPointRange52, function03, null, mutableInteractionSource3, mutableInteractionSource22, ComposableLambdaKt.nr(-811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer3, Integer num) {
                                    n(rangeSliderState, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(RangeSliderState rangeSliderState, Composer composer3, int i19) {
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-811582901, i19, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
                                    }
                                    SliderDefaults.f27553n.n(mutableInteractionSource3, null, sliderColorsXMQ, z4, 0L, composer3, 196614, 18);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), ComposableLambdaKt.nr(-1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer3, Integer num) {
                                    n(rangeSliderState, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(RangeSliderState rangeSliderState, Composer composer3, int i19) {
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1832060001, i19, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                                    }
                                    SliderDefaults.f27553n.n(mutableInteractionSource22, null, sliderColorsXMQ, z4, 0L, composer3, 196614, 18);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), ComposableLambdaKt.nr(377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer3, Integer num) {
                                    n(rangeSliderState, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(RangeSliderState rangeSliderState, Composer composer3, int i19) {
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(377064480, i19, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                                    }
                                    SliderDefaults.f27553n.O(rangeSliderState, null, z4, sliderColorsXMQ, null, null, 0.0f, 0.0f, composer3, (i19 & 14) | 100663296, 242);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), i13, composer2, (i14 & 14) | 918552576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | ((i14 >> 3) & 458752), ((i14 >> 9) & 896) | 54, 64);
                            if (ComposerKt.v()) {
                            }
                            sliderColors2 = sliderColorsXMQ;
                            modifier4 = modifier3;
                            z5 = z4;
                            closedFloatingPointRange4 = closedFloatingPointRange52;
                            function04 = function03;
                            i15 = i13;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i10 = i2;
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                function02 = function0;
                if ((i3 & 12582912) == 0) {
                }
                int i1822 = i7;
                if ((i7 & 4793491) == 4793490) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z3 = z2;
            if ((i3 & 24576) == 0) {
            }
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            i10 = i2;
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            function02 = function0;
            if ((i3 & 12582912) == 0) {
            }
            int i18222 = i7;
            if ((i7 & 4793491) == 4793490) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
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
        if (i9 != 0) {
        }
        i10 = i2;
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        function02 = function0;
        if ((i3 & 12582912) == 0) {
        }
        int i182222 = i7;
        if ((i7 & 4793491) == 4793490) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Modifier ViF(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z2) {
        final ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(rangeSliderState.t(), ((Number) rangeSliderState.getValueRange().getEndInclusive()).floatValue());
        return ProgressSemanticsKt.rl(SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1
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
                final ClosedFloatingPointRange closedFloatingPointRange = closedFloatingPointRangeRangeTo;
                final RangeSliderState rangeSliderState2 = rangeSliderState;
                SemanticsPropertiesKt.pJg(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f3) {
                        return n(f3.floatValue());
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Boolean n(float f3) {
                        int iUo;
                        float fCoerceIn = RangesKt.coerceIn(f3, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
                        boolean z3 = false;
                        if (rangeSliderState2.Uo() > 0 && (iUo = rangeSliderState2.Uo() + 1) >= 0) {
                            float fAbs = fCoerceIn;
                            float f4 = fAbs;
                            int i2 = 0;
                            while (true) {
                                float fRl = MathHelpersKt.rl(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), i2 / (rangeSliderState2.Uo() + 1));
                                float f5 = fRl - fCoerceIn;
                                if (Math.abs(f5) <= fAbs) {
                                    fAbs = Math.abs(f5);
                                    f4 = fRl;
                                }
                                if (i2 == iUo) {
                                    break;
                                }
                                i2++;
                            }
                            fCoerceIn = f4;
                        }
                        if (fCoerceIn != rangeSliderState2.n()) {
                            long jXMQ = SliderKt.xMQ(rangeSliderState2.t(), fCoerceIn);
                            if (!SliderRange.O(jXMQ, SliderKt.xMQ(rangeSliderState2.t(), rangeSliderState2.n()))) {
                                if (rangeSliderState2.getOnValueChange() != null) {
                                    Function1 onValueChange = rangeSliderState2.getOnValueChange();
                                    if (onValueChange != null) {
                                        onValueChange.invoke(SliderRange.rl(jXMQ));
                                    }
                                } else {
                                    rangeSliderState2.iF(SliderRange.Uo(jXMQ));
                                    rangeSliderState2.g(SliderRange.J2(jXMQ));
                                }
                            }
                            Function0 onValueChangeFinished = rangeSliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z3 = true;
                        }
                        return Boolean.valueOf(z3);
                    }
                }, 1, null);
            }
        }, 1, null).Zmq(AccessibilityUtilKt.rl()), rangeSliderState.n(), closedFloatingPointRangeRangeTo, rangeSliderState.Uo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Modifier g(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z2) {
        final ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(((Number) rangeSliderState.getValueRange().getStart()).floatValue(), rangeSliderState.n());
        return ProgressSemanticsKt.rl(SemanticsModifierKt.nr(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1
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
                final ClosedFloatingPointRange closedFloatingPointRange = closedFloatingPointRangeRangeTo;
                final RangeSliderState rangeSliderState2 = rangeSliderState;
                SemanticsPropertiesKt.pJg(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f3) {
                        return n(f3.floatValue());
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Boolean n(float f3) {
                        int iCk;
                        float fCoerceIn = RangesKt.coerceIn(f3, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
                        boolean z3 = false;
                        if (rangeSliderState2.ck() > 0 && (iCk = rangeSliderState2.ck() + 1) >= 0) {
                            float fAbs = fCoerceIn;
                            float f4 = fAbs;
                            int i2 = 0;
                            while (true) {
                                float fRl = MathHelpersKt.rl(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), i2 / (rangeSliderState2.ck() + 1));
                                float f5 = fRl - fCoerceIn;
                                if (Math.abs(f5) <= fAbs) {
                                    fAbs = Math.abs(f5);
                                    f4 = fRl;
                                }
                                if (i2 == iCk) {
                                    break;
                                }
                                i2++;
                            }
                            fCoerceIn = f4;
                        }
                        if (fCoerceIn != rangeSliderState2.t()) {
                            long jXMQ = SliderKt.xMQ(fCoerceIn, rangeSliderState2.n());
                            if (!SliderRange.O(jXMQ, SliderKt.xMQ(rangeSliderState2.t(), rangeSliderState2.n()))) {
                                if (rangeSliderState2.getOnValueChange() != null) {
                                    Function1 onValueChange = rangeSliderState2.getOnValueChange();
                                    if (onValueChange != null) {
                                        onValueChange.invoke(SliderRange.rl(jXMQ));
                                    }
                                } else {
                                    rangeSliderState2.iF(SliderRange.Uo(jXMQ));
                                    rangeSliderState2.g(SliderRange.J2(jXMQ));
                                }
                            }
                            Function0 onValueChangeFinished = rangeSliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z3 = true;
                        }
                        return Boolean.valueOf(z3);
                    }
                }, 1, null);
            }
        }, 1, null).Zmq(AccessibilityUtilKt.rl()), rangeSliderState.t(), closedFloatingPointRangeRangeTo, rangeSliderState.ck());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long iF(float f3, float f4, long j2, float f5, float f6) {
        return xMQ(te(f3, f4, SliderRange.Uo(j2), f5, f6), te(f3, f4, SliderRange.J2(j2), f5, f6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float te(float f3, float f4, float f5, float f6, float f7) {
        return MathHelpersKt.rl(f6, f7, S(f3, f4, f5));
    }

    public static final long xMQ(float f3, float f4) {
        if ((Float.isNaN(f3) && Float.isNaN(f4)) || f3 <= ((double) f4) + 1.0E-4d) {
            return SliderRange.t((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        }
        throw new IllegalArgumentException(("start(" + f3 + ") must be <= endInclusive(" + f4 + ')').toString());
    }
}
