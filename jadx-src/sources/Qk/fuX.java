package Qk;

import ScC.FuwU.XIvb;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.SceneType;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX {
    private final String J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f8250O;
    private final SceneType Uo;
    private final rWZ.n gh;
    private final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f8251n;
    private final int nr;
    private final File rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f8252t;
    private final ExportParams xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return Intrinsics.areEqual(this.f8251n, fux.f8251n) && Intrinsics.areEqual(this.rl, fux.rl) && this.f8252t == fux.f8252t && this.nr == fux.nr && Intrinsics.areEqual(this.f8250O, fux.f8250O) && Intrinsics.areEqual(this.J2, fux.J2) && this.Uo == fux.Uo && Intrinsics.areEqual(this.KN, fux.KN) && Intrinsics.areEqual(this.xMQ, fux.xMQ) && this.mUb == fux.mUb && Intrinsics.areEqual(this.gh, fux.gh);
    }

    public fuX(File data, File file, boolean z2, int i2, String str, String chooseDialogTitle, SceneType projectType, String projectId, ExportParams params, int i3, rWZ.n nVar) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(str, XIvb.jNbJBEdVmIYs);
        Intrinsics.checkNotNullParameter(chooseDialogTitle, "chooseDialogTitle");
        Intrinsics.checkNotNullParameter(projectType, "projectType");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f8251n = data;
        this.rl = file;
        this.f8252t = z2;
        this.nr = i2;
        this.f8250O = str;
        this.J2 = chooseDialogTitle;
        this.Uo = projectType;
        this.KN = projectId;
        this.xMQ = params;
        this.mUb = i3;
        this.gh = nVar;
    }

    public final ExportParams J2() {
        return this.xMQ;
    }

    public final SceneType KN() {
        return this.Uo;
    }

    public final String O() {
        return this.f8250O;
    }

    public final String Uo() {
        return this.KN;
    }

    public final int gh() {
        return this.mUb;
    }

    public int hashCode() {
        int iHashCode = this.f8251n.hashCode() * 31;
        File file = this.rl;
        int iHashCode2 = (((((((((((((((((iHashCode + (file == null ? 0 : file.hashCode())) * 31) + Boolean.hashCode(this.f8252t)) * 31) + Integer.hashCode(this.nr)) * 31) + this.f8250O.hashCode()) * 31) + this.J2.hashCode()) * 31) + this.Uo.hashCode()) * 31) + this.KN.hashCode()) * 31) + this.xMQ.hashCode()) * 31) + Integer.hashCode(this.mUb)) * 31;
        rWZ.n nVar = this.gh;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final File mUb() {
        return this.rl;
    }

    public final String n() {
        return this.J2;
    }

    public final boolean nr() {
        return this.f8252t;
    }

    public final File rl() {
        return this.f8251n;
    }

    public final rWZ.n t() {
        return this.gh;
    }

    public String toString() {
        return "BuildMediaResult(data=" + this.f8251n + ", saveToStorageTarget=" + this.rl + ", indexMedia=" + this.f8252t + ", saveCompleteMessage=" + this.nr + ", mimeType=" + this.f8250O + ", chooseDialogTitle=" + this.J2 + ", projectType=" + this.Uo + ", projectId=" + this.KN + ", params=" + this.xMQ + ", sceneTotalTime=" + this.mUb + ", exportSnapshot=" + this.gh + ")";
    }

    public final int xMQ() {
        return this.nr;
    }
}
