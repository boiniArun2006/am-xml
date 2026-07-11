package com.facebook.appevents;

import com.facebook.AccessToken;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final C0742j f52313O = new C0742j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f52314n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f52315t;

    /* JADX INFO: renamed from: com.facebook.appevents.j$j, reason: collision with other inner class name */
    public static final class C0742j {
        public /* synthetic */ C0742j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0742j() {
        }
    }

    public static final class n implements Serializable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final C0743j f52316O = new C0743j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f52317n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f52318t;

        /* JADX INFO: renamed from: com.facebook.appevents.j$n$j, reason: collision with other inner class name */
        public static final class C0743j {
            public /* synthetic */ C0743j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0743j() {
            }
        }

        public n(String str, String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.f52317n = str;
            this.f52318t = appId;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new j(this.f52317n, this.f52318t);
        }
    }

    public j(String str, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f52314n = applicationId;
        this.f52315t = com.facebook.internal.vd.I(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new n(this.f52315t, this.f52314n);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return com.facebook.internal.vd.O(jVar.f52315t, this.f52315t) && com.facebook.internal.vd.O(jVar.f52314n, this.f52314n);
    }

    public int hashCode() {
        String str = this.f52315t;
        return (str != null ? str.hashCode() : 0) ^ this.f52314n.hashCode();
    }

    public final String n() {
        return this.f52315t;
    }

    public final String rl() {
        return this.f52314n;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(AccessToken accessToken) {
        this(accessToken.getToken(), com.facebook.s4.az());
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
    }
}
