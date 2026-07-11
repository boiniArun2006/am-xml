package androidx.compose.ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0005R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", TtmlNode.START, TtmlNode.END, "", "t", "(IILjava/lang/String;)V", "index", "", c.f62177j, "(I)C", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getText", "setText", "Landroidx/compose/ui/text/input/GapBuffer;", "rl", "Landroidx/compose/ui/text/input/GapBuffer;", V8ValueTypedArray.PROPERTY_BUFFER, "I", "bufStart", "nr", "bufEnd", "()I", "length", "O", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalTextApi
@RestrictTo
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/PartialGapBuffer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,318:1\n114#2,8:319\n114#2,8:327\n*S KotlinDebug\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/PartialGapBuffer\n*L\n242#1:319,8\n245#1:327,8\n*E\n"})
public final class PartialGapBuffer {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private GapBuffer buffer;
    public static final int J2 = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int bufStart = -1;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int bufEnd = -1;

    public final void t(int start, int end, String text) {
        if (!(start <= end)) {
            InlineClassHelperKt.n("start index must be less than or equal to end index: " + start + " > " + end);
        }
        if (!(start >= 0)) {
            InlineClassHelperKt.n("start must be non-negative, but was " + start);
        }
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer != null) {
            int i2 = this.bufStart;
            int i3 = start - i2;
            int i5 = end - i2;
            if (i3 >= 0 && i5 <= gapBuffer.O()) {
                gapBuffer.Uo(i3, i5, text);
                return;
            }
            this.text = toString();
            this.buffer = null;
            this.bufStart = -1;
            this.bufEnd = -1;
            t(start, end, text);
            return;
        }
        int iMax = Math.max(255, text.length() + 128);
        char[] cArr = new char[iMax];
        int iMin = Math.min(start, 64);
        int iMin2 = Math.min(this.text.length() - end, 64);
        int i7 = start - iMin;
        GapBuffer_jvmKt.n(this.text, cArr, 0, i7, start);
        int i8 = iMax - iMin2;
        int i9 = iMin2 + end;
        GapBuffer_jvmKt.n(this.text, cArr, i8, end, i9);
        GapBufferKt.rl(text, cArr, iMin);
        this.buffer = new GapBuffer(cArr, iMin + text.length(), i8);
        this.bufStart = i7;
        this.bufEnd = i9;
    }

    public final char n(int index) {
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

    public final int rl() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.O();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.text, 0, this.bufStart);
        gapBuffer.n(sb);
        String str = this.text;
        sb.append((CharSequence) str, this.bufEnd, str.length());
        return sb.toString();
    }

    public PartialGapBuffer(String str) {
        this.text = str;
    }
}
