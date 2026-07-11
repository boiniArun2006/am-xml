package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.core.location.GnssStatusCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class LocationManagerCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final WeakHashMap f36469n = new WeakHashMap();

    static class Api19Impl {
    }

    @RequiresApi
    static class Api24Impl {
    }

    @RequiresApi
    private static class Api28Impl {
    }

    @RequiresApi
    private static class Api30Impl {
    }

    @RequiresApi
    private static class Api31Impl {
    }

    private static class GnssListenersHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final SimpleArrayMap f36473n = new SimpleArrayMap();
        static final SimpleArrayMap rl = new SimpleArrayMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    static class GnssMeasurementsTransport extends GnssMeasurementsEvent.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final GnssMeasurementsEvent.Callback f36474n;
        volatile Executor rl;

        public static /* synthetic */ void n(GnssMeasurementsTransport gnssMeasurementsTransport, Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (gnssMeasurementsTransport.rl != executor) {
                return;
            }
            gnssMeasurementsTransport.f36474n.onGnssMeasurementsReceived(gnssMeasurementsEvent);
        }

        public static /* synthetic */ void rl(GnssMeasurementsTransport gnssMeasurementsTransport, Executor executor, int i2) {
            if (gnssMeasurementsTransport.rl != executor) {
                return;
            }
            gnssMeasurementsTransport.f36474n.onStatusChanged(i2);
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(final GnssMeasurementsEvent gnssMeasurementsEvent) {
            final Executor executor = this.rl;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.n
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.GnssMeasurementsTransport.n(this.f36505n, executor, gnssMeasurementsEvent);
                }
            });
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(final int i2) {
            final Executor executor = this.rl;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.w6
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.GnssMeasurementsTransport.rl(this.f36513n, executor, i2);
                }
            });
        }
    }

    @RequiresApi
    private static class GnssStatusTransport extends GnssStatus.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final GnssStatusCompat.Callback f36475n;

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i2) {
            this.f36475n.n(i2);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f36475n.rl(GnssStatusCompat.n(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f36475n.t();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f36475n.nr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class GpsStatusTransport implements GpsStatus.Listener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final LocationManager f36476n;
        final GnssStatusCompat.Callback rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        volatile Executor f36477t;

        public static /* synthetic */ void n(GpsStatusTransport gpsStatusTransport, Executor executor) {
            if (gpsStatusTransport.f36477t != executor) {
                return;
            }
            gpsStatusTransport.rl.nr();
        }

        public static /* synthetic */ void nr(GpsStatusTransport gpsStatusTransport, Executor executor, GnssStatusCompat gnssStatusCompat) {
            if (gpsStatusTransport.f36477t != executor) {
                return;
            }
            gpsStatusTransport.rl.rl(gnssStatusCompat);
        }

        public static /* synthetic */ void rl(GpsStatusTransport gpsStatusTransport, Executor executor) {
            if (gpsStatusTransport.f36477t != executor) {
                return;
            }
            gpsStatusTransport.rl.t();
        }

        public static /* synthetic */ void t(GpsStatusTransport gpsStatusTransport, Executor executor, int i2) {
            if (gpsStatusTransport.f36477t != executor) {
                return;
            }
            gpsStatusTransport.rl.n(i2);
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i2) {
            GpsStatus gpsStatus;
            final Executor executor = this.f36477t;
            if (executor == null) {
                return;
            }
            if (i2 == 1) {
                executor.execute(new Runnable() { // from class: androidx.core.location.Ml
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.GpsStatusTransport.rl(this.f36485n, executor);
                    }
                });
                return;
            }
            if (i2 == 2) {
                executor.execute(new Runnable() { // from class: androidx.core.location.I28
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.GpsStatusTransport.n(this.f36467n, executor);
                    }
                });
                return;
            }
            if (i2 != 3) {
                if (i2 == 4 && (gpsStatus = this.f36476n.getGpsStatus(null)) != null) {
                    final GnssStatusCompat gnssStatusCompatRl = GnssStatusCompat.rl(gpsStatus);
                    executor.execute(new Runnable() { // from class: androidx.core.location.CN3
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationManagerCompat.GpsStatusTransport.nr(this.f36459n, executor, gnssStatusCompatRl);
                        }
                    });
                    return;
                }
                return;
            }
            GpsStatus gpsStatus2 = this.f36476n.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new Runnable() { // from class: androidx.core.location.Wre
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.GpsStatusTransport.t(this.f36491n, executor, timeToFirstFix);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LocationListenerKey {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f36479n;
        final LocationListenerCompat rl;

        public boolean equals(Object obj) {
            if (!(obj instanceof LocationListenerKey)) {
                return false;
            }
            LocationListenerKey locationListenerKey = (LocationListenerKey) obj;
            return this.f36479n.equals(locationListenerKey.f36479n) && this.rl.equals(locationListenerKey.rl);
        }

        public int hashCode() {
            return ObjectsCompat.rl(this.f36479n, this.rl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class LocationListenerTransport implements LocationListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile LocationListenerKey f36480n;
        final Executor rl;

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            if (this.f36480n == null) {
                return;
            }
            this.rl.execute(new Runnable() { // from class: androidx.core.location.C
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.t(this.f36456n, location);
                }
            });
        }

        public static /* synthetic */ void J2(LocationListenerTransport locationListenerTransport, int i2) {
            LocationListenerKey locationListenerKey = locationListenerTransport.f36480n;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.rl.onFlushComplete(i2);
        }

        public static /* synthetic */ void O(LocationListenerTransport locationListenerTransport, String str) {
            LocationListenerKey locationListenerKey = locationListenerTransport.f36480n;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.rl.onProviderDisabled(str);
        }

        public static /* synthetic */ void n(LocationListenerTransport locationListenerTransport, String str) {
            LocationListenerKey locationListenerKey = locationListenerTransport.f36480n;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.rl.onProviderEnabled(str);
        }

        public static /* synthetic */ void nr(LocationListenerTransport locationListenerTransport, List list) {
            LocationListenerKey locationListenerKey = locationListenerTransport.f36480n;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.rl.onLocationChanged(list);
        }

        public static /* synthetic */ void rl(LocationListenerTransport locationListenerTransport, String str, int i2, Bundle bundle) {
            LocationListenerKey locationListenerKey = locationListenerTransport.f36480n;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.rl.onStatusChanged(str, i2, bundle);
        }

        public static /* synthetic */ void t(LocationListenerTransport locationListenerTransport, Location location) {
            LocationListenerKey locationListenerKey = locationListenerTransport.f36480n;
            if (locationListenerKey == null) {
                return;
            }
            locationListenerKey.rl.onLocationChanged(location);
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i2) {
            if (this.f36480n == null) {
                return;
            }
            this.rl.execute(new Runnable() { // from class: androidx.core.location.o
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.J2(this.f36507n, i2);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final String str) {
            if (this.f36480n == null) {
                return;
            }
            this.rl.execute(new Runnable() { // from class: androidx.core.location.Dsr
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.O(this.f36461n, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final String str) {
            if (this.f36480n == null) {
                return;
            }
            this.rl.execute(new Runnable() { // from class: androidx.core.location.fuX
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.n(this.f36500n, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i2, final Bundle bundle) {
            if (this.f36480n == null) {
                return;
            }
            this.rl.execute(new Runnable() { // from class: androidx.core.location.qz
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.rl(this.f36510n, str, i2, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final List list) {
            if (this.f36480n == null) {
                return;
            }
            this.rl.execute(new Runnable() { // from class: androidx.core.location.aC
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.LocationListenerTransport.nr(this.f36496n, list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    static class PreRGnssStatusTransport extends GnssStatus.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final GnssStatusCompat.Callback f36481n;
        volatile Executor rl;

        public static /* synthetic */ void n(PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
            if (preRGnssStatusTransport.rl != executor) {
                return;
            }
            preRGnssStatusTransport.f36481n.nr();
        }

        public static /* synthetic */ void nr(PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, GnssStatus gnssStatus) {
            if (preRGnssStatusTransport.rl != executor) {
                return;
            }
            preRGnssStatusTransport.f36481n.rl(GnssStatusCompat.n(gnssStatus));
        }

        public static /* synthetic */ void rl(PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i2) {
            if (preRGnssStatusTransport.rl != executor) {
                return;
            }
            preRGnssStatusTransport.f36481n.n(i2);
        }

        public static /* synthetic */ void t(PreRGnssStatusTransport preRGnssStatusTransport, Executor executor) {
            if (preRGnssStatusTransport.rl != executor) {
                return;
            }
            preRGnssStatusTransport.f36481n.t();
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i2) {
            final Executor executor = this.rl;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.Pl
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport.rl(this.f36488n, executor, i2);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.rl;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.Xo
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport.nr(this.f36494n, executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.rl;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.z
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport.t(this.f36515n, executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.rl;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.eO
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport.n(this.f36498n, executor);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class CancellableLocationListener implements LocationListener {
        Runnable J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f36470O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final LocationManager f36471n;
        private Consumer nr;
        private final Executor rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Handler f36472t;

        private void rl() {
            this.nr = null;
            this.f36471n.removeUpdates(this);
            Runnable runnable = this.J2;
            if (runnable != null) {
                this.f36472t.removeCallbacks(runnable);
                this.J2 = null;
            }
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            synchronized (this) {
                try {
                    if (this.f36470O) {
                        return;
                    }
                    this.f36470O = true;
                    final Consumer consumer = this.nr;
                    this.rl.execute(new Runnable() { // from class: androidx.core.location.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            consumer.accept(location);
                        }
                    });
                    rl();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    }

    private static final class InlineHandlerExecutor implements Executor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Handler f36478n;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (Looper.myLooper() == this.f36478n.getLooper()) {
                runnable.run();
            } else {
                if (this.f36478n.post((Runnable) Preconditions.Uo(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(this.f36478n + " is shutting down");
            }
        }
    }
}
