package com.alightcreative.app.motion.activities.main;

import KA9.u;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface SPz {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class I28 implements SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f45411n;

        public I28(boolean z2) {
            this.f45411n = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof I28) && this.f45411n == ((I28) obj).f45411n;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f45411n);
        }

        public String toString() {
            return "RankingOptOut(isLoading=" + this.f45411n + ")";
        }

        public final boolean n() {
            return this.f45411n;
        }

        public /* synthetic */ I28(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class Ml implements SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f45412n = new Ml();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ml);
        }

        public int hashCode() {
            return 754719133;
        }

        public String toString() {
            return "RankingOptIn";
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class j implements SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f45413n = new j();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return -1355945213;
        }

        public String toString() {
            return "BrowsingPremadeContent";
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class n implements SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List f45414n;
        public final SceneThumbnailMaker nr;
        public final u rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final BitmapLruCache f45415t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f45414n, nVar.f45414n) && this.rl == nVar.rl && Intrinsics.areEqual(this.f45415t, nVar.f45415t) && Intrinsics.areEqual(this.nr, nVar.nr);
        }

        public int hashCode() {
            int iHashCode = ((this.f45414n.hashCode() * 31) + this.rl.hashCode()) * 31;
            BitmapLruCache bitmapLruCache = this.f45415t;
            return ((iHashCode + (bitmapLruCache == null ? 0 : bitmapLruCache.hashCode())) * 31) + this.nr.hashCode();
        }

        public String toString() {
            return "BrowsingProjectsToUpload(projectList=" + this.f45414n + ", selectedSortOption=" + this.rl + ", thumbnailCache=" + this.f45415t + ", thumbnailMaker=" + this.nr + ")";
        }

        public n(List projectList, u selectedSortOption, BitmapLruCache bitmapLruCache, SceneThumbnailMaker thumbnailMaker) {
            Intrinsics.checkNotNullParameter(projectList, "projectList");
            Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
            Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
            this.f45414n = projectList;
            this.rl = selectedSortOption;
            this.f45415t = bitmapLruCache;
            this.nr = thumbnailMaker;
        }

        public final List n() {
            return this.f45414n;
        }

        public final SceneThumbnailMaker nr() {
            return this.nr;
        }

        public final u rl() {
            return this.rl;
        }

        public final BitmapLruCache t() {
            return this.f45415t;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class w6 implements SPz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f45416n = new w6();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof w6);
        }

        public int hashCode() {
            return -577469723;
        }

        public String toString() {
            return "Hidden";
        }
    }
}
