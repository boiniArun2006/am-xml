package JK;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f4455n;
    private final boolean rl;

    public static final class I28 extends w6 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f4456t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof I28) && Intrinsics.areEqual(this.f4456t, ((I28) obj).f4456t);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(String projectId) {
            super(projectId, false, null);
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f4456t = projectId;
        }

        public int hashCode() {
            return this.f4456t.hashCode();
        }

        @Override // JK.w6
        public String n() {
            return "Watermark removal";
        }

        @Override // JK.w6
        public String rl() {
            return this.f4456t;
        }

        public String toString() {
            return "WatermarkRemoval(projectId=" + this.f4456t + ")";
        }
    }

    public static final class Ml extends w6 {
        private final String nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f4457t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return Intrinsics.areEqual(this.f4457t, ml.f4457t) && Intrinsics.areEqual(this.nr, ml.nr);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(String projectId, String effectId) {
            super(projectId, false, null);
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(effectId, "effectId");
            this.f4457t = projectId;
            this.nr = effectId;
        }

        public int hashCode() {
            return (this.f4457t.hashCode() * 31) + this.nr.hashCode();
        }

        @Override // JK.w6
        public String n() {
            return "Premiun effect : " + this.nr;
        }

        @Override // JK.w6
        public String rl() {
            return this.f4457t;
        }

        public String toString() {
            return "PremiumEffect(projectId=" + this.f4457t + ", effectId=" + this.nr + ")";
        }
    }

    public static final class j extends w6 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f4458t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && Intrinsics.areEqual(this.f4458t, ((j) obj).f4458t);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String projectId) {
            super(projectId, false, null);
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f4458t = projectId;
        }

        public int hashCode() {
            return this.f4458t.hashCode();
        }

        @Override // JK.w6
        public String n() {
            return "Advanced easing";
        }

        @Override // JK.w6
        public String rl() {
            return this.f4458t;
        }

        public String toString() {
            return "AdvancedEasing(projectId=" + this.f4458t + ")";
        }
    }

    public static final class n extends w6 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f4459t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f4459t, ((n) obj).f4459t);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String projectId) {
            super(projectId, false, null);
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f4459t = projectId;
        }

        public int hashCode() {
            return this.f4459t.hashCode();
        }

        @Override // JK.w6
        public String n() {
            return "Camera object";
        }

        @Override // JK.w6
        public String rl() {
            return this.f4459t;
        }

        public String toString() {
            return "CameraObject(projectId=" + this.f4459t + ")";
        }
    }

    /* JADX INFO: renamed from: JK.w6$w6, reason: collision with other inner class name */
    public static final class C0153w6 extends w6 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f4460t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0153w6) && Intrinsics.areEqual(this.f4460t, ((C0153w6) obj).f4460t);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0153w6(String projectId) {
            super(projectId, false, null);
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f4460t = projectId;
        }

        public int hashCode() {
            return this.f4460t.hashCode();
        }

        @Override // JK.w6
        public String n() {
            return "Layer parenting";
        }

        @Override // JK.w6
        public String rl() {
            return this.f4460t;
        }

        public String toString() {
            return "LayerParenting(projectId=" + this.f4460t + ")";
        }
    }

    public /* synthetic */ w6(String str, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z2);
    }

    public abstract String n();

    public abstract String rl();

    private w6(String str, boolean z2) {
        this.f4455n = str;
        this.rl = z2;
    }

    public final boolean t() {
        return this.rl;
    }

    public final String nr() {
        return rl() + " : " + n();
    }
}
