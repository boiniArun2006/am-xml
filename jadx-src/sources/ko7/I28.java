package ko7;

import android.util.Log;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.CN3;
import com.google.firebase.remoteconfig.internal.Wre;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Wre f70135n;
    private Set nr = Collections.newSetFromMap(new ConcurrentHashMap());
    private j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Executor f70136t;

    public void O(final q6T.Wre wre) {
        this.nr.add(wre);
        final Task taskO = this.f70135n.O();
        taskO.addOnSuccessListener(this.f70136t, new OnSuccessListener() { // from class: ko7.w6
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                I28.n(this.f70142n, taskO, wre, (CN3) obj);
            }
        });
    }

    public void nr(CN3 cn3) {
        try {
            final q6T.I28 i28Rl = this.rl.rl(cn3);
            for (final q6T.Wre wre : this.nr) {
                this.f70136t.execute(new Runnable() { // from class: ko7.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        wre.n(i28Rl);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e2) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e2);
        }
    }

    public I28(Wre wre, j jVar, Executor executor) {
        this.f70135n = wre;
        this.rl = jVar;
        this.f70136t = executor;
    }

    public static /* synthetic */ void n(I28 i28, Task task, final q6T.Wre wre, CN3 cn3) {
        i28.getClass();
        try {
            CN3 cn32 = (CN3) task.getResult();
            if (cn32 != null) {
                final q6T.I28 i28Rl = i28.rl.rl(cn32);
                i28.f70136t.execute(new Runnable() { // from class: ko7.Ml
                    @Override // java.lang.Runnable
                    public final void run() {
                        wre.n(i28Rl);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e2) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e2);
        }
    }
}
