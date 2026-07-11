package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f56174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f56175b;

    public final FileInputStream a() {
        if (this.f56175b.exists()) {
            this.f56174a.delete();
            this.f56175b.renameTo(this.f56174a);
        }
        return new FileInputStream(this.f56174a);
    }

    public final b b() throws IOException {
        if (this.f56174a.exists()) {
            if (this.f56175b.exists()) {
                this.f56174a.delete();
            } else if (!this.f56174a.renameTo(this.f56175b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f56174a + " to backup file " + this.f56175b);
            }
        }
        try {
            return new b(this.f56174a);
        } catch (FileNotFoundException unused) {
            if (!this.f56174a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f56174a);
            }
            try {
                return new b(this.f56174a);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.f56174a);
            }
        }
    }

    public c(File file) {
        this.f56174a = file;
        this.f56175b = new File(file.getPath() + ".bak");
    }
}
