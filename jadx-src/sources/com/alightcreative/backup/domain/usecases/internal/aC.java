package com.alightcreative.backup.domain.usecases.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class aC {

    public static final class j extends aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f46538n = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 1495078175;
        }

        public String toString() {
            return "CloudStorageLimitReached";
        }
    }

    public static final class n extends aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f46539n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f46539n, ((n) obj).f46539n);
        }

        public int hashCode() {
            return this.f46539n.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.f46539n + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f46539n = throwable;
        }

        public final Throwable n() {
            return this.f46539n;
        }
    }

    public static final class w6 extends aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f46540n = new w6();

        private w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public int hashCode() {
            return -465320537;
        }

        public String toString() {
            return "InternetConnectionError";
        }
    }

    public /* synthetic */ aC(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private aC() {
    }
}
