package androidx.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/NavArgs;", "Args", "Landroid/os/Bundle;", c.f62177j, "()Landroid/os/Bundle;"}, k = 3, mv = {1, 8, 0})
public final class ActivityNavArgsLazyKt$navArgs$1 extends Lambda implements Function0<Bundle> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Activity f39968n;

    @Override // kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Bundle invoke() {
        Bundle extras;
        Intent intent = this.f39968n.getIntent();
        if (intent != null) {
            Activity activity = this.f39968n;
            extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
            }
        } else {
            extras = null;
        }
        if (extras != null) {
            return extras;
        }
        throw new IllegalStateException("Activity " + this.f39968n + " has a null Intent");
    }
}
