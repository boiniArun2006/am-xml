package F5;

import F5.CN3;
import QNA.C1430m;
import QNA.DAz;
import QNA.iwV;
import QNA.nKK;
import QNA.u;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class CN3 implements aC {
    private final o J2;
    private final AtomicReference KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final F5.j f2494O;
    private final DAz Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f2495n;
    private final nKK nr;
    private final C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final fuX f2496t;
    private final AtomicReference xMQ;

    class j implements SuccessContinuation {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Zlm.Wre f2497n;

        j(Zlm.Wre wre) {
            this.f2497n = wre;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Task then(Void r52) throws Throwable {
            JSONObject jSONObject = (JSONObject) this.f2497n.nr.t().submit(new Callable() { // from class: F5.Wre
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    CN3.j jVar = this.f2507n;
                    return CN3.this.J2.n(CN3.this.rl, true);
                }
            }).get();
            if (jSONObject != null) {
                Ml mlRl = CN3.this.f2496t.rl(jSONObject);
                CN3.this.f2494O.t(mlRl.f2503t, jSONObject);
                CN3.this.Ik(jSONObject, "Loaded settings: ");
                CN3 cn3 = CN3.this;
                cn3.r(cn3.rl.J2);
                CN3.this.KN.set(mlRl);
                ((TaskCompletionSource) CN3.this.xMQ.get()).trySetResult(mlRl);
            }
            return Tasks.forResult(null);
        }
    }

    private Ml az(I28 i28) throws Throwable {
        Ml ml = null;
        try {
            if (!I28.SKIP_CACHE_LOOKUP.equals(i28)) {
                JSONObject jSONObjectRl = this.f2494O.rl();
                if (jSONObjectRl != null) {
                    Ml mlRl = this.f2496t.rl(jSONObjectRl);
                    if (mlRl == null) {
                        h1M.CN3.J2().O("Failed to parse cached settings data.", null);
                        return null;
                    }
                    Ik(jSONObjectRl, "Loaded cached settings: ");
                    long jN = this.nr.n();
                    if (!I28.IGNORE_CACHE_EXPIRATION.equals(i28) && mlRl.n(jN)) {
                        h1M.CN3.J2().xMQ("Cached settings have expired.");
                        return null;
                    }
                    try {
                        h1M.CN3.J2().xMQ("Returning cached settings.");
                        return mlRl;
                    } catch (Exception e2) {
                        e = e2;
                        ml = mlRl;
                        h1M.CN3.J2().O("Failed to get cached settings", e);
                        return ml;
                    }
                }
                h1M.CN3.J2().rl("No cached settings data found.");
            }
            return null;
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor editorEdit = QNA.Dsr.Ik(this.f2495n).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    private String ty() {
        return QNA.Dsr.Ik(this.f2495n).getString("existing_instance_identifier", "");
    }

    public Task ck(Zlm.Wre wre) {
        return HI(I28.USE_CACHE, wre);
    }

    @Override // F5.aC
    public Task n() {
        return ((TaskCompletionSource) this.xMQ.get()).getTask();
    }

    @Override // F5.aC
    public Ml rl() {
        return (Ml) this.KN.get();
    }

    CN3(Context context, C c2, nKK nkk, fuX fux, F5.j jVar, o oVar, DAz dAz) {
        AtomicReference atomicReference = new AtomicReference();
        this.KN = atomicReference;
        this.xMQ = new AtomicReference(new TaskCompletionSource());
        this.f2495n = context;
        this.rl = c2;
        this.nr = nkk;
        this.f2496t = fux;
        this.f2494O = jVar;
        this.J2 = oVar;
        this.Uo = dAz;
        atomicReference.set(n.rl(nkk));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ik(JSONObject jSONObject, String str) {
        h1M.CN3.J2().rl(str + jSONObject.toString());
    }

    public static CN3 qie(Context context, String str, iwV iwv, QG.n nVar, String str2, String str3, E8K.CN3 cn3, DAz dAz) {
        String strUo = iwv.Uo();
        C1430m c1430m = new C1430m();
        return new CN3(context, new C(str, iwv.KN(), iwv.xMQ(), iwv.mUb(), iwv, QNA.Dsr.KN(QNA.Dsr.az(context), str, str3, str2), str3, str2, u.rl(strUo).t()), c1430m, new fuX(c1430m), new F5.j(cn3), new w6(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), nVar), dAz);
    }

    public Task HI(I28 i28, Zlm.Wre wre) throws Throwable {
        Ml mlAz;
        if (!gh() && (mlAz = az(i28)) != null) {
            this.KN.set(mlAz);
            ((TaskCompletionSource) this.xMQ.get()).trySetResult(mlAz);
            return Tasks.forResult(null);
        }
        Ml mlAz2 = az(I28.IGNORE_CACHE_EXPIRATION);
        if (mlAz2 != null) {
            this.KN.set(mlAz2);
            ((TaskCompletionSource) this.xMQ.get()).trySetResult(mlAz2);
        }
        return this.Uo.gh().onSuccessTask(wre.f12590n, new j(wre));
    }

    boolean gh() {
        return !ty().equals(this.rl.J2);
    }
}
