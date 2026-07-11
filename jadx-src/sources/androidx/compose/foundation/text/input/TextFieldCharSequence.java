package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010.R)\u0010\r\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b5\u0010?R\u0014\u0010@\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/input/TextHighlightType;", "highlight", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "composingAnnotations", "<init>", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/Pair;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "index", "", "rl", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", InneractiveMediationNameConsts.OTHER, "", c.f62177j, "(Ljava/lang/CharSequence;)Z", "", "destination", "destinationOffset", "sourceStartIndex", "sourceEndIndex", "", "mUb", "([CIII)V", "xMQ", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/util/List;", "t", "()Ljava/util/List;", "Ljava/lang/CharSequence;", "KN", "()Ljava/lang/CharSequence;", "O", "J", "Uo", "()J", "J2", "Landroidx/compose/ui/text/TextRange;", "nr", "()Landroidx/compose/ui/text/TextRange;", "r", "Lkotlin/Pair;", "()Lkotlin/Pair;", "length", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldCharSequence implements CharSequence {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final TextRange composition;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long selection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List composingAnnotations;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Pair highlight;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final CharSequence text;

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, Pair pair, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, j2, textRange, pair, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || TextFieldCharSequence.class != other.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) other;
        return TextRange.Uo(this.selection, textFieldCharSequence.selection) && Intrinsics.areEqual(this.composition, textFieldCharSequence.composition) && Intrinsics.areEqual(this.highlight, textFieldCharSequence.highlight) && Intrinsics.areEqual(this.composingAnnotations, textFieldCharSequence.composingAnnotations) && n(textFieldCharSequence.text);
    }

    private TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, Pair pair, List list) {
        this.composingAnnotations = list;
        this.text = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).text : charSequence;
        this.selection = TextRangeKt.t(j2, 0, charSequence.length());
        this.composition = textRange != null ? TextRange.rl(TextRangeKt.t(textRange.getPackedValue(), 0, charSequence.length())) : null;
        this.highlight = pair != null ? Pair.copy$default(pair, null, TextRange.rl(TextRangeKt.t(((TextRange) pair.getSecond()).getPackedValue(), 0, charSequence.length())), 1, null) : null;
    }

    public int J2() {
        return this.text.length();
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Pair getHighlight() {
        return this.highlight;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + TextRange.HI(this.selection)) * 31;
        TextRange textRange = this.composition;
        int iHI = (iHashCode + (textRange != null ? TextRange.HI(textRange.getPackedValue()) : 0)) * 31;
        Pair pair = this.highlight;
        int iHashCode2 = (iHI + (pair != null ? pair.hashCode() : 0)) * 31;
        List list = this.composingAnnotations;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void mUb(char[] destination, int destinationOffset, int sourceStartIndex, int sourceEndIndex) {
        ToCharArray_androidKt.n(this.text, destination, destinationOffset, sourceStartIndex, sourceEndIndex);
    }

    public final boolean n(CharSequence other) {
        return StringsKt.contentEquals(this.text, other);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final TextRange getComposition() {
        return this.composition;
    }

    public char rl(int index) {
        return this.text.charAt(index);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int startIndex, int endIndex) {
        return this.text.subSequence(startIndex, endIndex);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List getComposingAnnotations() {
        return this.composingAnnotations;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text.toString();
    }

    public final boolean xMQ() {
        return this.highlight == null;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i2) {
        return rl(i2);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return J2();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j2, TextRange textRange, Pair pair, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence2 = (i2 & 1) != 0 ? "" : charSequence;
        long jN = (i2 & 2) != 0 ? TextRange.INSTANCE.n() : j2;
        TextRange textRange2 = (i2 & 4) != 0 ? null : textRange;
        this(charSequence2, jN, textRange2, (i2 & 8) != 0 ? null : pair, (i2 & 16) == 0 ? list : null, null);
    }
}
