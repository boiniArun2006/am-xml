package com.google.firebase.crashlytics.ndk;

import com.caoccao.javet.node.modules.NodeModuleProcess;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class fuX {
    static String O(String str, String str2, boolean z2) {
        HashMap map = new HashMap();
        map.put(NodeModuleProcess.PROPERTY_VERSION, str);
        map.put("build_version", str2);
        map.put("is_rooted", Boolean.valueOf(z2));
        return new JSONObject(map).toString();
    }

    private static String n(String str) {
        return str == null ? "" : str;
    }

    static String nr(int i2, String str, int i3, long j2, long j3, boolean z2, int i5, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("arch", Integer.valueOf(i2));
        map.put("build_model", str);
        map.put("available_processors", Integer.valueOf(i3));
        map.put("total_ram", Long.valueOf(j2));
        map.put("disk_space", Long.valueOf(j3));
        map.put("is_emulator", Boolean.valueOf(z2));
        map.put("state", Integer.valueOf(i5));
        map.put("build_manufacturer", str2);
        map.put("build_product", str3);
        return new JSONObject(map).toString();
    }

    static String rl(String str, String str2, long j2) {
        HashMap map = new HashMap();
        map.put("session_id", str);
        map.put("generator", str2);
        map.put("started_at_seconds", Long.valueOf(j2));
        return new JSONObject(map).toString();
    }

    static String t(String str, String str2, String str3, String str4, int i2, String str5, String str6) {
        HashMap map = new HashMap();
        map.put("app_identifier", str);
        map.put("version_code", str2);
        map.put("version_name", str3);
        map.put("install_uuid", str4);
        map.put("delivery_mechanism", Integer.valueOf(i2));
        map.put("development_platform", n(str5));
        map.put("development_platform_version", n(str6));
        return new JSONObject(map).toString();
    }
}
