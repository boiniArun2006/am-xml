package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.common.collect.Ln;
import com.google.common.collect.nKK;
import com.google.common.collect.u;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzoe {
    static final nKK zza = nKK.ViF("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final boolean zzc(com.google.android.gms.internal.measurement.zzko zzkoVar, u uVar, u uVar2, Ln ln2, char[] cArr, int i2, int i3, int i5, int i7, int i8, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        int i9;
        int i10;
        int i11;
        boolean z5;
        boolean z6;
        boolean z7;
        String str4;
        String str5;
        String str6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char[] cArr2;
        Ln ln3;
        u uVar3;
        u uVar4;
        com.google.android.gms.internal.measurement.zzko zzkoVar2;
        Ln ln4;
        String str7;
        zzod zzodVar;
        char c2;
        int iZze = zze(zzkoVar, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4);
        if (iZze > 0) {
            i10 = i5;
            if (i10 == 1) {
                i9 = i3;
                if (i9 == 1) {
                    zzkoVar2 = zzkoVar;
                    uVar3 = uVar2;
                    ln3 = ln2;
                    cArr2 = cArr;
                    i16 = i2;
                    i13 = i7;
                    i12 = i8;
                    str6 = str;
                    str5 = str2;
                    str4 = str3;
                    z7 = z2;
                    z6 = z3;
                    z5 = z4;
                    i11 = iZze;
                    i15 = 1;
                    i14 = 1;
                    uVar4 = uVar;
                    if (zzi(zzkoVar2, uVar4, uVar3, ln3, cArr2, i16, i15, i14, i13, i12, str6, str5, str4, z7, z6, z5) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_NOT_ALLOWED) {
                        c2 = '3';
                    } else {
                        int i17 = i8;
                        if (zzkoVar2 == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                            ln4 = ln2;
                            str7 = str;
                            if (i17 == 1) {
                                if (ln4.contains(str7)) {
                                    if (i11 > 0 && cArr[i11] != '2') {
                                        cArr[i11] = '1';
                                    }
                                    return true;
                                }
                                i17 = 1;
                            }
                        } else {
                            ln4 = ln2;
                            str7 = str;
                        }
                        if (uVar4.containsKey(zzkoVar2) && (zzodVar = (zzod) uVar4.get(zzkoVar2)) != null) {
                            int iOrdinal = zzodVar.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    if (iOrdinal == 2) {
                                        return zzi(zzkoVar2, uVar4, uVar2, ln4, cArr, i2, i15, i14, i7, i17, str7, str2, str3, z2, z3, z4) == com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzkoVar, uVar, uVar2, ln2, cArr, i2, i15, i14, i7, i17, str, str2, str3, z2, z3, z4) : zzg(zzkoVar, uVar, uVar2, ln2, cArr, i2, i15, i14, i7, i17, str, str2, str3, z2, z3, z4);
                                    }
                                    if (iOrdinal == 3) {
                                        return zzi(zzkoVar2, uVar4, uVar2, ln4, cArr, i2, i15, i14, i7, i17, str7, str2, str3, z2, z3, z4) == com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzkoVar, uVar, uVar2, ln2, cArr, i2, i15, i14, i7, i17, str, str2, str3, z2, z3, z4) : zzh(zzkoVar, uVar, uVar2, ln2, cArr, i2, i15, i14, i7, i17, str, str2, str3, z2, z3, z4);
                                    }
                                    c2 = '0';
                                } else if (zzi(zzkoVar2, uVar4, uVar2, ln4, cArr, i2, i15, i14, i7, i17, str7, str2, str3, z2, z3, z4) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                    return zzh(zzkoVar, uVar, uVar2, ln2, cArr, i2, i15, i14, i7, i17, str, str2, str3, z2, z3, z4);
                                }
                            } else if (zzi(zzkoVar2, uVar4, uVar2, ln4, cArr, i2, i15, i14, i7, i17, str7, str2, str3, z2, z3, z4) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                return zzg(zzkoVar, uVar, uVar2, ln2, cArr, i2, i15, i14, i7, i17, str, str2, str3, z2, z3, z4);
                            }
                            c2 = '8';
                        } else {
                            c2 = '0';
                        }
                    }
                    if (i11 <= 0 && cArr[i11] != '2') {
                        cArr[i11] = c2;
                        return false;
                    }
                }
                i10 = 1;
            } else {
                i9 = i3;
            }
            cArr[iZze] = '2';
        } else {
            i9 = i3;
            i10 = i5;
        }
        zzkoVar2 = zzkoVar;
        uVar4 = uVar;
        cArr2 = cArr;
        i16 = i2;
        i13 = i7;
        i12 = i8;
        str6 = str;
        str5 = str2;
        str4 = str3;
        z7 = z2;
        z6 = z3;
        z5 = z4;
        i11 = iZze;
        i14 = i10;
        i15 = i9;
        uVar3 = uVar2;
        ln3 = ln2;
        if (zzi(zzkoVar2, uVar4, uVar3, ln3, cArr2, i16, i15, i14, i13, i12, str6, str5, str4, z7, z6, z5) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_NOT_ALLOWED) {
        }
        return i11 <= 0 ? false : false;
    }

    public static final Map zzd(u uVar, u uVar2, Ln ln2, char[] cArr, int i2, int i3, int i5, int i7, int i8, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        com.google.android.gms.internal.measurement.zzko zzkoVar;
        Object obj;
        com.google.android.gms.internal.measurement.zzko zzkoVar2;
        Object obj2;
        if (((Boolean) zzfx.zzba.zzb(null)).booleanValue() && !z4) {
            return u.ty();
        }
        com.google.android.gms.internal.measurement.zzko zzkoVar3 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkp zzkpVar = (com.google.android.gms.internal.measurement.zzkp) uVar2.get(zzkoVar3);
        com.google.android.gms.internal.measurement.zzko zzkoVar4 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = (com.google.android.gms.internal.measurement.zzkp) uVar2.get(zzkoVar4);
        com.google.android.gms.internal.measurement.zzko zzkoVar5 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = (com.google.android.gms.internal.measurement.zzkp) uVar2.get(zzkoVar5);
        com.google.android.gms.internal.measurement.zzko zzkoVar6 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkp zzkpVar4 = (com.google.android.gms.internal.measurement.zzkp) uVar2.get(zzkoVar6);
        u.j jVarXMQ = u.t().J2("Version", "2").J2("VendorConsent", true != z2 ? "0" : "1").J2("VendorLegitimateInterest", true != z3 ? "0" : "1").J2("gdprApplies", i5 != 1 ? "0" : "1").J2("EnableAdvertiserConsentMode", i3 != 1 ? "0" : "1").J2("PolicyVersion", String.valueOf(i7)).J2("CmpSdkID", String.valueOf(i2)).J2("PurposeOneTreatment", i8 != 1 ? "0" : "1").J2("PublisherCC", str).J2("PublisherRestrictions1", String.valueOf(zzkpVar != null ? zzkpVar.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).J2("PublisherRestrictions3", String.valueOf(zzkpVar2 != null ? zzkpVar2.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).J2("PublisherRestrictions4", String.valueOf(zzkpVar3 != null ? zzkpVar3.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).J2("PublisherRestrictions7", String.valueOf(zzkpVar4 != null ? zzkpVar4.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).xMQ(u.Ik("Purpose1", zzf(zzkoVar3, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4), "Purpose3", zzf(zzkoVar4, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4), "Purpose4", zzf(zzkoVar5, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4), "Purpose7", zzf(zzkoVar6, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4)));
        if (true != zzc(zzkoVar3, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4)) {
            zzkoVar = zzkoVar4;
            obj = "0";
        } else {
            zzkoVar = zzkoVar4;
            obj = "1";
        }
        if (true != zzc(zzkoVar, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4)) {
            zzkoVar2 = zzkoVar5;
            obj2 = "0";
        } else {
            zzkoVar2 = zzkoVar5;
            obj2 = "1";
        }
        return jVarXMQ.xMQ(u.r("AuthorizePurpose1", obj, "AuthorizePurpose3", obj2, "AuthorizePurpose4", true != zzc(zzkoVar2, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4) ? "0" : "1", "AuthorizePurpose7", true != zzc(zzkoVar6, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).t();
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzko zzkoVar, u uVar, u uVar2, Ln ln2, char[] cArr, int i2, int i3, int i5, int i7, int i8, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    private static final com.google.android.gms.internal.measurement.zzkp zzi(com.google.android.gms.internal.measurement.zzko zzkoVar, u uVar, u uVar2, Ln ln2, char[] cArr, int i2, int i3, int i5, int i7, int i8, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        return (com.google.android.gms.internal.measurement.zzkp) uVar2.getOrDefault(zzkoVar, com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED);
    }

    private static final String zzf(com.google.android.gms.internal.measurement.zzko zzkoVar, u uVar, u uVar2, Ln ln2, char[] cArr, int i2, int i3, int i5, int i7, int i8, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        String strValueOf;
        String strValueOf2 = "0";
        if (TextUtils.isEmpty(str2) || str2.length() < zzkoVar.zza()) {
            strValueOf = "0";
        } else {
            strValueOf = String.valueOf(str2.charAt(zzkoVar.zza() - 1));
        }
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkoVar.zza()) {
            strValueOf2 = String.valueOf(str3.charAt(zzkoVar.zza() - 1));
        }
        return String.valueOf(strValueOf).concat(String.valueOf(strValueOf2));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzko zzkoVar, u uVar, u uVar2, Ln ln2, char[] cArr, int i2, int i3, int i5, int i7, int i8, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        char c2;
        int iZze = zze(zzkoVar, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4);
        boolean z5 = false;
        if (!z2) {
            c2 = '4';
        } else if (str2.length() < zzkoVar.zza()) {
            c2 = '0';
        } else {
            char cCharAt = str2.charAt(zzkoVar.zza() - 1);
            char c4 = '1';
            if (cCharAt == '1') {
                z5 = true;
            }
            if (iZze > 0 && cArr[iZze] != '2') {
                if (cCharAt != '1') {
                    c4 = '6';
                }
                cArr[iZze] = c4;
            }
            return z5;
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c2;
        }
        return false;
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzko zzkoVar, u uVar, u uVar2, Ln ln2, char[] cArr, int i2, int i3, int i5, int i7, int i8, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        char c2;
        int iZze = zze(zzkoVar, uVar, uVar2, ln2, cArr, i2, i3, i5, i7, i8, str, str2, str3, z2, z3, z4);
        boolean z5 = false;
        if (!z3) {
            c2 = '5';
        } else if (str3.length() < zzkoVar.zza()) {
            c2 = '0';
        } else {
            char cCharAt = str3.charAt(zzkoVar.zza() - 1);
            char c4 = '1';
            if (cCharAt == '1') {
                z5 = true;
            }
            if (iZze > 0 && cArr[iZze] != '2') {
                if (cCharAt != '1') {
                    c4 = '7';
                }
                cArr[iZze] = c4;
            }
            return z5;
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c2;
        }
        return false;
    }
}
