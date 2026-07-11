package kotlin.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.n;
import kotlin.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", TtmlNode.START, TtmlNode.END, "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UProgressionUtilKt {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1520getProgressionLastElement7ftBX0g(long j2, long j3, long j4) {
        if (j4 > 0) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) >= 0 ? j3 : ULong.m487constructorimpl(j3 - m1519differenceModulosambcqE(j3, j2, ULong.m487constructorimpl(j4)));
        }
        if (j4 < 0) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) <= 0 ? j3 : ULong.m487constructorimpl(j3 + m1519differenceModulosambcqE(j2, j3, ULong.m487constructorimpl(-j4)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1521getProgressionLastElementNkh28Cs(int i2, int i3, int i5) {
        if (i5 > 0) {
            if (Integer.compare(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE) < 0) {
                return UInt.m408constructorimpl(i3 - m1518differenceModuloWZ9TVnA(i3, i2, UInt.m408constructorimpl(i5)));
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compare(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE) > 0) {
                return UInt.m408constructorimpl(i3 + m1518differenceModuloWZ9TVnA(i2, i3, UInt.m408constructorimpl(-i5)));
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1518differenceModuloWZ9TVnA(int i2, int i3, int i5) {
        int iN = n.n(i2, i5);
        int iN2 = n.n(i3, i5);
        int iCompare = Integer.compare(iN ^ Integer.MIN_VALUE, iN2 ^ Integer.MIN_VALUE);
        int iM408constructorimpl = UInt.m408constructorimpl(iN - iN2);
        if (iCompare >= 0) {
            return iM408constructorimpl;
        }
        return UInt.m408constructorimpl(iM408constructorimpl + i5);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1519differenceModulosambcqE(long j2, long j3, long j4) {
        long jN = w6.n(j2, j4);
        long jN2 = w6.n(j3, j4);
        int iCompare = Long.compare(jN ^ Long.MIN_VALUE, jN2 ^ Long.MIN_VALUE);
        long jM487constructorimpl = ULong.m487constructorimpl(jN - jN2);
        if (iCompare >= 0) {
            return jM487constructorimpl;
        }
        return ULong.m487constructorimpl(jM487constructorimpl + j4);
    }
}
