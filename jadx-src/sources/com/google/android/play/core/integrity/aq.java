package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class aq extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f59468b;

    aq(String str, y yVar) {
        this.f59467a = str;
        this.f59468b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f59467a;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i2) {
        return this.f59468b.a(activity, i2);
    }
}
