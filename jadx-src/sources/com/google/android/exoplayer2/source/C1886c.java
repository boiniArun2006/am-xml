package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.IcyDataSource;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class C1886c implements MediaPeriod, ExtractorOutput, Loader.Callback, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f58176E;
    private final long E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private SeekMap f58177FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private int f58178GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f58179I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f58180J;
    private final LoadErrorHandlingPolicy J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private I28 f58181M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final DrmSessionManager f58183O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Allocator f58184S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private IcyHeaders f58186U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final ProgressiveMediaExtractor f58187X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private long f58188Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final n f58189Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f58190a;
    private boolean dR0;
    private boolean eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f58192g;
    private boolean ijL;
    private MediaPeriod.Callback jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f58194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final DrmSessionEventListener.EventDispatcher f58195o;
    private boolean p5;
    private boolean piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final MediaSourceEventListener.EventDispatcher f58196r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DataSource f58197t;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f58199z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Map f58173m = ck();
    private static final Format eTf = new Format.Builder().setId("icy").setSampleMimeType("application/x-icy").build();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Loader f58191e = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final ConditionVariable f58185T = new ConditionVariable();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Runnable f58182N = new Runnable() { // from class: com.google.android.exoplayer2.source.z
        @Override // java.lang.Runnable
        public final void run() {
            this.f58259n.S();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f58198v = new Runnable() { // from class: com.google.android.exoplayer2.source.QJ
        @Override // java.lang.Runnable
        public final void run() {
            C1886c.rl(this.f58111n);
        }
    };
    private final Handler Xw = Util.createHandlerForCurrentLooper();
    private Ml[] M7 = new Ml[0];
    private SampleQueue[] P5 = new SampleQueue[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f58193k = -9223372036854775807L;
    private long Nxk = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f58174B = -9223372036854775807L;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f58175D = 1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$Ml */
    private static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f58202n;
        public final boolean rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Ml.class == obj.getClass()) {
                Ml ml = (Ml) obj;
                if (this.f58202n == ml.f58202n && this.rl == ml.rl) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f58202n * 31) + (this.rl ? 1 : 0);
        }

        public Ml(int i2, boolean z2) {
            this.f58202n = i2;
            this.rl = z2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$j */
    final class j implements Loader.Loadable, IcyDataSource.Listener {
        private final ConditionVariable J2;
        private volatile boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final ExtractorOutput f58203O;
        private TrackOutput az;
        private long mUb;
        private final ProgressiveMediaExtractor nr;
        private final Uri rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final StatsDataSource f58205t;
        private boolean ty;
        private final PositionHolder Uo = new PositionHolder();
        private boolean xMQ = true;
        private long qie = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f58204n = LoadEventInfo.getNewId();
        private DataSpec gh = Uo(0);

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
            this.KN = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() {
            int i2 = 0;
            while (i2 == 0 && !this.KN) {
                try {
                    long j2 = this.Uo.position;
                    DataSpec dataSpecUo = Uo(j2);
                    this.gh = dataSpecUo;
                    long jOpen = this.f58205t.open(dataSpecUo);
                    this.qie = jOpen;
                    if (jOpen != -1) {
                        this.qie = jOpen + j2;
                    }
                    C1886c.this.f58186U = IcyHeaders.parse(this.f58205t.getResponseHeaders());
                    DataReader icyDataSource = this.f58205t;
                    if (C1886c.this.f58186U != null && C1886c.this.f58186U.metadataInterval != -1) {
                        icyDataSource = new IcyDataSource(this.f58205t, C1886c.this.f58186U.metadataInterval, this);
                        TrackOutput trackOutputO = C1886c.this.o();
                        this.az = trackOutputO;
                        trackOutputO.format(C1886c.eTf);
                    }
                    this.nr.init(icyDataSource, this.rl, this.f58205t.getResponseHeaders(), j2, this.qie, this.f58203O);
                    if (C1886c.this.f58186U != null) {
                        this.nr.disableSeekingOnMp3Streams();
                    }
                    if (this.xMQ) {
                        this.nr.seek(j2, this.mUb);
                        this.xMQ = false;
                    }
                    while (i2 == 0 && !this.KN) {
                        try {
                            this.J2.block();
                            i2 = this.nr.read(this.Uo);
                            long currentInputPosition = this.nr.getCurrentInputPosition();
                            if (currentInputPosition > C1886c.this.E2 + j2) {
                                this.J2.close();
                                C1886c.this.Xw.post(C1886c.this.f58198v);
                                j2 = currentInputPosition;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else if (this.nr.getCurrentInputPosition() != -1) {
                        this.Uo.position = this.nr.getCurrentInputPosition();
                    }
                    DataSourceUtil.closeQuietly(this.f58205t);
                } catch (Throwable th) {
                    if (i2 != 1 && this.nr.getCurrentInputPosition() != -1) {
                        this.Uo.position = this.nr.getCurrentInputPosition();
                    }
                    DataSourceUtil.closeQuietly(this.f58205t);
                    throw th;
                }
            }
        }

        public j(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.rl = uri;
            this.f58205t = new StatsDataSource(dataSource);
            this.nr = progressiveMediaExtractor;
            this.f58203O = extractorOutput;
            this.J2 = conditionVariable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void KN(long j2, long j3) {
            this.Uo.position = j2;
            this.mUb = j3;
            this.xMQ = true;
            this.ty = false;
        }

        private DataSpec Uo(long j2) {
            return new DataSpec.Builder().setUri(this.rl).setPosition(j2).setKey(C1886c.this.f58192g).setFlags(6).setHttpRequestHeaders(C1886c.f58173m).build();
        }

        @Override // com.google.android.exoplayer2.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray parsableByteArray) {
            long jMax = !this.ty ? this.mUb : Math.max(C1886c.this.r(), this.mUb);
            int iBytesLeft = parsableByteArray.bytesLeft();
            TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.az);
            trackOutput.sampleData(parsableByteArray, iBytesLeft);
            trackOutput.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
            this.ty = true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$n */
    interface n {
        void onSourceInfoRefreshed(long j2, boolean z2, boolean z3);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$w6 */
    private final class w6 implements SampleStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f58206n;

        public w6(int i2) {
            this.f58206n = i2;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return C1886c.this.XQ(this.f58206n);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            C1886c.this.nY(this.f58206n);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            return C1886c.this.E2(this.f58206n, formatHolder, decoderInputBuffer, i2);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j2) {
            return C1886c.this.N(this.f58206n, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        if (this.ijL || this.eF || !this.p5 || this.f58177FX == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.P5) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.f58185T.close();
        int length = this.P5.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            Format formatBuild = (Format) Assertions.checkNotNull(this.P5[i2].getUpstreamFormat());
            String str = formatBuild.sampleMimeType;
            boolean zIsAudio = MimeTypes.isAudio(str);
            boolean z2 = zIsAudio || MimeTypes.isVideo(str);
            zArr[i2] = z2;
            this.f58176E = z2 | this.f58176E;
            IcyHeaders icyHeaders = this.f58186U;
            if (icyHeaders != null) {
                if (zIsAudio || this.M7[i2].rl) {
                    Metadata metadata = formatBuild.metadata;
                    formatBuild = formatBuild.buildUpon().setMetadata(metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders)).build();
                }
                if (zIsAudio && formatBuild.averageBitrate == -1 && formatBuild.peakBitrate == -1 && icyHeaders.bitrate != -1) {
                    formatBuild = formatBuild.buildUpon().setAverageBitrate(icyHeaders.bitrate).build();
                }
            }
            trackGroupArr[i2] = new TrackGroup(Integer.toString(i2), formatBuild.copyWithCryptoType(this.f58183O.getCryptoType(formatBuild)));
        }
        this.f58181M = new I28(new TrackGroupArray(trackGroupArr), zArr);
        this.eF = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.jB)).onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        this.p5 = true;
        this.Xw.post(this.f58182N);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j2) {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.c$I28 */
    private static final class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final TrackGroupArray f58200n;
        public final boolean[] nr;
        public final boolean[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean[] f58201t;

        public I28(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f58200n = trackGroupArray;
            this.rl = zArr;
            int i2 = trackGroupArray.length;
            this.f58201t = new boolean[i2];
            this.nr = new boolean[i2];
        }
    }

    private void HI(j jVar) {
        if (this.Nxk == -1) {
            this.Nxk = jVar.qie;
        }
    }

    private int Ik() {
        int writeIndex = 0;
        for (SampleQueue sampleQueue : this.P5) {
            writeIndex += sampleQueue.getWriteIndex();
        }
        return writeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(SeekMap seekMap) {
        this.f58177FX = this.f58186U == null ? seekMap : new SeekMap.Unseekable(-9223372036854775807L);
        this.f58174B = seekMap.getDurationUs();
        boolean z2 = this.Nxk == -1 && seekMap.getDurationUs() == -9223372036854775807L;
        this.f58180J = z2;
        this.f58175D = z2 ? 7 : 1;
        this.f58189Z.onSourceInfoRefreshed(this.f58174B, seekMap.isSeekable(), this.f58180J);
        if (this.eF) {
            return;
        }
        S();
    }

    private boolean X(boolean[] zArr, long j2) {
        int length = this.P5.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.P5[i2].seekTo(j2, false) && (zArr[i2] || !this.f58176E)) {
                return false;
            }
        }
        return true;
    }

    private boolean Z() {
        return this.f58193k != -9223372036854775807L;
    }

    private void az() {
        Assertions.checkState(this.eF);
        Assertions.checkNotNull(this.f58181M);
        Assertions.checkNotNull(this.f58177FX);
    }

    private static Map ck() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private TrackOutput fD(Ml ml) {
        int length = this.P5.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ml.equals(this.M7[i2])) {
                return this.P5[i2];
            }
        }
        SampleQueue sampleQueueCreateWithDrm = SampleQueue.createWithDrm(this.f58184S, this.f58183O, this.f58195o);
        sampleQueueCreateWithDrm.setUpstreamFormatChangeListener(this);
        int i3 = length + 1;
        Ml[] mlArr = (Ml[]) Arrays.copyOf(this.M7, i3);
        mlArr[length] = ml;
        this.M7 = (Ml[]) Util.castNonNullTypeArray(mlArr);
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.P5, i3);
        sampleQueueArr[length] = sampleQueueCreateWithDrm;
        this.P5 = (SampleQueue[]) Util.castNonNullTypeArray(sampleQueueArr);
        return sampleQueueCreateWithDrm;
    }

    private void nHg() {
        j jVar = new j(this.f58194n, this.f58197t, this.f58187X, this, this.f58185T);
        if (this.eF) {
            Assertions.checkState(Z());
            long j2 = this.f58174B;
            if (j2 != -9223372036854775807L && this.f58193k > j2) {
                this.piY = true;
                this.f58193k = -9223372036854775807L;
                return;
            }
            jVar.KN(((SeekMap) Assertions.checkNotNull(this.f58177FX)).getSeekPoints(this.f58193k).first.position, this.f58193k);
            for (SampleQueue sampleQueue : this.P5) {
                sampleQueue.setStartTimeUs(this.f58193k);
            }
            this.f58193k = -9223372036854775807L;
        }
        this.f58199z = Ik();
        this.f58196r.loadStarted(new LoadEventInfo(jVar.f58204n, jVar.gh, this.f58191e.startLoading(jVar, this, this.J2.getMinimumLoadableRetryCount(this.f58175D))), 1, -1, null, 0, null, jVar.mUb, this.f58174B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        long jMax = Long.MIN_VALUE;
        for (SampleQueue sampleQueue : this.P5) {
            jMax = Math.max(jMax, sampleQueue.getLargestQueuedTimestampUs());
        }
        return jMax;
    }

    public static /* synthetic */ void rl(C1886c c1886c) {
        if (c1886c.ijL) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(c1886c.jB)).onContinueLoadingRequested(c1886c);
    }

    private boolean s7N() {
        return this.f58179I || Z();
    }

    private boolean ty(j jVar, int i2) {
        SeekMap seekMap;
        if (this.Nxk != -1 || ((seekMap = this.f58177FX) != null && seekMap.getDurationUs() != -9223372036854775807L)) {
            this.f58199z = i2;
            return true;
        }
        if (this.eF && !s7N()) {
            this.dR0 = true;
            return false;
        }
        this.f58179I = this.eF;
        this.f58188Y = 0L;
        this.f58199z = 0;
        for (SampleQueue sampleQueue : this.P5) {
            sampleQueue.reset();
        }
        jVar.KN(0L, 0L);
        return true;
    }

    void ViF() throws IOException {
        this.f58191e.maybeThrowError(this.J2.getMinimumLoadableRetryCount(this.f58175D));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j2) {
        if (this.piY || this.f58191e.hasFatalError() || this.dR0) {
            return false;
        }
        if (this.eF && this.f58178GR == 0) {
            return false;
        }
        boolean zOpen = this.f58185T.open();
        if (this.f58191e.isLoading()) {
            return zOpen;
        }
        nHg();
        return true;
    }

    public void e() {
        if (this.eF) {
            for (SampleQueue sampleQueue : this.P5) {
                sampleQueue.preRelease();
            }
        }
        this.f58191e.release(this);
        this.Xw.removeCallbacksAndMessages(null);
        this.jB = null;
        this.ijL = true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (this.f58178GR == 0) {
            return Long.MIN_VALUE;
        }
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: iF, reason: merged with bridge method [inline-methods] */
    public Loader.LoadErrorAction onLoadError(j jVar, long j2, long j3, IOException iOException, int i2) {
        j jVar2;
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        HI(jVar);
        StatsDataSource statsDataSource = jVar.f58205t;
        LoadEventInfo loadEventInfo = new LoadEventInfo(jVar.f58204n, jVar.gh, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j2, j3, statsDataSource.getBytesRead());
        long retryDelayMsFor = this.J2.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(1, -1, null, 0, null, Util.usToMs(jVar.mUb), Util.usToMs(this.f58174B)), iOException, i2));
        if (retryDelayMsFor == -9223372036854775807L) {
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY_FATAL;
            jVar2 = jVar;
        } else {
            int iIk = Ik();
            jVar2 = jVar;
            loadErrorActionCreateRetryAction = ty(jVar2, iIk) ? Loader.createRetryAction(iIk > this.f58199z, retryDelayMsFor) : Loader.DONT_RETRY;
        }
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.f58196r.loadError(loadEventInfo, 1, -1, null, 0, null, jVar2.mUb, this.f58174B, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.J2.onLoadTaskConcluded(jVar2.f58204n);
        }
        return loadErrorActionCreateRetryAction;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.f58191e.isLoading() && this.f58185T.isOpen();
    }

    void nY(int i2) throws IOException {
        this.P5[i2].maybeThrowError();
        ViF();
    }

    TrackOutput o() {
        return fD(new Ml(0, true));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.P5) {
            sampleQueue.release();
        }
        this.f58187X.release();
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.Xw.post(this.f58182N);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j2) {
        this.jB = callback;
        this.f58185T.open();
        nHg();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.f58179I) {
            return -9223372036854775807L;
        }
        if (!this.piY && Ik() <= this.f58199z) {
            return -9223372036854775807L;
        }
        this.f58179I = false;
        return this.f58188Y;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        this.Xw.post(new Runnable() { // from class: com.google.android.exoplayer2.source.l3D
            @Override // java.lang.Runnable
            public final void run() {
                this.f58229n.T(seekMap);
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: te, reason: merged with bridge method [inline-methods] */
    public void onLoadCompleted(j jVar, long j2, long j3) {
        SeekMap seekMap;
        if (this.f58174B == -9223372036854775807L && (seekMap = this.f58177FX) != null) {
            boolean zIsSeekable = seekMap.isSeekable();
            long jR = r();
            long j4 = jR == Long.MIN_VALUE ? 0L : jR + 10000;
            this.f58174B = j4;
            this.f58189Z.onSourceInfoRefreshed(j4, zIsSeekable, this.f58180J);
        }
        StatsDataSource statsDataSource = jVar.f58205t;
        LoadEventInfo loadEventInfo = new LoadEventInfo(jVar.f58204n, jVar.gh, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j2, j3, statsDataSource.getBytesRead());
        this.J2.onLoadTaskConcluded(jVar.f58204n);
        this.f58196r.loadCompleted(loadEventInfo, 1, -1, null, 0, null, jVar.mUb, this.f58174B);
        HI(jVar);
        this.piY = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.jB)).onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int i2, int i3) {
        return fD(new Ml(i2, false));
    }

    public C1886c(Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, n nVar, Allocator allocator, String str, int i2) {
        this.f58194n = uri;
        this.f58197t = dataSource;
        this.f58183O = drmSessionManager;
        this.f58195o = eventDispatcher;
        this.J2 = loadErrorHandlingPolicy;
        this.f58196r = eventDispatcher2;
        this.f58189Z = nVar;
        this.f58184S = allocator;
        this.f58192g = str;
        this.E2 = i2;
        this.f58187X = progressiveMediaExtractor;
    }

    private void WPU(int i2) {
        az();
        I28 i28 = this.f58181M;
        boolean[] zArr = i28.nr;
        if (!zArr[i2]) {
            Format format = i28.f58200n.get(i2).getFormat(0);
            this.f58196r.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.f58188Y);
            zArr[i2] = true;
        }
    }

    private void aYN(int i2) {
        az();
        boolean[] zArr = this.f58181M.rl;
        if (this.dR0 && zArr[i2]) {
            if (!this.P5[i2].isReady(false)) {
                this.f58193k = 0L;
                this.dR0 = false;
                this.f58179I = true;
                this.f58188Y = 0L;
                this.f58199z = 0;
                for (SampleQueue sampleQueue : this.P5) {
                    sampleQueue.reset();
                }
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.jB)).onContinueLoadingRequested(this);
            }
        }
    }

    int E2(int i2, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i3) {
        if (s7N()) {
            return -3;
        }
        WPU(i2);
        int i5 = this.P5[i2].read(formatHolder, decoderInputBuffer, i3, this.piY);
        if (i5 == -3) {
            aYN(i2);
        }
        return i5;
    }

    int N(int i2, long j2) throws Throwable {
        if (s7N()) {
            return 0;
        }
        WPU(i2);
        SampleQueue sampleQueue = this.P5[i2];
        int skipCount = sampleQueue.getSkipCount(j2, this.piY);
        sampleQueue.skip(skipCount);
        if (skipCount == 0) {
            aYN(i2);
        }
        return skipCount;
    }

    boolean XQ(int i2) {
        if (!s7N() && this.P5[i2].isReady(this.piY)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j2, boolean z2) {
        az();
        if (!Z()) {
            boolean[] zArr = this.f58181M.f58201t;
            int length = this.P5.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.P5[i2].discardTo(j2, z2, zArr[i2]);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onLoadCanceled(j jVar, long j2, long j3, boolean z2) {
        StatsDataSource statsDataSource = jVar.f58205t;
        LoadEventInfo loadEventInfo = new LoadEventInfo(jVar.f58204n, jVar.gh, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), j2, j3, statsDataSource.getBytesRead());
        this.J2.onLoadTaskConcluded(jVar.f58204n);
        this.f58196r.loadCanceled(loadEventInfo, 1, -1, null, 0, null, jVar.mUb, this.f58174B);
        if (!z2) {
            HI(jVar);
            for (SampleQueue sampleQueue : this.P5) {
                sampleQueue.reset();
            }
            if (this.f58178GR > 0) {
                ((MediaPeriod.Callback) Assertions.checkNotNull(this.jB)).onContinueLoadingRequested(this);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j2, SeekParameters seekParameters) {
        az();
        if (!this.f58177FX.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = this.f58177FX.getSeekPoints(j2);
        return seekParameters.resolveSeekPositionUs(j2, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long jR;
        az();
        boolean[] zArr = this.f58181M.rl;
        if (this.piY) {
            return Long.MIN_VALUE;
        }
        if (Z()) {
            return this.f58193k;
        }
        if (this.f58176E) {
            int length = this.P5.length;
            jR = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.P5[i2].isLastSampleQueued()) {
                    jR = Math.min(jR, this.P5[i2].getLargestQueuedTimestampUs());
                }
            }
        } else {
            jR = Long.MAX_VALUE;
        }
        if (jR == Long.MAX_VALUE) {
            jR = r();
        }
        if (jR == Long.MIN_VALUE) {
            return this.f58188Y;
        }
        return jR;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        az();
        return this.f58181M.f58200n;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        ViF();
        if (this.piY && !this.eF) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j2) {
        az();
        boolean[] zArr = this.f58181M.rl;
        if (!this.f58177FX.isSeekable()) {
            j2 = 0;
        }
        int i2 = 0;
        this.f58179I = false;
        this.f58188Y = j2;
        if (Z()) {
            this.f58193k = j2;
            return j2;
        }
        if (this.f58175D == 7 || !X(zArr, j2)) {
            this.dR0 = false;
            this.f58193k = j2;
            this.piY = false;
            if (this.f58191e.isLoading()) {
                SampleQueue[] sampleQueueArr = this.P5;
                int length = sampleQueueArr.length;
                while (i2 < length) {
                    sampleQueueArr[i2].discardToEnd();
                    i2++;
                }
                this.f58191e.cancelLoading();
                return j2;
            }
            this.f58191e.clearFatalError();
            SampleQueue[] sampleQueueArr2 = this.P5;
            int length2 = sampleQueueArr2.length;
            while (i2 < length2) {
                sampleQueueArr2[i2].reset();
                i2++;
            }
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        boolean z2;
        ExoTrackSelection exoTrackSelection;
        boolean z3;
        boolean z4;
        az();
        I28 i28 = this.f58181M;
        TrackGroupArray trackGroupArray = i28.f58200n;
        boolean[] zArr3 = i28.f58201t;
        int i2 = this.f58178GR;
        int i3 = 0;
        for (int i5 = 0; i5 < exoTrackSelectionArr.length; i5++) {
            SampleStream sampleStream = sampleStreamArr[i5];
            if (sampleStream != null && (exoTrackSelectionArr[i5] == null || !zArr[i5])) {
                int i7 = ((w6) sampleStream).f58206n;
                Assertions.checkState(zArr3[i7]);
                this.f58178GR--;
                zArr3[i7] = false;
                sampleStreamArr[i5] = null;
            }
        }
        if (!this.f58190a ? j2 != 0 : i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i8 = 0; i8 < exoTrackSelectionArr.length; i8++) {
            if (sampleStreamArr[i8] == null && (exoTrackSelection = exoTrackSelectionArr[i8]) != null) {
                if (exoTrackSelection.length() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Assertions.checkState(z3);
                if (exoTrackSelection.getIndexInTrackGroup(0) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Assertions.checkState(z4);
                int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
                Assertions.checkState(!zArr3[iIndexOf]);
                this.f58178GR++;
                zArr3[iIndexOf] = true;
                sampleStreamArr[i8] = new w6(iIndexOf);
                zArr2[i8] = true;
                if (!z2) {
                    SampleQueue sampleQueue = this.P5[iIndexOf];
                    if (!sampleQueue.seekTo(j2, true) && sampleQueue.getReadIndex() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        if (this.f58178GR == 0) {
            this.dR0 = false;
            this.f58179I = false;
            if (this.f58191e.isLoading()) {
                SampleQueue[] sampleQueueArr = this.P5;
                int length = sampleQueueArr.length;
                while (i3 < length) {
                    sampleQueueArr[i3].discardToEnd();
                    i3++;
                }
                this.f58191e.cancelLoading();
            } else {
                SampleQueue[] sampleQueueArr2 = this.P5;
                int length2 = sampleQueueArr2.length;
                while (i3 < length2) {
                    sampleQueueArr2[i3].reset();
                    i3++;
                }
            }
        } else if (z2) {
            j2 = seekToUs(j2);
            while (i3 < sampleStreamArr.length) {
                if (sampleStreamArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.f58190a = true;
        return j2;
    }
}
