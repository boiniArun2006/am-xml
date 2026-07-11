package Qk;

import com.alightcreative.app.motion.scene.ExportParams;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Dsr {
    public static final int $stable = 8;
    private final int appBuild;
    private final long exportDate;
    private final long exportElapsedMs;
    private final String exportHash;
    private final long exportSize;
    private final ExportParams params;
    private final String projectHash;
    private final String projectID;
    private final List<Long> shareDates;
    private final boolean watermark;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return Intrinsics.areEqual(this.projectID, dsr.projectID) && Intrinsics.areEqual(this.projectHash, dsr.projectHash) && Intrinsics.areEqual(this.exportHash, dsr.exportHash) && Intrinsics.areEqual(this.params, dsr.params) && this.exportDate == dsr.exportDate && Intrinsics.areEqual(this.shareDates, dsr.shareDates) && this.appBuild == dsr.appBuild && this.exportElapsedMs == dsr.exportElapsedMs && this.exportSize == dsr.exportSize && this.watermark == dsr.watermark;
    }

    public Dsr(String projectID, String projectHash, String exportHash, ExportParams params, long j2, List<Long> shareDates, int i2, long j3, long j4, boolean z2) {
        Intrinsics.checkNotNullParameter(projectID, "projectID");
        Intrinsics.checkNotNullParameter(projectHash, "projectHash");
        Intrinsics.checkNotNullParameter(exportHash, "exportHash");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(shareDates, "shareDates");
        this.projectID = projectID;
        this.projectHash = projectHash;
        this.exportHash = exportHash;
        this.params = params;
        this.exportDate = j2;
        this.shareDates = shareDates;
        this.appBuild = i2;
        this.exportElapsedMs = j3;
        this.exportSize = j4;
        this.watermark = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Dsr copy$default(Dsr dsr, String str, String str2, String str3, ExportParams exportParams, long j2, List list, int i2, long j3, long j4, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dsr.projectID;
        }
        return dsr.copy(str, (i3 & 2) != 0 ? dsr.projectHash : str2, (i3 & 4) != 0 ? dsr.exportHash : str3, (i3 & 8) != 0 ? dsr.params : exportParams, (i3 & 16) != 0 ? dsr.exportDate : j2, (i3 & 32) != 0 ? dsr.shareDates : list, (i3 & 64) != 0 ? dsr.appBuild : i2, (i3 & 128) != 0 ? dsr.exportElapsedMs : j3, (i3 & 256) != 0 ? dsr.exportSize : j4, (i3 & 512) != 0 ? dsr.watermark : z2);
    }

    public final String component1() {
        return this.projectID;
    }

    public final boolean component10() {
        return this.watermark;
    }

    public final String component2() {
        return this.projectHash;
    }

    public final String component3() {
        return this.exportHash;
    }

    public final ExportParams component4() {
        return this.params;
    }

    public final long component5() {
        return this.exportDate;
    }

    public final List<Long> component6() {
        return this.shareDates;
    }

    public final int component7() {
        return this.appBuild;
    }

    public final long component8() {
        return this.exportElapsedMs;
    }

    public final long component9() {
        return this.exportSize;
    }

    public final Dsr copy(String projectID, String projectHash, String exportHash, ExportParams params, long j2, List<Long> shareDates, int i2, long j3, long j4, boolean z2) {
        Intrinsics.checkNotNullParameter(projectID, "projectID");
        Intrinsics.checkNotNullParameter(projectHash, "projectHash");
        Intrinsics.checkNotNullParameter(exportHash, "exportHash");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(shareDates, "shareDates");
        return new Dsr(projectID, projectHash, exportHash, params, j2, shareDates, i2, j3, j4, z2);
    }

    public final int getAppBuild() {
        return this.appBuild;
    }

    public final long getExportDate() {
        return this.exportDate;
    }

    public final long getExportElapsedMs() {
        return this.exportElapsedMs;
    }

    public final String getExportHash() {
        return this.exportHash;
    }

    public final long getExportSize() {
        return this.exportSize;
    }

    public final ExportParams getParams() {
        return this.params;
    }

    public final String getProjectHash() {
        return this.projectHash;
    }

    public final String getProjectID() {
        return this.projectID;
    }

    public final List<Long> getShareDates() {
        return this.shareDates;
    }

    public final boolean getWatermark() {
        return this.watermark;
    }

    public int hashCode() {
        return (((((((((((((((((this.projectID.hashCode() * 31) + this.projectHash.hashCode()) * 31) + this.exportHash.hashCode()) * 31) + this.params.hashCode()) * 31) + Long.hashCode(this.exportDate)) * 31) + this.shareDates.hashCode()) * 31) + Integer.hashCode(this.appBuild)) * 31) + Long.hashCode(this.exportElapsedMs)) * 31) + Long.hashCode(this.exportSize)) * 31) + Boolean.hashCode(this.watermark);
    }

    public String toString() {
        return "ExportMetadata(projectID=" + this.projectID + ", projectHash=" + this.projectHash + ", exportHash=" + this.exportHash + ", params=" + this.params + ", exportDate=" + this.exportDate + ", shareDates=" + this.shareDates + ", appBuild=" + this.appBuild + ", exportElapsedMs=" + this.exportElapsedMs + ", exportSize=" + this.exportSize + ", watermark=" + this.watermark + ")";
    }
}
