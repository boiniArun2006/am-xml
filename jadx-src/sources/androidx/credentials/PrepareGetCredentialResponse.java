package androidx.credentials;

import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RequiresApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001:\u0003\"#$Bc\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\b\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\u0004\u0018\u0001`\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000e\u0010!¨\u0006%"}, d2 = {"Landroidx/credentials/PrepareGetCredentialResponse;", "", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "pendingGetCredentialHandle", "Lkotlin/Function0;", "", "Landroidx/credentials/HasRemoteResultsDelegate;", "hasRemoteResultsDelegate", "Landroidx/credentials/HasAuthenticationResultsDelegate;", "hasAuthResultsDelegate", "Lkotlin/Function1;", "", "Landroidx/credentials/HasCredentialResultsDelegate;", "credentialTypeDelegate", "isNullHandlesForTest", "<init>", "(Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "getPendingGetCredentialHandle", "()Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "rl", "Lkotlin/jvm/functions/Function0;", "getHasRemoteResultsDelegate", "()Lkotlin/jvm/functions/Function0;", "t", "getHasAuthResultsDelegate", "nr", "Lkotlin/jvm/functions/Function1;", "getCredentialTypeDelegate", "()Lkotlin/jvm/functions/Function1;", "O", "Z", "()Z", "Builder", "PendingGetCredentialHandle", "TestBuilder", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PrepareGetCredentialResponse {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullHandlesForTest;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final PendingGetCredentialHandle pendingGetCredentialHandle;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function1 credentialTypeDelegate;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 hasRemoteResultsDelegate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function0 hasAuthResultsDelegate;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aj\u0004\u0018\u0001`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001dR*\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\"j\u0004\u0018\u0001`#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010&¨\u0006("}, d2 = {"Landroidx/credentials/PrepareGetCredentialResponse$Builder;", "", "<init>", "()V", "", "credentialType", "", "J2", "(Ljava/lang/String;)Z", "O", "()Z", "Uo", "Landroid/credentials/PrepareGetCredentialResponse;", "resp", "KN", "(Landroid/credentials/PrepareGetCredentialResponse;)Landroidx/credentials/PrepareGetCredentialResponse$Builder;", "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "handle", "xMQ", "(Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;)Landroidx/credentials/PrepareGetCredentialResponse$Builder;", "Landroidx/credentials/PrepareGetCredentialResponse;", "nr", "()Landroidx/credentials/PrepareGetCredentialResponse;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "pendingGetCredentialHandle", "Lkotlin/Function0;", "Landroidx/credentials/HasRemoteResultsDelegate;", "rl", "Lkotlin/jvm/functions/Function0;", "hasRemoteResultsDelegate", "Landroidx/credentials/HasAuthenticationResultsDelegate;", "t", "hasAuthResultsDelegate", "Lkotlin/Function1;", "Landroidx/credentials/HasCredentialResultsDelegate;", "Lkotlin/jvm/functions/Function1;", "hasCredentialResultsDelegate", "Landroid/credentials/PrepareGetCredentialResponse;", "frameworkResponse", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static final class Builder {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private android.credentials.PrepareGetCredentialResponse frameworkResponse;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private PendingGetCredentialHandle pendingGetCredentialHandle;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private Function1 hasCredentialResultsDelegate;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private Function0 hasRemoteResultsDelegate;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private Function0 hasAuthResultsDelegate;

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean J2(String credentialType) {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            Intrinsics.checkNotNull(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasCredentialResults(credentialType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean O() {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            Intrinsics.checkNotNull(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasAuthenticationResults();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean Uo() {
            android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse = this.frameworkResponse;
            Intrinsics.checkNotNull(prepareGetCredentialResponse);
            return prepareGetCredentialResponse.hasRemoteResults();
        }

        public final Builder KN(android.credentials.PrepareGetCredentialResponse resp) {
            this.frameworkResponse = resp;
            if (resp != null) {
                this.hasCredentialResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(this);
                this.hasAuthResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$2(this);
                this.hasRemoteResultsDelegate = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$3(this);
            }
            return this;
        }

        public final PrepareGetCredentialResponse nr() {
            return new PrepareGetCredentialResponse(this.pendingGetCredentialHandle, this.hasRemoteResultsDelegate, this.hasAuthResultsDelegate, this.hasCredentialResultsDelegate, false, null);
        }

        public final Builder xMQ(PendingGetCredentialHandle handle) {
            Intrinsics.checkNotNullParameter(handle, "handle");
            this.pendingGetCredentialHandle = handle;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/PrepareGetCredentialResponse$TestBuilder;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @VisibleForTesting
    public static final class TestBuilder {
    }

    public /* synthetic */ PrepareGetCredentialResponse(PendingGetCredentialHandle pendingGetCredentialHandle, Function0 function0, Function0 function02, Function1 function1, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(pendingGetCredentialHandle, function0, function02, function1, z2);
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "", "Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "frameworkHandle", "<init>", "(Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "getFrameworkHandle", "()Landroid/credentials/PrepareGetCredentialResponse$PendingGetCredentialHandle;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PendingGetCredentialHandle {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final PrepareGetCredentialResponse.PendingGetCredentialHandle frameworkHandle;

        public PendingGetCredentialHandle(PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle) {
            this.frameworkHandle = pendingGetCredentialHandle;
            if (Build.VERSION.SDK_INT >= 34) {
                Intrinsics.checkNotNull(pendingGetCredentialHandle);
            }
        }
    }

    private PrepareGetCredentialResponse(PendingGetCredentialHandle pendingGetCredentialHandle, Function0 function0, Function0 function02, Function1 function1, boolean z2) {
        this.pendingGetCredentialHandle = pendingGetCredentialHandle;
        this.hasRemoteResultsDelegate = function0;
        this.hasAuthResultsDelegate = function02;
        this.credentialTypeDelegate = function1;
        this.isNullHandlesForTest = z2;
        if (Build.VERSION.SDK_INT < 34 || z2) {
            return;
        }
        Intrinsics.checkNotNull(pendingGetCredentialHandle);
    }
}
