package kotlin.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.PublishedApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0001\u001a \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0001¨\u0006\u000b"}, d2 = {"mod", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "", "differenceModulo", "c", "getProgressionLastElement", TtmlNode.START, TtmlNode.END, "step", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ProgressionUtilKt {
    private static final int differenceModulo(int i2, int i3, int i5) {
        return mod(mod(i2, i5) - mod(i3, i5), i5);
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i2, int i3, int i5) {
        if (i5 > 0) {
            if (i2 < i3) {
                return i3 - differenceModulo(i3, i2, i5);
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i2 > i3) {
                return i3 + differenceModulo(i2, i3, -i5);
            }
        }
        return i3;
    }

    private static final int mod(int i2, int i3) {
        int i5 = i2 % i3;
        return i5 >= 0 ? i5 : i5 + i3;
    }

    private static final long differenceModulo(long j2, long j3, long j4) {
        return mod(mod(j2, j4) - mod(j3, j4), j4);
    }

    private static final long mod(long j2, long j3) {
        long j4 = j2 % j3;
        return j4 >= 0 ? j4 : j4 + j3;
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j2, long j3, long j4) {
        if (j4 > 0) {
            return j2 >= j3 ? j3 : j3 - differenceModulo(j3, j2, j4);
        }
        if (j4 < 0) {
            return j2 <= j3 ? j3 : j3 + differenceModulo(j2, j3, -j4);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
