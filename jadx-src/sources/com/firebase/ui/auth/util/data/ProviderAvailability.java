package com.firebase.ui.auth.util.data;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public abstract class ProviderAvailability {
    public static final boolean IS_GITHUB_AVAILABLE = exists("com.firebase.ui.auth.data.remote.GitHubSignInHandler");
    public static final boolean IS_FACEBOOK_AVAILABLE = exists("com.facebook.login.LoginManager");
    public static final boolean IS_TWITTER_AVAILABLE = exists("com.twitter.sdk.android.core.identity.TwitterAuthClient");

    private static boolean exists(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
