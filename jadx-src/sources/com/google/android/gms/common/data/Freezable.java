package com.google.android.gms.common.data;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Freezable<T> {
    @NonNull
    T freeze();

    boolean isDataValid();
}
