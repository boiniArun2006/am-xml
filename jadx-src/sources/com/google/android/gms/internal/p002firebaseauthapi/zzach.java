package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.Wre;
import com.google.firebase.auth.AbstractC1909z;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.Dsr;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.eO;
import com.google.firebase.auth.internal.zzab;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzah;
import com.google.firebase.auth.internal.zzam;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import oW.InterfaceC2316p;
import oW.Xo;
import oW.Zs;
import oW.afx;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzach extends zzafg {
    public final Task<Void> zza(Wre wre, String str, @Nullable String str2) {
        return zza((zzack) new zzack(str, str2).zza(wre));
    }

    public final Task<Object> zzb(Wre wre, String str, @Nullable String str2) {
        return zza((zzacj) new zzacj(str, str2).zza(wre));
    }

    public final Task<eO> zzc(Wre wre, String str, @Nullable String str2) {
        return zza((zzacn) new zzacn(str, str2).zza(wre));
    }

    public final Task<Void> zzd(Wre wre, FirebaseUser firebaseUser, String str, Zs zs) {
        return zza((zzadx) new zzadx(str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public zzach(Wre wre, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaef(wre, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(Wre wre, String str, String str2, @Nullable String str3) {
        return zza((zzacm) new zzacm(str, str2, str3).zza(wre));
    }

    public final Task<Void> zzb(Wre wre, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, Zs zs) {
        return zza((zzacx) new zzacx(authCredential, str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<AuthResult> zzc(Wre wre, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, Zs zs) {
        return zza((zzada) new zzada(authCredential, str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<AuthResult> zza(Wre wre, String str, String str2, String str3, @Nullable String str4, InterfaceC2316p interfaceC2316p) {
        return zza((zzacl) new zzacl(str, str2, str3, str4).zza(wre).zza(interfaceC2316p));
    }

    public final Task<String> zzd(Wre wre, String str, @Nullable String str2) {
        return zza((zzaeb) new zzaeb(str, str2).zza(wre));
    }

    public final Task<AuthResult> zzb(Wre wre, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, @Nullable String str, Zs zs) {
        return zza((zzadc) new zzadc(emailAuthCredential, str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<Void> zzc(Wre wre, FirebaseUser firebaseUser, String str, Zs zs) {
        return zza((zzady) new zzady(str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    @NonNull
    public final Task<Void> zza(FirebaseUser firebaseUser, oW.eO eOVar) {
        return zza((zzaco) new zzaco().zza(firebaseUser).zza(eOVar).zza((Xo) eOVar));
    }

    public final Task<Void> zza(Wre wre, com.google.firebase.auth.Xo xo, FirebaseUser firebaseUser, @Nullable String str, InterfaceC2316p interfaceC2316p) {
        zzaft.zza();
        zzacq zzacqVar = new zzacq(xo, firebaseUser.zze(), str, null);
        zzacqVar.zza(wre).zza(interfaceC2316p);
        return zza(zzacqVar);
    }

    public final Task<AuthResult> zzb(Wre wre, FirebaseUser firebaseUser, String str, String str2, @Nullable String str3, @Nullable String str4, Zs zs) {
        return zza((zzade) new zzade(str, str2, str3, str4).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<Void> zza(Wre wre, AbstractC1909z abstractC1909z, FirebaseUser firebaseUser, @Nullable String str, @Nullable String str2, InterfaceC2316p interfaceC2316p) {
        zzacq zzacqVar = new zzacq(abstractC1909z, firebaseUser.zze(), str, str2);
        zzacqVar.zza(wre).zza(interfaceC2316p);
        return zza(zzacqVar);
    }

    public final Task<AuthResult> zzb(Wre wre, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, Zs zs) {
        zzaft.zza();
        return zza((zzadg) new zzadg(phoneAuthCredential, str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<AuthResult> zza(Wre wre, @Nullable FirebaseUser firebaseUser, com.google.firebase.auth.Xo xo, String str, InterfaceC2316p interfaceC2316p) {
        zzaft.zza();
        zzacp zzacpVar = new zzacp(xo, str, null);
        zzacpVar.zza(wre).zza(interfaceC2316p);
        if (firebaseUser != null) {
            zzacpVar.zza(firebaseUser);
        }
        return zza(zzacpVar);
    }

    public final Task<Void> zzb(Wre wre, String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, @Nullable String str3) {
        actionCodeSettings.zza(6);
        return zza((zzadk) new zzadk(str, actionCodeSettings, str2, str3, "sendSignInLinkToEmail").zza(wre));
    }

    public final Task<AuthResult> zza(Wre wre, @Nullable FirebaseUser firebaseUser, AbstractC1909z abstractC1909z, String str, @Nullable String str2, InterfaceC2316p interfaceC2316p) {
        zzacp zzacpVar = new zzacp(abstractC1909z, str, str2);
        zzacpVar.zza(wre).zza(interfaceC2316p);
        if (firebaseUser != null) {
            zzacpVar.zza(firebaseUser);
        }
        return zza(zzacpVar);
    }

    public final Task<AuthResult> zzb(Wre wre, String str, String str2, @Nullable String str3, @Nullable String str4, InterfaceC2316p interfaceC2316p) {
        return zza((zzadn) new zzadn(str, str2, str3, str4).zza(wre).zza(interfaceC2316p));
    }

    public final Task<Dsr> zza(Wre wre, FirebaseUser firebaseUser, String str, Zs zs) {
        return zza((zzacs) new zzacs(str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<AuthResult> zzb(Wre wre, FirebaseUser firebaseUser, String str, Zs zs) {
        Preconditions.checkNotNull(wre);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zs);
        List listZzg = firebaseUser.zzg();
        if ((listZzg != null && !listZzg.contains(str)) || firebaseUser.ub()) {
            return Tasks.forException(zzaei.zza(new Status(17016, str)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzadv) new zzadv(str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
        }
        return zza((zzadw) new zzadw().zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<zzahj> zza() {
        return zza(new zzacr());
    }

    public final Task<zzahk> zza(@Nullable String str, String str2) {
        return zza(new zzacu(str, str2));
    }

    public final Task<AuthResult> zza(Wre wre, FirebaseUser firebaseUser, AuthCredential authCredential, @Nullable String str, Zs zs) {
        Preconditions.checkNotNull(wre);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zs);
        List listZzg = firebaseUser.zzg();
        if (listZzg != null && listZzg.contains(authCredential.T3L())) {
            return Tasks.forException(zzaei.zza(new Status(17015)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.ub()) {
                return zza((zzact) new zzact(emailAuthCredential, str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
            }
            return zza((zzacy) new zzacy(emailAuthCredential).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
        }
        if (authCredential instanceof PhoneAuthCredential) {
            zzaft.zza();
            return zza((zzacv) new zzacv((PhoneAuthCredential) authCredential).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
        }
        Preconditions.checkNotNull(wre);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zs);
        return zza((zzacw) new zzacw(authCredential).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<Void> zza(Wre wre, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, @Nullable String str, Zs zs) {
        return zza((zzacz) new zzacz(emailAuthCredential, str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<Void> zza(Wre wre, FirebaseUser firebaseUser, String str, String str2, @Nullable String str3, @Nullable String str4, Zs zs) {
        return zza((zzadb) new zzadb(str, str2, str3, str4).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<Void> zza(Wre wre, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, @Nullable String str, Zs zs) {
        zzaft.zza();
        return zza((zzadd) new zzadd(phoneAuthCredential, str).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    @NonNull
    public final Task<Void> zza(Wre wre, FirebaseUser firebaseUser, Zs zs) {
        return zza((zzadf) new zzadf().zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<Void> zza(String str, String str2, String str3, @Nullable String str4) {
        return zza(new zzadi(str, str2, str3, str4));
    }

    public final Task<Void> zza(Wre wre, @Nullable ActionCodeSettings actionCodeSettings, String str) {
        return zza((zzadh) new zzadh(str, actionCodeSettings).zza(wre));
    }

    public final Task<Void> zza(Wre wre, String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, @Nullable String str3) {
        actionCodeSettings.zza(1);
        return zza((zzadk) new zzadk(str, actionCodeSettings, str2, str3, "sendPasswordResetEmail").zza(wre));
    }

    @NonNull
    public final Task<Void> zza(@Nullable String str) {
        return zza(new zzadj(str));
    }

    public final Task<AuthResult> zza(Wre wre, InterfaceC2316p interfaceC2316p, @Nullable String str) {
        return zza((zzadm) new zzadm(str).zza(wre).zza(interfaceC2316p));
    }

    public final Task<AuthResult> zza(Wre wre, AuthCredential authCredential, @Nullable String str, InterfaceC2316p interfaceC2316p) {
        return zza((zzadl) new zzadl(authCredential, str).zza(wre).zza(interfaceC2316p));
    }

    public final Task<AuthResult> zza(Wre wre, String str, @Nullable String str2, InterfaceC2316p interfaceC2316p) {
        return zza((zzado) new zzado(str, str2).zza(wre).zza(interfaceC2316p));
    }

    public final Task<AuthResult> zza(Wre wre, EmailAuthCredential emailAuthCredential, @Nullable String str, InterfaceC2316p interfaceC2316p) {
        return zza((zzadq) new zzadq(emailAuthCredential, str).zza(wre).zza(interfaceC2316p));
    }

    public final Task<AuthResult> zza(Wre wre, PhoneAuthCredential phoneAuthCredential, @Nullable String str, InterfaceC2316p interfaceC2316p) {
        zzaft.zza();
        return zza((zzadp) new zzadp(phoneAuthCredential, str).zza(wre).zza(interfaceC2316p));
    }

    public final Task<Void> zza(zzam zzamVar, String str, @Nullable String str2, long j2, boolean z2, boolean z3, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z4, PhoneAuthProvider.j jVar, Executor executor, @Nullable Activity activity) {
        zzads zzadsVar = new zzads(zzamVar, str, str2, j2, z2, z3, str3, str4, str5, z4);
        zzadsVar.zza(jVar, activity, executor, str);
        return zza(zzadsVar);
    }

    public final Task<zzaij> zza(zzam zzamVar, @Nullable String str) {
        return zza(new zzadr(zzamVar, str));
    }

    public final Task<Void> zza(zzam zzamVar, PhoneMultiFactorInfo phoneMultiFactorInfo, @Nullable String str, long j2, boolean z2, boolean z3, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z4, PhoneAuthProvider.j jVar, Executor executor, @Nullable Activity activity) {
        zzadu zzaduVar = new zzadu(phoneMultiFactorInfo, Preconditions.checkNotEmpty(zzamVar.zzc()), str, j2, z2, z3, str2, str3, str4, z4);
        zzaduVar.zza(jVar, activity, executor, phoneMultiFactorInfo.p0N());
        return zza(zzaduVar);
    }

    public final Task<Void> zza(Wre wre, FirebaseUser firebaseUser, String str, @Nullable String str2, Zs zs) {
        return zza((zzadt) new zzadt(firebaseUser.zze(), str, str2).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<Void> zza(Wre wre, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, Zs zs) {
        zzaft.zza();
        return zza((zzaea) new zzaea(phoneAuthCredential).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<Void> zza(Wre wre, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, Zs zs) {
        return zza((zzadz) new zzadz(userProfileChangeRequest).zza(wre).zza(firebaseUser).zza(zs).zza((Xo) zs));
    }

    public final Task<Void> zza(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.zza(7);
        return zza(new zzaec(str, str2, actionCodeSettings));
    }

    @NonNull
    @VisibleForTesting
    static zzaf zza(Wre wre, zzahc zzahcVar) {
        Preconditions.checkNotNull(wre);
        Preconditions.checkNotNull(zzahcVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzab(zzahcVar, "firebase"));
        List<zzaht> listZzl = zzahcVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i2 = 0; i2 < listZzl.size(); i2++) {
                arrayList.add(new zzab(listZzl.get(i2)));
            }
        }
        zzaf zzafVar = new zzaf(wre, arrayList);
        zzafVar.Aum(new zzah(zzahcVar.zzb(), zzahcVar.zza()));
        zzafVar.zza(zzahcVar.zzn());
        zzafVar.s(zzahcVar.zze());
        zzafVar.v0j(afx.rl(zzahcVar.zzk()));
        zzafVar.nO(zzahcVar.zzd());
        return zzafVar;
    }

    public final void zza(Wre wre, zzaib zzaibVar, PhoneAuthProvider.j jVar, @Nullable Activity activity, Executor executor) {
        zza((zzaee) new zzaee(zzaibVar).zza(wre).zza(jVar, activity, executor, zzaibVar.zzd()));
    }
}
