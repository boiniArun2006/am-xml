package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class qz {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f60694O;
    private final String Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60695n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f60696t;

    public static final class n {
        private String J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private String f60697O;
        private String Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f60698n;
        private String nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f60699t;

        public qz n() {
            return new qz(this.rl, this.f60698n, this.f60699t, this.nr, this.f60697O, this.J2, this.Uo);
        }

        public n nr(String str) {
            this.Uo = str;
            return this;
        }

        public n rl(String str) {
            this.f60698n = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        public n t(String str) {
            this.rl = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }
    }

    private qz(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.rl = str;
        this.f60695n = str2;
        this.f60696t = str3;
        this.nr = str4;
        this.f60694O = str5;
        this.J2 = str6;
        this.Uo = str7;
    }

    public static qz n(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new qz(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String J2() {
        return this.J2;
    }

    public String O() {
        return this.Uo;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return Objects.equal(this.rl, qzVar.rl) && Objects.equal(this.f60695n, qzVar.f60695n) && Objects.equal(this.f60696t, qzVar.f60696t) && Objects.equal(this.nr, qzVar.nr) && Objects.equal(this.f60694O, qzVar.f60694O) && Objects.equal(this.J2, qzVar.J2) && Objects.equal(this.Uo, qzVar.Uo);
    }

    public int hashCode() {
        return Objects.hashCode(this.rl, this.f60695n, this.f60696t, this.nr, this.f60694O, this.J2, this.Uo);
    }

    public String nr() {
        return this.f60694O;
    }

    public String rl() {
        return this.f60695n;
    }

    public String t() {
        return this.rl;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.rl).add("apiKey", this.f60695n).add("databaseUrl", this.f60696t).add("gcmSenderId", this.f60694O).add("storageBucket", this.J2).add("projectId", this.Uo).toString();
    }
}
