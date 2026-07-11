package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f56172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56173b = false;

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        this.f56172a.write(i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f56173b) {
            return;
        }
        this.f56173b = true;
        this.f56172a.flush();
        try {
            this.f56172a.getFD().sync();
        } catch (IOException e2) {
            Log.w("AtomicFile", "Failed to sync file descriptor:", e2);
        }
        this.f56172a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f56172a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f56172a.write(bArr);
    }

    public b(File file) {
        this.f56172a = DTExchangeFilesBridge.fileOutputStreamCtor(file);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        this.f56172a.write(bArr, i2, i3);
    }
}
