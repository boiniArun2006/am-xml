package LM;

import ep.oxM.esLNYym;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class aC {
    private final int J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f6010O;
    private final int Uo;
    private final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f6011n;
    private final List nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f6012t;
    private final int xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aC)) {
            return false;
        }
        aC aCVar = (aC) obj;
        return this.f6011n == aCVar.f6011n && Intrinsics.areEqual(this.rl, aCVar.rl) && Intrinsics.areEqual(this.f6012t, aCVar.f6012t) && Intrinsics.areEqual(this.nr, aCVar.nr) && this.f6010O == aCVar.f6010O && this.J2 == aCVar.J2 && this.Uo == aCVar.Uo && this.KN == aCVar.KN && this.xMQ == aCVar.xMQ && this.mUb == aCVar.mUb;
    }

    public aC(int i2, List importedSceneIds, List importedElementIds, List importedPresetIds, int i3, int i5, int i7, int i8, int i9, int i10) {
        Intrinsics.checkNotNullParameter(importedSceneIds, "importedSceneIds");
        Intrinsics.checkNotNullParameter(importedElementIds, "importedElementIds");
        Intrinsics.checkNotNullParameter(importedPresetIds, "importedPresetIds");
        this.f6011n = i2;
        this.rl = importedSceneIds;
        this.f6012t = importedElementIds;
        this.nr = importedPresetIds;
        this.f6010O = i3;
        this.J2 = i5;
        this.Uo = i7;
        this.KN = i8;
        this.xMQ = i9;
        this.mUb = i10;
    }

    public final int J2() {
        return this.f6010O;
    }

    public final int KN() {
        return this.mUb;
    }

    public final List O() {
        return this.rl;
    }

    public final int Uo() {
        return this.f6010O + this.J2 + this.xMQ + this.KN;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f6011n) * 31) + this.rl.hashCode()) * 31) + this.f6012t.hashCode()) * 31) + this.nr.hashCode()) * 31) + Integer.hashCode(this.f6010O)) * 31) + Integer.hashCode(this.J2)) * 31) + Integer.hashCode(this.Uo)) * 31) + Integer.hashCode(this.KN)) * 31) + Integer.hashCode(this.xMQ)) * 31) + Integer.hashCode(this.mUb);
    }

    public final int n() {
        return this.Uo;
    }

    public final List nr() {
        return this.nr;
    }

    public final int rl() {
        return this.xMQ;
    }

    public final List t() {
        return this.f6012t;
    }

    public String toString() {
        return "ProjectImportResult(importFailCount=" + this.f6011n + ", importedSceneIds=" + this.rl + ", importedElementIds=" + this.f6012t + esLNYym.GcHQy + this.nr + ", missingMediaCount=" + this.f6010O + ", sampleMediaCount=" + this.J2 + ", audioCount=" + this.Uo + ", videoCount=" + this.KN + ", imageCount=" + this.xMQ + ", otherCount=" + this.mUb + ")";
    }

    public final int xMQ() {
        return this.KN;
    }
}
