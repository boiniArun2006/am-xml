package com.google.firebase.remoteconfig;

import JWp.aC;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.remoteconfig.internal.C1916c;
import com.google.firebase.remoteconfig.internal.CN3;
import com.google.firebase.remoteconfig.internal.Wre;
import com.google.firebase.remoteconfig.internal.Xo;
import com.google.firebase.remoteconfig.internal.eO;
import com.google.firebase.remoteconfig.internal.qz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import ko7.I28;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class j {
    public static final byte[] ty = new byte[0];
    private final Wre J2;
    private final qz KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Wre f60784O;
    private final Wre Uo;
    private final I28 az;
    private final s9b.I28 gh;
    private final C1916c mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f60785n;
    private final Executor nr;
    private final eO qie;
    private final com.google.firebase.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ED.n f60786t;
    private final Xo xMQ;

    static List aYN(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    private static boolean r(CN3 cn3, CN3 cn32) {
        return cn32 == null || !cn3.KN().equals(cn32.KN());
    }

    public static j ty(com.google.firebase.Wre wre) {
        return ((w6) wre.mUb(w6.class)).Uo();
    }

    public long HI(String str) {
        return this.xMQ.Uo(str);
    }

    public String Ik(String str) {
        return this.xMQ.xMQ(str);
    }

    public Task KN() {
        return this.KN.xMQ().onSuccessTask(aC.n(), new SuccessContinuation() { // from class: N67.fuX
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    public Task Uo() {
        final Task taskO = this.f60784O.O();
        final Task taskO2 = this.J2.O();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskO, taskO2}).continueWithTask(this.nr, new Continuation() { // from class: N67.I28
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return com.google.firebase.remoteconfig.j.J2(this.f6960n, taskO, taskO2, task);
            }
        });
    }

    void ViF(JSONArray jSONArray) {
        if (this.f60786t == null) {
            return;
        }
        try {
            this.f60786t.az(aYN(jSONArray));
        } catch (AbtException e2) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
        } catch (JSONException e3) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e3);
        }
    }

    void WPU() {
        this.J2.O();
        this.Uo.O();
        this.f60784O.O();
    }

    public Task XQ(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                map2.put((String) entry.getKey(), value.toString());
            }
        }
        return S(map2);
    }

    void Z(boolean z2) {
        this.qie.rl(z2);
    }

    I28 ck() {
        return this.az;
    }

    public Map gh() {
        return this.xMQ.nr();
    }

    public N67.aC qie() {
        return this.mUb.nr();
    }

    public Task xMQ(long j2) {
        return this.KN.mUb(j2).onSuccessTask(aC.n(), new SuccessContinuation() { // from class: N67.CN3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    j(Context context, com.google.firebase.Wre wre, s9b.I28 i28, ED.n nVar, Executor executor, Wre wre2, Wre wre3, Wre wre4, qz qzVar, Xo xo, C1916c c1916c, eO eOVar, I28 i282) {
        this.f60785n = context;
        this.rl = wre;
        this.gh = i28;
        this.f60786t = nVar;
        this.nr = executor;
        this.f60784O = wre2;
        this.J2 = wre3;
        this.Uo = wre4;
        this.KN = qzVar;
        this.xMQ = xo;
        this.mUb = c1916c;
        this.qie = eOVar;
        this.az = i282;
    }

    public static /* synthetic */ Task J2(final j jVar, Task task, Task task2, Task task3) {
        jVar.getClass();
        if (task.isSuccessful() && task.getResult() != null) {
            CN3 cn3 = (CN3) task.getResult();
            if (task2.isSuccessful() && !r(cn3, (CN3) task2.getResult())) {
                return Tasks.forResult(Boolean.FALSE);
            }
            return jVar.J2.xMQ(cn3).continueWith(jVar.nr, new Continuation() { // from class: N67.Dsr
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task4) {
                    return Boolean.valueOf(this.f6959n.o(task4));
                }
            });
        }
        return Tasks.forResult(Boolean.FALSE);
    }

    private Task S(Map map) {
        try {
            return this.Uo.xMQ(CN3.qie().rl(map).n()).onSuccessTask(aC.n(), new SuccessContinuation() { // from class: N67.Wre
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(null);
                }
            });
        } catch (JSONException e2) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e2);
            return Tasks.forResult(null);
        }
    }

    public static j az() {
        return ty(com.google.firebase.Wre.az());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(Task task) {
        if (task.isSuccessful()) {
            this.f60784O.nr();
            CN3 cn3 = (CN3) task.getResult();
            if (cn3 != null) {
                ViF(cn3.O());
                this.az.nr(cn3);
                return true;
            }
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        return false;
    }

    public Task mUb() {
        return KN().onSuccessTask(this.nr, new SuccessContinuation() { // from class: N67.Ml
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f6962n.Uo();
            }
        });
    }
}
