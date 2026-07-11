package androidx.credentials.provider;

import android.credentials.CredentialOption;
import android.os.Bundle;
import androidx.credentials.CredentialOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/credentials/CredentialOption;", "kotlin.jvm.PlatformType", "option", "Landroidx/credentials/CredentialOption;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/credentials/CredentialOption;)Landroidx/credentials/CredentialOption;"}, k = 3, mv = {1, 8, 0})
final class PendingIntentHandler$Companion$retrieveProviderGetCredentialRequest$1 extends Lambda implements Function1<CredentialOption, androidx.credentials.CredentialOption> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PendingIntentHandler$Companion$retrieveProviderGetCredentialRequest$1 f37273n = new PendingIntentHandler$Companion$retrieveProviderGetCredentialRequest$1();

    PendingIntentHandler$Companion$retrieveProviderGetCredentialRequest$1() {
        super(1);
    }

    public final androidx.credentials.CredentialOption n(CredentialOption credentialOption) {
        CredentialOption.Companion companion = androidx.credentials.CredentialOption.INSTANCE;
        String type = credentialOption.getType();
        Intrinsics.checkNotNullExpressionValue(type, "option.type");
        Bundle credentialRetrievalData = credentialOption.getCredentialRetrievalData();
        Intrinsics.checkNotNullExpressionValue(credentialRetrievalData, "option.credentialRetrievalData");
        Bundle candidateQueryData = credentialOption.getCandidateQueryData();
        Intrinsics.checkNotNullExpressionValue(candidateQueryData, "option.candidateQueryData");
        boolean zIsSystemProviderRequired = credentialOption.isSystemProviderRequired();
        Set allowedProviders = credentialOption.getAllowedProviders();
        Intrinsics.checkNotNullExpressionValue(allowedProviders, "option.allowedProviders");
        return companion.n(type, credentialRetrievalData, candidateQueryData, zIsSystemProviderRequired, allowedProviders);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ androidx.credentials.CredentialOption invoke(android.credentials.CredentialOption credentialOption) {
        return n(r.n(credentialOption));
    }
}
