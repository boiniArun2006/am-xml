package androidx.compose.material3;

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
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÚ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'\u001aÚ\u0002\u0010)\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b)\u0010*\u001a\u0082\u0002\u00106\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b6\u00107\u001a\u001b\u00109\u001a\u00020\u001d*\u00020\u001d2\u0006\u00108\u001a\u00020\u001dH\u0002¢\u0006\u0004\b9\u0010:\u001aj\u0010E\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020.2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020.2\u0006\u00105\u001a\u000204H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001ar\u0010O\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020.2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020.2\u0006\u00105\u001a\u000204H\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a¡\u0001\u0010`\u001a\u00020\u0003*\u00020Q2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020\u001d2\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010V\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010T2\b\u0010X\u001a\u0004\u0018\u00010T2\u0006\u0010Y\u001a\u00020T2\b\u0010Z\u001a\u0004\u0018\u00010T2\b\u0010[\u001a\u0004\u0018\u00010T2\u0006\u0010\\\u001a\u00020T2\b\u0010]\u001a\u0004\u0018\u00010T2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010D\u001a\u00020.2\u0006\u0010_\u001a\u00020^2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b`\u0010a\u001a)\u0010c\u001a\u00020\u0005*\u00020\u00052\f\u0010b\u001a\b\u0012\u0004\u0012\u0002000\f2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\bc\u0010d\"\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010f\"\u001a\u0010l\u001a\u00020h8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010i\u001a\u0004\bj\u0010k\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006m"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", "rl", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", c.f62177j, "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", TtmlNode.RUBY_CONTAINER, "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "t", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "from", "HI", "(II)I", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "density", "mUb", "(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "xMQ", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "width", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "az", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZFLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;)V", "labelSize", "qie", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/TextUnit;", "J", "gh", "()J", "OutlinedTextFieldTopPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,1155:1\n77#2:1156\n77#2:1165\n77#2:1166\n77#2:1175\n77#2:1182\n1223#3,6:1157\n1223#3,6:1167\n1223#3,6:1176\n708#4:1163\n696#4:1164\n708#4:1173\n696#4:1174\n78#5,6:1183\n85#5,4:1198\n89#5,2:1208\n78#5,6:1217\n85#5,4:1232\n89#5,2:1242\n93#5:1248\n78#5,6:1256\n85#5,4:1271\n89#5,2:1281\n93#5:1287\n78#5,6:1302\n85#5,4:1317\n89#5,2:1327\n93#5:1333\n78#5,6:1342\n85#5,4:1357\n89#5,2:1367\n93#5:1373\n78#5,6:1384\n85#5,4:1399\n89#5,2:1409\n93#5:1415\n78#5,6:1424\n85#5,4:1439\n89#5,2:1449\n93#5:1455\n78#5,6:1464\n85#5,4:1479\n89#5,2:1489\n93#5:1495\n93#5:1499\n368#6,9:1189\n377#6:1210\n368#6,9:1223\n377#6:1244\n378#6,2:1246\n368#6,9:1262\n377#6:1283\n378#6,2:1285\n368#6,9:1308\n377#6:1329\n378#6,2:1331\n368#6,9:1348\n377#6:1369\n378#6,2:1371\n368#6,9:1390\n377#6:1411\n378#6,2:1413\n368#6,9:1430\n377#6:1451\n378#6,2:1453\n368#6,9:1470\n377#6:1491\n378#6,2:1493\n378#6,2:1497\n4032#7,6:1202\n4032#7,6:1236\n4032#7,6:1275\n4032#7,6:1321\n4032#7,6:1361\n4032#7,6:1403\n4032#7,6:1443\n4032#7,6:1483\n71#8:1211\n69#8,5:1212\n74#8:1245\n78#8:1249\n71#8:1250\n69#8,5:1251\n74#8:1284\n78#8:1288\n71#8:1295\n68#8,6:1296\n74#8:1330\n78#8:1334\n71#8:1335\n68#8,6:1336\n74#8:1370\n78#8:1374\n71#8:1377\n68#8,6:1378\n74#8:1412\n78#8:1416\n71#8:1417\n68#8,6:1418\n74#8:1452\n78#8:1456\n71#8:1457\n68#8,6:1458\n74#8:1492\n78#8:1496\n56#9:1289\n56#9:1292\n50#9:1500\n148#10:1290\n205#10:1291\n148#10:1293\n205#10:1294\n148#10:1375\n148#10:1376\n148#10:1501\n134#11,2:1502\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n*L\n176#1:1156\n205#1:1165\n351#1:1166\n380#1:1175\n479#1:1182\n196#1:1157,6\n371#1:1167,6\n471#1:1176,6\n199#1:1163\n199#1:1164\n374#1:1173\n374#1:1174\n480#1:1183,6\n480#1:1198,4\n480#1:1208,2\n486#1:1217,6\n486#1:1232,4\n486#1:1242,2\n486#1:1248\n494#1:1256,6\n494#1:1271,4\n494#1:1281,2\n494#1:1287\n519#1:1302,6\n519#1:1317,4\n519#1:1327,2\n519#1:1333\n529#1:1342,6\n529#1:1357,4\n529#1:1367,2\n529#1:1373\n551#1:1384,6\n551#1:1399,4\n551#1:1409,2\n551#1:1415\n559#1:1424,6\n559#1:1439,4\n559#1:1449,2\n559#1:1455\n576#1:1464,6\n576#1:1479,4\n576#1:1489,2\n576#1:1495\n480#1:1499\n480#1:1189,9\n480#1:1210\n486#1:1223,9\n486#1:1244\n486#1:1246,2\n494#1:1262,9\n494#1:1283\n494#1:1285,2\n519#1:1308,9\n519#1:1329\n519#1:1331,2\n529#1:1348,9\n529#1:1369\n529#1:1371,2\n551#1:1390,9\n551#1:1411\n551#1:1413,2\n559#1:1430,9\n559#1:1451\n559#1:1453,2\n576#1:1470,9\n576#1:1491\n576#1:1493,2\n480#1:1497,2\n480#1:1202,6\n486#1:1236,6\n494#1:1275,6\n519#1:1321,6\n529#1:1361,6\n551#1:1403,6\n559#1:1443,6\n576#1:1483,6\n486#1:1211\n486#1:1212,5\n486#1:1245\n486#1:1249\n494#1:1250\n494#1:1251,5\n494#1:1284\n494#1:1288\n519#1:1295\n519#1:1296,6\n519#1:1330\n519#1:1334\n529#1:1335\n529#1:1336,6\n529#1:1370\n529#1:1374\n551#1:1377\n551#1:1378,6\n551#1:1412\n551#1:1416\n559#1:1417\n559#1:1418,6\n559#1:1452\n559#1:1456\n576#1:1457\n576#1:1458,6\n576#1:1492\n576#1:1496\n507#1:1289\n513#1:1292\n966#1:1500\n507#1:1290\n507#1:1291\n513#1:1293\n513#1:1294\n543#1:1375\n544#1:1376\n1146#1:1501\n1154#1:1502,2\n*E\n"})
public final class OutlinedTextFieldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f26849n = Dp.KN(4);
    private static final long rl;

    static {
        long jQie = TypeScaleTokens.f30008n.qie();
        TextUnitKt.rl(jQie);
        rl = TextUnitKt.mUb(TextUnit.J2(jQie), TextUnit.KN(jQie) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int HI(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f3, boolean z2, float f4, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Placeable placeable10;
        boolean z3;
        int i5;
        int i7;
        Placeable.PlacementScope.gh(placementScope, placeable8, IntOffset.INSTANCE.rl(), 0.0f, 2, null);
        int iZ = i2 - TextFieldImplKt.Z(placeable9);
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f4);
        int iRoundToInt2 = MathKt.roundToInt(PaddingKt.Uo(paddingValues, layoutDirection) * f4);
        float fMUb = TextFieldImplKt.mUb() * f4;
        if (placeable != null) {
            Placeable.PlacementScope.az(placementScope, placeable, 0, Alignment.INSTANCE.xMQ().n(placeable.getHeight(), iZ), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            placeable10 = placeable6;
            Placeable.PlacementScope.az(placementScope, placeable10, MathKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.S(placeable) - fMUb) * (1 - f3)) + iRoundToInt2, MathHelpersKt.t(z2 ? Alignment.INSTANCE.xMQ().n(placeable6.getHeight(), iZ) : iRoundToInt, -(placeable6.getHeight() / 2), f3), 0.0f, 4, null);
        } else {
            placeable10 = placeable6;
        }
        if (placeable3 != null) {
            i7 = iRoundToInt;
            i5 = iZ;
            z3 = z2;
            Placeable.PlacementScope.az(placementScope, placeable3, TextFieldImplKt.S(placeable), ty(z2, iZ, iRoundToInt, placeable10, placeable3), 0.0f, 4, null);
        } else {
            z3 = z2;
            i5 = iZ;
            i7 = iRoundToInt;
        }
        int iS = TextFieldImplKt.S(placeable) + TextFieldImplKt.S(placeable3);
        Placeable.PlacementScope.az(placementScope, placeable5, iS, ty(z3, i5, i7, placeable10, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.az(placementScope, placeable7, iS, ty(z3, i5, i7, placeable10, placeable7), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.az(placementScope, placeable4, (i3 - TextFieldImplKt.S(placeable2)) - placeable4.getWidth(), ty(z3, i5, i7, placeable10, placeable4), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.az(placementScope, placeable2, i3 - placeable2.getWidth(), Alignment.INSTANCE.xMQ().n(placeable2.getHeight(), i5), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.az(placementScope, placeable9, 0, i5, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mUb(int i2, int i3, int i5, int i7, int i8, int i9, int i10, float f3, long j2, float f4, PaddingValues paddingValues) {
        int i11 = i5 + i7;
        int iMax = i2 + Math.max(i8 + i11, Math.max(i10 + i11, MathHelpersKt.t(i9, 0, f3))) + i3;
        LayoutDirection layoutDirection = LayoutDirection.f34160n;
        return Math.max(iMax, Math.max(MathKt.roundToInt((i9 + (Dp.KN(paddingValues.rl(layoutDirection) + paddingValues.t(layoutDirection)) * f4)) * f3), Constraints.ty(j2)));
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
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
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
        final Function2 function28;
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
        final Function2 function210;
        final Modifier modifier3;
        final Function2 function211;
        int i39;
        final Function2 function212;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final Function2 function213;
        final Function2 function214;
        final boolean z9;
        final int i40;
        final int i41;
        MutableInteractionSource mutableInteractionSource2;
        final TextFieldColors textFieldColorsNr;
        final VisualTransformation visualTransformation2;
        int i42;
        final Function2 function215;
        final boolean z10;
        final boolean z11;
        int i43;
        MutableInteractionSource mutableInteractionSource3;
        long jKN;
        final TextStyle textStyle4;
        Composer composer2;
        final Function2 function216;
        final boolean z12;
        final boolean z13;
        final boolean z14;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z15;
        final int i44;
        final int i45;
        final VisualTransformation visualTransformation3;
        final Function2 function217;
        final Function2 function218;
        final Function2 function219;
        final Function2 function220;
        final Shape shape3;
        final MutableInteractionSource mutableInteractionSource4;
        final TextFieldColors textFieldColors2;
        final Function2 function221;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1570442800);
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
        int i46 = i9 & 4;
        if (i46 != 0) {
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
                            int i47 = i21;
                            i24 = i10;
                            i25 = i9 & 4096;
                            if (i25 == 0) {
                                i26 = i47 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i48 = i47;
                                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i48 |= composerKN.E2(function27) ? 256 : 128;
                                }
                                i26 = i48;
                            }
                            i27 = i9 & 8192;
                            if (i27 == 0) {
                                i28 = i26 | 3072;
                            } else {
                                int i49 = i26;
                                if ((i7 & 3072) == 0) {
                                    i28 = i49 | (composerKN.n(z4) ? 2048 : 1024);
                                } else {
                                    i28 = i49;
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
                                int i50 = i36;
                                if ((i24 & 306783379) == 306783378 && (i30 & 306783379) == 306783378 && (i50 & 147) == 146 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    function210 = function23;
                                    function219 = function25;
                                    z12 = z4;
                                    visualTransformation3 = visualTransformation;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions3 = keyboardActions;
                                    z15 = z5;
                                    i44 = i2;
                                    i45 = i3;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                    composer2 = composerKN;
                                    z13 = z6;
                                    z14 = z7;
                                    textStyle4 = textStyle2;
                                    function216 = function28;
                                    function217 = function29;
                                    modifier3 = modifier2;
                                    function218 = function24;
                                    function220 = function26;
                                    function221 = function27;
                                } else {
                                    composerKN.e();
                                    if ((i5 & 1) != 0 || composerKN.rV9()) {
                                        if (i46 != 0) {
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
                                        Function2 function222 = i16 == 0 ? null : function23;
                                        Function2 function223 = i18 == 0 ? null : function24;
                                        Function2 function224 = i20 == 0 ? null : function25;
                                        Function2 function225 = i23 == 0 ? null : function26;
                                        Function2 function226 = i25 == 0 ? null : function27;
                                        boolean z16 = i27 == 0 ? false : z4;
                                        VisualTransformation visualTransformationT = i29 == 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                        KeyboardOptions keyboardOptionsN = i31 == 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                        KeyboardActions keyboardActionsN = i32 == 0 ? KeyboardActions.INSTANCE.n() : keyboardActions;
                                        boolean z17 = i33 == 0 ? false : z5;
                                        if ((i9 & 262144) == 0) {
                                            i38 = z17 ? 1 : Integer.MAX_VALUE;
                                            i30 &= -234881025;
                                        } else {
                                            i38 = i2;
                                        }
                                        int i51 = i34 == 0 ? 1 : i3;
                                        MutableInteractionSource mutableInteractionSource5 = i35 == 0 ? mutableInteractionSource : null;
                                        Shape shapeQie = (i9 & 2097152) == 0 ? OutlinedTextFieldDefaults.f26813n.qie(composerKN, 6) : shape;
                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                        if ((i9 & 4194304) == 0) {
                                            Modifier modifier4 = modifier2;
                                            textFieldColorsNr = OutlinedTextFieldDefaults.f26813n.nr(composerKN, 6);
                                            textStyle3 = textStyle2;
                                            modifier3 = modifier4;
                                            shape2 = shapeQie;
                                            function210 = function222;
                                            function211 = function223;
                                            i39 = i30;
                                            function212 = function224;
                                            keyboardOptions2 = keyboardOptionsN;
                                            keyboardActions2 = keyboardActionsN;
                                            function213 = function225;
                                            function214 = function226;
                                            z9 = z17;
                                            i40 = i38;
                                            i41 = i51;
                                            mutableInteractionSource2 = mutableInteractionSource6;
                                        } else {
                                            shape2 = shapeQie;
                                            textStyle3 = textStyle2;
                                            function210 = function222;
                                            modifier3 = modifier2;
                                            function211 = function223;
                                            i39 = i30;
                                            function212 = function224;
                                            keyboardOptions2 = keyboardOptionsN;
                                            keyboardActions2 = keyboardActionsN;
                                            function213 = function225;
                                            function214 = function226;
                                            z9 = z17;
                                            i40 = i38;
                                            i41 = i51;
                                            mutableInteractionSource2 = mutableInteractionSource6;
                                            textFieldColorsNr = textFieldColors;
                                        }
                                        visualTransformation2 = visualTransformationT;
                                        i42 = i37;
                                        function215 = function29;
                                        z10 = z16;
                                        z11 = z7;
                                        i43 = 0;
                                    } else {
                                        composerKN.wTp();
                                        i42 = (i9 & 32) != 0 ? i24 & (-458753) : i24;
                                        if ((262144 & i9) != 0) {
                                            i30 &= -234881025;
                                        }
                                        function210 = function23;
                                        function211 = function24;
                                        function212 = function25;
                                        function213 = function26;
                                        function214 = function27;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z9 = z5;
                                        i40 = i2;
                                        i41 = i3;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape2 = shape;
                                        z11 = z7;
                                        textStyle3 = textStyle2;
                                        function215 = function29;
                                        modifier3 = modifier2;
                                        i39 = i30;
                                        i43 = 0;
                                        z10 = z4;
                                        textFieldColorsNr = textFieldColors;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1570442800, i42, i39, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:368)");
                                    }
                                    composerKN.eF(30368324);
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
                                    composerKN.eF(30374434);
                                    jKN = textStyle3.KN();
                                    if (jKN == 16) {
                                        jKN = textFieldColorsNr.az(z6, z10, ((Boolean) FocusInteractionKt.n(mutableInteractionSource3, composerKN, i43).getValue()).booleanValue());
                                    }
                                    long j2 = jKN;
                                    composerKN.Xw();
                                    final TextStyle textStyleNHg = textStyle3.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                    final Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                    final boolean z18 = z6;
                                    CompositionLocalKt.rl(TextSelectionColorsKt.rl().nr(textFieldColorsNr.getTextSelectionColors()), ComposableLambdaKt.nr(1830921872, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i52) {
                                            if ((i52 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1830921872, i52, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:382)");
                                            }
                                            Modifier modifierZmq = modifier3.Zmq(function28 != null ? PaddingKt.az(SemanticsModifierKt.t(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3.1
                                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    n(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), 0.0f, density.Z(OutlinedTextFieldKt.gh()), 0.0f, 0.0f, 13, null) : Modifier.INSTANCE);
                                            boolean z19 = z10;
                                            Strings.Companion companion = Strings.INSTANCE;
                                            Modifier modifierXMQ = TextFieldImplKt.xMQ(modifierZmq, z19, Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.nr), composer3, 0));
                                            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f26813n;
                                            Modifier modifierN = SizeKt.n(modifierXMQ, outlinedTextFieldDefaults.gh(), outlinedTextFieldDefaults.mUb());
                                            SolidColor solidColor = new SolidColor(textFieldColorsNr.t(z10), null);
                                            final TextFieldValue textFieldValue3 = textFieldValue2;
                                            Function1 function13 = function12;
                                            final boolean z20 = z18;
                                            boolean z21 = z11;
                                            TextStyle textStyle5 = textStyleNHg;
                                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                            KeyboardActions keyboardActions4 = keyboardActions2;
                                            final boolean z22 = z9;
                                            int i53 = i40;
                                            int i54 = i41;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                            final boolean z23 = z10;
                                            final Function2 function227 = function28;
                                            final Function2 function228 = function215;
                                            final Function2 function229 = function210;
                                            final Function2 function230 = function211;
                                            final Function2 function231 = function212;
                                            final Function2 function232 = function213;
                                            final Function2 function233 = function214;
                                            final TextFieldColors textFieldColors3 = textFieldColorsNr;
                                            final Shape shape4 = shape2;
                                            BasicTextFieldKt.t(textFieldValue3, function13, modifierN, z20, z21, textStyle5, keyboardOptions4, keyboardActions4, z22, i53, i54, visualTransformation4, null, mutableInteractionSource8, solidColor, ComposableLambdaKt.nr(-757328870, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function234, Composer composer4, Integer num) {
                                                    n(function234, composer4, num.intValue());
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
                                                public final void n(Function2 function234, Composer composer4, int i55) {
                                                    int i56;
                                                    if ((i55 & 6) == 0) {
                                                        i56 = i55 | (composer4.E2(function234) ? 4 : 2);
                                                    } else {
                                                        i56 = i55;
                                                    }
                                                    if ((i56 & 19) == 18 && composer4.xMQ()) {
                                                        composer4.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-757328870, i56, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:416)");
                                                    }
                                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.f26813n;
                                                    String strXMQ = textFieldValue3.xMQ();
                                                    final boolean z24 = z20;
                                                    boolean z25 = z22;
                                                    VisualTransformation visualTransformation5 = visualTransformation4;
                                                    final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                    final boolean z26 = z23;
                                                    Function2 function235 = function227;
                                                    Function2 function236 = function228;
                                                    Function2 function237 = function229;
                                                    Function2 function238 = function230;
                                                    Function2 function239 = function231;
                                                    Function2 function240 = function232;
                                                    Function2 function241 = function233;
                                                    final TextFieldColors textFieldColors4 = textFieldColors3;
                                                    final Shape shape5 = shape4;
                                                    outlinedTextFieldDefaults2.t(strXMQ, function234, z24, z25, visualTransformation5, mutableInteractionSource9, z26, function235, function236, function237, function238, function239, function240, function241, textFieldColors4, null, ComposableLambdaKt.nr(255570733, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            n(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(Composer composer5, int i57) {
                                                            if ((i57 & 3) == 2 && composer5.xMQ()) {
                                                                composer5.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(255570733, i57, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                                            }
                                                            OutlinedTextFieldDefaults.f26813n.n(z24, z26, mutableInteractionSource9, null, textFieldColors4, shape5, 0.0f, 0.0f, composer5, 100663296, 200);
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }, composer4, 54), composer4, (i56 << 3) & 112, 14155776, 32768);
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
                                    function216 = function28;
                                    z12 = z10;
                                    z13 = z18;
                                    z14 = z11;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions3 = keyboardActions2;
                                    z15 = z9;
                                    i44 = i40;
                                    i45 = i41;
                                    visualTransformation3 = visualTransformation2;
                                    function217 = function215;
                                    function218 = function211;
                                    function219 = function212;
                                    function220 = function213;
                                    shape3 = shape2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    textFieldColors2 = textFieldColorsNr;
                                    function221 = function214;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    final Function2 function227 = function210;
                                    final Modifier modifier5 = modifier3;
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i52) {
                                            OutlinedTextFieldKt.n(textFieldValue, function1, modifier5, z13, z14, textStyle4, function216, function217, function227, function218, function219, function220, function221, z12, visualTransformation3, keyboardOptions3, keyboardActions3, z15, i44, i45, mutableInteractionSource4, shape3, textFieldColors2, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), RecomposeScopeImplKt.n(i8), i9);
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
                            int i502 = i36;
                            if ((i24 & 306783379) == 306783378) {
                                composerKN.e();
                                if ((i5 & 1) != 0) {
                                    if (i46 != 0) {
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
                                    visualTransformation2 = visualTransformationT;
                                    i42 = i37;
                                    function215 = function29;
                                    z10 = z16;
                                    z11 = z7;
                                    i43 = 0;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    composerKN.eF(30368324);
                                    if (mutableInteractionSource2 != null) {
                                    }
                                    composerKN.Xw();
                                    composerKN.eF(30374434);
                                    jKN = textStyle3.KN();
                                    if (jKN == 16) {
                                    }
                                    long j22 = jKN;
                                    composerKN.Xw();
                                    final TextStyle textStyleNHg2 = textStyle3.nHg(new TextStyle(j22, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                    final Density density2 = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                    final MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource3;
                                    final boolean z182 = z6;
                                    CompositionLocalKt.rl(TextSelectionColorsKt.rl().nr(textFieldColorsNr.getTextSelectionColors()), ComposableLambdaKt.nr(1830921872, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i52) {
                                            if ((i52 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(1830921872, i52, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:382)");
                                            }
                                            Modifier modifierZmq = modifier3.Zmq(function28 != null ? PaddingKt.az(SemanticsModifierKt.t(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3.1
                                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    n(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), 0.0f, density2.Z(OutlinedTextFieldKt.gh()), 0.0f, 0.0f, 13, null) : Modifier.INSTANCE);
                                            boolean z19 = z10;
                                            Strings.Companion companion = Strings.INSTANCE;
                                            Modifier modifierXMQ = TextFieldImplKt.xMQ(modifierZmq, z19, Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.nr), composer3, 0));
                                            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f26813n;
                                            Modifier modifierN = SizeKt.n(modifierXMQ, outlinedTextFieldDefaults.gh(), outlinedTextFieldDefaults.mUb());
                                            SolidColor solidColor = new SolidColor(textFieldColorsNr.t(z10), null);
                                            final TextFieldValue textFieldValue3 = textFieldValue2;
                                            Function1 function13 = function12;
                                            final boolean z20 = z182;
                                            boolean z21 = z11;
                                            TextStyle textStyle5 = textStyleNHg2;
                                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                            KeyboardActions keyboardActions4 = keyboardActions2;
                                            final boolean z22 = z9;
                                            int i53 = i40;
                                            int i54 = i41;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource72;
                                            final boolean z23 = z10;
                                            final Function2 function2272 = function28;
                                            final Function2 function228 = function215;
                                            final Function2 function229 = function210;
                                            final Function2 function230 = function211;
                                            final Function2 function231 = function212;
                                            final Function2 function232 = function213;
                                            final Function2 function233 = function214;
                                            final TextFieldColors textFieldColors3 = textFieldColorsNr;
                                            final Shape shape4 = shape2;
                                            BasicTextFieldKt.t(textFieldValue3, function13, modifierN, z20, z21, textStyle5, keyboardOptions4, keyboardActions4, z22, i53, i54, visualTransformation4, null, mutableInteractionSource8, solidColor, ComposableLambdaKt.nr(-757328870, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function234, Composer composer4, Integer num) {
                                                    n(function234, composer4, num.intValue());
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
                                                public final void n(Function2 function234, Composer composer4, int i55) {
                                                    int i56;
                                                    if ((i55 & 6) == 0) {
                                                        i56 = i55 | (composer4.E2(function234) ? 4 : 2);
                                                    } else {
                                                        i56 = i55;
                                                    }
                                                    if ((i56 & 19) == 18 && composer4.xMQ()) {
                                                        composer4.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(-757328870, i56, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:416)");
                                                    }
                                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.f26813n;
                                                    String strXMQ = textFieldValue3.xMQ();
                                                    final boolean z24 = z20;
                                                    boolean z25 = z22;
                                                    VisualTransformation visualTransformation5 = visualTransformation4;
                                                    final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                    final boolean z26 = z23;
                                                    Function2 function235 = function2272;
                                                    Function2 function236 = function228;
                                                    Function2 function237 = function229;
                                                    Function2 function238 = function230;
                                                    Function2 function239 = function231;
                                                    Function2 function240 = function232;
                                                    Function2 function241 = function233;
                                                    final TextFieldColors textFieldColors4 = textFieldColors3;
                                                    final Shape shape5 = shape4;
                                                    outlinedTextFieldDefaults2.t(strXMQ, function234, z24, z25, visualTransformation5, mutableInteractionSource9, z26, function235, function236, function237, function238, function239, function240, function241, textFieldColors4, null, ComposableLambdaKt.nr(255570733, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            n(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(Composer composer5, int i57) {
                                                            if ((i57 & 3) == 2 && composer5.xMQ()) {
                                                                composer5.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(255570733, i57, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                                            }
                                                            OutlinedTextFieldDefaults.f26813n.n(z24, z26, mutableInteractionSource9, null, textFieldColors4, shape5, 0.0f, 0.0f, composer5, 100663296, 200);
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }, composer4, 54), composer4, (i56 << 3) & 112, 14155776, 32768);
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
                                    function216 = function28;
                                    z12 = z10;
                                    z13 = z182;
                                    z14 = z11;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions3 = keyboardActions2;
                                    z15 = z9;
                                    i44 = i40;
                                    i45 = i41;
                                    visualTransformation3 = visualTransformation2;
                                    function217 = function215;
                                    function218 = function211;
                                    function219 = function212;
                                    function220 = function213;
                                    shape3 = shape2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    textFieldColors2 = textFieldColorsNr;
                                    function221 = function214;
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
                        int i472 = i21;
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
                        int i5022 = i36;
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
                    int i4722 = i21;
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
                    int i50222 = i36;
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
                int i47222 = i21;
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
                int i502222 = i36;
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
            int i472222 = i21;
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
            int i5022222 = i36;
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
        int i4722222 = i21;
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
        int i50222222 = i36;
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
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
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
        final Function2 function28;
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
        final Function2 function210;
        final Modifier modifier3;
        final Function2 function211;
        int i39;
        final Function2 function212;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final Function2 function213;
        final Function2 function214;
        final boolean z9;
        final int i40;
        final int i41;
        MutableInteractionSource mutableInteractionSource2;
        final TextFieldColors textFieldColorsNr;
        final VisualTransformation visualTransformation2;
        int i42;
        final Function2 function215;
        final boolean z10;
        final boolean z11;
        int i43;
        MutableInteractionSource mutableInteractionSource3;
        long jKN;
        final TextStyle textStyle4;
        Composer composer2;
        final Function2 function216;
        final boolean z12;
        final boolean z13;
        final boolean z14;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z15;
        final int i44;
        final int i45;
        final VisualTransformation visualTransformation3;
        final Function2 function217;
        final Function2 function218;
        final Function2 function219;
        final Function2 function220;
        final Shape shape3;
        final MutableInteractionSource mutableInteractionSource4;
        final TextFieldColors textFieldColors2;
        final Function2 function221;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1922450045);
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
        int i46 = i9 & 4;
        if (i46 != 0) {
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
                            int i47 = i21;
                            i24 = i10;
                            i25 = i9 & 4096;
                            if (i25 == 0) {
                                i26 = i47 | RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else {
                                int i48 = i47;
                                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i48 |= composerKN.E2(function27) ? 256 : 128;
                                }
                                i26 = i48;
                            }
                            i27 = i9 & 8192;
                            if (i27 == 0) {
                                i28 = i26 | 3072;
                            } else {
                                int i49 = i26;
                                if ((i7 & 3072) == 0) {
                                    i28 = i49 | (composerKN.n(z4) ? 2048 : 1024);
                                } else {
                                    i28 = i49;
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
                                int i50 = i36;
                                if ((i24 & 306783379) == 306783378 && (i30 & 306783379) == 306783378 && (i50 & 147) == 146 && composerKN.xMQ()) {
                                    composerKN.wTp();
                                    function210 = function23;
                                    function219 = function25;
                                    z12 = z4;
                                    visualTransformation3 = visualTransformation;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions3 = keyboardActions;
                                    z15 = z5;
                                    i44 = i2;
                                    i45 = i3;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                    composer2 = composerKN;
                                    z13 = z6;
                                    z14 = z7;
                                    textStyle4 = textStyle2;
                                    function216 = function28;
                                    function217 = function29;
                                    modifier3 = modifier2;
                                    function218 = function24;
                                    function220 = function26;
                                    function221 = function27;
                                } else {
                                    composerKN.e();
                                    if ((i5 & 1) != 0 || composerKN.rV9()) {
                                        if (i46 != 0) {
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
                                        Function2 function222 = i16 == 0 ? null : function23;
                                        Function2 function223 = i18 == 0 ? null : function24;
                                        Function2 function224 = i20 == 0 ? null : function25;
                                        Function2 function225 = i23 == 0 ? null : function26;
                                        Function2 function226 = i25 == 0 ? null : function27;
                                        boolean z16 = i27 == 0 ? false : z4;
                                        VisualTransformation visualTransformationT = i29 == 0 ? VisualTransformation.INSTANCE.t() : visualTransformation;
                                        KeyboardOptions keyboardOptionsN = i31 == 0 ? KeyboardOptions.INSTANCE.n() : keyboardOptions;
                                        KeyboardActions keyboardActionsN = i32 == 0 ? KeyboardActions.INSTANCE.n() : keyboardActions;
                                        boolean z17 = i33 == 0 ? false : z5;
                                        if ((i9 & 262144) == 0) {
                                            i38 = z17 ? 1 : Integer.MAX_VALUE;
                                            i30 &= -234881025;
                                        } else {
                                            i38 = i2;
                                        }
                                        int i51 = i34 == 0 ? 1 : i3;
                                        MutableInteractionSource mutableInteractionSource5 = i35 == 0 ? mutableInteractionSource : null;
                                        Shape shapeQie = (i9 & 2097152) == 0 ? OutlinedTextFieldDefaults.f26813n.qie(composerKN, 6) : shape;
                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                        if ((i9 & 4194304) == 0) {
                                            Modifier modifier4 = modifier2;
                                            textFieldColorsNr = OutlinedTextFieldDefaults.f26813n.nr(composerKN, 6);
                                            textStyle3 = textStyle2;
                                            modifier3 = modifier4;
                                            shape2 = shapeQie;
                                            function210 = function222;
                                            function211 = function223;
                                            i39 = i30;
                                            function212 = function224;
                                            keyboardOptions2 = keyboardOptionsN;
                                            keyboardActions2 = keyboardActionsN;
                                            function213 = function225;
                                            function214 = function226;
                                            z9 = z17;
                                            i40 = i38;
                                            i41 = i51;
                                            mutableInteractionSource2 = mutableInteractionSource6;
                                        } else {
                                            shape2 = shapeQie;
                                            textStyle3 = textStyle2;
                                            function210 = function222;
                                            modifier3 = modifier2;
                                            function211 = function223;
                                            i39 = i30;
                                            function212 = function224;
                                            keyboardOptions2 = keyboardOptionsN;
                                            keyboardActions2 = keyboardActionsN;
                                            function213 = function225;
                                            function214 = function226;
                                            z9 = z17;
                                            i40 = i38;
                                            i41 = i51;
                                            mutableInteractionSource2 = mutableInteractionSource6;
                                            textFieldColorsNr = textFieldColors;
                                        }
                                        visualTransformation2 = visualTransformationT;
                                        i42 = i37;
                                        function215 = function29;
                                        z10 = z16;
                                        z11 = z7;
                                        i43 = 0;
                                    } else {
                                        composerKN.wTp();
                                        i42 = (i9 & 32) != 0 ? i24 & (-458753) : i24;
                                        if ((262144 & i9) != 0) {
                                            i30 &= -234881025;
                                        }
                                        function210 = function23;
                                        function211 = function24;
                                        function212 = function25;
                                        function213 = function26;
                                        function214 = function27;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions2 = keyboardActions;
                                        z9 = z5;
                                        i40 = i2;
                                        i41 = i3;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape2 = shape;
                                        z11 = z7;
                                        textStyle3 = textStyle2;
                                        function215 = function29;
                                        modifier3 = modifier2;
                                        i39 = i30;
                                        i43 = 0;
                                        z10 = z4;
                                        textFieldColorsNr = textFieldColors;
                                    }
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1922450045, i42, i39, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:193)");
                                    }
                                    composerKN.eF(30062948);
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
                                    composerKN.eF(30069058);
                                    jKN = textStyle3.KN();
                                    if (jKN == 16) {
                                        jKN = textFieldColorsNr.az(z6, z10, ((Boolean) FocusInteractionKt.n(mutableInteractionSource3, composerKN, i43).getValue()).booleanValue());
                                    }
                                    long j2 = jKN;
                                    composerKN.Xw();
                                    final TextStyle textStyleNHg = textStyle3.nHg(new TextStyle(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                    final Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                                    final boolean z18 = z6;
                                    CompositionLocalKt.rl(TextSelectionColorsKt.rl().nr(textFieldColorsNr.getTextSelectionColors()), ComposableLambdaKt.nr(-1886965181, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i52) {
                                            if ((i52 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1886965181, i52, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:207)");
                                            }
                                            Modifier modifierZmq = modifier3.Zmq(function28 != null ? PaddingKt.az(SemanticsModifierKt.t(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1.1
                                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    n(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), 0.0f, density.Z(OutlinedTextFieldKt.gh()), 0.0f, 0.0f, 13, null) : Modifier.INSTANCE);
                                            boolean z19 = z10;
                                            Strings.Companion companion = Strings.INSTANCE;
                                            Modifier modifierXMQ = TextFieldImplKt.xMQ(modifierZmq, z19, Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.nr), composer3, 0));
                                            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f26813n;
                                            Modifier modifierN = SizeKt.n(modifierXMQ, outlinedTextFieldDefaults.gh(), outlinedTextFieldDefaults.mUb());
                                            SolidColor solidColor = new SolidColor(textFieldColorsNr.t(z10), null);
                                            final String str3 = str2;
                                            Function1 function13 = function12;
                                            final boolean z20 = z18;
                                            boolean z21 = z11;
                                            TextStyle textStyle5 = textStyleNHg;
                                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                            KeyboardActions keyboardActions4 = keyboardActions2;
                                            final boolean z22 = z9;
                                            int i53 = i40;
                                            int i54 = i41;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource7;
                                            final boolean z23 = z10;
                                            final Function2 function227 = function28;
                                            final Function2 function228 = function215;
                                            final Function2 function229 = function210;
                                            final Function2 function230 = function211;
                                            final Function2 function231 = function212;
                                            final Function2 function232 = function213;
                                            final Function2 function233 = function214;
                                            final TextFieldColors textFieldColors3 = textFieldColorsNr;
                                            final Shape shape4 = shape2;
                                            BasicTextFieldKt.O(str3, function13, modifierN, z20, z21, textStyle5, keyboardOptions4, keyboardActions4, z22, i53, i54, visualTransformation4, null, mutableInteractionSource8, solidColor, ComposableLambdaKt.nr(1474611661, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function234, Composer composer4, Integer num) {
                                                    n(function234, composer4, num.intValue());
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
                                                public final void n(Function2 function234, Composer composer4, int i55) {
                                                    int i56;
                                                    if ((i55 & 6) == 0) {
                                                        i56 = i55 | (composer4.E2(function234) ? 4 : 2);
                                                    } else {
                                                        i56 = i55;
                                                    }
                                                    if ((i56 & 19) == 18 && composer4.xMQ()) {
                                                        composer4.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(1474611661, i56, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:241)");
                                                    }
                                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.f26813n;
                                                    int i57 = i56;
                                                    String str4 = str3;
                                                    final boolean z24 = z20;
                                                    boolean z25 = z22;
                                                    VisualTransformation visualTransformation5 = visualTransformation4;
                                                    final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                    final boolean z26 = z23;
                                                    Function2 function235 = function227;
                                                    Function2 function236 = function228;
                                                    Function2 function237 = function229;
                                                    Function2 function238 = function230;
                                                    Function2 function239 = function231;
                                                    Function2 function240 = function232;
                                                    Function2 function241 = function233;
                                                    final TextFieldColors textFieldColors4 = textFieldColors3;
                                                    final Shape shape5 = shape4;
                                                    outlinedTextFieldDefaults2.t(str4, function234, z24, z25, visualTransformation5, mutableInteractionSource9, z26, function235, function236, function237, function238, function239, function240, function241, textFieldColors4, null, ComposableLambdaKt.nr(2108828640, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            n(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(Composer composer5, int i58) {
                                                            if ((i58 & 3) == 2 && composer5.xMQ()) {
                                                                composer5.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(2108828640, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                                            }
                                                            OutlinedTextFieldDefaults.f26813n.n(z24, z26, mutableInteractionSource9, null, textFieldColors4, shape5, 0.0f, 0.0f, composer5, 100663296, 200);
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }, composer4, 54), composer4, (i57 << 3) & 112, 14155776, 32768);
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
                                    function216 = function28;
                                    z12 = z10;
                                    z13 = z18;
                                    z14 = z11;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions3 = keyboardActions2;
                                    z15 = z9;
                                    i44 = i40;
                                    i45 = i41;
                                    visualTransformation3 = visualTransformation2;
                                    function217 = function215;
                                    function218 = function211;
                                    function219 = function212;
                                    function220 = function213;
                                    shape3 = shape2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    textFieldColors2 = textFieldColorsNr;
                                    function221 = function214;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    final Function2 function227 = function210;
                                    final Modifier modifier5 = modifier3;
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i52) {
                                            OutlinedTextFieldKt.rl(str, function1, modifier5, z13, z14, textStyle4, function216, function217, function227, function218, function219, function220, function221, z12, visualTransformation3, keyboardOptions3, keyboardActions3, z15, i44, i45, mutableInteractionSource4, shape3, textFieldColors2, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), RecomposeScopeImplKt.n(i8), i9);
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
                            int i502 = i36;
                            if ((i24 & 306783379) == 306783378) {
                                composerKN.e();
                                if ((i5 & 1) != 0) {
                                    if (i46 != 0) {
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
                                    visualTransformation2 = visualTransformationT;
                                    i42 = i37;
                                    function215 = function29;
                                    z10 = z16;
                                    z11 = z7;
                                    i43 = 0;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                    }
                                    composerKN.eF(30062948);
                                    if (mutableInteractionSource2 != null) {
                                    }
                                    composerKN.Xw();
                                    composerKN.eF(30069058);
                                    jKN = textStyle3.KN();
                                    if (jKN == 16) {
                                    }
                                    long j22 = jKN;
                                    composerKN.Xw();
                                    final TextStyle textStyleNHg2 = textStyle3.nHg(new TextStyle(j22, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
                                    final Density density2 = (Density) composerKN.ty(CompositionLocalsKt.J2());
                                    final MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource3;
                                    final boolean z182 = z6;
                                    CompositionLocalKt.rl(TextSelectionColorsKt.rl().nr(textFieldColorsNr.getTextSelectionColors()), ComposableLambdaKt.nr(-1886965181, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i52) {
                                            if ((i52 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1886965181, i52, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:207)");
                                            }
                                            Modifier modifierZmq = modifier3.Zmq(function28 != null ? PaddingKt.az(SemanticsModifierKt.t(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1.1
                                                public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    n(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), 0.0f, density2.Z(OutlinedTextFieldKt.gh()), 0.0f, 0.0f, 13, null) : Modifier.INSTANCE);
                                            boolean z19 = z10;
                                            Strings.Companion companion = Strings.INSTANCE;
                                            Modifier modifierXMQ = TextFieldImplKt.xMQ(modifierZmq, z19, Strings_androidKt.n(Strings.n(androidx.compose.ui.R.string.nr), composer3, 0));
                                            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f26813n;
                                            Modifier modifierN = SizeKt.n(modifierXMQ, outlinedTextFieldDefaults.gh(), outlinedTextFieldDefaults.mUb());
                                            SolidColor solidColor = new SolidColor(textFieldColorsNr.t(z10), null);
                                            final String str3 = str2;
                                            Function1 function13 = function12;
                                            final boolean z20 = z182;
                                            boolean z21 = z11;
                                            TextStyle textStyle5 = textStyleNHg2;
                                            KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                            KeyboardActions keyboardActions4 = keyboardActions2;
                                            final boolean z22 = z9;
                                            int i53 = i40;
                                            int i54 = i41;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource72;
                                            final boolean z23 = z10;
                                            final Function2 function2272 = function28;
                                            final Function2 function228 = function215;
                                            final Function2 function229 = function210;
                                            final Function2 function230 = function211;
                                            final Function2 function231 = function212;
                                            final Function2 function232 = function213;
                                            final Function2 function233 = function214;
                                            final TextFieldColors textFieldColors3 = textFieldColorsNr;
                                            final Shape shape4 = shape2;
                                            BasicTextFieldKt.O(str3, function13, modifierN, z20, z21, textStyle5, keyboardOptions4, keyboardActions4, z22, i53, i54, visualTransformation4, null, mutableInteractionSource8, solidColor, ComposableLambdaKt.nr(1474611661, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function234, Composer composer4, Integer num) {
                                                    n(function234, composer4, num.intValue());
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
                                                public final void n(Function2 function234, Composer composer4, int i55) {
                                                    int i56;
                                                    if ((i55 & 6) == 0) {
                                                        i56 = i55 | (composer4.E2(function234) ? 4 : 2);
                                                    } else {
                                                        i56 = i55;
                                                    }
                                                    if ((i56 & 19) == 18 && composer4.xMQ()) {
                                                        composer4.wTp();
                                                        return;
                                                    }
                                                    if (ComposerKt.v()) {
                                                        ComposerKt.p5(1474611661, i56, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:241)");
                                                    }
                                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.f26813n;
                                                    int i57 = i56;
                                                    String str4 = str3;
                                                    final boolean z24 = z20;
                                                    boolean z25 = z22;
                                                    VisualTransformation visualTransformation5 = visualTransformation4;
                                                    final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                    final boolean z26 = z23;
                                                    Function2 function235 = function2272;
                                                    Function2 function236 = function228;
                                                    Function2 function237 = function229;
                                                    Function2 function238 = function230;
                                                    Function2 function239 = function231;
                                                    Function2 function240 = function232;
                                                    Function2 function241 = function233;
                                                    final TextFieldColors textFieldColors4 = textFieldColors3;
                                                    final Shape shape5 = shape4;
                                                    outlinedTextFieldDefaults2.t(str4, function234, z24, z25, visualTransformation5, mutableInteractionSource9, z26, function235, function236, function237, function238, function239, function240, function241, textFieldColors4, null, ComposableLambdaKt.nr(2108828640, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            n(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void n(Composer composer5, int i58) {
                                                            if ((i58 & 3) == 2 && composer5.xMQ()) {
                                                                composer5.wTp();
                                                                return;
                                                            }
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.p5(2108828640, i58, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                                            }
                                                            OutlinedTextFieldDefaults.f26813n.n(z24, z26, mutableInteractionSource9, null, textFieldColors4, shape5, 0.0f, 0.0f, composer5, 100663296, 200);
                                                            if (ComposerKt.v()) {
                                                                ComposerKt.M7();
                                                            }
                                                        }
                                                    }, composer4, 54), composer4, (i57 << 3) & 112, 14155776, 32768);
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
                                    function216 = function28;
                                    z12 = z10;
                                    z13 = z182;
                                    z14 = z11;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions3 = keyboardActions2;
                                    z15 = z9;
                                    i44 = i40;
                                    i45 = i41;
                                    visualTransformation3 = visualTransformation2;
                                    function217 = function215;
                                    function218 = function211;
                                    function219 = function212;
                                    function220 = function213;
                                    shape3 = shape2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    textFieldColors2 = textFieldColorsNr;
                                    function221 = function214;
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
                        int i472 = i21;
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
                        int i5022 = i36;
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
                    int i4722 = i21;
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
                    int i50222 = i36;
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
                int i47222 = i21;
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
                int i502222 = i36;
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
            int i472222 = i21;
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
            int i5022222 = i36;
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
        int i4722222 = i21;
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
        int i50222222 = i36;
        if ((i24 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    public static final void t(final Modifier modifier, final Function2 function2, final Function3 function3, Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final Function2 function26, final boolean z2, final float f3, final Function1 function1, final Function2 function27, Function2 function28, PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        PaddingValues paddingValues2;
        int i8;
        float f4;
        final Function2 function29;
        Function2 function210;
        Composer composerKN = composer.KN(1408290209);
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerKN.p5(modifier) ? 4 : 2);
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
            i7 = i3 | (composerKN.E2(function1) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(function27) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(function28) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            paddingValues2 = paddingValues;
            i7 |= composerKN.p5(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i10 = i7;
        if ((i9 & 306783379) == 306783378 && (i10 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            function29 = function22;
            function210 = function28;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1408290209, i9, i10, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:468)");
            }
            boolean z3 = ((i10 & 7168) == 2048) | ((i10 & 14) == 4) | ((234881024 & i9) == 67108864) | ((1879048192 & i9) == 536870912);
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new OutlinedTextFieldMeasurePolicy(function1, z2, f3, paddingValues2);
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
            function27.invoke(composerKN, Integer.valueOf((i10 >> 3) & 14));
            composerKN.eF(250370369);
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
            composerKN.eF(250379492);
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
            composerKN.eF(250410106);
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
            composerKN.eF(250422072);
            if (function26 != null) {
                f4 = fJ2;
                Modifier modifierAz2 = PaddingKt.az(SizeKt.iF(SizeKt.gh(LayoutIdKt.rl(Modifier.INSTANCE, "Suffix"), TextFieldImplKt.HI(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.ck(), 0.0f, f4, 0.0f, 10, null);
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierIF = SizeKt.iF(SizeKt.gh(companion2, TextFieldImplKt.HI(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                fKN = Dp.KN(0);
            }
            Modifier modifierAz3 = PaddingKt.az(modifierIF, fKN, 0.0f, function26 == null ? f4 : Dp.KN(0), 0.0f, 10, null);
            composerKN.eF(250444361);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.rl(companion2, "Hint").Zmq(modifierAz3), composerKN, Integer.valueOf((i9 >> 3) & 112));
            }
            composerKN.Xw();
            Modifier modifierZmq3 = LayoutIdKt.rl(companion2, "TextField").Zmq(modifierAz3);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo5 = BoxKt.Uo(companion3.HI(), true);
            int iN6 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk6 = composerKN.Ik();
            Modifier modifierO6 = ComposedModifierKt.O(composerKN, modifierZmq3);
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
            function2.invoke(composerKN, Integer.valueOf((i9 >> 3) & 14));
            composerKN.XQ();
            composerKN.eF(250455481);
            if (function22 != null) {
                Modifier modifierRl = LayoutIdKt.rl(SizeKt.iF(SizeKt.gh(companion2, DpKt.t(TextFieldImplKt.HI(), TextFieldImplKt.az(), f3), 0.0f, 2, null), null, false, 3, null), "Label");
                MeasurePolicy measurePolicyUo6 = BoxKt.Uo(companion3.HI(), false);
                int iN7 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk7 = composerKN.Ik();
                Modifier modifierO7 = ComposedModifierKt.O(composerKN, modifierRl);
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
                function29 = function22;
                function29.invoke(composerKN, Integer.valueOf((i9 >> 9) & 14));
                composerKN.XQ();
            } else {
                function29 = function22;
            }
            composerKN.Xw();
            composerKN.eF(250473414);
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
                function210.invoke(composerKN, Integer.valueOf((i10 >> 6) & 14));
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
            final Function2 function211 = function210;
            final PaddingValues paddingValues3 = paddingValues2;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
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
                    OutlinedTextFieldKt.t(modifier, function2, function3, function29, function23, function24, function25, function26, z2, f3, function1, function27, function211, paddingValues3, composer2, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int xMQ(int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, float f3, long j2, float f4, PaddingValues paddingValues) {
        int iMaxOf = ComparisonsKt.maxOf(i8, i10, i5, i7, MathHelpersKt.t(i9, 0, f3));
        float top = paddingValues.getTop() * f4;
        return Math.max(Constraints.az(j2), Math.max(i2, Math.max(i3, MathKt.roundToInt(MathHelpersKt.rl(top, Math.max(top, i9 / 2.0f), f3) + iMaxOf + (paddingValues.getBottom() * f4)))) + i11);
    }

    public static final long gh() {
        return rl;
    }

    public static final Modifier qie(Modifier modifier, final Function0 function0, final PaddingValues paddingValues) {
        return DrawModifierKt.nr(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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
                long packedValue = ((Size) function0.invoke()).getPackedValue();
                float fGh = Size.gh(packedValue);
                if (fGh <= 0.0f) {
                    contentDrawScope.l2();
                    return;
                }
                float fL = contentDrawScope.l(OutlinedTextFieldKt.f26849n);
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
                float fXMQ = Size.xMQ(packedValue);
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

    private static final int ty(boolean z2, int i2, int i3, Placeable placeable, Placeable placeable2) {
        if (z2) {
            i3 = Alignment.INSTANCE.xMQ().n(placeable2.getHeight(), i2);
        }
        return Math.max(i3, TextFieldImplKt.Z(placeable) / 2);
    }
}
