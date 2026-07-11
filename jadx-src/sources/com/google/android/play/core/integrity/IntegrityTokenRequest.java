package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class IntegrityTokenRequest {

    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j2);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new am();
    }

    @Nullable
    public abstract Long cloudProjectNumber();

    public abstract String nonce();
}
