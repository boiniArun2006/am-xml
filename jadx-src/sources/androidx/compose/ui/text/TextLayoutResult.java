package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\rJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b%\u0010$J\u0018\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b0\u0010,J\u001d\u00104\u001a\u0002032\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n¢\u0006\u0004\b4\u00105J$\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010M\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b+\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010O\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010J\u001a\u0004\bN\u0010LR\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bQ\u0010VR\u0011\u0010Y\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0011\u0010[\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bZ\u0010VR\u0011\u0010]\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\\\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "layoutInput", "Landroidx/compose/ui/text/MultiParagraph;", "multiParagraph", "Landroidx/compose/ui/unit/IntSize;", "size", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "lineIndex", "XQ", "(I)I", "", "visibleEnd", "HI", "(IZ)I", "fD", "(I)Z", "", "S", "(I)F", "az", "o", "Z", "offset", "Ik", "vertical", "r", "(F)I", "usePrimaryDirection", "mUb", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "ViF", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "t", "Landroidx/compose/ui/geometry/Offset;", "position", "aYN", "(J)I", "Landroidx/compose/ui/geometry/Rect;", "nr", "(I)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/TextRange;", "iF", "(I)J", "O", TtmlNode.START, TtmlNode.END, "Landroidx/compose/ui/graphics/Path;", "nY", "(II)Landroidx/compose/ui/graphics/Path;", c.f62177j, "(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/TextLayoutInput;", "qie", "()Landroidx/compose/ui/text/TextLayoutInput;", "rl", "Landroidx/compose/ui/text/MultiParagraph;", "WPU", "()Landroidx/compose/ui/text/MultiParagraph;", "J", "te", "()J", "F", "KN", "()F", "firstBaseline", "gh", "lastBaseline", "", "J2", "Ljava/util/List;", "g", "()Ljava/util/List;", "placeholderRects", "()Z", "didOverflowHeight", "Uo", "didOverflowWidth", "xMQ", "hasVisualOverflow", "ty", "lineCount", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/TextLayoutResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,580:1\n59#2:581\n54#2:583\n90#3:582\n85#3:584\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/TextLayoutResult\n*L\n313#1:581\n317#1:583\n313#1:582\n317#1:584\n*E\n"})
public final class TextLayoutResult {
    public static final int Uo = 8;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final List placeholderRects;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final float lastBaseline;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextLayoutInput layoutInput;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final float firstBaseline;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final MultiParagraph multiParagraph;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long size;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, multiParagraph, j2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) other;
        return Intrinsics.areEqual(this.layoutInput, textLayoutResult.layoutInput) && Intrinsics.areEqual(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.O(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && Intrinsics.areEqual(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j2;
        this.firstBaseline = multiParagraph.Uo();
        this.lastBaseline = multiParagraph.gh();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }

    public static /* synthetic */ int ck(TextLayoutResult textLayoutResult, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return textLayoutResult.HI(i2, z2);
    }

    public static /* synthetic */ TextLayoutResult rl(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i2 & 2) != 0) {
            j2 = textLayoutResult.size;
        }
        return textLayoutResult.n(textLayoutInput, j2);
    }

    public final int HI(int lineIndex, boolean visibleEnd) {
        return this.multiParagraph.ty(lineIndex, visibleEnd);
    }

    public final int Ik(int offset) {
        return this.multiParagraph.ck(offset);
    }

    public final boolean J2() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) ((int) (this.size & 4294967295L))) < this.multiParagraph.getHeight();
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final Rect O(int offset) {
        return this.multiParagraph.O(offset);
    }

    public final float S(int lineIndex) {
        return this.multiParagraph.S(lineIndex);
    }

    public final boolean Uo() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.getWidth();
    }

    public final ResolvedTextDirection ViF(int offset) {
        return this.multiParagraph.ViF(offset);
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    public final int XQ(int lineIndex) {
        return this.multiParagraph.XQ(lineIndex);
    }

    public final float Z(int lineIndex) {
        return this.multiParagraph.Z(lineIndex);
    }

    public final int aYN(long position) {
        return this.multiParagraph.aYN(position);
    }

    public final float az(int lineIndex) {
        return this.multiParagraph.qie(lineIndex);
    }

    public final boolean fD(int lineIndex) {
        return this.multiParagraph.e(lineIndex);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + IntSize.KN(this.size)) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final long iF(int offset) {
        return this.multiParagraph.E2(offset);
    }

    public final float mUb(int offset, boolean usePrimaryDirection) {
        return this.multiParagraph.xMQ(offset, usePrimaryDirection);
    }

    public final TextLayoutResult n(TextLayoutInput layoutInput, long size) {
        return new TextLayoutResult(layoutInput, this.multiParagraph, size, null);
    }

    public final Path nY(int start, int end) {
        return this.multiParagraph.g(start, end);
    }

    public final Rect nr(int offset) {
        return this.multiParagraph.nr(offset);
    }

    public final float o(int lineIndex) {
        return this.multiParagraph.o(lineIndex);
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final int r(float vertical) {
        return this.multiParagraph.Ik(vertical);
    }

    public final ResolvedTextDirection t(int offset) {
        return this.multiParagraph.t(offset);
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.xMQ(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    public final int ty() {
        return this.multiParagraph.getLineCount();
    }

    public final boolean xMQ() {
        if (!Uo() && !J2()) {
            return false;
        }
        return true;
    }
}
