package androidx.credentials.provider.utils;

import android.app.slice.Slice;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.CredentialEntry;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract /* synthetic */ class qf {
    public static /* synthetic */ CredentialEntry n(BeginGetCredentialOption beginGetCredentialOption, Slice slice) {
        return new CredentialEntry(beginGetCredentialOption, slice);
    }
}
