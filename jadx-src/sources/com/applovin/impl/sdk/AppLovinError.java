package com.applovin.impl.sdk;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49974b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public int getCode() {
        return this.f49973a;
    }

    @Nullable
    public String getMessage() {
        return this.f49974b;
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }

    public AppLovinError(int i2, @Nullable String str) {
        this.f49973a = i2;
        this.f49974b = str;
    }

    public int hashCode() {
        int iHashCode;
        int code = getCode() + 59;
        String message = getMessage();
        int i2 = code * 59;
        if (message == null) {
            iHashCode = 43;
        } else {
            iHashCode = message.hashCode();
        }
        return i2 + iHashCode;
    }
}
