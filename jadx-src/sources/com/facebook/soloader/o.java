package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o implements Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FileOutputStream f53046n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FileLock f53047t;

    public static o n(File file) {
        return new o(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.f53047t;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f53046n.close();
        }
    }

    private o(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f53046n = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.f53047t = fileLockLock;
        } catch (Throwable th) {
            this.f53046n.close();
            throw th;
        }
    }
}
