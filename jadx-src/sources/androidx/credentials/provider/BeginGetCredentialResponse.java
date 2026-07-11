package androidx.credentials.provider;

import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00152\u00020\u0001:\u0003\u0016\u0017\u0018BC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse;", "", "", "Landroidx/credentials/provider/CredentialEntry;", "credentialEntries", "Landroidx/credentials/provider/Action;", "actions", "Landroidx/credentials/provider/AuthenticationAction;", "authenticationActions", "Landroidx/credentials/provider/RemoteEntry;", "remoteEntry", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/credentials/provider/RemoteEntry;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/util/List;", "t", "()Ljava/util/List;", "rl", "nr", "Landroidx/credentials/provider/RemoteEntry;", "()Landroidx/credentials/provider/RemoteEntry;", "O", "Api34Impl", "Builder", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BeginGetCredentialResponse {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List credentialEntries;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final RemoteEntry remoteEntry;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final List actions;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List authenticationActions;

    @RequiresApi
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Api34Impl;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "response", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginGetCredentialResponse;)V", "rl", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialResponse;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api34Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api34Impl f37245n = new Api34Impl();

        @JvmStatic
        @DoNotInline
        public static final void n(Bundle bundle, BeginGetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(response, "response");
            bundle.putParcelable("androidx.credentials.provider.BeginGetCredentialResponse", BeginGetCredentialUtil.INSTANCE.ty(response));
        }

        @JvmStatic
        @DoNotInline
        public static final BeginGetCredentialResponse rl(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            android.service.credentials.BeginGetCredentialResponse beginGetCredentialResponse = (android.service.credentials.BeginGetCredentialResponse) bundle.getParcelable("androidx.credentials.provider.BeginGetCredentialResponse", android.service.credentials.BeginGetCredentialResponse.class);
            if (beginGetCredentialResponse != null) {
                return BeginGetCredentialUtil.INSTANCE.Ik(beginGetCredentialResponse);
            }
            return null;
        }

        private Api34Impl() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialResponse$Builder;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    public BeginGetCredentialResponse(List credentialEntries, List actions, List authenticationActions, RemoteEntry remoteEntry) {
        Intrinsics.checkNotNullParameter(credentialEntries, "credentialEntries");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(authenticationActions, "authenticationActions");
        this.credentialEntries = credentialEntries;
        this.actions = actions;
        this.authenticationActions = authenticationActions;
        this.remoteEntry = remoteEntry;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final RemoteEntry getRemoteEntry() {
        return this.remoteEntry;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final List getAuthenticationActions() {
        return this.authenticationActions;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List getCredentialEntries() {
        return this.credentialEntries;
    }
}
