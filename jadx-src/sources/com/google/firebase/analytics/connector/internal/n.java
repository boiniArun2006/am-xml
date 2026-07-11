package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjn;
import com.google.common.collect.Ln;
import com.google.common.collect.nKK;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class n {
    public static final /* synthetic */ int Uo = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Ln f60070n = Ln.WPU("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final nKK rl = nKK.aYN("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final nKK f60071t = nKK.S(TtmlNode.TEXT_EMPHASIS_AUTO, PangleCreativeInfo.f62498a, "am");
    private static final nKK nr = nKK.XQ("_r", "_dbg");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final nKK f60069O = new nKK.j().xMQ(zzjn.zza).xMQ(zzjn.zzb).gh();
    private static final nKK J2 = nKK.XQ("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean O(String str, String str2, Bundle bundle) {
        byte b2;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!n(str) || bundle == null) {
            return false;
        }
        nKK nkk = nr;
        int size = nkk.size();
        int i2 = 0;
        while (i2 < size) {
            boolean zContainsKey = bundle.containsKey((String) nkk.get(i2));
            i2++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                b2 = (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) ? (byte) 2 : (byte) -1;
            } else if (str.equals("fdl")) {
                b2 = 1;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            b2 = 0;
        }
        if (b2 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b2 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b2 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }

    public static boolean n(String str) {
        return !f60071t.contains(str);
    }

    public static boolean nr(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (f60069O.contains(str2)) {
            return false;
        }
        nKK nkk = J2;
        int size = nkk.size();
        int i2 = 0;
        while (i2 < size) {
            boolean zMatches = str2.matches((String) nkk.get(i2));
            i2++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    public static boolean rl(String str, Bundle bundle) {
        if (rl.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        nKK nkk = nr;
        int size = nkk.size();
        int i2 = 0;
        while (i2 < size) {
            boolean zContainsKey = bundle.containsKey((String) nkk.get(i2));
            i2++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(String str) {
        return !f60070n.contains(str);
    }
}
