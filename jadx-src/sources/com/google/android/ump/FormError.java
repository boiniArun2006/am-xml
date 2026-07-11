package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class FormError {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f59596n;
    private final String rl;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i2, @RecentlyNonNull String str) {
        this.f59596n = i2;
        this.rl = str;
    }

    public int getErrorCode() {
        return this.f59596n;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.rl;
    }
}
