package androidx.security.crypto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class EncryptedFile {

    public static final class Builder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Object f41924n = new Object();
    }

    private static final class EncryptedFileInputStream extends FileInputStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final InputStream f41925n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Object f41926t;

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read() {
            return this.f41925n.read();
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int available() {
            return this.f41925n.available();
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f41925n.close();
        }

        @Override // java.io.FileInputStream
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            synchronized (this.f41926t) {
                this.f41925n.mark(i2);
            }
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f41925n.markSupported();
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] bArr) {
            return this.f41925n.read(bArr);
        }

        @Override // java.io.InputStream
        public void reset() {
            synchronized (this.f41926t) {
                this.f41925n.reset();
            }
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public long skip(long j2) {
            return this.f41925n.skip(j2);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            return this.f41925n.read(bArr, i2, i3);
        }
    }

    private static final class EncryptedFileOutputStream extends FileOutputStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final OutputStream f41927n;

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f41927n.write(bArr);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f41927n.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f41927n.flush();
        }

        @Override // java.io.FileOutputStream
        public FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(int i2) throws IOException {
            this.f41927n.write(i2);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            this.f41927n.write(bArr, i2, i3);
        }
    }

    public enum FileEncryptionScheme {
        AES256_GCM_HKDF_4KB("AES256_GCM_HKDF_4KB");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f41930n;

        FileEncryptionScheme(String str) {
            this.f41930n = str;
        }
    }
}
