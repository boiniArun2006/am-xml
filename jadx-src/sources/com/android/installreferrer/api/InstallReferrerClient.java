package com.android.installreferrer.api;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class InstallReferrerClient {

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f47659n;

        private n(Context context) {
            this.f47659n = context;
        }

        public InstallReferrerClient n() {
            Context context = this.f47659n;
            if (context != null) {
                return new com.android.installreferrer.api.j(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public abstract void n();

    public abstract void nr(InstallReferrerStateListener installReferrerStateListener);

    public abstract ReferrerDetails rl();

    public static n t(Context context) {
        return new n(context);
    }
}
