package androidx.media3.exoplayer.dash.offline;

import androidx.annotation.Nullable;
import androidx.credentials.j;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.dash.BaseUrlExclusionList;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.DashUtil;
import androidx.media3.exoplayer.dash.DashWrappingSegmentIndex;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.offline.DownloadException;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.ChunkIndex;
import com.google.common.collect.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    private final BaseUrlExclusionList baseUrlExclusionList;

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new j());
    }

    private SegmentDownloader.Segment createSegment(Representation representation, String str, long j2, RangedUri rangedUri) {
        return new SegmentDownloader.Segment(j2, DashUtil.buildDataSpec(representation, str, rangedUri, 0, u.ty()));
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new DashManifestParser(), factory, executor, 20000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long j2, long j3, boolean z2, ArrayList<SegmentDownloader.Segment> arrayList) throws InterruptedException, IOException {
        DashSegmentIndex segmentIndex;
        DashDownloader dashDownloader = this;
        int i2 = 0;
        while (i2 < adaptationSet.representations.size()) {
            Representation representation = adaptationSet.representations.get(i2);
            try {
            } catch (IOException e2) {
                e = e2;
            }
            try {
                segmentIndex = dashDownloader.getSegmentIndex(dataSource, adaptationSet.type, representation, z2);
            } catch (IOException e3) {
                e = e3;
                if (z2) {
                    throw e;
                }
                i2++;
                dashDownloader = this;
            }
            if (segmentIndex != null) {
                long segmentCount = segmentIndex.getSegmentCount(j3);
                if (segmentCount == -1) {
                    throw new DownloadException("Unbounded segment index");
                }
                String str = ((BaseUrl) Util.castNonNull(dashDownloader.baseUrlExclusionList.selectBaseUrl(representation.baseUrls))).url;
                RangedUri initializationUri = representation.getInitializationUri();
                if (initializationUri != null) {
                    arrayList.add(dashDownloader.createSegment(representation, str, j2, initializationUri));
                }
                RangedUri indexUri = representation.getIndexUri();
                if (indexUri != null) {
                    arrayList.add(createSegment(representation, str, j2, indexUri));
                }
                long firstSegmentNum = segmentIndex.getFirstSegmentNum();
                long j4 = (segmentCount + firstSegmentNum) - 1;
                while (firstSegmentNum <= j4) {
                    arrayList.add(createSegment(representation, str, j2 + segmentIndex.getTimeUs(firstSegmentNum), segmentIndex.getSegmentUrl(firstSegmentNum)));
                    firstSegmentNum++;
                }
                i2++;
                dashDownloader = this;
            } else {
                try {
                    throw new DownloadException("Missing segment index");
                } catch (IOException e4) {
                    e = e4;
                    if (z2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z2) throws InterruptedException, IOException {
        ArrayList<SegmentDownloader.Segment> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < dashManifest.getPeriodCount(); i2++) {
            Period period = dashManifest.getPeriod(i2);
            long jMsToUs = Util.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i2);
            List<AdaptationSet> list = period.adaptationSets;
            for (int i3 = 0; i3 < list.size(); i3++) {
                addSegmentsForAdaptationSet(dataSource, list.get(i3), jMsToUs, periodDurationUs, z2, arrayList);
            }
        }
        return arrayList;
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    @Nullable
    private DashSegmentIndex getSegmentIndex(final DataSource dataSource, final int i2, final Representation representation, boolean z2) throws InterruptedException, IOException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndex = (ChunkIndex) execute(new RunnableFutureTask<ChunkIndex, IOException>() { // from class: androidx.media3.exoplayer.dash.offline.DashDownloader.1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.media3.common.util.RunnableFutureTask
            public ChunkIndex doWork() throws IOException {
                return DashUtil.loadChunkIndex(dataSource, i2, representation);
            }
        }, z2);
        if (chunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndex, representation.presentationTimeOffsetUs);
    }

    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor, long j2) {
        super(mediaItem, parser, factory, executor, j2);
        this.baseUrlExclusionList = new BaseUrlExclusionList();
    }
}
