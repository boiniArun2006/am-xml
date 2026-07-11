package ma;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ma.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface InterfaceC2300j {

    /* JADX INFO: renamed from: ma.j$j, reason: collision with other inner class name */
    public static final class C1056j implements InterfaceC2300j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f70714n;
        private final Function1 nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f70715t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1056j)) {
                return false;
            }
            C1056j c1056j = (C1056j) obj;
            return Intrinsics.areEqual(this.f70714n, c1056j.f70714n) && Intrinsics.areEqual(this.rl, c1056j.rl) && this.f70715t == c1056j.f70715t && Intrinsics.areEqual(this.nr, c1056j.nr);
        }

        public C1056j(String label, String text, boolean z2, Function1 onValueChanged) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(onValueChanged, "onValueChanged");
            this.f70714n = label;
            this.rl = text;
            this.f70715t = z2;
            this.nr = onValueChanged;
        }

        public int hashCode() {
            return (((((this.f70714n.hashCode() * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f70715t)) * 31) + this.nr.hashCode();
        }

        public final String n() {
            return this.f70714n;
        }

        public final String rl() {
            return this.rl;
        }

        public final boolean t() {
            return this.f70715t;
        }

        public String toString() {
            return "Open(label=" + this.f70714n + ", text=" + this.rl + ", isValueValid=" + this.f70715t + ", onValueChanged=" + this.nr + ")";
        }
    }

    /* JADX INFO: renamed from: ma.j$n */
    public static final class n implements InterfaceC2300j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f70716n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f70716n, nVar.f70716n) && Intrinsics.areEqual(this.rl, nVar.rl);
        }

        public n(String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f70716n = title;
            this.rl = str;
        }

        public int hashCode() {
            int iHashCode = this.f70716n.hashCode() * 31;
            String str = this.rl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String n() {
            return this.rl;
        }

        public final String rl() {
            return this.f70716n;
        }

        public String toString() {
            return "Text(title=" + this.f70716n + ", subtitle=" + this.rl + ")";
        }
    }
}
