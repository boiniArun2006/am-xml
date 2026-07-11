package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
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
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"JH\u0010#\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b#\u0010$J\"\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00107R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u001c\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010;R.\u0010C\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010=8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010?\u001a\u0004\b0\u0010@\"\u0004\bA\u0010BR$\u0010H\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010D\u001a\u0004\b8\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u00109\u001a\u0004\b2\u0010I\"\u0004\bJ\u0010KR(\u0010Q\u001a\u00020M8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010;\u001a\u0004\b4\u0010N\"\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010UR\u0018\u0010X\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010WR\u001c\u0010Y\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010;R\u0016\u0010Z\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00107R\u0016\u0010\\\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00107R\u0014\u0010^\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u0010]\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006_"}, d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ik", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;)J", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ty", "(Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "qie", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "", "xMQ", "()V", "KN", "width", "J2", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "ck", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "Landroidx/compose/ui/text/Paragraph;", "Uo", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/Paragraph;", "Landroidx/compose/ui/text/TextLayoutResult;", "HI", "(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextLayoutResult;", "gh", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "mUb", "toString", "()Ljava/lang/String;", c.f62177j, "Ljava/lang/String;", "rl", "Landroidx/compose/ui/text/TextStyle;", "t", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "nr", "I", "O", "Z", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "J", "lastDensity", "Landroidx/compose/ui/unit/Density;", "value", "Landroidx/compose/ui/unit/Density;", "()Landroidx/compose/ui/unit/Density;", "az", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/text/Paragraph;", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation_release", "(Landroidx/compose/ui/text/Paragraph;)V", "paragraph", "()Z", "setDidOverflow$foundation_release", "(Z)V", "didOverflow", "Landroidx/compose/ui/unit/IntSize;", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "layoutSize", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "mMinLinesConstrainer", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "paragraphIntrinsics", "Landroidx/compose/ui/unit/LayoutDirection;", "intrinsicsLayoutDirection", "prevConstraints", "cachedIntrinsicHeightInputWidth", "r", "cachedIntrinsicHeight", "()Lkotlin/Unit;", "observeFontChanges", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n1#1,381:1\n30#2:382\n30#2:385\n30#2:391\n30#2:397\n80#3:383\n80#3:386\n85#3:388\n90#3:390\n80#3:392\n85#3:394\n90#3:396\n80#3:398\n1#4:384\n54#5:387\n59#5:389\n54#5:393\n59#5:395\n202#6:399\n*S KotlinDebug\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n*L\n96#1:382\n136#1:385\n153#1:391\n317#1:397\n96#1:383\n136#1:386\n141#1:388\n142#1:390\n153#1:392\n158#1:394\n158#1:396\n317#1:398\n141#1:387\n142#1:389\n158#1:393\n158#1:395\n335#1:399\n*E\n"})
public final class ParagraphLayoutCache {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private LayoutDirection intrinsicsLayoutDirection;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private int cachedIntrinsicHeightInputWidth;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int maxLines;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private long lastDensity;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private int minLines;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private MinLinesConstrainer mMinLinesConstrainer;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private long prevConstraints;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private boolean didOverflow;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private Paragraph paragraph;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int overflow;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private long layoutSize;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int cachedIntrinsicHeight;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private TextStyle style;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private ParagraphIntrinsics paragraphIntrinsics;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private Density density;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i2, z2, i3, i5);
    }

    private final void xMQ() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.INSTANCE.t(0, 0);
        long j2 = 0;
        this.layoutSize = IntSize.t((j2 & 4294967295L) | (j2 << 32));
        this.didOverflow = false;
    }

    private ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i5) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i2;
        this.softWrap = z2;
        this.maxLines = i3;
        this.minLines = i5;
        this.lastDensity = InlineDensity.INSTANCE.n();
        long j2 = 0;
        this.layoutSize = IntSize.t((j2 & 4294967295L) | (j2 << 32));
        this.prevConstraints = Constraints.INSTANCE.t(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    private final long Ik(long constraints, LayoutDirection layoutDirection, TextStyle style) {
        MinLinesConstrainer.Companion companion = MinLinesConstrainer.INSTANCE;
        MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
        Density density = this.density;
        Intrinsics.checkNotNull(density);
        MinLinesConstrainer minLinesConstrainerN = companion.n(minLinesConstrainer, layoutDirection, style, density, this.fontFamilyResolver);
        this.mMinLinesConstrainer = minLinesConstrainerN;
        return minLinesConstrainerN.t(constraints, this.minLines);
    }

    private final boolean qie(long constraints, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.paragraph;
        if (paragraph == null || (paragraphIntrinsics = this.paragraphIntrinsics) == null || paragraphIntrinsics.rl() || layoutDirection != this.intrinsicsLayoutDirection) {
            return true;
        }
        if (Constraints.J2(constraints, this.prevConstraints)) {
            return false;
        }
        return Constraints.qie(constraints) != Constraints.qie(this.prevConstraints) || Constraints.ty(constraints) != Constraints.ty(this.prevConstraints) || ((float) Constraints.gh(constraints)) < paragraph.getHeight() || paragraph.r();
    }

    static /* synthetic */ long r(ParagraphLayoutCache paragraphLayoutCache, long j2, LayoutDirection layoutDirection, TextStyle textStyle, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textStyle = paragraphLayoutCache.style;
        }
        return paragraphLayoutCache.Ik(j2, layoutDirection, textStyle);
    }

    private final ParagraphIntrinsics ty(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsicsN = this.paragraphIntrinsics;
        if (paragraphIntrinsicsN == null || layoutDirection != this.intrinsicsLayoutDirection || paragraphIntrinsicsN.rl()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            String str = this.text;
            TextStyle textStyleNr = TextStyleKt.nr(this.style, layoutDirection);
            List listEmptyList = CollectionsKt.emptyList();
            Density density = this.density;
            Intrinsics.checkNotNull(density);
            paragraphIntrinsicsN = ParagraphIntrinsicsKt.n(str, textStyleNr, listEmptyList, density, this.fontFamilyResolver, CollectionsKt.emptyList());
        }
        this.paragraphIntrinsics = paragraphIntrinsicsN;
        return paragraphIntrinsicsN;
    }

    public final TextLayoutResult HI(TextStyle style) {
        Density density;
        LayoutDirection layoutDirection = this.intrinsicsLayoutDirection;
        if (layoutDirection == null || (density = this.density) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, 2, null);
        if (this.paragraph == null || this.paragraphIntrinsics == null) {
            return null;
        }
        long jRl = Constraints.rl(this.prevConstraints & (-8589934589L));
        return new TextLayoutResult(new TextLayoutInput(annotatedString, style, CollectionsKt.emptyList(), this.maxLines, this.softWrap, this.overflow, density, layoutDirection, this.fontFamilyResolver, jRl, (DefaultConstructorMarker) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, style, CollectionsKt.emptyList(), density, this.fontFamilyResolver), jRl, this.maxLines, this.overflow, null), this.layoutSize, null);
    }

    public final int J2(int width, LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        int i2 = this.cachedIntrinsicHeightInputWidth;
        int i3 = this.cachedIntrinsicHeight;
        if (width == i2 && i2 != -1) {
            return i3;
        }
        long jN = ConstraintsKt.n(0, width, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            jN = r(paragraphLayoutCache, jN, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(TextDelegateKt.n(Uo(jN, layoutDirection2).getHeight()), Constraints.az(jN));
        paragraphLayoutCache.cachedIntrinsicHeightInputWidth = width;
        paragraphLayoutCache.cachedIntrinsicHeight = iCoerceAtLeast;
        return iCoerceAtLeast;
    }

    public final boolean KN(long constraints, LayoutDirection layoutDirection) {
        ParagraphLayoutCache paragraphLayoutCache;
        LayoutDirection layoutDirection2;
        boolean z2 = true;
        if (this.minLines > 1) {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
            constraints = r(paragraphLayoutCache, constraints, layoutDirection2, null, 4, null);
        } else {
            paragraphLayoutCache = this;
            layoutDirection2 = layoutDirection;
        }
        boolean z3 = false;
        if (qie(constraints, layoutDirection2)) {
            Paragraph paragraphUo = Uo(constraints, layoutDirection2);
            paragraphLayoutCache.prevConstraints = constraints;
            paragraphLayoutCache.layoutSize = ConstraintsKt.nr(constraints, IntSize.t((((long) TextDelegateKt.n(paragraphUo.getWidth())) << 32) | (((long) TextDelegateKt.n(paragraphUo.getHeight())) & 4294967295L)));
            if (!TextOverflow.KN(paragraphLayoutCache.overflow, TextOverflow.INSTANCE.O()) && (((int) (r13 >> 32)) < paragraphUo.getWidth() || ((int) (r13 & 4294967295L)) < paragraphUo.getHeight())) {
                z3 = true;
            }
            paragraphLayoutCache.didOverflow = z3;
            paragraphLayoutCache.paragraph = paragraphUo;
            return true;
        }
        if (!Constraints.J2(constraints, paragraphLayoutCache.prevConstraints)) {
            Paragraph paragraph = paragraphLayoutCache.paragraph;
            Intrinsics.checkNotNull(paragraph);
            paragraphLayoutCache.layoutSize = ConstraintsKt.nr(constraints, IntSize.t((((long) TextDelegateKt.n(Math.min(paragraph.n(), paragraph.getWidth()))) << 32) | (((long) TextDelegateKt.n(paragraph.getHeight())) & 4294967295L)));
            if (TextOverflow.KN(paragraphLayoutCache.overflow, TextOverflow.INSTANCE.O()) || (((int) (r7 >> 32)) >= paragraph.getWidth() && ((int) (4294967295L & r7)) >= paragraph.getHeight())) {
                z2 = false;
            }
            paragraphLayoutCache.didOverflow = z2;
            paragraphLayoutCache.prevConstraints = constraints;
        }
        return false;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final void az(Density density) {
        Density density2 = this.density;
        long jNr = density != null ? InlineDensity.nr(density) : InlineDensity.INSTANCE.n();
        if (density2 == null) {
            this.density = density;
            this.lastDensity = jNr;
        } else if (density == null || !InlineDensity.J2(this.lastDensity, jNr)) {
            this.density = density;
            this.lastDensity = jNr;
            xMQ();
        }
    }

    public final void ck(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        xMQ();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final Unit nr() {
        ParagraphIntrinsics paragraphIntrinsics = this.paragraphIntrinsics;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.rl();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final boolean getDidOverflow() {
        return this.didOverflow;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParagraphLayoutCache(paragraph=");
        sb.append(this.paragraph != null ? "<paragraph>" : V8ValueNull.NULL);
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.mUb(this.lastDensity));
        sb.append(')');
        return sb.toString();
    }

    public final Paragraph Uo(long constraints, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsicsTy = ty(layoutDirection);
        return ParagraphKt.t(paragraphIntrinsicsTy, LayoutUtilsKt.n(constraints, this.softWrap, this.overflow, paragraphIntrinsicsTy.n()), LayoutUtilsKt.rl(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    public final int gh(LayoutDirection layoutDirection) {
        return TextDelegateKt.n(ty(layoutDirection).O());
    }

    public final int mUb(LayoutDirection layoutDirection) {
        return TextDelegateKt.n(ty(layoutDirection).n());
    }
}
