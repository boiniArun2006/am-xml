package androidx.privacysandbox.ads.adservices.adid;

import GJW.eO;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0083@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0097@¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "Landroid/adservices/adid/AdIdManager;", "mAdIdManager", "<init>", "(Landroid/adservices/adid/AdIdManager;)V", "Landroid/adservices/adid/AdId;", "O", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "response", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "t", "(Landroid/adservices/adid/AdId;)Landroidx/privacysandbox/ads/adservices/adid/AdId;", c.f62177j, "rl", "Landroid/adservices/adid/AdIdManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension({"SMAP\nAdIdManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AdIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon\n*L\n45#1:54,11\n*E\n"})
public class AdIdManagerImplCommon extends AdIdManager {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final android.adservices.adid.AdIdManager mAdIdManager;

    @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
    @RequiresPermission
    @DoNotInline
    public Object n(Continuation<? super AdId> continuation) {
        return nr(this, continuation);
    }

    public AdIdManagerImplCommon(android.adservices.adid.AdIdManager mAdIdManager) {
        Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
        this.mAdIdManager = mAdIdManager;
    }

    private final Object O(Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        this.mAdIdManager.getAdId(new androidx.credentials.j(), OutcomeReceiverKt.n(eOVar));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @RequiresPermission
    @DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object nr(AdIdManagerImplCommon adIdManagerImplCommon, Continuation<? super AdId> continuation) {
        AdIdManagerImplCommon$getAdId$1 adIdManagerImplCommon$getAdId$1;
        if (continuation instanceof AdIdManagerImplCommon$getAdId$1) {
            adIdManagerImplCommon$getAdId$1 = (AdIdManagerImplCommon$getAdId$1) continuation;
            int i2 = adIdManagerImplCommon$getAdId$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adIdManagerImplCommon$getAdId$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                adIdManagerImplCommon$getAdId$1 = new AdIdManagerImplCommon$getAdId$1(adIdManagerImplCommon, continuation);
            }
        }
        Object objO = adIdManagerImplCommon$getAdId$1.f40731t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = adIdManagerImplCommon$getAdId$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            adIdManagerImplCommon$getAdId$1.f40730n = adIdManagerImplCommon;
            adIdManagerImplCommon$getAdId$1.J2 = 1;
            objO = adIdManagerImplCommon.O(adIdManagerImplCommon$getAdId$1);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adIdManagerImplCommon = (AdIdManagerImplCommon) adIdManagerImplCommon$getAdId$1.f40730n;
            ResultKt.throwOnFailure(objO);
        }
        return adIdManagerImplCommon.t(n.n(objO));
    }

    private final AdId t(android.adservices.adid.AdId response) {
        String adId = response.getAdId();
        Intrinsics.checkNotNullExpressionValue(adId, "response.adId");
        return new AdId(adId, response.isLimitAdTrackingEnabled());
    }
}
