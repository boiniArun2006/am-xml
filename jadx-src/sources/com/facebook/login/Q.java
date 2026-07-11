package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AccessToken f52938n;
    private final Set nr;
    private final AuthenticationToken rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f52939t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q2 = (Q) obj;
        return Intrinsics.areEqual(this.f52938n, q2.f52938n) && Intrinsics.areEqual(this.rl, q2.rl) && Intrinsics.areEqual(this.f52939t, q2.f52939t) && Intrinsics.areEqual(this.nr, q2.nr);
    }

    public int hashCode() {
        int iHashCode = this.f52938n.hashCode() * 31;
        AuthenticationToken authenticationToken = this.rl;
        return ((((iHashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31) + this.f52939t.hashCode()) * 31) + this.nr.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.f52938n + ", authenticationToken=" + this.rl + ", recentlyGrantedPermissions=" + this.f52939t + ", recentlyDeniedPermissions=" + this.nr + ')';
    }

    public Q(AccessToken accessToken, AuthenticationToken authenticationToken, Set recentlyGrantedPermissions, Set recentlyDeniedPermissions) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.f52938n = accessToken;
        this.rl = authenticationToken;
        this.f52939t = recentlyGrantedPermissions;
        this.nr = recentlyDeniedPermissions;
    }

    public final AccessToken n() {
        return this.f52938n;
    }

    public final Set rl() {
        return this.f52939t;
    }
}
