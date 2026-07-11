package com.android.volley.toolbox;

import android.os.Looper;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Threads {
    private Threads() {
    }

    static void throwIfNotOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalStateException(obbPUqyhtS.QlfCaXfkXO);
        }
    }
}
