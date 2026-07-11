package zd;

import android.net.Uri;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import tu.Ew;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TextureCropMode f76709O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f76710n;
    private final long nr;
    private final Uri rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76711t;

    public static final class j extends Ml {
        private final Uri J2;
        private final Uri KN;
        private final long Uo;
        private final TextureCropMode xMQ;

        public /* synthetic */ j(Uri uri, long j2, Uri uri2, TextureCropMode textureCropMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, j2, uri2, (i2 & 8) != 0 ? TextureCropMode.FILL : textureCropMode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.J2, jVar.J2) && this.Uo == jVar.Uo && Intrinsics.areEqual(this.KN, jVar.KN) && this.xMQ == jVar.xMQ;
        }

        @Override // zd.Ml
        public Uri O() {
            return this.J2;
        }

        public int hashCode() {
            return (((((this.J2.hashCode() * 31) + Long.hashCode(this.Uo)) * 31) + this.KN.hashCode()) * 31) + this.xMQ.hashCode();
        }

        @Override // zd.Ml
        public long n() {
            return this.Uo;
        }

        @Override // zd.Ml
        public TextureCropMode nr() {
            return this.xMQ;
        }

        @Override // zd.Ml
        public Uri t() {
            return this.KN;
        }

        public String toString() {
            return "TemplateImportPreviewImage(uri=" + this.J2 + ", duration=" + this.Uo + ", originalUri=" + this.KN + ", textureCropMode=" + this.xMQ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Uri uri, long j2, Uri originalUri, TextureCropMode textureCropMode) {
            super(uri, originalUri, 2131231816, j2, textureCropMode, null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(originalUri, "originalUri");
            Intrinsics.checkNotNullParameter(textureCropMode, "textureCropMode");
            this.J2 = uri;
            this.Uo = j2;
            this.KN = originalUri;
            this.xMQ = textureCropMode;
        }
    }

    public static final class n extends Ml {
        private final Uri J2;
        private final Uri KN;
        private final long Uo;
        private final TextureCropMode xMQ;

        public /* synthetic */ n(Uri uri, long j2, Uri uri2, TextureCropMode textureCropMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, j2, uri2, (i2 & 8) != 0 ? TextureCropMode.FILL : textureCropMode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.J2, nVar.J2) && this.Uo == nVar.Uo && Intrinsics.areEqual(this.KN, nVar.KN) && this.xMQ == nVar.xMQ;
        }

        @Override // zd.Ml
        public Uri O() {
            return this.J2;
        }

        public int hashCode() {
            return (((((this.J2.hashCode() * 31) + Long.hashCode(this.Uo)) * 31) + this.KN.hashCode()) * 31) + this.xMQ.hashCode();
        }

        @Override // zd.Ml
        public long n() {
            return this.Uo;
        }

        @Override // zd.Ml
        public TextureCropMode nr() {
            return this.xMQ;
        }

        @Override // zd.Ml
        public Uri t() {
            return this.KN;
        }

        public String toString() {
            return "TemplateImportPreviewVideo(uri=" + this.J2 + ", duration=" + this.Uo + ", originalUri=" + this.KN + ", textureCropMode=" + this.xMQ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Uri uri, long j2, Uri originalUri, TextureCropMode textureCropMode) {
            super(uri, originalUri, 2131231818, j2, textureCropMode, null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(originalUri, "originalUri");
            Intrinsics.checkNotNullParameter(textureCropMode, "textureCropMode");
            this.J2 = uri;
            this.Uo = j2;
            this.KN = originalUri;
            this.xMQ = textureCropMode;
        }
    }

    public /* synthetic */ Ml(Uri uri, Uri uri2, int i2, long j2, TextureCropMode textureCropMode, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, uri2, i2, j2, textureCropMode);
    }

    public abstract Uri O();

    public abstract long n();

    public abstract TextureCropMode nr();

    public abstract Uri t();

    private Ml(Uri uri, Uri uri2, int i2, long j2, TextureCropMode textureCropMode) {
        this.f76710n = uri;
        this.rl = uri2;
        this.f76711t = i2;
        this.nr = j2;
        this.f76709O = textureCropMode;
    }

    public final Ew J2() {
        if (this instanceof j) {
            return Ew.J2;
        }
        if (this instanceof n) {
            return Ew.f73884r;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int rl() {
        return this.f76711t;
    }
}
