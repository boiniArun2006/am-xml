package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
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
import androidx.compose.ui.text.Paragraph;
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
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001gBS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u001f\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b&\u0010\u001eJ@\u0010'\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b'\u0010(J%\u0010,\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020\u001f*\u00020.H\u0016¢\u0006\u0004\b/\u00100J&\u00107\u001a\u000206*\u0002012\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u000f*\u00020\u00162\u0006\u00103\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010<J#\u0010>\u001a\u00020\u000f*\u00020\u00162\u0006\u00103\u001a\u0002092\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b>\u0010<J#\u0010?\u001a\u00020\u000f*\u00020\u00162\u0006\u00103\u001a\u0002092\u0006\u0010:\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010<J#\u0010@\u001a\u00020\u000f*\u00020\u00162\u0006\u00103\u001a\u0002092\u0006\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b@\u0010<J\u0013\u0010B\u001a\u00020\u001f*\u00020AH\u0016¢\u0006\u0004\bB\u0010CR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010DR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u0010IR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010IR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010IR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR*\u0010U\u001a\u0010\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020\u000f\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bR\u0010S\u0012\u0004\bT\u0010!R\u0018\u0010X\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010]\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z\u0012\u0004\u0012\u00020\r\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u001bR\u0014\u0010f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", "overrideColor", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "b", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;)Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "WKb", "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "updatedText", "jE", "(Ljava/lang/String;)Z", "", "ni", "()V", "ZwA", TtmlNode.ATTR_TTS_COLOR, "kC", "(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/text/TextStyle;)Z", "i7", "eOa", "(Landroidx/compose/ui/text/TextStyle;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "drawChanged", "textChanged", "layoutChanged", "GT", "(ZZZ)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "v", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "nHg", "U", "r", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Ljava/lang/String;", "Xw", "Landroidx/compose/ui/text/TextStyle;", "jB", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "I", "P5", "Z", "M7", "p5", "eF", "Landroidx/compose/ui/graphics/ColorProducer;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "E", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "M", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "_layoutCache", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/jvm/functions/Function1;", "semanticsTextLayoutResult", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "B", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "textSubstitution", "Vd", "layoutCache", "lRt", "()Z", "shouldAutoInvalidate", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 8 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,473:1\n1#2:474\n26#3:475\n26#3:476\n54#4:477\n54#4:479\n59#4:481\n59#4:483\n54#4:485\n59#4:487\n54#4:497\n59#4:499\n85#5:478\n85#5:480\n90#5:482\n90#5:484\n85#5:486\n90#5:488\n85#5:498\n90#5:500\n107#6,7:489\n233#7:496\n635#8:501\n635#8:502\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n369#1:475\n370#1:476\n377#1:477\n378#1:479\n379#1:481\n380#1:483\n384#1:485\n384#1:487\n427#1:497\n428#1:499\n377#1:478\n378#1:480\n379#1:482\n380#1:484\n384#1:486\n384#1:488\n427#1:498\n428#1:500\n420#1:489,7\n424#1:496\n450#1:501\n452#1:502\n*E\n"})
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private TextSubstitution textSubstitution;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Map baselineCache;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private Function1 semanticsTextLayoutResult;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private ParagraphLayoutCache _layoutCache;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private ColorProducer overrideColor;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$TextSubstitutionValue, reason: from toString */
    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0013\u0010 \"\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "", "", "original", "substitution", "", "isShowingSubstitution", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "layoutCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/String;", "getOriginal", "rl", "J2", "(Ljava/lang/String;)V", "t", "Z", "()Z", "O", "(Z)V", "nr", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "(Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextSubstitution {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String original;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
        private ParagraphLayoutCache layoutCache;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private String substitution;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isShowingSubstitution;

        public TextSubstitution(String str, String str2, boolean z2, ParagraphLayoutCache paragraphLayoutCache) {
            this.original = str;
            this.substitution = str2;
            this.isShowingSubstitution = z2;
            this.layoutCache = paragraphLayoutCache;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSubstitution)) {
                return false;
            }
            TextSubstitution textSubstitution = (TextSubstitution) other;
            return Intrinsics.areEqual(this.original, textSubstitution.original) && Intrinsics.areEqual(this.substitution, textSubstitution.substitution) && this.isShowingSubstitution == textSubstitution.isShowingSubstitution && Intrinsics.areEqual(this.layoutCache, textSubstitution.layoutCache);
        }

        public int hashCode() {
            int iHashCode = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            ParagraphLayoutCache paragraphLayoutCache = this.layoutCache;
            return iHashCode + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final void J2(String str) {
            this.substitution = str;
        }

        public final void O(boolean z2) {
            this.isShowingSubstitution = z2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final void nr(ParagraphLayoutCache paragraphLayoutCache) {
            this.layoutCache = paragraphLayoutCache;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final String getSubstitution() {
            return this.substitution;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + ')';
        }

        public /* synthetic */ TextSubstitution(String str, String str2, boolean z2, ParagraphLayoutCache paragraphLayoutCache, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : paragraphLayoutCache);
        }
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i5, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i2, z2, i3, i5, colorProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ni() {
        this.textSubstitution = null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i5, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i5;
        this.overrideColor = colorProducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphLayoutCache Vd() {
        if (this._layoutCache == null) {
            this._layoutCache = new ParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        ParagraphLayoutCache paragraphLayoutCache = this._layoutCache;
        Intrinsics.checkNotNull(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    private final ParagraphLayoutCache WKb() {
        ParagraphLayoutCache layoutCache;
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            if (!textSubstitution.getIsShowingSubstitution()) {
                textSubstitution = null;
            }
            if (textSubstitution != null && (layoutCache = textSubstitution.getLayoutCache()) != null) {
                return layoutCache;
            }
        }
        return Vd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean jE(String updatedText) {
        Unit unit;
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution == null) {
            TextSubstitution textSubstitution2 = new TextSubstitution(this.text, updatedText, false, null, 12, null);
            ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
            paragraphLayoutCache.az(Vd().getDensity());
            textSubstitution2.nr(paragraphLayoutCache);
            this.textSubstitution = textSubstitution2;
            return true;
        }
        if (Intrinsics.areEqual(updatedText, textSubstitution.getSubstitution())) {
            return false;
        }
        textSubstitution.J2(updatedText);
        ParagraphLayoutCache layoutCache = textSubstitution.getLayoutCache();
        if (layoutCache != null) {
            layoutCache.ck(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        return unit != null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Function1<List<TextLayoutResult>, Boolean> function1 = this.semanticsTextLayoutResult;
        if (function1 == null) {
            function1 = new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(List list) {
                    ParagraphLayoutCache paragraphLayoutCacheVd = this.f20687n.Vd();
                    TextStyle textStyle = this.f20687n.style;
                    ColorProducer colorProducer = this.f20687n.overrideColor;
                    TextLayoutResult textLayoutResultHI = paragraphLayoutCacheVd.HI(textStyle.s7N((16609105 & 1) != 0 ? Color.INSTANCE.Uo() : colorProducer != null ? colorProducer.n() : Color.INSTANCE.Uo(), (16609105 & 2) != 0 ? TextUnit.INSTANCE.n() : 0L, (16609105 & 4) != 0 ? null : null, (16609105 & 8) != 0 ? null : null, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : null, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? TextUnit.INSTANCE.n() : 0L, (16609105 & 256) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? Color.INSTANCE.Uo() : 0L, (16609105 & 4096) != 0 ? null : null, (16609105 & 8192) != 0 ? null : null, (16609105 & 16384) != 0 ? null : null, (16609105 & 32768) != 0 ? TextAlign.INSTANCE.Uo() : 0, (16609105 & 65536) != 0 ? TextDirection.INSTANCE.J2() : 0, (16609105 & 131072) != 0 ? TextUnit.INSTANCE.n() : 0L, (16609105 & 262144) != 0 ? null : null, (16609105 & 524288) != 0 ? null : null, (16609105 & 1048576) != 0 ? LineBreak.INSTANCE.rl() : 0, (16609105 & 2097152) != 0 ? Hyphens.INSTANCE.t() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null));
                    if (textLayoutResultHI != null) {
                        list.add(textLayoutResultHI);
                    } else {
                        textLayoutResultHI = null;
                    }
                    return Boolean.valueOf(textLayoutResultHI != null);
                }
            };
            this.semanticsTextLayoutResult = function1;
        }
        SemanticsPropertiesKt.Jk(semanticsPropertyReceiver, new AnnotatedString(this.text, null, 2, null));
        TextSubstitution textSubstitution = this.textSubstitution;
        if (textSubstitution != null) {
            SemanticsPropertiesKt.eWT(semanticsPropertyReceiver, textSubstitution.getIsShowingSubstitution());
            SemanticsPropertiesKt.Org(semanticsPropertyReceiver, new AnnotatedString(textSubstitution.getSubstitution(), null, 2, null));
        }
        SemanticsPropertiesKt.GD(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(AnnotatedString annotatedString) {
                this.f20688n.jE(annotatedString.getText());
                this.f20688n.ZwA();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.K(semanticsPropertyReceiver, null, new Function1<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return n(bool.booleanValue());
            }

            public final Boolean n(boolean z2) {
                if (this.f20689n.textSubstitution == null) {
                    return Boolean.FALSE;
                }
                TextStringSimpleNode.TextSubstitution textSubstitution2 = this.f20689n.textSubstitution;
                if (textSubstitution2 != null) {
                    textSubstitution2.O(z2);
                }
                this.f20689n.ZwA();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.nr(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f20690n.ni();
                this.f20690n.ZwA();
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.XQ(semanticsPropertyReceiver, null, function1, 1, null);
    }

    public final void GT(boolean drawChanged, boolean textChanged, boolean layoutChanged) {
        if (textChanged || layoutChanged) {
            Vd().ck(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                SemanticsModifierNodeKt.rl(this);
            }
            if (textChanged || layoutChanged) {
                LayoutModifierNodeKt.rl(this);
                DrawModifierNodeKt.n(this);
            }
            if (drawChanged) {
                DrawModifierNodeKt.n(this);
            }
        }
    }

    public final boolean eOa(TextStyle style, int minLines, int maxLines, boolean softWrap, FontFamily.Resolver fontFamilyResolver, int overflow) {
        boolean z2 = !this.style.X(style);
        this.style = style;
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
        if (TextOverflow.KN(this.overflow, overflow)) {
            return z2;
        }
        this.overflow = overflow;
        return true;
    }

    public final boolean i7(String text) {
        if (Intrinsics.areEqual(this.text, text)) {
            return false;
        }
        this.text = text;
        ni();
        return true;
    }

    public final boolean kC(ColorProducer color, TextStyle style) {
        boolean zAreEqual = Intrinsics.areEqual(color, this.overrideColor);
        this.overrideColor = color;
        return (zAreEqual && style.e(this.style)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ZwA() {
        SemanticsModifierNodeKt.rl(this);
        LayoutModifierNodeKt.rl(this);
        DrawModifierNodeKt.n(this);
    }

    private final ParagraphLayoutCache b(IntrinsicMeasureScope intrinsicMeasureScope) {
        ParagraphLayoutCache paragraphLayoutCacheWKb = WKb();
        paragraphLayoutCacheWKb.az(intrinsicMeasureScope);
        return paragraphLayoutCacheWKb;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) {
        long jUo;
        if (getIsAttached()) {
            ParagraphLayoutCache paragraphLayoutCacheWKb = WKb();
            Paragraph paragraph = paragraphLayoutCacheWKb.getParagraph();
            if (paragraph != null) {
                Canvas canvasKN = contentDrawScope.getDrawContext().KN();
                boolean didOverflow = paragraphLayoutCacheWKb.getDidOverflow();
                if (didOverflow) {
                    float layoutSize = (int) (paragraphLayoutCacheWKb.getLayoutSize() >> 32);
                    float layoutSize2 = (int) (paragraphLayoutCacheWKb.getLayoutSize() & 4294967295L);
                    canvasKN.O();
                    Canvas.ty(canvasKN, 0.0f, 0.0f, layoutSize, layoutSize2, 0, 16, null);
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
                        Paragraph.E2(paragraph, canvasKN, brushUo, this.style.nr(), shadow, textDecoration, drawStyle, 0, 64, null);
                    } else {
                        ColorProducer colorProducer = this.overrideColor;
                        if (colorProducer != null) {
                            jUo = colorProducer.n();
                        } else {
                            jUo = Color.INSTANCE.Uo();
                        }
                        if (jUo == 16) {
                            if (this.style.KN() != 16) {
                                jUo = this.style.KN();
                            } else {
                                jUo = Color.INSTANCE.n();
                            }
                        }
                        Paragraph.S(paragraph, canvasKN, jUo, shadow, textDecoration, drawStyle, 0, 32, null);
                    }
                    if (didOverflow) {
                        canvasKN.n();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (didOverflow) {
                        canvasKN.n();
                    }
                    throw th;
                }
            }
            InlineClassHelperKt.rl("no paragraph (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int U(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return b(intrinsicMeasureScope).mUb(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int nHg(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return b(intrinsicMeasureScope).J2(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        ParagraphLayoutCache paragraphLayoutCacheB = b(measureScope);
        boolean zKN = paragraphLayoutCacheB.KN(j2, measureScope.getLayoutDirection());
        paragraphLayoutCacheB.nr();
        Paragraph paragraph = paragraphLayoutCacheB.getParagraph();
        Intrinsics.checkNotNull(paragraph);
        long layoutSize = paragraphLayoutCacheB.getLayoutSize();
        if (zKN) {
            LayoutModifierNodeKt.n(this);
            Map map = this.baselineCache;
            if (map == null) {
                map = new HashMap(2);
                this.baselineCache = map;
            }
            map.put(AlignmentLineKt.n(), Integer.valueOf(Math.round(paragraph.qie())));
            map.put(AlignmentLineKt.rl(), Integer.valueOf(Math.round(paragraph.ViF())));
        }
        int i2 = (int) (layoutSize >> 32);
        int i3 = (int) (layoutSize & 4294967295L);
        final Placeable placeableDR0 = measurable.dR0(Constraints.INSTANCE.rl(i2, i2, i3, i3));
        Map map2 = this.baselineCache;
        Intrinsics.checkNotNull(map2);
        return measureScope.Zn(i2, i3, map2, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$measure$1
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
        return b(intrinsicMeasureScope).J2(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int v(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return b(intrinsicMeasureScope).gh(intrinsicMeasureScope.getLayoutDirection());
    }
}
