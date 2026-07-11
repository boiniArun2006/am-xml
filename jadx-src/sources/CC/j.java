package CC;

import LQ.Wre;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.source.SampleQueue;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements CSs.j, SeekMap {
    private final Format J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final SeekMap f824O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SampleQueue f825n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f826r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CSs.n f827t;

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void maybeThrowError() {
    }

    public j(SampleQueue sampleQueue, CSs.n extractor, SeekMap seekMap, Format format) {
        Intrinsics.checkNotNullParameter(sampleQueue, "sampleQueue");
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        Intrinsics.checkNotNullParameter(seekMap, "seekMap");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f825n = sampleQueue;
        this.f827t = extractor;
        this.f824O = seekMap;
        this.J2 = format;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f824O.getDurationUs();
    }

    @Override // CSs.j
    public Format getFormat() {
        return this.J2;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        return this.f824O.getSeekPoints(j2);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.f824O.isSeekable();
    }

    @Override // CSs.j
    public void n(SeekPoint point) throws IOException {
        Intrinsics.checkNotNullParameter(point, "point");
        if (this.f825n.seekTo(point.timeUs, false)) {
            return;
        }
        this.f825n.reset();
        this.f827t.n(point);
        this.f826r = false;
        this.f825n.setStartTimeUs(point.timeUs);
        this.f825n.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(formatHolder, "formatHolder");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        while (!this.f825n.isReady(this.f826r)) {
            this.f826r = !((Boolean) Wre.n(this.f827t.read())).booleanValue();
        }
        int i3 = this.f825n.read(formatHolder, buffer, i2, this.f826r);
        this.f825n.discardToRead();
        this.f825n.maybeThrowError();
        return i3;
    }

    @Override // w9.fuX
    public void release() {
        this.f825n.release();
        this.f827t.release();
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int skipData(long j2) throws Throwable {
        int skipCount = this.f825n.getSkipCount(j2, this.f826r);
        this.f825n.skip(skipCount);
        return skipCount;
    }
}
