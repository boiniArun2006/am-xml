package androidx.privacysandbox.ads.adservices.adselection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon", f = "AdSelectionManagerImplCommon.kt", i = {}, l = {44}, m = "selectAds$suspendImpl", n = {}, s = {})
final class AdSelectionManagerImplCommon$selectAds$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f40753O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f40754n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ AdSelectionManagerImplCommon f40755t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdSelectionManagerImplCommon$selectAds$1(AdSelectionManagerImplCommon adSelectionManagerImplCommon, Continuation continuation) {
        super(continuation);
        this.f40755t = adSelectionManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40754n = obj;
        this.f40753O |= Integer.MIN_VALUE;
        return AdSelectionManagerImplCommon.az(this.f40755t, null, this);
    }
}
