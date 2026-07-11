package bZx;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class qz implements SensorEventListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f43369t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n f43370n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public interface n {
        void n();
    }

    public final void n(n nVar) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            this.f43370n = nVar;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (!VmF.j.nr(this)) {
            try {
                Intrinsics.checkNotNullParameter(event, "event");
                n nVar = this.f43370n;
                if (nVar != null) {
                    float[] fArr = event.values;
                    double d2 = fArr[0] / 9.80665f;
                    double d4 = fArr[1] / 9.80665f;
                    double d5 = fArr[2] / 9.80665f;
                    if (Math.sqrt((d2 * d2) + (d4 * d4) + (d5 * d5)) > 2.3d) {
                        nVar.n();
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
