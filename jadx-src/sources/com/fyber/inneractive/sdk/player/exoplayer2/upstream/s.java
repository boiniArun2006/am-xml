package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f56155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RandomAccessFile f56156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f56157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f56158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56159e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws r {
        try {
            this.f56157c = kVar.f56108a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.f56108a.getPath(), "r");
            this.f56156b = randomAccessFile;
            randomAccessFile.seek(kVar.f56110c);
            long length = kVar.f56111d;
            if (length == -1) {
                length = this.f56156b.length() - kVar.f56110c;
            }
            this.f56158d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f56159e = true;
            m mVar = this.f56155a;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (mVar.f56120b == 0) {
                            mVar.f56121c = SystemClock.elapsedRealtime();
                        }
                        mVar.f56120b++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f56158d;
        } catch (IOException e2) {
            throw new r(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f56157c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f56156b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                throw new r(e2);
            }
        } finally {
            this.f56156b = null;
            if (this.f56159e) {
                this.f56159e = false;
                m mVar = this.f56155a;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i2, int i3) throws r {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f56158d;
        if (j2 == 0) {
            return -1;
        }
        try {
            int i5 = this.f56156b.read(bArr, i2, (int) Math.min(j2, i3));
            if (i5 > 0) {
                long j3 = i5;
                this.f56158d -= j3;
                m mVar = this.f56155a;
                if (mVar != null) {
                    synchronized (mVar) {
                        mVar.f56122d += j3;
                    }
                    return i5;
                }
            }
            return i5;
        } catch (IOException e2) {
            throw new r(e2);
        }
    }

    public s(m mVar) {
        this.f56155a = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f56157c;
    }
}
