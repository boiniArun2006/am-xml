package androidx.privacysandbox.ads.adservices.appsetid;

import GJW.eO;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0097@¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;", "Landroid/adservices/appsetid/AppSetIdManager;", "mAppSetIdManager", "<init>", "(Landroid/adservices/appsetid/AppSetIdManager;)V", "Landroid/adservices/appsetid/AppSetId;", "O", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "response", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "t", "(Landroid/adservices/appsetid/AppSetId;)Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", c.f62177j, "rl", "Landroid/adservices/appsetid/AppSetIdManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension({"SMAP\nAppSetIdManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AppSetIdManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon\n*L\n42#1:54,11\n*E\n"})
public class AppSetIdManagerImplCommon extends AppSetIdManager {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final android.adservices.appsetid.AppSetIdManager mAppSetIdManager;

    @Override // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
    @DoNotInline
    public Object n(Continuation<? super AppSetId> continuation) {
        return nr(this, continuation);
    }

    public AppSetIdManagerImplCommon(android.adservices.appsetid.AppSetIdManager mAppSetIdManager) {
        Intrinsics.checkNotNullParameter(mAppSetIdManager, "mAppSetIdManager");
        this.mAppSetIdManager = mAppSetIdManager;
    }

    private final Object O(Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        this.mAppSetIdManager.getAppSetId(new androidx.credentials.j(), OutcomeReceiverKt.n(eOVar));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object nr(AppSetIdManagerImplCommon appSetIdManagerImplCommon, Continuation<? super AppSetId> continuation) {
        AppSetIdManagerImplCommon$getAppSetId$1 appSetIdManagerImplCommon$getAppSetId$1;
        if (continuation instanceof AppSetIdManagerImplCommon$getAppSetId$1) {
            appSetIdManagerImplCommon$getAppSetId$1 = (AppSetIdManagerImplCommon$getAppSetId$1) continuation;
            int i2 = appSetIdManagerImplCommon$getAppSetId$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appSetIdManagerImplCommon$getAppSetId$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                appSetIdManagerImplCommon$getAppSetId$1 = new AppSetIdManagerImplCommon$getAppSetId$1(appSetIdManagerImplCommon, continuation);
            }
        }
        Object objO = appSetIdManagerImplCommon$getAppSetId$1.f40780t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = appSetIdManagerImplCommon$getAppSetId$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            appSetIdManagerImplCommon$getAppSetId$1.f40779n = appSetIdManagerImplCommon;
            appSetIdManagerImplCommon$getAppSetId$1.J2 = 1;
            objO = appSetIdManagerImplCommon.O(appSetIdManagerImplCommon$getAppSetId$1);
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appSetIdManagerImplCommon = (AppSetIdManagerImplCommon) appSetIdManagerImplCommon$getAppSetId$1.f40779n;
            ResultKt.throwOnFailure(objO);
        }
        return appSetIdManagerImplCommon.t(n.n(objO));
    }

    private final AppSetId t(android.adservices.appsetid.AppSetId response) {
        if (response.getScope() == 1) {
            String id = response.getId();
            Intrinsics.checkNotNullExpressionValue(id, "response.id");
            return new AppSetId(id, 1);
        }
        String id2 = response.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "response.id");
        return new AppSetId(id2, 2);
    }
}
