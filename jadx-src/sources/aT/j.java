package aT;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.internal.Ln;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import com.google.zxing.Ml;
import com.google.zxing.WriterException;
import com.google.zxing.w6;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import x4x.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f12901n = new j();
    private static final String rl = j.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final HashMap f12902t = new HashMap();

    /* JADX INFO: renamed from: aT.j$j, reason: collision with other inner class name */
    public static final class C0470j implements NsdManager.RegistrationListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f12903n;
        final /* synthetic */ String rl;

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceUnregistered(NsdServiceInfo serviceInfo) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i2) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        }

        C0470j(String str, String str2) {
            this.f12903n = str;
            this.rl = str2;
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onRegistrationFailed(NsdServiceInfo serviceInfo, int i2) {
            Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
            j.n(this.rl);
        }

        @Override // android.net.nsd.NsdManager.RegistrationListener
        public void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
            Intrinsics.checkNotNullParameter(NsdServiceInfo, "NsdServiceInfo");
            if (Intrinsics.areEqual(this.f12903n, NsdServiceInfo.getServiceName())) {
                return;
            }
            j.n(this.rl);
        }
    }

    public static final boolean J2(String str) {
        if (VmF.j.nr(j.class)) {
            return false;
        }
        try {
            if (O()) {
                return f12901n.Uo(str);
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
            return false;
        }
    }

    public static final boolean O() {
        if (VmF.j.nr(j.class)) {
            return false;
        }
        try {
            QJ qjJ2 = UGc.J2(s4.az());
            if (qjJ2 != null) {
                if (qjJ2.XQ().contains(Ln.Enabled)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
            return false;
        }
    }

    public static final void n(String str) {
        if (VmF.j.nr(j.class)) {
            return;
        }
        try {
            f12901n.rl(str);
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
        }
    }

    public static final String nr(Map map) {
        if (VmF.j.nr(j.class)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap();
            } catch (Throwable th) {
                VmF.j.rl(th, j.class);
                return null;
            }
        }
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        map.put("device", DEVICE);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        map.put("model", MODEL);
        String string = new JSONObject(map).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(deviceInfo as Map<*, *>).toString()");
        return string;
    }

    public static final Bitmap t(String str) {
        if (VmF.j.nr(j.class)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(w6.class);
            enumMap.put(w6.MARGIN, 2);
            try {
                n nVarN = new Ml().n(str, com.google.zxing.j.QR_CODE, 200, 200, enumMap);
                int iO = nVarN.O();
                int iJ2 = nVarN.J2();
                int[] iArr = new int[iO * iJ2];
                for (int i2 = 0; i2 < iO; i2++) {
                    int i3 = i2 * iJ2;
                    for (int i5 = 0; i5 < iJ2; i5++) {
                        iArr[i3 + i5] = nVarN.nr(i5, i2) ? -16777216 : -1;
                    }
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iJ2, iO, Bitmap.Config.ARGB_8888);
                try {
                    bitmapCreateBitmap.setPixels(iArr, 0, iJ2, 0, 0, iJ2, iO);
                    return bitmapCreateBitmap;
                } catch (WriterException unused) {
                    return bitmapCreateBitmap;
                }
            } catch (WriterException unused2) {
                return null;
            }
        } catch (Throwable th) {
            VmF.j.rl(th, j.class);
            return null;
        }
    }

    private j() {
    }

    private final boolean Uo(String str) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            HashMap map = f12902t;
            if (map.containsKey(str)) {
                return true;
            }
            String str2 = "fbsdk_" + ("android-" + StringsKt.replace$default(s4.te(), '.', '|', false, 4, (Object) null)) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = s4.qie().getSystemService("servicediscovery");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
            C0470j c0470j = new C0470j(str2, str);
            map.put(str, c0470j);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, c0470j);
            return true;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final void rl(String str) {
        if (!VmF.j.nr(this)) {
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) f12902t.get(str);
                if (registrationListener != null) {
                    Object systemService = s4.qie().getSystemService("servicediscovery");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.nsd.NsdManager");
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException e2) {
                        vd.z(rl, e2);
                    }
                    f12902t.remove(str);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
