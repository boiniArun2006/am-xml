package androidx.compose.material;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
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
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0087\u0002\u0010#\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0095\u0002\u00101\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n0'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b1\u00102\u001a\u0089\u0002\u00103\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n0'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b3\u00104\u001a\u0095\u0002\u00106\u001a\u00020\n2\u0006\u0010&\u001a\u0002052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\n0'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b6\u00107\u001a\u0089\u0002\u00108\u001a\u00020\n2\u0006\u0010&\u001a\u0002052\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\n0'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b8\u00109\u001aÃ\u0001\u0010D\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010:\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b2\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010'¢\u0006\u0002\b\u000b2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0013\u0010;\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0013\u0010<\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\b\u000b2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\n0'2\u0011\u0010A\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bD\u0010E\u001a\u001b\u0010G\u001a\u00020.*\u00020.2\u0006\u0010F\u001a\u00020.H\u0002¢\u0006\u0004\bG\u0010H\u001aZ\u0010Q\u001a\u00020.2\u0006\u0010I\u001a\u00020.2\u0006\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020.2\u0006\u0010M\u001a\u00020.2\u0006\u0010>\u001a\u00020=2\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020=2\u0006\u0010C\u001a\u00020BH\u0002ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001aZ\u0010X\u001a\u00020.2\u0006\u0010S\u001a\u00020.2\u0006\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020.2\u0006\u0010V\u001a\u00020.2\u0006\u0010W\u001a\u00020.2\u0006\u0010>\u001a\u00020=2\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020=2\u0006\u0010C\u001a\u00020BH\u0002ø\u0001\u0000¢\u0006\u0004\bX\u0010R\u001a\u0083\u0001\u0010e\u001a\u00020\n*\u00020Y2\u0006\u0010Z\u001a\u00020.2\u0006\u0010[\u001a\u00020.2\b\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010^\u001a\u0004\u0018\u00010\\2\u0006\u0010_\u001a\u00020\\2\b\u0010`\u001a\u0004\u0018\u00010\\2\b\u0010a\u001a\u0004\u0018\u00010\\2\u0006\u0010b\u001a\u00020\\2\u0006\u0010>\u001a\u00020=2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010P\u001a\u00020=2\u0006\u0010d\u001a\u00020c2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\be\u0010f\u001a&\u0010h\u001a\u00020\u0002*\u00020\u00022\u0006\u0010g\u001a\u00020?2\u0006\u0010C\u001a\u00020BH\u0000ø\u0001\u0000¢\u0006\u0004\bh\u0010i\"\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010k\"\u001a\u0010q\u001a\u00020m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u0010n\u001a\u0004\bo\u0010p\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006r"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "isError", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "outputTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "lineLimits", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", c.f62177j, "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "", "value", "Lkotlin/Function1;", "onValueChange", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "nr", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "O", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "rl", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "t", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", "border", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "J2", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "from", "Ik", "(II)I", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "density", "az", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "qie", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "ck", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZFLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;)V", "labelSize", "HI", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/TextUnit;", "J", "ty", "()J", "OutlinedTextFieldTopPadding", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1213:1\n75#2:1214\n75#2:1223\n75#2:1225\n75#2:1234\n75#2:1235\n75#2:1242\n75#2:1251\n75#2:1252\n75#2:1265\n1247#3,6:1215\n1247#3,6:1226\n1247#3,6:1236\n1247#3,6:1243\n1247#3,6:1253\n1247#3,6:1259\n708#4:1221\n696#4:1222\n708#4:1232\n696#4:1233\n708#4:1249\n696#4:1250\n1#5:1224\n79#6,6:1266\n86#6,4:1281\n90#6,2:1291\n79#6,6:1300\n86#6,4:1315\n90#6,2:1325\n94#6:1331\n79#6,6:1339\n86#6,4:1354\n90#6,2:1364\n94#6:1370\n79#6,6:1385\n86#6,4:1400\n90#6,2:1410\n94#6:1416\n79#6,6:1425\n86#6,4:1440\n90#6,2:1450\n94#6:1456\n94#6:1460\n368#7,9:1272\n377#7:1293\n368#7,9:1306\n377#7:1327\n378#7,2:1329\n368#7,9:1345\n377#7:1366\n378#7,2:1368\n368#7,9:1391\n377#7:1412\n378#7,2:1414\n368#7,9:1431\n377#7:1452\n378#7,2:1454\n378#7,2:1458\n4034#8,6:1285\n4034#8,6:1319\n4034#8,6:1358\n4034#8,6:1404\n4034#8,6:1444\n71#9:1294\n69#9,5:1295\n74#9:1328\n78#9:1332\n71#9:1333\n69#9,5:1334\n74#9:1367\n78#9:1371\n71#9:1378\n68#9,6:1379\n74#9:1413\n78#9:1417\n71#9:1418\n68#9,6:1419\n74#9:1453\n78#9:1457\n57#10:1372\n57#10:1375\n51#10:1461\n149#11:1373\n206#11:1374\n149#11:1376\n206#11:1377\n149#11:1462\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n*L\n163#1:1214\n185#1:1223\n325#1:1225\n347#1:1234\n423#1:1235\n533#1:1242\n555#1:1251\n631#1:1252\n698#1:1265\n180#1:1215,6\n342#1:1226,6\n434#1:1236,6\n550#1:1243,6\n642#1:1253,6\n690#1:1259,6\n182#1:1221\n182#1:1222\n344#1:1232\n344#1:1233\n552#1:1249\n552#1:1250\n699#1:1266,6\n699#1:1281,4\n699#1:1291,2\n710#1:1300,6\n710#1:1315,4\n710#1:1325,2\n710#1:1331\n718#1:1339,6\n718#1:1354,4\n718#1:1364,2\n718#1:1370\n747#1:1385,6\n747#1:1400,4\n747#1:1410,2\n747#1:1416\n755#1:1425,6\n755#1:1440,4\n755#1:1450,2\n755#1:1456\n699#1:1460\n699#1:1272,9\n699#1:1293\n710#1:1306,9\n710#1:1327\n710#1:1329,2\n718#1:1345,9\n718#1:1366\n718#1:1368,2\n747#1:1391,9\n747#1:1412\n747#1:1414,2\n755#1:1431,9\n755#1:1452\n755#1:1454,2\n699#1:1458,2\n699#1:1285,6\n710#1:1319,6\n718#1:1358,6\n747#1:1404,6\n755#1:1444,6\n710#1:1294\n710#1:1295,5\n710#1:1328\n710#1:1332\n718#1:1333\n718#1:1334,5\n718#1:1367\n718#1:1371\n747#1:1378\n747#1:1379,6\n747#1:1413\n747#1:1417\n755#1:1418\n755#1:1419,6\n755#1:1453\n755#1:1457\n732#1:1372\n738#1:1375\n1042#1:1461\n732#1:1373\n732#1:1374\n738#1:1376\n738#1:1377\n1202#1:1462\n*E\n"})
public final class OutlinedTextFieldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f22362n = Dp.KN(4);
    private static final long rl = TextUnitKt.KN(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Ik(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }

    public static final void J2(final Modifier modifier, final Function2 function2, final Function3 function3, Function2 function22, final Function2 function23, final Function2 function24, final boolean z2, final float f3, final Function1 function1, final Function2 function25, final PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        final Function2 function26;
        int i8;
        Composer composerKN = composer.KN(-2049536174);
        if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(function22) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= composerKN.E2(function24) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= composerKN.n(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= composerKN.rl(f3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= composerKN.E2(function1) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= composerKN.E2(function25) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.p5(paddingValues) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if (composerKN.HI(((i5 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true, i5 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-2049536174, i5, i7, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:687)");
            }
            boolean z3 = ((234881024 & i5) == 67108864) | ((3670016 & i5) == 1048576) | ((29360128 & i5) == 8388608) | ((i7 & 14) == 4);
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new OutlinedTextFieldMeasurePolicy(function1, z2, f3, paddingValues);
                composerKN.o(objIF);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objIF;
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
            Updater.O(composerN, outlinedTextFieldMeasurePolicy, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            function25.invoke(composerKN, Integer.valueOf((i5 >> 27) & 14));
            if (function23 != null) {
                composerKN.eF(-978132235);
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
                function23.invoke(composerKN, Integer.valueOf((i5 >> 12) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(-977887180);
                composerKN.Xw();
            }
            if (function24 != null) {
                composerKN.eF(-977844493);
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
                function24.invoke(composerKN, Integer.valueOf((i5 >> 15) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(-977597516);
                composerKN.Xw();
            }
            float fUo = PaddingKt.Uo(paddingValues, layoutDirection);
            float fJ2 = PaddingKt.J2(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (function23 != null) {
                i8 = 0;
                fUo = Dp.KN(RangesKt.coerceAtLeast(Dp.KN(fUo - TextFieldImplKt.nr()), Dp.KN(0)));
            } else {
                i8 = 0;
            }
            float f4 = fUo;
            if (function24 != null) {
                fJ2 = Dp.KN(RangesKt.coerceAtLeast(Dp.KN(fJ2 - TextFieldImplKt.nr()), Dp.KN(i8)));
            }
            Modifier modifierAz = PaddingKt.az(companion2, f4, 0.0f, fJ2, 0.0f, 10, null);
            if (function3 != null) {
                composerKN.eF(-976746535);
                function3.invoke(LayoutIdKt.rl(companion2, "Hint").Zmq(modifierAz), composerKN, Integer.valueOf((i5 >> 3) & 112));
                composerKN.Xw();
            } else {
                composerKN.eF(-976659084);
                composerKN.Xw();
            }
            Modifier modifierZmq = LayoutIdKt.rl(companion2, "TextField").Zmq(modifierAz);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion3.HI(), true);
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
            function2.invoke(composerKN, Integer.valueOf((i5 >> 3) & 14));
            composerKN.XQ();
            if (function22 != null) {
                composerKN.eF(-976429250);
                Modifier modifierRl = LayoutIdKt.rl(companion2, "Label");
                MeasurePolicy measurePolicyUo4 = BoxKt.Uo(companion3.HI(), false);
                int iN5 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk5 = composerKN.Ik();
                Modifier modifierO5 = ComposedModifierKt.O(composerKN, modifierRl);
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
                function26 = function22;
                function26.invoke(composerKN, Integer.valueOf((i5 >> 9) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                function26 = function22;
                composerKN.eF(-976346604);
                composerKN.Xw();
            }
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            function26 = function22;
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
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
                    OutlinedTextFieldKt.J2(modifier, function2, function3, function26, function23, function24, z2, f3, function1, function25, paddingValues, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
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
        int i30;
        Composer composer2;
        final boolean z9;
        final VisualTransformation visualTransformation2;
        final boolean z10;
        final int i31;
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
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeKN;
        TextFieldColors textFieldColorsQie;
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
        KeyboardActions keyboardActions3;
        boolean z16;
        int i33;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        int i34;
        Composer composerKN = composer.KN(-2099955827);
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
                                    int i36 = i35;
                                    if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i36 |= composerKN.p5(keyboardOptions) ? 256 : 128;
                                    }
                                    i24 = i36;
                                }
                                i25 = i7 & 8192;
                                if (i25 != 0) {
                                    i26 = i24 | 3072;
                                } else {
                                    int i37 = i24;
                                    if ((i5 & 3072) == 0) {
                                        i26 = i37 | (composerKN.p5(keyboardActions) ? 2048 : 1024);
                                    } else {
                                        i26 = i37;
                                    }
                                }
                                i27 = i7 & 16384;
                                if (i27 == 0) {
                                    i28 = i26;
                                    if ((i5 & 24576) == 0) {
                                        i28 |= composerKN.n(z5) ? 16384 : 8192;
                                    }
                                    i29 = i7 & 32768;
                                    if (i29 == 0) {
                                        i28 |= 196608;
                                    } else if ((i5 & 196608) == 0) {
                                        i28 |= composerKN.t(i2) ? 131072 : 65536;
                                    }
                                    i30 = i7 & 65536;
                                    if (i30 == 0) {
                                        i28 |= 1572864;
                                    } else if ((i5 & 1572864) == 0) {
                                        i28 |= composerKN.p5(mutableInteractionSource) ? 1048576 : 524288;
                                    }
                                    if ((i5 & 12582912) == 0) {
                                        i28 |= ((i7 & 131072) == 0 && composerKN.p5(shape)) ? 8388608 : 4194304;
                                    }
                                    if ((i5 & 100663296) == 0) {
                                        i28 |= ((i7 & 262144) == 0 && composerKN.p5(textFieldColors)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                    }
                                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 38347923) != 38347922, i8 & 1)) {
                                        composer2 = composerKN;
                                        composer2.wTp();
                                        z9 = z4;
                                        visualTransformation2 = visualTransformation;
                                        z10 = z5;
                                        i31 = i2;
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
                                    } else {
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
                                            int i38 = i8;
                                            Function2 function214 = i12 != 0 ? null : function25;
                                            Function2 function215 = i13 != 0 ? null : function26;
                                            Function2 function216 = i15 != 0 ? null : function23;
                                            Function2 function217 = i17 != 0 ? null : function24;
                                            boolean z19 = i19 != 0 ? false : z4;
                                            VisualTransformation visualTransformationT = i22 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                            KeyboardOptions keyboardOptionsN = i23 != 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                            KeyboardActions keyboardActionsN = i25 != 0 ? KeyboardActions.INSTANCE.n() : keyboardActions;
                                            boolean z20 = i27 != 0 ? false : z5;
                                            int i39 = i29 != 0 ? Integer.MAX_VALUE : i2;
                                            if (i30 != 0) {
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
                                                i28 &= -29360129;
                                                shapeKN = TextFieldDefaults.f23471n.KN(composerKN, 6);
                                            } else {
                                                shapeKN = shape;
                                            }
                                            int i40 = i28;
                                            if ((262144 & i7) != 0) {
                                                composer2 = composerKN;
                                                modifier4 = modifier5;
                                                z13 = z17;
                                                textFieldColorsQie = TextFieldDefaults.f23471n.qie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 48, 2097151);
                                                i34 = i40 & (-234881025);
                                                z14 = z18;
                                                textStyle2 = textStyle4;
                                                i32 = i38;
                                                function25 = function214;
                                                function211 = function215;
                                                function212 = function216;
                                                function213 = function217;
                                                z15 = z19;
                                                visualTransformation3 = visualTransformationT;
                                                keyboardOptions3 = keyboardOptionsN;
                                                keyboardActions3 = keyboardActionsN;
                                                z16 = z20;
                                                i33 = i39;
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                shape3 = shapeKN;
                                            } else {
                                                composer2 = composerKN;
                                                textFieldColorsQie = textFieldColors;
                                                modifier4 = modifier5;
                                                z13 = z17;
                                                z14 = z18;
                                                textStyle2 = textStyle4;
                                                i32 = i38;
                                                function25 = function214;
                                                function211 = function215;
                                                function212 = function216;
                                                function213 = function217;
                                                z15 = z19;
                                                visualTransformation3 = visualTransformationT;
                                                keyboardOptions3 = keyboardOptionsN;
                                                keyboardActions3 = keyboardActionsN;
                                                z16 = z20;
                                                i33 = i39;
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                                shape3 = shapeKN;
                                                i34 = i40;
                                            }
                                        } else {
                                            composerKN.wTp();
                                            if ((i7 & 32) != 0) {
                                                i8 &= -458753;
                                            }
                                            if ((i7 & 131072) != 0) {
                                                i28 &= -29360129;
                                            }
                                            if ((262144 & i7) != 0) {
                                                i28 &= -234881025;
                                            }
                                            function212 = function23;
                                            visualTransformation3 = visualTransformation;
                                            keyboardOptions3 = keyboardOptions;
                                            z16 = z5;
                                            i33 = i2;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColorsQie = textFieldColors;
                                            composer2 = composerKN;
                                            z14 = z7;
                                            i32 = i8;
                                            function211 = function26;
                                            modifier4 = modifier2;
                                            i34 = i28;
                                            function213 = function24;
                                            z15 = z4;
                                            keyboardActions3 = keyboardActions;
                                            z13 = z6;
                                        }
                                        composer2.S();
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-2099955827, i32, i34, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:436)");
                                        }
                                        int i41 = i32 & 2147483646;
                                        int i42 = (i34 & 14) | 1572864 | (i34 & 112) | (i34 & 896) | (i34 & 7168) | (57344 & i34) | (458752 & i34);
                                        int i43 = i34 << 3;
                                        nr(str, function1, modifier4, z13, z14, textStyle2, function25, function211, function212, function213, z15, visualTransformation3, keyboardOptions3, keyboardActions3, z16, i33, 1, mutableInteractionSource4, shape3, textFieldColorsQie, composer2, i41, i42 | (29360128 & i43) | (234881024 & i43) | (i43 & 1879048192), 0);
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
                                        keyboardActions2 = keyboardActions3;
                                        z10 = z16;
                                        i31 = i33;
                                        mutableInteractionSource2 = mutableInteractionSource4;
                                        shape2 = shape3;
                                        textFieldColors2 = textFieldColorsQie;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$10
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
                                                OutlinedTextFieldKt.O(str, function1, modifier3, z11, z12, textStyle3, function27, function28, function29, function210, z9, visualTransformation2, keyboardOptions2, keyboardActions2, z10, i31, mutableInteractionSource2, shape2, textFieldColors2, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i28 = i26 | 24576;
                                i29 = i7 & 32768;
                                if (i29 == 0) {
                                }
                                i30 = i7 & 65536;
                                if (i30 == 0) {
                                }
                                if ((i5 & 12582912) == 0) {
                                }
                                if ((i5 & 100663296) == 0) {
                                }
                                if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 38347923) != 38347922, i8 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
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
                            i25 = i7 & 8192;
                            if (i25 != 0) {
                            }
                            i27 = i7 & 16384;
                            if (i27 == 0) {
                            }
                            i29 = i7 & 32768;
                            if (i29 == 0) {
                            }
                            i30 = i7 & 65536;
                            if (i30 == 0) {
                            }
                            if ((i5 & 12582912) == 0) {
                            }
                            if ((i5 & 100663296) == 0) {
                            }
                            if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 38347923) != 38347922, i8 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
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
                        i25 = i7 & 8192;
                        if (i25 != 0) {
                        }
                        i27 = i7 & 16384;
                        if (i27 == 0) {
                        }
                        i29 = i7 & 32768;
                        if (i29 == 0) {
                        }
                        i30 = i7 & 65536;
                        if (i30 == 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if ((i5 & 100663296) == 0) {
                        }
                        if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 38347923) != 38347922, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
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
                    i25 = i7 & 8192;
                    if (i25 != 0) {
                    }
                    i27 = i7 & 16384;
                    if (i27 == 0) {
                    }
                    i29 = i7 & 32768;
                    if (i29 == 0) {
                    }
                    i30 = i7 & 65536;
                    if (i30 == 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if ((i5 & 100663296) == 0) {
                    }
                    if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 38347923) != 38347922, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
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
                i25 = i7 & 8192;
                if (i25 != 0) {
                }
                i27 = i7 & 16384;
                if (i27 == 0) {
                }
                i29 = i7 & 32768;
                if (i29 == 0) {
                }
                i30 = i7 & 65536;
                if (i30 == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if ((i5 & 100663296) == 0) {
                }
                if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 38347923) != 38347922, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i10 = i7 & 8;
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
            i25 = i7 & 8192;
            if (i25 != 0) {
            }
            i27 = i7 & 16384;
            if (i27 == 0) {
            }
            i29 = i7 & 32768;
            if (i29 == 0) {
            }
            i30 = i7 & 65536;
            if (i30 == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 38347923) != 38347922, i8 & 1)) {
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
        i25 = i7 & 8192;
        if (i25 != 0) {
        }
        i27 = i7 & 16384;
        if (i27 == 0) {
        }
        i29 = i7 & 32768;
        if (i29 == 0) {
        }
        i30 = i7 & 65536;
        if (i30 == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        if (composerKN.HI((i8 & 306783379) == 306783378 || (i28 & 38347923) != 38347922, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int az(int i2, int i3, int i5, int i7, int i8, float f3, long j2, float f4, PaddingValues paddingValues) {
        int iMax = i2 + Math.max(i5, Math.max(MathHelpersKt.t(i7, 0, f3), i8)) + i3;
        LayoutDirection layoutDirection = LayoutDirection.f34160n;
        return ConstraintsKt.Uo(j2, Math.max(iMax, MathKt.roundToInt((i7 + (Dp.KN(paddingValues.rl(layoutDirection) + paddingValues.t(layoutDirection)) * f4)) * f3)));
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
    /* JADX WARN: Removed duplicated region for block: B:206:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
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
        final TextStyle textStyle2;
        final OutputTransformation outputTransformation2;
        final KeyboardOptions keyboardOptions2;
        final ScrollState scrollState2;
        final Shape shape2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2 function28;
        final Function2 function29;
        final Modifier modifier3;
        final Function2 function210;
        final boolean z7;
        final Function2 function211;
        final boolean z9;
        final InputTransformation inputTransformation2;
        final KeyboardActionHandler keyboardActionHandler2;
        final TextFieldLineLimits textFieldLineLimits2;
        ScopeUpdateScope scopeUpdateScopeGh;
        boolean z10;
        TextStyle textStyle3;
        Function2 function212;
        Function2 function213;
        InputTransformation inputTransformation3;
        OutputTransformation outputTransformation3;
        KeyboardOptions keyboardOptionsN;
        KeyboardActionHandler keyboardActionHandler3;
        TextFieldLineLimits textFieldLineLimitsN;
        ScrollState scrollStateT;
        Shape shapeKN;
        Composer composer3;
        boolean z11;
        TextFieldColors textFieldColorsQie;
        int i27;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColors3;
        int i28;
        TextStyle textStyle4;
        int i29;
        boolean z12;
        MutableInteractionSource mutableInteractionSource4;
        TextStyle textStyle5;
        Modifier modifierAz;
        Composer composerKN = composer.KN(-1115632458);
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
                    if ((i2 & 24576) == 0) {
                        i7 |= ((i5 & 16) == 0 && composerKN.p5(textStyle)) ? 16384 : 8192;
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
                                        Modifier modifier4 = i30 != 0 ? Modifier.INSTANCE : modifier2;
                                        boolean z13 = i8 != 0 ? true : z5;
                                        z10 = i9 != 0 ? false : z3;
                                        if ((i5 & 16) != 0) {
                                            i7 &= -57345;
                                            textStyle3 = (TextStyle) composerKN.ty(TextKt.J2());
                                        } else {
                                            textStyle3 = textStyle;
                                        }
                                        int i34 = i7;
                                        Function2 function214 = i10 != 0 ? null : function25;
                                        Function2 function215 = i11 != 0 ? null : function26;
                                        function212 = i12 != 0 ? null : function27;
                                        function213 = i14 != 0 ? null : function24;
                                        boolean z14 = i16 != 0 ? false : z4;
                                        inputTransformation3 = i18 != 0 ? null : inputTransformation;
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
                                            shapeKN = TextFieldDefaults.f23471n.KN(composerKN, 6);
                                        } else {
                                            shapeKN = shape;
                                        }
                                        int i35 = i25;
                                        if ((i5 & 131072) != 0) {
                                            z11 = true;
                                            textFieldColorsQie = TextFieldDefaults.f23471n.qie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, 48, 2097151);
                                            composer3 = composerKN;
                                            i27 = i35 & (-29360129);
                                        } else {
                                            composer3 = composerKN;
                                            z11 = true;
                                            textFieldColorsQie = textFieldColors;
                                            i27 = i35;
                                        }
                                        if (i26 != 0) {
                                            modifier2 = modifier4;
                                            textFieldColors3 = textFieldColorsQie;
                                            i28 = i27;
                                            z5 = z13;
                                            textStyle4 = textStyle3;
                                            i29 = i34;
                                            function25 = function214;
                                            function26 = function215;
                                            z12 = z14;
                                            mutableInteractionSource3 = null;
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            modifier2 = modifier4;
                                            textFieldColors3 = textFieldColorsQie;
                                            i28 = i27;
                                            z5 = z13;
                                            textStyle4 = textStyle3;
                                            i29 = i34;
                                            function25 = function214;
                                            function26 = function215;
                                            z12 = z14;
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
                                        z11 = true;
                                        z10 = z3;
                                        textStyle4 = textStyle;
                                        function213 = function24;
                                        z12 = z4;
                                        inputTransformation3 = inputTransformation;
                                        outputTransformation3 = outputTransformation;
                                        keyboardOptionsN = keyboardOptions;
                                        keyboardActionHandler3 = keyboardActionHandler;
                                        textFieldLineLimitsN = textFieldLineLimits;
                                        scrollStateT = scrollState;
                                        shapeKN = shape;
                                        textFieldColors3 = textFieldColors;
                                        i29 = i7;
                                        function212 = function27;
                                        i28 = i25;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                    composer3.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1115632458, i29, i28, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:177)");
                                    }
                                    if (mutableInteractionSource3 == null) {
                                        composer3.eF(-588072746);
                                        Object objIF = composer3.iF();
                                        if (objIF == Composer.INSTANCE.n()) {
                                            objIF = InteractionSourceKt.n();
                                            composer3.o(objIF);
                                        }
                                        mutableInteractionSource4 = (MutableInteractionSource) objIF;
                                        composer3.Xw();
                                    } else {
                                        composer3.eF(673765921);
                                        composer3.Xw();
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    }
                                    composer3.eF(673771667);
                                    long jKN = textStyle4.KN();
                                    if (jKN == 16) {
                                        jKN = ((Color) textFieldColors3.t(z5, composer3, ((i29 >> 6) & 14) | ((i28 >> 18) & 112)).getValue()).getValue();
                                    }
                                    long j2 = jKN;
                                    composer3.Xw();
                                    TextStyle textStyleNHg = textStyle4.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                    Density density = (Density) composer3.ty(CompositionLocalsKt.J2());
                                    if (function25 != null) {
                                        textStyle5 = textStyle4;
                                        modifierAz = PaddingKt.az(SemanticsModifierKt.t(Modifier.INSTANCE, z11, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$1
                                            public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                n(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }
                                        }), 0.0f, density.Z(rl), 0.0f, 0.0f, 13, null);
                                    } else {
                                        textStyle5 = textStyle4;
                                        modifierAz = Modifier.INSTANCE;
                                    }
                                    Modifier modifierT = TextFieldImplKt.t(modifier2.Zmq(modifierAz), z12, Strings_androidKt.n(Strings.INSTANCE.t(), composer3, 6));
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f23471n;
                                    final boolean z15 = z12;
                                    final TextFieldColors textFieldColors4 = textFieldColors3;
                                    final Function2 function216 = function25;
                                    final Function2 function217 = function26;
                                    final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                    final boolean z16 = z5;
                                    final Function2 function218 = function212;
                                    final Function2 function219 = function213;
                                    final OutputTransformation outputTransformation4 = outputTransformation3;
                                    final TextFieldLineLimits textFieldLineLimits3 = textFieldLineLimitsN;
                                    final Shape shape3 = shapeKN;
                                    int i36 = i28 << 12;
                                    Composer composer4 = composer3;
                                    BasicTextFieldKt.n(textFieldState, SizeKt.n(modifierT, textFieldDefaults.Uo(), textFieldDefaults.J2()), z5, z10, inputTransformation3, textStyleNHg, keyboardOptionsN, keyboardActionHandler3, textFieldLineLimitsN, null, mutableInteractionSource4, new SolidColor(((Color) textFieldColors3.xMQ(z12, composer3, ((i29 >> 27) & 14) | ((i28 >> 18) & 112)).getValue()).getValue(), null), outputTransformation3, new TextFieldDecorator() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // androidx.compose.foundation.text.input.TextFieldDecorator
                                        public final void n(Function2 function220, Composer composer5, int i37) {
                                            TextFieldBuffer textFieldBuffer;
                                            String string;
                                            composer5.eF(640748446);
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(640748446, i37, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration (OutlinedTextField.kt:219)");
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
                                            TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f23471n;
                                            VisualTransformation visualTransformationT = VisualTransformation.INSTANCE.t();
                                            boolean zAreEqual = Intrinsics.areEqual(textFieldLineLimits3, TextFieldLineLimits.SingleLine.rl);
                                            final boolean z17 = z16;
                                            final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                            final boolean z18 = z15;
                                            Function2 function221 = function216;
                                            Function2 function222 = function217;
                                            Function2 function223 = function218;
                                            Function2 function224 = function219;
                                            final Shape shape4 = shape3;
                                            final TextFieldColors textFieldColors5 = textFieldColors4;
                                            textFieldDefaults2.t(string, function220, z17, zAreEqual, visualTransformationT, mutableInteractionSource6, z18, function221, function222, function223, function224, shape4, textFieldColors5, null, ComposableLambdaKt.nr(-1422288378, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$Decoration$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                    n(composer6, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer6, int i38) {
                                                    if (!composer6.HI((i38 & 3) != 2, i38 & 1)) {
                                                        composer6.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-1422288378, i38, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration.<anonymous> (OutlinedTextField.kt:247)");
                                                    }
                                                    TextFieldDefaults.f23471n.n(z17, z18, mutableInteractionSource6, textFieldColors5, shape4, 0.0f, 0.0f, composer6, 12582912, 96);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer5, 54), composer5, ((i37 << 3) & 112) | 24576, 221184, 8192);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            composer5.Xw();
                                        }
                                    }, scrollStateT, composer4, (i29 & 8078) | (57344 & i36) | (3670016 & i36) | (29360128 & i36) | (i36 & 234881024), ((i28 << 3) & 896) | ((i28 >> 3) & 57344), 512);
                                    composer2 = composer4;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    textFieldColors2 = textFieldColors4;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    function28 = function25;
                                    function29 = function26;
                                    modifier3 = modifier2;
                                    z7 = z5;
                                    textStyle2 = textStyle5;
                                    z6 = z10;
                                    function210 = function212;
                                    function211 = function213;
                                    z9 = z15;
                                    inputTransformation2 = inputTransformation3;
                                    outputTransformation2 = outputTransformation3;
                                    keyboardOptions2 = keyboardOptionsN;
                                    keyboardActionHandler2 = keyboardActionHandler3;
                                    textFieldLineLimits2 = textFieldLineLimitsN;
                                    scrollState2 = scrollStateT;
                                    shape2 = shapeKN;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    z6 = z3;
                                    textStyle2 = textStyle;
                                    outputTransformation2 = outputTransformation;
                                    keyboardOptions2 = keyboardOptions;
                                    scrollState2 = scrollState;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    function28 = function25;
                                    function29 = function26;
                                    modifier3 = modifier2;
                                    function210 = function27;
                                    z7 = z5;
                                    function211 = function24;
                                    z9 = z4;
                                    inputTransformation2 = inputTransformation;
                                    keyboardActionHandler2 = keyboardActionHandler;
                                    textFieldLineLimits2 = textFieldLineLimits;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$4
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
                                            OutlinedTextFieldKt.n(textFieldState, modifier3, z7, z6, textStyle2, function28, function29, function210, function211, z9, inputTransformation2, outputTransformation2, keyboardOptions2, keyboardActionHandler2, textFieldLineLimits2, scrollState2, shape2, textFieldColors2, mutableInteractionSource2, composer5, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
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
                if ((i2 & 24576) == 0) {
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
            if ((i2 & 24576) == 0) {
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
        if ((i2 & 24576) == 0) {
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
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:330:? A[RETURN, SYNTHETIC] */
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
        int i31;
        Composer composer2;
        final boolean z7;
        final boolean z9;
        final VisualTransformation visualTransformation2;
        final boolean z10;
        final int i32;
        final int i33;
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
        Modifier modifier4;
        TextStyle textStyle4;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        int i34;
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeKN;
        int i35;
        Composer composer3;
        TextFieldColors textFieldColorsQie;
        boolean z12;
        boolean z13;
        TextStyle textStyle5;
        int i36;
        boolean z14;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions3;
        boolean z15;
        int i37;
        int i38;
        int i39;
        boolean z16;
        MutableInteractionSource mutableInteractionSource4;
        final MutableInteractionSource mutableInteractionSource5;
        int i40;
        TextStyle textStyle6;
        Modifier modifierAz;
        Composer composerKN = composer.KN(-621914704);
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
                                int i41 = i21;
                                i24 = i8 & 4096;
                                if (i24 != 0) {
                                    i25 = i41 | RendererCapabilities.DECODER_SUPPORT_MASK;
                                } else {
                                    int i42 = i41;
                                    if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i42 |= composerKN.p5(keyboardOptions) ? 256 : 128;
                                    }
                                    i25 = i42;
                                }
                                i26 = i8 & 8192;
                                if (i26 != 0) {
                                    i27 = i25 | 3072;
                                } else {
                                    int i43 = i25;
                                    if ((i7 & 3072) == 0) {
                                        i27 = i43 | (composerKN.p5(keyboardActions) ? 2048 : 1024);
                                    } else {
                                        i27 = i43;
                                    }
                                }
                                i28 = i8 & 16384;
                                if (i28 == 0) {
                                    i29 = i27;
                                    if ((i7 & 24576) == 0) {
                                        i29 |= composerKN.n(z5) ? 16384 : 8192;
                                    }
                                    if ((i7 & 196608) == 0) {
                                        i29 |= ((i8 & 32768) == 0 && composerKN.t(i2)) ? 131072 : 65536;
                                    }
                                    i30 = i8 & 65536;
                                    if (i30 == 0) {
                                        i29 |= 1572864;
                                    } else if ((i7 & 1572864) == 0) {
                                        i29 |= composerKN.t(i3) ? 1048576 : 524288;
                                    }
                                    i31 = i8 & 131072;
                                    if (i31 == 0) {
                                        i29 |= 12582912;
                                    } else if ((i7 & 12582912) == 0) {
                                        i29 |= composerKN.p5(mutableInteractionSource) ? 8388608 : 4194304;
                                    }
                                    if ((i7 & 100663296) == 0) {
                                        i29 |= ((i8 & 262144) == 0 && composerKN.p5(shape)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                    }
                                    if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                        i29 |= ((i8 & 524288) == 0 && composerKN.p5(textFieldColors)) ? 536870912 : 268435456;
                                    }
                                    if (composerKN.HI((i9 & 306783379) == 306783378 || (i29 & 306783379) != 306783378, i9 & 1)) {
                                        composer2 = composerKN;
                                        composer2.wTp();
                                        z7 = z2;
                                        z9 = z4;
                                        visualTransformation2 = visualTransformation;
                                        z10 = z5;
                                        i32 = i2;
                                        i33 = i3;
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
                                    } else {
                                        composerKN.e();
                                        if ((i5 & 1) == 0 || composerKN.rV9()) {
                                            modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                            boolean z17 = i11 != 0 ? true : z2;
                                            boolean z18 = i12 != 0 ? false : z6;
                                            if ((i8 & 32) != 0) {
                                                i9 &= -458753;
                                                textStyle4 = (TextStyle) composerKN.ty(TextKt.J2());
                                            } else {
                                                textStyle4 = textStyle2;
                                            }
                                            int i44 = i9;
                                            function211 = i13 != 0 ? null : function25;
                                            function212 = i14 != 0 ? null : function26;
                                            function213 = i16 != 0 ? null : function23;
                                            function214 = i18 != 0 ? null : function24;
                                            boolean z19 = i20 != 0 ? false : z4;
                                            VisualTransformation visualTransformationT = i23 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                            KeyboardOptions keyboardOptionsN = i24 != 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                            KeyboardActions keyboardActionsN = i26 != 0 ? KeyboardActions.INSTANCE.n() : keyboardActions;
                                            boolean z20 = i28 != 0 ? false : z5;
                                            if ((32768 & i8) != 0) {
                                                i29 &= -458753;
                                                i34 = z20 ? 1 : Integer.MAX_VALUE;
                                            } else {
                                                i34 = i2;
                                            }
                                            int i45 = i30 != 0 ? 1 : i3;
                                            mutableInteractionSource3 = i31 != 0 ? null : mutableInteractionSource;
                                            if ((262144 & i8) != 0) {
                                                shapeKN = TextFieldDefaults.f23471n.KN(composerKN, 6);
                                                i35 = i29 & (-234881025);
                                            } else {
                                                shapeKN = shape;
                                                i35 = i29;
                                            }
                                            if ((i8 & 524288) != 0) {
                                                composer3 = composerKN;
                                                textFieldColorsQie = TextFieldDefaults.f23471n.qie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, 48, 2097151);
                                                i39 = i35 & (-1879048193);
                                                z12 = z17;
                                                z13 = z18;
                                                textStyle5 = textStyle4;
                                                i36 = i44;
                                                z14 = z19;
                                                visualTransformation3 = visualTransformationT;
                                                keyboardOptions3 = keyboardOptionsN;
                                                keyboardActions3 = keyboardActionsN;
                                                z15 = z20;
                                                i37 = i34;
                                                i38 = i45;
                                            } else {
                                                composer3 = composerKN;
                                                textFieldColorsQie = textFieldColors;
                                                z12 = z17;
                                                z13 = z18;
                                                textStyle5 = textStyle4;
                                                i36 = i44;
                                                z14 = z19;
                                                visualTransformation3 = visualTransformationT;
                                                keyboardOptions3 = keyboardOptionsN;
                                                keyboardActions3 = keyboardActionsN;
                                                z15 = z20;
                                                i37 = i34;
                                                i38 = i45;
                                                i39 = i35;
                                            }
                                        } else {
                                            composerKN.wTp();
                                            if ((i8 & 32) != 0) {
                                                i9 &= -458753;
                                            }
                                            if ((32768 & i8) != 0) {
                                                i29 &= -458753;
                                            }
                                            if ((262144 & i8) != 0) {
                                                i29 &= -234881025;
                                            }
                                            if ((i8 & 524288) != 0) {
                                                i29 &= -1879048193;
                                            }
                                            function213 = function23;
                                            function214 = function24;
                                            visualTransformation3 = visualTransformation;
                                            keyboardActions3 = keyboardActions;
                                            z15 = z5;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            shapeKN = shape;
                                            composer3 = composerKN;
                                            z13 = z6;
                                            i36 = i9;
                                            textStyle5 = textStyle2;
                                            function211 = function25;
                                            function212 = function26;
                                            modifier4 = modifier2;
                                            i39 = i29;
                                            z12 = z2;
                                            z14 = z4;
                                            keyboardOptions3 = keyboardOptions;
                                            i37 = i2;
                                            i38 = i3;
                                            textFieldColorsQie = textFieldColors;
                                        }
                                        composer3.S();
                                        if (ComposerKt.v()) {
                                            z16 = z13;
                                            ComposerKt.p5(-621914704, i36, i39, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:339)");
                                        } else {
                                            z16 = z13;
                                        }
                                        if (mutableInteractionSource3 == null) {
                                            composer3.eF(-579356042);
                                            Object objIF = composer3.iF();
                                            if (objIF == Composer.INSTANCE.n()) {
                                                objIF = InteractionSourceKt.n();
                                                composer3.o(objIF);
                                            }
                                            mutableInteractionSource4 = (MutableInteractionSource) objIF;
                                            composer3.Xw();
                                        } else {
                                            composer3.eF(674047105);
                                            composer3.Xw();
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                        }
                                        composer3.eF(674052851);
                                        long jKN = textStyle5.KN();
                                        if (jKN == 16) {
                                            jKN = ((Color) textFieldColorsQie.t(z12, composer3, ((i36 >> 9) & 14) | ((i39 >> 24) & 112)).getValue()).getValue();
                                        }
                                        long j2 = jKN;
                                        composer3.Xw();
                                        TextStyle textStyleNHg = textStyle5.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                        int i46 = i36;
                                        Density density = (Density) composer3.ty(CompositionLocalsKt.J2());
                                        if (function211 != null) {
                                            mutableInteractionSource5 = mutableInteractionSource4;
                                            i40 = i39;
                                            textStyle6 = textStyle5;
                                            modifierAz = PaddingKt.az(SemanticsModifierKt.t(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$5
                                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    n(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), 0.0f, density.Z(rl), 0.0f, 0.0f, 13, null);
                                        } else {
                                            mutableInteractionSource5 = mutableInteractionSource4;
                                            i40 = i39;
                                            textStyle6 = textStyle5;
                                            modifierAz = Modifier.INSTANCE;
                                        }
                                        Modifier modifierT = TextFieldImplKt.t(modifier4.Zmq(modifierAz), z14, Strings_androidKt.n(Strings.INSTANCE.t(), composer3, 6));
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f23471n;
                                        Modifier modifier5 = modifier4;
                                        final boolean z21 = z14;
                                        final boolean z22 = z12;
                                        final TextFieldColors textFieldColors3 = textFieldColorsQie;
                                        final boolean z23 = z15;
                                        final VisualTransformation visualTransformation4 = visualTransformation3;
                                        final Function2 function215 = function211;
                                        final Function2 function216 = function212;
                                        final Function2 function217 = function213;
                                        final Function2 function218 = function214;
                                        final Shape shape3 = shapeKN;
                                        int i47 = i40 << 12;
                                        TextStyle textStyle7 = textStyle6;
                                        Composer composer4 = composer3;
                                        boolean z24 = z16;
                                        BasicTextFieldKt.O(str, function1, SizeKt.n(modifierT, textFieldDefaults.Uo(), textFieldDefaults.J2()), z12, z24, textStyleNHg, keyboardOptions3, keyboardActions3, z15, i37, i38, visualTransformation3, null, mutableInteractionSource5, new SolidColor(((Color) textFieldColorsQie.xMQ(z14, composer3, (i40 & 14) | ((i40 >> 24) & 112)).getValue()).getValue(), null), ComposableLambdaKt.nr(1710364390, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$7
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer5, Integer num) {
                                                n(function219, composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                             */
                                            public final void n(Function2 function219, Composer composer5, int i48) {
                                                int i49;
                                                if ((i48 & 6) == 0) {
                                                    i49 = i48 | (composer5.E2(function219) ? 4 : 2);
                                                } else {
                                                    i49 = i48;
                                                }
                                                if (!composer5.HI((i49 & 19) != 18, i49 & 1)) {
                                                    composer5.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1710364390, i49, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:383)");
                                                }
                                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f23471n;
                                                int i50 = i49;
                                                String str2 = str;
                                                final boolean z25 = z22;
                                                boolean z26 = z23;
                                                VisualTransformation visualTransformation5 = visualTransformation4;
                                                final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                                final boolean z27 = z21;
                                                Function2 function220 = function215;
                                                Function2 function221 = function216;
                                                Function2 function222 = function217;
                                                Function2 function223 = function218;
                                                final Shape shape4 = shape3;
                                                final TextFieldColors textFieldColors4 = textFieldColors3;
                                                textFieldDefaults2.t(str2, function219, z25, z26, visualTransformation5, mutableInteractionSource6, z27, function220, function221, function222, function223, shape4, textFieldColors4, null, ComposableLambdaKt.nr(1757478222, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$7.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                        n(composer6, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer6, int i51) {
                                                        if (!composer6.HI((i51 & 3) != 2, i51 & 1)) {
                                                            composer6.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(1757478222, i51, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:398)");
                                                        }
                                                        TextFieldDefaults.f23471n.n(z25, z27, mutableInteractionSource6, textFieldColors4, shape4, 0.0f, 0.0f, composer6, 12582912, 96);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer5, 54), composer5, (i50 << 3) & 112, 221184, 8192);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54), composer4, (i46 & 64638) | (3670016 & i47) | (29360128 & i47) | (234881024 & i47) | (i47 & 1879048192), ((i40 >> 18) & 14) | 196608 | (i40 & 112), 4096);
                                        composer2 = composer4;
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        VisualTransformation visualTransformation5 = visualTransformation3;
                                        z10 = z15;
                                        visualTransformation2 = visualTransformation5;
                                        textFieldColors2 = textFieldColors3;
                                        z7 = z12;
                                        z11 = z24;
                                        i32 = i37;
                                        i33 = i38;
                                        modifier3 = modifier5;
                                        textStyle3 = textStyle7;
                                        function27 = function211;
                                        function28 = function212;
                                        function29 = function213;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        shape2 = shapeKN;
                                        keyboardOptions2 = keyboardOptions3;
                                        keyboardActions2 = keyboardActions3;
                                        function210 = function214;
                                        z9 = z21;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                n(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer5, int i48) {
                                                OutlinedTextFieldKt.nr(str, function1, modifier3, z7, z11, textStyle3, function27, function28, function29, function210, z9, visualTransformation2, keyboardOptions2, keyboardActions2, z10, i32, i33, mutableInteractionSource2, shape2, textFieldColors2, composer5, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i29 = i27 | 24576;
                                if ((i7 & 196608) == 0) {
                                }
                                i30 = i8 & 65536;
                                if (i30 == 0) {
                                }
                                i31 = i8 & 131072;
                                if (i31 == 0) {
                                }
                                if ((i7 & 100663296) == 0) {
                                }
                                if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                }
                                if (composerKN.HI((i9 & 306783379) == 306783378 || (i29 & 306783379) != 306783378, i9 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            i18 = i17;
                            i19 = i8 & 1024;
                            if (i19 != 0) {
                            }
                            i22 = i8 & 2048;
                            if (i22 != 0) {
                            }
                            int i412 = i21;
                            i24 = i8 & 4096;
                            if (i24 != 0) {
                            }
                            i26 = i8 & 8192;
                            if (i26 != 0) {
                            }
                            i28 = i8 & 16384;
                            if (i28 == 0) {
                            }
                            if ((i7 & 196608) == 0) {
                            }
                            i30 = i8 & 65536;
                            if (i30 == 0) {
                            }
                            i31 = i8 & 131072;
                            if (i31 == 0) {
                            }
                            if ((i7 & 100663296) == 0) {
                            }
                            if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            }
                            if (composerKN.HI((i9 & 306783379) == 306783378 || (i29 & 306783379) != 306783378, i9 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
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
                        int i4122 = i21;
                        i24 = i8 & 4096;
                        if (i24 != 0) {
                        }
                        i26 = i8 & 8192;
                        if (i26 != 0) {
                        }
                        i28 = i8 & 16384;
                        if (i28 == 0) {
                        }
                        if ((i7 & 196608) == 0) {
                        }
                        i30 = i8 & 65536;
                        if (i30 == 0) {
                        }
                        i31 = i8 & 131072;
                        if (i31 == 0) {
                        }
                        if ((i7 & 100663296) == 0) {
                        }
                        if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                        }
                        if (composerKN.HI((i9 & 306783379) == 306783378 || (i29 & 306783379) != 306783378, i9 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
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
                    int i41222 = i21;
                    i24 = i8 & 4096;
                    if (i24 != 0) {
                    }
                    i26 = i8 & 8192;
                    if (i26 != 0) {
                    }
                    i28 = i8 & 16384;
                    if (i28 == 0) {
                    }
                    if ((i7 & 196608) == 0) {
                    }
                    i30 = i8 & 65536;
                    if (i30 == 0) {
                    }
                    i31 = i8 & 131072;
                    if (i31 == 0) {
                    }
                    if ((i7 & 100663296) == 0) {
                    }
                    if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    }
                    if (composerKN.HI((i9 & 306783379) == 306783378 || (i29 & 306783379) != 306783378, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
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
                int i412222 = i21;
                i24 = i8 & 4096;
                if (i24 != 0) {
                }
                i26 = i8 & 8192;
                if (i26 != 0) {
                }
                i28 = i8 & 16384;
                if (i28 == 0) {
                }
                if ((i7 & 196608) == 0) {
                }
                i30 = i8 & 65536;
                if (i30 == 0) {
                }
                i31 = i8 & 131072;
                if (i31 == 0) {
                }
                if ((i7 & 100663296) == 0) {
                }
                if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                }
                if (composerKN.HI((i9 & 306783379) == 306783378 || (i29 & 306783379) != 306783378, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i11 = i8 & 8;
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
            int i4122222 = i21;
            i24 = i8 & 4096;
            if (i24 != 0) {
            }
            i26 = i8 & 8192;
            if (i26 != 0) {
            }
            i28 = i8 & 16384;
            if (i28 == 0) {
            }
            if ((i7 & 196608) == 0) {
            }
            i30 = i8 & 65536;
            if (i30 == 0) {
            }
            i31 = i8 & 131072;
            if (i31 == 0) {
            }
            if ((i7 & 100663296) == 0) {
            }
            if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if (composerKN.HI((i9 & 306783379) == 306783378 || (i29 & 306783379) != 306783378, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        modifier2 = modifier;
        i11 = i8 & 8;
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
        int i41222222 = i21;
        i24 = i8 & 4096;
        if (i24 != 0) {
        }
        i26 = i8 & 8192;
        if (i26 != 0) {
        }
        i28 = i8 & 16384;
        if (i28 == 0) {
        }
        if ((i7 & 196608) == 0) {
        }
        i30 = i8 & 65536;
        if (i30 == 0) {
        }
        i31 = i8 & 131072;
        if (i31 == 0) {
        }
        if ((i7 & 100663296) == 0) {
        }
        if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if (composerKN.HI((i9 & 306783379) == 306783378 || (i29 & 306783379) != 306783378, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int qie(int i2, int i3, int i5, int i7, int i8, float f3, long j2, float f4, PaddingValues paddingValues) {
        int iMax = Math.max(i5, Math.max(i8, MathHelpersKt.t(i7, 0, f3)));
        float top = paddingValues.getTop() * f4;
        return ConstraintsKt.J2(j2, Math.max(i2, Math.max(i3, MathKt.roundToInt(MathHelpersKt.rl(top, Math.max(top, i7 / 2.0f), f3) + iMax + (paddingValues.getBottom() * f4)))));
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
    /* JADX WARN: Removed duplicated region for block: B:332:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
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
        Modifier modifier4;
        TextStyle textStyle4;
        Function2 function211;
        Function2 function212;
        Function2 function213;
        Function2 function214;
        int i33;
        KeyboardActions keyboardActions3;
        int i34;
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeKN;
        Composer composer3;
        TextFieldColors textFieldColors3;
        KeyboardActions keyboardActions4;
        boolean z12;
        boolean z13;
        TextStyle textStyle5;
        int i35;
        boolean z14;
        VisualTransformation visualTransformation3;
        KeyboardOptions keyboardOptions3;
        boolean z15;
        int i36;
        int i37;
        int i38;
        boolean z16;
        MutableInteractionSource mutableInteractionSource4;
        TextStyle textStyle6;
        TextStyle textStyle7;
        int i39;
        Modifier modifierAz;
        Composer composerKN = composer.KN(237745923);
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
                int i40 = 1024;
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
                                int i41 = i21;
                                i24 = i8 & 4096;
                                if (i24 != 0) {
                                    i25 = i41 | RendererCapabilities.DECODER_SUPPORT_MASK;
                                } else {
                                    i25 = i41;
                                    if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i25 |= composerKN.p5(keyboardOptions) ? 256 : 128;
                                    }
                                    if ((i7 & 3072) == 0) {
                                        if ((i8 & 8192) == 0 && composerKN.p5(keyboardActions)) {
                                            i40 = 2048;
                                        }
                                        i25 |= i40;
                                    }
                                    int i42 = i25;
                                    i26 = i8 & 16384;
                                    if (i26 != 0) {
                                        i27 = i42;
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
                                                modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z17 = i11 != 0 ? true : z2;
                                                boolean z18 = i12 != 0 ? false : z6;
                                                if ((i8 & 32) != 0) {
                                                    i9 &= -458753;
                                                    textStyle4 = (TextStyle) composerKN.ty(TextKt.J2());
                                                } else {
                                                    textStyle4 = textStyle2;
                                                }
                                                int i43 = i9;
                                                function211 = i13 != 0 ? null : function25;
                                                function212 = i14 != 0 ? null : function26;
                                                function213 = i16 != 0 ? null : function23;
                                                function214 = i18 != 0 ? null : function24;
                                                boolean z19 = i20 != 0 ? false : z4;
                                                VisualTransformation visualTransformationT = i23 != 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                                KeyboardOptions keyboardOptionsN = i24 != 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                                if ((i8 & 8192) != 0) {
                                                    i33 = i30 & (-7169);
                                                    keyboardActions3 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                } else {
                                                    i33 = i30;
                                                    keyboardActions3 = keyboardActions;
                                                }
                                                boolean z20 = i26 != 0 ? false : z5;
                                                if ((32768 & i8) != 0) {
                                                    i33 &= -458753;
                                                    i34 = z20 ? 1 : Integer.MAX_VALUE;
                                                } else {
                                                    i34 = i2;
                                                }
                                                int i44 = i28 != 0 ? 1 : i3;
                                                mutableInteractionSource3 = i29 != 0 ? null : mutableInteractionSource;
                                                if ((262144 & i8) != 0) {
                                                    i33 &= -234881025;
                                                    shapeKN = TextFieldDefaults.f23471n.KN(composerKN, 6);
                                                } else {
                                                    shapeKN = shape;
                                                }
                                                int i45 = i33;
                                                if ((i8 & 524288) != 0) {
                                                    TextFieldColors textFieldColorsQie = TextFieldDefaults.f23471n.qie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerKN, 0, 0, 48, 2097151);
                                                    composer3 = composerKN;
                                                    keyboardActions4 = keyboardActions3;
                                                    i38 = i45 & (-1879048193);
                                                    z12 = z17;
                                                    z13 = z18;
                                                    textStyle5 = textStyle4;
                                                    i35 = i43;
                                                    visualTransformation3 = visualTransformationT;
                                                    keyboardOptions3 = keyboardOptionsN;
                                                    z15 = z20;
                                                    i36 = i34;
                                                    i37 = i44;
                                                    textFieldColors3 = textFieldColorsQie;
                                                    z14 = z19;
                                                } else {
                                                    composer3 = composerKN;
                                                    textFieldColors3 = textFieldColors;
                                                    keyboardActions4 = keyboardActions3;
                                                    z12 = z17;
                                                    z13 = z18;
                                                    textStyle5 = textStyle4;
                                                    i35 = i43;
                                                    z14 = z19;
                                                    visualTransformation3 = visualTransformationT;
                                                    keyboardOptions3 = keyboardOptionsN;
                                                    z15 = z20;
                                                    i36 = i34;
                                                    i37 = i44;
                                                    i38 = i45;
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
                                                TextStyle textStyle8 = textStyle2;
                                                i38 = i30;
                                                textStyle5 = textStyle8;
                                                function213 = function23;
                                                function214 = function24;
                                                z14 = z4;
                                                visualTransformation3 = visualTransformation;
                                                keyboardActions4 = keyboardActions;
                                                z15 = z5;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                                shapeKN = shape;
                                                composer3 = composerKN;
                                                z13 = z6;
                                                i35 = i9;
                                                function211 = function25;
                                                function212 = function26;
                                                modifier4 = modifier2;
                                                z12 = z2;
                                                keyboardOptions3 = keyboardOptions;
                                                i36 = i2;
                                                i37 = i3;
                                                textFieldColors3 = textFieldColors;
                                            }
                                            composer3.S();
                                            if (ComposerKt.v()) {
                                                z16 = z13;
                                                ComposerKt.p5(237745923, i35, i38, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:547)");
                                            } else {
                                                z16 = z13;
                                            }
                                            if (mutableInteractionSource3 == null) {
                                                composer3.eF(-569416202);
                                                Object objIF = composer3.iF();
                                                if (objIF == Composer.INSTANCE.n()) {
                                                    objIF = InteractionSourceKt.n();
                                                    composer3.o(objIF);
                                                }
                                                composer3.Xw();
                                                mutableInteractionSource4 = (MutableInteractionSource) objIF;
                                            } else {
                                                composer3.eF(674367745);
                                                composer3.Xw();
                                                mutableInteractionSource4 = mutableInteractionSource3;
                                            }
                                            composer3.eF(674373491);
                                            long jKN = textStyle5.KN();
                                            if (jKN == 16) {
                                                jKN = ((Color) textFieldColors3.t(z12, composer3, ((i35 >> 9) & 14) | ((i38 >> 24) & 112)).getValue()).getValue();
                                            }
                                            long j2 = jKN;
                                            composer3.Xw();
                                            TextStyle textStyleNHg = textStyle5.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                            Density density = (Density) composer3.ty(CompositionLocalsKt.J2());
                                            if (function211 != null) {
                                                textStyle6 = textStyle5;
                                                textStyle7 = textStyleNHg;
                                                i39 = i35;
                                                modifierAz = PaddingKt.az(SemanticsModifierKt.t(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$11
                                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        n(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 0.0f, density.Z(rl), 0.0f, 0.0f, 13, null);
                                            } else {
                                                textStyle6 = textStyle5;
                                                textStyle7 = textStyleNHg;
                                                i39 = i35;
                                                modifierAz = Modifier.INSTANCE;
                                            }
                                            Modifier modifierT = TextFieldImplKt.t(modifier4.Zmq(modifierAz), z14, Strings_androidKt.n(Strings.INSTANCE.t(), composer3, 6));
                                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f23471n;
                                            Modifier modifier5 = modifier4;
                                            final boolean z21 = z14;
                                            final TextFieldColors textFieldColors4 = textFieldColors3;
                                            final boolean z22 = z12;
                                            final boolean z23 = z15;
                                            final VisualTransformation visualTransformation4 = visualTransformation3;
                                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                            final Function2 function215 = function211;
                                            final Function2 function216 = function212;
                                            final Function2 function217 = function213;
                                            final Function2 function218 = function214;
                                            final Shape shape3 = shapeKN;
                                            int i46 = i38 << 12;
                                            boolean z24 = z16;
                                            Composer composer4 = composer3;
                                            BasicTextFieldKt.t(textFieldValue, function1, SizeKt.n(modifierT, textFieldDefaults.Uo(), textFieldDefaults.J2()), z12, z24, textStyle7, keyboardOptions3, keyboardActions4, z15, i36, i37, visualTransformation3, null, mutableInteractionSource4, new SolidColor(((Color) textFieldColors3.xMQ(z14, composer3, (i38 & 14) | ((i38 >> 24) & 112)).getValue()).getValue(), null), ComposableLambdaKt.nr(-1001528775, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$13
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer5, Integer num) {
                                                    n(function219, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                                 */
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
                                                        ComposerKt.p5(-1001528775, i48, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:591)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f23471n;
                                                    String strXMQ = textFieldValue.xMQ();
                                                    final boolean z25 = z22;
                                                    boolean z26 = z23;
                                                    VisualTransformation visualTransformation5 = visualTransformation4;
                                                    final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                                    final boolean z27 = z21;
                                                    Function2 function220 = function215;
                                                    Function2 function221 = function216;
                                                    Function2 function222 = function217;
                                                    Function2 function223 = function218;
                                                    final Shape shape4 = shape3;
                                                    final TextFieldColors textFieldColors5 = textFieldColors4;
                                                    textFieldDefaults2.t(strXMQ, function219, z25, z26, visualTransformation5, mutableInteractionSource6, z27, function220, function221, function222, function223, shape4, textFieldColors5, null, ComposableLambdaKt.nr(-794566495, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$13.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            n(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(Composer composer6, int i49) {
                                                            if (!composer6.HI((i49 & 3) != 2, i49 & 1)) {
                                                                composer6.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(-794566495, i49, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:606)");
                                                            }
                                                            TextFieldDefaults.f23471n.n(z25, z27, mutableInteractionSource6, textFieldColors5, shape4, 0.0f, 0.0f, composer6, 12582912, 96);
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }, composer5, 54), composer5, (i48 << 3) & 112, 221184, 8192);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer3, 54), composer4, (i39 & 64638) | (3670016 & i46) | (29360128 & i46) | (234881024 & i46) | (i46 & 1879048192), ((i38 >> 18) & 14) | 196608 | (i38 & 112), 4096);
                                            composer2 = composer4;
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            VisualTransformation visualTransformation5 = visualTransformation3;
                                            z10 = z15;
                                            visualTransformation2 = visualTransformation5;
                                            textStyle3 = textStyle6;
                                            textFieldColors2 = textFieldColors4;
                                            z7 = z12;
                                            z11 = z24;
                                            i31 = i36;
                                            i32 = i37;
                                            modifier3 = modifier5;
                                            function27 = function211;
                                            function28 = function212;
                                            function29 = function213;
                                            mutableInteractionSource2 = mutableInteractionSource3;
                                            shape2 = shapeKN;
                                            keyboardOptions2 = keyboardOptions3;
                                            keyboardActions2 = keyboardActions4;
                                            function210 = function214;
                                            z9 = z21;
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
                                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$14
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
                                                    OutlinedTextFieldKt.rl(textFieldValue, function1, modifier3, z7, z11, textStyle3, function27, function28, function29, function210, z9, visualTransformation2, keyboardOptions2, keyboardActions2, z10, i31, i32, mutableInteractionSource2, shape2, textFieldColors2, composer5, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i27 = i42 | 24576;
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
                                int i422 = i25;
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
                            int i412 = i21;
                            i24 = i8 & 4096;
                            if (i24 != 0) {
                            }
                            if ((i7 & 3072) == 0) {
                            }
                            int i4222 = i25;
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
                        int i4122 = i21;
                        i24 = i8 & 4096;
                        if (i24 != 0) {
                        }
                        if ((i7 & 3072) == 0) {
                        }
                        int i42222 = i25;
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
                    int i41222 = i21;
                    i24 = i8 & 4096;
                    if (i24 != 0) {
                    }
                    if ((i7 & 3072) == 0) {
                    }
                    int i422222 = i25;
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
                int i412222 = i21;
                i24 = i8 & 4096;
                if (i24 != 0) {
                }
                if ((i7 & 3072) == 0) {
                }
                int i4222222 = i25;
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
            int i402 = 1024;
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
            int i4122222 = i21;
            i24 = i8 & 4096;
            if (i24 != 0) {
            }
            if ((i7 & 3072) == 0) {
            }
            int i42222222 = i25;
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
        int i4022 = 1024;
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
        int i41222222 = i21;
        i24 = i8 & 4096;
        if (i24 != 0) {
        }
        if ((i7 & 3072) == 0) {
        }
        int i422222222 = i25;
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
        Shape shapeKN;
        TextFieldColors textFieldColorsQie;
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
        Composer composerKN = composer.KN(-288998816);
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
                                                    shapeKN = TextFieldDefaults.f23471n.KN(composerKN, 6);
                                                } else {
                                                    shapeKN = shape;
                                                }
                                                int i39 = i31;
                                                if ((262144 & i7) != 0) {
                                                    composer2 = composerKN;
                                                    keyboardActions4 = keyboardActions3;
                                                    modifier4 = modifier5;
                                                    textFieldColorsQie = TextFieldDefaults.f23471n.qie(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 48, 2097151);
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
                                                    shape3 = shapeKN;
                                                } else {
                                                    composer2 = composerKN;
                                                    textFieldColorsQie = textFieldColors;
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
                                                    shape3 = shapeKN;
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
                                                textFieldColorsQie = textFieldColors;
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
                                                ComposerKt.p5(-288998816, i32, i29, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:644)");
                                            }
                                            int i40 = i32 & 2147483646;
                                            int i41 = (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29);
                                            int i42 = i29 << 3;
                                            rl(textFieldValue, function1, modifier4, z13, z14, textStyle2, function25, function211, function212, function213, z15, visualTransformation3, keyboardOptions3, keyboardActions4, z16, i33, 1, mutableInteractionSource4, shape3, textFieldColorsQie, composer2, i40, i41 | (29360128 & i42) | (234881024 & i42) | (i42 & 1879048192), 0);
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
                                            textFieldColors2 = textFieldColorsQie;
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
                                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$16
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
                                                    OutlinedTextFieldKt.t(textFieldValue, function1, modifier3, z11, z12, textStyle3, function27, function28, function29, function210, z9, visualTransformation2, keyboardOptions2, keyboardActions2, z10, i30, mutableInteractionSource2, shape2, textFieldColors2, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5), i7);
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

    public static final Modifier HI(Modifier modifier, final long j2, final PaddingValues paddingValues) {
        return DrawModifierKt.nr(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.f34161t.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
                float fGh = Size.gh(j2);
                if (fGh <= 0.0f) {
                    contentDrawScope.l2();
                    return;
                }
                float fL = contentDrawScope.l(OutlinedTextFieldKt.f22362n);
                float fL2 = contentDrawScope.l(paddingValues.rl(contentDrawScope.getLayoutDirection())) - fL;
                float f3 = 2;
                float fGh2 = fGh + fL2 + (fL * f3);
                LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                float fGh3 = iArr[layoutDirection.ordinal()] == 1 ? Size.gh(contentDrawScope.t()) - fGh2 : RangesKt.coerceAtLeast(fL2, 0.0f);
                if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                    fGh2 = Size.gh(contentDrawScope.t()) - RangesKt.coerceAtLeast(fL2, 0.0f);
                }
                float f4 = fGh2;
                float fXMQ = Size.xMQ(j2);
                float f5 = (-fXMQ) / f3;
                float f6 = fXMQ / f3;
                int iN = ClipOp.INSTANCE.n();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jT2 = drawContext.t();
                drawContext.KN().O();
                try {
                    drawContext.getTransform().rl(fGh3, f5, f4, f6, iN);
                    contentDrawScope.l2();
                } finally {
                    drawContext.KN().n();
                    drawContext.xMQ(jT2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f3, boolean z2, float f4, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f4);
        int iRoundToInt2 = MathKt.roundToInt(PaddingKt.Uo(paddingValues, layoutDirection) * f4);
        float fNr = TextFieldImplKt.nr() * f4;
        if (placeable != null) {
            Placeable.PlacementScope.az(placementScope, placeable, 0, Alignment.INSTANCE.xMQ().n(placeable.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.az(placementScope, placeable2, i3 - placeable2.getWidth(), Alignment.INSTANCE.xMQ().n(placeable2.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.az(placementScope, placeable4, MathKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.KN(placeable) - fNr) * (1 - f3)) + iRoundToInt2, MathHelpersKt.t(z2 ? Alignment.INSTANCE.xMQ().n(placeable4.getHeight(), i2) : iRoundToInt, -(placeable4.getHeight() / 2), f3), 0.0f, 4, null);
        }
        Placeable.PlacementScope.az(placementScope, placeable3, TextFieldImplKt.KN(placeable), Math.max(z2 ? Alignment.INSTANCE.xMQ().n(placeable3.getHeight(), i2) : iRoundToInt, TextFieldImplKt.Uo(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z2) {
                iRoundToInt = Alignment.INSTANCE.xMQ().n(placeable5.getHeight(), i2);
            }
            Placeable.PlacementScope.az(placementScope, placeable5, TextFieldImplKt.KN(placeable), Math.max(iRoundToInt, TextFieldImplKt.Uo(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.gh(placementScope, placeable6, IntOffset.INSTANCE.rl(), 0.0f, 2, null);
    }

    public static final long ty() {
        return rl;
    }
}
