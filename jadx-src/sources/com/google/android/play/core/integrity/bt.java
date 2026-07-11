package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f59531a;

    bt(bn bnVar) {
        this.f59531a = bnVar;
    }

    final /* synthetic */ Task a(long j2, long j3, int i2, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f59531a.d(standardIntegrityTokenRequest.a(), j2, j3, 0);
    }
}
