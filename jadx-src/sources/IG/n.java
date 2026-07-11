package IG;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface n {

    public static final class I28 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f4138n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof I28)) {
                return false;
            }
            I28 i28 = (I28) obj;
            return Intrinsics.areEqual(this.f4138n, i28.f4138n) && Intrinsics.areEqual(this.rl, i28.rl);
        }

        public I28(String projectId, String projectPackageId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            this.f4138n = projectId;
            this.rl = projectPackageId;
        }

        public int hashCode() {
            return (this.f4138n.hashCode() * 31) + this.rl.hashCode();
        }

        public final String n() {
            return this.f4138n;
        }

        public final String rl() {
            return this.rl;
        }

        public String toString() {
            return "OpenTemplateEditor(projectId=" + this.f4138n + ", projectPackageId=" + this.rl + ")";
        }
    }

    public static final class Ml implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Uri f4139n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ml) && Intrinsics.areEqual(this.f4139n, ((Ml) obj).f4139n);
        }

        public Ml(Uri linkUri) {
            Intrinsics.checkNotNullParameter(linkUri, "linkUri");
            this.f4139n = linkUri;
        }

        public int hashCode() {
            return this.f4139n.hashCode();
        }

        public final Uri n() {
            return this.f4139n;
        }

        public String toString() {
            return "Import(linkUri=" + this.f4139n + ")";
        }
    }

    public static final class Wre implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Wre f4140n = new Wre();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Wre);
        }

        public String toString() {
            return "ShowPresetAppliedToast";
        }

        private Wre() {
        }

        public int hashCode() {
            return -279101943;
        }
    }

    public static final class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f4141n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f4141n, ((j) obj).f4141n);
        }

        public j(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f4141n = projectId;
        }

        public int hashCode() {
            return this.f4141n.hashCode();
        }

        public final String n() {
            return this.f4141n;
        }

        public String toString() {
            return "AddElement(projectId=" + this.f4141n + ")";
        }
    }

    /* JADX INFO: renamed from: IG.n$n, reason: collision with other inner class name */
    public static final class C0141n implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f4142n;
        private final String rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0141n)) {
                return false;
            }
            C0141n c0141n = (C0141n) obj;
            return Intrinsics.areEqual(this.f4142n, c0141n.f4142n) && Intrinsics.areEqual(this.rl, c0141n.rl);
        }

        public C0141n(String projectId, String projectPackageId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
            this.f4142n = projectId;
            this.rl = projectPackageId;
        }

        public int hashCode() {
            return (this.f4142n.hashCode() * 31) + this.rl.hashCode();
        }

        public final String n() {
            return this.f4142n;
        }

        public final String rl() {
            return this.rl;
        }

        public String toString() {
            return "AddTemplateAsGroup(projectId=" + this.f4142n + ", projectPackageId=" + this.rl + ")";
        }
    }

    public static final class w6 implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f4143n = new w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public String toString() {
            return "Close";
        }

        private w6() {
        }

        public int hashCode() {
            return 1536605077;
        }
    }
}
