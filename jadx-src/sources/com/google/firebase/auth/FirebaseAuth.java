package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.internal.p002firebaseauthapi.zzael;
import com.google.android.gms.internal.p002firebaseauthapi.zzaev;
import com.google.android.gms.internal.p002firebaseauthapi.zzaft;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.internal.p002firebaseauthapi.zzaib;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzz;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import oW.C2308I28;
import oW.InterfaceC2312j;
import oW.InterfaceC2314n;
import oW.InterfaceC2316p;
import pa.C2333n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class FirebaseAuth implements InterfaceC2314n {
    private final RecaptchaAction HI;
    private final RecaptchaAction Ik;
    private FirebaseUser J2;
    private final Object KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final zzach f60094O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final oSp.n f60095S;
    private final C2308I28 Uo;
    private final Executor ViF;
    private final oSp.n WPU;
    private final oW.s4 XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final oW.P f60096Z;
    private oW.h aYN;
    private final RecaptchaAction az;
    private final RecaptchaAction ck;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f60097g;
    private String gh;
    private final Object mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.Wre f60098n;
    private final Executor nY;
    private final List nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final oW.K f60099o;
    private oW.M qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RecaptchaAction f60100r;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f60101t;
    private String te;
    private final RecaptchaAction ty;
    private String xMQ;

    public interface j {
        void n(FirebaseAuth firebaseAuth);
    }

    class n implements oW.Xo, InterfaceC2316p {
        n() {
        }

        @Override // oW.InterfaceC2316p
        public final void n(zzahn zzahnVar, FirebaseUser firebaseUser) {
            Preconditions.checkNotNull(zzahnVar);
            Preconditions.checkNotNull(firebaseUser);
            firebaseUser.y(zzahnVar);
            FirebaseAuth.this.eF(firebaseUser, zzahnVar, true, true);
        }

        @Override // oW.Xo
        public final void zza(Status status) {
            if (status.getStatusCode() != 17011 && status.getStatusCode() != 17021 && status.getStatusCode() != 17005 && status.getStatusCode() != 17091) {
                return;
            }
            FirebaseAuth.this.ViF();
        }
    }

    class w6 implements InterfaceC2316p {
        w6() {
        }

        @Override // oW.InterfaceC2316p
        public final void n(zzahn zzahnVar, FirebaseUser firebaseUser) {
            Preconditions.checkNotNull(zzahnVar);
            Preconditions.checkNotNull(firebaseUser);
            firebaseUser.y(zzahnVar);
            FirebaseAuth.this.p5(firebaseUser, zzahnVar, true);
        }
    }

    public FirebaseAuth(com.google.firebase.Wre wre, oSp.n nVar, oSp.n nVar2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this(wre, new zzach(wre, executor2, scheduledExecutorService), new oW.K(wre.qie(), wre.Ik()), oW.P.J2(), oW.s4.rl(), nVar, nVar2, executor, executor2, executor3, executor4);
    }

    private final synchronized oW.h fcU() {
        return eWT(this);
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) com.google.firebase.Wre.az().mUb(FirebaseAuth.class);
    }

    public final synchronized void FX(oW.M m2) {
        this.qie = m2;
    }

    public final synchronized oW.M a() {
        return this.qie;
    }

    final void eF(FirebaseUser firebaseUser, zzahn zzahnVar, boolean z2, boolean z3) {
        M7(this, firebaseUser, zzahnVar, true, z3);
    }

    public final void p5(FirebaseUser firebaseUser, zzahn zzahnVar, boolean z2) {
        eF(firebaseUser, zzahnVar, true, false);
    }

    public static void E(Pl pl) {
        String strCheckNotEmpty;
        String phoneNumber;
        if (!pl.ck()) {
            FirebaseAuth firebaseAuthNr = pl.nr();
            String strCheckNotEmpty2 = Preconditions.checkNotEmpty(pl.gh());
            if (pl.Uo() == null && zzaft.zza(strCheckNotEmpty2, pl.KN(), pl.rl(), pl.qie())) {
                return;
            }
            firebaseAuthNr.XQ.n(firebaseAuthNr, strCheckNotEmpty2, pl.rl(), firebaseAuthNr.G7(), pl.az(), pl.HI(), firebaseAuthNr.ck).addOnCompleteListener(new h(firebaseAuthNr, pl, strCheckNotEmpty2));
            return;
        }
        FirebaseAuth firebaseAuthNr2 = pl.nr();
        zzam zzamVar = (zzam) Preconditions.checkNotNull(pl.J2());
        if (zzamVar.zzd()) {
            phoneNumber = Preconditions.checkNotEmpty(pl.gh());
            strCheckNotEmpty = phoneNumber;
        } else {
            PhoneMultiFactorInfo phoneMultiFactorInfo = (PhoneMultiFactorInfo) Preconditions.checkNotNull(pl.xMQ());
            strCheckNotEmpty = Preconditions.checkNotEmpty(phoneMultiFactorInfo.p0N());
            phoneNumber = phoneMultiFactorInfo.getPhoneNumber();
        }
        if (pl.Uo() == null || !zzaft.zza(strCheckNotEmpty, pl.KN(), pl.rl(), pl.qie())) {
            firebaseAuthNr2.XQ.n(firebaseAuthNr2, phoneNumber, pl.rl(), firebaseAuthNr2.G7(), pl.az(), pl.HI(), zzamVar.zzd() ? firebaseAuthNr2.Ik : firebaseAuthNr2.f60100r).addOnCompleteListener(new psW(firebaseAuthNr2, pl, strCheckNotEmpty));
        }
    }

    private final Task E2(EmailAuthCredential emailAuthCredential, FirebaseUser firebaseUser, boolean z2) {
        return new C1907c(this, z2, firebaseUser, emailAuthCredential).rl(this, this.gh, this.az, "EMAIL_PASSWORD_PROVIDER");
    }

    private static void I(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + firebaseUser.f() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.f60097g.execute(new Sis(firebaseAuth, new C2333n(firebaseUser != null ? firebaseUser.zzd() : null)));
    }

    private static void P5(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + firebaseUser.f() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f60097g.execute(new pO(firebaseAuth));
    }

    public static void U(final FirebaseException firebaseException, Pl pl, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        final PhoneAuthProvider.j jVarZza = zzaft.zza(str, pl.KN(), null);
        pl.qie().execute(new Runnable() { // from class: com.google.firebase.auth.Lu
            @Override // java.lang.Runnable
            public final void run() {
                jVarZza.onVerificationFailed(firebaseException);
            }
        });
    }

    private final Task X(FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, boolean z2) {
        return new UGc(this, z2, firebaseUser, emailAuthCredential).rl(this, this.gh, z2 ? this.az : this.ty, "EMAIL_PASSWORD_PROVIDER");
    }

    private static oW.h eWT(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.aYN == null) {
            firebaseAuth.aYN = new oW.h((com.google.firebase.Wre) Preconditions.checkNotNull(firebaseAuth.f60098n));
        }
        return firebaseAuth.aYN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneAuthProvider.j jB(String str, PhoneAuthProvider.j jVar) {
        return (this.Uo.nr() && str != null && str.equals(this.Uo.n())) ? new K(this, jVar) : jVar;
    }

    private final Task v(String str, String str2, String str3, FirebaseUser firebaseUser, boolean z2) {
        return new s4(this, str, z2, firebaseUser, str2, str3).rl(this, str3, this.ty, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    public final Task B(FirebaseUser firebaseUser) {
        return N(firebaseUser, new n());
    }

    public final void C() {
        Preconditions.checkNotNull(this.f60099o);
        FirebaseUser firebaseUser = this.J2;
        if (firebaseUser != null) {
            this.f60099o.KN(firebaseUser);
            this.J2 = null;
        }
        this.f60099o.Uo();
        I(this, null);
        P5(this, null);
    }

    public com.google.firebase.Wre KN() {
        return this.f60098n;
    }

    public final void M(Pl pl, oW.mz mzVar) {
        Pl pl3;
        long jLongValue = pl.mUb().longValue();
        if (jLongValue < 0 || jLongValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String strCheckNotEmpty = Preconditions.checkNotEmpty(pl.gh());
        String strT = mzVar.t();
        String strRl = mzVar.rl();
        String strNr = mzVar.nr();
        if (com.google.android.gms.internal.p002firebaseauthapi.zzae.zzc(strT) && a() != null && a().nr("PHONE_PROVIDER")) {
            strT = "NO_RECAPTCHA";
        }
        String str = strT;
        zzaib zzaibVar = new zzaib(strCheckNotEmpty, jLongValue, pl.Uo() != null, this.xMQ, this.gh, strNr, strRl, str, G7());
        PhoneAuthProvider.j jVarJB = jB(strCheckNotEmpty, pl.KN());
        if (TextUtils.isEmpty(mzVar.nr())) {
            pl3 = pl;
            jVarJB = Xw(pl3, jVarJB, oW.mz.n().nr(strNr).t(str).n(strRl).rl());
        } else {
            pl3 = pl;
        }
        this.f60094O.zza(this.f60098n, zzaibVar, jVarJB, pl3.rl(), pl3.qie());
    }

    public Task S() {
        FirebaseUser firebaseUser = this.J2;
        if (firebaseUser == null || !firebaseUser.ub()) {
            return this.f60094O.zza(this.f60098n, new w6(), this.gh);
        }
        zzaf zzafVar = (zzaf) this.J2;
        zzafVar.zza(false);
        return Tasks.forResult(new zzz(zzafVar));
    }

    public Task Z(String str) {
        return this.f60094O.zza(str);
    }

    public String az() {
        String str;
        synchronized (this.mUb) {
            str = this.gh;
        }
        return str;
    }

    public void ck(j jVar) {
        this.nr.remove(jVar);
    }

    public final oSp.n dR0() {
        return this.WPU;
    }

    public final Executor eTf() {
        return this.nY;
    }

    public void g() {
        synchronized (this.KN) {
            this.xMQ = zzaev.zza();
        }
    }

    @Override // oW.InterfaceC2314n
    public String getUid() {
        FirebaseUser firebaseUser = this.J2;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.f();
    }

    public fuX gh() {
        return this.Uo;
    }

    public final Task iF() {
        return this.f60094O.zza();
    }

    public final Executor ijL() {
        return this.ViF;
    }

    public final oSp.n k() {
        return this.f60095S;
    }

    public String mUb() {
        return this.te;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.mz, oW.Zs] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task nHg(FirebaseUser firebaseUser, boolean z2) {
        if (firebaseUser == null) {
            return Tasks.forException(zzaei.zza(new Status(17495)));
        }
        zzahn zzahnVarVl = firebaseUser.vl();
        return (!zzahnVarVl.zzg() || z2) ? this.f60094O.zza(this.f60098n, firebaseUser, zzahnVarVl.zzd(), (oW.Zs) new mz(this)) : Tasks.forResult(com.google.firebase.auth.internal.I28.n(zzahnVarVl.zzc()));
    }

    public final Executor pJg() {
        return this.f60097g;
    }

    public String qie() {
        String str;
        synchronized (this.KN) {
            str = this.xMQ;
        }
        return str;
    }

    @Override // oW.InterfaceC2314n
    public Task rl(boolean z2) {
        return nHg(this.J2, z2);
    }

    public final Task s7N(String str) {
        return this.f60094O.zza(this.gh, str);
    }

    public void t(j jVar) {
        this.nr.add(jVar);
        this.f60097g.execute(new yg(this, jVar));
    }

    public Task ty() {
        if (this.qie == null) {
            this.qie = new oW.M(this.f60098n, this);
        }
        return this.qie.n(this.gh, Boolean.FALSE).continueWithTask(new l4Z(this));
    }

    public FirebaseUser xMQ() {
        return this.J2;
    }

    private final boolean GR(String str) {
        Ml mlT = Ml.t(str);
        if (mlT != null && !TextUtils.equals(this.gh, mlT.nr())) {
            return true;
        }
        return false;
    }

    private static void M7(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzahn zzahnVar, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzahnVar);
        boolean z6 = false;
        boolean z7 = true;
        if (firebaseAuth.J2 != null && firebaseUser.f().equals(firebaseAuth.J2.f())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || !z3) {
            FirebaseUser firebaseUser2 = firebaseAuth.J2;
            if (firebaseUser2 == null) {
                z6 = true;
            } else {
                boolean zEquals = firebaseUser2.vl().zzc().equals(zzahnVar.zzc());
                if (z4 && zEquals) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z4) {
                    z6 = true;
                }
                z7 = z5;
            }
            Preconditions.checkNotNull(firebaseUser);
            if (firebaseAuth.J2 != null && firebaseUser.f().equals(firebaseAuth.getUid())) {
                firebaseAuth.J2.Vvq(firebaseUser.p0N());
                if (!firebaseUser.ub()) {
                    firebaseAuth.J2.Zn();
                }
                List listN = firebaseUser.Bu().n();
                List listO9 = firebaseUser.o9();
                firebaseAuth.J2.v0j(listN);
                firebaseAuth.J2.nO(listO9);
            } else {
                firebaseAuth.J2 = firebaseUser;
            }
            if (z2) {
                firebaseAuth.f60099o.mUb(firebaseAuth.J2);
            }
            if (z7) {
                FirebaseUser firebaseUser3 = firebaseAuth.J2;
                if (firebaseUser3 != null) {
                    firebaseUser3.y(zzahnVar);
                }
                I(firebaseAuth, firebaseAuth.J2);
            }
            if (z6) {
                P5(firebaseAuth, firebaseAuth.J2);
            }
            if (z2) {
                firebaseAuth.f60099o.O(firebaseUser, zzahnVar);
            }
            FirebaseUser firebaseUser4 = firebaseAuth.J2;
            if (firebaseUser4 != null) {
                eWT(firebaseAuth).nr(firebaseUser4.vl());
            }
        }
    }

    private final Task N(FirebaseUser firebaseUser, oW.Zs zs) {
        Preconditions.checkNotNull(firebaseUser);
        return this.f60094O.zza(this.f60098n, firebaseUser, zs);
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance(@NonNull com.google.firebase.Wre wre) {
        return (FirebaseAuth) wre.mUb(FirebaseAuth.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task D(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseUser);
        return this.f60094O.zzb(this.f60098n, firebaseUser, str, new n());
    }

    final boolean G7() {
        return zzael.zza(KN().qie());
    }

    public boolean HI(String str) {
        return EmailAuthCredential.f(str);
    }

    public Task Ik(String str) {
        Preconditions.checkNotEmpty(str);
        return r(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task J(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(authCredential);
        AuthCredential authCredentialP0N = authCredential.p0N();
        if (authCredentialP0N instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialP0N;
            if ("password".equals(emailAuthCredential.Bu())) {
                return X(firebaseUser, emailAuthCredential, false);
            }
            if (GR(Preconditions.checkNotEmpty(emailAuthCredential.zze()))) {
                return Tasks.forException(zzaei.zza(new Status(17072)));
            }
            return X(firebaseUser, emailAuthCredential, true);
        }
        if (authCredentialP0N instanceof PhoneAuthCredential) {
            return this.f60094O.zza(this.f60098n, firebaseUser, (PhoneAuthCredential) authCredentialP0N, this.gh, (oW.Zs) new n());
        }
        return this.f60094O.zzb(this.f60098n, firebaseUser, authCredentialP0N, firebaseUser.Uf(), (oW.Zs) new n());
    }

    public Task J2(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return new C1908m(this, str, str2).rl(this, this.gh, this.HI, "EMAIL_PASSWORD_PROVIDER");
    }

    public Task O(String str) {
        Preconditions.checkNotEmpty(str);
        return this.f60094O.zzb(this.f60098n, str, this.gh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task T(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(userProfileChangeRequest);
        return this.f60094O.zza(this.f60098n, firebaseUser, userProfileChangeRequest, (oW.Zs) new n());
    }

    public Task Uo(String str) {
        Preconditions.checkNotEmpty(str);
        return this.f60094O.zzc(this.f60098n, str, this.gh);
    }

    public void ViF() {
        C();
        oW.h hVar = this.aYN;
        if (hVar != null) {
            hVar.rl();
        }
    }

    public Task WPU(AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        AuthCredential authCredentialP0N = authCredential.p0N();
        if (authCredentialP0N instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialP0N;
            if (!emailAuthCredential.ub()) {
                return v(emailAuthCredential.zzc(), (String) Preconditions.checkNotNull(emailAuthCredential.zzd()), this.gh, null, false);
            }
            if (GR(Preconditions.checkNotEmpty(emailAuthCredential.zze()))) {
                return Tasks.forException(zzaei.zza(new Status(17072)));
            }
            return E2(emailAuthCredential, null, false);
        }
        if (authCredentialP0N instanceof PhoneAuthCredential) {
            return this.f60094O.zza(this.f60098n, (PhoneAuthCredential) authCredentialP0N, this.gh, (InterfaceC2316p) new w6());
        }
        return this.f60094O.zza(this.f60098n, authCredentialP0N, this.gh, new w6());
    }

    public void XQ(String str) {
        Preconditions.checkNotEmpty(str);
        synchronized (this.mUb) {
            this.gh = str;
        }
    }

    final PhoneAuthProvider.j Xw(Pl pl, PhoneAuthProvider.j jVar, oW.mz mzVar) {
        if (pl.az()) {
            return jVar;
        }
        return new Zs(this, pl, mzVar, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task Y(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(authCredential);
        AuthCredential authCredentialP0N = authCredential.p0N();
        if (authCredentialP0N instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredentialP0N;
            if ("password".equals(emailAuthCredential.Bu())) {
                return v(emailAuthCredential.zzc(), Preconditions.checkNotEmpty(emailAuthCredential.zzd()), firebaseUser.Uf(), firebaseUser, true);
            }
            if (GR(Preconditions.checkNotEmpty(emailAuthCredential.zze()))) {
                return Tasks.forException(zzaei.zza(new Status(17072)));
            }
            return E2(emailAuthCredential, firebaseUser, true);
        }
        if (authCredentialP0N instanceof PhoneAuthCredential) {
            return this.f60094O.zzb(this.f60098n, firebaseUser, (PhoneAuthCredential) authCredentialP0N, this.gh, (oW.Zs) new n());
        }
        return this.f60094O.zzc(this.f60098n, firebaseUser, authCredentialP0N, firebaseUser.Uf(), new n());
    }

    public Task aYN(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return v(str, str2, this.gh, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$n, oW.Zs] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Task e(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        if (authCredential instanceof EmailAuthCredential) {
            return new Md(this, firebaseUser, (EmailAuthCredential) authCredential.p0N()).rl(this, firebaseUser.Uf(), this.HI, "EMAIL_PASSWORD_PROVIDER");
        }
        return this.f60094O.zza(this.f60098n, firebaseUser, authCredential.p0N(), (String) null, (oW.Zs) new n());
    }

    public final Task fD(Activity activity, CN3 cn3, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(cn3);
        Preconditions.checkNotNull(firebaseUser);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f60096Z.nr(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzaei.zza(new Status(17057)));
        }
        oW.Z.O(activity.getApplicationContext(), this, firebaseUser);
        cn3.n(activity);
        return taskCompletionSource.getTask();
    }

    @Override // oW.InterfaceC2314n
    public void n(InterfaceC2312j interfaceC2312j) {
        Preconditions.checkNotNull(interfaceC2312j);
        this.f60101t.add(interfaceC2312j);
        fcU().t(this.f60101t.size());
    }

    public Task nY(Activity activity, CN3 cn3) {
        Preconditions.checkNotNull(cn3);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.f60096Z.t(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzaei.zza(new Status(17057)));
        }
        oW.Z.nr(activity.getApplicationContext(), this);
        cn3.rl(activity);
        return taskCompletionSource.getTask();
    }

    public Task nr(String str) {
        Preconditions.checkNotEmpty(str);
        return this.f60094O.zza(this.f60098n, str, this.gh);
    }

    public Task o(String str, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(actionCodeSettings);
        if (actionCodeSettings.T3L()) {
            String str2 = this.xMQ;
            if (str2 != null) {
                actionCodeSettings.UF(str2);
            }
            return new iF(this, str, actionCodeSettings).rl(this, this.gh, this.az, "EMAIL_PASSWORD_PROVIDER");
        }
        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
    }

    public Task r(String str, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.X4T();
        }
        String str2 = this.xMQ;
        if (str2 != null) {
            actionCodeSettings.UF(str2);
        }
        actionCodeSettings.zza(1);
        return new P(this, str, actionCodeSettings).rl(this, this.gh, this.az, "EMAIL_PASSWORD_PROVIDER");
    }

    public void te(String str, int i2) {
        boolean z2;
        Preconditions.checkNotEmpty(str);
        if (i2 >= 0 && i2 <= 65535) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Port number must be in the range 0-65535");
        zzagd.zza(this.f60098n, str, i2);
    }

    public final Task wTp(String str, String str2, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.X4T();
        }
        String str3 = this.xMQ;
        if (str3 != null) {
            actionCodeSettings.UF(str3);
        }
        return this.f60094O.zza(str, str2, actionCodeSettings);
    }

    private FirebaseAuth(com.google.firebase.Wre wre, zzach zzachVar, oW.K k2, oW.P p2, oW.s4 s4Var, oSp.n nVar, oSp.n nVar2, Executor executor, Executor executor2, Executor executor3, Executor executor4) {
        zzahn zzahnVarN;
        this.rl = new CopyOnWriteArrayList();
        this.f60101t = new CopyOnWriteArrayList();
        this.nr = new CopyOnWriteArrayList();
        this.KN = new Object();
        this.mUb = new Object();
        this.az = RecaptchaAction.custom("getOobCode");
        this.ty = RecaptchaAction.custom("signInWithPassword");
        this.HI = RecaptchaAction.custom("signUpPassword");
        this.ck = RecaptchaAction.custom("sendVerificationCode");
        this.Ik = RecaptchaAction.custom("mfaSmsEnrollment");
        this.f60100r = RecaptchaAction.custom("mfaSmsSignIn");
        this.f60098n = (com.google.firebase.Wre) Preconditions.checkNotNull(wre);
        this.f60094O = (zzach) Preconditions.checkNotNull(zzachVar);
        oW.K k3 = (oW.K) Preconditions.checkNotNull(k2);
        this.f60099o = k3;
        this.Uo = new C2308I28();
        oW.P p3 = (oW.P) Preconditions.checkNotNull(p2);
        this.f60096Z = p3;
        this.XQ = (oW.s4) Preconditions.checkNotNull(s4Var);
        this.f60095S = nVar;
        this.WPU = nVar2;
        this.ViF = executor2;
        this.nY = executor3;
        this.f60097g = executor4;
        FirebaseUser firebaseUserRl = k3.rl();
        this.J2 = firebaseUserRl;
        if (firebaseUserRl != null && (zzahnVarN = k3.n(firebaseUserRl)) != null) {
            M7(this, this.J2, zzahnVarN, false, false);
        }
        p3.rl(this);
    }
}
