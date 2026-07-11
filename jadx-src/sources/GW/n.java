package GW;

import com.alightcreative.app.motion.templates.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface n {

    public static final class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f3649n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "Close";
        }

        private j() {
        }

        public int hashCode() {
            return 2119211682;
        }
    }

    /* JADX INFO: renamed from: GW.n$n, reason: collision with other inner class name */
    public static final class C0128n implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Template f3650n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0128n) && Intrinsics.areEqual(this.f3650n, ((C0128n) obj).f3650n);
        }

        public C0128n(Template template) {
            Intrinsics.checkNotNullParameter(template, "template");
            this.f3650n = template;
        }

        public int hashCode() {
            return this.f3650n.hashCode();
        }

        public final Template n() {
            return this.f3650n;
        }

        public String toString() {
            return "ImportTemplate(template=" + this.f3650n + ")";
        }
    }

    public static final class w6 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f3651n = new w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "NavigateToSavedTemplates";
        }

        private w6() {
        }

        public int hashCode() {
            return 1569335924;
        }
    }
}
