package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
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
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÚ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'\u001aÚ\u0002\u0010)\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b)\u0010*\u001aî\u0001\u00104\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b4\u00105\u001a\u001b\u00107\u001a\u00020\u001d*\u00020\u001d2\u0006\u00106\u001a\u00020\u001dH\u0002¢\u0006\u0004\b7\u00108\u001aR\u0010B\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@H\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001ar\u0010M\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020.2\u0006\u0010A\u001a\u00020@2\u0006\u0010L\u001a\u00020.2\u0006\u00103\u001a\u000202H\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a¡\u0001\u0010^\u001a\u00020\u0003*\u00020O2\u0006\u0010P\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020R2\b\u0010T\u001a\u0004\u0018\u00010R2\b\u0010U\u001a\u0004\u0018\u00010R2\b\u0010V\u001a\u0004\u0018\u00010R2\b\u0010W\u001a\u0004\u0018\u00010R2\b\u0010X\u001a\u0004\u0018\u00010R2\b\u0010Y\u001a\u0004\u0018\u00010R2\u0006\u0010Z\u001a\u00020R2\b\u0010[\u001a\u0004\u0018\u00010R2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020.2\u0006\u0010L\u001a\u00020.H\u0002¢\u0006\u0004\b^\u0010_\u001a\u0087\u0001\u0010a\u001a\u00020\u0003*\u00020O2\u0006\u0010P\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010`\u001a\u00020R2\b\u0010U\u001a\u0004\u0018\u00010R2\b\u0010V\u001a\u0004\u0018\u00010R2\b\u0010W\u001a\u0004\u0018\u00010R2\b\u0010X\u001a\u0004\u0018\u00010R2\b\u0010Y\u001a\u0004\u0018\u00010R2\u0006\u0010Z\u001a\u00020R2\b\u0010[\u001a\u0004\u0018\u00010R2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010L\u001a\u00020.2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\ba\u0010b\u001a!\u0010f\u001a\u00020\u0005*\u00020\u00052\f\u0010e\u001a\b\u0012\u0004\u0012\u00020d0cH\u0000¢\u0006\u0004\bf\u0010g\"\u001a\u0010l\u001a\u00020h8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010i\u001a\u0004\bj\u0010k\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006m"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", "rl", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", c.f62177j, "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", TtmlNode.RUBY_CONTAINER, "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "t", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "from", "ck", "(II)I", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "mUb", "(IIIIIIIJ)I", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "density", "xMQ", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "Landroidx/compose/ui/layout/Placeable;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "az", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIIFF)V", "textPlaceable", "ty", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "indicatorBorder", "gh", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "F", "qie", "()F", "TextFieldWithLabelVerticalPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1140:1\n77#2:1141\n77#2:1150\n77#2:1165\n1223#3,6:1142\n1223#3,6:1151\n1223#3,6:1159\n708#4:1148\n696#4:1149\n708#4:1157\n696#4:1158\n78#5,6:1166\n85#5,4:1181\n89#5,2:1191\n78#5,6:1200\n85#5,4:1215\n89#5,2:1225\n93#5:1231\n78#5,6:1239\n85#5,4:1254\n89#5,2:1264\n93#5:1270\n78#5,6:1285\n85#5,4:1300\n89#5,2:1310\n93#5:1316\n78#5,6:1325\n85#5,4:1340\n89#5,2:1350\n93#5:1356\n78#5,6:1365\n85#5,4:1380\n89#5,2:1390\n93#5:1396\n78#5,6:1407\n85#5,4:1422\n89#5,2:1432\n93#5:1438\n78#5,6:1447\n85#5,4:1462\n89#5,2:1472\n93#5:1478\n93#5:1482\n368#6,9:1172\n377#6:1193\n368#6,9:1206\n377#6:1227\n378#6,2:1229\n368#6,9:1245\n377#6:1266\n378#6,2:1268\n368#6,9:1291\n377#6:1312\n378#6,2:1314\n368#6,9:1331\n377#6:1352\n378#6,2:1354\n368#6,9:1371\n377#6:1392\n378#6,2:1394\n368#6,9:1413\n377#6:1434\n378#6,2:1436\n368#6,9:1453\n377#6:1474\n378#6,2:1476\n378#6,2:1480\n4032#7,6:1185\n4032#7,6:1219\n4032#7,6:1258\n4032#7,6:1304\n4032#7,6:1344\n4032#7,6:1384\n4032#7,6:1426\n4032#7,6:1466\n71#8:1194\n69#8,5:1195\n74#8:1228\n78#8:1232\n71#8:1233\n69#8,5:1234\n74#8:1267\n78#8:1271\n71#8:1278\n68#8,6:1279\n74#8:1313\n78#8:1317\n71#8:1318\n68#8,6:1319\n74#8:1353\n78#8:1357\n71#8:1358\n68#8,6:1359\n74#8:1393\n78#8:1397\n71#8:1400\n68#8,6:1401\n74#8:1435\n78#8:1439\n71#8:1440\n68#8,6:1441\n74#8:1475\n78#8:1479\n56#9:1272\n56#9:1275\n50#9:1483\n86#9:1484\n148#10:1273\n205#10:1274\n148#10:1276\n205#10:1277\n148#10:1398\n148#10:1399\n148#10:1485\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n*L\n202#1:1141\n358#1:1150\n459#1:1165\n222#1:1142,6\n378#1:1151,6\n456#1:1159,6\n225#1:1148\n225#1:1149\n381#1:1157\n381#1:1158\n460#1:1166,6\n460#1:1181,4\n460#1:1191,2\n469#1:1200,6\n469#1:1215,4\n469#1:1225,2\n469#1:1231\n477#1:1239,6\n477#1:1254,4\n477#1:1264,2\n477#1:1270\n502#1:1285,6\n502#1:1300,4\n502#1:1310,2\n502#1:1316\n512#1:1325,6\n512#1:1340,4\n512#1:1350,2\n512#1:1356\n523#1:1365,6\n523#1:1380,4\n523#1:1390,2\n523#1:1396\n551#1:1407,6\n551#1:1422,4\n551#1:1432,2\n551#1:1438\n560#1:1447,6\n560#1:1462,4\n560#1:1472,2\n560#1:1478\n460#1:1482\n460#1:1172,9\n460#1:1193\n469#1:1206,9\n469#1:1227\n469#1:1229,2\n477#1:1245,9\n477#1:1266\n477#1:1268,2\n502#1:1291,9\n502#1:1312\n502#1:1314,2\n512#1:1331,9\n512#1:1352\n512#1:1354,2\n523#1:1371,9\n523#1:1392\n523#1:1394,2\n551#1:1413,9\n551#1:1434\n551#1:1436,2\n560#1:1453,9\n560#1:1474\n560#1:1476,2\n460#1:1480,2\n460#1:1185,6\n469#1:1219,6\n477#1:1258,6\n502#1:1304,6\n512#1:1344,6\n523#1:1384,6\n551#1:1426,6\n560#1:1466,6\n469#1:1194\n469#1:1195,5\n469#1:1228\n469#1:1232\n477#1:1233\n477#1:1234,5\n477#1:1267\n477#1:1271\n502#1:1278\n502#1:1279,6\n502#1:1313\n502#1:1317\n512#1:1318\n512#1:1319,6\n512#1:1353\n512#1:1357\n523#1:1358\n523#1:1359,6\n523#1:1393\n523#1:1397\n551#1:1400\n551#1:1401,6\n551#1:1435\n551#1:1439\n560#1:1440\n560#1:1441,6\n560#1:1475\n560#1:1479\n490#1:1272\n496#1:1275\n960#1:1483\n965#1:1484\n490#1:1273\n490#1:1274\n496#1:1276\n496#1:1277\n544#1:1398\n545#1:1399\n1139#1:1485\n*E\n"})
public final class TextFieldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f28346n = Dp.KN(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z2, int i5, int i7, float f3, float f4) {
        Placeable.PlacementScope.gh(placementScope, placeable8, IntOffset.INSTANCE.rl(), 0.0f, 2, null);
        int iZ = i3 - TextFieldImplKt.Z(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.az(placementScope, placeable4, 0, Alignment.INSTANCE.xMQ().n(placeable4.getHeight(), iZ), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.az(placementScope, placeable2, TextFieldImplKt.S(placeable4), (z2 ? Alignment.INSTANCE.xMQ().n(placeable2.getHeight(), iZ) : MathKt.roundToInt(TextFieldImplKt.r() * f4)) - MathKt.roundToInt((r1 - i5) * f3), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.az(placementScope, placeable6, TextFieldImplKt.S(placeable4), i7, 0.0f, 4, null);
        }
        int iS = TextFieldImplKt.S(placeable4) + TextFieldImplKt.S(placeable6);
        Placeable.PlacementScope.az(placementScope, placeable, iS, i7, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.az(placementScope, placeable3, iS, i7, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.az(placementScope, placeable7, (i2 - TextFieldImplKt.S(placeable5)) - placeable7.getWidth(), i7, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.az(placementScope, placeable5, i2 - placeable5.getWidth(), Alignment.INSTANCE.xMQ().n(placeable5.getHeight(), iZ), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.az(placementScope, placeable9, 0, iZ, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ck(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mUb(int i2, int i3, int i5, int i7, int i8, int i9, int i10, long j2) {
        int i11 = i5 + i7;
        return Math.max(i2 + Math.max(i8 + i11, Math.max(i10 + i11, i9)) + i3, Constraints.ty(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i5, final int i7, final int i8, final int i9) {
        final TextFieldValue textFieldValue2;
        int i10;
        final Function1 function12;
        Modifier modifier2;
        int i11;
        boolean z6;
        int i12;
        boolean z7;
        TextStyle textStyle2;
        int i13;
        Function2 function28;
        int i14;
        Function2 function29;
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
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        final Shape shape2;
        TextStyle textStyle3;
        final Modifier modifier3;
        final Function2 function210;
        int i39;
        final Function2 function211;
        final KeyboardActions keyboardActions2;
        final Function2 function212;
        final Function2 function213;
        final boolean z9;
        final int i40;
        MutableInteractionSource mutableInteractionSource2;
        final VisualTransformation visualTransformation2;
        final boolean z10;
        int i41;
        final Function2 function214;
        final Function2 function215;
        final boolean z11;
        final KeyboardOptions keyboardOptions2;
        final int i42;
        final TextFieldColors textFieldColorsNr;
        final Function2 function216;
        final boolean z12;
        MutableInteractionSource mutableInteractionSource3;
        long jKN;
        final TextStyle textStyle4;
        Composer composer2;
        final TextFieldColors textFieldColors2;
        final boolean z13;
        final boolean z14;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z15;
        final int i43;
        final int i44;
        final VisualTransformation visualTransformation3;
        final Function2 function217;
        final Function2 function218;
        final Function2 function219;
        final Function2 function220;
        final Function2 function221;
        final Shape shape3;
        final MutableInteractionSource mutableInteractionSource4;
        final boolean z16;
        final Function2 function222;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1268528240);
        if ((i9 & 1) != 0) {
            i10 = i5 | 6;
            textFieldValue2 = textFieldValue;
        } else {
            textFieldValue2 = textFieldValue;
            if ((i5 & 6) == 0) {
                i10 = (composerKN.p5(textFieldValue2) ? 4 : 2) | i5;
            } else {
                i10 = i5;
            }
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i5 & 48) == 0) {
                i10 |= composerKN.E2(function12) ? 32 : 16;
            }
        }
        int i45 = i9 & 4;
        if (i45 != 0) {
            i10 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i10 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i11 = i9 & 8;
            if (i11 == 0) {
                i10 |= 3072;
            } else {
                if ((i5 & 3072) == 0) {
                    z6 = z2;
                    i10 |= composerKN.n(z6) ? 2048 : 1024;
                }
                i12 = i9 & 16;
                if (i12 != 0) {
                    i10 |= 24576;
                } else {
                    if ((i5 & 24576) == 0) {
                        z7 = z3;
                        i10 |= composerKN.n(z7) ? 16384 : 8192;
                    }
                    if ((i5 & 196608) != 0) {
                        textStyle2 = textStyle;
                        i10 |= ((i9 & 32) == 0 && composerKN.p5(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i13 = i9 & 64;
                    if (i13 == 0) {
                        i10 |= 1572864;
                        function28 = function2;
                    } else {
                        function28 = function2;
                        if ((i5 & 1572864) == 0) {
                            i10 |= composerKN.E2(function28) ? 1048576 : 524288;
                        }
                    }
                    i14 = i9 & 128;
                    if (i14 == 0) {
                        i10 |= 12582912;
                        function29 = function22;
                    } else {
                        function29 = function22;
                        if ((i5 & 12582912) == 0) {
                            i10 |= composerKN.E2(function29) ? 8388608 : 4194304;
                        }
                    }
                    i15 = i9 & 256;
                    if (i15 == 0) {
                        i10 |= 100663296;
                    } else {
                        if ((i5 & 100663296) == 0) {
                            i16 = i15;
                            i10 |= composerKN.E2(function23) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i17 = i9 & 512;
                        if (i17 != 0) {
                            i10 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else {
                            if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i18 = i17;
                                i10 |= composerKN.E2(function24) ? 536870912 : 268435456;
                            }
                            i19 = i9 & 1024;
                            if (i19 == 0) {
                                i21 = i7 | 6;
                                i20 = i19;
                            } else if ((i7 & 6) == 0) {
                                i20 = i19;
                                i21 = i7 | (composerKN.E2(function25) ? 4 : 2);
                            } else {
                                i20 = i19;
                                i21 = i7;
                            }
                            i22 = i9 & 2048;
                            if (i22 == 0) {
                                i21 |= 48;
                                i23 = i22;
                            } else if ((i7 & 48) == 0) {
                                i23 = i22;
                                i21 |= composerKN.E2(function26) ? 32 : 16;
                            } else {
                                i23 = i22;
                            }
                            int i46 = i21;
                            i24 = i10;
                            i25 = i9 & 4096;
                            if (i25 == 0) {
                                i26 = i46 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i47 = i46;
                                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i47 |= composerKN.E2(function27) ? 256 : 128;
                                }
                                i26 = i47;
                            }
                            i27 = i9 & 8192;
                            if (i27 == 0) {
                                i28 = i26 | 3072;
                            } else {
                                int i48 = i26;
                                if ((i7 & 3072) == 0) {
                                    i28 = i48 | (composerKN.n(z4) ? 2048 : 1024);
                                } else {
                                    i28 = i48;
                                }
                            }
                            i29 = i9 & 16384;
                            if (i29 != 0) {
                                i30 = i28;
                                if ((i7 & 24576) == 0) {
                                    i30 |= composerKN.p5(visualTransformation) ? 16384 : 8192;
                                }
                                i31 = i9 & 32768;
                                if (i31 != 0) {
                                    i30 |= 196608;
                                } else if ((i7 & 196608) == 0) {
                                    i30 |= composerKN.p5(keyboardOptions) ? 131072 : 65536;
                                }
                                i32 = i9 & 65536;
                                if (i32 != 0) {
                                    i30 |= 1572864;
                                } else if ((i7 & 1572864) == 0) {
                                    i30 |= composerKN.p5(keyboardActions) ? 1048576 : 524288;
                                }
                                i33 = i9 & 131072;
                                if (i33 != 0) {
                                    i30 |= 12582912;
                                } else if ((i7 & 12582912) == 0) {
                                    i30 |= composerKN.n(z5) ? 8388608 : 4194304;
                                }
                                if ((i7 & 100663296) == 0) {
                                    i30 |= ((i9 & 262144) == 0 && composerKN.t(i2)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                i34 = i9 & 524288;
                                if (i34 != 0) {
                                    i30 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                } else if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i30 |= composerKN.t(i3) ? 536870912 : 268435456;
                                }
                                i35 = i9 & 1048576;
                                if (i35 != 0) {
                                    i36 = i8 | 6;
                                } else if ((i8 & 6) == 0) {
                                    i36 = i8 | (composerKN.p5(mutableInteractionSource) ? 4 : 2);
                                } else {
                                    i36 = i8;
                                }
                                if ((i8 & 48) == 0) {
                                    i36 |= ((i9 & 2097152) == 0 && composerKN.p5(shape)) ? 32 : 16;
                                }
                                if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i36 |= ((i9 & 4194304) == 0 && composerKN.p5(textFieldColors)) ? 256 : 128;
                                }
                                int i49 = i36;
                                if ((i24 & 306783379) == 306783378 && (i30 & 306783379) == 306783378 && (i49 & 147) == 146 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    function215 = function23;
                                    function219 = function25;
                                    function220 = function26;
                                    function221 = function27;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions3 = keyboardActions;
                                    z15 = z5;
                                    i43 = i2;
                                    i44 = i3;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                    composer2 = composerKN;
                                    z13 = z6;
                                    z14 = z7;
                                    textStyle4 = textStyle2;
                                    function217 = function28;
                                    function218 = function29;
                                    modifier3 = modifier2;
                                    function222 = function24;
                                    z16 = z4;
                                    visualTransformation3 = visualTransformation;
                                } else {
                                    composerKN.e();
                                    if ((i5 & 1) != 0 || composerKN.rV9()) {
                                        if (i45 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i11 != 0) {
                                            z6 = true;
                                        }
                                        if (i12 != 0) {
                                            z7 = false;
                                        }
                                        if ((i9 & 32) == 0) {
                                            i37 = i24 & (-458753);
                                            textStyle2 = (TextStyle) composerKN.ty(TextKt.J2());
                                        } else {
                                            i37 = i24;
                                        }
                                        if (i13 != 0) {
                                            function28 = null;
                                        }
                                        if (i14 != 0) {
                                            function29 = null;
                                        }
                                        Function2 function223 = i16 == 0 ? null : function23;
                                        Function2 function224 = i18 == 0 ? null : function24;
                                        Function2 function225 = i20 == 0 ? null : function25;
                                        Function2 function226 = i23 == 0 ? null : function26;
                                        Function2 function227 = i25 == 0 ? null : function27;
                                        boolean z17 = i27 == 0 ? false : z4;
                                        VisualTransformation visualTransformationT = i29 == 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                        KeyboardOptions keyboardOptionsN = i31 == 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                        KeyboardActions keyboardActionsN = i32 == 0 ? KeyboardActions.INSTANCE.n() : keyboardActions;
                                        boolean z18 = i33 == 0 ? false : z5;
                                        if ((i9 & 262144) == 0) {
                                            i38 = z18 ? 1 : Integer.MAX_VALUE;
                                            i30 &= -234881025;
                                        } else {
                                            i38 = i2;
                                        }
                                        int i50 = i34 == 0 ? 1 : i3;
                                        MutableInteractionSource mutableInteractionSource5 = i35 == 0 ? mutableInteractionSource : null;
                                        Shape shapeTy = (i9 & 2097152) == 0 ? TextFieldDefaults.f28299n.ty(composerKN, 6) : shape;
                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                        if ((i9 & 4194304) == 0) {
                                            shape2 = shapeTy;
                                            function210 = function224;
                                            i39 = i30;
                                            function211 = function225;
                                            keyboardActions2 = keyboardActionsN;
                                            function212 = function226;
                                            function213 = function227;
                                            z9 = z18;
                                            i40 = i50;
                                            mutableInteractionSource2 = mutableInteractionSource6;
                                            visualTransformation2 = visualTransformationT;
                                            i41 = i37;
                                            function214 = function28;
                                            function215 = function223;
                                            z11 = z17;
                                            keyboardOptions2 = keyboardOptionsN;
                                            i42 = i38;
                                            textFieldColorsNr = TextFieldDefaults.f28299n.nr(composerKN, 6);
                                            textStyle3 = textStyle2;
                                            function216 = function29;
                                            modifier3 = modifier2;
                                        } else {
                                            shape2 = shapeTy;
                                            textStyle3 = textStyle2;
                                            modifier3 = modifier2;
                                            function210 = function224;
                                            i39 = i30;
                                            function211 = function225;
                                            keyboardActions2 = keyboardActionsN;
                                            function212 = function226;
                                            function213 = function227;
                                            z9 = z18;
                                            i40 = i50;
                                            mutableInteractionSource2 = mutableInteractionSource6;
                                            visualTransformation2 = visualTransformationT;
                                            z10 = z7;
                                            i41 = i37;
                                            function214 = function28;
                                            function215 = function223;
                                            z11 = z17;
                                            keyboardOptions2 = keyboardOptionsN;
                                            i42 = i38;
                                            textFieldColorsNr = textFieldColors;
                                            function216 = function29;
                                            z12 = z6;
                                            composerKN.S();
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1268528240, i41, i39, "androidx.compose.material3.TextField (TextField.kt:375)");
                                            }
                                            composerKN.eF(-508241210);
                                            if (mutableInteractionSource2 != null) {
                                                Object objIF = composerKN.iF();
                                                if (objIF == Composer.INSTANCE.n()) {
                                                    objIF = InteractionSourceKt.n();
                                                    composerKN.o(objIF);
                                                }
                                                mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                            }
                                            composerKN.Xw();
                                            composerKN.eF(-508235100);
                                            jKN = textStyle3.KN();
                                            if (jKN == 16) {
                                                jKN = textFieldColorsNr.az(z12, z11, ((Boolean) FocusInteractionKt.n(mutableInteractionSource3, composerKN, 0).getValue()).booleanValue());
                                            }
                                            long j2 = jKN;
                                            composerKN.Xw();
                                            final TextStyle textStyleNHg = textStyle3.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                            final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                            CompositionLocalKt.rl(TextSelectionColorsKt.rl().nr(textFieldColorsNr.getTextSelectionColors()), ComposableLambdaKt.nr(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i51) {
                                                    if ((i51 & 3) == 2 && composer3.xMQ()) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-1163788208, i51, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                                                    }
                                                    Modifier modifier4 = modifier3;
                                                    boolean z19 = z11;
                                                    Strings.Companion companion = Strings.INSTANCE;
                                                    Modifier modifierXMQ = TextFieldImplKt.xMQ(modifier4, z19, Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.nr), composer3, 0));
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f28299n;
                                                    Modifier modifierN = SizeKt.n(modifierXMQ, textFieldDefaults.az(), textFieldDefaults.qie());
                                                    SolidColor solidColor = new SolidColor(textFieldColorsNr.t(z11), null);
                                                    final TextFieldValue textFieldValue3 = textFieldValue2;
                                                    Function1 function13 = function12;
                                                    final boolean z20 = z12;
                                                    boolean z21 = z10;
                                                    TextStyle textStyle5 = textStyleNHg;
                                                    KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                                    KeyboardActions keyboardActions4 = keyboardActions2;
                                                    final boolean z22 = z9;
                                                    int i52 = i42;
                                                    int i53 = i40;
                                                    final VisualTransformation visualTransformation4 = visualTransformation2;
                                                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                                    final boolean z23 = z11;
                                                    final Function2 function228 = function214;
                                                    final Function2 function229 = function216;
                                                    final Function2 function230 = function215;
                                                    final Function2 function231 = function210;
                                                    final Function2 function232 = function211;
                                                    final Function2 function233 = function212;
                                                    final Function2 function234 = function213;
                                                    final Shape shape4 = shape2;
                                                    final TextFieldColors textFieldColors3 = textFieldColorsNr;
                                                    BasicTextFieldKt.t(textFieldValue3, function13, modifierN, z20, z21, textStyle5, keyboardOptions4, keyboardActions4, z22, i52, i53, visualTransformation4, null, mutableInteractionSource8, solidColor, ComposableLambdaKt.nr(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function235, Composer composer4, Integer num) {
                                                            n(function235, composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(Function2 function235, Composer composer4, int i54) {
                                                            Composer composer5;
                                                            int i55;
                                                            if ((i54 & 6) == 0) {
                                                                composer5 = composer4;
                                                                i55 = i54 | (composer5.E2(function235) ? 4 : 2);
                                                            } else {
                                                                composer5 = composer4;
                                                                i55 = i54;
                                                            }
                                                            if ((i55 & 19) == 18 && composer5.xMQ()) {
                                                                composer5.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(1751957978, i55, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                                            }
                                                            TextFieldDefaults.f28299n.t(textFieldValue3.xMQ(), function235, z20, z22, visualTransformation4, mutableInteractionSource8, z23, function228, function229, function230, function231, function232, function233, function234, shape4, textFieldColors3, null, null, composer4, (i55 << 3) & 112, 100663296, 196608);
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }, composer3, 54), composer3, 0, 196608, 4096);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            textStyle4 = textStyle3;
                                            composer2 = composerKN;
                                            textFieldColors2 = textFieldColorsNr;
                                            z13 = z12;
                                            z14 = z10;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions3 = keyboardActions2;
                                            z15 = z9;
                                            i43 = i42;
                                            i44 = i40;
                                            visualTransformation3 = visualTransformation2;
                                            function217 = function214;
                                            function218 = function216;
                                            function219 = function211;
                                            function220 = function212;
                                            function221 = function213;
                                            shape3 = shape2;
                                            mutableInteractionSource4 = mutableInteractionSource2;
                                            z16 = z11;
                                            function222 = function210;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        i41 = (i9 & 32) != 0 ? i24 & (-458753) : i24;
                                        if ((262144 & i9) != 0) {
                                            i30 &= -234881025;
                                        }
                                        function215 = function23;
                                        function210 = function24;
                                        function211 = function25;
                                        function212 = function26;
                                        function213 = function27;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        z9 = z5;
                                        i42 = i2;
                                        i40 = i3;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape2 = shape;
                                        textFieldColorsNr = textFieldColors;
                                        textStyle3 = textStyle2;
                                        function214 = function28;
                                        function216 = function29;
                                        modifier3 = modifier2;
                                        i39 = i30;
                                        z11 = z4;
                                        keyboardActions2 = keyboardActions;
                                    }
                                    z12 = z6;
                                    z10 = z7;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    composerKN.eF(-508241210);
                                    if (mutableInteractionSource2 != null) {
                                    }
                                    composerKN.Xw();
                                    composerKN.eF(-508235100);
                                    jKN = textStyle3.KN();
                                    if (jKN == 16) {
                                    }
                                    long j22 = jKN;
                                    composerKN.Xw();
                                    final TextStyle textStyleNHg2 = textStyle3.nHg(new TextStyle(j22, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                    final MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource3;
                                    CompositionLocalKt.rl(TextSelectionColorsKt.rl().nr(textFieldColorsNr.getTextSelectionColors()), ComposableLambdaKt.nr(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i51) {
                                            if ((i51 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1163788208, i51, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                                            }
                                            Modifier modifier4 = modifier3;
                                            boolean z19 = z11;
                                            Strings.Companion companion = Strings.INSTANCE;
                                            Modifier modifierXMQ = TextFieldImplKt.xMQ(modifier4, z19, Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.nr), composer3, 0));
                                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f28299n;
                                            Modifier modifierN = SizeKt.n(modifierXMQ, textFieldDefaults.az(), textFieldDefaults.qie());
                                            SolidColor solidColor = new SolidColor(textFieldColorsNr.t(z11), null);
                                            final TextFieldValue textFieldValue3 = textFieldValue2;
                                            Function1 function13 = function12;
                                            final boolean z20 = z12;
                                            boolean z21 = z10;
                                            TextStyle textStyle5 = textStyleNHg2;
                                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                            KeyboardActions keyboardActions4 = keyboardActions2;
                                            final boolean z22 = z9;
                                            int i52 = i42;
                                            int i53 = i40;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource72;
                                            final boolean z23 = z11;
                                            final Function2 function228 = function214;
                                            final Function2 function229 = function216;
                                            final Function2 function230 = function215;
                                            final Function2 function231 = function210;
                                            final Function2 function232 = function211;
                                            final Function2 function233 = function212;
                                            final Function2 function234 = function213;
                                            final Shape shape4 = shape2;
                                            final TextFieldColors textFieldColors3 = textFieldColorsNr;
                                            BasicTextFieldKt.t(textFieldValue3, function13, modifierN, z20, z21, textStyle5, keyboardOptions4, keyboardActions4, z22, i52, i53, visualTransformation4, null, mutableInteractionSource8, solidColor, ComposableLambdaKt.nr(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$3.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function235, Composer composer4, Integer num) {
                                                    n(function235, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Function2 function235, Composer composer4, int i54) {
                                                    Composer composer5;
                                                    int i55;
                                                    if ((i54 & 6) == 0) {
                                                        composer5 = composer4;
                                                        i55 = i54 | (composer5.E2(function235) ? 4 : 2);
                                                    } else {
                                                        composer5 = composer4;
                                                        i55 = i54;
                                                    }
                                                    if ((i55 & 19) == 18 && composer5.xMQ()) {
                                                        composer5.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(1751957978, i55, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                                    }
                                                    TextFieldDefaults.f28299n.t(textFieldValue3.xMQ(), function235, z20, z22, visualTransformation4, mutableInteractionSource8, z23, function228, function229, function230, function231, function232, function233, function234, shape4, textFieldColors3, null, null, composer4, (i55 << 3) & 112, 100663296, 196608);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer3, 54), composer3, 0, 196608, 4096);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                                    if (ComposerKt.v()) {
                                    }
                                    textStyle4 = textStyle3;
                                    composer2 = composerKN;
                                    textFieldColors2 = textFieldColorsNr;
                                    z13 = z12;
                                    z14 = z10;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions3 = keyboardActions2;
                                    z15 = z9;
                                    i43 = i42;
                                    i44 = i40;
                                    visualTransformation3 = visualTransformation2;
                                    function217 = function214;
                                    function218 = function216;
                                    function219 = function211;
                                    function220 = function212;
                                    function221 = function213;
                                    shape3 = shape2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    z16 = z11;
                                    function222 = function210;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    final Modifier modifier4 = modifier3;
                                    final Function2 function228 = function215;
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i51) {
                                            TextFieldKt.n(textFieldValue, function1, modifier4, z13, z14, textStyle4, function217, function218, function228, function222, function219, function220, function221, z16, visualTransformation3, keyboardOptions3, keyboardActions3, z15, i43, i44, mutableInteractionSource4, shape3, textFieldColors2, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), RecomposeScopeImplKt.n(i8), i9);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i30 = i28 | 24576;
                            i31 = i9 & 32768;
                            if (i31 != 0) {
                            }
                            i32 = i9 & 65536;
                            if (i32 != 0) {
                            }
                            i33 = i9 & 131072;
                            if (i33 != 0) {
                            }
                            if ((i7 & 100663296) == 0) {
                            }
                            i34 = i9 & 524288;
                            if (i34 != 0) {
                            }
                            i35 = i9 & 1048576;
                            if (i35 != 0) {
                            }
                            if ((i8 & 48) == 0) {
                            }
                            if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            }
                            int i492 = i36;
                            if ((i24 & 306783379) == 306783378) {
                                composerKN.e();
                                if ((i5 & 1) != 0) {
                                    if (i45 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if ((i9 & 32) == 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    if (i27 == 0) {
                                    }
                                    if (i29 == 0) {
                                    }
                                    if (i31 == 0) {
                                    }
                                    if (i32 == 0) {
                                    }
                                    if (i33 == 0) {
                                    }
                                    if ((i9 & 262144) == 0) {
                                    }
                                    if (i34 == 0) {
                                    }
                                    if (i35 == 0) {
                                    }
                                    if ((i9 & 2097152) == 0) {
                                    }
                                    MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource5;
                                    if ((i9 & 4194304) == 0) {
                                    }
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i18 = i17;
                        i19 = i9 & 1024;
                        if (i19 == 0) {
                        }
                        i22 = i9 & 2048;
                        if (i22 == 0) {
                        }
                        int i462 = i21;
                        i24 = i10;
                        i25 = i9 & 4096;
                        if (i25 == 0) {
                        }
                        i27 = i9 & 8192;
                        if (i27 == 0) {
                        }
                        i29 = i9 & 16384;
                        if (i29 != 0) {
                        }
                        i31 = i9 & 32768;
                        if (i31 != 0) {
                        }
                        i32 = i9 & 65536;
                        if (i32 != 0) {
                        }
                        i33 = i9 & 131072;
                        if (i33 != 0) {
                        }
                        if ((i7 & 100663296) == 0) {
                        }
                        i34 = i9 & 524288;
                        if (i34 != 0) {
                        }
                        i35 = i9 & 1048576;
                        if (i35 != 0) {
                        }
                        if ((i8 & 48) == 0) {
                        }
                        if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        }
                        int i4922 = i36;
                        if ((i24 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i9 & 512;
                    if (i17 != 0) {
                    }
                    i18 = i17;
                    i19 = i9 & 1024;
                    if (i19 == 0) {
                    }
                    i22 = i9 & 2048;
                    if (i22 == 0) {
                    }
                    int i4622 = i21;
                    i24 = i10;
                    i25 = i9 & 4096;
                    if (i25 == 0) {
                    }
                    i27 = i9 & 8192;
                    if (i27 == 0) {
                    }
                    i29 = i9 & 16384;
                    if (i29 != 0) {
                    }
                    i31 = i9 & 32768;
                    if (i31 != 0) {
                    }
                    i32 = i9 & 65536;
                    if (i32 != 0) {
                    }
                    i33 = i9 & 131072;
                    if (i33 != 0) {
                    }
                    if ((i7 & 100663296) == 0) {
                    }
                    i34 = i9 & 524288;
                    if (i34 != 0) {
                    }
                    i35 = i9 & 1048576;
                    if (i35 != 0) {
                    }
                    if ((i8 & 48) == 0) {
                    }
                    if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    }
                    int i49222 = i36;
                    if ((i24 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z7 = z3;
                if ((i5 & 196608) != 0) {
                }
                i13 = i9 & 64;
                if (i13 == 0) {
                }
                i14 = i9 & 128;
                if (i14 == 0) {
                }
                i15 = i9 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i9 & 512;
                if (i17 != 0) {
                }
                i18 = i17;
                i19 = i9 & 1024;
                if (i19 == 0) {
                }
                i22 = i9 & 2048;
                if (i22 == 0) {
                }
                int i46222 = i21;
                i24 = i10;
                i25 = i9 & 4096;
                if (i25 == 0) {
                }
                i27 = i9 & 8192;
                if (i27 == 0) {
                }
                i29 = i9 & 16384;
                if (i29 != 0) {
                }
                i31 = i9 & 32768;
                if (i31 != 0) {
                }
                i32 = i9 & 65536;
                if (i32 != 0) {
                }
                i33 = i9 & 131072;
                if (i33 != 0) {
                }
                if ((i7 & 100663296) == 0) {
                }
                i34 = i9 & 524288;
                if (i34 != 0) {
                }
                i35 = i9 & 1048576;
                if (i35 != 0) {
                }
                if ((i8 & 48) == 0) {
                }
                if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                }
                int i492222 = i36;
                if ((i24 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z6 = z2;
            i12 = i9 & 16;
            if (i12 != 0) {
            }
            z7 = z3;
            if ((i5 & 196608) != 0) {
            }
            i13 = i9 & 64;
            if (i13 == 0) {
            }
            i14 = i9 & 128;
            if (i14 == 0) {
            }
            i15 = i9 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i9 & 512;
            if (i17 != 0) {
            }
            i18 = i17;
            i19 = i9 & 1024;
            if (i19 == 0) {
            }
            i22 = i9 & 2048;
            if (i22 == 0) {
            }
            int i462222 = i21;
            i24 = i10;
            i25 = i9 & 4096;
            if (i25 == 0) {
            }
            i27 = i9 & 8192;
            if (i27 == 0) {
            }
            i29 = i9 & 16384;
            if (i29 != 0) {
            }
            i31 = i9 & 32768;
            if (i31 != 0) {
            }
            i32 = i9 & 65536;
            if (i32 != 0) {
            }
            i33 = i9 & 131072;
            if (i33 != 0) {
            }
            if ((i7 & 100663296) == 0) {
            }
            i34 = i9 & 524288;
            if (i34 != 0) {
            }
            i35 = i9 & 1048576;
            if (i35 != 0) {
            }
            if ((i8 & 48) == 0) {
            }
            if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            int i4922222 = i36;
            if ((i24 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i11 = i9 & 8;
        if (i11 == 0) {
        }
        z6 = z2;
        i12 = i9 & 16;
        if (i12 != 0) {
        }
        z7 = z3;
        if ((i5 & 196608) != 0) {
        }
        i13 = i9 & 64;
        if (i13 == 0) {
        }
        i14 = i9 & 128;
        if (i14 == 0) {
        }
        i15 = i9 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i9 & 512;
        if (i17 != 0) {
        }
        i18 = i17;
        i19 = i9 & 1024;
        if (i19 == 0) {
        }
        i22 = i9 & 2048;
        if (i22 == 0) {
        }
        int i4622222 = i21;
        i24 = i10;
        i25 = i9 & 4096;
        if (i25 == 0) {
        }
        i27 = i9 & 8192;
        if (i27 == 0) {
        }
        i29 = i9 & 16384;
        if (i29 != 0) {
        }
        i31 = i9 & 32768;
        if (i31 != 0) {
        }
        i32 = i9 & 65536;
        if (i32 != 0) {
        }
        i33 = i9 & 131072;
        if (i33 != 0) {
        }
        if ((i7 & 100663296) == 0) {
        }
        i34 = i9 & 524288;
        if (i34 != 0) {
        }
        i35 = i9 & 1048576;
        if (i35 != 0) {
        }
        if ((i8 & 48) == 0) {
        }
        if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        int i49222222 = i36;
        if ((i24 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final String str, final Function1 function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i5, final int i7, final int i8, final int i9) {
        final String str2;
        int i10;
        final Function1 function12;
        Modifier modifier2;
        int i11;
        boolean z6;
        int i12;
        boolean z7;
        TextStyle textStyle2;
        int i13;
        Function2 function28;
        int i14;
        Function2 function29;
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
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        final Shape shape2;
        TextStyle textStyle3;
        final Modifier modifier3;
        final Function2 function210;
        int i39;
        final Function2 function211;
        final KeyboardActions keyboardActions2;
        final Function2 function212;
        final Function2 function213;
        final boolean z9;
        final int i40;
        MutableInteractionSource mutableInteractionSource2;
        final VisualTransformation visualTransformation2;
        final boolean z10;
        int i41;
        final Function2 function214;
        final Function2 function215;
        final boolean z11;
        final KeyboardOptions keyboardOptions2;
        final int i42;
        final TextFieldColors textFieldColorsNr;
        final Function2 function216;
        final boolean z12;
        MutableInteractionSource mutableInteractionSource3;
        long jKN;
        final TextStyle textStyle4;
        Composer composer2;
        final TextFieldColors textFieldColors2;
        final boolean z13;
        final boolean z14;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z15;
        final int i43;
        final int i44;
        final VisualTransformation visualTransformation3;
        final Function2 function217;
        final Function2 function218;
        final Function2 function219;
        final Function2 function220;
        final Function2 function221;
        final Shape shape3;
        final MutableInteractionSource mutableInteractionSource4;
        final boolean z16;
        final Function2 function222;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-676242365);
        if ((i9 & 1) != 0) {
            i10 = i5 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i5 & 6) == 0) {
                i10 = (composerKN.p5(str2) ? 4 : 2) | i5;
            } else {
                i10 = i5;
            }
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i5 & 48) == 0) {
                i10 |= composerKN.E2(function12) ? 32 : 16;
            }
        }
        int i45 = i9 & 4;
        if (i45 != 0) {
            i10 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i10 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i11 = i9 & 8;
            if (i11 == 0) {
                i10 |= 3072;
            } else {
                if ((i5 & 3072) == 0) {
                    z6 = z2;
                    i10 |= composerKN.n(z6) ? 2048 : 1024;
                }
                i12 = i9 & 16;
                if (i12 != 0) {
                    i10 |= 24576;
                } else {
                    if ((i5 & 24576) == 0) {
                        z7 = z3;
                        i10 |= composerKN.n(z7) ? 16384 : 8192;
                    }
                    if ((i5 & 196608) != 0) {
                        textStyle2 = textStyle;
                        i10 |= ((i9 & 32) == 0 && composerKN.p5(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i13 = i9 & 64;
                    if (i13 == 0) {
                        i10 |= 1572864;
                        function28 = function2;
                    } else {
                        function28 = function2;
                        if ((i5 & 1572864) == 0) {
                            i10 |= composerKN.E2(function28) ? 1048576 : 524288;
                        }
                    }
                    i14 = i9 & 128;
                    if (i14 == 0) {
                        i10 |= 12582912;
                        function29 = function22;
                    } else {
                        function29 = function22;
                        if ((i5 & 12582912) == 0) {
                            i10 |= composerKN.E2(function29) ? 8388608 : 4194304;
                        }
                    }
                    i15 = i9 & 256;
                    if (i15 == 0) {
                        i10 |= 100663296;
                    } else {
                        if ((i5 & 100663296) == 0) {
                            i16 = i15;
                            i10 |= composerKN.E2(function23) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i17 = i9 & 512;
                        if (i17 != 0) {
                            i10 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else {
                            if ((i5 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i18 = i17;
                                i10 |= composerKN.E2(function24) ? 536870912 : 268435456;
                            }
                            i19 = i9 & 1024;
                            if (i19 == 0) {
                                i21 = i7 | 6;
                                i20 = i19;
                            } else if ((i7 & 6) == 0) {
                                i20 = i19;
                                i21 = i7 | (composerKN.E2(function25) ? 4 : 2);
                            } else {
                                i20 = i19;
                                i21 = i7;
                            }
                            i22 = i9 & 2048;
                            if (i22 == 0) {
                                i21 |= 48;
                                i23 = i22;
                            } else if ((i7 & 48) == 0) {
                                i23 = i22;
                                i21 |= composerKN.E2(function26) ? 32 : 16;
                            } else {
                                i23 = i22;
                            }
                            int i46 = i21;
                            i24 = i10;
                            i25 = i9 & 4096;
                            if (i25 == 0) {
                                i26 = i46 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i47 = i46;
                                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i47 |= composerKN.E2(function27) ? 256 : 128;
                                }
                                i26 = i47;
                            }
                            i27 = i9 & 8192;
                            if (i27 == 0) {
                                i28 = i26 | 3072;
                            } else {
                                int i48 = i26;
                                if ((i7 & 3072) == 0) {
                                    i28 = i48 | (composerKN.n(z4) ? 2048 : 1024);
                                } else {
                                    i28 = i48;
                                }
                            }
                            i29 = i9 & 16384;
                            if (i29 != 0) {
                                i30 = i28;
                                if ((i7 & 24576) == 0) {
                                    i30 |= composerKN.p5(visualTransformation) ? 16384 : 8192;
                                }
                                i31 = i9 & 32768;
                                if (i31 != 0) {
                                    i30 |= 196608;
                                } else if ((i7 & 196608) == 0) {
                                    i30 |= composerKN.p5(keyboardOptions) ? 131072 : 65536;
                                }
                                i32 = i9 & 65536;
                                if (i32 != 0) {
                                    i30 |= 1572864;
                                } else if ((i7 & 1572864) == 0) {
                                    i30 |= composerKN.p5(keyboardActions) ? 1048576 : 524288;
                                }
                                i33 = i9 & 131072;
                                if (i33 != 0) {
                                    i30 |= 12582912;
                                } else if ((i7 & 12582912) == 0) {
                                    i30 |= composerKN.n(z5) ? 8388608 : 4194304;
                                }
                                if ((i7 & 100663296) == 0) {
                                    i30 |= ((i9 & 262144) == 0 && composerKN.t(i2)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                i34 = i9 & 524288;
                                if (i34 != 0) {
                                    i30 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                } else if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i30 |= composerKN.t(i3) ? 536870912 : 268435456;
                                }
                                i35 = i9 & 1048576;
                                if (i35 != 0) {
                                    i36 = i8 | 6;
                                } else if ((i8 & 6) == 0) {
                                    i36 = i8 | (composerKN.p5(mutableInteractionSource) ? 4 : 2);
                                } else {
                                    i36 = i8;
                                }
                                if ((i8 & 48) == 0) {
                                    i36 |= ((i9 & 2097152) == 0 && composerKN.p5(shape)) ? 32 : 16;
                                }
                                if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i36 |= ((i9 & 4194304) == 0 && composerKN.p5(textFieldColors)) ? 256 : 128;
                                }
                                int i49 = i36;
                                if ((i24 & 306783379) == 306783378 && (i30 & 306783379) == 306783378 && (i49 & 147) == 146 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    function215 = function23;
                                    function219 = function25;
                                    function220 = function26;
                                    function221 = function27;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions3 = keyboardActions;
                                    z15 = z5;
                                    i43 = i2;
                                    i44 = i3;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                    composer2 = composerKN;
                                    z13 = z6;
                                    z14 = z7;
                                    textStyle4 = textStyle2;
                                    function217 = function28;
                                    function218 = function29;
                                    modifier3 = modifier2;
                                    function222 = function24;
                                    z16 = z4;
                                    visualTransformation3 = visualTransformation;
                                } else {
                                    composerKN.e();
                                    if ((i5 & 1) != 0 || composerKN.rV9()) {
                                        if (i45 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i11 != 0) {
                                            z6 = true;
                                        }
                                        if (i12 != 0) {
                                            z7 = false;
                                        }
                                        if ((i9 & 32) == 0) {
                                            i37 = i24 & (-458753);
                                            textStyle2 = (TextStyle) composerKN.ty(TextKt.J2());
                                        } else {
                                            i37 = i24;
                                        }
                                        if (i13 != 0) {
                                            function28 = null;
                                        }
                                        if (i14 != 0) {
                                            function29 = null;
                                        }
                                        Function2 function223 = i16 == 0 ? null : function23;
                                        Function2 function224 = i18 == 0 ? null : function24;
                                        Function2 function225 = i20 == 0 ? null : function25;
                                        Function2 function226 = i23 == 0 ? null : function26;
                                        Function2 function227 = i25 == 0 ? null : function27;
                                        boolean z17 = i27 == 0 ? false : z4;
                                        VisualTransformation visualTransformationT = i29 == 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                        KeyboardOptions keyboardOptionsN = i31 == 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                        KeyboardActions keyboardActionsN = i32 == 0 ? KeyboardActions.INSTANCE.n() : keyboardActions;
                                        boolean z18 = i33 == 0 ? false : z5;
                                        if ((i9 & 262144) == 0) {
                                            i38 = z18 ? 1 : Integer.MAX_VALUE;
                                            i30 &= -234881025;
                                        } else {
                                            i38 = i2;
                                        }
                                        int i50 = i34 == 0 ? 1 : i3;
                                        MutableInteractionSource mutableInteractionSource5 = i35 == 0 ? mutableInteractionSource : null;
                                        Shape shapeTy = (i9 & 2097152) == 0 ? TextFieldDefaults.f28299n.ty(composerKN, 6) : shape;
                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                        if ((i9 & 4194304) == 0) {
                                            shape2 = shapeTy;
                                            function210 = function224;
                                            i39 = i30;
                                            function211 = function225;
                                            keyboardActions2 = keyboardActionsN;
                                            function212 = function226;
                                            function213 = function227;
                                            z9 = z18;
                                            i40 = i50;
                                            mutableInteractionSource2 = mutableInteractionSource6;
                                            visualTransformation2 = visualTransformationT;
                                            i41 = i37;
                                            function214 = function28;
                                            function215 = function223;
                                            z11 = z17;
                                            keyboardOptions2 = keyboardOptionsN;
                                            i42 = i38;
                                            textFieldColorsNr = TextFieldDefaults.f28299n.nr(composerKN, 6);
                                            textStyle3 = textStyle2;
                                            function216 = function29;
                                            modifier3 = modifier2;
                                        } else {
                                            shape2 = shapeTy;
                                            textStyle3 = textStyle2;
                                            modifier3 = modifier2;
                                            function210 = function224;
                                            i39 = i30;
                                            function211 = function225;
                                            keyboardActions2 = keyboardActionsN;
                                            function212 = function226;
                                            function213 = function227;
                                            z9 = z18;
                                            i40 = i50;
                                            mutableInteractionSource2 = mutableInteractionSource6;
                                            visualTransformation2 = visualTransformationT;
                                            z10 = z7;
                                            i41 = i37;
                                            function214 = function28;
                                            function215 = function223;
                                            z11 = z17;
                                            keyboardOptions2 = keyboardOptionsN;
                                            i42 = i38;
                                            textFieldColorsNr = textFieldColors;
                                            function216 = function29;
                                            z12 = z6;
                                            composerKN.S();
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-676242365, i41, i39, "androidx.compose.material3.TextField (TextField.kt:219)");
                                            }
                                            composerKN.eF(-508515290);
                                            if (mutableInteractionSource2 != null) {
                                                Object objIF = composerKN.iF();
                                                if (objIF == Composer.INSTANCE.n()) {
                                                    objIF = InteractionSourceKt.n();
                                                    composerKN.o(objIF);
                                                }
                                                mutableInteractionSource3 = (MutableInteractionSource) objIF;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                            }
                                            composerKN.Xw();
                                            composerKN.eF(-508509180);
                                            jKN = textStyle3.KN();
                                            if (jKN == 16) {
                                                jKN = textFieldColorsNr.az(z12, z11, ((Boolean) FocusInteractionKt.n(mutableInteractionSource3, composerKN, 0).getValue()).booleanValue());
                                            }
                                            long j2 = jKN;
                                            composerKN.Xw();
                                            final TextStyle textStyleNHg = textStyle3.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                            final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                            CompositionLocalKt.rl(TextSelectionColorsKt.rl().nr(textFieldColorsNr.getTextSelectionColors()), ComposableLambdaKt.nr(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    n(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Composer composer3, int i51) {
                                                    if ((i51 & 3) == 2 && composer3.xMQ()) {
                                                        composer3.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(1859145987, i51, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                                                    }
                                                    Modifier modifier4 = modifier3;
                                                    boolean z19 = z11;
                                                    Strings.Companion companion = Strings.INSTANCE;
                                                    Modifier modifierXMQ = TextFieldImplKt.xMQ(modifier4, z19, Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.nr), composer3, 0));
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f28299n;
                                                    Modifier modifierN = SizeKt.n(modifierXMQ, textFieldDefaults.az(), textFieldDefaults.qie());
                                                    SolidColor solidColor = new SolidColor(textFieldColorsNr.t(z11), null);
                                                    final String str3 = str2;
                                                    Function1 function13 = function12;
                                                    final boolean z20 = z12;
                                                    boolean z21 = z10;
                                                    TextStyle textStyle5 = textStyleNHg;
                                                    KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                                    KeyboardActions keyboardActions4 = keyboardActions2;
                                                    final boolean z22 = z9;
                                                    int i52 = i42;
                                                    int i53 = i40;
                                                    final VisualTransformation visualTransformation4 = visualTransformation2;
                                                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                                    final boolean z23 = z11;
                                                    final Function2 function228 = function214;
                                                    final Function2 function229 = function216;
                                                    final Function2 function230 = function215;
                                                    final Function2 function231 = function210;
                                                    final Function2 function232 = function211;
                                                    final Function2 function233 = function212;
                                                    final Function2 function234 = function213;
                                                    final Shape shape4 = shape2;
                                                    final TextFieldColors textFieldColors3 = textFieldColorsNr;
                                                    BasicTextFieldKt.O(str3, function13, modifierN, z20, z21, textStyle5, keyboardOptions4, keyboardActions4, z22, i52, i53, visualTransformation4, null, mutableInteractionSource8, solidColor, ComposableLambdaKt.nr(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function235, Composer composer4, Integer num) {
                                                            n(function235, composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(Function2 function235, Composer composer4, int i54) {
                                                            Composer composer5;
                                                            int i55;
                                                            if ((i54 & 6) == 0) {
                                                                composer5 = composer4;
                                                                i55 = i54 | (composer5.E2(function235) ? 4 : 2);
                                                            } else {
                                                                composer5 = composer4;
                                                                i55 = i54;
                                                            }
                                                            if ((i55 & 19) == 18 && composer5.xMQ()) {
                                                                composer5.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(-288211827, i55, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                                            }
                                                            TextFieldDefaults.f28299n.t(str3, function235, z20, z22, visualTransformation4, mutableInteractionSource8, z23, function228, function229, function230, function231, function232, function233, function234, shape4, textFieldColors3, null, null, composer4, (i55 << 3) & 112, 100663296, 196608);
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }, composer3, 54), composer3, 0, 196608, 4096);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            textStyle4 = textStyle3;
                                            composer2 = composerKN;
                                            textFieldColors2 = textFieldColorsNr;
                                            z13 = z12;
                                            z14 = z10;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions3 = keyboardActions2;
                                            z15 = z9;
                                            i43 = i42;
                                            i44 = i40;
                                            visualTransformation3 = visualTransformation2;
                                            function217 = function214;
                                            function218 = function216;
                                            function219 = function211;
                                            function220 = function212;
                                            function221 = function213;
                                            shape3 = shape2;
                                            mutableInteractionSource4 = mutableInteractionSource2;
                                            z16 = z11;
                                            function222 = function210;
                                        }
                                    } else {
                                        composerKN.wTp();
                                        i41 = (i9 & 32) != 0 ? i24 & (-458753) : i24;
                                        if ((262144 & i9) != 0) {
                                            i30 &= -234881025;
                                        }
                                        function215 = function23;
                                        function210 = function24;
                                        function211 = function25;
                                        function212 = function26;
                                        function213 = function27;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        z9 = z5;
                                        i42 = i2;
                                        i40 = i3;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape2 = shape;
                                        textFieldColorsNr = textFieldColors;
                                        textStyle3 = textStyle2;
                                        function214 = function28;
                                        function216 = function29;
                                        modifier3 = modifier2;
                                        i39 = i30;
                                        z11 = z4;
                                        keyboardActions2 = keyboardActions;
                                    }
                                    z12 = z6;
                                    z10 = z7;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    composerKN.eF(-508515290);
                                    if (mutableInteractionSource2 != null) {
                                    }
                                    composerKN.Xw();
                                    composerKN.eF(-508509180);
                                    jKN = textStyle3.KN();
                                    if (jKN == 16) {
                                    }
                                    long j22 = jKN;
                                    composerKN.Xw();
                                    final TextStyle textStyleNHg2 = textStyle3.nHg(new TextStyle(j22, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                    final MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource3;
                                    CompositionLocalKt.rl(TextSelectionColorsKt.rl().nr(textFieldColorsNr.getTextSelectionColors()), ComposableLambdaKt.nr(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i51) {
                                            if ((i51 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1859145987, i51, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                                            }
                                            Modifier modifier4 = modifier3;
                                            boolean z19 = z11;
                                            Strings.Companion companion = Strings.INSTANCE;
                                            Modifier modifierXMQ = TextFieldImplKt.xMQ(modifier4, z19, Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.nr), composer3, 0));
                                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f28299n;
                                            Modifier modifierN = SizeKt.n(modifierXMQ, textFieldDefaults.az(), textFieldDefaults.qie());
                                            SolidColor solidColor = new SolidColor(textFieldColorsNr.t(z11), null);
                                            final String str3 = str2;
                                            Function1 function13 = function12;
                                            final boolean z20 = z12;
                                            boolean z21 = z10;
                                            TextStyle textStyle5 = textStyleNHg2;
                                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                            KeyboardActions keyboardActions4 = keyboardActions2;
                                            final boolean z22 = z9;
                                            int i52 = i42;
                                            int i53 = i40;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource72;
                                            final boolean z23 = z11;
                                            final Function2 function228 = function214;
                                            final Function2 function229 = function216;
                                            final Function2 function230 = function215;
                                            final Function2 function231 = function210;
                                            final Function2 function232 = function211;
                                            final Function2 function233 = function212;
                                            final Function2 function234 = function213;
                                            final Shape shape4 = shape2;
                                            final TextFieldColors textFieldColors3 = textFieldColorsNr;
                                            BasicTextFieldKt.O(str3, function13, modifierN, z20, z21, textStyle5, keyboardOptions4, keyboardActions4, z22, i52, i53, visualTransformation4, null, mutableInteractionSource8, solidColor, ComposableLambdaKt.nr(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function235, Composer composer4, Integer num) {
                                                    n(function235, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void n(Function2 function235, Composer composer4, int i54) {
                                                    Composer composer5;
                                                    int i55;
                                                    if ((i54 & 6) == 0) {
                                                        composer5 = composer4;
                                                        i55 = i54 | (composer5.E2(function235) ? 4 : 2);
                                                    } else {
                                                        composer5 = composer4;
                                                        i55 = i54;
                                                    }
                                                    if ((i55 & 19) == 18 && composer5.xMQ()) {
                                                        composer5.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-288211827, i55, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                                    }
                                                    TextFieldDefaults.f28299n.t(str3, function235, z20, z22, visualTransformation4, mutableInteractionSource8, z23, function228, function229, function230, function231, function232, function233, function234, shape4, textFieldColors3, null, null, composer4, (i55 << 3) & 112, 100663296, 196608);
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.M7();
                                                    }
                                                }
                                            }, composer3, 54), composer3, 0, 196608, 4096);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
                                    if (ComposerKt.v()) {
                                    }
                                    textStyle4 = textStyle3;
                                    composer2 = composerKN;
                                    textFieldColors2 = textFieldColorsNr;
                                    z13 = z12;
                                    z14 = z10;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions3 = keyboardActions2;
                                    z15 = z9;
                                    i43 = i42;
                                    i44 = i40;
                                    visualTransformation3 = visualTransformation2;
                                    function217 = function214;
                                    function218 = function216;
                                    function219 = function211;
                                    function220 = function212;
                                    function221 = function213;
                                    shape3 = shape2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    z16 = z11;
                                    function222 = function210;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    final Modifier modifier4 = modifier3;
                                    final Function2 function228 = function215;
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i51) {
                                            TextFieldKt.rl(str, function1, modifier4, z13, z14, textStyle4, function217, function218, function228, function222, function219, function220, function221, z16, visualTransformation3, keyboardOptions3, keyboardActions3, z15, i43, i44, mutableInteractionSource4, shape3, textFieldColors2, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), RecomposeScopeImplKt.n(i8), i9);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i30 = i28 | 24576;
                            i31 = i9 & 32768;
                            if (i31 != 0) {
                            }
                            i32 = i9 & 65536;
                            if (i32 != 0) {
                            }
                            i33 = i9 & 131072;
                            if (i33 != 0) {
                            }
                            if ((i7 & 100663296) == 0) {
                            }
                            i34 = i9 & 524288;
                            if (i34 != 0) {
                            }
                            i35 = i9 & 1048576;
                            if (i35 != 0) {
                            }
                            if ((i8 & 48) == 0) {
                            }
                            if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            }
                            int i492 = i36;
                            if ((i24 & 306783379) == 306783378) {
                                composerKN.e();
                                if ((i5 & 1) != 0) {
                                    if (i45 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if ((i9 & 32) == 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    if (i27 == 0) {
                                    }
                                    if (i29 == 0) {
                                    }
                                    if (i31 == 0) {
                                    }
                                    if (i32 == 0) {
                                    }
                                    if (i33 == 0) {
                                    }
                                    if ((i9 & 262144) == 0) {
                                    }
                                    if (i34 == 0) {
                                    }
                                    if (i35 == 0) {
                                    }
                                    if ((i9 & 2097152) == 0) {
                                    }
                                    MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource5;
                                    if ((i9 & 4194304) == 0) {
                                    }
                                }
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i18 = i17;
                        i19 = i9 & 1024;
                        if (i19 == 0) {
                        }
                        i22 = i9 & 2048;
                        if (i22 == 0) {
                        }
                        int i462 = i21;
                        i24 = i10;
                        i25 = i9 & 4096;
                        if (i25 == 0) {
                        }
                        i27 = i9 & 8192;
                        if (i27 == 0) {
                        }
                        i29 = i9 & 16384;
                        if (i29 != 0) {
                        }
                        i31 = i9 & 32768;
                        if (i31 != 0) {
                        }
                        i32 = i9 & 65536;
                        if (i32 != 0) {
                        }
                        i33 = i9 & 131072;
                        if (i33 != 0) {
                        }
                        if ((i7 & 100663296) == 0) {
                        }
                        i34 = i9 & 524288;
                        if (i34 != 0) {
                        }
                        i35 = i9 & 1048576;
                        if (i35 != 0) {
                        }
                        if ((i8 & 48) == 0) {
                        }
                        if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                        }
                        int i4922 = i36;
                        if ((i24 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i9 & 512;
                    if (i17 != 0) {
                    }
                    i18 = i17;
                    i19 = i9 & 1024;
                    if (i19 == 0) {
                    }
                    i22 = i9 & 2048;
                    if (i22 == 0) {
                    }
                    int i4622 = i21;
                    i24 = i10;
                    i25 = i9 & 4096;
                    if (i25 == 0) {
                    }
                    i27 = i9 & 8192;
                    if (i27 == 0) {
                    }
                    i29 = i9 & 16384;
                    if (i29 != 0) {
                    }
                    i31 = i9 & 32768;
                    if (i31 != 0) {
                    }
                    i32 = i9 & 65536;
                    if (i32 != 0) {
                    }
                    i33 = i9 & 131072;
                    if (i33 != 0) {
                    }
                    if ((i7 & 100663296) == 0) {
                    }
                    i34 = i9 & 524288;
                    if (i34 != 0) {
                    }
                    i35 = i9 & 1048576;
                    if (i35 != 0) {
                    }
                    if ((i8 & 48) == 0) {
                    }
                    if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    }
                    int i49222 = i36;
                    if ((i24 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                z7 = z3;
                if ((i5 & 196608) != 0) {
                }
                i13 = i9 & 64;
                if (i13 == 0) {
                }
                i14 = i9 & 128;
                if (i14 == 0) {
                }
                i15 = i9 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i9 & 512;
                if (i17 != 0) {
                }
                i18 = i17;
                i19 = i9 & 1024;
                if (i19 == 0) {
                }
                i22 = i9 & 2048;
                if (i22 == 0) {
                }
                int i46222 = i21;
                i24 = i10;
                i25 = i9 & 4096;
                if (i25 == 0) {
                }
                i27 = i9 & 8192;
                if (i27 == 0) {
                }
                i29 = i9 & 16384;
                if (i29 != 0) {
                }
                i31 = i9 & 32768;
                if (i31 != 0) {
                }
                i32 = i9 & 65536;
                if (i32 != 0) {
                }
                i33 = i9 & 131072;
                if (i33 != 0) {
                }
                if ((i7 & 100663296) == 0) {
                }
                i34 = i9 & 524288;
                if (i34 != 0) {
                }
                i35 = i9 & 1048576;
                if (i35 != 0) {
                }
                if ((i8 & 48) == 0) {
                }
                if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                }
                int i492222 = i36;
                if ((i24 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z6 = z2;
            i12 = i9 & 16;
            if (i12 != 0) {
            }
            z7 = z3;
            if ((i5 & 196608) != 0) {
            }
            i13 = i9 & 64;
            if (i13 == 0) {
            }
            i14 = i9 & 128;
            if (i14 == 0) {
            }
            i15 = i9 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i9 & 512;
            if (i17 != 0) {
            }
            i18 = i17;
            i19 = i9 & 1024;
            if (i19 == 0) {
            }
            i22 = i9 & 2048;
            if (i22 == 0) {
            }
            int i462222 = i21;
            i24 = i10;
            i25 = i9 & 4096;
            if (i25 == 0) {
            }
            i27 = i9 & 8192;
            if (i27 == 0) {
            }
            i29 = i9 & 16384;
            if (i29 != 0) {
            }
            i31 = i9 & 32768;
            if (i31 != 0) {
            }
            i32 = i9 & 65536;
            if (i32 != 0) {
            }
            i33 = i9 & 131072;
            if (i33 != 0) {
            }
            if ((i7 & 100663296) == 0) {
            }
            i34 = i9 & 524288;
            if (i34 != 0) {
            }
            i35 = i9 & 1048576;
            if (i35 != 0) {
            }
            if ((i8 & 48) == 0) {
            }
            if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            }
            int i4922222 = i36;
            if ((i24 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i11 = i9 & 8;
        if (i11 == 0) {
        }
        z6 = z2;
        i12 = i9 & 16;
        if (i12 != 0) {
        }
        z7 = z3;
        if ((i5 & 196608) != 0) {
        }
        i13 = i9 & 64;
        if (i13 == 0) {
        }
        i14 = i9 & 128;
        if (i14 == 0) {
        }
        i15 = i9 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i9 & 512;
        if (i17 != 0) {
        }
        i18 = i17;
        i19 = i9 & 1024;
        if (i19 == 0) {
        }
        i22 = i9 & 2048;
        if (i22 == 0) {
        }
        int i4622222 = i21;
        i24 = i10;
        i25 = i9 & 4096;
        if (i25 == 0) {
        }
        i27 = i9 & 8192;
        if (i27 == 0) {
        }
        i29 = i9 & 16384;
        if (i29 != 0) {
        }
        i31 = i9 & 32768;
        if (i31 != 0) {
        }
        i32 = i9 & 65536;
        if (i32 != 0) {
        }
        i33 = i9 & 131072;
        if (i33 != 0) {
        }
        if ((i7 & 100663296) == 0) {
        }
        i34 = i9 & 524288;
        if (i34 != 0) {
        }
        i35 = i9 & 1048576;
        if (i35 != 0) {
        }
        if ((i8 & 48) == 0) {
        }
        if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
        }
        int i49222222 = i36;
        if ((i24 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final void t(final Modifier modifier, Function2 function2, final Function2 function22, final Function3 function3, final Function2 function23, final Function2 function24, final Function2 function25, final Function2 function26, final boolean z2, final float f3, final Function2 function27, Function2 function28, PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        float f4;
        final Function2 function29;
        final Function2 function210;
        Composer composerKN = composer.KN(-1830307184);
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerKN.p5(modifier) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function22) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= composerKN.E2(function24) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= composerKN.E2(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= composerKN.E2(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= composerKN.n(z2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i5 |= composerKN.rl(f3) ? 536870912 : 268435456;
        }
        int i9 = i5;
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.E2(function27) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(function28) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            paddingValues2 = paddingValues;
            i7 |= composerKN.p5(paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        int i10 = i7;
        if ((i9 & 306783379) == 306783378 && (i10 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            function29 = function2;
            function210 = function28;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1830307184, i9, i10, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            boolean z3 = ((1879048192 & i9) == 536870912) | ((234881024 & i9) == 67108864) | ((i10 & 896) == 256);
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new TextFieldMeasurePolicy(z2, f3, paddingValues2);
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
            function27.invoke(composerKN, Integer.valueOf(i10 & 14));
            composerKN.eF(1341517187);
            if (function23 != null) {
                Modifier modifierZmq = LayoutIdKt.rl(Modifier.INSTANCE, "Leading").Zmq(TextFieldImplKt.gh());
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierZmq);
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
                function23.invoke(composerKN, Integer.valueOf((i9 >> 12) & 14));
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.eF(1341526310);
            if (function24 != null) {
                Modifier modifierZmq2 = LayoutIdKt.rl(Modifier.INSTANCE, "Trailing").Zmq(TextFieldImplKt.gh());
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierZmq2);
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
                function24.invoke(composerKN, Integer.valueOf((i9 >> 15) & 14));
                composerKN.XQ();
            }
            composerKN.Xw();
            float fUo = PaddingKt.Uo(paddingValues2, layoutDirection);
            float fJ2 = PaddingKt.J2(paddingValues2, layoutDirection);
            if (function23 != null) {
                i8 = 0;
                fUo = Dp.KN(RangesKt.coerceAtLeast(Dp.KN(fUo - TextFieldImplKt.mUb()), Dp.KN(0)));
            } else {
                i8 = 0;
            }
            float fKN = fUo;
            if (function24 != null) {
                fJ2 = Dp.KN(RangesKt.coerceAtLeast(Dp.KN(fJ2 - TextFieldImplKt.mUb()), Dp.KN(i8)));
            }
            composerKN.eF(1341556924);
            if (function25 != null) {
                Modifier modifierAz = PaddingKt.az(SizeKt.iF(SizeKt.gh(LayoutIdKt.rl(Modifier.INSTANCE, "Prefix"), TextFieldImplKt.HI(), 0.0f, 2, null), null, false, 3, null), fKN, 0.0f, TextFieldImplKt.ck(), 0.0f, 10, null);
                MeasurePolicy measurePolicyUo3 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN4 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierAz);
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
                function25.invoke(composerKN, Integer.valueOf((i9 >> 18) & 14));
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.eF(1341568890);
            if (function26 != null) {
                float f5 = fJ2;
                Modifier modifierAz2 = PaddingKt.az(SizeKt.iF(SizeKt.gh(LayoutIdKt.rl(Modifier.INSTANCE, "Suffix"), TextFieldImplKt.HI(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.ck(), 0.0f, f5, 0.0f, 10, null);
                f4 = f5;
                MeasurePolicy measurePolicyUo4 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN5 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk5 = composerKN.Ik();
                Modifier modifierO5 = ComposedModifierKt.O(composerKN, modifierAz2);
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
                function26.invoke(composerKN, Integer.valueOf((i9 >> 21) & 14));
                composerKN.XQ();
            } else {
                f4 = fJ2;
            }
            composerKN.Xw();
            composerKN.eF(1341581092);
            if (function22 != null) {
                Modifier modifierAz3 = PaddingKt.az(SizeKt.iF(SizeKt.gh(LayoutIdKt.rl(Modifier.INSTANCE, "Label"), DpKt.t(TextFieldImplKt.HI(), TextFieldImplKt.az(), f3), 0.0f, 2, null), null, false, 3, null), fKN, 0.0f, f4, 0.0f, 10, null);
                MeasurePolicy measurePolicyUo5 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN6 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk6 = composerKN.Ik();
                Modifier modifierO6 = ComposedModifierKt.O(composerKN, modifierAz3);
                Function0 function0N6 = companion.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N6);
                } else {
                    composerKN.r();
                }
                Composer composerN6 = Updater.n(composerKN);
                Updater.O(composerN6, measurePolicyUo5, companion.t());
                Updater.O(composerN6, compositionLocalMapIk6, companion.O());
                Function2 function2Rl6 = companion.rl();
                if (composerN6.getInserting() || !Intrinsics.areEqual(composerN6.iF(), Integer.valueOf(iN6))) {
                    composerN6.o(Integer.valueOf(iN6));
                    composerN6.az(Integer.valueOf(iN6), function2Rl6);
                }
                Updater.O(composerN6, modifierO6, companion.nr());
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.f17448n;
                function22.invoke(composerKN, Integer.valueOf((i9 >> 6) & 14));
                composerKN.XQ();
            }
            composerKN.Xw();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierIF = SizeKt.iF(SizeKt.gh(companion2, TextFieldImplKt.HI(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                fKN = Dp.KN(0);
            }
            Modifier modifierAz4 = PaddingKt.az(modifierIF, fKN, 0.0f, function26 == null ? f4 : Dp.KN(0), 0.0f, 10, null);
            composerKN.eF(1341611627);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.rl(companion2, "Hint").Zmq(modifierAz4), composerKN, Integer.valueOf((i9 >> 6) & 112));
            }
            composerKN.Xw();
            Modifier modifierZmq3 = LayoutIdKt.rl(companion2, "TextField").Zmq(modifierAz4);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo6 = BoxKt.Uo(companion3.HI(), true);
            int iN7 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk7 = composerKN.Ik();
            Modifier modifierO7 = ComposedModifierKt.O(composerKN, modifierZmq3);
            Function0 function0N7 = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N7);
            } else {
                composerKN.r();
            }
            Composer composerN7 = Updater.n(composerKN);
            Updater.O(composerN7, measurePolicyUo6, companion.t());
            Updater.O(composerN7, compositionLocalMapIk7, companion.O());
            Function2 function2Rl7 = companion.rl();
            if (composerN7.getInserting() || !Intrinsics.areEqual(composerN7.iF(), Integer.valueOf(iN7))) {
                composerN7.o(Integer.valueOf(iN7));
                composerN7.az(Integer.valueOf(iN7), function2Rl7);
            }
            Updater.O(composerN7, modifierO7, companion.nr());
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.f17448n;
            function29 = function2;
            function29.invoke(composerKN, Integer.valueOf((i9 >> 3) & 14));
            composerKN.XQ();
            composerKN.eF(1341622624);
            if (function28 != null) {
                Modifier modifierKN = PaddingKt.KN(SizeKt.iF(SizeKt.gh(LayoutIdKt.rl(companion2, "Supporting"), TextFieldImplKt.ty(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.r(TextFieldDefaults.f28299n, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                MeasurePolicy measurePolicyUo7 = BoxKt.Uo(companion3.HI(), false);
                int iN8 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk8 = composerKN.Ik();
                Modifier modifierO8 = ComposedModifierKt.O(composerKN, modifierKN);
                Function0 function0N8 = companion.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N8);
                } else {
                    composerKN.r();
                }
                Composer composerN8 = Updater.n(composerKN);
                Updater.O(composerN8, measurePolicyUo7, companion.t());
                Updater.O(composerN8, compositionLocalMapIk8, companion.O());
                Function2 function2Rl8 = companion.rl();
                if (composerN8.getInserting() || !Intrinsics.areEqual(composerN8.iF(), Integer.valueOf(iN8))) {
                    composerN8.o(Integer.valueOf(iN8));
                    composerN8.az(Integer.valueOf(iN8), function2Rl8);
                }
                Updater.O(composerN8, modifierO8, companion.nr());
                function210 = function28;
                function210.invoke(composerKN, Integer.valueOf((i10 >> 3) & 14));
                composerKN.XQ();
            } else {
                function210 = function28;
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final PaddingValues paddingValues3 = paddingValues2;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt$TextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i11) {
                    TextFieldKt.t(modifier, function29, function22, function3, function23, function24, function25, function26, z2, f3, function27, function210, paddingValues3, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int xMQ(int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, float f3, long j2, float f4, PaddingValues paddingValues) {
        boolean z2 = i3 > 0;
        float fKN = Dp.KN(paddingValues.getTop() + paddingValues.getBottom()) * f4;
        if (z2) {
            fKN = MathHelpersKt.rl(Dp.KN(TextFieldImplKt.r() * 2) * f4, fKN, f3);
        }
        return Math.max(Constraints.az(j2), Math.max(i5, Math.max(i7, MathKt.roundToInt(fKN + MathHelpersKt.t(0, i3, f3) + ComparisonsKt.maxOf(i2, i10, i8, i9, MathHelpersKt.t(i3, 0, f3))))) + i11);
    }

    private static final int HI(boolean z2, int i2, int i3, Placeable placeable) {
        return z2 ? Alignment.INSTANCE.xMQ().n(placeable.getHeight(), i2) : i3;
    }

    public static final Modifier gh(Modifier modifier, final State state) {
        return DrawModifierKt.nr(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TextFieldKt$drawIndicatorLine$1
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
                float fL = contentDrawScope.l(((BorderStroke) state.getValue()).getWidth());
                float fXMQ = Size.xMQ(contentDrawScope.t()) - (fL / 2);
                DrawScope.c32(contentDrawScope, ((BorderStroke) state.getValue()).getBrush(), OffsetKt.n(0.0f, fXMQ), OffsetKt.n(Size.gh(contentDrawScope.t()), fXMQ), fL, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float qie() {
        return f28346n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ty(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z2, float f3, PaddingValues paddingValues) {
        Placeable.PlacementScope.gh(placementScope, placeable7, IntOffset.INSTANCE.rl(), 0.0f, 2, null);
        int iZ = i3 - TextFieldImplKt.Z(placeable8);
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f3);
        if (placeable3 != null) {
            Placeable.PlacementScope.az(placementScope, placeable3, 0, Alignment.INSTANCE.xMQ().n(placeable3.getHeight(), iZ), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.az(placementScope, placeable5, TextFieldImplKt.S(placeable3), HI(z2, iZ, iRoundToInt, placeable5), 0.0f, 4, null);
        }
        int iS = TextFieldImplKt.S(placeable5) + TextFieldImplKt.S(placeable3);
        Placeable.PlacementScope.az(placementScope, placeable, iS, HI(z2, iZ, iRoundToInt, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.az(placementScope, placeable2, iS, HI(z2, iZ, iRoundToInt, placeable2), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.az(placementScope, placeable6, (i2 - TextFieldImplKt.S(placeable4)) - placeable6.getWidth(), HI(z2, iZ, iRoundToInt, placeable6), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.az(placementScope, placeable4, i2 - placeable4.getWidth(), Alignment.INSTANCE.xMQ().n(placeable4.getHeight(), iZ), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.az(placementScope, placeable8, 0, iZ, 0.0f, 4, null);
        }
    }
}
