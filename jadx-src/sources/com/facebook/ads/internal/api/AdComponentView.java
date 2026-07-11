package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Keep
@UiThread
public interface AdComponentView {
    void addView(View view);

    void addView(View view, int i2);

    void addView(View view, int i2, int i3);

    void addView(View view, int i2, ViewGroup.LayoutParams layoutParams);

    void addView(View view, ViewGroup.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z2);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);
}
