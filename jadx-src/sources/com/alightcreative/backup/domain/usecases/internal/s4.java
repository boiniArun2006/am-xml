package com.alightcreative.backup.domain.usecases.internal;

import com.alightcreative.account.CloudStorageStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class s4 implements wtO.fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kgE.fuX f46584n;
    private final wtO.I28 rl;

    public s4(kgE.fuX iapManager, wtO.I28 getAllowedStorageUseCase) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(getAllowedStorageUseCase, "getAllowedStorageUseCase");
        this.f46584n = iapManager;
        this.rl = getAllowedStorageUseCase;
    }

    @Override // wtO.fuX
    public boolean n(long j2) {
        CloudStorageStatus cloudStorageStatus = (CloudStorageStatus) this.f46584n.o().getValue();
        if (cloudStorageStatus != null && cloudStorageStatus.getAvailableStorage() > j2) {
            return true;
        }
        long jN = this.rl.n();
        CloudStorageStatus cloudStorageStatus2 = (CloudStorageStatus) this.f46584n.o().getValue();
        return jN >= (cloudStorageStatus2 != null ? cloudStorageStatus2.getUsedStorage() : 0L) + j2;
    }
}
