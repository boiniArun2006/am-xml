package Fl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class eO {

    public static final class j extends eO {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f3095n = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "NewInstall";
        }

        public int hashCode() {
            return 916270654;
        }
    }

    public static final class n extends eO {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f3096n;

        public n(String str) {
            super(null);
            this.f3096n = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f3096n, ((n) obj).f3096n);
        }

        public int hashCode() {
            String str = this.f3096n;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String n() {
            return this.f3096n;
        }

        public String toString() {
            return "Update(updateMessage=" + this.f3096n + ")";
        }
    }

    public /* synthetic */ eO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private eO() {
    }
}
