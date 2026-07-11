package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Dsr implements CN3 {
    private final long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ZipFile f53013O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InputStream f53014n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ZipEntry f53017t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f53016r = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f53015o = 0;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f53014n;
        if (inputStream != null) {
            inputStream.close();
            this.f53016r = false;
        }
    }

    @Override // com.facebook.soloader.CN3
    public int fD(ByteBuffer byteBuffer, long j2) throws IOException {
        if (this.f53014n == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j3 = this.J2 - j2;
        if (j3 <= 0) {
            return -1;
        }
        int i2 = (int) j3;
        if (iRemaining > i2) {
            iRemaining = i2;
        }
        n(j2);
        if (byteBuffer.hasArray()) {
            this.f53014n.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f53014n.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f53015o += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f53016r;
    }

    public CN3 n(long j2) throws IOException {
        InputStream inputStream = this.f53014n;
        if (inputStream == null) {
            throw new IOException(this.f53017t.getName() + "'s InputStream is null");
        }
        long j3 = this.f53015o;
        if (j2 == j3) {
            return this;
        }
        long j4 = this.J2;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j2 >= j3) {
            inputStream.skip(j2 - j3);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.f53013O.getInputStream(this.f53017t);
            this.f53014n = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.f53017t.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j2);
        }
        this.f53015o = j2;
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return fD(byteBuffer, this.f53015o);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }

    public Dsr(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f53013O = zipFile;
        this.f53017t = zipEntry;
        this.J2 = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f53014n = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }
}
