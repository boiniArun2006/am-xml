package com.android.billingclient.api;

import OS.InterfaceC1422c;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.play_billing.zze;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {

    /* JADX INFO: renamed from: com.android.billingclient.api.j$j, reason: collision with other inner class name */
    public static final class C0688j {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private volatile boolean f47613O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private volatile I28 f47614n;
        private volatile boolean nr;
        private final Context rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private volatile InterfaceC1422c f47615t;

        private final boolean nr() {
            try {
                return this.rl.getPackageManager().getApplicationInfo(this.rl.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e2) {
                zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e2);
                return false;
            }
        }

        public C0688j rl(I28 i28) {
            this.f47614n = i28;
            return this;
        }

        public j n() {
            if (this.rl == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f47615t == null) {
                if (!this.nr && !this.f47613O) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                Context context = this.rl;
                return nr() ? new DAz(null, context, null, null) : new n(null, context, null, null);
            }
            if (this.f47614n == null || !this.f47614n.n()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f47615t == null) {
                I28 i28 = this.f47614n;
                Context context2 = this.rl;
                return nr() ? new DAz(null, i28, context2, null, null, null) : new n(null, i28, context2, null, null, null);
            }
            I28 i282 = this.f47614n;
            Context context3 = this.rl;
            InterfaceC1422c interfaceC1422c = this.f47615t;
            return nr() ? new DAz(null, i282, context3, interfaceC1422c, null, null, null) : new n(null, i282, context3, interfaceC1422c, null, null, null);
        }

        public C0688j t(InterfaceC1422c interfaceC1422c) {
            this.f47615t = interfaceC1422c;
            return this;
        }

        /* synthetic */ C0688j(Context context, OS.Md md) {
            this.rl = context;
        }
    }

    public static C0688j nr(Context context) {
        return new C0688j(context, null);
    }

    public abstract void J2(OS.s4 s4Var, OS.eO eOVar);

    public abstract void KN(OS.Dsr dsr);

    public abstract void O(CN3 cn3, OS.Pl pl);

    public abstract void Uo(OS.UGc uGc, OS.QJ qj);

    public abstract void n(OS.j jVar, OS.n nVar);

    public abstract void rl(OS.aC aCVar, OS.C c2);

    public abstract Ml t(Activity activity, w6 w6Var);
}
