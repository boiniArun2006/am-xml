package Ec7;

import FjR.C;
import java.io.File;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f2325n;

    @Override // Ec7.n
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public String n(File file, C c2) {
        if (!this.f2325n) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }

    public j(boolean z2) {
        this.f2325n = z2;
    }
}
