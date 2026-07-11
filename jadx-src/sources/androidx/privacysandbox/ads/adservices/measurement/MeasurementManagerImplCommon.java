package androidx.privacysandbox.ads.adservices.measurement;

import GJW.Lu;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0018H\u0097@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0097@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0097@¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/measurement/MeasurementManager;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "deletionRequest", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "t", "(Landroid/net/Uri;Landroid/view/InputEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trigger", "O", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", AdActivity.REQUEST_KEY_EXTRA, "J2", "(Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "nr", "(Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;", "Uo", "(Landroidx/privacysandbox/ads/adservices/measurement/WebTriggerRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "rl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", "xMQ", "()Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension({"SMAP\nMeasurementManagerImplCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,130:1\n314#2,11:131\n314#2,11:142\n314#2,11:153\n314#2,11:164\n314#2,11:175\n314#2,11:186\n*S KotlinDebug\n*F\n+ 1 MeasurementManagerImplCommon.kt\nandroidx/privacysandbox/ads/adservices/measurement/MeasurementManagerImplCommon\n*L\n44#1:131,11\n56#1:142,11\n69#1:153,11\n81#1:164,11\n111#1:175,11\n123#1:186,11\n*E\n"})
public class MeasurementManagerImplCommon extends MeasurementManager {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final android.adservices.measurement.MeasurementManager mMeasurementManager;

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    public Object J2(WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) {
        return ty(this, webSourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    public Object O(Uri uri, Continuation<? super Unit> continuation) {
        return az(this, uri, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    public Object Uo(WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) {
        return HI(this, webTriggerRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @DoNotInline
    public Object n(DeletionRequest deletionRequest, Continuation<? super Unit> continuation) {
        return KN(this, deletionRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object nr(SourceRegistrationRequest sourceRegistrationRequest, Continuation<? super Unit> continuation) {
        return qie(this, sourceRegistrationRequest, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    public Object rl(Continuation<? super Integer> continuation) {
        return mUb(this, continuation);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @RequiresPermission
    @DoNotInline
    public Object t(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        return gh(this, uri, inputEvent, continuation);
    }

    public MeasurementManagerImplCommon(android.adservices.measurement.MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.mMeasurementManager = mMeasurementManager;
    }

    @RequiresPermission
    @DoNotInline
    static /* synthetic */ Object HI(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) {
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        measurementManagerImplCommon.getMMeasurementManager().registerWebTrigger(webTriggerRegistrationRequest.n(), new androidx.credentials.j(), OutcomeReceiverKt.n(eOVar));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
    }

    @DoNotInline
    static /* synthetic */ Object KN(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, Continuation<? super Unit> continuation) {
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        measurementManagerImplCommon.getMMeasurementManager().deleteRegistrations(deletionRequest.n(), new androidx.credentials.j(), OutcomeReceiverKt.n(eOVar));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
    }

    @RequiresPermission
    @DoNotInline
    static /* synthetic */ Object az(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, Continuation<? super Unit> continuation) {
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        measurementManagerImplCommon.getMMeasurementManager().registerTrigger(uri, new androidx.credentials.j(), OutcomeReceiverKt.n(eOVar));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
    }

    @RequiresPermission
    @DoNotInline
    static /* synthetic */ Object gh(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        measurementManagerImplCommon.getMMeasurementManager().registerSource(uri, inputEvent, new androidx.credentials.j(), OutcomeReceiverKt.n(eOVar));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
    }

    @RequiresPermission
    @DoNotInline
    static /* synthetic */ Object mUb(MeasurementManagerImplCommon measurementManagerImplCommon, Continuation<? super Integer> continuation) {
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        measurementManagerImplCommon.getMMeasurementManager().getMeasurementApiStatus(new androidx.credentials.j(), OutcomeReceiverKt.n(eOVar));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    @RequiresPermission
    @DoNotInline
    @ExperimentalFeatures.RegisterSourceOptIn
    static /* synthetic */ Object qie(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, Continuation<? super Unit> continuation) {
        Object objJ2 = Lu.J2(new MeasurementManagerImplCommon$registerSource$4(sourceRegistrationRequest, measurementManagerImplCommon, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    @RequiresPermission
    @DoNotInline
    static /* synthetic */ Object ty(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) {
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        measurementManagerImplCommon.getMMeasurementManager().registerWebSource(webSourceRegistrationRequest.n(), new androidx.credentials.j(), OutcomeReceiverKt.n(eOVar));
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    protected final android.adservices.measurement.MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }
}
