package com.alightcreative.backup.domain.usecases.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class Dsr {

    public static final class I28 extends Dsr {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f46459n = new I28();

        private I28() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof I28);
        }

        public int hashCode() {
            return -414974873;
        }

        public String toString() {
            return "MissingCloudProjectError";
        }
    }

    public static final class Ml extends Dsr {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f46460n = new Ml();

        private Ml() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ml);
        }

        public int hashCode() {
            return -1047533760;
        }

        public String toString() {
            return "InternetConnectionError";
        }
    }

    public static final class Wre extends Dsr {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f46461n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f46462t;

        public Wre(int i2, int i3, int i5) {
            super(null);
            this.f46461n = i2;
            this.rl = i3;
            this.f46462t = i5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Wre)) {
                return false;
            }
            Wre wre = (Wre) obj;
            return this.f46461n == wre.f46461n && this.rl == wre.rl && this.f46462t == wre.f46462t;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f46461n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f46462t);
        }

        public String toString() {
            return "VideoResolutionTooHighError(width=" + this.f46461n + ", height=" + this.rl + ", maxRes=" + this.f46462t + ")";
        }

        public final int n() {
            return this.rl;
        }

        public final int rl() {
            return this.f46462t;
        }

        public final int t() {
            return this.f46461n;
        }
    }

    public static final class j extends Dsr {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f46463n = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 626337446;
        }

        public String toString() {
            return "CloudStorageLimitReached";
        }
    }

    public static final class n extends Dsr {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f46464n = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return -1223593310;
        }

        public String toString() {
            return "DeserializationError";
        }
    }

    public static final class w6 extends Dsr {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f46465n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && Intrinsics.areEqual(this.f46465n, ((w6) obj).f46465n);
        }

        public int hashCode() {
            return this.f46465n.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.f46465n + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f46465n = throwable;
        }

        public final Throwable n() {
            return this.f46465n;
        }
    }

    public /* synthetic */ Dsr(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Dsr() {
    }
}
