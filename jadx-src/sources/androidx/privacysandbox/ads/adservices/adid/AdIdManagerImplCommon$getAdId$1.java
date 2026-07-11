package androidx.privacysandbox.ads.adservices.adid;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", f = "AdIdManagerImplCommon.kt", i = {}, l = {40}, m = "getAdId$suspendImpl", n = {}, s = {})
final class AdIdManagerImplCommon$getAdId$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ AdIdManagerImplCommon f40729O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f40730n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f40731t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdIdManagerImplCommon$getAdId$1(AdIdManagerImplCommon adIdManagerImplCommon, Continuation continuation) {
        super(continuation);
        this.f40729O = adIdManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40731t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return AdIdManagerImplCommon.nr(this.f40729O, this);
    }
}
