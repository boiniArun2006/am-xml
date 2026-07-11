package com.firebase.ui.auth.util.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class ContinueUrlBuilder {
    private StringBuilder mContinueUrl;

    public ContinueUrlBuilder appendAnonymousUserId(@NonNull String str) {
        addQueryParam("ui_auid", str);
        return this;
    }

    public ContinueUrlBuilder appendForceSameDeviceBit(@NonNull boolean z2) {
        addQueryParam("ui_sd", z2 ? "1" : "0");
        return this;
    }

    public ContinueUrlBuilder appendProviderId(@NonNull String str) {
        addQueryParam("ui_pid", str);
        return this;
    }

    public ContinueUrlBuilder appendSessionId(@NonNull String str) {
        addQueryParam("ui_sid", str);
        return this;
    }

    public String build() {
        if (this.mContinueUrl.charAt(r0.length() - 1) == '?') {
            this.mContinueUrl.setLength(r0.length() - 1);
        }
        return this.mContinueUrl.toString();
    }

    public ContinueUrlBuilder(@NonNull String str) {
        Preconditions.checkNotEmpty(str);
        this.mContinueUrl = new StringBuilder(str + "?");
    }

    private void addQueryParam(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.mContinueUrl.charAt(r0.length() - 1) == '?') {
            str3 = "";
        } else {
            str3 = "&";
        }
        this.mContinueUrl.append(String.format("%s%s=%s", str3, str, str2));
    }
}
