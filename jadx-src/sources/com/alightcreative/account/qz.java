package com.alightcreative.account;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class qz {

    public static final class j extends qz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f44301n = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 846567515;
        }

        public String toString() {
            return "InvalidToken";
        }
    }

    public static final class n extends qz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f44302n;

        public n(long j2) {
            super(null);
            this.f44302n = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f44302n == ((n) obj).f44302n;
        }

        public int hashCode() {
            return Long.hashCode(this.f44302n);
        }

        public String toString() {
            return "Verified(expiryTimeMillis=" + this.f44302n + ")";
        }

        public final long n() {
            return this.f44302n;
        }
    }

    public /* synthetic */ qz(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private qz() {
    }
}
