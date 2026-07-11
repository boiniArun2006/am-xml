package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001hBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\"\u0010&\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J(\u0010(\u001a\u00020\n*\u0004\u0018\u00010 2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010,J \u0010.\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b1\u00102Jh\u00103\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b7\u00106R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010=R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010=R$\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bK\u0010LR.\u0010T\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010N8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bD\u0010R\"\u0004\b?\u0010SR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u0010U\"\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010XR\u0018\u0010[\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\\R\u0016\u0010^\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010=R\u0016\u0010_\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010=R\u001c\u0010b\u001a\b\u0018\u00010`R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010aR\u0018\u0010d\u001a\u00060`R\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010cR\u0011\u0010f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bP\u0010eR\u0013\u0010g\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bK\u0010e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/foundation/text/TextAutoSize;", "autoSize", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "ViF", "(JLandroidx/compose/ui/unit/LayoutDirection;)J", "finalConstraints", "Landroidx/compose/ui/text/MultiParagraph;", "multiParagraph", "Landroidx/compose/ui/text/TextLayoutResult;", "WPU", "(Landroidx/compose/ui/unit/LayoutDirection;JLandroidx/compose/ui/text/MultiParagraph;)Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "XQ", "(Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "az", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "o", "(Landroidx/compose/ui/text/TextLayoutResult;JLandroidx/compose/ui/unit/LayoutDirection;)Z", "", "HI", "()V", "ck", "ty", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "width", "qie", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "aYN", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;Landroidx/compose/foundation/text/TextAutoSize;)V", "Ik", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "r", c.f62177j, "Landroidx/compose/ui/text/AnnotatedString;", "rl", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "t", "I", "nr", "Z", "O", "J2", "Uo", "Ljava/util/List;", "KN", "Landroidx/compose/foundation/text/TextAutoSize;", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "xMQ", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "mUb", "J", "lastDensity", "Landroidx/compose/ui/unit/Density;", "value", "gh", "Landroidx/compose/ui/unit/Density;", "()Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/text/TextStyle;", "S", "(Landroidx/compose/ui/text/TextStyle;)V", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "paragraphIntrinsics", "Landroidx/compose/ui/unit/LayoutDirection;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutCache", "cachedIntrinsicHeightInputWidth", "cachedIntrinsicHeight", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "_textAutoSizeLayoutScope", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "fontSizeSearchScope", "()Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "layoutOrNull", "TextAutoSizeLayoutScopeImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,491:1\n1#2:492\n30#3:493\n80#4:494\n*S KotlinDebug\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n*L\n235#1:493\n235#1:494\n*E\n"})
public final class MultiParagraphLayoutCache {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private TextLayoutResult layoutCache;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private int cachedIntrinsicHeight;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private TextAutoSize autoSize;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private List placeholders;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private MultiParagraphIntrinsics paragraphIntrinsics;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private Density density;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private long lastDensity;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private AnnotatedString text;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private TextAutoSizeLayoutScopeImpl _textAutoSizeLayoutScope;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private LayoutDirection intrinsicsLayoutDirection;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private MinLinesConstrainer mMinLinesConstrainer;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\u00020\r*\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "<init>", "(Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/unit/TextUnit;", TtmlNode.ATTR_TTS_FONT_SIZE, "Landroidx/compose/ui/text/TextLayoutResult;", "Po6", "(JLandroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/TextLayoutResult;", "", "tFV", "(J)F", "<set-?>", c.f62177j, "Landroidx/compose/ui/text/TextLayoutResult;", "nr", "()Landroidx/compose/ui/text/TextLayoutResult;", "lastLayoutResult", "getDensity", "()F", "density", "yAc", "fontScale", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class TextAutoSizeLayoutScopeImpl implements TextAutoSizeLayoutScope {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private TextLayoutResult lastLayoutResult;

        public TextAutoSizeLayoutScopeImpl() {
        }

        @Override // androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope
        public TextLayoutResult Po6(long constraints, AnnotatedString text, long fontSize) {
            long jViF;
            TextStyle textStyle = MultiParagraphLayoutCache.this.style;
            long jRl = TextUnit.mUb(fontSize) ? MultiParagraphLayoutCacheKt.rl(MultiParagraphLayoutCache.this.style.qie(), fontSize) : fontSize;
            if (!TextUnit.O(jRl, MultiParagraphLayoutCache.this.style.qie())) {
                MultiParagraphLayoutCache multiParagraphLayoutCache = MultiParagraphLayoutCache.this;
                multiParagraphLayoutCache.S(TextStyle.t(multiParagraphLayoutCache.style, 0L, jRl, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
            if (MultiParagraphLayoutCache.this.minLines > 1) {
                MultiParagraphLayoutCache multiParagraphLayoutCache2 = MultiParagraphLayoutCache.this;
                LayoutDirection layoutDirection = multiParagraphLayoutCache2.intrinsicsLayoutDirection;
                Intrinsics.checkNotNull(layoutDirection);
                jViF = multiParagraphLayoutCache2.ViF(constraints, layoutDirection);
            } else {
                jViF = constraints;
            }
            MultiParagraphLayoutCache multiParagraphLayoutCache3 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection2 = multiParagraphLayoutCache3.intrinsicsLayoutDirection;
            Intrinsics.checkNotNull(layoutDirection2);
            MultiParagraph multiParagraphAz = multiParagraphLayoutCache3.az(jViF, layoutDirection2);
            MultiParagraphLayoutCache multiParagraphLayoutCache4 = MultiParagraphLayoutCache.this;
            LayoutDirection layoutDirection3 = multiParagraphLayoutCache4.intrinsicsLayoutDirection;
            Intrinsics.checkNotNull(layoutDirection3);
            TextLayoutResult textLayoutResultWPU = multiParagraphLayoutCache4.WPU(layoutDirection3, jViF, multiParagraphAz);
            this.lastLayoutResult = textLayoutResultWPU;
            MultiParagraphLayoutCache.this.S(textStyle);
            return textLayoutResultWPU;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            Density density = MultiParagraphLayoutCache.this.getDensity();
            Intrinsics.checkNotNull(density);
            return density.getDensity();
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final TextLayoutResult getLastLayoutResult() {
            return this.lastLayoutResult;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: yAc */
        public float getFontScale() {
            Density density = MultiParagraphLayoutCache.this.getDensity();
            Intrinsics.checkNotNull(density);
            return density.getFontScale();
        }

        @Override // androidx.compose.ui.unit.Density
        public float tFV(long j2) {
            if (TextUnit.mUb(j2)) {
                if (!TextUnit.mUb(MultiParagraphLayoutCache.this.style.qie())) {
                    if (!TextUnit.O(MultiParagraphLayoutCache.this.style.qie(), TextUnit.INSTANCE.n())) {
                        return tFV(MultiParagraphLayoutCache.this.style.qie()) * TextUnit.KN(j2);
                    }
                    throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
                }
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            }
            return l(Z(j2));
        }
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i5, List list, TextAutoSize textAutoSize, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, i2, z2, i3, i5, list, textAutoSize);
    }

    private final void HI() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
        this._textAutoSizeLayoutScope = null;
    }

    private final void ck() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    private final boolean o(TextLayoutResult textLayoutResult, long j2, LayoutDirection layoutDirection) {
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().rl() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection()) {
            return true;
        }
        if (Constraints.J2(j2, textLayoutResult.getLayoutInput().getConstraints())) {
            return false;
        }
        return Constraints.qie(j2) != Constraints.qie(textLayoutResult.getLayoutInput().getConstraints()) || Constraints.ty(j2) != Constraints.ty(textLayoutResult.getLayoutInput().getConstraints()) || ((float) Constraints.gh(j2)) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines();
    }

    private MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i5, List list, TextAutoSize textAutoSize) {
        this.text = annotatedString;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i5;
        this.placeholders = list;
        this.autoSize = textAutoSize;
        this.lastDensity = InlineDensity.INSTANCE.n();
        this.style = textStyle;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(TextStyle textStyle) {
        boolean zX = textStyle.X(this.style);
        this.style = textStyle;
        if (zX) {
            return;
        }
        ck();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long ViF(long constraints, LayoutDirection layoutDirection) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.INSTANCE;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        TextStyle textStyle = this.style;
        Density density = this.density;
        Intrinsics.checkNotNull(density);
        MinLinesConstrainer minLinesConstrainerN = companion.n(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = minLinesConstrainerN;
        return minLinesConstrainerN.t(constraints, this.minLines);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextLayoutResult WPU(LayoutDirection layoutDirection, long finalConstraints, MultiParagraph multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().n(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List listEmptyList = this.placeholders;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        int i2 = this.maxLines;
        boolean z2 = this.softWrap;
        int i3 = this.overflow;
        Density density = this.density;
        Intrinsics.checkNotNull(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, listEmptyList, i2, z2, i3, density, layoutDirection, this.fontFamilyResolver, finalConstraints, (DefaultConstructorMarker) null), multiParagraph, ConstraintsKt.nr(finalConstraints, IntSize.t((((long) TextDelegateKt.n(fMin)) << 32) | (((long) TextDelegateKt.n(multiParagraph.getHeight())) & 4294967295L))), null);
    }

    private final MultiParagraphIntrinsics XQ(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.rl()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle textStyleNr = TextStyleKt.nr(this.style, layoutDirection);
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            FontFamily.Resolver resolver = this.fontFamilyResolver;
            List listEmptyList = this.placeholders;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyleNr, listEmptyList, density, resolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    private final TextAutoSizeLayoutScopeImpl xMQ() {
        if (this._textAutoSizeLayoutScope == null) {
            this._textAutoSizeLayoutScope = new TextAutoSizeLayoutScopeImpl();
        }
        TextAutoSizeLayoutScopeImpl textAutoSizeLayoutScopeImpl = this._textAutoSizeLayoutScope;
        Intrinsics.checkNotNull(textAutoSizeLayoutScopeImpl);
        return textAutoSizeLayoutScopeImpl;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final void Z(Density density) {
        Density density2 = this.density;
        long jNr = density != null ? InlineDensity.nr(density) : InlineDensity.INSTANCE.n();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = jNr;
        } else if (density == null || !InlineDensity.J2(this.lastDensity, jNr)) {
            this.density = density;
            this.lastDensity = jNr;
            HI();
        }
    }

    public final void aYN(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, List placeholders, TextAutoSize autoSize) {
        this.text = text;
        S(style);
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = placeholders;
        this.autoSize = autoSize;
        HI();
    }

    public final TextLayoutResult gh() {
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            return textLayoutResult;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final TextLayoutResult getLayoutCache() {
        return this.layoutCache;
    }

    public final int qie(int width, LayoutDirection layoutDirection) {
        int i2 = this.cachedIntrinsicHeightInputWidth;
        int i3 = this.cachedIntrinsicHeight;
        if (width == i2 && i2 != -1) {
            return i3;
        }
        long jN = ConstraintsKt.n(0, width, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            jN = ViF(jN, layoutDirection);
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(TextDelegateKt.n(az(jN, layoutDirection).getHeight()), Constraints.az(jN));
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = iCoerceAtLeast;
        return iCoerceAtLeast;
    }

    public final boolean ty(long constraints, LayoutDirection layoutDirection) {
        long jViF = this.minLines > 1 ? ViF(constraints, layoutDirection) : constraints;
        if (!o(this.layoutCache, jViF, layoutDirection)) {
            TextLayoutResult textLayoutResult = this.layoutCache;
            Intrinsics.checkNotNull(textLayoutResult);
            if (Constraints.J2(jViF, textLayoutResult.getLayoutInput().getConstraints())) {
                return false;
            }
            TextLayoutResult textLayoutResult2 = this.layoutCache;
            Intrinsics.checkNotNull(textLayoutResult2);
            this.layoutCache = WPU(layoutDirection, jViF, textLayoutResult2.getMultiParagraph());
            return true;
        }
        if (this.autoSize != null) {
            this.intrinsicsLayoutDirection = layoutDirection;
            long jQie = this.style.qie();
            TextAutoSize textAutoSize = this.autoSize;
            Intrinsics.checkNotNull(textAutoSize);
            long jN = textAutoSize.n(xMQ(), constraints, this.text);
            if (TextUnit.mUb(jN)) {
                jN = MultiParagraphLayoutCacheKt.rl(jQie, jN);
            }
            long j2 = jN;
            TextLayoutResult lastLayoutResult = xMQ().getLastLayoutResult();
            if (lastLayoutResult != null && TextUnit.O(j2, lastLayoutResult.getLayoutInput().getStyle().qie()) && TextOverflow.KN(lastLayoutResult.getLayoutInput().getOverflow(), this.overflow)) {
                this.layoutCache = lastLayoutResult;
                return true;
            }
            S(TextStyle.t(this.style, 0L, j2, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
        }
        this.layoutCache = WPU(layoutDirection, jViF, az(jViF, layoutDirection));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MultiParagraph az(long constraints, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsicsXQ = XQ(layoutDirection);
        return new MultiParagraph(multiParagraphIntrinsicsXQ, LayoutUtilsKt.n(constraints, this.softWrap, this.overflow, multiParagraphIntrinsicsXQ.n()), LayoutUtilsKt.rl(this.softWrap, this.overflow, this.maxLines), this.overflow, null);
    }

    public final int Ik(LayoutDirection layoutDirection) {
        return TextDelegateKt.n(XQ(layoutDirection).n());
    }

    public final int r(LayoutDirection layoutDirection) {
        return TextDelegateKt.n(XQ(layoutDirection).O());
    }
}
