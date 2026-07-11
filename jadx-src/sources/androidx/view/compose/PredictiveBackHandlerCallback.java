package androidx.view.compose;

import GJW.vd;
import ILs.C;
import androidx.view.BackEventCompat;
import androidx.view.OnBackPressedCallback;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BP\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00127\u0010\u000f\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 RS\u0010\u000f\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010*¨\u0006,"}, d2 = {"Landroidx/activity/compose/PredictiveBackHandlerCallback;", "Landroidx/activity/OnBackPressedCallback;", "", "enabled", "LGJW/vd;", "onBackScope", "Lkotlin/Function2;", "LTFv/Wre;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "progress", "Lkotlin/coroutines/Continuation;", "", "", "currentOnBack", "<init>", "(ZLGJW/vd;Lkotlin/jvm/functions/Function2;)V", "ck", "(Z)V", "backEvent", "xMQ", "(Landroidx/activity/BackEventCompat;)V", "KN", "Uo", "()V", "J2", "nr", "LGJW/vd;", "getOnBackScope", "()LGJW/vd;", "Ik", "(LGJW/vd;)V", "O", "Lkotlin/jvm/functions/Function2;", "getCurrentOnBack", "()Lkotlin/jvm/functions/Function2;", "HI", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/activity/compose/OnBackInstance;", "Landroidx/activity/compose/OnBackInstance;", "onBackInstance", "Z", "isActive", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PredictiveBackHandlerCallback extends OnBackPressedCallback {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private OnBackInstance onBackInstance;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function2 currentOnBack;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean isActive;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private vd onBackScope;

    public final void HI(Function2 function2) {
        this.currentOnBack = function2;
    }

    public final void Ik(vd vdVar) {
        this.onBackScope = vdVar;
    }

    @Override // androidx.view.OnBackPressedCallback
    public void Uo() {
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null && !onBackInstance.getIsPredictiveBack()) {
            onBackInstance.n();
            this.onBackInstance = null;
        }
        if (this.onBackInstance == null) {
            this.onBackInstance = new OnBackInstance(this.onBackScope, false, this.currentOnBack, this);
        }
        OnBackInstance onBackInstance2 = this.onBackInstance;
        if (onBackInstance2 != null) {
            onBackInstance2.rl();
        }
        OnBackInstance onBackInstance3 = this.onBackInstance;
        if (onBackInstance3 != null) {
            onBackInstance3.J2(false);
        }
        this.isActive = false;
    }

    public final void ck(boolean enabled) {
        OnBackInstance onBackInstance;
        if (!enabled && !this.isActive && getIsEnabled() && (onBackInstance = this.onBackInstance) != null) {
            onBackInstance.n();
        }
        az(enabled);
    }

    public PredictiveBackHandlerCallback(boolean z2, vd vdVar, Function2 function2) {
        super(z2);
        this.onBackScope = vdVar;
        this.currentOnBack = function2;
    }

    @Override // androidx.view.OnBackPressedCallback
    public void J2() {
        super.J2();
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            onBackInstance.n();
        }
        OnBackInstance onBackInstance2 = this.onBackInstance;
        if (onBackInstance2 != null) {
            onBackInstance2.J2(false);
        }
        this.isActive = false;
    }

    @Override // androidx.view.OnBackPressedCallback
    public void KN(BackEventCompat backEvent) {
        super.KN(backEvent);
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            C.rl(onBackInstance.O(backEvent));
        }
    }

    @Override // androidx.view.OnBackPressedCallback
    public void xMQ(BackEventCompat backEvent) {
        super.xMQ(backEvent);
        OnBackInstance onBackInstance = this.onBackInstance;
        if (onBackInstance != null) {
            onBackInstance.n();
        }
        if (getIsEnabled()) {
            this.onBackInstance = new OnBackInstance(this.onBackScope, true, this.currentOnBack, this);
        }
        this.isActive = true;
    }
}
