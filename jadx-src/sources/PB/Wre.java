package PB;

import com.alightcreative.app.motion.templates.Template;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Wre {

    public static final class j implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f7624n;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f7625t;

        public /* synthetic */ j(String str, String str2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Template.Tag.J2(this.f7624n, jVar.f7624n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f7625t == jVar.f7625t;
        }

        private j(String tag, String thumbnailUrl, boolean z2) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
            this.f7624n = tag;
            this.rl = thumbnailUrl;
            this.f7625t = z2;
        }

        public int hashCode() {
            return (((Template.Tag.Uo(this.f7624n) * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f7625t);
        }

        public final String n() {
            return this.f7624n;
        }

        public final String rl() {
            return this.rl;
        }

        public final boolean t() {
            return this.f7625t;
        }

        public String toString() {
            return "Content(tag=" + Template.Tag.KN(this.f7624n) + ", thumbnailUrl=" + this.rl + ", viewed=" + this.f7625t + ")";
        }

        public /* synthetic */ j(String str, String str2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? false : z2, null);
        }
    }

    public static final class n implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f7626n = new n();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "LoadingPlaceholder";
        }

        private n() {
        }

        public int hashCode() {
            return -681699532;
        }
    }
}
