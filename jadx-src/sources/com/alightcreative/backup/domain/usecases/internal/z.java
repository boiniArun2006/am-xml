package com.alightcreative.backup.domain.usecases.internal;

import com.alightcreative.account.CloudBenefitValues;
import com.alightcreative.account.CloudStorageStatus;
import java.util.Set;
import kgE.K;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class z implements wtO.I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kgE.fuX f46585n;

    public z(kgE.fuX iapManager) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.f46585n = iapManager;
    }

    @Override // wtO.I28
    public long n() {
        long allowedStorage;
        Set setUo = this.f46585n.Uo();
        CloudBenefitValues cloudBenefitValues = (CloudBenefitValues) this.f46585n.Z().getValue();
        if (cloudBenefitValues != null) {
            allowedStorage = setUo.contains(K.Xw) ? cloudBenefitValues.getHighTier() : setUo.contains(K.f70081v) ? cloudBenefitValues.getLowTier() : cloudBenefitValues.getDefault();
        } else {
            CloudStorageStatus cloudStorageStatus = (CloudStorageStatus) this.f46585n.o().getValue();
            allowedStorage = cloudStorageStatus != null ? cloudStorageStatus.getAllowedStorage() : 0L;
        }
        return XFr.j.J2(allowedStorage);
    }
}
