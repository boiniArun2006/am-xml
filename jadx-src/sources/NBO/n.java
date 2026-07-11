package NBO;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface n {

    public static final class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6973n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f6973n, ((j) obj).f6973n);
        }

        public j(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f6973n = text;
        }

        public int hashCode() {
            return this.f6973n.hashCode();
        }

        public final String n() {
            return this.f6973n;
        }

        public String toString() {
            return "LocalizedPopupDescription(text=" + this.f6973n + ")";
        }
    }

    /* JADX INFO: renamed from: NBO.n$n, reason: collision with other inner class name */
    public static final class C0236n implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f6974n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0236n) && this.f6974n == ((C0236n) obj).f6974n;
        }

        public int hashCode() {
            return Integer.hashCode(this.f6974n);
        }

        public final int n() {
            return this.f6974n;
        }

        public String toString() {
            return "LocalizedPopupImage(resId=" + this.f6974n + ")";
        }

        public C0236n(int i2) {
            this.f6974n = i2;
        }
    }

    public static final class w6 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6975n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && Intrinsics.areEqual(this.f6975n, ((w6) obj).f6975n);
        }

        public w6(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f6975n = text;
        }

        public int hashCode() {
            return this.f6975n.hashCode();
        }

        public final String n() {
            return this.f6975n;
        }

        public String toString() {
            return "LocalizedPopupTitle(text=" + this.f6975n + ")";
        }
    }
}
