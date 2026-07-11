package com.google.firebase;

import N03.fuX;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    private static String O(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public static /* synthetic */ String nr(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? TtmlNode.TEXT_EMPHASIS_AUTO : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(N03.w6.rl());
        arrayList.add(Ip.Wre.Uo());
        arrayList.add(N03.fuX.rl("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(N03.fuX.rl("fire-core", "21.0.0"));
        arrayList.add(N03.fuX.rl("device-name", O(Build.PRODUCT)));
        arrayList.add(N03.fuX.rl("device-model", O(Build.DEVICE)));
        arrayList.add(N03.fuX.rl("device-brand", O(Build.BRAND)));
        arrayList.add(N03.fuX.t("android-target-sdk", new fuX.j() { // from class: com.google.firebase.fuX
            @Override // N03.fuX.j
            public final String n(Object obj) {
                return FirebaseCommonRegistrar.t((Context) obj);
            }
        }));
        arrayList.add(N03.fuX.t("android-min-sdk", new fuX.j() { // from class: com.google.firebase.Dsr
            @Override // N03.fuX.j
            public final String n(Object obj) {
                return FirebaseCommonRegistrar.rl((Context) obj);
            }
        }));
        arrayList.add(N03.fuX.t("android-platform", new fuX.j() { // from class: com.google.firebase.aC
            @Override // N03.fuX.j
            public final String n(Object obj) {
                return FirebaseCommonRegistrar.nr((Context) obj);
            }
        }));
        arrayList.add(N03.fuX.t("android-installer", new fuX.j() { // from class: com.google.firebase.C
            @Override // N03.fuX.j
            public final String n(Object obj) {
                return FirebaseCommonRegistrar.n((Context) obj);
            }
        }));
        String strN = N03.I28.n();
        if (strN != null) {
            arrayList.add(N03.fuX.rl("kotlin", strN));
        }
        return arrayList;
    }

    public static /* synthetic */ String n(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return O(installerPackageName);
        }
        return "";
    }

    public static /* synthetic */ String rl(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    public static /* synthetic */ String t(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }
}
