package com.facebook.login;

import com.google.android.gms.common.Scopes;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Xo {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f52959n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f52960t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Xo(Collection collection, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        this(collection, str);
    }

    public final String n() {
        return this.f52960t;
    }

    public final String rl() {
        return this.rl;
    }

    public final Set t() {
        return this.f52959n;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Xo(Collection collection, String nonce) {
        this(collection, nonce, g9s.t());
        Intrinsics.checkNotNullParameter(nonce, "nonce");
    }

    public Xo(Collection collection, String nonce, String codeVerifier) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        if (ci.n(nonce) && g9s.nr(codeVerifier)) {
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add(Scopes.OPEN_ID);
            Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(permissions)");
            this.f52959n = setUnmodifiableSet;
            this.rl = nonce;
            this.f52960t = codeVerifier;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
