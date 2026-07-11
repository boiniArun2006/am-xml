package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u008c\u0001BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b3\u0010-J`\u00104\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 ø\u0001\u0000¢\u0006\u0004\b4\u00105Ja\u00106\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b6\u00107J-\u0010<\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\rH\u0000¢\u0006\u0004\b>\u0010/J\u0013\u0010@\u001a\u00020\r*\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ(\u0010I\u001a\u00020H2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020Fø\u0001\u0000¢\u0006\u0004\bI\u0010JJ&\u0010K\u001a\u00020H*\u00020B2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010JJ%\u0010P\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u0010QJ%\u0010T\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013¢\u0006\u0004\bT\u0010QJ#\u0010U\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010QJ%\u0010V\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013¢\u0006\u0004\bV\u0010QJ#\u0010W\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0013H\u0016¢\u0006\u0004\bW\u0010QJ%\u0010X\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013¢\u0006\u0004\bX\u0010QJ#\u0010Y\u001a\u00020\u0013*\u00020L2\u0006\u0010E\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0013H\u0016¢\u0006\u0004\bY\u0010QJ\u0015\u0010\\\u001a\u00020\r2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\u00020\r*\u00020ZH\u0016¢\u0006\u0004\b^\u0010]R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010_R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010dR\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010fR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010fR$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR,\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010dR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010nR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010dR*\u0010y\u001a\u0010\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u0013\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bv\u0010w\u0012\u0004\bx\u0010/R\u0018\u0010{\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010zR*\u0010~\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0|\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010dR*\u0010\u0085\u0001\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0088\u0001\u001a\u00020(8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008d\u0001"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", "overrideColor", "Landroidx/compose/foundation/text/TextAutoSize;", "autoSize", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "b", "(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "updatedText", "R3E", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "ZwA", "()V", TtmlNode.ATTR_TTS_COLOR, RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/text/TextStyle;)Z", "cAB", "f11", "(Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;ILandroidx/compose/foundation/text/TextAutoSize;)Z", "Yq", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Lkotlin/jvm/functions/Function1;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "ni", "(ZZZZ)V", CmcdConfiguration.KEY_PLAYBACK_RATE, "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "eOa", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "nr", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "VK2", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "v", "width", "i7", "nHg", "kC", "U", "jE", "r", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "contentDrawScope", "GT", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "N", "Landroidx/compose/ui/text/AnnotatedString;", "Xw", "Landroidx/compose/ui/text/TextStyle;", "jB", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Lkotlin/jvm/functions/Function1;", "P5", "I", "M7", "Z", "p5", "eF", "E", "Ljava/util/List;", "M", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "B", "Landroidx/compose/ui/graphics/ColorProducer;", "J", "Landroidx/compose/foundation/text/TextAutoSize;", "D", "", "Landroidx/compose/ui/layout/AlignmentLine;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "_layoutCache", "", "GR", "semanticsTextLayoutResult", "Nxk", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "WKb", "()Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "setTextSubstitution$foundation_release", "(Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;)V", "textSubstitution", "Vd", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "layoutCache", "lRt", "()Z", "shouldAutoInvalidate", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,588:1\n1#2:589\n26#3:590\n26#3:591\n54#4:592\n54#4:594\n59#4:596\n59#4:598\n54#4:600\n59#4:602\n54#4:605\n59#4:607\n85#5:593\n85#5:595\n90#5:597\n90#5:599\n85#5:601\n90#5:603\n85#5:606\n90#5:608\n53#5,3:610\n233#6:604\n33#7:609\n635#8:613\n635#8:614\n*S KotlinDebug\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n*L\n437#1:590\n438#1:591\n449#1:592\n450#1:594\n451#1:596\n452#1:598\n456#1:600\n456#1:602\n528#1:605\n529#1:607\n449#1:593\n450#1:595\n451#1:597\n452#1:599\n456#1:601\n456#1:603\n528#1:606\n529#1:608\n530#1:610,3\n522#1:604\n530#1:609\n552#1:613\n554#1:614\n*E\n"})
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private ColorProducer overrideColor;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Function1 onShowTranslation;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private List placeholders;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private SelectionController selectionController;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private Function1 semanticsTextLayoutResult;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private MultiParagraphLayoutCache _layoutCache;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private TextAutoSize autoSize;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private Function1 onPlaceholderLayout;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private TextSubstitutionValue textSubstitution;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Function1 onTextLayout;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Map baselineCache;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private AnnotatedString text;

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0014\u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "", "Landroidx/compose/ui/text/AnnotatedString;", "original", "substitution", "", "isShowingSubstitution", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "layoutCache", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZLandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Landroidx/compose/ui/text/AnnotatedString;", "rl", "()Landroidx/compose/ui/text/AnnotatedString;", "t", "Uo", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Z", "nr", "()Z", "J2", "(Z)V", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "O", "(Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextSubstitutionValue {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final AnnotatedString original;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
        private MultiParagraphLayoutCache layoutCache;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private AnnotatedString substitution;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z2, MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
            this.isShowingSubstitution = z2;
            this.layoutCache = multiParagraphLayoutCache;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) other;
            return Intrinsics.areEqual(this.original, textSubstitutionValue.original) && Intrinsics.areEqual(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && Intrinsics.areEqual(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return iHashCode + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public final void J2(boolean z2) {
            this.isShowingSubstitution = z2;
        }

        public final void O(MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }

        public final void Uo(AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final AnnotatedString getOriginal() {
            return this.original;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public /* synthetic */ TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2, boolean z2, MultiParagraphLayoutCache multiParagraphLayoutCache, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(annotatedString, annotatedString2, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : multiParagraphLayoutCache);
        }
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i5, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, Function1 function13, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i2, z2, i3, i5, list, function12, selectionController, colorProducer, textAutoSize, function13);
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void pr() {
        this.textSubstitution = null;
    }

    private TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i2, boolean z2, int i3, int i5, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, Function1 function13) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = function1;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i5;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        this.autoSize = textAutoSize;
        this.onShowTranslation = function13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R3E(AnnotatedString updatedText) {
        Unit unit;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue == null) {
            TextSubstitutionValue textSubstitutionValue2 = new TextSubstitutionValue(this.text, updatedText, false, null, 12, null);
            MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, CollectionsKt.emptyList(), this.autoSize, null);
            multiParagraphLayoutCache.Z(Vd().getDensity());
            textSubstitutionValue2.O(multiParagraphLayoutCache);
            this.textSubstitution = textSubstitutionValue2;
            return true;
        }
        if (Intrinsics.areEqual(updatedText, textSubstitutionValue.getSubstitution())) {
            return false;
        }
        textSubstitutionValue.Uo(updatedText);
        MultiParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.aYN(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, CollectionsKt.emptyList(), this.autoSize);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        return unit != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiParagraphLayoutCache Vd() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        Intrinsics.checkNotNull(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    private final MultiParagraphLayoutCache b(Density density) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.getIsShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.Z(density);
            return layoutCache;
        }
        MultiParagraphLayoutCache multiParagraphLayoutCacheVd = Vd();
        multiParagraphLayoutCacheVd.Z(density);
        return multiParagraphLayoutCacheVd;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Function1<List<TextLayoutResult>, Boolean> function1 = this.semanticsTextLayoutResult;
        if (function1 == null) {
            function1 = new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x00b7  */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Boolean invoke(List list) {
                    TextLayoutResult textLayoutResultRl;
                    TextLayoutResult layoutCache = this.f20667n.Vd().getLayoutCache();
                    if (layoutCache != null) {
                        AnnotatedString text = layoutCache.getLayoutInput().getText();
                        TextStyle textStyle = this.f20667n.style;
                        ColorProducer colorProducer = this.f20667n.overrideColor;
                        textLayoutResultRl = TextLayoutResult.rl(layoutCache, new TextLayoutInput(text, textStyle.s7N((16609105 & 1) != 0 ? Color.INSTANCE.Uo() : colorProducer != null ? colorProducer.n() : Color.INSTANCE.Uo(), (16609105 & 2) != 0 ? TextUnit.INSTANCE.n() : 0L, (16609105 & 4) != 0 ? null : null, (16609105 & 8) != 0 ? null : null, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : null, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.n() : 0L, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.Uo() : 0L, (16609105 & 4096) != 0 ? null : null, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.Uo() : 0, (16609105 & 65536) != 0 ? TextDirection.INSTANCE.J2() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.n() : 0L, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.rl() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.t() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null), layoutCache.getLayoutInput().getPlaceholders(), layoutCache.getLayoutInput().getMaxLines(), layoutCache.getLayoutInput().getSoftWrap(), layoutCache.getLayoutInput().getOverflow(), layoutCache.getLayoutInput().getDensity(), layoutCache.getLayoutInput().getLayoutDirection(), layoutCache.getLayoutInput().getFontFamilyResolver(), layoutCache.getLayoutInput().getConstraints(), (DefaultConstructorMarker) null), 0L, 2, null);
                        if (textLayoutResultRl != null) {
                            list.add(textLayoutResultRl);
                        } else {
                            textLayoutResultRl = null;
                        }
                    }
                    return Boolean.valueOf(textLayoutResultRl != null);
                }
            };
            this.semanticsTextLayoutResult = function1;
        }
        SemanticsPropertiesKt.Jk(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            SemanticsPropertiesKt.Org(semanticsPropertyReceiver, textSubstitutionValue.getSubstitution());
            SemanticsPropertiesKt.eWT(semanticsPropertyReceiver, textSubstitutionValue.getIsShowingSubstitution());
        }
        SemanticsPropertiesKt.GD(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(AnnotatedString annotatedString) {
                this.f20668n.R3E(annotatedString);
                this.f20668n.ZwA();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.K(semanticsPropertyReceiver, null, new Function1<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return n(bool.booleanValue());
            }

            public final Boolean n(boolean z2) {
                if (this.f20669n.getTextSubstitution() == null) {
                    return Boolean.FALSE;
                }
                Function1 function12 = this.f20669n.onShowTranslation;
                if (function12 != null) {
                    TextAnnotatedStringNode.TextSubstitutionValue textSubstitution = this.f20669n.getTextSubstitution();
                    Intrinsics.checkNotNull(textSubstitution);
                    function12.invoke(textSubstitution);
                }
                TextAnnotatedStringNode.TextSubstitutionValue textSubstitution2 = this.f20669n.getTextSubstitution();
                if (textSubstitution2 != null) {
                    textSubstitution2.J2(z2);
                }
                this.f20669n.ZwA();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.nr(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f20670n.pr();
                this.f20670n.ZwA();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.XQ(semanticsPropertyReceiver, null, function1, 1, null);
    }

    public final boolean G(ColorProducer color, TextStyle style) {
        boolean zAreEqual = Intrinsics.areEqual(color, this.overrideColor);
        this.overrideColor = color;
        return (zAreEqual && style.e(this.style)) ? false : true;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) {
        if (getIsAttached()) {
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.rl(contentDrawScope);
            }
            Canvas canvasKN = contentDrawScope.getDrawContext().KN();
            TextLayoutResult textLayoutResultGh = b(contentDrawScope).gh();
            MultiParagraph multiParagraph = textLayoutResultGh.getMultiParagraph();
            boolean z2 = true;
            boolean z3 = textLayoutResultGh.xMQ() && !TextOverflow.KN(this.overflow, TextOverflow.INSTANCE.O());
            if (z3) {
                Rect rectT = RectKt.t(Offset.INSTANCE.t(), Size.nr((((long) Float.floatToRawIntBits((int) (textLayoutResultGh.getSize() >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (textLayoutResultGh.getSize() & 4294967295L))) & 4294967295L)));
                canvasKN.O();
                Canvas.r(canvasKN, rectT, 0, 2, null);
            }
            try {
                TextDecoration textDecorationG = this.style.g();
                if (textDecorationG == null) {
                    textDecorationG = TextDecoration.INSTANCE.t();
                }
                TextDecoration textDecoration = textDecorationG;
                Shadow shadowAYN = this.style.aYN();
                if (shadowAYN == null) {
                    shadowAYN = Shadow.INSTANCE.n();
                }
                Shadow shadow = shadowAYN;
                DrawStyle drawStyleXMQ = this.style.xMQ();
                if (drawStyleXMQ == null) {
                    drawStyleXMQ = Fill.f31654n;
                }
                DrawStyle drawStyle = drawStyleXMQ;
                Brush brushUo = this.style.Uo();
                if (brushUo != null) {
                    MultiParagraph.nHg(multiParagraph, canvasKN, brushUo, this.style.nr(), shadow, textDecoration, drawStyle, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    long jN = colorProducer != null ? colorProducer.n() : Color.INSTANCE.Uo();
                    if (jN == 16) {
                        jN = this.style.KN() != 16 ? this.style.KN() : Color.INSTANCE.n();
                    }
                    multiParagraph.X(canvasKN, (32 & 2) != 0 ? Color.INSTANCE.Uo() : jN, (32 & 4) != 0 ? null : shadow, (32 & 8) != 0 ? null : textDecoration, (32 & 16) == 0 ? drawStyle : null, (32 & 32) != 0 ? DrawScope.INSTANCE.n() : 0);
                }
                if (z3) {
                    canvasKN.n();
                }
                TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.getIsShowingSubstitution()) ? TextAnnotatedStringNodeKt.n(this.text) : false)) {
                    List list = this.placeholders;
                    if (list != null && !list.isEmpty()) {
                        z2 = false;
                    }
                    if (z2) {
                        return;
                    }
                }
                contentDrawScope.l2();
            } catch (Throwable th) {
                if (z3) {
                    canvasKN.n();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: WKb, reason: from getter */
    public final TextSubstitutionValue getTextSubstitution() {
        return this.textSubstitution;
    }

    public final boolean Yq(Function1 onTextLayout, Function1 onPlaceholderLayout, SelectionController selectionController, Function1 onShowTranslation) {
        boolean z2;
        if (this.onTextLayout != onTextLayout) {
            this.onTextLayout = onTextLayout;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.onPlaceholderLayout != onPlaceholderLayout) {
            this.onPlaceholderLayout = onPlaceholderLayout;
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z2 = true;
        }
        if (this.onShowTranslation == onShowTranslation) {
            return z2;
        }
        this.onShowTranslation = onShowTranslation;
        return true;
    }

    public final boolean cAB(AnnotatedString text) {
        boolean zAreEqual = Intrinsics.areEqual(this.text.getText(), text.getText());
        boolean z2 = (zAreEqual && this.text.az(text)) ? false : true;
        if (z2) {
            this.text = text;
        }
        if (!zAreEqual) {
            pr();
        }
        return z2;
    }

    public final boolean f11(TextStyle style, List placeholders, int minLines, int maxLines, boolean softWrap, FontFamily.Resolver fontFamilyResolver, int overflow, TextAutoSize autoSize) {
        boolean z2 = !this.style.X(style);
        this.style = style;
        if (!Intrinsics.areEqual(this.placeholders, placeholders)) {
            this.placeholders = placeholders;
            z2 = true;
        }
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z2 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z2 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z2 = true;
        }
        if (!TextOverflow.KN(this.overflow, overflow)) {
            this.overflow = overflow;
            z2 = true;
        }
        if (Intrinsics.areEqual(this.autoSize, autoSize)) {
            return z2;
        }
        this.autoSize = autoSize;
        return true;
    }

    public final void ni(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (textChanged || layoutChanged || callbacksChanged) {
            Vd().aYN(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.rl(this);
            }
            if (textChanged || layoutChanged || callbacksChanged) {
                LayoutModifierNodeKt.rl(this);
                DrawModifierNodeKt.n(this);
            }
            if (drawChanged) {
                DrawModifierNodeKt.n(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ZwA() {
        SemanticsModifierNodeKt.rl(this);
        LayoutModifierNodeKt.rl(this);
        DrawModifierNodeKt.n(this);
    }

    public final void GT(ContentDrawScope contentDrawScope) {
        N(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int U(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return b(intrinsicMeasureScope).Ik(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int VK2(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int height) {
        return v(intrinsicMeasureScope, measurable, height);
    }

    public final MeasureResult eOa(MeasureScope measureScope, Measurable measurable, long constraints) {
        return nr(measureScope, measurable, constraints);
    }

    public final int i7(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int width) {
        return nHg(intrinsicMeasureScope, measurable, width);
    }

    public final int jE(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int width) {
        return r(intrinsicMeasureScope, measurable, width);
    }

    public final int kC(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int height) {
        return U(intrinsicMeasureScope, measurable, height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int nHg(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return b(intrinsicMeasureScope).qie(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        MultiParagraphLayoutCache multiParagraphLayoutCacheB = b(measureScope);
        boolean zTy = multiParagraphLayoutCacheB.ty(j2, measureScope.getLayoutDirection());
        TextLayoutResult textLayoutResultGh = multiParagraphLayoutCacheB.gh();
        textLayoutResultGh.getMultiParagraph().getIntrinsics().rl();
        if (zTy) {
            LayoutModifierNodeKt.n(this);
            Function1 function1 = this.onTextLayout;
            if (function1 != null) {
                function1.invoke(textLayoutResultGh);
            }
            SelectionController selectionController = this.selectionController;
            if (selectionController != null) {
                selectionController.KN(textLayoutResultGh);
            }
            Map linkedHashMap = this.baselineCache;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(AlignmentLineKt.n(), Integer.valueOf(Math.round(textLayoutResultGh.getFirstBaseline())));
            linkedHashMap.put(AlignmentLineKt.rl(), Integer.valueOf(Math.round(textLayoutResultGh.getLastBaseline())));
            this.baselineCache = linkedHashMap;
        }
        Function1 function12 = this.onPlaceholderLayout;
        if (function12 != null) {
            function12.invoke(textLayoutResultGh.getPlaceholderRects());
        }
        final Placeable placeableDR0 = measurable.dR0(Constraints.INSTANCE.rl((int) (textLayoutResultGh.getSize() >> 32), (int) (textLayoutResultGh.getSize() >> 32), (int) (textLayoutResultGh.getSize() & 4294967295L), (int) (textLayoutResultGh.getSize() & 4294967295L)));
        int size = (int) (textLayoutResultGh.getSize() >> 32);
        int size2 = (int) (textLayoutResultGh.getSize() & 4294967295L);
        Map map = this.baselineCache;
        Intrinsics.checkNotNull(map);
        return measureScope.Zn(size, size2, map, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
            }
        });
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int r(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return b(intrinsicMeasureScope).qie(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int v(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return b(intrinsicMeasureScope).r(intrinsicMeasureScope.getLayoutDirection());
    }
}
