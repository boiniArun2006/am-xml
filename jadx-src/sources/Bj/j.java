package Bj;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface j {

    /* JADX INFO: renamed from: Bj.j$j, reason: collision with other inner class name */
    public static final class C0016j implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f587n;
        private final List nr;
        private final Uri rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f588t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0016j)) {
                return false;
            }
            C0016j c0016j = (C0016j) obj;
            return Intrinsics.areEqual(this.f587n, c0016j.f587n) && Intrinsics.areEqual(this.rl, c0016j.rl) && this.f588t == c0016j.f588t && Intrinsics.areEqual(this.nr, c0016j.nr);
        }

        public C0016j(String id, Uri videoUri, boolean z2, List tags) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(videoUri, "videoUri");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.f587n = id;
            this.rl = videoUri;
            this.f588t = z2;
            this.nr = tags;
        }

        public int hashCode() {
            return (((((this.f587n.hashCode() * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f588t)) * 31) + this.nr.hashCode();
        }

        public final String n() {
            return this.f587n;
        }

        public final boolean nr() {
            return this.f588t;
        }

        public final List rl() {
            return this.nr;
        }

        public final Uri t() {
            return this.rl;
        }

        public String toString() {
            return "Content(id=" + this.f587n + ", videoUri=" + this.rl + ", isSaved=" + this.f588t + ", tags=" + this.nr + ")";
        }
    }

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f589n = new n();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public String toString() {
            return "LoadingPlaceholder";
        }

        private n() {
        }

        public int hashCode() {
            return -1502764442;
        }
    }
}
