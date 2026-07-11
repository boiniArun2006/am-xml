package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.model.WorkSpec;
import com.pairip.VMRunner;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42843n = Logger.J2("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        VMRunner.invoke("iyRVxpSuI08ZpYOx", new Object[]{ConstraintProxy.class, new Object[]{this, context, intent}});
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static void n(Context context, List list) {
        boolean z2;
        Iterator it = list.iterator();
        boolean zJ2 = false;
        boolean zUo = false;
        boolean zXMQ = false;
        boolean z3 = false;
        while (it.hasNext()) {
            Constraints constraints = ((WorkSpec) it.next()).mUb;
            zJ2 |= constraints.J2();
            zUo |= constraints.Uo();
            zXMQ |= constraints.xMQ();
            if (constraints.rl() != NetworkType.NOT_REQUIRED) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 |= z2;
            if (zJ2 && zUo && zXMQ && z3) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.n(context, zJ2, zUo, zXMQ, z3));
    }
}
