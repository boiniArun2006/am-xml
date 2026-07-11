package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0019J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010-R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00105R\u0017\u0010:\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "Landroid/text/Layout;", TtmlNode.TAG_LAYOUT, "<init>", "(Landroid/text/Layout;)V", "", "offset", "", "primary", "", "rl", "(IZ)F", "lineEnd", "lineStart", "gh", "(II)I", "paragraphIndex", "Ljava/text/Bidi;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)Ljava/text/Bidi;", "upstream", "J2", "(IZ)I", "KN", "(I)I", "mUb", "(I)Z", "usePrimaryDirection", "t", "(IZZ)F", "lineIndex", "O", "", "Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "nr", "(I)[Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "c", "xMQ", "(C)Z", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "[Z", "bidiProcessedParagraphs", "", "[C", "tmpBuffer", "I", "getParagraphCount", "()I", "paragraphCount", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutHelper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.android.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,433:1\n1#2:434\n1627#3,6:435\n1627#3,6:441\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.android.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n283#1:435,6\n324#1:441,6\n*E\n"})
public final class LayoutHelper {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final int paragraphCount;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private char[] tmpBuffer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean[] bidiProcessedParagraphs;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final List paragraphEnds;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List paragraphBidi;

    @StabilityInferred
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "", TtmlNode.START, TtmlNode.END, "", "isRtl", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "I", "rl", "t", "Z", "()Z", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BidiRun {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final int end;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRtl;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) other;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }

        public BidiRun(int i2, int i3, boolean z2) {
            this.start = i2;
            this.end = i3;
            this.isRtl = z2;
        }
    }

    public static /* synthetic */ int Uo(LayoutHelper layoutHelper, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        return layoutHelper.J2(i2, z2);
    }

    private final int gh(int lineEnd, int lineStart) {
        while (lineEnd > lineStart && xMQ(this.layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        return lineEnd;
    }

    private final float rl(int offset, boolean primary) {
        int iCoerceAtMost = RangesKt.coerceAtMost(offset, this.layout.getLineEnd(this.layout.getLineForOffset(offset)));
        return primary ? this.layout.getPrimaryHorizontal(iCoerceAtMost) : this.layout.getSecondaryHorizontal(iCoerceAtMost);
    }

    public final int J2(int offset, boolean upstream) {
        int iBinarySearch$default = CollectionsKt.binarySearch$default(this.paragraphEnds, Integer.valueOf(offset), 0, 0, 6, (Object) null);
        int i2 = iBinarySearch$default < 0 ? -(iBinarySearch$default + 1) : iBinarySearch$default + 1;
        if (upstream && i2 > 0) {
            int i3 = i2 - 1;
            if (offset == ((Number) this.paragraphEnds.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int KN(int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return ((Number) this.paragraphEnds.get(paragraphIndex - 1)).intValue();
    }

    public final int O(int lineIndex) {
        return gh(this.layout.getLineEnd(lineIndex), this.layout.getLineStart(lineIndex));
    }

    public final boolean mUb(int paragraphIndex) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(KN(paragraphIndex))) == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bidi n(int paragraphIndex) {
        Bidi bidi;
        if (this.bidiProcessedParagraphs[paragraphIndex]) {
            return (Bidi) this.paragraphBidi.get(paragraphIndex);
        }
        int iIntValue = paragraphIndex == 0 ? 0 : ((Number) this.paragraphEnds.get(paragraphIndex - 1)).intValue();
        int iIntValue2 = ((Number) this.paragraphEnds.get(paragraphIndex)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = this.tmpBuffer;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, mUb(paragraphIndex) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        }
        this.paragraphBidi.set(paragraphIndex, bidi);
        this.bidiProcessedParagraphs[paragraphIndex] = true;
        if (bidi != null) {
            char[] cArr3 = this.tmpBuffer;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.tmpBuffer = cArr2;
        return bidi;
    }

    public final BidiRun[] nr(int lineIndex) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.layout.getLineStart(lineIndex);
        int lineEnd = this.layout.getLineEnd(lineIndex);
        int iUo = Uo(this, lineStart, false, 2, null);
        int iKN = KN(iUo);
        int i2 = lineStart - iKN;
        int i3 = lineEnd - iKN;
        Bidi bidiN = n(iUo);
        if (bidiN == null || (bidiCreateLineBidi = bidiN.createLineBidi(i2, i3)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i5 = 0; i5 < runCount; i5++) {
            int runStart = bidiCreateLineBidi.getRunStart(i5) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i5) + lineStart;
            boolean z2 = true;
            if (bidiCreateLineBidi.getRunLevel(i5) % 2 != 1) {
                z2 = false;
            }
            bidiRunArr[i5] = new BidiRun(runStart, runLimit, z2);
        }
        return bidiRunArr;
    }

    public final float t(int offset, boolean usePrimaryDirection, boolean upstream) {
        int iGh = offset;
        if (!upstream) {
            return rl(offset, usePrimaryDirection);
        }
        int iN = LayoutCompat_androidKt.n(this.layout, iGh, upstream);
        int lineStart = this.layout.getLineStart(iN);
        int lineEnd = this.layout.getLineEnd(iN);
        if (iGh != lineStart && iGh != lineEnd) {
            return rl(offset, usePrimaryDirection);
        }
        if (iGh == 0 || iGh == this.layout.getText().length()) {
            return rl(offset, usePrimaryDirection);
        }
        int iJ2 = J2(iGh, upstream);
        boolean zMUb = mUb(iJ2);
        int iGh2 = gh(lineEnd, lineStart);
        int iKN = KN(iJ2);
        int i2 = lineStart - iKN;
        int i3 = iGh2 - iKN;
        Bidi bidiN = n(iJ2);
        Bidi bidiCreateLineBidi = bidiN != null ? bidiN.createLineBidi(i2, i3) : null;
        boolean z2 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || zMUb == zIsRtlCharAt) {
                zMUb = !zMUb;
            }
            if (iGh == lineStart) {
                z2 = zMUb;
            } else if (!zMUb) {
                z2 = true;
            }
            Layout layout = this.layout;
            return z2 ? layout.getLineLeft(iN) : layout.getLineRight(iN);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i5 = 0; i5 < runCount; i5++) {
            bidiRunArr[i5] = new BidiRun(bidiCreateLineBidi.getRunStart(i5) + lineStart, bidiCreateLineBidi.getRunLimit(i5) + lineStart, bidiCreateLineBidi.getRunLevel(i5) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i8 = -1;
        if (iGh == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    break;
                }
                if (bidiRunArr[i9].getStart() == iGh) {
                    i8 = i9;
                    break;
                }
                i9++;
            }
            BidiRun bidiRun = bidiRunArr[i8];
            if (usePrimaryDirection || zMUb == bidiRun.getIsRtl()) {
                zMUb = !zMUb;
            }
            return (i8 == 0 && zMUb) ? this.layout.getLineLeft(iN) : (i8 != ArraysKt.getLastIndex(bidiRunArr) || zMUb) ? zMUb ? this.layout.getPrimaryHorizontal(bidiRunArr[i8 - 1].getStart()) : this.layout.getPrimaryHorizontal(bidiRunArr[i8 + 1].getStart()) : this.layout.getLineRight(iN);
        }
        if (iGh > iGh2) {
            iGh = gh(iGh, lineStart);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= runCount) {
                break;
            }
            if (bidiRunArr[i10].getEnd() == iGh) {
                i8 = i10;
                break;
            }
            i10++;
        }
        BidiRun bidiRun2 = bidiRunArr[i8];
        if (!usePrimaryDirection && zMUb != bidiRun2.getIsRtl()) {
            zMUb = !zMUb;
        }
        return (i8 == 0 && zMUb) ? this.layout.getLineLeft(iN) : (i8 != ArraysKt.getLastIndex(bidiRunArr) || zMUb) ? zMUb ? this.layout.getPrimaryHorizontal(bidiRunArr[i8 - 1].getEnd()) : this.layout.getPrimaryHorizontal(bidiRunArr[i8 + 1].getEnd()) : this.layout.getLineRight(iN);
    }

    public final boolean xMQ(char c2) {
        if (c2 == ' ' || c2 == '\n' || c2 == 5760) {
            return true;
        }
        return (Intrinsics.compare((int) c2, 8192) >= 0 && Intrinsics.compare((int) c2, 8202) <= 0 && c2 != 8199) || c2 == 8287 || c2 == 12288;
    }

    public LayoutHelper(Layout layout) {
        int length;
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            int iIndexOf$default = StringsKt.indexOf$default(this.layout.getText(), '\n', i2, false, 4, (Object) null);
            if (iIndexOf$default < 0) {
                length = this.layout.getText().length();
            } else {
                length = iIndexOf$default + 1;
            }
            i2 = length;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }
}
