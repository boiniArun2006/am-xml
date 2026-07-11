package com.caoccao.javet.interop.options;

import com.caoccao.javet.interop.options.RuntimeOptions;
import com.caoccao.javet.utils.ArrayUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class RuntimeOptions<Options extends RuntimeOptions<Options>> {
    protected boolean createSnapshotEnabled = false;
    protected byte[] snapshotBlob = null;

    public byte[] getSnapshotBlob() {
        return this.snapshotBlob;
    }

    public boolean isCreateSnapshotEnabled() {
        return this.createSnapshotEnabled;
    }

    public RuntimeOptions<Options> setCreateSnapshotEnabled(boolean z2) {
        this.createSnapshotEnabled = z2;
        return this;
    }

    public RuntimeOptions<Options> setSnapshotBlob(byte[] bArr) {
        if (ArrayUtils.isEmpty(bArr)) {
            bArr = null;
        }
        this.snapshotBlob = bArr;
        return this;
    }
}
