package oW;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class M {
    qf J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private FirebaseAuth f71468O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f71469n;
    com.google.firebase.Wre nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private zzahk f71470t;

    public M(com.google.firebase.Wre wre, FirebaseAuth firebaseAuth) {
        this(wre, firebaseAuth, new lej());
    }

    private M(com.google.firebase.Wre wre, FirebaseAuth firebaseAuth, qf qfVar) {
        this.f71469n = new Object();
        this.rl = new HashMap();
        this.nr = wre;
        this.f71468O = firebaseAuth;
        this.J2 = qfVar;
    }

    private final Task J2(String str) {
        Task task;
        synchronized (this.f71469n) {
            task = (Task) this.rl.get(str);
        }
        return task;
    }

    static /* synthetic */ void t(M m2, zzahk zzahkVar, Task task, String str) {
        synchronized (m2.f71469n) {
            m2.f71470t = zzahkVar;
            m2.rl.put(str, task);
        }
    }

    public final boolean O(String str) {
        boolean z2;
        synchronized (this.f71469n) {
            try {
                zzahk zzahkVar = this.f71470t;
                z2 = zzahkVar != null && zzahkVar.zzc(str);
            } finally {
            }
        }
        return z2;
    }

    private static String Uo(String str) {
        if (zzae.zzc(str)) {
            return "*";
        }
        return str;
    }

    public final Task n(String str, Boolean bool) {
        Task taskJ2;
        String strUo = Uo(str);
        if (!bool.booleanValue() && (taskJ2 = J2(strUo)) != null) {
            return taskJ2;
        }
        return this.f71468O.s7N("RECAPTCHA_ENTERPRISE").continueWithTask(new iwV(this, strUo));
    }

    public final boolean nr(String str) {
        String strZzb;
        Preconditions.checkNotNull(str);
        zzahk zzahkVar = this.f71470t;
        if (zzahkVar == null || (strZzb = zzahkVar.zzb(str)) == null) {
            return false;
        }
        return strZzb.equals("AUDIT");
    }

    public final Task rl(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String strUo = Uo(str);
        Task taskJ2 = J2(strUo);
        if (bool.booleanValue() || taskJ2 == null) {
            taskJ2 = n(strUo, bool);
        }
        return taskJ2.continueWithTask(new vd(this, recaptchaAction));
    }
}
