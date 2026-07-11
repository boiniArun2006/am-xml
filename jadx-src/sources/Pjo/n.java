package Pjo;

import com.alightcreative.app.motion.templates.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface n {

    public static final class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f7832n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "Close";
        }

        private j() {
        }

        public int hashCode() {
            return -134075818;
        }
    }

    /* JADX INFO: renamed from: Pjo.n$n, reason: collision with other inner class name */
    public static final class C0279n implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Template f7833n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0279n) && Intrinsics.areEqual(this.f7833n, ((C0279n) obj).f7833n);
        }

        public C0279n(Template template) {
            Intrinsics.checkNotNullParameter(template, "template");
            this.f7833n = template;
        }

        public int hashCode() {
            return this.f7833n.hashCode();
        }

        public final Template n() {
            return this.f7833n;
        }

        public String toString() {
            return "ImportTemplate(template=" + this.f7833n + ")";
        }
    }

    public static final class w6 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f7834n = new w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "NavigateToSavedTemplates";
        }

        private w6() {
        }

        public int hashCode() {
            return -1060964800;
        }
    }
}
