package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class NotificationManagerCompat {
    private static SideChannelManager Uo;
    private static String nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f36299n;
    private final NotificationManager rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f36298t = new Object();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static Set f36297O = new HashSet();
    private static final Object J2 = new Object();

    @RequiresApi
    static class Api23Impl {
    }

    @RequiresApi
    static class Api26Impl {
    }

    @RequiresApi
    static class Api28Impl {
    }

    @RequiresApi
    static class Api30Impl {
    }

    @RequiresApi
    static class Api34Impl {
    }

    private static class CancelTask implements Task {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f36300n;
        final boolean nr;
        final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final String f36301t;

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void n(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.nr) {
                iNotificationSideChannel.cancelAll(this.f36300n);
            } else {
                iNotificationSideChannel.cancel(this.f36300n, this.rl, this.f36301t);
            }
        }

        public String toString() {
            return "CancelTask[packageName:" + this.f36300n + ", id:" + this.rl + ", tag:" + this.f36301t + ", all:" + this.nr + "]";
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface InterruptionFilter {
    }

    public static class NotificationWithIdAndTag {
    }

    private static class NotifyTask implements Task {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f36302n;
        final Notification nr;
        final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final String f36303t;

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void n(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f36302n, this.rl, this.f36303t, this.nr);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f36302n + ", id:" + this.rl + ", tag:" + this.f36303t + "]";
        }

        NotifyTask(String str, int i2, String str2, Notification notification) {
            this.f36302n = str;
            this.rl = i2;
            this.f36303t = str2;
            this.nr = notification;
        }
    }

    private static class SideChannelManager implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Handler f36305O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f36306n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final HandlerThread f36308t;
        private final Map J2 = new HashMap();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Set f36307r = new HashSet();

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f36305O.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f36305O.obtainMessage(2, componentName).sendToTarget();
        }

        private static class ListenerRecord {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final ComponentName f36310n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            INotificationSideChannel f36311t;
            boolean rl = false;
            ArrayDeque nr = new ArrayDeque();

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f36309O = 0;

            ListenerRecord(ComponentName componentName) {
                this.f36310n = componentName;
            }
        }

        private void KN(ComponentName componentName, IBinder iBinder) {
            ListenerRecord listenerRecord = (ListenerRecord) this.J2.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.f36311t = INotificationSideChannel.Stub.asInterface(iBinder);
                listenerRecord.f36309O = 0;
                mUb(listenerRecord);
            }
        }

        private void O(ListenerRecord listenerRecord) {
            if (listenerRecord.rl) {
                this.f36306n.unbindService(this);
                listenerRecord.rl = false;
            }
            listenerRecord.f36311t = null;
        }

        private void Uo(ComponentName componentName) {
            ListenerRecord listenerRecord = (ListenerRecord) this.J2.get(componentName);
            if (listenerRecord != null) {
                mUb(listenerRecord);
            }
        }

        private void az() {
            Set setO = NotificationManagerCompat.O(this.f36306n);
            if (setO.equals(this.f36307r)) {
                return;
            }
            this.f36307r = setO;
            List<ResolveInfo> listQueryIntentServices = this.f36306n.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setO.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.J2.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.J2.put(componentName2, new ListenerRecord(componentName2));
                }
            }
            Iterator it = this.J2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    O((ListenerRecord) entry.getValue());
                    it.remove();
                }
            }
        }

        private void mUb(ListenerRecord listenerRecord) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + listenerRecord.f36310n + ", " + listenerRecord.nr.size() + " queued tasks");
            }
            if (listenerRecord.nr.isEmpty()) {
                return;
            }
            if (!nr(listenerRecord) || listenerRecord.f36311t == null) {
                qie(listenerRecord);
                return;
            }
            while (true) {
                Task task = (Task) listenerRecord.nr.peek();
                if (task == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + task);
                    }
                    task.n(listenerRecord.f36311t);
                    listenerRecord.nr.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + listenerRecord.f36310n);
                    }
                } catch (RemoteException e2) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + listenerRecord.f36310n, e2);
                }
            }
            if (listenerRecord.nr.isEmpty()) {
                return;
            }
            qie(listenerRecord);
        }

        private boolean nr(ListenerRecord listenerRecord) {
            if (listenerRecord.rl) {
                return true;
            }
            boolean zBindService = this.f36306n.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(listenerRecord.f36310n), this, 33);
            listenerRecord.rl = zBindService;
            if (zBindService) {
                listenerRecord.f36309O = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + listenerRecord.f36310n);
                this.f36306n.unbindService(this);
            }
            return listenerRecord.rl;
        }

        private void qie(ListenerRecord listenerRecord) {
            if (this.f36305O.hasMessages(3, listenerRecord.f36310n)) {
                return;
            }
            int i2 = listenerRecord.f36309O;
            int i3 = i2 + 1;
            listenerRecord.f36309O = i3;
            if (i3 <= 6) {
                int i5 = (1 << i2) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i5 + " ms");
                }
                this.f36305O.sendMessageDelayed(this.f36305O.obtainMessage(3, listenerRecord.f36310n), i5);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + listenerRecord.nr.size() + " tasks to " + listenerRecord.f36310n + " after " + listenerRecord.f36309O + " retries");
            listenerRecord.nr.clear();
        }

        private void xMQ(ComponentName componentName) {
            ListenerRecord listenerRecord = (ListenerRecord) this.J2.get(componentName);
            if (listenerRecord != null) {
                O(listenerRecord);
            }
        }

        public void gh(Task task) {
            this.f36305O.obtainMessage(0, task).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                J2((Task) message.obj);
                return true;
            }
            if (i2 == 1) {
                ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                KN(serviceConnectedEvent.f36304n, serviceConnectedEvent.rl);
                return true;
            }
            if (i2 == 2) {
                xMQ((ComponentName) message.obj);
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            Uo((ComponentName) message.obj);
            return true;
        }

        SideChannelManager(Context context) {
            this.f36306n = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f36308t = handlerThread;
            handlerThread.start();
            this.f36305O = new Handler(handlerThread.getLooper(), this);
        }

        private void J2(Task task) {
            az();
            for (ListenerRecord listenerRecord : this.J2.values()) {
                listenerRecord.nr.add(task);
                mUb(listenerRecord);
            }
        }
    }

    private interface Task {
        void n(INotificationSideChannel iNotificationSideChannel);
    }

    public void J2(int i2, Notification notification) {
        Uo(null, i2, notification);
    }

    public void rl(int i2) {
        t(null, i2);
    }

    @RequiresApi
    static class Api24Impl {
        static boolean n(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    private static class ServiceConnectedEvent {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final ComponentName f36304n;
        final IBinder rl;

        ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.f36304n = componentName;
            this.rl = iBinder;
        }
    }

    private void KN(Task task) {
        synchronized (J2) {
            try {
                if (Uo == null) {
                    Uo = new SideChannelManager(this.f36299n.getApplicationContext());
                }
                Uo.gh(task);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static NotificationManagerCompat nr(Context context) {
        return new NotificationManagerCompat(context);
    }

    public boolean n() {
        return Api24Impl.n(this.rl);
    }

    public void t(String str, int i2) {
        this.rl.cancel(str, i2);
    }

    private NotificationManagerCompat(Context context) {
        this.f36299n = context;
        this.rl = (NotificationManager) context.getSystemService("notification");
    }

    public static Set O(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f36298t) {
            if (string != null) {
                try {
                    if (!string.equals(nr)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f36297O = hashSet;
                        nr = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f36297O;
        }
        return set;
    }

    private static boolean xMQ(Notification notification) {
        Bundle bundleN = NotificationCompat.n(notification);
        if (bundleN != null && bundleN.getBoolean("android.support.useSideChannel")) {
            return true;
        }
        return false;
    }

    public void Uo(String str, int i2, Notification notification) {
        if (xMQ(notification)) {
            KN(new NotifyTask(this.f36299n.getPackageName(), i2, str, notification));
            this.rl.cancel(str, i2);
        } else {
            this.rl.notify(str, i2, notification);
        }
    }
}
