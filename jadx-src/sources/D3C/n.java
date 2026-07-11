package D3C;

import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.templates.Template;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface n {

    public static final class I28 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f1279n = new I28();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof I28);
        }

        public String toString() {
            return "NavigateToTemplatesTab";
        }

        private I28() {
        }

        public int hashCode() {
            return -80686393;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class Ml implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f1280n;

        public /* synthetic */ Ml(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ml) && Template.Tag.J2(this.f1280n, ((Ml) obj).f1280n);
        }

        private Ml(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f1280n = tag;
        }

        public int hashCode() {
            return Template.Tag.Uo(this.f1280n);
        }

        public final String n() {
            return this.f1280n;
        }

        public String toString() {
            return KfLR.FcsdLyI + Template.Tag.KN(this.f1280n) + ")";
        }
    }

    public static final class Wre implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Wre f1281n = new Wre();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Wre);
        }

        public String toString() {
            return "OpenTutorialVideo";
        }

        private Wre() {
        }

        public int hashCode() {
            return -78127372;
        }
    }

    public static final class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f1282n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public String toString() {
            return "CreateProject";
        }

        private j() {
        }

        public int hashCode() {
            return 1512943710;
        }
    }

    /* JADX INFO: renamed from: D3C.n$n, reason: collision with other inner class name */
    public static final class C0046n implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ProjectInfo f1283n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0046n) && Intrinsics.areEqual(this.f1283n, ((C0046n) obj).f1283n);
        }

        public C0046n(ProjectInfo project) {
            Intrinsics.checkNotNullParameter(project, "project");
            this.f1283n = project;
        }

        public int hashCode() {
            return this.f1283n.hashCode();
        }

        public final ProjectInfo n() {
            return this.f1283n;
        }

        public String toString() {
            return "NavigateToProject(project=" + this.f1283n + ")";
        }
    }

    public static final class w6 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f1284n = new w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "NavigateToProjectsTab";
        }

        private w6() {
        }

        public int hashCode() {
            return -1602843088;
        }
    }
}
