package com.google.android.exoplayer2.source;

import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class SampleQueue implements TrackOutput {

    @VisibleForTesting
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final String TAG = "SampleQueue";
    private int absoluteFirstIndex;

    @Nullable
    private DrmSession currentDrmSession;

    @Nullable
    private Format downstreamFormat;

    @Nullable
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;

    @Nullable
    private final DrmSessionManager drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final UGc sampleDataQueue;
    private long sampleOffsetUs;

    @Nullable
    private Format unadjustedUpstreamFormat;
    private boolean upstreamAllSamplesAreSyncSamples;

    @Nullable
    private Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;

    @Nullable
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private int upstreamSourceId;
    private final n extrasHolder = new n();
    private int capacity = 1000;
    private int[] sourceIds = new int[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[1000];
    private final SPz sharedSampleMetadata = new SPz(new Consumer() { // from class: com.google.android.exoplayer2.source.Q
        @Override // com.google.android.exoplayer2.util.Consumer
        public final void accept(Object obj) {
            ((SampleQueue.w6) obj).rl.release();
        }
    });
    private long startTimeUs = Long.MIN_VALUE;
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;

    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Format f58116n;
        public final DrmSessionManager.DrmSessionReference rl;

        private w6(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.f58116n = format;
            this.rl = drmSessionReference;
        }
    }

    private synchronized boolean attemptSplice(long j2) {
        if (this.length == 0) {
            return j2 > this.largestDiscardedTimestampUs;
        }
        if (getLargestReadTimestampUs() >= j2) {
            return false;
        }
        discardUpstreamSampleMetadata(this.absoluteFirstIndex + countUnreadSamplesBefore(j2));
        return true;
    }

    private synchronized void commitSample(long j2, int i2, long j3, int i3, @Nullable TrackOutput.CryptoData cryptoData) {
        try {
            int i5 = this.length;
            if (i5 > 0) {
                int relativeIndex = getRelativeIndex(i5 - 1);
                Assertions.checkArgument(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j3);
            }
            this.isLastSampleQueued = (536870912 & i2) != 0;
            this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j2);
            int relativeIndex2 = getRelativeIndex(this.length);
            this.timesUs[relativeIndex2] = j2;
            this.offsets[relativeIndex2] = j3;
            this.sizes[relativeIndex2] = i3;
            this.flags[relativeIndex2] = i2;
            this.cryptoDatas[relativeIndex2] = cryptoData;
            this.sourceIds[relativeIndex2] = this.upstreamSourceId;
            if (this.sharedSampleMetadata.Uo() || !((w6) this.sharedSampleMetadata.J2()).f58116n.equals(this.upstreamFormat)) {
                DrmSessionManager drmSessionManager = this.drmSessionManager;
                this.sharedSampleMetadata.n(getWriteIndex(), new w6((Format) Assertions.checkNotNull(this.upstreamFormat), drmSessionManager != null ? drmSessionManager.preacquireSession(this.drmEventDispatcher, this.upstreamFormat) : DrmSessionManager.DrmSessionReference.EMPTY));
            }
            int i7 = this.length + 1;
            this.length = i7;
            int i8 = this.capacity;
            if (i7 == i8) {
                int i9 = i8 + 1000;
                int[] iArr = new int[i9];
                long[] jArr = new long[i9];
                long[] jArr2 = new long[i9];
                int[] iArr2 = new int[i9];
                int[] iArr3 = new int[i9];
                TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i9];
                int i10 = this.relativeFirstIndex;
                int i11 = i8 - i10;
                System.arraycopy(this.offsets, i10, jArr, 0, i11);
                System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr2, 0, i11);
                System.arraycopy(this.flags, this.relativeFirstIndex, iArr2, 0, i11);
                System.arraycopy(this.sizes, this.relativeFirstIndex, iArr3, 0, i11);
                System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i11);
                System.arraycopy(this.sourceIds, this.relativeFirstIndex, iArr, 0, i11);
                int i12 = this.relativeFirstIndex;
                System.arraycopy(this.offsets, 0, jArr, i11, i12);
                System.arraycopy(this.timesUs, 0, jArr2, i11, i12);
                System.arraycopy(this.flags, 0, iArr2, i11, i12);
                System.arraycopy(this.sizes, 0, iArr3, i11, i12);
                System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i11, i12);
                System.arraycopy(this.sourceIds, 0, iArr, i11, i12);
                this.offsets = jArr;
                this.timesUs = jArr2;
                this.flags = iArr2;
                this.sizes = iArr3;
                this.cryptoDatas = cryptoDataArr;
                this.sourceIds = iArr;
                this.relativeFirstIndex = 0;
                this.capacity = i9;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static SampleQueue createWithDrm(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new SampleQueue(allocator, (DrmSessionManager) Assertions.checkNotNull(drmSessionManager), (DrmSessionEventListener.EventDispatcher) Assertions.checkNotNull(eventDispatcher));
    }

    private synchronized long discardSampleMetadataTo(long j2, boolean z2, boolean z3) throws Throwable {
        Throwable th;
        try {
            try {
                int i2 = this.length;
                if (i2 != 0) {
                    long[] jArr = this.timesUs;
                    int i3 = this.relativeFirstIndex;
                    if (j2 >= jArr[i3]) {
                        if (z3) {
                            try {
                                int i5 = this.readPosition;
                                if (i5 != i2) {
                                    i2 = i5 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iFindSampleBefore = findSampleBefore(i3, i2, j2, z2);
                        if (iFindSampleBefore == -1) {
                            return -1L;
                        }
                        return discardSamples(iFindSampleBefore);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i2 = this.length;
        if (i2 == 0) {
            return -1L;
        }
        return discardSamples(i2);
    }

    private int findSampleBefore(int i2, int i3, long j2, boolean z2) {
        int i5 = -1;
        for (int i7 = 0; i7 < i3; i7++) {
            long j3 = this.timesUs[i2];
            if (j3 > j2) {
                break;
            }
            if (!z2 || (this.flags[i2] & 1) != 0) {
                if (j3 == j2) {
                    return i7;
                }
                i5 = i7;
            }
            i2++;
            if (i2 == this.capacity) {
                i2 = 0;
            }
        }
        return i5;
    }

    private synchronized int peekSampleMetadata(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z2, boolean z3, n nVar) {
        try {
            decoderInputBuffer.waitingForKeys = false;
            if (!hasNextSample()) {
                if (!z3 && !this.isLastSampleQueued) {
                    Format format = this.upstreamFormat;
                    if (format == null || (!z2 && format == this.downstreamFormat)) {
                        return -3;
                    }
                    onFormatResult((Format) Assertions.checkNotNull(format), formatHolder);
                    return -5;
                }
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            Format format2 = ((w6) this.sharedSampleMetadata.O(getReadIndex())).f58116n;
            if (!z2 && format2 == this.downstreamFormat) {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!mayReadSample(relativeIndex)) {
                    decoderInputBuffer.waitingForKeys = true;
                    return -3;
                }
                decoderInputBuffer.setFlags(this.flags[relativeIndex]);
                long j2 = this.timesUs[relativeIndex];
                decoderInputBuffer.timeUs = j2;
                if (j2 < this.startTimeUs) {
                    decoderInputBuffer.addFlag(Integer.MIN_VALUE);
                }
                nVar.f58114n = this.sizes[relativeIndex];
                nVar.rl = this.offsets[relativeIndex];
                nVar.f58115t = this.cryptoDatas[relativeIndex];
                return -4;
            }
            onFormatResult(format2, formatHolder);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.HI();
    }

    private synchronized boolean setUpstreamFormat(Format format) {
        try {
            this.upstreamFormatRequired = false;
            if (Util.areEqual(format, this.upstreamFormat)) {
                return false;
            }
            if (this.sharedSampleMetadata.Uo() || !((w6) this.sharedSampleMetadata.J2()).f58116n.equals(format)) {
                this.upstreamFormat = format;
            } else {
                this.upstreamFormat = ((w6) this.sharedSampleMetadata.J2()).f58116n;
            }
            Format format2 = this.upstreamFormat;
            this.upstreamAllSamplesAreSyncSamples = MimeTypes.allSamplesAreSyncSamples(format2.sampleMimeType, format2.codecs);
            this.loggedUnexpectedNonSyncSample = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long discardSampleMetadataToRead() {
        int i2 = this.readPosition;
        if (i2 == 0) {
            return -1L;
        }
        return discardSamples(i2);
    }

    public final synchronized long getFirstTimestampUs() {
        return this.length == 0 ? Long.MIN_VALUE : this.timesUs[this.relativeFirstIndex];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition));
    }

    public final synchronized int getSkipCount(long j2, boolean z2) throws Throwable {
        Throwable th;
        try {
            try {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!hasNextSample() || j2 < this.timesUs[relativeIndex]) {
                    return 0;
                }
                if (j2 <= this.largestQueuedTimestampUs || !z2) {
                    int iFindSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j2, true);
                    if (iFindSampleBefore == -1) {
                        return 0;
                    }
                    return iFindSampleBefore;
                }
                try {
                    return this.length - this.readPosition;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Nullable
    public final synchronized Format getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    protected final void invalidateUpstreamFormatAdjustment() {
        this.upstreamFormatAdjustmentRequired = true;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    @CallSuper
    public synchronized boolean isReady(boolean z2) {
        Format format;
        boolean z3 = true;
        if (hasNextSample()) {
            if (((w6) this.sharedSampleMetadata.O(getReadIndex())).f58116n != this.downstreamFormat) {
                return true;
            }
            return mayReadSample(getRelativeIndex(this.readPosition));
        }
        if (!z2 && !this.isLastSampleQueued && ((format = this.upstreamFormat) == null || format == this.downstreamFormat)) {
            z3 = false;
        }
        return z3;
    }

    public final synchronized int peekSourceId() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    @CallSuper
    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public final void reset() {
        reset(false);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i2, boolean z2, int i3) throws IOException {
        return this.sampleDataQueue.ck(dataReader, i2, z2);
    }

    public final synchronized boolean seekTo(int i2) {
        rewind();
        int i3 = this.absoluteFirstIndex;
        if (i2 >= i3 && i2 <= this.length + i3) {
            this.startTimeUs = Long.MIN_VALUE;
            this.readPosition = i2 - i3;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void skip(int i2) {
        boolean z2;
        if (i2 >= 0) {
            try {
                z2 = this.readPosition + i2 <= this.length;
            } catch (Throwable th) {
                throw th;
            }
        }
        Assertions.checkArgument(z2);
        this.readPosition += i2;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f58114n;
        public long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TrackOutput.CryptoData f58115t;

        n() {
        }
    }

    private int countUnreadSamplesBefore(long j2) {
        int i2 = this.length;
        int relativeIndex = getRelativeIndex(i2 - 1);
        while (i2 > this.readPosition && this.timesUs[relativeIndex] >= j2) {
            i2--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return i2;
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
        return new SampleQueue(allocator, null, null);
    }

    @GuardedBy
    private long discardSamples(int i2) {
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i2));
        this.length -= i2;
        int i3 = this.absoluteFirstIndex + i2;
        this.absoluteFirstIndex = i3;
        int i5 = this.relativeFirstIndex + i2;
        this.relativeFirstIndex = i5;
        int i7 = this.capacity;
        if (i5 >= i7) {
            this.relativeFirstIndex = i5 - i7;
        }
        int i8 = this.readPosition - i2;
        this.readPosition = i8;
        if (i8 < 0) {
            this.readPosition = 0;
        }
        this.sharedSampleMetadata.nr(i3);
        if (this.length != 0) {
            return this.offsets[this.relativeFirstIndex];
        }
        int i9 = this.relativeFirstIndex;
        if (i9 == 0) {
            i9 = this.capacity;
        }
        int i10 = i9 - 1;
        return this.offsets[i10] + ((long) this.sizes[i10]);
    }

    private long getLargestTimestamp(int i2) {
        long jMax = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            jMax = Math.max(jMax, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                return jMax;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return jMax;
    }

    private int getRelativeIndex(int i2) {
        int i3 = this.relativeFirstIndex + i2;
        int i5 = this.capacity;
        return i3 < i5 ? i3 : i3 - i5;
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    private boolean mayReadSample(int i2) {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.flags[i2] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys();
    }

    private void onFormatResult(Format format, FormatHolder formatHolder) {
        Format format2 = this.downstreamFormat;
        boolean z2 = format2 == null;
        DrmInitData drmInitData = z2 ? null : format2.drmInitData;
        this.downstreamFormat = format;
        DrmInitData drmInitData2 = format.drmInitData;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        formatHolder.format = drmSessionManager != null ? format.copyWithCryptoType(drmSessionManager.getCryptoType(format)) : format;
        formatHolder.drmSession = this.currentDrmSession;
        if (this.drmSessionManager == null) {
            return;
        }
        if (z2 || !Util.areEqual(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.currentDrmSession;
            DrmSession drmSessionAcquireSession = this.drmSessionManager.acquireSession(this.drmEventDispatcher, format);
            this.currentDrmSession = drmSessionAcquireSession;
            formatHolder.drmSession = drmSessionAcquireSession;
            if (drmSession != null) {
                drmSession.release(this.drmEventDispatcher);
            }
        }
    }

    private void releaseDrmSessionReferences() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release(this.drmEventDispatcher);
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    public final void discardTo(long j2, boolean z2, boolean z3) {
        this.sampleDataQueue.rl(discardSampleMetadataTo(j2, z2, z3));
    }

    public final void discardToEnd() {
        this.sampleDataQueue.rl(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.sampleDataQueue.rl(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j2) {
        if (this.length == 0) {
            return;
        }
        Assertions.checkArgument(j2 > getLargestReadTimestampUs());
        discardUpstreamSamples(this.absoluteFirstIndex + countUnreadSamplesBefore(j2));
    }

    public final void discardUpstreamSamples(int i2) {
        this.sampleDataQueue.t(discardUpstreamSampleMetadata(i2));
    }

    @CallSuper
    protected Format getAdjustedUpstreamFormat(Format format) {
        return (this.sampleOffsetUs == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) ? format : format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.sampleOffsetUs).build();
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    @CallSuper
    public void maybeThrowError() throws IOException {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) Assertions.checkNotNull(this.currentDrmSession.getError()));
        }
    }

    @CallSuper
    public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2, boolean z2) {
        int iPeekSampleMetadata = peekSampleMetadata(formatHolder, decoderInputBuffer, (i2 & 2) != 0, z2, this.extrasHolder);
        if (iPeekSampleMetadata == -4 && !decoderInputBuffer.isEndOfStream()) {
            boolean z3 = (i2 & 1) != 0;
            if ((i2 & 4) == 0) {
                if (z3) {
                    this.sampleDataQueue.J2(decoderInputBuffer, this.extrasHolder);
                } else {
                    this.sampleDataQueue.az(decoderInputBuffer, this.extrasHolder);
                }
            }
            if (!z3) {
                this.readPosition++;
            }
        }
        return iPeekSampleMetadata;
    }

    @CallSuper
    public void reset(boolean z2) {
        this.sampleDataQueue.ty();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.sharedSampleMetadata.rl();
        if (z2) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i2, int i3) {
        this.sampleDataQueue.Ik(parsableByteArray, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sampleMetadata(long j2, int i2, int i3, int i5, @Nullable TrackOutput.CryptoData cryptoData) {
        int i7;
        if (this.upstreamFormatAdjustmentRequired) {
            format((Format) Assertions.checkStateNotNull(this.unadjustedUpstreamFormat));
        }
        int i8 = i2 & 1;
        boolean z2 = i8 != 0;
        if (this.upstreamKeyframeRequired) {
            if (!z2) {
                return;
            } else {
                this.upstreamKeyframeRequired = false;
            }
        }
        long j3 = this.sampleOffsetUs + j2;
        if (!this.upstreamAllSamplesAreSyncSamples) {
            i7 = i2;
        } else {
            if (j3 < this.startTimeUs) {
                return;
            }
            if (i8 == 0) {
                if (!this.loggedUnexpectedNonSyncSample) {
                    Log.w(TAG, "Overriding unexpected non-sync sample for format: " + this.upstreamFormat);
                    this.loggedUnexpectedNonSyncSample = true;
                }
                i7 = i2 | 1;
            }
        }
        if (this.pendingSplice) {
            if (!z2 || !attemptSplice(j3)) {
                return;
            } else {
                this.pendingSplice = false;
            }
        }
        commitSample(j3, i7, (this.sampleDataQueue.O() - ((long) i3)) - ((long) i5), i3, cryptoData);
    }

    public final void setSampleOffsetUs(long j2) {
        if (this.sampleOffsetUs != j2) {
            this.sampleOffsetUs = j2;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setStartTimeUs(long j2) {
        this.startTimeUs = j2;
    }

    public final void setUpstreamFormatChangeListener(@Nullable UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    public final void sourceId(int i2) {
        this.upstreamSourceId = i2;
    }

    protected SampleQueue(Allocator allocator, @Nullable DrmSessionManager drmSessionManager, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new UGc(allocator);
    }

    private long discardUpstreamSampleMetadata(int i2) {
        boolean z2;
        int writeIndex = getWriteIndex() - i2;
        boolean z3 = false;
        if (writeIndex >= 0 && writeIndex <= this.length - this.readPosition) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        int i3 = this.length - writeIndex;
        this.length = i3;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i3));
        if (writeIndex == 0 && this.isLastSampleQueued) {
            z3 = true;
        }
        this.isLastSampleQueued = z3;
        this.sharedSampleMetadata.t(i2);
        int i5 = this.length;
        if (i5 != 0) {
            int relativeIndex = getRelativeIndex(i5 - 1);
            return this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]);
        }
        return 0L;
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void format(Format format) {
        Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(format);
        this.upstreamFormatAdjustmentRequired = false;
        this.unadjustedUpstreamFormat = format;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener != null && upstreamFormat) {
            upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
        }
    }

    @CallSuper
    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    @Deprecated
    public static SampleQueue createWithDrm(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.setPlayer(looper, PlayerId.UNSET);
        return new SampleQueue(allocator, (DrmSessionManager) Assertions.checkNotNull(drmSessionManager), (DrmSessionEventListener.EventDispatcher) Assertions.checkNotNull(eventDispatcher));
    }

    public final synchronized boolean seekTo(long j2, boolean z2) throws Throwable {
        try {
            try {
                rewind();
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!hasNextSample() || j2 < this.timesUs[relativeIndex] || (j2 > this.largestQueuedTimestampUs && !z2)) {
                    return false;
                }
                int iFindSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j2, true);
                if (iFindSampleBefore == -1) {
                    return false;
                }
                this.startTimeUs = j2;
                this.readPosition += iFindSampleBefore;
                return true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
