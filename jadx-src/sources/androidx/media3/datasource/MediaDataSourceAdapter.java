package androidx.media3.datasource;

import android.media.MediaDataSource;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@UnstableApi
public class MediaDataSourceAdapter extends BaseDataSource {
    private long bytesRemaining;
    private final MediaDataSource mediaDataSource;
    private boolean opened;
    private long position;

    @Nullable
    private Uri uri;

    @Override // androidx.media3.datasource.DataSource
    public void close() throws IOException {
        this.uri = null;
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        this.uri = dataSpec.uri;
        this.position = dataSpec.position;
        transferInitializing(dataSpec);
        if (this.mediaDataSource.getSize() != -1 && this.position > this.mediaDataSource.getSize()) {
            throw new DataSourceException(2008);
        }
        if (this.mediaDataSource.getSize() == -1) {
            this.bytesRemaining = -1L;
        } else {
            this.bytesRemaining = this.mediaDataSource.getSize() - this.position;
        }
        long jMin = dataSpec.length;
        if (jMin != -1) {
            long j2 = this.bytesRemaining;
            if (j2 != -1) {
                jMin = Math.min(j2, jMin);
            }
            this.bytesRemaining = jMin;
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j3 = dataSpec.length;
        return j3 != -1 ? j3 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i2, int i3) throws DataSourceException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.bytesRemaining;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            i3 = (int) Math.min(j2, i3);
        }
        try {
            int at = this.mediaDataSource.readAt(this.position, bArr, i2, i3);
            if (at == -1) {
                return -1;
            }
            long j3 = at;
            this.position += j3;
            long j4 = this.bytesRemaining;
            if (j4 != -1) {
                this.bytesRemaining = j4 - j3;
            }
            bytesTransferred(at);
            return at;
        } catch (IOException e2) {
            throw new DataSourceException(e2, 2000);
        }
    }

    public MediaDataSourceAdapter(MediaDataSource mediaDataSource, boolean z2) {
        super(z2);
        this.mediaDataSource = mediaDataSource;
    }
}
