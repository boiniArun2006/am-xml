package l;

import com.alightcreative.app.motion.project.ProjectInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rWZ.eO;

/* JADX INFO: renamed from: l.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC2254j {

    /* JADX INFO: renamed from: l.j$j, reason: collision with other inner class name */
    public static final class C1045j extends AbstractC2254j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f70379n;
        private final boolean rl;

        public C1045j(long j2, boolean z2) {
            super(null);
            this.f70379n = j2;
            this.rl = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1045j)) {
                return false;
            }
            C1045j c1045j = (C1045j) obj;
            return this.f70379n == c1045j.f70379n && this.rl == c1045j.rl;
        }

        public int hashCode() {
            return (Long.hashCode(this.f70379n) * 31) + Boolean.hashCode(this.rl);
        }

        public final long n() {
            return this.f70379n;
        }

        public final boolean rl() {
            return this.rl;
        }

        public String toString() {
            return "ShowDownloadDeniedDialog(allowedStorage=" + this.f70379n + ", canUpgrade=" + this.rl + ")";
        }
    }

    /* JADX INFO: renamed from: l.j$n */
    public static final class n extends AbstractC2254j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f70380n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f70380n, ((n) obj).f70380n);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String cloudProjectId) {
            super(null);
            Intrinsics.checkNotNullParameter(cloudProjectId, "cloudProjectId");
            this.f70380n = cloudProjectId;
        }

        public int hashCode() {
            return this.f70380n.hashCode();
        }

        public final String n() {
            return this.f70380n;
        }

        public String toString() {
            return "ShowDownloadOverwriteDialog(cloudProjectId=" + this.f70380n + ")";
        }
    }

    /* JADX INFO: renamed from: l.j$w6 */
    public static final class w6 extends AbstractC2254j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ProjectInfo.n f70381n;
        private final eO rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f70381n, w6Var.f70381n) && this.rl == w6Var.rl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(ProjectInfo.n projectInfo, eO requestTriggerPoint) {
            super(null);
            Intrinsics.checkNotNullParameter(projectInfo, "projectInfo");
            Intrinsics.checkNotNullParameter(requestTriggerPoint, "requestTriggerPoint");
            this.f70381n = projectInfo;
            this.rl = requestTriggerPoint;
        }

        public int hashCode() {
            return (this.f70381n.hashCode() * 31) + this.rl.hashCode();
        }

        public final ProjectInfo.n n() {
            return this.f70381n;
        }

        public final eO rl() {
            return this.rl;
        }

        public String toString() {
            return "ShowUploadOverwriteDialog(projectInfo=" + this.f70381n + ", requestTriggerPoint=" + this.rl + ")";
        }
    }

    public /* synthetic */ AbstractC2254j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2254j() {
    }
}
