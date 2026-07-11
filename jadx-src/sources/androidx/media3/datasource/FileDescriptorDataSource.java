package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.O;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public class FileDescriptorDataSource extends BaseDataSource {
    private static final Set<FileDescriptor> inUseFileDescriptors = O.J2();
    private long bytesRemaining;
    private final FileDescriptor fileDescriptor;

    @Nullable
    private FileInputStream inputStream;
    private final long length;
    private final long offset;
    private boolean opened;

    @Nullable
    private Uri uri;

    public FileDescriptorDataSource(FileDescriptor fileDescriptor, long j2, long j3) {
        super(false);
        this.fileDescriptor = (FileDescriptor) Assertions.checkNotNull(fileDescriptor);
        this.offset = j2;
        this.length = j3;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws DataSourceException {
        this.uri = null;
        inUseFileDescriptors.remove(this.fileDescriptor);
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e2) {
                throw new DataSourceException(e2, 2000);
            }
        } finally {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    private static void seekFileDescriptor(FileDescriptor fileDescriptor, long j2) throws DataSourceException {
        try {
            Os.lseek(fileDescriptor, j2, OsConstants.SEEK_SET);
        } catch (ErrnoException e2) {
            throw new DataSourceException(e2, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws DataSourceException {
        try {
            this.uri = dataSpec.uri;
            transferInitializing(dataSpec);
            if (!inUseFileDescriptors.add(this.fileDescriptor)) {
                throw new DataSourceException(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            long j2 = this.length;
            if (j2 != -1 && dataSpec.position > j2) {
                throw new DataSourceException(2008);
            }
            seekFileDescriptor(this.fileDescriptor, this.offset + dataSpec.position);
            FileInputStream fileInputStream = new FileInputStream(this.fileDescriptor);
            this.inputStream = fileInputStream;
            long j3 = this.length;
            if (j3 == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.bytesRemaining = jPosition;
                    if (jPosition < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            } else {
                long j4 = j3 - dataSpec.position;
                this.bytesRemaining = j4;
                if (j4 < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long jMin = dataSpec.length;
            if (jMin != -1) {
                long j5 = this.bytesRemaining;
                if (j5 != -1) {
                    jMin = Math.min(j5, jMin);
                }
                this.bytesRemaining = jMin;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j6 = dataSpec.length;
            return j6 != -1 ? j6 : this.bytesRemaining;
        } catch (DataSourceException e2) {
            throw e2;
        } catch (IOException e3) {
            throw new DataSourceException(e3, e3 instanceof FileNotFoundException ? 2005 : 2000);
        }
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
            int i5 = ((FileInputStream) Util.castNonNull(this.inputStream)).read(bArr, i2, i3);
            if (i5 == -1) {
                return -1;
            }
            long j3 = this.bytesRemaining;
            if (j3 != -1) {
                this.bytesRemaining = j3 - ((long) i5);
            }
            bytesTransferred(i5);
            return i5;
        } catch (IOException e2) {
            throw new DataSourceException(e2, 2000);
        }
    }
}
