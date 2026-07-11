package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class FirebaseUser extends AbstractSafeParcelable implements QJ {
    public abstract C Bu();

    public abstract FirebaseUserMetadata T3L();

    public abstract String Uf();

    public abstract FirebaseUser Vvq(List list);

    public abstract FirebaseUser Zn();

    public abstract String f();

    public abstract String getDisplayName();

    @Override // com.google.firebase.auth.QJ
    public abstract String getEmail();

    public abstract String getPhoneNumber();

    public abstract Uri getPhotoUrl();

    public abstract void nO(List list);

    public abstract List o9();

    public abstract List p0N();

    public abstract com.google.firebase.Wre uG();

    public abstract boolean ub();

    public abstract void v0j(List list);

    public abstract zzahn vl();

    public abstract void y(zzahn zzahnVar);

    public abstract String zzd();

    public abstract String zze();

    public abstract List zzg();

    public Task EF(String str, ActionCodeSettings actionCodeSettings) {
        return FirebaseAuth.getInstance(uG()).nHg(this, false).continueWithTask(new r(this, str, actionCodeSettings));
    }

    public Task HBN(AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        return FirebaseAuth.getInstance(uG()).J(this, authCredential);
    }

    public Task JVN(String str) {
        Preconditions.checkNotEmpty(str);
        return FirebaseAuth.getInstance(uG()).D(this, str);
    }

    public Task Qu(AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        return FirebaseAuth.getInstance(uG()).e(this, authCredential);
    }

    public Task UF(AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        return FirebaseAuth.getInstance(uG()).Y(this, authCredential);
    }

    public Task X4T() {
        return FirebaseAuth.getInstance(uG()).B(this);
    }

    public Task Zmq(Activity activity, CN3 cn3) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(cn3);
        return FirebaseAuth.getInstance(uG()).fD(activity, cn3, this);
    }

    public Task xVH(UserProfileChangeRequest userProfileChangeRequest) {
        Preconditions.checkNotNull(userProfileChangeRequest);
        return FirebaseAuth.getInstance(uG()).T(this, userProfileChangeRequest);
    }
}
