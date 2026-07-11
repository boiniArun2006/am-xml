package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.ContentUriTriggers;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RequiresApi
@RestrictTo
class SystemJobInfoConverter {
    private static final String rl = Logger.J2("SystemJobInfoConverter");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ComponentName f42878n;

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobInfoConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f42879n;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f42879n = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42879n[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42879n[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42879n[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42879n[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static void nr(JobInfo.Builder builder, NetworkType networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(t(networkType));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    static int t(NetworkType networkType) {
        int i2 = AnonymousClass1.f42879n[networkType.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        Logger.t().n(rl, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
        return 1;
    }

    JobInfo n(WorkSpec workSpec, int i2) {
        Constraints constraints = workSpec.mUb;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.f42950n);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.nr());
        JobInfo.Builder extras = new JobInfo.Builder(i2, this.f42878n).setRequiresCharging(constraints.Uo()).setRequiresDeviceIdle(constraints.KN()).setExtras(persistableBundle);
        nr(extras, constraints.rl());
        if (!constraints.KN()) {
            extras.setBackoffCriteria(workSpec.az, workSpec.qie == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(workSpec.n() - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!workSpec.Ik) {
            extras.setImportantWhileForeground(true);
        }
        if (constraints.O()) {
            Iterator it = constraints.n().rl().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(rl((ContentUriTriggers.Trigger) it.next()));
            }
            extras.setTriggerContentUpdateDelay(constraints.t());
            extras.setTriggerContentMaxDelay(constraints.nr());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(constraints.J2());
            extras.setRequiresStorageNotLow(constraints.xMQ());
        }
        boolean z2 = workSpec.gh > 0;
        if (BuildCompat.t() && workSpec.Ik && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }

    SystemJobInfoConverter(Context context) {
        this.f42878n = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri rl(ContentUriTriggers.Trigger trigger) {
        return new JobInfo.TriggerContentUri(trigger.n(), trigger.rl() ? 1 : 0);
    }
}
