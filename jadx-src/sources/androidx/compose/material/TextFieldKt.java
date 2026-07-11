package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
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
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0087\u0002\u0010#\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0095\u0002\u00101\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n0'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b1\u00102\u001a\u0089\u0002\u00103\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n0'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b3\u00104\u001a\u0095\u0002\u00106\u001a\u00020\n2\u0006\u0010&\u001a\u0002052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\n0'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b6\u00107\u001a\u0089\u0002\u00108\u001a\u00020\n2\u0006\u0010&\u001a\u0002052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\n0'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b8\u00109\u001a\u009c\u0001\u0010A\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010:\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010'¢\u0006\u0002\b\u000b2\u0013\u0010;\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0013\u0010<\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bA\u0010B\u001a\u001b\u0010D\u001a\u00020.*\u00020.2\u0006\u0010C\u001a\u00020.H\u0002¢\u0006\u0004\bD\u0010E\u001aB\u0010M\u001a\u00020.2\u0006\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020.2\u0006\u0010I\u001a\u00020.2\u0006\u0010J\u001a\u00020.2\u0006\u0010L\u001a\u00020KH\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001aZ\u0010V\u001a\u00020.2\u0006\u0010O\u001a\u00020.2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020.2\u0006\u0010R\u001a\u00020.2\u0006\u0010S\u001a\u00020.2\u0006\u0010T\u001a\u00020.2\u0006\u0010L\u001a\u00020K2\u0006\u0010U\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a{\u0010c\u001a\u00020\n*\u00020X2\u0006\u0010Y\u001a\u00020.2\u0006\u0010Z\u001a\u00020.2\u0006\u0010\\\u001a\u00020[2\b\u0010]\u001a\u0004\u0018\u00010[2\b\u0010^\u001a\u0004\u0018\u00010[2\b\u0010_\u001a\u0004\u0018\u00010[2\b\u0010`\u001a\u0004\u0018\u00010[2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010a\u001a\u00020.2\u0006\u0010b\u001a\u00020.2\u0006\u0010>\u001a\u00020=2\u0006\u0010U\u001a\u00020=H\u0002¢\u0006\u0004\bc\u0010d\u001aa\u0010f\u001a\u00020\n*\u00020X2\u0006\u0010Y\u001a\u00020.2\u0006\u0010Z\u001a\u00020.2\u0006\u0010e\u001a\u00020[2\b\u0010^\u001a\u0004\u0018\u00010[2\b\u0010_\u001a\u0004\u0018\u00010[2\b\u0010`\u001a\u0004\u0018\u00010[2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010U\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bf\u0010g\u001a\u001b\u0010j\u001a\u00020\u0002*\u00020\u00022\u0006\u0010i\u001a\u00020hH\u0000¢\u0006\u0004\bj\u0010k\"\u001a\u0010p\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010m\u001a\u0004\bn\u0010o\"\u001a\u0010r\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u0010m\u001a\u0004\bq\u0010o\"\u001a\u0010t\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010m\u001a\u0004\bs\u0010o\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006u"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "lineLimits", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", c.f62177j, "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "", "value", "Lkotlin/Function1;", "onValueChange", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "nr", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "O", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "rl", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "t", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "J2", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "from", "Z", "(II)I", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "az", "(IIIIIJ)I", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "density", "qie", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "Landroidx/compose/ui/layout/Placeable;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "r", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIIFF)V", "textPlaceable", "o", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/foundation/BorderStroke;", "indicatorBorder", "ty", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "F", "HI", "()F", "FirstBaselineOffset", "ck", "TextFieldBottomPadding", "Ik", "TextFieldTopPadding", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1123:1\n75#2:1124\n75#2:1133\n75#2:1142\n75#2:1149\n75#2:1158\n75#2:1171\n1247#3,6:1125\n1247#3,6:1134\n1247#3,6:1143\n1247#3,6:1150\n1247#3,6:1159\n1247#3,6:1165\n708#4:1131\n696#4:1132\n708#4:1140\n696#4:1141\n708#4:1156\n696#4:1157\n79#5,6:1172\n86#5,4:1187\n90#5,2:1197\n79#5,6:1206\n86#5,4:1221\n90#5,2:1231\n94#5:1237\n79#5,6:1245\n86#5,4:1260\n90#5,2:1270\n94#5:1276\n79#5,6:1291\n86#5,4:1306\n90#5,2:1316\n94#5:1322\n79#5,6:1331\n86#5,4:1346\n90#5,2:1356\n94#5:1362\n94#5:1366\n368#6,9:1178\n377#6:1199\n368#6,9:1212\n377#6:1233\n378#6,2:1235\n368#6,9:1251\n377#6:1272\n378#6,2:1274\n368#6,9:1297\n377#6:1318\n378#6,2:1320\n368#6,9:1337\n377#6:1358\n378#6,2:1360\n378#6,2:1364\n4034#7,6:1191\n4034#7,6:1225\n4034#7,6:1264\n4034#7,6:1310\n4034#7,6:1350\n71#8:1200\n69#8,5:1201\n74#8:1234\n78#8:1238\n71#8:1239\n69#8,5:1240\n74#8:1273\n78#8:1277\n71#8:1284\n68#8,6:1285\n74#8:1319\n78#8:1323\n71#8:1324\n68#8,6:1325\n74#8:1359\n78#8:1363\n57#9:1278\n57#9:1281\n149#10:1279\n206#10:1280\n149#10:1282\n206#10:1283\n149#10:1367\n149#10:1368\n149#10:1369\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n*L\n182#1:1124\n330#1:1133\n408#1:1142\n521#1:1149\n599#1:1158\n658#1:1171\n199#1:1125,6\n347#1:1134,6\n419#1:1143,6\n538#1:1150,6\n610#1:1159,6\n655#1:1165,6\n201#1:1131\n201#1:1132\n349#1:1140\n349#1:1141\n540#1:1156\n540#1:1157\n659#1:1172,6\n659#1:1187,4\n659#1:1197,2\n663#1:1206,6\n663#1:1221,4\n663#1:1231,2\n663#1:1237\n671#1:1245,6\n671#1:1260,4\n671#1:1270,2\n671#1:1276\n700#1:1291,6\n700#1:1306,4\n700#1:1316,2\n700#1:1322\n702#1:1331,6\n702#1:1346,4\n702#1:1356,2\n702#1:1362\n659#1:1366\n659#1:1178,9\n659#1:1199\n663#1:1212,9\n663#1:1233\n663#1:1235,2\n671#1:1251,9\n671#1:1272\n671#1:1274,2\n700#1:1297,9\n700#1:1318\n700#1:1320,2\n702#1:1337,9\n702#1:1358\n702#1:1360,2\n659#1:1364,2\n659#1:1191,6\n663#1:1225,6\n671#1:1264,6\n700#1:1310,6\n702#1:1350,6\n663#1:1200\n663#1:1201,5\n663#1:1234\n663#1:1238\n671#1:1239\n671#1:1240,5\n671#1:1273\n671#1:1277\n700#1:1284\n700#1:1285,6\n700#1:1319\n700#1:1323\n702#1:1324\n702#1:1325,6\n702#1:1359\n702#1:1363\n685#1:1278\n691#1:1281\n685#1:1279\n685#1:1280\n691#1:1282\n691#1:1283\n1115#1:1367\n1118#1:1368\n1122#1:1369\n*E\n"})
public final class TextFieldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f23612n = Dp.KN(20);
    private static final float rl = Dp.KN(10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f23613t = Dp.KN(2);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void O(final String str, final Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        int i9;
        Modifier modifier2;
        int i10;
        boolean z6;
        int i11;
        boolean z7;
        TextStyle textStyle2;
        int i12;
        Function2 function25;
        int i13;
        Function2 function26;
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
        int i27;
        int i28;
        int i29;
        Composer composer2;
        final boolean z9;
        final VisualTransformation visualTransformation2;
        final boolean z10;
        final int i30;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final boolean z11;
        final boolean z12;
        final TextStyle textStyle3;
        final Function2 function27;
        final Function2 function28;
        final Modifier modifier3;
        final Function2 function29;
        final Function2 function210;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        ScopeUpdateScope scopeUpdateScopeGh;
        TextStyle textStyle4;
        int i31;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeNr;
        TextFieldColors textFieldColorsHI;
        KeyboardActions keyboardActions4;
        Modifier modifier4;
        boolean z13;
        boolean z14;
        int i32;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        boolean z15;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean z16;
        int i33;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        Composer composerKN = composer.KN(-1690895095);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(str) ? 4 : 2) | i3;
        } else {
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
                int i34 = 1024;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        z6 = z2;
                        i8 |= composerKN.n(z6) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            z7 = z3;
                            i8 |= composerKN.n(z7) ? 16384 : 8192;
                        }
                        if ((i3 & 196608) == 0) {
                            textStyle2 = textStyle;
                            i8 |= ((i7 & 32) == 0 && composerKN.p5(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i12 = i7 & 64;
                        if (i12 != 0) {
                            i8 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i3 & 1572864) == 0) {
                                i8 |= composerKN.E2(function25) ? 1048576 : 524288;
                            }
                        }
                        i13 = i7 & 128;
                        if (i13 != 0) {
                            i8 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i3 & 12582912) == 0) {
                                i8 |= composerKN.E2(function26) ? 8388608 : 4194304;
                            }
                        }
                        i14 = i7 & 256;
                        if (i14 != 0) {
                            i8 |= 100663296;
                        } else {
                            if ((i3 & 100663296) == 0) {
                                i15 = i14;
                                i8 |= composerKN.E2(function23) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            i16 = i7 & 512;
                            if (i16 == 0) {
                                i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            } else {
                                if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i17 = i16;
                                    i8 |= composerKN.E2(function24) ? 536870912 : 268435456;
                                }
                                i18 = i7 & 1024;
                                if (i18 != 0) {
                                    i20 = i5 | 6;
                                    i19 = i18;
                                } else if ((i5 & 6) == 0) {
                                    i19 = i18;
                                    i20 = i5 | (composerKN.n(z4) ? 4 : 2);
                                } else {
                                    i19 = i18;
                                    i20 = i5;
                                }
                                i21 = i7 & 2048;
                                if (i21 != 0) {
                                    i20 |= 48;
                                    i22 = i21;
                                } else if ((i5 & 48) == 0) {
                                    i22 = i21;
                                    i20 |= composerKN.p5(visualTransformation) ? 32 : 16;
                                } else {
                                    i22 = i21;
                                }
                                int i35 = i20;
                                i23 = i7 & 4096;
                                if (i23 != 0) {
                                    i24 = i35 | RendererCapabilities.DECODER_SUPPORT_MASK;
                                } else {
                                    i24 = i35;
                                    if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i24 |= composerKN.p5(keyboardOptions) ? 256 : 128;
                                    }
                                    if ((i5 & 3072) == 0) {
                                        if ((i7 & 8192) == 0 && composerKN.p5(keyboardActions)) {
                                            i34 = 2048;
                                        }
                                        i24 |= i34;
                                    }
                                    int i36 = i24;
                                    i25 = i7 & 16384;
                                    if (i25 != 0) {
                                        i26 = i36;
                                        if ((i5 & 24576) == 0) {
                                            i26 |= composerKN.n(z5) ? 16384 : 8192;
                                        }
                                        i27 = i7 & 32768;
                                        if (i27 != 0) {
                                            i26 |= 196608;
                                        } else if ((i5 & 196608) == 0) {
                                            i26 |= composerKN.t(i2) ? 131072 : 65536;
                                        }
                                        i28 = i7 & 65536;
                                        if (i28 != 0) {
                                            i26 |= 1572864;
                                        } else if ((i5 & 1572864) == 0) {
                                            i26 |= composerKN.p5(mutableInteractionSource) ? 1048576 : 524288;
                                        }
                                        if ((i5 & 12582912) == 0) {
                                            i26 |= ((i7 & 131072) == 0 && composerKN.p5(shape)) ? 8388608 : 4194304;
                                        }
                                        if ((i5 & 100663296) == 0) {
                                            i26 |= ((i7 & 262144) == 0 && composerKN.p5(textFieldColors)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                        }
                                        i29 = i26;
                                        if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                                            composerKN.e();
                                            if ((i3 & 1) == 0 || composerKN.rV9()) {
                                                Modifier modifier5 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z17 = i10 != 0 ? true : z6;
                                                boolean z18 = i11 != 0 ? false : z7;
                                                if ((i7 & 32) != 0) {
                                                    i8 &= -458753;
                                                    textStyle4 = (TextStyle) composerKN.ty(TextKt.J2());
                                                } else {
                                                    textStyle4 = textStyle2;
                                                }
                                                int i37 = i8;
                                                Function2 function214 = i12 != 0 ? null : function25;
                                                Function2 function215 = i13 != 0 ? null : function26;
                                                Function2 function216 = i15 != 0 ? null : function23;
                                                Function2 function217 = i17 != 0 ? null : function24;
                                                boolean z19 = i19 != 0 ? false : z4;
                                                VisualTransformation visualTransformationT = i22 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                                KeyboardOptions keyboardOptionsN = i23 != 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                                if ((i7 & 8192) != 0) {
                                                    i31 = i29 & (-7169);
                                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                } else {
                                                    i31 = i29;
                                                    keyboardActions3 = keyboardActions;
                                                }
                                                boolean z20 = i25 != 0 ? false : z5;
                                                int i38 = i27 != 0 ? Integer.MAX_VALUE : i2;
                                                if (i28 != 0) {
                                                    Object objIF = composerKN.iF();
                                                    if (objIF == Composer.INSTANCE.n()) {
                                                        objIF = InteractionSourceKt.n();
                                                        composerKN.o(objIF);
                                                    }
                                                    mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                                } else {
                                                    mutableInteractionSource3 = mutableInteractionSource;
                                                }
                                                if ((i7 & 131072) != 0) {
                                                    i31 &= -29360129;
                                                    shapeNr = CornerBasedShape.nr(MaterialTheme.f22169n.rl(composerKN, 6).getSmall(), null, null, CornerSizeKt.t(), CornerSizeKt.t(), 3, null);
                                                } else {
                                                    shapeNr = shape;
                                                }
                                                int i39 = i31;
                                                if ((262144 & i7) != 0) {
                                                    composer2 = composerKN;
                                                    keyboardActions4 = keyboardActions3;
                                                    modifier4 = modifier5;
                                                    textFieldColorsHI = TextFieldDefaults.f23471n.HI(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 48, 2097151);
                                                    i29 = i39 & (-234881025);
                                                    z13 = z17;
                                                    z14 = z18;
                                                    textStyle2 = textStyle4;
                                                    i32 = i37;
                                                    function25 = function214;
                                                    function211 = function215;
                                                    function212 = function216;
                                                    function213 = function217;
                                                    z15 = z19;
                                                    visualTransformation3 = visualTransformationT;
                                                    keyboardOptions3 = keyboardOptionsN;
                                                    z16 = z20;
                                                    i33 = i38;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shapeNr;
                                                } else {
                                                    composer2 = composerKN;
                                                    textFieldColorsHI = textFieldColors;
                                                    keyboardActions4 = keyboardActions3;
                                                    modifier4 = modifier5;
                                                    z13 = z17;
                                                    z14 = z18;
                                                    textStyle2 = textStyle4;
                                                    i32 = i37;
                                                    function25 = function214;
                                                    function211 = function215;
                                                    function212 = function216;
                                                    function213 = function217;
                                                    z15 = z19;
                                                    visualTransformation3 = visualTransformationT;
                                                    keyboardOptions3 = keyboardOptionsN;
                                                    z16 = z20;
                                                    i33 = i38;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shapeNr;
                                                    i29 = i39;
                                                }
                                            } else {
                                                composerKN.wTp();
                                                if ((i7 & 32) != 0) {
                                                    i8 &= -458753;
                                                }
                                                if ((i7 & 8192) != 0) {
                                                    i29 &= -7169;
                                                }
                                                if ((i7 & 131072) != 0) {
                                                    i29 &= -29360129;
                                                }
                                                if ((262144 & i7) != 0) {
                                                    i29 &= -234881025;
                                                }
                                                function212 = function23;
                                                visualTransformation3 = visualTransformation;
                                                keyboardOptions3 = keyboardOptions;
                                                keyboardActions4 = keyboardActions;
                                                z16 = z5;
                                                i33 = i2;
                                                mutableInteractionSource4 = mutableInteractionSource;
                                                shape3 = shape;
                                                textFieldColorsHI = textFieldColors;
                                                composer2 = composerKN;
                                                z14 = z7;
                                                i32 = i8;
                                                function211 = function26;
                                                modifier4 = modifier2;
                                                function213 = function24;
                                                z15 = z4;
                                                z13 = z6;
                                            }
                                            composer2.S();
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1690895095, i32, i29, "androidx.compose.material.TextField (TextField.kt:422)");
                                            }
                                            int i40 = i32 & 2147483646;
                                            int i41 = (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29);
                                            int i42 = i29 << 3;
                                            nr(str, function1, modifier4, z13, z14, textStyle2, function25, function211, function212, function213, z15, visualTransformation3, keyboardOptions3, keyboardActions4, z16, i33, 1, mutableInteractionSource4, shape3, textFieldColorsHI, composer2, i40, i41 | (29360128 & i42) | (234881024 & i42) | (i42 & 1879048192), 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            modifier3 = modifier4;
                                            z11 = z13;
                                            z12 = z14;
                                            textStyle3 = textStyle2;
                                            function27 = function25;
                                            function28 = function211;
                                            function29 = function212;
                                            function210 = function213;
                                            z9 = z15;
                                            visualTransformation2 = visualTransformation3;
                                            keyboardOptions2 = keyboardOptions3;
                                            keyboardActions2 = keyboardActions4;
                                            z10 = z16;
                                            i30 = i33;
                                            mutableInteractionSource2 = mutableInteractionSource4;
                                            shape2 = shape3;
                                            textFieldColors2 = textFieldColorsHI;
                                        } else {
                                            composer2 = composerKN;
                                            composer2.wTp();
                                            z9 = z4;
                                            visualTransformation2 = visualTransformation;
                                            z10 = z5;
                                            i30 = i2;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            shape2 = shape;
                                            textFieldColors2 = textFieldColors;
                                            z11 = z6;
                                            z12 = z7;
                                            textStyle3 = textStyle2;
                                            function27 = function25;
                                            function28 = function26;
                                            modifier3 = modifier2;
                                            function29 = function23;
                                            function210 = function24;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                        }
                                        scopeUpdateScopeGh = composer2.gh();
                                        if (scopeUpdateScopeGh != null) {
                                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$6
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
                                                    TextFieldKt.O(str, function1, modifier3, z11, z12, textStyle3, function27, function28, function29, function210, z9, visualTransformation2, keyboardOptions2, keyboardActions2, z10, i30, mutableInteractionSource2, shape2, textFieldColors2, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i26 = i36 | 24576;
                                    i27 = i7 & 32768;
                                    if (i27 != 0) {
                                    }
                                    i28 = i7 & 65536;
                                    if (i28 != 0) {
                                    }
                                    if ((i5 & 12582912) == 0) {
                                    }
                                    if ((i5 & 100663296) == 0) {
                                    }
                                    i29 = i26;
                                    if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh != null) {
                                    }
                                }
                                if ((i5 & 3072) == 0) {
                                }
                                int i362 = i24;
                                i25 = i7 & 16384;
                                if (i25 != 0) {
                                }
                                i27 = i7 & 32768;
                                if (i27 != 0) {
                                }
                                i28 = i7 & 65536;
                                if (i28 != 0) {
                                }
                                if ((i5 & 12582912) == 0) {
                                }
                                if ((i5 & 100663296) == 0) {
                                }
                                i29 = i26;
                                if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                }
                            }
                            i17 = i16;
                            i18 = i7 & 1024;
                            if (i18 != 0) {
                            }
                            i21 = i7 & 2048;
                            if (i21 != 0) {
                            }
                            int i352 = i20;
                            i23 = i7 & 4096;
                            if (i23 != 0) {
                            }
                            if ((i5 & 3072) == 0) {
                            }
                            int i3622 = i24;
                            i25 = i7 & 16384;
                            if (i25 != 0) {
                            }
                            i27 = i7 & 32768;
                            if (i27 != 0) {
                            }
                            i28 = i7 & 65536;
                            if (i28 != 0) {
                            }
                            if ((i5 & 12582912) == 0) {
                            }
                            if ((i5 & 100663296) == 0) {
                            }
                            i29 = i26;
                            if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i7 & 512;
                        if (i16 == 0) {
                        }
                        i17 = i16;
                        i18 = i7 & 1024;
                        if (i18 != 0) {
                        }
                        i21 = i7 & 2048;
                        if (i21 != 0) {
                        }
                        int i3522 = i20;
                        i23 = i7 & 4096;
                        if (i23 != 0) {
                        }
                        if ((i5 & 3072) == 0) {
                        }
                        int i36222 = i24;
                        i25 = i7 & 16384;
                        if (i25 != 0) {
                        }
                        i27 = i7 & 32768;
                        if (i27 != 0) {
                        }
                        i28 = i7 & 65536;
                        if (i28 != 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if ((i5 & 100663296) == 0) {
                        }
                        i29 = i26;
                        if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    z7 = z3;
                    if ((i3 & 196608) == 0) {
                    }
                    i12 = i7 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i7 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i7 & 512;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    i18 = i7 & 1024;
                    if (i18 != 0) {
                    }
                    i21 = i7 & 2048;
                    if (i21 != 0) {
                    }
                    int i35222 = i20;
                    i23 = i7 & 4096;
                    if (i23 != 0) {
                    }
                    if ((i5 & 3072) == 0) {
                    }
                    int i362222 = i24;
                    i25 = i7 & 16384;
                    if (i25 != 0) {
                    }
                    i27 = i7 & 32768;
                    if (i27 != 0) {
                    }
                    i28 = i7 & 65536;
                    if (i28 != 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if ((i5 & 100663296) == 0) {
                    }
                    i29 = i26;
                    if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z6 = z2;
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                z7 = z3;
                if ((i3 & 196608) == 0) {
                }
                i12 = i7 & 64;
                if (i12 != 0) {
                }
                i13 = i7 & 128;
                if (i13 != 0) {
                }
                i14 = i7 & 256;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i7 & 512;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i7 & 1024;
                if (i18 != 0) {
                }
                i21 = i7 & 2048;
                if (i21 != 0) {
                }
                int i352222 = i20;
                i23 = i7 & 4096;
                if (i23 != 0) {
                }
                if ((i5 & 3072) == 0) {
                }
                int i3622222 = i24;
                i25 = i7 & 16384;
                if (i25 != 0) {
                }
                i27 = i7 & 32768;
                if (i27 != 0) {
                }
                i28 = i7 & 65536;
                if (i28 != 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if ((i5 & 100663296) == 0) {
                }
                i29 = i26;
                if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i10 = i7 & 8;
            int i342 = 1024;
            if (i10 != 0) {
            }
            z6 = z2;
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            z7 = z3;
            if ((i3 & 196608) == 0) {
            }
            i12 = i7 & 64;
            if (i12 != 0) {
            }
            i13 = i7 & 128;
            if (i13 != 0) {
            }
            i14 = i7 & 256;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i7 & 512;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i7 & 1024;
            if (i18 != 0) {
            }
            i21 = i7 & 2048;
            if (i21 != 0) {
            }
            int i3522222 = i20;
            i23 = i7 & 4096;
            if (i23 != 0) {
            }
            if ((i5 & 3072) == 0) {
            }
            int i36222222 = i24;
            i25 = i7 & 16384;
            if (i25 != 0) {
            }
            i27 = i7 & 32768;
            if (i27 != 0) {
            }
            i28 = i7 & 65536;
            if (i28 != 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            i29 = i26;
            if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        modifier2 = modifier;
        i10 = i7 & 8;
        int i3422 = 1024;
        if (i10 != 0) {
        }
        z6 = z2;
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        z7 = z3;
        if ((i3 & 196608) == 0) {
        }
        i12 = i7 & 64;
        if (i12 != 0) {
        }
        i13 = i7 & 128;
        if (i13 != 0) {
        }
        i14 = i7 & 256;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i7 & 512;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i7 & 1024;
        if (i18 != 0) {
        }
        i21 = i7 & 2048;
        if (i21 != 0) {
        }
        int i35222222 = i20;
        i23 = i7 & 4096;
        if (i23 != 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        int i362222222 = i24;
        i25 = i7 & 16384;
        if (i25 != 0) {
        }
        i27 = i7 & 32768;
        if (i27 != 0) {
        }
        i28 = i7 & 65536;
        if (i28 != 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        i29 = i26;
        if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Z(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
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
    public static final void n(final TextFieldState textFieldState, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z4, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        Function2 function25;
        int i11;
        Function2 function26;
        int i12;
        Function2 function27;
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
        final boolean z6;
        InputTransformation inputTransformation2;
        final OutputTransformation outputTransformation2;
        final KeyboardOptions keyboardOptions2;
        final ScrollState scrollState2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final TextStyle textStyle3;
        final Function2 function28;
        final Function2 function29;
        final Function2 function210;
        final boolean z7;
        final Function2 function211;
        final boolean z9;
        final KeyboardActionHandler keyboardActionHandler2;
        final TextFieldLineLimits textFieldLineLimits2;
        ScopeUpdateScope scopeUpdateScopeGh;
        boolean z10;
        Function2 function212;
        Function2 function213;
        boolean z11;
        OutputTransformation outputTransformation3;
        KeyboardOptions keyboardOptionsN;
        KeyboardActionHandler keyboardActionHandler3;
        TextFieldLineLimits textFieldLineLimitsN;
        ScrollState scrollStateT;
        Shape shapeXMQ;
        Composer composer3;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColorsHI;
        int i27;
        int i28;
        MutableInteractionSource mutableInteractionSource4;
        MutableInteractionSource mutableInteractionSource5;
        int i29;
        Composer composerKN = composer.KN(-1967634894);
        if ((i5 & 1) != 0) {
            i7 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i7 = (composerKN.p5(textFieldState) ? 4 : 2) | i2;
        } else {
            i7 = i2;
        }
        int i30 = i5 & 2;
        if (i30 != 0) {
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
                    z5 = z2;
                    i7 |= composerKN.n(z5) ? 256 : 128;
                }
                i9 = i5 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        i7 |= composerKN.n(z3) ? 2048 : 1024;
                    }
                    int i31 = 8192;
                    if ((i2 & 24576) != 0) {
                        if ((i5 & 16) == 0) {
                            textStyle2 = textStyle;
                            if (composerKN.p5(textStyle2)) {
                                i29 = 16384;
                            }
                            i7 |= i29;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i29 = 8192;
                        i7 |= i29;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                        function25 = function2;
                    } else {
                        function25 = function2;
                        if ((i2 & 196608) == 0) {
                            i7 |= composerKN.E2(function25) ? 131072 : 65536;
                        }
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                        function26 = function22;
                    } else {
                        function26 = function22;
                        if ((i2 & 1572864) == 0) {
                            i7 |= composerKN.E2(function26) ? 1048576 : 524288;
                        }
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                        i7 |= 12582912;
                        function27 = function23;
                    } else {
                        function27 = function23;
                        if ((i2 & 12582912) == 0) {
                            i7 |= composerKN.E2(function27) ? 8388608 : 4194304;
                        }
                    }
                    i13 = i5 & 256;
                    if (i13 == 0) {
                        i7 |= 100663296;
                    } else {
                        if ((i2 & 100663296) == 0) {
                            i14 = i13;
                            i7 |= composerKN.E2(function24) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i15 = i5 & 512;
                        if (i15 != 0) {
                            i7 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else {
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i16 = i15;
                                i7 |= composerKN.n(z4) ? 536870912 : 268435456;
                            }
                            i17 = i5 & 1024;
                            if (i17 == 0) {
                                i19 = i3 | 6;
                                i18 = i17;
                            } else if ((i3 & 6) == 0) {
                                i18 = i17;
                                i19 = i3 | (composerKN.p5(inputTransformation) ? 4 : 2);
                            } else {
                                i18 = i17;
                                i19 = i3;
                            }
                            i20 = i5 & 2048;
                            if (i20 == 0) {
                                i19 |= 48;
                                i21 = i20;
                            } else if ((i3 & 48) == 0) {
                                i21 = i20;
                                i19 |= composerKN.p5(outputTransformation) ? 32 : 16;
                            } else {
                                i21 = i20;
                            }
                            int i32 = i19;
                            i22 = i5 & 4096;
                            if (i22 == 0) {
                                i23 = i32 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i33 = i32;
                                if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i33 |= composerKN.p5(keyboardOptions) ? 256 : 128;
                                }
                                i23 = i33;
                            }
                            i24 = i5 & 8192;
                            if (i24 != 0) {
                                i25 = i23;
                                if ((i3 & 3072) == 0) {
                                    i25 |= composerKN.p5(keyboardActionHandler) ? 2048 : 1024;
                                }
                                if ((i3 & 24576) == 0) {
                                    if ((i5 & 16384) == 0 && composerKN.p5(textFieldLineLimits)) {
                                        i31 = 16384;
                                    }
                                    i25 |= i31;
                                }
                                if ((i3 & 196608) == 0) {
                                    i25 |= ((i5 & 32768) == 0 && composerKN.p5(scrollState)) ? 131072 : 65536;
                                }
                                if ((i3 & 1572864) == 0) {
                                    i25 |= ((i5 & 65536) == 0 && composerKN.p5(shape)) ? 1048576 : 524288;
                                }
                                if ((i3 & 12582912) == 0) {
                                    i25 |= ((i5 & 131072) == 0 && composerKN.p5(textFieldColors)) ? 8388608 : 4194304;
                                }
                                i26 = i5 & 262144;
                                if (i26 != 0) {
                                    i25 |= 100663296;
                                } else if ((i3 & 100663296) == 0) {
                                    i25 |= composerKN.p5(mutableInteractionSource) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i25 & 38347923) == 38347922) ? false : true, i7 & 1)) {
                                    composerKN.e();
                                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                                        Modifier modifier3 = i30 != 0 ? Modifier.INSTANCE : modifier2;
                                        boolean z12 = i8 != 0 ? true : z5;
                                        z10 = i9 != 0 ? false : z3;
                                        if ((i5 & 16) != 0) {
                                            textStyle2 = (TextStyle) composerKN.ty(TextKt.J2());
                                            i7 &= -57345;
                                        }
                                        TextStyle textStyle4 = textStyle2;
                                        int i34 = i7;
                                        Function2 function214 = i10 != 0 ? null : function25;
                                        Function2 function215 = i11 != 0 ? null : function26;
                                        function212 = i12 != 0 ? null : function27;
                                        function213 = i14 != 0 ? null : function24;
                                        z11 = i16 != 0 ? false : z4;
                                        inputTransformation2 = i18 != 0 ? null : inputTransformation;
                                        outputTransformation3 = i21 != 0 ? null : outputTransformation;
                                        keyboardOptionsN = i22 != 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                        keyboardActionHandler3 = i24 != 0 ? null : keyboardActionHandler;
                                        if ((i5 & 16384) != 0) {
                                            i25 &= -57345;
                                            textFieldLineLimitsN = TextFieldLineLimits.INSTANCE.n();
                                        } else {
                                            textFieldLineLimitsN = textFieldLineLimits;
                                        }
                                        if ((32768 & i5) != 0) {
                                            i25 &= -458753;
                                            scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
                                        } else {
                                            scrollStateT = scrollState;
                                        }
                                        if ((i5 & 65536) != 0) {
                                            i25 &= -3670017;
                                            shapeXMQ = TextFieldDefaults.f23471n.xMQ(composerKN, 6);
                                        } else {
                                            shapeXMQ = shape;
                                        }
                                        int i35 = i25;
                                        if ((i5 & 131072) != 0) {
                                            mutableInteractionSource3 = null;
                                            textFieldColorsHI = TextFieldDefaults.f23471n.HI(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, 48, 2097151);
                                            composer3 = composerKN;
                                            i27 = i35 & (-29360129);
                                        } else {
                                            composer3 = composerKN;
                                            mutableInteractionSource3 = null;
                                            textFieldColorsHI = textFieldColors;
                                            i27 = i35;
                                        }
                                        modifier2 = modifier3;
                                        if (i26 != 0) {
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            i28 = i27;
                                            z5 = z12;
                                            textStyle2 = textStyle4;
                                            i7 = i34;
                                            function25 = function214;
                                            function26 = function215;
                                        } else {
                                            i28 = i27;
                                            z5 = z12;
                                            textStyle2 = textStyle4;
                                            i7 = i34;
                                            function25 = function214;
                                            function26 = function215;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        if ((i5 & 16) != 0) {
                                            i7 &= -57345;
                                        }
                                        if ((i5 & 16384) != 0) {
                                            i25 &= -57345;
                                        }
                                        if ((32768 & i5) != 0) {
                                            i25 &= -458753;
                                        }
                                        if ((i5 & 65536) != 0) {
                                            i25 &= -3670017;
                                        }
                                        if ((i5 & 131072) != 0) {
                                            i25 &= -29360129;
                                        }
                                        composer3 = composerKN;
                                        z10 = z3;
                                        function213 = function24;
                                        z11 = z4;
                                        inputTransformation2 = inputTransformation;
                                        outputTransformation3 = outputTransformation;
                                        keyboardOptionsN = keyboardOptions;
                                        keyboardActionHandler3 = keyboardActionHandler;
                                        textFieldLineLimitsN = textFieldLineLimits;
                                        scrollStateT = scrollState;
                                        shapeXMQ = shape;
                                        textFieldColorsHI = textFieldColors;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        function212 = function27;
                                        i28 = i25;
                                    }
                                    composer3.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1967634894, i7, i28, "androidx.compose.material.TextField (TextField.kt:196)");
                                    }
                                    if (mutableInteractionSource4 == null) {
                                        composer3.eF(-1673838860);
                                        Object objIF = composer3.iF();
                                        if (objIF == Composer.INSTANCE.n()) {
                                            objIF = InteractionSourceKt.n();
                                            composer3.o(objIF);
                                        }
                                        mutableInteractionSource5 = (MutableInteractionSource) objIF;
                                        composer3.Xw();
                                    } else {
                                        composer3.eF(-53995453);
                                        composer3.Xw();
                                        mutableInteractionSource5 = mutableInteractionSource4;
                                    }
                                    composer3.eF(-53989707);
                                    long jKN = textStyle2.KN();
                                    if (jKN == 16) {
                                        jKN = ((Color) textFieldColorsHI.t(z5, composer3, ((i7 >> 6) & 14) | ((i28 >> 18) & 112)).getValue()).getValue();
                                    }
                                    long j2 = jKN;
                                    composer3.Xw();
                                    TextStyle textStyleNHg = textStyle2.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f23471n;
                                    final TextFieldColors textFieldColors3 = textFieldColorsHI;
                                    Modifier modifier4 = modifier2;
                                    final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                    final boolean z13 = z11;
                                    Modifier modifierN = SizeKt.n(TextFieldImplKt.t(TextFieldDefaults.gh(textFieldDefaults, modifier4, z5, z13, mutableInteractionSource6, textFieldColors3, 0.0f, 0.0f, 48, null), z13, Strings_androidKt.n(Strings.INSTANCE.t(), composer3, 6)), textFieldDefaults.Uo(), textFieldDefaults.J2());
                                    Color color = (Color) textFieldColors3.xMQ(z13, composer3, ((i7 >> 27) & 14) | ((i28 >> 18) & 112)).getValue();
                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource4;
                                    final Function2 function216 = function25;
                                    final Function2 function217 = function26;
                                    final boolean z14 = z5;
                                    final Function2 function218 = function212;
                                    final Function2 function219 = function213;
                                    final OutputTransformation outputTransformation4 = outputTransformation3;
                                    final TextFieldLineLimits textFieldLineLimits3 = textFieldLineLimitsN;
                                    final Shape shape3 = shapeXMQ;
                                    int i36 = i28 << 12;
                                    Composer composer4 = composer3;
                                    BasicTextFieldKt.n(textFieldState, modifierN, z5, z10, inputTransformation2, textStyleNHg, keyboardOptionsN, keyboardActionHandler3, textFieldLineLimitsN, null, mutableInteractionSource6, new SolidColor(color.getValue(), null), outputTransformation3, new TextFieldDecorator() { // from class: androidx.compose.material.TextFieldKt$TextField$1
                                        @Override // androidx.compose.foundation.text.input.TextFieldDecorator
                                        public final void n(Function2 function220, Composer composer5, int i37) {
                                            TextFieldBuffer textFieldBuffer;
                                            String string;
                                            composer5.eF(626218266);
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(626218266, i37, -1, "androidx.compose.material.TextField.<no name provided>.Decoration (TextField.kt:226)");
                                            }
                                            if (outputTransformation4 == null) {
                                                string = textFieldState.xMQ().toString();
                                            } else {
                                                TextFieldState textFieldState2 = textFieldState;
                                                TextFieldBuffer textFieldBufferR = textFieldState2.r();
                                                try {
                                                    textFieldState2.nr(textFieldBufferR);
                                                    textFieldState2.J2();
                                                    OutputTransformation outputTransformation5 = outputTransformation4;
                                                    if (textFieldBufferR == null) {
                                                        Intrinsics.throwUninitializedPropertyAccessException(V8ValueTypedArray.PROPERTY_BUFFER);
                                                        textFieldBuffer = null;
                                                    } else {
                                                        textFieldBuffer = textFieldBufferR;
                                                    }
                                                    outputTransformation5.n(textFieldBuffer);
                                                    string = textFieldBufferR.n().toString();
                                                } catch (Throwable th) {
                                                    textFieldState2.J2();
                                                    throw th;
                                                }
                                            }
                                            String str = string;
                                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f23471n;
                                            VisualTransformation visualTransformationT = VisualTransformation.INSTANCE.t();
                                            textFieldDefaults2.O(str, function220, z14, Intrinsics.areEqual(textFieldLineLimits3, TextFieldLineLimits.SingleLine.rl), visualTransformationT, mutableInteractionSource6, z13, function216, function217, function218, function219, shape3, textFieldColors3, null, composer5, ((i37 << 3) & 112) | 24576, 24576, 8192);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            composer5.Xw();
                                        }
                                    }, scrollStateT, composer4, (i7 & 8078) | (57344 & i36) | (3670016 & i36) | (29360128 & i36) | (i36 & 234881024), ((i28 << 3) & 896) | ((i28 >> 3) & 57344), 512);
                                    composer2 = composer4;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    textStyle3 = textStyle2;
                                    function28 = function25;
                                    function29 = function26;
                                    textFieldColors2 = textFieldColors3;
                                    modifier2 = modifier4;
                                    z9 = z13;
                                    z7 = z5;
                                    mutableInteractionSource2 = mutableInteractionSource7;
                                    z6 = z10;
                                    function210 = function212;
                                    function211 = function213;
                                    outputTransformation2 = outputTransformation3;
                                    keyboardOptions2 = keyboardOptionsN;
                                    keyboardActionHandler2 = keyboardActionHandler3;
                                    textFieldLineLimits2 = textFieldLineLimitsN;
                                    scrollState2 = scrollStateT;
                                    shape2 = shapeXMQ;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    z6 = z3;
                                    inputTransformation2 = inputTransformation;
                                    outputTransformation2 = outputTransformation;
                                    keyboardOptions2 = keyboardOptions;
                                    scrollState2 = scrollState;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    textStyle3 = textStyle2;
                                    function28 = function25;
                                    function29 = function26;
                                    function210 = function27;
                                    z7 = z5;
                                    function211 = function24;
                                    z9 = z4;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    textFieldLineLimits2 = textFieldLineLimits;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    final Modifier modifier5 = modifier2;
                                    final InputTransformation inputTransformation3 = inputTransformation2;
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            n(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer5, int i37) {
                                            TextFieldKt.n(textFieldState, modifier5, z7, z6, textStyle3, function28, function29, function210, function211, z9, inputTransformation3, outputTransformation2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, scrollState2, shape2, textFieldColors2, mutableInteractionSource2, composer5, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i25 = i23 | 3072;
                            if ((i3 & 24576) == 0) {
                            }
                            if ((i3 & 196608) == 0) {
                            }
                            if ((i3 & 1572864) == 0) {
                            }
                            if ((i3 & 12582912) == 0) {
                            }
                            i26 = i5 & 262144;
                            if (i26 != 0) {
                            }
                            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i25 & 38347923) == 38347922) ? false : true, i7 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i16 = i15;
                        i17 = i5 & 1024;
                        if (i17 == 0) {
                        }
                        i20 = i5 & 2048;
                        if (i20 == 0) {
                        }
                        int i322 = i19;
                        i22 = i5 & 4096;
                        if (i22 == 0) {
                        }
                        i24 = i5 & 8192;
                        if (i24 != 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & 196608) == 0) {
                        }
                        if ((i3 & 1572864) == 0) {
                        }
                        if ((i3 & 12582912) == 0) {
                        }
                        i26 = i5 & 262144;
                        if (i26 != 0) {
                        }
                        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i25 & 38347923) == 38347922) ? false : true, i7 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i14 = i13;
                    i15 = i5 & 512;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i5 & 1024;
                    if (i17 == 0) {
                    }
                    i20 = i5 & 2048;
                    if (i20 == 0) {
                    }
                    int i3222 = i19;
                    i22 = i5 & 4096;
                    if (i22 == 0) {
                    }
                    i24 = i5 & 8192;
                    if (i24 != 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & 196608) == 0) {
                    }
                    if ((i3 & 1572864) == 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    i26 = i5 & 262144;
                    if (i26 != 0) {
                    }
                    if (composerKN.HI(((i7 & 306783379) == 306783378 && (i25 & 38347923) == 38347922) ? false : true, i7 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                int i312 = 8192;
                if ((i2 & 24576) != 0) {
                }
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i13 = i5 & 256;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i5 & 512;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i5 & 1024;
                if (i17 == 0) {
                }
                i20 = i5 & 2048;
                if (i20 == 0) {
                }
                int i32222 = i19;
                i22 = i5 & 4096;
                if (i22 == 0) {
                }
                i24 = i5 & 8192;
                if (i24 != 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & 196608) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                i26 = i5 & 262144;
                if (i26 != 0) {
                }
                if (composerKN.HI(((i7 & 306783379) == 306783378 && (i25 & 38347923) == 38347922) ? false : true, i7 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z5 = z2;
            i9 = i5 & 8;
            if (i9 != 0) {
            }
            int i3122 = 8192;
            if ((i2 & 24576) != 0) {
            }
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i13 = i5 & 256;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i5 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i5 & 1024;
            if (i17 == 0) {
            }
            i20 = i5 & 2048;
            if (i20 == 0) {
            }
            int i322222 = i19;
            i22 = i5 & 4096;
            if (i22 == 0) {
            }
            i24 = i5 & 8192;
            if (i24 != 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & 196608) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            i26 = i5 & 262144;
            if (i26 != 0) {
            }
            if (composerKN.HI(((i7 & 306783379) == 306783378 && (i25 & 38347923) == 38347922) ? false : true, i7 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i8 = i5 & 4;
        if (i8 == 0) {
        }
        z5 = z2;
        i9 = i5 & 8;
        if (i9 != 0) {
        }
        int i31222 = 8192;
        if ((i2 & 24576) != 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i5 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i5 & 1024;
        if (i17 == 0) {
        }
        i20 = i5 & 2048;
        if (i20 == 0) {
        }
        int i3222222 = i19;
        i22 = i5 & 4096;
        if (i22 == 0) {
        }
        i24 = i5 & 8192;
        if (i24 != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        i26 = i5 & 262144;
        if (i26 != 0) {
        }
        if (composerKN.HI(((i7 & 306783379) == 306783378 && (i25 & 38347923) == 38347922) ? false : true, i7 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final String str, final Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        int i10;
        Modifier modifier2;
        int i11;
        int i12;
        boolean z6;
        TextStyle textStyle2;
        int i13;
        Function2 function25;
        int i14;
        Function2 function26;
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
        int i29;
        int i30;
        Composer composer2;
        final boolean z7;
        final boolean z9;
        final VisualTransformation visualTransformation2;
        final boolean z10;
        final int i31;
        final int i32;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final boolean z11;
        final TextStyle textStyle3;
        final Function2 function27;
        final Function2 function28;
        final Modifier modifier3;
        final Function2 function29;
        final Function2 function210;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        ScopeUpdateScope scopeUpdateScopeGh;
        TextStyle textStyle4;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        boolean z12;
        int i33;
        KeyboardActions keyboardActions3;
        int i34;
        int i35;
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeXMQ;
        Composer composer3;
        TextFieldColors textFieldColorsHI;
        KeyboardActions keyboardActions4;
        boolean z13;
        boolean z14;
        TextStyle textStyle5;
        int i36;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean z15;
        int i37;
        int i38;
        MutableInteractionSource mutableInteractionSource4;
        Composer composerKN = composer.KN(-1504264404);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = (composerKN.p5(str) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                i9 |= composerKN.E2(function1) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i9 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i11 = i8 & 8;
                int i39 = 1024;
                if (i11 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        i9 |= composerKN.n(z2) ? 2048 : 1024;
                    }
                    i12 = i8 & 16;
                    if (i12 == 0) {
                        i9 |= 24576;
                    } else {
                        if ((i5 & 24576) == 0) {
                            z6 = z3;
                            i9 |= composerKN.n(z6) ? 16384 : 8192;
                        }
                        if ((i5 & 196608) == 0) {
                            textStyle2 = textStyle;
                            i9 |= ((i8 & 32) == 0 && composerKN.p5(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i13 = i8 & 64;
                        if (i13 != 0) {
                            i9 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i5 & 1572864) == 0) {
                                i9 |= composerKN.E2(function25) ? 1048576 : 524288;
                            }
                        }
                        i14 = i8 & 128;
                        if (i14 != 0) {
                            i9 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i5 & 12582912) == 0) {
                                i9 |= composerKN.E2(function26) ? 8388608 : 4194304;
                            }
                        }
                        i15 = i8 & 256;
                        if (i15 != 0) {
                            i9 |= 100663296;
                        } else {
                            if ((i5 & 100663296) == 0) {
                                i16 = i15;
                                i9 |= composerKN.E2(function23) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            i17 = i8 & 512;
                            if (i17 == 0) {
                                i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            } else {
                                if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i18 = i17;
                                    i9 |= composerKN.E2(function24) ? 536870912 : 268435456;
                                }
                                i19 = i8 & 1024;
                                if (i19 != 0) {
                                    i21 = i7 | 6;
                                    i20 = i19;
                                } else if ((i7 & 6) == 0) {
                                    i20 = i19;
                                    i21 = i7 | (composerKN.n(z4) ? 4 : 2);
                                } else {
                                    i20 = i19;
                                    i21 = i7;
                                }
                                i22 = i8 & 2048;
                                if (i22 != 0) {
                                    i21 |= 48;
                                    i23 = i22;
                                } else if ((i7 & 48) == 0) {
                                    i23 = i22;
                                    i21 |= composerKN.p5(visualTransformation) ? 32 : 16;
                                } else {
                                    i23 = i22;
                                }
                                int i40 = i21;
                                i24 = i8 & 4096;
                                if (i24 != 0) {
                                    i25 = i40 | RendererCapabilities.DECODER_SUPPORT_MASK;
                                } else {
                                    i25 = i40;
                                    if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i25 |= composerKN.p5(keyboardOptions) ? 256 : 128;
                                    }
                                    if ((i7 & 3072) == 0) {
                                        if ((i8 & 8192) == 0 && composerKN.p5(keyboardActions)) {
                                            i39 = 2048;
                                        }
                                        i25 |= i39;
                                    }
                                    int i41 = i25;
                                    i26 = i8 & 16384;
                                    if (i26 != 0) {
                                        i27 = i41;
                                        if ((i7 & 24576) == 0) {
                                            i27 |= composerKN.n(z5) ? 16384 : 8192;
                                        }
                                        if ((i7 & 196608) == 0) {
                                            i27 |= ((i8 & 32768) == 0 && composerKN.t(i2)) ? 131072 : 65536;
                                        }
                                        i28 = i8 & 65536;
                                        if (i28 != 0) {
                                            i27 |= 1572864;
                                        } else if ((i7 & 1572864) == 0) {
                                            i27 |= composerKN.t(i3) ? 1048576 : 524288;
                                        }
                                        i29 = i8 & 131072;
                                        if (i29 != 0) {
                                            i27 |= 12582912;
                                        } else if ((i7 & 12582912) == 0) {
                                            i27 |= composerKN.p5(mutableInteractionSource) ? 8388608 : 4194304;
                                        }
                                        if ((i7 & 100663296) == 0) {
                                            i27 |= ((i8 & 262144) == 0 && composerKN.p5(shape)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                        }
                                        if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                            i27 |= ((i8 & 524288) == 0 && composerKN.p5(textFieldColors)) ? 536870912 : 268435456;
                                        }
                                        i30 = i27;
                                        if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                                            composerKN.e();
                                            if ((i5 & 1) == 0 || composerKN.rV9()) {
                                                Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z16 = i11 != 0 ? true : z2;
                                                boolean z17 = i12 != 0 ? false : z6;
                                                if ((i8 & 32) != 0) {
                                                    i9 &= -458753;
                                                    textStyle4 = (TextStyle) composerKN.ty(TextKt.J2());
                                                } else {
                                                    textStyle4 = textStyle2;
                                                }
                                                int i42 = i9;
                                                function211 = i13 != 0 ? null : function25;
                                                function212 = i14 != 0 ? null : function26;
                                                function213 = i16 != 0 ? null : function23;
                                                function214 = i18 != 0 ? null : function24;
                                                z12 = i20 != 0 ? false : z4;
                                                VisualTransformation visualTransformationT = i23 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                                KeyboardOptions keyboardOptionsN = i24 != 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                                if ((i8 & 8192) != 0) {
                                                    i33 = i30 & (-7169);
                                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                } else {
                                                    i33 = i30;
                                                    keyboardActions3 = keyboardActions;
                                                }
                                                boolean z18 = i26 != 0 ? false : z5;
                                                if ((32768 & i8) != 0) {
                                                    i33 &= -458753;
                                                    i34 = z18 ? 1 : Integer.MAX_VALUE;
                                                } else {
                                                    i34 = i2;
                                                }
                                                i35 = i28 != 0 ? 1 : i3;
                                                mutableInteractionSource3 = i29 != 0 ? null : mutableInteractionSource;
                                                if ((262144 & i8) != 0) {
                                                    i33 &= -234881025;
                                                    shapeXMQ = TextFieldDefaults.f23471n.xMQ(composerKN, 6);
                                                } else {
                                                    shapeXMQ = shape;
                                                }
                                                int i43 = i33;
                                                if ((i8 & 524288) != 0) {
                                                    textFieldColorsHI = TextFieldDefaults.f23471n.HI(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, 48, 2097151);
                                                    composer3 = composerKN;
                                                    i38 = i43 & (-1879048193);
                                                    keyboardActions4 = keyboardActions3;
                                                    modifier2 = modifier4;
                                                    z13 = z16;
                                                    z14 = z17;
                                                    textStyle5 = textStyle4;
                                                    i36 = i42;
                                                    visualTransformation3 = visualTransformationT;
                                                    keyboardOptions3 = keyboardOptionsN;
                                                    z15 = z18;
                                                    i37 = i34;
                                                } else {
                                                    composer3 = composerKN;
                                                    textFieldColorsHI = textFieldColors;
                                                    keyboardActions4 = keyboardActions3;
                                                    modifier2 = modifier4;
                                                    z13 = z16;
                                                    z14 = z17;
                                                    textStyle5 = textStyle4;
                                                    i36 = i42;
                                                    visualTransformation3 = visualTransformationT;
                                                    keyboardOptions3 = keyboardOptionsN;
                                                    z15 = z18;
                                                    i37 = i34;
                                                    i38 = i43;
                                                }
                                            } else {
                                                composerKN.wTp();
                                                if ((i8 & 32) != 0) {
                                                    i9 &= -458753;
                                                }
                                                if ((i8 & 8192) != 0) {
                                                    i30 &= -7169;
                                                }
                                                if ((32768 & i8) != 0) {
                                                    i30 &= -458753;
                                                }
                                                if ((262144 & i8) != 0) {
                                                    i30 &= -234881025;
                                                }
                                                if ((i8 & 524288) != 0) {
                                                    i30 &= -1879048193;
                                                }
                                                composer3 = composerKN;
                                                function213 = function23;
                                                function214 = function24;
                                                z12 = z4;
                                                visualTransformation3 = visualTransformation;
                                                keyboardActions4 = keyboardActions;
                                                z15 = z5;
                                                i35 = i3;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                                shapeXMQ = shape;
                                                textFieldColorsHI = textFieldColors;
                                                z14 = z6;
                                                i36 = i9;
                                                function211 = function25;
                                                function212 = function26;
                                                z13 = z2;
                                                keyboardOptions3 = keyboardOptions;
                                                i37 = i2;
                                                i38 = i30;
                                                textStyle5 = textStyle2;
                                            }
                                            composer3.S();
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1504264404, i36, i38, "androidx.compose.material.TextField (TextField.kt:344)");
                                            }
                                            if (mutableInteractionSource3 == null) {
                                                composer3.eF(-1665803660);
                                                Object objIF = composer3.iF();
                                                if (objIF == Composer.INSTANCE.n()) {
                                                    objIF = InteractionSourceKt.n();
                                                    composer3.o(objIF);
                                                }
                                                mutableInteractionSource4 = (MutableInteractionSource) objIF;
                                                composer3.Xw();
                                            } else {
                                                composer3.eF(-53736253);
                                                composer3.Xw();
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                            }
                                            composer3.eF(-53730507);
                                            long jKN = textStyle5.KN();
                                            if (jKN == 16) {
                                                jKN = ((Color) textFieldColorsHI.t(z13, composer3, ((i36 >> 9) & 14) | ((i38 >> 24) & 112)).getValue()).getValue();
                                            }
                                            long j2 = jKN;
                                            composer3.Xw();
                                            TextStyle textStyleNHg = textStyle5.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f23471n;
                                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                            final boolean z19 = z13;
                                            Modifier modifier5 = modifier2;
                                            final boolean z20 = z12;
                                            TextStyle textStyle6 = textStyle5;
                                            int i44 = i36;
                                            Modifier modifierN = SizeKt.n(TextFieldImplKt.t(TextFieldDefaults.gh(textFieldDefaults, modifier5, z19, z20, mutableInteractionSource5, textFieldColorsHI, 0.0f, 0.0f, 48, null), z20, Strings_androidKt.n(Strings.INSTANCE.t(), composer3, 6)), textFieldDefaults.Uo(), textFieldDefaults.J2());
                                            SolidColor solidColor = new SolidColor(((Color) textFieldColorsHI.xMQ(z20, composer3, (i38 & 14) | ((i38 >> 24) & 112)).getValue()).getValue(), null);
                                            final TextFieldColors textFieldColors3 = textFieldColorsHI;
                                            final boolean z21 = z15;
                                            final VisualTransformation visualTransformation4 = visualTransformation3;
                                            final Function2 function215 = function211;
                                            final Function2 function216 = function212;
                                            final Function2 function217 = function213;
                                            final Function2 function218 = function214;
                                            final Shape shape3 = shapeXMQ;
                                            int i45 = i38 << 12;
                                            Composer composer4 = composer3;
                                            int i46 = i35;
                                            BasicTextFieldKt.O(str, function1, modifierN, z13, z14, textStyleNHg, keyboardOptions3, keyboardActions4, z15, i37, i46, visualTransformation3, null, mutableInteractionSource5, solidColor, ComposableLambdaKt.nr(989834338, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer5, Integer num) {
                                                    n(function219, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Function2 function219, Composer composer5, int i47) {
                                                    int i48;
                                                    if ((i47 & 6) == 0) {
                                                        i48 = i47 | (composer5.E2(function219) ? 4 : 2);
                                                    } else {
                                                        i48 = i47;
                                                    }
                                                    if (!composer5.HI((i48 & 19) != 18, i48 & 1)) {
                                                        composer5.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(989834338, i48, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:377)");
                                                    }
                                                    TextFieldDefaults.f23471n.O(str, function219, z19, z21, visualTransformation4, mutableInteractionSource5, z20, function215, function216, function217, function218, shape3, textFieldColors3, null, composer5, (i48 << 3) & 112, 24576, 8192);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer3, 54), composer4, (i44 & 64638) | (3670016 & i45) | (29360128 & i45) | (234881024 & i45) | (i45 & 1879048192), ((i38 >> 18) & 14) | 196608 | (i38 & 112), 4096);
                                            composer2 = composer4;
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            VisualTransformation visualTransformation5 = visualTransformation3;
                                            z10 = z15;
                                            visualTransformation2 = visualTransformation5;
                                            textStyle3 = textStyle6;
                                            textFieldColors2 = textFieldColors3;
                                            z7 = z13;
                                            z11 = z14;
                                            i31 = i37;
                                            i32 = i46;
                                            modifier3 = modifier5;
                                            function27 = function211;
                                            function28 = function212;
                                            function29 = function213;
                                            mutableInteractionSource2 = mutableInteractionSource3;
                                            shape2 = shapeXMQ;
                                            keyboardOptions2 = keyboardOptions3;
                                            keyboardActions2 = keyboardActions4;
                                            function210 = function214;
                                            z9 = z20;
                                        } else {
                                            composer2 = composerKN;
                                            composer2.wTp();
                                            z7 = z2;
                                            z9 = z4;
                                            visualTransformation2 = visualTransformation;
                                            z10 = z5;
                                            i31 = i2;
                                            i32 = i3;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            shape2 = shape;
                                            textFieldColors2 = textFieldColors;
                                            z11 = z6;
                                            textStyle3 = textStyle2;
                                            function27 = function25;
                                            function28 = function26;
                                            modifier3 = modifier2;
                                            function29 = function23;
                                            function210 = function24;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                        }
                                        scopeUpdateScopeGh = composer2.gh();
                                        if (scopeUpdateScopeGh != null) {
                                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    n(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer5, int i47) {
                                                    TextFieldKt.nr(str, function1, modifier3, z7, z11, textStyle3, function27, function28, function29, function210, z9, visualTransformation2, keyboardOptions2, keyboardActions2, z10, i31, i32, mutableInteractionSource2, shape2, textFieldColors2, composer5, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i27 = i41 | 24576;
                                    if ((i7 & 196608) == 0) {
                                    }
                                    i28 = i8 & 65536;
                                    if (i28 != 0) {
                                    }
                                    i29 = i8 & 131072;
                                    if (i29 != 0) {
                                    }
                                    if ((i7 & 100663296) == 0) {
                                    }
                                    if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    }
                                    i30 = i27;
                                    if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh != null) {
                                    }
                                }
                                if ((i7 & 3072) == 0) {
                                }
                                int i412 = i25;
                                i26 = i8 & 16384;
                                if (i26 != 0) {
                                }
                                if ((i7 & 196608) == 0) {
                                }
                                i28 = i8 & 65536;
                                if (i28 != 0) {
                                }
                                i29 = i8 & 131072;
                                if (i29 != 0) {
                                }
                                if ((i7 & 100663296) == 0) {
                                }
                                if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                }
                                i30 = i27;
                                if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                }
                            }
                            i18 = i17;
                            i19 = i8 & 1024;
                            if (i19 != 0) {
                            }
                            i22 = i8 & 2048;
                            if (i22 != 0) {
                            }
                            int i402 = i21;
                            i24 = i8 & 4096;
                            if (i24 != 0) {
                            }
                            if ((i7 & 3072) == 0) {
                            }
                            int i4122 = i25;
                            i26 = i8 & 16384;
                            if (i26 != 0) {
                            }
                            if ((i7 & 196608) == 0) {
                            }
                            i28 = i8 & 65536;
                            if (i28 != 0) {
                            }
                            i29 = i8 & 131072;
                            if (i29 != 0) {
                            }
                            if ((i7 & 100663296) == 0) {
                            }
                            if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            }
                            i30 = i27;
                            if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i16 = i15;
                        i17 = i8 & 512;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        i19 = i8 & 1024;
                        if (i19 != 0) {
                        }
                        i22 = i8 & 2048;
                        if (i22 != 0) {
                        }
                        int i4022 = i21;
                        i24 = i8 & 4096;
                        if (i24 != 0) {
                        }
                        if ((i7 & 3072) == 0) {
                        }
                        int i41222 = i25;
                        i26 = i8 & 16384;
                        if (i26 != 0) {
                        }
                        if ((i7 & 196608) == 0) {
                        }
                        i28 = i8 & 65536;
                        if (i28 != 0) {
                        }
                        i29 = i8 & 131072;
                        if (i29 != 0) {
                        }
                        if ((i7 & 100663296) == 0) {
                        }
                        if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        }
                        i30 = i27;
                        if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    z6 = z3;
                    if ((i5 & 196608) == 0) {
                    }
                    i13 = i8 & 64;
                    if (i13 != 0) {
                    }
                    i14 = i8 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i8 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i8 & 512;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    i19 = i8 & 1024;
                    if (i19 != 0) {
                    }
                    i22 = i8 & 2048;
                    if (i22 != 0) {
                    }
                    int i40222 = i21;
                    i24 = i8 & 4096;
                    if (i24 != 0) {
                    }
                    if ((i7 & 3072) == 0) {
                    }
                    int i412222 = i25;
                    i26 = i8 & 16384;
                    if (i26 != 0) {
                    }
                    if ((i7 & 196608) == 0) {
                    }
                    i28 = i8 & 65536;
                    if (i28 != 0) {
                    }
                    i29 = i8 & 131072;
                    if (i29 != 0) {
                    }
                    if ((i7 & 100663296) == 0) {
                    }
                    if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    }
                    i30 = i27;
                    if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i12 = i8 & 16;
                if (i12 == 0) {
                }
                z6 = z3;
                if ((i5 & 196608) == 0) {
                }
                i13 = i8 & 64;
                if (i13 != 0) {
                }
                i14 = i8 & 128;
                if (i14 != 0) {
                }
                i15 = i8 & 256;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i8 & 512;
                if (i17 == 0) {
                }
                i18 = i17;
                i19 = i8 & 1024;
                if (i19 != 0) {
                }
                i22 = i8 & 2048;
                if (i22 != 0) {
                }
                int i402222 = i21;
                i24 = i8 & 4096;
                if (i24 != 0) {
                }
                if ((i7 & 3072) == 0) {
                }
                int i4122222 = i25;
                i26 = i8 & 16384;
                if (i26 != 0) {
                }
                if ((i7 & 196608) == 0) {
                }
                i28 = i8 & 65536;
                if (i28 != 0) {
                }
                i29 = i8 & 131072;
                if (i29 != 0) {
                }
                if ((i7 & 100663296) == 0) {
                }
                if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                i30 = i27;
                if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i11 = i8 & 8;
            int i392 = 1024;
            if (i11 != 0) {
            }
            i12 = i8 & 16;
            if (i12 == 0) {
            }
            z6 = z3;
            if ((i5 & 196608) == 0) {
            }
            i13 = i8 & 64;
            if (i13 != 0) {
            }
            i14 = i8 & 128;
            if (i14 != 0) {
            }
            i15 = i8 & 256;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i8 & 512;
            if (i17 == 0) {
            }
            i18 = i17;
            i19 = i8 & 1024;
            if (i19 != 0) {
            }
            i22 = i8 & 2048;
            if (i22 != 0) {
            }
            int i4022222 = i21;
            i24 = i8 & 4096;
            if (i24 != 0) {
            }
            if ((i7 & 3072) == 0) {
            }
            int i41222222 = i25;
            i26 = i8 & 16384;
            if (i26 != 0) {
            }
            if ((i7 & 196608) == 0) {
            }
            i28 = i8 & 65536;
            if (i28 != 0) {
            }
            i29 = i8 & 131072;
            if (i29 != 0) {
            }
            if ((i7 & 100663296) == 0) {
            }
            if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            i30 = i27;
            if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        modifier2 = modifier;
        i11 = i8 & 8;
        int i3922 = 1024;
        if (i11 != 0) {
        }
        i12 = i8 & 16;
        if (i12 == 0) {
        }
        z6 = z3;
        if ((i5 & 196608) == 0) {
        }
        i13 = i8 & 64;
        if (i13 != 0) {
        }
        i14 = i8 & 128;
        if (i14 != 0) {
        }
        i15 = i8 & 256;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i8 & 512;
        if (i17 == 0) {
        }
        i18 = i17;
        i19 = i8 & 1024;
        if (i19 != 0) {
        }
        i22 = i8 & 2048;
        if (i22 != 0) {
        }
        int i40222222 = i21;
        i24 = i8 & 4096;
        if (i24 != 0) {
        }
        if ((i7 & 3072) == 0) {
        }
        int i412222222 = i25;
        i26 = i8 & 16384;
        if (i26 != 0) {
        }
        if ((i7 & 196608) == 0) {
        }
        i28 = i8 & 65536;
        if (i28 != 0) {
        }
        i29 = i8 & 131072;
        if (i29 != 0) {
        }
        if ((i7 & 100663296) == 0) {
        }
        if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        i30 = i27;
        if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        int i10;
        Modifier modifier2;
        int i11;
        int i12;
        boolean z6;
        TextStyle textStyle2;
        int i13;
        Function2 function25;
        int i14;
        Function2 function26;
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
        int i29;
        int i30;
        Composer composer2;
        final boolean z7;
        final boolean z9;
        final VisualTransformation visualTransformation2;
        final boolean z10;
        final int i31;
        final int i32;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final boolean z11;
        final TextStyle textStyle3;
        final Function2 function27;
        final Function2 function28;
        final Modifier modifier3;
        final Function2 function29;
        final Function2 function210;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        ScopeUpdateScope scopeUpdateScopeGh;
        TextStyle textStyle4;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        boolean z12;
        int i33;
        KeyboardActions keyboardActions3;
        int i34;
        int i35;
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeXMQ;
        Composer composer3;
        TextFieldColors textFieldColorsHI;
        KeyboardActions keyboardActions4;
        boolean z13;
        boolean z14;
        TextStyle textStyle5;
        int i36;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean z15;
        int i37;
        int i38;
        MutableInteractionSource mutableInteractionSource4;
        Composer composerKN = composer.KN(-359119489);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = (composerKN.p5(textFieldValue) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                i9 |= composerKN.E2(function1) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i9 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i11 = i8 & 8;
                int i39 = 1024;
                if (i11 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        i9 |= composerKN.n(z2) ? 2048 : 1024;
                    }
                    i12 = i8 & 16;
                    if (i12 == 0) {
                        i9 |= 24576;
                    } else {
                        if ((i5 & 24576) == 0) {
                            z6 = z3;
                            i9 |= composerKN.n(z6) ? 16384 : 8192;
                        }
                        if ((i5 & 196608) == 0) {
                            textStyle2 = textStyle;
                            i9 |= ((i8 & 32) == 0 && composerKN.p5(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i13 = i8 & 64;
                        if (i13 != 0) {
                            i9 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i5 & 1572864) == 0) {
                                i9 |= composerKN.E2(function25) ? 1048576 : 524288;
                            }
                        }
                        i14 = i8 & 128;
                        if (i14 != 0) {
                            i9 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i5 & 12582912) == 0) {
                                i9 |= composerKN.E2(function26) ? 8388608 : 4194304;
                            }
                        }
                        i15 = i8 & 256;
                        if (i15 != 0) {
                            i9 |= 100663296;
                        } else {
                            if ((i5 & 100663296) == 0) {
                                i16 = i15;
                                i9 |= composerKN.E2(function23) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            i17 = i8 & 512;
                            if (i17 == 0) {
                                i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            } else {
                                if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i18 = i17;
                                    i9 |= composerKN.E2(function24) ? 536870912 : 268435456;
                                }
                                i19 = i8 & 1024;
                                if (i19 != 0) {
                                    i21 = i7 | 6;
                                    i20 = i19;
                                } else if ((i7 & 6) == 0) {
                                    i20 = i19;
                                    i21 = i7 | (composerKN.n(z4) ? 4 : 2);
                                } else {
                                    i20 = i19;
                                    i21 = i7;
                                }
                                i22 = i8 & 2048;
                                if (i22 != 0) {
                                    i21 |= 48;
                                    i23 = i22;
                                } else if ((i7 & 48) == 0) {
                                    i23 = i22;
                                    i21 |= composerKN.p5(visualTransformation) ? 32 : 16;
                                } else {
                                    i23 = i22;
                                }
                                int i40 = i21;
                                i24 = i8 & 4096;
                                if (i24 != 0) {
                                    i25 = i40 | RendererCapabilities.DECODER_SUPPORT_MASK;
                                } else {
                                    i25 = i40;
                                    if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i25 |= composerKN.p5(keyboardOptions) ? 256 : 128;
                                    }
                                    if ((i7 & 3072) == 0) {
                                        if ((i8 & 8192) == 0 && composerKN.p5(keyboardActions)) {
                                            i39 = 2048;
                                        }
                                        i25 |= i39;
                                    }
                                    int i41 = i25;
                                    i26 = i8 & 16384;
                                    if (i26 != 0) {
                                        i27 = i41;
                                        if ((i7 & 24576) == 0) {
                                            i27 |= composerKN.n(z5) ? 16384 : 8192;
                                        }
                                        if ((i7 & 196608) == 0) {
                                            i27 |= ((i8 & 32768) == 0 && composerKN.t(i2)) ? 131072 : 65536;
                                        }
                                        i28 = i8 & 65536;
                                        if (i28 != 0) {
                                            i27 |= 1572864;
                                        } else if ((i7 & 1572864) == 0) {
                                            i27 |= composerKN.t(i3) ? 1048576 : 524288;
                                        }
                                        i29 = i8 & 131072;
                                        if (i29 != 0) {
                                            i27 |= 12582912;
                                        } else if ((i7 & 12582912) == 0) {
                                            i27 |= composerKN.p5(mutableInteractionSource) ? 8388608 : 4194304;
                                        }
                                        if ((i7 & 100663296) == 0) {
                                            i27 |= ((i8 & 262144) == 0 && composerKN.p5(shape)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                        }
                                        if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                            i27 |= ((i8 & 524288) == 0 && composerKN.p5(textFieldColors)) ? 536870912 : 268435456;
                                        }
                                        i30 = i27;
                                        if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                                            composerKN.e();
                                            if ((i5 & 1) == 0 || composerKN.rV9()) {
                                                Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z16 = i11 != 0 ? true : z2;
                                                boolean z17 = i12 != 0 ? false : z6;
                                                if ((i8 & 32) != 0) {
                                                    i9 &= -458753;
                                                    textStyle4 = (TextStyle) composerKN.ty(TextKt.J2());
                                                } else {
                                                    textStyle4 = textStyle2;
                                                }
                                                int i42 = i9;
                                                function211 = i13 != 0 ? null : function25;
                                                function212 = i14 != 0 ? null : function26;
                                                function213 = i16 != 0 ? null : function23;
                                                function214 = i18 != 0 ? null : function24;
                                                z12 = i20 != 0 ? false : z4;
                                                VisualTransformation visualTransformationT = i23 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                                KeyboardOptions keyboardOptionsN = i24 != 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                                if ((i8 & 8192) != 0) {
                                                    i33 = i30 & (-7169);
                                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                } else {
                                                    i33 = i30;
                                                    keyboardActions3 = keyboardActions;
                                                }
                                                boolean z18 = i26 != 0 ? false : z5;
                                                if ((32768 & i8) != 0) {
                                                    i33 &= -458753;
                                                    i34 = z18 ? 1 : Integer.MAX_VALUE;
                                                } else {
                                                    i34 = i2;
                                                }
                                                i35 = i28 != 0 ? 1 : i3;
                                                mutableInteractionSource3 = i29 != 0 ? null : mutableInteractionSource;
                                                if ((262144 & i8) != 0) {
                                                    i33 &= -234881025;
                                                    shapeXMQ = TextFieldDefaults.f23471n.xMQ(composerKN, 6);
                                                } else {
                                                    shapeXMQ = shape;
                                                }
                                                int i43 = i33;
                                                if ((i8 & 524288) != 0) {
                                                    textFieldColorsHI = TextFieldDefaults.f23471n.HI(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, 48, 2097151);
                                                    composer3 = composerKN;
                                                    i38 = i43 & (-1879048193);
                                                    keyboardActions4 = keyboardActions3;
                                                    modifier2 = modifier4;
                                                    z13 = z16;
                                                    z14 = z17;
                                                    textStyle5 = textStyle4;
                                                    i36 = i42;
                                                    visualTransformation3 = visualTransformationT;
                                                    keyboardOptions3 = keyboardOptionsN;
                                                    z15 = z18;
                                                    i37 = i34;
                                                } else {
                                                    composer3 = composerKN;
                                                    textFieldColorsHI = textFieldColors;
                                                    keyboardActions4 = keyboardActions3;
                                                    modifier2 = modifier4;
                                                    z13 = z16;
                                                    z14 = z17;
                                                    textStyle5 = textStyle4;
                                                    i36 = i42;
                                                    visualTransformation3 = visualTransformationT;
                                                    keyboardOptions3 = keyboardOptionsN;
                                                    z15 = z18;
                                                    i37 = i34;
                                                    i38 = i43;
                                                }
                                            } else {
                                                composerKN.wTp();
                                                if ((i8 & 32) != 0) {
                                                    i9 &= -458753;
                                                }
                                                if ((i8 & 8192) != 0) {
                                                    i30 &= -7169;
                                                }
                                                if ((32768 & i8) != 0) {
                                                    i30 &= -458753;
                                                }
                                                if ((262144 & i8) != 0) {
                                                    i30 &= -234881025;
                                                }
                                                if ((i8 & 524288) != 0) {
                                                    i30 &= -1879048193;
                                                }
                                                composer3 = composerKN;
                                                function213 = function23;
                                                function214 = function24;
                                                z12 = z4;
                                                visualTransformation3 = visualTransformation;
                                                keyboardActions4 = keyboardActions;
                                                z15 = z5;
                                                i35 = i3;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                                shapeXMQ = shape;
                                                textFieldColorsHI = textFieldColors;
                                                z14 = z6;
                                                i36 = i9;
                                                function211 = function25;
                                                function212 = function26;
                                                z13 = z2;
                                                keyboardOptions3 = keyboardOptions;
                                                i37 = i2;
                                                i38 = i30;
                                                textStyle5 = textStyle2;
                                            }
                                            composer3.S();
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-359119489, i36, i38, "androidx.compose.material.TextField (TextField.kt:535)");
                                            }
                                            if (mutableInteractionSource3 == null) {
                                                composer3.eF(-1656495724);
                                                Object objIF = composer3.iF();
                                                if (objIF == Composer.INSTANCE.n()) {
                                                    objIF = InteractionSourceKt.n();
                                                    composer3.o(objIF);
                                                }
                                                mutableInteractionSource4 = (MutableInteractionSource) objIF;
                                                composer3.Xw();
                                            } else {
                                                composer3.eF(-53435997);
                                                composer3.Xw();
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                            }
                                            composer3.eF(-53430251);
                                            long jKN = textStyle5.KN();
                                            if (jKN == 16) {
                                                jKN = ((Color) textFieldColorsHI.t(z13, composer3, ((i36 >> 9) & 14) | ((i38 >> 24) & 112)).getValue()).getValue();
                                            }
                                            long j2 = jKN;
                                            composer3.Xw();
                                            TextStyle textStyleNHg = textStyle5.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f23471n;
                                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                            final boolean z19 = z13;
                                            Modifier modifier5 = modifier2;
                                            final boolean z20 = z12;
                                            TextStyle textStyle6 = textStyle5;
                                            int i44 = i36;
                                            Modifier modifierN = SizeKt.n(TextFieldImplKt.t(TextFieldDefaults.gh(textFieldDefaults, modifier5, z19, z20, mutableInteractionSource5, textFieldColorsHI, 0.0f, 0.0f, 48, null), z20, Strings_androidKt.n(Strings.INSTANCE.t(), composer3, 6)), textFieldDefaults.Uo(), textFieldDefaults.J2());
                                            SolidColor solidColor = new SolidColor(((Color) textFieldColorsHI.xMQ(z20, composer3, (i38 & 14) | ((i38 >> 24) & 112)).getValue()).getValue(), null);
                                            final TextFieldColors textFieldColors3 = textFieldColorsHI;
                                            final boolean z21 = z15;
                                            final VisualTransformation visualTransformation4 = visualTransformation3;
                                            final Function2 function215 = function211;
                                            final Function2 function216 = function212;
                                            final Function2 function217 = function213;
                                            final Function2 function218 = function214;
                                            final Shape shape3 = shapeXMQ;
                                            int i45 = i38 << 12;
                                            Composer composer4 = composer3;
                                            int i46 = i35;
                                            BasicTextFieldKt.t(textFieldValue, function1, modifierN, z13, z14, textStyleNHg, keyboardOptions3, keyboardActions4, z15, i37, i46, visualTransformation3, null, mutableInteractionSource5, solidColor, ComposableLambdaKt.nr(-126640971, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$7
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer5, Integer num) {
                                                    n(function219, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Function2 function219, Composer composer5, int i47) {
                                                    int i48;
                                                    if ((i47 & 6) == 0) {
                                                        i48 = i47 | (composer5.E2(function219) ? 4 : 2);
                                                    } else {
                                                        i48 = i47;
                                                    }
                                                    if (!composer5.HI((i48 & 19) != 18, i48 & 1)) {
                                                        composer5.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-126640971, i48, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:568)");
                                                    }
                                                    TextFieldDefaults.f23471n.O(textFieldValue.xMQ(), function219, z19, z21, visualTransformation4, mutableInteractionSource5, z20, function215, function216, function217, function218, shape3, textFieldColors3, null, composer5, (i48 << 3) & 112, 24576, 8192);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer3, 54), composer4, (i44 & 64638) | (3670016 & i45) | (29360128 & i45) | (234881024 & i45) | (i45 & 1879048192), ((i38 >> 18) & 14) | 196608 | (i38 & 112), 4096);
                                            composer2 = composer4;
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            VisualTransformation visualTransformation5 = visualTransformation3;
                                            z10 = z15;
                                            visualTransformation2 = visualTransformation5;
                                            textStyle3 = textStyle6;
                                            textFieldColors2 = textFieldColors3;
                                            z7 = z13;
                                            z11 = z14;
                                            i31 = i37;
                                            i32 = i46;
                                            modifier3 = modifier5;
                                            function27 = function211;
                                            function28 = function212;
                                            function29 = function213;
                                            mutableInteractionSource2 = mutableInteractionSource3;
                                            shape2 = shapeXMQ;
                                            keyboardOptions2 = keyboardOptions3;
                                            keyboardActions2 = keyboardActions4;
                                            function210 = function214;
                                            z9 = z20;
                                        } else {
                                            composer2 = composerKN;
                                            composer2.wTp();
                                            z7 = z2;
                                            z9 = z4;
                                            visualTransformation2 = visualTransformation;
                                            z10 = z5;
                                            i31 = i2;
                                            i32 = i3;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            shape2 = shape;
                                            textFieldColors2 = textFieldColors;
                                            z11 = z6;
                                            textStyle3 = textStyle2;
                                            function27 = function25;
                                            function28 = function26;
                                            modifier3 = modifier2;
                                            function29 = function23;
                                            function210 = function24;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                        }
                                        scopeUpdateScopeGh = composer2.gh();
                                        if (scopeUpdateScopeGh != null) {
                                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$8
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    n(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer5, int i47) {
                                                    TextFieldKt.rl(textFieldValue, function1, modifier3, z7, z11, textStyle3, function27, function28, function29, function210, z9, visualTransformation2, keyboardOptions2, keyboardActions2, z10, i31, i32, mutableInteractionSource2, shape2, textFieldColors2, composer5, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i27 = i41 | 24576;
                                    if ((i7 & 196608) == 0) {
                                    }
                                    i28 = i8 & 65536;
                                    if (i28 != 0) {
                                    }
                                    i29 = i8 & 131072;
                                    if (i29 != 0) {
                                    }
                                    if ((i7 & 100663296) == 0) {
                                    }
                                    if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    }
                                    i30 = i27;
                                    if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh != null) {
                                    }
                                }
                                if ((i7 & 3072) == 0) {
                                }
                                int i412 = i25;
                                i26 = i8 & 16384;
                                if (i26 != 0) {
                                }
                                if ((i7 & 196608) == 0) {
                                }
                                i28 = i8 & 65536;
                                if (i28 != 0) {
                                }
                                i29 = i8 & 131072;
                                if (i29 != 0) {
                                }
                                if ((i7 & 100663296) == 0) {
                                }
                                if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                }
                                i30 = i27;
                                if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                }
                            }
                            i18 = i17;
                            i19 = i8 & 1024;
                            if (i19 != 0) {
                            }
                            i22 = i8 & 2048;
                            if (i22 != 0) {
                            }
                            int i402 = i21;
                            i24 = i8 & 4096;
                            if (i24 != 0) {
                            }
                            if ((i7 & 3072) == 0) {
                            }
                            int i4122 = i25;
                            i26 = i8 & 16384;
                            if (i26 != 0) {
                            }
                            if ((i7 & 196608) == 0) {
                            }
                            i28 = i8 & 65536;
                            if (i28 != 0) {
                            }
                            i29 = i8 & 131072;
                            if (i29 != 0) {
                            }
                            if ((i7 & 100663296) == 0) {
                            }
                            if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            }
                            i30 = i27;
                            if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i16 = i15;
                        i17 = i8 & 512;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        i19 = i8 & 1024;
                        if (i19 != 0) {
                        }
                        i22 = i8 & 2048;
                        if (i22 != 0) {
                        }
                        int i4022 = i21;
                        i24 = i8 & 4096;
                        if (i24 != 0) {
                        }
                        if ((i7 & 3072) == 0) {
                        }
                        int i41222 = i25;
                        i26 = i8 & 16384;
                        if (i26 != 0) {
                        }
                        if ((i7 & 196608) == 0) {
                        }
                        i28 = i8 & 65536;
                        if (i28 != 0) {
                        }
                        i29 = i8 & 131072;
                        if (i29 != 0) {
                        }
                        if ((i7 & 100663296) == 0) {
                        }
                        if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        }
                        i30 = i27;
                        if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    z6 = z3;
                    if ((i5 & 196608) == 0) {
                    }
                    i13 = i8 & 64;
                    if (i13 != 0) {
                    }
                    i14 = i8 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i8 & 256;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i8 & 512;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    i19 = i8 & 1024;
                    if (i19 != 0) {
                    }
                    i22 = i8 & 2048;
                    if (i22 != 0) {
                    }
                    int i40222 = i21;
                    i24 = i8 & 4096;
                    if (i24 != 0) {
                    }
                    if ((i7 & 3072) == 0) {
                    }
                    int i412222 = i25;
                    i26 = i8 & 16384;
                    if (i26 != 0) {
                    }
                    if ((i7 & 196608) == 0) {
                    }
                    i28 = i8 & 65536;
                    if (i28 != 0) {
                    }
                    i29 = i8 & 131072;
                    if (i29 != 0) {
                    }
                    if ((i7 & 100663296) == 0) {
                    }
                    if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    }
                    i30 = i27;
                    if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i12 = i8 & 16;
                if (i12 == 0) {
                }
                z6 = z3;
                if ((i5 & 196608) == 0) {
                }
                i13 = i8 & 64;
                if (i13 != 0) {
                }
                i14 = i8 & 128;
                if (i14 != 0) {
                }
                i15 = i8 & 256;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i8 & 512;
                if (i17 == 0) {
                }
                i18 = i17;
                i19 = i8 & 1024;
                if (i19 != 0) {
                }
                i22 = i8 & 2048;
                if (i22 != 0) {
                }
                int i402222 = i21;
                i24 = i8 & 4096;
                if (i24 != 0) {
                }
                if ((i7 & 3072) == 0) {
                }
                int i4122222 = i25;
                i26 = i8 & 16384;
                if (i26 != 0) {
                }
                if ((i7 & 196608) == 0) {
                }
                i28 = i8 & 65536;
                if (i28 != 0) {
                }
                i29 = i8 & 131072;
                if (i29 != 0) {
                }
                if ((i7 & 100663296) == 0) {
                }
                if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                i30 = i27;
                if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i11 = i8 & 8;
            int i392 = 1024;
            if (i11 != 0) {
            }
            i12 = i8 & 16;
            if (i12 == 0) {
            }
            z6 = z3;
            if ((i5 & 196608) == 0) {
            }
            i13 = i8 & 64;
            if (i13 != 0) {
            }
            i14 = i8 & 128;
            if (i14 != 0) {
            }
            i15 = i8 & 256;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i8 & 512;
            if (i17 == 0) {
            }
            i18 = i17;
            i19 = i8 & 1024;
            if (i19 != 0) {
            }
            i22 = i8 & 2048;
            if (i22 != 0) {
            }
            int i4022222 = i21;
            i24 = i8 & 4096;
            if (i24 != 0) {
            }
            if ((i7 & 3072) == 0) {
            }
            int i41222222 = i25;
            i26 = i8 & 16384;
            if (i26 != 0) {
            }
            if ((i7 & 196608) == 0) {
            }
            i28 = i8 & 65536;
            if (i28 != 0) {
            }
            i29 = i8 & 131072;
            if (i29 != 0) {
            }
            if ((i7 & 100663296) == 0) {
            }
            if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            i30 = i27;
            if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        modifier2 = modifier;
        i11 = i8 & 8;
        int i3922 = 1024;
        if (i11 != 0) {
        }
        i12 = i8 & 16;
        if (i12 == 0) {
        }
        z6 = z3;
        if ((i5 & 196608) == 0) {
        }
        i13 = i8 & 64;
        if (i13 != 0) {
        }
        i14 = i8 & 128;
        if (i14 != 0) {
        }
        i15 = i8 & 256;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i8 & 512;
        if (i17 == 0) {
        }
        i18 = i17;
        i19 = i8 & 1024;
        if (i19 != 0) {
        }
        i22 = i8 & 2048;
        if (i22 != 0) {
        }
        int i40222222 = i21;
        i24 = i8 & 4096;
        if (i24 != 0) {
        }
        if ((i7 & 3072) == 0) {
        }
        int i412222222 = i25;
        i26 = i8 & 16384;
        if (i26 != 0) {
        }
        if ((i7 & 196608) == 0) {
        }
        i28 = i8 & 65536;
        if (i28 != 0) {
        }
        i29 = i8 & 131072;
        if (i29 != 0) {
        }
        if ((i7 & 100663296) == 0) {
        }
        if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        i30 = i27;
        if (composerKN.HI(((i9 & 306783379) == 306783378 && (306783379 & i30) == 306783378) ? false : true, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void t(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i5, final int i7) {
        int i8;
        int i9;
        Modifier modifier2;
        int i10;
        boolean z6;
        int i11;
        boolean z7;
        TextStyle textStyle2;
        int i12;
        Function2 function25;
        int i13;
        Function2 function26;
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
        int i27;
        int i28;
        int i29;
        Composer composer2;
        final boolean z9;
        final VisualTransformation visualTransformation2;
        final boolean z10;
        final int i30;
        final MutableInteractionSource mutableInteractionSource2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final boolean z11;
        final boolean z12;
        final TextStyle textStyle3;
        final Function2 function27;
        final Function2 function28;
        final Modifier modifier3;
        final Function2 function29;
        final Function2 function210;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        ScopeUpdateScope scopeUpdateScopeGh;
        TextStyle textStyle4;
        int i31;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeXMQ;
        TextFieldColors textFieldColorsHI;
        KeyboardActions keyboardActions4;
        Modifier modifier4;
        boolean z13;
        boolean z14;
        int i32;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        boolean z15;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean z16;
        int i33;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        Composer composerKN = composer.KN(-1576622884);
        if ((i7 & 1) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = (composerKN.p5(textFieldValue) ? 4 : 2) | i3;
        } else {
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
                int i34 = 1024;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        z6 = z2;
                        i8 |= composerKN.n(z6) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            z7 = z3;
                            i8 |= composerKN.n(z7) ? 16384 : 8192;
                        }
                        if ((i3 & 196608) == 0) {
                            textStyle2 = textStyle;
                            i8 |= ((i7 & 32) == 0 && composerKN.p5(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i12 = i7 & 64;
                        if (i12 != 0) {
                            i8 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i3 & 1572864) == 0) {
                                i8 |= composerKN.E2(function25) ? 1048576 : 524288;
                            }
                        }
                        i13 = i7 & 128;
                        if (i13 != 0) {
                            i8 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i3 & 12582912) == 0) {
                                i8 |= composerKN.E2(function26) ? 8388608 : 4194304;
                            }
                        }
                        i14 = i7 & 256;
                        if (i14 != 0) {
                            i8 |= 100663296;
                        } else {
                            if ((i3 & 100663296) == 0) {
                                i15 = i14;
                                i8 |= composerKN.E2(function23) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            i16 = i7 & 512;
                            if (i16 == 0) {
                                i8 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            } else {
                                if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i17 = i16;
                                    i8 |= composerKN.E2(function24) ? 536870912 : 268435456;
                                }
                                i18 = i7 & 1024;
                                if (i18 != 0) {
                                    i20 = i5 | 6;
                                    i19 = i18;
                                } else if ((i5 & 6) == 0) {
                                    i19 = i18;
                                    i20 = i5 | (composerKN.n(z4) ? 4 : 2);
                                } else {
                                    i19 = i18;
                                    i20 = i5;
                                }
                                i21 = i7 & 2048;
                                if (i21 != 0) {
                                    i20 |= 48;
                                    i22 = i21;
                                } else if ((i5 & 48) == 0) {
                                    i22 = i21;
                                    i20 |= composerKN.p5(visualTransformation) ? 32 : 16;
                                } else {
                                    i22 = i21;
                                }
                                int i35 = i20;
                                i23 = i7 & 4096;
                                if (i23 != 0) {
                                    i24 = i35 | RendererCapabilities.DECODER_SUPPORT_MASK;
                                } else {
                                    i24 = i35;
                                    if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i24 |= composerKN.p5(keyboardOptions) ? 256 : 128;
                                    }
                                    if ((i5 & 3072) == 0) {
                                        if ((i7 & 8192) == 0 && composerKN.p5(keyboardActions)) {
                                            i34 = 2048;
                                        }
                                        i24 |= i34;
                                    }
                                    int i36 = i24;
                                    i25 = i7 & 16384;
                                    if (i25 != 0) {
                                        i26 = i36;
                                        if ((i5 & 24576) == 0) {
                                            i26 |= composerKN.n(z5) ? 16384 : 8192;
                                        }
                                        i27 = i7 & 32768;
                                        if (i27 != 0) {
                                            i26 |= 196608;
                                        } else if ((i5 & 196608) == 0) {
                                            i26 |= composerKN.t(i2) ? 131072 : 65536;
                                        }
                                        i28 = i7 & 65536;
                                        if (i28 != 0) {
                                            i26 |= 1572864;
                                        } else if ((i5 & 1572864) == 0) {
                                            i26 |= composerKN.p5(mutableInteractionSource) ? 1048576 : 524288;
                                        }
                                        if ((i5 & 12582912) == 0) {
                                            i26 |= ((i7 & 131072) == 0 && composerKN.p5(shape)) ? 8388608 : 4194304;
                                        }
                                        if ((i5 & 100663296) == 0) {
                                            i26 |= ((i7 & 262144) == 0 && composerKN.p5(textFieldColors)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                        }
                                        i29 = i26;
                                        if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                                            composerKN.e();
                                            if ((i3 & 1) == 0 || composerKN.rV9()) {
                                                Modifier modifier5 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z17 = i10 != 0 ? true : z6;
                                                boolean z18 = i11 != 0 ? false : z7;
                                                if ((i7 & 32) != 0) {
                                                    i8 &= -458753;
                                                    textStyle4 = (TextStyle) composerKN.ty(TextKt.J2());
                                                } else {
                                                    textStyle4 = textStyle2;
                                                }
                                                int i37 = i8;
                                                Function2 function214 = i12 != 0 ? null : function25;
                                                Function2 function215 = i13 != 0 ? null : function26;
                                                Function2 function216 = i15 != 0 ? null : function23;
                                                Function2 function217 = i17 != 0 ? null : function24;
                                                boolean z19 = i19 != 0 ? false : z4;
                                                VisualTransformation visualTransformationT = i22 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                                KeyboardOptions keyboardOptionsN = i23 != 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                                if ((i7 & 8192) != 0) {
                                                    i31 = i29 & (-7169);
                                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                } else {
                                                    i31 = i29;
                                                    keyboardActions3 = keyboardActions;
                                                }
                                                boolean z20 = i25 != 0 ? false : z5;
                                                int i38 = i27 != 0 ? Integer.MAX_VALUE : i2;
                                                if (i28 != 0) {
                                                    Object objIF = composerKN.iF();
                                                    if (objIF == Composer.INSTANCE.n()) {
                                                        objIF = InteractionSourceKt.n();
                                                        composerKN.o(objIF);
                                                    }
                                                    mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                                } else {
                                                    mutableInteractionSource3 = mutableInteractionSource;
                                                }
                                                if ((i7 & 131072) != 0) {
                                                    i31 &= -29360129;
                                                    shapeXMQ = TextFieldDefaults.f23471n.xMQ(composerKN, 6);
                                                } else {
                                                    shapeXMQ = shape;
                                                }
                                                int i39 = i31;
                                                if ((262144 & i7) != 0) {
                                                    composer2 = composerKN;
                                                    keyboardActions4 = keyboardActions3;
                                                    modifier4 = modifier5;
                                                    textFieldColorsHI = TextFieldDefaults.f23471n.HI(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 48, 2097151);
                                                    i29 = i39 & (-234881025);
                                                    z13 = z17;
                                                    z14 = z18;
                                                    textStyle2 = textStyle4;
                                                    i32 = i37;
                                                    function25 = function214;
                                                    function211 = function215;
                                                    function212 = function216;
                                                    function213 = function217;
                                                    z15 = z19;
                                                    visualTransformation3 = visualTransformationT;
                                                    keyboardOptions3 = keyboardOptionsN;
                                                    z16 = z20;
                                                    i33 = i38;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shapeXMQ;
                                                } else {
                                                    composer2 = composerKN;
                                                    textFieldColorsHI = textFieldColors;
                                                    keyboardActions4 = keyboardActions3;
                                                    modifier4 = modifier5;
                                                    z13 = z17;
                                                    z14 = z18;
                                                    textStyle2 = textStyle4;
                                                    i32 = i37;
                                                    function25 = function214;
                                                    function211 = function215;
                                                    function212 = function216;
                                                    function213 = function217;
                                                    z15 = z19;
                                                    visualTransformation3 = visualTransformationT;
                                                    keyboardOptions3 = keyboardOptionsN;
                                                    z16 = z20;
                                                    i33 = i38;
                                                    mutableInteractionSource4 = mutableInteractionSource3;
                                                    shape3 = shapeXMQ;
                                                    i29 = i39;
                                                }
                                            } else {
                                                composerKN.wTp();
                                                if ((i7 & 32) != 0) {
                                                    i8 &= -458753;
                                                }
                                                if ((i7 & 8192) != 0) {
                                                    i29 &= -7169;
                                                }
                                                if ((i7 & 131072) != 0) {
                                                    i29 &= -29360129;
                                                }
                                                if ((262144 & i7) != 0) {
                                                    i29 &= -234881025;
                                                }
                                                function212 = function23;
                                                visualTransformation3 = visualTransformation;
                                                keyboardOptions3 = keyboardOptions;
                                                keyboardActions4 = keyboardActions;
                                                z16 = z5;
                                                i33 = i2;
                                                mutableInteractionSource4 = mutableInteractionSource;
                                                shape3 = shape;
                                                textFieldColorsHI = textFieldColors;
                                                composer2 = composerKN;
                                                z14 = z7;
                                                i32 = i8;
                                                function211 = function26;
                                                modifier4 = modifier2;
                                                function213 = function24;
                                                z15 = z4;
                                                z13 = z6;
                                            }
                                            composer2.S();
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1576622884, i32, i29, "androidx.compose.material.TextField (TextField.kt:612)");
                                            }
                                            int i40 = i32 & 2147483646;
                                            int i41 = (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29);
                                            int i42 = i29 << 3;
                                            rl(textFieldValue, function1, modifier4, z13, z14, textStyle2, function25, function211, function212, function213, z15, visualTransformation3, keyboardOptions3, keyboardActions4, z16, i33, 1, mutableInteractionSource4, shape3, textFieldColorsHI, composer2, i40, i41 | (29360128 & i42) | (234881024 & i42) | (i42 & 1879048192), 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            modifier3 = modifier4;
                                            z11 = z13;
                                            z12 = z14;
                                            textStyle3 = textStyle2;
                                            function27 = function25;
                                            function28 = function211;
                                            function29 = function212;
                                            function210 = function213;
                                            z9 = z15;
                                            visualTransformation2 = visualTransformation3;
                                            keyboardOptions2 = keyboardOptions3;
                                            keyboardActions2 = keyboardActions4;
                                            z10 = z16;
                                            i30 = i33;
                                            mutableInteractionSource2 = mutableInteractionSource4;
                                            shape2 = shape3;
                                            textFieldColors2 = textFieldColorsHI;
                                        } else {
                                            composer2 = composerKN;
                                            composer2.wTp();
                                            z9 = z4;
                                            visualTransformation2 = visualTransformation;
                                            z10 = z5;
                                            i30 = i2;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            shape2 = shape;
                                            textFieldColors2 = textFieldColors;
                                            z11 = z6;
                                            z12 = z7;
                                            textStyle3 = textStyle2;
                                            function27 = function25;
                                            function28 = function26;
                                            modifier3 = modifier2;
                                            function29 = function23;
                                            function210 = function24;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                        }
                                        scopeUpdateScopeGh = composer2.gh();
                                        if (scopeUpdateScopeGh != null) {
                                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$10
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
                                                    TextFieldKt.t(textFieldValue, function1, modifier3, z11, z12, textStyle3, function27, function28, function29, function210, z9, visualTransformation2, keyboardOptions2, keyboardActions2, z10, i30, mutableInteractionSource2, shape2, textFieldColors2, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i26 = i36 | 24576;
                                    i27 = i7 & 32768;
                                    if (i27 != 0) {
                                    }
                                    i28 = i7 & 65536;
                                    if (i28 != 0) {
                                    }
                                    if ((i5 & 12582912) == 0) {
                                    }
                                    if ((i5 & 100663296) == 0) {
                                    }
                                    i29 = i26;
                                    if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh != null) {
                                    }
                                }
                                if ((i5 & 3072) == 0) {
                                }
                                int i362 = i24;
                                i25 = i7 & 16384;
                                if (i25 != 0) {
                                }
                                i27 = i7 & 32768;
                                if (i27 != 0) {
                                }
                                i28 = i7 & 65536;
                                if (i28 != 0) {
                                }
                                if ((i5 & 12582912) == 0) {
                                }
                                if ((i5 & 100663296) == 0) {
                                }
                                i29 = i26;
                                if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                }
                            }
                            i17 = i16;
                            i18 = i7 & 1024;
                            if (i18 != 0) {
                            }
                            i21 = i7 & 2048;
                            if (i21 != 0) {
                            }
                            int i352 = i20;
                            i23 = i7 & 4096;
                            if (i23 != 0) {
                            }
                            if ((i5 & 3072) == 0) {
                            }
                            int i3622 = i24;
                            i25 = i7 & 16384;
                            if (i25 != 0) {
                            }
                            i27 = i7 & 32768;
                            if (i27 != 0) {
                            }
                            i28 = i7 & 65536;
                            if (i28 != 0) {
                            }
                            if ((i5 & 12582912) == 0) {
                            }
                            if ((i5 & 100663296) == 0) {
                            }
                            i29 = i26;
                            if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i7 & 512;
                        if (i16 == 0) {
                        }
                        i17 = i16;
                        i18 = i7 & 1024;
                        if (i18 != 0) {
                        }
                        i21 = i7 & 2048;
                        if (i21 != 0) {
                        }
                        int i3522 = i20;
                        i23 = i7 & 4096;
                        if (i23 != 0) {
                        }
                        if ((i5 & 3072) == 0) {
                        }
                        int i36222 = i24;
                        i25 = i7 & 16384;
                        if (i25 != 0) {
                        }
                        i27 = i7 & 32768;
                        if (i27 != 0) {
                        }
                        i28 = i7 & 65536;
                        if (i28 != 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if ((i5 & 100663296) == 0) {
                        }
                        i29 = i26;
                        if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    z7 = z3;
                    if ((i3 & 196608) == 0) {
                    }
                    i12 = i7 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i7 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 256;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i7 & 512;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    i18 = i7 & 1024;
                    if (i18 != 0) {
                    }
                    i21 = i7 & 2048;
                    if (i21 != 0) {
                    }
                    int i35222 = i20;
                    i23 = i7 & 4096;
                    if (i23 != 0) {
                    }
                    if ((i5 & 3072) == 0) {
                    }
                    int i362222 = i24;
                    i25 = i7 & 16384;
                    if (i25 != 0) {
                    }
                    i27 = i7 & 32768;
                    if (i27 != 0) {
                    }
                    i28 = i7 & 65536;
                    if (i28 != 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if ((i5 & 100663296) == 0) {
                    }
                    i29 = i26;
                    if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z6 = z2;
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                z7 = z3;
                if ((i3 & 196608) == 0) {
                }
                i12 = i7 & 64;
                if (i12 != 0) {
                }
                i13 = i7 & 128;
                if (i13 != 0) {
                }
                i14 = i7 & 256;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i7 & 512;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i7 & 1024;
                if (i18 != 0) {
                }
                i21 = i7 & 2048;
                if (i21 != 0) {
                }
                int i352222 = i20;
                i23 = i7 & 4096;
                if (i23 != 0) {
                }
                if ((i5 & 3072) == 0) {
                }
                int i3622222 = i24;
                i25 = i7 & 16384;
                if (i25 != 0) {
                }
                i27 = i7 & 32768;
                if (i27 != 0) {
                }
                i28 = i7 & 65536;
                if (i28 != 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if ((i5 & 100663296) == 0) {
                }
                i29 = i26;
                if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            modifier2 = modifier;
            i10 = i7 & 8;
            int i342 = 1024;
            if (i10 != 0) {
            }
            z6 = z2;
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            z7 = z3;
            if ((i3 & 196608) == 0) {
            }
            i12 = i7 & 64;
            if (i12 != 0) {
            }
            i13 = i7 & 128;
            if (i13 != 0) {
            }
            i14 = i7 & 256;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i7 & 512;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i7 & 1024;
            if (i18 != 0) {
            }
            i21 = i7 & 2048;
            if (i21 != 0) {
            }
            int i3522222 = i20;
            i23 = i7 & 4096;
            if (i23 != 0) {
            }
            if ((i5 & 3072) == 0) {
            }
            int i36222222 = i24;
            i25 = i7 & 16384;
            if (i25 != 0) {
            }
            i27 = i7 & 32768;
            if (i27 != 0) {
            }
            i28 = i7 & 65536;
            if (i28 != 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            i29 = i26;
            if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        modifier2 = modifier;
        i10 = i7 & 8;
        int i3422 = 1024;
        if (i10 != 0) {
        }
        z6 = z2;
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        z7 = z3;
        if ((i3 & 196608) == 0) {
        }
        i12 = i7 & 64;
        if (i12 != 0) {
        }
        i13 = i7 & 128;
        if (i13 != 0) {
        }
        i14 = i7 & 256;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i7 & 512;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i7 & 1024;
        if (i18 != 0) {
        }
        i21 = i7 & 2048;
        if (i21 != 0) {
        }
        int i35222222 = i20;
        i23 = i7 & 4096;
        if (i23 != 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        int i362222222 = i24;
        i25 = i7 & 16384;
        if (i25 != 0) {
        }
        i27 = i7 & 32768;
        if (i27 != 0) {
        }
        i28 = i7 & 65536;
        if (i28 != 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        i29 = i26;
        if (composerKN.HI(((i8 & 306783379) == 306783378 && (38347923 & i29) == 38347922) ? false : true, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final float HI() {
        return f23612n;
    }

    public static final float Ik() {
        return f23613t;
    }

    public static final void J2(final Modifier modifier, final Function2 function2, final Function2 function22, final Function3 function3, final Function2 function23, final Function2 function24, final boolean z2, final float f3, final PaddingValues paddingValues, Composer composer, final int i2) {
        int i3;
        int i5;
        Composer composerKN = composer.KN(-2112507061);
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
            i3 |= composerKN.E2(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function24) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.n(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.rl(f3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.p5(paddingValues) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if (composerKN.HI((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-2112507061, i3, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:652)");
            }
            boolean z3 = ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864);
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new TextFieldMeasurePolicy(z2, f3, paddingValues);
                composerKN.o(objIF);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objIF;
            LayoutDirection layoutDirection = (LayoutDirection) composerKN.ty(CompositionLocalsKt.az());
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier);
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
            Updater.O(composerN, textFieldMeasurePolicy, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            if (function23 != null) {
                composerKN.eF(79117075);
                Modifier modifierT = InteractiveComponentSizeKt.t(LayoutIdKt.rl(Modifier.INSTANCE, "Leading"));
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierT);
                Function0 function0N2 = companion.n();
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
                Updater.O(composerN2, measurePolicyUo, companion.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion.O());
                Function2 function2Rl2 = companion.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                function23.invoke(composerKN, Integer.valueOf((i3 >> 12) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(79362130);
                composerKN.Xw();
            }
            if (function24 != null) {
                composerKN.eF(79404817);
                Modifier modifierT2 = InteractiveComponentSizeKt.t(LayoutIdKt.rl(Modifier.INSTANCE, "Trailing"));
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierT2);
                Function0 function0N3 = companion.n();
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
                Updater.O(composerN3, measurePolicyUo2, companion.t());
                Updater.O(composerN3, compositionLocalMapIk3, companion.O());
                Function2 function2Rl3 = companion.rl();
                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                    composerN3.o(Integer.valueOf(iN3));
                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                }
                Updater.O(composerN3, modifierO3, companion.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                function24.invoke(composerKN, Integer.valueOf((i3 >> 15) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(79651794);
                composerKN.Xw();
            }
            float fUo = PaddingKt.Uo(paddingValues, layoutDirection);
            float fJ2 = PaddingKt.J2(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (function23 != null) {
                i5 = 0;
                fUo = Dp.KN(RangesKt.coerceAtLeast(Dp.KN(fUo - TextFieldImplKt.nr()), Dp.KN(0)));
            } else {
                i5 = 0;
            }
            float f4 = fUo;
            if (function24 != null) {
                fJ2 = Dp.KN(RangesKt.coerceAtLeast(Dp.KN(fJ2 - TextFieldImplKt.nr()), Dp.KN(i5)));
            }
            Modifier modifierAz = PaddingKt.az(companion2, f4, 0.0f, fJ2, 0.0f, 10, null);
            if (function3 != null) {
                composerKN.eF(80502775);
                function3.invoke(LayoutIdKt.rl(companion2, "Hint").Zmq(modifierAz), composerKN, Integer.valueOf((i3 >> 6) & 112));
                composerKN.Xw();
            } else {
                composerKN.eF(80590226);
                composerKN.Xw();
            }
            if (function22 != null) {
                composerKN.eF(80624729);
                Modifier modifierZmq = LayoutIdKt.rl(companion2, "Label").Zmq(modifierAz);
                MeasurePolicy measurePolicyUo3 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN4 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierZmq);
                Function0 function0N4 = companion.n();
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
                Updater.O(composerN4, measurePolicyUo3, companion.t());
                Updater.O(composerN4, compositionLocalMapIk4, companion.O());
                Function2 function2Rl4 = companion.rl();
                if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                    composerN4.o(Integer.valueOf(iN4));
                    composerN4.az(Integer.valueOf(iN4), function2Rl4);
                }
                Updater.O(composerN4, modifierO4, companion.nr());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f17448n;
                function22.invoke(composerKN, Integer.valueOf((i3 >> 6) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(80710258);
                composerKN.Xw();
            }
            Modifier modifierZmq2 = LayoutIdKt.rl(companion2, "TextField").Zmq(modifierAz);
            MeasurePolicy measurePolicyUo4 = BoxKt.Uo(Alignment.INSTANCE.HI(), true);
            int iN5 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk5 = composerKN.Ik();
            Modifier modifierO5 = ComposedModifierKt.O(composerKN, modifierZmq2);
            Function0 function0N5 = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N5);
            } else {
                composerKN.r();
            }
            Composer composerN5 = Updater.n(composerKN);
            Updater.O(composerN5, measurePolicyUo4, companion.t());
            Updater.O(composerN5, compositionLocalMapIk5, companion.O());
            Function2 function2Rl5 = companion.rl();
            if (composerN5.getInserting() || !Intrinsics.areEqual(composerN5.iF(), Integer.valueOf(iN5))) {
                composerN5.o(Integer.valueOf(iN5));
                composerN5.az(Integer.valueOf(iN5), function2Rl5);
            }
            Updater.O(composerN5, modifierO5, companion.nr());
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f17448n;
            function2.invoke(composerKN, Integer.valueOf((i3 >> 3) & 14));
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
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextFieldLayout$2
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
                    TextFieldKt.J2(modifier, function2, function22, function3, function23, function24, z2, f3, paddingValues, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final float ck() {
        return rl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z2, float f3, PaddingValues paddingValues) {
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f3);
        if (placeable3 != null) {
            Placeable.PlacementScope.az(placementScope, placeable3, 0, Alignment.INSTANCE.xMQ().n(placeable3.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.az(placementScope, placeable4, i2 - placeable4.getWidth(), Alignment.INSTANCE.xMQ().n(placeable4.getHeight(), i3), 0.0f, 4, null);
        }
        Placeable.PlacementScope.az(placementScope, placeable, TextFieldImplKt.KN(placeable3), z2 ? Alignment.INSTANCE.xMQ().n(placeable.getHeight(), i3) : iRoundToInt, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z2) {
                iRoundToInt = Alignment.INSTANCE.xMQ().n(placeable2.getHeight(), i3);
            }
            Placeable.PlacementScope.az(placementScope, placeable2, TextFieldImplKt.KN(placeable3), iRoundToInt, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int qie(int i2, boolean z2, int i3, int i5, int i7, int i8, long j2, float f3, PaddingValues paddingValues) {
        float f4 = f23613t * f3;
        float top = paddingValues.getTop() * f3;
        float bottom = paddingValues.getBottom() * f3;
        int iMax = Math.max(i2, i8);
        return ConstraintsKt.J2(j2, Math.max(MathKt.roundToInt(z2 ? i3 + f4 + iMax + bottom : top + iMax + bottom), Math.max(i5, i7)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z2, int i5, int i7, float f3, float f4) {
        if (placeable4 != null) {
            Placeable.PlacementScope.az(placementScope, placeable4, 0, Alignment.INSTANCE.xMQ().n(placeable4.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.az(placementScope, placeable5, i2 - placeable5.getWidth(), Alignment.INSTANCE.xMQ().n(placeable5.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.az(placementScope, placeable2, TextFieldImplKt.KN(placeable4), (z2 ? Alignment.INSTANCE.xMQ().n(placeable2.getHeight(), i3) : MathKt.roundToInt(TextFieldImplKt.J2() * f4)) - MathKt.roundToInt((r0 - i5) * f3), 0.0f, 4, null);
        }
        Placeable.PlacementScope.az(placementScope, placeable, TextFieldImplKt.KN(placeable4), i7, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.az(placementScope, placeable3, TextFieldImplKt.KN(placeable4), i7, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int az(int i2, int i3, int i5, int i7, int i8, long j2) {
        return ConstraintsKt.Uo(j2, i2 + Math.max(i5, Math.max(i7, i8)) + i3);
    }

    public static final Modifier ty(Modifier modifier, final BorderStroke borderStroke) {
        final float width = borderStroke.getWidth();
        return DrawModifierKt.nr(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                n(contentDrawScope);
                return Unit.INSTANCE;
            }

            public final void n(ContentDrawScope contentDrawScope) {
                contentDrawScope.l2();
                if (Dp.mUb(width, Dp.INSTANCE.n())) {
                    return;
                }
                float density = width * contentDrawScope.getDensity();
                float fXMQ = Size.xMQ(contentDrawScope.t()) - (density / 2);
                DrawScope.c32(contentDrawScope, borderStroke.getBrush(), OffsetKt.n(0.0f, fXMQ), OffsetKt.n(Size.gh(contentDrawScope.t()), fXMQ), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }
}
