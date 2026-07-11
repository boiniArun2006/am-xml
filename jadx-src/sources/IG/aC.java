package IG;

import KA9.u;
import com.alightcreative.app.motion.scene.SceneType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface aC {

    public static final class Ml implements aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f4128n;
        private final boolean rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return this.f4128n == ml.f4128n && this.rl == ml.rl;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f4128n) * 31) + Boolean.hashCode(this.rl);
        }

        public final boolean n() {
            return this.f4128n;
        }

        public final boolean rl() {
            return this.rl;
        }

        public String toString() {
            return "Editing(isPopupMenuNewTagVisible=" + this.f4128n + ", isSavePresetNewTagVisible=" + this.rl + ")";
        }

        public Ml(boolean z2, boolean z3) {
            this.f4128n = z2;
            this.rl = z3;
        }
    }

    public static final class j implements aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final tN.CN3 f4129n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f4129n == ((j) obj).f4129n;
        }

        public j(tN.CN3 premadeContentType) {
            Intrinsics.checkNotNullParameter(premadeContentType, "premadeContentType");
            this.f4129n = premadeContentType;
        }

        public int hashCode() {
            return this.f4129n.hashCode();
        }

        public final tN.CN3 n() {
            return this.f4129n;
        }

        public String toString() {
            return "BrowsingPremadeContent(premadeContentType=" + this.f4129n + ")";
        }
    }

    public static final class n implements aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SceneType f4130n;
        private final u rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f4130n == nVar.f4130n && this.rl == nVar.rl;
        }

        public n(SceneType selectedSceneType, u selectedSortOption) {
            Intrinsics.checkNotNullParameter(selectedSceneType, "selectedSceneType");
            Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
            this.f4130n = selectedSceneType;
            this.rl = selectedSortOption;
        }

        public int hashCode() {
            return (this.f4130n.hashCode() * 31) + this.rl.hashCode();
        }

        public final SceneType n() {
            return this.f4130n;
        }

        public final u rl() {
            return this.rl;
        }

        public String toString() {
            return "BrowsingProjects(selectedSceneType=" + this.f4130n + ", selectedSortOption=" + this.rl + ")";
        }
    }

    public static final class w6 implements aC {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final u f4131n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w6) && this.f4131n == ((w6) obj).f4131n;
        }

        public w6(u selectedSortOption) {
            Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
            this.f4131n = selectedSortOption;
        }

        public int hashCode() {
            return this.f4131n.hashCode();
        }

        public final u n() {
            return this.f4131n;
        }

        public String toString() {
            return "BrowsingTemplates(selectedSortOption=" + this.f4131n + ")";
        }
    }
}
