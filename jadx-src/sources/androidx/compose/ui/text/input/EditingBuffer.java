package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0080\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R*\u0010)\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010,\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R$\u00100\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&R$\u00102\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b1\u0010&R\u001c\u00104\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b.\u00103R\u001a\u0010\u0005\u001a\u00020\u00048@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b5\u00106R$\u00107\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b8\u0010&\"\u0004\b9\u0010(R\u0014\u0010;\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "qie", "()Z", "", "index", "", "t", "(I)C", TtmlNode.START, TtmlNode.END, "", "", "az", "(IILjava/lang/String;)V", "rl", "(II)V", "ck", "ty", c.f62177j, "()V", "toString", "()Ljava/lang/String;", "o", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "gapBuffer", "value", "I", "gh", "()I", "r", "(I)V", "selectionStart", "mUb", "Ik", "selectionEnd", "<set-?>", "nr", "J2", "compositionStart", "O", "compositionEnd", "()Landroidx/compose/ui/text/TextRange;", "composition", "xMQ", "()J", "cursor", "Uo", "HI", "KN", "length", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEditingBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,382:1\n114#2,8:383\n114#2,8:391\n*S KotlinDebug\n*F\n+ 1 EditingBuffer.kt\nandroidx/compose/ui/text/input/EditingBuffer\n*L\n50#1:383,8\n59#1:391,8\n*E\n"})
public final class EditingBuffer {
    public static final int Uo = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int compositionEnd;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final PartialGapBuffer gapBuffer;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int compositionStart;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int selectionStart;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int selectionEnd;

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2);
    }

    public final void n() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    private EditingBuffer(AnnotatedString annotatedString, long j2) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.qie(j2);
        this.selectionEnd = TextRange.gh(j2);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iQie = TextRange.qie(j2);
        int iGh = TextRange.gh(j2);
        if (iQie < 0 || iQie > annotatedString.length()) {
            throw new IndexOutOfBoundsException("start (" + iQie + ") offset is outside of text region " + annotatedString.length());
        }
        if (iGh < 0 || iGh > annotatedString.length()) {
            throw new IndexOutOfBoundsException("end (" + iGh + ") offset is outside of text region " + annotatedString.length());
        }
        if (iQie <= iGh) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iQie + " > " + iGh);
    }

    private final void Ik(int i2) {
        if (!(i2 >= 0)) {
            InlineClassHelperKt.n("Cannot set selectionEnd to a negative value: " + i2);
        }
        this.selectionEnd = i2;
    }

    private final void r(int i2) {
        if (!(i2 >= 0)) {
            InlineClassHelperKt.n("Cannot set selectionStart to a negative value: " + i2);
        }
        this.selectionStart = i2;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int KN() {
        return this.gapBuffer.rl();
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    public final int Uo() {
        int i2 = this.selectionStart;
        int i3 = this.selectionEnd;
        if (i2 == i3) {
            return i3;
        }
        return -1;
    }

    public final void az(int start, int end, String text) {
        if (start < 0 || start > this.gapBuffer.rl()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.rl());
        }
        if (end < 0 || end > this.gapBuffer.rl()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.rl());
        }
        if (start <= end) {
            this.gapBuffer.t(start, end, text);
            r(text.length() + start);
            Ik(start + text.length());
            this.compositionStart = -1;
            this.compositionEnd = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    public final void ck(int start, int end) {
        if (start < 0 || start > this.gapBuffer.rl()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.rl());
        }
        if (end < 0 || end > this.gapBuffer.rl()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.rl());
        }
        if (start <= end) {
            r(start);
            Ik(end);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + start + " > " + end);
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnnotatedString o() {
        return new AnnotatedString(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public final boolean qie() {
        return this.compositionStart != -1;
    }

    public final char t(int index) {
        return this.gapBuffer.n(index);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public final void ty(int start, int end) {
        if (start < 0 || start > this.gapBuffer.rl()) {
            throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.gapBuffer.rl());
        }
        if (end < 0 || end > this.gapBuffer.rl()) {
            throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.gapBuffer.rl());
        }
        if (start < end) {
            this.compositionStart = start;
            this.compositionEnd = end;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
    }

    public final long xMQ() {
        return TextRangeKt.rl(this.selectionStart, this.selectionEnd);
    }

    public final void HI(int i2) {
        ck(i2, i2);
    }

    public final TextRange nr() {
        if (qie()) {
            return TextRange.rl(TextRangeKt.rl(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final void rl(int start, int end) {
        long jRl = TextRangeKt.rl(start, end);
        this.gapBuffer.t(start, end, "");
        long jN = EditingBufferKt.n(TextRangeKt.rl(this.selectionStart, this.selectionEnd), jRl);
        r(TextRange.qie(jN));
        Ik(TextRange.gh(jN));
        if (qie()) {
            long jN2 = EditingBufferKt.n(TextRangeKt.rl(this.compositionStart, this.compositionEnd), jRl);
            if (TextRange.KN(jN2)) {
                n();
            } else {
                this.compositionStart = TextRange.qie(jN2);
                this.compositionEnd = TextRange.gh(jN2);
            }
        }
    }
}
