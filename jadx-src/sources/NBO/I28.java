package NBO;

import NBO.n;
import i.AbstractC2168n;
import i.C2167j;
import i.C2169w6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface I28 {

    public static final class j implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C2167j f6966n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f6966n, ((j) obj).f6966n);
        }

        public j(C2167j text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f6966n = text;
        }

        public int hashCode() {
            return this.f6966n.hashCode();
        }

        @Override // NBO.I28
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public n.j n(C2169w6 translations) {
            Intrinsics.checkNotNullParameter(translations, "translations");
            return new n.j(AbstractC2168n.n(this.f6966n, translations));
        }

        public String toString() {
            return "PopupDescription(text=" + this.f6966n + ")";
        }
    }

    public static final class n implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6967n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f6967n, ((n) obj).f6967n);
        }

        public n(String resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            this.f6967n = resource;
        }

        public int hashCode() {
            return this.f6967n.hashCode();
        }

        @Override // NBO.I28
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public n.C0236n n(C2169w6 translations) {
            Intrinsics.checkNotNullParameter(translations, "translations");
            return new n.C0236n(Wre.rl(this.f6967n));
        }

        public String toString() {
            return "PopupImage(resource=" + this.f6967n + ")";
        }
    }

    public static final class w6 implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C2167j f6968n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && Intrinsics.areEqual(this.f6968n, ((w6) obj).f6968n);
        }

        public w6(C2167j text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f6968n = text;
        }

        public int hashCode() {
            return this.f6968n.hashCode();
        }

        @Override // NBO.I28
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public n.w6 n(C2169w6 translations) {
            Intrinsics.checkNotNullParameter(translations, "translations");
            return new n.w6(AbstractC2168n.n(this.f6968n, translations));
        }

        public String toString() {
            return "PopupTitle(text=" + this.f6968n + ")";
        }
    }

    NBO.n n(C2169w6 c2169w6);
}
