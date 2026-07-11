package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.caoccao.javet.interop.loader.JavetLibLoadingListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.firebase.auth.C;
import com.google.firebase.auth.Dsr;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.QJ;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SafeParcelable.Class(creator = "DefaultFirebaseUserCreator")
public class zzaf extends FirebaseUser {
    public static final Parcelable.Creator<zzaf> CREATOR = new j();
    public boolean E2;
    public String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f60180O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Boolean f60181S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public List f60182T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public zzbj f60183X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f60184Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzc f60185e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzah f60186g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zzahn f60187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f60188o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f60189r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public zzab f60190t;

    public zzaf(com.google.firebase.Wre wre, List list) {
        Preconditions.checkNotNull(wre);
        this.f60180O = wre.HI();
        this.J2 = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f60184Z = "2";
        Vvq(list);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final synchronized FirebaseUser Vvq(List list) {
        try {
            Preconditions.checkNotNull(list);
            this.f60189r = new ArrayList(list.size());
            this.f60188o = new ArrayList(list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                QJ qj = (QJ) list.get(i2);
                if (qj.n1().equals("firebase")) {
                    this.f60190t = (zzab) qj;
                } else {
                    this.f60188o.add(qj.n1());
                }
                this.f60189r.add((zzab) qj);
            }
            if (this.f60190t == null) {
                this.f60190t = (zzab) this.f60189r.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final void Aum(zzah zzahVar) {
        this.f60186g = zzahVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public /* synthetic */ C Bu() {
        return new oW.fuX(this);
    }

    public final zzc Lp6() {
        return this.f60185e;
    }

    public final List Mh() {
        return this.f60189r;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public FirebaseUserMetadata T3L() {
        return this.f60186g;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public String Uf() {
        Map map;
        zzahn zzahnVar = this.f60187n;
        if (zzahnVar == null || zzahnVar.zzc() == null || (map = (Map) I28.n(this.f60187n.zzc()).n().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ FirebaseUser Zn() {
        this.f60181S = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public String f() {
        return this.f60190t.T3L();
    }

    public final List g6() {
        zzbj zzbjVar = this.f60183X;
        return zzbjVar != null ? zzbjVar.zza() : new ArrayList();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public String getDisplayName() {
        return this.f60190t.getDisplayName();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.QJ
    public String getEmail() {
        return this.f60190t.getEmail();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public String getPhoneNumber() {
        return this.f60190t.getPhoneNumber();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public Uri getPhotoUrl() {
        return this.f60190t.getPhotoUrl();
    }

    public final boolean jO() {
        return this.E2;
    }

    @Override // com.google.firebase.auth.QJ
    public String n1() {
        return this.f60190t.n1();
    }

    public final zzaf n7b(String str) {
        this.f60184Z = str;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void nO(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.f60182T = list;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List o9() {
        return this.f60182T;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public List p0N() {
        return this.f60189r;
    }

    @Override // com.google.firebase.auth.QJ
    public boolean rl() {
        return this.f60190t.rl();
    }

    public final void s(zzc zzcVar) {
        this.f60185e = zzcVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final com.google.firebase.Wre uG() {
        return com.google.firebase.Wre.ty(this.f60180O);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public boolean ub() {
        Dsr dsrN;
        Boolean bool = this.f60181S;
        if (bool == null || bool.booleanValue()) {
            zzahn zzahnVar = this.f60187n;
            String strRl = "";
            if (zzahnVar != null && (dsrN = I28.n(zzahnVar.zzc())) != null) {
                strRl = dsrN.rl();
            }
            boolean z2 = true;
            if (p0N().size() > 1 || (strRl != null && strRl.equals(JavetLibLoadingListener.JAVET_LIB_LOADING_TYPE_CUSTOM))) {
                z2 = false;
            }
            this.f60181S = Boolean.valueOf(z2);
        }
        return this.f60181S.booleanValue();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final zzahn vl() {
        return this.f60187n;
    }

    public final void zza(boolean z2) {
        this.E2 = z2;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zze() {
        return this.f60187n.zzf();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List zzg() {
        return this.f60188o;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void v0j(List list) {
        this.f60183X = zzbj.T3L(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, vl(), i2, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f60190t, i2, false);
        SafeParcelWriter.writeString(parcel, 3, this.f60180O, false);
        SafeParcelWriter.writeString(parcel, 4, this.J2, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f60189r, false);
        SafeParcelWriter.writeStringList(parcel, 6, zzg(), false);
        SafeParcelWriter.writeString(parcel, 7, this.f60184Z, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(ub()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, T3L(), i2, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.E2);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f60185e, i2, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f60183X, i2, false);
        SafeParcelWriter.writeTypedList(parcel, 13, o9(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void y(zzahn zzahnVar) {
        this.f60187n = (zzahn) Preconditions.checkNotNull(zzahnVar);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zzd() {
        return vl().zzc();
    }

    public zzaf(zzahn zzahnVar, zzab zzabVar, String str, String str2, List list, List list2, String str3, Boolean bool, zzah zzahVar, boolean z2, zzc zzcVar, zzbj zzbjVar, List list3) {
        this.f60187n = zzahnVar;
        this.f60190t = zzabVar;
        this.f60180O = str;
        this.J2 = str2;
        this.f60189r = list;
        this.f60188o = list2;
        this.f60184Z = str3;
        this.f60181S = bool;
        this.f60186g = zzahVar;
        this.E2 = z2;
        this.f60185e = zzcVar;
        this.f60183X = zzbjVar;
        this.f60182T = list3;
    }
}
