package com.firebase.ui.auth.data.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.firebase.ui.auth.IdpResponse;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class FirebaseAuthUIAuthenticationResult {

    @Nullable
    private final IdpResponse idpResponse;

    @NonNull
    private final Integer resultCode;

    @Nullable
    public IdpResponse getIdpResponse() {
        return this.idpResponse;
    }

    @NonNull
    public Integer getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        IdpResponse idpResponse = this.idpResponse;
        return ((idpResponse == null ? 0 : idpResponse.hashCode()) * 31) + this.resultCode.hashCode();
    }

    public String toString() {
        return "FirebaseAuthUIAuthenticationResult{idpResponse=" + this.idpResponse + ", resultCode='" + this.resultCode + '}';
    }

    public FirebaseAuthUIAuthenticationResult(@NonNull Integer num, @Nullable IdpResponse idpResponse) {
        this.idpResponse = idpResponse;
        this.resultCode = num;
    }
}
