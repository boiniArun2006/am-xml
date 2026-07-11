package com.safedk.android.utils;

import android.os.Bundle;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class SdksMapping {
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS = "installed_mediation_adapters";
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS = "class";
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS_SDK_VERSION = "sdk_version";
    private static final String TAG = "SdksMapping";
    private static boolean topicSdkVersionsUpdated;
    private static TreeMap<String, String> sdkPackageToName = new TreeMap<>();
    private static TreeMap<String, String> sdkPackageToUUID = new TreeMap<>();
    private static TreeMap<String, String> sdkPackages = new TreeMap<>();
    public static TreeMap<String, String> sdkPackageUUIDToVersion = new TreeMap<>();
    private static TreeMap<String, String> sdkAdaptersUUID = new TreeMap<>();
    private static Set<String> redirectSupportedSdks = new HashSet();
    private static final Map<String, String> secondaryMediationToPrimaryMediationMap = new HashMap<String, String>() { // from class: com.safedk.android.utils.SdksMapping.1
        {
            put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "com.applovin.mediation.adapters.GoogleMediationAdapter");
        }
    };

    static {
        try {
            Logger.d(TAG, "Calling SdksMappingInitializer init");
            SdksMappingInitializer.init(sdkPackageToName, sdkPackageToUUID, sdkPackageUUIDToVersion, sdkPackages, sdkAdaptersUUID);
            printAllSdkVersions();
        } catch (Throwable th) {
            Logger.d(TAG, "SdksMappingInitializer error : ", th.getMessage(), th);
        }
        topicSdkVersionsUpdated = false;
    }

    public static TreeMap<String, String> getSdkAdaptersUUIDCollection() {
        return sdkAdaptersUUID;
    }

    public static void setTopicSdkVersionsUpdated() {
        topicSdkVersionsUpdated = true;
        Logger.d(TAG, "set topic sdk versions updated, sdkPackageToUUID=", sdkPackageToUUID.toString());
        Logger.d(TAG, "set topic sdk versions updated, redirectSupportedSdks=", redirectSupportedSdks.toString());
    }

    public static boolean isTopicSdkVersionsUpdated() {
        return topicSdkVersionsUpdated;
    }

    public static String getSdkPackageByClass(String className) {
        if (className != null) {
            for (String str : sdkPackages.keySet()) {
                if (className.startsWith(str)) {
                    return sdkPackages.get(str);
                }
            }
            return null;
        }
        return null;
    }

    public static String getSdkNameByPackage(String packageName) {
        return sdkPackageToName.get(packageName);
    }

    public static String getSdkUUIDByPackage(String packageName) {
        if (obbPUqyhtS.ZQQcCeRdw.equals(packageName)) {
            return packageName;
        }
        String str = sdkPackageToUUID.get(packageName);
        Logger.d(TAG, "get sdk UUID by package ", packageName, " , result = ", str);
        return str;
    }

    public static String getSdkPackageByPackageUUID(String uuid) {
        for (Map.Entry<String, String> entry : sdkPackageToUUID.entrySet()) {
            if (entry.getValue().equals(uuid)) {
                Logger.d(TAG, "get sdk package by package UUID returns ", entry.getKey(), " for UUID ", entry.getValue());
                return entry.getKey();
            }
        }
        Logger.d(TAG, "sdk UUID not valid: ", uuid);
        return null;
    }

    public static String getSdkVersionByPackage(String packageName) {
        String sdkUUIDByPackage = getSdkUUIDByPackage(packageName);
        Logger.d(TAG, "get sdk version by package,packageName = ", packageName, ", uuid = ", sdkUUIDByPackage);
        if (sdkUUIDByPackage != null) {
            return sdkPackageUUIDToVersion.get(sdkUUIDByPackage);
        }
        return null;
    }

    public static Set<String> getAllSdkNames() {
        return new HashSet(sdkPackageToName.values());
    }

    public static Map<String, String> getAllSdkVersionsMap() {
        return sdkPackageUUIDToVersion;
    }

    public static void printAllSdkVersions() {
        Logger.d(TAG, "print all sdk versions, sdkPackages=", sdkPackages.toString());
        Logger.d(TAG, "print all sdk versions, sdkPackageToName=", sdkPackageToName.toString());
        Logger.d(TAG, "print all sdk versions, sdkPackageToUUID=", sdkPackageToUUID.toString());
        Logger.d(TAG, "print all sdk versions, sdkPackageUUIDToVersion=", sdkPackageUUIDToVersion.toString());
        Logger.d(TAG, "print all sdk versions, sdkAdaptersUUID=", sdkAdaptersUUID.toString());
    }

    public static Set<String> getAllSdkPackages() {
        return sdkPackageToName.keySet();
    }

    public static boolean isSameSdkByPackages(String package1, String package2) {
        if (package1 == null || package2 == null) {
            return false;
        }
        String sdkNameByPackage = getSdkNameByPackage(package1);
        String sdkNameByPackage2 = getSdkNameByPackage(package2);
        if (sdkNameByPackage == null || sdkNameByPackage2 == null) {
            return false;
        }
        return sdkNameByPackage.equals(sdkNameByPackage2) || sdkNameByPackage.regionMatches(false, 0, sdkNameByPackage2, 0, 5);
    }

    public static void updateSdkVersionIfNeeded(String className, String version) {
        if (isTopicSdkVersionsUpdated()) {
            return;
        }
        if (sdkAdaptersUUID.get(className) == null) {
            Logger.d(TAG, "Cannot find UUID for package ", className);
            return;
        }
        String str = sdkAdaptersUUID.get(className);
        Logger.d(TAG, "update sdk version if needed, UUID for class ", className, " is ", str);
        if (!sdkPackageUUIDToVersion.containsKey(str) || (sdkPackageUUIDToVersion.containsKey(str) && version != null && !version.isEmpty() && !sdkPackageUUIDToVersion.get(str).equals(version))) {
            sdkPackageUUIDToVersion.put(str, version);
            Logger.d(TAG, "update sdk version if needed, class ", className, " (uuid ", str, ") updated to ", version);
            Logger.d(TAG, "update sdk version if needed, get discovery by package ", getSdkPackageByPackageUUID(str), ", uuid ", str);
            Logger.d(TAG, "update sdk version if needed, discoveries  ", CreativeInfoManager.e());
        } else {
            Logger.d(TAG, "update sdk version if needed, cannot update class ", className, " (uuid ", str, ") , version = ", version);
        }
        if (redirectSupportedSdks == null) {
            redirectSupportedSdks = new HashSet();
        }
        if (sdkAdaptersUUID.containsValue(str)) {
            Logger.d(TAG, "Adding ", className, " , package UUID ", str, " to redirect supported sdks");
            redirectSupportedSdks.add(str);
        } else {
            Logger.d(TAG, "Not adding ", className, " , package UUID ", str, " to redirect supported sdks");
        }
        Logger.d(TAG, "get redirect supported sdks : ", getRedirectSupportedSdks().toString());
    }

    public static void setMaxAdapterVersions(Bundle bundle) {
        try {
            Logger.printFullVerboseLog(TAG, "get max adapter versions started, Bundle = ", bundle);
            if (bundle.containsKey(KEY_INSTALLED_MEDIATION_ADAPTERS)) {
                Logger.d(TAG, "get max adapter versions, processing ", KEY_INSTALLED_MEDIATION_ADAPTERS.toUpperCase());
                ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(KEY_INSTALLED_MEDIATION_ADAPTERS);
                if (parcelableArrayList != null) {
                    for (Bundle bundle2 : parcelableArrayList) {
                        String string = bundle2.getString(KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS);
                        String string2 = bundle2.getString("sdk_version");
                        if (secondaryMediationToPrimaryMediationMap.containsKey(string)) {
                            string = secondaryMediationToPrimaryMediationMap.get(string);
                        }
                        Logger.d(TAG, "get max adapter versions, class : ", string, ", version = ", string2);
                        if (string2 != null && string2.length() > 0) {
                            updateSdkVersionIfNeeded(string, string2);
                        }
                    }
                    setTopicSdkVersionsUpdated();
                } else {
                    Logger.d(TAG, "extracting value for key ", KEY_INSTALLED_MEDIATION_ADAPTERS, " produced null value, skipping");
                }
                printAllSdkVersions();
                return;
            }
            Logger.d(TAG, "get max adapter versions, no adapter class version received from MAX");
        } catch (Throwable th) {
            Logger.e(TAG, "get max adapter versions, exception extracting ", KEY_INSTALLED_MEDIATION_ADAPTERS.toUpperCase(), th);
        }
    }

    public static Set<String> getRedirectSupportedSdks() {
        Logger.d(TAG, "get redirect supported sdks started, sdkAdaptersUUID=", sdkAdaptersUUID.values());
        if (!isTopicSdkVersionsUpdated()) {
            return new HashSet(sdkAdaptersUUID.values());
        }
        return redirectSupportedSdks;
    }

    public static String getMainSdkPackage(String sdkpackage) {
        if (h.f63173m.equals(sdkpackage)) {
            return h.f63171k;
        }
        if (h.f63167g.equals(sdkpackage)) {
            return h.f63166f;
        }
        return sdkpackage;
    }
}
