package com.google.android.play.core.integrity;

import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Long f59465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Object f59466c = null;

    /* synthetic */ ao(String str, Long l2, Object obj, an anVar) {
        this.f59464a = str;
        this.f59465b = l2;
    }

    @ChecksSdkIntAtLeast
    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    @Nullable
    public final Long cloudProjectNumber() {
        return this.f59465b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z2;
        Long l2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            z2 = this.f59464a.equals(integrityTokenRequest.nonce()) && ((l2 = this.f59465b) != null ? l2.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null);
        }
        if (!(obj instanceof ao) || !a()) {
            return z2;
        }
        ao aoVar = (ao) obj;
        if (!z2) {
            return false;
        }
        Object obj2 = aoVar.f59466c;
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f59464a;
    }

    public final int hashCode() {
        int iHashCode = this.f59464a.hashCode() ^ 1000003;
        Long l2 = this.f59465b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l2 == null ? 0 : l2.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f59464a + ", cloudProjectNumber=" + this.f59465b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
