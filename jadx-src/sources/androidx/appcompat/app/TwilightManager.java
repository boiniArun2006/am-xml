package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import com.safedk.android.analytics.events.a;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Calendar;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class TwilightManager {
    private static TwilightManager nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f13689n;
    private final LocationManager rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TwilightState f13690t = new TwilightState();

    private static class TwilightState {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f13691n;
        long rl;

        TwilightState() {
        }
    }

    private void J2(Location location) {
        long j2;
        TwilightState twilightState = this.f13690t;
        long jCurrentTimeMillis = System.currentTimeMillis();
        TwilightCalculator twilightCalculatorRl = TwilightCalculator.rl();
        twilightCalculatorRl.n(jCurrentTimeMillis - SignalManager.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
        twilightCalculatorRl.n(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z2 = twilightCalculatorRl.f13688t == 1;
        long j3 = twilightCalculatorRl.rl;
        long j4 = twilightCalculatorRl.f13687n;
        twilightCalculatorRl.n(jCurrentTimeMillis + SignalManager.TWENTY_FOUR_HOURS_MILLIS, location.getLatitude(), location.getLongitude());
        long j5 = twilightCalculatorRl.rl;
        if (j3 == -1 || j4 == -1) {
            j2 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j4) {
                j3 = j5;
            } else if (jCurrentTimeMillis > j3) {
                j3 = j4;
            }
            j2 = j3 + 60000;
        }
        twilightState.f13691n = z2;
        twilightState.rl = j2;
    }

    private boolean O() {
        return this.f13690t.rl > System.currentTimeMillis();
    }

    static TwilightManager n(Context context) {
        if (nr == null) {
            Context applicationContext = context.getApplicationContext();
            nr = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return nr;
    }

    private Location rl() {
        Location locationT = PermissionChecker.rl(this.f13689n, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? t(a.f62814d) : null;
        Location locationT2 = PermissionChecker.rl(this.f13689n, "android.permission.ACCESS_FINE_LOCATION") == 0 ? t("gps") : null;
        return (locationT2 == null || locationT == null) ? locationT2 != null ? locationT2 : locationT : locationT2.getTime() > locationT.getTime() ? locationT2 : locationT;
    }

    private Location t(String str) {
        try {
            if (this.rl.isProviderEnabled(str)) {
                return this.rl.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    boolean nr() {
        TwilightState twilightState = this.f13690t;
        if (O()) {
            return twilightState.f13691n;
        }
        Location locationRl = rl();
        if (locationRl != null) {
            J2(locationRl);
            return twilightState.f13691n;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }

    TwilightManager(Context context, LocationManager locationManager) {
        this.f13689n = context;
        this.rl = locationManager;
    }
}
