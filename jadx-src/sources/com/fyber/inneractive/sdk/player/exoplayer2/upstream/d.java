package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f56080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f56081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f56082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f56083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f56084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f56085f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws c {
        try {
            Uri uri = kVar.f56108a;
            this.f56082c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.f56080a.open(path, 1);
            this.f56083d = inputStreamOpen;
            if (inputStreamOpen.skip(kVar.f56110c) < kVar.f56110c) {
                throw new EOFException();
            }
            long j2 = kVar.f56111d;
            if (j2 != -1) {
                this.f56084e = j2;
            } else {
                long jAvailable = this.f56083d.available();
                this.f56084e = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f56084e = -1L;
                }
            }
            this.f56085f = true;
            m mVar = this.f56081b;
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
            return this.f56084e;
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f56082c = null;
        try {
            try {
                InputStream inputStream = this.f56083d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new c(e2);
            }
        } finally {
            this.f56083d = null;
            if (this.f56085f) {
                this.f56085f = false;
                m mVar = this.f56081b;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i2, int i3) throws c {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f56084e;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new c(e2);
            }
        }
        int i5 = this.f56083d.read(bArr, i2, i3);
        if (i5 == -1) {
            if (this.f56084e == -1) {
                return -1;
            }
            throw new c(new EOFException());
        }
        long j3 = this.f56084e;
        if (j3 != -1) {
            this.f56084e = j3 - ((long) i5);
        }
        m mVar = this.f56081b;
        if (mVar == null) {
            return i5;
        }
        synchronized (mVar) {
            mVar.f56122d += (long) i5;
        }
        return i5;
    }

    public d(Context context, m mVar) {
        this.f56080a = context.getAssets();
        this.f56081b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f56082c;
    }
}
