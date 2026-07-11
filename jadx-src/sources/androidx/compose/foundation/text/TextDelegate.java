package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
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
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Stable
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001LBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J,\u0010#\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b%\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b)\u0010;R#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b9\u0010=R$\u0010D\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010I\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010 R\u0014\u0010J\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010AR\u0011\u0010K\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "maxLines", "minLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/MultiParagraph;", "ty", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "", "az", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResult", "qie", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", c.f62177j, "Landroidx/compose/ui/text/AnnotatedString;", "gh", "()Landroidx/compose/ui/text/AnnotatedString;", "rl", "Landroidx/compose/ui/text/TextStyle;", "mUb", "()Landroidx/compose/ui/text/TextStyle;", "t", "I", "nr", "()I", "O", "Z", "xMQ", "()Z", "J2", "Uo", "Landroidx/compose/ui/unit/Density;", "()Landroidx/compose/ui/unit/Density;", "KN", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Ljava/util/List;", "()Ljava/util/List;", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getParagraphIntrinsics$foundation_release", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "setParagraphIntrinsics$foundation_release", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "paragraphIntrinsics", "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation_release", "intrinsicsLayoutDirection", "nonNullIntrinsics", "maxIntrinsicWidth", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegate\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,356:1\n96#2,5:357\n96#2,5:362\n96#2,5:367\n30#3:372\n30#3:374\n80#4:373\n80#4:375\n*S KotlinDebug\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegate\n*L\n116#1:357,5\n117#1:362,5\n118#1:367,5\n252#1:372\n265#1:374\n252#1:373\n265#1:375\n*E\n"})
public final class TextDelegate {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int overflow;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final FontFamily.Resolver fontFamilyResolver;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Density density;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private LayoutDirection intrinsicsLayoutDirection;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private MultiParagraphIntrinsics paragraphIntrinsics;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString text;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final List placeholders;

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z2, int i5, Density density, FontFamily.Resolver resolver, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i2, i3, z2, i5, density, resolver, list);
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z2, int i5, Density density, FontFamily.Resolver resolver, List list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i2;
        this.minLines = i3;
        this.softWrap = z2;
        this.overflow = i5;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (!(i2 > 0)) {
            InlineClassHelperKt.n("no maxLines");
        }
        if (!(i3 > 0)) {
            InlineClassHelperKt.n("no minLines");
        }
        if (i3 <= i2) {
            return;
        }
        InlineClassHelperKt.n("minLines greater than maxLines");
    }

    private final MultiParagraphIntrinsics J2() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final List getPlaceholders() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getMinLines() {
        return this.minLines;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final void az(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.rl()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.nr(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public final TextLayoutResult qie(long constraints, LayoutDirection layoutDirection, TextLayoutResult prevResult) {
        if (prevResult != null && TextLayoutHelperKt.n(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints)) {
            return prevResult.n(new TextLayoutInput(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().getPlaceholders(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().getOverflow(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, (DefaultConstructorMarker) null), ConstraintsKt.nr(constraints, IntSize.t((((long) TextDelegateKt.n(prevResult.getMultiParagraph().getHeight())) & 4294967295L) | (((long) TextDelegateKt.n(prevResult.getMultiParagraph().getWidth())) << 32))));
        }
        MultiParagraph multiParagraphTy = ty(constraints, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints, (DefaultConstructorMarker) null), multiParagraphTy, ConstraintsKt.nr(constraints, IntSize.t((((long) TextDelegateKt.n(multiParagraphTy.getHeight())) & 4294967295L) | (((long) TextDelegateKt.n(multiParagraphTy.getWidth())) << 32))), null);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    private final MultiParagraph ty(long constraints, LayoutDirection layoutDirection) {
        int iQie;
        int i2;
        az(layoutDirection);
        int iTy = Constraints.ty(constraints);
        if ((this.softWrap || TextOverflow.KN(this.overflow, TextOverflow.INSTANCE.rl())) && Constraints.KN(constraints)) {
            iQie = Constraints.qie(constraints);
        } else {
            iQie = Integer.MAX_VALUE;
        }
        if (!this.softWrap && TextOverflow.KN(this.overflow, TextOverflow.INSTANCE.rl())) {
            i2 = 1;
        } else {
            i2 = this.maxLines;
        }
        int i3 = i2;
        if (iTy != iQie) {
            iQie = RangesKt.coerceIn(t(), iTy, iQie);
        }
        return new MultiParagraph(J2(), Constraints.INSTANCE.rl(0, iQie, 0, Constraints.gh(constraints)), i3, this.overflow, null);
    }

    public final int t() {
        return TextDelegateKt.n(J2().n());
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z2, int i5, Density density, FontFamily.Resolver resolver, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (i7 & 4) != 0 ? Integer.MAX_VALUE : i2, (i7 & 8) != 0 ? 1 : i3, (i7 & 16) != 0 ? true : z2, (i7 & 32) != 0 ? TextOverflow.INSTANCE.n() : i5, density, resolver, (i7 & 256) != 0 ? CollectionsKt.emptyList() : list, null);
    }
}
