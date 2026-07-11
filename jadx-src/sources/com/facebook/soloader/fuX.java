package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class fuX implements CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private FileChannel f53042O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f53043n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FileInputStream f53044t;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f53044t.close();
    }

    @Override // com.facebook.soloader.CN3
    public int fD(ByteBuffer byteBuffer, long j2) {
        return this.f53042O.read(byteBuffer, j2);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f53042O.isOpen();
    }

    public void n() {
        FileInputStream fileInputStream = new FileInputStream(this.f53043n);
        this.f53044t = fileInputStream;
        this.f53042O = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f53042O.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f53042O.write(byteBuffer);
    }

    public fuX(File file) {
        this.f53043n = file;
        n();
    }
}
