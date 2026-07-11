package androidx.view.result;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.contract.ActivityResultContract;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "O", "androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", c.f62177j, "()Landroidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1;"}, k = 3, mv = {1, 8, 0})
final class ActivityResultCallerLauncher$resultContract$2 extends Lambda implements Function0<AnonymousClass1> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ActivityResultCallerLauncher f13348n;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AnonymousClass1 invoke() {
        final ActivityResultCallerLauncher activityResultCallerLauncher = this.f13348n;
        return new ActivityResultContract<Unit, Object>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
            @Override // androidx.view.result.contract.ActivityResultContract
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Intent createIntent(Context context, Unit input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
            }

            @Override // androidx.view.result.contract.ActivityResultContract
            public Object parseResult(int resultCode, Intent intent) {
                return activityResultCallerLauncher.getCallerContract().parseResult(resultCode, intent);
            }
        };
    }
}
