package com.alightcreative.app.motion.project;

import Fg.afx;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.app.motion.scene.SceneType;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002$%B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010\u0082\u0001\u0002&'¨\u0006("}, d2 = {"Lcom/alightcreative/app/motion/project/ProjectInfo;", "", "<init>", "()V", "", "isTemplate", "()Z", "isXml", "", "getId", "()Ljava/lang/String;", "id", "getTitle", "title", "", "getWidth", "()I", "width", "getHeight", "height", "getDuration", "duration", "getFphs", "fphs", "", "getLastModified", "()J", "lastModified", "getFileSize", "fileSize", "Lcom/alightcreative/app/motion/scene/SceneType;", "getType", "()Lcom/alightcreative/app/motion/scene/SceneType;", "type", "getFfVer", "ffVer", c.f62177j, "j", "Lcom/alightcreative/app/motion/project/ProjectInfo$j;", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProjectInfo {
    public static final int $stable = 0;

    public static final class j extends ProjectInfo {
        private final int J2;
        private final long KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f45877O;
        private final long Uo;
        private final String gh;
        private final int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f45878n;
        private final int nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f45879t;
        private final SceneType xMQ;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f45878n, jVar.f45878n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f45879t == jVar.f45879t && this.nr == jVar.nr && this.f45877O == jVar.f45877O && this.J2 == jVar.J2 && this.Uo == jVar.Uo && this.KN == jVar.KN && this.xMQ == jVar.xMQ && this.mUb == jVar.mUb && Intrinsics.areEqual(this.gh, jVar.gh);
        }

        public int hashCode() {
            return (((((((((((((((((((this.f45878n.hashCode() * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f45879t)) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f45877O)) * 31) + Integer.hashCode(this.J2)) * 31) + Long.hashCode(this.Uo)) * 31) + Long.hashCode(this.KN)) * 31) + this.xMQ.hashCode()) * 31) + Integer.hashCode(this.mUb)) * 31) + this.gh.hashCode();
        }

        public String toString() {
            return "Cloud(id=" + this.f45878n + ", title=" + this.rl + ", width=" + this.f45879t + ", height=" + this.nr + ", duration=" + this.f45877O + ", fphs=" + this.J2 + ", lastModified=" + this.Uo + ", fileSize=" + this.KN + ", type=" + this.xMQ + ", ffVer=" + this.mUb + ", thumbnailUrl=" + this.gh + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String id, String title, int i2, int i3, int i5, int i7, long j2, long j3, SceneType type, int i8, String thumbnailUrl) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
            this.f45878n = id;
            this.rl = title;
            this.f45879t = i2;
            this.nr = i3;
            this.f45877O = i5;
            this.J2 = i7;
            this.Uo = j2;
            this.KN = j3;
            this.xMQ = type;
            this.mUb = i8;
            this.gh = thumbnailUrl;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public int getDuration() {
            return this.f45877O;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public int getFfVer() {
            return this.mUb;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public long getFileSize() {
            return this.KN;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public int getFphs() {
            return this.J2;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public int getHeight() {
            return this.nr;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public String getId() {
            return this.f45878n;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public long getLastModified() {
            return this.Uo;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public String getTitle() {
            return this.rl;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public SceneType getType() {
            return this.xMQ;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public int getWidth() {
            return this.f45879t;
        }

        public final String n() {
            return this.gh;
        }
    }

    public static final class n extends ProjectInfo {
        private final int J2;
        private final long KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f45880O;
        private final long Uo;
        private final int gh;
        private final long mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f45881n;
        private final int nr;
        private final String qie;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f45882t;
        private final SceneType xMQ;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f45881n, nVar.f45881n) && Intrinsics.areEqual(this.rl, nVar.rl) && this.f45882t == nVar.f45882t && this.nr == nVar.nr && this.f45880O == nVar.f45880O && this.J2 == nVar.J2 && this.Uo == nVar.Uo && this.KN == nVar.KN && this.xMQ == nVar.xMQ && this.mUb == nVar.mUb && this.gh == nVar.gh && Intrinsics.areEqual(this.qie, nVar.qie);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((this.f45881n.hashCode() * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f45882t)) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f45880O)) * 31) + Integer.hashCode(this.J2)) * 31) + Long.hashCode(this.Uo)) * 31) + Long.hashCode(this.KN)) * 31) + this.xMQ.hashCode()) * 31) + Long.hashCode(this.mUb)) * 31) + Integer.hashCode(this.gh)) * 31;
            String str = this.qie;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Local(id=" + this.f45881n + ", title=" + this.rl + ", width=" + this.f45882t + ", height=" + this.nr + ", duration=" + this.f45880O + ", fphs=" + this.J2 + ", lastModified=" + this.Uo + ", fileSize=" + this.KN + ", type=" + this.xMQ + ", allDependencyMediaSize=" + this.mUb + ", ffVer=" + this.gh + ", templateLink=" + this.qie + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String id, String title, int i2, int i3, int i5, int i7, long j2, long j3, SceneType type, long j4, int i8, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f45881n = id;
            this.rl = title;
            this.f45882t = i2;
            this.nr = i3;
            this.f45880O = i5;
            this.J2 = i7;
            this.Uo = j2;
            this.KN = j3;
            this.xMQ = type;
            this.mUb = j4;
            this.gh = i8;
            this.qie = str;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public int getDuration() {
            return this.f45880O;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public int getFfVer() {
            return this.gh;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public long getFileSize() {
            return this.KN;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public int getFphs() {
            return this.J2;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public int getHeight() {
            return this.nr;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public String getId() {
            return this.f45881n;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public long getLastModified() {
            return this.Uo;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public String getTitle() {
            return this.rl;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public SceneType getType() {
            return this.xMQ;
        }

        @Override // com.alightcreative.app.motion.project.ProjectInfo
        public int getWidth() {
            return this.f45882t;
        }

        public final long n() {
            return this.mUb;
        }

        public final String rl() {
            return this.qie;
        }
    }

    public /* synthetic */ ProjectInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getDuration();

    public abstract int getFfVer();

    public abstract long getFileSize();

    public abstract int getFphs();

    public abstract int getHeight();

    public abstract String getId();

    public abstract long getLastModified();

    public abstract String getTitle();

    public abstract SceneType getType();

    public abstract int getWidth();

    private ProjectInfo() {
    }

    public final boolean isTemplate() {
        if (!(this instanceof n)) {
            return false;
        }
        n nVar = (n) this;
        return (nVar.rl() == null || nVar.getType() == SceneType.PRESET) ? false : true;
    }

    public final boolean isXml() {
        if (!(this instanceof n)) {
            return false;
        }
        n nVar = (n) this;
        return (nVar.rl() == null || nVar.getType() == SceneType.PRESET || afx.p5(nVar.rl()) != null) ? false : true;
    }
}
