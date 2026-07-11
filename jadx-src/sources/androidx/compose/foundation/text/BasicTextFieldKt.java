package androidx.compose.foundation.text;

import GJW.vd;
import TFv.nKK;
import TFv.r;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aÝ\u0001\u0010%\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f28\b\u0002\u0010\u001a\u001a2\u0012\u0004\u0012\u00020\u0012\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011¢\u0006\u0002\b\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&\u001aó\u0001\u0010*\u001a\u00020\u00182\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f28\b\u0002\u0010\u001a\u001a2\u0012\u0004\u0012\u00020\u0012\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011¢\u0006\u0002\b\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010)\u001a\u00020\u0004H\u0001¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/\u001a\u0017\u00100\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b0\u0010/\u001að\u0001\u0010@\u001a\u00020\u00182\u0006\u00102\u001a\u0002012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0018032\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\b\b\u0002\u0010<\u001a\u00020;2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d23\b\u0002\u0010?\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\u0002\b=¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u001803¢\u0006\u0002\b=H\u0007¢\u0006\u0004\b@\u0010A\u001að\u0001\u0010C\u001a\u00020\u00182\u0006\u00102\u001a\u00020B2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u0018032\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\b\b\u0002\u0010<\u001a\u00020;2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d23\b\u0002\u0010?\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\u0002\b=¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u001803¢\u0006\u0002\b=H\u0007¢\u0006\u0004\bC\u0010D\u001aä\u0001\u0010E\u001a\u00020\u00182\u0006\u00102\u001a\u0002012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0018032\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010<\u001a\u00020;2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018032\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d23\b\u0002\u0010?\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\u0002\b=¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u001803¢\u0006\u0002\b=H\u0007¢\u0006\u0004\bE\u0010F\u001aä\u0001\u0010G\u001a\u00020\u00182\u0006\u00102\u001a\u00020B2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u0018032\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010<\u001a\u00020;2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018032\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d23\b\u0002\u0010?\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00180\u0013¢\u0006\u0002\b=¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u001803¢\u0006\u0002\b=H\u0007¢\u0006\u0004\bG\u0010H\"\u0014\u0010J\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010I\"\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010L¨\u0006T²\u0006\f\u0010O\u001a\u00020N8\nX\u008a\u0084\u0002²\u0006\f\u0010P\u001a\u00020N8\nX\u008a\u0084\u0002²\u0006\f\u0010Q\u001a\u00020N8\nX\u008a\u0084\u0002²\u0006\u000e\u0010R\u001a\u00020B8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010S\u001a\u0002018\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "lineLimits", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "getResult", "", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "Landroidx/compose/foundation/text/input/OutputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "decorator", "Landroidx/compose/foundation/ScrollState;", "scrollState", c.f62177j, "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "isPassword", "rl", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "gh", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "az", "", "value", "Lkotlin/Function1;", "onValueChange", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/runtime/Composable;", "innerTextField", "decorationBox", "O", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "t", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "J2", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "nr", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "DefaultTextFieldDecorator", "Landroidx/compose/ui/unit/DpSize;", "J", "MinTouchTargetSizeForHandles", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "cursorHandleState", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,971:1\n75#2:972\n75#2:973\n75#2:974\n75#2:1020\n75#2:1021\n75#2:1022\n1247#3,6:975\n1247#3,6:981\n1247#3,3:987\n1250#3,3:991\n1247#3,6:994\n1247#3,6:1000\n1247#3,3:1013\n1250#3,3:1017\n1247#3,6:1023\n1247#3,6:1029\n1247#3,6:1035\n1247#3,6:1041\n1247#3,6:1088\n1247#3,6:1094\n1247#3,6:1100\n1247#3,6:1106\n1247#3,6:1112\n1247#3,6:1118\n1247#3,6:1124\n1247#3,6:1130\n1247#3,6:1136\n1247#3,6:1142\n1247#3,6:1148\n1247#3,6:1154\n1247#3,6:1160\n1247#3,6:1166\n1247#3,6:1172\n1247#3,6:1178\n1#4:990\n557#5:1006\n554#5,6:1007\n555#6:1016\n70#7:1047\n67#7,9:1048\n77#7:1087\n79#8,6:1057\n86#8,3:1072\n89#8,2:1081\n93#8:1086\n347#9,9:1063\n356#9,3:1083\n4206#10,6:1075\n85#11:1184\n85#11:1185\n85#11:1186\n85#11:1187\n113#11,2:1188\n85#11:1190\n113#11,2:1191\n113#12:1193\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n246#1:972\n247#1:973\n248#1:974\n300#1:1020\n301#1:1021\n302#1:1022\n252#1:975,6\n257#1:981,6\n262#1:987,3\n262#1:991,3\n280#1:994,6\n288#1:1000,6\n299#1:1013,3\n299#1:1017,3\n305#1:1023,6\n349#1:1029,6\n365#1:1035,6\n390#1:1041,6\n505#1:1088,6\n510#1:1094,6\n514#1:1100,6\n526#1:1106,6\n536#1:1112,6\n545#1:1118,6\n555#1:1124,6\n565#1:1130,6\n574#1:1136,6\n713#1:1142,6\n719#1:1148,6\n730#1:1154,6\n734#1:1160,6\n870#1:1166,6\n907#1:1172,6\n947#1:1178,6\n299#1:1006\n299#1:1007,6\n299#1:1016\n430#1:1047\n430#1:1048,9\n430#1:1087\n430#1:1057,6\n430#1:1072,3\n430#1:1081,2\n430#1:1086\n430#1:1063,9\n430#1:1083,3\n430#1:1075,6\n505#1:1184\n526#1:1185\n555#1:1186\n713#1:1187\n713#1:1188,2\n730#1:1190\n730#1:1191,2\n594#1:1193\n*E\n"})
public final class BasicTextFieldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TextFieldDecorator f19202n = new TextFieldDecorator() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$DefaultTextFieldDecorator$1
        @Override // androidx.compose.foundation.text.input.TextFieldDecorator
        public final void n(Function2 function2, Composer composer, int i2) {
            composer.eF(-1669748801);
            if (ComposerKt.v()) {
                ComposerKt.p5(-1669748801, i2, -1, "androidx.compose.foundation.text.DefaultTextFieldDecorator.<no name provided>.Decoration (BasicTextField.kt:582)");
            }
            function2.invoke(composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
        }
    };
    private static final long rl;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
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
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void J2(final String str, final Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i3, final int i5, final int i7) {
        String str2;
        int i8;
        int i9;
        Modifier modifier2;
        int i10;
        int i11;
        int i12;
        TextStyle textStyle2;
        int i13;
        KeyboardOptions keyboardOptions2;
        int i14;
        KeyboardActions keyboardActions2;
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
        int i25;
        int i26;
        int i27;
        int i28;
        Composer composer2;
        final boolean z5;
        final boolean z6;
        final boolean z7;
        final Function1 function13;
        final MutableInteractionSource mutableInteractionSource2;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final Modifier modifier3;
        final int i29;
        final VisualTransformation visualTransformation2;
        final Brush brush2;
        final Function3 function32;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i30;
        MutableInteractionSource mutableInteractionSource3;
        Brush solidColor;
        int i31;
        Composer composerKN = composer.KN(-454732590);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
            str2 = str;
        } else if ((i3 & 6) == 0) {
            str2 = str;
            i8 = (composerKN.p5(str2) ? 4 : 2) | i3;
        } else {
            str2 = str;
            i8 = i3;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i8 |= composerKN.E2(function1) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i8 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i8 |= composerKN.n(z2) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            i8 |= composerKN.n(z3) ? 16384 : 8192;
                        }
                        i12 = i7 & 32;
                        if (i12 != 0) {
                            i8 |= 196608;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i3 & 196608) == 0) {
                                i8 |= composerKN.p5(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i13 = i7 & 64;
                        if (i13 != 0) {
                            i8 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i3 & 1572864) == 0) {
                                i8 |= composerKN.p5(keyboardOptions2) ? 1048576 : 524288;
                            }
                        }
                        i14 = i7 & 128;
                        if (i14 != 0) {
                            i8 |= 12582912;
                            keyboardActions2 = keyboardActions;
                        } else {
                            keyboardActions2 = keyboardActions;
                            if ((i3 & 12582912) == 0) {
                                i8 |= composerKN.p5(keyboardActions2) ? 8388608 : 4194304;
                            }
                        }
                        i15 = i7 & 256;
                        if (i15 != 0) {
                            i8 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i8 |= composerKN.n(z4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 == 0) {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.t(i2) ? 536870912 : 268435456;
                            }
                            i18 = i7 & 1024;
                            if (i18 == 0) {
                                i20 = i5 | 6;
                                i19 = i18;
                            } else if ((i5 & 6) == 0) {
                                i19 = i18;
                                i20 = i5 | (composerKN.p5(visualTransformation) ? 4 : 2);
                            } else {
                                i19 = i18;
                                i20 = i5;
                            }
                            i21 = i7 & 2048;
                            if (i21 == 0) {
                                i20 |= 48;
                                i22 = i21;
                            } else if ((i5 & 48) == 0) {
                                i22 = i21;
                                i20 |= composerKN.E2(function12) ? 32 : 16;
                            } else {
                                i22 = i21;
                            }
                            int i32 = i20;
                            i23 = i7 & 4096;
                            if (i23 == 0) {
                                i24 = i32 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i33 = i32;
                                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i33 |= composerKN.p5(mutableInteractionSource) ? 256 : 128;
                                }
                                i24 = i33;
                            }
                            i25 = i7 & 8192;
                            if (i25 == 0) {
                                i26 = i24 | 3072;
                            } else {
                                int i34 = i24;
                                if ((i5 & 3072) == 0) {
                                    i26 = i34 | (composerKN.p5(brush) ? 2048 : 1024);
                                } else {
                                    i26 = i34;
                                }
                            }
                            i27 = i7 & 16384;
                            if (i27 == 0) {
                                i28 = i26 | 24576;
                            } else {
                                int i35 = i26;
                                if ((i5 & 24576) == 0) {
                                    i35 |= composerKN.E2(function3) ? 16384 : 8192;
                                }
                                i28 = i35;
                            }
                            if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                z5 = z2;
                                z6 = z3;
                                z7 = z4;
                                function13 = function12;
                                mutableInteractionSource2 = mutableInteractionSource;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                modifier3 = modifier2;
                                i29 = i2;
                                visualTransformation2 = visualTransformation;
                                brush2 = brush;
                                function32 = function3;
                            } else {
                                Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z9 = i10 != 0 ? true : z2;
                                boolean z10 = i11 != 0 ? false : z3;
                                TextStyle textStyleN = i12 != 0 ? TextStyle.INSTANCE.n() : textStyle2;
                                KeyboardOptions keyboardOptionsN = i13 != 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions2;
                                KeyboardActions keyboardActionsN = i14 != 0 ? KeyboardActions.INSTANCE.n() : keyboardActions2;
                                boolean z11 = i15 != 0 ? false : z4;
                                int i36 = i17 != 0 ? Integer.MAX_VALUE : i2;
                                VisualTransformation visualTransformationT = i19 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                Function1 function14 = i22 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$13
                                    public final void n(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        n(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                if (i23 != 0) {
                                    Object objIF = composerKN.iF();
                                    if (objIF == Composer.INSTANCE.n()) {
                                        objIF = InteractionSourceKt.n();
                                        composerKN.o(objIF);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                    i30 = i25;
                                } else {
                                    i30 = i25;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                if (i30 != 0) {
                                    composer2 = composerKN;
                                    solidColor = new SolidColor(Color.INSTANCE.n(), null);
                                    i31 = i27;
                                } else {
                                    composer2 = composerKN;
                                    solidColor = brush;
                                    i31 = i27;
                                }
                                Function3 function3T = i31 != 0 ? ComposableSingletons$BasicTextFieldKt.f19498n.t() : function3;
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-454732590, i8, i28, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:910)");
                                }
                                int i37 = i28 << 3;
                                boolean z12 = z10;
                                O(str2, function1, modifier4, z9, z12, textStyleN, keyboardOptionsN, keyboardActionsN, z11, i36, 1, visualTransformationT, function14, mutableInteractionSource3, solidColor, function3T, composer2, i8 & 2147483646, (i37 & 112) | 6 | (i37 & 896) | (i37 & 7168) | (57344 & i37) | (i37 & 458752), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier3 = modifier4;
                                z5 = z9;
                                z6 = z12;
                                textStyle3 = textStyleN;
                                keyboardOptions3 = keyboardOptionsN;
                                keyboardActions3 = keyboardActionsN;
                                z7 = z11;
                                i29 = i36;
                                visualTransformation2 = visualTransformationT;
                                function13 = function14;
                                mutableInteractionSource2 = mutableInteractionSource3;
                                brush2 = solidColor;
                                function32 = function3T;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$15
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i38) {
                                        BasicTextFieldKt.J2(str, function1, modifier3, z5, z6, textStyle3, keyboardOptions3, keyboardActions3, z7, i29, visualTransformation2, function13, mutableInteractionSource2, brush2, function32, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i17 = i16;
                        i18 = i7 & 1024;
                        if (i18 == 0) {
                        }
                        i21 = i7 & 2048;
                        if (i21 == 0) {
                        }
                        int i322 = i20;
                        i23 = i7 & 4096;
                        if (i23 == 0) {
                        }
                        i25 = i7 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i7 & 16384;
                        if (i27 == 0) {
                        }
                        if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i12 = i7 & 32;
                    if (i12 != 0) {
                    }
                    i13 = i7 & 64;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i7 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i7 & 512;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    i18 = i7 & 1024;
                    if (i18 == 0) {
                    }
                    i21 = i7 & 2048;
                    if (i21 == 0) {
                    }
                    int i3222 = i20;
                    i23 = i7 & 4096;
                    if (i23 == 0) {
                    }
                    i25 = i7 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i7 & 16384;
                    if (i27 == 0) {
                    }
                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                i12 = i7 & 32;
                if (i12 != 0) {
                }
                i13 = i7 & 64;
                if (i13 != 0) {
                }
                i14 = i7 & 128;
                if (i14 != 0) {
                }
                i15 = i7 & 256;
                if (i15 != 0) {
                }
                i16 = i7 & 512;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i7 & 1024;
                if (i18 == 0) {
                }
                i21 = i7 & 2048;
                if (i21 == 0) {
                }
                int i32222 = i20;
                i23 = i7 & 4096;
                if (i23 == 0) {
                }
                i25 = i7 & 8192;
                if (i25 == 0) {
                }
                i27 = i7 & 16384;
                if (i27 == 0) {
                }
                if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            i13 = i7 & 64;
            if (i13 != 0) {
            }
            i14 = i7 & 128;
            if (i14 != 0) {
            }
            i15 = i7 & 256;
            if (i15 != 0) {
            }
            i16 = i7 & 512;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i7 & 1024;
            if (i18 == 0) {
            }
            i21 = i7 & 2048;
            if (i21 == 0) {
            }
            int i322222 = i20;
            i23 = i7 & 4096;
            if (i23 == 0) {
            }
            i25 = i7 & 8192;
            if (i25 == 0) {
            }
            i27 = i7 & 16384;
            if (i27 == 0) {
            }
            if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        modifier2 = modifier;
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        i12 = i7 & 32;
        if (i12 != 0) {
        }
        i13 = i7 & 64;
        if (i13 != 0) {
        }
        i14 = i7 & 128;
        if (i14 != 0) {
        }
        i15 = i7 & 256;
        if (i15 != 0) {
        }
        i16 = i7 & 512;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i7 & 1024;
        if (i18 == 0) {
        }
        i21 = i7 & 2048;
        if (i21 == 0) {
        }
        int i3222222 = i20;
        i23 = i7 & 4096;
        if (i23 == 0) {
        }
        i25 = i7 & 8192;
        if (i25 == 0) {
        }
        i27 = i7 & 16384;
        if (i27 == 0) {
        }
        if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(final String str, final Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        Modifier modifier2;
        int i10;
        boolean z5;
        int i11;
        boolean z6;
        int i12;
        TextStyle textStyleN;
        int i13;
        KeyboardOptions keyboardOptionsN;
        int i14;
        KeyboardActions keyboardActions2;
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
        int i25;
        int i26;
        int i27;
        int i28;
        Composer composer2;
        final int i29;
        Brush brush2;
        final Function3 function32;
        final KeyboardActions keyboardActions3;
        final boolean z7;
        final KeyboardOptions keyboardOptions2;
        final boolean z9;
        final TextStyle textStyle2;
        final boolean z10;
        final int i30;
        final VisualTransformation visualTransformation2;
        final Function1 function13;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i31;
        int i32;
        boolean z11;
        Brush solidColor;
        Function3 function3N;
        int i33;
        int i34;
        boolean z12;
        boolean z13;
        TextStyle textStyle3;
        Modifier modifier3;
        VisualTransformation visualTransformation3;
        Function1 function14;
        KeyboardActions keyboardActions4;
        Brush brush3;
        KeyboardOptions keyboardOptions3;
        MutableInteractionSource mutableInteractionSource3;
        boolean z14;
        int i35;
        Composer composerKN = composer.KN(945255183);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = (composerKN.p5(str) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i5 & 48) == 0) {
            i9 |= composerKN.E2(function1) ? 32 : 16;
        }
        int i36 = i8 & 4;
        if (i36 != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i10 = i8 & 8;
            if (i10 == 0) {
                i9 |= 3072;
            } else {
                if ((i5 & 3072) == 0) {
                    z5 = z2;
                    i9 |= composerKN.n(z5) ? 2048 : 1024;
                }
                i11 = i8 & 16;
                if (i11 != 0) {
                    i9 |= 24576;
                } else {
                    if ((i5 & 24576) == 0) {
                        z6 = z3;
                        i9 |= composerKN.n(z6) ? 16384 : 8192;
                    }
                    i12 = i8 & 32;
                    if (i12 == 0) {
                        i9 |= 196608;
                        textStyleN = textStyle;
                    } else {
                        textStyleN = textStyle;
                        if ((i5 & 196608) == 0) {
                            i9 |= composerKN.p5(textStyleN) ? 131072 : 65536;
                        }
                    }
                    i13 = i8 & 64;
                    if (i13 == 0) {
                        i9 |= 1572864;
                        keyboardOptionsN = keyboardOptions;
                    } else {
                        keyboardOptionsN = keyboardOptions;
                        if ((i5 & 1572864) == 0) {
                            i9 |= composerKN.p5(keyboardOptionsN) ? 1048576 : 524288;
                        }
                    }
                    i14 = i8 & 128;
                    if (i14 == 0) {
                        i9 |= 12582912;
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i5 & 12582912) == 0) {
                            i9 |= composerKN.p5(keyboardActions2) ? 8388608 : 4194304;
                        }
                    }
                    i15 = i8 & 256;
                    if (i15 == 0) {
                        i9 |= 100663296;
                    } else if ((i5 & 100663296) == 0) {
                        i9 |= composerKN.n(z4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i9 |= ((i8 & 512) == 0 && composerKN.t(i2)) ? 536870912 : 268435456;
                    }
                    i16 = i8 & 1024;
                    if (i16 == 0) {
                        i18 = i7 | 6;
                        i17 = i16;
                    } else if ((i7 & 6) == 0) {
                        i17 = i16;
                        i18 = i7 | (composerKN.t(i3) ? 4 : 2);
                    } else {
                        i17 = i16;
                        i18 = i7;
                    }
                    i19 = i8 & 2048;
                    if (i19 == 0) {
                        i18 |= 48;
                        i20 = i19;
                    } else if ((i7 & 48) == 0) {
                        i20 = i19;
                        i18 |= composerKN.p5(visualTransformation) ? 32 : 16;
                    } else {
                        i20 = i19;
                    }
                    int i37 = i18;
                    i21 = i8 & 4096;
                    if (i21 == 0) {
                        i22 = i37 | RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i22 = i37 | (composerKN.E2(function12) ? 256 : 128);
                    } else {
                        i22 = i37;
                    }
                    i23 = i8 & 8192;
                    if (i23 == 0) {
                        i24 = i22 | 3072;
                    } else {
                        int i38 = i22;
                        if ((i7 & 3072) == 0) {
                            i24 = i38 | (composerKN.p5(mutableInteractionSource) ? 2048 : 1024);
                        } else {
                            i24 = i38;
                        }
                    }
                    i25 = i8 & 16384;
                    if (i25 != 0) {
                        i26 = i24;
                        if ((i7 & 24576) == 0) {
                            i26 |= composerKN.p5(brush) ? 16384 : 8192;
                        }
                        i27 = i8 & 32768;
                        if (i27 != 0) {
                            i26 |= 196608;
                        } else if ((i7 & 196608) == 0) {
                            i26 |= composerKN.E2(function3) ? 131072 : 65536;
                        }
                        i28 = i26;
                        if (composerKN.HI(((i9 & 306783379) == 306783378 && (74899 & i28) == 74898) ? false : true, i9 & 1)) {
                            composerKN.e();
                            if ((i5 & 1) == 0 || composerKN.rV9()) {
                                if (i36 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i10 != 0) {
                                    z5 = true;
                                }
                                if (i11 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    textStyleN = TextStyle.INSTANCE.n();
                                }
                                if (i13 != 0) {
                                    keyboardOptionsN = KeyboardOptions.INSTANCE.n();
                                }
                                KeyboardActions keyboardActionsN = i14 != 0 ? KeyboardActions.INSTANCE.n() : keyboardActions2;
                                boolean z15 = i15 != 0 ? false : z4;
                                if ((i8 & 512) != 0) {
                                    i31 = z15 ? 1 : Integer.MAX_VALUE;
                                    i9 &= -1879048193;
                                } else {
                                    i31 = i2;
                                }
                                int i39 = i17 != 0 ? 1 : i3;
                                VisualTransformation visualTransformationT = i20 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                Function1 function15 = i21 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$6
                                    public final void n(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        n(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                MutableInteractionSource mutableInteractionSource4 = i23 != 0 ? null : mutableInteractionSource;
                                if (i25 != 0) {
                                    i32 = i9;
                                    z11 = z15;
                                    solidColor = new SolidColor(Color.INSTANCE.n(), null);
                                } else {
                                    i32 = i9;
                                    z11 = z15;
                                    solidColor = brush;
                                }
                                if (i27 != 0) {
                                    function3N = ComposableSingletons$BasicTextFieldKt.f19498n.n();
                                    i33 = i31;
                                    i34 = i39;
                                    z12 = z5;
                                    z13 = z6;
                                    textStyle3 = textStyleN;
                                    modifier3 = modifier2;
                                    visualTransformation3 = visualTransformationT;
                                    function14 = function15;
                                    i9 = i32;
                                } else {
                                    i9 = i32;
                                    function3N = function3;
                                    i33 = i31;
                                    i34 = i39;
                                    z12 = z5;
                                    z13 = z6;
                                    textStyle3 = textStyleN;
                                    modifier3 = modifier2;
                                    visualTransformation3 = visualTransformationT;
                                    function14 = function15;
                                }
                                keyboardActions4 = keyboardActionsN;
                                brush3 = solidColor;
                                keyboardOptions3 = keyboardOptionsN;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                z14 = z11;
                            } else {
                                composerKN.wTp();
                                if ((i8 & 512) != 0) {
                                    i9 &= -1879048193;
                                }
                                z14 = z4;
                                i33 = i2;
                                i34 = i3;
                                visualTransformation3 = visualTransformation;
                                function3N = function3;
                                keyboardActions4 = keyboardActions2;
                                z12 = z5;
                                keyboardOptions3 = keyboardOptionsN;
                                z13 = z6;
                                textStyle3 = textStyleN;
                                modifier3 = modifier2;
                                function14 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                brush3 = brush;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(945255183, i9, i28, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:709)");
                            }
                            Object objIF = composerKN.iF();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                                i35 = i28;
                                MutableState mutableStateO = SnapshotStateKt__SnapshotStateKt.O(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                                composerKN.o(mutableStateO);
                                objIF = mutableStateO;
                            } else {
                                i35 = i28;
                            }
                            final MutableState mutableState = (MutableState) objIF;
                            final TextFieldValue textFieldValueO = TextFieldValue.O(Uo(mutableState), str, 0L, null, 6, null);
                            boolean zP5 = composerKN.p5(textFieldValueO);
                            Object objIF2 = composerKN.iF();
                            Modifier modifier4 = modifier3;
                            if (zP5 || objIF2 == companion.n()) {
                                objIF2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
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
                                        if (TextRange.Uo(textFieldValueO.getSelection(), BasicTextFieldKt.Uo(mutableState).getSelection()) && Intrinsics.areEqual(textFieldValueO.getComposition(), BasicTextFieldKt.Uo(mutableState).getComposition())) {
                                            return;
                                        }
                                        BasicTextFieldKt.KN(mutableState, textFieldValueO);
                                    }
                                };
                                composerKN.o(objIF2);
                            }
                            EffectsKt.KN((Function0) objIF2, composerKN, 0);
                            boolean z16 = (i9 & 14) == 4;
                            Object objIF3 = composerKN.iF();
                            if (z16 || objIF3 == companion.n()) {
                                objIF3 = SnapshotStateKt__SnapshotStateKt.O(str, null, 2, null);
                                composerKN.o(objIF3);
                            }
                            final MutableState mutableState2 = (MutableState) objIF3;
                            int i40 = i35;
                            ImeOptions imeOptionsQie = keyboardOptions3.qie(z14);
                            boolean z17 = !z14;
                            int i41 = z14 ? 1 : i34;
                            int i42 = z14 ? 1 : i33;
                            KeyboardOptions keyboardOptions4 = keyboardOptions3;
                            boolean zP52 = composerKN.p5(mutableState2) | ((i9 & 112) == 32);
                            Object objIF4 = composerKN.iF();
                            if (zP52 || objIF4 == companion.n()) {
                                objIF4 = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                        n(textFieldValue);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(TextFieldValue textFieldValue) {
                                        BasicTextFieldKt.KN(mutableState, textFieldValue);
                                        boolean zAreEqual = Intrinsics.areEqual(BasicTextFieldKt.xMQ(mutableState2), textFieldValue.xMQ());
                                        BasicTextFieldKt.mUb(mutableState2, textFieldValue.xMQ());
                                        if (zAreEqual) {
                                            return;
                                        }
                                        function1.invoke(textFieldValue.xMQ());
                                    }
                                };
                                composerKN.o(objIF4);
                            }
                            int i43 = i40 << 9;
                            composer2 = composerKN;
                            CoreTextFieldKt.n(textFieldValueO, (Function1) objIF4, modifier4, textStyle3, visualTransformation3, function14, mutableInteractionSource3, brush3, z17, i42, i41, imeOptionsQie, keyboardActions4, z12, z13, function3N, null, composer2, (i9 & 896) | ((i9 >> 6) & 7168) | (57344 & i43) | (458752 & i43) | (3670016 & i43) | (i43 & 29360128), ((i9 >> 15) & 896) | (i9 & 7168) | (i9 & 57344) | (i40 & 458752), 65536);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            modifier2 = modifier4;
                            textStyle2 = textStyle3;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            brush2 = brush3;
                            keyboardActions3 = keyboardActions4;
                            z7 = z12;
                            function32 = function3N;
                            keyboardOptions2 = keyboardOptions4;
                            z10 = z14;
                            visualTransformation2 = visualTransformation3;
                            function13 = function14;
                            z9 = z13;
                            i29 = i33;
                            i30 = i34;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            i29 = i2;
                            brush2 = brush;
                            function32 = function3;
                            keyboardActions3 = keyboardActions2;
                            z7 = z5;
                            keyboardOptions2 = keyboardOptionsN;
                            z9 = z6;
                            textStyle2 = textStyleN;
                            z10 = z4;
                            i30 = i3;
                            visualTransformation2 = visualTransformation;
                            function13 = function12;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            final Modifier modifier5 = modifier2;
                            final Brush brush4 = brush2;
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$9
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
                                    BasicTextFieldKt.O(str, function1, modifier5, z7, z9, textStyle2, keyboardOptions2, keyboardActions3, z10, i29, i30, visualTransformation2, function13, mutableInteractionSource2, brush4, function32, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i26 = i24 | 24576;
                    i27 = i8 & 32768;
                    if (i27 != 0) {
                    }
                    i28 = i26;
                    if (composerKN.HI(((i9 & 306783379) == 306783378 && (74899 & i28) == 74898) ? false : true, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z6 = z3;
                i12 = i8 & 32;
                if (i12 == 0) {
                }
                i13 = i8 & 64;
                if (i13 == 0) {
                }
                i14 = i8 & 128;
                if (i14 == 0) {
                }
                i15 = i8 & 256;
                if (i15 == 0) {
                }
                if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                i16 = i8 & 1024;
                if (i16 == 0) {
                }
                i19 = i8 & 2048;
                if (i19 == 0) {
                }
                int i372 = i18;
                i21 = i8 & 4096;
                if (i21 == 0) {
                }
                i23 = i8 & 8192;
                if (i23 == 0) {
                }
                i25 = i8 & 16384;
                if (i25 != 0) {
                }
                i27 = i8 & 32768;
                if (i27 != 0) {
                }
                i28 = i26;
                if (composerKN.HI(((i9 & 306783379) == 306783378 && (74899 & i28) == 74898) ? false : true, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z5 = z2;
            i11 = i8 & 16;
            if (i11 != 0) {
            }
            z6 = z3;
            i12 = i8 & 32;
            if (i12 == 0) {
            }
            i13 = i8 & 64;
            if (i13 == 0) {
            }
            i14 = i8 & 128;
            if (i14 == 0) {
            }
            i15 = i8 & 256;
            if (i15 == 0) {
            }
            if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            i16 = i8 & 1024;
            if (i16 == 0) {
            }
            i19 = i8 & 2048;
            if (i19 == 0) {
            }
            int i3722 = i18;
            i21 = i8 & 4096;
            if (i21 == 0) {
            }
            i23 = i8 & 8192;
            if (i23 == 0) {
            }
            i25 = i8 & 16384;
            if (i25 != 0) {
            }
            i27 = i8 & 32768;
            if (i27 != 0) {
            }
            i28 = i26;
            if (composerKN.HI(((i9 & 306783379) == 306783378 && (74899 & i28) == 74898) ? false : true, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 8;
        if (i10 == 0) {
        }
        z5 = z2;
        i11 = i8 & 16;
        if (i11 != 0) {
        }
        z6 = z3;
        i12 = i8 & 32;
        if (i12 == 0) {
        }
        i13 = i8 & 64;
        if (i13 == 0) {
        }
        i14 = i8 & 128;
        if (i14 == 0) {
        }
        i15 = i8 & 256;
        if (i15 == 0) {
        }
        if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        i16 = i8 & 1024;
        if (i16 == 0) {
        }
        i19 = i8 & 2048;
        if (i19 == 0) {
        }
        int i37222 = i18;
        i21 = i8 & 4096;
        if (i21 == 0) {
        }
        i23 = i8 & 8192;
        if (i23 == 0) {
        }
        i25 = i8 & 16384;
        if (i25 != 0) {
        }
        i27 = i8 & 32768;
        if (i27 != 0) {
        }
        i28 = i26;
        if (composerKN.HI(((i9 & 306783379) == 306783378 && (74899 & i28) == 74898) ? false : true, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2 function2, MutableInteractionSource mutableInteractionSource, Brush brush, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i2, final int i3, final int i5) {
        TextFieldState textFieldState2;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        int i10;
        InputTransformation inputTransformation2;
        int i11;
        TextStyle textStyle2;
        int i12;
        KeyboardOptions keyboardOptionsN;
        int i13;
        int i14;
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
        int i25;
        int i26;
        Composer composer2;
        final TextFieldLineLimits textFieldLineLimits2;
        final Function2 function22;
        final TextFieldDecorator textFieldDecorator2;
        final boolean z6;
        final boolean z7;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle3;
        final Modifier modifier3;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActionHandler keyboardActionHandler2;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        final OutputTransformation outputTransformation2;
        final ScrollState scrollState2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Function2 function23;
        MutableInteractionSource mutableInteractionSource3;
        ScrollState scrollStateT;
        TextFieldLineLimits textFieldLineLimits3;
        OutputTransformation outputTransformation3;
        Brush brush3;
        TextFieldDecorator textFieldDecorator3;
        KeyboardActionHandler keyboardActionHandler3;
        TextStyle textStyle4;
        Composer composerKN = composer.KN(469439921);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
            textFieldState2 = textFieldState;
        } else if ((i2 & 6) == 0) {
            textFieldState2 = textFieldState;
            i7 = (composerKN.p5(textFieldState2) ? 4 : 2) | i2;
        } else {
            textFieldState2 = textFieldState;
            i7 = i2;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i7 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i8 = i5 & 4;
            if (i8 == 0) {
                i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z4 = z2;
                    i7 |= composerKN.n(z4) ? 256 : 128;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z5 = z3;
                        i7 |= composerKN.n(z5) ? 2048 : 1024;
                    }
                    i10 = i5 & 16;
                    int i28 = 8192;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            inputTransformation2 = inputTransformation;
                            i7 |= composerKN.p5(inputTransformation2) ? 16384 : 8192;
                        }
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i7 |= 196608;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i2 & 196608) == 0) {
                                i7 |= composerKN.p5(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i7 |= 1572864;
                            keyboardOptionsN = keyboardOptions;
                        } else {
                            keyboardOptionsN = keyboardOptions;
                            if ((i2 & 1572864) == 0) {
                                i7 |= composerKN.p5(keyboardOptionsN) ? 1048576 : 524288;
                            }
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i7 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i7 |= composerKN.p5(keyboardActionHandler) ? 8388608 : 4194304;
                        }
                        i14 = i5 & 256;
                        if (i14 != 0) {
                            i7 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i15 = i14;
                                i7 |= composerKN.p5(textFieldLineLimits) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            i16 = i5 & 512;
                            if (i16 != 0) {
                                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i17 = i16;
                                    i7 |= composerKN.E2(function2) ? 536870912 : 268435456;
                                }
                                i18 = i5 & 1024;
                                if (i18 != 0) {
                                    i20 = i3 | 6;
                                    i19 = i18;
                                } else if ((i3 & 6) == 0) {
                                    i19 = i18;
                                    i20 = i3 | (composerKN.p5(mutableInteractionSource) ? 4 : 2);
                                } else {
                                    i19 = i18;
                                    i20 = i3;
                                }
                                i21 = i5 & 2048;
                                if (i21 != 0) {
                                    i20 |= 48;
                                    i22 = i21;
                                } else if ((i3 & 48) == 0) {
                                    i22 = i21;
                                    i20 |= composerKN.p5(brush) ? 32 : 16;
                                } else {
                                    i22 = i21;
                                }
                                int i29 = i20;
                                i23 = i5 & 4096;
                                if (i23 != 0) {
                                    i24 = i29 | RendererCapabilities.DECODER_SUPPORT_MASK;
                                } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i24 = i29 | (composerKN.p5(outputTransformation) ? 256 : 128);
                                } else {
                                    i24 = i29;
                                }
                                i25 = i5 & 8192;
                                if (i25 != 0) {
                                    i26 = i24 | 3072;
                                } else {
                                    int i30 = i24;
                                    if ((i3 & 3072) == 0) {
                                        i26 = i30 | ((i3 & 4096) == 0 ? composerKN.p5(textFieldDecorator) : composerKN.E2(textFieldDecorator) ? 2048 : 1024);
                                    } else {
                                        i26 = i30;
                                    }
                                }
                                if ((i3 & 24576) == 0) {
                                    if ((i5 & 16384) == 0 && composerKN.p5(scrollState)) {
                                        i28 = 16384;
                                    }
                                    i26 |= i28;
                                }
                                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i26 & 9363) == 9362) ? false : true, i7 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        if (i27 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i8 != 0) {
                                            z4 = true;
                                        }
                                        if (i9 != 0) {
                                            z5 = false;
                                        }
                                        if (i10 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        TextStyle textStyleN = i11 != 0 ? TextStyle.INSTANCE.n() : textStyle2;
                                        if (i12 != 0) {
                                            keyboardOptionsN = KeyboardOptions.INSTANCE.n();
                                        }
                                        KeyboardActionHandler keyboardActionHandler4 = i13 != 0 ? null : keyboardActionHandler;
                                        TextFieldLineLimits textFieldLineLimitsN = i15 != 0 ? TextFieldLineLimits.INSTANCE.n() : textFieldLineLimits;
                                        function23 = i17 != 0 ? null : function2;
                                        mutableInteractionSource3 = i19 != 0 ? null : mutableInteractionSource;
                                        Brush brushN = i22 != 0 ? BasicTextFieldDefaults.f19201n.n() : brush;
                                        OutputTransformation outputTransformation4 = i23 != 0 ? null : outputTransformation;
                                        TextFieldDecorator textFieldDecorator4 = i25 == 0 ? textFieldDecorator : null;
                                        if ((i5 & 16384) != 0) {
                                            i26 &= -57345;
                                            scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                        } else {
                                            scrollStateT = scrollState;
                                        }
                                        textFieldLineLimits3 = textFieldLineLimitsN;
                                        outputTransformation3 = outputTransformation4;
                                        brush3 = brushN;
                                        textFieldDecorator3 = textFieldDecorator4;
                                        keyboardActionHandler3 = keyboardActionHandler4;
                                        textStyle4 = textStyleN;
                                    } else {
                                        composerKN.wTp();
                                        if ((i5 & 16384) != 0) {
                                            i26 &= -57345;
                                        }
                                        textFieldLineLimits3 = textFieldLineLimits;
                                        function23 = function2;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        brush3 = brush;
                                        outputTransformation3 = outputTransformation;
                                        textFieldDecorator3 = textFieldDecorator;
                                        scrollStateT = scrollState;
                                        textStyle4 = textStyle2;
                                        keyboardActionHandler3 = keyboardActionHandler;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(469439921, i7, i26, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:194)");
                                    }
                                    int i31 = (i26 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | (i26 & 112);
                                    int i32 = i26 << 3;
                                    InputTransformation inputTransformation4 = inputTransformation2;
                                    KeyboardOptions keyboardOptions3 = keyboardOptionsN;
                                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                    composer2 = composerKN;
                                    TextFieldState textFieldState3 = textFieldState2;
                                    Modifier modifier4 = modifier2;
                                    TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits3;
                                    rl(textFieldState3, modifier4, z4, z5, inputTransformation4, textStyle4, keyboardOptions3, keyboardActionHandler3, textFieldLineLimits4, function23, mutableInteractionSource4, brush3, null, outputTransformation3, textFieldDecorator3, scrollStateT, false, composer2, i7 & 2147483646, i31 | (i32 & 7168) | (57344 & i32) | (i32 & 458752), 65536);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier3 = modifier4;
                                    z6 = z4;
                                    z7 = z5;
                                    inputTransformation3 = inputTransformation4;
                                    textStyle3 = textStyle4;
                                    keyboardOptions2 = keyboardOptions3;
                                    keyboardActionHandler2 = keyboardActionHandler3;
                                    textFieldLineLimits2 = textFieldLineLimits4;
                                    function22 = function23;
                                    mutableInteractionSource2 = mutableInteractionSource4;
                                    brush2 = brush3;
                                    outputTransformation2 = outputTransformation3;
                                    textFieldDecorator2 = textFieldDecorator3;
                                    scrollState2 = scrollStateT;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    textFieldLineLimits2 = textFieldLineLimits;
                                    function22 = function2;
                                    textFieldDecorator2 = textFieldDecorator;
                                    z6 = z4;
                                    z7 = z5;
                                    inputTransformation3 = inputTransformation2;
                                    textStyle3 = textStyle2;
                                    modifier3 = modifier2;
                                    keyboardOptions2 = keyboardOptionsN;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    brush2 = brush;
                                    outputTransformation2 = outputTransformation;
                                    scrollState2 = scrollState;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i33) {
                                            BasicTextFieldKt.n(textFieldState, modifier3, z6, z7, inputTransformation3, textStyle3, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, function22, mutableInteractionSource2, brush2, outputTransformation2, textFieldDecorator2, scrollState2, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            i17 = i16;
                            i18 = i5 & 1024;
                            if (i18 != 0) {
                            }
                            i21 = i5 & 2048;
                            if (i21 != 0) {
                            }
                            int i292 = i20;
                            i23 = i5 & 4096;
                            if (i23 != 0) {
                            }
                            i25 = i5 & 8192;
                            if (i25 != 0) {
                            }
                            if ((i3 & 24576) == 0) {
                            }
                            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i26 & 9363) == 9362) ? false : true, i7 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i5 & 512;
                        if (i16 != 0) {
                        }
                        i17 = i16;
                        i18 = i5 & 1024;
                        if (i18 != 0) {
                        }
                        i21 = i5 & 2048;
                        if (i21 != 0) {
                        }
                        int i2922 = i20;
                        i23 = i5 & 4096;
                        if (i23 != 0) {
                        }
                        i25 = i5 & 8192;
                        if (i25 != 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i26 & 9363) == 9362) ? false : true, i7 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    inputTransformation2 = inputTransformation;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i5 & 512;
                    if (i16 != 0) {
                    }
                    i17 = i16;
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                    }
                    i21 = i5 & 2048;
                    if (i21 != 0) {
                    }
                    int i29222 = i20;
                    i23 = i5 & 4096;
                    if (i23 != 0) {
                    }
                    i25 = i5 & 8192;
                    if (i25 != 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i26 & 9363) == 9362) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z5 = z3;
                i10 = i5 & 16;
                int i282 = 8192;
                if (i10 == 0) {
                }
                inputTransformation2 = inputTransformation;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i5 & 512;
                if (i16 != 0) {
                }
                i17 = i16;
                i18 = i5 & 1024;
                if (i18 != 0) {
                }
                i21 = i5 & 2048;
                if (i21 != 0) {
                }
                int i292222 = i20;
                i23 = i5 & 4096;
                if (i23 != 0) {
                }
                i25 = i5 & 8192;
                if (i25 != 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i26 & 9363) == 9362) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z4 = z2;
            i9 = i5 & 8;
            if (i9 != 0) {
            }
            z5 = z3;
            i10 = i5 & 16;
            int i2822 = 8192;
            if (i10 == 0) {
            }
            inputTransformation2 = inputTransformation;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i5 & 256;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i5 & 512;
            if (i16 != 0) {
            }
            i17 = i16;
            i18 = i5 & 1024;
            if (i18 != 0) {
            }
            i21 = i5 & 2048;
            if (i21 != 0) {
            }
            int i2922222 = i20;
            i23 = i5 & 4096;
            if (i23 != 0) {
            }
            i25 = i5 & 8192;
            if (i25 != 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i26 & 9363) == 9362) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        z4 = z2;
        i9 = i5 & 8;
        if (i9 != 0) {
        }
        z5 = z3;
        i10 = i5 & 16;
        int i28222 = 8192;
        if (i10 == 0) {
        }
        inputTransformation2 = inputTransformation;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i5 & 256;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i5 & 512;
        if (i16 != 0) {
        }
        i17 = i16;
        i18 = i5 & 1024;
        if (i18 != 0) {
        }
        i21 = i5 & 2048;
        if (i21 != 0) {
        }
        int i29222222 = i20;
        i23 = i5 & 4096;
        if (i23 != 0) {
        }
        i25 = i5 & 8192;
        if (i25 != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i26 & 9363) == 9362) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
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
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void nr(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i3, final int i5, final int i7) {
        TextFieldValue textFieldValue2;
        int i8;
        int i9;
        Modifier modifier2;
        int i10;
        int i11;
        int i12;
        TextStyle textStyle2;
        int i13;
        KeyboardOptions keyboardOptions2;
        int i14;
        KeyboardActions keyboardActions2;
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
        int i25;
        int i26;
        int i27;
        int i28;
        Composer composer2;
        final boolean z5;
        final boolean z6;
        final boolean z7;
        final Function1 function13;
        final MutableInteractionSource mutableInteractionSource2;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final Modifier modifier3;
        final int i29;
        final VisualTransformation visualTransformation2;
        final Brush brush2;
        final Function3 function32;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i30;
        MutableInteractionSource mutableInteractionSource3;
        Brush solidColor;
        int i31;
        Composer composerKN = composer.KN(-560482651);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
            textFieldValue2 = textFieldValue;
        } else if ((i3 & 6) == 0) {
            textFieldValue2 = textFieldValue;
            i8 = (composerKN.p5(textFieldValue2) ? 4 : 2) | i3;
        } else {
            textFieldValue2 = textFieldValue;
            i8 = i3;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i8 |= composerKN.E2(function1) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i8 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        i8 |= composerKN.n(z2) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            i8 |= composerKN.n(z3) ? 16384 : 8192;
                        }
                        i12 = i7 & 32;
                        if (i12 != 0) {
                            i8 |= 196608;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i3 & 196608) == 0) {
                                i8 |= composerKN.p5(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i13 = i7 & 64;
                        if (i13 != 0) {
                            i8 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i3 & 1572864) == 0) {
                                i8 |= composerKN.p5(keyboardOptions2) ? 1048576 : 524288;
                            }
                        }
                        i14 = i7 & 128;
                        if (i14 != 0) {
                            i8 |= 12582912;
                            keyboardActions2 = keyboardActions;
                        } else {
                            keyboardActions2 = keyboardActions;
                            if ((i3 & 12582912) == 0) {
                                i8 |= composerKN.p5(keyboardActions2) ? 8388608 : 4194304;
                            }
                        }
                        i15 = i7 & 256;
                        if (i15 != 0) {
                            i8 |= 100663296;
                        } else if ((i3 & 100663296) == 0) {
                            i8 |= composerKN.n(z4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i16 = i7 & 512;
                        if (i16 == 0) {
                            if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i17 = i16;
                                i8 |= composerKN.t(i2) ? 536870912 : 268435456;
                            }
                            i18 = i7 & 1024;
                            if (i18 == 0) {
                                i20 = i5 | 6;
                                i19 = i18;
                            } else if ((i5 & 6) == 0) {
                                i19 = i18;
                                i20 = i5 | (composerKN.p5(visualTransformation) ? 4 : 2);
                            } else {
                                i19 = i18;
                                i20 = i5;
                            }
                            i21 = i7 & 2048;
                            if (i21 == 0) {
                                i20 |= 48;
                                i22 = i21;
                            } else if ((i5 & 48) == 0) {
                                i22 = i21;
                                i20 |= composerKN.E2(function12) ? 32 : 16;
                            } else {
                                i22 = i21;
                            }
                            int i32 = i20;
                            i23 = i7 & 4096;
                            if (i23 == 0) {
                                i24 = i32 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i33 = i32;
                                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i33 |= composerKN.p5(mutableInteractionSource) ? 256 : 128;
                                }
                                i24 = i33;
                            }
                            i25 = i7 & 8192;
                            if (i25 == 0) {
                                i26 = i24 | 3072;
                            } else {
                                int i34 = i24;
                                if ((i5 & 3072) == 0) {
                                    i26 = i34 | (composerKN.p5(brush) ? 2048 : 1024);
                                } else {
                                    i26 = i34;
                                }
                            }
                            i27 = i7 & 16384;
                            if (i27 == 0) {
                                i28 = i26 | 24576;
                            } else {
                                int i35 = i26;
                                if ((i5 & 24576) == 0) {
                                    i35 |= composerKN.E2(function3) ? 16384 : 8192;
                                }
                                i28 = i35;
                            }
                            if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                z5 = z2;
                                z6 = z3;
                                z7 = z4;
                                function13 = function12;
                                mutableInteractionSource2 = mutableInteractionSource;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                modifier3 = modifier2;
                                i29 = i2;
                                visualTransformation2 = visualTransformation;
                                brush2 = brush;
                                function32 = function3;
                            } else {
                                Modifier modifier4 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                                boolean z9 = i10 != 0 ? true : z2;
                                boolean z10 = i11 != 0 ? false : z3;
                                TextStyle textStyleN = i12 != 0 ? TextStyle.INSTANCE.n() : textStyle2;
                                KeyboardOptions keyboardOptionsN = i13 != 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions2;
                                KeyboardActions keyboardActionsN = i14 != 0 ? KeyboardActions.INSTANCE.n() : keyboardActions2;
                                boolean z11 = i15 != 0 ? false : z4;
                                int i36 = i17 != 0 ? Integer.MAX_VALUE : i2;
                                VisualTransformation visualTransformationT = i19 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                Function1 function14 = i22 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$16
                                    public final void n(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        n(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                if (i23 != 0) {
                                    Object objIF = composerKN.iF();
                                    if (objIF == Composer.INSTANCE.n()) {
                                        objIF = InteractionSourceKt.n();
                                        composerKN.o(objIF);
                                    }
                                    mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                    i30 = i25;
                                } else {
                                    i30 = i25;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                if (i30 != 0) {
                                    composer2 = composerKN;
                                    solidColor = new SolidColor(Color.INSTANCE.n(), null);
                                    i31 = i27;
                                } else {
                                    composer2 = composerKN;
                                    solidColor = brush;
                                    i31 = i27;
                                }
                                Function3 function3Nr = i31 != 0 ? ComposableSingletons$BasicTextFieldKt.f19498n.nr() : function3;
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-560482651, i8, i28, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:950)");
                                }
                                int i37 = i28 << 3;
                                boolean z12 = z10;
                                t(textFieldValue2, function1, modifier4, z9, z12, textStyleN, keyboardOptionsN, keyboardActionsN, z11, i36, 1, visualTransformationT, function14, mutableInteractionSource3, solidColor, function3Nr, composer2, i8 & 2147483646, (i37 & 112) | 6 | (i37 & 896) | (i37 & 7168) | (57344 & i37) | (i37 & 458752), 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier3 = modifier4;
                                z5 = z9;
                                z6 = z12;
                                textStyle3 = textStyleN;
                                keyboardOptions3 = keyboardOptionsN;
                                keyboardActions3 = keyboardActionsN;
                                z7 = z11;
                                i29 = i36;
                                visualTransformation2 = visualTransformationT;
                                function13 = function14;
                                mutableInteractionSource2 = mutableInteractionSource3;
                                brush2 = solidColor;
                                function32 = function3Nr;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$18
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i38) {
                                        BasicTextFieldKt.nr(textFieldValue, function1, modifier3, z5, z6, textStyle3, keyboardOptions3, keyboardActions3, z7, i29, visualTransformation2, function13, mutableInteractionSource2, brush2, function32, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i17 = i16;
                        i18 = i7 & 1024;
                        if (i18 == 0) {
                        }
                        i21 = i7 & 2048;
                        if (i21 == 0) {
                        }
                        int i322 = i20;
                        i23 = i7 & 4096;
                        if (i23 == 0) {
                        }
                        i25 = i7 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i7 & 16384;
                        if (i27 == 0) {
                        }
                        if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i12 = i7 & 32;
                    if (i12 != 0) {
                    }
                    i13 = i7 & 64;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i7 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i7 & 512;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    i18 = i7 & 1024;
                    if (i18 == 0) {
                    }
                    i21 = i7 & 2048;
                    if (i21 == 0) {
                    }
                    int i3222 = i20;
                    i23 = i7 & 4096;
                    if (i23 == 0) {
                    }
                    i25 = i7 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i7 & 16384;
                    if (i27 == 0) {
                    }
                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                i12 = i7 & 32;
                if (i12 != 0) {
                }
                i13 = i7 & 64;
                if (i13 != 0) {
                }
                i14 = i7 & 128;
                if (i14 != 0) {
                }
                i15 = i7 & 256;
                if (i15 != 0) {
                }
                i16 = i7 & 512;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i7 & 1024;
                if (i18 == 0) {
                }
                i21 = i7 & 2048;
                if (i21 == 0) {
                }
                int i32222 = i20;
                i23 = i7 & 4096;
                if (i23 == 0) {
                }
                i25 = i7 & 8192;
                if (i25 == 0) {
                }
                i27 = i7 & 16384;
                if (i27 == 0) {
                }
                if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            i13 = i7 & 64;
            if (i13 != 0) {
            }
            i14 = i7 & 128;
            if (i14 != 0) {
            }
            i15 = i7 & 256;
            if (i15 != 0) {
            }
            i16 = i7 & 512;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i7 & 1024;
            if (i18 == 0) {
            }
            i21 = i7 & 2048;
            if (i21 == 0) {
            }
            int i322222 = i20;
            i23 = i7 & 4096;
            if (i23 == 0) {
            }
            i25 = i7 & 8192;
            if (i25 == 0) {
            }
            i27 = i7 & 16384;
            if (i27 == 0) {
            }
            if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        modifier2 = modifier;
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        i12 = i7 & 32;
        if (i12 != 0) {
        }
        i13 = i7 & 64;
        if (i13 != 0) {
        }
        i14 = i7 & 128;
        if (i14 != 0) {
        }
        i15 = i7 & 256;
        if (i15 != 0) {
        }
        i16 = i7 & 512;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i7 & 1024;
        if (i18 == 0) {
        }
        i21 = i7 & 2048;
        if (i21 == 0) {
        }
        int i3222222 = i20;
        i23 = i7 & 4096;
        if (i23 == 0) {
        }
        i25 = i7 & 8192;
        if (i25 == 0) {
        }
        i27 = i7 & 16384;
        if (i27 == 0) {
        }
        if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 9363) != 9362, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:396:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2 function2, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, boolean z4, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        int i10;
        boolean z5;
        int i11;
        InputTransformation inputTransformation2;
        int i12;
        TextStyle textStyleN;
        int i13;
        KeyboardOptions keyboardOptionsN;
        int i14;
        KeyboardActionHandler keyboardActionHandler2;
        int i15;
        TextFieldLineLimits textFieldLineLimits2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        ScrollState scrollStateT;
        int i28;
        int i29;
        final boolean z6;
        final boolean z7;
        final Brush brush2;
        final boolean z9;
        final ScrollState scrollState2;
        Composer composer2;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle2;
        final KeyboardOptions keyboardOptions2;
        final TextFieldLineLimits textFieldLineLimits3;
        final KeyboardActionHandler keyboardActionHandler3;
        final Modifier modifier3;
        final Function2 function22;
        final MutableInteractionSource mutableInteractionSource2;
        final CodepointTransformation codepointTransformation2;
        final OutputTransformation outputTransformation2;
        final TextFieldDecorator textFieldDecorator2;
        ScopeUpdateScope scopeUpdateScopeGh;
        TextFieldLineLimits textFieldLineLimitsN;
        MutableInteractionSource mutableInteractionSource3;
        CodepointTransformation codepointTransformation3;
        int i30;
        boolean z10;
        final ScrollState scrollState3;
        final TextFieldDecorator textFieldDecorator3;
        final TextStyle textStyle3;
        final Function2 function23;
        final Brush brush3;
        final boolean z11;
        OutputTransformation outputTransformation3;
        int i31;
        boolean z12;
        boolean z13;
        MutableInteractionSource mutableInteractionSource4;
        MutableInteractionSource mutableInteractionSource5;
        Density density;
        final TextFieldLineLimits textFieldLineLimits4;
        CodepointTransformation codepointTransformation4;
        TransformedTextFieldState transformedTextFieldState;
        Density density2;
        boolean z14;
        KeyboardOptions keyboardOptions3;
        final BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1;
        boolean zP5;
        Object objIF;
        InputTransformation inputTransformation4;
        boolean z15;
        boolean zE2;
        Object objIF2;
        int i32;
        Composer composerKN = composer.KN(965149429);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = i2 | (composerKN.p5(textFieldState) ? 4 : 2);
        } else {
            i7 = i2;
        }
        int i33 = i5 & 2;
        if (i33 != 0) {
            modifier2 = modifier;
            i9 = i7 | 48;
            i8 = 4;
        } else {
            modifier2 = modifier;
            i8 = 4;
            if ((i2 & 48) == 0) {
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7;
        }
        int i34 = i5 & 4;
        if (i34 != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i9 |= composerKN.n(z2) ? 256 : 128;
            }
            i10 = i5 & 8;
            if (i10 == 0) {
                i9 |= 3072;
                z5 = true;
            } else {
                z5 = true;
                if ((i2 & 3072) == 0) {
                    i9 |= composerKN.n(z3) ? 2048 : 1024;
                }
                i11 = i5 & 16;
                if (i11 != 0) {
                    i9 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        inputTransformation2 = inputTransformation;
                        i9 |= composerKN.p5(inputTransformation2) ? 16384 : 8192;
                    }
                    i12 = i5 & 32;
                    if (i12 == 0) {
                        i9 |= 196608;
                        textStyleN = textStyle;
                    } else {
                        textStyleN = textStyle;
                        if ((i2 & 196608) == 0) {
                            i9 |= composerKN.p5(textStyleN) ? 131072 : 65536;
                        }
                    }
                    i13 = i5 & 64;
                    if (i13 == 0) {
                        i9 |= 1572864;
                        keyboardOptionsN = keyboardOptions;
                    } else {
                        keyboardOptionsN = keyboardOptions;
                        if ((i2 & 1572864) == 0) {
                            i9 |= composerKN.p5(keyboardOptionsN) ? 1048576 : 524288;
                        }
                    }
                    i14 = i5 & 128;
                    if (i14 == 0) {
                        i9 |= 12582912;
                        keyboardActionHandler2 = keyboardActionHandler;
                    } else {
                        keyboardActionHandler2 = keyboardActionHandler;
                        if ((i2 & 12582912) == 0) {
                            i9 |= composerKN.p5(keyboardActionHandler2) ? 8388608 : 4194304;
                        }
                    }
                    i15 = i5 & 256;
                    if (i15 == 0) {
                        i9 |= 100663296;
                        textFieldLineLimits2 = textFieldLineLimits;
                    } else {
                        textFieldLineLimits2 = textFieldLineLimits;
                        if ((i2 & 100663296) == 0) {
                            i9 |= composerKN.p5(textFieldLineLimits2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                    }
                    i16 = i5 & 512;
                    if (i16 == 0) {
                        i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        i17 = i16;
                    } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i17 = i16;
                        i9 |= composerKN.E2(function2) ? 536870912 : 268435456;
                    } else {
                        i17 = i16;
                    }
                    i18 = i5 & 1024;
                    if (i18 == 0) {
                        i20 = i18;
                        i19 = i3 | 6;
                    } else {
                        if ((i3 & 6) == 0) {
                            i19 = i3 | (composerKN.p5(mutableInteractionSource) ? i8 : 2);
                        } else {
                            i19 = i3;
                        }
                        i20 = i18;
                    }
                    i21 = i5 & 2048;
                    if (i21 == 0) {
                        i19 |= 48;
                    } else if ((i3 & 48) == 0) {
                        i19 |= composerKN.p5(brush) ? 32 : 16;
                    }
                    int i35 = i19;
                    i22 = i5 & 4096;
                    if (i22 == 0) {
                        i24 = i35 | RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else {
                        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                            i23 = i22;
                            i24 = i35;
                            i25 = i5 & 8192;
                            if (i25 != 0) {
                                i24 |= 3072;
                            } else if ((i3 & 3072) == 0) {
                                i24 |= composerKN.p5(outputTransformation) ? 2048 : 1024;
                            }
                            i26 = i5 & 16384;
                            if (i26 != 0) {
                                i24 |= 24576;
                                i27 = 32768;
                            } else {
                                i27 = 32768;
                                if ((i3 & 24576) == 0) {
                                    i24 |= (i3 & 32768) == 0 ? composerKN.p5(textFieldDecorator) : composerKN.E2(textFieldDecorator) ? 16384 : 8192;
                                }
                            }
                            if ((i3 & 196608) == 0) {
                                if ((i5 & i27) == 0) {
                                    scrollStateT = scrollState;
                                    if (composerKN.p5(scrollStateT)) {
                                        i32 = 131072;
                                    }
                                    i24 |= i32;
                                } else {
                                    scrollStateT = scrollState;
                                }
                                i32 = 65536;
                                i24 |= i32;
                            } else {
                                scrollStateT = scrollState;
                            }
                            i28 = i5 & 65536;
                            if (i28 != 0) {
                                i24 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i24 |= composerKN.n(z4) ? 1048576 : 524288;
                            }
                            i29 = i24;
                            if (composerKN.HI(((i9 & 306783379) == 306783378 && (i29 & 599187) == 599186) ? false : z5, i9 & 1)) {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    if (i33 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    boolean z16 = i34 != 0 ? z5 : z2;
                                    boolean z17 = i10 != 0 ? false : z3;
                                    if (i11 != 0) {
                                        inputTransformation2 = null;
                                    }
                                    if (i12 != 0) {
                                        textStyleN = TextStyle.INSTANCE.n();
                                    }
                                    if (i13 != 0) {
                                        keyboardOptionsN = KeyboardOptions.INSTANCE.n();
                                    }
                                    if (i14 != 0) {
                                        keyboardActionHandler2 = null;
                                    }
                                    textFieldLineLimitsN = i15 != 0 ? TextFieldLineLimits.INSTANCE.n() : textFieldLineLimits2;
                                    Function2 function24 = i17 != 0 ? null : function2;
                                    mutableInteractionSource3 = i20 != 0 ? null : mutableInteractionSource;
                                    Brush brushN = i21 != 0 ? BasicTextFieldDefaults.f19201n.n() : brush;
                                    codepointTransformation3 = i23 != 0 ? null : codepointTransformation;
                                    OutputTransformation outputTransformation4 = i25 != 0 ? null : outputTransformation;
                                    TextFieldDecorator textFieldDecorator4 = i26 != 0 ? null : textFieldDecorator;
                                    if ((i5 & i27) != 0) {
                                        scrollStateT = ScrollKt.t(0, composerKN, 0, z5 ? 1 : 0);
                                        i30 = i29 & (-458753);
                                    } else {
                                        i30 = i29;
                                    }
                                    z10 = z16;
                                    scrollState3 = scrollStateT;
                                    textFieldDecorator3 = textFieldDecorator4;
                                    textStyle3 = textStyleN;
                                    function23 = function24;
                                    brush3 = brushN;
                                    z11 = z17;
                                    outputTransformation3 = outputTransformation4;
                                    i31 = i30;
                                    z12 = i28 != 0 ? false : z4;
                                } else {
                                    composerKN.wTp();
                                    if ((i5 & i27) != 0) {
                                        z10 = z2;
                                        z11 = z3;
                                        function23 = function2;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        brush3 = brush;
                                        codepointTransformation3 = codepointTransformation;
                                        textFieldDecorator3 = textFieldDecorator;
                                        z12 = z4;
                                        scrollState3 = scrollStateT;
                                        textStyle3 = textStyleN;
                                        textFieldLineLimitsN = textFieldLineLimits2;
                                        i31 = i29 & (-458753);
                                        outputTransformation3 = outputTransformation;
                                    } else {
                                        z10 = z2;
                                        z11 = z3;
                                        function23 = function2;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        brush3 = brush;
                                        codepointTransformation3 = codepointTransformation;
                                        outputTransformation3 = outputTransformation;
                                        textFieldDecorator3 = textFieldDecorator;
                                        z12 = z4;
                                        scrollState3 = scrollStateT;
                                        textStyle3 = textStyleN;
                                        textFieldLineLimitsN = textFieldLineLimits2;
                                        i31 = i29;
                                    }
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(965149429, i9, i31, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:244)");
                                }
                                Density density3 = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                LayoutDirection layoutDirection = (LayoutDirection) composerKN.ty(CompositionLocalsKt.az());
                                WindowInfo windowInfo = (WindowInfo) composerKN.ty(CompositionLocalsKt.S());
                                final boolean zAreEqual = Intrinsics.areEqual(textFieldLineLimitsN, TextFieldLineLimits.SingleLine.rl);
                                if (mutableInteractionSource3 == null) {
                                    composerKN.eF(97517141);
                                    Object objIF3 = composerKN.iF();
                                    z13 = z12;
                                    if (objIF3 == Composer.INSTANCE.n()) {
                                        objIF3 = InteractionSourceKt.n();
                                        composerKN.o(objIF3);
                                    }
                                    mutableInteractionSource4 = (MutableInteractionSource) objIF3;
                                    composerKN.Xw();
                                } else {
                                    z13 = z12;
                                    composerKN.eF(-1243780926);
                                    composerKN.Xw();
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                Orientation orientation = zAreEqual ? Orientation.f16970t : Orientation.f16969n;
                                final boolean zBooleanValue = ((Boolean) FocusInteractionKt.n(mutableInteractionSource4, composerKN, 0).getValue()).booleanValue();
                                final boolean zBooleanValue2 = ((Boolean) HoverInteractionKt.n(mutableInteractionSource4, composerKN, 0).getValue()).booleanValue();
                                final boolean zN = windowInfo.n();
                                Object objIF4 = composerKN.iF();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objIF4 == companion.n()) {
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    density = density3;
                                    textFieldLineLimits4 = textFieldLineLimitsN;
                                    r rVarRl = nKK.rl(1, 0, ILs.j.f4184O, 2, null);
                                    composerKN.o(rVarRl);
                                    objIF4 = rVarRl;
                                } else {
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    density = density3;
                                    textFieldLineLimits4 = textFieldLineLimitsN;
                                }
                                final r rVar = (r) objIF4;
                                boolean z18 = ((i9 & 14) == i8) | ((i31 & 896) == 256) | ((i31 & 7168) == 2048);
                                Object objIF5 = composerKN.iF();
                                if (z18 || objIF5 == companion.n()) {
                                    if (codepointTransformation3 == null) {
                                        codepointTransformation4 = SingleLineCodepointTransformation.f20189n;
                                        if (!zAreEqual) {
                                            codepointTransformation4 = null;
                                        }
                                    } else {
                                        codepointTransformation4 = codepointTransformation3;
                                    }
                                    objIF5 = new TransformedTextFieldState(textFieldState, inputTransformation2, codepointTransformation4, outputTransformation3);
                                    composerKN.o(objIF5);
                                }
                                TransformedTextFieldState transformedTextFieldState2 = (TransformedTextFieldState) objIF5;
                                boolean zP52 = composerKN.p5(transformedTextFieldState2);
                                Object objIF6 = composerKN.iF();
                                if (zP52 || objIF6 == companion.n()) {
                                    objIF6 = new TextLayoutState();
                                    composerKN.o(objIF6);
                                }
                                final TextLayoutState textLayoutState = (TextLayoutState) objIF6;
                                final KeyboardOptions keyboardOptionsT = keyboardOptionsN.t(inputTransformation2 != null ? inputTransformation2.getKeyboardOptions() : null);
                                boolean zP53 = composerKN.p5(transformedTextFieldState2);
                                Object objIF7 = composerKN.iF();
                                if (zP53 || objIF7 == companion.n()) {
                                    boolean z19 = z10;
                                    boolean z20 = z11;
                                    objIF7 = new TextFieldSelectionState(transformedTextFieldState2, textLayoutState, density, z19, z20, zBooleanValue && zN, z13);
                                    transformedTextFieldState = transformedTextFieldState2;
                                    textLayoutState = textLayoutState;
                                    density2 = density;
                                    z10 = z19;
                                    z11 = z20;
                                    z14 = z13;
                                    composerKN.o(objIF7);
                                } else {
                                    z14 = z13;
                                    transformedTextFieldState = transformedTextFieldState2;
                                    density2 = density;
                                }
                                final TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) objIF7;
                                OutputTransformation outputTransformation5 = outputTransformation3;
                                Object objIF8 = composerKN.iF();
                                if (objIF8 == companion.n()) {
                                    objIF8 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                                    composerKN.o(objIF8);
                                }
                                vd vdVar = (vd) objIF8;
                                final HapticFeedback hapticFeedback = (HapticFeedback) composerKN.ty(CompositionLocalsKt.gh());
                                final boolean z21 = z14;
                                final Clipboard clipboard = (Clipboard) composerKN.ty(CompositionLocalsKt.nr());
                                int i36 = i31;
                                TextToolbar textToolbar = (TextToolbar) composerKN.ty(CompositionLocalsKt.o());
                                boolean zP54 = composerKN.p5(vdVar) | composerKN.p5(textToolbar);
                                final InputTransformation inputTransformation5 = inputTransformation2;
                                Object objIF9 = composerKN.iF();
                                if (zP54) {
                                    keyboardOptions3 = keyboardOptionsN;
                                } else {
                                    keyboardOptions3 = keyboardOptionsN;
                                    if (objIF9 == companion.n()) {
                                    }
                                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1 = (BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1) objIF9;
                                    zP5 = composerKN.p5(transformedTextFieldState) | ((57344 & i9) != 16384) | composerKN.E2(textFieldSelectionState) | composerKN.E2(hapticFeedback) | composerKN.E2(clipboard) | composerKN.p5(basicTextFieldKt$BasicTextField$textToolbarHandler$1$1) | composerKN.p5(density2) | ((i9 & 896) != 256) | ((i9 & 7168) != 2048) | ((i36 & 3670016) != 1048576);
                                    objIF = composerKN.iF();
                                    if (!zP5 || objIF == companion.n()) {
                                        final Density density4 = density2;
                                        final TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState;
                                        final boolean z22 = z10;
                                        final boolean z23 = z11;
                                        objIF = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                                                transformedTextFieldState3.e(inputTransformation5);
                                                textFieldSelectionState.hRu(hapticFeedback, clipboard, basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, density4, z22, z23, z21);
                                            }
                                        };
                                        inputTransformation4 = inputTransformation5;
                                        z15 = z21;
                                        composerKN.o(objIF);
                                    } else {
                                        inputTransformation4 = inputTransformation5;
                                        z15 = z21;
                                    }
                                    EffectsKt.KN((Function0) objIF, composerKN, 0);
                                    zE2 = composerKN.E2(textFieldSelectionState);
                                    objIF2 = composerKN.iF();
                                    if (!zE2 || objIF2 == companion.n()) {
                                        objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void n() {
                                                        textFieldSelectionState2.P5();
                                                    }
                                                };
                                            }
                                        };
                                        composerKN.o(objIF2);
                                    }
                                    EffectsKt.rl(textFieldSelectionState, (Function1) objIF2, composerKN, 0);
                                    if (z15) {
                                        int keyboardType = keyboardOptions3.getKeyboardType();
                                        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
                                        final boolean z24 = (KeyboardType.ty(keyboardType, companion2.J2()) || KeyboardType.ty(keyboardOptions3.getKeyboardType(), companion2.O())) ? false : true;
                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                        final boolean z25 = z10;
                                        Modifier modifierZmq = modifier2.Zmq(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation4, z25, z11, keyboardOptionsT, keyboardActionHandler2, zAreEqual, mutableInteractionSource6, z15, rVar));
                                        boolean zN2 = composerKN.n(z24) | composerKN.E2(rVar);
                                        Object objIF10 = composerKN.iF();
                                        if (zN2 || objIF10 == companion.n()) {
                                            objIF10 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$decorationModifiers$1$1
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
                                                    if (z24) {
                                                        rVar.t(Unit.INSTANCE);
                                                    }
                                                }
                                            };
                                            composerKN.o(objIF10);
                                        }
                                        final Orientation orientation2 = orientation;
                                        Modifier modifierRl = PointerIconKt.rl(ScrollableKt.gh(FocusableKt.n(StylusHandwritingKt.rl(modifierZmq, z25, z24, (Function0) objIF10), z25, mutableInteractionSource6), scrollState3, orientation2, z25 && textFieldSelectionState.M() == TextFieldSelectionState.InputType.f20416n, ScrollableDefaults.f17001n.rl(layoutDirection, orientation, false), null, mutableInteractionSource6, 16, null), TextPointerIcon_androidKt.rl(), false, 2, null);
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                                        int iN = ComposablesKt.n(composerKN, 0);
                                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifierRl);
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
                                        final TransformedTextFieldState transformedTextFieldState4 = transformedTextFieldState;
                                        ContextMenu_androidKt.n(textFieldSelectionState, z25, ComposableLambdaKt.nr(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                n(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer3, int i37) {
                                                if (!composer3.HI((i37 & 3) != 2, i37 & 1)) {
                                                    composer3.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-673241599, i37, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:431)");
                                                }
                                                TextFieldDecorator textFieldDecorator5 = textFieldDecorator3;
                                                if (textFieldDecorator5 == null) {
                                                    textFieldDecorator5 = BasicTextFieldKt.f19202n;
                                                }
                                                final TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits4;
                                                final TextLayoutState textLayoutState2 = textLayoutState;
                                                final TextStyle textStyle4 = textStyle3;
                                                final boolean z26 = zBooleanValue;
                                                final boolean z27 = zN;
                                                final boolean z28 = zBooleanValue2;
                                                final TransformedTextFieldState transformedTextFieldState5 = transformedTextFieldState4;
                                                final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                                                final Brush brush4 = brush3;
                                                final boolean z29 = z25;
                                                final boolean z30 = z11;
                                                final ScrollState scrollState4 = scrollState3;
                                                final Orientation orientation3 = orientation2;
                                                final boolean z31 = zAreEqual;
                                                final Function2 function25 = function23;
                                                final KeyboardOptions keyboardOptions4 = keyboardOptionsT;
                                                textFieldDecorator5.n(ComposableLambdaKt.nr(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        n(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer4, int i38) {
                                                        int minHeightInLines;
                                                        int maxHeightInLines;
                                                        if (!composer4.HI((i38 & 3) != 2, i38 & 1)) {
                                                            composer4.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(1969169726, i38, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:433)");
                                                        }
                                                        TextFieldLineLimits textFieldLineLimits6 = textFieldLineLimits5;
                                                        if (textFieldLineLimits6 instanceof TextFieldLineLimits.MultiLine) {
                                                            minHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMinHeightInLines();
                                                            maxHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits5).getMaxHeightInLines();
                                                        } else {
                                                            minHeightInLines = 1;
                                                            maxHeightInLines = 1;
                                                        }
                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                        Modifier modifierZmq2 = ClipKt.rl(TextFieldSizeKt.n(HeightInLinesModifierKt.n(SizeKt.gh(companion4, textLayoutState2.Uo(), 0.0f, 2, null), textStyle4, minHeightInLines, maxHeightInLines), textStyle4)).Zmq(new TextFieldCoreModifier(z26 && z27, z28, textLayoutState2, transformedTextFieldState5, textFieldSelectionState2, brush4, z29 && !z30, scrollState4, orientation3));
                                                        TextLayoutState textLayoutState3 = textLayoutState2;
                                                        TransformedTextFieldState transformedTextFieldState6 = transformedTextFieldState5;
                                                        TextStyle textStyle5 = textStyle4;
                                                        boolean z32 = z31;
                                                        Function2 function26 = function25;
                                                        KeyboardOptions keyboardOptions5 = keyboardOptions4;
                                                        boolean z33 = z29;
                                                        boolean z34 = z26;
                                                        boolean z35 = z27;
                                                        TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState2;
                                                        boolean z36 = z30;
                                                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
                                                        int iN2 = ComposablesKt.n(composer4, 0);
                                                        CompositionLocalMap compositionLocalMapIk2 = composer4.Ik();
                                                        Modifier modifierO2 = ComposedModifierKt.O(composer4, modifierZmq2);
                                                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                                        Function0 function0N2 = companion5.n();
                                                        if (composer4.getApplier() == null) {
                                                            ComposablesKt.t();
                                                        }
                                                        composer4.T();
                                                        if (composer4.getInserting()) {
                                                            composer4.s7N(function0N2);
                                                        } else {
                                                            composer4.r();
                                                        }
                                                        Composer composerN2 = Updater.n(composer4);
                                                        Updater.O(composerN2, measurePolicyUo2, companion5.t());
                                                        Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
                                                        Function2 function2Rl2 = companion5.rl();
                                                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                                            composerN2.o(Integer.valueOf(iN2));
                                                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                                        }
                                                        Updater.O(composerN2, modifierO2, companion5.nr());
                                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                                                        BoxKt.n(BringIntoViewRequesterKt.rl(companion4, textLayoutState3.getBringIntoViewRequester()).Zmq(new TextFieldTextLayoutModifier(textLayoutState3, transformedTextFieldState6, textStyle5, z32, function26, keyboardOptions5)), composer4, 0);
                                                        if (z33 && z34 && z35 && textFieldSelectionState3.m()) {
                                                            composer4.eF(-1320156658);
                                                            BasicTextFieldKt.az(textFieldSelectionState3, composer4, 0);
                                                            if (z36) {
                                                                composer4.eF(-1319915168);
                                                                composer4.Xw();
                                                            } else {
                                                                composer4.eF(-1320029527);
                                                                BasicTextFieldKt.gh(textFieldSelectionState3, composer4, 0);
                                                                composer4.Xw();
                                                            }
                                                            composer4.Xw();
                                                        } else {
                                                            composer4.eF(-1319893344);
                                                            composer4.Xw();
                                                        }
                                                        composer4.XQ();
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer3, 54), composer3, 6);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composerKN, 54), composerKN, ((i9 >> 3) & 112) | RendererCapabilities.DECODER_SUPPORT_MASK);
                                        composerKN.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        z9 = z15;
                                        composer2 = composerKN;
                                        inputTransformation3 = inputTransformation4;
                                        keyboardActionHandler3 = keyboardActionHandler2;
                                        modifier3 = modifier2;
                                        codepointTransformation2 = codepointTransformation3;
                                        outputTransformation2 = outputTransformation5;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        keyboardOptions2 = keyboardOptions3;
                                        textFieldDecorator2 = textFieldDecorator3;
                                        textFieldLineLimits3 = textFieldLineLimits4;
                                        textStyle2 = textStyle3;
                                        brush2 = brush3;
                                        z7 = z11;
                                        scrollState2 = scrollState3;
                                        function22 = function23;
                                        z6 = z25;
                                    }
                                }
                                objIF9 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(textToolbar, vdVar);
                                composerKN.o(objIF9);
                                basicTextFieldKt$BasicTextField$textToolbarHandler$1$1 = (BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1) objIF9;
                                zP5 = composerKN.p5(transformedTextFieldState) | ((57344 & i9) != 16384) | composerKN.E2(textFieldSelectionState) | composerKN.E2(hapticFeedback) | composerKN.E2(clipboard) | composerKN.p5(basicTextFieldKt$BasicTextField$textToolbarHandler$1$1) | composerKN.p5(density2) | ((i9 & 896) != 256) | ((i9 & 7168) != 2048) | ((i36 & 3670016) != 1048576);
                                objIF = composerKN.iF();
                                if (zP5) {
                                    final Density density42 = density2;
                                    final TransformedTextFieldState transformedTextFieldState32 = transformedTextFieldState;
                                    final boolean z222 = z10;
                                    final boolean z232 = z11;
                                    objIF = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                                            transformedTextFieldState32.e(inputTransformation5);
                                            textFieldSelectionState.hRu(hapticFeedback, clipboard, basicTextFieldKt$BasicTextField$textToolbarHandler$1$1, density42, z222, z232, z21);
                                        }
                                    };
                                    inputTransformation4 = inputTransformation5;
                                    z15 = z21;
                                    composerKN.o(objIF);
                                    EffectsKt.KN((Function0) objIF, composerKN, 0);
                                    zE2 = composerKN.E2(textFieldSelectionState);
                                    objIF2 = composerKN.iF();
                                    if (!zE2) {
                                        objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void n() {
                                                        textFieldSelectionState2.P5();
                                                    }
                                                };
                                            }
                                        };
                                        composerKN.o(objIF2);
                                        EffectsKt.rl(textFieldSelectionState, (Function1) objIF2, composerKN, 0);
                                        if (z15) {
                                        }
                                    }
                                }
                            } else {
                                composerKN.wTp();
                                z6 = z2;
                                z7 = z3;
                                brush2 = brush;
                                z9 = z4;
                                scrollState2 = scrollStateT;
                                composer2 = composerKN;
                                inputTransformation3 = inputTransformation2;
                                textStyle2 = textStyleN;
                                keyboardOptions2 = keyboardOptionsN;
                                textFieldLineLimits3 = textFieldLineLimits2;
                                keyboardActionHandler3 = keyboardActionHandler2;
                                modifier3 = modifier2;
                                function22 = function2;
                                mutableInteractionSource2 = mutableInteractionSource;
                                codepointTransformation2 = codepointTransformation;
                                outputTransformation2 = outputTransformation;
                                textFieldDecorator2 = textFieldDecorator;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i37) {
                                        BasicTextFieldKt.rl(textFieldState, modifier3, z6, z7, inputTransformation3, textStyle2, keyboardOptions2, keyboardActionHandler3, textFieldLineLimits3, function22, mutableInteractionSource2, brush2, codepointTransformation2, outputTransformation2, textFieldDecorator2, scrollState2, z9, composer3, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i24 = i35 | (composerKN.p5(codepointTransformation) ? 256 : 128);
                    }
                    i23 = i22;
                    i25 = i5 & 8192;
                    if (i25 != 0) {
                    }
                    i26 = i5 & 16384;
                    if (i26 != 0) {
                    }
                    if ((i3 & 196608) == 0) {
                    }
                    i28 = i5 & 65536;
                    if (i28 != 0) {
                    }
                    i29 = i24;
                    if (composerKN.HI(((i9 & 306783379) == 306783378 && (i29 & 599187) == 599186) ? false : z5, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                inputTransformation2 = inputTransformation;
                i12 = i5 & 32;
                if (i12 == 0) {
                }
                i13 = i5 & 64;
                if (i13 == 0) {
                }
                i14 = i5 & 128;
                if (i14 == 0) {
                }
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i5 & 512;
                if (i16 == 0) {
                }
                i18 = i5 & 1024;
                if (i18 == 0) {
                }
                i21 = i5 & 2048;
                if (i21 == 0) {
                }
                int i352 = i19;
                i22 = i5 & 4096;
                if (i22 == 0) {
                }
                i23 = i22;
                i25 = i5 & 8192;
                if (i25 != 0) {
                }
                i26 = i5 & 16384;
                if (i26 != 0) {
                }
                if ((i3 & 196608) == 0) {
                }
                i28 = i5 & 65536;
                if (i28 != 0) {
                }
                i29 = i24;
                if (composerKN.HI(((i9 & 306783379) == 306783378 && (i29 & 599187) == 599186) ? false : z5, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            i11 = i5 & 16;
            if (i11 != 0) {
            }
            inputTransformation2 = inputTransformation;
            i12 = i5 & 32;
            if (i12 == 0) {
            }
            i13 = i5 & 64;
            if (i13 == 0) {
            }
            i14 = i5 & 128;
            if (i14 == 0) {
            }
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i5 & 512;
            if (i16 == 0) {
            }
            i18 = i5 & 1024;
            if (i18 == 0) {
            }
            i21 = i5 & 2048;
            if (i21 == 0) {
            }
            int i3522 = i19;
            i22 = i5 & 4096;
            if (i22 == 0) {
            }
            i23 = i22;
            i25 = i5 & 8192;
            if (i25 != 0) {
            }
            i26 = i5 & 16384;
            if (i26 != 0) {
            }
            if ((i3 & 196608) == 0) {
            }
            i28 = i5 & 65536;
            if (i28 != 0) {
            }
            i29 = i24;
            if (composerKN.HI(((i9 & 306783379) == 306783378 && (i29 & 599187) == 599186) ? false : z5, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i10 = i5 & 8;
        if (i10 == 0) {
        }
        i11 = i5 & 16;
        if (i11 != 0) {
        }
        inputTransformation2 = inputTransformation;
        i12 = i5 & 32;
        if (i12 == 0) {
        }
        i13 = i5 & 64;
        if (i13 == 0) {
        }
        i14 = i5 & 128;
        if (i14 == 0) {
        }
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i5 & 512;
        if (i16 == 0) {
        }
        i18 = i5 & 1024;
        if (i18 == 0) {
        }
        i21 = i5 & 2048;
        if (i21 == 0) {
        }
        int i35222 = i19;
        i22 = i5 & 4096;
        if (i22 == 0) {
        }
        i23 = i22;
        i25 = i5 & 8192;
        if (i25 != 0) {
        }
        i26 = i5 & 16384;
        if (i26 != 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        i28 = i5 & 65536;
        if (i28 != 0) {
        }
        i29 = i24;
        if (composerKN.HI(((i9 & 306783379) == 306783378 && (i29 & 599187) == 599186) ? false : z5, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        Modifier modifier2;
        int i10;
        boolean z5;
        int i11;
        boolean z6;
        int i12;
        TextStyle textStyleN;
        int i13;
        KeyboardOptions keyboardOptionsN;
        int i14;
        KeyboardActions keyboardActions2;
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
        int i25;
        int i26;
        int i27;
        int i28;
        Composer composer2;
        final int i29;
        final VisualTransformation visualTransformation2;
        final Function3 function32;
        final boolean z7;
        final KeyboardActions keyboardActions3;
        final boolean z9;
        final TextStyle textStyle2;
        final KeyboardOptions keyboardOptions2;
        final Modifier modifier3;
        final boolean z10;
        final int i30;
        final Function1 function13;
        final MutableInteractionSource mutableInteractionSource2;
        final Brush brush2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i31;
        Function1 function14;
        MutableInteractionSource mutableInteractionSource3;
        boolean z11;
        int i32;
        Brush solidColor;
        Brush brush3;
        TextStyle textStyle3;
        boolean z12;
        boolean z13;
        int i33;
        int i34;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions4;
        int i35;
        Function3 function3Rl;
        boolean z14;
        TextStyle textStyle4;
        Composer composerKN = composer.KN(1804514146);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = (composerKN.p5(textFieldValue) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i5 & 48) == 0) {
            i9 |= composerKN.E2(function1) ? 32 : 16;
        }
        int i36 = i8 & 4;
        if (i36 != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i10 = i8 & 8;
            if (i10 == 0) {
                i9 |= 3072;
            } else {
                if ((i5 & 3072) == 0) {
                    z5 = z2;
                    i9 |= composerKN.n(z5) ? 2048 : 1024;
                }
                i11 = i8 & 16;
                if (i11 != 0) {
                    i9 |= 24576;
                } else {
                    if ((i5 & 24576) == 0) {
                        z6 = z3;
                        i9 |= composerKN.n(z6) ? 16384 : 8192;
                    }
                    i12 = i8 & 32;
                    if (i12 == 0) {
                        i9 |= 196608;
                        textStyleN = textStyle;
                    } else {
                        textStyleN = textStyle;
                        if ((i5 & 196608) == 0) {
                            i9 |= composerKN.p5(textStyleN) ? 131072 : 65536;
                        }
                    }
                    i13 = i8 & 64;
                    if (i13 == 0) {
                        i9 |= 1572864;
                        keyboardOptionsN = keyboardOptions;
                    } else {
                        keyboardOptionsN = keyboardOptions;
                        if ((i5 & 1572864) == 0) {
                            i9 |= composerKN.p5(keyboardOptionsN) ? 1048576 : 524288;
                        }
                    }
                    i14 = i8 & 128;
                    if (i14 == 0) {
                        i9 |= 12582912;
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i5 & 12582912) == 0) {
                            i9 |= composerKN.p5(keyboardActions2) ? 8388608 : 4194304;
                        }
                    }
                    i15 = i8 & 256;
                    if (i15 == 0) {
                        i9 |= 100663296;
                    } else if ((i5 & 100663296) == 0) {
                        i9 |= composerKN.n(z4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        i9 |= ((i8 & 512) == 0 && composerKN.t(i2)) ? 536870912 : 268435456;
                    }
                    i16 = i8 & 1024;
                    if (i16 == 0) {
                        i18 = i7 | 6;
                        i17 = i16;
                    } else if ((i7 & 6) == 0) {
                        i17 = i16;
                        i18 = i7 | (composerKN.t(i3) ? 4 : 2);
                    } else {
                        i17 = i16;
                        i18 = i7;
                    }
                    i19 = i8 & 2048;
                    if (i19 == 0) {
                        i18 |= 48;
                        i20 = i19;
                    } else if ((i7 & 48) == 0) {
                        i20 = i19;
                        i18 |= composerKN.p5(visualTransformation) ? 32 : 16;
                    } else {
                        i20 = i19;
                    }
                    int i37 = i18;
                    i21 = i8 & 4096;
                    if (i21 == 0) {
                        i22 = i37 | RendererCapabilities.DECODER_SUPPORT_MASK;
                    } else if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        i22 = i37 | (composerKN.E2(function12) ? 256 : 128);
                    } else {
                        i22 = i37;
                    }
                    i23 = i8 & 8192;
                    if (i23 == 0) {
                        i24 = i22 | 3072;
                    } else {
                        int i38 = i22;
                        if ((i7 & 3072) == 0) {
                            i24 = i38 | (composerKN.p5(mutableInteractionSource) ? 2048 : 1024);
                        } else {
                            i24 = i38;
                        }
                    }
                    i25 = i8 & 16384;
                    if (i25 != 0) {
                        i26 = i24;
                        if ((i7 & 24576) == 0) {
                            i26 |= composerKN.p5(brush) ? 16384 : 8192;
                        }
                        i27 = i8 & 32768;
                        if (i27 != 0) {
                            i26 |= 196608;
                        } else if ((i7 & 196608) == 0) {
                            i26 |= composerKN.E2(function3) ? 131072 : 65536;
                        }
                        i28 = i26;
                        if (composerKN.HI(((i9 & 306783379) == 306783378 && (74899 & i28) == 74898) ? false : true, i9 & 1)) {
                            composerKN.e();
                            if ((i5 & 1) == 0 || composerKN.rV9()) {
                                if (i36 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i10 != 0) {
                                    z5 = true;
                                }
                                if (i11 != 0) {
                                    z6 = false;
                                }
                                if (i12 != 0) {
                                    textStyleN = TextStyle.INSTANCE.n();
                                }
                                if (i13 != 0) {
                                    keyboardOptionsN = KeyboardOptions.INSTANCE.n();
                                }
                                KeyboardActions keyboardActionsN = i14 != 0 ? KeyboardActions.INSTANCE.n() : keyboardActions2;
                                boolean z15 = i15 != 0 ? false : z4;
                                if ((i8 & 512) != 0) {
                                    i31 = z15 ? 1 : Integer.MAX_VALUE;
                                    i9 &= -1879048193;
                                } else {
                                    i31 = i2;
                                }
                                int i39 = i17 != 0 ? 1 : i3;
                                VisualTransformation visualTransformationT = i20 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                function14 = i21 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$10
                                    public final void n(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        n(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                mutableInteractionSource3 = i23 != 0 ? null : mutableInteractionSource;
                                KeyboardActions keyboardActions5 = keyboardActionsN;
                                if (i25 != 0) {
                                    z11 = z15;
                                    i32 = i9;
                                    solidColor = new SolidColor(Color.INSTANCE.n(), null);
                                } else {
                                    z11 = z15;
                                    i32 = i9;
                                    solidColor = brush;
                                }
                                if (i27 != 0) {
                                    boolean z16 = z5;
                                    brush3 = solidColor;
                                    textStyle3 = textStyleN;
                                    z12 = z16;
                                    z13 = z11;
                                    i33 = i31;
                                    i34 = i39;
                                    visualTransformation3 = visualTransformationT;
                                    keyboardActions4 = keyboardActions5;
                                    i35 = i32;
                                    function3Rl = ComposableSingletons$BasicTextFieldKt.f19498n.rl();
                                    keyboardOptions3 = keyboardOptionsN;
                                } else {
                                    boolean z17 = z5;
                                    brush3 = solidColor;
                                    textStyle3 = textStyleN;
                                    z12 = z17;
                                    z13 = z11;
                                    i33 = i31;
                                    i34 = i39;
                                    visualTransformation3 = visualTransformationT;
                                    keyboardOptions3 = keyboardOptionsN;
                                    keyboardActions4 = keyboardActions5;
                                    i35 = i32;
                                    function3Rl = function3;
                                }
                                z14 = z6;
                            } else {
                                composerKN.wTp();
                                if ((i8 & 512) != 0) {
                                    i9 &= -1879048193;
                                }
                                z13 = z4;
                                i33 = i2;
                                i34 = i3;
                                function14 = function12;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i35 = i9;
                                keyboardActions4 = keyboardActions2;
                                textStyle3 = textStyleN;
                                keyboardOptions3 = keyboardOptionsN;
                                visualTransformation3 = visualTransformation;
                                function3Rl = function3;
                                z12 = z5;
                                z14 = z6;
                                brush3 = brush;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                textStyle4 = textStyle3;
                                ComposerKt.p5(1804514146, i35, i28, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:866)");
                            } else {
                                textStyle4 = textStyle3;
                            }
                            ImeOptions imeOptionsQie = keyboardOptions3.qie(z13);
                            KeyboardOptions keyboardOptions4 = keyboardOptions3;
                            VisualTransformation visualTransformation4 = visualTransformation3;
                            Brush brush4 = brush3;
                            boolean z18 = !z13;
                            int i40 = z13 ? 1 : i34;
                            Modifier modifier4 = modifier2;
                            Function3 function33 = function3Rl;
                            int i41 = z13 ? 1 : i33;
                            boolean z19 = ((i35 & 14) == 4) | ((i35 & 112) == 32);
                            Object objIF = composerKN.iF();
                            if (z19 || objIF == Composer.INSTANCE.n()) {
                                objIF = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        n(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(TextFieldValue textFieldValue2) {
                                        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                            return;
                                        }
                                        function1.invoke(textFieldValue2);
                                    }
                                };
                                composerKN.o(objIF);
                            }
                            int i42 = i28 << 9;
                            boolean z20 = z13;
                            Function1 function15 = function14;
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                            composer2 = composerKN;
                            TextStyle textStyle5 = textStyle4;
                            CoreTextFieldKt.n(textFieldValue, (Function1) objIF, modifier4, textStyle5, visualTransformation4, function15, mutableInteractionSource4, brush4, z18, i41, i40, imeOptionsQie, keyboardActions4, z12, z14, function33, null, composer2, ((i35 >> 6) & 7168) | (i35 & 910) | (i42 & 57344) | (i42 & 458752) | (i42 & 3670016) | (i42 & 29360128), (i35 & 7168) | ((i35 >> 15) & 896) | (57344 & i35) | (i28 & 458752), 65536);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            keyboardActions3 = keyboardActions4;
                            function32 = function33;
                            i29 = i33;
                            i30 = i34;
                            z10 = z20;
                            visualTransformation2 = visualTransformation4;
                            brush2 = brush4;
                            z7 = z12;
                            keyboardOptions2 = keyboardOptions4;
                            function13 = function15;
                            z9 = z14;
                            mutableInteractionSource2 = mutableInteractionSource4;
                            textStyle2 = textStyle5;
                            modifier3 = modifier4;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            i29 = i2;
                            visualTransformation2 = visualTransformation;
                            function32 = function3;
                            z7 = z5;
                            keyboardActions3 = keyboardActions2;
                            z9 = z6;
                            textStyle2 = textStyleN;
                            keyboardOptions2 = keyboardOptionsN;
                            modifier3 = modifier2;
                            z10 = z4;
                            i30 = i3;
                            function13 = function12;
                            mutableInteractionSource2 = mutableInteractionSource;
                            brush2 = brush;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$12
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i43) {
                                    BasicTextFieldKt.t(textFieldValue, function1, modifier3, z7, z9, textStyle2, keyboardOptions2, keyboardActions3, z10, i29, i30, visualTransformation2, function13, mutableInteractionSource2, brush2, function32, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i26 = i24 | 24576;
                    i27 = i8 & 32768;
                    if (i27 != 0) {
                    }
                    i28 = i26;
                    if (composerKN.HI(((i9 & 306783379) == 306783378 && (74899 & i28) == 74898) ? false : true, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z6 = z3;
                i12 = i8 & 32;
                if (i12 == 0) {
                }
                i13 = i8 & 64;
                if (i13 == 0) {
                }
                i14 = i8 & 128;
                if (i14 == 0) {
                }
                i15 = i8 & 256;
                if (i15 == 0) {
                }
                if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                i16 = i8 & 1024;
                if (i16 == 0) {
                }
                i19 = i8 & 2048;
                if (i19 == 0) {
                }
                int i372 = i18;
                i21 = i8 & 4096;
                if (i21 == 0) {
                }
                i23 = i8 & 8192;
                if (i23 == 0) {
                }
                i25 = i8 & 16384;
                if (i25 != 0) {
                }
                i27 = i8 & 32768;
                if (i27 != 0) {
                }
                i28 = i26;
                if (composerKN.HI(((i9 & 306783379) == 306783378 && (74899 & i28) == 74898) ? false : true, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z5 = z2;
            i11 = i8 & 16;
            if (i11 != 0) {
            }
            z6 = z3;
            i12 = i8 & 32;
            if (i12 == 0) {
            }
            i13 = i8 & 64;
            if (i13 == 0) {
            }
            i14 = i8 & 128;
            if (i14 == 0) {
            }
            i15 = i8 & 256;
            if (i15 == 0) {
            }
            if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            i16 = i8 & 1024;
            if (i16 == 0) {
            }
            i19 = i8 & 2048;
            if (i19 == 0) {
            }
            int i3722 = i18;
            i21 = i8 & 4096;
            if (i21 == 0) {
            }
            i23 = i8 & 8192;
            if (i23 == 0) {
            }
            i25 = i8 & 16384;
            if (i25 != 0) {
            }
            i27 = i8 & 32768;
            if (i27 != 0) {
            }
            i28 = i26;
            if (composerKN.HI(((i9 & 306783379) == 306783378 && (74899 & i28) == 74898) ? false : true, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 8;
        if (i10 == 0) {
        }
        z5 = z2;
        i11 = i8 & 16;
        if (i11 != 0) {
        }
        z6 = z3;
        i12 = i8 & 32;
        if (i12 == 0) {
        }
        i13 = i8 & 64;
        if (i13 == 0) {
        }
        i14 = i8 & 128;
        if (i14 == 0) {
        }
        i15 = i8 & 256;
        if (i15 == 0) {
        }
        if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        i16 = i8 & 1024;
        if (i16 == 0) {
        }
        i19 = i8 & 2048;
        if (i19 == 0) {
        }
        int i37222 = i18;
        i21 = i8 & 4096;
        if (i21 == 0) {
        }
        i23 = i8 & 8192;
        if (i23 == 0) {
        }
        i25 = i8 & 16384;
        if (i25 != 0) {
        }
        i27 = i8 & 32768;
        if (i27 != 0) {
        }
        i28 = i26;
        if (composerKN.HI(((i9 & 306783379) == 306783378 && (74899 & i28) == 74898) ? false : true, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    static {
        float f3 = 40;
        rl = DpKt.rl(Dp.KN(f3), Dp.KN(f3));
    }

    private static final TextFieldHandleState HI(State state) {
        return (TextFieldHandleState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue Uo(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    public static final void az(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        Composer composerKN = composer.KN(2025287684);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(textFieldSelectionState)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(2025287684, i3, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:522)");
            }
            boolean zP5 = composerKN.p5(textFieldSelectionState);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = SnapshotStateKt.O(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.I(true, false);
                    }
                });
                composerKN.o(objIF);
            }
            State state = (State) objIF;
            if (ty(state).getVisible()) {
                composerKN.eF(-1348660553);
                boolean zE2 = composerKN.E2(textFieldSelectionState);
                Object objIF2 = composerKN.iF();
                if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        public final long n() {
                            return textFieldSelectionState.I(true, true).getPosition();
                        }
                    };
                    composerKN.o(objIF2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) objIF2;
                ResolvedTextDirection direction = ty(state).getDirection();
                boolean handlesCrossed = ty(state).getHandlesCrossed();
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zE22 = composerKN.E2(textFieldSelectionState);
                Object objIF3 = composerKN.iF();
                if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            Object objFcU = textFieldSelectionState.fcU(pointerInputScope, true, continuation);
                            return objFcU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFcU : Unit.INSTANCE;
                        }
                    };
                    composerKN.o(objIF3);
                }
                AndroidSelectionHandles_androidKt.rl(offsetProvider, true, direction, handlesCrossed, rl, ty(state).getLineHeight(), SuspendingPointerInputFilterKt.nr(companion, textFieldSelectionState, (PointerInputEventHandler) objIF3), composerKN, 24624, 0);
                composerKN.Xw();
            } else {
                composerKN.eF(-1348008995);
                composerKN.Xw();
            }
            boolean zP52 = composerKN.p5(textFieldSelectionState);
            Object objIF4 = composerKN.iF();
            if (zP52 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = SnapshotStateKt.O(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.I(false, false);
                    }
                });
                composerKN.o(objIF4);
            }
            State state2 = (State) objIF4;
            if (HI(state2).getVisible()) {
                composerKN.eF(-1347616070);
                boolean zE23 = composerKN.E2(textFieldSelectionState);
                Object objIF5 = composerKN.iF();
                if (zE23 || objIF5 == Composer.INSTANCE.n()) {
                    objIF5 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        public final long n() {
                            return textFieldSelectionState.I(false, true).getPosition();
                        }
                    };
                    composerKN.o(objIF5);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) objIF5;
                ResolvedTextDirection direction2 = HI(state2).getDirection();
                boolean handlesCrossed2 = HI(state2).getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zE24 = composerKN.E2(textFieldSelectionState);
                Object objIF6 = composerKN.iF();
                if (zE24 || objIF6 == Composer.INSTANCE.n()) {
                    objIF6 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$4$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            Object objFcU = textFieldSelectionState.fcU(pointerInputScope, false, continuation);
                            return objFcU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFcU : Unit.INSTANCE;
                        }
                    };
                    composerKN.o(objIF6);
                }
                AndroidSelectionHandles_androidKt.rl(offsetProvider2, false, direction2, handlesCrossed2, rl, HI(state2).getLineHeight(), SuspendingPointerInputFilterKt.nr(companion2, textFieldSelectionState, (PointerInputEventHandler) objIF6), composerKN, 24624, 0);
                composerKN.Xw();
            } else {
                composerKN.eF(-1346967395);
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
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$5
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
                    BasicTextFieldKt.az(textFieldSelectionState, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final void gh(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        Composer composerKN = composer.KN(1991581797);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(textFieldSelectionState)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(1991581797, i3, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:501)");
            }
            boolean zP5 = composerKN.p5(textFieldSelectionState);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = SnapshotStateKt.O(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.eF(false);
                    }
                });
                composerKN.o(objIF);
            }
            if (qie((State) objIF).getVisible()) {
                composerKN.eF(-311835217);
                boolean zE2 = composerKN.E2(textFieldSelectionState);
                Object objIF2 = composerKN.iF();
                if (zE2 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        public final long n() {
                            return textFieldSelectionState.eF(true).getPosition();
                        }
                    };
                    composerKN.o(objIF2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) objIF2;
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zE22 = composerKN.E2(textFieldSelectionState);
                Object objIF3 = composerKN.iF();
                if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            Object objNHg = textFieldSelectionState.nHg(pointerInputScope, continuation);
                            return objNHg == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNHg : Unit.INSTANCE;
                        }
                    };
                    composerKN.o(objIF3);
                }
                AndroidCursorHandle_androidKt.n(offsetProvider, SuspendingPointerInputFilterKt.nr(companion, textFieldSelectionState, (PointerInputEventHandler) objIF3), rl, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composerKN.Xw();
            } else {
                composerKN.eF(-311451778);
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
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$3
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
                    BasicTextFieldKt.gh(textFieldSelectionState, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    private static final TextFieldHandleState qie(State state) {
        return (TextFieldHandleState) state.getValue();
    }

    private static final TextFieldHandleState ty(State state) {
        return (TextFieldHandleState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ(MutableState mutableState) {
        return (String) mutableState.getValue();
    }
}
