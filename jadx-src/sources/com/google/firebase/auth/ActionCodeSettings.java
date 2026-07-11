package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@SafeParcelable.Class(creator = "ActionCodeSettingsCreator")
public class ActionCodeSettings extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new lej();
    private String E2;
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f60076O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private String f60077S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final boolean f60078Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f60079e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f60080g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f60082o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f60083r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60084t;

    public static class j {
        private boolean J2;
        private String KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private String f60085O;
        private String Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f60086n;
        private boolean nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f60087t;

        private j() {
            this.J2 = false;
        }

        public j O(String str) {
            this.f60086n = str;
            return this;
        }

        public ActionCodeSettings n() {
            if (this.f60086n != null) {
                return new ActionCodeSettings(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public j nr(String str) {
            this.rl = str;
            return this;
        }

        public j rl(String str, boolean z2, String str2) {
            this.f60087t = str;
            this.nr = z2;
            this.f60085O = str2;
            return this;
        }

        public j t(boolean z2) {
            this.J2 = z2;
            return this;
        }
    }

    public final int zza() {
        return this.f60080g;
    }

    private ActionCodeSettings(j jVar) {
        this.f60081n = jVar.f60086n;
        this.f60084t = jVar.rl;
        this.f60076O = null;
        this.J2 = jVar.f60087t;
        this.f60083r = jVar.nr;
        this.f60082o = jVar.f60085O;
        this.f60078Z = jVar.J2;
        this.E2 = jVar.Uo;
        this.f60079e = jVar.KN;
    }

    public static j HBN() {
        return new j();
    }

    public static ActionCodeSettings X4T() {
        return new ActionCodeSettings(new j());
    }

    public boolean Bu() {
        return this.f60083r;
    }

    public String Qu() {
        return this.f60081n;
    }

    public boolean T3L() {
        return this.f60078Z;
    }

    public final void UF(String str) {
        this.f60077S = str;
    }

    public String Uf() {
        return this.J2;
    }

    public String f() {
        return this.f60084t;
    }

    public String p0N() {
        return this.f60082o;
    }

    public String ub() {
        return this.f60079e;
    }

    public final void zza(int i2) {
        this.f60080g = i2;
    }

    public final String zzc() {
        return this.E2;
    }

    public final String zzd() {
        return this.f60076O;
    }

    public final String zze() {
        return this.f60077S;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, Qu(), false);
        SafeParcelWriter.writeString(parcel, 2, f(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f60076O, false);
        SafeParcelWriter.writeString(parcel, 4, Uf(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, Bu());
        SafeParcelWriter.writeString(parcel, 6, p0N(), false);
        SafeParcelWriter.writeBoolean(parcel, 7, T3L());
        SafeParcelWriter.writeString(parcel, 8, this.f60077S, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f60080g);
        SafeParcelWriter.writeString(parcel, 10, this.E2, false);
        SafeParcelWriter.writeString(parcel, 11, ub(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    ActionCodeSettings(String str, String str2, String str3, String str4, boolean z2, String str5, boolean z3, String str6, int i2, String str7, String str8) {
        this.f60081n = str;
        this.f60084t = str2;
        this.f60076O = str3;
        this.J2 = str4;
        this.f60083r = z2;
        this.f60082o = str5;
        this.f60078Z = z3;
        this.f60077S = str6;
        this.f60080g = i2;
        this.E2 = str7;
        this.f60079e = str8;
    }
}
