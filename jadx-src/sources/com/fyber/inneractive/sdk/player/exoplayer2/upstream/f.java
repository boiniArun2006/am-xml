package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f56094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f56095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f56096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AssetFileDescriptor f56097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FileInputStream f56098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f56099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56100g;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws e {
        try {
            Uri uri = kVar.f56108a;
            this.f56096c = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f56094a.openAssetFileDescriptor(uri, "r");
            this.f56097d = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f56096c);
            }
            this.f56098e = new FileInputStream(this.f56097d.getFileDescriptor());
            long startOffset = this.f56097d.getStartOffset();
            if (this.f56098e.skip(kVar.f56110c + startOffset) - startOffset != kVar.f56110c) {
                throw new EOFException();
            }
            long j2 = kVar.f56111d;
            if (j2 != -1) {
                this.f56099f = j2;
            } else {
                long length = this.f56097d.getLength();
                this.f56099f = length;
                if (length == -1) {
                    long jAvailable = this.f56098e.available();
                    this.f56099f = jAvailable;
                    if (jAvailable == 0) {
                        this.f56099f = -1L;
                    }
                }
            }
            this.f56100g = true;
            m mVar = this.f56095b;
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
            return this.f56099f;
        } catch (IOException e2) {
            throw new e(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.f56096c = null;
        try {
            try {
                FileInputStream fileInputStream = this.f56098e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f56098e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f56097d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new e(e2);
                    }
                } finally {
                    this.f56097d = null;
                    if (this.f56100g) {
                        this.f56100g = false;
                        m mVar = this.f56095b;
                        if (mVar != null) {
                            mVar.a();
                        }
                    }
                }
            } catch (IOException e3) {
                throw new e(e3);
            }
        } catch (Throwable th) {
            this.f56098e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f56097d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f56097d = null;
                    if (this.f56100g) {
                        this.f56100g = false;
                        m mVar2 = this.f56095b;
                        if (mVar2 != null) {
                            mVar2.a();
                        }
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new e(e4);
                }
            } finally {
                this.f56097d = null;
                if (this.f56100g) {
                    this.f56100g = false;
                    m mVar3 = this.f56095b;
                    if (mVar3 != null) {
                        mVar3.a();
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i2, int i3) throws e {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f56099f;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e2) {
                throw new e(e2);
            }
        }
        int i5 = this.f56098e.read(bArr, i2, i3);
        if (i5 == -1) {
            if (this.f56099f == -1) {
                return -1;
            }
            throw new e(new EOFException());
        }
        long j3 = this.f56099f;
        if (j3 != -1) {
            this.f56099f = j3 - ((long) i5);
        }
        m mVar = this.f56095b;
        if (mVar == null) {
            return i5;
        }
        synchronized (mVar) {
            mVar.f56122d += (long) i5;
        }
        return i5;
    }

    public f(Context context, m mVar) {
        this.f56094a = context.getContentResolver();
        this.f56095b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f56096c;
    }
}
