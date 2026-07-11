package KC;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.contract.ActivityResultContract;
import com.alightcreative.onboarding.ui.OnboardingActivity;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class jL extends ActivityResultContract {
    @Override // androidx.view.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Boolean parseResult(int i2, Intent intent) {
        return Boolean.valueOf(i2 == -1);
    }

    @Override // androidx.view.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Unit unit) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Intent(context, (Class<?>) OnboardingActivity.class);
    }
}
