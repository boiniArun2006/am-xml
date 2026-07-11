package com.alightcreative.template.importpreview.ui;

import a.C1498j;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class C {

    public static final class j extends C {
        private final Uri J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final boolean f46906O;
        private final a.w6 Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f46907n;
        private final boolean nr;
        private final Integer rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final C1498j f46908t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f46907n, jVar.f46907n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f46908t, jVar.f46908t) && this.nr == jVar.nr && this.f46906O == jVar.f46906O && Intrinsics.areEqual(this.J2, jVar.J2) && Intrinsics.areEqual(this.Uo, jVar.Uo);
        }

        public int hashCode() {
            int iHashCode = this.f46907n.hashCode() * 31;
            Integer num = this.rl;
            int iHashCode2 = (((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f46908t.hashCode()) * 31) + Boolean.hashCode(this.nr)) * 31) + Boolean.hashCode(this.f46906O)) * 31;
            Uri uri = this.J2;
            int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
            a.w6 w6Var = this.Uo;
            return iHashCode3 + (w6Var != null ? w6Var.hashCode() : 0);
        }

        public String toString() {
            return "Content(projectMedia=" + this.f46907n + ", selectedMediaIndex=" + this.rl + ", templateTimelineRowState=" + this.f46908t + ", showReplaceMediaTooltip=" + this.nr + ", showCropTooltip=" + this.f46906O + ", trimmingUri=" + this.J2 + ", videoTrimState=" + this.Uo + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(List projectMedia, Integer num, C1498j templateTimelineRowState, boolean z2, boolean z3, Uri uri, a.w6 w6Var) {
            super(null);
            Intrinsics.checkNotNullParameter(projectMedia, "projectMedia");
            Intrinsics.checkNotNullParameter(templateTimelineRowState, "templateTimelineRowState");
            this.f46907n = projectMedia;
            this.rl = num;
            this.f46908t = templateTimelineRowState;
            this.nr = z2;
            this.f46906O = z3;
            this.J2 = uri;
            this.Uo = w6Var;
        }

        public final Uri J2() {
            return this.J2;
        }

        public final C1498j O() {
            return this.f46908t;
        }

        public final a.w6 Uo() {
            return this.Uo;
        }

        public final List n() {
            return this.f46907n;
        }

        public final boolean nr() {
            return this.nr;
        }

        public final Integer rl() {
            return this.rl;
        }

        public final boolean t() {
            return this.f46906O;
        }
    }

    public /* synthetic */ C(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C() {
    }
}
