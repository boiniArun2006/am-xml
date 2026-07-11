package androidx.compose.ui.text.input;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\nJ\u000f\u0010!\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010#¨\u0006)"}, d2 = {"Landroidx/compose/ui/text/input/GapBuffer;", "", "", "initBuffer", "", "initGapStart", "initGapEnd", "<init>", "([CII)V", "t", "()I", "requestSize", "", "J2", "(I)V", TtmlNode.START, TtmlNode.END, "rl", "(II)V", "index", "", "nr", "(I)C", "", "text", "Uo", "(IILjava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", c.f62177j, "(Ljava/lang/StringBuilder;)V", "O", "toString", "()Ljava/lang/String;", "I", "capacity", "[C", V8ValueTypedArray.PROPERTY_BUFFER, "gapStart", "gapEnd", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,318:1\n1#2:319\n*E\n"})
final class GapBuffer {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int capacity;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int gapEnd;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private char[] buffer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int gapStart;

    private final void rl(int start, int end) {
        int i2 = this.gapStart;
        if (start < i2 && end <= i2) {
            int i3 = i2 - end;
            char[] cArr = this.buffer;
            ArraysKt.copyInto(cArr, cArr, this.gapEnd - i3, end, i2);
            this.gapStart = start;
            this.gapEnd -= i3;
            return;
        }
        if (start < i2 && end >= i2) {
            this.gapEnd = end + t();
            this.gapStart = start;
            return;
        }
        int iT = start + t();
        int iT2 = end + t();
        int i5 = this.gapEnd;
        char[] cArr2 = this.buffer;
        ArraysKt.copyInto(cArr2, cArr2, this.gapStart, i5, iT);
        this.gapStart += iT - i5;
        this.gapEnd = iT2;
    }

    private final int t() {
        return this.gapEnd - this.gapStart;
    }

    public final int O() {
        return this.capacity - t();
    }

    public final void n(StringBuilder builder) {
        builder.append(this.buffer, 0, this.gapStart);
        Intrinsics.checkNotNullExpressionValue(builder, "append(...)");
        char[] cArr = this.buffer;
        int i2 = this.gapEnd;
        builder.append(cArr, i2, this.capacity - i2);
        Intrinsics.checkNotNullExpressionValue(builder, "append(...)");
    }

    public final char nr(int index) {
        int i2 = this.gapStart;
        return index < i2 ? this.buffer[index] : this.buffer[(index - i2) + this.gapEnd];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }

    public GapBuffer(char[] cArr, int i2, int i3) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i2;
        this.gapEnd = i3;
    }

    private final void J2(int requestSize) {
        if (requestSize <= t()) {
            return;
        }
        int iT = requestSize - t();
        int i2 = this.capacity;
        do {
            i2 *= 2;
        } while (i2 - this.capacity < iT);
        char[] cArr = new char[i2];
        ArraysKt.copyInto(this.buffer, cArr, 0, 0, this.gapStart);
        int i3 = this.capacity;
        int i5 = this.gapEnd;
        int i7 = i3 - i5;
        int i8 = i2 - i7;
        ArraysKt.copyInto(this.buffer, cArr, i8, i5, i7 + i5);
        this.buffer = cArr;
        this.capacity = i2;
        this.gapEnd = i8;
    }

    public final void Uo(int start, int end, String text) {
        J2(text.length() - (end - start));
        rl(start, end);
        GapBufferKt.rl(text, this.buffer, this.gapStart);
        this.gapStart += text.length();
    }
}
