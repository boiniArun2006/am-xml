package mV;

import B8M.C;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import gAe.Pl;
import gAe.Xo;
import gAe.o;
import gAe.z;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f70685O = "j";
    private static final Object nr = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final z f70686n;
    private final gAe.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Xo f70687t;

    public static final class n {
        private Xo KN;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Context f70689n = null;
        private String rl = null;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f70690t = null;
        private String nr = null;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private gAe.j f70688O = null;
        private boolean J2 = true;
        private o Uo = null;

        public synchronized j J2() {
            j jVar;
            try {
                if (this.rl == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (j.nr) {
                    try {
                        byte[] bArrKN = KN(this.f70689n, this.rl, this.f70690t);
                        if (bArrKN == null) {
                            if (this.nr != null) {
                                this.f70688O = gh();
                            }
                            this.KN = Uo();
                        } else if (this.nr == null || !j.O()) {
                            this.KN = xMQ(bArrKN);
                        } else {
                            this.KN = mUb(bArrKN);
                        }
                        jVar = new j(this);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return jVar;
        }

        private static byte[] KN(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return C.n(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        private Xo Uo() throws GeneralSecurityException {
            if (this.Uo == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            Xo xoN = Xo.xMQ().n(this.Uo);
            Xo xoKN = xoN.KN(xoN.nr().xMQ().M7(0).M7());
            Ml ml = new Ml(this.f70689n, this.rl, this.f70690t);
            if (this.f70688O != null) {
                xoKN.nr().r(ml, this.f70688O);
                return xoKN;
            }
            gAe.w6.rl(xoKN.nr(), ml);
            return xoKN;
        }

        private gAe.j gh() throws KeyStoreException {
            if (!j.O()) {
                Log.w(j.f70685O, "Android Keystore requires at least Android M");
                return null;
            }
            w6 w6Var = new w6();
            try {
                boolean zNr = w6.nr(this.nr);
                try {
                    return w6Var.rl(this.nr);
                } catch (GeneralSecurityException | ProviderException e2) {
                    if (!zNr) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.nr), e2);
                    }
                    Log.w(j.f70685O, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e3) {
                Log.w(j.f70685O, "cannot use Android Keystore, it'll be disabled", e3);
                return null;
            }
        }

        private Xo mUb(byte[] bArr) {
            try {
                this.f70688O = new w6().rl(this.nr);
                try {
                    return Xo.mUb(Pl.ty(gAe.n.rl(bArr), this.f70688O));
                } catch (IOException | GeneralSecurityException e2) {
                    try {
                        return xMQ(bArr);
                    } catch (IOException unused) {
                        throw e2;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e3) {
                try {
                    Xo xoXMQ = xMQ(bArr);
                    Log.w(j.f70685O, "cannot use Android Keystore, it'll be disabled", e3);
                    return xoXMQ;
                } catch (IOException unused2) {
                    throw e3;
                }
            }
        }

        public n az(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.J2) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.nr = str;
            return this;
        }

        public n qie(o oVar) {
            this.Uo = oVar;
            return this;
        }

        public n ty(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f70689n = context;
            this.rl = str;
            this.f70690t = str2;
            return this;
        }

        private Xo xMQ(byte[] bArr) {
            return Xo.mUb(gAe.w6.n(gAe.n.rl(bArr)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean O() {
        return true;
    }

    public synchronized Pl nr() {
        return this.f70687t.nr();
    }

    private j(n nVar) {
        this.f70686n = new Ml(nVar.f70689n, nVar.rl, nVar.f70690t);
        this.rl = nVar.f70688O;
        this.f70687t = nVar.KN;
    }
}
