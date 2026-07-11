package com.google.firebase.crashlytics.ndk;

import java.io.File;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class Wre {
    public final File J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final File f60284O;
    public final File Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w6 f60285n;
    public final File nr;
    public final File rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final File f60286t;

    static final class n {
        private File J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private File f60287O;
        private File Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private w6 f60288n;
        private File nr;
        private File rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private File f60289t;

        n KN(File file) {
            this.f60287O = file;
            return this;
        }

        n az(File file) {
            this.Uo = file;
            return this;
        }

        n gh(File file) {
            this.f60289t = file;
            return this;
        }

        n mUb(File file) {
            this.J2 = file;
            return this;
        }

        n qie(w6 w6Var) {
            this.f60288n = w6Var;
            return this;
        }

        n ty(File file) {
            this.nr = file;
            return this;
        }

        Wre xMQ() {
            return new Wre(this);
        }

        n() {
        }
    }

    static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final File f60290n;
        public final DAz.j rl;

        boolean n() {
            File file = this.f60290n;
            return (file != null && file.exists()) || this.rl != null;
        }

        w6(File file, DAz.j jVar) {
            this.f60290n = file;
            this.rl = jVar;
        }
    }

    private Wre(n nVar) {
        this.f60285n = nVar.f60288n;
        this.rl = nVar.rl;
        this.f60286t = nVar.f60289t;
        this.nr = nVar.nr;
        this.f60284O = nVar.f60287O;
        this.J2 = nVar.J2;
        this.Uo = nVar.Uo;
    }
}
