package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.AbstractC1895z;
import com.google.android.play.integrity.internal.DAz;
import com.google.android.play.integrity.internal.Dsr;
import com.google.android.play.integrity.internal.Wre;
import com.google.android.play.integrity.internal.ci;
import com.google.android.play.integrity.internal.rv6;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    final Wre f59452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DAz f59453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final at f59455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f59456e;

    static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l2, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f59454c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l2 != null) {
            bundle.putLong("cloud.prj", l2.longValue());
        }
        ArrayList arrayList = new ArrayList();
        AbstractC1895z.rl(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(AbstractC1895z.n(arrayList)));
        return bundle;
    }

    @VisibleForTesting
    final Task b(Activity activity, Bundle bundle) {
        if (this.f59452a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i2 = bundle.getInt("dialog.intent.type");
        this.f59453b.nr("requestAndShowDialog(%s, %s)", this.f59454c, Integer.valueOf(i2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f59452a.Z(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i2), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f59452a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f59453b.nr("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f59452a.Z(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e2) {
            return Tasks.forException(new IntegrityServiceException(-13, e2));
        }
    }

    aj(Context context, DAz dAz, at atVar, k kVar) {
        this.f59454c = context.getPackageName();
        this.f59453b = dAz;
        this.f59455d = atVar;
        this.f59456e = kVar;
        if (!Dsr.rl(context)) {
            dAz.rl("Phonesky is not installed.", new Object[0]);
            this.f59452a = null;
        } else {
            this.f59452a = new Wre(context, dAz, "IntegrityService", ak.f59457a, new rv6() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.rv6
                public final Object a(IBinder iBinder) {
                    return ci.fcU(iBinder);
                }
            }, null);
        }
    }
}
