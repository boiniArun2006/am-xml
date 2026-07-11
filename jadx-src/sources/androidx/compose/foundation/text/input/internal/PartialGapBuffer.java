package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J9\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010#\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "", TtmlNode.START, TtmlNode.END, "textStart", "textEnd", "", "t", "(IILjava/lang/CharSequence;II)V", "index", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/CharSequence;", "Landroidx/compose/foundation/text/input/internal/GapBuffer;", "Landroidx/compose/foundation/text/input/internal/GapBuffer;", V8ValueTypedArray.PROPERTY_BUFFER, "O", "I", "bufStart", "J2", "bufEnd", "rl", "()I", "length", "r", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/PartialGapBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,316:1\n96#2,5:317\n96#2,5:322\n96#2,5:327\n96#2,5:332\n*S KotlinDebug\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/PartialGapBuffer\n*L\n231#1:317,5\n232#1:322,5\n233#1:327,5\n234#1:332,5\n*E\n"})
public final class PartialGapBuffer implements CharSequence {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private CharSequence text;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private GapBuffer buffer;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f20179o = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int bufStart = -1;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int bufEnd = -1;

    public final void t(int start, int end, CharSequence text, int textStart, int textEnd) {
        if (!(start <= end)) {
            InlineClassHelperKt.n("start=" + start + " > end=" + end);
        }
        if (!(textStart <= textEnd)) {
            InlineClassHelperKt.n("textStart=" + textStart + " > textEnd=" + textEnd);
        }
        if (!(start >= 0)) {
            InlineClassHelperKt.n("start must be non-negative, but was " + start);
        }
        if (!(textStart >= 0)) {
            InlineClassHelperKt.n("textStart must be non-negative, but was " + textStart);
        }
        GapBuffer gapBuffer = this.buffer;
        int i2 = textEnd - textStart;
        if (gapBuffer != null) {
            int i3 = this.bufStart;
            int i5 = start - i3;
            int i7 = end - i3;
            if (i5 >= 0 && i7 <= gapBuffer.O()) {
                gapBuffer.Uo(i5, i7, text, textStart, textEnd);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            t(start, end, text, textStart, textEnd);
            return;
        }
        int iMax = Math.max(255, i2 + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(start, 64);
        int iMin2 = Math.min(this.text.length() - end, 64);
        int i8 = start - iMin;
        ToCharArray_androidKt.n(this.text, cArr, 0, i8, start);
        int i9 = iMax - iMin2;
        int i10 = iMin2 + end;
        ToCharArray_androidKt.n(this.text, cArr, i9, end, i10);
        ToCharArray_androidKt.n(text, cArr, iMin, textStart, textEnd);
        this.buffer = new GapBuffer(cArr, iMin + i2, i9);
        this.bufStart = i8;
        this.bufEnd = i10;
    }

    public static /* synthetic */ void nr(PartialGapBuffer partialGapBuffer, int i2, int i3, CharSequence charSequence, int i5, int i7, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            i5 = 0;
        }
        int i9 = i5;
        if ((i8 & 16) != 0) {
            i7 = charSequence.length();
        }
        partialGapBuffer.t(i2, i3, charSequence, i9, i7);
    }

    public char n(int index) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(index);
        }
        if (index < this.bufStart) {
            return this.text.charAt(index);
        }
        int iO = gapBuffer.O();
        int i2 = this.bufStart;
        return index < iO + i2 ? gapBuffer.nr(index - i2) : this.text.charAt(index - ((iO - this.bufEnd) + i2));
    }

    public int rl() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.O();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.text, 0, this.bufStart);
        gapBuffer.n(sb);
        CharSequence charSequence = this.text;
        sb.append(charSequence, this.bufEnd, charSequence.length());
        return sb.toString();
    }

    public PartialGapBuffer(CharSequence charSequence) {
        this.text = charSequence;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i2) {
        return n(i2);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return rl();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int startIndex, int endIndex) {
        return toString().subSequence(startIndex, endIndex);
    }
}
