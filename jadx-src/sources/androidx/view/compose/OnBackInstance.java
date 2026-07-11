package androidx.view.compose;

import GJW.C;
import GJW.vd;
import GJW.xuv;
import ILs.CN3;
import ILs.aC;
import ILs.j;
import ILs.r;
import androidx.view.BackEventCompat;
import androidx.view.OnBackPressedCallback;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BX\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00127\u0010\u000e\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\u0013\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u001f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/activity/compose/OnBackInstance;", "", "LGJW/vd;", "scope", "", "isPredictiveBack", "Lkotlin/Function2;", "LTFv/Wre;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "progress", "Lkotlin/coroutines/Continuation;", "", "onBack", "Landroidx/activity/OnBackPressedCallback;", "callback", "<init>", "(LGJW/vd;ZLkotlin/jvm/functions/Function2;Landroidx/activity/OnBackPressedCallback;)V", "backEvent", "LILs/C;", "O", "(Landroidx/activity/BackEventCompat;)Ljava/lang/Object;", "rl", "()Z", c.f62177j, "()V", "Z", "nr", "J2", "(Z)V", "LILs/CN3;", "LILs/CN3;", "t", "()LILs/CN3;", "channel", "LGJW/xuv;", "LGJW/xuv;", "getJob", "()LGJW/xuv;", "job", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OnBackInstance {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isPredictiveBack;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final CN3 channel = aC.rl(-2, j.f4185n, null, 4, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final xuv job;

    public final void J2(boolean z2) {
        this.isPredictiveBack = z2;
    }

    public final Object O(BackEventCompat backEvent) {
        return this.channel.nr(backEvent);
    }

    public final void n() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        xuv.j.rl(this.job, null, 1, null);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final boolean getIsPredictiveBack() {
        return this.isPredictiveBack;
    }

    public final boolean rl() {
        return r.j.n(this.channel, null, 1, null);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final CN3 getChannel() {
        return this.channel;
    }

    public OnBackInstance(vd vdVar, boolean z2, Function2 function2, OnBackPressedCallback onBackPressedCallback) {
        this.isPredictiveBack = z2;
        this.job = C.nr(vdVar, null, null, new OnBackInstance$job$1(onBackPressedCallback, function2, this, null), 3, null);
    }
}
