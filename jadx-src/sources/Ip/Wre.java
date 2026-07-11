package Ip;

import Ip.aC;
import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.UserManagerCompat;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import uOq.g9s;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Wre implements Dsr, aC {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Executor f4304O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oSp.n f4305n;
    private final Set nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final oSp.n f4306t;

    private Wre(final Context context, final String str, Set set, oSp.n nVar, Executor executor) {
        this(new oSp.n() { // from class: Ip.w6
            @Override // oSp.n
            public final Object get() {
                return Wre.nr(context, str);
            }
        }, set, executor, nVar, context);
    }

    public static /* synthetic */ Void J2(Wre wre) {
        synchronized (wre) {
            ((C) wre.f4305n.get()).gh(System.currentTimeMillis(), ((N03.Dsr) wre.f4306t.get()).getUserAgent());
        }
        return null;
    }

    public static /* synthetic */ String t(Wre wre) {
        String string;
        synchronized (wre) {
            try {
                C c2 = (C) wre.f4305n.get();
                List listT = c2.t();
                c2.rl();
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < listT.size(); i2++) {
                    o oVar = (o) listT.get(i2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", oVar.t());
                    jSONObject.put("dates", new JSONArray((Collection) oVar.rl()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put(NodeModuleProcess.PROPERTY_VERSION, "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(com.google.android.exoplayer2.C.UTF8_NAME));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString(com.google.android.exoplayer2.C.UTF8_NAME);
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // Ip.aC
    public synchronized aC.j rl(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C c2 = (C) this.f4305n.get();
        if (!c2.xMQ(jCurrentTimeMillis)) {
            return aC.j.NONE;
        }
        c2.Uo();
        return aC.j.GLOBAL;
    }

    Wre(oSp.n nVar, Set set, Executor executor, oSp.n nVar2, Context context) {
        this.f4305n = nVar;
        this.nr = set;
        this.f4304O = executor;
        this.f4306t = nVar2;
        this.rl = context;
    }

    public static /* synthetic */ Wre O(g9s g9sVar, uOq.Ml ml) {
        return new Wre((Context) ml.n(Context.class), ((com.google.firebase.Wre) ml.n(com.google.firebase.Wre.class)).Ik(), ml.nr(CN3.class), ml.O(N03.Dsr.class), (Executor) ml.KN(g9sVar));
    }

    public static uOq.w6 Uo() {
        final g9s g9sVarN = g9s.n(F2O.j.class, Executor.class);
        return uOq.w6.nr(Wre.class, Dsr.class, aC.class).rl(z.mUb(Context.class)).rl(z.mUb(com.google.firebase.Wre.class)).rl(z.ty(CN3.class)).rl(z.qie(N03.Dsr.class)).rl(z.gh(g9sVarN)).J2(new uOq.CN3() { // from class: Ip.n
            @Override // uOq.CN3
            public final Object n(uOq.Ml ml) {
                return Wre.O(g9sVarN, ml);
            }
        }).nr();
    }

    public static /* synthetic */ C nr(Context context, String str) {
        return new C(context, str);
    }

    public Task KN() {
        return this.nr.size() <= 0 ? Tasks.forResult(null) : !UserManagerCompat.n(this.rl) ? Tasks.forResult(null) : Tasks.call(this.f4304O, new Callable() { // from class: Ip.I28
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Wre.J2(this.f4302n);
            }
        });
    }

    @Override // Ip.Dsr
    public Task n() {
        return !UserManagerCompat.n(this.rl) ? Tasks.forResult("") : Tasks.call(this.f4304O, new Callable() { // from class: Ip.Ml
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Wre.t(this.f4303n);
            }
        });
    }
}
