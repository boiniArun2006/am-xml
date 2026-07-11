package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u008a\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "defaultFontFamilyResolver", "Landroidx/compose/ui/unit/Density;", "defaultDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "defaultLayoutDirection", "", "cacheSize", "<init>", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "maxLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Constraints;", "constraints", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "Landroidx/compose/ui/text/TextLayoutResult;", c.f62177j, "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "rl", "Landroidx/compose/ui/unit/Density;", "t", "Landroidx/compose/ui/unit/LayoutDirection;", "nr", "I", "Landroidx/compose/ui/text/TextLayoutCache;", "O", "Landroidx/compose/ui/text/TextLayoutCache;", "textLayoutCache", "J2", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,455:1\n30#2:456\n80#3:457\n*S KotlinDebug\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer\n*L\n178#1:456\n178#1:457\n*E\n"})
public final class TextMeasurer {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutCache textLayoutCache;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final FontFamily.Resolver defaultFontFamilyResolver;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int cacheSize;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Density defaultDensity;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final LayoutDirection defaultLayoutDirection;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextLayoutInput;", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutResult;", "rl", "(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTextMeasurer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer$Companion\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,455:1\n30#2:456\n80#3:457\n*S KotlinDebug\n*F\n+ 1 TextMeasurer.kt\nandroidx/compose/ui/text/TextMeasurer$Companion\n*L\n343#1:456\n343#1:457\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult rl(TextLayoutInput textLayoutInput) {
            int iQie;
            int maxLines;
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.nr(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iTy = Constraints.ty(textLayoutInput.getConstraints());
            if ((textLayoutInput.getSoftWrap() || TextMeasurerKt.rl(textLayoutInput.getOverflow())) && Constraints.KN(textLayoutInput.getConstraints())) {
                iQie = Constraints.qie(textLayoutInput.getConstraints());
            } else {
                iQie = Integer.MAX_VALUE;
            }
            if (!textLayoutInput.getSoftWrap() && TextMeasurerKt.rl(textLayoutInput.getOverflow())) {
                maxLines = 1;
            } else {
                maxLines = textLayoutInput.getMaxLines();
            }
            int i2 = maxLines;
            if (iTy != iQie) {
                iQie = RangesKt.coerceIn(ParagraphKt.nr(multiParagraphIntrinsics.n()), iTy, iQie);
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.INSTANCE.rl(0, iQie, 0, Constraints.gh(textLayoutInput.getConstraints())), i2, textLayoutInput.getOverflow(), null), ConstraintsKt.nr(textLayoutInput.getConstraints(), IntSize.t((((long) ((int) Math.ceil(r5.getWidth()))) << 32) | (((long) ((int) Math.ceil(r5.getHeight()))) & 4294967295L))), null);
        }
    }

    public static /* synthetic */ TextLayoutResult rl(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i2, boolean z2, int i3, List list, long j2, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            textStyle = TextStyle.INSTANCE.n();
        }
        return textMeasurer.n(annotatedString, textStyle, (i5 & 4) != 0 ? TextOverflow.INSTANCE.n() : i2, (i5 & 8) != 0 ? true : z2, (i5 & 16) != 0 ? Integer.MAX_VALUE : i3, (i5 & 32) != 0 ? CollectionsKt.emptyList() : list, (i5 & 64) != 0 ? ConstraintsKt.rl(0, 0, 0, 0, 15, null) : j2, (i5 & 128) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i5 & 256) != 0 ? textMeasurer.defaultDensity : density, (i5 & 512) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i5 & 1024) != 0 ? false : z3);
    }

    public final TextLayoutResult n(AnnotatedString text, TextStyle style, int overflow, boolean softWrap, int maxLines, List placeholders, long constraints, LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, (DefaultConstructorMarker) null);
        TextLayoutResult textLayoutResultN = (skipCache || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.n(textLayoutInput);
        if (textLayoutResultN != null) {
            return textLayoutResultN.n(textLayoutInput, ConstraintsKt.nr(constraints, IntSize.t((((long) ParagraphKt.nr(textLayoutResultN.getMultiParagraph().getWidth())) << 32) | (((long) ParagraphKt.nr(textLayoutResultN.getMultiParagraph().getHeight())) & 4294967295L))));
        }
        TextLayoutResult textLayoutResultRl = INSTANCE.rl(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.rl(textLayoutInput, textLayoutResultRl);
        }
        return textLayoutResultRl;
    }

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i2) {
        TextLayoutCache textLayoutCache;
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i2;
        if (i2 > 0) {
            textLayoutCache = new TextLayoutCache(i2);
        } else {
            textLayoutCache = null;
        }
        this.textLayoutCache = textLayoutCache;
    }
}
