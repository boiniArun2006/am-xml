package androidx.view.result;

import androidx.core.app.ActivityOptionsCompat;
import androidx.view.result.contract.ActivityResultContract;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0002\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/activity/result/ActivityResultCallerLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "J2", "(Lkotlin/Unit;Landroidx/core/app/ActivityOptionsCompat;)V", "t", "()V", c.f62177j, "Landroidx/activity/result/ActivityResultLauncher;", "launcher", "Landroidx/activity/result/contract/ActivityResultContract;", "rl", "Landroidx/activity/result/contract/ActivityResultContract;", "nr", "()Landroidx/activity/result/contract/ActivityResultContract;", "callerContract", "Ljava/lang/Object;", "()Ljava/lang/Object;", "callerInput", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher launcher;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final ActivityResultContract callerContract;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Object callerInput;

    @Override // androidx.view.result.ActivityResultLauncher
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public void rl(Unit input, ActivityOptionsCompat options) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.launcher.rl(this.callerInput, options);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Object getCallerInput() {
        return this.callerInput;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final ActivityResultContract getCallerContract() {
        return this.callerContract;
    }

    @Override // androidx.view.result.ActivityResultLauncher
    public void t() {
        this.launcher.t();
    }
}
