package com.alightcreative.share;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class n {

    public static final class j extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f46900n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f46900n, ((j) obj).f46900n);
        }

        public int hashCode() {
            return this.f46900n.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f46900n + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f46900n = message;
        }

        public final String n() {
            return this.f46900n;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.share.n$n, reason: collision with other inner class name */
    public static final class C0679n extends n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f46901n;
        private final String nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f46902t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0679n)) {
                return false;
            }
            C0679n c0679n = (C0679n) obj;
            return Intrinsics.areEqual(this.f46901n, c0679n.f46901n) && Intrinsics.areEqual(this.rl, c0679n.rl) && Intrinsics.areEqual(this.f46902t, c0679n.f46902t) && Intrinsics.areEqual(this.nr, c0679n.nr);
        }

        public int hashCode() {
            return (((((this.f46901n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f46902t.hashCode()) * 31) + this.nr.hashCode();
        }

        public String toString() {
            return "Success(packageName=" + this.f46901n + ", nonLocalizedLabel=" + this.rl + ", componentName=" + this.f46902t + ", mimeType=" + this.nr + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0679n(String packageName, String nonLocalizedLabel, String componentName, String mimeType) {
            super(null);
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(nonLocalizedLabel, "nonLocalizedLabel");
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.f46901n = packageName;
            this.rl = nonLocalizedLabel;
            this.f46902t = componentName;
            this.nr = mimeType;
        }

        public final String n() {
            return this.rl;
        }

        public final String rl() {
            return this.f46901n;
        }
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private n() {
    }
}
