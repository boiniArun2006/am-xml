package com.bendingspoons.adorable.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: com.bendingspoons.adorable.internal.j$j, reason: collision with other inner class name */
    public static final class C0717j extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f51197n;

        public C0717j(boolean z2) {
            super(null);
            this.f51197n = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0717j) && this.f51197n == ((C0717j) obj).f51197n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f51197n);
        }

        public String toString() {
            return "CloseAd(didGetReward=" + this.f51197n + ")";
        }

        public final boolean n() {
            return this.f51197n;
        }
    }

    public static final class n extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f51198n = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return -947986585;
        }

        public String toString() {
            return "OpenPlayStore";
        }
    }

    public static final class w6 extends j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f51199n = new w6();

        private w6() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public int hashCode() {
            return 1895607457;
        }

        public String toString() {
            return "ShowDialog";
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
