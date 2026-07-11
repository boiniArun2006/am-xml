package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.integrity.internal.DAz;
import com.google.android.play.integrity.internal.Ew;
import com.google.android.play.integrity.internal.Wre;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class as extends Ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final TaskCompletionSource f59470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    final Wre f59471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DAz f59472c = new DAz("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f59473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f59474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f59475f;

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    @Override // com.google.android.play.integrity.internal.nKK
    public final void b(Bundle bundle) {
        this.f59471b.S(this.f59470a);
        this.f59472c.nr("onRequestDialog(%s)", this.f59473d);
        ApiException apiExceptionA = this.f59474e.a(bundle);
        if (apiExceptionA != null) {
            this.f59470a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f59472c.rl("onRequestDialog(%s): got null dialog intent", this.f59473d);
            this.f59470a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f59475f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f59471b.t()));
        this.f59472c.n("Starting dialog intent...", new Object[0]);
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this.f59475f, intent, 0);
    }

    as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, Wre wre) {
        this.f59473d = context.getPackageName();
        this.f59474e = kVar;
        this.f59470a = taskCompletionSource;
        this.f59475f = activity;
        this.f59471b = wre;
    }
}
