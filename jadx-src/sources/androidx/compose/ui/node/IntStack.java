package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.V8ValueError;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\"\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J%\u0010'\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0018¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\r¢\u0006\u0004\b,\u0010-R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010.R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u0011\u0010&\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010)¨\u00062"}, d2 = {"Landroidx/compose/ui/node/IntStack;", "", "", "initialCapacity", "<init>", "(I)V", "", V8ValueError.STACK, "mUb", "([I)[I", TtmlNode.START, TtmlNode.END, "elSize", "", "xMQ", "(III)V", "O", "(III)I", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "j", "qie", "(II)V", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "", c.f62177j, "(II)Z", "index", "rl", "(I)I", "oldStart", "oldEnd", "newStart", "newEnd", "KN", "(IIII)V", "x", "y", "size", "Uo", "J2", "()I", "nr", "()Z", "gh", "()V", "[I", "I", "lastIndex", "t", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,518:1\n56#2,5:519\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n*L\n470#1:519,5\n*E\n"})
final class IntStack {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int[] stack;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int lastIndex;

    private final int[] mUb(int[] stack) {
        int[] iArrCopyOf = Arrays.copyOf(stack, stack.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, KfLR.OwyTXrydFJO);
        this.stack = iArrCopyOf;
        return iArrCopyOf;
    }

    private final int O(int start, int end, int elSize) {
        int i2 = start - elSize;
        while (start < end) {
            if (n(start, end)) {
                i2 += elSize;
                qie(i2, start);
            }
            start += elSize;
        }
        int i3 = i2 + elSize;
        qie(i3, end);
        return i3;
    }

    private final boolean n(int a2, int b2) {
        int[] iArr = this.stack;
        int i2 = iArr[a2];
        int i3 = iArr[b2];
        return i2 < i3 || (i2 == i3 && iArr[a2 + 1] <= iArr[b2 + 1]);
    }

    private final void qie(int i2, int j2) {
        int[] iArr = this.stack;
        MyersDiffKt.xMQ(iArr, i2, j2);
        MyersDiffKt.xMQ(iArr, i2 + 1, j2 + 1);
        MyersDiffKt.xMQ(iArr, i2 + 2, j2 + 2);
    }

    private final void xMQ(int start, int end, int elSize) {
        if (start < end) {
            int iO = O(start, end, elSize);
            xMQ(start, iO - elSize, elSize);
            xMQ(iO + elSize, end, elSize);
        }
    }

    public final int J2() {
        int[] iArr = this.stack;
        int i2 = this.lastIndex - 1;
        this.lastIndex = i2;
        return iArr[i2];
    }

    public final void KN(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i2 = this.lastIndex;
        int[] iArrMUb = this.stack;
        int i3 = i2 + 4;
        if (i3 >= iArrMUb.length) {
            iArrMUb = mUb(iArrMUb);
        }
        iArrMUb[i2] = oldStart;
        iArrMUb[i2 + 1] = oldEnd;
        iArrMUb[i2 + 2] = newStart;
        iArrMUb[i2 + 3] = newEnd;
        this.lastIndex = i3;
    }

    public final void Uo(int x2, int y2, int size) {
        int i2 = this.lastIndex;
        int[] iArrMUb = this.stack;
        int i3 = i2 + 3;
        if (i3 >= iArrMUb.length) {
            iArrMUb = mUb(iArrMUb);
        }
        iArrMUb[i2] = x2 + size;
        iArrMUb[i2 + 1] = y2 + size;
        iArrMUb[i2 + 2] = size;
        this.lastIndex = i3;
    }

    public final void gh() {
        int i2 = this.lastIndex;
        if (!(i2 % 3 == 0)) {
            InlineClassHelperKt.t("Array size not a multiple of 3");
        }
        if (i2 > 3) {
            xMQ(0, i2 - 3, 3);
        }
    }

    public final boolean nr() {
        return this.lastIndex != 0;
    }

    public final int rl(int index) {
        return this.stack[index];
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public IntStack(int i2) {
        this.stack = new int[i2];
    }
}
