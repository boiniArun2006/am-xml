package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface P {

    public interface j {
        void n();

        void onFailure(Throwable th);

        void rl(InputStream inputStream, int i2);
    }

    afx O(Pl pl, mz mzVar);

    void n(afx afxVar, j jVar);

    Map nr(afx afxVar, int i2);

    void rl(afx afxVar, int i2);

    boolean t(afx afxVar);
}
