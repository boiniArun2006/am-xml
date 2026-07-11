package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class IcyDataSource implements DataSource {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f58094O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DataSource f58095n;
    private final byte[] nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Listener f58096t;

    public interface Listener {
        void onIcyMetadata(ParsableByteArray parsableByteArray);
    }

    private boolean rl() throws IOException {
        if (this.f58095n.read(this.nr, 0, 1) == -1) {
            return false;
        }
        int i2 = (this.nr[0] & 255) << 4;
        if (i2 == 0) {
            return true;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2;
        int i5 = 0;
        while (i3 > 0) {
            int i7 = this.f58095n.read(bArr, i5, i3);
            if (i7 == -1) {
                return false;
            }
            i5 += i7;
            i3 -= i7;
        }
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        if (i2 > 0) {
            this.f58096t.onIcyMetadata(new ParsableByteArray(bArr, i2));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map getResponseHeaders() {
        return this.f58095n.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.f58095n.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f58094O == 0) {
            if (!rl()) {
                return -1;
            }
            this.f58094O = this.rl;
        }
        int i5 = this.f58095n.read(bArr, i2, Math.min(this.f58094O, i3));
        if (i5 != -1) {
            this.f58094O -= i5;
        }
        return i5;
    }

    public IcyDataSource(DataSource dataSource, int i2, Listener listener) {
        boolean z2;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        this.f58095n = dataSource;
        this.rl = i2;
        this.f58096t = listener;
        this.nr = new byte[1];
        this.f58094O = i2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.f58095n.addTransferListener(transferListener);
    }
}
