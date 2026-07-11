package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class r implements MediaPeriod, Loader.Callback {
    final Format E2;
    private final LoadErrorHandlingPolicy J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f58240N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TransferListener f58241O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final long f58242S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    byte[] f58243T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    boolean f58244X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f58246e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataSpec f58248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final TrackGroupArray f58249o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final MediaSourceEventListener.EventDispatcher f58250r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataSource.Factory f58251t;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final ArrayList f58245Z = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Loader f58247g = new Loader("SingleSampleMediaPeriod");

    private final class n implements SampleStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f58253n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f58254t;

        private n() {
        }

        private void rl() {
            if (this.f58254t) {
                return;
            }
            r.this.f58250r.downstreamFormatChanged(MimeTypes.getTrackType(r.this.E2.sampleMimeType), r.this.E2, 0, null, 0L);
            this.f58254t = true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return r.this.f58244X;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            r rVar = r.this;
            if (rVar.f58246e) {
                return;
            }
            rVar.f58247g.maybeThrowError();
        }

        public void t() {
            if (this.f58253n == 2) {
                this.f58253n = 1;
            }
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            rl();
            r rVar = r.this;
            boolean z2 = rVar.f58244X;
            if (z2 && rVar.f58243T == null) {
                this.f58253n = 2;
            }
            int i3 = this.f58253n;
            if (i3 == 2) {
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if ((i2 & 2) == 0 && i3 != 0) {
                if (!z2) {
                    return -3;
                }
                Assertions.checkNotNull(rVar.f58243T);
                decoderInputBuffer.addFlag(1);
                decoderInputBuffer.timeUs = 0L;
                if ((i2 & 4) == 0) {
                    decoderInputBuffer.ensureSpaceForWrite(r.this.f58240N);
                    ByteBuffer byteBuffer = decoderInputBuffer.data;
                    r rVar2 = r.this;
                    byteBuffer.put(rVar2.f58243T, 0, rVar2.f58240N);
                }
                if ((i2 & 1) == 0) {
                    this.f58253n = 2;
                }
                return -4;
            }
            formatHolder.format = rVar.E2;
            this.f58253n = 1;
            return -5;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j2) {
            rl();
            if (j2 > 0 && this.f58253n != 2) {
                this.f58253n = 2;
                return 1;
            }
            return 0;
        }
    }

    static final class w6 implements Loader.Loadable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f58255n = LoadEventInfo.getNewId();
        private byte[] nr;
        public final DataSpec rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final StatsDataSource f58256t;

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() {
            this.f58256t.resetBytesRead();
            try {
                this.f58256t.open(this.rl);
                int i2 = 0;
                while (i2 != -1) {
                    int bytesRead = (int) this.f58256t.getBytesRead();
                    byte[] bArr = this.nr;
                    if (bArr == null) {
                        this.nr = new byte[1024];
                    } else if (bytesRead == bArr.length) {
                        this.nr = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    StatsDataSource statsDataSource = this.f58256t;
                    byte[] bArr2 = this.nr;
                    i2 = statsDataSource.read(bArr2, bytesRead, bArr2.length - bytesRead);
                }
                DataSourceUtil.closeQuietly(this.f58256t);
            } catch (Throwable th) {
                DataSourceUtil.closeQuietly(this.f58256t);
                throw th;
            }
        }

        public w6(DataSpec dataSpec, DataSource dataSource) {
            this.rl = dataSpec;
            this.f58256t = new StatsDataSource(dataSource);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z2) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j2) {
        for (int i2 = 0; i2 < this.f58245Z.size(); i2++) {
            ((n) this.f58245Z.get(i2)).t();
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
            SampleStream sampleStream = sampleStreamArr[i2];
            if (sampleStream != null && (exoTrackSelectionArr[i2] == null || !zArr[i2])) {
                this.f58245Z.remove(sampleStream);
                sampleStreamArr[i2] = null;
            }
            if (sampleStreamArr[i2] == null && exoTrackSelectionArr[i2] != null) {
                n nVar = new n();
                this.f58245Z.add(nVar);
                sampleStreamArr[i2] = nVar;
                zArr2[i2] = true;
            }
        }
        return j2;
    }

    public void O() {
        this.f58247g.release();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        if (this.f58244X || this.f58247g.isLoading() || this.f58247g.hasFatalError()) {
            return false;
        }
        DataSource dataSourceCreateDataSource = this.f58251t.createDataSource();
        TransferListener transferListener = this.f58241O;
        if (transferListener != null) {
            dataSourceCreateDataSource.addTransferListener(transferListener);
        }
        w6 w6Var = new w6(this.f58248n, dataSourceCreateDataSource);
        this.f58250r.loadStarted(new LoadEventInfo(w6Var.f58255n, this.f58248n, this.f58247g.startLoading(w6Var, this, this.J2.getMinimumLoadableRetryCount(1))), 1, -1, this.E2, 0, null, 0L, this.f58242S);
        return true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.f58244X ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return (this.f58244X || this.f58247g.isLoading()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.f58249o;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f58247g.isLoading();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public Loader.LoadErrorAction onLoadError(w6 w6Var, long j2, long j3, IOException iOException, int i2) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        StatsDataSource statsDataSource = w6Var.f58256t;
        LoadEventInfo loadEventInfo = new LoadEventInfo(w6Var.f58255n, w6Var.rl, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j2, j3, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.J2.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, this.E2, 0, null, 0L, Util.usToMs(this.f58242S)), iOException, i2));
        boolean z2 = retryDelayMsFor == -9223372036854775807L || i2 >= this.J2.getMinimumLoadableRetryCount(1);
        if (this.f58246e && z2) {
            Log.w("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f58244X = true;
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
        } else {
            loadErrorActionCreateRetryAction = retryDelayMsFor != -9223372036854775807L ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        Loader.LoadErrorAction loadErrorAction = loadErrorActionCreateRetryAction;
        boolean zIsRetry = loadErrorAction.isRetry();
        this.f58250r.loadError(loadEventInfo, 1, -1, this.E2, 0, null, 0L, this.f58242S, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.J2.onLoadTaskConcluded(w6Var.f58255n);
        }
        return loadErrorAction;
    }

    public r(DataSpec dataSpec, DataSource.Factory factory, TransferListener transferListener, Format format, long j2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher, boolean z2) {
        this.f58248n = dataSpec;
        this.f58251t = factory;
        this.f58241O = transferListener;
        this.E2 = format;
        this.f58242S = j2;
        this.J2 = loadErrorHandlingPolicy;
        this.f58250r = eventDispatcher;
        this.f58246e = z2;
        this.f58249o = new TrackGroupArray(new TrackGroup(format));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j2) {
        callback.onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void onLoadCanceled(w6 w6Var, long j2, long j3, boolean z2) {
        StatsDataSource statsDataSource = w6Var.f58256t;
        LoadEventInfo loadEventInfo = new LoadEventInfo(w6Var.f58255n, w6Var.rl, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j2, j3, statsDataSource.getBytesRead());
        this.J2.onLoadTaskConcluded(w6Var.f58255n);
        this.f58250r.loadCanceled(loadEventInfo, 1, -1, null, 0, null, 0L, this.f58242S);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onLoadCompleted(w6 w6Var, long j2, long j3) {
        this.f58240N = (int) w6Var.f58256t.getBytesRead();
        this.f58243T = (byte[]) Assertions.checkNotNull(w6Var.nr);
        this.f58244X = true;
        StatsDataSource statsDataSource = w6Var.f58256t;
        LoadEventInfo loadEventInfo = new LoadEventInfo(w6Var.f58255n, w6Var.rl, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j2, j3, this.f58240N);
        this.J2.onLoadTaskConcluded(w6Var.f58255n);
        this.f58250r.loadCompleted(loadEventInfo, 1, -1, this.E2, 0, null, 0L, this.f58242S);
    }
}
