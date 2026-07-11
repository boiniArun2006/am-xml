package k9w;

import as.CN3;
import as.qz;
import as.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1016n f69743n;
    private final j rl;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CN3 f69745n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Sln.j f69746t;
        public static final C1015j nr = new C1015j(null);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final CN3 f69744O = new CN3(qz.rl(2), z.n(48000), null);

        /* JADX INFO: renamed from: k9w.n$j$j, reason: collision with other inner class name */
        public static final class C1015j {
            public /* synthetic */ C1015j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1015j() {
            }
        }

        public j(CN3 stream16BitProperties, int i2, Sln.j mimeType) {
            Intrinsics.checkNotNullParameter(stream16BitProperties, "stream16BitProperties");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.f69745n = stream16BitProperties;
            this.rl = i2;
            this.f69746t = mimeType;
            LRC.n.t(i2, "bit rate");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f69745n, jVar.f69745n) && this.rl == jVar.rl && this.f69746t == jVar.f69746t;
        }

        public int hashCode() {
            return (((this.f69745n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + this.f69746t.hashCode();
        }

        public final int n() {
            return this.rl;
        }

        public final Sln.j rl() {
            return this.f69746t;
        }

        public final CN3 t() {
            return this.f69745n;
        }

        public String toString() {
            return "Audio(stream16BitProperties=" + this.f69745n + ", bitRate=" + this.rl + ", mimeType=" + this.f69746t + ')';
        }

        public /* synthetic */ j(CN3 cn3, int i2, Sln.j jVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? f69744O : cn3, (i3 & 2) != 0 ? 192000 : i2, (i3 & 4) != 0 ? Sln.j.f9924n.n() : jVar);
        }
    }

    /* JADX INFO: renamed from: k9w.n$n, reason: collision with other inner class name */
    public static final class C1016n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final float f69747n;
        private final Sln.n nr;
        private final Oe.w6 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f69748t;

        public C1016n(float f3, Oe.w6 resolution, int i2, Sln.n mimeType) {
            Intrinsics.checkNotNullParameter(resolution, "resolution");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.f69747n = f3;
            this.rl = resolution;
            this.f69748t = i2;
            this.nr = mimeType;
            LRC.n.t(i2, "bit rate");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1016n)) {
                return false;
            }
            C1016n c1016n = (C1016n) obj;
            return Float.compare(this.f69747n, c1016n.f69747n) == 0 && Intrinsics.areEqual(this.rl, c1016n.rl) && this.f69748t == c1016n.f69748t && this.nr == c1016n.nr;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f69747n) * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f69748t)) * 31) + this.nr.hashCode();
        }

        public final int n() {
            return this.f69748t;
        }

        public final Oe.w6 nr() {
            return this.rl;
        }

        public final float rl() {
            return this.f69747n;
        }

        public final Sln.n t() {
            return this.nr;
        }

        public String toString() {
            return "Video(frameRate=" + this.f69747n + ", resolution=" + this.rl + ", bitRate=" + this.f69748t + ", mimeType=" + this.nr + ')';
        }

        public /* synthetic */ C1016n(float f3, Oe.w6 w6Var, int i2, Sln.n nVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(f3, w6Var, i2, (i3 & 8) != 0 ? Sln.n.f9927n.n() : nVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f69743n, nVar.f69743n) && Intrinsics.areEqual(this.rl, nVar.rl);
    }

    public n(C1016n video, j audio) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(audio, "audio");
        this.f69743n = video;
        this.rl = audio;
    }

    public int hashCode() {
        return (this.f69743n.hashCode() * 31) + this.rl.hashCode();
    }

    public final j n() {
        return this.rl;
    }

    public final C1016n rl() {
        return this.f69743n;
    }

    public String toString() {
        return "FMExportSettings(video=" + this.f69743n + ", audio=" + this.rl + ')';
    }
}
