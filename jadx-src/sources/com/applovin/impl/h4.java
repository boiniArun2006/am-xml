package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f48654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f48655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48656c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h4 h4Var = (h4) obj;
            View view = this.f48654a;
            if (view == null ? h4Var.f48654a != null : !view.equals(h4Var.f48654a)) {
                return false;
            }
            if (this.f48655b != h4Var.f48655b) {
                return false;
            }
            String str = this.f48656c;
            String str2 = h4Var.f48656c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public String a() {
        return this.f48656c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f48655b;
    }

    public View c() {
        return this.f48654a;
    }

    public int hashCode() {
        View view = this.f48654a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f48655b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f48656c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public h4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f48654a = view;
        this.f48655b = friendlyObstructionPurpose;
        this.f48656c = str;
    }
}
