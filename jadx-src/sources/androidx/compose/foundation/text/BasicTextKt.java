package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0086\u0001\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009c\u0001\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001az\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0090\u0001\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001ad\u0010!\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001az\u0010#\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001an\u0010%\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u0084\u0001\u0010'\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a%\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b-\u0010.\u001aG\u00107\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000205\u0012\f\u0012\n\u0012\u0004\u0012\u000206\u0018\u00010204\u0018\u00010/2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\f02H\u0002¢\u0006\u0004\b7\u00108\u001aÌ\u0001\u0010D\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010:\u001a\u0002092\u0014\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;\u0018\u00010/2\u001c\u0010?\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0/\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010C\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aº\u0001\u0010G\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00172\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010F\u001a\u00020\f2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010:\u001a\u0002092\b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010C\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J²\u0006\u000e\u0010I\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "style", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", TtmlNode.ATTR_TTS_COLOR, "Landroidx/compose/foundation/text/TextAutoSize;", "autoSize", "J2", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "nr", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V", "KN", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "O", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "t", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", c.f62177j, "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "rl", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "Uo", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Landroidx/compose/runtime/saveable/Saver;", "", "ck", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)Landroidx/compose/runtime/saveable/Saver;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Lkotlin/Function0;", "shouldMeasureLinks", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", "HI", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "onShowTranslation", "Ik", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/ui/Modifier;", "hasInlineContent", "gh", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V", "displayedText", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,701:1\n75#2:702\n75#2:703\n75#2:716\n75#2:717\n75#2:747\n75#2:748\n75#2:761\n75#2:797\n1247#3,6:704\n1247#3,6:710\n1247#3,6:749\n1247#3,6:755\n1247#3,6:791\n1247#3,6:798\n1247#3,6:815\n1247#3,6:821\n1247#3,6:827\n1247#3,6:833\n1247#3,6:839\n1247#3,6:845\n1247#3,6:851\n1247#3,6:857\n1247#3,6:863\n121#4,6:718\n128#4,4:733\n132#4:743\n134#4:746\n121#4,6:762\n128#4,4:777\n132#4:787\n134#4:790\n79#4,6:869\n86#4,3:884\n89#4,2:893\n93#4:898\n272#5,9:724\n281#5,2:744\n272#5,9:768\n281#5,2:788\n347#5,9:875\n356#5,3:895\n4206#6,6:737\n4206#6,6:781\n4206#6,6:887\n303#7,3:804\n70#7,4:807\n75#7:813\n306#7:814\n1#8:811\n1#8:812\n85#9:899\n113#9,2:900\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n104#1:702\n107#1:703\n128#1:716\n141#1:717\n197#1:747\n200#1:748\n225#1:761\n251#1:797\n109#1:704,6\n112#1:710,6\n202#1:749,6\n205#1:755,6\n238#1:791,6\n254#1:798,6\n635#1:815,6\n642#1:821,6\n644#1:827,6\n655#1:833,6\n660#1:839,6\n672#1:845,6\n691#1:851,6\n695#1:857,6\n696#1:863,6\n149#1:718,6\n149#1:733,4\n149#1:743\n149#1:746\n215#1:762,6\n215#1:777,4\n215#1:787\n215#1:790\n663#1:869,6\n663#1:884,3\n663#1:893,2\n663#1:898\n149#1:724,9\n149#1:744,2\n215#1:768,9\n215#1:788,2\n663#1:875,9\n663#1:895,3\n149#1:737,6\n215#1:781,6\n663#1:887,6\n537#1:804,3\n537#1:807,4\n537#1:813\n537#1:814\n537#1:812\n238#1:899\n238#1:900,2\n*E\n"})
public final class BasicTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void gh(final Modifier modifier, final AnnotatedString annotatedString, final Function1 function1, final boolean z2, Map map, final TextStyle textStyle, final int i2, final boolean z3, final int i3, final int i5, final FontFamily.Resolver resolver, final SelectionController selectionController, final ColorProducer colorProducer, final Function1 function12, final TextAutoSize textAutoSize, Composer composer, final int i7, final int i8, final int i9) {
        int i10;
        int i11;
        Map map2;
        TextStyle textStyle2;
        int i12;
        boolean z4;
        int i13;
        int i14;
        int i15;
        final Map map3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        final TextLinkScope textLinkScope;
        Function0 function0;
        Map map4;
        final MutableState mutableState;
        Object textMeasurePolicy;
        Composer composerKN = composer.KN(-2118572703);
        if ((i9 & 1) != 0) {
            i11 = i7 | 6;
            i10 = 2;
        } else {
            i10 = 2;
            if ((i7 & 6) == 0) {
                i11 = i7 | (composerKN.p5(modifier) ? 4 : 2);
            } else {
                i11 = i7;
            }
        }
        if ((i9 & 2) != 0) {
            i11 |= 48;
        } else if ((i7 & 48) == 0) {
            i11 |= composerKN.p5(annotatedString) ? 32 : 16;
        }
        int i16 = i11;
        if ((i9 & 4) != 0) {
            i16 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i16 |= composerKN.E2(function1) ? 256 : 128;
        }
        if ((i9 & 8) != 0) {
            i16 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i16 |= composerKN.n(z2) ? 2048 : 1024;
        }
        int i17 = i9 & 16;
        if (i17 != 0) {
            i16 |= 24576;
        } else {
            if ((i7 & 24576) == 0) {
                map2 = map;
                i16 |= composerKN.E2(map2) ? 16384 : 8192;
            }
            if ((i9 & 32) == 0) {
                i16 |= 196608;
                textStyle2 = textStyle;
            } else {
                textStyle2 = textStyle;
                if ((i7 & 196608) == 0) {
                    i16 |= composerKN.p5(textStyle2) ? 131072 : 65536;
                }
            }
            if ((i9 & 64) == 0) {
                i16 |= 1572864;
                i12 = i2;
            } else {
                i12 = i2;
                if ((i7 & 1572864) == 0) {
                    i16 |= composerKN.t(i12) ? 1048576 : 524288;
                }
            }
            if ((i9 & 128) == 0) {
                i16 |= 12582912;
            } else {
                if ((i7 & 12582912) == 0) {
                    z4 = z3;
                    i16 |= composerKN.n(z4) ? 8388608 : 4194304;
                }
                if ((i9 & 256) != 0) {
                    i16 |= 100663296;
                } else {
                    if ((i7 & 100663296) == 0) {
                        i16 |= composerKN.t(i3) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i9 & 512) == 0) {
                        i16 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    } else {
                        if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i13 = i5;
                            i16 |= composerKN.t(i13) ? 536870912 : 268435456;
                        }
                        if ((i9 & 1024) != 0) {
                            i14 = i8 | 6;
                        } else if ((i8 & 6) == 0) {
                            i14 = i8 | (composerKN.E2(resolver) ? 4 : i10);
                        } else {
                            i14 = i8;
                        }
                        if ((i9 & 2048) == 0) {
                            if ((i8 & 48) == 0) {
                                i14 |= composerKN.E2(selectionController) ? 32 : 16;
                            }
                            i15 = i14;
                            if ((i9 & 4096) == 0) {
                                i15 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else if ((i8 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i15 |= composerKN.E2(colorProducer) ? 256 : 128;
                            }
                            if ((i9 & 8192) == 0) {
                                i15 |= 3072;
                            } else if ((i8 & 3072) == 0) {
                                i15 |= composerKN.E2(function12) ? 2048 : 1024;
                            }
                            if ((i9 & 16384) == 0) {
                                i15 |= 24576;
                            } else if ((i8 & 24576) == 0) {
                                i15 |= (32768 & i8) == 0 ? composerKN.p5(textAutoSize) : composerKN.E2(textAutoSize) ? 16384 : 8192;
                            }
                            if (composerKN.HI((306783379 & i16) == 306783378 || (i15 & 9363) != 9362, i16 & 1)) {
                                Composer composer3 = composerKN;
                                composer3.wTp();
                                map3 = map2;
                                composer2 = composer3;
                            } else {
                                Map mapEmptyMap = i17 != 0 ? MapsKt.emptyMap() : map2;
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-2118572703, i16, i15, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:630)");
                                }
                                Function1 function13 = null;
                                if (TextAnnotatedStringNodeKt.n(annotatedString)) {
                                    composerKN.eF(-613484007);
                                    boolean z5 = (i16 & 112) == 32;
                                    Object objIF = composerKN.iF();
                                    if (z5 || objIF == Composer.INSTANCE.n()) {
                                        objIF = new TextLinkScope(annotatedString);
                                        composerKN.o(objIF);
                                    }
                                    composerKN.Xw();
                                    textLinkScope = (TextLinkScope) objIF;
                                } else {
                                    composerKN.eF(-613418350);
                                    composerKN.Xw();
                                    textLinkScope = null;
                                }
                                if (TextAnnotatedStringNodeKt.n(annotatedString)) {
                                    composerKN.eF(-613220135);
                                    boolean zP5 = ((i16 & 112) == 32) | composerKN.p5(textLinkScope);
                                    Object objIF2 = composerKN.iF();
                                    if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                                        objIF2 = new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final AnnotatedString invoke() {
                                                AnnotatedString annotatedStringXMQ;
                                                TextLinkScope textLinkScope2 = textLinkScope;
                                                return (textLinkScope2 == null || (annotatedStringXMQ = textLinkScope2.xMQ()) == null) ? annotatedString : annotatedStringXMQ;
                                            }
                                        };
                                        composerKN.o(objIF2);
                                    }
                                    function0 = (Function0) objIF2;
                                    composerKN.Xw();
                                } else {
                                    composerKN.eF(-613122857);
                                    boolean z6 = (i16 & 112) == 32;
                                    Object objIF3 = composerKN.iF();
                                    if (z6 || objIF3 == Composer.INSTANCE.n()) {
                                        objIF3 = new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final AnnotatedString invoke() {
                                                return annotatedString;
                                            }
                                        };
                                        composerKN.o(objIF3);
                                    }
                                    function0 = (Function0) objIF3;
                                    composerKN.Xw();
                                }
                                Pair pairT = z2 ? AnnotatedStringResolveInlineContentKt.t(annotatedString, mapEmptyMap) : new Pair(null, null);
                                List list = (List) pairT.component1();
                                List list2 = (List) pairT.component2();
                                if (z2) {
                                    composerKN.eF(-612806750);
                                    Object objIF4 = composerKN.iF();
                                    map4 = mapEmptyMap;
                                    if (objIF4 == Composer.INSTANCE.n()) {
                                        objIF4 = SnapshotStateKt__SnapshotStateKt.O(null, null, i10, null);
                                        composerKN.o(objIF4);
                                    }
                                    mutableState = (MutableState) objIF4;
                                    composerKN.Xw();
                                } else {
                                    map4 = mapEmptyMap;
                                    composerKN.eF(-612718990);
                                    composerKN.Xw();
                                    mutableState = null;
                                }
                                if (z2) {
                                    composerKN.eF(-612625741);
                                    boolean zP52 = composerKN.p5(mutableState);
                                    Object objIF5 = composerKN.iF();
                                    if (zP52 || objIF5 == Composer.INSTANCE.n()) {
                                        objIF5 = new Function1<List<? extends Rect>, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Rect> list3) {
                                                n(list3);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(List list3) {
                                                MutableState mutableState2 = mutableState;
                                                if (mutableState2 == null) {
                                                    return;
                                                }
                                                mutableState2.setValue(list3);
                                            }
                                        };
                                        composerKN.o(objIF5);
                                    }
                                    function13 = (Function1) objIF5;
                                    composerKN.Xw();
                                } else {
                                    composerKN.eF(-612554318);
                                    composerKN.Xw();
                                }
                                AnnotatedString annotatedString2 = (AnnotatedString) function0.invoke();
                                boolean zE2 = composerKN.E2(textLinkScope) | ((i16 & 896) == 256);
                                Object objIF6 = composerKN.iF();
                                if (zE2 || objIF6 == Composer.INSTANCE.n()) {
                                    objIF6 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            n(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(TextLayoutResult textLayoutResult) {
                                            TextLinkScope textLinkScope2 = textLinkScope;
                                            if (textLinkScope2 != null) {
                                                textLinkScope2.r(textLayoutResult);
                                            }
                                            Function1 function14 = function1;
                                            if (function14 != null) {
                                                function14.invoke(textLayoutResult);
                                            }
                                        }
                                    };
                                    composerKN.o(objIF6);
                                }
                                int i18 = i16;
                                Composer composer4 = composerKN;
                                Modifier modifierIk = Ik(modifier, annotatedString2, textStyle2, (Function1) objIF6, i12, z4, i3, i13, resolver, list, function13, selectionController, colorProducer, function12, textAutoSize);
                                if (z2) {
                                    composer4.eF(-611365560);
                                    boolean zE22 = composer4.E2(textLinkScope);
                                    Object objIF7 = composer4.iF();
                                    if (zE22 || objIF7 == Composer.INSTANCE.n()) {
                                        objIF7 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$4$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke() {
                                                TextLinkScope textLinkScope2 = textLinkScope;
                                                return Boolean.valueOf(textLinkScope2 != null ? ((Boolean) textLinkScope2.qie().invoke()).booleanValue() : false);
                                            }
                                        };
                                        composer4.o(objIF7);
                                    }
                                    Function0 function02 = (Function0) objIF7;
                                    boolean zP53 = composer4.p5(mutableState);
                                    Object objIF8 = composer4.iF();
                                    if (zP53 || objIF8 == Composer.INSTANCE.n()) {
                                        objIF8 = new Function0<List<? extends Rect>>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$5$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final List<? extends Rect> invoke() {
                                                MutableState mutableState2 = mutableState;
                                                if (mutableState2 != null) {
                                                    return (List) mutableState2.getValue();
                                                }
                                                return null;
                                            }
                                        };
                                        composer4.o(objIF8);
                                    }
                                    textMeasurePolicy = new TextMeasurePolicy(function02, (Function0) objIF8);
                                    composer4.Xw();
                                } else {
                                    composer4.eF(-611542291);
                                    boolean zE23 = composer4.E2(textLinkScope);
                                    Object objIF9 = composer4.iF();
                                    if (zE23 || objIF9 == Composer.INSTANCE.n()) {
                                        objIF9 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$3$1
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final Boolean invoke() {
                                                TextLinkScope textLinkScope2 = textLinkScope;
                                                return Boolean.valueOf(textLinkScope2 != null ? ((Boolean) textLinkScope2.qie().invoke()).booleanValue() : false);
                                            }
                                        };
                                        composer4.o(objIF9);
                                    }
                                    textMeasurePolicy = new LinksTextMeasurePolicy((Function0) objIF9);
                                    composer4.Xw();
                                }
                                int iN = ComposablesKt.n(composer4, 0);
                                CompositionLocalMap compositionLocalMapIk = composer4.Ik();
                                Modifier modifierO = ComposedModifierKt.O(composer4, modifierIk);
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
                                Updater.O(composerN, textMeasurePolicy, companion.t());
                                Updater.O(composerN, compositionLocalMapIk, companion.O());
                                Function2 function2Rl = companion.rl();
                                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                    composerN.o(Integer.valueOf(iN));
                                    composerN.az(Integer.valueOf(iN), function2Rl);
                                }
                                Updater.O(composerN, modifierO, companion.nr());
                                if (textLinkScope == null) {
                                    composer4.eF(-509592027);
                                    composer4.Xw();
                                } else {
                                    composer4.eF(537750876);
                                    textLinkScope.rl(composer4, 0);
                                    composer4.Xw();
                                    Unit unit = Unit.INSTANCE;
                                }
                                if (list2 == null) {
                                    composer4.eF(-509541249);
                                } else {
                                    composer4.eF(-509541248);
                                    AnnotatedStringResolveInlineContentKt.n(annotatedString, list2, composer4, (i18 >> 3) & 14);
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composer4.Xw();
                                composer4.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                map3 = map4;
                                composer2 = composer4;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$6
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
                                        BasicTextKt.gh(modifier, annotatedString, function1, z2, map3, textStyle, i2, z3, i3, i5, resolver, selectionController, colorProducer, function12, textAutoSize, composer5, RecomposeScopeImplKt.n(i7 | 1), RecomposeScopeImplKt.n(i8), i9);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 |= 48;
                        i15 = i14;
                        if ((i9 & 4096) == 0) {
                        }
                        if ((i9 & 8192) == 0) {
                        }
                        if ((i9 & 16384) == 0) {
                        }
                        if (composerKN.HI((306783379 & i16) == 306783378 || (i15 & 9363) != 9362, i16 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i13 = i5;
                    if ((i9 & 1024) != 0) {
                    }
                    if ((i9 & 2048) == 0) {
                    }
                    i15 = i14;
                    if ((i9 & 4096) == 0) {
                    }
                    if ((i9 & 8192) == 0) {
                    }
                    if ((i9 & 16384) == 0) {
                    }
                    if (composerKN.HI((306783379 & i16) == 306783378 || (i15 & 9363) != 9362, i16 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                if ((i9 & 512) == 0) {
                }
                i13 = i5;
                if ((i9 & 1024) != 0) {
                }
                if ((i9 & 2048) == 0) {
                }
                i15 = i14;
                if ((i9 & 4096) == 0) {
                }
                if ((i9 & 8192) == 0) {
                }
                if ((i9 & 16384) == 0) {
                }
                if (composerKN.HI((306783379 & i16) == 306783378 || (i15 & 9363) != 9362, i16 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            z4 = z3;
            if ((i9 & 256) != 0) {
            }
            if ((i9 & 512) == 0) {
            }
            i13 = i5;
            if ((i9 & 1024) != 0) {
            }
            if ((i9 & 2048) == 0) {
            }
            i15 = i14;
            if ((i9 & 4096) == 0) {
            }
            if ((i9 & 8192) == 0) {
            }
            if ((i9 & 16384) == 0) {
            }
            if (composerKN.HI((306783379 & i16) == 306783378 || (i15 & 9363) != 9362, i16 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        map2 = map;
        if ((i9 & 32) == 0) {
        }
        if ((i9 & 64) == 0) {
        }
        if ((i9 & 128) == 0) {
        }
        z4 = z3;
        if ((i9 & 256) != 0) {
        }
        if ((i9 & 512) == 0) {
        }
        i13 = i5;
        if ((i9 & 1024) != 0) {
        }
        if ((i9 & 2048) == 0) {
        }
        i15 = i14;
        if ((i9 & 4096) == 0) {
        }
        if ((i9 & 8192) == 0) {
        }
        if ((i9 & 16384) == 0) {
        }
        if (composerKN.HI((306783379 & i16) == 306783378 || (i15 & 9363) != 9362, i16 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final Modifier Ik(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i5, FontFamily.Resolver resolver, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13, TextAutoSize textAutoSize) {
        if (selectionController == null) {
            return modifier.Zmq(Modifier.INSTANCE).Zmq(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i2, z2, i3, i5, list, function12, null, colorProducer, textAutoSize, function13, null));
        }
        return modifier.Zmq(selectionController.getModifier()).Zmq(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i2, z2, i3, i5, list, function12, selectionController, colorProducer, textAutoSize, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b A[PHI: r21
      0x011b: PHI (r21v15 int) = (r21v4 int), (r21v10 int), (r21v11 int) binds: [B:100:0x0119, B:110:0x0136, B:109:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i5, ColorProducer colorProducer, TextAutoSize textAutoSize, Composer composer, final int i7, final int i8) {
        int i9;
        Modifier modifier2;
        int i10;
        TextStyle textStyle2;
        int i11;
        Function1 function12;
        int i12;
        int i13;
        int i14;
        boolean z3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        final String str2;
        final int i21;
        final TextAutoSize textAutoSize2;
        Composer composer2;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i22;
        final ColorProducer colorProducer2;
        final boolean z4;
        final int i23;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composer3;
        SelectionController selectionController;
        int i24;
        int i25;
        Modifier modifier4;
        Modifier modifierIk;
        Composer composerKN = composer.KN(-1040751001);
        if ((i8 & 1) != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = (composerKN.p5(str) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        int i26 = i8 & 2;
        if (i26 != 0) {
            i9 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    textStyle2 = textStyle;
                    i9 |= composerKN.p5(textStyle2) ? 256 : 128;
                }
                i11 = i8 & 8;
                if (i11 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i7 & 3072) == 0) {
                        function12 = function1;
                        i9 |= composerKN.E2(function12) ? 2048 : 1024;
                    }
                    i12 = i8 & 16;
                    if (i12 == 0) {
                        i9 |= 24576;
                    } else {
                        if ((i7 & 24576) == 0) {
                            i13 = i2;
                            i9 |= composerKN.t(i13) ? 16384 : 8192;
                        }
                        i14 = i8 & 32;
                        if (i14 != 0) {
                            i9 |= 196608;
                            z3 = z2;
                        } else {
                            z3 = z2;
                            if ((i7 & 196608) == 0) {
                                i9 |= composerKN.n(z3) ? 131072 : 65536;
                            }
                        }
                        i15 = i8 & 64;
                        if (i15 != 0) {
                            i9 |= 1572864;
                        } else if ((i7 & 1572864) == 0) {
                            i9 |= composerKN.t(i3) ? 1048576 : 524288;
                        }
                        i16 = i8 & 128;
                        if (i16 != 0) {
                            i9 |= 12582912;
                        } else {
                            if ((i7 & 12582912) == 0) {
                                i17 = i16;
                                i9 |= composerKN.t(i5) ? 8388608 : 4194304;
                            }
                            i18 = i8 & 256;
                            if (i18 != 0) {
                                if ((i7 & 100663296) == 0) {
                                    i19 = i18;
                                    i9 |= composerKN.E2(colorProducer) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                i20 = i8 & 512;
                                int i27 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                if (i20 != 0) {
                                    i9 |= i27;
                                } else if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                    i27 = (i7 & 1073741824) == 0 ? composerKN.p5(textAutoSize) : composerKN.E2(textAutoSize) ? 536870912 : 268435456;
                                    i9 |= i27;
                                }
                                if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                                    if (i26 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    TextStyle textStyleN = i10 != 0 ? TextStyle.INSTANCE.n() : textStyle2;
                                    Function1 function14 = i11 != 0 ? null : function12;
                                    int iN = i12 != 0 ? TextOverflow.INSTANCE.n() : i13;
                                    boolean z5 = i14 != 0 ? true : z3;
                                    int i28 = i15 != 0 ? Integer.MAX_VALUE : i3;
                                    int i29 = i17 != 0 ? 1 : i5;
                                    ColorProducer colorProducer3 = i19 != 0 ? null : colorProducer;
                                    TextAutoSize textAutoSize3 = i20 != 0 ? null : textAutoSize;
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1040751001, i9, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:101)");
                                    }
                                    HeightInLinesModifierKt.rl(i29, i28);
                                    final SelectionRegistrar selectionRegistrar = (SelectionRegistrar) composerKN.ty(SelectionRegistrarKt.n());
                                    if (selectionRegistrar != null) {
                                        composerKN.eF(-1588802442);
                                        long selectionBackgroundColor = ((SelectionColors) composerKN.ty(TextSelectionColorsKt.rl())).getSelectionBackgroundColor();
                                        Object[] objArr = {selectionRegistrar};
                                        Saver saverCk = ck(selectionRegistrar);
                                        boolean zE2 = composerKN.E2(selectionRegistrar);
                                        Object objIF = composerKN.iF();
                                        if (zE2 || objIF == Composer.INSTANCE.n()) {
                                            objIF = new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$1$1
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final Long invoke() {
                                                    return Long.valueOf(selectionRegistrar.n());
                                                }
                                            };
                                            composerKN.o(objIF);
                                        }
                                        Object objO = RememberSaveableKt.O(objArr, saverCk, null, (Function0) objIF, composerKN, 0, 4);
                                        composer3 = composerKN;
                                        long jLongValue = ((Number) objO).longValue();
                                        boolean zNr = composer3.nr(jLongValue) | composer3.p5(selectionRegistrar) | composer3.nr(selectionBackgroundColor);
                                        Object objIF2 = composer3.iF();
                                        if (zNr || objIF2 == Composer.INSTANCE.n()) {
                                            objIF2 = new SelectionController(jLongValue, selectionRegistrar, selectionBackgroundColor, null, 8, null);
                                            composer3.o(objIF2);
                                        }
                                        composer3.Xw();
                                        selectionController = (SelectionController) objIF2;
                                    } else {
                                        composer3 = composerKN;
                                        composer3.eF(-1588311278);
                                        composer3.Xw();
                                        selectionController = null;
                                    }
                                    if (selectionController == null && function14 == null && textAutoSize3 == null) {
                                        composer3.eF(-1587511974);
                                        int i30 = i28;
                                        int i31 = i29;
                                        str2 = str;
                                        i24 = i30;
                                        i25 = i31;
                                        modifierIk = modifier2.Zmq(new TextStringSimpleElement(str, textStyleN, (FontFamily.Resolver) composer3.ty(CompositionLocalsKt.KN()), iN, z5, i30, i31, colorProducer3, null));
                                        composer3.Xw();
                                        modifier4 = modifier2;
                                    } else {
                                        i24 = i28;
                                        i25 = i29;
                                        str2 = str;
                                        composer3.eF(-1588155131);
                                        modifier4 = modifier2;
                                        modifierIk = Ik(modifier4, new AnnotatedString(str2, null, 2, null), textStyleN, function14, iN, z5, i24, i25, (FontFamily.Resolver) composer3.ty(CompositionLocalsKt.KN()), null, null, selectionController, colorProducer3, null, textAutoSize3);
                                        composer3.Xw();
                                    }
                                    EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.f19674n;
                                    int iN2 = ComposablesKt.n(composer3, 0);
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierIk);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion.n();
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
                                    Updater.O(composerN, emptyMeasurePolicy, companion.t());
                                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                                    Updater.O(composerN, modifierO, companion.nr());
                                    Function2 function2Rl = companion.rl();
                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN2))) {
                                        composerN.o(Integer.valueOf(iN2));
                                        composerN.az(Integer.valueOf(iN2), function2Rl);
                                    }
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    composer2 = composer3;
                                    modifier3 = modifier4;
                                    textStyle3 = textStyleN;
                                    function13 = function14;
                                    i23 = iN;
                                    z4 = z5;
                                    i22 = i24;
                                    i21 = i25;
                                    colorProducer2 = colorProducer3;
                                    textAutoSize2 = textAutoSize3;
                                } else {
                                    str2 = str;
                                    composerKN.wTp();
                                    i21 = i5;
                                    textAutoSize2 = textAutoSize;
                                    composer2 = composerKN;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    function13 = function12;
                                    i22 = i3;
                                    colorProducer2 = colorProducer;
                                    z4 = z3;
                                    i23 = i13;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            n(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer4, int i32) {
                                            BasicTextKt.J2(str2, modifier3, textStyle3, function13, i23, z4, i22, i21, colorProducer2, textAutoSize2, composer4, RecomposeScopeImplKt.n(i7 | 1), i8);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i9 |= 100663296;
                            i19 = i18;
                            i20 = i8 & 512;
                            int i272 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            if (i20 != 0) {
                            }
                            if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i17 = i16;
                        i18 = i8 & 256;
                        if (i18 != 0) {
                        }
                        i19 = i18;
                        i20 = i8 & 512;
                        int i2722 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        if (i20 != 0) {
                        }
                        if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i13 = i2;
                    i14 = i8 & 32;
                    if (i14 != 0) {
                    }
                    i15 = i8 & 64;
                    if (i15 != 0) {
                    }
                    i16 = i8 & 128;
                    if (i16 != 0) {
                    }
                    i17 = i16;
                    i18 = i8 & 256;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    i20 = i8 & 512;
                    int i27222 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    if (i20 != 0) {
                    }
                    if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function12 = function1;
                i12 = i8 & 16;
                if (i12 == 0) {
                }
                i13 = i2;
                i14 = i8 & 32;
                if (i14 != 0) {
                }
                i15 = i8 & 64;
                if (i15 != 0) {
                }
                i16 = i8 & 128;
                if (i16 != 0) {
                }
                i17 = i16;
                i18 = i8 & 256;
                if (i18 != 0) {
                }
                i19 = i18;
                i20 = i8 & 512;
                int i272222 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                if (i20 != 0) {
                }
                if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            textStyle2 = textStyle;
            i11 = i8 & 8;
            if (i11 != 0) {
            }
            function12 = function1;
            i12 = i8 & 16;
            if (i12 == 0) {
            }
            i13 = i2;
            i14 = i8 & 32;
            if (i14 != 0) {
            }
            i15 = i8 & 64;
            if (i15 != 0) {
            }
            i16 = i8 & 128;
            if (i16 != 0) {
            }
            i17 = i16;
            i18 = i8 & 256;
            if (i18 != 0) {
            }
            i19 = i18;
            i20 = i8 & 512;
            int i2722222 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
            if (i20 != 0) {
            }
            if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        textStyle2 = textStyle;
        i11 = i8 & 8;
        if (i11 != 0) {
        }
        function12 = function1;
        i12 = i8 & 16;
        if (i12 == 0) {
        }
        i13 = i2;
        i14 = i8 & 32;
        if (i14 != 0) {
        }
        i15 = i8 & 64;
        if (i15 != 0) {
        }
        i16 = i8 & 128;
        if (i16 != 0) {
        }
        i17 = i16;
        i18 = i8 & 256;
        if (i18 != 0) {
        }
        i19 = i18;
        i20 = i8 & 512;
        int i27222222 = com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        if (i20 != 0) {
        }
        if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void KN(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i5, ColorProducer colorProducer, Composer composer, final int i7, final int i8) {
        String str2;
        int i9;
        Modifier modifier2;
        int i10;
        TextStyle textStyle2;
        int i11;
        Function1 function12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer composer2;
        final int i19;
        final int i20;
        final ColorProducer colorProducer2;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final boolean z3;
        final int i21;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i22;
        TextStyle textStyleN;
        int i23;
        int iN;
        int i24;
        int i25;
        int i26;
        int i27;
        Composer composerKN = composer.KN(-1186827822);
        if ((i8 & 1) != 0) {
            i9 = i7 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i7 & 6) == 0) {
                i9 = (composerKN.p5(str2) ? 4 : 2) | i7;
            } else {
                i9 = i7;
            }
        }
        int i28 = i8 & 2;
        if (i28 != 0) {
            i9 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    textStyle2 = textStyle;
                    i9 |= composerKN.p5(textStyle2) ? 256 : 128;
                }
                i11 = i8 & 8;
                if (i11 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i7 & 3072) == 0) {
                        function12 = function1;
                        i9 |= composerKN.E2(function12) ? 2048 : 1024;
                    }
                    i12 = i8 & 16;
                    if (i12 == 0) {
                        i9 |= 24576;
                    } else {
                        if ((i7 & 24576) == 0) {
                            i9 |= composerKN.t(i2) ? 16384 : 8192;
                        }
                        i13 = i8 & 32;
                        if (i13 != 0) {
                            i9 |= 196608;
                        } else {
                            if ((196608 & i7) == 0) {
                                i9 |= composerKN.n(z2) ? 131072 : 65536;
                            }
                            i14 = i8 & 64;
                            if (i14 == 0) {
                                i9 |= 1572864;
                            } else if ((i7 & 1572864) == 0) {
                                i9 |= composerKN.t(i3) ? 1048576 : 524288;
                            }
                            i15 = i8 & 128;
                            if (i15 == 0) {
                                i9 |= 12582912;
                            } else {
                                if ((i7 & 12582912) == 0) {
                                    i16 = i15;
                                    i9 |= composerKN.t(i5) ? 8388608 : 4194304;
                                }
                                i17 = i8 & 256;
                                if (i17 == 0) {
                                    if ((i7 & 100663296) == 0) {
                                        i18 = i17;
                                        i9 |= composerKN.E2(colorProducer) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                    }
                                    if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                                        composer2 = composerKN;
                                        composer2.wTp();
                                        i19 = i2;
                                        i20 = i3;
                                        colorProducer2 = colorProducer;
                                        modifier3 = modifier2;
                                        textStyle3 = textStyle2;
                                        function13 = function12;
                                        z3 = z2;
                                        i21 = i5;
                                    } else {
                                        Modifier modifier4 = i28 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i10 != 0) {
                                            textStyleN = TextStyle.INSTANCE.n();
                                            i22 = i13;
                                        } else {
                                            i22 = i13;
                                            textStyleN = textStyle2;
                                        }
                                        Function1 function14 = i11 != 0 ? null : function12;
                                        if (i12 != 0) {
                                            iN = TextOverflow.INSTANCE.n();
                                            i23 = i14;
                                        } else {
                                            i23 = i14;
                                            iN = i2;
                                        }
                                        boolean z4 = i22 != 0 ? true : z2;
                                        if (i23 != 0) {
                                            int i29 = i16;
                                            i25 = Integer.MAX_VALUE;
                                            i24 = i29;
                                        } else {
                                            i24 = i16;
                                            i25 = i3;
                                        }
                                        if (i24 != 0) {
                                            i26 = i18;
                                            i27 = 1;
                                        } else {
                                            i26 = i18;
                                            i27 = i5;
                                        }
                                        ColorProducer colorProducer3 = i26 != 0 ? null : colorProducer;
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1186827822, i9, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:301)");
                                        }
                                        composer2 = composerKN;
                                        J2(str2, modifier4, textStyleN, function14, iN, z4, i25, i27, colorProducer3, null, composer2, i9 & 268435454, 512);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        modifier3 = modifier4;
                                        textStyle3 = textStyleN;
                                        function13 = function14;
                                        i19 = iN;
                                        z3 = z4;
                                        i20 = i25;
                                        i21 = i27;
                                        colorProducer2 = colorProducer3;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
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
                                                BasicTextKt.KN(str, modifier3, textStyle3, function13, i19, z3, i20, i21, colorProducer2, composer3, RecomposeScopeImplKt.n(i7 | 1), i8);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i9 |= 100663296;
                                i18 = i17;
                                if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            i16 = i15;
                            i17 = i8 & 256;
                            if (i17 == 0) {
                            }
                            i18 = i17;
                            if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                            }
                        }
                        i14 = i8 & 64;
                        if (i14 == 0) {
                        }
                        i15 = i8 & 128;
                        if (i15 == 0) {
                        }
                        i16 = i15;
                        i17 = i8 & 256;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i13 = i8 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i8 & 64;
                    if (i14 == 0) {
                    }
                    i15 = i8 & 128;
                    if (i15 == 0) {
                    }
                    i16 = i15;
                    i17 = i8 & 256;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function12 = function1;
                i12 = i8 & 16;
                if (i12 == 0) {
                }
                i13 = i8 & 32;
                if (i13 != 0) {
                }
                i14 = i8 & 64;
                if (i14 == 0) {
                }
                i15 = i8 & 128;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i8 & 256;
                if (i17 == 0) {
                }
                i18 = i17;
                if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            textStyle2 = textStyle;
            i11 = i8 & 8;
            if (i11 != 0) {
            }
            function12 = function1;
            i12 = i8 & 16;
            if (i12 == 0) {
            }
            i13 = i8 & 32;
            if (i13 != 0) {
            }
            i14 = i8 & 64;
            if (i14 == 0) {
            }
            i15 = i8 & 128;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i8 & 256;
            if (i17 == 0) {
            }
            i18 = i17;
            if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        textStyle2 = textStyle;
        i11 = i8 & 8;
        if (i11 != 0) {
        }
        function12 = function1;
        i12 = i8 & 16;
        if (i12 == 0) {
        }
        i13 = i8 & 32;
        if (i13 != 0) {
        }
        i14 = i8 & 64;
        if (i14 == 0) {
        }
        i15 = i8 & 128;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i8 & 256;
        if (i17 == 0) {
        }
        i18 = i17;
        if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void O(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i5, Map map, ColorProducer colorProducer, Composer composer, final int i7, final int i8) {
        AnnotatedString annotatedString2;
        int i9;
        Modifier modifier2;
        int i10;
        TextStyle textStyle2;
        int i11;
        Function1 function12;
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
        Composer composer2;
        final int i22;
        final Map map2;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i23;
        final boolean z3;
        final int i24;
        final ColorProducer colorProducer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i25;
        Modifier modifier4;
        int i26;
        boolean z4;
        int i27;
        int i28;
        int i29;
        int i30;
        Composer composerKN = composer.KN(-1064305212);
        if ((i8 & 1) != 0) {
            i9 = i7 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i7 & 6) == 0) {
                i9 = (composerKN.p5(annotatedString2) ? 4 : 2) | i7;
            } else {
                i9 = i7;
            }
        }
        int i31 = i8 & 2;
        if (i31 != 0) {
            i9 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    textStyle2 = textStyle;
                    i9 |= composerKN.p5(textStyle2) ? 256 : 128;
                }
                i11 = i8 & 8;
                if (i11 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i7 & 3072) == 0) {
                        function12 = function1;
                        i9 |= composerKN.E2(function12) ? 2048 : 1024;
                    }
                    i12 = i8 & 16;
                    if (i12 == 0) {
                        i9 |= 24576;
                    } else {
                        if ((i7 & 24576) == 0) {
                            i13 = i2;
                            i9 |= composerKN.t(i13) ? 16384 : 8192;
                        }
                        i14 = i8 & 32;
                        if (i14 != 0) {
                            i9 |= 196608;
                        } else {
                            if ((196608 & i7) == 0) {
                                i9 |= composerKN.n(z2) ? 131072 : 65536;
                            }
                            i15 = i8 & 64;
                            if (i15 == 0) {
                                i9 |= 1572864;
                            } else if ((i7 & 1572864) == 0) {
                                i9 |= composerKN.t(i3) ? 1048576 : 524288;
                            }
                            i16 = i8 & 128;
                            if (i16 == 0) {
                                i9 |= 12582912;
                            } else {
                                if ((i7 & 12582912) == 0) {
                                    i17 = i16;
                                    i9 |= composerKN.t(i5) ? 8388608 : 4194304;
                                }
                                i18 = i8 & 256;
                                if (i18 != 0) {
                                    i9 |= 100663296;
                                } else {
                                    if ((i7 & 100663296) == 0) {
                                        i19 = i18;
                                        i9 |= composerKN.E2(map) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                    }
                                    i20 = i8 & 512;
                                    if (i20 != 0) {
                                        if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                            i21 = i20;
                                            i9 |= composerKN.E2(colorProducer) ? 536870912 : 268435456;
                                        }
                                        if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                                            if (i31 != 0) {
                                                modifier4 = Modifier.INSTANCE;
                                                i25 = i14;
                                            } else {
                                                i25 = i14;
                                                modifier4 = modifier2;
                                            }
                                            TextStyle textStyleN = i10 != 0 ? TextStyle.INSTANCE.n() : textStyle2;
                                            Function1 function14 = i11 != 0 ? null : function12;
                                            int iN = i12 != 0 ? TextOverflow.INSTANCE.n() : i13;
                                            if (i25 != 0) {
                                                i26 = i17;
                                                z4 = true;
                                            } else {
                                                i26 = i17;
                                                z4 = z2;
                                            }
                                            if (i15 != 0) {
                                                int i32 = i19;
                                                i28 = Integer.MAX_VALUE;
                                                i27 = i32;
                                            } else {
                                                i27 = i19;
                                                i28 = i3;
                                            }
                                            if (i26 != 0) {
                                                i29 = i21;
                                                i30 = 1;
                                            } else {
                                                i29 = i21;
                                                i30 = i5;
                                            }
                                            Map mapEmptyMap = i27 != 0 ? MapsKt.emptyMap() : map;
                                            ColorProducer colorProducer3 = i29 != 0 ? null : colorProducer;
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-1064305212, i9, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:343)");
                                            }
                                            composer2 = composerKN;
                                            nr(annotatedString2, modifier4, textStyleN, function14, iN, z4, i28, i30, mapEmptyMap, colorProducer3, null, composer2, i9 & 2147483646, 0, 1024);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                            modifier3 = modifier4;
                                            textStyle3 = textStyleN;
                                            function13 = function14;
                                            i23 = iN;
                                            z3 = z4;
                                            i22 = i28;
                                            i24 = i30;
                                            map2 = mapEmptyMap;
                                            colorProducer2 = colorProducer3;
                                        } else {
                                            composer2 = composerKN;
                                            composer2.wTp();
                                            i22 = i3;
                                            map2 = map;
                                            modifier3 = modifier2;
                                            textStyle3 = textStyle2;
                                            function13 = function12;
                                            i23 = i13;
                                            z3 = z2;
                                            i24 = i5;
                                            colorProducer2 = colorProducer;
                                        }
                                        scopeUpdateScopeGh = composer2.gh();
                                        if (scopeUpdateScopeGh != null) {
                                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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
                                                    BasicTextKt.O(annotatedString, modifier3, textStyle3, function13, i23, z3, i22, i24, map2, colorProducer2, composer3, RecomposeScopeImplKt.n(i7 | 1), i8);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                    i21 = i20;
                                    if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh != null) {
                                    }
                                }
                                i19 = i18;
                                i20 = i8 & 512;
                                if (i20 != 0) {
                                }
                                i21 = i20;
                                if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                }
                            }
                            i17 = i16;
                            i18 = i8 & 256;
                            if (i18 != 0) {
                            }
                            i19 = i18;
                            i20 = i8 & 512;
                            if (i20 != 0) {
                            }
                            i21 = i20;
                            if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i15 = i8 & 64;
                        if (i15 == 0) {
                        }
                        i16 = i8 & 128;
                        if (i16 == 0) {
                        }
                        i17 = i16;
                        i18 = i8 & 256;
                        if (i18 != 0) {
                        }
                        i19 = i18;
                        i20 = i8 & 512;
                        if (i20 != 0) {
                        }
                        i21 = i20;
                        if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i13 = i2;
                    i14 = i8 & 32;
                    if (i14 != 0) {
                    }
                    i15 = i8 & 64;
                    if (i15 == 0) {
                    }
                    i16 = i8 & 128;
                    if (i16 == 0) {
                    }
                    i17 = i16;
                    i18 = i8 & 256;
                    if (i18 != 0) {
                    }
                    i19 = i18;
                    i20 = i8 & 512;
                    if (i20 != 0) {
                    }
                    i21 = i20;
                    if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function12 = function1;
                i12 = i8 & 16;
                if (i12 == 0) {
                }
                i13 = i2;
                i14 = i8 & 32;
                if (i14 != 0) {
                }
                i15 = i8 & 64;
                if (i15 == 0) {
                }
                i16 = i8 & 128;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i8 & 256;
                if (i18 != 0) {
                }
                i19 = i18;
                i20 = i8 & 512;
                if (i20 != 0) {
                }
                i21 = i20;
                if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            textStyle2 = textStyle;
            i11 = i8 & 8;
            if (i11 != 0) {
            }
            function12 = function1;
            i12 = i8 & 16;
            if (i12 == 0) {
            }
            i13 = i2;
            i14 = i8 & 32;
            if (i14 != 0) {
            }
            i15 = i8 & 64;
            if (i15 == 0) {
            }
            i16 = i8 & 128;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i8 & 256;
            if (i18 != 0) {
            }
            i19 = i18;
            i20 = i8 & 512;
            if (i20 != 0) {
            }
            i21 = i20;
            if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        textStyle2 = textStyle;
        i11 = i8 & 8;
        if (i11 != 0) {
        }
        function12 = function1;
        i12 = i8 & 16;
        if (i12 == 0) {
        }
        i13 = i2;
        i14 = i8 & 32;
        if (i14 != 0) {
        }
        i15 = i8 & 64;
        if (i15 == 0) {
        }
        i16 = i8 & 128;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i8 & 256;
        if (i18 != 0) {
        }
        i19 = i18;
        i20 = i8 & 512;
        if (i20 != 0) {
        }
        i21 = i20;
        if (composerKN.HI((i9 & 306783379) != 306783378, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void Uo(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i5, Map map, Composer composer, final int i7, final int i8) {
        AnnotatedString annotatedString2;
        int i9;
        Modifier modifier2;
        int i10;
        TextStyle textStyle2;
        int i11;
        Function1 function12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer composer2;
        final int i19;
        final int i20;
        final Map map2;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final boolean z3;
        final int i21;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i22;
        TextStyle textStyleN;
        int i23;
        int iN;
        int i24;
        int i25;
        int i26;
        int i27;
        Composer composerKN = composer.KN(851408699);
        if ((i8 & 1) != 0) {
            i9 = i7 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i7 & 6) == 0) {
                i9 = (composerKN.p5(annotatedString2) ? 4 : 2) | i7;
            } else {
                i9 = i7;
            }
        }
        int i28 = i8 & 2;
        if (i28 != 0) {
            i9 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    textStyle2 = textStyle;
                    i9 |= composerKN.p5(textStyle2) ? 256 : 128;
                }
                i11 = i8 & 8;
                if (i11 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i7 & 3072) == 0) {
                        function12 = function1;
                        i9 |= composerKN.E2(function12) ? 2048 : 1024;
                    }
                    i12 = i8 & 16;
                    if (i12 == 0) {
                        i9 |= 24576;
                    } else {
                        if ((i7 & 24576) == 0) {
                            i9 |= composerKN.t(i2) ? 16384 : 8192;
                        }
                        i13 = i8 & 32;
                        if (i13 != 0) {
                            i9 |= 196608;
                        } else {
                            if ((196608 & i7) == 0) {
                                i9 |= composerKN.n(z2) ? 131072 : 65536;
                            }
                            i14 = i8 & 64;
                            if (i14 == 0) {
                                i9 |= 1572864;
                            } else if ((i7 & 1572864) == 0) {
                                i9 |= composerKN.t(i3) ? 1048576 : 524288;
                            }
                            i15 = i8 & 128;
                            if (i15 == 0) {
                                i9 |= 12582912;
                            } else {
                                if ((i7 & 12582912) == 0) {
                                    i16 = i15;
                                    i9 |= composerKN.t(i5) ? 8388608 : 4194304;
                                }
                                i17 = i8 & 256;
                                if (i17 == 0) {
                                    if ((i7 & 100663296) == 0) {
                                        i18 = i17;
                                        i9 |= composerKN.E2(map) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                    }
                                    if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                                        composer2 = composerKN;
                                        composer2.wTp();
                                        i19 = i2;
                                        i20 = i3;
                                        map2 = map;
                                        modifier3 = modifier2;
                                        textStyle3 = textStyle2;
                                        function13 = function12;
                                        z3 = z2;
                                        i21 = i5;
                                    } else {
                                        Modifier modifier4 = i28 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i10 != 0) {
                                            textStyleN = TextStyle.INSTANCE.n();
                                            i22 = i13;
                                        } else {
                                            i22 = i13;
                                            textStyleN = textStyle2;
                                        }
                                        Function1 function14 = i11 != 0 ? null : function12;
                                        if (i12 != 0) {
                                            iN = TextOverflow.INSTANCE.n();
                                            i23 = i14;
                                        } else {
                                            i23 = i14;
                                            iN = i2;
                                        }
                                        boolean z4 = i22 != 0 ? true : z2;
                                        if (i23 != 0) {
                                            int i29 = i16;
                                            i25 = Integer.MAX_VALUE;
                                            i24 = i29;
                                        } else {
                                            i24 = i16;
                                            i25 = i3;
                                        }
                                        if (i24 != 0) {
                                            i26 = i18;
                                            i27 = 1;
                                        } else {
                                            i26 = i18;
                                            i27 = i5;
                                        }
                                        Map mapEmptyMap = i26 != 0 ? MapsKt.emptyMap() : map;
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(851408699, i9, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:432)");
                                        }
                                        composer2 = composerKN;
                                        nr(annotatedString2, modifier4, textStyleN, function14, iN, z4, i25, i27, mapEmptyMap, null, null, composer2, i9 & 268435454, 0, 1536);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                        modifier3 = modifier4;
                                        textStyle3 = textStyleN;
                                        function13 = function14;
                                        i19 = iN;
                                        z3 = z4;
                                        i20 = i25;
                                        i21 = i27;
                                        map2 = mapEmptyMap;
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh == null) {
                                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
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
                                                BasicTextKt.Uo(annotatedString, modifier3, textStyle3, function13, i19, z3, i20, i21, map2, composer3, RecomposeScopeImplKt.n(i7 | 1), i8);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i9 |= 100663296;
                                i18 = i17;
                                if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh == null) {
                                }
                            }
                            i16 = i15;
                            i17 = i8 & 256;
                            if (i17 == 0) {
                            }
                            i18 = i17;
                            if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                            }
                        }
                        i14 = i8 & 64;
                        if (i14 == 0) {
                        }
                        i15 = i8 & 128;
                        if (i15 == 0) {
                        }
                        i16 = i15;
                        i17 = i8 & 256;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i13 = i8 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i8 & 64;
                    if (i14 == 0) {
                    }
                    i15 = i8 & 128;
                    if (i15 == 0) {
                    }
                    i16 = i15;
                    i17 = i8 & 256;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function12 = function1;
                i12 = i8 & 16;
                if (i12 == 0) {
                }
                i13 = i8 & 32;
                if (i13 != 0) {
                }
                i14 = i8 & 64;
                if (i14 == 0) {
                }
                i15 = i8 & 128;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i8 & 256;
                if (i17 == 0) {
                }
                i18 = i17;
                if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            textStyle2 = textStyle;
            i11 = i8 & 8;
            if (i11 != 0) {
            }
            function12 = function1;
            i12 = i8 & 16;
            if (i12 == 0) {
            }
            i13 = i8 & 32;
            if (i13 != 0) {
            }
            i14 = i8 & 64;
            if (i14 == 0) {
            }
            i15 = i8 & 128;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i8 & 256;
            if (i17 == 0) {
            }
            i18 = i17;
            if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        textStyle2 = textStyle;
        i11 = i8 & 8;
        if (i11 != 0) {
        }
        function12 = function1;
        i12 = i8 & 16;
        if (i12 == 0) {
        }
        i13 = i8 & 32;
        if (i13 != 0) {
        }
        i14 = i8 & 64;
        if (i14 == 0) {
        }
        i15 = i8 & 128;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i8 & 256;
        if (i17 == 0) {
        }
        i18 = i17;
        if (composerKN.HI((i9 & 38347923) == 38347922, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final Saver ck(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.n(new Function2<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l2) {
                return n(saverScope, l2.longValue());
            }

            public final Long n(SaverScope saverScope, long j2) {
                if (SelectionRegistrarKt.rl(selectionRegistrar, j2)) {
                    return Long.valueOf(j2);
                }
                return null;
            }
        }, new Function1<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Long l2) {
                return n(l2.longValue());
            }

            public final Long n(long j2) {
                return Long.valueOf(j2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void n(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, Map map, Composer composer, final int i5, final int i7) {
        AnnotatedString annotatedString2;
        int i8;
        Modifier modifier2;
        int i9;
        TextStyle textStyle2;
        int i10;
        Function1 function12;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final int i16;
        final int i17;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final boolean z3;
        final Map map2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i18;
        Modifier modifier4;
        int i19;
        Function1 function14;
        Composer composerKN = composer.KN(-648605928);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i5 & 6) == 0) {
                i8 = (composerKN.p5(annotatedString2) ? 4 : 2) | i5;
            } else {
                i8 = i5;
            }
        }
        int i20 = i7 & 2;
        if (i20 != 0) {
            i8 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    textStyle2 = textStyle;
                    i8 |= composerKN.p5(textStyle2) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        function12 = function1;
                        i8 |= composerKN.E2(function12) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i5 & 24576) == 0) {
                            i8 |= composerKN.t(i2) ? 16384 : 8192;
                        }
                        i12 = i7 & 32;
                        if (i12 != 0) {
                            i8 |= 196608;
                        } else {
                            if ((196608 & i5) == 0) {
                                i8 |= composerKN.n(z2) ? 131072 : 65536;
                            }
                            i13 = i7 & 64;
                            if (i13 == 0) {
                                i8 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i8 |= composerKN.t(i3) ? 1048576 : 524288;
                            }
                            i14 = i7 & 128;
                            if (i14 != 0) {
                                if ((i5 & 12582912) == 0) {
                                    i15 = i14;
                                    i8 |= composerKN.E2(map) ? 8388608 : 4194304;
                                }
                                if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                                    if (i20 != 0) {
                                        modifier4 = Modifier.INSTANCE;
                                        i18 = i11;
                                    } else {
                                        i18 = i11;
                                        modifier4 = modifier2;
                                    }
                                    TextStyle textStyleN = i9 != 0 ? TextStyle.INSTANCE.n() : textStyle2;
                                    if (i10 != 0) {
                                        function14 = null;
                                        i19 = i12;
                                    } else {
                                        i19 = i12;
                                        function14 = function12;
                                    }
                                    int iN = i18 != 0 ? TextOverflow.INSTANCE.n() : i2;
                                    boolean z4 = i19 != 0 ? true : z2;
                                    int i21 = i13 != 0 ? Integer.MAX_VALUE : i3;
                                    Map mapEmptyMap = i15 != 0 ? MapsKt.emptyMap() : map;
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-648605928, i8, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:392)");
                                    }
                                    composer2 = composerKN;
                                    nr(annotatedString2, modifier4, textStyleN, function14, iN, z4, i21, 1, mapEmptyMap, null, null, composer2, (i8 & 14) | 12582912 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (3670016 & i8) | ((i8 << 3) & 234881024), 0, 1536);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier3 = modifier4;
                                    textStyle3 = textStyleN;
                                    function13 = function14;
                                    i16 = iN;
                                    z3 = z4;
                                    i17 = i21;
                                    map2 = mapEmptyMap;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    i16 = i2;
                                    i17 = i3;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    function13 = function12;
                                    z3 = z2;
                                    map2 = map;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i22) {
                                            BasicTextKt.n(annotatedString, modifier3, textStyle3, function13, i16, z3, i17, map2, composer3, RecomposeScopeImplKt.n(i5 | 1), i7);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i8 |= 12582912;
                            i15 = i14;
                            if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i13 = i7 & 64;
                        if (i13 == 0) {
                        }
                        i14 = i7 & 128;
                        if (i14 != 0) {
                        }
                        i15 = i14;
                        if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i12 = i7 & 32;
                    if (i12 != 0) {
                    }
                    i13 = i7 & 64;
                    if (i13 == 0) {
                    }
                    i14 = i7 & 128;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function12 = function1;
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                i12 = i7 & 32;
                if (i12 != 0) {
                }
                i13 = i7 & 64;
                if (i13 == 0) {
                }
                i14 = i7 & 128;
                if (i14 != 0) {
                }
                i15 = i14;
                if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            textStyle2 = textStyle;
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            function12 = function1;
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            i12 = i7 & 32;
            if (i12 != 0) {
            }
            i13 = i7 & 64;
            if (i13 == 0) {
            }
            i14 = i7 & 128;
            if (i14 != 0) {
            }
            i15 = i14;
            if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        textStyle2 = textStyle;
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        function12 = function1;
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        i12 = i7 & 32;
        if (i12 != 0) {
        }
        i13 = i7 & 64;
        if (i13 == 0) {
        }
        i14 = i7 & 128;
        if (i14 != 0) {
        }
        i15 = i14;
        if (composerKN.HI((i8 & 4793491) != 4793490, i8 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i5, Map map, ColorProducer colorProducer, TextAutoSize textAutoSize, Composer composer, final int i7, final int i8, final int i9) {
        int i10;
        int i11;
        TextStyle textStyle2;
        int i12;
        Function1 function12;
        int i13;
        int iN;
        int i14;
        int i15;
        final int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        final AnnotatedString annotatedString2;
        Composer composer2;
        Modifier modifier2;
        final int i26;
        final Map map2;
        final ColorProducer colorProducer2;
        final int i27;
        final TextStyle textStyle3;
        final Function1 function13;
        final boolean z3;
        final TextAutoSize textAutoSize2;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i28;
        TextStyle textStyle4;
        Function1 function14;
        Composer composer3;
        SelectionController selectionController;
        int i29;
        TextStyle textStyle5;
        boolean z4;
        long jLongValue;
        boolean zNr;
        Object objIF;
        Composer composerKN = composer.KN(-1343466571);
        if ((i9 & 1) != 0) {
            i10 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i10 = (composerKN.p5(annotatedString) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        int i30 = i9 & 2;
        if (i30 != 0) {
            i10 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                i10 |= composerKN.p5(modifier) ? 32 : 16;
            }
            i11 = i9 & 4;
            if (i11 == 0) {
                i10 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    textStyle2 = textStyle;
                    i10 |= composerKN.p5(textStyle2) ? 256 : 128;
                }
                i12 = i9 & 8;
                if (i12 != 0) {
                    i10 |= 3072;
                } else {
                    if ((i7 & 3072) == 0) {
                        function12 = function1;
                        i10 |= composerKN.E2(function12) ? 2048 : 1024;
                    }
                    i13 = i9 & 16;
                    if (i13 == 0) {
                        i10 |= 24576;
                    } else {
                        if ((i7 & 24576) == 0) {
                            iN = i2;
                            i10 |= composerKN.t(iN) ? 16384 : 8192;
                        }
                        i14 = i9 & 32;
                        if (i14 != 0) {
                            i10 |= 196608;
                        } else if ((i7 & 196608) == 0) {
                            i10 |= composerKN.n(z2) ? 131072 : 65536;
                        }
                        i15 = i9 & 64;
                        if (i15 != 0) {
                            i10 |= 1572864;
                            i16 = i3;
                        } else {
                            i16 = i3;
                            if ((i7 & 1572864) == 0) {
                                i10 |= composerKN.t(i16) ? 1048576 : 524288;
                            }
                        }
                        i17 = i9 & 128;
                        if (i17 != 0) {
                            i10 |= 12582912;
                        } else {
                            if ((i7 & 12582912) == 0) {
                                i18 = i17;
                                i10 |= composerKN.t(i5) ? 8388608 : 4194304;
                            }
                            i19 = i9 & 256;
                            if (i19 == 0) {
                                i10 |= 100663296;
                            } else {
                                if ((i7 & 100663296) == 0) {
                                    i20 = i19;
                                    i10 |= composerKN.E2(map) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                }
                                i21 = i9 & 512;
                                if (i21 != 0) {
                                    i10 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                } else {
                                    if ((i7 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                        i22 = i21;
                                        i10 |= composerKN.E2(colorProducer) ? 536870912 : 268435456;
                                    }
                                    i23 = i9 & 1024;
                                    if (i23 == 0) {
                                        i25 = i8 | 6;
                                    } else {
                                        if ((i8 & 6) != 0) {
                                            i24 = i8;
                                            if (composerKN.HI(((i10 & 306783379) == 306783378 && (i24 & 3) == 2) ? false : true, i10 & 1)) {
                                                Modifier modifier3 = i30 != 0 ? Modifier.INSTANCE : modifier;
                                                TextStyle textStyleN = i11 != 0 ? TextStyle.INSTANCE.n() : textStyle2;
                                                Function1 function15 = i12 != 0 ? null : function12;
                                                if (i13 != 0) {
                                                    iN = TextOverflow.INSTANCE.n();
                                                }
                                                boolean z5 = i14 != 0 ? true : z2;
                                                if (i15 != 0) {
                                                    i16 = Integer.MAX_VALUE;
                                                }
                                                int i31 = i16;
                                                int i32 = iN;
                                                int i33 = i18 != 0 ? 1 : i5;
                                                Map mapEmptyMap = i20 != 0 ? MapsKt.emptyMap() : map;
                                                ColorProducer colorProducer3 = i22 != 0 ? null : colorProducer;
                                                TextAutoSize textAutoSize3 = i23 != 0 ? null : textAutoSize;
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(-1343466571, i10, i24, "androidx.compose.foundation.text.BasicText (BasicText.kt:194)");
                                                }
                                                HeightInLinesModifierKt.rl(i33, i31);
                                                final SelectionRegistrar selectionRegistrar = (SelectionRegistrar) composerKN.ty(SelectionRegistrarKt.n());
                                                if (selectionRegistrar != null) {
                                                    composerKN.eF(-1584170794);
                                                    long selectionBackgroundColor = ((SelectionColors) composerKN.ty(TextSelectionColorsKt.rl())).getSelectionBackgroundColor();
                                                    Object[] objArr = {selectionRegistrar};
                                                    Saver saverCk = ck(selectionRegistrar);
                                                    i28 = i24;
                                                    boolean zE2 = composerKN.E2(selectionRegistrar);
                                                    modifier2 = modifier3;
                                                    Object objIF2 = composerKN.iF();
                                                    if (zE2) {
                                                        textStyle4 = textStyleN;
                                                    } else {
                                                        textStyle4 = textStyleN;
                                                        if (objIF2 == Composer.INSTANCE.n()) {
                                                        }
                                                        composer3 = composerKN;
                                                        Number number = (Number) RememberSaveableKt.O(objArr, saverCk, null, (Function0) objIF2, composerKN, 0, 4);
                                                        function14 = function15;
                                                        jLongValue = number.longValue();
                                                        zNr = composer3.nr(jLongValue) | composer3.p5(selectionRegistrar) | composer3.nr(selectionBackgroundColor);
                                                        objIF = composer3.iF();
                                                        if (!zNr || objIF == Composer.INSTANCE.n()) {
                                                            objIF = new SelectionController(jLongValue, selectionRegistrar, selectionBackgroundColor, null, 8, null);
                                                            composer3.o(objIF);
                                                        }
                                                        composer3.Xw();
                                                        selectionController = (SelectionController) objIF;
                                                    }
                                                    objIF2 = new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$2$1
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                        public final Long invoke() {
                                                            return Long.valueOf(selectionRegistrar.n());
                                                        }
                                                    };
                                                    composerKN.o(objIF2);
                                                    composer3 = composerKN;
                                                    Number number2 = (Number) RememberSaveableKt.O(objArr, saverCk, null, (Function0) objIF2, composerKN, 0, 4);
                                                    function14 = function15;
                                                    jLongValue = number2.longValue();
                                                    zNr = composer3.nr(jLongValue) | composer3.p5(selectionRegistrar) | composer3.nr(selectionBackgroundColor);
                                                    objIF = composer3.iF();
                                                    if (!zNr) {
                                                        objIF = new SelectionController(jLongValue, selectionRegistrar, selectionBackgroundColor, null, 8, null);
                                                        composer3.o(objIF);
                                                        composer3.Xw();
                                                        selectionController = (SelectionController) objIF;
                                                    }
                                                } else {
                                                    i28 = i24;
                                                    modifier2 = modifier3;
                                                    textStyle4 = textStyleN;
                                                    function14 = function15;
                                                    composer3 = composerKN;
                                                    composer3.eF(-1583679630);
                                                    composer3.Xw();
                                                    selectionController = null;
                                                }
                                                boolean zRl = AnnotatedStringResolveInlineContentKt.rl(annotatedString);
                                                boolean zN = TextAnnotatedStringNodeKt.n(annotatedString);
                                                if (zRl || zN) {
                                                    annotatedString2 = annotatedString;
                                                    Composer composer4 = composer3;
                                                    boolean z6 = z5;
                                                    i29 = i32;
                                                    TextStyle textStyle6 = textStyle4;
                                                    SelectionController selectionController2 = selectionController;
                                                    composer4.eF(-1582650709);
                                                    boolean z7 = (i10 & 14) == 4;
                                                    Object objIF3 = composer4.iF();
                                                    if (z7 || objIF3 == Composer.INSTANCE.n()) {
                                                        objIF3 = SnapshotStateKt__SnapshotStateKt.O(annotatedString2, null, 2, null);
                                                        composer4.o(objIF3);
                                                    }
                                                    final MutableState mutableState = (MutableState) objIF3;
                                                    AnnotatedString annotatedStringXMQ = xMQ(mutableState);
                                                    FontFamily.Resolver resolver = (FontFamily.Resolver) composer4.ty(CompositionLocalsKt.KN());
                                                    boolean zP5 = composer4.p5(mutableState);
                                                    Object objIF4 = composer4.iF();
                                                    if (zP5 || objIF4 == Composer.INSTANCE.n()) {
                                                        objIF4 = new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                                                n(textSubstitutionValue);
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void n(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                                                BasicTextKt.mUb(mutableState, textSubstitutionValue.nr() ? textSubstitutionValue.t() : textSubstitutionValue.rl());
                                                            }
                                                        };
                                                        composer4.o(objIF4);
                                                    }
                                                    int i34 = i10 << 6;
                                                    int i35 = ((i10 >> 21) & 896) | ((i28 << 12) & 57344);
                                                    textStyle5 = textStyle6;
                                                    Modifier modifier4 = modifier2;
                                                    gh(modifier4, annotatedStringXMQ, function14, zRl, mapEmptyMap, textStyle5, i29, z6, i31, i33, resolver, selectionController2, colorProducer3, (Function1) objIF4, textAutoSize3, composer4, ((i10 >> 3) & 910) | ((i10 >> 12) & 57344) | ((i10 << 9) & 458752) | (3670016 & i34) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), i35, 0);
                                                    z4 = z6;
                                                    composer2 = composer4;
                                                    modifier2 = modifier4;
                                                    composer2.Xw();
                                                } else {
                                                    composer3.eF(-1583500636);
                                                    FontFamily.Resolver resolver2 = (FontFamily.Resolver) composer3.ty(CompositionLocalsKt.KN());
                                                    boolean z9 = z5;
                                                    annotatedString2 = annotatedString;
                                                    Composer composer5 = composer3;
                                                    i29 = i32;
                                                    TextStyle textStyle7 = textStyle4;
                                                    Modifier modifierIk = Ik(modifier2, annotatedString2, textStyle7, function14, i29, z9, i31, i33, resolver2, null, null, selectionController, colorProducer3, null, textAutoSize3);
                                                    EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.f19674n;
                                                    int iN2 = ComposablesKt.n(composer5, 0);
                                                    Modifier modifierO = ComposedModifierKt.O(composer5, modifierIk);
                                                    CompositionLocalMap compositionLocalMapIk = composer5.Ik();
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
                                                    Updater.O(composerN, emptyMeasurePolicy, companion.t());
                                                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                                                    Updater.O(composerN, modifierO, companion.nr());
                                                    Function2 function2Rl = companion.rl();
                                                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN2))) {
                                                        composerN.o(Integer.valueOf(iN2));
                                                        composerN.az(Integer.valueOf(iN2), function2Rl);
                                                    }
                                                    composer5.XQ();
                                                    composer5.Xw();
                                                    textStyle5 = textStyle7;
                                                    z4 = z9;
                                                    composer2 = composer5;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                                i26 = i33;
                                                colorProducer2 = colorProducer3;
                                                textAutoSize2 = textAutoSize3;
                                                map2 = mapEmptyMap;
                                                textStyle3 = textStyle5;
                                                i16 = i31;
                                                z3 = z4;
                                                i27 = i29;
                                                function13 = function14;
                                            } else {
                                                annotatedString2 = annotatedString;
                                                composer2 = composerKN;
                                                composer2.wTp();
                                                modifier2 = modifier;
                                                i26 = i5;
                                                map2 = map;
                                                colorProducer2 = colorProducer;
                                                i27 = iN;
                                                textStyle3 = textStyle2;
                                                function13 = function12;
                                                z3 = z2;
                                                textAutoSize2 = textAutoSize;
                                            }
                                            scopeUpdateScopeGh = composer2.gh();
                                            if (scopeUpdateScopeGh != null) {
                                                final Modifier modifier5 = modifier2;
                                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                        n(composer6, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer6, int i36) {
                                                        BasicTextKt.nr(annotatedString2, modifier5, textStyle3, function13, i27, z3, i16, i26, map2, colorProducer2, textAutoSize2, composer6, RecomposeScopeImplKt.n(i7 | 1), RecomposeScopeImplKt.n(i8), i9);
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i25 = i8 | ((i8 & 8) == 0 ? composerKN.p5(textAutoSize) : composerKN.E2(textAutoSize) ? 4 : 2);
                                    }
                                    i24 = i25;
                                    if (composerKN.HI(((i10 & 306783379) == 306783378 && (i24 & 3) == 2) ? false : true, i10 & 1)) {
                                    }
                                    scopeUpdateScopeGh = composer2.gh();
                                    if (scopeUpdateScopeGh != null) {
                                    }
                                }
                                i22 = i21;
                                i23 = i9 & 1024;
                                if (i23 == 0) {
                                }
                                i24 = i25;
                                if (composerKN.HI(((i10 & 306783379) == 306783378 && (i24 & 3) == 2) ? false : true, i10 & 1)) {
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                }
                            }
                            i20 = i19;
                            i21 = i9 & 512;
                            if (i21 != 0) {
                            }
                            i22 = i21;
                            i23 = i9 & 1024;
                            if (i23 == 0) {
                            }
                            i24 = i25;
                            if (composerKN.HI(((i10 & 306783379) == 306783378 && (i24 & 3) == 2) ? false : true, i10 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i18 = i17;
                        i19 = i9 & 256;
                        if (i19 == 0) {
                        }
                        i20 = i19;
                        i21 = i9 & 512;
                        if (i21 != 0) {
                        }
                        i22 = i21;
                        i23 = i9 & 1024;
                        if (i23 == 0) {
                        }
                        i24 = i25;
                        if (composerKN.HI(((i10 & 306783379) == 306783378 && (i24 & 3) == 2) ? false : true, i10 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    iN = i2;
                    i14 = i9 & 32;
                    if (i14 != 0) {
                    }
                    i15 = i9 & 64;
                    if (i15 != 0) {
                    }
                    i17 = i9 & 128;
                    if (i17 != 0) {
                    }
                    i18 = i17;
                    i19 = i9 & 256;
                    if (i19 == 0) {
                    }
                    i20 = i19;
                    i21 = i9 & 512;
                    if (i21 != 0) {
                    }
                    i22 = i21;
                    i23 = i9 & 1024;
                    if (i23 == 0) {
                    }
                    i24 = i25;
                    if (composerKN.HI(((i10 & 306783379) == 306783378 && (i24 & 3) == 2) ? false : true, i10 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function12 = function1;
                i13 = i9 & 16;
                if (i13 == 0) {
                }
                iN = i2;
                i14 = i9 & 32;
                if (i14 != 0) {
                }
                i15 = i9 & 64;
                if (i15 != 0) {
                }
                i17 = i9 & 128;
                if (i17 != 0) {
                }
                i18 = i17;
                i19 = i9 & 256;
                if (i19 == 0) {
                }
                i20 = i19;
                i21 = i9 & 512;
                if (i21 != 0) {
                }
                i22 = i21;
                i23 = i9 & 1024;
                if (i23 == 0) {
                }
                i24 = i25;
                if (composerKN.HI(((i10 & 306783379) == 306783378 && (i24 & 3) == 2) ? false : true, i10 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            textStyle2 = textStyle;
            i12 = i9 & 8;
            if (i12 != 0) {
            }
            function12 = function1;
            i13 = i9 & 16;
            if (i13 == 0) {
            }
            iN = i2;
            i14 = i9 & 32;
            if (i14 != 0) {
            }
            i15 = i9 & 64;
            if (i15 != 0) {
            }
            i17 = i9 & 128;
            if (i17 != 0) {
            }
            i18 = i17;
            i19 = i9 & 256;
            if (i19 == 0) {
            }
            i20 = i19;
            i21 = i9 & 512;
            if (i21 != 0) {
            }
            i22 = i21;
            i23 = i9 & 1024;
            if (i23 == 0) {
            }
            i24 = i25;
            if (composerKN.HI(((i10 & 306783379) == 306783378 && (i24 & 3) == 2) ? false : true, i10 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        i11 = i9 & 4;
        if (i11 == 0) {
        }
        textStyle2 = textStyle;
        i12 = i9 & 8;
        if (i12 != 0) {
        }
        function12 = function1;
        i13 = i9 & 16;
        if (i13 == 0) {
        }
        iN = i2;
        i14 = i9 & 32;
        if (i14 != 0) {
        }
        i15 = i9 & 64;
        if (i15 != 0) {
        }
        i17 = i9 & 128;
        if (i17 != 0) {
        }
        i18 = i17;
        i19 = i9 & 256;
        if (i19 == 0) {
        }
        i20 = i19;
        i21 = i9 & 512;
        if (i21 != 0) {
        }
        i22 = i21;
        i23 = i9 & 1024;
        if (i23 == 0) {
        }
        i24 = i25;
        if (composerKN.HI(((i10 & 306783379) == 306783378 && (i24 & 3) == 2) ? false : true, i10 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void rl(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, int i5, Composer composer, final int i7, final int i8) {
        String str2;
        int i9;
        Modifier modifier2;
        int i10;
        TextStyle textStyle2;
        int i11;
        Function1 function12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer composer2;
        final int i17;
        final int i18;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final boolean z3;
        final int i19;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i20;
        Modifier modifier4;
        int i21;
        Function1 function14;
        Composer composerKN = composer.KN(1542716361);
        if ((i8 & 1) != 0) {
            i9 = i7 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i7 & 6) == 0) {
                i9 = (composerKN.p5(str2) ? 4 : 2) | i7;
            } else {
                i9 = i7;
            }
        }
        int i22 = i8 & 2;
        if (i22 != 0) {
            i9 |= 48;
        } else {
            if ((i7 & 48) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i10 = i8 & 4;
            if (i10 == 0) {
                i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i7 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    textStyle2 = textStyle;
                    i9 |= composerKN.p5(textStyle2) ? 256 : 128;
                }
                i11 = i8 & 8;
                if (i11 != 0) {
                    i9 |= 3072;
                } else {
                    if ((i7 & 3072) == 0) {
                        function12 = function1;
                        i9 |= composerKN.E2(function12) ? 2048 : 1024;
                    }
                    i12 = i8 & 16;
                    if (i12 == 0) {
                        i9 |= 24576;
                    } else {
                        if ((i7 & 24576) == 0) {
                            i9 |= composerKN.t(i2) ? 16384 : 8192;
                        }
                        i13 = i8 & 32;
                        if (i13 != 0) {
                            i9 |= 196608;
                        } else {
                            if ((196608 & i7) == 0) {
                                i9 |= composerKN.n(z2) ? 131072 : 65536;
                            }
                            i14 = i8 & 64;
                            if (i14 == 0) {
                                i9 |= 1572864;
                            } else if ((i7 & 1572864) == 0) {
                                i9 |= composerKN.t(i3) ? 1048576 : 524288;
                            }
                            i15 = i8 & 128;
                            if (i15 != 0) {
                                if ((i7 & 12582912) == 0) {
                                    i16 = i15;
                                    i9 |= composerKN.t(i5) ? 8388608 : 4194304;
                                }
                                if (composerKN.HI((i9 & 4793491) != 4793490, i9 & 1)) {
                                    if (i22 != 0) {
                                        modifier4 = Modifier.INSTANCE;
                                        i20 = i12;
                                    } else {
                                        i20 = i12;
                                        modifier4 = modifier2;
                                    }
                                    TextStyle textStyleN = i10 != 0 ? TextStyle.INSTANCE.n() : textStyle2;
                                    if (i11 != 0) {
                                        function14 = null;
                                        i21 = i13;
                                    } else {
                                        i21 = i13;
                                        function14 = function12;
                                    }
                                    int iN = i20 != 0 ? TextOverflow.INSTANCE.n() : i2;
                                    boolean z4 = i21 != 0 ? true : z2;
                                    int i23 = i14 != 0 ? Integer.MAX_VALUE : i3;
                                    int i24 = i16 != 0 ? 1 : i5;
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1542716361, i9, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:417)");
                                    }
                                    composer2 = composerKN;
                                    J2(str2, modifier4, textStyleN, function14, iN, z4, i23, i24, null, null, composer2, i9 & 33554430, 768);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier3 = modifier4;
                                    textStyle3 = textStyleN;
                                    function13 = function14;
                                    i17 = iN;
                                    z3 = z4;
                                    i18 = i23;
                                    i19 = i24;
                                } else {
                                    composer2 = composerKN;
                                    composer2.wTp();
                                    i17 = i2;
                                    i18 = i3;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    function13 = function12;
                                    z3 = z2;
                                    i19 = i5;
                                }
                                scopeUpdateScopeGh = composer2.gh();
                                if (scopeUpdateScopeGh != null) {
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i25) {
                                            BasicTextKt.rl(str, modifier3, textStyle3, function13, i17, z3, i18, i19, composer3, RecomposeScopeImplKt.n(i7 | 1), i8);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i9 |= 12582912;
                            i16 = i15;
                            if (composerKN.HI((i9 & 4793491) != 4793490, i9 & 1)) {
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh != null) {
                            }
                        }
                        i14 = i8 & 64;
                        if (i14 == 0) {
                        }
                        i15 = i8 & 128;
                        if (i15 != 0) {
                        }
                        i16 = i15;
                        if (composerKN.HI((i9 & 4793491) != 4793490, i9 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                        }
                    }
                    i13 = i8 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i8 & 64;
                    if (i14 == 0) {
                    }
                    i15 = i8 & 128;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    if (composerKN.HI((i9 & 4793491) != 4793490, i9 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function12 = function1;
                i12 = i8 & 16;
                if (i12 == 0) {
                }
                i13 = i8 & 32;
                if (i13 != 0) {
                }
                i14 = i8 & 64;
                if (i14 == 0) {
                }
                i15 = i8 & 128;
                if (i15 != 0) {
                }
                i16 = i15;
                if (composerKN.HI((i9 & 4793491) != 4793490, i9 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            textStyle2 = textStyle;
            i11 = i8 & 8;
            if (i11 != 0) {
            }
            function12 = function1;
            i12 = i8 & 16;
            if (i12 == 0) {
            }
            i13 = i8 & 32;
            if (i13 != 0) {
            }
            i14 = i8 & 64;
            if (i14 == 0) {
            }
            i15 = i8 & 128;
            if (i15 != 0) {
            }
            i16 = i15;
            if (composerKN.HI((i9 & 4793491) != 4793490, i9 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 4;
        if (i10 == 0) {
        }
        textStyle2 = textStyle;
        i11 = i8 & 8;
        if (i11 != 0) {
        }
        function12 = function1;
        i12 = i8 & 16;
        if (i12 == 0) {
        }
        i13 = i8 & 32;
        if (i13 != 0) {
        }
        i14 = i8 & 64;
        if (i14 == 0) {
        }
        i15 = i8 & 128;
        if (i15 != 0) {
        }
        i16 = i15;
        if (composerKN.HI((i9 & 4793491) != 4793490, i9 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void t(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i2, boolean z2, int i3, Composer composer, final int i5, final int i7) {
        String str2;
        int i8;
        Modifier modifier2;
        int i9;
        TextStyle textStyle2;
        int i10;
        int i11;
        int i12;
        boolean z3;
        int i13;
        Composer composer2;
        final int i14;
        final int i15;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function12;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i16;
        TextStyle textStyleN;
        int i17;
        int iN;
        Composer composerKN = composer.KN(1022429478);
        if ((i7 & 1) != 0) {
            i8 = i5 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i5 & 6) == 0) {
                i8 = (composerKN.p5(str2) ? 4 : 2) | i5;
            } else {
                i8 = i5;
            }
        }
        int i18 = i7 & 2;
        if (i18 != 0) {
            i8 |= 48;
        } else {
            if ((i5 & 48) == 0) {
                modifier2 = modifier;
                i8 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i9 = i7 & 4;
            if (i9 == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    textStyle2 = textStyle;
                    i8 |= composerKN.p5(textStyle2) ? 256 : 128;
                }
                i10 = i7 & 8;
                if (i10 != 0) {
                    i8 |= 3072;
                } else {
                    if ((i5 & 3072) == 0) {
                        i8 |= composerKN.E2(function1) ? 2048 : 1024;
                    }
                    i11 = i7 & 16;
                    if (i11 == 0) {
                        i8 |= 24576;
                    } else {
                        if ((i5 & 24576) == 0) {
                            i8 |= composerKN.t(i2) ? 16384 : 8192;
                        }
                        i12 = i7 & 32;
                        if (i12 == 0) {
                            if ((196608 & i5) == 0) {
                                z3 = z2;
                                i8 |= composerKN.n(z3) ? 131072 : 65536;
                            }
                            i13 = i7 & 64;
                            if (i13 == 0) {
                                i8 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i8 |= composerKN.t(i3) ? 1048576 : 524288;
                            }
                            if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                i14 = i2;
                                i15 = i3;
                                modifier3 = modifier2;
                                textStyle3 = textStyle2;
                                function12 = function1;
                            } else {
                                Modifier modifier4 = i18 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i9 != 0) {
                                    textStyleN = TextStyle.INSTANCE.n();
                                    i16 = i11;
                                } else {
                                    i16 = i11;
                                    textStyleN = textStyle2;
                                }
                                Function1 function13 = i10 != 0 ? null : function1;
                                if (i16 != 0) {
                                    iN = TextOverflow.INSTANCE.n();
                                    i17 = i12;
                                } else {
                                    i17 = i12;
                                    iN = i2;
                                }
                                if (i17 != 0) {
                                    z3 = true;
                                }
                                int i19 = i13 != 0 ? Integer.MAX_VALUE : i3;
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1022429478, i8, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:368)");
                                }
                                composer2 = composerKN;
                                J2(str2, modifier4, textStyleN, function13, iN, z3, i19, 1, null, null, composer2, (i8 & 14) | 12582912 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 3670016), 768);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                modifier3 = modifier4;
                                textStyle3 = textStyleN;
                                function12 = function13;
                                i14 = iN;
                                i15 = i19;
                            }
                            final boolean z4 = z3;
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i20) {
                                        BasicTextKt.t(str, modifier3, textStyle3, function12, i14, z4, i15, composer3, RecomposeScopeImplKt.n(i5 | 1), i7);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i8 |= 196608;
                        z3 = z2;
                        i13 = i7 & 64;
                        if (i13 == 0) {
                        }
                        if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                        }
                        final boolean z42 = z3;
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    i12 = i7 & 32;
                    if (i12 == 0) {
                    }
                    z3 = z2;
                    i13 = i7 & 64;
                    if (i13 == 0) {
                    }
                    if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                    }
                    final boolean z422 = z3;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                i11 = i7 & 16;
                if (i11 == 0) {
                }
                i12 = i7 & 32;
                if (i12 == 0) {
                }
                z3 = z2;
                i13 = i7 & 64;
                if (i13 == 0) {
                }
                if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
                }
                final boolean z4222 = z3;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            textStyle2 = textStyle;
            i10 = i7 & 8;
            if (i10 != 0) {
            }
            i11 = i7 & 16;
            if (i11 == 0) {
            }
            i12 = i7 & 32;
            if (i12 == 0) {
            }
            z3 = z2;
            i13 = i7 & 64;
            if (i13 == 0) {
            }
            if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
            }
            final boolean z42222 = z3;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i9 = i7 & 4;
        if (i9 == 0) {
        }
        textStyle2 = textStyle;
        i10 = i7 & 8;
        if (i10 != 0) {
        }
        i11 = i7 & 16;
        if (i11 == 0) {
        }
        i12 = i7 & 32;
        if (i12 == 0) {
        }
        z3 = z2;
        i13 = i7 & 64;
        if (i13 == 0) {
        }
        if (composerKN.HI((i8 & 599187) == 599186, i8 & 1)) {
        }
        final boolean z422222 = z3;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List HI(List list, Function0 function0) {
        if (((Boolean) function0.invoke()).booleanValue()) {
            TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Measurable measurable = (Measurable) list.get(i2);
                Object objJ2 = measurable.getParentData();
                Intrinsics.checkNotNull(objJ2, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
                TextRangeLayoutMeasureResult textRangeLayoutMeasureResultN = ((TextRangeLayoutModifier) objJ2).getMeasurePolicy().n(textRangeLayoutMeasureScope);
                arrayList.add(new Pair(measurable.dR0(Constraints.INSTANCE.rl(textRangeLayoutMeasureResultN.getWidth(), textRangeLayoutMeasureResultN.getWidth(), textRangeLayoutMeasureResultN.getHeight(), textRangeLayoutMeasureResultN.getHeight())), textRangeLayoutMeasureResultN.getPlace()));
            }
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(MutableState mutableState, AnnotatedString annotatedString) {
        mutableState.setValue(annotatedString);
    }

    private static final AnnotatedString xMQ(MutableState mutableState) {
        return (AnnotatedString) mutableState.getValue();
    }
}
