package cIr;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import uOq.C2403c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class QJ {
    private static final Mj.n rl = new Mj.n(QJ.class.getSimpleName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C2403c f43580n;

    enum n {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f43581n;

        static {
            int[] iArr = new int[n.values().length];
            f43581n = iArr;
            try {
                iArr[n.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43581n[n.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void nr(Dh.w6 w6Var) {
        if (w6Var instanceof cIr.n) {
            ((SharedPreferences) this.f43580n.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", ((cIr.n) w6Var).xMQ()).putString("com.google.firebase.appcheck.TOKEN_TYPE", n.DEFAULT_APP_CHECK_TOKEN.name()).apply();
        } else {
            ((SharedPreferences) this.f43580n.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", w6Var.rl()).putString("com.google.firebase.appcheck.TOKEN_TYPE", n.UNKNOWN_APP_CHECK_TOKEN.name()).apply();
        }
    }

    void rl() {
        ((SharedPreferences) this.f43580n.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    public Dh.w6 t() {
        String string = ((SharedPreferences) this.f43580n.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
        String string2 = ((SharedPreferences) this.f43580n.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
        if (string != null && string2 != null) {
            try {
                int i2 = j.f43581n[n.valueOf(string).ordinal()];
                if (i2 == 1) {
                    return cIr.n.O(string2);
                }
                if (i2 == 2) {
                    return cIr.n.nr(string2);
                }
                rl.nr("Reached unreachable section in #retrieveAppCheckToken()");
                return null;
            } catch (IllegalArgumentException e2) {
                rl.nr("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e2.getMessage());
                rl();
            }
        }
        return null;
    }

    public QJ(final Context context, String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        final String str2 = String.format("com.google.firebase.appcheck.store.%s", str);
        this.f43580n = new C2403c(new oSp.n() { // from class: cIr.z
            @Override // oSp.n
            public final Object get() {
                return context.getSharedPreferences(str2, 0);
            }
        });
    }
}
