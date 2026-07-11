package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.Lu;
import com.facebook.internal.vd;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.l;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0013\u0018\u0000 e2\u00020\u0001:\u0001\rB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\u001cR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u001cR\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u001cR\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\u001cR\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00104\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010 \u001a\u0004\b6\u0010\u001cR\u0019\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010 \u001a\u0004\b9\u0010\u001cR\u0019\u0010=\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010 \u001a\u0004\b<\u0010\u001cR\u0019\u0010@\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010 \u001a\u0004\b?\u0010\u001cR\u0019\u0010C\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010 \u001a\u0004\bB\u0010\u001cR\u0019\u0010F\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010 \u001a\u0004\bE\u0010\u001cR\u0019\u0010I\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010 \u001a\u0004\bH\u0010\u001cR\u001f\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010R\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u0010 \u001a\u0004\bQ\u0010\u001cR%\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR%\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010S8\u0006¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\bZ\u0010WR%\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010S8\u0006¢\u0006\f\n\u0004\b\\\u0010U\u001a\u0004\b]\u0010WR\u0019\u0010a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b_\u0010 \u001a\u0004\b`\u0010\u001cR\u0019\u0010d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010 \u001a\u0004\bc\u0010\u001c¨\u0006f"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "", "encodedClaims", "expectedNonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Lorg/json/JSONObject;", "claimsJson", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lorg/json/JSONObject;Ljava/lang/String;)Z", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "rl", "()Lorg/json/JSONObject;", "Ljava/lang/String;", "getJti", "jti", "t", "getIss", "iss", "O", "getAud", "aud", "J2", "getNonce", "nonce", "", "r", "J", "getExp", "()J", l.f62670y, "o", "getIat", "iat", "Z", "getSub", "sub", "S", "getName", AppMeasurementSdk.ConditionalUserProperty.NAME, "g", "getGivenName", "givenName", "E2", "getMiddleName", "middleName", "e", "getFamilyName", "familyName", "X", "getEmail", Scopes.EMAIL, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "getPicture", "picture", "", "N", "Ljava/util/Set;", "getUserFriends", "()Ljava/util/Set;", "userFriends", "v", "getUserBirthday", "userBirthday", "", "Xw", "Ljava/util/Map;", "getUserAgeRange", "()Ljava/util/Map;", "userAgeRange", "jB", "getUserHometown", "userHometown", "U", "getUserLocation", "userLocation", "P5", "getUserGender", "userGender", "M7", "getUserLink", "userLink", "p5", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAuthenticationTokenClaims.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthenticationTokenClaims.kt\ncom/facebook/AuthenticationTokenClaims\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,585:1\n1#2:586\n*E\n"})
public final class AuthenticationTokenClaims implements Parcelable {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public final String middleName;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public final String nonce;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    public final String userLink;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    public final Set userFriends;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public final String aud;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    public final String userGender;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    public final String picture;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    public final Map userLocation;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    public final String email;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    public final Map userAgeRange;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public final String sub;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String familyName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String givenName;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    public final Map userHometown;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final String jti;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final long iat;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final long exp;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final String iss;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final String userBirthday;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new j();

    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AuthenticationTokenClaims(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims[] newArray(int i2) {
            return new AuthenticationTokenClaims[i2];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenClaims$n, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final String n(JSONObject jSONObject, String name) {
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            Intrinsics.checkNotNullParameter(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }
    }

    public AuthenticationTokenClaims(String encodedClaims, String expectedNonce) throws JSONException {
        Intrinsics.checkNotNullParameter(encodedClaims, "encodedClaims");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        Lu.Uo(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
        if (!n(jSONObject, expectedNonce)) {
            throw new IllegalArgumentException("Invalid claims");
        }
        String string = jSONObject.getString("jti");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.jti = string;
        String string2 = jSONObject.getString("iss");
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.iss = string2;
        String string3 = jSONObject.getString("aud");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.aud = string3;
        String string4 = jSONObject.getString("nonce");
        Intrinsics.checkNotNullExpressionValue(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.nonce = string4;
        this.exp = jSONObject.getLong(l.f62670y);
        this.iat = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        Intrinsics.checkNotNullExpressionValue(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.sub = string5;
        Companion companion = INSTANCE;
        this.name = companion.n(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.givenName = companion.n(jSONObject, "given_name");
        this.middleName = companion.n(jSONObject, "middle_name");
        this.familyName = companion.n(jSONObject, "family_name");
        this.email = companion.n(jSONObject, Scopes.EMAIL);
        this.picture = companion.n(jSONObject, "picture");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
        this.userFriends = jSONArrayOptJSONArray == null ? null : Collections.unmodifiableSet(vd.Y(jSONArrayOptJSONArray));
        this.userBirthday = companion.n(jSONObject, "user_birthday");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
        this.userAgeRange = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(vd.HI(jSONObjectOptJSONObject));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.userHometown = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(vd.ck(jSONObjectOptJSONObject2));
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
        this.userLocation = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(vd.ck(jSONObjectOptJSONObject3)) : null;
        this.userGender = companion.n(jSONObject, "user_gender");
        this.userLink = companion.n(jSONObject, "user_link");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) other;
        return Intrinsics.areEqual(this.jti, authenticationTokenClaims.jti) && Intrinsics.areEqual(this.iss, authenticationTokenClaims.iss) && Intrinsics.areEqual(this.aud, authenticationTokenClaims.aud) && Intrinsics.areEqual(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && Intrinsics.areEqual(this.sub, authenticationTokenClaims.sub) && Intrinsics.areEqual(this.name, authenticationTokenClaims.name) && Intrinsics.areEqual(this.givenName, authenticationTokenClaims.givenName) && Intrinsics.areEqual(this.middleName, authenticationTokenClaims.middleName) && Intrinsics.areEqual(this.familyName, authenticationTokenClaims.familyName) && Intrinsics.areEqual(this.email, authenticationTokenClaims.email) && Intrinsics.areEqual(this.picture, authenticationTokenClaims.picture) && Intrinsics.areEqual(this.userFriends, authenticationTokenClaims.userFriends) && Intrinsics.areEqual(this.userBirthday, authenticationTokenClaims.userBirthday) && Intrinsics.areEqual(this.userAgeRange, authenticationTokenClaims.userAgeRange) && Intrinsics.areEqual(this.userHometown, authenticationTokenClaims.userHometown) && Intrinsics.areEqual(this.userLocation, authenticationTokenClaims.userLocation) && Intrinsics.areEqual(this.userGender, authenticationTokenClaims.userGender) && Intrinsics.areEqual(this.userLink, authenticationTokenClaims.userLink);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(new java.net.URL(r2).getHost(), "www.facebook.com") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean n(JSONObject claimsJson, String expectedNonce) {
        if (claimsJson == null) {
            return false;
        }
        String jti = claimsJson.optString("jti");
        Intrinsics.checkNotNullExpressionValue(jti, "jti");
        if (jti.length() == 0) {
            return false;
        }
        try {
            String iss = claimsJson.optString("iss");
            Intrinsics.checkNotNullExpressionValue(iss, "iss");
            if (iss.length() != 0) {
                if (!Intrinsics.areEqual(new URL(iss).getHost(), "facebook.com")) {
                }
                String aud = claimsJson.optString("aud");
                Intrinsics.checkNotNullExpressionValue(aud, "aud");
                if (aud.length() == 0 || !Intrinsics.areEqual(aud, s4.az())) {
                    return false;
                }
                long j2 = 1000;
                if (new Date().after(new Date(claimsJson.optLong(l.f62670y) * j2))) {
                    return false;
                }
                if (new Date().after(new Date((claimsJson.optLong("iat") * j2) + 600000))) {
                    return false;
                }
                String sub = claimsJson.optString("sub");
                Intrinsics.checkNotNullExpressionValue(sub, "sub");
                if (sub.length() == 0) {
                    return false;
                }
                String str = wDgKoYAES.kkg;
                String strOptString = claimsJson.optString(str);
                Intrinsics.checkNotNullExpressionValue(strOptString, str);
                return strOptString.length() != 0 && Intrinsics.areEqual(strOptString, expectedNonce);
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = (((((((((((((527 + this.jti.hashCode()) * 31) + this.iss.hashCode()) * 31) + this.aud.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Long.hashCode(this.exp)) * 31) + Long.hashCode(this.iat)) * 31) + this.sub.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.givenName;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.middleName;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.familyName;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.email;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.picture;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set set = this.userFriends;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.userBirthday;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map map = this.userAgeRange;
        int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.userHometown;
        int iHashCode11 = (iHashCode10 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.userLocation;
        int iHashCode12 = (iHashCode11 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.userGender;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.userLink;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final JSONObject rl() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.jti);
        jSONObject.put("iss", this.iss);
        jSONObject.put("aud", this.aud);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put(l.f62670y, this.exp);
        jSONObject.put("iat", this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put(Scopes.EMAIL, str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.userFriends != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put(gUxOLwRQBPPLC.RaRdaVs, new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put("user_hometown", new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put("user_location", new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.jti);
        dest.writeString(this.iss);
        dest.writeString(this.aud);
        dest.writeString(this.nonce);
        dest.writeLong(this.exp);
        dest.writeLong(this.iat);
        dest.writeString(this.sub);
        dest.writeString(this.name);
        dest.writeString(this.givenName);
        dest.writeString(this.middleName);
        dest.writeString(this.familyName);
        dest.writeString(this.email);
        dest.writeString(this.picture);
        if (this.userFriends == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(this.userFriends));
        }
        dest.writeString(this.userBirthday);
        dest.writeMap(this.userAgeRange);
        dest.writeMap(this.userHometown);
        dest.writeMap(this.userLocation);
        dest.writeString(this.userGender);
        dest.writeString(this.userLink);
    }

    public String toString() {
        String string = rl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "claimsJsonObject.toString()");
        return string;
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.jti = Lu.gh(parcel.readString(), "jti");
        this.iss = Lu.gh(parcel.readString(), "iss");
        this.aud = Lu.gh(parcel.readString(), "aud");
        this.nonce = Lu.gh(parcel.readString(), "nonce");
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        this.sub = Lu.gh(parcel.readString(), "sub");
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.userFriends = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.userBirthday = parcel.readString();
        HashMap hashMap = parcel.readHashMap(IntCompanionObject.INSTANCE.getClass().getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.userAgeRange = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        HashMap hashMap2 = parcel.readHashMap(stringCompanionObject.getClass().getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.userHometown = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(stringCompanionObject.getClass().getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.userLocation = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }
}
