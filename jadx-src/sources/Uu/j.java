package Uu;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class j {
    float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    long f10840O;
    float Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    InterfaceC0384j f10841n;
    boolean nr;
    final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f10842t;

    /* JADX INFO: renamed from: Uu.j$j, reason: collision with other inner class name */
    public interface InterfaceC0384j {
        boolean n();
    }

    public void O() {
        this.f10842t = false;
        this.nr = false;
    }

    public void n() {
        this.f10841n = null;
        O();
    }

    public static j t(Context context) {
        return new j(context);
    }

    public void J2(InterfaceC0384j interfaceC0384j) {
        this.f10841n = interfaceC0384j;
    }

    public boolean rl() {
        return this.f10842t;
    }

    public j(Context context) {
        this.rl = ViewConfiguration.get(context).getScaledTouchSlop();
        n();
    }

    public boolean nr(MotionEvent motionEvent) {
        InterfaceC0384j interfaceC0384j;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.f10842t = false;
                        this.nr = false;
                    }
                } else if (Math.abs(motionEvent.getX() - this.J2) > this.rl || Math.abs(motionEvent.getY() - this.Uo) > this.rl) {
                    this.nr = false;
                }
            } else {
                this.f10842t = false;
                if (Math.abs(motionEvent.getX() - this.J2) > this.rl || Math.abs(motionEvent.getY() - this.Uo) > this.rl) {
                    this.nr = false;
                }
                if (this.nr && motionEvent.getEventTime() - this.f10840O <= ViewConfiguration.getLongPressTimeout() && (interfaceC0384j = this.f10841n) != null) {
                    interfaceC0384j.n();
                }
                this.nr = false;
            }
        } else {
            this.f10842t = true;
            this.nr = true;
            this.f10840O = motionEvent.getEventTime();
            this.J2 = motionEvent.getX();
            this.Uo = motionEvent.getY();
        }
        return true;
    }
}
