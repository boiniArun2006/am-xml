package com.google.firebase.crashlytics.ndk;

import com.google.firebase.crashlytics.ndk.Wre;
import java.io.File;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class CN3 implements h1M.fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre f60281n;

    @Override // h1M.fuX
    public File J2() {
        return this.f60281n.Uo;
    }

    @Override // h1M.fuX
    public File O() {
        return this.f60281n.f60284O;
    }

    @Override // h1M.fuX
    public File Uo() {
        return this.f60281n.nr;
    }

    @Override // h1M.fuX
    public File n() {
        return this.f60281n.J2;
    }

    @Override // h1M.fuX
    public File nr() {
        return this.f60281n.f60286t;
    }

    @Override // h1M.fuX
    public DAz.j rl() {
        Wre.w6 w6Var = this.f60281n.f60285n;
        if (w6Var != null) {
            return w6Var.rl;
        }
        return null;
    }

    @Override // h1M.fuX
    public File t() {
        return this.f60281n.f60285n.f60290n;
    }

    CN3(Wre wre) {
        this.f60281n = wre;
    }
}
