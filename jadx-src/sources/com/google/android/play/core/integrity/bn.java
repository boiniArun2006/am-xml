package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractC1895z;
import com.google.android.play.integrity.internal.DAz;
import com.google.android.play.integrity.internal.Wre;
import com.google.android.play.integrity.internal.rv6;
import com.google.android.play.integrity.internal.s4;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final Wre f59515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DAz f59516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f59518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f59519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f59520f;

    static /* bridge */ /* synthetic */ Bundle a(bn bnVar, String str, long j2, long j3, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f59517c);
        bundle.putLong("cloud.prj", j2);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j3);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        AbstractC1895z.rl(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC1895z.n(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j2, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f59517c);
        bundle.putLong("cloud.prj", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        AbstractC1895z.rl(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC1895z.n(arrayList)));
        return bundle;
    }

    static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f59518d.getTask().isSuccessful() && ((Integer) bnVar.f59518d.getTask().getResult()).intValue() == 0;
    }

    @VisibleForTesting
    final Task c(Activity activity, Bundle bundle) {
        int i2 = bundle.getInt("dialog.intent.type");
        this.f59516b.nr("requestAndShowDialog(%s)", Integer.valueOf(i2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f59515a.Z(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i2), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    bn(Context context, DAz dAz, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f59518d = taskCompletionSource;
        this.f59517c = context.getPackageName();
        this.f59516b = dAz;
        this.f59519e = atVar;
        this.f59520f = kVar;
        Wre wre = new Wre(context, dAz, "ExpressIntegrityService", bo.f59521a, new rv6() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.rv6
            public final Object a(IBinder iBinder) {
                return s4.fcU(iBinder);
            }
        }, null);
        this.f59515a = wre;
        wre.t().post(new be(this, taskCompletionSource, context));
    }

    public final Task d(@Nullable String str, long j2, long j3, int i2) {
        this.f59516b.nr("requestExpressIntegrityToken(%s)", Long.valueOf(j3));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f59515a.Z(new bg(this, taskCompletionSource, 0, str, j2, j3, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j2, int i2) {
        this.f59516b.nr("warmUpIntegrityToken(%s)", Long.valueOf(j2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f59515a.Z(new bf(this, taskCompletionSource, 0, j2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
