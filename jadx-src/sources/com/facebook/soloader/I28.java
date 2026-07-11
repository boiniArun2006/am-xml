package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class I28 extends ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final File f53018n;
    protected final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final List f53019t;

    public I28(File file, int i2) {
        this(file, i2, new String[0]);
    }

    public I28(File file, int i2, String[] strArr) {
        this.f53018n = file;
        this.rl = i2;
        this.f53019t = Arrays.asList(strArr);
    }

    protected File J2(String str) {
        File file = new File(this.f53018n, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    protected int Uo(String str, int i2, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        if (SoLoader.rl == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        if (this.f53019t.contains(str)) {
            qz.n("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
            return 0;
        }
        File fileJ2 = J2(str);
        if (fileJ2 == null) {
            qz.J2("SoLoader", str + " file not found on " + file.getCanonicalPath());
            return 0;
        }
        String canonicalPath = fileJ2.getCanonicalPath();
        qz.n("SoLoader", str + " file found at " + canonicalPath);
        if ((i2 & 1) != 0 && (this.rl & 2) != 0) {
            qz.n("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((this.rl & 1) != 0) {
            fuX fux = new fuX(fileJ2);
            try {
                eO.KN(str, fux, i2, threadPolicy);
                fux.close();
            } catch (Throwable th) {
                try {
                    fux.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            qz.n("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.rl.n(canonicalPath, i2);
            return 1;
        } catch (UnsatisfiedLinkError e2) {
            throw SPz.rl(str, e2);
        }
    }

    @Override // com.facebook.soloader.ci
    public int nr(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        return Uo(str, i2, this.f53018n, threadPolicy);
    }

    @Override // com.facebook.soloader.ci
    public String t() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.ci
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f53018n.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f53018n.getName();
        }
        return t() + "[root = " + name + " flags = " + this.rl + ']';
    }
}
