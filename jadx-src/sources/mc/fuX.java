package mc;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;
import r0.C2352n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fuX extends Wre {
    public final boolean E2;
    public u9n.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public u9n.Ml f70882O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public zC.j f70883S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public u9n.w6 f70884Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f70885e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f70886g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2352n f70887o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final R9s.j f70888r;

    @Override // mc.Wre, mc.j
    public final void destroy() {
        this.J2 = null;
        u9n.Ml ml = this.f70882O;
        if (ml != null) {
            JiP.j jVar = ml.f74137n;
            if (jVar != null && jVar.rl) {
                ml.rl.unregisterReceiver(jVar);
                ml.f74137n.rl = false;
            }
            JiP.j jVar2 = ml.f74137n;
            if (jVar2 != null) {
                jVar2.f4679n = null;
                ml.f74137n = null;
            }
            ml.f74138t = null;
            ml.rl = null;
            ml.nr = null;
            this.f70882O = null;
        }
        zC.j jVar3 = this.f70883S;
        if (jVar3 != null) {
            EDL.n nVar = jVar3.rl;
            if (nVar != null) {
                nVar.f2264n.clear();
                jVar3.rl = null;
            }
            jVar3.f76377t = null;
            jVar3.f76376n = null;
            this.f70883S = null;
        }
        this.f70881t = null;
        this.f70880n.destroy();
    }

    @Override // mc.Wre, mc.j
    public final void b() {
        if (this.f70884Z == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            eh.j jVar = eh.n.rl.f63842n;
            if (jVar != null) {
                jVar.i("%s : initializing new Ignite authentication session", objArr);
            }
            R9s.j jVar2 = this.f70888r;
            jVar2.getClass();
            try {
                jVar2.rl.t();
            } catch (IOException e2) {
                e = e2;
                Msr.n.rl(Msr.Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e3) {
                e = e3;
                Msr.n.rl(Msr.Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e4) {
                e = e4;
                Msr.n.rl(Msr.Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e5) {
                e = e5;
                Msr.n.rl(Msr.Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e6) {
                e = e6;
                Msr.n.rl(Msr.Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e7) {
                e = e7;
                Msr.n.rl(Msr.Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e8) {
                e = e8;
                Msr.n.rl(Msr.Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e9) {
                e = e9;
                Msr.n.rl(Msr.Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e10) {
                e = e10;
                Msr.n.rl(Msr.Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_INIT_ENCRYPTION));
            } catch (Exception e11) {
                Msr.n.rl(Msr.Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e11, Msr.w6.FAILED_INIT_ENCRYPTION));
            }
            String strN = this.f70888r.n();
            this.f70887o.getClass();
            u9n.w6 w6VarN = C2352n.n(strN);
            this.f70884Z = w6VarN;
            if (w6VarN.rl > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                eh.n.n("%s : One DT resolved from cache", "OneDTAuthenticator");
                u9n.w6 w6Var = this.f70884Z;
                u9n.j jVar3 = this.J2;
                if (jVar3 != null) {
                    eh.n.n("%s : setting one dt entity", "IgniteManager");
                    jVar3.f74140b = w6Var;
                }
            } else {
                this.f70885e.set(true);
            }
        }
        if (this.E2 && this.f70882O == null) {
            eh.n.rl("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (!this.f70886g && !this.f70885e.get()) {
            if (this.E2) {
                this.f70882O.n();
            }
        } else {
            Object[] objArr2 = {"OneDTAuthenticator"};
            eh.j jVar4 = eh.n.rl.f63842n;
            if (jVar4 != null) {
                jVar4.i("%s : will try to authenticate with Ignite if didn't done yet", objArr2);
            }
            this.f70880n.b();
        }
    }

    @Override // mc.Wre, mc.j
    public final String d() {
        j jVar = this.f70880n;
        if (jVar instanceof Wre) {
            return jVar.d();
        }
        return null;
    }

    @Override // mc.Wre, mc.j
    public final String i() {
        j jVar = this.f70880n;
        if (jVar instanceof Wre) {
            return jVar.i();
        }
        return null;
    }

    @Override // mc.Wre, mc.j
    public final boolean j() {
        return this.f70880n.j();
    }

    public final void nr() {
        IIgniteServiceAPI iIgniteServiceAPIK = this.f70880n.k();
        if (iIgniteServiceAPIK == null) {
            eh.n.rl("%s : service is unavailable", "OneDTAuthenticator");
            Msr.n.rl(Msr.Ml.ONE_DT_REQUEST_ERROR, "error_code", Msr.w6.IGNITE_SERVICE_UNAVAILABLE.n());
            return;
        }
        if (this.f70883S == null) {
            this.f70883S = new zC.j(iIgniteServiceAPIK, this);
        }
        if (TextUtils.isEmpty(this.f70880n.e())) {
            Msr.n.rl(Msr.Ml.ONE_DT_REQUEST_ERROR, "error_code", Msr.w6.IGNITE_SERVICE_INVALID_SESSION.n());
            eh.n.rl("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        zC.j jVar = this.f70883S;
        String strE = this.f70880n.e();
        jVar.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", strE);
            jVar.f76377t.getProperty("onedtid", bundle, new Bundle(), jVar.rl);
        } catch (RemoteException e2) {
            Msr.n.n(Msr.Ml.ONE_DT_REQUEST_ERROR, e2);
            eh.n.rl("%s : request failed : %s", "OneDTPropertyHandler", e2.toString());
        }
    }

    @Override // mc.Wre, mc.j
    public final void t(ComponentName componentName, IBinder iBinder) {
        Nge.j jVar;
        boolean zJ = this.f70880n.j();
        if (!zJ && (jVar = this.f70881t) != null) {
            jVar.onOdtUnsupported();
        }
        if (this.f70882O != null && this.f70880n.j() && this.E2) {
            this.f70882O.n();
        }
        if (zJ || this.f70886g) {
            super.t(componentName, iBinder);
        }
    }

    public fuX(j jVar, boolean z2, boolean z3, Nge.j jVar2, u9n.j jVar3) {
        super(jVar, jVar2);
        this.f70886g = false;
        this.E2 = false;
        this.f70885e = new AtomicBoolean(false);
        this.J2 = jVar3;
        this.f70886g = z2;
        this.f70887o = new C2352n();
        this.f70888r = new R9s.j(jVar.g());
        this.E2 = z3;
        if (z3) {
            this.f70882O = new u9n.Ml(jVar.g(), this, this);
        }
    }

    @Override // mc.Wre, mc.j
    public final void c(String str) {
        super.c(str);
        if (this.f70880n.h() && this.f70885e.get() && this.f70880n.j()) {
            this.f70885e.set(false);
            nr();
        }
    }

    @Override // mc.Wre, mc.j
    public final void l() {
        b();
    }
}
