package NBO;

import Dj7.CN3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j {

    /* JADX INFO: renamed from: NBO.j$j, reason: collision with other inner class name */
    public static final class C0235j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6969n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final CN3 f6970t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0235j)) {
                return false;
            }
            C0235j c0235j = (C0235j) obj;
            return Intrinsics.areEqual(this.f6969n, c0235j.f6969n) && Intrinsics.areEqual(this.rl, c0235j.rl) && this.f6970t == c0235j.f6970t;
        }

        public C0235j(String id, String text, CN3 category) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(category, "category");
            this.f6969n = id;
            this.rl = text;
            this.f6970t = category;
        }

        public int hashCode() {
            return (((this.f6969n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f6970t.hashCode();
        }

        public final CN3 n() {
            return this.f6970t;
        }

        public String rl() {
            return this.f6969n;
        }

        public String t() {
            return this.rl;
        }

        public String toString() {
            return "LocalizedRegularPopupButton(id=" + this.f6969n + ", text=" + this.rl + ", category=" + this.f6970t + ")";
        }
    }

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f6971n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f6972t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f6971n, nVar.f6971n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f6972t, nVar.f6972t);
        }

        public n(String id, String text, String tagText) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(tagText, "tagText");
            this.f6971n = id;
            this.rl = text;
            this.f6972t = tagText;
        }

        public int hashCode() {
            return (((this.f6971n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f6972t.hashCode();
        }

        public String n() {
            return this.f6971n;
        }

        public final String rl() {
            return this.f6972t;
        }

        public String t() {
            return this.rl;
        }

        public String toString() {
            return "LocalizedTaggedPopupButton(id=" + this.f6971n + ", text=" + this.rl + ", tagText=" + this.f6972t + ")";
        }
    }
}
