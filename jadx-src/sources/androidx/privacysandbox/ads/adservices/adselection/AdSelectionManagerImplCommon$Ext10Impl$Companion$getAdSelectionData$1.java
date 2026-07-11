package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", f = "AdSelectionManagerImplCommon.kt", i = {0, 0}, l = {231}, m = "getAdSelectionData", n = {"adSelectionManager", "getAdSelectionDataRequest"}, s = {"L$0", "L$1"})
final class AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 extends ContinuationImpl {
    final /* synthetic */ AdSelectionManagerImplCommon.Ext10Impl.Companion J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f40740O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f40741n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f40742r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f40743t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1(AdSelectionManagerImplCommon.Ext10Impl.Companion companion, Continuation continuation) {
        super(continuation);
        this.J2 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40740O = obj;
        this.f40742r |= Integer.MIN_VALUE;
        return this.J2.n(null, null, this);
    }
}
