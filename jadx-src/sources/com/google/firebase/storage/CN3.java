package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class CN3 implements Runnable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private O6.w6 f60831O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o f60832n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TaskCompletionSource f60833t;

    private Uri n(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("downloadTokens");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        String str = strOptString.split(",", -1)[0];
        Uri.Builder builderBuildUpon = this.f60832n.HI().t().buildUpon();
        builderBuildUpon.appendQueryParameter("alt", "media");
        builderBuildUpon.appendQueryParameter("token", str);
        return builderBuildUpon.build();
    }

    @Override // java.lang.Runnable
    public void run() {
        X3O.n nVar = new X3O.n(this.f60832n.HI(), this.f60832n.J2());
        this.f60831O.nr(nVar);
        Uri uriN = nVar.S() ? n(nVar.ty()) : null;
        TaskCompletionSource taskCompletionSource = this.f60833t;
        if (taskCompletionSource != null) {
            nVar.n(taskCompletionSource, uriN);
        }
    }

    CN3(o oVar, TaskCompletionSource taskCompletionSource) {
        Preconditions.checkNotNull(oVar);
        Preconditions.checkNotNull(taskCompletionSource);
        this.f60832n = oVar;
        this.f60833t = taskCompletionSource;
        if (!oVar.az().mUb().equals(oVar.mUb())) {
            I28 i28Ty = this.f60832n.ty();
            this.f60831O = new O6.w6(i28Ty.n().qie(), i28Ty.t(), i28Ty.rl(), i28Ty.qie());
            return;
        }
        throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
    }
}
