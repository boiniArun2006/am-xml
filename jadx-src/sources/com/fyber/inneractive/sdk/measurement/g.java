package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f54052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f54053b;

    public g(List list, i iVar) {
        this.f54052a = list;
        this.f54053b = iVar;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f54052a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f54052a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f54053b.mReason)));
            }
        }
        return arrayList;
    }
}
