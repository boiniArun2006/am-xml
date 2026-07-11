package com.applovin.mediation.adapter;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface MaxAdapter {

    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);

        private final int code;

        public int getCode() {
            return this.code;
        }

        InitializationStatus(int i2) {
            this.code = i2;
        }
    }

    public interface OnCompletionListener {
        void onCompletion(InitializationStatus initializationStatus, String str);
    }

    String getAdapterVersion();

    String getSdkVersion();

    void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, OnCompletionListener onCompletionListener);

    boolean isBeta();

    void onDestroy();

    @Nullable
    Boolean shouldCollectSignalsOnUiThread();

    @Nullable
    Boolean shouldDestroyOnUiThread();

    @Nullable
    Boolean shouldInitializeOnUiThread();

    @Nullable
    Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat);

    @Nullable
    Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat);
}
