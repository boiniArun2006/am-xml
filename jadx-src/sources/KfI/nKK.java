package KfI;

import GJW.Lu;
import GJW.xuv;
import XE.n;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class nKK {
    public static final n J2 = new n(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Ml f5722O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CoroutineContext f5723n;
    private final LinkedBlockingDeque nr;
    private Messenger rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f5724t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Ml implements ServiceConnection {
        Ml() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + nKK.this.nr.size());
            nKK.this.rl = new Messenger(iBinder);
            nKK.this.f5724t = true;
            nKK nkk = nKK.this;
            nkk.HI(nkk.mUb());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            nKK.this.rl = null;
            nKK.this.f5724t = false;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class j extends Handler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CoroutineContext f5726n;

        /* JADX INFO: renamed from: KfI.nKK$j$j, reason: collision with other inner class name */
        static final class C0194j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5727n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f5728t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((C0194j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0194j(String str, Continuation continuation) {
                super(2, continuation);
                this.f5728t = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0194j(this.f5728t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f5727n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    XE.j jVar = XE.j.f11798n;
                    this.f5727n = 1;
                    obj = jVar.t(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Collection<XE.n> collectionValues = ((Map) obj).values();
                String str = this.f5728t;
                for (XE.n nVar : collectionValues) {
                    nVar.t(new n.C0427n(str));
                    Log.d("SessionLifecycleClient", "Notified " + nVar.rl() + " of new session " + str);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(CoroutineContext backgroundDispatcher) {
            super(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
            this.f5726n = backgroundDispatcher;
        }

        private final void n(String str) {
            Log.d("SessionLifecycleClient", "Session update received.");
            GJW.C.nr(Lu.n(this.f5726n), null, null, new C0194j(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String string;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                n(string);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f5729O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5730n;

        public static final class j implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(List list, Continuation continuation) {
            super(2, continuation);
            this.f5729O = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return nKK.this.new w6(this.f5729O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5730n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                XE.j jVar = XE.j.f11798n;
                this.f5730n = 1;
                obj = jVar.t(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection collectionValues = map.values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((XE.n) it.next()).n()) {
                            List listSortedWith = CollectionsKt.sortedWith(CollectionsKt.filterNotNull(CollectionsKt.mutableListOf(nKK.this.qie(this.f5729O, 2), nKK.this.qie(this.f5729O, 1))), new j());
                            nKK nkk = nKK.this;
                            Iterator it2 = listSortedWith.iterator();
                            while (it2.hasNext()) {
                                nkk.ck((Message) it2.next());
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                } else {
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void KN() {
        ty(2);
    }

    public final void gh() {
        ty(1);
    }

    public nKK(CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f5723n = backgroundDispatcher;
        this.nr = new LinkedBlockingDeque(20);
        this.f5722O = new Ml();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xuv HI(List list) {
        return GJW.C.nr(Lu.n(this.f5723n), null, null, new w6(list, null), 3, null);
    }

    private final void az(Message message) {
        if (!this.nr.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.nr.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ck(Message message) {
        if (this.rl == null) {
            az(message);
            return;
        }
        try {
            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
            Messenger messenger = this.rl;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e2) {
            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e2);
            az(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List mUb() {
        ArrayList arrayList = new ArrayList();
        this.nr.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message qie(List list, int i2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i2) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public final void xMQ(u sessionLifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.n(new Messenger(new j(this.f5723n)), this.f5722O);
    }

    private final void ty(int i2) {
        List listMUb = mUb();
        Message messageObtain = Message.obtain(null, i2, 0, 0);
        Intrinsics.checkNotNullExpressionValue(messageObtain, gUxOLwRQBPPLC.aJM);
        listMUb.add(messageObtain);
        HI(listMUb);
    }
}
