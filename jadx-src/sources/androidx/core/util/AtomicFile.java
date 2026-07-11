package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class AtomicFile {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f36671n;
    private final File rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final File f36672t;

    public void n(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!O(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("AtomicFile", "Failed to close file output stream", e2);
        }
        if (this.rl.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + this.rl);
    }

    public FileOutputStream nr() throws IOException {
        if (this.f36672t.exists()) {
            t(this.f36672t, this.f36671n);
        }
        try {
            return new FileOutputStream(this.rl);
        } catch (FileNotFoundException unused) {
            if (!this.rl.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.rl);
            }
            try {
                return new FileOutputStream(this.rl);
            } catch (FileNotFoundException e2) {
                throw new IOException("Failed to create new file " + this.rl, e2);
            }
        }
    }

    public void rl(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!O(fileOutputStream)) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("AtomicFile", "Failed to close file output stream", e2);
        }
        t(this.rl, this.f36671n);
    }

    public AtomicFile(File file) {
        this.f36671n = file;
        this.rl = new File(file.getPath() + ".new");
        this.f36672t = new File(file.getPath() + ".bak");
    }

    private static boolean O(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private static void t(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }
}
