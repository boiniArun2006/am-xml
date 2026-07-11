package oW;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.zzc;
import com.safedk.android.analytics.events.base.StatsEvent;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Z {
    private static long nr = 3600000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Task f71490n;
    private Task rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f71491t = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final zzaj f71489O = zzaj.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", StatsEvent.f62824A);
    private static final Z J2 = new Z();

    public static void J2(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("recaptchaToken", str);
        editorEdit.putString("operation", str2);
        editorEdit.putLong(StatsEvent.f62824A, DefaultClock.getInstance().currentTimeMillis());
        editorEdit.commit();
    }

    public static Z mUb() {
        return J2;
    }

    public static void rl(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.getStatusCode());
        editorEdit.putString("statusMessage", status.getStatusMessage());
        editorEdit.putLong(StatsEvent.f62824A, DefaultClock.getInstance().currentTimeMillis());
        editorEdit.commit();
    }

    public static void t(Context context, zzait zzaitVar, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("verifyAssertionRequest", SafeParcelableSerializer.serializeToString(zzaitVar));
        editorEdit.putString("operation", str);
        editorEdit.putString("tenantId", str2);
        editorEdit.putLong(StatsEvent.f62824A, DefaultClock.getInstance().currentTimeMillis());
        editorEdit.commit();
    }

    private Z() {
    }

    public static void O(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        Preconditions.checkNotNull(firebaseUser);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.KN().HI());
        editorEdit.putString("firebaseUserUid", firebaseUser.f());
        editorEdit.commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void Uo(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzaj zzajVar = f71489O;
        int size = zzajVar.size();
        int i2 = 0;
        while (i2 < size) {
            E e2 = zzajVar.get(i2);
            i2++;
            editorEdit.remove((String) e2);
        }
        editorEdit.commit();
    }

    public static void nr(Context context, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putString("firebaseAppName", firebaseAuth.KN().HI());
        editorEdit.commit();
    }

    public final void KN(FirebaseAuth firebaseAuth) {
        zzait zzaitVar;
        String string;
        Preconditions.checkNotNull(firebaseAuth);
        SharedPreferences sharedPreferences = firebaseAuth.KN().qie().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.KN().HI().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (sharedPreferences.contains("verifyAssertionRequest")) {
                zzaitVar = (zzait) SafeParcelableSerializer.deserializeFromString(sharedPreferences.getString("verifyAssertionRequest", ""), zzait.CREATOR);
                String string2 = sharedPreferences.getString("operation", "");
                String string3 = sharedPreferences.getString("tenantId", null);
                string = sharedPreferences.getString("firebaseUserUid", "");
                this.f71491t = sharedPreferences.getLong(StatsEvent.f62824A, 0L);
                if (string3 != null) {
                    firebaseAuth.XQ(string3);
                    zzaitVar.zzb(string3);
                }
                string2.getClass();
                switch (string2) {
                    case "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE":
                        if (firebaseAuth.xMQ().f().equals(string)) {
                            this.f71490n = firebaseAuth.Y(firebaseAuth.xMQ(), zzc.ub(zzaitVar));
                            break;
                        } else {
                            this.f71490n = null;
                            break;
                        }
                        break;
                    case "com.google.firebase.auth.internal.NONGMSCORE_LINK":
                        if (firebaseAuth.xMQ().f().equals(string)) {
                            this.f71490n = firebaseAuth.e(firebaseAuth.xMQ(), zzc.ub(zzaitVar));
                            break;
                        } else {
                            this.f71490n = null;
                            break;
                        }
                        break;
                    case "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN":
                        this.f71490n = firebaseAuth.WPU(zzc.ub(zzaitVar));
                        break;
                    default:
                        this.f71490n = null;
                        break;
                }
                Uo(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("recaptchaToken")) {
                String string4 = sharedPreferences.getString("recaptchaToken", "");
                String string5 = sharedPreferences.getString("operation", "");
                this.f71491t = sharedPreferences.getLong(StatsEvent.f62824A, 0L);
                string5.getClass();
                if (!string5.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    this.rl = null;
                } else {
                    this.rl = Tasks.forResult(string4);
                }
                Uo(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("statusCode")) {
                Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                this.f71491t = sharedPreferences.getLong(StatsEvent.f62824A, 0L);
                Uo(sharedPreferences);
                this.f71490n = Tasks.forException(zzaei.zza(status));
            }
        }
    }

    public final void n(Context context) {
        Preconditions.checkNotNull(context);
        Uo(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f71490n = null;
        this.f71491t = 0L;
    }

    public final Task xMQ() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.f71491t < nr) {
            return this.rl;
        }
        return null;
    }
}
