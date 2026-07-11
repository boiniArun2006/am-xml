package com.facebook.datasource;

import Hh.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml {

    class j implements qz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Throwable f52367n;

        j(Throwable th) {
            this.f52367n = th;
        }

        @Override // Hh.qz
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public w6 get() {
            return Ml.rl(this.f52367n);
        }
    }

    public static qz n(Throwable th) {
        return new j(th);
    }

    public static w6 rl(Throwable th) {
        Dsr dsrWPU = Dsr.WPU();
        dsrWPU.HI(th);
        return dsrWPU;
    }
}
