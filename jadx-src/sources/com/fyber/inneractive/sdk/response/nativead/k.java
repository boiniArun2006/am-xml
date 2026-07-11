package com.fyber.inneractive.sdk.response.nativead;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class k extends com.fyber.inneractive.sdk.response.e {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public i f56909K;

    @Override // com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar) {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.e
    public final InneractiveErrorCode b() {
        return null;
    }

    public final e c() {
        ArrayList<f> arrayList;
        i iVar = this.f56909K;
        if (iVar == null || (arrayList = iVar.f56903a) == null) {
            fVar = null;
        } else {
            for (f fVar : arrayList) {
                if (fVar.f56892c != null) {
                    break;
                }
            }
            fVar = null;
        }
        if (fVar != null) {
            return fVar.f56892c;
        }
        return null;
    }

    public final boolean d() {
        String str;
        e eVarC = c();
        if (eVarC != null && (str = eVarC.f56889a) != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }
}
