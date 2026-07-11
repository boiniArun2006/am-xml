package com.alightcreative.app.motion.activities.main;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f45481n;
    public final long rl;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class j {
        public final long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final boolean f45482O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f45483n;
        public final String nr;
        public final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final String f45484t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f45483n, jVar.f45483n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f45484t, jVar.f45484t) && Intrinsics.areEqual(this.nr, jVar.nr) && this.f45482O == jVar.f45482O && this.J2 == jVar.J2;
        }

        public int hashCode() {
            return (((((((((this.f45483n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f45484t.hashCode()) * 31) + this.nr.hashCode()) * 31) + Boolean.hashCode(this.f45482O)) * 31) + Long.hashCode(this.J2);
        }

        public String toString() {
            return "Recommendation(title=" + this.f45483n + ", thumbnail=" + this.rl + ", download=" + this.f45484t + ", id=" + this.nr + ", new=" + this.f45482O + ", newTimestamp=" + this.J2 + ")";
        }

        public j(String title, String thumbnail, String download, String id, boolean z2, long j2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
            Intrinsics.checkNotNullParameter(download, "download");
            Intrinsics.checkNotNullParameter(id, "id");
            this.f45483n = title;
            this.rl = thumbnail;
            this.f45484t = download;
            this.nr = id;
            this.f45482O = z2;
            this.J2 = j2;
        }

        public final boolean n() {
            return this.f45482O;
        }

        public final long rl() {
            return this.J2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f45481n, w6Var.f45481n) && this.rl == w6Var.rl;
    }

    public int hashCode() {
        return (this.f45481n.hashCode() * 31) + Long.hashCode(this.rl);
    }

    public String toString() {
        return "ElementLibrary(recommendations=" + this.f45481n + ", newestRecommendation=" + this.rl + ")";
    }

    public w6(List recommendations, long j2) {
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        this.f45481n = recommendations;
        this.rl = j2;
    }

    public final long n() {
        return this.rl;
    }

    public final List rl() {
        return this.f45481n;
    }
}
