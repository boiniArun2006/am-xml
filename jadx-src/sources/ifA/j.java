package ifA;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface j {

    public static final class CN3 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f68133n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CN3) && this.f68133n == ((CN3) obj).f68133n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f68133n);
        }

        public final boolean n() {
            return this.f68133n;
        }

        public String toString() {
            return "Spooners(shouldSendEvent=" + this.f68133n + ")";
        }

        public CN3(boolean z2) {
            this.f68133n = z2;
        }
    }

    public static final class I28 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f68134n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof I28) && this.f68134n == ((I28) obj).f68134n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f68134n);
        }

        public final boolean n() {
            return this.f68134n;
        }

        public String toString() {
            return "PremiumUsers(shouldSendEvent=" + this.f68134n + ")";
        }

        public I28(boolean z2) {
            this.f68134n = z2;
        }
    }

    public static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f68135n;
        private final boolean rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return Intrinsics.areEqual(this.f68135n, ml.f68135n) && this.rl == ml.rl;
        }

        public Ml(String name, boolean z2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f68135n = name;
            this.rl = z2;
        }

        public int hashCode() {
            return (this.f68135n.hashCode() * 31) + Boolean.hashCode(this.rl);
        }

        public final String n() {
            return this.f68135n;
        }

        public final boolean rl() {
            return this.rl;
        }

        public String toString() {
            return "NamedEntry(name=" + this.f68135n + ", shouldSendEvent=" + this.rl + ")";
        }
    }

    public static final class Wre implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f68136n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Wre) && Intrinsics.areEqual(this.f68136n, ((Wre) obj).f68136n);
        }

        public Wre(List entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.f68136n = entries;
        }

        public int hashCode() {
            return this.f68136n.hashCode();
        }

        public final List n() {
            return this.f68136n;
        }

        public String toString() {
            return "Severity(entries=" + this.f68136n + ")";
        }
    }

    public static final class fuX implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f68137n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof fuX) && this.f68137n == ((fuX) obj).f68137n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f68137n);
        }

        public final boolean n() {
            return this.f68137n;
        }

        public String toString() {
            return "Standard(shouldSendEvent=" + this.f68137n + ")";
        }

        public fuX(boolean z2) {
            this.f68137n = z2;
        }
    }

    /* JADX INFO: renamed from: ifA.j$j, reason: collision with other inner class name */
    public static final class C0969j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f68138n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0969j) && Intrinsics.areEqual(this.f68138n, ((C0969j) obj).f68138n);
        }

        public C0969j(List rules) {
            Intrinsics.checkNotNullParameter(rules, "rules");
            this.f68138n = rules;
        }

        public int hashCode() {
            return this.f68138n.hashCode();
        }

        public final List n() {
            return this.f68138n;
        }

        public String toString() {
            return "AndRule(rules=" + this.f68138n + ")";
        }
    }

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f68139n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f68139n, ((n) obj).f68139n);
        }

        public n(List entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.f68139n = entries;
        }

        public int hashCode() {
            return this.f68139n.hashCode();
        }

        public final List n() {
            return this.f68139n;
        }

        public String toString() {
            return "Categories(entries=" + this.f68139n + ")";
        }
    }

    public static final class w6 implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f68140n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && Intrinsics.areEqual(this.f68140n, ((w6) obj).f68140n);
        }

        public w6(List entries) {
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.f68140n = entries;
        }

        public int hashCode() {
            return this.f68140n.hashCode();
        }

        public final List n() {
            return this.f68140n;
        }

        public String toString() {
            return "Experiments(entries=" + this.f68140n + ")";
        }
    }
}
