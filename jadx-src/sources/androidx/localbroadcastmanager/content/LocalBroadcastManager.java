package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class LocalBroadcastManager {
    private static final Object J2 = new Object();
    private static LocalBroadcastManager Uo;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Handler f39115O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f39116n;
    private final HashMap rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final HashMap f39117t = new HashMap();
    private final ArrayList nr = new ArrayList();

    private static final class ReceiverRecord {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final IntentFilter f39120n;
        boolean nr;
        final BroadcastReceiver rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f39121t;

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.rl);
            sb.append(" filter=");
            sb.append(this.f39120n);
            if (this.nr) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }

        ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f39120n = intentFilter;
            this.rl = broadcastReceiver;
        }
    }

    private static final class BroadcastRecord {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Intent f39119n;
        final ArrayList rl;

        BroadcastRecord(Intent intent, ArrayList arrayList) {
            this.f39119n = intent;
            this.rl = arrayList;
        }
    }

    public static LocalBroadcastManager rl(Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (J2) {
            try {
                if (Uo == null) {
                    Uo = new LocalBroadcastManager(context.getApplicationContext());
                }
                localBroadcastManager = Uo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return localBroadcastManager;
    }

    public void O(BroadcastReceiver broadcastReceiver) {
        synchronized (this.rl) {
            try {
                ArrayList arrayList = (ArrayList) this.rl.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ReceiverRecord receiverRecord = (ReceiverRecord) arrayList.get(size);
                    receiverRecord.nr = true;
                    for (int i2 = 0; i2 < receiverRecord.f39120n.countActions(); i2++) {
                        String action = receiverRecord.f39120n.getAction(i2);
                        ArrayList arrayList2 = (ArrayList) this.f39117t.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                ReceiverRecord receiverRecord2 = (ReceiverRecord) arrayList2.get(size2);
                                if (receiverRecord2.rl == broadcastReceiver) {
                                    receiverRecord2.nr = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f39117t.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void n() {
        int size;
        BroadcastRecord[] broadcastRecordArr;
        while (true) {
            synchronized (this.rl) {
                try {
                    size = this.nr.size();
                    if (size <= 0) {
                        return;
                    }
                    broadcastRecordArr = new BroadcastRecord[size];
                    this.nr.toArray(broadcastRecordArr);
                    this.nr.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i2 = 0; i2 < size; i2++) {
                BroadcastRecord broadcastRecord = broadcastRecordArr[i2];
                int size2 = broadcastRecord.rl.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ReceiverRecord receiverRecord = (ReceiverRecord) broadcastRecord.rl.get(i3);
                    if (!receiverRecord.nr) {
                        receiverRecord.rl.onReceive(this.f39116n, broadcastRecord.f39119n);
                    }
                }
            }
        }
    }

    public boolean nr(Intent intent) {
        String str;
        synchronized (this.rl) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f39116n.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = (intent.getFlags() & 8) != 0;
                if (z2) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f39117t.get(intent.getAction());
                if (arrayList != null) {
                    if (z2) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        ReceiverRecord receiverRecord = (ReceiverRecord) arrayList.get(i2);
                        if (z2) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + receiverRecord.f39120n);
                        }
                        if (receiverRecord.f39121t) {
                            if (z2) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            str = action;
                        } else {
                            int iMatch = receiverRecord.f39120n.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z2) {
                                    StringBuilder sb = new StringBuilder();
                                    str = action;
                                    sb.append("  Filter matched!  match=0x");
                                    sb.append(Integer.toHexString(iMatch));
                                    Log.v("LocalBroadcastManager", sb.toString());
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(receiverRecord);
                                receiverRecord.f39121t = true;
                            } else {
                                str = action;
                                if (z2) {
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : FileUploadManager.f61572j : "category"));
                                }
                            }
                        }
                        i2++;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ((ReceiverRecord) arrayList2.get(i3)).f39121t = false;
                        }
                        this.nr.add(new BroadcastRecord(intent, arrayList2));
                        if (!this.f39115O.hasMessages(1)) {
                            this.f39115O.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.rl) {
            try {
                ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.rl.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.rl.put(broadcastReceiver, arrayList);
                }
                arrayList.add(receiverRecord);
                for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                    String action = intentFilter.getAction(i2);
                    ArrayList arrayList2 = (ArrayList) this.f39117t.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f39117t.put(action, arrayList2);
                    }
                    arrayList2.add(receiverRecord);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private LocalBroadcastManager(Context context) {
        this.f39116n = context;
        this.f39115O = new Handler(context.getMainLooper()) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    LocalBroadcastManager.this.n();
                }
            }
        };
    }
}
