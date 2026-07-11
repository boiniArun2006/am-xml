package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/alightcreative/app/motion/scene/ExportOutcome;", "", "LICC/qz;", "peakMediaUsage", "", MRAIDPresenter.ERROR, "<init>", "(LICC/qz;Ljava/lang/Throwable;)V", "component1", "()LICC/qz;", "component2", "()Ljava/lang/Throwable;", "copy", "(LICC/qz;Ljava/lang/Throwable;)Lcom/alightcreative/app/motion/scene/ExportOutcome;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "LICC/qz;", "getPeakMediaUsage", "Ljava/lang/Throwable;", "getError", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExportOutcome {
    public static final int $stable = 8;
    private final Throwable error;
    private final ICC.qz peakMediaUsage;

    public ExportOutcome(ICC.qz qzVar, Throwable th) {
        this.peakMediaUsage = qzVar;
        this.error = th;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExportOutcome)) {
            return false;
        }
        ExportOutcome exportOutcome = (ExportOutcome) other;
        return Intrinsics.areEqual(this.peakMediaUsage, exportOutcome.peakMediaUsage) && Intrinsics.areEqual(this.error, exportOutcome.error);
    }

    public int hashCode() {
        ICC.qz qzVar = this.peakMediaUsage;
        int iHashCode = (qzVar == null ? 0 : qzVar.hashCode()) * 31;
        Throwable th = this.error;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "ExportOutcome(peakMediaUsage=" + this.peakMediaUsage + ", error=" + this.error + ")";
    }

    public static /* synthetic */ ExportOutcome copy$default(ExportOutcome exportOutcome, ICC.qz qzVar, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            qzVar = exportOutcome.peakMediaUsage;
        }
        if ((i2 & 2) != 0) {
            th = exportOutcome.error;
        }
        return exportOutcome.copy(qzVar, th);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ICC.qz getPeakMediaUsage() {
        return this.peakMediaUsage;
    }

    public final ExportOutcome copy(ICC.qz peakMediaUsage, Throwable error) {
        return new ExportOutcome(peakMediaUsage, error);
    }

    public final Throwable getError() {
        return this.error;
    }

    public final ICC.qz getPeakMediaUsage() {
        return this.peakMediaUsage;
    }

    public /* synthetic */ ExportOutcome(ICC.qz qzVar, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(qzVar, (i2 & 2) != 0 ? null : th);
    }
}
