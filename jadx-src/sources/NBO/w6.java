package NBO;

import Dj7.CN3;
import NBO.j;
import i.AbstractC2168n;
import i.C2167j;
import i.C2169w6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface w6 {

    public static final class j implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6976n;
        private final C2167j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final CN3 f6977t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f6976n, jVar.f6976n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f6977t == jVar.f6977t;
        }

        public j(String id, C2167j text, CN3 type) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f6976n = id;
            this.rl = text;
            this.f6977t = type;
        }

        public int hashCode() {
            return (((this.f6976n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f6977t.hashCode();
        }

        @Override // NBO.w6
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public j.C0235j n(C2169w6 translations) {
            Intrinsics.checkNotNullParameter(translations, "translations");
            return new j.C0235j(rl(), AbstractC2168n.n(t(), translations), this.f6977t);
        }

        public String rl() {
            return this.f6976n;
        }

        public C2167j t() {
            return this.rl;
        }

        public String toString() {
            return "RegularPopupButton(id=" + this.f6976n + ", text=" + this.rl + ", type=" + this.f6977t + ")";
        }
    }

    public static final class n implements w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6978n;
        private final C2167j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final C2167j f6979t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f6978n, nVar.f6978n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f6979t, nVar.f6979t);
        }

        public n(String id, C2167j text, C2167j tag) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f6978n = id;
            this.rl = text;
            this.f6979t = tag;
        }

        public int hashCode() {
            return (((this.f6978n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f6979t.hashCode();
        }

        @Override // NBO.w6
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public j.n n(C2169w6 translations) {
            Intrinsics.checkNotNullParameter(translations, "translations");
            return new j.n(rl(), AbstractC2168n.n(t(), translations), AbstractC2168n.n(this.f6979t, translations));
        }

        public String rl() {
            return this.f6978n;
        }

        public C2167j t() {
            return this.rl;
        }

        public String toString() {
            return "TaggedPopupButton(id=" + this.f6978n + ", text=" + this.rl + ", tag=" + this.f6979t + ")";
        }
    }

    NBO.j n(C2169w6 c2169w6);
}
