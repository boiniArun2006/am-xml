package com.fyber.inneractive.sdk.serverapi;

import android.app.NotificationManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.provider.Settings;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.p0;
import com.fyber.inneractive.sdk.config.q0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.util.o;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56911a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f56912b = Arrays.asList("POWER_SAVE_MODE_OPEN", "SmartModeStatus");

    public static String a(float f3) {
        return f3 < 5.0f ? "1" : f3 <= 9.0f ? "2" : f3 <= 24.0f ? "3" : f3 <= 39.0f ? "4" : f3 <= 54.0f ? "5" : f3 <= 69.0f ? "6" : f3 <= 84.0f ? "7" : f3 <= 100.0f ? "8" : "";
    }

    public static Boolean i() {
        int intExtra;
        try {
            Intent intentRegisterReceiver = o.f57018a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z2 = false;
            if (intentRegisterReceiver != null && ((intExtra = intentRegisterReceiver.getIntExtra("plugged", -1)) == 1 || intExtra == 2 || intExtra == 4)) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean j() {
        try {
            AudioManager audioManager = (AudioManager) o.f57018a.getSystemService("audio");
            if (audioManager != null) {
                return Boolean.valueOf(audioManager.getStreamVolume(3) == 0);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean n() {
        Integer num;
        try {
            String upperCase = Build.MANUFACTURER.toUpperCase(Locale.getDefault());
            if (TextUtils.isEmpty(upperCase) || !f56911a.containsKey(upperCase)) {
                return Boolean.valueOf(((PowerManager) o.f57018a.getSystemService("power")).isPowerSaveMode());
            }
            try {
                Iterator it = f56912b.iterator();
                while (it.hasNext()) {
                    int i2 = Settings.System.getInt(o.f57018a.getContentResolver(), (String) it.next(), -1);
                    if (i2 != -1 && (num = (Integer) f56911a.get(upperCase)) != null) {
                        return Boolean.valueOf(num.intValue() == i2);
                    }
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String b() {
        try {
            if (o.f57018a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
                return "";
            }
            return a((r1.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / r1.getIntExtra("scale", -1));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static Long c() {
        long j2;
        x0 x0Var = IAConfigManager.f53260M.f53297w;
        x0Var.getClass();
        try {
            String str = "";
            String str2 = (String) x0Var.f53495d.get("SESSION_STAMP");
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            j2 = Long.parseLong(str);
        } catch (Exception unused) {
            j2 = 0;
        }
        return Long.valueOf(TimeUnit.SECONDS.convert(SystemClock.elapsedRealtime() - j2, TimeUnit.MILLISECONDS));
    }

    public static String d() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static Long e() {
        try {
            return Long.valueOf(TimeUnit.MINUTES.convert(Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()), TimeUnit.MILLISECONDS));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean f() {
        try {
            return Boolean.valueOf(Settings.System.getInt(o.f57018a.getContentResolver(), "airplane_mode_on", 0) != 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        boolean z3 = i2 >= 34 && o.a("android.permission.BLUETOOTH_CONNECT");
        if (i2 < 34 && o.a("android.permission.BLUETOOTH")) {
            z2 = true;
        }
        if (!z3 && !z2) {
            return null;
        }
        try {
            BluetoothAdapter adapter = ((BluetoothManager) o.f57018a.getSystemService("bluetooth")).getAdapter();
            if (adapter.getProfileConnectionState(1) != 2 && adapter.getProfileConnectionState(2) != 2) {
                return null;
            }
            return Boolean.TRUE;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean h() {
        return Boolean.valueOf((o.f57018a.getResources().getConfiguration().uiMode & 48) == 32);
    }

    public static Boolean k() {
        try {
            int ringerMode = ((AudioManager) o.f57018a.getSystemService("audio")).getRingerMode();
            boolean z2 = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean l() {
        try {
            int currentInterruptionFilter = ((NotificationManager) o.f57018a.getSystemService("notification")).getCurrentInterruptionFilter();
            return Boolean.valueOf(currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean m() {
        try {
            boolean z2 = false;
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) o.f57018a.getSystemService("audio")).getDevices(2)) {
                if (audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static UnitDisplayType a(String str) {
        r0 r0Var;
        UnitDisplayType unitDisplayType = UnitDisplayType.INTERSTITIAL;
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        HashMap map = iAConfigManager.f53275a;
        q0 q0Var = (map == null || !map.containsKey(str)) ? null : (q0) iAConfigManager.f53275a.get(str);
        if (q0Var != null && q0Var.f53413a.size() > 0 && (r0Var = (r0) q0Var.f53413a.get(0)) != null) {
            t0 t0Var = r0Var.f53420f;
            l0 l0Var = r0Var.f53417c;
            p0 p0Var = r0Var.f53419e;
            if (t0Var != null) {
                return t0Var.f53480j;
            }
            if (l0Var != null) {
                return l0Var.f53402b;
            }
            if (p0Var != null) {
                return UnitDisplayType.NATIVE;
            }
        }
        return unitDisplayType;
    }

    public static Integer a() {
        Integer numValueOf = Build.VERSION.SDK_INT >= 30 ? Integer.valueOf(SdkExtensions.getExtensionVersion(1000000)) : null;
        if (numValueOf == null || numValueOf.intValue() == 0) {
            return null;
        }
        return numValueOf;
    }
}
